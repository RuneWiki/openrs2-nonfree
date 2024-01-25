import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lp")
public final class Class155 {

	@OriginalMember(owner = "client!lp", name = "u", descriptor = "J")
	private long aLong127;

	@OriginalMember(owner = "client!lp", name = "v", descriptor = "I")
	private int anInt3946;

	@OriginalMember(owner = "client!lp", name = "j", descriptor = "J")
	private long aLong124 = -1L;

	@OriginalMember(owner = "client!lp", name = "k", descriptor = "I")
	private int anInt3941 = 0;

	@OriginalMember(owner = "client!lp", name = "m", descriptor = "J")
	private long aLong125 = -1L;

	@OriginalMember(owner = "client!lp", name = "r", descriptor = "Lclient!ko;")
	private final Class142 aClass142_4;

	@OriginalMember(owner = "client!lp", name = "h", descriptor = "J")
	private long aLong123;

	@OriginalMember(owner = "client!lp", name = "c", descriptor = "J")
	private long aLong122;

	@OriginalMember(owner = "client!lp", name = "d", descriptor = "[B")
	private final byte[] aByteArray57;

	@OriginalMember(owner = "client!lp", name = "o", descriptor = "J")
	private long aLong126;

	@OriginalMember(owner = "client!lp", name = "t", descriptor = "[B")
	private final byte[] aByteArray58;

	@OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(Lclient!ko;II)V")
	public Class155(@OriginalArg(0) Class142 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass142_4 = arg0;
		this.aLong122 = this.aLong123 = arg0.method3270();
		this.aByteArray57 = new byte[arg2];
		this.aLong126 = 0L;
		this.aByteArray58 = new byte[arg1];
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(II[BI)V")
	public void method3598(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if ((long) arg0 + this.aLong126 > this.aLong122) {
				this.aLong122 = (long) arg0 + this.aLong126;
			}
			if (this.aLong124 != -1L && (this.aLong126 < this.aLong124 || this.aLong126 > this.aLong124 + (long) this.anInt3941)) {
				this.method3601();
			}
			if (this.aLong124 != -1L && (long) arg0 + this.aLong126 > this.aLong124 + (long) this.aByteArray57.length) {
				@Pc(98) int local98 = (int) ((long) this.aByteArray57.length + this.aLong124 - this.aLong126);
				Static459.method5354(arg1, arg2, this.aByteArray57, (int) (this.aLong126 - this.aLong124), local98);
				arg2 += local98;
				this.aLong126 += local98;
				arg0 -= local98;
				this.anInt3941 = this.aByteArray57.length;
				this.method3601();
			}
			if (this.aByteArray57.length < arg0) {
				if (this.aLong127 != this.aLong126) {
					this.aClass142_4.method3271(this.aLong126);
					this.aLong127 = this.aLong126;
				}
				this.aClass142_4.method3268(arg0, arg1, arg2);
				this.aLong127 += arg0;
				if (this.aLong123 < this.aLong127) {
					this.aLong123 = this.aLong127;
				}
				@Pc(185) long local185 = -1L;
				if (this.aLong126 >= this.aLong125 && this.aLong126 < (long) this.anInt3946 + this.aLong125) {
					local185 = this.aLong126;
				} else if (this.aLong125 >= this.aLong126 && this.aLong126 + (long) arg0 > this.aLong125) {
					local185 = this.aLong125;
				}
				@Pc(235) long local235 = -1L;
				if (this.aLong126 + (long) arg0 > this.aLong125 && this.aLong125 + (long) this.anInt3946 >= this.aLong126 - -((long) arg0)) {
					local235 = this.aLong126 + (long) arg0;
				} else if (this.aLong125 + (long) this.anInt3946 > this.aLong126 && (long) arg0 + this.aLong126 >= (long) this.anInt3946 + this.aLong125) {
					local235 = (long) this.anInt3946 + this.aLong125;
				}
				if (local185 > -1L && local185 < local235) {
					@Pc(319) int local319 = (int) (local235 - local185);
					Static459.method5354(arg1, (int) ((long) arg2 + local185 - this.aLong126), this.aByteArray58, (int) (local185 - this.aLong125), local319);
				}
				this.aLong126 += arg0;
			} else if (arg0 > 0) {
				if (this.aLong124 == -1L) {
					this.aLong124 = this.aLong126;
				}
				Static459.method5354(arg1, arg2, this.aByteArray57, (int) (this.aLong126 - this.aLong124), arg0);
				this.aLong126 += arg0;
				if ((long) this.anInt3941 < this.aLong126 - this.aLong124) {
					this.anInt3941 = (int) (this.aLong126 - this.aLong124);
				}
			}
		} catch (@Pc(402) IOException local402) {
			this.aLong127 = -1L;
			throw local402;
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(Z)J")
	public long method3600() {
		return this.aLong122;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(I)V")
	private void method3601() throws IOException {
		if (this.aLong124 == -1L) {
			return;
		}
		if (this.aLong127 != this.aLong124) {
			this.aClass142_4.method3271(this.aLong124);
			this.aLong127 = this.aLong124;
		}
		this.aClass142_4.method3268(this.anInt3941, this.aByteArray57, 0);
		this.aLong127 += this.anInt3941;
		if (this.aLong127 > this.aLong123) {
			this.aLong123 = this.aLong127;
		}
		@Pc(64) long local64 = -1L;
		@Pc(66) long local66 = -1L;
		if (this.aLong124 >= this.aLong125 && this.aLong124 < (long) this.anInt3946 + this.aLong125) {
			local64 = this.aLong124;
		} else if (this.aLong125 >= this.aLong124 && this.aLong124 + (long) this.anInt3941 > this.aLong125) {
			local64 = this.aLong125;
		}
		if (this.aLong125 < (long) this.anInt3941 + this.aLong124 && (long) this.anInt3941 + this.aLong124 <= this.aLong125 - -((long) this.anInt3946)) {
			local66 = (long) this.anInt3941 + this.aLong124;
		} else if (this.aLong124 < this.aLong125 + (long) this.anInt3946 && (long) this.anInt3946 + this.aLong125 <= (long) this.anInt3941 + this.aLong124) {
			local66 = this.aLong125 + (long) this.anInt3946;
		}
		if (local64 > -1L && local66 > local64) {
			@Pc(209) int local209 = (int) (local66 - local64);
			Static459.method5354(this.aByteArray57, (int) (local64 - this.aLong124), this.aByteArray58, (int) (local64 - this.aLong125), local209);
		}
		this.aLong124 = -1L;
		this.anInt3941 = 0;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(I[B)V")
	public void method3602(@OriginalArg(1) byte[] arg0) throws IOException {
		this.method3606(arg0.length, 0, arg0);
	}

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "(Z)V")
	private void method3604() throws IOException {
		this.anInt3946 = 0;
		if (this.aLong127 != this.aLong126) {
			this.aClass142_4.method3271(this.aLong126);
			this.aLong127 = this.aLong126;
		}
		this.aLong125 = this.aLong126;
		while (this.anInt3946 < this.aByteArray58.length) {
			@Pc(52) int local52 = this.aByteArray58.length - this.anInt3946;
			if (local52 > 200000000) {
				local52 = 200000000;
			}
			@Pc(69) int local69 = this.aClass142_4.method3266(this.aByteArray58, this.anInt3946, local52);
			if (local69 == -1) {
				break;
			}
			this.anInt3946 += local69;
			this.aLong127 += local69;
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(II[BZ)V")
	public void method3606(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		try {
			if (arg0 > arg2.length) {
				throw new ArrayIndexOutOfBoundsException(arg0 - arg2.length);
			}
			if (this.aLong124 != -1L && this.aLong124 <= this.aLong126 && (long) arg0 + this.aLong126 <= this.aLong124 - -((long) this.anInt3941)) {
				Static459.method5354(this.aByteArray57, (int) (this.aLong126 - this.aLong124), arg2, 0, arg0);
				this.aLong126 += arg0;
				return;
			}
			@Pc(79) long local79 = this.aLong126;
			@Pc(90) int local90 = arg0;
			@Pc(122) int local122;
			if (this.aLong125 <= this.aLong126 && this.aLong125 + (long) this.anInt3946 > this.aLong126) {
				local122 = (int) (this.aLong125 + (long) this.anInt3946 - this.aLong126);
				if (local122 > arg0) {
					local122 = arg0;
				}
				Static459.method5354(this.aByteArray58, (int) (this.aLong126 - this.aLong125), arg2, 0, local122);
				arg0 -= local122;
				arg1 = local122;
				this.aLong126 += local122;
			}
			if (arg0 > this.aByteArray58.length) {
				this.aClass142_4.method3271(this.aLong126);
				this.aLong127 = this.aLong126;
				while (arg0 > 0) {
					local122 = this.aClass142_4.method3266(arg2, arg1, arg0);
					if (local122 == -1) {
						break;
					}
					this.aLong126 += local122;
					this.aLong127 += local122;
					arg1 += local122;
					arg0 -= local122;
				}
			} else if (arg0 > 0) {
				this.method3604();
				local122 = arg0;
				if (arg0 > this.anInt3946) {
					local122 = this.anInt3946;
				}
				Static459.method5354(this.aByteArray58, 0, arg2, arg1, local122);
				arg1 += local122;
				this.aLong126 += local122;
				arg0 -= local122;
			}
			if (this.aLong124 != -1L) {
				if (this.aLong126 < this.aLong124 && arg0 > 0) {
					local122 = (int) (this.aLong124 - this.aLong126) + arg1;
					if (local122 > arg0 + arg1) {
						local122 = arg1 + arg0;
					}
					while (arg1 < local122) {
						arg0--;
						arg2[arg1++] = 0;
						this.aLong126++;
					}
				}
				@Pc(316) long local316 = -1L;
				if (local79 <= this.aLong124 && (long) local90 + local79 > this.aLong124) {
					local316 = this.aLong124;
				} else if (local79 >= this.aLong124 && this.aLong124 + (long) this.anInt3941 > local79) {
					local316 = local79;
				}
				@Pc(360) long local360 = -1L;
				if (local79 < this.aLong124 + (long) this.anInt3941 && (long) local90 + local79 >= this.aLong124 + (long) this.anInt3941) {
					local360 = this.aLong124 + (long) this.anInt3941;
				} else if (this.aLong124 < local79 + (long) local90 && local79 + (long) local90 <= (long) this.anInt3941 + this.aLong124) {
					local360 = local79 + (long) local90;
				}
				if (local316 > -1L && local360 > local316) {
					@Pc(448) int local448 = (int) (local360 - local316);
					Static459.method5354(this.aByteArray57, (int) (local316 - this.aLong124), arg2, (int) (local316 - local79), local448);
					if (this.aLong126 < local360) {
						arg0 = (int) ((long) arg0 + this.aLong126 - local360);
						this.aLong126 = local360;
					}
				}
			}
		} catch (@Pc(486) IOException local486) {
			this.aLong127 = -1L;
			throw local486;
		}
		if (arg0 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(JB)V")
	public void method3607(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method3608());
		}
		this.aLong126 = arg0;
	}

	@OriginalMember(owner = "client!lp", name = "c", descriptor = "(I)Ljava/io/File;")
	private File method3608() {
		return this.aClass142_4.method3269();
	}
}
