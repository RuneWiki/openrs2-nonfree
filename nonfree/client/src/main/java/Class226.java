import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nh")
public final class Class226 {

	@OriginalMember(owner = "client!nh", name = "t", descriptor = "I")
	private int anInt6225;

	@OriginalMember(owner = "client!nh", name = "w", descriptor = "J")
	private long aLong167;

	@OriginalMember(owner = "client!nh", name = "h", descriptor = "J")
	private long aLong163 = -1L;

	@OriginalMember(owner = "client!nh", name = "k", descriptor = "J")
	private long aLong164 = -1L;

	@OriginalMember(owner = "client!nh", name = "n", descriptor = "I")
	private int anInt6222 = 0;

	@OriginalMember(owner = "client!nh", name = "j", descriptor = "Lclient!mca;")
	private final Class204 aClass204_1;

	@OriginalMember(owner = "client!nh", name = "s", descriptor = "J")
	private long aLong165;

	@OriginalMember(owner = "client!nh", name = "v", descriptor = "J")
	private long aLong166;

	@OriginalMember(owner = "client!nh", name = "i", descriptor = "[B")
	private final byte[] aByteArray63;

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "J")
	private long aLong162;

	@OriginalMember(owner = "client!nh", name = "r", descriptor = "[B")
	private final byte[] aByteArray64;

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Lclient!mca;II)V")
	public Class226(@OriginalArg(0) Class204 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass204_1 = arg0;
		this.aLong166 = this.aLong165 = arg0.method4676();
		this.aByteArray63 = new byte[arg1];
		this.aLong162 = 0L;
		this.aByteArray64 = new byte[arg2];
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)Ljava/io/File;")
	private File method5267() {
		return this.aClass204_1.method4680();
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(II[BI)V")
	public void method5268(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		try {
			if (arg2.length < arg1) {
				throw new ArrayIndexOutOfBoundsException(arg1 - arg2.length);
			}
			if (this.aLong164 != -1L && this.aLong162 >= this.aLong164 && (long) this.anInt6222 + this.aLong164 >= (long) arg1 + this.aLong162) {
				Static601.method2816(this.aByteArray64, (int) (this.aLong162 - this.aLong164), arg2, 0, arg1);
				this.aLong162 += arg1;
				return;
			}
			@Pc(76) long local76 = this.aLong162;
			@Pc(80) int local80 = arg1;
			@Pc(113) int local113;
			if (this.aLong162 >= this.aLong163 && this.aLong162 < this.aLong163 + (long) this.anInt6225) {
				local113 = (int) ((long) this.anInt6225 + this.aLong163 - this.aLong162);
				if (arg1 < local113) {
					local113 = arg1;
				}
				Static601.method2816(this.aByteArray63, (int) (this.aLong162 - this.aLong163), arg2, 0, local113);
				arg0 = local113;
				this.aLong162 += local113;
				arg1 -= local113;
			}
			if (arg1 > this.aByteArray63.length) {
				this.aClass204_1.method4679(this.aLong162);
				this.aLong167 = this.aLong162;
				while (arg1 > 0) {
					local113 = this.aClass204_1.method4681(arg2, arg0, arg1);
					if (local113 == -1) {
						break;
					}
					arg1 -= local113;
					this.aLong162 += local113;
					this.aLong167 += local113;
					arg0 += local113;
				}
			} else if (arg1 > 0) {
				this.method5269();
				local113 = arg1;
				if (this.anInt6225 < arg1) {
					local113 = this.anInt6225;
				}
				Static601.method2816(this.aByteArray63, 0, arg2, arg0, local113);
				arg1 -= local113;
				arg0 += local113;
				this.aLong162 += local113;
			}
			if (this.aLong164 != -1L) {
				if (this.aLong162 < this.aLong164 && arg1 > 0) {
					local113 = (int) (this.aLong164 - this.aLong162) + arg0;
					if (local113 > arg1 + arg0) {
						local113 = arg0 + arg1;
					}
					while (local113 > arg0) {
						arg1--;
						arg2[arg0++] = 0;
						this.aLong162++;
					}
				}
				@Pc(303) long local303 = -1L;
				if (local76 <= this.aLong164 && this.aLong164 < local76 + (long) local80) {
					local303 = this.aLong164;
				} else if (local76 >= this.aLong164 && this.aLong164 + (long) this.anInt6222 > local76) {
					local303 = local76;
				}
				@Pc(353) long local353 = -1L;
				if ((long) this.anInt6222 + this.aLong164 > local76 && (long) this.anInt6222 + this.aLong164 <= local76 - -((long) local80)) {
					local353 = (long) this.anInt6222 + this.aLong164;
				} else if ((long) local80 + local76 > this.aLong164 && local76 + (long) local80 <= (long) this.anInt6222 + this.aLong164) {
					local353 = (long) local80 + local76;
				}
				if (local303 > -1L && local353 > local303) {
					@Pc(439) int local439 = (int) (local353 - local303);
					Static601.method2816(this.aByteArray64, (int) (local303 - this.aLong164), arg2, (int) (local303 - local76), local439);
					if (this.aLong162 < local353) {
						arg1 = (int) ((long) arg1 + this.aLong162 - local353);
						this.aLong162 = local353;
					}
				}
			}
		} catch (@Pc(481) IOException local481) {
			this.aLong167 = -1L;
			throw local481;
		}
		if (arg1 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(B)V")
	private void method5269() throws IOException {
		this.anInt6225 = 0;
		if (this.aLong162 != this.aLong167) {
			this.aClass204_1.method4679(this.aLong162);
			this.aLong167 = this.aLong162;
		}
		this.aLong163 = this.aLong162;
		while (this.anInt6225 < this.aByteArray63.length) {
			@Pc(44) int local44 = this.aByteArray63.length - this.anInt6225;
			if (local44 > 200000000) {
				local44 = 200000000;
			}
			@Pc(59) int local59 = this.aClass204_1.method4681(this.aByteArray63, this.anInt6225, local44);
			if (local59 == -1) {
				break;
			}
			this.anInt6225 += local59;
			this.aLong167 += local59;
		}
	}

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "(B)V")
	private void method5271() throws IOException {
		if (this.aLong164 == -1L) {
			return;
		}
		if (this.aLong167 != this.aLong164) {
			this.aClass204_1.method4679(this.aLong164);
			this.aLong167 = this.aLong164;
		}
		this.aClass204_1.method4678(this.anInt6222, 0, this.aByteArray64);
		this.aLong167 += this.anInt6222;
		if (this.aLong165 < this.aLong167) {
			this.aLong165 = this.aLong167;
		}
		@Pc(61) long local61 = -1L;
		if (this.aLong164 >= this.aLong163 && this.aLong164 < this.aLong163 + (long) this.anInt6225) {
			local61 = this.aLong164;
		} else if (this.aLong164 <= this.aLong163 && (long) this.anInt6222 + this.aLong164 > this.aLong163) {
			local61 = this.aLong163;
		}
		@Pc(116) long local116 = -1L;
		if (this.aLong163 < (long) this.anInt6222 + this.aLong164 && (long) this.anInt6225 + this.aLong163 >= (long) this.anInt6222 + this.aLong164) {
			local116 = this.aLong164 + (long) this.anInt6222;
		} else if (this.aLong164 < (long) this.anInt6225 + this.aLong163 && (long) this.anInt6222 + this.aLong164 >= (long) this.anInt6225 + this.aLong163) {
			local116 = this.aLong163 + (long) this.anInt6225;
		}
		if (local61 > -1L && local61 < local116) {
			@Pc(211) int local211 = (int) (local116 - local61);
			Static601.method2816(this.aByteArray64, (int) (local61 - this.aLong164), this.aByteArray63, (int) (local61 - this.aLong163), local211);
		}
		this.anInt6222 = 0;
		this.aLong164 = -1L;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(I[BII)V")
	public void method5272(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if (this.aLong162 + (long) arg2 > this.aLong166) {
				this.aLong166 = (long) arg2 + this.aLong162;
			}
			if (this.aLong164 != -1L && (this.aLong164 > this.aLong162 || this.aLong164 + (long) this.anInt6222 < this.aLong162)) {
				this.method5271();
			}
			if (this.aLong164 != -1L && this.aLong164 + (long) this.aByteArray64.length < this.aLong162 + (long) arg2) {
				@Pc(96) int local96 = (int) ((long) this.aByteArray64.length + this.aLong164 - this.aLong162);
				Static601.method2816(arg1, arg0, this.aByteArray64, (int) (this.aLong162 - this.aLong164), local96);
				this.aLong162 += local96;
				arg0 += local96;
				arg2 -= local96;
				this.anInt6222 = this.aByteArray64.length;
				this.method5271();
			}
			if (this.aByteArray64.length < arg2) {
				if (this.aLong167 != this.aLong162) {
					this.aClass204_1.method4679(this.aLong162);
					this.aLong167 = this.aLong162;
				}
				this.aClass204_1.method4678(arg2, arg0, arg1);
				this.aLong167 += arg2;
				if (this.aLong167 > this.aLong165) {
					this.aLong165 = this.aLong167;
				}
				@Pc(182) long local182 = -1L;
				if (this.aLong163 <= this.aLong162 && (long) this.anInt6225 + this.aLong163 > this.aLong162) {
					local182 = this.aLong162;
				} else if (this.aLong163 >= this.aLong162 && this.aLong163 < (long) arg2 + this.aLong162) {
					local182 = this.aLong163;
				}
				@Pc(235) long local235 = -1L;
				if (this.aLong163 < this.aLong162 + (long) arg2 && (long) this.anInt6225 + this.aLong163 >= this.aLong162 - -((long) arg2)) {
					local235 = (long) arg2 + this.aLong162;
				} else if (this.aLong163 + (long) this.anInt6225 > this.aLong162 && this.aLong163 + (long) this.anInt6225 <= (long) arg2 + this.aLong162) {
					local235 = (long) this.anInt6225 + this.aLong163;
				}
				if (local182 > -1L && local235 > local182) {
					@Pc(319) int local319 = (int) (local235 - local182);
					Static601.method2816(arg1, (int) ((long) arg0 + local182 - this.aLong162), this.aByteArray63, (int) (local182 - this.aLong163), local319);
				}
				this.aLong162 += arg2;
			} else if (arg2 > 0) {
				if (this.aLong164 == -1L) {
					this.aLong164 = this.aLong162;
				}
				Static601.method2816(arg1, arg0, this.aByteArray64, (int) (this.aLong162 - this.aLong164), arg2);
				this.aLong162 += arg2;
				if (this.aLong162 - this.aLong164 > (long) this.anInt6222) {
					this.anInt6222 = (int) (this.aLong162 - this.aLong164);
				}
			}
		} catch (@Pc(402) IOException local402) {
			this.aLong167 = -1L;
			throw local402;
		}
	}

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "(B)V")
	public void method5273() throws IOException {
		this.method5271();
		this.aClass204_1.method4677();
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Z)J")
	public long method5274() {
		return this.aLong166;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(BJ)V")
	public void method5275(@OriginalArg(1) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method5267());
		}
		this.aLong162 = arg0;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "([BZ)V")
	public void method5276(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method5268(0, arg0.length, arg0);
	}
}
