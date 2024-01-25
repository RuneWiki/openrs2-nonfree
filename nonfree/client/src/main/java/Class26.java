import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bo")
public final class Class26 {

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "I")
	private int anInt722;

	@OriginalMember(owner = "client!bo", name = "j", descriptor = "J")
	private long aLong31;

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "J")
	private long aLong27 = -1L;

	@OriginalMember(owner = "client!bo", name = "c", descriptor = "J")
	private long aLong28 = -1L;

	@OriginalMember(owner = "client!bo", name = "i", descriptor = "I")
	private int anInt726 = 0;

	@OriginalMember(owner = "client!bo", name = "m", descriptor = "Lclient!sh;")
	private final Class222 aClass222_1;

	@OriginalMember(owner = "client!bo", name = "d", descriptor = "J")
	private long aLong29;

	@OriginalMember(owner = "client!bo", name = "e", descriptor = "J")
	private long aLong30;

	@OriginalMember(owner = "client!bo", name = "u", descriptor = "[B")
	private final byte[] aByteArray21;

	@OriginalMember(owner = "client!bo", name = "p", descriptor = "J")
	private long aLong32;

	@OriginalMember(owner = "client!bo", name = "k", descriptor = "[B")
	private final byte[] aByteArray20;

	@OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(Lclient!sh;II)V")
	public Class26(@OriginalArg(0) Class222 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass222_1 = arg0;
		this.aLong30 = this.aLong29 = arg0.method4984();
		this.aByteArray21 = new byte[arg2];
		this.aLong32 = 0L;
		this.aByteArray20 = new byte[arg1];
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(B)J")
	public long method663() {
		return this.aLong30;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)V")
	private void method664() throws IOException {
		if (this.aLong28 == -1L) {
			return;
		}
		if (this.aLong31 != this.aLong28) {
			this.aClass222_1.method4987(this.aLong28);
			this.aLong31 = this.aLong28;
		}
		this.aClass222_1.method4986(this.anInt726, this.aByteArray21, 0);
		this.aLong31 += this.anInt726;
		if (this.aLong31 > this.aLong29) {
			this.aLong29 = this.aLong31;
		}
		@Pc(68) long local68 = -1L;
		if (this.aLong27 <= this.aLong28 && (long) this.anInt722 + this.aLong27 > this.aLong28) {
			local68 = this.aLong28;
		} else if (this.aLong28 <= this.aLong27 && this.aLong28 + (long) this.anInt726 > this.aLong27) {
			local68 = this.aLong27;
		}
		@Pc(119) long local119 = -1L;
		if ((long) this.anInt726 + this.aLong28 > this.aLong27 && (long) this.anInt722 + this.aLong27 >= this.aLong28 - -((long) this.anInt726)) {
			local119 = (long) this.anInt726 + this.aLong28;
		} else if ((long) this.anInt722 + this.aLong27 > this.aLong28 && this.aLong27 + (long) this.anInt722 <= this.aLong28 + (long) this.anInt726) {
			local119 = this.aLong27 + (long) this.anInt722;
		}
		if (local68 > -1L && local119 > local68) {
			@Pc(212) int local212 = (int) (local119 - local68);
			Static468.method4329(this.aByteArray21, (int) (local68 - this.aLong28), this.aByteArray20, (int) (local68 - this.aLong27), local212);
		}
		this.anInt726 = 0;
		this.aLong28 = -1L;
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(I)Ljava/io/File;")
	private File method665() {
		return this.aClass222_1.method4985();
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(II[BI)V")
	public void method667(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg1.length < arg2) {
				throw new ArrayIndexOutOfBoundsException(arg2 - arg1.length);
			}
			if (this.aLong28 != -1L && this.aLong28 <= this.aLong32 && this.aLong28 + (long) this.anInt726 >= (long) arg2 + this.aLong32) {
				Static468.method4329(this.aByteArray21, (int) (this.aLong32 - this.aLong28), arg1, 0, arg2);
				this.aLong32 += arg2;
				return;
			}
			@Pc(79) long local79 = this.aLong32;
			@Pc(88) int local88 = arg2;
			@Pc(116) int local116;
			if (this.aLong27 <= this.aLong32 && (long) this.anInt722 + this.aLong27 > this.aLong32) {
				local116 = (int) ((long) this.anInt722 + this.aLong27 - this.aLong32);
				if (local116 > arg2) {
					local116 = arg2;
				}
				Static468.method4329(this.aByteArray20, (int) (this.aLong32 - this.aLong27), arg1, 0, local116);
				arg2 -= local116;
				this.aLong32 += local116;
				arg0 = local116;
			}
			if (this.aByteArray20.length < arg2) {
				this.aClass222_1.method4987(this.aLong32);
				this.aLong31 = this.aLong32;
				while (arg2 > 0) {
					local116 = this.aClass222_1.method4983(arg0, arg1, arg2);
					if (local116 == -1) {
						break;
					}
					arg2 -= local116;
					this.aLong31 += local116;
					arg0 += local116;
					this.aLong32 += local116;
				}
			} else if (arg2 > 0) {
				this.method670();
				local116 = arg2;
				if (arg2 > this.anInt722) {
					local116 = this.anInt722;
				}
				Static468.method4329(this.aByteArray20, 0, arg1, arg0, local116);
				this.aLong32 += local116;
				arg0 += local116;
				arg2 -= local116;
			}
			if (this.aLong28 != -1L) {
				if (this.aLong28 > this.aLong32 && arg2 > 0) {
					local116 = arg0 + (int) (this.aLong28 - this.aLong32);
					if (local116 > arg2 + arg0) {
						local116 = arg2 + arg0;
					}
					while (arg0 < local116) {
						arg2--;
						arg1[arg0++] = 0;
						this.aLong32++;
					}
				}
				@Pc(303) long local303 = -1L;
				@Pc(305) long local305 = -1L;
				if (this.aLong28 >= local79 && this.aLong28 < (long) local88 + local79) {
					local303 = this.aLong28;
				} else if (local79 >= this.aLong28 && local79 < this.aLong28 + (long) this.anInt726) {
					local303 = local79;
				}
				if (local79 < (long) this.anInt726 + this.aLong28 && (long) this.anInt726 + this.aLong28 <= local79 + (long) local88) {
					local305 = (long) this.anInt726 + this.aLong28;
				} else if ((long) local88 + local79 > this.aLong28 && (long) this.anInt726 + this.aLong28 >= local79 + (long) local88) {
					local305 = local79 + (long) local88;
				}
				if (local303 > -1L && local305 > local303) {
					@Pc(424) int local424 = (int) (local305 - local303);
					Static468.method4329(this.aByteArray21, (int) (local303 - this.aLong28), arg1, (int) (local303 - local79), local424);
					if (local305 > this.aLong32) {
						arg2 = (int) ((long) arg2 + this.aLong32 - local305);
						this.aLong32 = local305;
					}
				}
			}
		} catch (@Pc(461) IOException local461) {
			this.aLong31 = -1L;
			throw local461;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(I[BIB)V")
	public void method668(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if ((long) arg2 + this.aLong32 > this.aLong30) {
				this.aLong30 = this.aLong32 + (long) arg2;
			}
			if (this.aLong28 != -1L && (this.aLong28 > this.aLong32 || this.aLong32 > (long) this.anInt726 + this.aLong28)) {
				this.method664();
			}
			if (this.aLong28 != -1L && (long) arg2 + this.aLong32 > (long) this.aByteArray21.length + this.aLong28) {
				@Pc(95) int local95 = (int) (this.aLong28 + (long) this.aByteArray21.length - this.aLong32);
				Static468.method4329(arg1, arg0, this.aByteArray21, (int) (this.aLong32 - this.aLong28), local95);
				arg0 += local95;
				arg2 -= local95;
				this.aLong32 += local95;
				this.anInt726 = this.aByteArray21.length;
				this.method664();
			}
			if (this.aByteArray21.length < arg2) {
				if (this.aLong31 != this.aLong32) {
					this.aClass222_1.method4987(this.aLong32);
					this.aLong31 = this.aLong32;
				}
				this.aClass222_1.method4986(arg2, arg1, arg0);
				this.aLong31 += arg2;
				if (this.aLong29 < this.aLong31) {
					this.aLong29 = this.aLong31;
				}
				@Pc(186) long local186 = -1L;
				if (this.aLong32 >= this.aLong27 && (long) this.anInt722 + this.aLong27 > this.aLong32) {
					local186 = this.aLong32;
				} else if (this.aLong32 <= this.aLong27 && this.aLong32 + (long) arg2 > this.aLong27) {
					local186 = this.aLong27;
				}
				@Pc(240) long local240 = -1L;
				if (this.aLong27 < (long) arg2 + this.aLong32 && (long) arg2 + this.aLong32 <= (long) this.anInt722 + this.aLong27) {
					local240 = (long) arg2 + this.aLong32;
				} else if (this.aLong27 + (long) this.anInt722 > this.aLong32 && (long) arg2 + this.aLong32 >= this.aLong27 - -((long) this.anInt722)) {
					local240 = this.aLong27 + (long) this.anInt722;
				}
				if (local186 > -1L && local240 > local186) {
					@Pc(324) int local324 = (int) (local240 - local186);
					Static468.method4329(arg1, (int) ((long) arg0 + local186 - this.aLong32), this.aByteArray20, (int) (local186 - this.aLong27), local324);
				}
				this.aLong32 += arg2;
			} else if (arg2 > 0) {
				if (this.aLong28 == -1L) {
					this.aLong28 = this.aLong32;
				}
				Static468.method4329(arg1, arg0, this.aByteArray21, (int) (this.aLong32 - this.aLong28), arg2);
				this.aLong32 += arg2;
				if (this.aLong32 - this.aLong28 > (long) this.anInt726) {
					this.anInt726 = (int) (this.aLong32 - this.aLong28);
				}
			}
		} catch (@Pc(408) IOException local408) {
			this.aLong31 = -1L;
			throw local408;
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IJ)V")
	public void method669(@OriginalArg(1) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method665());
		}
		this.aLong32 = arg0;
	}

	@OriginalMember(owner = "client!bo", name = "d", descriptor = "(I)V")
	private void method670() throws IOException {
		this.anInt722 = 0;
		if (this.aLong32 != this.aLong31) {
			this.aClass222_1.method4987(this.aLong32);
			this.aLong31 = this.aLong32;
		}
		this.aLong27 = this.aLong32;
		while (this.anInt722 < this.aByteArray20.length) {
			@Pc(45) int local45 = this.aByteArray20.length - this.anInt722;
			if (local45 > 200000000) {
				local45 = 200000000;
			}
			@Pc(62) int local62 = this.aClass222_1.method4983(this.anInt722, this.aByteArray20, local45);
			if (local62 == -1) {
				break;
			}
			this.aLong31 += local62;
			this.anInt722 += local62;
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "([BI)V")
	public void method671(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method667(0, arg0, arg0.length);
	}
}
