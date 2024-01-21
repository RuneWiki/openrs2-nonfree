import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fe")
public final class Class26 {

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
	private int anInt1151;

	@OriginalMember(owner = "client!fe", name = "i", descriptor = "J")
	private long aLong41;

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "I")
	private int anInt1150 = 0;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "J")
	private long aLong38 = -1L;

	@OriginalMember(owner = "client!fe", name = "w", descriptor = "J")
	private long aLong42 = -1L;

	@OriginalMember(owner = "client!fe", name = "I", descriptor = "Lclient!qd;")
	private final Class68 aClass68_1;

	@OriginalMember(owner = "client!fe", name = "x", descriptor = "J")
	private long aLong43;

	@OriginalMember(owner = "client!fe", name = "e", descriptor = "J")
	private long aLong39;

	@OriginalMember(owner = "client!fe", name = "p", descriptor = "[B")
	private final byte[] aByteArray18;

	@OriginalMember(owner = "client!fe", name = "l", descriptor = "[B")
	private final byte[] aByteArray17;

	@OriginalMember(owner = "client!fe", name = "h", descriptor = "J")
	private long aLong40;

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(Lclient!qd;II)V")
	public Class26(@OriginalArg(0) Class68 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass68_1 = arg0;
		this.aLong39 = this.aLong43 = arg0.method2093();
		this.aByteArray18 = new byte[arg1];
		this.aByteArray17 = new byte[arg2];
		this.aLong40 = 0L;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Z)Ljava/io/File;")
	private File method884() {
		return this.aClass68_1.method2094();
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
	public void method885() throws IOException {
		this.method886();
		this.aClass68_1.method2092();
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V")
	private void method886() throws IOException {
		if (this.aLong38 == -1L) {
			return;
		}
		if (this.aLong41 != this.aLong38) {
			this.aClass68_1.method2096(this.aLong38);
			this.aLong41 = this.aLong38;
		}
		this.aClass68_1.method2091(this.aByteArray17, this.anInt1150, 0);
		this.aLong41 += this.anInt1150;
		@Pc(51) long local51 = -1L;
		if (this.aLong38 >= this.aLong42 && this.aLong42 + (long) this.anInt1151 > this.aLong38) {
			local51 = this.aLong38;
		} else if (this.aLong42 >= this.aLong38 && this.aLong38 + (long) this.anInt1150 > this.aLong42) {
			local51 = this.aLong42;
		}
		if (this.aLong43 < this.aLong41) {
			this.aLong43 = this.aLong41;
		}
		@Pc(115) long local115 = -1L;
		if ((long) this.anInt1150 + this.aLong38 > this.aLong42 && this.aLong38 + (long) this.anInt1150 <= (long) this.anInt1151 + this.aLong42) {
			local115 = this.aLong38 + (long) this.anInt1150;
		} else if ((long) this.anInt1151 + this.aLong42 > this.aLong38 && this.aLong38 + (long) this.anInt1150 >= (long) this.anInt1151 + this.aLong42) {
			local115 = this.aLong42 + (long) this.anInt1151;
		}
		if (local51 > -1L && local115 > local51) {
			@Pc(211) int local211 = (int) (local115 - local51);
			Static182.method1348(this.aByteArray17, (int) (local51 - this.aLong38), this.aByteArray18, (int) (local51 - this.aLong42), local211);
		}
		this.anInt1150 = 0;
		this.aLong38 = -1L;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "([BIBI)V")
	public void method887(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg0.length < arg2) {
				throw new ArrayIndexOutOfBoundsException(arg2 - arg0.length);
			}
			if (this.aLong38 != -1L && this.aLong40 >= this.aLong38 && this.aLong38 + (long) this.anInt1150 >= (long) arg2 + this.aLong40) {
				Static182.method1348(this.aByteArray17, (int) (this.aLong40 - this.aLong38), arg0, 0, arg2);
				this.aLong40 += arg2;
				return;
			}
			@Pc(71) long local71 = this.aLong40;
			@Pc(75) int local75 = arg2;
			@Pc(121) int local121;
			if (this.aLong40 >= this.aLong42 && this.aLong42 + (long) this.anInt1151 > this.aLong40) {
				local121 = (int) (this.aLong42 + (long) this.anInt1151 - this.aLong40);
				if (local121 > arg2) {
					local121 = arg2;
				}
				Static182.method1348(this.aByteArray18, (int) (this.aLong40 - this.aLong42), arg0, 0, local121);
				arg1 = local121;
				this.aLong40 += local121;
				arg2 -= local121;
			}
			if (arg2 > this.aByteArray18.length) {
				this.aClass68_1.method2096(this.aLong40);
				this.aLong41 = this.aLong40;
				while (arg2 > 0) {
					local121 = this.aClass68_1.method2095(arg1, arg0, arg2);
					if (local121 == -1) {
						break;
					}
					this.aLong41 += local121;
					arg1 += local121;
					this.aLong40 += local121;
					arg2 -= local121;
				}
			} else if (arg2 > 0) {
				this.method892();
				local121 = arg2;
				if (arg2 > this.anInt1151) {
					local121 = this.anInt1151;
				}
				Static182.method1348(this.aByteArray18, 0, arg0, arg1, local121);
				this.aLong40 += local121;
				arg2 -= local121;
				arg1 += local121;
			}
			if (this.aLong38 != -1L) {
				if (this.aLong38 > this.aLong40 && arg2 > 0) {
					local121 = (int) (this.aLong38 - this.aLong40) + arg1;
					if (arg2 + arg1 < local121) {
						local121 = arg2 + arg1;
					}
					while (arg1 < local121) {
						arg0[arg1++] = 0;
						this.aLong40++;
						arg2--;
					}
				}
				@Pc(309) long local309 = -1L;
				@Pc(311) long local311 = -1L;
				if (local71 <= this.aLong38 && (long) local75 + local71 > this.aLong38) {
					local309 = this.aLong38;
				} else if (this.aLong38 <= local71 && local71 < this.aLong38 + (long) this.anInt1150) {
					local309 = local71;
				}
				if (local71 < this.aLong38 + (long) this.anInt1150 && (long) this.anInt1150 + this.aLong38 <= local71 + (long) local75) {
					local311 = this.aLong38 + (long) this.anInt1150;
				} else if ((long) local75 + local71 > this.aLong38 && this.aLong38 + (long) this.anInt1150 >= local71 - -((long) local75)) {
					local311 = local71 + (long) local75;
				}
				if (local309 > -1L && local309 < local311) {
					@Pc(429) int local429 = (int) (local311 - local309);
					Static182.method1348(this.aByteArray17, (int) (local309 - this.aLong38), arg0, (int) (local309 - local71), local429);
					if (this.aLong40 < local311) {
						arg2 = (int) ((long) arg2 + this.aLong40 - local311);
						this.aLong40 = local311;
					}
				}
			}
		} catch (@Pc(467) IOException local467) {
			this.aLong41 = -1L;
			throw local467;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(BJ)V")
	public void method891(@OriginalArg(1) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method884());
		}
		this.aLong40 = arg0;
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(Z)V")
	private void method892() throws IOException {
		this.anInt1151 = 0;
		if (this.aLong41 != this.aLong40) {
			this.aClass68_1.method2096(this.aLong40);
			this.aLong41 = this.aLong40;
		}
		this.aLong42 = this.aLong40;
		while (this.aByteArray18.length > this.anInt1151) {
			@Pc(50) int local50 = this.aClass68_1.method2095(this.anInt1151, this.aByteArray18, this.aByteArray18.length - this.anInt1151);
			if (local50 == -1) {
				break;
			}
			this.anInt1151 += local50;
			this.aLong41 += local50;
		}
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(B)J")
	public long method893() {
		return this.aLong39;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(I[B)V")
	public void method894(@OriginalArg(1) byte[] arg0) throws IOException {
		this.method887(arg0, 0, arg0.length);
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(I[BII)V")
	public void method895(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if (this.aLong39 < this.aLong40 + (long) arg2) {
				this.aLong39 = (long) arg2 + this.aLong40;
			}
			if (this.aLong38 != -1L && (this.aLong38 > this.aLong40 || (long) this.anInt1150 + this.aLong38 < this.aLong40)) {
				this.method886();
			}
			if (this.aLong38 != -1L && (long) this.aByteArray17.length + this.aLong38 < this.aLong40 - -((long) arg2)) {
				@Pc(94) int local94 = (int) ((long) this.aByteArray17.length + this.aLong38 - this.aLong40);
				arg2 -= local94;
				Static182.method1348(arg1, arg0, this.aByteArray17, (int) (this.aLong40 - this.aLong38), local94);
				this.aLong40 += local94;
				arg0 += local94;
				this.anInt1150 = this.aByteArray17.length;
				this.method886();
			}
			if (arg2 > this.aByteArray17.length) {
				@Pc(141) long local141 = -1L;
				@Pc(143) long local143 = -1L;
				if (this.aLong41 != this.aLong40) {
					this.aClass68_1.method2096(this.aLong40);
					this.aLong41 = this.aLong40;
				}
				this.aClass68_1.method2091(arg1, arg2, arg0);
				if ((long) arg2 + this.aLong40 > this.aLong42 && this.aLong40 + (long) arg2 <= this.aLong42 + (long) this.anInt1151) {
					local143 = this.aLong40 + (long) arg2;
				} else if (this.aLong40 < this.aLong42 + (long) this.anInt1151 && this.aLong42 + (long) this.anInt1151 <= (long) arg2 + this.aLong40) {
					local143 = this.aLong42 + (long) this.anInt1151;
				}
				this.aLong41 += arg2;
				if (this.aLong43 < this.aLong41) {
					this.aLong43 = this.aLong41;
				}
				if (this.aLong40 >= this.aLong42 && this.aLong40 < (long) this.anInt1151 + this.aLong42) {
					local141 = this.aLong40;
				} else if (this.aLong40 <= this.aLong42 && this.aLong42 < this.aLong40 + (long) arg2) {
					local141 = this.aLong42;
				}
				if (local141 > -1L && local141 < local143) {
					@Pc(325) int local325 = (int) (local143 - local141);
					Static182.method1348(arg1, (int) ((long) arg0 + local141 - this.aLong40), this.aByteArray18, (int) (local141 - this.aLong42), local325);
				}
				this.aLong40 += arg2;
			} else if (arg2 > 0) {
				if (this.aLong38 == -1L) {
					this.aLong38 = this.aLong40;
				}
				Static182.method1348(arg1, arg0, this.aByteArray17, (int) (this.aLong40 - this.aLong38), arg2);
				this.aLong40 += arg2;
				if (this.aLong40 - this.aLong38 > (long) this.anInt1150) {
					this.anInt1150 = (int) (this.aLong40 - this.aLong38);
				}
			}
		} catch (@Pc(406) IOException local406) {
			this.aLong41 = -1L;
			throw local406;
		}
	}
}
