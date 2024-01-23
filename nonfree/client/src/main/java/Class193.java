import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wl")
public final class Class193 {

	@OriginalMember(owner = "client!wl", name = "u", descriptor = "[J")
	public static long[] aLongArray58 = new long[256];

	@OriginalMember(owner = "client!wl", name = "r", descriptor = "I")
	private int anInt6065;

	@OriginalMember(owner = "client!wl", name = "s", descriptor = "J")
	private long aLong214;

	@OriginalMember(owner = "client!wl", name = "k", descriptor = "I")
	private int anInt6061 = 0;

	@OriginalMember(owner = "client!wl", name = "q", descriptor = "J")
	private long aLong213 = -1L;

	@OriginalMember(owner = "client!wl", name = "l", descriptor = "J")
	private long aLong212 = -1L;

	@OriginalMember(owner = "client!wl", name = "p", descriptor = "Lclient!kd;")
	private Class105 aClass105_4;

	@OriginalMember(owner = "client!wl", name = "c", descriptor = "J")
	private long aLong210;

	@OriginalMember(owner = "client!wl", name = "f", descriptor = "J")
	private long aLong211;

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "[B")
	private byte[] aByteArray76;

	@OriginalMember(owner = "client!wl", name = "t", descriptor = "J")
	private long aLong215;

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "[B")
	private byte[] aByteArray75;

	static {
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			@Pc(12) long local12 = (long) local4;
			for (@Pc(14) int local14 = 0; local14 < 8; local14++) {
				if ((local12 & 0x1L) == 1L) {
					local12 = local12 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local12 >>>= 0x1;
				}
			}
			aLongArray58[local4] = local12;
		}
	}

	@OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Lclient!kd;II)V")
	public Class193(@OriginalArg(0) Class105 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass105_4 = arg0;
		this.aLong211 = this.aLong210 = arg0.method2243();
		this.aByteArray76 = new byte[arg1];
		this.aLong215 = 0L;
		this.aByteArray75 = new byte[arg2];
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(I[BIB)V")
	public void method4832(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if (this.aLong211 < (long) arg2 + this.aLong215) {
				this.aLong211 = this.aLong215 + (long) arg2;
			}
			if (this.aLong213 != -1L && (this.aLong215 < this.aLong213 || this.aLong215 > this.aLong213 + (long) this.anInt6061)) {
				this.method4837();
			}
			if (this.aLong213 != -1L && this.aLong213 + (long) this.aByteArray75.length < (long) arg2 + this.aLong215) {
				@Pc(99) int local99 = (int) ((long) this.aByteArray75.length + this.aLong213 - this.aLong215);
				arg2 -= local99;
				Static316.method80(arg1, arg0, this.aByteArray75, (int) (this.aLong215 - this.aLong213), local99);
				arg0 += local99;
				this.aLong215 += local99;
				this.anInt6061 = this.aByteArray75.length;
				this.method4837();
			}
			if (arg2 > this.aByteArray75.length) {
				@Pc(149) long local149 = -1L;
				@Pc(151) long local151 = -1L;
				if (this.aLong215 != this.aLong214) {
					this.aClass105_4.method2241(this.aLong215);
					this.aLong214 = this.aLong215;
				}
				this.aClass105_4.method2244(arg2, arg0, arg1);
				if (this.aLong215 >= this.aLong212 && this.aLong212 + (long) this.anInt6065 > this.aLong215) {
					local151 = this.aLong215;
				} else if (this.aLong215 <= this.aLong212 && (long) arg2 + this.aLong215 > this.aLong212) {
					local151 = this.aLong212;
				}
				this.aLong214 += arg2;
				if ((long) arg2 + this.aLong215 > this.aLong212 && (long) arg2 + this.aLong215 <= (long) this.anInt6065 + this.aLong212) {
					local149 = (long) arg2 + this.aLong215;
				} else if (this.aLong215 < (long) this.anInt6065 + this.aLong212 && this.aLong212 + (long) this.anInt6065 <= (long) arg2 + this.aLong215) {
					local149 = this.aLong212 + (long) this.anInt6065;
				}
				if (this.aLong214 > this.aLong210) {
					this.aLong210 = this.aLong214;
				}
				if (local151 > -1L && local149 > local151) {
					@Pc(328) int local328 = (int) (local149 - local151);
					Static316.method80(arg1, (int) ((long) arg0 + local151 - this.aLong215), this.aByteArray76, (int) (local151 - this.aLong212), local328);
				}
				this.aLong215 += arg2;
			} else if (arg2 > 0) {
				if (this.aLong213 == -1L) {
					this.aLong213 = this.aLong215;
				}
				Static316.method80(arg1, arg0, this.aByteArray75, (int) (this.aLong215 - this.aLong213), arg2);
				this.aLong215 += arg2;
				if ((long) this.anInt6061 < this.aLong215 - this.aLong213) {
					this.anInt6061 = (int) (this.aLong215 - this.aLong213);
				}
			}
		} catch (@Pc(419) IOException local419) {
			this.aLong214 = -1L;
			throw local419;
		}
	}

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "(I)V")
	private void method4833() throws IOException {
		this.anInt6065 = 0;
		if (this.aLong214 != this.aLong215) {
			this.aClass105_4.method2241(this.aLong215);
			this.aLong214 = this.aLong215;
		}
		this.aLong212 = this.aLong215;
		while (this.anInt6065 < this.aByteArray76.length) {
			@Pc(49) int local49 = this.aByteArray76.length - this.anInt6065;
			if (local49 > 200000000) {
				local49 = 200000000;
			}
			@Pc(67) int local67 = this.aClass105_4.method2242(this.aByteArray76, local49, this.anInt6065);
			if (local67 == -1) {
				break;
			}
			this.aLong214 += local67;
			this.anInt6065 += local67;
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(B)J")
	public long method4834() {
		return this.aLong211;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(ZJ)V")
	public void method4835(@OriginalArg(1) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method4839());
		}
		this.aLong215 = arg0;
	}

	@OriginalMember(owner = "client!wl", name = "c", descriptor = "(I)V")
	private void method4837() throws IOException {
		if (this.aLong213 == -1L) {
			return;
		}
		if (this.aLong213 != this.aLong214) {
			this.aClass105_4.method2241(this.aLong213);
			this.aLong214 = this.aLong213;
		}
		this.aClass105_4.method2244(this.anInt6061, 0, this.aByteArray75);
		this.aLong214 += this.anInt6061;
		if (this.aLong214 > this.aLong210) {
			this.aLong210 = this.aLong214;
		}
		@Pc(58) long local58 = -1L;
		if ((long) this.anInt6061 + this.aLong213 > this.aLong212 && this.aLong213 + (long) this.anInt6061 <= (long) this.anInt6065 + this.aLong212) {
			local58 = this.aLong213 + (long) this.anInt6061;
		} else if (this.aLong213 < this.aLong212 + (long) this.anInt6065 && this.aLong212 + (long) this.anInt6065 <= this.aLong213 + (long) this.anInt6061) {
			local58 = (long) this.anInt6065 + this.aLong212;
		}
		@Pc(129) long local129 = -1L;
		if (this.aLong212 <= this.aLong213 && this.aLong213 < (long) this.anInt6065 + this.aLong212) {
			local129 = this.aLong213;
		} else if (this.aLong213 <= this.aLong212 && this.aLong212 < this.aLong213 + (long) this.anInt6061) {
			local129 = this.aLong212;
		}
		if (local129 > -1L && local129 < local58) {
			@Pc(203) int local203 = (int) (local58 - local129);
			Static316.method80(this.aByteArray75, (int) (local129 - this.aLong213), this.aByteArray76, (int) (local129 - this.aLong212), local203);
		}
		this.aLong213 = -1L;
		this.anInt6061 = 0;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(I[BII)V")
	public void method4838(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg0.length < arg2) {
				throw new ArrayIndexOutOfBoundsException(arg2 - arg0.length);
			}
			if (this.aLong213 != -1L && this.aLong215 >= this.aLong213 && this.aLong213 + (long) this.anInt6061 >= (long) arg2 + this.aLong215) {
				Static316.method80(this.aByteArray75, (int) (this.aLong215 - this.aLong213), arg0, 0, arg2);
				this.aLong215 += arg2;
				return;
			}
			@Pc(76) int local76 = arg2;
			@Pc(81) long local81 = this.aLong215;
			@Pc(110) int local110;
			if (this.aLong212 <= this.aLong215 && this.aLong212 + (long) this.anInt6065 > this.aLong215) {
				local110 = (int) ((long) this.anInt6065 + this.aLong212 - this.aLong215);
				if (local110 > arg2) {
					local110 = arg2;
				}
				Static316.method80(this.aByteArray76, (int) (this.aLong215 - this.aLong212), arg0, 0, local110);
				arg2 -= local110;
				this.aLong215 += local110;
				arg1 = local110;
			}
			if (this.aByteArray76.length < arg2) {
				this.aClass105_4.method2241(this.aLong215);
				this.aLong214 = this.aLong215;
				while (arg2 > 0) {
					local110 = this.aClass105_4.method2242(arg0, arg2, arg1);
					if (local110 == -1) {
						break;
					}
					this.aLong214 += local110;
					arg2 -= local110;
					arg1 += local110;
					this.aLong215 += local110;
				}
			} else if (arg2 > 0) {
				local110 = arg2;
				this.method4833();
				if (this.anInt6065 < arg2) {
					local110 = this.anInt6065;
				}
				arg2 -= local110;
				Static316.method80(this.aByteArray76, 0, arg0, arg1, local110);
				this.aLong215 += local110;
				arg1 += local110;
			}
			if (this.aLong213 != -1L) {
				if (this.aLong215 < this.aLong213 && arg2 > 0) {
					local110 = arg1 + (int) (this.aLong213 - this.aLong215);
					if (local110 > arg2 + arg1) {
						local110 = arg2 + arg1;
					}
					while (local110 > arg1) {
						arg0[arg1++] = 0;
						this.aLong215++;
						arg2--;
					}
				}
				@Pc(316) long local316 = -1L;
				@Pc(318) long local318 = -1L;
				if (local81 <= this.aLong213 && this.aLong213 < local81 + (long) local76) {
					local318 = this.aLong213;
				} else if (local81 >= this.aLong213 && (long) this.anInt6061 + this.aLong213 > local81) {
					local318 = local81;
				}
				if ((long) this.anInt6061 + this.aLong213 > local81 && this.aLong213 + (long) this.anInt6061 <= (long) local76 + local81) {
					local316 = (long) this.anInt6061 + this.aLong213;
				} else if (this.aLong213 < (long) local76 + local81 && (long) local76 + local81 <= (long) this.anInt6061 + this.aLong213) {
					local316 = (long) local76 + local81;
				}
				if (local318 > -1L && local316 > local318) {
					@Pc(440) int local440 = (int) (local316 - local318);
					Static316.method80(this.aByteArray75, (int) (local318 - this.aLong213), arg0, (int) (local318 - local81), local440);
					if (local316 > this.aLong215) {
						arg2 = (int) ((long) arg2 + this.aLong215 - local316);
						this.aLong215 = local316;
					}
				}
			}
		} catch (@Pc(479) IOException local479) {
			this.aLong214 = -1L;
			throw local479;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!wl", name = "c", descriptor = "(B)Ljava/io/File;")
	private File method4839() {
		return this.aClass105_4.method2245();
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(I[B)V")
	public void method4840(@OriginalArg(1) byte[] arg0) throws IOException {
		this.method4838(arg0, 0, arg0.length);
	}
}
