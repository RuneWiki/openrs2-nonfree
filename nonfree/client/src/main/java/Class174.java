import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public final class Class174 {

	@OriginalMember(owner = "client!r", name = "n", descriptor = "I")
	private int anInt4962;

	@OriginalMember(owner = "client!r", name = "p", descriptor = "J")
	private long aLong161;

	@OriginalMember(owner = "client!r", name = "s", descriptor = "J")
	private long aLong163 = -1L;

	@OriginalMember(owner = "client!r", name = "q", descriptor = "J")
	private long aLong162 = -1L;

	@OriginalMember(owner = "client!r", name = "c", descriptor = "I")
	private int anInt4956 = 0;

	@OriginalMember(owner = "client!r", name = "l", descriptor = "Lclient!um;")
	private final Class201 aClass201_1;

	@OriginalMember(owner = "client!r", name = "k", descriptor = "J")
	private long aLong160;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "J")
	private long aLong158;

	@OriginalMember(owner = "client!r", name = "e", descriptor = "J")
	private long aLong159;

	@OriginalMember(owner = "client!r", name = "w", descriptor = "[B")
	private final byte[] aByteArray78;

	@OriginalMember(owner = "client!r", name = "u", descriptor = "[B")
	private final byte[] aByteArray77;

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "(Lclient!um;II)V")
	public Class174(@OriginalArg(0) Class201 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass201_1 = arg0;
		this.aLong158 = this.aLong160 = arg0.method5363();
		this.aLong159 = 0L;
		this.aByteArray78 = new byte[arg2];
		this.aByteArray77 = new byte[arg1];
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "([BI)V")
	public void method4527(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method4535(arg0.length, 0, arg0);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)V")
	private void method4528() throws IOException {
		this.anInt4962 = 0;
		if (this.aLong159 != this.aLong161) {
			this.aClass201_1.method5361(this.aLong159);
			this.aLong161 = this.aLong159;
		}
		this.aLong163 = this.aLong159;
		while (this.anInt4962 < this.aByteArray77.length) {
			@Pc(48) int local48 = this.aByteArray77.length - this.anInt4962;
			if (local48 > 200000000) {
				local48 = 200000000;
			}
			@Pc(65) int local65 = this.aClass201_1.method5362(local48, this.aByteArray77, this.anInt4962);
			if (local65 == -1) {
				break;
			}
			this.anInt4962 += local65;
			this.aLong161 += local65;
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(I)Ljava/io/File;")
	private File method4529() {
		return this.aClass201_1.method5360();
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(JB)V")
	public void method4530(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method4529());
		}
		this.aLong159 = arg0;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "([BIII)V")
	public void method4532(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if ((long) arg1 + this.aLong159 > this.aLong158) {
				this.aLong158 = (long) arg1 + this.aLong159;
			}
			if (this.aLong162 != -1L && (this.aLong159 < this.aLong162 || (long) this.anInt4956 + this.aLong162 < this.aLong159)) {
				this.method4538();
			}
			if (this.aLong162 != -1L && (long) this.aByteArray78.length + this.aLong162 < this.aLong159 - -((long) arg1)) {
				@Pc(102) int local102 = (int) ((long) this.aByteArray78.length + this.aLong162 - this.aLong159);
				Static358.method954(arg0, arg2, this.aByteArray78, (int) (this.aLong159 - this.aLong162), local102);
				arg2 += local102;
				arg1 -= local102;
				this.aLong159 += local102;
				this.anInt4956 = this.aByteArray78.length;
				this.method4538();
			}
			if (arg1 > this.aByteArray78.length) {
				if (this.aLong161 != this.aLong159) {
					this.aClass201_1.method5361(this.aLong159);
					this.aLong161 = this.aLong159;
				}
				this.aClass201_1.method5364(arg1, arg2, arg0);
				this.aLong161 += arg1;
				if (this.aLong161 > this.aLong160) {
					this.aLong160 = this.aLong161;
				}
				@Pc(185) long local185 = -1L;
				@Pc(187) long local187 = -1L;
				if (this.aLong159 >= this.aLong163 && this.aLong163 + (long) this.anInt4962 > this.aLong159) {
					local185 = this.aLong159;
				} else if (this.aLong163 >= this.aLong159 && this.aLong163 < (long) arg1 + this.aLong159) {
					local185 = this.aLong163;
				}
				if ((long) arg1 + this.aLong159 > this.aLong163 && (long) arg1 + this.aLong159 <= (long) this.anInt4962 + this.aLong163) {
					local187 = this.aLong159 + (long) arg1;
				} else if (this.aLong163 + (long) this.anInt4962 > this.aLong159 && (long) this.anInt4962 + this.aLong163 <= this.aLong159 + (long) arg1) {
					local187 = this.aLong163 + (long) this.anInt4962;
				}
				if (local185 > -1L && local185 < local187) {
					@Pc(316) int local316 = (int) (local187 - local185);
					Static358.method954(arg0, (int) (local185 + (long) arg2 - this.aLong159), this.aByteArray77, (int) (local185 - this.aLong163), local316);
				}
				this.aLong159 += arg1;
			} else if (arg1 > 0) {
				if (this.aLong162 == -1L) {
					this.aLong162 = this.aLong159;
				}
				Static358.method954(arg0, arg2, this.aByteArray78, (int) (this.aLong159 - this.aLong162), arg1);
				this.aLong159 += arg1;
				if ((long) this.anInt4956 < this.aLong159 - this.aLong162) {
					this.anInt4956 = (int) (this.aLong159 - this.aLong162);
				}
			}
		} catch (@Pc(397) IOException local397) {
			this.aLong161 = -1L;
			throw local397;
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(III[B)V")
	public void method4535(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if (arg2.length < arg0) {
				throw new ArrayIndexOutOfBoundsException(arg0 - arg2.length);
			}
			if (this.aLong162 != -1L && this.aLong162 <= this.aLong159 && (long) this.anInt4956 + this.aLong162 >= (long) arg0 + this.aLong159) {
				Static358.method954(this.aByteArray78, (int) (this.aLong159 - this.aLong162), arg2, 0, arg0);
				this.aLong159 += arg0;
				return;
			}
			@Pc(77) long local77 = this.aLong159;
			@Pc(81) int local81 = arg0;
			@Pc(113) int local113;
			if (this.aLong159 >= this.aLong163 && (long) this.anInt4962 + this.aLong163 > this.aLong159) {
				local113 = (int) ((long) this.anInt4962 + this.aLong163 - this.aLong159);
				if (local113 > arg0) {
					local113 = arg0;
				}
				Static358.method954(this.aByteArray77, (int) (this.aLong159 - this.aLong163), arg2, 0, local113);
				this.aLong159 += local113;
				arg0 -= local113;
				arg1 = local113;
			}
			if (this.aByteArray77.length < arg0) {
				this.aClass201_1.method5361(this.aLong159);
				this.aLong161 = this.aLong159;
				while (arg0 > 0) {
					local113 = this.aClass201_1.method5362(arg0, arg2, arg1);
					if (local113 == -1) {
						break;
					}
					this.aLong159 += local113;
					arg1 += local113;
					arg0 -= local113;
					this.aLong161 += local113;
				}
			} else if (arg0 > 0) {
				this.method4528();
				local113 = arg0;
				if (this.anInt4962 < arg0) {
					local113 = this.anInt4962;
				}
				Static358.method954(this.aByteArray77, 0, arg2, arg1, local113);
				arg1 += local113;
				arg0 -= local113;
				this.aLong159 += local113;
			}
			if (this.aLong162 != -1L) {
				if (this.aLong159 < this.aLong162 && arg0 > 0) {
					local113 = arg1 + (int) (this.aLong162 - this.aLong159);
					if (local113 > arg1 + arg0) {
						local113 = arg0 + arg1;
					}
					while (local113 > arg1) {
						arg2[arg1++] = 0;
						arg0--;
						this.aLong159++;
					}
				}
				@Pc(307) long local307 = -1L;
				@Pc(309) long local309 = -1L;
				if (this.aLong162 >= local77 && this.aLong162 < local77 + (long) local81) {
					local307 = this.aLong162;
				} else if (this.aLong162 <= local77 && this.aLong162 + (long) this.anInt4956 > local77) {
					local307 = local77;
				}
				if (local77 < this.aLong162 + (long) this.anInt4956 && (long) local81 + local77 >= this.aLong162 + (long) this.anInt4956) {
					local309 = (long) this.anInt4956 + this.aLong162;
				} else if ((long) local81 + local77 > this.aLong162 && (long) this.anInt4956 + this.aLong162 >= (long) local81 + local77) {
					local309 = local77 + (long) local81;
				}
				if (local307 > -1L && local307 < local309) {
					@Pc(431) int local431 = (int) (local309 - local307);
					Static358.method954(this.aByteArray78, (int) (local307 - this.aLong162), arg2, (int) (local307 - local77), local431);
					if (this.aLong159 < local309) {
						arg0 = (int) ((long) arg0 + this.aLong159 - local309);
						this.aLong159 = local309;
					}
				}
			}
		} catch (@Pc(471) IOException local471) {
			this.aLong161 = -1L;
			throw local471;
		}
		if (arg0 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(I)J")
	public long method4537() {
		return this.aLong158;
	}

	@OriginalMember(owner = "client!r", name = "d", descriptor = "(I)V")
	private void method4538() throws IOException {
		if (this.aLong162 == -1L) {
			return;
		}
		if (this.aLong162 != this.aLong161) {
			this.aClass201_1.method5361(this.aLong162);
			this.aLong161 = this.aLong162;
		}
		this.aClass201_1.method5364(this.anInt4956, 0, this.aByteArray78);
		this.aLong161 += this.anInt4956;
		if (this.aLong161 > this.aLong160) {
			this.aLong160 = this.aLong161;
		}
		@Pc(65) long local65 = -1L;
		@Pc(67) long local67 = -1L;
		if (this.aLong162 >= this.aLong163 && this.aLong163 + (long) this.anInt4962 > this.aLong162) {
			local65 = this.aLong162;
		} else if (this.aLong163 >= this.aLong162 && this.aLong162 + (long) this.anInt4956 > this.aLong163) {
			local65 = this.aLong163;
		}
		if (this.aLong163 < (long) this.anInt4956 + this.aLong162 && (long) this.anInt4956 + this.aLong162 <= (long) this.anInt4962 + this.aLong163) {
			local67 = this.aLong162 + (long) this.anInt4956;
		} else if (this.aLong162 < (long) this.anInt4962 + this.aLong163 && this.aLong162 + (long) this.anInt4956 >= this.aLong163 - -((long) this.anInt4962)) {
			local67 = this.aLong163 + (long) this.anInt4962;
		}
		if (local65 > -1L && local67 > local65) {
			@Pc(200) int local200 = (int) (local67 - local65);
			Static358.method954(this.aByteArray78, (int) (local65 - this.aLong162), this.aByteArray77, (int) (local65 - this.aLong163), local200);
		}
		this.aLong162 = -1L;
		this.anInt4956 = 0;
	}
}
