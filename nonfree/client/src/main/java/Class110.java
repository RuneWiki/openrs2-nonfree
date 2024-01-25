import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hv")
public final class Class110 {

	@OriginalMember(owner = "client!hv", name = "i", descriptor = "J")
	private long aLong98;

	@OriginalMember(owner = "client!hv", name = "s", descriptor = "I")
	private int anInt2740;

	@OriginalMember(owner = "client!hv", name = "c", descriptor = "J")
	private long aLong97 = -1L;

	@OriginalMember(owner = "client!hv", name = "m", descriptor = "J")
	private long aLong99 = -1L;

	@OriginalMember(owner = "client!hv", name = "p", descriptor = "I")
	private int anInt2738 = 0;

	@OriginalMember(owner = "client!hv", name = "j", descriptor = "Lclient!oh;")
	private final Class178 aClass178_1;

	@OriginalMember(owner = "client!hv", name = "b", descriptor = "J")
	private long aLong96;

	@OriginalMember(owner = "client!hv", name = "u", descriptor = "J")
	private long aLong100;

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "J")
	private long aLong95;

	@OriginalMember(owner = "client!hv", name = "d", descriptor = "[B")
	private final byte[] aByteArray23;

	@OriginalMember(owner = "client!hv", name = "o", descriptor = "[B")
	private final byte[] aByteArray24;

	@OriginalMember(owner = "client!hv", name = "<init>", descriptor = "(Lclient!oh;II)V")
	public Class110(@OriginalArg(0) Class178 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass178_1 = arg0;
		this.aLong100 = this.aLong96 = arg0.method3780();
		this.aLong95 = 0L;
		this.aByteArray23 = new byte[arg1];
		this.aByteArray24 = new byte[arg2];
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(I)V")
	private void method2259() throws IOException {
		this.anInt2740 = 0;
		if (this.aLong98 != this.aLong95) {
			this.aClass178_1.method3778(this.aLong95);
			this.aLong98 = this.aLong95;
		}
		this.aLong97 = this.aLong95;
		while (this.anInt2740 < this.aByteArray23.length) {
			@Pc(50) int local50 = this.aByteArray23.length - this.anInt2740;
			if (local50 > 200000000) {
				local50 = 200000000;
			}
			@Pc(67) int local67 = this.aClass178_1.method3777(this.anInt2740, local50, this.aByteArray23);
			if (local67 == -1) {
				break;
			}
			this.aLong98 += local67;
			this.anInt2740 += local67;
		}
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(B)Ljava/io/File;")
	private File method2260() {
		return this.aClass178_1.method3781();
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(Z)V")
	private void method2261() throws IOException {
		if (this.aLong99 == -1L) {
			return;
		}
		if (this.aLong99 != this.aLong98) {
			this.aClass178_1.method3778(this.aLong99);
			this.aLong98 = this.aLong99;
		}
		this.aClass178_1.method3782(this.anInt2738, this.aByteArray24, 0);
		this.aLong98 += this.anInt2738;
		if (this.aLong98 > this.aLong96) {
			this.aLong96 = this.aLong98;
		}
		@Pc(61) long local61 = -1L;
		if (this.aLong97 <= this.aLong99 && this.aLong99 < this.aLong97 + (long) this.anInt2740) {
			local61 = this.aLong99;
		} else if (this.aLong97 >= this.aLong99 && this.aLong99 + (long) this.anInt2738 > this.aLong97) {
			local61 = this.aLong97;
		}
		@Pc(108) long local108 = -1L;
		if ((long) this.anInt2738 + this.aLong99 > this.aLong97 && this.aLong99 + (long) this.anInt2738 <= this.aLong97 + (long) this.anInt2740) {
			local108 = this.aLong99 + (long) this.anInt2738;
		} else if (this.aLong99 < (long) this.anInt2740 + this.aLong97 && this.aLong99 + (long) this.anInt2738 >= (long) this.anInt2740 + this.aLong97) {
			local108 = this.aLong97 + (long) this.anInt2740;
		}
		if (local61 > -1L && local61 < local108) {
			@Pc(199) int local199 = (int) (local108 - local61);
			Static464.method1964(this.aByteArray24, (int) (local61 - this.aLong99), this.aByteArray23, (int) (local61 - this.aLong97), local199);
		}
		this.anInt2738 = 0;
		this.aLong99 = -1L;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(JI)V")
	public void method2262(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method2260());
		}
		this.aLong95 = arg0;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "([BI)V")
	public void method2265(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method2267(arg0.length, arg0, 0);
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(I[BII)V")
	public void method2267(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg1.length < arg0) {
				throw new ArrayIndexOutOfBoundsException(arg0 - arg1.length);
			}
			if (this.aLong99 != -1L && this.aLong99 <= this.aLong95 && (long) arg0 + this.aLong95 <= this.aLong99 + (long) this.anInt2738) {
				Static464.method1964(this.aByteArray24, (int) (this.aLong95 - this.aLong99), arg1, 0, arg0);
				this.aLong95 += arg0;
				return;
			}
			@Pc(74) long local74 = this.aLong95;
			@Pc(78) int local78 = arg0;
			@Pc(107) int local107;
			if (this.aLong97 <= this.aLong95 && (long) this.anInt2740 + this.aLong97 > this.aLong95) {
				local107 = (int) (this.aLong97 + (long) this.anInt2740 - this.aLong95);
				if (local107 > arg0) {
					local107 = arg0;
				}
				Static464.method1964(this.aByteArray23, (int) (this.aLong95 - this.aLong97), arg1, 0, local107);
				arg2 = local107;
				this.aLong95 += local107;
				arg0 -= local107;
			}
			if (this.aByteArray23.length < arg0) {
				this.aClass178_1.method3778(this.aLong95);
				this.aLong98 = this.aLong95;
				while (arg0 > 0) {
					local107 = this.aClass178_1.method3777(arg2, arg0, arg1);
					if (local107 == -1) {
						break;
					}
					this.aLong95 += local107;
					arg0 -= local107;
					this.aLong98 += local107;
					arg2 += local107;
				}
			} else if (arg0 > 0) {
				this.method2259();
				local107 = arg0;
				if (this.anInt2740 < arg0) {
					local107 = this.anInt2740;
				}
				Static464.method1964(this.aByteArray23, 0, arg1, arg2, local107);
				this.aLong95 += local107;
				arg2 += local107;
				arg0 -= local107;
			}
			if (this.aLong99 != -1L) {
				if (this.aLong99 > this.aLong95 && arg0 > 0) {
					local107 = arg2 + (int) (this.aLong99 - this.aLong95);
					if (local107 > arg0 + arg2) {
						local107 = arg0 + arg2;
					}
					while (arg2 < local107) {
						arg0--;
						arg1[arg2++] = 0;
						this.aLong95++;
					}
				}
				@Pc(306) long local306 = -1L;
				@Pc(308) long local308 = -1L;
				if (this.aLong99 >= local74 && this.aLong99 < (long) local78 + local74) {
					local306 = this.aLong99;
				} else if (this.aLong99 <= local74 && (long) this.anInt2738 + this.aLong99 > local74) {
					local306 = local74;
				}
				if (this.aLong99 + (long) this.anInt2738 > local74 && local74 + (long) local78 >= (long) this.anInt2738 + this.aLong99) {
					local308 = (long) this.anInt2738 + this.aLong99;
				} else if (local74 + (long) local78 > this.aLong99 && local74 + (long) local78 <= this.aLong99 - -((long) this.anInt2738)) {
					local308 = (long) local78 + local74;
				}
				if (local306 > -1L && local308 > local306) {
					@Pc(432) int local432 = (int) (local308 - local306);
					Static464.method1964(this.aByteArray24, (int) (local306 - this.aLong99), arg1, (int) (local306 - local74), local432);
					if (this.aLong95 < local308) {
						arg0 = (int) ((long) arg0 + this.aLong95 - local308);
						this.aLong95 = local308;
					}
				}
			}
		} catch (@Pc(475) IOException local475) {
			this.aLong98 = -1L;
			throw local475;
		}
		if (arg0 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!hv", name = "b", descriptor = "(I[BII)V")
	public void method2269(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if ((long) arg0 + this.aLong95 > this.aLong100) {
				this.aLong100 = (long) arg0 + this.aLong95;
			}
			if ((long) -1 != this.aLong99 && (this.aLong95 < this.aLong99 || (long) this.anInt2738 + this.aLong99 < this.aLong95)) {
				this.method2261();
			}
			if (this.aLong99 != -1L && (long) this.aByteArray24.length + this.aLong99 < (long) arg0 + this.aLong95) {
				@Pc(92) int local92 = (int) ((long) this.aByteArray24.length + this.aLong99 - this.aLong95);
				Static464.method1964(arg1, arg2, this.aByteArray24, (int) (this.aLong95 - this.aLong99), local92);
				this.aLong95 += local92;
				arg2 += local92;
				arg0 -= local92;
				this.anInt2738 = this.aByteArray24.length;
				this.method2261();
			}
			if (this.aByteArray24.length < arg0) {
				if (this.aLong98 != this.aLong95) {
					this.aClass178_1.method3778(this.aLong95);
					this.aLong98 = this.aLong95;
				}
				this.aClass178_1.method3782(arg0, arg1, arg2);
				this.aLong98 += arg0;
				if (this.aLong96 < this.aLong98) {
					this.aLong96 = this.aLong98;
				}
				@Pc(183) long local183 = -1L;
				@Pc(185) long local185 = -1L;
				if (this.aLong97 <= this.aLong95 && this.aLong95 < this.aLong97 + (long) this.anInt2740) {
					local183 = this.aLong95;
				} else if (this.aLong95 <= this.aLong97 && this.aLong97 < (long) arg0 + this.aLong95) {
					local183 = this.aLong97;
				}
				if (this.aLong97 < this.aLong95 + (long) arg0 && (long) arg0 + this.aLong95 <= (long) this.anInt2740 + this.aLong97) {
					local185 = this.aLong95 + (long) arg0;
				} else if (this.aLong95 < (long) this.anInt2740 + this.aLong97 && (long) this.anInt2740 + this.aLong97 <= this.aLong95 - -((long) arg0)) {
					local185 = this.aLong97 + (long) this.anInt2740;
				}
				if (local183 > -1L && local185 > local183) {
					@Pc(319) int local319 = (int) (local185 - local183);
					Static464.method1964(arg1, (int) ((long) arg2 + local183 - this.aLong95), this.aByteArray23, (int) (local183 - this.aLong97), local319);
				}
				this.aLong95 += arg0;
			} else if (arg0 > 0) {
				if (this.aLong99 == -1L) {
					this.aLong99 = this.aLong95;
				}
				Static464.method1964(arg1, arg2, this.aByteArray24, (int) (this.aLong95 - this.aLong99), arg0);
				this.aLong95 += arg0;
				if ((long) this.anInt2738 < this.aLong95 - this.aLong99) {
					this.anInt2738 = (int) (this.aLong95 - this.aLong99);
				}
			}
		} catch (@Pc(405) IOException local405) {
			this.aLong98 = -1L;
			throw local405;
		}
	}

	@OriginalMember(owner = "client!hv", name = "b", descriptor = "(I)J")
	public long method2271() {
		return this.aLong100;
	}
}
