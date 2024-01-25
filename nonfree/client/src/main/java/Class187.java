import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ok")
public final class Class187 {

	@OriginalMember(owner = "client!ok", name = "e", descriptor = "J")
	private long aLong153;

	@OriginalMember(owner = "client!ok", name = "n", descriptor = "I")
	private int anInt5513;

	@OriginalMember(owner = "client!ok", name = "q", descriptor = "J")
	private long aLong155 = -1L;

	@OriginalMember(owner = "client!ok", name = "r", descriptor = "J")
	private long aLong156 = -1L;

	@OriginalMember(owner = "client!ok", name = "t", descriptor = "I")
	private int anInt5516 = 0;

	@OriginalMember(owner = "client!ok", name = "h", descriptor = "Lclient!je;")
	private final Class128 aClass128_4;

	@OriginalMember(owner = "client!ok", name = "k", descriptor = "J")
	private long aLong154;

	@OriginalMember(owner = "client!ok", name = "w", descriptor = "J")
	private long aLong157;

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "J")
	private long aLong152;

	@OriginalMember(owner = "client!ok", name = "f", descriptor = "[B")
	private final byte[] aByteArray70;

	@OriginalMember(owner = "client!ok", name = "l", descriptor = "[B")
	private final byte[] aByteArray71;

	@OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(Lclient!je;II)V")
	public Class187(@OriginalArg(0) Class128 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass128_4 = arg0;
		this.aLong157 = this.aLong154 = arg0.method3092();
		this.aLong152 = 0L;
		this.aByteArray70 = new byte[arg1];
		this.aByteArray71 = new byte[arg2];
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(I[B)V")
	public void method4252(@OriginalArg(1) byte[] arg0) throws IOException {
		this.method4259(0, arg0.length, arg0);
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)J")
	public long method4253() {
		return this.aLong157;
	}

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "(B)V")
	private void method4255() throws IOException {
		if (this.aLong155 == -1L) {
			return;
		}
		if (this.aLong153 != this.aLong155) {
			this.aClass128_4.method3090(this.aLong155);
			this.aLong153 = this.aLong155;
		}
		this.aClass128_4.method3089(this.anInt5516, 0, this.aByteArray71);
		this.aLong153 += this.anInt5516;
		if (this.aLong154 < this.aLong153) {
			this.aLong154 = this.aLong153;
		}
		@Pc(55) long local55 = -1L;
		if (this.aLong156 <= this.aLong155 && (long) this.anInt5513 + this.aLong156 > this.aLong155) {
			local55 = this.aLong155;
		} else if (this.aLong155 <= this.aLong156 && this.aLong156 < this.aLong155 + (long) this.anInt5516) {
			local55 = this.aLong156;
		}
		@Pc(101) long local101 = -1L;
		if ((long) this.anInt5516 + this.aLong155 > this.aLong156 && this.aLong155 + (long) this.anInt5516 <= this.aLong156 + (long) this.anInt5513) {
			local101 = this.aLong155 + (long) this.anInt5516;
		} else if (this.aLong155 < (long) this.anInt5513 + this.aLong156 && this.aLong156 + (long) this.anInt5513 <= this.aLong155 - -((long) this.anInt5516)) {
			local101 = this.aLong156 + (long) this.anInt5513;
		}
		if (local55 > -1L && local101 > local55) {
			@Pc(196) int local196 = (int) (local101 - local55);
			Static469.method6021(this.aByteArray71, (int) (local55 - this.aLong155), this.aByteArray70, (int) (local55 - this.aLong156), local196);
		}
		this.anInt5516 = 0;
		this.aLong155 = -1L;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(I[BII)V")
	public void method4256(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (this.aLong157 < (long) arg1 + this.aLong152) {
				this.aLong157 = this.aLong152 + (long) arg1;
			}
			if (this.aLong155 != (long) -1 && (this.aLong155 > this.aLong152 || this.aLong152 > this.aLong155 + (long) this.anInt5516)) {
				this.method4255();
			}
			if (this.aLong155 != -1L && this.aLong152 + (long) arg1 > this.aLong155 - -((long) this.aByteArray71.length)) {
				@Pc(88) int local88 = (int) ((long) this.aByteArray71.length + this.aLong155 - this.aLong152);
				Static469.method6021(arg0, arg2, this.aByteArray71, (int) (this.aLong152 - this.aLong155), local88);
				arg2 += local88;
				this.aLong152 += local88;
				arg1 -= local88;
				this.anInt5516 = this.aByteArray71.length;
				this.method4255();
			}
			if (this.aByteArray71.length < arg1) {
				if (this.aLong153 != this.aLong152) {
					this.aClass128_4.method3090(this.aLong152);
					this.aLong153 = this.aLong152;
				}
				this.aClass128_4.method3089(arg1, arg2, arg0);
				this.aLong153 += arg1;
				if (this.aLong154 < this.aLong153) {
					this.aLong154 = this.aLong153;
				}
				@Pc(181) long local181 = -1L;
				if (this.aLong156 <= this.aLong152 && this.aLong156 + (long) this.anInt5513 > this.aLong152) {
					local181 = this.aLong152;
				} else if (this.aLong156 >= this.aLong152 && this.aLong156 < this.aLong152 + (long) arg1) {
					local181 = this.aLong156;
				}
				@Pc(223) long local223 = -1L;
				if (this.aLong156 < this.aLong152 + (long) arg1 && this.aLong156 + (long) this.anInt5513 >= (long) arg1 + this.aLong152) {
					local223 = (long) arg1 + this.aLong152;
				} else if (this.aLong156 + (long) this.anInt5513 > this.aLong152 && (long) arg1 + this.aLong152 >= this.aLong156 - -((long) this.anInt5513)) {
					local223 = this.aLong156 + (long) this.anInt5513;
				}
				if (local181 > -1L && local223 > local181) {
					@Pc(318) int local318 = (int) (local223 - local181);
					Static469.method6021(arg0, (int) ((long) arg2 + local181 - this.aLong152), this.aByteArray70, (int) (local181 - this.aLong156), local318);
				}
				this.aLong152 += arg1;
			} else if (arg1 > 0) {
				if (this.aLong155 == -1L) {
					this.aLong155 = this.aLong152;
				}
				Static469.method6021(arg0, arg2, this.aByteArray71, (int) (this.aLong152 - this.aLong155), arg1);
				this.aLong152 += arg1;
				if ((long) this.anInt5516 < this.aLong152 - this.aLong155) {
					this.anInt5516 = (int) (this.aLong152 - this.aLong155);
				}
			}
		} catch (@Pc(401) IOException local401) {
			this.aLong153 = -1L;
			throw local401;
		}
	}

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "(I)Ljava/io/File;")
	private File method4257() {
		return this.aClass128_4.method3094();
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(II[BI)V")
	public void method4259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		try {
			if (arg1 > arg2.length) {
				throw new ArrayIndexOutOfBoundsException(arg1 - arg2.length);
			}
			if (this.aLong155 != -1L && this.aLong155 <= this.aLong152 && (long) arg1 + this.aLong152 <= this.aLong155 + (long) this.anInt5516) {
				Static469.method6021(this.aByteArray71, (int) (this.aLong152 - this.aLong155), arg2, 0, arg1);
				this.aLong152 += arg1;
				return;
			}
			@Pc(74) long local74 = this.aLong152;
			@Pc(78) int local78 = arg1;
			@Pc(111) int local111;
			if (this.aLong156 <= this.aLong152 && this.aLong156 + (long) this.anInt5513 > this.aLong152) {
				local111 = (int) (this.aLong156 + (long) this.anInt5513 - this.aLong152);
				if (local111 > arg1) {
					local111 = arg1;
				}
				Static469.method6021(this.aByteArray70, (int) (this.aLong152 - this.aLong156), arg2, 0, local111);
				this.aLong152 += local111;
				arg1 -= local111;
				arg0 = local111;
			}
			if (arg1 > this.aByteArray70.length) {
				this.aClass128_4.method3090(this.aLong152);
				this.aLong153 = this.aLong152;
				while (arg1 > 0) {
					local111 = this.aClass128_4.method3093(arg1, arg0, arg2);
					if (local111 == -1) {
						break;
					}
					this.aLong152 += local111;
					arg1 -= local111;
					arg0 += local111;
					this.aLong153 += local111;
				}
			} else if (arg1 > 0) {
				this.method4260();
				local111 = arg1;
				if (this.anInt5513 < arg1) {
					local111 = this.anInt5513;
				}
				Static469.method6021(this.aByteArray70, 0, arg2, arg0, local111);
				arg0 += local111;
				arg1 -= local111;
				this.aLong152 += local111;
			}
			if ((long) -1 != this.aLong155) {
				if (this.aLong155 > this.aLong152 && arg1 > 0) {
					local111 = arg0 + (int) (this.aLong155 - this.aLong152);
					if (arg1 + arg0 < local111) {
						local111 = arg1 + arg0;
					}
					while (local111 > arg0) {
						arg2[arg0++] = 0;
						arg1--;
						this.aLong152++;
					}
				}
				@Pc(306) long local306 = -1L;
				if (local74 <= this.aLong155 && this.aLong155 < (long) local78 + local74) {
					local306 = this.aLong155;
				} else if (this.aLong155 <= local74 && local74 < (long) this.anInt5516 + this.aLong155) {
					local306 = local74;
				}
				@Pc(349) long local349 = -1L;
				if (this.aLong155 + (long) this.anInt5516 > local74 && local74 + (long) local78 >= this.aLong155 - -((long) this.anInt5516)) {
					local349 = (long) this.anInt5516 + this.aLong155;
				} else if ((long) local78 + local74 > this.aLong155 && (long) local78 + local74 <= this.aLong155 + (long) this.anInt5516) {
					local349 = local74 + (long) local78;
				}
				if (local306 > -1L && local306 < local349) {
					@Pc(436) int local436 = (int) (local349 - local306);
					Static469.method6021(this.aByteArray71, (int) (local306 - this.aLong155), arg2, (int) (local306 - local74), local436);
					if (this.aLong152 < local349) {
						arg1 = (int) ((long) arg1 + this.aLong152 - local349);
						this.aLong152 = local349;
					}
				}
			}
		} catch (@Pc(473) IOException local473) {
			this.aLong153 = -1L;
			throw local473;
		}
		if (arg1 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!ok", name = "c", descriptor = "(B)V")
	private void method4260() throws IOException {
		this.anInt5513 = 0;
		if (this.aLong153 != this.aLong152) {
			this.aClass128_4.method3090(this.aLong152);
			this.aLong153 = this.aLong152;
		}
		this.aLong156 = this.aLong152;
		while (this.aByteArray70.length > this.anInt5513) {
			@Pc(41) int local41 = this.aByteArray70.length - this.anInt5513;
			if (local41 > 200000000) {
				local41 = 200000000;
			}
			@Pc(56) int local56 = this.aClass128_4.method3093(local41, this.anInt5513, this.aByteArray70);
			if (local56 == -1) {
				break;
			}
			this.anInt5513 += local56;
			this.aLong153 += local56;
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(JB)V")
	public void method4261(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method4257());
		}
		this.aLong152 = arg0;
	}
}
