import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rla")
public final class Class325 {

	@OriginalMember(owner = "client!rla", name = "e", descriptor = "J")
	private long aLong312;

	@OriginalMember(owner = "client!rla", name = "k", descriptor = "I")
	private int anInt9287;

	@OriginalMember(owner = "client!rla", name = "j", descriptor = "J")
	private long aLong311 = -1L;

	@OriginalMember(owner = "client!rla", name = "f", descriptor = "I")
	private int anInt9278 = 0;

	@OriginalMember(owner = "client!rla", name = "v", descriptor = "J")
	private long aLong315 = -1L;

	@OriginalMember(owner = "client!rla", name = "g", descriptor = "Lclient!sd;")
	private final Class333 aClass333_4;

	@OriginalMember(owner = "client!rla", name = "t", descriptor = "J")
	private long aLong314;

	@OriginalMember(owner = "client!rla", name = "i", descriptor = "J")
	private long aLong316;

	@OriginalMember(owner = "client!rla", name = "s", descriptor = "J")
	private long aLong313;

	@OriginalMember(owner = "client!rla", name = "q", descriptor = "[B")
	private final byte[] aByteArray95;

	@OriginalMember(owner = "client!rla", name = "u", descriptor = "[B")
	private final byte[] aByteArray94;

	@OriginalMember(owner = "client!rla", name = "<init>", descriptor = "(Lclient!sd;II)V")
	public Class325(@OriginalArg(0) Class333 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass333_4 = arg0;
		this.aLong316 = this.aLong314 = arg0.method7954();
		this.aLong313 = 0L;
		this.aByteArray95 = new byte[arg2];
		this.aByteArray94 = new byte[arg1];
	}

	@OriginalMember(owner = "client!rla", name = "c", descriptor = "(I)Ljava/io/File;")
	private File method7811() {
		return this.aClass333_4.method7953();
	}

	@OriginalMember(owner = "client!rla", name = "a", descriptor = "([BIII)V")
	public void method7813(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg0.length < arg1) {
				throw new ArrayIndexOutOfBoundsException(arg1 - arg0.length);
			}
			if (this.aLong315 != -1L && this.aLong313 >= this.aLong315 && this.aLong315 + (long) this.anInt9278 >= (long) arg1 + this.aLong313) {
				Static735.method9185(this.aByteArray95, (int) (this.aLong313 - this.aLong315), arg0, 0, arg1);
				this.aLong313 += (long) arg1;
				return;
			}
			@Pc(87) long local87 = this.aLong313;
			@Pc(91) int local91 = arg1;
			@Pc(126) int local126;
			if (this.aLong311 <= this.aLong313 && (long) this.anInt9287 + this.aLong311 > this.aLong313) {
				local126 = (int) ((long) this.anInt9287 + this.aLong311 - this.aLong313);
				if (local126 > arg1) {
					local126 = arg1;
				}
				Static735.method9185(this.aByteArray94, (int) (this.aLong313 - this.aLong311), arg0, 0, local126);
				arg1 -= local126;
				this.aLong313 += (long) local126;
				arg2 = local126;
			}
			if (arg1 > this.aByteArray94.length) {
				this.aClass333_4.method7957(this.aLong313);
				this.aLong312 = this.aLong313;
				while (arg1 > 0) {
					local126 = this.aClass333_4.method7959(arg2, arg1, arg0);
					if (local126 == -1) {
						break;
					}
					this.aLong313 += (long) local126;
					arg1 -= local126;
					arg2 += local126;
					this.aLong312 += (long) local126;
				}
			} else if (arg1 > 0) {
				this.method7817();
				local126 = arg1;
				if (this.anInt9287 < arg1) {
					local126 = this.anInt9287;
				}
				Static735.method9185(this.aByteArray94, 0, arg0, arg2, local126);
				this.aLong313 += (long) local126;
				arg1 -= local126;
				arg2 += local126;
			}
			if (this.aLong315 != -1L) {
				if (this.aLong313 < this.aLong315 && arg1 > 0) {
					local126 = arg2 + (int) (this.aLong315 - this.aLong313);
					if (arg1 + arg2 < local126) {
						local126 = arg2 + arg1;
					}
					while (local126 > arg2) {
						arg1--;
						arg0[arg2++] = 0;
						this.aLong313++;
					}
				}
				@Pc(331) long local331 = -1L;
				@Pc(333) long local333 = -1L;
				if (this.aLong315 >= local87 && this.aLong315 < local87 + (long) local91) {
					local331 = this.aLong315;
				} else if (this.aLong315 <= local87 && local87 < this.aLong315 + (long) this.anInt9278) {
					local331 = local87;
				}
				if (this.aLong315 + (long) this.anInt9278 > local87 && (long) local91 + local87 >= this.aLong315 - -((long) this.anInt9278)) {
					local333 = (long) this.anInt9278 + this.aLong315;
				} else if (local87 + (long) local91 > this.aLong315 && (long) this.anInt9278 + this.aLong315 >= (long) local91 + local87) {
					local333 = (long) local91 + local87;
				}
				if (local331 > -1L && local333 > local331) {
					@Pc(465) int local465 = (int) (local333 - local331);
					Static735.method9185(this.aByteArray95, (int) (local331 - this.aLong315), arg0, (int) (local331 - local87), local465);
					if (this.aLong313 < local333) {
						arg1 = (int) ((long) arg1 + this.aLong313 - local333);
						this.aLong313 = local333;
					}
				}
			}
		} catch (@Pc(501) IOException local501) {
			this.aLong312 = -1L;
			throw local501;
		}
		if (arg1 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!rla", name = "a", descriptor = "(B)J")
	public long method7814() {
		return this.aLong316;
	}

	@OriginalMember(owner = "client!rla", name = "a", descriptor = "(JI)V")
	public void method7815(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method7811());
		}
		this.aLong313 = arg0;
	}

	@OriginalMember(owner = "client!rla", name = "d", descriptor = "(I)V")
	public void method7816() throws IOException {
		this.method7820();
		this.aClass333_4.method7955();
	}

	@OriginalMember(owner = "client!rla", name = "e", descriptor = "(I)V")
	private void method7817() throws IOException {
		this.anInt9287 = 0;
		if (this.aLong312 != this.aLong313) {
			this.aClass333_4.method7957(this.aLong313);
			this.aLong312 = this.aLong313;
		}
		this.aLong311 = this.aLong313;
		while (this.anInt9287 < this.aByteArray94.length) {
			@Pc(44) int local44 = this.aByteArray94.length - this.anInt9287;
			if (local44 > 200000000) {
				local44 = 200000000;
			}
			@Pc(61) int local61 = this.aClass333_4.method7959(this.anInt9287, local44, this.aByteArray94);
			if (local61 == -1) {
				break;
			}
			this.anInt9287 += local61;
			this.aLong312 += (long) local61;
		}
	}

	@OriginalMember(owner = "client!rla", name = "a", descriptor = "(ZI[BI)V")
	public void method7818(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (this.aLong316 < this.aLong313 + (long) arg2) {
				this.aLong316 = this.aLong313 + (long) arg2;
			}
			if (this.aLong315 != -1L && (this.aLong313 < this.aLong315 || this.aLong313 > (long) this.anInt9278 + this.aLong315)) {
				this.method7820();
			}
			if (this.aLong315 != -1L && (long) arg2 + this.aLong313 > this.aLong315 - -((long) this.aByteArray95.length)) {
				@Pc(104) int local104 = (int) (this.aLong315 + (long) this.aByteArray95.length - this.aLong313);
				Static735.method9185(arg1, arg0, this.aByteArray95, (int) (this.aLong313 - this.aLong315), local104);
				this.aLong313 += (long) local104;
				arg0 += local104;
				arg2 -= local104;
				this.anInt9278 = this.aByteArray95.length;
				this.method7820();
			}
			if (arg2 > this.aByteArray95.length) {
				if (this.aLong312 != this.aLong313) {
					this.aClass333_4.method7957(this.aLong313);
					this.aLong312 = this.aLong313;
				}
				this.aClass333_4.method7956(arg1, arg0, arg2);
				this.aLong312 += (long) arg2;
				if (this.aLong314 < this.aLong312) {
					this.aLong314 = this.aLong312;
				}
				@Pc(204) long local204 = -1L;
				@Pc(206) long local206 = -1L;
				if (this.aLong311 <= this.aLong313 && this.aLong313 < this.aLong311 + (long) this.anInt9287) {
					local204 = this.aLong313;
				} else if (this.aLong311 >= this.aLong313 && this.aLong313 + (long) arg2 > this.aLong311) {
					local204 = this.aLong311;
				}
				if (this.aLong311 < (long) arg2 + this.aLong313 && this.aLong313 + (long) arg2 <= this.aLong311 - -((long) this.anInt9287)) {
					local206 = this.aLong313 + (long) arg2;
				} else if ((long) this.anInt9287 + this.aLong311 > this.aLong313 && (long) arg2 + this.aLong313 >= this.aLong311 + (long) this.anInt9287) {
					local206 = (long) this.anInt9287 + this.aLong311;
				}
				if (local204 > -1L && local206 > local204) {
					@Pc(370) int local370 = (int) (local206 - local204);
					Static735.method9185(arg1, (int) (local204 + (long) arg0 - this.aLong313), this.aByteArray94, (int) (local204 - this.aLong311), local370);
				}
				this.aLong313 += (long) arg2;
			} else if (arg2 > 0) {
				if (this.aLong315 == -1L) {
					this.aLong315 = this.aLong313;
				}
				Static735.method9185(arg1, arg0, this.aByteArray95, (int) (this.aLong313 - this.aLong315), arg2);
				this.aLong313 += (long) arg2;
				if ((long) this.anInt9278 < this.aLong313 - this.aLong315) {
					this.anInt9278 = (int) (this.aLong313 - this.aLong315);
				}
			}
		} catch (@Pc(462) IOException local462) {
			this.aLong312 = -1L;
			throw local462;
		}
	}

	@OriginalMember(owner = "client!rla", name = "a", descriptor = "(I[B)V")
	public void method7819(@OriginalArg(1) byte[] arg0) throws IOException {
		this.method7813(arg0, arg0.length, 0);
	}

	@OriginalMember(owner = "client!rla", name = "a", descriptor = "(I)V")
	private void method7820() throws IOException {
		if (this.aLong315 == -1L) {
			return;
		}
		if (this.aLong315 != this.aLong312) {
			this.aClass333_4.method7957(this.aLong315);
			this.aLong312 = this.aLong315;
		}
		this.aClass333_4.method7956(this.aByteArray95, 0, this.anInt9278);
		this.aLong312 += (long) this.anInt9278;
		if (this.aLong312 > this.aLong314) {
			this.aLong314 = this.aLong312;
		}
		@Pc(67) long local67 = -1L;
		@Pc(69) long local69 = -1L;
		if (this.aLong315 >= this.aLong311 && this.aLong315 < this.aLong311 + (long) this.anInt9287) {
			local67 = this.aLong315;
		} else if (this.aLong311 >= this.aLong315 && this.aLong315 + (long) this.anInt9278 > this.aLong311) {
			local67 = this.aLong311;
		}
		if (this.aLong315 + (long) this.anInt9278 > this.aLong311 && (long) this.anInt9287 + this.aLong311 >= (long) this.anInt9278 + this.aLong315) {
			local69 = this.aLong315 + (long) this.anInt9278;
		} else if (this.aLong315 < this.aLong311 + (long) this.anInt9287 && this.aLong311 + (long) this.anInt9287 <= (long) this.anInt9278 + this.aLong315) {
			local69 = this.aLong311 + (long) this.anInt9287;
		}
		if (local67 > -1L && local67 < local69) {
			@Pc(220) int local220 = (int) (local69 - local67);
			Static735.method9185(this.aByteArray95, (int) (local67 - this.aLong315), this.aByteArray94, (int) (local67 - this.aLong311), local220);
		}
		this.aLong315 = -1L;
		this.anInt9278 = 0;
	}
}
