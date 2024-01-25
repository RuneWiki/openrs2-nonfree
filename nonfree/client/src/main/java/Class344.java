import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class344 {

	@OriginalMember(owner = "client!ub", name = "k", descriptor = "I")
	private int anInt9555;

	@OriginalMember(owner = "client!ub", name = "p", descriptor = "J")
	private long aLong283;

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
	private int anInt9551 = 0;

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "J")
	private long aLong280 = -1L;

	@OriginalMember(owner = "client!ub", name = "n", descriptor = "J")
	private long aLong282 = -1L;

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "Lclient!mea;")
	private final Class214 aClass214_4;

	@OriginalMember(owner = "client!ub", name = "u", descriptor = "J")
	private long aLong285;

	@OriginalMember(owner = "client!ub", name = "t", descriptor = "J")
	private long aLong284;

	@OriginalMember(owner = "client!ub", name = "j", descriptor = "J")
	private long aLong281;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "[B")
	private final byte[] aByteArray98;

	@OriginalMember(owner = "client!ub", name = "g", descriptor = "[B")
	private final byte[] aByteArray99;

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Lclient!mea;II)V")
	public Class344(@OriginalArg(0) Class214 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass214_4 = arg0;
		this.aLong284 = this.aLong285 = arg0.method5376();
		this.aLong281 = 0L;
		this.aByteArray98 = new byte[arg2];
		this.aByteArray99 = new byte[arg1];
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V")
	private void method8357() throws IOException {
		this.anInt9555 = 0;
		if (this.aLong281 != this.aLong283) {
			this.aClass214_4.method5379(this.aLong281);
			this.aLong283 = this.aLong281;
		}
		this.aLong282 = this.aLong281;
		while (this.aByteArray99.length > this.anInt9555) {
			@Pc(42) int local42 = this.aByteArray99.length - this.anInt9555;
			if (local42 > 200000000) {
				local42 = 200000000;
			}
			@Pc(59) int local59 = this.aClass214_4.method5381(this.anInt9555, this.aByteArray99, local42);
			if (local59 == -1) {
				break;
			}
			this.anInt9555 += local59;
			this.aLong283 += (long) local59;
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
	public void method8358() throws IOException {
		this.method8362();
		this.aClass214_4.method5380();
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "([BI)V")
	public void method8359(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method8360(arg0, 0, arg0.length);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(B[BII)V")
	public void method8360(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg0.length < arg2) {
				throw new ArrayIndexOutOfBoundsException(arg2 - arg0.length);
			}
			if (this.aLong280 != -1L && this.aLong281 >= this.aLong280 && (long) arg2 + this.aLong281 <= this.aLong280 - -((long) this.anInt9551)) {
				Static684.method5324(this.aByteArray98, (int) (this.aLong281 - this.aLong280), arg0, 0, arg2);
				this.aLong281 += (long) arg2;
				return;
			}
			@Pc(78) long local78 = this.aLong281;
			@Pc(82) int local82 = arg2;
			@Pc(114) int local114;
			if (this.aLong282 <= this.aLong281 && (long) this.anInt9555 + this.aLong282 > this.aLong281) {
				local114 = (int) ((long) this.anInt9555 + this.aLong282 - this.aLong281);
				if (arg2 < local114) {
					local114 = arg2;
				}
				Static684.method5324(this.aByteArray99, (int) (this.aLong281 - this.aLong282), arg0, 0, local114);
				this.aLong281 += (long) local114;
				arg1 = local114;
				arg2 -= local114;
			}
			if (arg2 > this.aByteArray99.length) {
				this.aClass214_4.method5379(this.aLong281);
				this.aLong283 = this.aLong281;
				while (arg2 > 0) {
					local114 = this.aClass214_4.method5381(arg1, arg0, arg2);
					if (local114 == -1) {
						break;
					}
					this.aLong281 += (long) local114;
					this.aLong283 += (long) local114;
					arg1 += local114;
					arg2 -= local114;
				}
			} else if (arg2 > 0) {
				this.method8357();
				local114 = arg2;
				if (arg2 > this.anInt9555) {
					local114 = this.anInt9555;
				}
				Static684.method5324(this.aByteArray99, 0, arg0, arg1, local114);
				arg2 -= local114;
				this.aLong281 += (long) local114;
				arg1 += local114;
			}
			if (this.aLong280 != -1L) {
				if (this.aLong280 > this.aLong281 && arg2 > 0) {
					local114 = arg1 + (int) (this.aLong280 - this.aLong281);
					if (arg1 + arg2 < local114) {
						local114 = arg1 + arg2;
					}
					while (local114 > arg1) {
						arg0[arg1++] = 0;
						arg2--;
						this.aLong281++;
					}
				}
				@Pc(312) long local312 = -1L;
				if (this.aLong280 >= local78 && local78 + (long) local82 > this.aLong280) {
					local312 = this.aLong280;
				} else if (local78 >= this.aLong280 && this.aLong280 + (long) this.anInt9551 > local78) {
					local312 = local78;
				}
				@Pc(360) long local360 = -1L;
				if ((long) this.anInt9551 + this.aLong280 > local78 && local78 + (long) local82 >= (long) this.anInt9551 + this.aLong280) {
					local360 = this.aLong280 + (long) this.anInt9551;
				} else if (this.aLong280 < local78 + (long) local82 && local78 + (long) local82 <= (long) this.anInt9551 + this.aLong280) {
					local360 = local78 + (long) local82;
				}
				if (local312 > -1L && local360 > local312) {
					@Pc(444) int local444 = (int) (local360 - local312);
					Static684.method5324(this.aByteArray98, (int) (local312 - this.aLong280), arg0, (int) (local312 - local78), local444);
					if (this.aLong281 < local360) {
						arg2 = (int) ((long) arg2 + this.aLong281 - local360);
						this.aLong281 = local360;
					}
				}
			}
		} catch (@Pc(482) IOException local482) {
			this.aLong283 = -1L;
			throw local482;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZJ)V")
	public void method8361(@OriginalArg(1) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method8367());
		}
		this.aLong281 = arg0;
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)V")
	private void method8362() throws IOException {
		if (this.aLong280 == -1L) {
			return;
		}
		if (this.aLong283 != this.aLong280) {
			this.aClass214_4.method5379(this.aLong280);
			this.aLong283 = this.aLong280;
		}
		this.aClass214_4.method5378(0, this.aByteArray98, this.anInt9551);
		this.aLong283 += (long) this.anInt9551;
		if (this.aLong285 < this.aLong283) {
			this.aLong285 = this.aLong283;
		}
		@Pc(65) long local65 = -1L;
		@Pc(67) long local67 = -1L;
		if (this.aLong282 <= this.aLong280 && this.aLong282 + (long) this.anInt9555 > this.aLong280) {
			local65 = this.aLong280;
		} else if (this.aLong282 >= this.aLong280 && (long) this.anInt9551 + this.aLong280 > this.aLong282) {
			local65 = this.aLong282;
		}
		if (this.aLong282 < this.aLong280 + (long) this.anInt9551 && (long) this.anInt9551 + this.aLong280 <= this.aLong282 + (long) this.anInt9555) {
			local67 = (long) this.anInt9551 + this.aLong280;
		} else if (this.aLong282 + (long) this.anInt9555 > this.aLong280 && (long) this.anInt9555 + this.aLong282 <= this.aLong280 + (long) this.anInt9551) {
			local67 = (long) this.anInt9555 + this.aLong282;
		}
		if (local65 > -1L && local67 > local65) {
			@Pc(204) int local204 = (int) (local67 - local65);
			Static684.method5324(this.aByteArray98, (int) (local65 - this.aLong280), this.aByteArray99, (int) (local65 - this.aLong282), local204);
		}
		this.anInt9551 = 0;
		this.aLong280 = -1L;
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)J")
	public long method8364() {
		return this.aLong284;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "([BBII)V")
	public void method8365(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (this.aLong284 < this.aLong281 + (long) arg2) {
				this.aLong284 = this.aLong281 + (long) arg2;
			}
			if (this.aLong280 != -1L && (this.aLong281 < this.aLong280 || this.aLong281 > this.aLong280 + (long) this.anInt9551)) {
				this.method8362();
			}
			if (this.aLong280 != -1L && (long) arg2 + this.aLong281 > (long) this.aByteArray98.length + this.aLong280) {
				@Pc(89) int local89 = (int) (this.aLong280 + (long) this.aByteArray98.length - this.aLong281);
				Static684.method5324(arg0, arg1, this.aByteArray98, (int) (this.aLong281 - this.aLong280), local89);
				arg2 -= local89;
				this.aLong281 += (long) local89;
				arg1 += local89;
				this.anInt9551 = this.aByteArray98.length;
				this.method8362();
			}
			if (this.aByteArray98.length < arg2) {
				if (this.aLong281 != this.aLong283) {
					this.aClass214_4.method5379(this.aLong281);
					this.aLong283 = this.aLong281;
				}
				this.aClass214_4.method5378(arg1, arg0, arg2);
				this.aLong283 += (long) arg2;
				if (this.aLong283 > this.aLong285) {
					this.aLong285 = this.aLong283;
				}
				@Pc(176) long local176 = -1L;
				@Pc(178) long local178 = -1L;
				if (this.aLong282 <= this.aLong281 && (long) this.anInt9555 + this.aLong282 > this.aLong281) {
					local176 = this.aLong281;
				} else if (this.aLong282 >= this.aLong281 && this.aLong281 + (long) arg2 > this.aLong282) {
					local176 = this.aLong282;
				}
				if ((long) arg2 + this.aLong281 > this.aLong282 && (long) this.anInt9555 + this.aLong282 >= this.aLong281 + (long) arg2) {
					local178 = this.aLong281 + (long) arg2;
				} else if ((long) this.anInt9555 + this.aLong282 > this.aLong281 && this.aLong282 + (long) this.anInt9555 <= (long) arg2 + this.aLong281) {
					local178 = this.aLong282 + (long) this.anInt9555;
				}
				if (local176 > -1L && local178 > local176) {
					@Pc(309) int local309 = (int) (local178 - local176);
					Static684.method5324(arg0, (int) (local176 + (long) arg1 - this.aLong281), this.aByteArray99, (int) (local176 - this.aLong282), local309);
				}
				this.aLong281 += (long) arg2;
			} else if (arg2 > 0) {
				if (this.aLong280 == -1L) {
					this.aLong280 = this.aLong281;
				}
				Static684.method5324(arg0, arg1, this.aByteArray98, (int) (this.aLong281 - this.aLong280), arg2);
				this.aLong281 += (long) arg2;
				if (this.aLong281 - this.aLong280 > (long) this.anInt9551) {
					this.anInt9551 = (int) (this.aLong281 - this.aLong280);
				}
			}
		} catch (@Pc(396) IOException local396) {
			this.aLong283 = -1L;
			throw local396;
		}
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(I)Ljava/io/File;")
	private File method8367() {
		return this.aClass214_4.method5377();
	}
}
