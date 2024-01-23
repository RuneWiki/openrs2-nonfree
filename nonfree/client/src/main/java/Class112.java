import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ti")
public final class Class112 {

	@OriginalMember(owner = "client!ti", name = "s", descriptor = "J")
	private long aLong151;

	@OriginalMember(owner = "client!ti", name = "x", descriptor = "I")
	private int anInt4241;

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "J")
	private long aLong148 = -1L;

	@OriginalMember(owner = "client!ti", name = "o", descriptor = "I")
	private int anInt4236 = 0;

	@OriginalMember(owner = "client!ti", name = "y", descriptor = "J")
	private long aLong153 = -1L;

	@OriginalMember(owner = "client!ti", name = "C", descriptor = "Lclient!ej;")
	private Class35 aClass35_4;

	@OriginalMember(owner = "client!ti", name = "t", descriptor = "J")
	private long aLong152;

	@OriginalMember(owner = "client!ti", name = "n", descriptor = "J")
	private long aLong150;

	@OriginalMember(owner = "client!ti", name = "d", descriptor = "[B")
	private byte[] aByteArray45;

	@OriginalMember(owner = "client!ti", name = "q", descriptor = "[B")
	private byte[] aByteArray46;

	@OriginalMember(owner = "client!ti", name = "k", descriptor = "J")
	private long aLong149;

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Lclient!ej;II)V")
	public Class112(@OriginalArg(0) Class35 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass35_4 = arg0;
		this.aLong150 = this.aLong152 = arg0.method920();
		this.aByteArray45 = new byte[arg1];
		this.aByteArray46 = new byte[arg2];
		this.aLong149 = 0L;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)V")
	public void method3286() throws IOException {
		this.method3289();
		this.aClass35_4.method921();
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(B[BII)V")
	public void method3287(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if ((long) arg2 + this.aLong149 > this.aLong150) {
				this.aLong150 = this.aLong149 + (long) arg2;
			}
			if (this.aLong148 != -1L && (this.aLong149 < this.aLong148 || this.aLong149 > this.aLong148 + (long) this.anInt4236)) {
				this.method3289();
			}
			if (this.aLong148 != -1L && this.aLong148 + (long) this.aByteArray46.length < (long) arg2 + this.aLong149) {
				@Pc(101) int local101 = (int) (this.aLong148 + (long) this.aByteArray46.length - this.aLong149);
				Static233.method868(arg0, arg1, this.aByteArray46, (int) (this.aLong149 - this.aLong148), local101);
				arg1 += local101;
				arg2 -= local101;
				this.aLong149 += local101;
				this.anInt4236 = this.aByteArray46.length;
				this.method3289();
			}
			if (arg2 > this.aByteArray46.length) {
				@Pc(148) long local148 = -1L;
				if (this.aLong151 != this.aLong149) {
					this.aClass35_4.method923(this.aLong149);
					this.aLong151 = this.aLong149;
				}
				this.aClass35_4.method918(arg2, arg0, arg1);
				@Pc(177) long local177 = -1L;
				if (this.aLong149 >= this.aLong153 && this.aLong153 + (long) this.anInt4241 > this.aLong149) {
					local177 = this.aLong149;
				} else if (this.aLong153 >= this.aLong149 && this.aLong153 < (long) arg2 + this.aLong149) {
					local177 = this.aLong153;
				}
				this.aLong151 += arg2;
				if (this.aLong152 < this.aLong151) {
					this.aLong152 = this.aLong151;
				}
				if ((long) arg2 + this.aLong149 > this.aLong153 && (long) this.anInt4241 + this.aLong153 >= this.aLong149 + (long) arg2) {
					local148 = this.aLong149 + (long) arg2;
				} else if (this.aLong149 < (long) this.anInt4241 + this.aLong153 && (long) arg2 + this.aLong149 >= this.aLong153 - -((long) this.anInt4241)) {
					local148 = (long) this.anInt4241 + this.aLong153;
				}
				if (local177 > -1L && local148 > local177) {
					@Pc(329) int local329 = (int) (local148 - local177);
					Static233.method868(arg0, (int) ((long) arg1 + local177 - this.aLong149), this.aByteArray45, (int) (local177 - this.aLong153), local329);
				}
				this.aLong149 += arg2;
			} else if (arg2 > 0) {
				if (this.aLong148 == -1L) {
					this.aLong148 = this.aLong149;
				}
				Static233.method868(arg0, arg1, this.aByteArray46, (int) (this.aLong149 - this.aLong148), arg2);
				this.aLong149 += arg2;
				if (this.aLong149 - this.aLong148 > (long) this.anInt4236) {
					this.anInt4236 = (int) (this.aLong149 - this.aLong148);
				}
			}
		} catch (@Pc(411) IOException local411) {
			this.aLong151 = -1L;
			throw local411;
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Z)V")
	private void method3289() throws IOException {
		if (this.aLong148 == -1L) {
			return;
		}
		@Pc(10) long local10 = -1L;
		@Pc(12) long local12 = -1L;
		if (this.aLong151 != this.aLong148) {
			this.aClass35_4.method923(this.aLong148);
			this.aLong151 = this.aLong148;
		}
		this.aClass35_4.method918(this.anInt4236, this.aByteArray46, 0);
		if (this.aLong153 < (long) this.anInt4236 + this.aLong148 && this.aLong153 + (long) this.anInt4241 >= (long) this.anInt4236 + this.aLong148) {
			local12 = this.aLong148 + (long) this.anInt4236;
		} else if (this.aLong148 < this.aLong153 + (long) this.anInt4241 && (long) this.anInt4236 + this.aLong148 >= (long) this.anInt4241 + this.aLong153) {
			local12 = (long) this.anInt4241 + this.aLong153;
		}
		if (this.aLong153 <= this.aLong148 && this.aLong148 < (long) this.anInt4241 + this.aLong153) {
			local10 = this.aLong148;
		} else if (this.aLong148 <= this.aLong153 && (long) this.anInt4236 + this.aLong148 > this.aLong153) {
			local10 = this.aLong153;
		}
		this.aLong151 += this.anInt4236;
		if (this.aLong151 > this.aLong152) {
			this.aLong152 = this.aLong151;
		}
		if (local10 > -1L && local10 < local12) {
			@Pc(200) int local200 = (int) (local12 - local10);
			Static233.method868(this.aByteArray46, (int) (local10 - this.aLong148), this.aByteArray45, (int) (local10 - this.aLong153), local200);
		}
		this.aLong148 = -1L;
		this.anInt4236 = 0;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(I[B)V")
	public void method3294(@OriginalArg(1) byte[] arg0) throws IOException {
		this.method3296(arg0, 0, arg0.length);
	}

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "(Z)J")
	public long method3295() {
		return this.aLong150;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "([BIII)V")
	public void method3296(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if (arg0.length < arg2) {
				throw new ArrayIndexOutOfBoundsException(arg2 - arg0.length);
			}
			if (this.aLong148 != -1L && this.aLong148 <= this.aLong149 && (long) this.anInt4236 + this.aLong148 >= (long) arg2 + this.aLong149) {
				Static233.method868(this.aByteArray46, (int) (this.aLong149 - this.aLong148), arg0, 0, arg2);
				this.aLong149 += arg2;
				return;
			}
			@Pc(85) long local85 = this.aLong149;
			@Pc(89) int local89 = arg2;
			@Pc(121) int local121;
			if (this.aLong153 <= this.aLong149 && this.aLong153 + (long) this.anInt4241 > this.aLong149) {
				local121 = (int) ((long) this.anInt4241 + this.aLong153 - this.aLong149);
				if (local121 > arg2) {
					local121 = arg2;
				}
				arg2 -= local121;
				Static233.method868(this.aByteArray45, (int) (this.aLong149 - this.aLong153), arg0, 0, local121);
				arg1 = local121;
				this.aLong149 += local121;
			}
			if (this.aByteArray45.length < arg2) {
				this.aClass35_4.method923(this.aLong149);
				this.aLong151 = this.aLong149;
				while (arg2 > 0) {
					local121 = this.aClass35_4.method919(arg1, arg2, arg0);
					if (local121 == -1) {
						break;
					}
					this.aLong149 += local121;
					this.aLong151 += local121;
					arg2 -= local121;
					arg1 += local121;
				}
			} else if (arg2 > 0) {
				this.method3297();
				local121 = arg2;
				if (arg2 > this.anInt4241) {
					local121 = this.anInt4241;
				}
				arg2 -= local121;
				Static233.method868(this.aByteArray45, 0, arg0, arg1, local121);
				arg1 += local121;
				this.aLong149 += local121;
			}
			if (this.aLong148 != -1L) {
				if (this.aLong149 < this.aLong148 && arg2 > 0) {
					local121 = (int) (this.aLong148 - this.aLong149) + arg1;
					if (arg1 + arg2 < local121) {
						local121 = arg2 + arg1;
					}
					while (local121 > arg1) {
						arg0[arg1++] = 0;
						arg2--;
						this.aLong149++;
					}
				}
				@Pc(319) long local319 = -1L;
				if (this.aLong148 >= local85 && local85 + (long) local89 > this.aLong148) {
					local319 = this.aLong148;
				} else if (local85 >= this.aLong148 && (long) this.anInt4236 + this.aLong148 > local85) {
					local319 = local85;
				}
				@Pc(359) long local359 = -1L;
				if (local85 < this.aLong148 + (long) this.anInt4236 && (long) local89 + local85 >= this.aLong148 + (long) this.anInt4236) {
					local359 = (long) this.anInt4236 + this.aLong148;
				} else if (this.aLong148 < (long) local89 + local85 && (long) this.anInt4236 + this.aLong148 >= local85 - -((long) local89)) {
					local359 = local85 + (long) local89;
				}
				if (local319 > -1L && local319 < local359) {
					@Pc(449) int local449 = (int) (local359 - local319);
					Static233.method868(this.aByteArray46, (int) (local319 - this.aLong148), arg0, (int) (local319 - local85), local449);
					if (this.aLong149 < local359) {
						arg2 = (int) ((long) arg2 + this.aLong149 - local359);
						this.aLong149 = local359;
					}
				}
			}
		} catch (@Pc(488) IOException local488) {
			this.aLong151 = -1L;
			throw local488;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!ti", name = "c", descriptor = "(I)V")
	private void method3297() throws IOException {
		this.anInt4241 = 0;
		if (this.aLong149 != this.aLong151) {
			this.aClass35_4.method923(this.aLong149);
			this.aLong151 = this.aLong149;
		}
		this.aLong153 = this.aLong149;
		while (this.anInt4241 < this.aByteArray45.length) {
			@Pc(39) int local39 = this.aByteArray45.length - this.anInt4241;
			if (local39 > 200000000) {
				local39 = 200000000;
			}
			@Pc(56) int local56 = this.aClass35_4.method919(this.anInt4241, local39, this.aByteArray45);
			if (local56 == -1) {
				break;
			}
			this.anInt4241 += local56;
			this.aLong151 += local56;
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IJ)V")
	public void method3298(@OriginalArg(1) long arg0) throws IOException {
		if (arg0 < (long) 0) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method3299());
		}
		this.aLong149 = arg0;
	}

	@OriginalMember(owner = "client!ti", name = "d", descriptor = "(I)Ljava/io/File;")
	private File method3299() {
		return this.aClass35_4.method922();
	}
}
