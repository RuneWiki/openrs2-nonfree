import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!on")
public final class Class254 {

	@OriginalMember(owner = "client!on", name = "v", descriptor = "I")
	private int anInt6383;

	@OriginalMember(owner = "client!on", name = "w", descriptor = "J")
	private long aLong191;

	@OriginalMember(owner = "client!on", name = "h", descriptor = "I")
	private int anInt6374 = 0;

	@OriginalMember(owner = "client!on", name = "r", descriptor = "J")
	private long aLong189 = -1L;

	@OriginalMember(owner = "client!on", name = "z", descriptor = "J")
	private long aLong192 = -1L;

	@OriginalMember(owner = "client!on", name = "x", descriptor = "Lclient!el;")
	private final Class92 aClass92_4;

	@OriginalMember(owner = "client!on", name = "p", descriptor = "J")
	private long aLong187;

	@OriginalMember(owner = "client!on", name = "u", descriptor = "J")
	private long aLong190;

	@OriginalMember(owner = "client!on", name = "f", descriptor = "[B")
	private final byte[] aByteArray75;

	@OriginalMember(owner = "client!on", name = "q", descriptor = "J")
	private long aLong188;

	@OriginalMember(owner = "client!on", name = "C", descriptor = "[B")
	private final byte[] aByteArray76;

	@OriginalMember(owner = "client!on", name = "<init>", descriptor = "(Lclient!el;II)V")
	public Class254(@OriginalArg(0) Class92 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass92_4 = arg0;
		this.aLong190 = this.aLong187 = arg0.method1846();
		this.aByteArray75 = new byte[arg2];
		this.aLong188 = 0L;
		this.aByteArray76 = new byte[arg1];
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(I)V")
	public void method5498() throws IOException {
		this.method5501();
		this.aClass92_4.method1845();
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Z)J")
	public long method5499() {
		return this.aLong190;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(JB)V")
	public void method5500(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method5502());
		}
		this.aLong188 = arg0;
	}

	@OriginalMember(owner = "client!on", name = "b", descriptor = "(I)V")
	private void method5501() throws IOException {
		if (this.aLong192 == (long) -1) {
			return;
		}
		if (this.aLong192 != this.aLong191) {
			this.aClass92_4.method1847(this.aLong192);
			this.aLong191 = this.aLong192;
		}
		this.aClass92_4.method1839(this.aByteArray75, this.anInt6374, 0);
		this.aLong191 += this.anInt6374;
		if (this.aLong191 > this.aLong187) {
			this.aLong187 = this.aLong191;
		}
		@Pc(60) long local60 = -1L;
		if (this.aLong192 >= this.aLong189 && this.aLong192 < this.aLong189 + (long) this.anInt6383) {
			local60 = this.aLong192;
		} else if (this.aLong189 >= this.aLong192 && (long) this.anInt6374 + this.aLong192 > this.aLong189) {
			local60 = this.aLong189;
		}
		@Pc(106) long local106 = -1L;
		if ((long) this.anInt6374 + this.aLong192 > this.aLong189 && this.aLong192 + (long) this.anInt6374 <= (long) this.anInt6383 + this.aLong189) {
			local106 = this.aLong192 + (long) this.anInt6374;
		} else if (this.aLong192 < (long) this.anInt6383 + this.aLong189 && (long) this.anInt6374 + this.aLong192 >= this.aLong189 + (long) this.anInt6383) {
			local106 = (long) this.anInt6383 + this.aLong189;
		}
		if (local60 > -1L && local106 > local60) {
			@Pc(185) int local185 = (int) (local106 - local60);
			Static653.method5398(this.aByteArray75, (int) (local60 - this.aLong192), this.aByteArray76, (int) (local60 - this.aLong189), local185);
		}
		this.anInt6374 = 0;
		this.aLong192 = -1L;
	}

	@OriginalMember(owner = "client!on", name = "b", descriptor = "(Z)Ljava/io/File;")
	private File method5502() {
		return this.aClass92_4.method1844();
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(B)V")
	private void method5504() throws IOException {
		this.anInt6383 = 0;
		if (this.aLong188 != this.aLong191) {
			this.aClass92_4.method1847(this.aLong188);
			this.aLong191 = this.aLong188;
		}
		this.aLong189 = this.aLong188;
		while (this.anInt6383 < this.aByteArray76.length) {
			@Pc(53) int local53 = this.aByteArray76.length - this.anInt6383;
			if (local53 > 200000000) {
				local53 = 200000000;
			}
			@Pc(72) int local72 = this.aClass92_4.method1843(this.aByteArray76, this.anInt6383, local53);
			if (local72 == -1) {
				break;
			}
			this.anInt6383 += local72;
			this.aLong191 += local72;
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "([BB)V")
	public void method5508(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method5509(arg0, 0, arg0.length);
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "([BBII)V")
	public void method5509(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg2 > arg0.length) {
				throw new ArrayIndexOutOfBoundsException(arg2 - arg0.length);
			}
			if (this.aLong192 != -1L && this.aLong192 <= this.aLong188 && (long) arg2 + this.aLong188 <= this.aLong192 + (long) this.anInt6374) {
				Static653.method5398(this.aByteArray75, (int) (this.aLong188 - this.aLong192), arg0, 0, arg2);
				this.aLong188 += arg2;
				return;
			}
			@Pc(82) long local82 = this.aLong188;
			@Pc(86) int local86 = arg2;
			@Pc(118) int local118;
			if (this.aLong188 >= this.aLong189 && this.aLong188 < (long) this.anInt6383 + this.aLong189) {
				local118 = (int) (this.aLong189 + (long) this.anInt6383 - this.aLong188);
				if (arg2 < local118) {
					local118 = arg2;
				}
				Static653.method5398(this.aByteArray76, (int) (this.aLong188 - this.aLong189), arg0, 0, local118);
				arg2 -= local118;
				arg1 = local118;
				this.aLong188 += local118;
			}
			if (arg2 > this.aByteArray76.length) {
				this.aClass92_4.method1847(this.aLong188);
				this.aLong191 = this.aLong188;
				while (arg2 > 0) {
					local118 = this.aClass92_4.method1843(arg0, arg1, arg2);
					if (local118 == -1) {
						break;
					}
					this.aLong191 += local118;
					arg1 += local118;
					arg2 -= local118;
					this.aLong188 += local118;
				}
			} else if (arg2 > 0) {
				this.method5504();
				local118 = arg2;
				if (arg2 > this.anInt6383) {
					local118 = this.anInt6383;
				}
				Static653.method5398(this.aByteArray76, 0, arg0, arg1, local118);
				arg2 -= local118;
				arg1 += local118;
				this.aLong188 += local118;
			}
			if (this.aLong192 != -1L) {
				if (this.aLong192 > this.aLong188 && arg2 > 0) {
					local118 = (int) (this.aLong192 - this.aLong188) + arg1;
					if (local118 > arg2 + arg1) {
						local118 = arg2 + arg1;
					}
					while (local118 > arg1) {
						arg0[arg1++] = 0;
						arg2--;
						this.aLong188++;
					}
				}
				@Pc(315) long local315 = -1L;
				@Pc(317) long local317 = -1L;
				if (this.aLong192 >= local82 && (long) local86 + local82 > this.aLong192) {
					local315 = this.aLong192;
				} else if (local82 >= this.aLong192 && this.aLong192 + (long) this.anInt6374 > local82) {
					local315 = local82;
				}
				if (this.aLong192 + (long) this.anInt6374 > local82 && local82 + (long) local86 >= this.aLong192 + (long) this.anInt6374) {
					local317 = this.aLong192 + (long) this.anInt6374;
				} else if (this.aLong192 < local82 + (long) local86 && (long) this.anInt6374 + this.aLong192 >= local82 + (long) local86) {
					local317 = local82 + (long) local86;
				}
				if (local315 > -1L && local315 < local317) {
					@Pc(447) int local447 = (int) (local317 - local315);
					Static653.method5398(this.aByteArray75, (int) (local315 - this.aLong192), arg0, (int) (local315 - local82), local447);
					if (this.aLong188 < local317) {
						arg2 = (int) ((long) arg2 + this.aLong188 - local317);
						this.aLong188 = local317;
					}
				}
			}
		} catch (@Pc(483) IOException local483) {
			this.aLong191 = -1L;
			throw local483;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(II[BB)V")
	public void method5510(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		try {
			if (this.aLong190 < (long) arg0 + this.aLong188) {
				this.aLong190 = this.aLong188 + (long) arg0;
			}
			if (this.aLong192 != -1L && (this.aLong188 < this.aLong192 || this.aLong188 > this.aLong192 + (long) this.anInt6374)) {
				this.method5501();
			}
			if (this.aLong192 != -1L && (long) arg0 + this.aLong188 > (long) this.aByteArray75.length + this.aLong192) {
				@Pc(95) int local95 = (int) ((long) this.aByteArray75.length + this.aLong192 - this.aLong188);
				Static653.method5398(arg2, arg1, this.aByteArray75, (int) (this.aLong188 - this.aLong192), local95);
				this.aLong188 += local95;
				arg0 -= local95;
				arg1 += local95;
				this.anInt6374 = this.aByteArray75.length;
				this.method5501();
			}
			if (this.aByteArray75.length < arg0) {
				if (this.aLong191 != this.aLong188) {
					this.aClass92_4.method1847(this.aLong188);
					this.aLong191 = this.aLong188;
				}
				this.aClass92_4.method1839(arg2, arg0, arg1);
				this.aLong191 += arg0;
				if (this.aLong191 > this.aLong187) {
					this.aLong187 = this.aLong191;
				}
				@Pc(190) long local190 = -1L;
				@Pc(192) long local192 = -1L;
				if (this.aLong189 <= this.aLong188 && this.aLong188 < this.aLong189 + (long) this.anInt6383) {
					local190 = this.aLong188;
				} else if (this.aLong189 >= this.aLong188 && this.aLong189 < this.aLong188 + (long) arg0) {
					local190 = this.aLong189;
				}
				if (this.aLong188 + (long) arg0 > this.aLong189 && this.aLong188 + (long) arg0 <= this.aLong189 - -((long) this.anInt6383)) {
					local192 = (long) arg0 + this.aLong188;
				} else if (this.aLong188 < (long) this.anInt6383 + this.aLong189 && (long) this.anInt6383 + this.aLong189 <= (long) arg0 + this.aLong188) {
					local192 = (long) this.anInt6383 + this.aLong189;
				}
				if (local190 > -1L && local192 > local190) {
					@Pc(324) int local324 = (int) (local192 - local190);
					Static653.method5398(arg2, (int) (local190 + (long) arg1 - this.aLong188), this.aByteArray76, (int) (local190 - this.aLong189), local324);
				}
				this.aLong188 += arg0;
			} else if (arg0 > 0) {
				if (this.aLong192 == -1L) {
					this.aLong192 = this.aLong188;
				}
				Static653.method5398(arg2, arg1, this.aByteArray75, (int) (this.aLong188 - this.aLong192), arg0);
				this.aLong188 += arg0;
				if ((long) this.anInt6374 < this.aLong188 - this.aLong192) {
					this.anInt6374 = (int) (this.aLong188 - this.aLong192);
				}
			}
		} catch (@Pc(409) IOException local409) {
			this.aLong191 = -1L;
			throw local409;
		}
	}
}
