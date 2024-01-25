import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rt")
public final class Class302 {

	@OriginalMember(owner = "client!rt", name = "i", descriptor = "J")
	private long aLong211;

	@OriginalMember(owner = "client!rt", name = "s", descriptor = "I")
	private int anInt8038;

	@OriginalMember(owner = "client!rt", name = "h", descriptor = "J")
	private long aLong210 = -1L;

	@OriginalMember(owner = "client!rt", name = "t", descriptor = "I")
	private int anInt8039 = 0;

	@OriginalMember(owner = "client!rt", name = "g", descriptor = "J")
	private long aLong209 = -1L;

	@OriginalMember(owner = "client!rt", name = "o", descriptor = "Lclient!pk;")
	private final Class268 aClass268_4;

	@OriginalMember(owner = "client!rt", name = "n", descriptor = "J")
	private long aLong212;

	@OriginalMember(owner = "client!rt", name = "r", descriptor = "J")
	private long aLong214;

	@OriginalMember(owner = "client!rt", name = "j", descriptor = "[B")
	private final byte[] aByteArray84;

	@OriginalMember(owner = "client!rt", name = "p", descriptor = "J")
	private long aLong213;

	@OriginalMember(owner = "client!rt", name = "c", descriptor = "[B")
	private final byte[] aByteArray83;

	@OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(Lclient!pk;II)V")
	public Class302(@OriginalArg(0) Class268 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass268_4 = arg0;
		this.aLong214 = this.aLong212 = arg0.method5812();
		this.aByteArray84 = new byte[arg2];
		this.aLong213 = 0L;
		this.aByteArray83 = new byte[arg1];
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(I[BIB)V")
	public void method6450(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if (this.aLong214 < (long) arg2 + this.aLong213) {
				this.aLong214 = (long) arg2 + this.aLong213;
			}
			if (this.aLong210 != -1L && (this.aLong213 < this.aLong210 || this.aLong210 + (long) this.anInt8039 < this.aLong213)) {
				this.method6453();
			}
			if (this.aLong210 != -1L && (long) arg2 + this.aLong213 > (long) this.aByteArray84.length + this.aLong210) {
				@Pc(87) int local87 = (int) (this.aLong210 + (long) this.aByteArray84.length - this.aLong213);
				Static598.method774(arg1, arg0, this.aByteArray84, (int) (this.aLong213 - this.aLong210), local87);
				this.aLong213 += local87;
				arg0 += local87;
				arg2 -= local87;
				this.anInt8039 = this.aByteArray84.length;
				this.method6453();
			}
			if (this.aByteArray84.length < arg2) {
				if (this.aLong213 != this.aLong211) {
					this.aClass268_4.method5815(this.aLong213);
					this.aLong211 = this.aLong213;
				}
				this.aClass268_4.method5810(arg1, arg2, arg0);
				this.aLong211 += arg2;
				if (this.aLong211 > this.aLong212) {
					this.aLong212 = this.aLong211;
				}
				@Pc(181) long local181 = -1L;
				@Pc(183) long local183 = -1L;
				if (this.aLong209 <= this.aLong213 && this.aLong209 + (long) this.anInt8038 > this.aLong213) {
					local181 = this.aLong213;
				} else if (this.aLong209 >= this.aLong213 && (long) arg2 + this.aLong213 > this.aLong209) {
					local181 = this.aLong209;
				}
				if ((long) arg2 + this.aLong213 > this.aLong209 && this.aLong213 + (long) arg2 <= (long) this.anInt8038 + this.aLong209) {
					local183 = this.aLong213 + (long) arg2;
				} else if ((long) this.anInt8038 + this.aLong209 > this.aLong213 && this.aLong213 + (long) arg2 >= this.aLong209 + (long) this.anInt8038) {
					local183 = this.aLong209 + (long) this.anInt8038;
				}
				if (local181 > -1L && local181 < local183) {
					@Pc(317) int local317 = (int) (local183 - local181);
					Static598.method774(arg1, (int) (local181 + (long) arg0 - this.aLong213), this.aByteArray83, (int) (local181 - this.aLong209), local317);
				}
				this.aLong213 += arg2;
			} else if (arg2 > 0) {
				if (this.aLong210 == -1L) {
					this.aLong210 = this.aLong213;
				}
				Static598.method774(arg1, arg0, this.aByteArray84, (int) (this.aLong213 - this.aLong210), arg2);
				this.aLong213 += arg2;
				if ((long) this.anInt8039 < this.aLong213 - this.aLong210) {
					this.anInt8039 = (int) (this.aLong213 - this.aLong210);
				}
			}
		} catch (@Pc(405) IOException local405) {
			this.aLong211 = -1L;
			throw local405;
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(I)J")
	public long method6451() {
		return this.aLong214;
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(ZJ)V")
	public void method6452(@OriginalArg(1) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method6454());
		}
		this.aLong213 = arg0;
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(B)V")
	private void method6453() throws IOException {
		if (this.aLong210 == -1L) {
			return;
		}
		if (this.aLong210 != this.aLong211) {
			this.aClass268_4.method5815(this.aLong210);
			this.aLong211 = this.aLong210;
		}
		this.aClass268_4.method5810(this.aByteArray84, this.anInt8039, 0);
		this.aLong211 += this.anInt8039;
		if (this.aLong212 < this.aLong211) {
			this.aLong212 = this.aLong211;
		}
		@Pc(66) long local66 = -1L;
		if (this.aLong210 >= this.aLong209 && (long) this.anInt8038 + this.aLong209 > this.aLong210) {
			local66 = this.aLong210;
		} else if (this.aLong209 >= this.aLong210 && (long) this.anInt8039 + this.aLong210 > this.aLong209) {
			local66 = this.aLong209;
		}
		@Pc(116) long local116 = -1L;
		if (this.aLong210 + (long) this.anInt8039 > this.aLong209 && this.aLong209 + (long) this.anInt8038 >= this.aLong210 + (long) this.anInt8039) {
			local116 = this.aLong210 + (long) this.anInt8039;
		} else if (this.aLong209 + (long) this.anInt8038 > this.aLong210 && (long) this.anInt8039 + this.aLong210 >= this.aLong209 - -((long) this.anInt8038)) {
			local116 = this.aLong209 + (long) this.anInt8038;
		}
		if (local66 > -1L && local116 > local66) {
			@Pc(210) int local210 = (int) (local116 - local66);
			Static598.method774(this.aByteArray84, (int) (local66 - this.aLong210), this.aByteArray83, (int) (local66 - this.aLong209), local210);
		}
		this.aLong210 = -1L;
		this.anInt8039 = 0;
	}

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "(I)Ljava/io/File;")
	private File method6454() {
		return this.aClass268_4.method5817();
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "([BIII)V")
	public void method6455(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg0.length < arg2) {
				throw new ArrayIndexOutOfBoundsException(arg2 - arg0.length);
			}
			if (this.aLong210 != -1L && this.aLong210 <= this.aLong213 && (long) this.anInt8039 + this.aLong210 >= this.aLong213 - -((long) arg2)) {
				Static598.method774(this.aByteArray84, (int) (this.aLong213 - this.aLong210), arg0, 0, arg2);
				this.aLong213 += arg2;
				return;
			}
			@Pc(74) long local74 = this.aLong213;
			@Pc(78) int local78 = arg2;
			@Pc(110) int local110;
			if (this.aLong213 >= this.aLong209 && this.aLong213 < (long) this.anInt8038 + this.aLong209) {
				local110 = (int) ((long) this.anInt8038 + this.aLong209 - this.aLong213);
				if (arg2 < local110) {
					local110 = arg2;
				}
				Static598.method774(this.aByteArray83, (int) (this.aLong213 - this.aLong209), arg0, 0, local110);
				arg2 -= local110;
				arg1 = local110;
				this.aLong213 += local110;
			}
			if (this.aByteArray83.length < arg2) {
				this.aClass268_4.method5815(this.aLong213);
				this.aLong211 = this.aLong213;
				while (arg2 > 0) {
					local110 = this.aClass268_4.method5813(arg0, arg2, arg1);
					if (local110 == -1) {
						break;
					}
					arg2 -= local110;
					this.aLong213 += local110;
					this.aLong211 += local110;
					arg1 += local110;
				}
			} else if (arg2 > 0) {
				this.method6459();
				local110 = arg2;
				if (arg2 > this.anInt8038) {
					local110 = this.anInt8038;
				}
				Static598.method774(this.aByteArray83, 0, arg0, arg1, local110);
				arg1 += local110;
				this.aLong213 += local110;
				arg2 -= local110;
			}
			if (this.aLong210 != -1L) {
				if (this.aLong213 < this.aLong210 && arg2 > 0) {
					local110 = arg1 + (int) (this.aLong210 - this.aLong213);
					if (arg2 + arg1 < local110) {
						local110 = arg2 + arg1;
					}
					while (local110 > arg1) {
						arg2--;
						arg0[arg1++] = 0;
						this.aLong213++;
					}
				}
				@Pc(306) long local306 = -1L;
				@Pc(308) long local308 = -1L;
				if (this.aLong210 >= local74 && (long) local78 + local74 > this.aLong210) {
					local306 = this.aLong210;
				} else if (local74 >= this.aLong210 && local74 < (long) this.anInt8039 + this.aLong210) {
					local306 = local74;
				}
				if (local74 < this.aLong210 + (long) this.anInt8039 && this.aLong210 + (long) this.anInt8039 <= (long) local78 + local74) {
					local308 = (long) this.anInt8039 + this.aLong210;
				} else if ((long) local78 + local74 > this.aLong210 && local74 + (long) local78 <= (long) this.anInt8039 + this.aLong210) {
					local308 = (long) local78 + local74;
				}
				if (local306 > -1L && local308 > local306) {
					@Pc(438) int local438 = (int) (local308 - local306);
					Static598.method774(this.aByteArray84, (int) (local306 - this.aLong210), arg0, (int) (local306 - local74), local438);
					if (local308 > this.aLong213) {
						arg2 = (int) ((long) arg2 + this.aLong213 - local308);
						this.aLong213 = local308;
					}
				}
			}
		} catch (@Pc(477) IOException local477) {
			this.aLong211 = -1L;
			throw local477;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(I[B)V")
	public void method6456(@OriginalArg(1) byte[] arg0) throws IOException {
		this.method6455(arg0, 0, arg0.length);
	}

	@OriginalMember(owner = "client!rt", name = "c", descriptor = "(B)V")
	public void method6458() throws IOException {
		this.method6453();
		this.aClass268_4.method5816();
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(Z)V")
	private void method6459() throws IOException {
		this.anInt8038 = 0;
		if (this.aLong211 != this.aLong213) {
			this.aClass268_4.method5815(this.aLong213);
			this.aLong211 = this.aLong213;
		}
		this.aLong209 = this.aLong213;
		while (this.aByteArray83.length > this.anInt8038) {
			@Pc(37) int local37 = this.aByteArray83.length - this.anInt8038;
			if (local37 > 200000000) {
				local37 = 200000000;
			}
			@Pc(52) int local52 = this.aClass268_4.method5813(this.aByteArray83, local37, this.anInt8038);
			if (local52 == -1) {
				break;
			}
			this.anInt8038 += local52;
			this.aLong211 += local52;
		}
	}
}
