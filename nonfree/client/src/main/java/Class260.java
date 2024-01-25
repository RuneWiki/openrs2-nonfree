import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nk")
public final class Class260 {

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "J")
	private long aLong211;

	@OriginalMember(owner = "client!nk", name = "m", descriptor = "I")
	private int anInt6991;

	@OriginalMember(owner = "client!nk", name = "k", descriptor = "J")
	private long aLong210 = -1L;

	@OriginalMember(owner = "client!nk", name = "l", descriptor = "J")
	private long aLong213 = -1L;

	@OriginalMember(owner = "client!nk", name = "u", descriptor = "I")
	private int anInt6985 = 0;

	@OriginalMember(owner = "client!nk", name = "t", descriptor = "Lclient!ob;")
	private final Class268 aClass268_1;

	@OriginalMember(owner = "client!nk", name = "n", descriptor = "J")
	private long aLong212;

	@OriginalMember(owner = "client!nk", name = "f", descriptor = "J")
	private long aLong209;

	@OriginalMember(owner = "client!nk", name = "j", descriptor = "[B")
	private final byte[] aByteArray90;

	@OriginalMember(owner = "client!nk", name = "p", descriptor = "[B")
	private final byte[] aByteArray91;

	@OriginalMember(owner = "client!nk", name = "v", descriptor = "J")
	private long aLong214;

	@OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Lclient!ob;II)V")
	public Class260(@OriginalArg(0) Class268 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass268_1 = arg0;
		this.aLong209 = this.aLong212 = arg0.method6514();
		this.aByteArray90 = new byte[arg2];
		this.aByteArray91 = new byte[arg1];
		this.aLong214 = 0L;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(JB)V")
	public void method6257(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method6260());
		}
		this.aLong214 = arg0;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)V")
	public void method6258() throws IOException {
		this.method6265();
		this.aClass268_1.method6511();
	}

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "(I)V")
	private void method6259() throws IOException {
		this.anInt6991 = 0;
		if (this.aLong214 != this.aLong211) {
			this.aClass268_1.method6512(this.aLong214);
			this.aLong211 = this.aLong214;
		}
		this.aLong213 = this.aLong214;
		while (this.anInt6991 < this.aByteArray91.length) {
			@Pc(46) int local46 = this.aByteArray91.length - this.anInt6991;
			if (local46 > 200000000) {
				local46 = 200000000;
			}
			@Pc(61) int local61 = this.aClass268_1.method6508(this.aByteArray91, local46, this.anInt6991);
			if (local61 == -1) {
				break;
			}
			this.anInt6991 += local61;
			this.aLong211 += (long) local61;
		}
		if (2450 != 2450) {
			this.aLong211 = -43L;
		}
	}

	@OriginalMember(owner = "client!nk", name = "c", descriptor = "(I)Ljava/io/File;")
	private File method6260() {
		return this.aClass268_1.method6515();
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(Z[B)V")
	public void method6261(@OriginalArg(1) byte[] arg0) throws IOException {
		this.method6266(arg0, arg0.length, 0);
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(II[BZ)V")
	public void method6263(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		try {
			if (this.aLong209 < (long) arg0 + this.aLong214) {
				this.aLong209 = this.aLong214 + (long) arg0;
			}
			if (this.aLong210 != -1L && (this.aLong214 < this.aLong210 || this.aLong214 > (long) this.anInt6985 + this.aLong210)) {
				this.method6265();
			}
			if (this.aLong210 != -1L && (long) arg0 + this.aLong214 > this.aLong210 - -((long) this.aByteArray90.length)) {
				@Pc(106) int local106 = (int) (this.aLong210 + (long) this.aByteArray90.length - this.aLong214);
				Static728.method274(arg2, arg1, this.aByteArray90, (int) (this.aLong214 - this.aLong210), local106);
				arg1 += local106;
				arg0 -= local106;
				this.aLong214 += (long) local106;
				this.anInt6985 = this.aByteArray90.length;
				this.method6265();
			}
			if (arg0 > this.aByteArray90.length) {
				if (this.aLong214 != this.aLong211) {
					this.aClass268_1.method6512(this.aLong214);
					this.aLong211 = this.aLong214;
				}
				this.aClass268_1.method6517(arg2, arg0, arg1);
				this.aLong211 += (long) arg0;
				if (this.aLong212 < this.aLong211) {
					this.aLong212 = this.aLong211;
				}
				@Pc(199) long local199 = -1L;
				if (this.aLong213 <= this.aLong214 && this.aLong214 < (long) this.anInt6991 + this.aLong213) {
					local199 = this.aLong214;
				} else if (this.aLong214 <= this.aLong213 && (long) arg0 + this.aLong214 > this.aLong213) {
					local199 = this.aLong213;
				}
				@Pc(250) long local250 = -1L;
				if (this.aLong214 + (long) arg0 > this.aLong213 && (long) arg0 + this.aLong214 <= this.aLong213 - -((long) this.anInt6991)) {
					local250 = this.aLong214 + (long) arg0;
				} else if (this.aLong214 < (long) this.anInt6991 + this.aLong213 && (long) this.anInt6991 + this.aLong213 <= (long) arg0 + this.aLong214) {
					local250 = this.aLong213 + (long) this.anInt6991;
				}
				if (local199 > -1L && local199 < local250) {
					@Pc(337) int local337 = (int) (local250 - local199);
					Static728.method274(arg2, (int) ((long) arg1 + local199 - this.aLong214), this.aByteArray91, (int) (local199 - this.aLong213), local337);
				}
				this.aLong214 += (long) arg0;
			} else if (arg0 > 0) {
				if (this.aLong210 == -1L) {
					this.aLong210 = this.aLong214;
				}
				Static728.method274(arg2, arg1, this.aByteArray90, (int) (this.aLong214 - this.aLong210), arg0);
				this.aLong214 += (long) arg0;
				if ((long) this.anInt6985 < this.aLong214 - this.aLong210) {
					this.anInt6985 = (int) (this.aLong214 - this.aLong210);
				}
			}
		} catch (@Pc(428) IOException local428) {
			this.aLong211 = -1L;
			throw local428;
		}
	}

	@OriginalMember(owner = "client!nk", name = "d", descriptor = "(I)V")
	private void method6265() throws IOException {
		if (this.aLong210 == -1L) {
			return;
		}
		if (this.aLong210 != this.aLong211) {
			this.aClass268_1.method6512(this.aLong210);
			this.aLong211 = this.aLong210;
		}
		this.aClass268_1.method6517(this.aByteArray90, this.anInt6985, 0);
		this.aLong211 += (long) this.anInt6985;
		if (this.aLong211 > this.aLong212) {
			this.aLong212 = this.aLong211;
		}
		@Pc(67) long local67 = -1L;
		@Pc(69) long local69 = -1L;
		if (this.aLong213 <= this.aLong210 && this.aLong213 + (long) this.anInt6991 > this.aLong210) {
			local67 = this.aLong210;
		} else if (this.aLong213 >= this.aLong210 && this.aLong213 < (long) this.anInt6985 + this.aLong210) {
			local67 = this.aLong213;
		}
		if (this.aLong213 < (long) this.anInt6985 + this.aLong210 && this.aLong210 + (long) this.anInt6985 <= this.aLong213 - -((long) this.anInt6991)) {
			local69 = (long) this.anInt6985 + this.aLong210;
		} else if (this.aLong213 + (long) this.anInt6991 > this.aLong210 && this.aLong210 + (long) this.anInt6985 >= (long) this.anInt6991 + this.aLong213) {
			local69 = this.aLong213 + (long) this.anInt6991;
		}
		if (local67 > -1L && local67 < local69) {
			@Pc(225) int local225 = (int) (local69 - local67);
			Static728.method274(this.aByteArray90, (int) (local67 - this.aLong210), this.aByteArray91, (int) (local67 - this.aLong213), local225);
		}
		this.anInt6985 = 0;
		this.aLong210 = -1L;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "([BIII)V")
	public void method6266(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg1 > arg0.length) {
				throw new ArrayIndexOutOfBoundsException(arg1 - arg0.length);
			}
			if (this.aLong210 != -1L && this.aLong214 >= this.aLong210 && this.aLong214 + (long) arg1 <= this.aLong210 + (long) this.anInt6985) {
				Static728.method274(this.aByteArray90, (int) (this.aLong214 - this.aLong210), arg0, 0, arg1);
				this.aLong214 += (long) arg1;
				return;
			}
			@Pc(80) long local80 = this.aLong214;
			@Pc(88) int local88 = arg1;
			@Pc(123) int local123;
			if (this.aLong213 <= this.aLong214 && (long) this.anInt6991 + this.aLong213 > this.aLong214) {
				local123 = (int) (this.aLong213 + (long) this.anInt6991 - this.aLong214);
				if (arg1 < local123) {
					local123 = arg1;
				}
				Static728.method274(this.aByteArray91, (int) (this.aLong214 - this.aLong213), arg0, 0, local123);
				arg2 = local123;
				this.aLong214 += (long) local123;
				arg1 -= local123;
			}
			if (arg1 > this.aByteArray91.length) {
				this.aClass268_1.method6512(this.aLong214);
				this.aLong211 = this.aLong214;
				while (arg1 > 0) {
					local123 = this.aClass268_1.method6508(arg0, arg1, arg2);
					if (local123 == -1) {
						break;
					}
					this.aLong211 += (long) local123;
					this.aLong214 += (long) local123;
					arg2 += local123;
					arg1 -= local123;
				}
			} else if (arg1 > 0) {
				this.method6259();
				local123 = arg1;
				if (arg1 > this.anInt6991) {
					local123 = this.anInt6991;
				}
				Static728.method274(this.aByteArray91, 0, arg0, arg2, local123);
				arg2 += local123;
				this.aLong214 += (long) local123;
				arg1 -= local123;
			}
			if (this.aLong210 != -1L) {
				if (this.aLong214 < this.aLong210 && arg1 > 0) {
					local123 = (int) (this.aLong210 - this.aLong214) + arg2;
					if (local123 > arg1 + arg2) {
						local123 = arg2 + arg1;
					}
					while (arg2 < local123) {
						arg0[arg2++] = 0;
						arg1--;
						this.aLong214++;
					}
				}
				@Pc(319) long local319 = -1L;
				if (this.aLong210 >= local80 && local80 + (long) local88 > this.aLong210) {
					local319 = this.aLong210;
				} else if (local80 >= this.aLong210 && this.aLong210 + (long) this.anInt6985 > local80) {
					local319 = local80;
				}
				@Pc(370) long local370 = -1L;
				if ((long) this.anInt6985 + this.aLong210 > local80 && (long) local88 + local80 >= (long) this.anInt6985 + this.aLong210) {
					local370 = (long) this.anInt6985 + this.aLong210;
				} else if (this.aLong210 < local80 + (long) local88 && this.aLong210 + (long) this.anInt6985 >= (long) local88 + local80) {
					local370 = local80 + (long) local88;
				}
				if (local319 > -1L && local319 < local370) {
					@Pc(462) int local462 = (int) (local370 - local319);
					Static728.method274(this.aByteArray90, (int) (local319 - this.aLong210), arg0, (int) (local319 - local80), local462);
					if (local370 > this.aLong214) {
						arg1 = (int) ((long) arg1 + this.aLong214 - local370);
						this.aLong214 = local370;
					}
				}
			}
		} catch (@Pc(501) IOException local501) {
			this.aLong211 = -1L;
			throw local501;
		}
		if (arg1 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)J")
	public long method6267() {
		return this.aLong209;
	}
}
