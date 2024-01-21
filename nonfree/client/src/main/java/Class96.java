import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!w")
public final class Class96 {

	@OriginalMember(owner = "client!w", name = "l", descriptor = "I")
	private int anInt4405;

	@OriginalMember(owner = "client!w", name = "G", descriptor = "J")
	private long aLong240;

	@OriginalMember(owner = "client!w", name = "g", descriptor = "J")
	private long aLong236 = -1L;

	@OriginalMember(owner = "client!w", name = "h", descriptor = "J")
	private long aLong237 = -1L;

	@OriginalMember(owner = "client!w", name = "E", descriptor = "I")
	private int anInt4414 = 0;

	@OriginalMember(owner = "client!w", name = "k", descriptor = "Lclient!wh;")
	private final Class99 aClass99_4;

	@OriginalMember(owner = "client!w", name = "d", descriptor = "J")
	private long aLong235;

	@OriginalMember(owner = "client!w", name = "u", descriptor = "J")
	private long aLong238;

	@OriginalMember(owner = "client!w", name = "w", descriptor = "J")
	private long aLong239;

	@OriginalMember(owner = "client!w", name = "D", descriptor = "[B")
	private final byte[] aByteArray54;

	@OriginalMember(owner = "client!w", name = "y", descriptor = "[B")
	private final byte[] aByteArray53;

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Lclient!wh;II)V")
	public Class96(@OriginalArg(0) Class99 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass99_4 = arg0;
		this.aLong238 = this.aLong235 = arg0.method3408();
		this.aLong239 = 0L;
		this.aByteArray54 = new byte[arg1];
		this.aByteArray53 = new byte[arg2];
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(III[B)V")
	public void method3336(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if (this.aLong238 < (long) arg0 + this.aLong239) {
				this.aLong238 = (long) arg0 + this.aLong239;
			}
			if (this.aLong237 != -1L && (this.aLong239 < this.aLong237 || (long) this.anInt4414 + this.aLong237 < this.aLong239)) {
				this.method3345();
			}
			if (this.aLong237 != -1L && (long) arg0 + this.aLong239 > this.aLong237 - -((long) this.aByteArray53.length)) {
				@Pc(98) int local98 = (int) (this.aLong237 + (long) this.aByteArray53.length - this.aLong239);
				Static216.method2200(arg2, arg1, this.aByteArray53, (int) (this.aLong239 - this.aLong237), local98);
				arg1 += local98;
				arg0 -= local98;
				this.aLong239 += local98;
				this.anInt4414 = this.aByteArray53.length;
				this.method3345();
			}
			if (this.aByteArray53.length < arg0) {
				if (this.aLong239 != this.aLong240) {
					this.aClass99_4.method3406(this.aLong239);
					this.aLong240 = this.aLong239;
				}
				this.aClass99_4.method3409(arg0, arg2, arg1);
				this.aLong240 += arg0;
				@Pc(177) long local177 = -1L;
				if (this.aLong236 <= this.aLong239 && this.aLong239 < (long) this.anInt4405 + this.aLong236) {
					local177 = this.aLong239;
				} else if (this.aLong239 <= this.aLong236 && (long) arg0 + this.aLong239 > this.aLong236) {
					local177 = this.aLong236;
				}
				if (this.aLong240 > this.aLong235) {
					this.aLong235 = this.aLong240;
				}
				@Pc(232) long local232 = -1L;
				if (this.aLong239 + (long) arg0 > this.aLong236 && (long) this.anInt4405 + this.aLong236 >= this.aLong239 - -((long) arg0)) {
					local232 = (long) arg0 + this.aLong239;
				} else if (this.aLong236 + (long) this.anInt4405 > this.aLong239 && (long) this.anInt4405 + this.aLong236 <= this.aLong239 + (long) arg0) {
					local232 = this.aLong236 + (long) this.anInt4405;
				}
				if (local177 > -1L && local177 < local232) {
					@Pc(322) int local322 = (int) (local232 - local177);
					Static216.method2200(arg2, (int) ((long) arg1 + local177 - this.aLong239), this.aByteArray54, (int) (local177 - this.aLong236), local322);
				}
				this.aLong239 += arg0;
			} else if (arg0 > 0) {
				if (this.aLong237 == -1L) {
					this.aLong237 = this.aLong239;
				}
				Static216.method2200(arg2, arg1, this.aByteArray53, (int) (this.aLong239 - this.aLong237), arg0);
				this.aLong239 += arg0;
				if ((long) this.anInt4414 < this.aLong239 - this.aLong237) {
					this.anInt4414 = (int) (this.aLong239 - this.aLong237);
				}
			}
		} catch (@Pc(411) IOException local411) {
			this.aLong240 = -1L;
			throw local411;
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V")
	public void method3337() throws IOException {
		this.method3345();
		this.aClass99_4.method3404();
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(B)V")
	private void method3338() throws IOException {
		this.anInt4405 = 0;
		if (this.aLong239 != this.aLong240) {
			this.aClass99_4.method3406(this.aLong239);
			this.aLong240 = this.aLong239;
		}
		this.aLong236 = this.aLong239;
		while (this.aByteArray54.length > this.anInt4405) {
			@Pc(41) int local41 = this.aByteArray54.length - this.anInt4405;
			if (local41 > 200000000) {
				local41 = 200000000;
			}
			@Pc(56) int local56 = this.aClass99_4.method3407(this.anInt4405, this.aByteArray54, local41);
			if (local56 == -1) {
				break;
			}
			this.anInt4405 += local56;
			this.aLong240 += local56;
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(B[B)V")
	public void method3340(@OriginalArg(1) byte[] arg0) throws IOException {
		this.method3347(arg0.length, arg0, 0);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(BJ)V")
	public void method3341(@OriginalArg(1) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method3342());
		}
		this.aLong239 = arg0;
	}

	@OriginalMember(owner = "client!w", name = "c", descriptor = "(I)Ljava/io/File;")
	private File method3342() {
		return this.aClass99_4.method3405();
	}

	@OriginalMember(owner = "client!w", name = "d", descriptor = "(I)J")
	public long method3344() {
		return this.aLong238;
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(B)V")
	private void method3345() throws IOException {
		if (this.aLong237 == -1L) {
			return;
		}
		if (this.aLong237 != this.aLong240) {
			this.aClass99_4.method3406(this.aLong237);
			this.aLong240 = this.aLong237;
		}
		@Pc(30) long local30 = -1L;
		this.aClass99_4.method3409(this.anInt4414, this.aByteArray53, 0);
		if (this.aLong236 <= this.aLong237 && this.aLong237 < this.aLong236 + (long) this.anInt4405) {
			local30 = this.aLong237;
		} else if (this.aLong236 >= this.aLong237 && (long) this.anInt4414 + this.aLong237 > this.aLong236) {
			local30 = this.aLong236;
		}
		this.aLong240 += this.anInt4414;
		if (this.aLong235 < this.aLong240) {
			this.aLong235 = this.aLong240;
		}
		@Pc(116) long local116 = -1L;
		if (this.aLong237 + (long) this.anInt4414 > this.aLong236 && this.aLong236 + (long) this.anInt4405 >= this.aLong237 + (long) this.anInt4414) {
			local116 = (long) this.anInt4414 + this.aLong237;
		} else if ((long) this.anInt4405 + this.aLong236 > this.aLong237 && this.aLong237 + (long) this.anInt4414 >= (long) this.anInt4405 + this.aLong236) {
			local116 = this.aLong236 + (long) this.anInt4405;
		}
		if (local30 > -1L && local30 < local116) {
			@Pc(207) int local207 = (int) (local116 - local30);
			Static216.method2200(this.aByteArray53, (int) (local30 - this.aLong237), this.aByteArray54, (int) (local30 - this.aLong236), local207);
		}
		this.aLong237 = -1L;
		this.anInt4414 = 0;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(I[BII)V")
	public void method3347(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if (arg0 > arg1.length) {
				throw new ArrayIndexOutOfBoundsException(arg0 - arg1.length);
			}
			if (this.aLong237 != -1L && this.aLong239 >= this.aLong237 && (long) arg0 + this.aLong239 <= this.aLong237 + (long) this.anInt4414) {
				Static216.method2200(this.aByteArray53, (int) (this.aLong239 - this.aLong237), arg1, 0, arg0);
				this.aLong239 += arg0;
				return;
			}
			@Pc(74) long local74 = this.aLong239;
			@Pc(76) int local76 = arg0;
			@Pc(106) int local106;
			if (this.aLong239 >= this.aLong236 && this.aLong239 < (long) this.anInt4405 + this.aLong236) {
				local106 = (int) ((long) this.anInt4405 + this.aLong236 - this.aLong239);
				if (local106 > arg0) {
					local106 = arg0;
				}
				Static216.method2200(this.aByteArray54, (int) (this.aLong239 - this.aLong236), arg1, 0, local106);
				arg2 = local106;
				this.aLong239 += local106;
				arg0 -= local106;
			}
			if (arg0 > this.aByteArray54.length) {
				this.aClass99_4.method3406(this.aLong239);
				this.aLong240 = this.aLong239;
				while (arg0 > 0) {
					local106 = this.aClass99_4.method3407(arg2, arg1, arg0);
					if (local106 == -1) {
						break;
					}
					this.aLong240 += local106;
					arg2 += local106;
					this.aLong239 += local106;
					arg0 -= local106;
				}
			} else if (arg0 > 0) {
				this.method3338();
				local106 = arg0;
				if (this.anInt4405 < arg0) {
					local106 = this.anInt4405;
				}
				arg0 -= local106;
				Static216.method2200(this.aByteArray54, 0, arg1, arg2, local106);
				arg2 += local106;
				this.aLong239 += local106;
			}
			if (this.aLong237 != -1L) {
				if (this.aLong239 < this.aLong237 && arg0 > 0) {
					local106 = arg2 + (int) (this.aLong237 - this.aLong239);
					if (local106 > arg0 + arg2) {
						local106 = arg2 + arg0;
					}
					while (arg2 < local106) {
						arg1[arg2++] = 0;
						this.aLong239++;
						arg0--;
					}
				}
				@Pc(304) long local304 = -1L;
				if (local74 <= this.aLong237 && this.aLong237 < local74 + (long) local76) {
					local304 = this.aLong237;
				} else if (this.aLong237 <= local74 && this.aLong237 + (long) this.anInt4414 > local74) {
					local304 = local74;
				}
				@Pc(349) long local349 = -1L;
				if (local74 < (long) this.anInt4414 + this.aLong237 && local74 + (long) local76 >= this.aLong237 - -((long) this.anInt4414)) {
					local349 = this.aLong237 + (long) this.anInt4414;
				} else if ((long) local76 + local74 > this.aLong237 && (long) local76 + local74 <= (long) this.anInt4414 + this.aLong237) {
					local349 = local74 + (long) local76;
				}
				if (local304 > -1L && local304 < local349) {
					@Pc(431) int local431 = (int) (local349 - local304);
					Static216.method2200(this.aByteArray53, (int) (local304 - this.aLong237), arg1, (int) (local304 - local74), local431);
					if (this.aLong239 < local349) {
						arg0 = (int) ((long) arg0 + this.aLong239 - local349);
						this.aLong239 = local349;
					}
				}
			}
		} catch (@Pc(468) IOException local468) {
			this.aLong240 = -1L;
			throw local468;
		}
		if (arg0 > 0) {
			throw new EOFException();
		}
	}
}
