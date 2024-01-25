import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!et")
public final class Class70 {

	@OriginalMember(owner = "client!et", name = "t", descriptor = "[J")
	public static final long[] aLongArray1 = new long[256];

	@OriginalMember(owner = "client!et", name = "m", descriptor = "I")
	private int anInt1967;

	@OriginalMember(owner = "client!et", name = "p", descriptor = "J")
	private long aLong42;

	@OriginalMember(owner = "client!et", name = "g", descriptor = "J")
	private long aLong41 = -1L;

	@OriginalMember(owner = "client!et", name = "k", descriptor = "I")
	private int anInt1965 = 0;

	@OriginalMember(owner = "client!et", name = "q", descriptor = "J")
	private long aLong43 = -1L;

	@OriginalMember(owner = "client!et", name = "j", descriptor = "Lclient!wj;")
	private final Class248 aClass248_1;

	@OriginalMember(owner = "client!et", name = "e", descriptor = "J")
	private long aLong40;

	@OriginalMember(owner = "client!et", name = "x", descriptor = "J")
	private long aLong44;

	@OriginalMember(owner = "client!et", name = "i", descriptor = "[B")
	private final byte[] aByteArray27;

	@OriginalMember(owner = "client!et", name = "d", descriptor = "J")
	private long aLong39;

	@OriginalMember(owner = "client!et", name = "w", descriptor = "[B")
	private final byte[] aByteArray28;

	static {
		for (@Pc(12) int local12 = 0; local12 < 256; local12++) {
			@Pc(16) long local16 = (long) local12;
			for (@Pc(18) int local18 = 0; local18 < 8; local18++) {
				if ((local16 & 0x1L) == 1L) {
					local16 = local16 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local16 >>>= 0x1;
				}
			}
			aLongArray1[local12] = local16;
		}
	}

	@OriginalMember(owner = "client!et", name = "<init>", descriptor = "(Lclient!wj;II)V")
	public Class70(@OriginalArg(0) Class248 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass248_1 = arg0;
		this.aLong44 = this.aLong40 = arg0.method6007();
		this.aByteArray27 = new byte[arg1];
		this.aLong39 = 0L;
		this.aByteArray28 = new byte[arg2];
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(B)V")
	private void method1548() throws IOException {
		if (this.aLong41 == -1L) {
			return;
		}
		if (this.aLong42 != this.aLong41) {
			this.aClass248_1.method6003(this.aLong41);
			this.aLong42 = this.aLong41;
		}
		this.aClass248_1.method6005(this.aByteArray28, this.anInt1965, 0);
		this.aLong42 += this.anInt1965;
		if (this.aLong40 < this.aLong42) {
			this.aLong40 = this.aLong42;
		}
		@Pc(65) long local65 = -1L;
		if (this.aLong43 <= this.aLong41 && (long) this.anInt1967 + this.aLong43 > this.aLong41) {
			local65 = this.aLong41;
		} else if (this.aLong43 >= this.aLong41 && (long) this.anInt1965 + this.aLong41 > this.aLong43) {
			local65 = this.aLong43;
		}
		@Pc(123) long local123 = -1L;
		if (this.aLong41 + (long) this.anInt1965 > this.aLong43 && (long) this.anInt1967 + this.aLong43 >= (long) this.anInt1965 + this.aLong41) {
			local123 = (long) this.anInt1965 + this.aLong41;
		} else if (this.aLong41 < (long) this.anInt1967 + this.aLong43 && (long) this.anInt1965 + this.aLong41 >= (long) this.anInt1967 + this.aLong43) {
			local123 = this.aLong43 + (long) this.anInt1967;
		}
		if (local65 > -1L && local123 > local65) {
			@Pc(216) int local216 = (int) (local123 - local65);
			Static394.method2443(this.aByteArray28, (int) (local65 - this.aLong41), this.aByteArray27, (int) (local65 - this.aLong43), local216);
		}
		this.anInt1965 = 0;
		this.aLong41 = -1L;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(I)J")
	public long method1549() {
		return this.aLong44;
	}

	@OriginalMember(owner = "client!et", name = "c", descriptor = "(I)Ljava/io/File;")
	private File method1551() {
		return this.aClass248_1.method6002();
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IJ)V")
	public void method1552(@OriginalArg(1) long arg0) throws IOException {
		if ((long) 0 > arg0) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method1551());
		}
		this.aLong39 = arg0;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "([BIII)V")
	public void method1553(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (this.aLong44 < this.aLong39 + (long) arg2) {
				this.aLong44 = this.aLong39 + (long) arg2;
			}
			if (this.aLong41 != -1L && (this.aLong41 > this.aLong39 || this.aLong39 > this.aLong41 + (long) this.anInt1965)) {
				this.method1548();
			}
			if (this.aLong41 != -1L && this.aLong41 + (long) this.aByteArray28.length < (long) arg2 + this.aLong39) {
				@Pc(84) int local84 = (int) (this.aLong41 + (long) this.aByteArray28.length - this.aLong39);
				Static394.method2443(arg0, arg1, this.aByteArray28, (int) (this.aLong39 - this.aLong41), local84);
				arg1 += local84;
				arg2 -= local84;
				this.aLong39 += local84;
				this.anInt1965 = this.aByteArray28.length;
				this.method1548();
			}
			if (arg2 > this.aByteArray28.length) {
				if (this.aLong42 != this.aLong39) {
					this.aClass248_1.method6003(this.aLong39);
					this.aLong42 = this.aLong39;
				}
				this.aClass248_1.method6005(arg0, arg2, arg1);
				this.aLong42 += arg2;
				if (this.aLong42 > this.aLong40) {
					this.aLong40 = this.aLong42;
				}
				@Pc(180) long local180 = -1L;
				if (this.aLong43 <= this.aLong39 && this.aLong39 < this.aLong43 + (long) this.anInt1967) {
					local180 = this.aLong39;
				} else if (this.aLong43 >= this.aLong39 && (long) arg2 + this.aLong39 > this.aLong43) {
					local180 = this.aLong43;
				}
				@Pc(225) long local225 = -1L;
				if (this.aLong43 < (long) arg2 + this.aLong39 && (long) this.anInt1967 + this.aLong43 >= this.aLong39 + (long) arg2) {
					local225 = this.aLong39 + (long) arg2;
				} else if (this.aLong39 < this.aLong43 + (long) this.anInt1967 && this.aLong39 + (long) arg2 >= this.aLong43 + (long) this.anInt1967) {
					local225 = this.aLong43 + (long) this.anInt1967;
				}
				if (local180 > -1L && local180 < local225) {
					@Pc(306) int local306 = (int) (local225 - local180);
					Static394.method2443(arg0, (int) (local180 + (long) arg1 - this.aLong39), this.aByteArray27, (int) (local180 - this.aLong43), local306);
				}
				this.aLong39 += arg2;
			} else if (arg2 > 0) {
				if (this.aLong41 == -1L) {
					this.aLong41 = this.aLong39;
				}
				Static394.method2443(arg0, arg1, this.aByteArray28, (int) (this.aLong39 - this.aLong41), arg2);
				this.aLong39 += arg2;
				if ((long) this.anInt1965 < this.aLong39 - this.aLong41) {
					this.anInt1965 = (int) (this.aLong39 - this.aLong41);
				}
			}
		} catch (@Pc(393) IOException local393) {
			this.aLong42 = -1L;
			throw local393;
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(BI[BI)V")
	public void method1554(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg1.length < arg2) {
				throw new ArrayIndexOutOfBoundsException(arg2 - arg1.length);
			}
			if (this.aLong41 != -1L && this.aLong41 <= this.aLong39 && (long) arg2 + this.aLong39 <= (long) this.anInt1965 + this.aLong41) {
				Static394.method2443(this.aByteArray28, (int) (this.aLong39 - this.aLong41), arg1, 0, arg2);
				this.aLong39 += arg2;
				return;
			}
			@Pc(82) long local82 = this.aLong39;
			@Pc(86) int local86 = arg2;
			@Pc(121) int local121;
			if (this.aLong43 <= this.aLong39 && this.aLong39 < (long) this.anInt1967 + this.aLong43) {
				local121 = (int) (this.aLong43 + (long) this.anInt1967 - this.aLong39);
				if (arg2 < local121) {
					local121 = arg2;
				}
				Static394.method2443(this.aByteArray27, (int) (this.aLong39 - this.aLong43), arg1, 0, local121);
				arg0 = local121;
				arg2 -= local121;
				this.aLong39 += local121;
			}
			if (arg2 > this.aByteArray27.length) {
				this.aClass248_1.method6003(this.aLong39);
				this.aLong42 = this.aLong39;
				while (arg2 > 0) {
					local121 = this.aClass248_1.method6006(arg0, arg1, arg2);
					if (local121 == -1) {
						break;
					}
					arg2 -= local121;
					this.aLong39 += local121;
					this.aLong42 += local121;
					arg0 += local121;
				}
			} else if (arg2 > 0) {
				this.method1556();
				local121 = arg2;
				if (arg2 > this.anInt1967) {
					local121 = this.anInt1967;
				}
				Static394.method2443(this.aByteArray27, 0, arg1, arg0, local121);
				arg2 -= local121;
				this.aLong39 += local121;
				arg0 += local121;
			}
			if (this.aLong41 != -1L) {
				if (this.aLong39 < this.aLong41 && arg2 > 0) {
					local121 = (int) (this.aLong41 - this.aLong39) + arg0;
					if (local121 > arg2 + arg0) {
						local121 = arg2 + arg0;
					}
					while (arg0 < local121) {
						arg1[arg0++] = 0;
						arg2--;
						this.aLong39++;
					}
				}
				@Pc(306) long local306 = -1L;
				@Pc(308) long local308 = -1L;
				if (local82 <= this.aLong41 && (long) local86 + local82 > this.aLong41) {
					local306 = this.aLong41;
				} else if (local82 >= this.aLong41 && this.aLong41 + (long) this.anInt1965 > local82) {
					local306 = local82;
				}
				if (local82 < (long) this.anInt1965 + this.aLong41 && (long) this.anInt1965 + this.aLong41 <= (long) local86 + local82) {
					local308 = (long) this.anInt1965 + this.aLong41;
				} else if ((long) local86 + local82 > this.aLong41 && (long) this.anInt1965 + this.aLong41 >= (long) local86 + local82) {
					local308 = (long) local86 + local82;
				}
				if (local306 > -1L && local306 < local308) {
					@Pc(424) int local424 = (int) (local308 - local306);
					Static394.method2443(this.aByteArray28, (int) (local306 - this.aLong41), arg1, (int) (local306 - local82), local424);
					if (this.aLong39 < local308) {
						arg2 = (int) ((long) arg2 + this.aLong39 - local308);
						this.aLong39 = local308;
					}
				}
			}
		} catch (@Pc(460) IOException local460) {
			this.aLong42 = -1L;
			throw local460;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Z[B)V")
	public void method1555(@OriginalArg(1) byte[] arg0) throws IOException {
		this.method1554(0, arg0, arg0.length);
	}

	@OriginalMember(owner = "client!et", name = "b", descriptor = "(B)V")
	private void method1556() throws IOException {
		this.anInt1967 = 0;
		if (this.aLong42 != this.aLong39) {
			this.aClass248_1.method6003(this.aLong39);
			this.aLong42 = this.aLong39;
		}
		this.aLong43 = this.aLong39;
		while (this.anInt1967 < this.aByteArray27.length) {
			@Pc(45) int local45 = this.aByteArray27.length - this.anInt1967;
			if (local45 > 200000000) {
				local45 = 200000000;
			}
			@Pc(62) int local62 = this.aClass248_1.method6006(this.anInt1967, this.aByteArray27, local45);
			if (local62 == -1) {
				break;
			}
			this.aLong42 += local62;
			this.anInt1967 += local62;
		}
	}
}
