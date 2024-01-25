import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mu")
public final class Class243 {

	@OriginalMember(owner = "client!mu", name = "t", descriptor = "I")
	private int anInt6851;

	@OriginalMember(owner = "client!mu", name = "v", descriptor = "J")
	private long aLong184;

	@OriginalMember(owner = "client!mu", name = "i", descriptor = "J")
	private long aLong185 = -1L;

	@OriginalMember(owner = "client!mu", name = "x", descriptor = "J")
	private long aLong186 = -1L;

	@OriginalMember(owner = "client!mu", name = "f", descriptor = "I")
	private int anInt6860 = 0;

	@OriginalMember(owner = "client!mu", name = "h", descriptor = "Lclient!td;")
	private final Class345 aClass345_4;

	@OriginalMember(owner = "client!mu", name = "p", descriptor = "J")
	private long aLong183;

	@OriginalMember(owner = "client!mu", name = "n", descriptor = "J")
	private long aLong182;

	@OriginalMember(owner = "client!mu", name = "c", descriptor = "J")
	private long aLong181;

	@OriginalMember(owner = "client!mu", name = "q", descriptor = "[B")
	private final byte[] aByteArray76;

	@OriginalMember(owner = "client!mu", name = "s", descriptor = "[B")
	private final byte[] aByteArray75;

	@OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(Lclient!td;II)V")
	public Class243(@OriginalArg(0) Class345 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass345_4 = arg0;
		this.aLong182 = this.aLong183 = arg0.method8254();
		this.aLong181 = 0L;
		this.aByteArray76 = new byte[arg2];
		this.aByteArray75 = new byte[arg1];
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(I)Ljava/io/File;")
	private File method5974() {
		return this.aClass345_4.method8258();
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(B[B)V")
	public void method5975(@OriginalArg(1) byte[] arg0) throws IOException {
		this.method5981(arg0, 0, arg0.length);
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(I[BII)V")
	public void method5976(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if ((long) arg0 + this.aLong181 > this.aLong182) {
				this.aLong182 = this.aLong181 + (long) arg0;
			}
			if (this.aLong185 != -1L && (this.aLong185 > this.aLong181 || this.aLong181 > this.aLong185 + (long) this.anInt6860)) {
				this.method5985();
			}
			if (this.aLong185 != -1L && this.aLong185 + (long) this.aByteArray76.length < (long) arg0 + this.aLong181) {
				@Pc(98) int local98 = (int) (this.aLong185 + (long) this.aByteArray76.length - this.aLong181);
				Static691.method82(arg1, arg2, this.aByteArray76, (int) (this.aLong181 - this.aLong185), local98);
				this.aLong181 += (long) local98;
				arg2 += local98;
				arg0 -= local98;
				this.anInt6860 = this.aByteArray76.length;
				this.method5985();
			}
			if (this.aByteArray76.length < arg0) {
				if (this.aLong181 != this.aLong184) {
					this.aClass345_4.method8259(this.aLong181);
					this.aLong184 = this.aLong181;
				}
				this.aClass345_4.method8257(arg1, arg2, arg0);
				this.aLong184 += (long) arg0;
				if (this.aLong183 < this.aLong184) {
					this.aLong183 = this.aLong184;
				}
				@Pc(186) long local186 = -1L;
				if (this.aLong181 >= this.aLong186 && this.aLong181 < this.aLong186 + (long) this.anInt6851) {
					local186 = this.aLong181;
				} else if (this.aLong186 >= this.aLong181 && (long) arg0 + this.aLong181 > this.aLong186) {
					local186 = this.aLong186;
				}
				@Pc(246) long local246 = -1L;
				if ((long) arg0 + this.aLong181 > this.aLong186 && this.aLong181 + (long) arg0 <= this.aLong186 + (long) this.anInt6851) {
					local246 = this.aLong181 + (long) arg0;
				} else if ((long) this.anInt6851 + this.aLong186 > this.aLong181 && (long) arg0 + this.aLong181 >= (long) this.anInt6851 + this.aLong186) {
					local246 = this.aLong186 + (long) this.anInt6851;
				}
				if (local186 > -1L && local186 < local246) {
					@Pc(337) int local337 = (int) (local246 - local186);
					Static691.method82(arg1, (int) ((long) arg2 + local186 - this.aLong181), this.aByteArray75, (int) (local186 - this.aLong186), local337);
				}
				this.aLong181 += (long) arg0;
			} else if (arg0 > 0) {
				if (this.aLong185 == -1L) {
					this.aLong185 = this.aLong181;
				}
				Static691.method82(arg1, arg2, this.aByteArray76, (int) (this.aLong181 - this.aLong185), arg0);
				this.aLong181 += (long) arg0;
				if ((long) this.anInt6860 < this.aLong181 - this.aLong185) {
					this.anInt6860 = (int) (this.aLong181 - this.aLong185);
				}
			}
		} catch (@Pc(430) IOException local430) {
			this.aLong184 = -1L;
			throw local430;
		}
	}

	@OriginalMember(owner = "client!mu", name = "c", descriptor = "(I)V")
	public void method5978() throws IOException {
		this.method5985();
		this.aClass345_4.method8253();
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(Z)J")
	public long method5980() {
		return this.aLong182;
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "([BBII)V")
	public void method5981(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg2 > arg0.length) {
				throw new ArrayIndexOutOfBoundsException(arg2 - arg0.length);
			}
			if (this.aLong185 != -1L && this.aLong181 >= this.aLong185 && (long) arg2 + this.aLong181 <= this.aLong185 - -((long) this.anInt6860)) {
				Static691.method82(this.aByteArray76, (int) (this.aLong181 - this.aLong185), arg0, 0, arg2);
				this.aLong181 += (long) arg2;
				return;
			}
			@Pc(78) long local78 = this.aLong181;
			@Pc(82) int local82 = arg2;
			@Pc(116) int local116;
			if (this.aLong181 >= this.aLong186 && (long) this.anInt6851 + this.aLong186 > this.aLong181) {
				local116 = (int) ((long) this.anInt6851 + this.aLong186 - this.aLong181);
				if (local116 > arg2) {
					local116 = arg2;
				}
				Static691.method82(this.aByteArray75, (int) (this.aLong181 - this.aLong186), arg0, 0, local116);
				arg1 = local116;
				this.aLong181 += (long) local116;
				arg2 -= local116;
			}
			if (arg2 > this.aByteArray75.length) {
				this.aClass345_4.method8259(this.aLong181);
				this.aLong184 = this.aLong181;
				while (arg2 > 0) {
					local116 = this.aClass345_4.method8256(arg2, arg0, arg1);
					if (local116 == -1) {
						break;
					}
					arg1 += local116;
					this.aLong181 += (long) local116;
					arg2 -= local116;
					this.aLong184 += (long) local116;
				}
			} else if (arg2 > 0) {
				this.method5984();
				local116 = arg2;
				if (arg2 > this.anInt6851) {
					local116 = this.anInt6851;
				}
				Static691.method82(this.aByteArray75, 0, arg0, arg1, local116);
				arg2 -= local116;
				this.aLong181 += (long) local116;
				arg1 += local116;
			}
			if (this.aLong185 != -1L) {
				if (this.aLong185 > this.aLong181 && arg2 > 0) {
					local116 = (int) (this.aLong185 - this.aLong181) + arg1;
					if (local116 > arg2 + arg1) {
						local116 = arg1 + arg2;
					}
					while (arg1 < local116) {
						arg0[arg1++] = 0;
						arg2--;
						this.aLong181++;
					}
				}
				@Pc(318) long local318 = -1L;
				if (this.aLong185 >= local78 && this.aLong185 < local78 + (long) local82) {
					local318 = this.aLong185;
				} else if (this.aLong185 <= local78 && local78 < this.aLong185 + (long) this.anInt6860) {
					local318 = local78;
				}
				@Pc(361) long local361 = -1L;
				if (local78 < this.aLong185 + (long) this.anInt6860 && (long) local82 + local78 >= (long) this.anInt6860 + this.aLong185) {
					local361 = (long) this.anInt6860 + this.aLong185;
				} else if (this.aLong185 < (long) local82 + local78 && (long) local82 + local78 <= (long) this.anInt6860 + this.aLong185) {
					local361 = (long) local82 + local78;
				}
				if (local318 > -1L && local318 < local361) {
					@Pc(452) int local452 = (int) (local361 - local318);
					Static691.method82(this.aByteArray76, (int) (local318 - this.aLong185), arg0, (int) (local318 - local78), local452);
					if (this.aLong181 < local361) {
						arg2 = (int) ((long) arg2 + this.aLong181 - local361);
						this.aLong181 = local361;
					}
				}
			}
		} catch (@Pc(492) IOException local492) {
			this.aLong184 = -1L;
			throw local492;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(JB)V")
	public void method5982(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method5974());
		}
		this.aLong181 = arg0;
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(B)V")
	private void method5984() throws IOException {
		this.anInt6851 = 0;
		if (this.aLong181 != this.aLong184) {
			this.aClass345_4.method8259(this.aLong181);
			this.aLong184 = this.aLong181;
		}
		this.aLong186 = this.aLong181;
		while (this.aByteArray75.length > this.anInt6851) {
			@Pc(49) int local49 = this.aByteArray75.length - this.anInt6851;
			if (local49 > 200000000) {
				local49 = 200000000;
			}
			@Pc(66) int local66 = this.aClass345_4.method8256(local49, this.aByteArray75, this.anInt6851);
			if (local66 == -1) {
				break;
			}
			this.aLong184 += (long) local66;
			this.anInt6851 += local66;
		}
	}

	@OriginalMember(owner = "client!mu", name = "d", descriptor = "(I)V")
	private void method5985() throws IOException {
		if (this.aLong185 == -1L) {
			return;
		}
		if (this.aLong185 != this.aLong184) {
			this.aClass345_4.method8259(this.aLong185);
			this.aLong184 = this.aLong185;
		}
		this.aClass345_4.method8257(this.aByteArray76, 0, this.anInt6860);
		this.aLong184 += (long) this.anInt6860;
		if (this.aLong183 < this.aLong184) {
			this.aLong183 = this.aLong184;
		}
		@Pc(67) long local67 = -1L;
		if (this.aLong186 <= this.aLong185 && (long) this.anInt6851 + this.aLong186 > this.aLong185) {
			local67 = this.aLong185;
		} else if (this.aLong186 >= this.aLong185 && this.aLong186 < (long) this.anInt6860 + this.aLong185) {
			local67 = this.aLong186;
		}
		@Pc(131) long local131 = -1L;
		if (this.aLong186 < (long) this.anInt6860 + this.aLong185 && (long) this.anInt6851 + this.aLong186 >= (long) this.anInt6860 + this.aLong185) {
			local131 = (long) this.anInt6860 + this.aLong185;
		} else if (this.aLong185 < (long) this.anInt6851 + this.aLong186 && (long) this.anInt6851 + this.aLong186 <= this.aLong185 + (long) this.anInt6860) {
			local131 = this.aLong186 + (long) this.anInt6851;
		}
		if (local67 > -1L && local131 > local67) {
			@Pc(227) int local227 = (int) (local131 - local67);
			Static691.method82(this.aByteArray76, (int) (local67 - this.aLong185), this.aByteArray75, (int) (local67 - this.aLong186), local227);
		}
		this.anInt6860 = 0;
		this.aLong185 = -1L;
	}
}
