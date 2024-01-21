import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!t")
public final class Class68 {

	@OriginalMember(owner = "client!t", name = "w", descriptor = "J")
	private long aLong86;

	@OriginalMember(owner = "client!t", name = "G", descriptor = "I")
	private int anInt2417;

	@OriginalMember(owner = "client!t", name = "e", descriptor = "J")
	private long aLong83 = -1L;

	@OriginalMember(owner = "client!t", name = "A", descriptor = "I")
	private int anInt2412 = 0;

	@OriginalMember(owner = "client!t", name = "B", descriptor = "J")
	private long aLong88 = -1L;

	@OriginalMember(owner = "client!t", name = "f", descriptor = "Lclient!ca;")
	private final Class11 aClass11_4;

	@OriginalMember(owner = "client!t", name = "k", descriptor = "J")
	private long aLong84;

	@OriginalMember(owner = "client!t", name = "x", descriptor = "J")
	private long aLong87;

	@OriginalMember(owner = "client!t", name = "s", descriptor = "J")
	private long aLong85;

	@OriginalMember(owner = "client!t", name = "b", descriptor = "[B")
	private final byte[] aByteArray58;

	@OriginalMember(owner = "client!t", name = "p", descriptor = "[B")
	private final byte[] aByteArray59;

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Lclient!ca;II)V")
	public Class68(@OriginalArg(0) Class11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass11_4 = arg0;
		this.aLong87 = this.aLong84 = arg0.method158();
		this.aLong85 = 0L;
		this.aByteArray58 = new byte[arg2];
		this.aByteArray59 = new byte[arg1];
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(I)J")
	public long method1673() {
		return this.aLong87;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Z)V")
	private void method1675() throws IOException {
		this.anInt2417 = 0;
		if (this.aLong86 != this.aLong85) {
			this.aClass11_4.method157(this.aLong85);
			this.aLong86 = this.aLong85;
		}
		this.aLong83 = this.aLong85;
		while (this.aByteArray59.length > this.anInt2417) {
			@Pc(56) int local56 = this.aClass11_4.method159(this.aByteArray59.length - this.anInt2417, this.anInt2417, this.aByteArray59);
			if (local56 == -1) {
				break;
			}
			this.aLong86 += local56;
			this.anInt2417 += local56;
		}
	}

	@OriginalMember(owner = "client!t", name = "b", descriptor = "(B)V")
	public void method1676() throws IOException {
		this.method1680();
		this.aClass11_4.method155();
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Z[B)V")
	public void method1677(@OriginalArg(1) byte[] arg0) throws IOException {
		this.method1684(arg0, 0, arg0.length);
	}

	@OriginalMember(owner = "client!t", name = "b", descriptor = "(I)Ljava/io/File;")
	private File method1678() {
		return this.aClass11_4.method156();
	}

	@OriginalMember(owner = "client!t", name = "c", descriptor = "(I)V")
	private void method1680() throws IOException {
		if (this.aLong88 == -1L) {
			return;
		}
		if (this.aLong88 != this.aLong86) {
			this.aClass11_4.method157(this.aLong88);
			this.aLong86 = this.aLong88;
		}
		@Pc(40) long local40 = -1L;
		this.aClass11_4.method154(this.aByteArray58, 0, this.anInt2412);
		if (this.aLong88 >= this.aLong83 && this.aLong88 < (long) this.anInt2417 + this.aLong83) {
			local40 = this.aLong88;
		} else if (this.aLong83 >= this.aLong88 && this.aLong88 + (long) this.anInt2412 > this.aLong83) {
			local40 = this.aLong83;
		}
		this.aLong86 += this.anInt2412;
		if (this.aLong86 > this.aLong84) {
			this.aLong84 = this.aLong86;
		}
		@Pc(117) long local117 = -1L;
		if (this.aLong83 < this.aLong88 + (long) this.anInt2412 && this.aLong83 + (long) this.anInt2417 >= this.aLong88 + (long) this.anInt2412) {
			local117 = this.aLong88 + (long) this.anInt2412;
		} else if ((long) this.anInt2417 + this.aLong83 > this.aLong88 && this.aLong88 + (long) this.anInt2412 >= this.aLong83 + (long) this.anInt2417) {
			local117 = (long) this.anInt2417 + this.aLong83;
		}
		if (local40 > -1L && local117 > local40) {
			@Pc(205) int local205 = (int) (local117 - local40);
			Static135.method111(this.aByteArray58, (int) (local40 - this.aLong88), this.aByteArray59, (int) (local40 - this.aLong83), local205);
		}
		this.aLong88 = -1L;
		this.anInt2412 = 0;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(I[BIB)V")
	public void method1682(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if ((long) arg2 + this.aLong85 > this.aLong87) {
				this.aLong87 = this.aLong85 + (long) arg2;
			}
			if (this.aLong88 != -1L && (this.aLong85 < this.aLong88 || this.aLong85 > this.aLong88 + (long) this.anInt2412)) {
				this.method1680();
			}
			if (this.aLong88 != -1L && (long) this.aByteArray58.length + this.aLong88 < this.aLong85 + (long) arg2) {
				@Pc(95) int local95 = (int) (this.aLong88 + (long) this.aByteArray58.length - this.aLong85);
				arg2 -= local95;
				Static135.method111(arg1, arg0, this.aByteArray58, (int) (this.aLong85 - this.aLong88), local95);
				arg0 += local95;
				this.aLong85 += local95;
				this.anInt2412 = this.aByteArray58.length;
				this.method1680();
			}
			if (this.aByteArray58.length < arg2) {
				if (this.aLong85 != this.aLong86) {
					this.aClass11_4.method157(this.aLong85);
					this.aLong86 = this.aLong85;
				}
				@Pc(154) long local154 = -1L;
				this.aClass11_4.method154(arg1, arg0, arg2);
				this.aLong86 += arg2;
				if (this.aLong84 < this.aLong86) {
					this.aLong84 = this.aLong86;
				}
				@Pc(180) long local180 = -1L;
				if (this.aLong85 >= this.aLong83 && this.aLong85 < this.aLong83 + (long) this.anInt2417) {
					local154 = this.aLong85;
				} else if (this.aLong85 <= this.aLong83 && this.aLong85 + (long) arg2 > this.aLong83) {
					local154 = this.aLong83;
				}
				if (this.aLong85 + (long) arg2 > this.aLong83 && this.aLong83 + (long) this.anInt2417 >= (long) arg2 + this.aLong85) {
					local180 = this.aLong85 + (long) arg2;
				} else if ((long) this.anInt2417 + this.aLong83 > this.aLong85 && this.aLong85 + (long) arg2 >= (long) this.anInt2417 + this.aLong83) {
					local180 = this.aLong83 + (long) this.anInt2417;
				}
				if (local154 > -1L && local180 > local154) {
					@Pc(310) int local310 = (int) (local180 - local154);
					Static135.method111(arg1, (int) (local154 + (long) arg0 - this.aLong85), this.aByteArray59, (int) (local154 - this.aLong83), local310);
				}
				this.aLong85 += arg2;
			} else if (arg2 > 0) {
				if (this.aLong88 == -1L) {
					this.aLong88 = this.aLong85;
				}
				Static135.method111(arg1, arg0, this.aByteArray58, (int) (this.aLong85 - this.aLong88), arg2);
				this.aLong85 += arg2;
				if (this.aLong85 - this.aLong88 > (long) this.anInt2412) {
					this.anInt2412 = (int) (this.aLong85 - this.aLong88);
				}
			}
		} catch (@Pc(393) IOException local393) {
			this.aLong86 = -1L;
			throw local393;
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(I[BII)V")
	public void method1684(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg0.length < arg2) {
				throw new ArrayIndexOutOfBoundsException(arg2 - arg0.length);
			}
			if (this.aLong88 != -1L && this.aLong88 <= this.aLong85 && this.aLong85 + (long) arg2 <= (long) this.anInt2412 + this.aLong88) {
				Static135.method111(this.aByteArray58, (int) (this.aLong85 - this.aLong88), arg0, 0, arg2);
				this.aLong85 += arg2;
				return;
			}
			@Pc(80) long local80 = this.aLong85;
			@Pc(82) int local82 = arg2;
			@Pc(114) int local114;
			if (this.aLong85 >= this.aLong83 && this.aLong85 < this.aLong83 + (long) this.anInt2417) {
				local114 = (int) (this.aLong83 + (long) this.anInt2417 - this.aLong85);
				if (arg2 < local114) {
					local114 = arg2;
				}
				arg2 -= local114;
				Static135.method111(this.aByteArray59, (int) (this.aLong85 - this.aLong83), arg0, 0, local114);
				arg1 = local114;
				this.aLong85 += local114;
			}
			if (arg2 > this.aByteArray59.length) {
				this.aClass11_4.method157(this.aLong85);
				this.aLong86 = this.aLong85;
				while (arg2 > 0) {
					local114 = this.aClass11_4.method159(arg2, arg1, arg0);
					if (local114 == -1) {
						break;
					}
					arg1 += local114;
					this.aLong86 += local114;
					arg2 -= local114;
					this.aLong85 += local114;
				}
			} else if (arg2 > 0) {
				local114 = arg2;
				this.method1675();
				if (arg2 > this.anInt2417) {
					local114 = this.anInt2417;
				}
				Static135.method111(this.aByteArray59, 0, arg0, arg1, local114);
				this.aLong85 += local114;
				arg1 += local114;
				arg2 -= local114;
			}
			if (this.aLong88 != -1L) {
				if (this.aLong88 > this.aLong85 && arg2 > 0) {
					local114 = arg1 + (int) (this.aLong88 - this.aLong85);
					if (local114 > arg1 + arg2) {
						local114 = arg1 + arg2;
					}
					while (local114 > arg1) {
						arg0[arg1++] = 0;
						this.aLong85++;
						arg2--;
					}
				}
				@Pc(301) long local301 = -1L;
				if (local80 <= this.aLong88 && this.aLong88 < local80 + (long) local82) {
					local301 = this.aLong88;
				} else if (local80 >= this.aLong88 && local80 < this.aLong88 + (long) this.anInt2412) {
					local301 = local80;
				}
				@Pc(346) long local346 = -1L;
				if ((long) this.anInt2412 + this.aLong88 > local80 && (long) this.anInt2412 + this.aLong88 <= local80 - -((long) local82)) {
					local346 = (long) this.anInt2412 + this.aLong88;
				} else if (local80 + (long) local82 > this.aLong88 && (long) this.anInt2412 + this.aLong88 >= local80 - -((long) local82)) {
					local346 = (long) local82 + local80;
				}
				if (local301 > -1L && local301 < local346) {
					@Pc(432) int local432 = (int) (local346 - local301);
					Static135.method111(this.aByteArray58, (int) (local301 - this.aLong88), arg0, (int) (local301 - local80), local432);
					if (this.aLong85 < local346) {
						arg2 = (int) ((long) arg2 + this.aLong85 - local346);
						this.aLong85 = local346;
					}
				}
			}
		} catch (@Pc(469) IOException local469) {
			this.aLong86 = -1L;
			throw local469;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(JI)V")
	public void method1685(@OriginalArg(0) long arg0) throws IOException {
		if ((long) 0 > arg0) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method1678());
		}
		this.aLong85 = arg0;
	}
}
