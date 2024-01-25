import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bg")
public final class Class20 {

	@OriginalMember(owner = "client!bg", name = "f", descriptor = "J")
	private long aLong13;

	@OriginalMember(owner = "client!bg", name = "q", descriptor = "I")
	private int anInt412;

	@OriginalMember(owner = "client!bg", name = "g", descriptor = "J")
	private long aLong14 = -1L;

	@OriginalMember(owner = "client!bg", name = "h", descriptor = "I")
	private int anInt407 = 0;

	@OriginalMember(owner = "client!bg", name = "p", descriptor = "J")
	private long aLong16 = -1L;

	@OriginalMember(owner = "client!bg", name = "m", descriptor = "Lclient!sb;")
	private final Class202 aClass202_1;

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "J")
	private long aLong12;

	@OriginalMember(owner = "client!bg", name = "r", descriptor = "J")
	private long aLong17;

	@OriginalMember(owner = "client!bg", name = "k", descriptor = "[B")
	private final byte[] aByteArray14;

	@OriginalMember(owner = "client!bg", name = "d", descriptor = "[B")
	private final byte[] aByteArray13;

	@OriginalMember(owner = "client!bg", name = "l", descriptor = "J")
	private long aLong15;

	@OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(Lclient!sb;II)V")
	public Class20(@OriginalArg(0) Class202 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass202_1 = arg0;
		this.aLong17 = this.aLong12 = arg0.method4941();
		this.aByteArray14 = new byte[arg1];
		this.aByteArray13 = new byte[arg2];
		this.aLong15 = 0L;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IJ)V")
	public void method491(@OriginalArg(1) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method498());
		}
		this.aLong15 = arg0;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(I[B)V")
	public void method492(@OriginalArg(1) byte[] arg0) throws IOException {
		this.method497(arg0.length, arg0, 0);
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V")
	private void method493() throws IOException {
		this.anInt412 = 0;
		if (this.aLong13 != this.aLong15) {
			this.aClass202_1.method4939(this.aLong15);
			this.aLong13 = this.aLong15;
		}
		this.aLong16 = this.aLong15;
		while (this.aByteArray14.length > this.anInt412) {
			@Pc(49) int local49 = this.aByteArray14.length - this.anInt412;
			if (local49 > 200000000) {
				local49 = 200000000;
			}
			@Pc(66) int local66 = this.aClass202_1.method4942(local49, this.anInt412, this.aByteArray14);
			if (local66 == -1) {
				break;
			}
			this.anInt412 += local66;
			this.aLong13 += local66;
		}
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)V")
	private void method494() throws IOException {
		if (this.aLong14 == -1L) {
			return;
		}
		if (this.aLong13 != this.aLong14) {
			this.aClass202_1.method4939(this.aLong14);
			this.aLong13 = this.aLong14;
		}
		this.aClass202_1.method4944(0, this.aByteArray13, this.anInt407);
		this.aLong13 += this.anInt407;
		if (this.aLong13 > this.aLong12) {
			this.aLong12 = this.aLong13;
		}
		@Pc(64) long local64 = -1L;
		if (this.aLong14 >= this.aLong16 && (long) this.anInt412 + this.aLong16 > this.aLong14) {
			local64 = this.aLong14;
		} else if (this.aLong14 <= this.aLong16 && this.aLong16 < (long) this.anInt407 + this.aLong14) {
			local64 = this.aLong16;
		}
		@Pc(110) long local110 = -1L;
		if (this.aLong14 + (long) this.anInt407 > this.aLong16 && (long) this.anInt412 + this.aLong16 >= this.aLong14 + (long) this.anInt407) {
			local110 = this.aLong14 + (long) this.anInt407;
		} else if (this.aLong14 < this.aLong16 + (long) this.anInt412 && this.aLong14 + (long) this.anInt407 >= (long) this.anInt412 + this.aLong16) {
			local110 = this.aLong16 + (long) this.anInt412;
		}
		if (local64 > -1L && local110 > local64) {
			@Pc(197) int local197 = (int) (local110 - local64);
			Static406.method5656(this.aByteArray13, (int) (local64 - this.aLong14), this.aByteArray14, (int) (local64 - this.aLong16), local197);
		}
		this.anInt407 = 0;
		this.aLong14 = -1L;
	}

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "(I)J")
	public long method496() {
		return this.aLong17;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(II[BI)V")
	public void method497(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg1.length < arg0) {
				throw new ArrayIndexOutOfBoundsException(arg0 - arg1.length);
			}
			if (this.aLong14 != -1L && this.aLong14 <= this.aLong15 && this.aLong14 + (long) this.anInt407 >= this.aLong15 - -((long) arg0)) {
				Static406.method5656(this.aByteArray13, (int) (this.aLong15 - this.aLong14), arg1, 0, arg0);
				this.aLong15 += arg0;
				return;
			}
			@Pc(79) long local79 = this.aLong15;
			@Pc(83) int local83 = arg0;
			@Pc(112) int local112;
			if (this.aLong15 >= this.aLong16 && this.aLong16 + (long) this.anInt412 > this.aLong15) {
				local112 = (int) ((long) this.anInt412 + this.aLong16 - this.aLong15);
				if (arg0 < local112) {
					local112 = arg0;
				}
				Static406.method5656(this.aByteArray14, (int) (this.aLong15 - this.aLong16), arg1, 0, local112);
				this.aLong15 += local112;
				arg2 = local112;
				arg0 -= local112;
			}
			if (this.aByteArray14.length < arg0) {
				this.aClass202_1.method4939(this.aLong15);
				this.aLong13 = this.aLong15;
				while (arg0 > 0) {
					local112 = this.aClass202_1.method4942(arg0, arg2, arg1);
					if (local112 == -1) {
						break;
					}
					this.aLong15 += local112;
					arg2 += local112;
					arg0 -= local112;
					this.aLong13 += local112;
				}
			} else if (arg0 > 0) {
				this.method493();
				local112 = arg0;
				if (this.anInt412 < arg0) {
					local112 = this.anInt412;
				}
				Static406.method5656(this.aByteArray14, 0, arg1, arg2, local112);
				arg2 += local112;
				this.aLong15 += local112;
				arg0 -= local112;
			}
			if (this.aLong14 != -1L) {
				if (this.aLong14 > this.aLong15 && arg0 > 0) {
					local112 = (int) (this.aLong14 - this.aLong15) + arg2;
					if (arg0 + arg2 < local112) {
						local112 = arg2 + arg0;
					}
					while (arg2 < local112) {
						arg0--;
						arg1[arg2++] = 0;
						this.aLong15++;
					}
				}
				@Pc(311) long local311 = -1L;
				@Pc(313) long local313 = -1L;
				if (this.aLong14 >= local79 && local79 + (long) local83 > this.aLong14) {
					local311 = this.aLong14;
				} else if (local79 >= this.aLong14 && local79 < (long) this.anInt407 + this.aLong14) {
					local311 = local79;
				}
				if ((long) this.anInt407 + this.aLong14 > local79 && this.aLong14 + (long) this.anInt407 <= (long) local83 + local79) {
					local313 = this.aLong14 + (long) this.anInt407;
				} else if (local79 + (long) local83 > this.aLong14 && local79 + (long) local83 <= this.aLong14 + (long) this.anInt407) {
					local313 = (long) local83 + local79;
				}
				if (local311 > -1L && local313 > local311) {
					@Pc(441) int local441 = (int) (local313 - local311);
					Static406.method5656(this.aByteArray13, (int) (local311 - this.aLong14), arg1, (int) (local311 - local79), local441);
					if (this.aLong15 < local313) {
						arg0 = (int) ((long) arg0 + this.aLong15 - local313);
						this.aLong15 = local313;
					}
				}
			}
		} catch (@Pc(483) IOException local483) {
			this.aLong13 = -1L;
			throw local483;
		}
		if (arg0 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)Ljava/io/File;")
	private File method498() {
		return this.aClass202_1.method4943();
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(BI[BI)V")
	public void method500(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (this.aLong15 + (long) arg0 > this.aLong17) {
				this.aLong17 = this.aLong15 + (long) arg0;
			}
			if (this.aLong14 != -1L && (this.aLong14 > this.aLong15 || this.aLong15 > this.aLong14 + (long) this.anInt407)) {
				this.method494();
			}
			if (this.aLong14 != -1L && this.aLong14 + (long) this.aByteArray13.length < (long) arg0 + this.aLong15) {
				@Pc(101) int local101 = (int) ((long) this.aByteArray13.length + this.aLong14 - this.aLong15);
				Static406.method5656(arg1, arg2, this.aByteArray13, (int) (this.aLong15 - this.aLong14), local101);
				this.aLong15 += local101;
				arg2 += local101;
				arg0 -= local101;
				this.anInt407 = this.aByteArray13.length;
				this.method494();
			}
			if (arg0 > this.aByteArray13.length) {
				if (this.aLong15 != this.aLong13) {
					this.aClass202_1.method4939(this.aLong15);
					this.aLong13 = this.aLong15;
				}
				this.aClass202_1.method4944(arg2, arg1, arg0);
				this.aLong13 += arg0;
				if (this.aLong12 < this.aLong13) {
					this.aLong12 = this.aLong13;
				}
				@Pc(195) long local195 = -1L;
				if (this.aLong16 <= this.aLong15 && this.aLong15 < (long) this.anInt412 + this.aLong16) {
					local195 = this.aLong15;
				} else if (this.aLong15 <= this.aLong16 && (long) arg0 + this.aLong15 > this.aLong16) {
					local195 = this.aLong16;
				}
				@Pc(248) long local248 = -1L;
				if (this.aLong16 < this.aLong15 + (long) arg0 && this.aLong16 + (long) this.anInt412 >= this.aLong15 - -((long) arg0)) {
					local248 = (long) arg0 + this.aLong15;
				} else if (this.aLong15 < (long) this.anInt412 + this.aLong16 && (long) this.anInt412 + this.aLong16 <= (long) arg0 + this.aLong15) {
					local248 = (long) this.anInt412 + this.aLong16;
				}
				if (local195 > -1L && local195 < local248) {
					@Pc(338) int local338 = (int) (local248 - local195);
					Static406.method5656(arg1, (int) ((long) arg2 + local195 - this.aLong15), this.aByteArray14, (int) (local195 - this.aLong16), local338);
				}
				this.aLong15 += arg0;
			} else if (arg0 > 0) {
				if (this.aLong14 == -1L) {
					this.aLong14 = this.aLong15;
				}
				Static406.method5656(arg1, arg2, this.aByteArray13, (int) (this.aLong15 - this.aLong14), arg0);
				this.aLong15 += arg0;
				if ((long) this.anInt407 < this.aLong15 - this.aLong14) {
					this.anInt407 = (int) (this.aLong15 - this.aLong14);
				}
			}
		} catch (@Pc(419) IOException local419) {
			this.aLong13 = -1L;
			throw local419;
		}
	}
}
