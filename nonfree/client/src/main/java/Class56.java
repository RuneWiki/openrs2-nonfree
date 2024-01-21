import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public final class Class56 {

	@OriginalMember(owner = "client!oe", name = "z", descriptor = "I")
	private int anInt2096;

	@OriginalMember(owner = "client!oe", name = "A", descriptor = "J")
	private long aLong69;

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "J")
	private long aLong65 = -1L;

	@OriginalMember(owner = "client!oe", name = "d", descriptor = "I")
	private int anInt2089 = 0;

	@OriginalMember(owner = "client!oe", name = "y", descriptor = "J")
	private long aLong68 = -1L;

	@OriginalMember(owner = "client!oe", name = "k", descriptor = "Lclient!ic;")
	private final Class30 aClass30_1;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "J")
	private long aLong64;

	@OriginalMember(owner = "client!oe", name = "x", descriptor = "J")
	private long aLong67;

	@OriginalMember(owner = "client!oe", name = "f", descriptor = "J")
	private long aLong66;

	@OriginalMember(owner = "client!oe", name = "i", descriptor = "[B")
	private final byte[] aByteArray68;

	@OriginalMember(owner = "client!oe", name = "h", descriptor = "[B")
	private final byte[] aByteArray67;

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(Lclient!ic;II)V")
	public Class56(@OriginalArg(0) Class30 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass30_1 = arg0;
		this.aLong67 = this.aLong64 = arg0.method974();
		this.aLong66 = 0L;
		this.aByteArray68 = new byte[arg1];
		this.aByteArray67 = new byte[arg2];
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIB[B)V")
	public void method1465(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if (arg2.length < arg1) {
				throw new ArrayIndexOutOfBoundsException(arg1 - arg2.length);
			}
			if (this.aLong68 != -1L && this.aLong68 <= this.aLong66 && this.aLong66 + (long) arg1 <= (long) this.anInt2089 + this.aLong68) {
				Static136.method1939(this.aByteArray67, (int) (this.aLong66 - this.aLong68), arg2, 0, arg1);
				this.aLong66 += arg1;
				return;
			}
			@Pc(77) long local77 = this.aLong66;
			@Pc(81) int local81 = arg1;
			if (this.aLong66 >= this.aLong65 && this.aLong66 < (long) this.anInt2096 + this.aLong65) {
				@Pc(114) int local114 = (int) ((long) this.anInt2096 + this.aLong65 - this.aLong66);
				if (local114 > arg1) {
					local114 = arg1;
				}
				arg1 -= local114;
				Static136.method1939(this.aByteArray68, (int) (this.aLong66 - this.aLong65), arg2, 0, local114);
				this.aLong66 += local114;
				arg0 = local114;
			}
			@Pc(180) int local180;
			if (this.aByteArray68.length < arg1) {
				this.aClass30_1.method971(this.aLong66);
				this.aLong69 = this.aLong66;
				while (arg1 > 0) {
					local180 = this.aClass30_1.method972(arg0, arg1, arg2);
					if (local180 == -1) {
						break;
					}
					this.aLong66 += local180;
					this.aLong69 += local180;
					arg0 += local180;
					arg1 -= local180;
				}
			} else if (arg1 > 0) {
				this.method1473();
				local180 = arg1;
				if (arg1 > this.anInt2096) {
					local180 = this.anInt2096;
				}
				Static136.method1939(this.aByteArray68, 0, arg2, arg0, local180);
				this.aLong66 += local180;
				arg0 += local180;
				arg1 -= local180;
			}
			if (this.aLong68 != -1L) {
				if (this.aLong66 < this.aLong68 && arg1 > 0) {
					local180 = arg0 + (int) (this.aLong68 - this.aLong66);
					if (local180 > arg0 + arg1) {
						local180 = arg0 + arg1;
					}
					while (local180 > arg0) {
						arg2[arg0++] = 0;
						this.aLong66++;
						arg1--;
					}
				}
				@Pc(317) long local317 = -1L;
				if (this.aLong68 >= local77 && (long) local81 + local77 > this.aLong68) {
					local317 = this.aLong68;
				} else if (local77 >= this.aLong68 && (long) this.anInt2089 + this.aLong68 > local77) {
					local317 = local77;
				}
				@Pc(357) long local357 = -1L;
				if ((long) this.anInt2089 + this.aLong68 > local77 && this.aLong68 + (long) this.anInt2089 <= local77 + (long) local81) {
					local357 = (long) this.anInt2089 + this.aLong68;
				} else if (this.aLong68 < local77 + (long) local81 && local77 + (long) local81 <= (long) this.anInt2089 + this.aLong68) {
					local357 = (long) local81 + local77;
				}
				if (local317 > -1L && local357 > local317) {
					@Pc(441) int local441 = (int) (local357 - local317);
					Static136.method1939(this.aByteArray67, (int) (local317 - this.aLong68), arg2, (int) (local317 - local77), local441);
					if (local357 > this.aLong66) {
						arg1 = (int) ((long) arg1 + this.aLong66 - local357);
						this.aLong66 = local357;
					}
				}
			}
		} catch (@Pc(479) IOException local479) {
			this.aLong69 = -1L;
			throw local479;
		}
		if (arg1 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)J")
	public long method1466() {
		return this.aLong67;
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(I)V")
	public void method1467() throws IOException {
		this.method1472();
		this.aClass30_1.method969();
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(JZ)V")
	public void method1469(@OriginalArg(0) long arg0) {
		if (arg0 >= 0L) {
			this.aLong66 = arg0;
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(BI[BI)V")
	public void method1471(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (this.aLong66 + (long) arg0 > this.aLong67) {
				this.aLong67 = (long) arg0 + this.aLong66;
			}
			if (this.aLong68 != -1L && (this.aLong66 < this.aLong68 || (long) this.anInt2089 + this.aLong68 < this.aLong66)) {
				this.method1472();
			}
			if (this.aLong68 != -1L && this.aLong68 + (long) this.aByteArray67.length < (long) arg0 + this.aLong66) {
				@Pc(91) int local91 = (int) ((long) this.aByteArray67.length + this.aLong68 - this.aLong66);
				Static136.method1939(arg1, arg2, this.aByteArray67, (int) (this.aLong66 - this.aLong68), local91);
				this.aLong66 += local91;
				arg2 += local91;
				this.anInt2089 = this.aByteArray67.length;
				arg0 -= local91;
				this.method1472();
			}
			if (this.aByteArray67.length < arg0) {
				if (this.aLong66 != this.aLong69) {
					this.aClass30_1.method971(this.aLong66);
					this.aLong69 = this.aLong66;
				}
				this.aClass30_1.method973(arg1, arg2, arg0);
				@Pc(165) long local165 = -1L;
				@Pc(167) long local167 = -1L;
				if (this.aLong66 >= this.aLong65 && (long) this.anInt2096 + this.aLong65 > this.aLong66) {
					local165 = this.aLong66;
				} else if (this.aLong65 >= this.aLong66 && this.aLong66 + (long) arg0 > this.aLong65) {
					local165 = this.aLong65;
				}
				this.aLong69 += arg0;
				if (this.aLong69 > this.aLong64) {
					this.aLong64 = this.aLong69;
				}
				if (this.aLong65 < this.aLong66 + (long) arg0 && this.aLong66 + (long) arg0 <= (long) this.anInt2096 + this.aLong65) {
					local167 = (long) arg0 + this.aLong66;
				} else if (this.aLong65 + (long) this.anInt2096 > this.aLong66 && this.aLong65 + (long) this.anInt2096 <= (long) arg0 + this.aLong66) {
					local167 = (long) this.anInt2096 + this.aLong65;
				}
				if (local165 > -1L && local165 < local167) {
					@Pc(311) int local311 = (int) (local167 - local165);
					Static136.method1939(arg1, (int) (local165 + (long) arg2 - this.aLong66), this.aByteArray68, (int) (local165 - this.aLong65), local311);
				}
				this.aLong66 += arg0;
			} else if (arg0 > 0) {
				if (this.aLong68 == -1L) {
					this.aLong68 = this.aLong66;
				}
				Static136.method1939(arg1, arg2, this.aByteArray67, (int) (this.aLong66 - this.aLong68), arg0);
				this.aLong66 += arg0;
				if (this.aLong66 - this.aLong68 > (long) this.anInt2089) {
					this.anInt2089 = (int) (this.aLong66 - this.aLong68);
				}
			}
		} catch (@Pc(393) IOException local393) {
			this.aLong69 = -1L;
			throw local393;
		}
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(B)V")
	private void method1472() throws IOException {
		if (this.aLong68 == -1L) {
			return;
		}
		if (this.aLong69 != this.aLong68) {
			this.aClass30_1.method971(this.aLong68);
			this.aLong69 = this.aLong68;
		}
		this.aClass30_1.method973(this.aByteArray67, 0, this.anInt2089);
		this.aLong69 += this.anInt2089;
		if (this.aLong69 > this.aLong64) {
			this.aLong64 = this.aLong69;
		}
		@Pc(55) long local55 = -1L;
		if (this.aLong65 <= this.aLong68 && this.aLong68 < (long) this.anInt2096 + this.aLong65) {
			local55 = this.aLong68;
		} else if (this.aLong65 >= this.aLong68 && this.aLong65 < (long) this.anInt2089 + this.aLong68) {
			local55 = this.aLong65;
		}
		@Pc(101) long local101 = -1L;
		if (this.aLong65 < this.aLong68 + (long) this.anInt2089 && this.aLong65 + (long) this.anInt2096 >= this.aLong68 - -((long) this.anInt2089)) {
			local101 = this.aLong68 + (long) this.anInt2089;
		} else if (this.aLong68 < (long) this.anInt2096 + this.aLong65 && (long) this.anInt2089 + this.aLong68 >= this.aLong65 - -((long) this.anInt2096)) {
			local101 = this.aLong65 + (long) this.anInt2096;
		}
		if (local55 > -1L && local55 < local101) {
			@Pc(201) int local201 = (int) (local101 - local55);
			Static136.method1939(this.aByteArray67, (int) (local55 - this.aLong68), this.aByteArray68, (int) (local55 - this.aLong65), local201);
		}
		this.anInt2089 = 0;
		this.aLong68 = -1L;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Z)V")
	private void method1473() throws IOException {
		this.anInt2096 = 0;
		if (this.aLong66 != this.aLong69) {
			this.aClass30_1.method971(this.aLong66);
			this.aLong69 = this.aLong66;
		}
		this.aLong65 = this.aLong66;
		while (this.anInt2096 < this.aByteArray68.length) {
			@Pc(46) int local46 = this.aClass30_1.method972(this.anInt2096, this.aByteArray68.length - this.anInt2096, this.aByteArray68);
			if (local46 == -1) {
				break;
			}
			this.aLong69 += local46;
			this.anInt2096 += local46;
		}
	}
}
