import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class Class5 {

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "J")
	private long aLong7;

	@OriginalMember(owner = "client!ae", name = "m", descriptor = "I")
	private int anInt121;

	@OriginalMember(owner = "client!ae", name = "i", descriptor = "J")
	private long aLong8 = -1L;

	@OriginalMember(owner = "client!ae", name = "s", descriptor = "J")
	private long aLong11 = -1L;

	@OriginalMember(owner = "client!ae", name = "f", descriptor = "I")
	private int anInt117 = 0;

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "Lclient!ub;")
	private Class129 aClass129_1;

	@OriginalMember(owner = "client!ae", name = "w", descriptor = "J")
	private long aLong12;

	@OriginalMember(owner = "client!ae", name = "q", descriptor = "J")
	private long aLong10;

	@OriginalMember(owner = "client!ae", name = "k", descriptor = "J")
	private long aLong9;

	@OriginalMember(owner = "client!ae", name = "r", descriptor = "[B")
	private byte[] aByteArray2;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "[B")
	private byte[] aByteArray1;

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(Lclient!ub;II)V")
	public Class5(@OriginalArg(0) Class129 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass129_1 = arg0;
		this.aLong10 = this.aLong12 = arg0.method3876();
		this.aLong9 = 0L;
		this.aByteArray2 = new byte[arg2];
		this.aByteArray1 = new byte[arg1];
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIB[B)V")
	public void method85(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if (this.aLong9 + (long) arg1 > this.aLong10) {
				this.aLong10 = (long) arg1 + this.aLong9;
			}
			if (this.aLong11 != -1L && (this.aLong9 < this.aLong11 || this.aLong9 > (long) this.anInt117 + this.aLong11)) {
				this.method95();
			}
			if (this.aLong11 != -1L && (long) arg1 + this.aLong9 > (long) this.aByteArray2.length + this.aLong11) {
				@Pc(95) int local95 = (int) (this.aLong11 + (long) this.aByteArray2.length - this.aLong9);
				arg1 -= local95;
				Static274.method2685(arg2, arg0, this.aByteArray2, (int) (this.aLong9 - this.aLong11), local95);
				arg0 += local95;
				this.aLong9 += local95;
				this.anInt117 = this.aByteArray2.length;
				this.method95();
			}
			if (this.aByteArray2.length < arg1) {
				if (this.aLong9 != this.aLong7) {
					this.aClass129_1.method3877(this.aLong9);
					this.aLong7 = this.aLong9;
				}
				this.aClass129_1.method3874(arg1, arg0, arg2);
				@Pc(167) long local167 = -1L;
				this.aLong7 += arg1;
				@Pc(176) long local176 = -1L;
				if (this.aLong7 > this.aLong12) {
					this.aLong12 = this.aLong7;
				}
				if (this.aLong9 >= this.aLong8 && this.aLong9 < (long) this.anInt121 + this.aLong8) {
					local176 = this.aLong9;
				} else if (this.aLong9 <= this.aLong8 && (long) arg1 + this.aLong9 > this.aLong8) {
					local176 = this.aLong8;
				}
				if ((long) arg1 + this.aLong9 > this.aLong8 && this.aLong9 + (long) arg1 <= this.aLong8 + (long) this.anInt121) {
					local167 = (long) arg1 + this.aLong9;
				} else if ((long) this.anInt121 + this.aLong8 > this.aLong9 && this.aLong9 + (long) arg1 >= (long) this.anInt121 + this.aLong8) {
					local167 = (long) this.anInt121 + this.aLong8;
				}
				if (local176 > -1L && local167 > local176) {
					@Pc(311) int local311 = (int) (local167 - local176);
					Static274.method2685(arg2, (int) (local176 + (long) arg0 - this.aLong9), this.aByteArray1, (int) (local176 - this.aLong8), local311);
				}
				this.aLong9 += arg1;
			} else if (arg1 > 0) {
				if (this.aLong11 == -1L) {
					this.aLong11 = this.aLong9;
				}
				Static274.method2685(arg2, arg0, this.aByteArray2, (int) (this.aLong9 - this.aLong11), arg1);
				this.aLong9 += arg1;
				if (this.aLong9 - this.aLong11 > (long) this.anInt117) {
					this.anInt117 = (int) (this.aLong9 - this.aLong11);
				}
			}
		} catch (@Pc(395) IOException local395) {
			this.aLong7 = -1L;
			throw local395;
		}
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(B)Ljava/io/File;")
	private File method86() {
		return this.aClass129_1.method3878();
	}

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "(B)J")
	public long method87() {
		return this.aLong10;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(I[BII)V")
	public void method89(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if (arg0 > arg1.length) {
				throw new ArrayIndexOutOfBoundsException(arg0 - arg1.length);
			}
			if (this.aLong11 != -1L && this.aLong11 <= this.aLong9 && (long) this.anInt117 + this.aLong11 >= this.aLong9 - -((long) arg0)) {
				Static274.method2685(this.aByteArray2, (int) (this.aLong9 - this.aLong11), arg1, 0, arg0);
				this.aLong9 += arg0;
				return;
			}
			@Pc(87) long local87 = this.aLong9;
			@Pc(91) int local91 = arg0;
			@Pc(124) int local124;
			if (this.aLong8 <= this.aLong9 && this.aLong8 + (long) this.anInt121 > this.aLong9) {
				local124 = (int) ((long) this.anInt121 + this.aLong8 - this.aLong9);
				if (local124 > arg0) {
					local124 = arg0;
				}
				Static274.method2685(this.aByteArray1, (int) (this.aLong9 - this.aLong8), arg1, 0, local124);
				this.aLong9 += local124;
				arg2 = local124;
				arg0 -= local124;
			}
			if (arg0 > this.aByteArray1.length) {
				this.aClass129_1.method3877(this.aLong9);
				this.aLong7 = this.aLong9;
				while (arg0 > 0) {
					local124 = this.aClass129_1.method3873(arg0, arg2, arg1);
					if (local124 == -1) {
						break;
					}
					arg0 -= local124;
					this.aLong9 += local124;
					arg2 += local124;
					this.aLong7 += local124;
				}
			} else if (arg0 > 0) {
				local124 = arg0;
				this.method94();
				if (this.anInt121 < arg0) {
					local124 = this.anInt121;
				}
				arg0 -= local124;
				Static274.method2685(this.aByteArray1, 0, arg1, arg2, local124);
				arg2 += local124;
				this.aLong9 += local124;
			}
			if (this.aLong11 != -1L) {
				if (this.aLong11 > this.aLong9 && arg0 > 0) {
					local124 = (int) (this.aLong11 - this.aLong9) + arg2;
					if (local124 > arg2 + arg0) {
						local124 = arg0 + arg2;
					}
					while (arg2 < local124) {
						arg1[arg2++] = 0;
						this.aLong9++;
						arg0--;
					}
				}
				@Pc(316) long local316 = -1L;
				@Pc(318) long local318 = -1L;
				if (local87 <= this.aLong11 && local87 + (long) local91 > this.aLong11) {
					local316 = this.aLong11;
				} else if (local87 >= this.aLong11 && this.aLong11 + (long) this.anInt117 > local87) {
					local316 = local87;
				}
				if (this.aLong11 + (long) this.anInt117 > local87 && local87 + (long) local91 >= this.aLong11 + (long) this.anInt117) {
					local318 = (long) this.anInt117 + this.aLong11;
				} else if ((long) local91 + local87 > this.aLong11 && (long) local91 + local87 <= (long) this.anInt117 + this.aLong11) {
					local318 = (long) local91 + local87;
				}
				if (local316 > -1L && local318 > local316) {
					@Pc(436) int local436 = (int) (local318 - local316);
					Static274.method2685(this.aByteArray2, (int) (local316 - this.aLong11), arg1, (int) (local316 - local87), local436);
					if (local318 > this.aLong9) {
						arg0 = (int) ((long) arg0 + this.aLong9 - local318);
						this.aLong9 = local318;
					}
				}
			}
		} catch (@Pc(473) IOException local473) {
			this.aLong7 = -1L;
			throw local473;
		}
		if (arg0 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(JI)V")
	public void method90(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method86());
		}
		this.aLong9 = arg0;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "([BB)V")
	public void method92(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method89(arg0.length, arg0, 0);
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)V")
	private void method94() throws IOException {
		this.anInt121 = 0;
		if (this.aLong7 != this.aLong9) {
			this.aClass129_1.method3877(this.aLong9);
			this.aLong7 = this.aLong9;
		}
		this.aLong8 = this.aLong9;
		while (this.aByteArray1.length > this.anInt121) {
			@Pc(46) int local46 = this.aByteArray1.length - this.anInt121;
			if (local46 > 200000000) {
				local46 = 200000000;
			}
			@Pc(61) int local61 = this.aClass129_1.method3873(local46, this.anInt121, this.aByteArray1);
			if (local61 == -1) {
				break;
			}
			this.aLong7 += local61;
			this.anInt121 += local61;
		}
	}

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "(I)V")
	private void method95() throws IOException {
		if (this.aLong11 == -1L) {
			return;
		}
		if (this.aLong7 != this.aLong11) {
			this.aClass129_1.method3877(this.aLong11);
			this.aLong7 = this.aLong11;
		}
		this.aClass129_1.method3874(this.anInt117, 0, this.aByteArray2);
		@Pc(46) long local46 = -1L;
		this.aLong7 += this.anInt117;
		@Pc(56) long local56 = -1L;
		if (this.aLong7 > this.aLong12) {
			this.aLong12 = this.aLong7;
		}
		if (this.aLong11 + (long) this.anInt117 > this.aLong8 && (long) this.anInt121 + this.aLong8 >= this.aLong11 + (long) this.anInt117) {
			local46 = (long) this.anInt117 + this.aLong11;
		} else if (this.aLong8 + (long) this.anInt121 > this.aLong11 && (long) this.anInt117 + this.aLong11 >= this.aLong8 - -((long) this.anInt121)) {
			local46 = (long) this.anInt121 + this.aLong8;
		}
		if (this.aLong11 >= this.aLong8 && (long) this.anInt121 + this.aLong8 > this.aLong11) {
			local56 = this.aLong11;
		} else if (this.aLong11 <= this.aLong8 && this.aLong8 < this.aLong11 + (long) this.anInt117) {
			local56 = this.aLong8;
		}
		if (local56 > -1L && local46 > local56) {
			@Pc(202) int local202 = (int) (local46 - local56);
			Static274.method2685(this.aByteArray2, (int) (local56 - this.aLong11), this.aByteArray1, (int) (local56 - this.aLong8), local202);
		}
		this.aLong11 = -1L;
		this.anInt117 = 0;
	}
}
