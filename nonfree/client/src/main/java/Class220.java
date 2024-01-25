import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rs")
public final class Class220 {

	@OriginalMember(owner = "client!rs", name = "k", descriptor = "I")
	private int anInt5968;

	@OriginalMember(owner = "client!rs", name = "w", descriptor = "J")
	private long aLong174;

	@OriginalMember(owner = "client!rs", name = "l", descriptor = "I")
	private int anInt5969 = 0;

	@OriginalMember(owner = "client!rs", name = "n", descriptor = "J")
	private long aLong171 = -1L;

	@OriginalMember(owner = "client!rs", name = "o", descriptor = "J")
	private long aLong172 = -1L;

	@OriginalMember(owner = "client!rs", name = "d", descriptor = "Lclient!gq;")
	private final Class99 aClass99_4;

	@OriginalMember(owner = "client!rs", name = "u", descriptor = "J")
	private long aLong173;

	@OriginalMember(owner = "client!rs", name = "i", descriptor = "J")
	private long aLong170;

	@OriginalMember(owner = "client!rs", name = "h", descriptor = "J")
	private long aLong169;

	@OriginalMember(owner = "client!rs", name = "p", descriptor = "[B")
	private final byte[] aByteArray114;

	@OriginalMember(owner = "client!rs", name = "c", descriptor = "[B")
	private final byte[] aByteArray113;

	@OriginalMember(owner = "client!rs", name = "<init>", descriptor = "(Lclient!gq;II)V")
	public Class220(@OriginalArg(0) Class99 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass99_4 = arg0;
		this.aLong170 = this.aLong173 = arg0.method2256();
		this.aLong169 = 0L;
		this.aByteArray114 = new byte[arg2];
		this.aByteArray113 = new byte[arg1];
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)Ljava/io/File;")
	private File method4789() {
		return this.aClass99_4.method2254();
	}

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "(I)V")
	private void method4790() throws IOException {
		this.anInt5968 = 0;
		if (this.aLong174 != this.aLong169) {
			this.aClass99_4.method2253(this.aLong169);
			this.aLong174 = this.aLong169;
		}
		this.aLong172 = this.aLong169;
		while (this.aByteArray113.length > this.anInt5968) {
			@Pc(42) int local42 = this.aByteArray113.length - this.anInt5968;
			if (local42 > 200000000) {
				local42 = 200000000;
			}
			@Pc(59) int local59 = this.aClass99_4.method2255(this.anInt5968, local42, this.aByteArray113);
			if (local59 == -1) {
				break;
			}
			this.anInt5968 += local59;
			this.aLong174 += local59;
		}
	}

	@OriginalMember(owner = "client!rs", name = "c", descriptor = "(I)J")
	public long method4792() {
		return this.aLong170;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(II[BB)V")
	public void method4794(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		try {
			if (this.aLong169 + (long) arg0 > this.aLong170) {
				this.aLong170 = this.aLong169 + (long) arg0;
			}
			if (this.aLong171 != -1L && (this.aLong171 > this.aLong169 || this.aLong169 > (long) this.anInt5969 + this.aLong171)) {
				this.method4797();
			}
			if (this.aLong171 != -1L && (long) this.aByteArray114.length + this.aLong171 < this.aLong169 + (long) arg0) {
				@Pc(96) int local96 = (int) (this.aLong171 + (long) this.aByteArray114.length - this.aLong169);
				Static457.method683(arg2, arg1, this.aByteArray114, (int) (this.aLong169 - this.aLong171), local96);
				arg1 += local96;
				arg0 -= local96;
				this.aLong169 += local96;
				this.anInt5969 = this.aByteArray114.length;
				this.method4797();
			}
			if (this.aByteArray114.length < arg0) {
				if (this.aLong169 != this.aLong174) {
					this.aClass99_4.method2253(this.aLong169);
					this.aLong174 = this.aLong169;
				}
				this.aClass99_4.method2252(arg1, arg0, arg2);
				this.aLong174 += arg0;
				if (this.aLong173 < this.aLong174) {
					this.aLong173 = this.aLong174;
				}
				@Pc(187) long local187 = -1L;
				if (this.aLong172 <= this.aLong169 && this.aLong172 + (long) this.anInt5968 > this.aLong169) {
					local187 = this.aLong169;
				} else if (this.aLong172 >= this.aLong169 && (long) arg0 + this.aLong169 > this.aLong172) {
					local187 = this.aLong172;
				}
				@Pc(241) long local241 = -1L;
				if (this.aLong172 < (long) arg0 + this.aLong169 && (long) arg0 + this.aLong169 <= this.aLong172 + (long) this.anInt5968) {
					local241 = (long) arg0 + this.aLong169;
				} else if (this.aLong169 < (long) this.anInt5968 + this.aLong172 && (long) this.anInt5968 + this.aLong172 <= this.aLong169 + (long) arg0) {
					local241 = (long) this.anInt5968 + this.aLong172;
				}
				if (local187 > -1L && local241 > local187) {
					@Pc(331) int local331 = (int) (local241 - local187);
					Static457.method683(arg2, (int) ((long) arg1 + local187 - this.aLong169), this.aByteArray113, (int) (local187 - this.aLong172), local331);
				}
				this.aLong169 += arg0;
			} else if (arg0 > 0) {
				if (this.aLong171 == -1L) {
					this.aLong171 = this.aLong169;
				}
				Static457.method683(arg2, arg1, this.aByteArray114, (int) (this.aLong169 - this.aLong171), arg0);
				this.aLong169 += arg0;
				if (this.aLong169 - this.aLong171 > (long) this.anInt5969) {
					this.anInt5969 = (int) (this.aLong169 - this.aLong171);
				}
			}
		} catch (@Pc(419) IOException local419) {
			this.aLong174 = -1L;
			throw local419;
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "([BB)V")
	public void method4795(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method4798(0, arg0.length, arg0);
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(ZJ)V")
	public void method4796(@OriginalArg(1) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method4789());
		}
		this.aLong169 = arg0;
	}

	@OriginalMember(owner = "client!rs", name = "d", descriptor = "(I)V")
	private void method4797() throws IOException {
		if (this.aLong171 == -1L) {
			return;
		}
		if (this.aLong171 != this.aLong174) {
			this.aClass99_4.method2253(this.aLong171);
			this.aLong174 = this.aLong171;
		}
		this.aClass99_4.method2252(0, this.anInt5969, this.aByteArray114);
		this.aLong174 += this.anInt5969;
		if (this.aLong174 > this.aLong173) {
			this.aLong173 = this.aLong174;
		}
		@Pc(58) long local58 = -1L;
		if (this.aLong172 <= this.aLong171 && (long) this.anInt5968 + this.aLong172 > this.aLong171) {
			local58 = this.aLong171;
		} else if (this.aLong172 >= this.aLong171 && this.aLong172 < (long) this.anInt5969 + this.aLong171) {
			local58 = this.aLong172;
		}
		@Pc(112) long local112 = -1L;
		if (this.aLong172 < this.aLong171 + (long) this.anInt5969 && (long) this.anInt5968 + this.aLong172 >= this.aLong171 - -((long) this.anInt5969)) {
			local112 = this.aLong171 + (long) this.anInt5969;
		} else if (this.aLong172 + (long) this.anInt5968 > this.aLong171 && this.aLong171 + (long) this.anInt5969 >= (long) this.anInt5968 + this.aLong172) {
			local112 = (long) this.anInt5968 + this.aLong172;
		}
		if (local58 > -1L && local58 < local112) {
			@Pc(205) int local205 = (int) (local112 - local58);
			Static457.method683(this.aByteArray114, (int) (local58 - this.aLong171), this.aByteArray113, (int) (local58 - this.aLong172), local205);
		}
		this.aLong171 = -1L;
		this.anInt5969 = 0;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIB[B)V")
	public void method4798(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if (arg2.length < arg1) {
				throw new ArrayIndexOutOfBoundsException(arg1 - arg2.length);
			}
			if (this.aLong171 != -1L && this.aLong169 >= this.aLong171 && (long) this.anInt5969 + this.aLong171 >= (long) arg1 + this.aLong169) {
				Static457.method683(this.aByteArray114, (int) (this.aLong169 - this.aLong171), arg2, 0, arg1);
				this.aLong169 += arg1;
				return;
			}
			@Pc(89) long local89 = this.aLong169;
			@Pc(93) int local93 = arg1;
			@Pc(126) int local126;
			if (this.aLong172 <= this.aLong169 && this.aLong169 < this.aLong172 + (long) this.anInt5968) {
				local126 = (int) (this.aLong172 + (long) this.anInt5968 - this.aLong169);
				if (arg1 < local126) {
					local126 = arg1;
				}
				Static457.method683(this.aByteArray113, (int) (this.aLong169 - this.aLong172), arg2, 0, local126);
				arg0 = local126;
				this.aLong169 += local126;
				arg1 -= local126;
			}
			if (this.aByteArray113.length < arg1) {
				this.aClass99_4.method2253(this.aLong169);
				this.aLong174 = this.aLong169;
				while (arg1 > 0) {
					local126 = this.aClass99_4.method2255(arg0, arg1, arg2);
					if (local126 == -1) {
						break;
					}
					arg0 += local126;
					this.aLong169 += local126;
					this.aLong174 += local126;
					arg1 -= local126;
				}
			} else if (arg1 > 0) {
				this.method4790();
				local126 = arg1;
				if (this.anInt5968 < arg1) {
					local126 = this.anInt5968;
				}
				Static457.method683(this.aByteArray113, 0, arg2, arg0, local126);
				arg0 += local126;
				arg1 -= local126;
				this.aLong169 += local126;
			}
			if (this.aLong171 != -1L) {
				if (this.aLong169 < this.aLong171 && arg1 > 0) {
					local126 = (int) (this.aLong171 - this.aLong169) + arg0;
					if (local126 > arg0 + arg1) {
						local126 = arg1 + arg0;
					}
					while (local126 > arg0) {
						arg1--;
						arg2[arg0++] = 0;
						this.aLong169++;
					}
				}
				@Pc(317) long local317 = -1L;
				if (local89 <= this.aLong171 && (long) local93 + local89 > this.aLong171) {
					local317 = this.aLong171;
				} else if (local89 >= this.aLong171 && local89 < this.aLong171 + (long) this.anInt5969) {
					local317 = local89;
				}
				@Pc(361) long local361 = -1L;
				if ((long) this.anInt5969 + this.aLong171 > local89 && local89 + (long) local93 >= (long) this.anInt5969 + this.aLong171) {
					local361 = this.aLong171 + (long) this.anInt5969;
				} else if ((long) local93 + local89 > this.aLong171 && local89 + (long) local93 <= this.aLong171 - -((long) this.anInt5969)) {
					local361 = (long) local93 + local89;
				}
				if (local317 > -1L && local317 < local361) {
					@Pc(438) int local438 = (int) (local361 - local317);
					Static457.method683(this.aByteArray114, (int) (local317 - this.aLong171), arg2, (int) (local317 - local89), local438);
					if (this.aLong169 < local361) {
						arg1 = (int) ((long) arg1 + this.aLong169 - local361);
						this.aLong169 = local361;
					}
				}
			}
		} catch (@Pc(475) IOException local475) {
			this.aLong174 = -1L;
			throw local475;
		}
		if (arg1 > 0) {
			throw new EOFException();
		}
	}
}
