import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cm")
public final class Class36 {

	@OriginalMember(owner = "client!cm", name = "f", descriptor = "J")
	private long aLong39;

	@OriginalMember(owner = "client!cm", name = "g", descriptor = "I")
	private int anInt1050;

	@OriginalMember(owner = "client!cm", name = "i", descriptor = "J")
	private long aLong40 = -1L;

	@OriginalMember(owner = "client!cm", name = "l", descriptor = "I")
	private int anInt1054 = 0;

	@OriginalMember(owner = "client!cm", name = "r", descriptor = "J")
	private long aLong42 = -1L;

	@OriginalMember(owner = "client!cm", name = "e", descriptor = "Lclient!cs;")
	private final Class39 aClass39_1;

	@OriginalMember(owner = "client!cm", name = "p", descriptor = "J")
	private long aLong41;

	@OriginalMember(owner = "client!cm", name = "v", descriptor = "J")
	private long aLong43;

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "J")
	private long aLong38;

	@OriginalMember(owner = "client!cm", name = "d", descriptor = "[B")
	private final byte[] aByteArray14;

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "[B")
	private final byte[] aByteArray13;

	@OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(Lclient!cs;II)V")
	public Class36(@OriginalArg(0) Class39 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass39_1 = arg0;
		this.aLong43 = this.aLong41 = arg0.method899();
		this.aLong38 = 0L;
		this.aByteArray14 = new byte[arg1];
		this.aByteArray13 = new byte[arg2];
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)V")
	private void method832() throws IOException {
		this.anInt1050 = 0;
		if (this.aLong39 != this.aLong38) {
			this.aClass39_1.method900(this.aLong38);
			this.aLong39 = this.aLong38;
		}
		this.aLong42 = this.aLong38;
		while (this.anInt1050 < this.aByteArray14.length) {
			@Pc(48) int local48 = this.aByteArray14.length - this.anInt1050;
			if (local48 > 200000000) {
				local48 = 200000000;
			}
			@Pc(63) int local63 = this.aClass39_1.method901(this.anInt1050, local48, this.aByteArray14);
			if (local63 == -1) {
				break;
			}
			this.anInt1050 += local63;
			this.aLong39 += local63;
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(IJ)V")
	public void method833(@OriginalArg(1) long arg0) throws IOException {
		if ((long) 0 > arg0) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method842());
		}
		this.aLong38 = arg0;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(III[B)V")
	public void method834(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if (this.aLong43 < (long) arg0 + this.aLong38) {
				this.aLong43 = this.aLong38 + (long) arg0;
			}
			if ((long) -1 != this.aLong40 && (this.aLong40 > this.aLong38 || this.aLong40 + (long) this.anInt1054 < this.aLong38)) {
				this.method837();
			}
			if (this.aLong40 != -1L && this.aLong40 + (long) this.aByteArray13.length < (long) arg0 + this.aLong38) {
				@Pc(89) int local89 = (int) (this.aLong40 + (long) this.aByteArray13.length - this.aLong38);
				Static367.method4034(arg2, arg1, this.aByteArray13, (int) (this.aLong38 - this.aLong40), local89);
				arg0 -= local89;
				arg1 += local89;
				this.aLong38 += local89;
				this.anInt1054 = this.aByteArray13.length;
				this.method837();
			}
			if (this.aByteArray13.length < arg0) {
				if (this.aLong38 != this.aLong39) {
					this.aClass39_1.method900(this.aLong38);
					this.aLong39 = this.aLong38;
				}
				this.aClass39_1.method902(arg0, arg1, arg2);
				this.aLong39 += arg0;
				if (this.aLong39 > this.aLong41) {
					this.aLong41 = this.aLong39;
				}
				@Pc(180) long local180 = -1L;
				if (this.aLong38 >= this.aLong42 && this.aLong38 < this.aLong42 + (long) this.anInt1050) {
					local180 = this.aLong38;
				} else if (this.aLong42 >= this.aLong38 && this.aLong42 < (long) arg0 + this.aLong38) {
					local180 = this.aLong42;
				}
				@Pc(229) long local229 = -1L;
				if (this.aLong38 + (long) arg0 > this.aLong42 && this.aLong38 + (long) arg0 <= (long) this.anInt1050 + this.aLong42) {
					local229 = this.aLong38 + (long) arg0;
				} else if (this.aLong38 < this.aLong42 + (long) this.anInt1050 && (long) this.anInt1050 + this.aLong42 <= this.aLong38 + (long) arg0) {
					local229 = this.aLong42 + (long) this.anInt1050;
				}
				if (local180 > -1L && local229 > local180) {
					@Pc(316) int local316 = (int) (local229 - local180);
					Static367.method4034(arg2, (int) (local180 + (long) arg1 - this.aLong38), this.aByteArray14, (int) (local180 - this.aLong42), local316);
				}
				this.aLong38 += arg0;
			} else if (arg0 > 0) {
				if (this.aLong40 == -1L) {
					this.aLong40 = this.aLong38;
				}
				Static367.method4034(arg2, arg1, this.aByteArray13, (int) (this.aLong38 - this.aLong40), arg0);
				this.aLong38 += arg0;
				if ((long) this.anInt1054 < this.aLong38 - this.aLong40) {
					this.anInt1054 = (int) (this.aLong38 - this.aLong40);
				}
			}
		} catch (@Pc(400) IOException local400) {
			this.aLong39 = -1L;
			throw local400;
		}
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(I)J")
	public long method836() {
		return this.aLong43;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(Z)V")
	private void method837() throws IOException {
		if (this.aLong40 == -1L) {
			return;
		}
		if (this.aLong40 != this.aLong39) {
			this.aClass39_1.method900(this.aLong40);
			this.aLong39 = this.aLong40;
		}
		this.aClass39_1.method902(this.anInt1054, 0, this.aByteArray13);
		this.aLong39 += this.anInt1054;
		if (this.aLong39 > this.aLong41) {
			this.aLong41 = this.aLong39;
		}
		@Pc(55) long local55 = -1L;
		@Pc(57) long local57 = -1L;
		if (this.aLong40 >= this.aLong42 && this.aLong40 < this.aLong42 + (long) this.anInt1050) {
			local55 = this.aLong40;
		} else if (this.aLong42 >= this.aLong40 && (long) this.anInt1054 + this.aLong40 > this.aLong42) {
			local55 = this.aLong42;
		}
		if (this.aLong42 < this.aLong40 + (long) this.anInt1054 && this.aLong42 + (long) this.anInt1050 >= this.aLong40 + (long) this.anInt1054) {
			local57 = (long) this.anInt1054 + this.aLong40;
		} else if (this.aLong40 < this.aLong42 + (long) this.anInt1050 && this.aLong42 + (long) this.anInt1050 <= this.aLong40 + (long) this.anInt1054) {
			local57 = this.aLong42 + (long) this.anInt1050;
		}
		if (local55 > -1L && local57 > local55) {
			@Pc(210) int local210 = (int) (local57 - local55);
			Static367.method4034(this.aByteArray13, (int) (local55 - this.aLong40), this.aByteArray14, (int) (local55 - this.aLong42), local210);
		}
		this.aLong40 = -1L;
		this.anInt1054 = 0;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(II[BI)V")
	public void method839(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg0 > arg1.length) {
				throw new ArrayIndexOutOfBoundsException(arg0 - arg1.length);
			}
			if (this.aLong40 != -1L && this.aLong38 >= this.aLong40 && this.aLong40 + (long) this.anInt1054 >= this.aLong38 + (long) arg0) {
				Static367.method4034(this.aByteArray13, (int) (this.aLong38 - this.aLong40), arg1, 0, arg0);
				this.aLong38 += arg0;
				return;
			}
			@Pc(75) long local75 = this.aLong38;
			@Pc(79) int local79 = arg0;
			@Pc(111) int local111;
			if (this.aLong38 >= this.aLong42 && this.aLong38 < (long) this.anInt1050 + this.aLong42) {
				local111 = (int) ((long) this.anInt1050 + this.aLong42 - this.aLong38);
				if (arg0 < local111) {
					local111 = arg0;
				}
				Static367.method4034(this.aByteArray14, (int) (this.aLong38 - this.aLong42), arg1, 0, local111);
				arg2 = local111;
				this.aLong38 += local111;
				arg0 -= local111;
			}
			if (arg0 > this.aByteArray14.length) {
				this.aClass39_1.method900(this.aLong38);
				this.aLong39 = this.aLong38;
				while (arg0 > 0) {
					local111 = this.aClass39_1.method901(arg2, arg0, arg1);
					if (local111 == -1) {
						break;
					}
					this.aLong38 += local111;
					arg2 += local111;
					this.aLong39 += local111;
					arg0 -= local111;
				}
			} else if (arg0 > 0) {
				this.method832();
				local111 = arg0;
				if (arg0 > this.anInt1050) {
					local111 = this.anInt1050;
				}
				Static367.method4034(this.aByteArray14, 0, arg1, arg2, local111);
				arg2 += local111;
				arg0 -= local111;
				this.aLong38 += local111;
			}
			if (this.aLong40 != (long) -1) {
				if (this.aLong40 > this.aLong38 && arg0 > 0) {
					local111 = (int) (this.aLong40 - this.aLong38) + arg2;
					if (arg0 + arg2 < local111) {
						local111 = arg2 + arg0;
					}
					while (arg2 < local111) {
						arg1[arg2++] = 0;
						arg0--;
						this.aLong38++;
					}
				}
				@Pc(303) long local303 = -1L;
				if (local75 <= this.aLong40 && this.aLong40 < local75 + (long) local79) {
					local303 = this.aLong40;
				} else if (this.aLong40 <= local75 && (long) this.anInt1054 + this.aLong40 > local75) {
					local303 = local75;
				}
				@Pc(352) long local352 = -1L;
				if ((long) this.anInt1054 + this.aLong40 > local75 && local75 + (long) local79 >= (long) this.anInt1054 + this.aLong40) {
					local352 = this.aLong40 + (long) this.anInt1054;
				} else if (this.aLong40 < local75 + (long) local79 && (long) this.anInt1054 + this.aLong40 >= (long) local79 + local75) {
					local352 = (long) local79 + local75;
				}
				if (local303 > -1L && local352 > local303) {
					@Pc(433) int local433 = (int) (local352 - local303);
					Static367.method4034(this.aByteArray13, (int) (local303 - this.aLong40), arg1, (int) (local303 - local75), local433);
					if (this.aLong38 < local352) {
						arg0 = (int) ((long) arg0 + this.aLong38 - local352);
						this.aLong38 = local352;
					}
				}
			}
		} catch (@Pc(471) IOException local471) {
			this.aLong39 = -1L;
			throw local471;
		}
		if (arg0 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "([BI)V")
	public void method841(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method839(arg0.length, arg0, 0);
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(B)Ljava/io/File;")
	private File method842() {
		return this.aClass39_1.method904();
	}
}
