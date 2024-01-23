import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class13 {

	@OriginalMember(owner = "client!be", name = "g", descriptor = "J")
	private long aLong17;

	@OriginalMember(owner = "client!be", name = "w", descriptor = "I")
	private int anInt356;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "I")
	private int anInt348 = 0;

	@OriginalMember(owner = "client!be", name = "y", descriptor = "J")
	private long aLong20 = -1L;

	@OriginalMember(owner = "client!be", name = "d", descriptor = "J")
	private long aLong16 = -1L;

	@OriginalMember(owner = "client!be", name = "p", descriptor = "Lclient!fi;")
	private Class39 aClass39_1;

	@OriginalMember(owner = "client!be", name = "h", descriptor = "J")
	private long aLong18;

	@OriginalMember(owner = "client!be", name = "o", descriptor = "J")
	private long aLong19;

	@OriginalMember(owner = "client!be", name = "j", descriptor = "[B")
	private byte[] aByteArray12;

	@OriginalMember(owner = "client!be", name = "E", descriptor = "J")
	private long aLong21;

	@OriginalMember(owner = "client!be", name = "n", descriptor = "[B")
	private byte[] aByteArray13;

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lclient!fi;II)V")
	public Class13(@OriginalArg(0) Class39 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass39_1 = arg0;
		this.aLong19 = this.aLong18 = arg0.method1202();
		this.aByteArray12 = new byte[arg1];
		this.aLong21 = 0L;
		this.aByteArray13 = new byte[arg2];
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(I)J")
	public long method347() {
		return this.aLong19;
	}

	@OriginalMember(owner = "client!be", name = "c", descriptor = "(I)Ljava/io/File;")
	private File method348() {
		return this.aClass39_1.method1201();
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(I[BBI)V")
	public void method349(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (this.aLong19 < this.aLong21 + (long) arg0) {
				this.aLong19 = (long) arg0 + this.aLong21;
			}
			if (this.aLong16 != -1L && (this.aLong21 < this.aLong16 || this.aLong21 > (long) this.anInt348 + this.aLong16)) {
				this.method350();
			}
			if (this.aLong16 != -1L && this.aLong21 + (long) arg0 > (long) this.aByteArray13.length + this.aLong16) {
				@Pc(95) int local95 = (int) ((long) this.aByteArray13.length + this.aLong16 - this.aLong21);
				arg0 -= local95;
				Static236.method300(arg1, arg2, this.aByteArray13, (int) (this.aLong21 - this.aLong16), local95);
				arg2 += local95;
				this.aLong21 += local95;
				this.anInt348 = this.aByteArray13.length;
				this.method350();
			}
			if (this.aByteArray13.length < arg0) {
				if (this.aLong17 != this.aLong21) {
					this.aClass39_1.method1199(this.aLong21);
					this.aLong17 = this.aLong21;
				}
				this.aClass39_1.method1203(arg2, arg1, arg0);
				@Pc(165) long local165 = -1L;
				@Pc(167) long local167 = -1L;
				if ((long) arg0 + this.aLong21 > this.aLong20 && this.aLong20 + (long) this.anInt356 >= (long) arg0 + this.aLong21) {
					local165 = (long) arg0 + this.aLong21;
				} else if ((long) this.anInt356 + this.aLong20 > this.aLong21 && (long) arg0 + this.aLong21 >= (long) this.anInt356 + this.aLong20) {
					local165 = (long) this.anInt356 + this.aLong20;
				}
				this.aLong17 += arg0;
				if (this.aLong21 >= this.aLong20 && this.aLong21 < this.aLong20 + (long) this.anInt356) {
					local167 = this.aLong21;
				} else if (this.aLong20 >= this.aLong21 && this.aLong21 + (long) arg0 > this.aLong20) {
					local167 = this.aLong20;
				}
				if (this.aLong18 < this.aLong17) {
					this.aLong18 = this.aLong17;
				}
				if (local167 > -1L && local167 < local165) {
					@Pc(314) int local314 = (int) (local165 - local167);
					Static236.method300(arg1, (int) ((long) arg2 + local167 - this.aLong21), this.aByteArray12, (int) (local167 - this.aLong20), local314);
				}
				this.aLong21 += arg0;
			} else if (arg0 > 0) {
				if (this.aLong16 == -1L) {
					this.aLong16 = this.aLong21;
				}
				Static236.method300(arg1, arg2, this.aByteArray13, (int) (this.aLong21 - this.aLong16), arg0);
				this.aLong21 += arg0;
				if ((long) this.anInt348 < this.aLong21 - this.aLong16) {
					this.anInt348 = (int) (this.aLong21 - this.aLong16);
				}
			}
		} catch (@Pc(397) IOException local397) {
			this.aLong17 = -1L;
			throw local397;
		}
	}

	@OriginalMember(owner = "client!be", name = "d", descriptor = "(I)V")
	private void method350() throws IOException {
		if (this.aLong16 == -1L) {
			return;
		}
		if (this.aLong16 != this.aLong17) {
			this.aClass39_1.method1199(this.aLong16);
			this.aLong17 = this.aLong16;
		}
		this.aClass39_1.method1203(0, this.aByteArray13, this.anInt348);
		this.aLong17 += this.anInt348;
		if (this.aLong18 < this.aLong17) {
			this.aLong18 = this.aLong17;
		}
		@Pc(62) long local62 = -1L;
		if (this.aLong16 >= this.aLong20 && this.aLong16 < this.aLong20 + (long) this.anInt356) {
			local62 = this.aLong16;
		} else if (this.aLong20 >= this.aLong16 && this.aLong16 + (long) this.anInt348 > this.aLong20) {
			local62 = this.aLong20;
		}
		@Pc(117) long local117 = -1L;
		if (this.aLong16 + (long) this.anInt348 > this.aLong20 && (long) this.anInt348 + this.aLong16 <= this.aLong20 - -((long) this.anInt356)) {
			local117 = (long) this.anInt348 + this.aLong16;
		} else if (this.aLong16 < (long) this.anInt356 + this.aLong20 && this.aLong16 + (long) this.anInt348 >= this.aLong20 - -((long) this.anInt356)) {
			local117 = this.aLong20 + (long) this.anInt356;
		}
		if (local62 > -1L && local117 > local62) {
			@Pc(208) int local208 = (int) (local117 - local62);
			Static236.method300(this.aByteArray13, (int) (local62 - this.aLong16), this.aByteArray12, (int) (local62 - this.aLong20), local208);
		}
		this.anInt348 = 0;
		this.aLong16 = -1L;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(B)V")
	private void method351() throws IOException {
		this.anInt356 = 0;
		if (this.aLong21 != this.aLong17) {
			this.aClass39_1.method1199(this.aLong21);
			this.aLong17 = this.aLong21;
		}
		this.aLong20 = this.aLong21;
		while (this.anInt356 < this.aByteArray12.length) {
			@Pc(50) int local50 = this.aByteArray12.length - this.anInt356;
			if (local50 > 200000000) {
				local50 = 200000000;
			}
			@Pc(67) int local67 = this.aClass39_1.method1198(local50, this.aByteArray12, this.anInt356);
			if (local67 == -1) {
				break;
			}
			this.anInt356 += local67;
			this.aLong17 += local67;
		}
	}

	@OriginalMember(owner = "client!be", name = "e", descriptor = "(I)V")
	public void method352() throws IOException {
		this.method350();
		this.aClass39_1.method1200();
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "([BB)V")
	public void method353(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method355(arg0.length, arg0, 0);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(BI[BI)V")
	public void method355(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg0 > arg1.length) {
				throw new ArrayIndexOutOfBoundsException(arg0 - arg1.length);
			}
			if (this.aLong16 != -1L && this.aLong21 >= this.aLong16 && (long) this.anInt348 + this.aLong16 >= this.aLong21 + (long) arg0) {
				Static236.method300(this.aByteArray13, (int) (this.aLong21 - this.aLong16), arg1, 0, arg0);
				this.aLong21 += arg0;
				return;
			}
			@Pc(80) long local80 = this.aLong21;
			@Pc(84) int local84 = arg0;
			@Pc(121) int local121;
			if (this.aLong21 >= this.aLong20 && this.aLong21 < (long) this.anInt356 + this.aLong20) {
				local121 = (int) (this.aLong20 + (long) this.anInt356 - this.aLong21);
				if (local121 > arg0) {
					local121 = arg0;
				}
				arg0 -= local121;
				Static236.method300(this.aByteArray12, (int) (this.aLong21 - this.aLong20), arg1, 0, local121);
				this.aLong21 += local121;
				arg2 = local121;
			}
			if (arg0 > this.aByteArray12.length) {
				this.aClass39_1.method1199(this.aLong21);
				this.aLong17 = this.aLong21;
				while (arg0 > 0) {
					local121 = this.aClass39_1.method1198(arg0, arg1, arg2);
					if (local121 == -1) {
						break;
					}
					arg0 -= local121;
					this.aLong21 += local121;
					this.aLong17 += local121;
					arg2 += local121;
				}
			} else if (arg0 > 0) {
				this.method351();
				local121 = arg0;
				if (this.anInt356 < arg0) {
					local121 = this.anInt356;
				}
				arg0 -= local121;
				Static236.method300(this.aByteArray12, 0, arg1, arg2, local121);
				arg2 += local121;
				this.aLong21 += local121;
			}
			if (this.aLong16 != -1L) {
				if (this.aLong21 < this.aLong16 && arg0 > 0) {
					local121 = arg2 + (int) (this.aLong16 - this.aLong21);
					if (local121 > arg0 + arg2) {
						local121 = arg2 + arg0;
					}
					while (local121 > arg2) {
						arg0--;
						arg1[arg2++] = 0;
						this.aLong21++;
					}
				}
				@Pc(321) long local321 = -1L;
				@Pc(323) long local323 = -1L;
				if ((long) this.anInt348 + this.aLong16 > local80 && (long) local84 + local80 >= (long) this.anInt348 + this.aLong16) {
					local323 = this.aLong16 + (long) this.anInt348;
				} else if (local80 + (long) local84 > this.aLong16 && (long) this.anInt348 + this.aLong16 >= (long) local84 + local80) {
					local323 = (long) local84 + local80;
				}
				if (local80 <= this.aLong16 && this.aLong16 < local80 + (long) local84) {
					local321 = this.aLong16;
				} else if (local80 >= this.aLong16 && local80 < (long) this.anInt348 + this.aLong16) {
					local321 = local80;
				}
				if (local321 > -1L && local321 < local323) {
					@Pc(446) int local446 = (int) (local323 - local321);
					Static236.method300(this.aByteArray13, (int) (local321 - this.aLong16), arg1, (int) (local321 - local80), local446);
					if (this.aLong21 < local323) {
						arg0 = (int) ((long) arg0 + this.aLong21 - local323);
						this.aLong21 = local323;
					}
				}
			}
		} catch (@Pc(484) IOException local484) {
			this.aLong17 = -1L;
			throw local484;
		}
		if (arg0 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ZJ)V")
	public void method357(@OriginalArg(1) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method348());
		}
		this.aLong21 = arg0;
	}
}
