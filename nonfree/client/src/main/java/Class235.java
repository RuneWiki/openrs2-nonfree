import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oca")
public final class Class235 {

	@OriginalMember(owner = "client!oca", name = "i", descriptor = "I")
	private int anInt7473;

	@OriginalMember(owner = "client!oca", name = "s", descriptor = "J")
	private long aLong191;

	@OriginalMember(owner = "client!oca", name = "e", descriptor = "I")
	private int anInt7471 = 0;

	@OriginalMember(owner = "client!oca", name = "t", descriptor = "J")
	private long aLong192 = -1L;

	@OriginalMember(owner = "client!oca", name = "p", descriptor = "J")
	private long aLong190 = -1L;

	@OriginalMember(owner = "client!oca", name = "q", descriptor = "Lclient!ww;")
	private final Class379 aClass379_4;

	@OriginalMember(owner = "client!oca", name = "b", descriptor = "J")
	private long aLong187;

	@OriginalMember(owner = "client!oca", name = "k", descriptor = "J")
	private long aLong188;

	@OriginalMember(owner = "client!oca", name = "f", descriptor = "[B")
	private final byte[] aByteArray58;

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "[B")
	private final byte[] aByteArray57;

	@OriginalMember(owner = "client!oca", name = "l", descriptor = "J")
	private long aLong189;

	@OriginalMember(owner = "client!oca", name = "<init>", descriptor = "(Lclient!ww;II)V")
	public Class235(@OriginalArg(0) Class379 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass379_4 = arg0;
		this.aLong188 = this.aLong187 = arg0.method8627();
		this.aByteArray58 = new byte[arg2];
		this.aByteArray57 = new byte[arg1];
		this.aLong189 = 0L;
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(I)Ljava/io/File;")
	private File method6165() {
		return this.aClass379_4.method8636();
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(JI)V")
	public void method6166(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method6165());
		}
		this.aLong189 = arg0;
	}

	@OriginalMember(owner = "client!oca", name = "b", descriptor = "(I)V")
	private void method6167() throws IOException {
		if (this.aLong190 == -1L) {
			return;
		}
		if (this.aLong191 != this.aLong190) {
			this.aClass379_4.method8633(this.aLong190);
			this.aLong191 = this.aLong190;
		}
		this.aClass379_4.method8632(0, this.anInt7471, this.aByteArray58);
		this.aLong191 += this.anInt7471;
		if (this.aLong187 < this.aLong191) {
			this.aLong187 = this.aLong191;
		}
		@Pc(62) long local62 = -1L;
		@Pc(64) long local64 = -1L;
		if (this.aLong192 <= this.aLong190 && this.aLong192 + (long) this.anInt7473 > this.aLong190) {
			local62 = this.aLong190;
		} else if (this.aLong190 <= this.aLong192 && (long) this.anInt7471 + this.aLong190 > this.aLong192) {
			local62 = this.aLong192;
		}
		if (this.aLong190 + (long) this.anInt7471 > this.aLong192 && (long) this.anInt7471 + this.aLong190 <= this.aLong192 - -((long) this.anInt7473)) {
			local64 = (long) this.anInt7471 + this.aLong190;
		} else if ((long) this.anInt7473 + this.aLong192 > this.aLong190 && this.aLong190 + (long) this.anInt7471 >= this.aLong192 + (long) this.anInt7473) {
			local64 = this.aLong192 + (long) this.anInt7473;
		}
		if (local62 > -1L && local64 > local62) {
			@Pc(200) int local200 = (int) (local64 - local62);
			Static649.method5532(this.aByteArray58, (int) (local62 - this.aLong190), this.aByteArray57, (int) (local62 - this.aLong192), local200);
		}
		this.aLong190 = -1L;
		this.anInt7471 = 0;
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(I[B)V")
	public void method6169(@OriginalArg(1) byte[] arg0) throws IOException {
		this.method6173(0, arg0, arg0.length);
	}

	@OriginalMember(owner = "client!oca", name = "c", descriptor = "(I)J")
	public long method6170() {
		return this.aLong188;
	}

	@OriginalMember(owner = "client!oca", name = "d", descriptor = "(I)V")
	private void method6171() throws IOException {
		this.anInt7473 = 0;
		if (this.aLong189 != this.aLong191) {
			this.aClass379_4.method8633(this.aLong189);
			this.aLong191 = this.aLong189;
		}
		this.aLong192 = this.aLong189;
		while (this.anInt7473 < this.aByteArray57.length) {
			@Pc(42) int local42 = this.aByteArray57.length - this.anInt7473;
			if (local42 > 200000000) {
				local42 = 200000000;
			}
			@Pc(57) int local57 = this.aClass379_4.method8634(this.aByteArray57, this.anInt7473, local42);
			if (local57 == -1) {
				break;
			}
			this.anInt7473 += local57;
			this.aLong191 += local57;
		}
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(I[BII)V")
	public void method6173(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if (arg1.length < arg2) {
				throw new ArrayIndexOutOfBoundsException(arg2 - arg1.length);
			}
			if (this.aLong190 != -1L && this.aLong190 <= this.aLong189 && (long) this.anInt7471 + this.aLong190 >= this.aLong189 + (long) arg2) {
				Static649.method5532(this.aByteArray58, (int) (this.aLong189 - this.aLong190), arg1, 0, arg2);
				this.aLong189 += arg2;
				return;
			}
			@Pc(80) long local80 = this.aLong189;
			@Pc(84) int local84 = arg2;
			@Pc(120) int local120;
			if (this.aLong192 <= this.aLong189 && this.aLong189 < (long) this.anInt7473 + this.aLong192) {
				local120 = (int) ((long) this.anInt7473 + this.aLong192 - this.aLong189);
				if (arg2 < local120) {
					local120 = arg2;
				}
				Static649.method5532(this.aByteArray57, (int) (this.aLong189 - this.aLong192), arg1, 0, local120);
				this.aLong189 += local120;
				arg2 -= local120;
				arg0 = local120;
			}
			if (arg2 > this.aByteArray57.length) {
				this.aClass379_4.method8633(this.aLong189);
				this.aLong191 = this.aLong189;
				while (arg2 > 0) {
					local120 = this.aClass379_4.method8634(arg1, arg0, arg2);
					if (local120 == -1) {
						break;
					}
					arg0 += local120;
					arg2 -= local120;
					this.aLong189 += local120;
					this.aLong191 += local120;
				}
			} else if (arg2 > 0) {
				this.method6171();
				local120 = arg2;
				if (arg2 > this.anInt7473) {
					local120 = this.anInt7473;
				}
				Static649.method5532(this.aByteArray57, 0, arg1, arg0, local120);
				this.aLong189 += local120;
				arg0 += local120;
				arg2 -= local120;
			}
			if (this.aLong190 != -1L) {
				if (this.aLong189 < this.aLong190 && arg2 > 0) {
					local120 = (int) (this.aLong190 - this.aLong189) + arg0;
					if (local120 > arg2 + arg0) {
						local120 = arg0 + arg2;
					}
					while (local120 > arg0) {
						arg2--;
						arg1[arg0++] = 0;
						this.aLong189++;
					}
				}
				@Pc(314) long local314 = -1L;
				if (this.aLong190 >= local80 && local80 + (long) local84 > this.aLong190) {
					local314 = this.aLong190;
				} else if (local80 >= this.aLong190 && this.aLong190 + (long) this.anInt7471 > local80) {
					local314 = local80;
				}
				@Pc(360) long local360 = -1L;
				if ((long) this.anInt7471 + this.aLong190 > local80 && this.aLong190 + (long) this.anInt7471 <= (long) local84 + local80) {
					local360 = this.aLong190 + (long) this.anInt7471;
				} else if ((long) local84 + local80 > this.aLong190 && (long) this.anInt7471 + this.aLong190 >= (long) local84 + local80) {
					local360 = (long) local84 + local80;
				}
				if (local314 > -1L && local314 < local360) {
					@Pc(440) int local440 = (int) (local360 - local314);
					Static649.method5532(this.aByteArray58, (int) (local314 - this.aLong190), arg1, (int) (local314 - local80), local440);
					if (this.aLong189 < local360) {
						arg2 = (int) ((long) arg2 + this.aLong189 - local360);
						this.aLong189 = local360;
					}
				}
			}
		} catch (@Pc(481) IOException local481) {
			this.aLong191 = -1L;
			throw local481;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!oca", name = "e", descriptor = "(I)V")
	public void method6174() throws IOException {
		this.method6167();
		this.aClass379_4.method8628();
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(II[BI)V")
	public void method6175(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		try {
			if ((long) arg1 + this.aLong189 > this.aLong188) {
				this.aLong188 = (long) arg1 + this.aLong189;
			}
			if (this.aLong190 != -1L && (this.aLong189 < this.aLong190 || this.aLong190 + (long) this.anInt7471 < this.aLong189)) {
				this.method6167();
			}
			if (this.aLong190 != -1L && this.aLong189 + (long) arg1 > this.aLong190 + (long) this.aByteArray58.length) {
				@Pc(92) int local92 = (int) (this.aLong190 + (long) this.aByteArray58.length - this.aLong189);
				Static649.method5532(arg2, arg0, this.aByteArray58, (int) (this.aLong189 - this.aLong190), local92);
				arg0 += local92;
				this.aLong189 += local92;
				arg1 -= local92;
				this.anInt7471 = this.aByteArray58.length;
				this.method6167();
			}
			if (arg1 > this.aByteArray58.length) {
				if (this.aLong189 != this.aLong191) {
					this.aClass379_4.method8633(this.aLong189);
					this.aLong191 = this.aLong189;
				}
				this.aClass379_4.method8632(arg0, arg1, arg2);
				this.aLong191 += arg1;
				if (this.aLong191 > this.aLong187) {
					this.aLong187 = this.aLong191;
				}
				@Pc(178) long local178 = -1L;
				@Pc(180) long local180 = -1L;
				if (this.aLong189 >= this.aLong192 && this.aLong189 < this.aLong192 + (long) this.anInt7473) {
					local178 = this.aLong189;
				} else if (this.aLong189 <= this.aLong192 && this.aLong192 < (long) arg1 + this.aLong189) {
					local178 = this.aLong192;
				}
				if (this.aLong189 + (long) arg1 > this.aLong192 && (long) this.anInt7473 + this.aLong192 >= (long) arg1 + this.aLong189) {
					local180 = (long) arg1 + this.aLong189;
				} else if (this.aLong189 < (long) this.anInt7473 + this.aLong192 && this.aLong189 + (long) arg1 >= this.aLong192 - -((long) this.anInt7473)) {
					local180 = (long) this.anInt7473 + this.aLong192;
				}
				if (local178 > -1L && local180 > local178) {
					@Pc(320) int local320 = (int) (local180 - local178);
					Static649.method5532(arg2, (int) ((long) arg0 + local178 - this.aLong189), this.aByteArray57, (int) (local178 - this.aLong192), local320);
				}
				this.aLong189 += arg1;
			} else if (arg1 > 0) {
				if (this.aLong190 == -1L) {
					this.aLong190 = this.aLong189;
				}
				Static649.method5532(arg2, arg0, this.aByteArray58, (int) (this.aLong189 - this.aLong190), arg1);
				this.aLong189 += arg1;
				if ((long) this.anInt7471 < this.aLong189 - this.aLong190) {
					this.anInt7471 = (int) (this.aLong189 - this.aLong190);
				}
			}
		} catch (@Pc(405) IOException local405) {
			this.aLong191 = -1L;
			throw local405;
		}
	}
}
