import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public final class Class5 {

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "J")
	private long aLong18;

	@OriginalMember(owner = "client!bc", name = "h", descriptor = "I")
	private int anInt602;

	@OriginalMember(owner = "client!bc", name = "r", descriptor = "I")
	private int anInt608 = 0;

	@OriginalMember(owner = "client!bc", name = "C", descriptor = "J")
	private long aLong22 = -1L;

	@OriginalMember(owner = "client!bc", name = "D", descriptor = "J")
	private long aLong23 = -1L;

	@OriginalMember(owner = "client!bc", name = "i", descriptor = "Lclient!vh;")
	private final Class87 aClass87_1;

	@OriginalMember(owner = "client!bc", name = "t", descriptor = "J")
	private long aLong21;

	@OriginalMember(owner = "client!bc", name = "p", descriptor = "J")
	private long aLong20;

	@OriginalMember(owner = "client!bc", name = "g", descriptor = "[B")
	private final byte[] aByteArray6;

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "J")
	private long aLong19;

	@OriginalMember(owner = "client!bc", name = "y", descriptor = "[B")
	private final byte[] aByteArray7;

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Lclient!vh;II)V")
	public Class5(@OriginalArg(0) Class87 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass87_1 = arg0;
		this.aLong20 = this.aLong21 = arg0.method2753();
		this.aByteArray6 = new byte[arg1];
		this.aLong19 = 0L;
		this.aByteArray7 = new byte[arg2];
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(III[B)V")
	public void method387(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if (this.aLong19 + (long) arg1 > this.aLong20) {
				this.aLong20 = (long) arg1 + this.aLong19;
			}
			if (this.aLong23 != -1L && (this.aLong19 < this.aLong23 || this.aLong19 > (long) this.anInt608 + this.aLong23)) {
				this.method392();
			}
			if (this.aLong23 != -1L && this.aLong19 + (long) arg1 > this.aLong23 + (long) this.aByteArray7.length) {
				@Pc(98) int local98 = (int) ((long) this.aByteArray7.length + this.aLong23 - this.aLong19);
				arg1 -= local98;
				Static184.method1640(arg2, arg0, this.aByteArray7, (int) (this.aLong19 - this.aLong23), local98);
				arg0 += local98;
				this.aLong19 += local98;
				this.anInt608 = this.aByteArray7.length;
				this.method392();
			}
			if (arg1 > this.aByteArray7.length) {
				if (this.aLong19 != this.aLong18) {
					this.aClass87_1.method2750(this.aLong19);
					this.aLong18 = this.aLong19;
				}
				this.aClass87_1.method2748(arg1, arg0, arg2);
				this.aLong18 += arg1;
				@Pc(177) long local177 = -1L;
				if (this.aLong21 < this.aLong18) {
					this.aLong21 = this.aLong18;
				}
				if (this.aLong22 <= this.aLong19 && this.aLong19 < (long) this.anInt602 + this.aLong22) {
					local177 = this.aLong19;
				} else if (this.aLong22 >= this.aLong19 && this.aLong22 < this.aLong19 + (long) arg1) {
					local177 = this.aLong22;
				}
				@Pc(237) long local237 = -1L;
				if (this.aLong19 + (long) arg1 > this.aLong22 && (long) arg1 + this.aLong19 <= (long) this.anInt602 + this.aLong22) {
					local237 = (long) arg1 + this.aLong19;
				} else if ((long) this.anInt602 + this.aLong22 > this.aLong19 && this.aLong19 + (long) arg1 >= (long) this.anInt602 + this.aLong22) {
					local237 = this.aLong22 + (long) this.anInt602;
				}
				if (local177 > -1L && local177 < local237) {
					@Pc(326) int local326 = (int) (local237 - local177);
					Static184.method1640(arg2, (int) (local177 + (long) arg0 - this.aLong19), this.aByteArray6, (int) (local177 - this.aLong22), local326);
				}
				this.aLong19 += arg1;
			} else if (arg1 > 0) {
				if (this.aLong23 == -1L) {
					this.aLong23 = this.aLong19;
				}
				Static184.method1640(arg2, arg0, this.aByteArray7, (int) (this.aLong19 - this.aLong23), arg1);
				this.aLong19 += arg1;
				if ((long) this.anInt608 < this.aLong19 - this.aLong23) {
					this.anInt608 = (int) (this.aLong19 - this.aLong23);
				}
			}
		} catch (@Pc(414) IOException local414) {
			this.aLong18 = -1L;
			throw local414;
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "([BIII)V")
	public void method388(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if (arg1 > arg0.length) {
				throw new ArrayIndexOutOfBoundsException(arg1 - arg0.length);
			}
			if (this.aLong23 != -1L && this.aLong19 >= this.aLong23 && (long) this.anInt608 + this.aLong23 >= this.aLong19 + (long) arg1) {
				Static184.method1640(this.aByteArray7, (int) (this.aLong19 - this.aLong23), arg0, 0, arg1);
				this.aLong19 += arg1;
				return;
			}
			@Pc(80) long local80 = this.aLong19;
			@Pc(92) int local92 = arg1;
			@Pc(122) int local122;
			if (this.aLong19 >= this.aLong22 && this.aLong19 < this.aLong22 + (long) this.anInt602) {
				local122 = (int) (this.aLong22 + (long) this.anInt602 - this.aLong19);
				if (local122 > arg1) {
					local122 = arg1;
				}
				arg1 -= local122;
				Static184.method1640(this.aByteArray6, (int) (this.aLong19 - this.aLong22), arg0, 0, local122);
				this.aLong19 += local122;
				arg2 = local122;
			}
			if (this.aByteArray6.length < arg1) {
				this.aClass87_1.method2750(this.aLong19);
				this.aLong18 = this.aLong19;
				while (arg1 > 0) {
					local122 = this.aClass87_1.method2749(arg1, arg0, arg2);
					if (local122 == -1) {
						break;
					}
					arg1 -= local122;
					this.aLong19 += local122;
					arg2 += local122;
					this.aLong18 += local122;
				}
			} else if (arg1 > 0) {
				local122 = arg1;
				this.method397();
				if (this.anInt602 < arg1) {
					local122 = this.anInt602;
				}
				arg1 -= local122;
				Static184.method1640(this.aByteArray6, 0, arg0, arg2, local122);
				arg2 += local122;
				this.aLong19 += local122;
			}
			if (this.aLong23 != -1L) {
				if (this.aLong23 > this.aLong19 && arg1 > 0) {
					local122 = (int) (this.aLong23 - this.aLong19) + arg2;
					if (local122 > arg1 + arg2) {
						local122 = arg1 + arg2;
					}
					while (arg2 < local122) {
						arg1--;
						arg0[arg2++] = 0;
						this.aLong19++;
					}
				}
				@Pc(322) long local322 = -1L;
				if (local80 <= this.aLong23 && (long) local92 + local80 > this.aLong23) {
					local322 = this.aLong23;
				} else if (local80 >= this.aLong23 && this.aLong23 + (long) this.anInt608 > local80) {
					local322 = local80;
				}
				@Pc(367) long local367 = -1L;
				if (local80 < (long) this.anInt608 + this.aLong23 && this.aLong23 + (long) this.anInt608 <= (long) local92 + local80) {
					local367 = (long) this.anInt608 + this.aLong23;
				} else if (local80 + (long) local92 > this.aLong23 && this.aLong23 + (long) this.anInt608 >= (long) local92 + local80) {
					local367 = (long) local92 + local80;
				}
				if (local322 > -1L && local367 > local322) {
					@Pc(454) int local454 = (int) (local367 - local322);
					Static184.method1640(this.aByteArray7, (int) (local322 - this.aLong23), arg0, (int) (local322 - local80), local454);
					if (local367 > this.aLong19) {
						arg1 = (int) ((long) arg1 + this.aLong19 - local367);
						this.aLong19 = local367;
					}
				}
			}
		} catch (@Pc(495) IOException local495) {
			this.aLong18 = -1L;
			throw local495;
		}
		if (arg1 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)Ljava/io/File;")
	private File method390() {
		return this.aClass87_1.method2751();
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IJ)V")
	public void method391(@OriginalArg(1) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method390());
		}
		this.aLong19 = arg0;
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)V")
	private void method392() throws IOException {
		if ((long) -1 == this.aLong23) {
			return;
		}
		if (this.aLong23 != this.aLong18) {
			this.aClass87_1.method2750(this.aLong23);
			this.aLong18 = this.aLong23;
		}
		this.aClass87_1.method2748(this.anInt608, 0, this.aByteArray7);
		this.aLong18 += this.anInt608;
		@Pc(46) long local46 = -1L;
		if (this.aLong23 >= this.aLong22 && this.aLong23 < this.aLong22 + (long) this.anInt602) {
			local46 = this.aLong23;
		} else if (this.aLong22 >= this.aLong23 && this.aLong22 < this.aLong23 + (long) this.anInt608) {
			local46 = this.aLong22;
		}
		@Pc(96) long local96 = -1L;
		if ((long) this.anInt608 + this.aLong23 > this.aLong22 && (long) this.anInt608 + this.aLong23 <= this.aLong22 - -((long) this.anInt602)) {
			local96 = this.aLong23 + (long) this.anInt608;
		} else if (this.aLong23 < (long) this.anInt602 + this.aLong22 && (long) this.anInt608 + this.aLong23 >= this.aLong22 + (long) this.anInt602) {
			local96 = (long) this.anInt602 + this.aLong22;
		}
		if (this.aLong18 > this.aLong21) {
			this.aLong21 = this.aLong18;
		}
		if (local46 > -1L && local96 > local46) {
			@Pc(198) int local198 = (int) (local96 - local46);
			Static184.method1640(this.aByteArray7, (int) (local46 - this.aLong23), this.aByteArray6, (int) (local46 - this.aLong22), local198);
		}
		this.anInt608 = 0;
		this.aLong23 = -1L;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "([BI)V")
	public void method393(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method388(arg0, arg0.length, 0);
	}

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "(I)J")
	public long method394() {
		return this.aLong20;
	}

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "(B)V")
	private void method397() throws IOException {
		this.anInt602 = 0;
		if (this.aLong18 != this.aLong19) {
			this.aClass87_1.method2750(this.aLong19);
			this.aLong18 = this.aLong19;
		}
		this.aLong22 = this.aLong19;
		while (this.anInt602 < this.aByteArray6.length) {
			@Pc(54) int local54 = this.aClass87_1.method2749(this.aByteArray6.length - this.anInt602, this.aByteArray6, this.anInt602);
			if (local54 == -1) {
				break;
			}
			this.anInt602 += local54;
			this.aLong18 += local54;
		}
	}

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "(I)V")
	public void method398() throws IOException {
		this.method392();
		this.aClass87_1.method2752();
	}
}
