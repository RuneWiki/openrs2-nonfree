import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ah")
public final class Class9 {

	@OriginalMember(owner = "client!ah", name = "g", descriptor = "I")
	private int anInt367;

	@OriginalMember(owner = "client!ah", name = "k", descriptor = "J")
	private long aLong14;

	@OriginalMember(owner = "client!ah", name = "d", descriptor = "J")
	private long aLong12 = -1L;

	@OriginalMember(owner = "client!ah", name = "p", descriptor = "I")
	private int anInt371 = 0;

	@OriginalMember(owner = "client!ah", name = "x", descriptor = "J")
	private long aLong17 = -1L;

	@OriginalMember(owner = "client!ah", name = "z", descriptor = "Lclient!hr;")
	private final Class148 aClass148_1;

	@OriginalMember(owner = "client!ah", name = "o", descriptor = "J")
	private long aLong16;

	@OriginalMember(owner = "client!ah", name = "i", descriptor = "J")
	private long aLong13;

	@OriginalMember(owner = "client!ah", name = "l", descriptor = "J")
	private long aLong15;

	@OriginalMember(owner = "client!ah", name = "w", descriptor = "[B")
	private final byte[] aByteArray3;

	@OriginalMember(owner = "client!ah", name = "j", descriptor = "[B")
	private final byte[] aByteArray2;

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Lclient!hr;II)V")
	public Class9(@OriginalArg(0) Class148 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass148_1 = arg0;
		this.aLong13 = this.aLong16 = arg0.method3371();
		this.aLong15 = 0L;
		this.aByteArray3 = new byte[arg2];
		this.aByteArray2 = new byte[arg1];
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)J")
	public long method367() {
		return this.aLong13;
	}

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "(I)V")
	private void method368() throws IOException {
		if (this.aLong17 == (long) -1) {
			return;
		}
		if (this.aLong17 != this.aLong14) {
			this.aClass148_1.method3372(this.aLong17);
			this.aLong14 = this.aLong17;
		}
		this.aClass148_1.method3373(this.anInt371, this.aByteArray3, 0);
		this.aLong14 += this.anInt371;
		if (this.aLong16 < this.aLong14) {
			this.aLong16 = this.aLong14;
		}
		@Pc(54) long local54 = -1L;
		@Pc(56) long local56 = -1L;
		if (this.aLong12 <= this.aLong17 && (long) this.anInt367 + this.aLong12 > this.aLong17) {
			local54 = this.aLong17;
		} else if (this.aLong17 <= this.aLong12 && this.aLong12 < (long) this.anInt371 + this.aLong17) {
			local54 = this.aLong12;
		}
		if (this.aLong12 < this.aLong17 + (long) this.anInt371 && this.aLong17 + (long) this.anInt371 <= this.aLong12 - -((long) this.anInt367)) {
			local56 = (long) this.anInt371 + this.aLong17;
		} else if (this.aLong17 < (long) this.anInt367 + this.aLong12 && this.aLong12 + (long) this.anInt367 <= (long) this.anInt371 + this.aLong17) {
			local56 = (long) this.anInt367 + this.aLong12;
		}
		if (local54 > -1L && local56 > local54) {
			@Pc(199) int local199 = (int) (local56 - local54);
			Static602.method4666(this.aByteArray3, (int) (local54 - this.aLong17), this.aByteArray2, (int) (local54 - this.aLong12), local199);
		}
		this.anInt371 = 0;
		this.aLong17 = -1L;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "([BIIZ)V")
	public void method369(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if (arg0.length < arg1) {
				throw new ArrayIndexOutOfBoundsException(arg1 - arg0.length);
			}
			if (this.aLong17 != -1L && this.aLong17 <= this.aLong15 && this.aLong17 + (long) this.anInt371 >= this.aLong15 - -((long) arg1)) {
				Static602.method4666(this.aByteArray3, (int) (this.aLong15 - this.aLong17), arg0, 0, arg1);
				this.aLong15 += arg1;
				return;
			}
			@Pc(86) long local86 = this.aLong15;
			@Pc(90) int local90 = arg1;
			@Pc(127) int local127;
			if (this.aLong15 >= this.aLong12 && (long) this.anInt367 + this.aLong12 > this.aLong15) {
				local127 = (int) (this.aLong12 + (long) this.anInt367 - this.aLong15);
				if (local127 > arg1) {
					local127 = arg1;
				}
				Static602.method4666(this.aByteArray2, (int) (this.aLong15 - this.aLong12), arg0, 0, local127);
				arg2 = local127;
				arg1 -= local127;
				this.aLong15 += local127;
			}
			if (arg1 > this.aByteArray2.length) {
				this.aClass148_1.method3372(this.aLong15);
				this.aLong14 = this.aLong15;
				while (arg1 > 0) {
					local127 = this.aClass148_1.method3370(arg1, arg0, arg2);
					if (local127 == -1) {
						break;
					}
					arg2 += local127;
					arg1 -= local127;
					this.aLong15 += local127;
					this.aLong14 += local127;
				}
			} else if (arg1 > 0) {
				this.method376();
				local127 = arg1;
				if (arg1 > this.anInt367) {
					local127 = this.anInt367;
				}
				Static602.method4666(this.aByteArray2, 0, arg0, arg2, local127);
				arg1 -= local127;
				arg2 += local127;
				this.aLong15 += local127;
			}
			if (this.aLong17 != -1L) {
				if (this.aLong17 > this.aLong15 && arg1 > 0) {
					local127 = arg2 + (int) (this.aLong17 - this.aLong15);
					if (arg1 + arg2 < local127) {
						local127 = arg2 + arg1;
					}
					while (local127 > arg2) {
						arg0[arg2++] = 0;
						arg1--;
						this.aLong15++;
					}
				}
				@Pc(316) long local316 = -1L;
				if (this.aLong17 >= local86 && this.aLong17 < local86 + (long) local90) {
					local316 = this.aLong17;
				} else if (local86 >= this.aLong17 && local86 < (long) this.anInt371 + this.aLong17) {
					local316 = local86;
				}
				@Pc(359) long local359 = -1L;
				if (local86 < (long) this.anInt371 + this.aLong17 && (long) this.anInt371 + this.aLong17 <= local86 - -((long) local90)) {
					local359 = this.aLong17 + (long) this.anInt371;
				} else if (this.aLong17 < local86 + (long) local90 && (long) local90 + local86 <= (long) this.anInt371 + this.aLong17) {
					local359 = (long) local90 + local86;
				}
				if (local316 > -1L && local359 > local316) {
					@Pc(436) int local436 = (int) (local359 - local316);
					Static602.method4666(this.aByteArray3, (int) (local316 - this.aLong17), arg0, (int) (local316 - local86), local436);
					if (local359 > this.aLong15) {
						arg1 = (int) ((long) arg1 + this.aLong15 - local359);
						this.aLong15 = local359;
					}
				}
			}
		} catch (@Pc(479) IOException local479) {
			this.aLong14 = -1L;
			throw local479;
		}
		if (arg1 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!ah", name = "c", descriptor = "(I)Ljava/io/File;")
	private File method370() {
		return this.aClass148_1.method3368();
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(JB)V")
	public void method371(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method370());
		}
		this.aLong15 = arg0;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "([BI)V")
	public void method373(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method369(arg0, arg0.length, 0);
	}

	@OriginalMember(owner = "client!ah", name = "d", descriptor = "(I)V")
	public void method374() throws IOException {
		this.method368();
		this.aClass148_1.method3377();
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "([BIII)V")
	public void method375(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if ((long) arg2 + this.aLong15 > this.aLong13) {
				this.aLong13 = this.aLong15 + (long) arg2;
			}
			if (this.aLong17 != -1L && (this.aLong17 > this.aLong15 || this.aLong15 > (long) this.anInt371 + this.aLong17)) {
				this.method368();
			}
			if (this.aLong17 != -1L && this.aLong15 + (long) arg2 > (long) this.aByteArray3.length + this.aLong17) {
				@Pc(85) int local85 = (int) (this.aLong17 + (long) this.aByteArray3.length - this.aLong15);
				Static602.method4666(arg0, arg1, this.aByteArray3, (int) (this.aLong15 - this.aLong17), local85);
				this.aLong15 += local85;
				arg1 += local85;
				arg2 -= local85;
				this.anInt371 = this.aByteArray3.length;
				this.method368();
			}
			if (arg2 > this.aByteArray3.length) {
				if (this.aLong14 != this.aLong15) {
					this.aClass148_1.method3372(this.aLong15);
					this.aLong14 = this.aLong15;
				}
				this.aClass148_1.method3373(arg2, arg0, arg1);
				this.aLong14 += arg2;
				if (this.aLong14 > this.aLong16) {
					this.aLong16 = this.aLong14;
				}
				@Pc(168) long local168 = -1L;
				@Pc(170) long local170 = -1L;
				if (this.aLong15 >= this.aLong12 && this.aLong15 < this.aLong12 + (long) this.anInt367) {
					local168 = this.aLong15;
				} else if (this.aLong15 <= this.aLong12 && this.aLong15 + (long) arg2 > this.aLong12) {
					local168 = this.aLong12;
				}
				if (this.aLong15 + (long) arg2 > this.aLong12 && this.aLong12 + (long) this.anInt367 >= this.aLong15 + (long) arg2) {
					local170 = this.aLong15 + (long) arg2;
				} else if (this.aLong12 + (long) this.anInt367 > this.aLong15 && (long) this.anInt367 + this.aLong12 <= this.aLong15 + (long) arg2) {
					local170 = (long) this.anInt367 + this.aLong12;
				}
				if (local168 > -1L && local168 < local170) {
					@Pc(310) int local310 = (int) (local170 - local168);
					Static602.method4666(arg0, (int) ((long) arg1 + local168 - this.aLong15), this.aByteArray2, (int) (local168 - this.aLong12), local310);
				}
				this.aLong15 += arg2;
			} else if (arg2 > 0) {
				if (this.aLong17 == -1L) {
					this.aLong17 = this.aLong15;
				}
				Static602.method4666(arg0, arg1, this.aByteArray3, (int) (this.aLong15 - this.aLong17), arg2);
				this.aLong15 += arg2;
				if ((long) this.anInt371 < this.aLong15 - this.aLong17) {
					this.anInt371 = (int) (this.aLong15 - this.aLong17);
				}
			}
		} catch (@Pc(400) IOException local400) {
			this.aLong14 = -1L;
			throw local400;
		}
	}

	@OriginalMember(owner = "client!ah", name = "e", descriptor = "(I)V")
	private void method376() throws IOException {
		this.anInt367 = 0;
		if (this.aLong15 != this.aLong14) {
			this.aClass148_1.method3372(this.aLong15);
			this.aLong14 = this.aLong15;
		}
		this.aLong12 = this.aLong15;
		while (this.aByteArray2.length > this.anInt367) {
			@Pc(44) int local44 = this.aByteArray2.length - this.anInt367;
			if (local44 > 200000000) {
				local44 = 200000000;
			}
			@Pc(59) int local59 = this.aClass148_1.method3370(local44, this.aByteArray2, this.anInt367);
			if (local59 == -1) {
				break;
			}
			this.aLong14 += local59;
			this.anInt367 += local59;
		}
	}
}
