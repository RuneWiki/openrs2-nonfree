import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ba")
public final class Class8 {

	@OriginalMember(owner = "client!ba", name = "k", descriptor = "J")
	private long aLong8;

	@OriginalMember(owner = "client!ba", name = "m", descriptor = "I")
	private int anInt186;

	@OriginalMember(owner = "client!ba", name = "g", descriptor = "J")
	private long aLong7 = -1L;

	@OriginalMember(owner = "client!ba", name = "q", descriptor = "J")
	private long aLong9 = -1L;

	@OriginalMember(owner = "client!ba", name = "K", descriptor = "I")
	private int anInt199 = 0;

	@OriginalMember(owner = "client!ba", name = "z", descriptor = "Lclient!oe;")
	private final Class54 aClass54_1;

	@OriginalMember(owner = "client!ba", name = "u", descriptor = "J")
	private long aLong10;

	@OriginalMember(owner = "client!ba", name = "J", descriptor = "J")
	private long aLong12;

	@OriginalMember(owner = "client!ba", name = "A", descriptor = "J")
	private long aLong11;

	@OriginalMember(owner = "client!ba", name = "n", descriptor = "[B")
	private final byte[] aByteArray6;

	@OriginalMember(owner = "client!ba", name = "F", descriptor = "[B")
	private final byte[] aByteArray7;

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(Lclient!oe;II)V")
	public Class8(@OriginalArg(0) Class54 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass54_1 = arg0;
		this.aLong12 = this.aLong10 = arg0.method1584();
		this.aLong11 = 0L;
		this.aByteArray6 = new byte[arg2];
		this.aByteArray7 = new byte[arg1];
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(B[B)V")
	public void method162(@OriginalArg(1) byte[] arg0) throws IOException {
		this.method172(arg0.length, arg0, 0);
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "([BIIZ)V")
	public void method164(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if (this.aLong12 < (long) arg1 + this.aLong11) {
				this.aLong12 = (long) arg1 + this.aLong11;
			}
			if (this.aLong7 != -1L && (this.aLong11 < this.aLong7 || (long) this.anInt199 + this.aLong7 < this.aLong11)) {
				this.method170();
			}
			if (this.aLong7 != -1L && this.aLong11 + (long) arg1 > this.aLong7 + (long) this.aByteArray6.length) {
				@Pc(90) int local90 = (int) ((long) this.aByteArray6.length + this.aLong7 - this.aLong11);
				Static136.method893(arg0, arg2, this.aByteArray6, (int) (this.aLong11 - this.aLong7), local90);
				arg2 += local90;
				arg1 -= local90;
				this.aLong11 += local90;
				this.anInt199 = this.aByteArray6.length;
				this.method170();
			}
			if (arg1 > this.aByteArray6.length) {
				if (this.aLong11 != this.aLong8) {
					this.aClass54_1.method1587(this.aLong11);
					this.aLong8 = this.aLong11;
				}
				this.aClass54_1.method1588(arg2, arg0, arg1);
				this.aLong8 += arg1;
				if (this.aLong8 > this.aLong10) {
					this.aLong10 = this.aLong8;
				}
				@Pc(181) long local181 = -1L;
				if (this.aLong9 <= this.aLong11 && this.aLong11 < (long) this.anInt186 + this.aLong9) {
					local181 = this.aLong11;
				} else if (this.aLong9 >= this.aLong11 && this.aLong11 + (long) arg1 > this.aLong9) {
					local181 = this.aLong9;
				}
				@Pc(235) long local235 = -1L;
				if (this.aLong9 < this.aLong11 + (long) arg1 && this.aLong11 + (long) arg1 <= (long) this.anInt186 + this.aLong9) {
					local235 = (long) arg1 + this.aLong11;
				} else if ((long) this.anInt186 + this.aLong9 > this.aLong11 && this.aLong9 + (long) this.anInt186 <= this.aLong11 - -((long) arg1)) {
					local235 = this.aLong9 + (long) this.anInt186;
				}
				if (local181 > -1L && local235 > local181) {
					@Pc(324) int local324 = (int) (local235 - local181);
					Static136.method893(arg0, (int) (local181 + (long) arg2 - this.aLong11), this.aByteArray7, (int) (local181 - this.aLong9), local324);
				}
				this.aLong11 += arg1;
			} else if (arg1 > 0) {
				if (this.aLong7 == -1L) {
					this.aLong7 = this.aLong11;
				}
				Static136.method893(arg0, arg2, this.aByteArray6, (int) (this.aLong11 - this.aLong7), arg1);
				this.aLong11 += arg1;
				if ((long) this.anInt199 < this.aLong11 - this.aLong7) {
					this.anInt199 = (int) (this.aLong11 - this.aLong7);
				}
			}
		} catch (@Pc(404) IOException local404) {
			this.aLong8 = -1L;
			throw local404;
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IJ)V")
	public void method166(@OriginalArg(1) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method167());
		}
		this.aLong11 = arg0;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Z)Ljava/io/File;")
	private File method167() {
		return this.aClass54_1.method1583();
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)V")
	private void method168() throws IOException {
		this.anInt186 = 0;
		if (this.aLong8 != this.aLong11) {
			this.aClass54_1.method1587(this.aLong11);
			this.aLong8 = this.aLong11;
		}
		this.aLong9 = this.aLong11;
		while (this.aByteArray7.length > this.anInt186) {
			@Pc(54) int local54 = this.aClass54_1.method1585(this.aByteArray7.length - this.anInt186, this.anInt186, this.aByteArray7);
			if (local54 == -1) {
				break;
			}
			this.aLong8 += local54;
			this.anInt186 += local54;
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V")
	private void method170() throws IOException {
		if (this.aLong7 == -1L) {
			return;
		}
		@Pc(10) long local10 = -1L;
		if (this.aLong8 != this.aLong7) {
			this.aClass54_1.method1587(this.aLong7);
			this.aLong8 = this.aLong7;
		}
		this.aClass54_1.method1588(0, this.aByteArray6, this.anInt199);
		@Pc(37) long local37 = -1L;
		this.aLong8 += this.anInt199;
		if (this.aLong10 < this.aLong8) {
			this.aLong10 = this.aLong8;
		}
		if (this.aLong7 >= this.aLong9 && this.aLong7 < (long) this.anInt186 + this.aLong9) {
			local37 = this.aLong7;
		} else if (this.aLong7 <= this.aLong9 && this.aLong9 < this.aLong7 + (long) this.anInt199) {
			local37 = this.aLong9;
		}
		if ((long) this.anInt199 + this.aLong7 > this.aLong9 && this.aLong7 + (long) this.anInt199 <= this.aLong9 + (long) this.anInt186) {
			local10 = (long) this.anInt199 + this.aLong7;
		} else if ((long) this.anInt186 + this.aLong9 > this.aLong7 && (long) this.anInt199 + this.aLong7 >= (long) this.anInt186 + this.aLong9) {
			local10 = this.aLong9 + (long) this.anInt186;
		}
		if (local37 > -1L && local37 < local10) {
			@Pc(192) int local192 = (int) (local10 - local37);
			Static136.method893(this.aByteArray6, (int) (local37 - this.aLong7), this.aByteArray7, (int) (local37 - this.aLong9), local192);
		}
		this.anInt199 = 0;
		this.aLong7 = -1L;
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)J")
	public long method171() {
		return this.aLong12;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(I[BII)V")
	public void method172(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg0 > arg1.length) {
				throw new ArrayIndexOutOfBoundsException(arg0 - arg1.length);
			}
			if (this.aLong7 != -1L && this.aLong7 <= this.aLong11 && (long) arg0 + this.aLong11 <= this.aLong7 - -((long) this.anInt199)) {
				Static136.method893(this.aByteArray6, (int) (this.aLong11 - this.aLong7), arg1, 0, arg0);
				this.aLong11 += arg0;
				return;
			}
			@Pc(78) long local78 = this.aLong11;
			@Pc(80) int local80 = arg0;
			@Pc(113) int local113;
			if (this.aLong11 >= this.aLong9 && this.aLong9 + (long) this.anInt186 > this.aLong11) {
				local113 = (int) (this.aLong9 + (long) this.anInt186 - this.aLong11);
				if (arg0 < local113) {
					local113 = arg0;
				}
				arg0 -= local113;
				Static136.method893(this.aByteArray7, (int) (this.aLong11 - this.aLong9), arg1, 0, local113);
				this.aLong11 += local113;
				arg2 = local113;
			}
			if (this.aByteArray7.length < arg0) {
				this.aClass54_1.method1587(this.aLong11);
				this.aLong8 = this.aLong11;
				while (arg0 > 0) {
					local113 = this.aClass54_1.method1585(arg0, arg2, arg1);
					if (local113 == -1) {
						break;
					}
					arg0 -= local113;
					arg2 += local113;
					this.aLong11 += local113;
					this.aLong8 += local113;
				}
			} else if (arg0 > 0) {
				this.method168();
				local113 = arg0;
				if (this.anInt186 < arg0) {
					local113 = this.anInt186;
				}
				arg0 -= local113;
				Static136.method893(this.aByteArray7, 0, arg1, arg2, local113);
				arg2 += local113;
				this.aLong11 += local113;
			}
			if (this.aLong7 != -1L) {
				if (this.aLong7 > this.aLong11 && arg0 > 0) {
					local113 = arg2 + (int) (this.aLong7 - this.aLong11);
					if (local113 > arg0 + arg2) {
						local113 = arg0 + arg2;
					}
					while (arg2 < local113) {
						arg0--;
						arg1[arg2++] = 0;
						this.aLong11++;
					}
				}
				@Pc(306) long local306 = -1L;
				@Pc(308) long local308 = -1L;
				if (this.aLong7 >= local78 && this.aLong7 < (long) local80 + local78) {
					local306 = this.aLong7;
				} else if (this.aLong7 <= local78 && this.aLong7 + (long) this.anInt199 > local78) {
					local306 = local78;
				}
				if (this.aLong7 + (long) this.anInt199 > local78 && (long) this.anInt199 + this.aLong7 <= (long) local80 + local78) {
					local308 = this.aLong7 + (long) this.anInt199;
				} else if (local78 + (long) local80 > this.aLong7 && local78 + (long) local80 <= (long) this.anInt199 + this.aLong7) {
					local308 = (long) local80 + local78;
				}
				if (local306 > -1L && local306 < local308) {
					@Pc(429) int local429 = (int) (local308 - local306);
					Static136.method893(this.aByteArray6, (int) (local306 - this.aLong7), arg1, (int) (local306 - local78), local429);
					if (this.aLong11 < local308) {
						arg0 = (int) ((long) arg0 + this.aLong11 - local308);
						this.aLong11 = local308;
					}
				}
			}
		} catch (@Pc(471) IOException local471) {
			this.aLong8 = -1L;
			throw local471;
		}
		if (arg0 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "(I)V")
	public void method173() throws IOException {
		this.method170();
		this.aClass54_1.method1586();
	}
}
