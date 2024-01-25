import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wm")
public final class Class361 {

	@OriginalMember(owner = "client!wm", name = "n", descriptor = "J")
	private long aLong259;

	@OriginalMember(owner = "client!wm", name = "o", descriptor = "I")
	private int anInt10271;

	@OriginalMember(owner = "client!wm", name = "k", descriptor = "J")
	private long aLong258 = -1L;

	@OriginalMember(owner = "client!wm", name = "c", descriptor = "J")
	private long aLong256 = -1L;

	@OriginalMember(owner = "client!wm", name = "v", descriptor = "I")
	private int anInt10276 = 0;

	@OriginalMember(owner = "client!wm", name = "t", descriptor = "Lclient!qq;")
	private final Class272 aClass272_4;

	@OriginalMember(owner = "client!wm", name = "u", descriptor = "J")
	private long aLong260;

	@OriginalMember(owner = "client!wm", name = "x", descriptor = "J")
	private long aLong261;

	@OriginalMember(owner = "client!wm", name = "w", descriptor = "[B")
	private final byte[] aByteArray243;

	@OriginalMember(owner = "client!wm", name = "j", descriptor = "[B")
	private final byte[] aByteArray242;

	@OriginalMember(owner = "client!wm", name = "g", descriptor = "J")
	private long aLong257;

	@OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(Lclient!qq;II)V")
	public Class361(@OriginalArg(0) Class272 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass272_4 = arg0;
		this.aLong261 = this.aLong260 = arg0.method6176();
		this.aByteArray243 = new byte[arg1];
		this.aByteArray242 = new byte[arg2];
		this.aLong257 = 0L;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "([BI)V")
	public void method8111(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method8121(0, arg0.length, arg0);
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(BJ)V")
	public void method8112(@OriginalArg(1) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method8117());
		}
		this.aLong257 = arg0;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Z)J")
	public long method8113() {
		return this.aLong261;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(ZII[B)V")
	public void method8116(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if (this.aLong261 < this.aLong257 + (long) arg0) {
				this.aLong261 = this.aLong257 + (long) arg0;
			}
			if (this.aLong258 != -1L && (this.aLong258 > this.aLong257 || (long) this.anInt10276 + this.aLong258 < this.aLong257)) {
				this.method8120();
			}
			if (this.aLong258 != -1L && (long) this.aByteArray242.length + this.aLong258 < (long) arg0 + this.aLong257) {
				@Pc(87) int local87 = (int) ((long) this.aByteArray242.length + this.aLong258 - this.aLong257);
				Static604.method6225(arg2, arg1, this.aByteArray242, (int) (this.aLong257 - this.aLong258), local87);
				arg0 -= local87;
				this.aLong257 += local87;
				arg1 += local87;
				this.anInt10276 = this.aByteArray242.length;
				this.method8120();
			}
			if (this.aByteArray242.length < arg0) {
				if (this.aLong257 != this.aLong259) {
					this.aClass272_4.method6175(this.aLong257);
					this.aLong259 = this.aLong257;
				}
				this.aClass272_4.method6170(arg2, arg1, arg0);
				this.aLong259 += arg0;
				if (this.aLong260 < this.aLong259) {
					this.aLong260 = this.aLong259;
				}
				@Pc(178) long local178 = -1L;
				if (this.aLong256 <= this.aLong257 && this.aLong257 < this.aLong256 + (long) this.anInt10271) {
					local178 = this.aLong257;
				} else if (this.aLong256 >= this.aLong257 && this.aLong257 + (long) arg0 > this.aLong256) {
					local178 = this.aLong256;
				}
				@Pc(228) long local228 = -1L;
				if ((long) arg0 + this.aLong257 > this.aLong256 && this.aLong257 + (long) arg0 <= (long) this.anInt10271 + this.aLong256) {
					local228 = this.aLong257 + (long) arg0;
				} else if (this.aLong257 < (long) this.anInt10271 + this.aLong256 && this.aLong257 + (long) arg0 >= this.aLong256 - -((long) this.anInt10271)) {
					local228 = this.aLong256 + (long) this.anInt10271;
				}
				if (local178 > -1L && local228 > local178) {
					@Pc(310) int local310 = (int) (local228 - local178);
					Static604.method6225(arg2, (int) ((long) arg1 + local178 - this.aLong257), this.aByteArray243, (int) (local178 - this.aLong256), local310);
				}
				this.aLong257 += arg0;
			} else if (arg0 > 0) {
				if (this.aLong258 == -1L) {
					this.aLong258 = this.aLong257;
				}
				Static604.method6225(arg2, arg1, this.aByteArray242, (int) (this.aLong257 - this.aLong258), arg0);
				this.aLong257 += arg0;
				if (this.aLong257 - this.aLong258 > (long) this.anInt10276) {
					this.anInt10276 = (int) (this.aLong257 - this.aLong258);
				}
			}
		} catch (@Pc(394) IOException local394) {
			this.aLong259 = -1L;
			throw local394;
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)Ljava/io/File;")
	private File method8117() {
		return this.aClass272_4.method6174();
	}

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "(I)V")
	public void method8119() throws IOException {
		this.method8120();
		this.aClass272_4.method6172();
	}

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "(B)V")
	private void method8120() throws IOException {
		if (this.aLong258 == -1L) {
			return;
		}
		if (this.aLong259 != this.aLong258) {
			this.aClass272_4.method6175(this.aLong258);
			this.aLong259 = this.aLong258;
		}
		this.aClass272_4.method6170(this.aByteArray242, 0, this.anInt10276);
		this.aLong259 += this.anInt10276;
		if (this.aLong259 > this.aLong260) {
			this.aLong260 = this.aLong259;
		}
		@Pc(72) long local72 = -1L;
		if (this.aLong258 >= this.aLong256 && (long) this.anInt10271 + this.aLong256 > this.aLong258) {
			local72 = this.aLong258;
		} else if (this.aLong256 >= this.aLong258 && (long) this.anInt10276 + this.aLong258 > this.aLong256) {
			local72 = this.aLong256;
		}
		@Pc(122) long local122 = -1L;
		if (this.aLong256 < (long) this.anInt10276 + this.aLong258 && this.aLong258 + (long) this.anInt10276 <= (long) this.anInt10271 + this.aLong256) {
			local122 = this.aLong258 + (long) this.anInt10276;
		} else if (this.aLong256 + (long) this.anInt10271 > this.aLong258 && this.aLong256 + (long) this.anInt10271 <= (long) this.anInt10276 + this.aLong258) {
			local122 = this.aLong256 + (long) this.anInt10271;
		}
		if (local72 > -1L && local122 > local72) {
			@Pc(220) int local220 = (int) (local122 - local72);
			Static604.method6225(this.aByteArray242, (int) (local72 - this.aLong258), this.aByteArray243, (int) (local72 - this.aLong256), local220);
		}
		this.aLong258 = -1L;
		this.anInt10276 = 0;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(BII[B)V")
	public void method8121(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if (arg2.length < arg1) {
				throw new ArrayIndexOutOfBoundsException(arg1 - arg2.length);
			}
			if (this.aLong258 != -1L && this.aLong258 <= this.aLong257 && this.aLong257 + (long) arg1 <= (long) this.anInt10276 + this.aLong258) {
				Static604.method6225(this.aByteArray242, (int) (this.aLong257 - this.aLong258), arg2, 0, arg1);
				this.aLong257 += arg1;
				return;
			}
			@Pc(82) long local82 = this.aLong257;
			@Pc(86) int local86 = arg1;
			@Pc(118) int local118;
			if (this.aLong257 >= this.aLong256 && this.aLong257 < (long) this.anInt10271 + this.aLong256) {
				local118 = (int) ((long) this.anInt10271 + this.aLong256 - this.aLong257);
				if (local118 > arg1) {
					local118 = arg1;
				}
				Static604.method6225(this.aByteArray243, (int) (this.aLong257 - this.aLong256), arg2, 0, local118);
				arg0 = local118;
				arg1 -= local118;
				this.aLong257 += local118;
			}
			if (this.aByteArray243.length < arg1) {
				this.aClass272_4.method6175(this.aLong257);
				this.aLong259 = this.aLong257;
				while (arg1 > 0) {
					local118 = this.aClass272_4.method6177(arg0, arg1, arg2);
					if (local118 == -1) {
						break;
					}
					this.aLong259 += local118;
					arg1 -= local118;
					this.aLong257 += local118;
					arg0 += local118;
				}
			} else if (arg1 > 0) {
				this.method8122();
				local118 = arg1;
				if (arg1 > this.anInt10271) {
					local118 = this.anInt10271;
				}
				Static604.method6225(this.aByteArray243, 0, arg2, arg0, local118);
				arg0 += local118;
				arg1 -= local118;
				this.aLong257 += local118;
			}
			if (this.aLong258 != -1L) {
				if (this.aLong258 > this.aLong257 && arg1 > 0) {
					local118 = arg0 + (int) (this.aLong258 - this.aLong257);
					if (local118 > arg0 + arg1) {
						local118 = arg1 + arg0;
					}
					while (local118 > arg0) {
						arg2[arg0++] = 0;
						arg1--;
						this.aLong257++;
					}
				}
				@Pc(312) long local312 = -1L;
				if (local82 <= this.aLong258 && local82 + (long) local86 > this.aLong258) {
					local312 = this.aLong258;
				} else if (this.aLong258 <= local82 && local82 < this.aLong258 + (long) this.anInt10276) {
					local312 = local82;
				}
				@Pc(357) long local357 = -1L;
				if (local82 < this.aLong258 + (long) this.anInt10276 && this.aLong258 + (long) this.anInt10276 <= (long) local86 + local82) {
					local357 = (long) this.anInt10276 + this.aLong258;
				} else if (this.aLong258 < local82 + (long) local86 && this.aLong258 + (long) this.anInt10276 >= (long) local86 + local82) {
					local357 = (long) local86 + local82;
				}
				if (local312 > -1L && local312 < local357) {
					@Pc(436) int local436 = (int) (local357 - local312);
					Static604.method6225(this.aByteArray242, (int) (local312 - this.aLong258), arg2, (int) (local312 - local82), local436);
					if (local357 > this.aLong257) {
						arg1 = (int) ((long) arg1 + this.aLong257 - local357);
						this.aLong257 = local357;
					}
				}
			}
		} catch (@Pc(474) IOException local474) {
			this.aLong259 = -1L;
			throw local474;
		}
		if (arg1 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!wm", name = "c", descriptor = "(B)V")
	private void method8122() throws IOException {
		this.anInt10271 = 0;
		if (this.aLong257 != this.aLong259) {
			this.aClass272_4.method6175(this.aLong257);
			this.aLong259 = this.aLong257;
		}
		this.aLong256 = this.aLong257;
		while (this.anInt10271 < this.aByteArray243.length) {
			@Pc(44) int local44 = this.aByteArray243.length - this.anInt10271;
			if (local44 > 200000000) {
				local44 = 200000000;
			}
			@Pc(59) int local59 = this.aClass272_4.method6177(this.anInt10271, local44, this.aByteArray243);
			if (local59 == -1) {
				break;
			}
			this.aLong259 += local59;
			this.anInt10271 += local59;
		}
	}
}
