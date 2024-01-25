import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vh")
public final class Class363 {

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "I")
	private int anInt10014;

	@OriginalMember(owner = "client!vh", name = "j", descriptor = "J")
	private long aLong263;

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "J")
	private long aLong259 = -1L;

	@OriginalMember(owner = "client!vh", name = "e", descriptor = "J")
	private long aLong260 = -1L;

	@OriginalMember(owner = "client!vh", name = "n", descriptor = "I")
	private int anInt10020 = 0;

	@OriginalMember(owner = "client!vh", name = "p", descriptor = "Lclient!dq;")
	private final Class79 aClass79_4;

	@OriginalMember(owner = "client!vh", name = "q", descriptor = "J")
	private long aLong264;

	@OriginalMember(owner = "client!vh", name = "f", descriptor = "J")
	private long aLong261;

	@OriginalMember(owner = "client!vh", name = "g", descriptor = "[B")
	private final byte[] aByteArray104;

	@OriginalMember(owner = "client!vh", name = "u", descriptor = "[B")
	private final byte[] aByteArray105;

	@OriginalMember(owner = "client!vh", name = "h", descriptor = "J")
	private long aLong262;

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(Lclient!dq;II)V")
	public Class363(@OriginalArg(0) Class79 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass79_4 = arg0;
		this.aLong261 = this.aLong264 = arg0.method1665();
		this.aByteArray104 = new byte[arg2];
		this.aByteArray105 = new byte[arg1];
		this.aLong262 = 0L;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "([BB)V")
	public void method8566(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method8569(arg0, 0, arg0.length);
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)J")
	public long method8567() {
		return this.aLong261;
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(I)V")
	private void method8568() throws IOException {
		this.anInt10014 = 0;
		if (this.aLong262 != this.aLong263) {
			this.aClass79_4.method1663(this.aLong262);
			this.aLong263 = this.aLong262;
		}
		this.aLong259 = this.aLong262;
		while (this.aByteArray105.length > this.anInt10014) {
			@Pc(42) int local42 = this.aByteArray105.length - this.anInt10014;
			if (local42 > 200000000) {
				local42 = 200000000;
			}
			@Pc(57) int local57 = this.aClass79_4.method1661(local42, this.anInt10014, this.aByteArray105);
			if (local57 == -1) {
				break;
			}
			this.anInt10014 += local57;
			this.aLong263 += local57;
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "([BIII)V")
	public void method8569(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if (arg0.length < arg2) {
				throw new ArrayIndexOutOfBoundsException(arg2 - arg0.length);
			}
			if (this.aLong260 != -1L && this.aLong262 >= this.aLong260 && this.aLong262 + (long) arg2 <= (long) this.anInt10020 + this.aLong260) {
				Static652.method4548(this.aByteArray104, (int) (this.aLong262 - this.aLong260), arg0, 0, arg2);
				this.aLong262 += arg2;
				return;
			}
			@Pc(87) long local87 = this.aLong262;
			@Pc(91) int local91 = arg2;
			@Pc(123) int local123;
			if (this.aLong262 >= this.aLong259 && this.aLong262 < (long) this.anInt10014 + this.aLong259) {
				local123 = (int) (this.aLong259 + (long) this.anInt10014 - this.aLong262);
				if (local123 > arg2) {
					local123 = arg2;
				}
				Static652.method4548(this.aByteArray105, (int) (this.aLong262 - this.aLong259), arg0, 0, local123);
				arg1 = local123;
				arg2 -= local123;
				this.aLong262 += local123;
			}
			if (arg2 > this.aByteArray105.length) {
				this.aClass79_4.method1663(this.aLong262);
				this.aLong263 = this.aLong262;
				while (arg2 > 0) {
					local123 = this.aClass79_4.method1661(arg2, arg1, arg0);
					if (local123 == -1) {
						break;
					}
					arg1 += local123;
					this.aLong262 += local123;
					this.aLong263 += local123;
					arg2 -= local123;
				}
			} else if (arg2 > 0) {
				this.method8568();
				local123 = arg2;
				if (arg2 > this.anInt10014) {
					local123 = this.anInt10014;
				}
				Static652.method4548(this.aByteArray105, 0, arg0, arg1, local123);
				arg2 -= local123;
				arg1 += local123;
				this.aLong262 += local123;
			}
			if (this.aLong260 != -1L) {
				if (this.aLong262 < this.aLong260 && arg2 > 0) {
					local123 = arg1 + (int) (this.aLong260 - this.aLong262);
					if (local123 > arg1 + arg2) {
						local123 = arg2 + arg1;
					}
					while (local123 > arg1) {
						arg2--;
						arg0[arg1++] = 0;
						this.aLong262++;
					}
				}
				@Pc(317) long local317 = -1L;
				@Pc(319) long local319 = -1L;
				if (local87 <= this.aLong260 && this.aLong260 < (long) local91 + local87) {
					local317 = this.aLong260;
				} else if (this.aLong260 <= local87 && (long) this.anInt10020 + this.aLong260 > local87) {
					local317 = local87;
				}
				if ((long) this.anInt10020 + this.aLong260 > local87 && (long) this.anInt10020 + this.aLong260 <= (long) local91 + local87) {
					local319 = (long) this.anInt10020 + this.aLong260;
				} else if (this.aLong260 < local87 + (long) local91 && local87 + (long) local91 <= this.aLong260 + (long) this.anInt10020) {
					local319 = (long) local91 + local87;
				}
				if (local317 > -1L && local319 > local317) {
					@Pc(429) int local429 = (int) (local319 - local317);
					Static652.method4548(this.aByteArray104, (int) (local317 - this.aLong260), arg0, (int) (local317 - local87), local429);
					if (local319 > this.aLong262) {
						arg2 = (int) ((long) arg2 + this.aLong262 - local319);
						this.aLong262 = local319;
					}
				}
			}
		} catch (@Pc(470) IOException local470) {
			this.aLong263 = -1L;
			throw local470;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)V")
	private void method8570() throws IOException {
		if (this.aLong260 == -1L) {
			return;
		}
		if (this.aLong260 != this.aLong263) {
			this.aClass79_4.method1663(this.aLong260);
			this.aLong263 = this.aLong260;
		}
		this.aClass79_4.method1660(0, this.aByteArray104, this.anInt10020);
		this.aLong263 += this.anInt10020;
		if (this.aLong264 < this.aLong263) {
			this.aLong264 = this.aLong263;
		}
		@Pc(65) long local65 = -1L;
		@Pc(67) long local67 = -1L;
		if (this.aLong260 >= this.aLong259 && this.aLong260 < this.aLong259 + (long) this.anInt10014) {
			local65 = this.aLong260;
		} else if (this.aLong259 >= this.aLong260 && this.aLong260 + (long) this.anInt10020 > this.aLong259) {
			local65 = this.aLong259;
		}
		if (this.aLong260 + (long) this.anInt10020 > this.aLong259 && (long) this.anInt10014 + this.aLong259 >= (long) this.anInt10020 + this.aLong260) {
			local67 = this.aLong260 + (long) this.anInt10020;
		} else if (this.aLong260 < (long) this.anInt10014 + this.aLong259 && this.aLong259 + (long) this.anInt10014 <= (long) this.anInt10020 + this.aLong260) {
			local67 = (long) this.anInt10014 + this.aLong259;
		}
		if (local65 > -1L && local67 > local65) {
			@Pc(196) int local196 = (int) (local67 - local65);
			Static652.method4548(this.aByteArray104, (int) (local65 - this.aLong260), this.aByteArray105, (int) (local65 - this.aLong259), local196);
		}
		this.anInt10020 = 0;
		this.aLong260 = -1L;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Z)Ljava/io/File;")
	private File method8571() {
		return this.aClass79_4.method1664();
	}

	@OriginalMember(owner = "client!vh", name = "d", descriptor = "(I)V")
	public void method8573() throws IOException {
		this.method8570();
		this.aClass79_4.method1662();
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(III[B)V")
	public void method8574(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if (this.aLong261 < (long) arg0 + this.aLong262) {
				this.aLong261 = (long) arg0 + this.aLong262;
			}
			if (this.aLong260 != -1L && (this.aLong260 > this.aLong262 || this.aLong262 > (long) this.anInt10020 + this.aLong260)) {
				this.method8570();
			}
			if (this.aLong260 != -1L && this.aLong262 + (long) arg0 > this.aLong260 - -((long) this.aByteArray104.length)) {
				@Pc(95) int local95 = (int) (this.aLong260 + (long) this.aByteArray104.length - this.aLong262);
				Static652.method4548(arg2, arg1, this.aByteArray104, (int) (this.aLong262 - this.aLong260), local95);
				this.aLong262 += local95;
				arg1 += local95;
				arg0 -= local95;
				this.anInt10020 = this.aByteArray104.length;
				this.method8570();
			}
			if (arg0 > this.aByteArray104.length) {
				if (this.aLong263 != this.aLong262) {
					this.aClass79_4.method1663(this.aLong262);
					this.aLong263 = this.aLong262;
				}
				this.aClass79_4.method1660(arg1, arg2, arg0);
				this.aLong263 += arg0;
				if (this.aLong263 > this.aLong264) {
					this.aLong264 = this.aLong263;
				}
				@Pc(184) long local184 = -1L;
				@Pc(186) long local186 = -1L;
				if (this.aLong262 >= this.aLong259 && this.aLong259 + (long) this.anInt10014 > this.aLong262) {
					local184 = this.aLong262;
				} else if (this.aLong259 >= this.aLong262 && this.aLong259 < (long) arg0 + this.aLong262) {
					local184 = this.aLong259;
				}
				if (this.aLong262 + (long) arg0 > this.aLong259 && this.aLong262 + (long) arg0 <= this.aLong259 - -((long) this.anInt10014)) {
					local186 = this.aLong262 + (long) arg0;
				} else if ((long) this.anInt10014 + this.aLong259 > this.aLong262 && (long) arg0 + this.aLong262 >= (long) this.anInt10014 + this.aLong259) {
					local186 = this.aLong259 + (long) this.anInt10014;
				}
				if (local184 > -1L && local184 < local186) {
					@Pc(322) int local322 = (int) (local186 - local184);
					Static652.method4548(arg2, (int) ((long) arg1 + local184 - this.aLong262), this.aByteArray105, (int) (local184 - this.aLong259), local322);
				}
				this.aLong262 += arg0;
			} else if (arg0 > 0) {
				if (this.aLong260 == -1L) {
					this.aLong260 = this.aLong262;
				}
				Static652.method4548(arg2, arg1, this.aByteArray104, (int) (this.aLong262 - this.aLong260), arg0);
				this.aLong262 += arg0;
				if (this.aLong262 - this.aLong260 > (long) this.anInt10020) {
					this.anInt10020 = (int) (this.aLong262 - this.aLong260);
				}
			}
		} catch (@Pc(409) IOException local409) {
			this.aLong263 = -1L;
			throw local409;
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(JB)V")
	public void method8575(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method8571());
		}
		this.aLong262 = arg0;
	}
}
