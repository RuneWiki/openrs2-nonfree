import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wh")
public final class Class246 {

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "J")
	private long aLong233;

	@OriginalMember(owner = "client!wh", name = "q", descriptor = "I")
	private int anInt6433;

	@OriginalMember(owner = "client!wh", name = "e", descriptor = "J")
	private long aLong235 = -1L;

	@OriginalMember(owner = "client!wh", name = "p", descriptor = "J")
	private long aLong237 = -1L;

	@OriginalMember(owner = "client!wh", name = "h", descriptor = "I")
	private int anInt6428 = 0;

	@OriginalMember(owner = "client!wh", name = "s", descriptor = "Lclient!ia;")
	private final Class106 aClass106_4;

	@OriginalMember(owner = "client!wh", name = "r", descriptor = "J")
	private long aLong238;

	@OriginalMember(owner = "client!wh", name = "d", descriptor = "J")
	private long aLong234;

	@OriginalMember(owner = "client!wh", name = "m", descriptor = "J")
	private long aLong236;

	@OriginalMember(owner = "client!wh", name = "n", descriptor = "[B")
	private final byte[] aByteArray98;

	@OriginalMember(owner = "client!wh", name = "o", descriptor = "[B")
	private final byte[] aByteArray99;

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Lclient!ia;II)V")
	public Class246(@OriginalArg(0) Class106 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass106_4 = arg0;
		this.aLong234 = this.aLong238 = arg0.method2292();
		this.aLong236 = 0L;
		this.aByteArray98 = new byte[arg2];
		this.aByteArray99 = new byte[arg1];
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(BJ)V")
	public void method5681(@OriginalArg(1) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method5683());
		}
		this.aLong236 = arg0;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Z)J")
	public long method5682() {
		return this.aLong234;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)Ljava/io/File;")
	private File method5683() {
		return this.aClass106_4.method2291();
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(I[BII)V")
	public void method5684(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (this.aLong234 < (long) arg0 + this.aLong236) {
				this.aLong234 = this.aLong236 + (long) arg0;
			}
			if (this.aLong237 != -1L && (this.aLong236 < this.aLong237 || this.aLong237 + (long) this.anInt6428 < this.aLong236)) {
				this.method5686();
			}
			if (this.aLong237 != -1L && (long) arg0 + this.aLong236 > (long) this.aByteArray98.length + this.aLong237) {
				@Pc(85) int local85 = (int) (this.aLong237 + (long) this.aByteArray98.length - this.aLong236);
				Static400.method1877(arg1, arg2, this.aByteArray98, (int) (this.aLong236 - this.aLong237), local85);
				this.aLong236 += local85;
				arg2 += local85;
				arg0 -= local85;
				this.anInt6428 = this.aByteArray98.length;
				this.method5686();
			}
			if (arg0 > this.aByteArray98.length) {
				if (this.aLong236 != this.aLong233) {
					this.aClass106_4.method2293(this.aLong236);
					this.aLong233 = this.aLong236;
				}
				this.aClass106_4.method2289(arg0, arg2, arg1);
				this.aLong233 += arg0;
				if (this.aLong238 < this.aLong233) {
					this.aLong238 = this.aLong233;
				}
				@Pc(176) long local176 = -1L;
				@Pc(178) long local178 = -1L;
				if (this.aLong236 >= this.aLong235 && this.aLong236 < (long) this.anInt6433 + this.aLong235) {
					local176 = this.aLong236;
				} else if (this.aLong235 >= this.aLong236 && this.aLong236 + (long) arg0 > this.aLong235) {
					local176 = this.aLong235;
				}
				if (this.aLong235 < (long) arg0 + this.aLong236 && this.aLong235 + (long) this.anInt6433 >= this.aLong236 + (long) arg0) {
					local178 = this.aLong236 + (long) arg0;
				} else if ((long) this.anInt6433 + this.aLong235 > this.aLong236 && this.aLong235 + (long) this.anInt6433 <= (long) arg0 + this.aLong236) {
					local178 = (long) this.anInt6433 + this.aLong235;
				}
				if (local176 > -1L && local176 < local178) {
					@Pc(309) int local309 = (int) (local178 - local176);
					Static400.method1877(arg1, (int) (local176 + (long) arg2 - this.aLong236), this.aByteArray99, (int) (local176 - this.aLong235), local309);
				}
				this.aLong236 += arg0;
			} else if (arg0 > 0) {
				if (this.aLong237 == -1L) {
					this.aLong237 = this.aLong236;
				}
				Static400.method1877(arg1, arg2, this.aByteArray98, (int) (this.aLong236 - this.aLong237), arg0);
				this.aLong236 += arg0;
				if ((long) this.anInt6428 < this.aLong236 - this.aLong237) {
					this.anInt6428 = (int) (this.aLong236 - this.aLong237);
				}
			}
		} catch (@Pc(401) IOException local401) {
			this.aLong233 = -1L;
			throw local401;
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "([BI)V")
	public void method5685(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method5688(arg0.length, 0, arg0);
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)V")
	private void method5686() throws IOException {
		if (this.aLong237 == -1L) {
			return;
		}
		if (this.aLong233 != this.aLong237) {
			this.aClass106_4.method2293(this.aLong237);
			this.aLong233 = this.aLong237;
		}
		this.aClass106_4.method2289(this.anInt6428, 0, this.aByteArray98);
		this.aLong233 += this.anInt6428;
		if (this.aLong238 < this.aLong233) {
			this.aLong238 = this.aLong233;
		}
		@Pc(51) long local51 = -1L;
		@Pc(53) long local53 = -1L;
		if (this.aLong237 >= this.aLong235 && this.aLong237 < (long) this.anInt6433 + this.aLong235) {
			local51 = this.aLong237;
		} else if (this.aLong235 >= this.aLong237 && (long) this.anInt6428 + this.aLong237 > this.aLong235) {
			local51 = this.aLong235;
		}
		if (this.aLong237 + (long) this.anInt6428 > this.aLong235 && this.aLong237 + (long) this.anInt6428 <= this.aLong235 + (long) this.anInt6433) {
			local53 = (long) this.anInt6428 + this.aLong237;
		} else if ((long) this.anInt6433 + this.aLong235 > this.aLong237 && (long) this.anInt6433 + this.aLong235 <= this.aLong237 - -((long) this.anInt6428)) {
			local53 = (long) this.anInt6433 + this.aLong235;
		}
		if (local51 > -1L && local51 < local53) {
			@Pc(190) int local190 = (int) (local53 - local51);
			Static400.method1877(this.aByteArray98, (int) (local51 - this.aLong237), this.aByteArray99, (int) (local51 - this.aLong235), local190);
		}
		this.anInt6428 = 0;
		this.aLong237 = -1L;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(III[B)V")
	public void method5688(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if (arg0 > arg2.length) {
				throw new ArrayIndexOutOfBoundsException(arg0 - arg2.length);
			}
			if (this.aLong237 != -1L && this.aLong237 <= this.aLong236 && this.aLong237 + (long) this.anInt6428 >= (long) arg0 + this.aLong236) {
				Static400.method1877(this.aByteArray98, (int) (this.aLong236 - this.aLong237), arg2, 0, arg0);
				this.aLong236 += arg0;
				return;
			}
			@Pc(78) long local78 = this.aLong236;
			@Pc(82) int local82 = arg0;
			@Pc(119) int local119;
			if (this.aLong235 <= this.aLong236 && (long) this.anInt6433 + this.aLong235 > this.aLong236) {
				local119 = (int) (this.aLong235 + (long) this.anInt6433 - this.aLong236);
				if (local119 > arg0) {
					local119 = arg0;
				}
				Static400.method1877(this.aByteArray99, (int) (this.aLong236 - this.aLong235), arg2, 0, local119);
				arg1 = local119;
				this.aLong236 += local119;
				arg0 -= local119;
			}
			if (arg0 > this.aByteArray99.length) {
				this.aClass106_4.method2293(this.aLong236);
				this.aLong233 = this.aLong236;
				while (arg0 > 0) {
					local119 = this.aClass106_4.method2288(arg0, arg1, arg2);
					if (local119 == -1) {
						break;
					}
					this.aLong233 += local119;
					arg0 -= local119;
					arg1 += local119;
					this.aLong236 += local119;
				}
			} else if (arg0 > 0) {
				this.method5689();
				local119 = arg0;
				if (arg0 > this.anInt6433) {
					local119 = this.anInt6433;
				}
				Static400.method1877(this.aByteArray99, 0, arg2, arg1, local119);
				this.aLong236 += local119;
				arg0 -= local119;
				arg1 += local119;
			}
			if (this.aLong237 != -1L) {
				if (this.aLong236 < this.aLong237 && arg0 > 0) {
					local119 = (int) (this.aLong237 - this.aLong236) + arg1;
					if (local119 > arg1 + arg0) {
						local119 = arg1 + arg0;
					}
					while (arg1 < local119) {
						arg0--;
						arg2[arg1++] = 0;
						this.aLong236++;
					}
				}
				@Pc(327) long local327 = -1L;
				if (this.aLong237 >= local78 && (long) local82 + local78 > this.aLong237) {
					local327 = this.aLong237;
				} else if (this.aLong237 <= local78 && (long) this.anInt6428 + this.aLong237 > local78) {
					local327 = local78;
				}
				@Pc(379) long local379 = -1L;
				if (this.aLong237 + (long) this.anInt6428 > local78 && (long) local82 + local78 >= this.aLong237 - -((long) this.anInt6428)) {
					local379 = (long) this.anInt6428 + this.aLong237;
				} else if (this.aLong237 < (long) local82 + local78 && this.aLong237 + (long) this.anInt6428 >= (long) local82 + local78) {
					local379 = (long) local82 + local78;
				}
				if (local327 > -1L && local379 > local327) {
					@Pc(460) int local460 = (int) (local379 - local327);
					Static400.method1877(this.aByteArray98, (int) (local327 - this.aLong237), arg2, (int) (local327 - local78), local460);
					if (local379 > this.aLong236) {
						arg0 = (int) ((long) arg0 + this.aLong236 - local379);
						this.aLong236 = local379;
					}
				}
			}
		} catch (@Pc(497) IOException local497) {
			this.aLong233 = -1L;
			throw local497;
		}
		if (arg0 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(B)V")
	private void method5689() throws IOException {
		this.anInt6433 = 0;
		if (this.aLong236 != this.aLong233) {
			this.aClass106_4.method2293(this.aLong236);
			this.aLong233 = this.aLong236;
		}
		this.aLong235 = this.aLong236;
		while (this.anInt6433 < this.aByteArray99.length) {
			@Pc(43) int local43 = this.aByteArray99.length - this.anInt6433;
			if (local43 > 200000000) {
				local43 = 200000000;
			}
			@Pc(60) int local60 = this.aClass106_4.method2288(local43, this.anInt6433, this.aByteArray99);
			if (local60 == -1) {
				break;
			}
			this.aLong233 += local60;
			this.anInt6433 += local60;
		}
	}
}
