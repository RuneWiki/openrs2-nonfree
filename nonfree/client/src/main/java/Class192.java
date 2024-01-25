import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qm")
public final class Class192 {

	@OriginalMember(owner = "client!qm", name = "h", descriptor = "I")
	private int anInt4998;

	@OriginalMember(owner = "client!qm", name = "s", descriptor = "J")
	private long aLong162;

	@OriginalMember(owner = "client!qm", name = "m", descriptor = "J")
	private long aLong160 = -1L;

	@OriginalMember(owner = "client!qm", name = "n", descriptor = "I")
	private int anInt5001 = 0;

	@OriginalMember(owner = "client!qm", name = "p", descriptor = "J")
	private long aLong161 = -1L;

	@OriginalMember(owner = "client!qm", name = "l", descriptor = "Lclient!vl;")
	private final Class237 aClass237_4;

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "J")
	private long aLong158;

	@OriginalMember(owner = "client!qm", name = "t", descriptor = "J")
	private long aLong163;

	@OriginalMember(owner = "client!qm", name = "o", descriptor = "[B")
	private final byte[] aByteArray77;

	@OriginalMember(owner = "client!qm", name = "r", descriptor = "[B")
	private final byte[] aByteArray78;

	@OriginalMember(owner = "client!qm", name = "j", descriptor = "J")
	private long aLong159;

	@OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Lclient!vl;II)V")
	public Class192(@OriginalArg(0) Class237 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass237_4 = arg0;
		this.aLong163 = this.aLong158 = arg0.method5211();
		this.aByteArray77 = new byte[arg1];
		this.aByteArray78 = new byte[arg2];
		this.aLong159 = 0L;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)J")
	public long method4388() {
		return this.aLong163;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(BI[BI)V")
	public void method4389(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (this.aLong163 < (long) arg0 + this.aLong159) {
				this.aLong163 = (long) arg0 + this.aLong159;
			}
			if (this.aLong160 != -1L && (this.aLong160 > this.aLong159 || (long) this.anInt5001 + this.aLong160 < this.aLong159)) {
				this.method4393();
			}
			if (this.aLong160 != -1L && (long) arg0 + this.aLong159 > this.aLong160 + (long) this.aByteArray78.length) {
				@Pc(92) int local92 = (int) (this.aLong160 + (long) this.aByteArray78.length - this.aLong159);
				Static404.method4337(arg1, arg2, this.aByteArray78, (int) (this.aLong159 - this.aLong160), local92);
				this.aLong159 += local92;
				arg0 -= local92;
				arg2 += local92;
				this.anInt5001 = this.aByteArray78.length;
				this.method4393();
			}
			if (arg0 > this.aByteArray78.length) {
				if (this.aLong162 != this.aLong159) {
					this.aClass237_4.method5210(this.aLong159);
					this.aLong162 = this.aLong159;
				}
				this.aClass237_4.method5208(arg1, arg0, arg2);
				this.aLong162 += arg0;
				if (this.aLong162 > this.aLong158) {
					this.aLong158 = this.aLong162;
				}
				@Pc(183) long local183 = -1L;
				@Pc(185) long local185 = -1L;
				if (this.aLong161 <= this.aLong159 && this.aLong159 < this.aLong161 + (long) this.anInt4998) {
					local183 = this.aLong159;
				} else if (this.aLong159 <= this.aLong161 && this.aLong161 < (long) arg0 + this.aLong159) {
					local183 = this.aLong161;
				}
				if (this.aLong159 + (long) arg0 > this.aLong161 && (long) this.anInt4998 + this.aLong161 >= (long) arg0 + this.aLong159) {
					local185 = (long) arg0 + this.aLong159;
				} else if (this.aLong159 < this.aLong161 + (long) this.anInt4998 && this.aLong159 + (long) arg0 >= (long) this.anInt4998 + this.aLong161) {
					local185 = (long) this.anInt4998 + this.aLong161;
				}
				if (local183 > -1L && local185 > local183) {
					@Pc(322) int local322 = (int) (local185 - local183);
					Static404.method4337(arg1, (int) ((long) arg2 + local183 - this.aLong159), this.aByteArray77, (int) (local183 - this.aLong161), local322);
				}
				this.aLong159 += arg0;
			} else if (arg0 > 0) {
				if (this.aLong160 == -1L) {
					this.aLong160 = this.aLong159;
				}
				Static404.method4337(arg1, arg2, this.aByteArray78, (int) (this.aLong159 - this.aLong160), arg0);
				this.aLong159 += arg0;
				if (this.aLong159 - this.aLong160 > (long) this.anInt5001) {
					this.anInt5001 = (int) (this.aLong159 - this.aLong160);
				}
			}
		} catch (@Pc(408) IOException local408) {
			this.aLong162 = -1L;
			throw local408;
		}
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "(I)V")
	private void method4390() throws IOException {
		this.anInt4998 = 0;
		if (this.aLong162 != this.aLong159) {
			this.aClass237_4.method5210(this.aLong159);
			this.aLong162 = this.aLong159;
		}
		this.aLong161 = this.aLong159;
		while (this.aByteArray77.length > this.anInt4998) {
			@Pc(42) int local42 = this.aByteArray77.length - this.anInt4998;
			if (local42 > 200000000) {
				local42 = 200000000;
			}
			@Pc(59) int local59 = this.aClass237_4.method5209(this.aByteArray77, local42, this.anInt4998);
			if (local59 == -1) {
				break;
			}
			this.aLong162 += local59;
			this.anInt4998 += local59;
		}
	}

	@OriginalMember(owner = "client!qm", name = "d", descriptor = "(I)V")
	private void method4393() throws IOException {
		if (this.aLong160 == (long) -1) {
			return;
		}
		if (this.aLong162 != this.aLong160) {
			this.aClass237_4.method5210(this.aLong160);
			this.aLong162 = this.aLong160;
		}
		this.aClass237_4.method5208(this.aByteArray78, this.anInt5001, 0);
		this.aLong162 += this.anInt5001;
		if (this.aLong158 < this.aLong162) {
			this.aLong158 = this.aLong162;
		}
		@Pc(60) long local60 = -1L;
		@Pc(62) long local62 = -1L;
		if (this.aLong161 <= this.aLong160 && this.aLong160 < this.aLong161 + (long) this.anInt4998) {
			local60 = this.aLong160;
		} else if (this.aLong161 >= this.aLong160 && this.aLong161 < this.aLong160 + (long) this.anInt5001) {
			local60 = this.aLong161;
		}
		if ((long) this.anInt5001 + this.aLong160 > this.aLong161 && this.aLong161 + (long) this.anInt4998 >= this.aLong160 + (long) this.anInt5001) {
			local62 = (long) this.anInt5001 + this.aLong160;
		} else if ((long) this.anInt4998 + this.aLong161 > this.aLong160 && (long) this.anInt4998 + this.aLong161 <= (long) this.anInt5001 + this.aLong160) {
			local62 = (long) this.anInt4998 + this.aLong161;
		}
		if (local60 > -1L && local62 > local60) {
			@Pc(207) int local207 = (int) (local62 - local60);
			Static404.method4337(this.aByteArray78, (int) (local60 - this.aLong160), this.aByteArray77, (int) (local60 - this.aLong161), local207);
		}
		this.anInt5001 = 0;
		this.aLong160 = -1L;
	}

	@OriginalMember(owner = "client!qm", name = "e", descriptor = "(I)Ljava/io/File;")
	private File method4395() {
		return this.aClass237_4.method5207();
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(II[BI)V")
	public void method4396(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		try {
			if (arg1 > arg2.length) {
				throw new ArrayIndexOutOfBoundsException(arg1 - arg2.length);
			}
			if (this.aLong160 != -1L && this.aLong160 <= this.aLong159 && (long) arg1 + this.aLong159 <= (long) this.anInt5001 + this.aLong160) {
				Static404.method4337(this.aByteArray78, (int) (this.aLong159 - this.aLong160), arg2, 0, arg1);
				this.aLong159 += arg1;
				return;
			}
			@Pc(79) long local79 = this.aLong159;
			@Pc(89) int local89 = arg1;
			@Pc(125) int local125;
			if (this.aLong159 >= this.aLong161 && this.aLong159 < this.aLong161 + (long) this.anInt4998) {
				local125 = (int) ((long) this.anInt4998 + this.aLong161 - this.aLong159);
				if (local125 > arg1) {
					local125 = arg1;
				}
				Static404.method4337(this.aByteArray77, (int) (this.aLong159 - this.aLong161), arg2, 0, local125);
				arg0 = local125;
				this.aLong159 += local125;
				arg1 -= local125;
			}
			if (this.aByteArray77.length < arg1) {
				this.aClass237_4.method5210(this.aLong159);
				this.aLong162 = this.aLong159;
				while (arg1 > 0) {
					local125 = this.aClass237_4.method5209(arg2, arg1, arg0);
					if (local125 == -1) {
						break;
					}
					this.aLong162 += local125;
					arg0 += local125;
					arg1 -= local125;
					this.aLong159 += local125;
				}
			} else if (arg1 > 0) {
				this.method4390();
				local125 = arg1;
				if (arg1 > this.anInt4998) {
					local125 = this.anInt4998;
				}
				Static404.method4337(this.aByteArray77, 0, arg2, arg0, local125);
				this.aLong159 += local125;
				arg0 += local125;
				arg1 -= local125;
			}
			if (this.aLong160 != -1L) {
				if (this.aLong159 < this.aLong160 && arg1 > 0) {
					local125 = arg0 + (int) (this.aLong160 - this.aLong159);
					if (local125 > arg0 + arg1) {
						local125 = arg1 + arg0;
					}
					while (arg0 < local125) {
						arg2[arg0++] = 0;
						arg1--;
						this.aLong159++;
					}
				}
				@Pc(313) long local313 = -1L;
				if (local79 <= this.aLong160 && (long) local89 + local79 > this.aLong160) {
					local313 = this.aLong160;
				} else if (this.aLong160 <= local79 && this.aLong160 + (long) this.anInt5001 > local79) {
					local313 = local79;
				}
				@Pc(357) long local357 = -1L;
				if (this.aLong160 + (long) this.anInt5001 > local79 && (long) local89 + local79 >= this.aLong160 - -((long) this.anInt5001)) {
					local357 = this.aLong160 + (long) this.anInt5001;
				} else if (this.aLong160 < (long) local89 + local79 && (long) local89 + local79 <= (long) this.anInt5001 + this.aLong160) {
					local357 = (long) local89 + local79;
				}
				if (local313 > -1L && local357 > local313) {
					@Pc(436) int local436 = (int) (local357 - local313);
					Static404.method4337(this.aByteArray78, (int) (local313 - this.aLong160), arg2, (int) (local313 - local79), local436);
					if (local357 > this.aLong159) {
						arg1 = (int) ((long) arg1 + this.aLong159 - local357);
						this.aLong159 = local357;
					}
				}
			}
		} catch (@Pc(475) IOException local475) {
			this.aLong162 = -1L;
			throw local475;
		}
		if (arg1 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(BJ)V")
	public void method4397(@OriginalArg(1) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method4395());
		}
		this.aLong159 = arg0;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "([BI)V")
	public void method4399(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method4396(0, arg0.length, arg0);
	}
}
