import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kj")
public final class Class56 {

	@OriginalMember(owner = "client!kj", name = "f", descriptor = "I")
	private int anInt2536;

	@OriginalMember(owner = "client!kj", name = "y", descriptor = "J")
	private long aLong80;

	@OriginalMember(owner = "client!kj", name = "w", descriptor = "I")
	private int anInt2545 = 0;

	@OriginalMember(owner = "client!kj", name = "x", descriptor = "J")
	private long aLong79 = -1L;

	@OriginalMember(owner = "client!kj", name = "A", descriptor = "J")
	private long aLong81 = -1L;

	@OriginalMember(owner = "client!kj", name = "k", descriptor = "Lclient!fg;")
	private Class34 aClass34_1;

	@OriginalMember(owner = "client!kj", name = "l", descriptor = "J")
	private long aLong77;

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "J")
	private long aLong76;

	@OriginalMember(owner = "client!kj", name = "r", descriptor = "[B")
	private byte[] aByteArray30;

	@OriginalMember(owner = "client!kj", name = "m", descriptor = "J")
	private long aLong78;

	@OriginalMember(owner = "client!kj", name = "s", descriptor = "[B")
	private byte[] aByteArray31;

	@OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(Lclient!fg;II)V")
	public Class56(@OriginalArg(0) Class34 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass34_1 = arg0;
		this.aLong76 = this.aLong77 = arg0.method1116();
		this.aByteArray30 = new byte[arg1];
		this.aLong78 = 0L;
		this.aByteArray31 = new byte[arg2];
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "([BIII)V")
	public void method1782(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if (this.aLong76 < (long) arg1 + this.aLong78) {
				this.aLong76 = (long) arg1 + this.aLong78;
			}
			if (this.aLong81 != -1L && (this.aLong81 > this.aLong78 || this.aLong78 > (long) this.anInt2545 + this.aLong81)) {
				this.method1783();
			}
			if (this.aLong81 != -1L && (long) this.aByteArray31.length + this.aLong81 < this.aLong78 - -((long) arg1)) {
				@Pc(96) int local96 = (int) (this.aLong81 + (long) this.aByteArray31.length - this.aLong78);
				arg1 -= local96;
				Static225.method1839(arg0, arg2, this.aByteArray31, (int) (this.aLong78 - this.aLong81), local96);
				this.aLong78 += local96;
				this.anInt2545 = this.aByteArray31.length;
				arg2 += local96;
				this.method1783();
			}
			if (this.aByteArray31.length < arg1) {
				if (this.aLong80 != this.aLong78) {
					this.aClass34_1.method1113(this.aLong78);
					this.aLong80 = this.aLong78;
				}
				this.aClass34_1.method1112(arg2, arg1, arg0);
				this.aLong80 += arg1;
				if (this.aLong80 > this.aLong77) {
					this.aLong77 = this.aLong80;
				}
				@Pc(183) long local183 = -1L;
				if (this.aLong79 <= this.aLong78 && (long) this.anInt2536 + this.aLong79 > this.aLong78) {
					local183 = this.aLong78;
				} else if (this.aLong79 >= this.aLong78 && this.aLong78 + (long) arg1 > this.aLong79) {
					local183 = this.aLong79;
				}
				@Pc(240) long local240 = -1L;
				if ((long) arg1 + this.aLong78 > this.aLong79 && (long) arg1 + this.aLong78 <= (long) this.anInt2536 + this.aLong79) {
					local240 = (long) arg1 + this.aLong78;
				} else if ((long) this.anInt2536 + this.aLong79 > this.aLong78 && (long) this.anInt2536 + this.aLong79 <= this.aLong78 + (long) arg1) {
					local240 = this.aLong79 + (long) this.anInt2536;
				}
				if (local183 > -1L && local183 < local240) {
					@Pc(324) int local324 = (int) (local240 - local183);
					Static225.method1839(arg0, (int) (local183 + (long) arg2 - this.aLong78), this.aByteArray30, (int) (local183 - this.aLong79), local324);
				}
				this.aLong78 += arg1;
			} else if (arg1 > 0) {
				if (this.aLong81 == -1L) {
					this.aLong81 = this.aLong78;
				}
				Static225.method1839(arg0, arg2, this.aByteArray31, (int) (this.aLong78 - this.aLong81), arg1);
				this.aLong78 += arg1;
				if ((long) this.anInt2545 < this.aLong78 - this.aLong81) {
					this.anInt2545 = (int) (this.aLong78 - this.aLong81);
				}
			}
		} catch (@Pc(414) IOException local414) {
			this.aLong80 = -1L;
			throw local414;
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)V")
	private void method1783() throws IOException {
		if (this.aLong81 == (long) -1) {
			return;
		}
		if (this.aLong81 != this.aLong80) {
			this.aClass34_1.method1113(this.aLong81);
			this.aLong80 = this.aLong81;
		}
		this.aClass34_1.method1112(0, this.anInt2545, this.aByteArray31);
		@Pc(38) long local38 = -1L;
		this.aLong80 += this.anInt2545;
		if (this.aLong79 <= this.aLong81 && this.aLong81 < this.aLong79 + (long) this.anInt2536) {
			local38 = this.aLong81;
		} else if (this.aLong79 >= this.aLong81 && this.aLong79 < (long) this.anInt2545 + this.aLong81) {
			local38 = this.aLong79;
		}
		if (this.aLong80 > this.aLong77) {
			this.aLong77 = this.aLong80;
		}
		@Pc(110) long local110 = -1L;
		if (this.aLong79 < this.aLong81 + (long) this.anInt2545 && this.aLong81 + (long) this.anInt2545 <= this.aLong79 - -((long) this.anInt2536)) {
			local110 = this.aLong81 + (long) this.anInt2545;
		} else if (this.aLong81 < this.aLong79 + (long) this.anInt2536 && (long) this.anInt2536 + this.aLong79 <= (long) this.anInt2545 + this.aLong81) {
			local110 = (long) this.anInt2536 + this.aLong79;
		}
		if (local38 > -1L && local110 > local38) {
			@Pc(194) int local194 = (int) (local110 - local38);
			Static225.method1839(this.aByteArray31, (int) (local38 - this.aLong81), this.aByteArray30, (int) (local38 - this.aLong79), local194);
		}
		this.anInt2545 = 0;
		this.aLong81 = -1L;
	}

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "(I)J")
	public long method1784() {
		return this.aLong76;
	}

	@OriginalMember(owner = "client!kj", name = "c", descriptor = "(I)V")
	private void method1785() throws IOException {
		this.anInt2536 = 0;
		if (this.aLong78 != this.aLong80) {
			this.aClass34_1.method1113(this.aLong78);
			this.aLong80 = this.aLong78;
		}
		this.aLong79 = this.aLong78;
		while (this.anInt2536 < this.aByteArray30.length) {
			@Pc(41) int local41 = this.aByteArray30.length - this.anInt2536;
			if (local41 > 200000000) {
				local41 = 200000000;
			}
			@Pc(56) int local56 = this.aClass34_1.method1117(this.anInt2536, local41, this.aByteArray30);
			if (local56 == -1) {
				break;
			}
			this.aLong80 += local56;
			this.anInt2536 += local56;
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(I[B)V")
	public void method1786(@OriginalArg(1) byte[] arg0) throws IOException {
		this.method1792(arg0, 0, arg0.length);
	}

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "(B)Ljava/io/File;")
	private File method1789() {
		return this.aClass34_1.method1114();
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "([BBII)V")
	public void method1792(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg2 > arg0.length) {
				throw new ArrayIndexOutOfBoundsException(arg2 - arg0.length);
			}
			if (this.aLong81 != -1L && this.aLong78 >= this.aLong81 && (long) arg2 + this.aLong78 <= this.aLong81 - -((long) this.anInt2545)) {
				Static225.method1839(this.aByteArray31, (int) (this.aLong78 - this.aLong81), arg0, 0, arg2);
				this.aLong78 += arg2;
				return;
			}
			@Pc(83) long local83 = this.aLong78;
			@Pc(95) int local95 = arg2;
			@Pc(128) int local128;
			if (this.aLong78 >= this.aLong79 && this.aLong79 + (long) this.anInt2536 > this.aLong78) {
				local128 = (int) ((long) this.anInt2536 + this.aLong79 - this.aLong78);
				if (local128 > arg2) {
					local128 = arg2;
				}
				arg2 -= local128;
				Static225.method1839(this.aByteArray30, (int) (this.aLong78 - this.aLong79), arg0, 0, local128);
				this.aLong78 += local128;
				arg1 = local128;
			}
			if (arg2 > this.aByteArray30.length) {
				this.aClass34_1.method1113(this.aLong78);
				this.aLong80 = this.aLong78;
				while (arg2 > 0) {
					local128 = this.aClass34_1.method1117(arg1, arg2, arg0);
					if (local128 == -1) {
						break;
					}
					arg1 += local128;
					this.aLong78 += local128;
					arg2 -= local128;
					this.aLong80 += local128;
				}
			} else if (arg2 > 0) {
				this.method1785();
				local128 = arg2;
				if (arg2 > this.anInt2536) {
					local128 = this.anInt2536;
				}
				arg2 -= local128;
				Static225.method1839(this.aByteArray30, 0, arg0, arg1, local128);
				arg1 += local128;
				this.aLong78 += local128;
			}
			if (this.aLong81 != -1L) {
				if (this.aLong81 > this.aLong78 && arg2 > 0) {
					local128 = (int) (this.aLong81 - this.aLong78) + arg1;
					if (arg2 + arg1 < local128) {
						local128 = arg2 + arg1;
					}
					while (local128 > arg1) {
						arg0[arg1++] = 0;
						arg2--;
						this.aLong78++;
					}
				}
				@Pc(302) long local302 = -1L;
				if (this.aLong81 >= local83 && local83 + (long) local95 > this.aLong81) {
					local302 = this.aLong81;
				} else if (local83 >= this.aLong81 && local83 < this.aLong81 + (long) this.anInt2545) {
					local302 = local83;
				}
				@Pc(351) long local351 = -1L;
				if (this.aLong81 + (long) this.anInt2545 > local83 && this.aLong81 + (long) this.anInt2545 <= (long) local95 + local83) {
					local351 = this.aLong81 + (long) this.anInt2545;
				} else if (local83 + (long) local95 > this.aLong81 && (long) local95 + local83 <= this.aLong81 + (long) this.anInt2545) {
					local351 = (long) local95 + local83;
				}
				if (local302 > -1L && local302 < local351) {
					@Pc(432) int local432 = (int) (local351 - local302);
					Static225.method1839(this.aByteArray31, (int) (local302 - this.aLong81), arg0, (int) (local302 - local83), local432);
					if (this.aLong78 < local351) {
						arg2 = (int) ((long) arg2 + this.aLong78 - local351);
						this.aLong78 = local351;
					}
				}
			}
		} catch (@Pc(469) IOException local469) {
			this.aLong80 = -1L;
			throw local469;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!kj", name = "d", descriptor = "(I)V")
	public void method1793() throws IOException {
		this.method1783();
		this.aClass34_1.method1115();
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(BJ)V")
	public void method1794(@OriginalArg(1) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method1789());
		}
		this.aLong78 = arg0;
	}
}
