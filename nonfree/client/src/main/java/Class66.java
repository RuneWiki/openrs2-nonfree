import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ph")
public final class Class66 {

	@OriginalMember(owner = "client!ph", name = "j", descriptor = "I")
	private int anInt3562;

	@OriginalMember(owner = "client!ph", name = "x", descriptor = "J")
	private long aLong114;

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "J")
	private long aLong111 = -1L;

	@OriginalMember(owner = "client!ph", name = "q", descriptor = "I")
	private int anInt3567 = 0;

	@OriginalMember(owner = "client!ph", name = "E", descriptor = "J")
	private long aLong116 = -1L;

	@OriginalMember(owner = "client!ph", name = "B", descriptor = "Lclient!tc;")
	private final Class74 aClass74_4;

	@OriginalMember(owner = "client!ph", name = "p", descriptor = "J")
	private long aLong113;

	@OriginalMember(owner = "client!ph", name = "o", descriptor = "J")
	private long aLong112;

	@OriginalMember(owner = "client!ph", name = "w", descriptor = "[B")
	private final byte[] aByteArray44;

	@OriginalMember(owner = "client!ph", name = "y", descriptor = "J")
	private long aLong115;

	@OriginalMember(owner = "client!ph", name = "i", descriptor = "[B")
	private final byte[] aByteArray43;

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Lclient!tc;II)V")
	public Class66(@OriginalArg(0) Class74 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass74_4 = arg0;
		this.aLong112 = this.aLong113 = arg0.method3177();
		this.aByteArray44 = new byte[arg2];
		this.aLong115 = 0L;
		this.aByteArray43 = new byte[arg1];
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(B[B)V")
	public void method2649(@OriginalArg(1) byte[] arg0) throws IOException {
		this.method2660(arg0.length, 0, arg0);
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)V")
	public void method2650() throws IOException {
		this.method2651();
		this.aClass74_4.method3174();
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V")
	private void method2651() throws IOException {
		if (this.aLong111 == (long) -1) {
			return;
		}
		if (this.aLong111 != this.aLong114) {
			this.aClass74_4.method3179(this.aLong111);
			this.aLong114 = this.aLong111;
		}
		@Pc(29) long local29 = -1L;
		@Pc(31) long local31 = -1L;
		this.aClass74_4.method3175(0, this.aByteArray44, this.anInt3567);
		if (this.aLong116 < this.aLong111 + (long) this.anInt3567 && this.aLong116 + (long) this.anInt3562 >= (long) this.anInt3567 + this.aLong111) {
			local29 = this.aLong111 + (long) this.anInt3567;
		} else if (this.aLong111 < this.aLong116 + (long) this.anInt3562 && this.aLong111 + (long) this.anInt3567 >= (long) this.anInt3562 + this.aLong116) {
			local29 = this.aLong116 + (long) this.anInt3562;
		}
		this.aLong114 += this.anInt3567;
		if (this.aLong114 > this.aLong113) {
			this.aLong113 = this.aLong114;
		}
		if (this.aLong116 <= this.aLong111 && this.aLong111 < (long) this.anInt3562 + this.aLong116) {
			local31 = this.aLong111;
		} else if (this.aLong111 <= this.aLong116 && (long) this.anInt3567 + this.aLong111 > this.aLong116) {
			local31 = this.aLong116;
		}
		if (local31 > -1L && local31 < local29) {
			@Pc(199) int local199 = (int) (local29 - local31);
			Static188.method2304(this.aByteArray44, (int) (local31 - this.aLong111), this.aByteArray43, (int) (local31 - this.aLong116), local199);
		}
		this.aLong111 = -1L;
		this.anInt3567 = 0;
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(I)V")
	private void method2653() throws IOException {
		this.anInt3562 = 0;
		if (this.aLong114 != this.aLong115) {
			this.aClass74_4.method3179(this.aLong115);
			this.aLong114 = this.aLong115;
		}
		this.aLong116 = this.aLong115;
		while (this.anInt3562 < this.aByteArray43.length) {
			@Pc(51) int local51 = this.aClass74_4.method3178(this.anInt3562, this.aByteArray43.length - this.anInt3562, this.aByteArray43);
			if (local51 == -1) {
				break;
			}
			this.anInt3562 += local51;
			this.aLong114 += local51;
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "([BIBI)V")
	public void method2654(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (this.aLong112 < this.aLong115 + (long) arg2) {
				this.aLong112 = (long) arg2 + this.aLong115;
			}
			if (this.aLong111 != -1L && (this.aLong111 > this.aLong115 || this.aLong111 + (long) this.anInt3567 < this.aLong115)) {
				this.method2651();
			}
			if (this.aLong111 != -1L && (long) arg2 + this.aLong115 > this.aLong111 - -((long) this.aByteArray44.length)) {
				@Pc(99) int local99 = (int) ((long) this.aByteArray44.length + this.aLong111 - this.aLong115);
				arg2 -= local99;
				Static188.method2304(arg0, arg1, this.aByteArray44, (int) (this.aLong115 - this.aLong111), local99);
				this.aLong115 += local99;
				this.anInt3567 = this.aByteArray44.length;
				arg1 += local99;
				this.method2651();
			}
			if (arg2 > this.aByteArray44.length) {
				if (this.aLong115 != this.aLong114) {
					this.aClass74_4.method3179(this.aLong115);
					this.aLong114 = this.aLong115;
				}
				this.aClass74_4.method3175(arg1, arg0, arg2);
				this.aLong114 += arg2;
				if (this.aLong114 > this.aLong113) {
					this.aLong113 = this.aLong114;
				}
				@Pc(189) long local189 = -1L;
				if ((long) arg2 + this.aLong115 > this.aLong116 && this.aLong115 + (long) arg2 <= this.aLong116 - -((long) this.anInt3562)) {
					local189 = (long) arg2 + this.aLong115;
				} else if ((long) this.anInt3562 + this.aLong116 > this.aLong115 && this.aLong115 + (long) arg2 >= this.aLong116 + (long) this.anInt3562) {
					local189 = this.aLong116 + (long) this.anInt3562;
				}
				@Pc(263) long local263 = -1L;
				if (this.aLong116 <= this.aLong115 && this.aLong115 < this.aLong116 + (long) this.anInt3562) {
					local263 = this.aLong115;
				} else if (this.aLong115 <= this.aLong116 && (long) arg2 + this.aLong115 > this.aLong116) {
					local263 = this.aLong116;
				}
				if (local263 > -1L && local189 > local263) {
					@Pc(320) int local320 = (int) (local189 - local263);
					Static188.method2304(arg0, (int) (local263 + (long) arg1 - this.aLong115), this.aByteArray43, (int) (local263 - this.aLong116), local320);
				}
				this.aLong115 += arg2;
			} else if (arg2 > 0) {
				if (this.aLong111 == -1L) {
					this.aLong111 = this.aLong115;
				}
				Static188.method2304(arg0, arg1, this.aByteArray44, (int) (this.aLong115 - this.aLong111), arg2);
				this.aLong115 += arg2;
				if (this.aLong115 - this.aLong111 > (long) this.anInt3567) {
					this.anInt3567 = (int) (this.aLong115 - this.aLong111);
				}
			}
		} catch (@Pc(403) IOException local403) {
			this.aLong114 = -1L;
			throw local403;
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Z)Ljava/io/File;")
	private File method2657() {
		return this.aClass74_4.method3176();
	}

	@OriginalMember(owner = "client!ph", name = "d", descriptor = "(I)J")
	public long method2658() {
		return this.aLong112;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(III[B)V")
	public void method2660(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if (arg2.length < arg0) {
				throw new ArrayIndexOutOfBoundsException(arg0 - arg2.length);
			}
			if (this.aLong111 != -1L && this.aLong115 >= this.aLong111 && (long) arg0 + this.aLong115 <= this.aLong111 + (long) this.anInt3567) {
				Static188.method2304(this.aByteArray44, (int) (this.aLong115 - this.aLong111), arg2, 0, arg0);
				this.aLong115 += arg0;
				return;
			}
			@Pc(87) long local87 = this.aLong115;
			@Pc(91) int local91 = arg0;
			@Pc(124) int local124;
			if (this.aLong116 <= this.aLong115 && this.aLong115 < (long) this.anInt3562 + this.aLong116) {
				local124 = (int) (this.aLong116 + (long) this.anInt3562 - this.aLong115);
				if (local124 > arg0) {
					local124 = arg0;
				}
				arg0 -= local124;
				Static188.method2304(this.aByteArray43, (int) (this.aLong115 - this.aLong116), arg2, 0, local124);
				arg1 = local124;
				this.aLong115 += local124;
			}
			if (arg0 > this.aByteArray43.length) {
				this.aClass74_4.method3179(this.aLong115);
				this.aLong114 = this.aLong115;
				while (arg0 > 0) {
					local124 = this.aClass74_4.method3178(arg1, arg0, arg2);
					if (local124 == -1) {
						break;
					}
					arg1 += local124;
					arg0 -= local124;
					this.aLong114 += local124;
					this.aLong115 += local124;
				}
			} else if (arg0 > 0) {
				this.method2653();
				local124 = arg0;
				if (arg0 > this.anInt3562) {
					local124 = this.anInt3562;
				}
				arg0 -= local124;
				Static188.method2304(this.aByteArray43, 0, arg2, arg1, local124);
				arg1 += local124;
				this.aLong115 += local124;
			}
			if (this.aLong111 != -1L) {
				if (this.aLong115 < this.aLong111 && arg0 > 0) {
					local124 = arg1 + (int) (this.aLong111 - this.aLong115);
					if (arg0 + arg1 < local124) {
						local124 = arg1 + arg0;
					}
					while (local124 > arg1) {
						arg0--;
						arg2[arg1++] = 0;
						this.aLong115++;
					}
				}
				@Pc(317) long local317 = -1L;
				if (this.aLong111 >= local87 && this.aLong111 < local87 + (long) local91) {
					local317 = this.aLong111;
				} else if (this.aLong111 <= local87 && local87 < (long) this.anInt3567 + this.aLong111) {
					local317 = local87;
				}
				@Pc(361) long local361 = -1L;
				if (local87 < (long) this.anInt3567 + this.aLong111 && (long) this.anInt3567 + this.aLong111 <= local87 - -((long) local91)) {
					local361 = (long) this.anInt3567 + this.aLong111;
				} else if (this.aLong111 < (long) local91 + local87 && this.aLong111 + (long) this.anInt3567 >= (long) local91 + local87) {
					local361 = (long) local91 + local87;
				}
				if (local317 > -1L && local361 > local317) {
					@Pc(442) int local442 = (int) (local361 - local317);
					Static188.method2304(this.aByteArray44, (int) (local317 - this.aLong111), arg2, (int) (local317 - local87), local442);
					if (local361 > this.aLong115) {
						arg0 = (int) ((long) arg0 + this.aLong115 - local361);
						this.aLong115 = local361;
					}
				}
			}
		} catch (@Pc(480) IOException local480) {
			this.aLong114 = -1L;
			throw local480;
		}
		if (arg0 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(JI)V")
	public void method2662(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method2657());
		}
		this.aLong115 = arg0;
	}
}
