import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nn")
public final class Class251 {

	@OriginalMember(owner = "client!nn", name = "q", descriptor = "J")
	private long aLong193;

	@OriginalMember(owner = "client!nn", name = "s", descriptor = "I")
	private int anInt6883;

	@OriginalMember(owner = "client!nn", name = "d", descriptor = "J")
	private long aLong189 = -1L;

	@OriginalMember(owner = "client!nn", name = "n", descriptor = "I")
	private int anInt6881 = 0;

	@OriginalMember(owner = "client!nn", name = "p", descriptor = "J")
	private long aLong192 = -1L;

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "Lclient!fi;")
	private final Class123 aClass123_4;

	@OriginalMember(owner = "client!nn", name = "c", descriptor = "J")
	private long aLong188;

	@OriginalMember(owner = "client!nn", name = "o", descriptor = "J")
	private long aLong191;

	@OriginalMember(owner = "client!nn", name = "l", descriptor = "J")
	private long aLong190;

	@OriginalMember(owner = "client!nn", name = "f", descriptor = "[B")
	private final byte[] aByteArray66;

	@OriginalMember(owner = "client!nn", name = "m", descriptor = "[B")
	private final byte[] aByteArray67;

	@OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(Lclient!fi;II)V")
	public Class251(@OriginalArg(0) Class123 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass123_4 = arg0;
		this.aLong191 = this.aLong188 = arg0.method2762();
		this.aLong190 = 0L;
		this.aByteArray66 = new byte[arg1];
		this.aByteArray67 = new byte[arg2];
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(B)V")
	public void method5747() throws IOException {
		this.method5748();
		this.aClass123_4.method2764();
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(Z)V")
	private void method5748() throws IOException {
		if (this.aLong189 == -1L) {
			return;
		}
		if (this.aLong189 != this.aLong193) {
			this.aClass123_4.method2765(this.aLong189);
			this.aLong193 = this.aLong189;
		}
		this.aClass123_4.method2763(0, this.aByteArray67, this.anInt6881);
		this.aLong193 += (long) this.anInt6881;
		if (this.aLong188 < this.aLong193) {
			this.aLong188 = this.aLong193;
		}
		@Pc(55) long local55 = -1L;
		if (this.aLong192 <= this.aLong189 && this.aLong189 < this.aLong192 + (long) this.anInt6883) {
			local55 = this.aLong189;
		} else if (this.aLong189 <= this.aLong192 && this.aLong192 < (long) this.anInt6881 + this.aLong189) {
			local55 = this.aLong192;
		}
		@Pc(102) long local102 = -1L;
		if (this.aLong192 < this.aLong189 + (long) this.anInt6881 && this.aLong189 + (long) this.anInt6881 <= (long) this.anInt6883 + this.aLong192) {
			local102 = this.aLong189 + (long) this.anInt6881;
		} else if ((long) this.anInt6883 + this.aLong192 > this.aLong189 && (long) this.anInt6883 + this.aLong192 <= this.aLong189 + (long) this.anInt6881) {
			local102 = this.aLong192 + (long) this.anInt6883;
		}
		if (local55 > -1L && local102 > local55) {
			@Pc(194) int local194 = (int) (local102 - local55);
			Static689.method8055(this.aByteArray67, (int) (local55 - this.aLong189), this.aByteArray66, (int) (local55 - this.aLong192), local194);
		}
		this.aLong189 = -1L;
		this.anInt6881 = 0;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "([BZ)V")
	public void method5749(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method5752(0, arg0, arg0.length);
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(II[BI)V")
	public void method5750(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		try {
			if (this.aLong191 < this.aLong190 + (long) arg1) {
				this.aLong191 = (long) arg1 + this.aLong190;
			}
			if (this.aLong189 != (long) -1 && (this.aLong190 < this.aLong189 || this.aLong189 + (long) this.anInt6881 < this.aLong190)) {
				this.method5748();
			}
			if (this.aLong189 != -1L && (long) this.aByteArray67.length + this.aLong189 < this.aLong190 + (long) arg1) {
				@Pc(91) int local91 = (int) ((long) this.aByteArray67.length + this.aLong189 - this.aLong190);
				Static689.method8055(arg2, arg0, this.aByteArray67, (int) (this.aLong190 - this.aLong189), local91);
				this.aLong190 += (long) local91;
				arg1 -= local91;
				arg0 += local91;
				this.anInt6881 = this.aByteArray67.length;
				this.method5748();
			}
			if (arg1 > this.aByteArray67.length) {
				if (this.aLong190 != this.aLong193) {
					this.aClass123_4.method2765(this.aLong190);
					this.aLong193 = this.aLong190;
				}
				this.aClass123_4.method2763(arg0, arg2, arg1);
				this.aLong193 += (long) arg1;
				if (this.aLong193 > this.aLong188) {
					this.aLong188 = this.aLong193;
				}
				@Pc(182) long local182 = -1L;
				if (this.aLong190 >= this.aLong192 && this.aLong192 + (long) this.anInt6883 > this.aLong190) {
					local182 = this.aLong190;
				} else if (this.aLong190 <= this.aLong192 && this.aLong192 < this.aLong190 + (long) arg1) {
					local182 = this.aLong192;
				}
				@Pc(224) long local224 = -1L;
				if (this.aLong190 + (long) arg1 > this.aLong192 && (long) this.anInt6883 + this.aLong192 >= (long) arg1 + this.aLong190) {
					local224 = this.aLong190 + (long) arg1;
				} else if (this.aLong190 < (long) this.anInt6883 + this.aLong192 && (long) this.anInt6883 + this.aLong192 <= (long) arg1 + this.aLong190) {
					local224 = (long) this.anInt6883 + this.aLong192;
				}
				if (local182 > -1L && local224 > local182) {
					@Pc(303) int local303 = (int) (local224 - local182);
					Static689.method8055(arg2, (int) (local182 + (long) arg0 - this.aLong190), this.aByteArray66, (int) (local182 - this.aLong192), local303);
				}
				this.aLong190 += (long) arg1;
			} else if (arg1 > 0) {
				if (this.aLong189 == -1L) {
					this.aLong189 = this.aLong190;
				}
				Static689.method8055(arg2, arg0, this.aByteArray67, (int) (this.aLong190 - this.aLong189), arg1);
				this.aLong190 += (long) arg1;
				if (this.aLong190 - this.aLong189 > (long) this.anInt6881) {
					this.anInt6881 = (int) (this.aLong190 - this.aLong189);
				}
			}
		} catch (@Pc(390) IOException local390) {
			this.aLong193 = -1L;
			throw local390;
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(IJ)V")
	public void method5751(@OriginalArg(1) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method5758());
		}
		this.aLong190 = arg0;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(I[BII)V")
	public void method5752(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if (arg1.length < arg2) {
				throw new ArrayIndexOutOfBoundsException(arg2 - arg1.length);
			}
			if (this.aLong189 != -1L && this.aLong189 <= this.aLong190 && (long) this.anInt6881 + this.aLong189 >= this.aLong190 - -((long) arg2)) {
				Static689.method8055(this.aByteArray67, (int) (this.aLong190 - this.aLong189), arg1, 0, arg2);
				this.aLong190 += (long) arg2;
				return;
			}
			@Pc(82) long local82 = this.aLong190;
			@Pc(86) int local86 = arg2;
			@Pc(128) int local128;
			if (this.aLong192 <= this.aLong190 && (long) this.anInt6883 + this.aLong192 > this.aLong190) {
				local128 = (int) ((long) this.anInt6883 + this.aLong192 - this.aLong190);
				if (arg2 < local128) {
					local128 = arg2;
				}
				Static689.method8055(this.aByteArray66, (int) (this.aLong190 - this.aLong192), arg1, 0, local128);
				arg2 -= local128;
				this.aLong190 += (long) local128;
				arg0 = local128;
			}
			if (this.aByteArray66.length < arg2) {
				this.aClass123_4.method2765(this.aLong190);
				this.aLong193 = this.aLong190;
				while (arg2 > 0) {
					local128 = this.aClass123_4.method2766(arg1, arg2, arg0);
					if (local128 == -1) {
						break;
					}
					this.aLong193 += (long) local128;
					arg0 += local128;
					this.aLong190 += (long) local128;
					arg2 -= local128;
				}
			} else if (arg2 > 0) {
				this.method5757();
				local128 = arg2;
				if (this.anInt6883 < arg2) {
					local128 = this.anInt6883;
				}
				Static689.method8055(this.aByteArray66, 0, arg1, arg0, local128);
				arg0 += local128;
				arg2 -= local128;
				this.aLong190 += (long) local128;
			}
			if (this.aLong189 != -1L) {
				if (this.aLong189 > this.aLong190 && arg2 > 0) {
					local128 = (int) (this.aLong189 - this.aLong190) + arg0;
					if (local128 > arg2 + arg0) {
						local128 = arg2 + arg0;
					}
					while (arg0 < local128) {
						arg1[arg0++] = 0;
						arg2--;
						this.aLong190++;
					}
				}
				@Pc(323) long local323 = -1L;
				@Pc(325) long local325 = -1L;
				if (this.aLong189 >= local82 && this.aLong189 < local82 + (long) local86) {
					local323 = this.aLong189;
				} else if (local82 >= this.aLong189 && (long) this.anInt6881 + this.aLong189 > local82) {
					local323 = local82;
				}
				if (local82 < (long) this.anInt6881 + this.aLong189 && (long) local86 + local82 >= (long) this.anInt6881 + this.aLong189) {
					local325 = this.aLong189 + (long) this.anInt6881;
				} else if ((long) local86 + local82 > this.aLong189 && (long) local86 + local82 <= (long) this.anInt6881 + this.aLong189) {
					local325 = (long) local86 + local82;
				}
				if (local323 > -1L && local323 < local325) {
					@Pc(445) int local445 = (int) (local325 - local323);
					Static689.method8055(this.aByteArray67, (int) (local323 - this.aLong189), arg1, (int) (local323 - local82), local445);
					if (local325 > this.aLong190) {
						arg2 = (int) ((long) arg2 + this.aLong190 - local325);
						this.aLong190 = local325;
					}
				}
			}
		} catch (@Pc(487) IOException local487) {
			this.aLong193 = -1L;
			throw local487;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(I)J")
	public long method5754() {
		return this.aLong191;
	}

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "(I)V")
	private void method5757() throws IOException {
		this.anInt6883 = 0;
		if (this.aLong193 != this.aLong190) {
			this.aClass123_4.method2765(this.aLong190);
			this.aLong193 = this.aLong190;
		}
		this.aLong192 = this.aLong190;
		while (this.aByteArray66.length > this.anInt6883) {
			@Pc(48) int local48 = this.aByteArray66.length - this.anInt6883;
			if (local48 > 200000000) {
				local48 = 200000000;
			}
			@Pc(63) int local63 = this.aClass123_4.method2766(this.aByteArray66, local48, this.anInt6883);
			if (local63 == -1) {
				break;
			}
			this.aLong193 += (long) local63;
			this.anInt6883 += local63;
		}
	}

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "(Z)Ljava/io/File;")
	private File method5758() {
		return this.aClass123_4.method2761();
	}
}
