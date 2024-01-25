import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cv")
public final class Class64 {

	@OriginalMember(owner = "client!cv", name = "c", descriptor = "I")
	private int anInt1364;

	@OriginalMember(owner = "client!cv", name = "u", descriptor = "J")
	private long aLong54;

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "I")
	private int anInt1362 = 0;

	@OriginalMember(owner = "client!cv", name = "h", descriptor = "J")
	private long aLong49 = -1L;

	@OriginalMember(owner = "client!cv", name = "t", descriptor = "J")
	private long aLong53 = -1L;

	@OriginalMember(owner = "client!cv", name = "f", descriptor = "Lclient!cr;")
	private final Class62 aClass62_1;

	@OriginalMember(owner = "client!cv", name = "o", descriptor = "J")
	private long aLong51;

	@OriginalMember(owner = "client!cv", name = "j", descriptor = "J")
	private long aLong50;

	@OriginalMember(owner = "client!cv", name = "p", descriptor = "[B")
	private final byte[] aByteArray20;

	@OriginalMember(owner = "client!cv", name = "r", descriptor = "J")
	private long aLong52;

	@OriginalMember(owner = "client!cv", name = "l", descriptor = "[B")
	private final byte[] aByteArray19;

	@OriginalMember(owner = "client!cv", name = "<init>", descriptor = "(Lclient!cr;II)V")
	public Class64(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass62_1 = arg0;
		this.aLong50 = this.aLong51 = arg0.method1253();
		this.aByteArray20 = new byte[arg2];
		this.aLong52 = 0L;
		this.aByteArray19 = new byte[arg1];
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(I)Ljava/io/File;")
	private File method1305() {
		return this.aClass62_1.method1256();
	}

	@OriginalMember(owner = "client!cv", name = "b", descriptor = "(I)V")
	private void method1306() throws IOException {
		this.anInt1364 = 0;
		if (this.aLong54 != this.aLong52) {
			this.aClass62_1.method1261(this.aLong52);
			this.aLong54 = this.aLong52;
		}
		this.aLong49 = this.aLong52;
		while (this.aByteArray19.length > this.anInt1364) {
			@Pc(43) int local43 = this.aByteArray19.length - this.anInt1364;
			if (local43 > 200000000) {
				local43 = 200000000;
			}
			@Pc(58) int local58 = this.aClass62_1.method1254(this.anInt1364, local43, this.aByteArray19);
			if (local58 == -1) {
				break;
			}
			this.anInt1364 += local58;
			this.aLong54 += (long) local58;
		}
	}

	@OriginalMember(owner = "client!cv", name = "b", descriptor = "(B)V")
	private void method1308() throws IOException {
		if (this.aLong53 == -1L) {
			return;
		}
		if (this.aLong53 != this.aLong54) {
			this.aClass62_1.method1261(this.aLong53);
			this.aLong54 = this.aLong53;
		}
		this.aClass62_1.method1259(0, this.anInt1362, this.aByteArray20);
		this.aLong54 += (long) this.anInt1362;
		if (this.aLong54 > this.aLong51) {
			this.aLong51 = this.aLong54;
		}
		@Pc(57) long local57 = -1L;
		@Pc(59) long local59 = -1L;
		if (this.aLong49 <= this.aLong53 && this.aLong53 < this.aLong49 + (long) this.anInt1364) {
			local57 = this.aLong53;
		} else if (this.aLong53 <= this.aLong49 && this.aLong49 < this.aLong53 + (long) this.anInt1362) {
			local57 = this.aLong49;
		}
		if ((long) this.anInt1362 + this.aLong53 > this.aLong49 && this.aLong53 + (long) this.anInt1362 <= this.aLong49 + (long) this.anInt1364) {
			local59 = (long) this.anInt1362 + this.aLong53;
		} else if (this.aLong49 + (long) this.anInt1364 > this.aLong53 && this.aLong53 + (long) this.anInt1362 >= (long) this.anInt1364 + this.aLong49) {
			local59 = this.aLong49 + (long) this.anInt1364;
		}
		if (local57 > -1L && local57 < local59) {
			@Pc(198) int local198 = (int) (local59 - local57);
			Static655.method4109(this.aByteArray20, (int) (local57 - this.aLong53), this.aByteArray19, (int) (local57 - this.aLong49), local198);
		}
		this.aLong53 = -1L;
		this.anInt1362 = 0;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(BJ)V")
	public void method1309(@OriginalArg(1) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method1305());
		}
		this.aLong52 = arg0;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(ZI[BI)V")
	public void method1310(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (this.aLong52 + (long) arg0 > this.aLong50) {
				this.aLong50 = (long) arg0 + this.aLong52;
			}
			if (this.aLong53 != -1L && (this.aLong53 > this.aLong52 || this.aLong52 > (long) this.anInt1362 + this.aLong53)) {
				this.method1308();
			}
			if (this.aLong53 != -1L && (long) arg0 + this.aLong52 > (long) this.aByteArray20.length + this.aLong53) {
				@Pc(96) int local96 = (int) (this.aLong53 + (long) this.aByteArray20.length - this.aLong52);
				Static655.method4109(arg1, arg2, this.aByteArray20, (int) (this.aLong52 - this.aLong53), local96);
				arg0 -= local96;
				arg2 += local96;
				this.aLong52 += (long) local96;
				this.anInt1362 = this.aByteArray20.length;
				this.method1308();
			}
			if (this.aByteArray20.length < arg0) {
				if (this.aLong52 != this.aLong54) {
					this.aClass62_1.method1261(this.aLong52);
					this.aLong54 = this.aLong52;
				}
				this.aClass62_1.method1259(arg2, arg0, arg1);
				this.aLong54 += (long) arg0;
				if (this.aLong54 > this.aLong51) {
					this.aLong51 = this.aLong54;
				}
				@Pc(183) long local183 = -1L;
				if (this.aLong49 <= this.aLong52 && (long) this.anInt1364 + this.aLong49 > this.aLong52) {
					local183 = this.aLong52;
				} else if (this.aLong52 <= this.aLong49 && this.aLong49 < this.aLong52 + (long) arg0) {
					local183 = this.aLong49;
				}
				@Pc(233) long local233 = -1L;
				if (this.aLong49 < this.aLong52 + (long) arg0 && (long) arg0 + this.aLong52 <= (long) this.anInt1364 + this.aLong49) {
					local233 = this.aLong52 + (long) arg0;
				} else if ((long) this.anInt1364 + this.aLong49 > this.aLong52 && this.aLong49 + (long) this.anInt1364 <= this.aLong52 - -((long) arg0)) {
					local233 = this.aLong49 + (long) this.anInt1364;
				}
				if (local183 > -1L && local183 < local233) {
					@Pc(319) int local319 = (int) (local233 - local183);
					Static655.method4109(arg1, (int) ((long) arg2 + local183 - this.aLong52), this.aByteArray19, (int) (local183 - this.aLong49), local319);
				}
				this.aLong52 += (long) arg0;
			} else if (arg0 > 0) {
				if (this.aLong53 == -1L) {
					this.aLong53 = this.aLong52;
				}
				Static655.method4109(arg1, arg2, this.aByteArray20, (int) (this.aLong52 - this.aLong53), arg0);
				this.aLong52 += (long) arg0;
				if ((long) this.anInt1362 < this.aLong52 - this.aLong53) {
					this.anInt1362 = (int) (this.aLong52 - this.aLong53);
				}
			}
		} catch (@Pc(400) IOException local400) {
			this.aLong54 = -1L;
			throw local400;
		}
	}

	@OriginalMember(owner = "client!cv", name = "c", descriptor = "(I)J")
	public long method1311() {
		return this.aLong50;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(I[BIZ)V")
	public void method1312(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if (arg0 > arg1.length) {
				throw new ArrayIndexOutOfBoundsException(arg0 - arg1.length);
			}
			if (this.aLong53 != -1L && this.aLong53 <= this.aLong52 && (long) this.anInt1362 + this.aLong53 >= (long) arg0 + this.aLong52) {
				Static655.method4109(this.aByteArray20, (int) (this.aLong52 - this.aLong53), arg1, 0, arg0);
				this.aLong52 += (long) arg0;
				return;
			}
			@Pc(80) long local80 = this.aLong52;
			@Pc(84) int local84 = arg0;
			@Pc(116) int local116;
			if (this.aLong52 >= this.aLong49 && this.aLong52 < (long) this.anInt1364 + this.aLong49) {
				local116 = (int) ((long) this.anInt1364 + this.aLong49 - this.aLong52);
				if (local116 > arg0) {
					local116 = arg0;
				}
				Static655.method4109(this.aByteArray19, (int) (this.aLong52 - this.aLong49), arg1, 0, local116);
				this.aLong52 += (long) local116;
				arg0 -= local116;
				arg2 = local116;
			}
			if (arg0 > this.aByteArray19.length) {
				this.aClass62_1.method1261(this.aLong52);
				this.aLong54 = this.aLong52;
				while (arg0 > 0) {
					local116 = this.aClass62_1.method1254(arg2, arg0, arg1);
					if (local116 == -1) {
						break;
					}
					arg0 -= local116;
					arg2 += local116;
					this.aLong54 += (long) local116;
					this.aLong52 += (long) local116;
				}
			} else if (arg0 > 0) {
				this.method1306();
				local116 = arg0;
				if (this.anInt1364 < arg0) {
					local116 = this.anInt1364;
				}
				Static655.method4109(this.aByteArray19, 0, arg1, arg2, local116);
				this.aLong52 += (long) local116;
				arg2 += local116;
				arg0 -= local116;
			}
			if (this.aLong53 != -1L) {
				if (this.aLong52 < this.aLong53 && arg0 > 0) {
					local116 = arg2 + (int) (this.aLong53 - this.aLong52);
					if (local116 > arg2 + arg0) {
						local116 = arg2 + arg0;
					}
					while (arg2 < local116) {
						arg1[arg2++] = 0;
						arg0--;
						this.aLong52++;
					}
				}
				@Pc(309) long local309 = -1L;
				if (this.aLong53 >= local80 && (long) local84 + local80 > this.aLong53) {
					local309 = this.aLong53;
				} else if (local80 >= this.aLong53 && this.aLong53 + (long) this.anInt1362 > local80) {
					local309 = local80;
				}
				@Pc(349) long local349 = -1L;
				if (local80 < (long) this.anInt1362 + this.aLong53 && this.aLong53 + (long) this.anInt1362 <= (long) local84 + local80) {
					local349 = (long) this.anInt1362 + this.aLong53;
				} else if ((long) local84 + local80 > this.aLong53 && (long) this.anInt1362 + this.aLong53 >= (long) local84 + local80) {
					local349 = (long) local84 + local80;
				}
				if (local309 > -1L && local349 > local309) {
					@Pc(426) int local426 = (int) (local349 - local309);
					Static655.method4109(this.aByteArray20, (int) (local309 - this.aLong53), arg1, (int) (local309 - local80), local426);
					if (local349 > this.aLong52) {
						arg0 = (int) ((long) arg0 + this.aLong52 - local349);
						this.aLong52 = local349;
					}
				}
			}
		} catch (@Pc(464) IOException local464) {
			this.aLong54 = -1L;
			throw local464;
		}
		if (arg0 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(Z[B)V")
	public void method1313(@OriginalArg(1) byte[] arg0) throws IOException {
		this.method1312(arg0.length, arg0, 0);
	}

	@OriginalMember(owner = "client!cv", name = "d", descriptor = "(I)V")
	public void method1314() throws IOException {
		this.method1308();
		this.aClass62_1.method1255();
	}
}
