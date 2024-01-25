import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nf")
public final class Class238 {

	@OriginalMember(owner = "client!nf", name = "h", descriptor = "J")
	private long aLong188;

	@OriginalMember(owner = "client!nf", name = "n", descriptor = "I")
	private int anInt6530;

	@OriginalMember(owner = "client!nf", name = "d", descriptor = "J")
	private long aLong187 = -1L;

	@OriginalMember(owner = "client!nf", name = "l", descriptor = "J")
	private long aLong190 = -1L;

	@OriginalMember(owner = "client!nf", name = "v", descriptor = "I")
	private int anInt6537 = 0;

	@OriginalMember(owner = "client!nf", name = "c", descriptor = "Lclient!gba;")
	private final Class114 aClass114_1;

	@OriginalMember(owner = "client!nf", name = "m", descriptor = "J")
	private long aLong191;

	@OriginalMember(owner = "client!nf", name = "k", descriptor = "J")
	private long aLong189;

	@OriginalMember(owner = "client!nf", name = "u", descriptor = "J")
	private long aLong192;

	@OriginalMember(owner = "client!nf", name = "f", descriptor = "[B")
	private final byte[] aByteArray75;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "[B")
	private final byte[] aByteArray74;

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(Lclient!gba;II)V")
	public Class238(@OriginalArg(0) Class114 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass114_1 = arg0;
		this.aLong189 = this.aLong191 = arg0.method2455();
		this.aLong192 = 0L;
		this.aByteArray75 = new byte[arg1];
		this.aByteArray74 = new byte[arg2];
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)J")
	public long method5532() {
		return this.aLong189;
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(I)Ljava/io/File;")
	private File method5533() {
		return this.aClass114_1.method2459();
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(II[BI)V")
	public void method5535(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (this.aLong189 < (long) arg2 + this.aLong192) {
				this.aLong189 = this.aLong192 + (long) arg2;
			}
			if (this.aLong190 != -1L && (this.aLong190 > this.aLong192 || this.aLong192 > this.aLong190 + (long) this.anInt6537)) {
				this.method5540();
			}
			if (this.aLong190 != -1L && this.aLong190 + (long) this.aByteArray74.length < this.aLong192 - -((long) arg2)) {
				@Pc(91) int local91 = (int) (this.aLong190 + (long) this.aByteArray74.length - this.aLong192);
				Static679.method1563(arg1, arg0, this.aByteArray74, (int) (this.aLong192 - this.aLong190), local91);
				arg0 += local91;
				arg2 -= local91;
				this.aLong192 += (long) local91;
				this.anInt6537 = this.aByteArray74.length;
				this.method5540();
			}
			if (arg2 > this.aByteArray74.length) {
				if (this.aLong192 != this.aLong188) {
					this.aClass114_1.method2454(this.aLong192);
					this.aLong188 = this.aLong192;
				}
				this.aClass114_1.method2457(arg0, arg2, arg1);
				this.aLong188 += (long) arg2;
				if (this.aLong191 < this.aLong188) {
					this.aLong191 = this.aLong188;
				}
				@Pc(178) long local178 = -1L;
				@Pc(180) long local180 = -1L;
				if (this.aLong187 <= this.aLong192 && this.aLong187 + (long) this.anInt6530 > this.aLong192) {
					local178 = this.aLong192;
				} else if (this.aLong192 <= this.aLong187 && this.aLong187 < (long) arg2 + this.aLong192) {
					local178 = this.aLong187;
				}
				if (this.aLong192 + (long) arg2 > this.aLong187 && (long) this.anInt6530 + this.aLong187 >= (long) arg2 + this.aLong192) {
					local180 = (long) arg2 + this.aLong192;
				} else if (this.aLong192 < (long) this.anInt6530 + this.aLong187 && (long) arg2 + this.aLong192 >= this.aLong187 - -((long) this.anInt6530)) {
					local180 = (long) this.anInt6530 + this.aLong187;
				}
				if (local178 > -1L && local178 < local180) {
					@Pc(307) int local307 = (int) (local180 - local178);
					Static679.method1563(arg1, (int) (local178 + (long) arg0 - this.aLong192), this.aByteArray75, (int) (local178 - this.aLong187), local307);
				}
				this.aLong192 += (long) arg2;
			} else if (arg2 > 0) {
				if (this.aLong190 == -1L) {
					this.aLong190 = this.aLong192;
				}
				Static679.method1563(arg1, arg0, this.aByteArray74, (int) (this.aLong192 - this.aLong190), arg2);
				this.aLong192 += (long) arg2;
				if ((long) this.anInt6537 < this.aLong192 - this.aLong190) {
					this.anInt6537 = (int) (this.aLong192 - this.aLong190);
				}
			}
		} catch (@Pc(397) IOException local397) {
			this.aLong188 = -1L;
			throw local397;
		}
	}

	@OriginalMember(owner = "client!nf", name = "c", descriptor = "(I)V")
	public void method5536() throws IOException {
		this.method5540();
		this.aClass114_1.method2462();
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Z)V")
	private void method5537() throws IOException {
		this.anInt6530 = 0;
		if (this.aLong192 != this.aLong188) {
			this.aClass114_1.method2454(this.aLong192);
			this.aLong188 = this.aLong192;
		}
		this.aLong187 = this.aLong192;
		while (this.aByteArray75.length > this.anInt6530) {
			@Pc(49) int local49 = this.aByteArray75.length - this.anInt6530;
			if (local49 > 200000000) {
				local49 = 200000000;
			}
			@Pc(66) int local66 = this.aClass114_1.method2456(this.anInt6530, local49, this.aByteArray75);
			if (local66 == -1) {
				break;
			}
			this.anInt6530 += local66;
			this.aLong188 += (long) local66;
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(I[B)V")
	public void method5539(@OriginalArg(1) byte[] arg0) throws IOException {
		this.method5543(0, arg0.length, arg0);
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)V")
	private void method5540() throws IOException {
		if (this.aLong190 == -1L) {
			return;
		}
		if (this.aLong188 != this.aLong190) {
			this.aClass114_1.method2454(this.aLong190);
			this.aLong188 = this.aLong190;
		}
		this.aClass114_1.method2457(0, this.anInt6537, this.aByteArray74);
		this.aLong188 += (long) this.anInt6537;
		if (this.aLong188 > this.aLong191) {
			this.aLong191 = this.aLong188;
		}
		@Pc(55) long local55 = -1L;
		if (this.aLong190 >= this.aLong187 && this.aLong190 < this.aLong187 + (long) this.anInt6530) {
			local55 = this.aLong190;
		} else if (this.aLong187 >= this.aLong190 && (long) this.anInt6537 + this.aLong190 > this.aLong187) {
			local55 = this.aLong187;
		}
		@Pc(106) long local106 = -1L;
		if ((long) this.anInt6537 + this.aLong190 > this.aLong187 && this.aLong190 + (long) this.anInt6537 <= this.aLong187 + (long) this.anInt6530) {
			local106 = (long) this.anInt6537 + this.aLong190;
		} else if (this.aLong190 < this.aLong187 + (long) this.anInt6530 && (long) this.anInt6537 + this.aLong190 >= (long) this.anInt6530 + this.aLong187) {
			local106 = (long) this.anInt6530 + this.aLong187;
		}
		if (local55 > -1L && local55 < local106) {
			@Pc(197) int local197 = (int) (local106 - local55);
			Static679.method1563(this.aByteArray74, (int) (local55 - this.aLong190), this.aByteArray75, (int) (local55 - this.aLong187), local197);
		}
		this.anInt6537 = 0;
		this.aLong190 = -1L;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IJ)V")
	public void method5542(@OriginalArg(1) long arg0) throws IOException {
		if (arg0 < (long) 0) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method5533());
		}
		this.aLong192 = arg0;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(III[B)V")
	public void method5543(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if (arg1 > arg2.length) {
				throw new ArrayIndexOutOfBoundsException(arg1 - arg2.length);
			}
			if (this.aLong190 != -1L && this.aLong190 <= this.aLong192 && (long) this.anInt6537 + this.aLong190 >= this.aLong192 + (long) arg1) {
				Static679.method1563(this.aByteArray74, (int) (this.aLong192 - this.aLong190), arg2, 0, arg1);
				this.aLong192 += (long) arg1;
				return;
			}
			@Pc(77) long local77 = this.aLong192;
			@Pc(81) int local81 = arg1;
			@Pc(113) int local113;
			if (this.aLong192 >= this.aLong187 && this.aLong192 < (long) this.anInt6530 + this.aLong187) {
				local113 = (int) (this.aLong187 + (long) this.anInt6530 - this.aLong192);
				if (arg1 < local113) {
					local113 = arg1;
				}
				Static679.method1563(this.aByteArray75, (int) (this.aLong192 - this.aLong187), arg2, 0, local113);
				arg0 = local113;
				arg1 -= local113;
				this.aLong192 += (long) local113;
			}
			if (this.aByteArray75.length < arg1) {
				this.aClass114_1.method2454(this.aLong192);
				this.aLong188 = this.aLong192;
				while (arg1 > 0) {
					local113 = this.aClass114_1.method2456(arg0, arg1, arg2);
					if (local113 == -1) {
						break;
					}
					arg1 -= local113;
					this.aLong188 += (long) local113;
					this.aLong192 += (long) local113;
					arg0 += local113;
				}
			} else if (arg1 > 0) {
				this.method5537();
				local113 = arg1;
				if (this.anInt6530 < arg1) {
					local113 = this.anInt6530;
				}
				Static679.method1563(this.aByteArray75, 0, arg2, arg0, local113);
				arg1 -= local113;
				arg0 += local113;
				this.aLong192 += (long) local113;
			}
			if ((long) -1 != this.aLong190) {
				if (this.aLong190 > this.aLong192 && arg1 > 0) {
					local113 = (int) (this.aLong190 - this.aLong192) + arg0;
					if (local113 > arg1 + arg0) {
						local113 = arg1 + arg0;
					}
					while (arg0 < local113) {
						arg1--;
						arg2[arg0++] = 0;
						this.aLong192++;
					}
				}
				@Pc(301) long local301 = -1L;
				@Pc(303) long local303 = -1L;
				if (local77 <= this.aLong190 && local77 + (long) local81 > this.aLong190) {
					local301 = this.aLong190;
				} else if (local77 >= this.aLong190 && this.aLong190 + (long) this.anInt6537 > local77) {
					local301 = local77;
				}
				if ((long) this.anInt6537 + this.aLong190 > local77 && (long) this.anInt6537 + this.aLong190 <= local77 - -((long) local81)) {
					local303 = this.aLong190 + (long) this.anInt6537;
				} else if (this.aLong190 < (long) local81 + local77 && (long) this.anInt6537 + this.aLong190 >= (long) local81 + local77) {
					local303 = local77 + (long) local81;
				}
				if (local301 > -1L && local303 > local301) {
					@Pc(428) int local428 = (int) (local303 - local301);
					Static679.method1563(this.aByteArray74, (int) (local301 - this.aLong190), arg2, (int) (local301 - local77), local428);
					if (this.aLong192 < local303) {
						arg1 = (int) ((long) arg1 + this.aLong192 - local303);
						this.aLong192 = local303;
					}
				}
			}
		} catch (@Pc(465) IOException local465) {
			this.aLong188 = -1L;
			throw local465;
		}
		if (arg1 > 0) {
			throw new EOFException();
		}
	}
}
