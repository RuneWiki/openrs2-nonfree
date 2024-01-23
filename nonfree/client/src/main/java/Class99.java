import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class99 {

	@OriginalMember(owner = "client!ub", name = "o", descriptor = "I")
	private int anInt4507;

	@OriginalMember(owner = "client!ub", name = "G", descriptor = "J")
	private long aLong168;

	@OriginalMember(owner = "client!ub", name = "n", descriptor = "J")
	private long aLong164 = -1L;

	@OriginalMember(owner = "client!ub", name = "B", descriptor = "I")
	private int anInt4513 = 0;

	@OriginalMember(owner = "client!ub", name = "s", descriptor = "J")
	private long aLong165 = -1L;

	@OriginalMember(owner = "client!ub", name = "q", descriptor = "Lclient!me;")
	private Class62 aClass62_4;

	@OriginalMember(owner = "client!ub", name = "A", descriptor = "J")
	private long aLong166;

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "J")
	private long aLong163;

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "[B")
	private byte[] aByteArray51;

	@OriginalMember(owner = "client!ub", name = "k", descriptor = "[B")
	private byte[] aByteArray52;

	@OriginalMember(owner = "client!ub", name = "C", descriptor = "J")
	private long aLong167;

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Lclient!me;II)V")
	public Class99(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass62_4 = arg0;
		this.aLong163 = this.aLong166 = arg0.method2307();
		this.aByteArray51 = new byte[arg1];
		this.aByteArray52 = new byte[arg2];
		this.aLong167 = 0L;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "([BB)V")
	public void method3569(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method3581(0, arg0, arg0.length);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)Ljava/io/File;")
	private File method3571() {
		return this.aClass62_4.method2309();
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V")
	public void method3572() throws IOException {
		this.method3575();
		this.aClass62_4.method2305();
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)J")
	public long method3573() {
		return this.aLong163;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(II[BZ)V")
	public void method3574(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		try {
			if (this.aLong163 < this.aLong167 + (long) arg1) {
				this.aLong163 = this.aLong167 + (long) arg1;
			}
			if (this.aLong165 != -1L && (this.aLong165 > this.aLong167 || this.aLong167 > this.aLong165 + (long) this.anInt4513)) {
				this.method3575();
			}
			if (this.aLong165 != -1L && (long) this.aByteArray52.length + this.aLong165 < this.aLong167 + (long) arg1) {
				@Pc(85) int local85 = (int) (this.aLong165 + (long) this.aByteArray52.length - this.aLong167);
				arg1 -= local85;
				Static231.method2214(arg2, arg0, this.aByteArray52, (int) (this.aLong167 - this.aLong165), local85);
				arg0 += local85;
				this.aLong167 += local85;
				this.anInt4513 = this.aByteArray52.length;
				this.method3575();
			}
			if (arg1 > this.aByteArray52.length) {
				if (this.aLong168 != this.aLong167) {
					this.aClass62_4.method2308(this.aLong167);
					this.aLong168 = this.aLong167;
				}
				@Pc(144) long local144 = -1L;
				@Pc(146) long local146 = -1L;
				this.aClass62_4.method2304(arg0, arg1, arg2);
				if (this.aLong167 + (long) arg1 > this.aLong164 && (long) this.anInt4507 + this.aLong164 >= this.aLong167 + (long) arg1) {
					local146 = this.aLong167 + (long) arg1;
				} else if ((long) this.anInt4507 + this.aLong164 > this.aLong167 && this.aLong167 + (long) arg1 >= this.aLong164 - -((long) this.anInt4507)) {
					local146 = (long) this.anInt4507 + this.aLong164;
				}
				if (this.aLong167 >= this.aLong164 && (long) this.anInt4507 + this.aLong164 > this.aLong167) {
					local144 = this.aLong167;
				} else if (this.aLong164 >= this.aLong167 && this.aLong167 + (long) arg1 > this.aLong164) {
					local144 = this.aLong164;
				}
				this.aLong168 += arg1;
				if (this.aLong168 > this.aLong166) {
					this.aLong166 = this.aLong168;
				}
				if (local144 > -1L && local144 < local146) {
					@Pc(311) int local311 = (int) (local146 - local144);
					Static231.method2214(arg2, (int) ((long) arg0 + local144 - this.aLong167), this.aByteArray51, (int) (local144 - this.aLong164), local311);
				}
				this.aLong167 += arg1;
			} else if (arg1 > 0) {
				if (this.aLong165 == -1L) {
					this.aLong165 = this.aLong167;
				}
				Static231.method2214(arg2, arg0, this.aByteArray52, (int) (this.aLong167 - this.aLong165), arg1);
				this.aLong167 += arg1;
				if ((long) this.anInt4513 < this.aLong167 - this.aLong165) {
					this.anInt4513 = (int) (this.aLong167 - this.aLong165);
				}
			}
		} catch (@Pc(404) IOException local404) {
			this.aLong168 = -1L;
			throw local404;
		}
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(I)V")
	private void method3575() throws IOException {
		if (this.aLong165 == -1L) {
			return;
		}
		if (this.aLong168 != this.aLong165) {
			this.aClass62_4.method2308(this.aLong165);
			this.aLong168 = this.aLong165;
		}
		this.aClass62_4.method2304(0, this.anInt4513, this.aByteArray52);
		@Pc(43) long local43 = -1L;
		this.aLong168 += this.anInt4513;
		@Pc(53) long local53 = -1L;
		if (this.aLong164 < this.aLong165 + (long) this.anInt4513 && (long) this.anInt4507 + this.aLong164 >= this.aLong165 + (long) this.anInt4513) {
			local43 = this.aLong165 + (long) this.anInt4513;
		} else if (this.aLong165 < (long) this.anInt4507 + this.aLong164 && this.aLong164 + (long) this.anInt4507 <= this.aLong165 - -((long) this.anInt4513)) {
			local43 = this.aLong164 + (long) this.anInt4507;
		}
		if (this.aLong168 > this.aLong166) {
			this.aLong166 = this.aLong168;
		}
		if (this.aLong164 <= this.aLong165 && (long) this.anInt4507 + this.aLong164 > this.aLong165) {
			local53 = this.aLong165;
		} else if (this.aLong164 >= this.aLong165 && this.aLong164 < this.aLong165 + (long) this.anInt4513) {
			local53 = this.aLong164;
		}
		if (local53 > -1L && local53 < local43) {
			@Pc(196) int local196 = (int) (local43 - local53);
			Static231.method2214(this.aByteArray52, (int) (local53 - this.aLong165), this.aByteArray51, (int) (local53 - this.aLong164), local196);
		}
		this.anInt4513 = 0;
		this.aLong165 = -1L;
	}

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "(I)V")
	private void method3577() throws IOException {
		this.anInt4507 = 0;
		if (this.aLong168 != this.aLong167) {
			this.aClass62_4.method2308(this.aLong167);
			this.aLong168 = this.aLong167;
		}
		this.aLong164 = this.aLong167;
		while (this.aByteArray51.length > this.anInt4507) {
			@Pc(43) int local43 = this.aByteArray51.length - this.anInt4507;
			if (local43 > 200000000) {
				local43 = 200000000;
			}
			@Pc(60) int local60 = this.aClass62_4.method2306(this.aByteArray51, local43, this.anInt4507);
			if (local60 == -1) {
				break;
			}
			this.anInt4507 += local60;
			this.aLong168 += local60;
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IJ)V")
	public void method3579(@OriginalArg(1) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method3571());
		}
		this.aLong167 = arg0;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IB[BI)V")
	public void method3581(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg1.length < arg2) {
				throw new ArrayIndexOutOfBoundsException(arg2 - arg1.length);
			}
			if (this.aLong165 != -1L && this.aLong167 >= this.aLong165 && this.aLong165 + (long) this.anInt4513 >= (long) arg2 + this.aLong167) {
				Static231.method2214(this.aByteArray52, (int) (this.aLong167 - this.aLong165), arg1, 0, arg2);
				this.aLong167 += arg2;
				return;
			}
			@Pc(89) int local89 = arg2;
			@Pc(92) long local92 = this.aLong167;
			@Pc(127) int local127;
			if (this.aLong167 >= this.aLong164 && this.aLong164 + (long) this.anInt4507 > this.aLong167) {
				local127 = (int) (this.aLong164 + (long) this.anInt4507 - this.aLong167);
				if (arg2 < local127) {
					local127 = arg2;
				}
				arg2 -= local127;
				Static231.method2214(this.aByteArray51, (int) (this.aLong167 - this.aLong164), arg1, 0, local127);
				this.aLong167 += local127;
				arg0 = local127;
			}
			if (this.aByteArray51.length < arg2) {
				this.aClass62_4.method2308(this.aLong167);
				this.aLong168 = this.aLong167;
				while (arg2 > 0) {
					local127 = this.aClass62_4.method2306(arg1, arg2, arg0);
					if (local127 == -1) {
						break;
					}
					arg0 += local127;
					this.aLong167 += local127;
					arg2 -= local127;
					this.aLong168 += local127;
				}
			} else if (arg2 > 0) {
				this.method3577();
				local127 = arg2;
				if (this.anInt4507 < arg2) {
					local127 = this.anInt4507;
				}
				Static231.method2214(this.aByteArray51, 0, arg1, arg0, local127);
				arg2 -= local127;
				this.aLong167 += local127;
				arg0 += local127;
			}
			if (this.aLong165 != -1L) {
				if (this.aLong165 > this.aLong167 && arg2 > 0) {
					local127 = arg0 + (int) (this.aLong165 - this.aLong167);
					if (local127 > arg2 + arg0) {
						local127 = arg0 + arg2;
					}
					while (local127 > arg0) {
						arg2--;
						arg1[arg0++] = 0;
						this.aLong167++;
					}
				}
				@Pc(314) long local314 = -1L;
				@Pc(316) long local316 = -1L;
				if (this.aLong165 >= local92 && this.aLong165 < (long) local89 + local92) {
					local316 = this.aLong165;
				} else if (this.aLong165 <= local92 && (long) this.anInt4513 + this.aLong165 > local92) {
					local316 = local92;
				}
				if ((long) this.anInt4513 + this.aLong165 > local92 && (long) local89 + local92 >= this.aLong165 + (long) this.anInt4513) {
					local314 = (long) this.anInt4513 + this.aLong165;
				} else if (this.aLong165 < local92 + (long) local89 && this.aLong165 + (long) this.anInt4513 >= (long) local89 + local92) {
					local314 = local92 + (long) local89;
				}
				if (local316 > -1L && local316 < local314) {
					@Pc(442) int local442 = (int) (local314 - local316);
					Static231.method2214(this.aByteArray52, (int) (local316 - this.aLong165), arg1, (int) (local316 - local92), local442);
					if (local314 > this.aLong167) {
						arg2 = (int) ((long) arg2 + this.aLong167 - local314);
						this.aLong167 = local314;
					}
				}
			}
		} catch (@Pc(479) IOException local479) {
			this.aLong168 = -1L;
			throw local479;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}
}
