import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class27 {

	@OriginalMember(owner = "client!ia", name = "k", descriptor = "J")
	private long aLong41;

	@OriginalMember(owner = "client!ia", name = "s", descriptor = "I")
	private int anInt1423;

	@OriginalMember(owner = "client!ia", name = "l", descriptor = "I")
	private int anInt1420 = 0;

	@OriginalMember(owner = "client!ia", name = "g", descriptor = "J")
	private long aLong40 = -1L;

	@OriginalMember(owner = "client!ia", name = "p", descriptor = "J")
	private long aLong43 = -1L;

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "Lclient!l;")
	private final Class39 aClass39_1;

	@OriginalMember(owner = "client!ia", name = "H", descriptor = "J")
	private long aLong45;

	@OriginalMember(owner = "client!ia", name = "w", descriptor = "J")
	private long aLong44;

	@OriginalMember(owner = "client!ia", name = "o", descriptor = "J")
	private long aLong42;

	@OriginalMember(owner = "client!ia", name = "f", descriptor = "[B")
	private final byte[] aByteArray11;

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "[B")
	private final byte[] aByteArray10;

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Lclient!l;II)V")
	public Class27(@OriginalArg(0) Class39 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass39_1 = arg0;
		this.aLong44 = this.aLong45 = arg0.method1254();
		this.aLong42 = 0L;
		this.aByteArray11 = new byte[arg2];
		this.aByteArray10 = new byte[arg1];
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V")
	public void method892() throws IOException {
		this.method893();
		this.aClass39_1.method1256();
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V")
	private void method893() throws IOException {
		if (this.aLong40 == -1L) {
			return;
		}
		if (this.aLong41 != this.aLong40) {
			this.aClass39_1.method1258(this.aLong40);
			this.aLong41 = this.aLong40;
		}
		this.aClass39_1.method1259(0, this.aByteArray11, this.anInt1420);
		this.aLong41 += this.anInt1420;
		if (this.aLong45 < this.aLong41) {
			this.aLong45 = this.aLong41;
		}
		@Pc(65) long local65 = -1L;
		@Pc(67) long local67 = -1L;
		if (this.aLong43 <= this.aLong40 && (long) this.anInt1423 + this.aLong43 > this.aLong40) {
			local65 = this.aLong40;
		} else if (this.aLong43 >= this.aLong40 && (long) this.anInt1420 + this.aLong40 > this.aLong43) {
			local65 = this.aLong43;
		}
		if ((long) this.anInt1420 + this.aLong40 > this.aLong43 && (long) this.anInt1423 + this.aLong43 >= (long) this.anInt1420 + this.aLong40) {
			local67 = this.aLong40 + (long) this.anInt1420;
		} else if (this.aLong40 < this.aLong43 + (long) this.anInt1423 && (long) this.anInt1423 + this.aLong43 <= (long) this.anInt1420 + this.aLong40) {
			local67 = (long) this.anInt1423 + this.aLong43;
		}
		if (local65 > -1L && local67 > local65) {
			@Pc(199) int local199 = (int) (local67 - local65);
			Static135.method733(this.aByteArray11, (int) (local65 - this.aLong40), this.aByteArray10, (int) (local65 - this.aLong43), local199);
		}
		this.aLong40 = -1L;
		this.anInt1420 = 0;
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(B)Ljava/io/File;")
	private File method894() {
		return this.aClass39_1.method1255();
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(I)J")
	public long method895() {
		return this.aLong44;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "([BIII)V")
	public void method897(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg0.length < arg1) {
				throw new ArrayIndexOutOfBoundsException(arg1 - arg0.length);
			}
			if (this.aLong40 != -1L && this.aLong42 >= this.aLong40 && (long) this.anInt1420 + this.aLong40 >= this.aLong42 - -((long) arg1)) {
				Static135.method733(this.aByteArray11, (int) (this.aLong42 - this.aLong40), arg0, 0, arg1);
				this.aLong42 += arg1;
				return;
			}
			@Pc(84) long local84 = this.aLong42;
			@Pc(88) int local88 = arg1;
			@Pc(120) int local120;
			if (this.aLong42 >= this.aLong43 && this.aLong42 < (long) this.anInt1423 + this.aLong43) {
				local120 = (int) (this.aLong43 + (long) this.anInt1423 - this.aLong42);
				if (local120 > arg1) {
					local120 = arg1;
				}
				Static135.method733(this.aByteArray10, (int) (this.aLong42 - this.aLong43), arg0, 0, local120);
				this.aLong42 += local120;
				arg1 -= local120;
				arg2 = local120;
			}
			if (arg1 > this.aByteArray10.length) {
				this.aClass39_1.method1258(this.aLong42);
				this.aLong41 = this.aLong42;
				while (arg1 > 0) {
					local120 = this.aClass39_1.method1257(arg2, arg0, arg1);
					if (local120 == -1) {
						break;
					}
					arg1 -= local120;
					this.aLong41 += local120;
					this.aLong42 += local120;
					arg2 += local120;
				}
			} else if (arg1 > 0) {
				this.method898();
				local120 = arg1;
				if (this.anInt1423 < arg1) {
					local120 = this.anInt1423;
				}
				arg1 -= local120;
				Static135.method733(this.aByteArray10, 0, arg0, arg2, local120);
				this.aLong42 += local120;
				arg2 += local120;
			}
			if (this.aLong40 != -1L) {
				if (this.aLong42 < this.aLong40 && arg1 > 0) {
					local120 = arg2 + (int) (this.aLong40 - this.aLong42);
					if (arg1 + arg2 < local120) {
						local120 = arg2 + arg1;
					}
					while (local120 > arg2) {
						arg0[arg2++] = 0;
						arg1--;
						this.aLong42++;
					}
				}
				@Pc(319) long local319 = -1L;
				if (this.aLong40 >= local84 && this.aLong40 < (long) local88 + local84) {
					local319 = this.aLong40;
				} else if (this.aLong40 <= local84 && this.aLong40 + (long) this.anInt1420 > local84) {
					local319 = local84;
				}
				@Pc(364) long local364 = -1L;
				if (local84 < (long) this.anInt1420 + this.aLong40 && this.aLong40 + (long) this.anInt1420 <= (long) local88 + local84) {
					local364 = (long) this.anInt1420 + this.aLong40;
				} else if (this.aLong40 < local84 + (long) local88 && (long) this.anInt1420 + this.aLong40 >= local84 - -((long) local88)) {
					local364 = (long) local88 + local84;
				}
				if (local319 > -1L && local319 < local364) {
					@Pc(452) int local452 = (int) (local364 - local319);
					Static135.method733(this.aByteArray11, (int) (local319 - this.aLong40), arg0, (int) (local319 - local84), local452);
					if (this.aLong42 < local364) {
						arg1 = (int) ((long) arg1 + this.aLong42 - local364);
						this.aLong42 = local364;
					}
				}
			}
		} catch (@Pc(493) IOException local493) {
			this.aLong41 = -1L;
			throw local493;
		}
		if (arg1 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "(B)V")
	private void method898() throws IOException {
		this.anInt1423 = 0;
		if (this.aLong41 != this.aLong42) {
			this.aClass39_1.method1258(this.aLong42);
			this.aLong41 = this.aLong42;
		}
		this.aLong43 = this.aLong42;
		while (this.aByteArray10.length > this.anInt1423) {
			@Pc(50) int local50 = this.aClass39_1.method1257(this.anInt1423, this.aByteArray10, this.aByteArray10.length - this.anInt1423);
			if (local50 == -1) {
				break;
			}
			this.aLong41 += local50;
			this.anInt1423 += local50;
		}
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "([BIII)V")
	public void method900(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (this.aLong44 < (long) arg1 + this.aLong42) {
				this.aLong44 = this.aLong42 + (long) arg1;
			}
			if (this.aLong40 != -1L && (this.aLong40 > this.aLong42 || this.aLong40 + (long) this.anInt1420 < this.aLong42)) {
				this.method893();
			}
			if (this.aLong40 != -1L && this.aLong42 + (long) arg1 > (long) this.aByteArray11.length + this.aLong40) {
				@Pc(84) int local84 = (int) (this.aLong40 + (long) this.aByteArray11.length - this.aLong42);
				Static135.method733(arg0, arg2, this.aByteArray11, (int) (this.aLong42 - this.aLong40), local84);
				arg2 += local84;
				this.aLong42 += local84;
				this.anInt1420 = this.aByteArray11.length;
				arg1 -= local84;
				this.method893();
			}
			if (arg1 > this.aByteArray11.length) {
				@Pc(127) long local127 = -1L;
				if (this.aLong42 != this.aLong41) {
					this.aClass39_1.method1258(this.aLong42);
					this.aLong41 = this.aLong42;
				}
				@Pc(149) long local149 = -1L;
				this.aClass39_1.method1259(arg2, arg0, arg1);
				this.aLong41 += arg1;
				if (this.aLong41 > this.aLong45) {
					this.aLong45 = this.aLong41;
				}
				if (this.aLong43 < this.aLong42 + (long) arg1 && (long) this.anInt1423 + this.aLong43 >= (long) arg1 + this.aLong42) {
					local149 = (long) arg1 + this.aLong42;
				} else if ((long) this.anInt1423 + this.aLong43 > this.aLong42 && (long) arg1 + this.aLong42 >= (long) this.anInt1423 + this.aLong43) {
					local149 = this.aLong43 + (long) this.anInt1423;
				}
				if (this.aLong42 >= this.aLong43 && this.aLong43 + (long) this.anInt1423 > this.aLong42) {
					local127 = this.aLong42;
				} else if (this.aLong43 >= this.aLong42 && this.aLong42 + (long) arg1 > this.aLong43) {
					local127 = this.aLong43;
				}
				if (local127 > -1L && local127 < local149) {
					@Pc(308) int local308 = (int) (local149 - local127);
					Static135.method733(arg0, (int) (local127 + (long) arg2 - this.aLong42), this.aByteArray10, (int) (local127 - this.aLong43), local308);
				}
				this.aLong42 += arg1;
			} else if (arg1 > 0) {
				if (this.aLong40 == -1L) {
					this.aLong40 = this.aLong42;
				}
				Static135.method733(arg0, arg2, this.aByteArray11, (int) (this.aLong42 - this.aLong40), arg1);
				this.aLong42 += arg1;
				if (this.aLong42 - this.aLong40 > (long) this.anInt1420) {
					this.anInt1420 = (int) (this.aLong42 - this.aLong40);
				}
			}
		} catch (@Pc(396) IOException local396) {
			this.aLong41 = -1L;
			throw local396;
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(BJ)V")
	public void method902(@OriginalArg(1) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method894());
		}
		this.aLong42 = arg0;
	}
}
