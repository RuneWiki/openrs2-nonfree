import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!al")
public final class Class10 {

	@OriginalMember(owner = "client!al", name = "l", descriptor = "I")
	private int anInt204;

	@OriginalMember(owner = "client!al", name = "r", descriptor = "J")
	private long aLong14;

	@OriginalMember(owner = "client!al", name = "w", descriptor = "J")
	private long aLong16 = -1L;

	@OriginalMember(owner = "client!al", name = "t", descriptor = "I")
	private int anInt207 = 0;

	@OriginalMember(owner = "client!al", name = "y", descriptor = "J")
	private long aLong17 = -1L;

	@OriginalMember(owner = "client!al", name = "a", descriptor = "Lclient!vn;")
	private final Class209 aClass209_1;

	@OriginalMember(owner = "client!al", name = "s", descriptor = "J")
	private long aLong15;

	@OriginalMember(owner = "client!al", name = "b", descriptor = "J")
	private long aLong12;

	@OriginalMember(owner = "client!al", name = "q", descriptor = "[B")
	private final byte[] aByteArray1;

	@OriginalMember(owner = "client!al", name = "x", descriptor = "[B")
	private final byte[] aByteArray2;

	@OriginalMember(owner = "client!al", name = "p", descriptor = "J")
	private long aLong13;

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lclient!vn;II)V")
	public Class10(@OriginalArg(0) Class209 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass209_1 = arg0;
		this.aLong12 = this.aLong15 = arg0.method5629();
		this.aByteArray1 = new byte[arg1];
		this.aByteArray2 = new byte[arg2];
		this.aLong13 = 0L;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(I)J")
	public long method172() {
		return this.aLong12;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(ZII[B)V")
	public void method174(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if (this.aLong12 < this.aLong13 + (long) arg1) {
				this.aLong12 = this.aLong13 + (long) arg1;
			}
			if (this.aLong17 != -1L && (this.aLong13 < this.aLong17 || this.aLong13 > this.aLong17 + (long) this.anInt207)) {
				this.method182();
			}
			if (this.aLong17 != -1L && this.aLong13 + (long) arg1 > (long) this.aByteArray2.length + this.aLong17) {
				@Pc(86) int local86 = (int) (this.aLong17 + (long) this.aByteArray2.length - this.aLong13);
				Static369.method2582(arg2, arg0, this.aByteArray2, (int) (this.aLong13 - this.aLong17), local86);
				arg1 -= local86;
				this.aLong13 += local86;
				arg0 += local86;
				this.anInt207 = this.aByteArray2.length;
				this.method182();
			}
			if (this.aByteArray2.length < arg1) {
				if (this.aLong13 != this.aLong14) {
					this.aClass209_1.method5630(this.aLong13);
					this.aLong14 = this.aLong13;
				}
				this.aClass209_1.method5625(arg1, arg2, arg0);
				this.aLong14 += arg1;
				if (this.aLong15 < this.aLong14) {
					this.aLong15 = this.aLong14;
				}
				@Pc(173) long local173 = -1L;
				@Pc(175) long local175 = -1L;
				if (this.aLong13 >= this.aLong16 && (long) this.anInt204 + this.aLong16 > this.aLong13) {
					local173 = this.aLong13;
				} else if (this.aLong16 >= this.aLong13 && (long) arg1 + this.aLong13 > this.aLong16) {
					local173 = this.aLong16;
				}
				if (this.aLong16 < (long) arg1 + this.aLong13 && this.aLong13 + (long) arg1 <= this.aLong16 + (long) this.anInt204) {
					local175 = (long) arg1 + this.aLong13;
				} else if (this.aLong13 < this.aLong16 + (long) this.anInt204 && (long) arg1 + this.aLong13 >= (long) this.anInt204 + this.aLong16) {
					local175 = (long) this.anInt204 + this.aLong16;
				}
				if (local173 > -1L && local175 > local173) {
					@Pc(316) int local316 = (int) (local175 - local173);
					Static369.method2582(arg2, (int) ((long) arg0 + local173 - this.aLong13), this.aByteArray1, (int) (local173 - this.aLong16), local316);
				}
				this.aLong13 += arg1;
			} else if (arg1 > 0) {
				if (this.aLong17 == -1L) {
					this.aLong17 = this.aLong13;
				}
				Static369.method2582(arg2, arg0, this.aByteArray2, (int) (this.aLong13 - this.aLong17), arg1);
				this.aLong13 += arg1;
				if (this.aLong13 - this.aLong17 > (long) this.anInt207) {
					this.anInt207 = (int) (this.aLong13 - this.aLong17);
				}
			}
		} catch (@Pc(404) IOException local404) {
			this.aLong14 = -1L;
			throw local404;
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IZ[BI)V")
	public void method178(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg1.length < arg2) {
				throw new ArrayIndexOutOfBoundsException(arg2 - arg1.length);
			}
			if (this.aLong17 != -1L && this.aLong13 >= this.aLong17 && (long) arg2 + this.aLong13 <= (long) this.anInt207 + this.aLong17) {
				Static369.method2582(this.aByteArray2, (int) (this.aLong13 - this.aLong17), arg1, 0, arg2);
				this.aLong13 += arg2;
				return;
			}
			@Pc(87) long local87 = this.aLong13;
			@Pc(91) int local91 = arg2;
			@Pc(120) int local120;
			if (this.aLong13 >= this.aLong16 && this.aLong16 + (long) this.anInt204 > this.aLong13) {
				local120 = (int) ((long) this.anInt204 + this.aLong16 - this.aLong13);
				if (local120 > arg2) {
					local120 = arg2;
				}
				Static369.method2582(this.aByteArray1, (int) (this.aLong13 - this.aLong16), arg1, 0, local120);
				arg0 = local120;
				this.aLong13 += local120;
				arg2 -= local120;
			}
			if (arg2 > this.aByteArray1.length) {
				this.aClass209_1.method5630(this.aLong13);
				this.aLong14 = this.aLong13;
				while (arg2 > 0) {
					local120 = this.aClass209_1.method5627(arg1, arg0, arg2);
					if (local120 == -1) {
						break;
					}
					arg2 -= local120;
					this.aLong13 += local120;
					this.aLong14 += local120;
					arg0 += local120;
				}
			} else if (arg2 > 0) {
				this.method186();
				local120 = arg2;
				if (arg2 > this.anInt204) {
					local120 = this.anInt204;
				}
				Static369.method2582(this.aByteArray1, 0, arg1, arg0, local120);
				this.aLong13 += local120;
				arg0 += local120;
				arg2 -= local120;
			}
			if (this.aLong17 != -1L) {
				if (this.aLong17 > this.aLong13 && arg2 > 0) {
					local120 = arg0 + (int) (this.aLong17 - this.aLong13);
					if (local120 > arg2 + arg0) {
						local120 = arg2 + arg0;
					}
					while (local120 > arg0) {
						arg1[arg0++] = 0;
						arg2--;
						this.aLong13++;
					}
				}
				@Pc(300) long local300 = -1L;
				@Pc(302) long local302 = -1L;
				if (this.aLong17 >= local87 && this.aLong17 < (long) local91 + local87) {
					local300 = this.aLong17;
				} else if (local87 >= this.aLong17 && local87 < this.aLong17 + (long) this.anInt207) {
					local300 = local87;
				}
				if (local87 < (long) this.anInt207 + this.aLong17 && (long) local91 + local87 >= (long) this.anInt207 + this.aLong17) {
					local302 = (long) this.anInt207 + this.aLong17;
				} else if (this.aLong17 < (long) local91 + local87 && (long) this.anInt207 + this.aLong17 >= local87 + (long) local91) {
					local302 = (long) local91 + local87;
				}
				if (local300 > -1L && local300 < local302) {
					@Pc(420) int local420 = (int) (local302 - local300);
					Static369.method2582(this.aByteArray2, (int) (local300 - this.aLong17), arg1, (int) (local300 - local87), local420);
					if (local302 > this.aLong13) {
						arg2 = (int) ((long) arg2 + this.aLong13 - local302);
						this.aLong13 = local302;
					}
				}
			}
		} catch (@Pc(458) IOException local458) {
			this.aLong14 = -1L;
			throw local458;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(B)V")
	private void method182() throws IOException {
		if (this.aLong17 == -1L) {
			return;
		}
		if (this.aLong17 != this.aLong14) {
			this.aClass209_1.method5630(this.aLong17);
			this.aLong14 = this.aLong17;
		}
		this.aClass209_1.method5625(this.anInt207, this.aByteArray2, 0);
		this.aLong14 += this.anInt207;
		if (this.aLong15 < this.aLong14) {
			this.aLong15 = this.aLong14;
		}
		@Pc(69) long local69 = -1L;
		@Pc(71) long local71 = -1L;
		if (this.aLong16 <= this.aLong17 && this.aLong17 < this.aLong16 + (long) this.anInt204) {
			local69 = this.aLong17;
		} else if (this.aLong17 <= this.aLong16 && (long) this.anInt207 + this.aLong17 > this.aLong16) {
			local69 = this.aLong16;
		}
		if (this.aLong16 < this.aLong17 + (long) this.anInt207 && this.aLong16 + (long) this.anInt204 >= this.aLong17 - -((long) this.anInt207)) {
			local71 = (long) this.anInt207 + this.aLong17;
		} else if (this.aLong17 < this.aLong16 + (long) this.anInt204 && (long) this.anInt204 + this.aLong16 <= (long) this.anInt207 + this.aLong17) {
			local71 = this.aLong16 + (long) this.anInt204;
		}
		if (local69 > -1L && local69 < local71) {
			@Pc(211) int local211 = (int) (local71 - local69);
			Static369.method2582(this.aByteArray2, (int) (local69 - this.aLong17), this.aByteArray1, (int) (local69 - this.aLong16), local211);
		}
		this.anInt207 = 0;
		this.aLong17 = -1L;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "([BI)V")
	public void method183(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method178(0, arg0, arg0.length);
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(JB)V")
	public void method184(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method185());
		}
		this.aLong13 = arg0;
	}

	@OriginalMember(owner = "client!al", name = "b", descriptor = "(B)Ljava/io/File;")
	private File method185() {
		return this.aClass209_1.method5626();
	}

	@OriginalMember(owner = "client!al", name = "f", descriptor = "(I)V")
	private void method186() throws IOException {
		this.anInt204 = 0;
		if (this.aLong14 != this.aLong13) {
			this.aClass209_1.method5630(this.aLong13);
			this.aLong14 = this.aLong13;
		}
		this.aLong16 = this.aLong13;
		while (this.aByteArray1.length > this.anInt204) {
			@Pc(42) int local42 = this.aByteArray1.length - this.anInt204;
			if (local42 > 200000000) {
				local42 = 200000000;
			}
			@Pc(57) int local57 = this.aClass209_1.method5627(this.aByteArray1, this.anInt204, local42);
			if (local57 == -1) {
				break;
			}
			this.aLong14 += local57;
			this.anInt204 += local57;
		}
	}
}
