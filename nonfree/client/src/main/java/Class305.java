import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sg")
public final class Class305 {

	@OriginalMember(owner = "client!sg", name = "g", descriptor = "J")
	private long aLong235;

	@OriginalMember(owner = "client!sg", name = "j", descriptor = "I")
	private int anInt8703;

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
	private int anInt8701 = 0;

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "J")
	private long aLong233 = -1L;

	@OriginalMember(owner = "client!sg", name = "u", descriptor = "J")
	private long aLong238 = -1L;

	@OriginalMember(owner = "client!sg", name = "f", descriptor = "Lclient!ac;")
	private final Class4 aClass4_4;

	@OriginalMember(owner = "client!sg", name = "e", descriptor = "J")
	private long aLong234;

	@OriginalMember(owner = "client!sg", name = "p", descriptor = "J")
	private long aLong237;

	@OriginalMember(owner = "client!sg", name = "k", descriptor = "[B")
	private final byte[] aByteArray89;

	@OriginalMember(owner = "client!sg", name = "i", descriptor = "J")
	private long aLong236;

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "[B")
	private final byte[] aByteArray88;

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(Lclient!ac;II)V")
	public Class305(@OriginalArg(0) Class4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass4_4 = arg0;
		this.aLong237 = this.aLong234 = arg0.method85();
		this.aByteArray89 = new byte[arg2];
		this.aLong236 = 0L;
		this.aByteArray88 = new byte[arg1];
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V")
	private void method7506() throws IOException {
		if (this.aLong233 == -1L) {
			return;
		}
		if (this.aLong235 != this.aLong233) {
			this.aClass4_4.method82(this.aLong233);
			this.aLong235 = this.aLong233;
		}
		this.aClass4_4.method86(this.aByteArray89, 0, this.anInt8701);
		this.aLong235 += (long) this.anInt8701;
		if (this.aLong234 < this.aLong235) {
			this.aLong234 = this.aLong235;
		}
		@Pc(65) long local65 = -1L;
		if (this.aLong233 >= this.aLong238 && (long) this.anInt8703 + this.aLong238 > this.aLong233) {
			local65 = this.aLong233;
		} else if (this.aLong233 <= this.aLong238 && (long) this.anInt8701 + this.aLong233 > this.aLong238) {
			local65 = this.aLong238;
		}
		@Pc(115) long local115 = -1L;
		if (this.aLong238 < this.aLong233 + (long) this.anInt8701 && (long) this.anInt8701 + this.aLong233 <= (long) this.anInt8703 + this.aLong238) {
			local115 = (long) this.anInt8701 + this.aLong233;
		} else if (this.aLong233 < (long) this.anInt8703 + this.aLong238 && (long) this.anInt8701 + this.aLong233 >= this.aLong238 + (long) this.anInt8703) {
			local115 = (long) this.anInt8703 + this.aLong238;
		}
		if (local65 > -1L && local115 > local65) {
			@Pc(200) int local200 = (int) (local115 - local65);
			Static651.method749(this.aByteArray89, (int) (local65 - this.aLong233), this.aByteArray88, (int) (local65 - this.aLong238), local200);
		}
		this.aLong233 = -1L;
		this.anInt8701 = 0;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Z)V")
	private void method7507() throws IOException {
		this.anInt8703 = 0;
		if (this.aLong236 != this.aLong235) {
			this.aClass4_4.method82(this.aLong236);
			this.aLong235 = this.aLong236;
		}
		this.aLong238 = this.aLong236;
		while (this.aByteArray88.length > this.anInt8703) {
			@Pc(48) int local48 = this.aByteArray88.length - this.anInt8703;
			if (local48 > 200000000) {
				local48 = 200000000;
			}
			@Pc(65) int local65 = this.aClass4_4.method79(this.aByteArray88, local48, this.anInt8703);
			if (local65 == -1) {
				break;
			}
			this.anInt8703 += local65;
			this.aLong235 += (long) local65;
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(I[BII)V")
	public void method7508(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (this.aLong236 + (long) arg2 > this.aLong237) {
				this.aLong237 = (long) arg2 + this.aLong236;
			}
			if (this.aLong233 != -1L && (this.aLong233 > this.aLong236 || this.aLong236 > this.aLong233 + (long) this.anInt8701)) {
				this.method7506();
			}
			if (this.aLong233 != -1L && this.aLong236 + (long) arg2 > this.aLong233 - -((long) this.aByteArray89.length)) {
				@Pc(92) int local92 = (int) (this.aLong233 + (long) this.aByteArray89.length - this.aLong236);
				Static651.method749(arg0, arg1, this.aByteArray89, (int) (this.aLong236 - this.aLong233), local92);
				arg2 -= local92;
				arg1 += local92;
				this.aLong236 += (long) local92;
				this.anInt8701 = this.aByteArray89.length;
				this.method7506();
			}
			if (arg2 > this.aByteArray89.length) {
				if (this.aLong236 != this.aLong235) {
					this.aClass4_4.method82(this.aLong236);
					this.aLong235 = this.aLong236;
				}
				this.aClass4_4.method86(arg0, arg1, arg2);
				this.aLong235 += (long) arg2;
				if (this.aLong234 < this.aLong235) {
					this.aLong234 = this.aLong235;
				}
				@Pc(179) long local179 = -1L;
				if (this.aLong238 <= this.aLong236 && this.aLong238 + (long) this.anInt8703 > this.aLong236) {
					local179 = this.aLong236;
				} else if (this.aLong238 >= this.aLong236 && this.aLong238 < (long) arg2 + this.aLong236) {
					local179 = this.aLong238;
				}
				@Pc(228) long local228 = -1L;
				if (this.aLong236 + (long) arg2 > this.aLong238 && (long) this.anInt8703 + this.aLong238 >= this.aLong236 - -((long) arg2)) {
					local228 = this.aLong236 + (long) arg2;
				} else if (this.aLong236 < this.aLong238 + (long) this.anInt8703 && (long) this.anInt8703 + this.aLong238 <= this.aLong236 + (long) arg2) {
					local228 = this.aLong238 + (long) this.anInt8703;
				}
				if (local179 > -1L && local179 < local228) {
					@Pc(320) int local320 = (int) (local228 - local179);
					Static651.method749(arg0, (int) ((long) arg1 + local179 - this.aLong236), this.aByteArray88, (int) (local179 - this.aLong238), local320);
				}
				this.aLong236 += (long) arg2;
			} else if (arg2 > 0) {
				if (this.aLong233 == -1L) {
					this.aLong233 = this.aLong236;
				}
				Static651.method749(arg0, arg1, this.aByteArray89, (int) (this.aLong236 - this.aLong233), arg2);
				this.aLong236 += (long) arg2;
				if ((long) this.anInt8701 < this.aLong236 - this.aLong233) {
					this.anInt8701 = (int) (this.aLong236 - this.aLong233);
				}
			}
		} catch (@Pc(410) IOException local410) {
			this.aLong235 = -1L;
			throw local410;
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(JB)V")
	public void method7509(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method7510());
		}
		this.aLong236 = arg0;
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(I)Ljava/io/File;")
	private File method7510() {
		return this.aClass4_4.method80();
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(I[BZI)V")
	public void method7511(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg0 > arg1.length) {
				throw new ArrayIndexOutOfBoundsException(arg0 - arg1.length);
			}
			if (this.aLong233 != -1L && this.aLong233 <= this.aLong236 && this.aLong236 + (long) arg0 <= this.aLong233 + (long) this.anInt8701) {
				Static651.method749(this.aByteArray89, (int) (this.aLong236 - this.aLong233), arg1, 0, arg0);
				this.aLong236 += (long) arg0;
				return;
			}
			@Pc(77) long local77 = this.aLong236;
			@Pc(81) int local81 = arg0;
			@Pc(117) int local117;
			if (this.aLong236 >= this.aLong238 && this.aLong236 < this.aLong238 + (long) this.anInt8703) {
				local117 = (int) ((long) this.anInt8703 + this.aLong238 - this.aLong236);
				if (local117 > arg0) {
					local117 = arg0;
				}
				Static651.method749(this.aByteArray88, (int) (this.aLong236 - this.aLong238), arg1, 0, local117);
				this.aLong236 += (long) local117;
				arg0 -= local117;
				arg2 = local117;
			}
			if (arg0 > this.aByteArray88.length) {
				this.aClass4_4.method82(this.aLong236);
				this.aLong235 = this.aLong236;
				while (arg0 > 0) {
					local117 = this.aClass4_4.method79(arg1, arg0, arg2);
					if (local117 == -1) {
						break;
					}
					arg2 += local117;
					this.aLong235 += (long) local117;
					this.aLong236 += (long) local117;
					arg0 -= local117;
				}
			} else if (arg0 > 0) {
				this.method7507();
				local117 = arg0;
				if (this.anInt8703 < arg0) {
					local117 = this.anInt8703;
				}
				Static651.method749(this.aByteArray88, 0, arg1, arg2, local117);
				arg0 -= local117;
				arg2 += local117;
				this.aLong236 += (long) local117;
			}
			if (this.aLong233 != -1L) {
				if (this.aLong233 > this.aLong236 && arg0 > 0) {
					local117 = arg2 + (int) (this.aLong233 - this.aLong236);
					if (arg2 + arg0 < local117) {
						local117 = arg2 + arg0;
					}
					while (arg2 < local117) {
						arg1[arg2++] = 0;
						arg0--;
						this.aLong236++;
					}
				}
				@Pc(306) long local306 = -1L;
				if (this.aLong233 >= local77 && this.aLong233 < (long) local81 + local77) {
					local306 = this.aLong233;
				} else if (local77 >= this.aLong233 && local77 < this.aLong233 + (long) this.anInt8701) {
					local306 = local77;
				}
				@Pc(351) long local351 = -1L;
				if (local77 < this.aLong233 + (long) this.anInt8701 && local77 + (long) local81 >= this.aLong233 - -((long) this.anInt8701)) {
					local351 = (long) this.anInt8701 + this.aLong233;
				} else if (this.aLong233 < (long) local81 + local77 && (long) this.anInt8701 + this.aLong233 >= local77 - -((long) local81)) {
					local351 = local77 + (long) local81;
				}
				if (local306 > -1L && local351 > local306) {
					@Pc(433) int local433 = (int) (local351 - local306);
					Static651.method749(this.aByteArray89, (int) (local306 - this.aLong233), arg1, (int) (local306 - local77), local433);
					if (local351 > this.aLong236) {
						arg0 = (int) ((long) arg0 + this.aLong236 - local351);
						this.aLong236 = local351;
					}
				}
			}
		} catch (@Pc(473) IOException local473) {
			this.aLong235 = -1L;
			throw local473;
		}
		if (arg0 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "([BI)V")
	public void method7513(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method7511(arg0.length, arg0, 0);
	}

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "(I)J")
	public long method7514() {
		return this.aLong237;
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(B)V")
	public void method7515() throws IOException {
		this.method7506();
		this.aClass4_4.method84();
	}
}
