import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jt")
public final class Class136 {

	@OriginalMember(owner = "client!jt", name = "f", descriptor = "J")
	private long aLong109;

	@OriginalMember(owner = "client!jt", name = "u", descriptor = "I")
	private int anInt3782;

	@OriginalMember(owner = "client!jt", name = "j", descriptor = "J")
	private long aLong110 = -1L;

	@OriginalMember(owner = "client!jt", name = "k", descriptor = "J")
	private long aLong111 = -1L;

	@OriginalMember(owner = "client!jt", name = "x", descriptor = "I")
	private int anInt3784 = 0;

	@OriginalMember(owner = "client!jt", name = "m", descriptor = "Lclient!de;")
	private final Class46 aClass46_1;

	@OriginalMember(owner = "client!jt", name = "l", descriptor = "J")
	private long aLong112;

	@OriginalMember(owner = "client!jt", name = "p", descriptor = "J")
	private long aLong113;

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "[B")
	private final byte[] aByteArray45;

	@OriginalMember(owner = "client!jt", name = "q", descriptor = "J")
	private long aLong114;

	@OriginalMember(owner = "client!jt", name = "s", descriptor = "[B")
	private final byte[] aByteArray46;

	@OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(Lclient!de;II)V")
	public Class136(@OriginalArg(0) Class46 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass46_1 = arg0;
		this.aLong113 = this.aLong112 = arg0.method1368();
		this.aByteArray45 = new byte[arg1];
		this.aLong114 = 0L;
		this.aByteArray46 = new byte[arg2];
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(JI)V")
	public void method3105(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method3112());
		}
		this.aLong114 = arg0;
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(I)V")
	private void method3106() throws IOException {
		if (this.aLong110 == -1L) {
			return;
		}
		if (this.aLong110 != this.aLong109) {
			this.aClass46_1.method1370(this.aLong110);
			this.aLong109 = this.aLong110;
		}
		this.aClass46_1.method1366(this.anInt3784, 0, this.aByteArray46);
		this.aLong109 += this.anInt3784;
		if (this.aLong109 > this.aLong112) {
			this.aLong112 = this.aLong109;
		}
		@Pc(61) long local61 = -1L;
		if (this.aLong111 <= this.aLong110 && this.aLong110 < (long) this.anInt3782 + this.aLong111) {
			local61 = this.aLong110;
		} else if (this.aLong111 >= this.aLong110 && this.aLong111 < this.aLong110 + (long) this.anInt3784) {
			local61 = this.aLong111;
		}
		@Pc(115) long local115 = -1L;
		if (this.aLong111 < this.aLong110 + (long) this.anInt3784 && (long) this.anInt3784 + this.aLong110 <= this.aLong111 + (long) this.anInt3782) {
			local115 = this.aLong110 + (long) this.anInt3784;
		} else if (this.aLong111 + (long) this.anInt3782 > this.aLong110 && this.aLong110 + (long) this.anInt3784 >= this.aLong111 - -((long) this.anInt3782)) {
			local115 = this.aLong111 + (long) this.anInt3782;
		}
		if (local61 > -1L && local115 > local61) {
			@Pc(200) int local200 = (int) (local115 - local61);
			Static459.method6338(this.aByteArray46, (int) (local61 - this.aLong110), this.aByteArray45, (int) (local61 - this.aLong111), local200);
		}
		this.anInt3784 = 0;
		this.aLong110 = -1L;
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(Z)V")
	private void method3107() throws IOException {
		this.anInt3782 = 0;
		if (this.aLong109 != this.aLong114) {
			this.aClass46_1.method1370(this.aLong114);
			this.aLong109 = this.aLong114;
		}
		this.aLong111 = this.aLong114;
		while (this.anInt3782 < this.aByteArray45.length) {
			@Pc(44) int local44 = this.aByteArray45.length - this.anInt3782;
			if (local44 > 200000000) {
				local44 = 200000000;
			}
			@Pc(61) int local61 = this.aClass46_1.method1365(this.aByteArray45, local44, this.anInt3782);
			if (local61 == -1) {
				break;
			}
			this.aLong109 += local61;
			this.anInt3782 += local61;
		}
	}

	@OriginalMember(owner = "client!jt", name = "b", descriptor = "(I)J")
	public long method3108() {
		return this.aLong113;
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(II[BI)V")
	public void method3110(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg1.length < arg2) {
				throw new ArrayIndexOutOfBoundsException(arg2 - arg1.length);
			}
			if (this.aLong110 != -1L && this.aLong110 <= this.aLong114 && this.aLong114 + (long) arg2 <= this.aLong110 + (long) this.anInt3784) {
				Static459.method6338(this.aByteArray46, (int) (this.aLong114 - this.aLong110), arg1, 0, arg2);
				this.aLong114 += arg2;
				return;
			}
			@Pc(80) long local80 = this.aLong114;
			@Pc(84) int local84 = arg2;
			@Pc(116) int local116;
			if (this.aLong111 <= this.aLong114 && (long) this.anInt3782 + this.aLong111 > this.aLong114) {
				local116 = (int) (this.aLong111 + (long) this.anInt3782 - this.aLong114);
				if (local116 > arg2) {
					local116 = arg2;
				}
				Static459.method6338(this.aByteArray45, (int) (this.aLong114 - this.aLong111), arg1, 0, local116);
				arg2 -= local116;
				arg0 = local116;
				this.aLong114 += local116;
			}
			if (this.aByteArray45.length < arg2) {
				this.aClass46_1.method1370(this.aLong114);
				this.aLong109 = this.aLong114;
				while (arg2 > 0) {
					local116 = this.aClass46_1.method1365(arg1, arg2, arg0);
					if (local116 == -1) {
						break;
					}
					this.aLong114 += local116;
					arg2 -= local116;
					arg0 += local116;
					this.aLong109 += local116;
				}
			} else if (arg2 > 0) {
				this.method3107();
				local116 = arg2;
				if (arg2 > this.anInt3782) {
					local116 = this.anInt3782;
				}
				Static459.method6338(this.aByteArray45, 0, arg1, arg0, local116);
				arg0 += local116;
				this.aLong114 += local116;
				arg2 -= local116;
			}
			if (this.aLong110 != -1L) {
				if (this.aLong114 < this.aLong110 && arg2 > 0) {
					local116 = arg0 + (int) (this.aLong110 - this.aLong114);
					if (local116 > arg2 + arg0) {
						local116 = arg2 + arg0;
					}
					while (local116 > arg0) {
						arg2--;
						arg1[arg0++] = 0;
						this.aLong114++;
					}
				}
				@Pc(308) long local308 = -1L;
				@Pc(310) long local310 = -1L;
				if (this.aLong110 >= local80 && this.aLong110 < local80 + (long) local84) {
					local308 = this.aLong110;
				} else if (local80 >= this.aLong110 && local80 < this.aLong110 + (long) this.anInt3784) {
					local308 = local80;
				}
				if (local80 < this.aLong110 + (long) this.anInt3784 && this.aLong110 + (long) this.anInt3784 <= local80 - -((long) local84)) {
					local310 = (long) this.anInt3784 + this.aLong110;
				} else if (this.aLong110 < (long) local84 + local80 && (long) local84 + local80 <= (long) this.anInt3784 + this.aLong110) {
					local310 = (long) local84 + local80;
				}
				if (local308 > -1L && local310 > local308) {
					@Pc(432) int local432 = (int) (local310 - local308);
					Static459.method6338(this.aByteArray46, (int) (local308 - this.aLong110), arg1, (int) (local308 - local80), local432);
					if (this.aLong114 < local310) {
						arg2 = (int) ((long) arg2 + this.aLong114 - local310);
						this.aLong114 = local310;
					}
				}
			}
		} catch (@Pc(470) IOException local470) {
			this.aLong109 = -1L;
			throw local470;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!jt", name = "b", descriptor = "(Z)Ljava/io/File;")
	private File method3112() {
		return this.aClass46_1.method1369();
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(I[BII)V")
	public void method3113(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (this.aLong114 + (long) arg0 > this.aLong113) {
				this.aLong113 = this.aLong114 + (long) arg0;
			}
			if (this.aLong110 != -1L && (this.aLong114 < this.aLong110 || (long) this.anInt3784 + this.aLong110 < this.aLong114)) {
				this.method3106();
			}
			if (this.aLong110 != -1L && this.aLong114 + (long) arg0 > this.aLong110 - -((long) this.aByteArray46.length)) {
				@Pc(92) int local92 = (int) (this.aLong110 + (long) this.aByteArray46.length - this.aLong114);
				Static459.method6338(arg1, arg2, this.aByteArray46, (int) (this.aLong114 - this.aLong110), local92);
				this.aLong114 += local92;
				arg0 -= local92;
				arg2 += local92;
				this.anInt3784 = this.aByteArray46.length;
				this.method3106();
			}
			if (arg0 > this.aByteArray46.length) {
				if (this.aLong109 != this.aLong114) {
					this.aClass46_1.method1370(this.aLong114);
					this.aLong109 = this.aLong114;
				}
				this.aClass46_1.method1366(arg0, arg2, arg1);
				this.aLong109 += arg0;
				if (this.aLong112 < this.aLong109) {
					this.aLong112 = this.aLong109;
				}
				@Pc(185) long local185 = -1L;
				@Pc(187) long local187 = -1L;
				if (this.aLong111 <= this.aLong114 && this.aLong114 < (long) this.anInt3782 + this.aLong111) {
					local185 = this.aLong114;
				} else if (this.aLong114 <= this.aLong111 && this.aLong114 + (long) arg0 > this.aLong111) {
					local185 = this.aLong111;
				}
				if (this.aLong111 < this.aLong114 + (long) arg0 && this.aLong111 + (long) this.anInt3782 >= this.aLong114 + (long) arg0) {
					local187 = (long) arg0 + this.aLong114;
				} else if (this.aLong114 < (long) this.anInt3782 + this.aLong111 && this.aLong111 + (long) this.anInt3782 <= this.aLong114 - -((long) arg0)) {
					local187 = this.aLong111 + (long) this.anInt3782;
				}
				if (local185 > -1L && local185 < local187) {
					@Pc(317) int local317 = (int) (local187 - local185);
					Static459.method6338(arg1, (int) ((long) arg2 + local185 - this.aLong114), this.aByteArray45, (int) (local185 - this.aLong111), local317);
				}
				this.aLong114 += arg0;
			} else if (arg0 > 0) {
				if (this.aLong110 == -1L) {
					this.aLong110 = this.aLong114;
				}
				Static459.method6338(arg1, arg2, this.aByteArray46, (int) (this.aLong114 - this.aLong110), arg0);
				this.aLong114 += arg0;
				if ((long) this.anInt3784 < this.aLong114 - this.aLong110) {
					this.anInt3784 = (int) (this.aLong114 - this.aLong110);
				}
			}
		} catch (@Pc(404) IOException local404) {
			this.aLong109 = -1L;
			throw local404;
		}
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(I[B)V")
	public void method3114(@OriginalArg(1) byte[] arg0) throws IOException {
		this.method3110(0, arg0, arg0.length);
	}
}
