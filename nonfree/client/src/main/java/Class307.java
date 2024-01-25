import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vv")
public final class Class307 {

	@OriginalMember(owner = "client!vv", name = "m", descriptor = "J")
	private long aLong374;

	@OriginalMember(owner = "client!vv", name = "v", descriptor = "I")
	private int anInt8787;

	@OriginalMember(owner = "client!vv", name = "n", descriptor = "J")
	private long aLong375 = -1L;

	@OriginalMember(owner = "client!vv", name = "t", descriptor = "I")
	private int anInt8785 = 0;

	@OriginalMember(owner = "client!vv", name = "p", descriptor = "J")
	private long aLong376 = -1L;

	@OriginalMember(owner = "client!vv", name = "b", descriptor = "Lclient!laa;")
	private final Class177 aClass177_4;

	@OriginalMember(owner = "client!vv", name = "d", descriptor = "J")
	private long aLong373;

	@OriginalMember(owner = "client!vv", name = "r", descriptor = "J")
	private long aLong377;

	@OriginalMember(owner = "client!vv", name = "h", descriptor = "[B")
	private final byte[] aByteArray121;

	@OriginalMember(owner = "client!vv", name = "s", descriptor = "J")
	private long aLong378;

	@OriginalMember(owner = "client!vv", name = "x", descriptor = "[B")
	private final byte[] aByteArray122;

	@OriginalMember(owner = "client!vv", name = "<init>", descriptor = "(Lclient!laa;II)V")
	public Class307(@OriginalArg(0) Class177 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass177_4 = arg0;
		this.aLong377 = this.aLong373 = arg0.method4410();
		this.aByteArray121 = new byte[arg1];
		this.aLong378 = 0L;
		this.aByteArray122 = new byte[arg2];
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(Z)V")
	private void method7173() throws IOException {
		this.anInt8787 = 0;
		if (this.aLong374 != this.aLong378) {
			this.aClass177_4.method4409(this.aLong378);
			this.aLong374 = this.aLong378;
		}
		this.aLong376 = this.aLong378;
		while (this.aByteArray121.length > this.anInt8787) {
			@Pc(43) int local43 = this.aByteArray121.length - this.anInt8787;
			if (local43 > 200000000) {
				local43 = 200000000;
			}
			@Pc(60) int local60 = this.aClass177_4.method4406(local43, this.aByteArray121, this.anInt8787);
			if (local60 == -1) {
				break;
			}
			this.anInt8787 += local60;
			this.aLong374 += local60;
		}
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(IJ)V")
	public void method7175(@OriginalArg(1) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method7180());
		}
		this.aLong378 = arg0;
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(Z[B)V")
	public void method7178(@OriginalArg(1) byte[] arg0) throws IOException {
		this.method7182(0, arg0, arg0.length);
	}

	@OriginalMember(owner = "client!vv", name = "b", descriptor = "(B)Ljava/io/File;")
	private File method7180() {
		return this.aClass177_4.method4407();
	}

	@OriginalMember(owner = "client!vv", name = "b", descriptor = "(Z)V")
	private void method7181() throws IOException {
		if (this.aLong375 == -1L) {
			return;
		}
		if (this.aLong375 != this.aLong374) {
			this.aClass177_4.method4409(this.aLong375);
			this.aLong374 = this.aLong375;
		}
		this.aClass177_4.method4408(this.anInt8785, this.aByteArray122, 0);
		this.aLong374 += this.anInt8785;
		if (this.aLong374 > this.aLong373) {
			this.aLong373 = this.aLong374;
		}
		@Pc(67) long local67 = -1L;
		@Pc(69) long local69 = -1L;
		if (this.aLong376 <= this.aLong375 && this.aLong376 + (long) this.anInt8787 > this.aLong375) {
			local67 = this.aLong375;
		} else if (this.aLong376 >= this.aLong375 && this.aLong376 < (long) this.anInt8785 + this.aLong375) {
			local67 = this.aLong376;
		}
		if (this.aLong375 + (long) this.anInt8785 > this.aLong376 && (long) this.anInt8787 + this.aLong376 >= (long) this.anInt8785 + this.aLong375) {
			local69 = this.aLong375 + (long) this.anInt8785;
		} else if (this.aLong375 < (long) this.anInt8787 + this.aLong376 && (long) this.anInt8787 + this.aLong376 <= (long) this.anInt8785 + this.aLong375) {
			local69 = (long) this.anInt8787 + this.aLong376;
		}
		if (local67 > -1L && local69 > local67) {
			@Pc(216) int local216 = (int) (local69 - local67);
			Static551.method3488(this.aByteArray122, (int) (local67 - this.aLong375), this.aByteArray121, (int) (local67 - this.aLong376), local216);
		}
		this.anInt8785 = 0;
		this.aLong375 = -1L;
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(I[BBI)V")
	public void method7182(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg1.length < arg2) {
				throw new ArrayIndexOutOfBoundsException(arg2 - arg1.length);
			}
			if (this.aLong375 != -1L && this.aLong375 <= this.aLong378 && this.aLong375 + (long) this.anInt8785 >= (long) arg2 + this.aLong378) {
				Static551.method3488(this.aByteArray122, (int) (this.aLong378 - this.aLong375), arg1, 0, arg2);
				this.aLong378 += arg2;
				return;
			}
			@Pc(84) long local84 = this.aLong378;
			@Pc(88) int local88 = arg2;
			@Pc(120) int local120;
			if (this.aLong376 <= this.aLong378 && this.aLong376 + (long) this.anInt8787 > this.aLong378) {
				local120 = (int) (this.aLong376 + (long) this.anInt8787 - this.aLong378);
				if (arg2 < local120) {
					local120 = arg2;
				}
				Static551.method3488(this.aByteArray121, (int) (this.aLong378 - this.aLong376), arg1, 0, local120);
				this.aLong378 += local120;
				arg0 = local120;
				arg2 -= local120;
			}
			if (this.aByteArray121.length < arg2) {
				this.aClass177_4.method4409(this.aLong378);
				this.aLong374 = this.aLong378;
				while (arg2 > 0) {
					local120 = this.aClass177_4.method4406(arg2, arg1, arg0);
					if (local120 == -1) {
						break;
					}
					arg0 += local120;
					arg2 -= local120;
					this.aLong374 += local120;
					this.aLong378 += local120;
				}
			} else if (arg2 > 0) {
				this.method7173();
				local120 = arg2;
				if (this.anInt8787 < arg2) {
					local120 = this.anInt8787;
				}
				Static551.method3488(this.aByteArray121, 0, arg1, arg0, local120);
				arg0 += local120;
				this.aLong378 += local120;
				arg2 -= local120;
			}
			if (this.aLong375 != -1L) {
				if (this.aLong378 < this.aLong375 && arg2 > 0) {
					local120 = arg0 + (int) (this.aLong375 - this.aLong378);
					if (arg0 + arg2 < local120) {
						local120 = arg0 + arg2;
					}
					while (arg0 < local120) {
						arg1[arg0++] = 0;
						arg2--;
						this.aLong378++;
					}
				}
				@Pc(323) long local323 = -1L;
				if (local84 <= this.aLong375 && (long) local88 + local84 > this.aLong375) {
					local323 = this.aLong375;
				} else if (local84 >= this.aLong375 && (long) this.anInt8785 + this.aLong375 > local84) {
					local323 = local84;
				}
				@Pc(371) long local371 = -1L;
				if (local84 < this.aLong375 + (long) this.anInt8785 && this.aLong375 + (long) this.anInt8785 <= (long) local88 + local84) {
					local371 = this.aLong375 + (long) this.anInt8785;
				} else if (local84 + (long) local88 > this.aLong375 && (long) this.anInt8785 + this.aLong375 >= local84 + (long) local88) {
					local371 = (long) local88 + local84;
				}
				if (local323 > -1L && local371 > local323) {
					@Pc(449) int local449 = (int) (local371 - local323);
					Static551.method3488(this.aByteArray122, (int) (local323 - this.aLong375), arg1, (int) (local323 - local84), local449);
					if (this.aLong378 < local371) {
						arg2 = (int) ((long) arg2 + this.aLong378 - local371);
						this.aLong378 = local371;
					}
				}
			}
		} catch (@Pc(487) IOException local487) {
			this.aLong374 = -1L;
			throw local487;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!vv", name = "c", descriptor = "(B)J")
	public long method7183() {
		return this.aLong377;
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(B[BII)V")
	public void method7184(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if ((long) arg2 + this.aLong378 > this.aLong377) {
				this.aLong377 = this.aLong378 + (long) arg2;
			}
			if (this.aLong375 != -1L && (this.aLong378 < this.aLong375 || this.aLong378 > this.aLong375 + (long) this.anInt8785)) {
				this.method7181();
			}
			if (this.aLong375 != -1L && this.aLong378 + (long) arg2 > (long) this.aByteArray122.length + this.aLong375) {
				@Pc(86) int local86 = (int) ((long) this.aByteArray122.length + this.aLong375 - this.aLong378);
				Static551.method3488(arg0, arg1, this.aByteArray122, (int) (this.aLong378 - this.aLong375), local86);
				arg2 -= local86;
				arg1 += local86;
				this.aLong378 += local86;
				this.anInt8785 = this.aByteArray122.length;
				this.method7181();
			}
			if (arg2 > this.aByteArray122.length) {
				if (this.aLong374 != this.aLong378) {
					this.aClass177_4.method4409(this.aLong378);
					this.aLong374 = this.aLong378;
				}
				this.aClass177_4.method4408(arg2, arg0, arg1);
				this.aLong374 += arg2;
				if (this.aLong374 > this.aLong373) {
					this.aLong373 = this.aLong374;
				}
				@Pc(172) long local172 = -1L;
				if (this.aLong376 <= this.aLong378 && this.aLong376 + (long) this.anInt8787 > this.aLong378) {
					local172 = this.aLong378;
				} else if (this.aLong376 >= this.aLong378 && this.aLong376 < this.aLong378 + (long) arg2) {
					local172 = this.aLong376;
				}
				@Pc(218) long local218 = -1L;
				if ((long) arg2 + this.aLong378 > this.aLong376 && (long) this.anInt8787 + this.aLong376 >= (long) arg2 + this.aLong378) {
					local218 = (long) arg2 + this.aLong378;
				} else if (this.aLong378 < this.aLong376 + (long) this.anInt8787 && this.aLong376 + (long) this.anInt8787 <= (long) arg2 + this.aLong378) {
					local218 = this.aLong376 + (long) this.anInt8787;
				}
				if (local172 > -1L && local172 < local218) {
					@Pc(305) int local305 = (int) (local218 - local172);
					Static551.method3488(arg0, (int) (local172 + (long) arg1 - this.aLong378), this.aByteArray121, (int) (local172 - this.aLong376), local305);
				}
				this.aLong378 += arg2;
			} else if (arg2 > 0) {
				if (this.aLong375 == -1L) {
					this.aLong375 = this.aLong378;
				}
				Static551.method3488(arg0, arg1, this.aByteArray122, (int) (this.aLong378 - this.aLong375), arg2);
				this.aLong378 += arg2;
				if (this.aLong378 - this.aLong375 > (long) this.anInt8785) {
					this.anInt8785 = (int) (this.aLong378 - this.aLong375);
				}
			}
		} catch (@Pc(394) IOException local394) {
			this.aLong374 = -1L;
			throw local394;
		}
	}
}
