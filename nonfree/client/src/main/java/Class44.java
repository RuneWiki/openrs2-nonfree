import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class44 {

	@OriginalMember(owner = "client!md", name = "v", descriptor = "I")
	private int anInt2950;

	@OriginalMember(owner = "client!md", name = "z", descriptor = "J")
	private long aLong85;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "J")
	private long aLong82 = -1L;

	@OriginalMember(owner = "client!md", name = "p", descriptor = "I")
	private int anInt2946 = 0;

	@OriginalMember(owner = "client!md", name = "q", descriptor = "J")
	private long aLong83 = -1L;

	@OriginalMember(owner = "client!md", name = "o", descriptor = "Lclient!sc;")
	private final Class70 aClass70_1;

	@OriginalMember(owner = "client!md", name = "t", descriptor = "J")
	private long aLong84;

	@OriginalMember(owner = "client!md", name = "B", descriptor = "J")
	private long aLong86;

	@OriginalMember(owner = "client!md", name = "n", descriptor = "[B")
	private final byte[] aByteArray32;

	@OriginalMember(owner = "client!md", name = "i", descriptor = "[B")
	private final byte[] aByteArray31;

	@OriginalMember(owner = "client!md", name = "E", descriptor = "J")
	private long aLong87;

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lclient!sc;II)V")
	public Class44(@OriginalArg(0) Class70 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass70_1 = arg0;
		this.aLong86 = this.aLong84 = arg0.method2739();
		this.aByteArray32 = new byte[arg2];
		this.aByteArray31 = new byte[arg1];
		this.aLong87 = 0L;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IBI[B)V")
	public void method2077(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if (arg2.length < arg1) {
				throw new ArrayIndexOutOfBoundsException(arg1 - arg2.length);
			}
			if (this.aLong82 != -1L && this.aLong82 <= this.aLong87 && this.aLong87 + (long) arg1 <= this.aLong82 - -((long) this.anInt2946)) {
				Static185.method2279(this.aByteArray32, (int) (this.aLong87 - this.aLong82), arg2, 0, arg1);
				this.aLong87 += arg1;
				return;
			}
			@Pc(86) long local86 = this.aLong87;
			@Pc(90) int local90 = arg1;
			@Pc(119) int local119;
			if (this.aLong87 >= this.aLong83 && this.aLong87 < (long) this.anInt2950 + this.aLong83) {
				local119 = (int) ((long) this.anInt2950 + this.aLong83 - this.aLong87);
				if (arg1 < local119) {
					local119 = arg1;
				}
				arg1 -= local119;
				Static185.method2279(this.aByteArray31, (int) (this.aLong87 - this.aLong83), arg2, 0, local119);
				arg0 = local119;
				this.aLong87 += local119;
			}
			if (arg1 > this.aByteArray31.length) {
				this.aClass70_1.method2737(this.aLong87);
				this.aLong85 = this.aLong87;
				while (arg1 > 0) {
					local119 = this.aClass70_1.method2738(arg0, arg1, arg2);
					if (local119 == -1) {
						break;
					}
					arg1 -= local119;
					arg0 += local119;
					this.aLong87 += local119;
					this.aLong85 += local119;
				}
			} else if (arg1 > 0) {
				this.method2078();
				local119 = arg1;
				if (arg1 > this.anInt2950) {
					local119 = this.anInt2950;
				}
				arg1 -= local119;
				Static185.method2279(this.aByteArray31, 0, arg2, arg0, local119);
				this.aLong87 += local119;
				arg0 += local119;
			}
			if (this.aLong82 != -1L) {
				if (this.aLong82 > this.aLong87 && arg1 > 0) {
					local119 = (int) (this.aLong82 - this.aLong87) + arg0;
					if (arg0 + arg1 < local119) {
						local119 = arg1 + arg0;
					}
					while (local119 > arg0) {
						arg2[arg0++] = 0;
						this.aLong87++;
						arg1--;
					}
				}
				@Pc(300) long local300 = -1L;
				if (this.aLong82 >= local86 && this.aLong82 < local86 + (long) local90) {
					local300 = this.aLong82;
				} else if (local86 >= this.aLong82 && (long) this.anInt2946 + this.aLong82 > local86) {
					local300 = local86;
				}
				@Pc(340) long local340 = -1L;
				if (local86 < this.aLong82 + (long) this.anInt2946 && (long) this.anInt2946 + this.aLong82 <= (long) local90 + local86) {
					local340 = (long) this.anInt2946 + this.aLong82;
				} else if (this.aLong82 < local86 + (long) local90 && local86 + (long) local90 <= this.aLong82 - -((long) this.anInt2946)) {
					local340 = (long) local90 + local86;
				}
				if (local300 > -1L && local340 > local300) {
					@Pc(419) int local419 = (int) (local340 - local300);
					Static185.method2279(this.aByteArray32, (int) (local300 - this.aLong82), arg2, (int) (local300 - local86), local419);
					if (local340 > this.aLong87) {
						arg1 = (int) ((long) arg1 + this.aLong87 - local340);
						this.aLong87 = local340;
					}
				}
			}
		} catch (@Pc(460) IOException local460) {
			this.aLong85 = -1L;
			throw local460;
		}
		if (arg1 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
	private void method2078() throws IOException {
		this.anInt2950 = 0;
		if (this.aLong87 != this.aLong85) {
			this.aClass70_1.method2737(this.aLong87);
			this.aLong85 = this.aLong87;
		}
		this.aLong83 = this.aLong87;
		while (this.aByteArray31.length > this.anInt2950) {
			@Pc(50) int local50 = this.aClass70_1.method2738(this.anInt2950, this.aByteArray31.length - this.anInt2950, this.aByteArray31);
			if (local50 == -1) {
				break;
			}
			this.aLong85 += local50;
			this.anInt2950 += local50;
		}
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(I)V")
	public void method2080() throws IOException {
		this.method2089();
		this.aClass70_1.method2740();
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(JI)V")
	public void method2082(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method2088());
		}
		this.aLong87 = arg0;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "([BIII)V")
	public void method2083(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (this.aLong86 < this.aLong87 + (long) arg2) {
				this.aLong86 = this.aLong87 + (long) arg2;
			}
			if (this.aLong82 != -1L && (this.aLong82 > this.aLong87 || (long) this.anInt2946 + this.aLong82 < this.aLong87)) {
				this.method2089();
			}
			if (this.aLong82 != -1L && this.aLong87 + (long) arg2 > (long) this.aByteArray32.length + this.aLong82) {
				@Pc(95) int local95 = (int) ((long) this.aByteArray32.length + this.aLong82 - this.aLong87);
				arg2 -= local95;
				Static185.method2279(arg0, arg1, this.aByteArray32, (int) (this.aLong87 - this.aLong82), local95);
				this.aLong87 += local95;
				arg1 += local95;
				this.anInt2946 = this.aByteArray32.length;
				this.method2089();
			}
			if (this.aByteArray32.length < arg2) {
				if (this.aLong87 != this.aLong85) {
					this.aClass70_1.method2737(this.aLong87);
					this.aLong85 = this.aLong87;
				}
				this.aClass70_1.method2742(arg0, arg1, arg2);
				@Pc(164) long local164 = -1L;
				if (this.aLong87 >= this.aLong83 && (long) this.anInt2950 + this.aLong83 > this.aLong87) {
					local164 = this.aLong87;
				} else if (this.aLong87 <= this.aLong83 && (long) arg2 + this.aLong87 > this.aLong83) {
					local164 = this.aLong83;
				}
				this.aLong85 += arg2;
				@Pc(216) long local216 = -1L;
				if ((long) arg2 + this.aLong87 > this.aLong83 && (long) this.anInt2950 + this.aLong83 >= this.aLong87 + (long) arg2) {
					local216 = (long) arg2 + this.aLong87;
				} else if (this.aLong83 + (long) this.anInt2950 > this.aLong87 && this.aLong83 + (long) this.anInt2950 <= this.aLong87 + (long) arg2) {
					local216 = (long) this.anInt2950 + this.aLong83;
				}
				if (this.aLong84 < this.aLong85) {
					this.aLong84 = this.aLong85;
				}
				if (local164 > -1L && local216 > local164) {
					@Pc(311) int local311 = (int) (local216 - local164);
					Static185.method2279(arg0, (int) ((long) arg1 + local164 - this.aLong87), this.aByteArray31, (int) (local164 - this.aLong83), local311);
				}
				this.aLong87 += arg2;
			} else if (arg2 > 0) {
				if (this.aLong82 == -1L) {
					this.aLong82 = this.aLong87;
				}
				Static185.method2279(arg0, arg1, this.aByteArray32, (int) (this.aLong87 - this.aLong82), arg2);
				this.aLong87 += arg2;
				if (this.aLong87 - this.aLong82 > (long) this.anInt2946) {
					this.anInt2946 = (int) (this.aLong87 - this.aLong82);
				}
			}
		} catch (@Pc(401) IOException local401) {
			this.aLong85 = -1L;
			throw local401;
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(B)J")
	public long method2084() {
		return this.aLong86;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "([BB)V")
	public void method2086(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method2077(0, arg0.length, arg0);
	}

	@OriginalMember(owner = "client!md", name = "d", descriptor = "(I)Ljava/io/File;")
	private File method2088() {
		return this.aClass70_1.method2741();
	}

	@OriginalMember(owner = "client!md", name = "e", descriptor = "(I)V")
	private void method2089() throws IOException {
		if (this.aLong82 == -1L) {
			return;
		}
		if (this.aLong85 != this.aLong82) {
			this.aClass70_1.method2737(this.aLong82);
			this.aLong85 = this.aLong82;
		}
		this.aClass70_1.method2742(this.aByteArray32, 0, this.anInt2946);
		this.aLong85 += this.anInt2946;
		@Pc(49) long local49 = -1L;
		@Pc(51) long local51 = -1L;
		if (this.aLong84 < this.aLong85) {
			this.aLong84 = this.aLong85;
		}
		if (this.aLong83 < this.aLong82 + (long) this.anInt2946 && (long) this.anInt2946 + this.aLong82 <= this.aLong83 + (long) this.anInt2950) {
			local49 = this.aLong82 + (long) this.anInt2946;
		} else if (this.aLong82 < (long) this.anInt2950 + this.aLong83 && this.aLong82 + (long) this.anInt2946 >= this.aLong83 + (long) this.anInt2950) {
			local49 = (long) this.anInt2950 + this.aLong83;
		}
		if (this.aLong82 >= this.aLong83 && this.aLong82 < this.aLong83 + (long) this.anInt2950) {
			local51 = this.aLong82;
		} else if (this.aLong82 <= this.aLong83 && this.aLong83 < (long) this.anInt2946 + this.aLong82) {
			local51 = this.aLong83;
		}
		if (local51 > -1L && local49 > local51) {
			@Pc(199) int local199 = (int) (local49 - local51);
			Static185.method2279(this.aByteArray32, (int) (local51 - this.aLong82), this.aByteArray31, (int) (local51 - this.aLong83), local199);
		}
		this.aLong82 = -1L;
		this.anInt2946 = 0;
	}
}
