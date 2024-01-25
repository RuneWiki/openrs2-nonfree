import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!up")
public final class Class205 {

	@OriginalMember(owner = "client!up", name = "d", descriptor = "J")
	private long aLong202;

	@OriginalMember(owner = "client!up", name = "o", descriptor = "I")
	private int anInt6273;

	@OriginalMember(owner = "client!up", name = "f", descriptor = "J")
	private long aLong203 = -1L;

	@OriginalMember(owner = "client!up", name = "x", descriptor = "I")
	private int anInt6278 = 0;

	@OriginalMember(owner = "client!up", name = "r", descriptor = "J")
	private long aLong205 = -1L;

	@OriginalMember(owner = "client!up", name = "g", descriptor = "Lclient!hd;")
	private final Class84 aClass84_4;

	@OriginalMember(owner = "client!up", name = "v", descriptor = "J")
	private long aLong207;

	@OriginalMember(owner = "client!up", name = "u", descriptor = "J")
	private long aLong206;

	@OriginalMember(owner = "client!up", name = "i", descriptor = "J")
	private long aLong204;

	@OriginalMember(owner = "client!up", name = "A", descriptor = "[B")
	private final byte[] aByteArray88;

	@OriginalMember(owner = "client!up", name = "c", descriptor = "[B")
	private final byte[] aByteArray87;

	static {
		new Class159("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.");
	}

	@OriginalMember(owner = "client!up", name = "<init>", descriptor = "(Lclient!hd;II)V")
	public Class205(@OriginalArg(0) Class84 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass84_4 = arg0;
		this.aLong206 = this.aLong207 = arg0.method2416();
		this.aLong204 = 0L;
		this.aByteArray88 = new byte[arg2];
		this.aByteArray87 = new byte[arg1];
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(JB)V")
	public void method5309(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method5318());
		}
		this.aLong204 = arg0;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(I)V")
	private void method5310() throws IOException {
		if (this.aLong205 == -1L) {
			return;
		}
		if (this.aLong205 != this.aLong202) {
			this.aClass84_4.method2414(this.aLong205);
			this.aLong202 = this.aLong205;
		}
		this.aClass84_4.method2417(this.aByteArray88, 0, this.anInt6278);
		this.aLong202 += this.anInt6278;
		if (this.aLong207 < this.aLong202) {
			this.aLong207 = this.aLong202;
		}
		@Pc(61) long local61 = -1L;
		if (this.aLong205 >= this.aLong203 && (long) this.anInt6273 + this.aLong203 > this.aLong205) {
			local61 = this.aLong205;
		} else if (this.aLong205 <= this.aLong203 && this.aLong205 + (long) this.anInt6278 > this.aLong203) {
			local61 = this.aLong203;
		}
		@Pc(115) long local115 = -1L;
		if (this.aLong205 + (long) this.anInt6278 > this.aLong203 && (long) this.anInt6278 + this.aLong205 <= (long) this.anInt6273 + this.aLong203) {
			local115 = (long) this.anInt6278 + this.aLong205;
		} else if (this.aLong203 + (long) this.anInt6273 > this.aLong205 && (long) this.anInt6273 + this.aLong203 <= (long) this.anInt6278 + this.aLong205) {
			local115 = this.aLong203 + (long) this.anInt6273;
		}
		if (local61 > -1L && local61 < local115) {
			@Pc(207) int local207 = (int) (local115 - local61);
			Static359.method761(this.aByteArray88, (int) (local61 - this.aLong205), this.aByteArray87, (int) (local61 - this.aLong203), local207);
		}
		this.aLong205 = -1L;
		this.anInt6278 = 0;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(I[B)V")
	public void method5315(@OriginalArg(1) byte[] arg0) throws IOException {
		this.method5320(0, arg0, arg0.length);
	}

	@OriginalMember(owner = "client!up", name = "b", descriptor = "(B)J")
	public long method5316() {
		return this.aLong206;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(BII[B)V")
	public void method5317(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if (this.aLong206 < (long) arg1 + this.aLong204) {
				this.aLong206 = (long) arg1 + this.aLong204;
			}
			if (this.aLong205 != -1L && (this.aLong204 < this.aLong205 || (long) this.anInt6278 + this.aLong205 < this.aLong204)) {
				this.method5310();
			}
			if (this.aLong205 != -1L && this.aLong204 + (long) arg1 > this.aLong205 + (long) this.aByteArray88.length) {
				@Pc(96) int local96 = (int) (this.aLong205 + (long) this.aByteArray88.length - this.aLong204);
				Static359.method761(arg2, arg0, this.aByteArray88, (int) (this.aLong204 - this.aLong205), local96);
				this.aLong204 += local96;
				arg0 += local96;
				arg1 -= local96;
				this.anInt6278 = this.aByteArray88.length;
				this.method5310();
			}
			if (arg1 > this.aByteArray88.length) {
				if (this.aLong204 != this.aLong202) {
					this.aClass84_4.method2414(this.aLong204);
					this.aLong202 = this.aLong204;
				}
				this.aClass84_4.method2417(arg2, arg0, arg1);
				this.aLong202 += arg1;
				if (this.aLong202 > this.aLong207) {
					this.aLong207 = this.aLong202;
				}
				@Pc(189) long local189 = -1L;
				if (this.aLong203 <= this.aLong204 && (long) this.anInt6273 + this.aLong203 > this.aLong204) {
					local189 = this.aLong204;
				} else if (this.aLong203 >= this.aLong204 && (long) arg1 + this.aLong204 > this.aLong203) {
					local189 = this.aLong203;
				}
				@Pc(238) long local238 = -1L;
				if (this.aLong203 < (long) arg1 + this.aLong204 && (long) arg1 + this.aLong204 <= this.aLong203 - -((long) this.anInt6273)) {
					local238 = (long) arg1 + this.aLong204;
				} else if ((long) this.anInt6273 + this.aLong203 > this.aLong204 && this.aLong203 + (long) this.anInt6273 <= this.aLong204 - -((long) arg1)) {
					local238 = this.aLong203 + (long) this.anInt6273;
				}
				if (local189 > -1L && local189 < local238) {
					@Pc(321) int local321 = (int) (local238 - local189);
					Static359.method761(arg2, (int) (local189 + (long) arg0 - this.aLong204), this.aByteArray87, (int) (local189 - this.aLong203), local321);
				}
				this.aLong204 += arg1;
			} else if (arg1 > 0) {
				if (this.aLong205 == -1L) {
					this.aLong205 = this.aLong204;
				}
				Static359.method761(arg2, arg0, this.aByteArray88, (int) (this.aLong204 - this.aLong205), arg1);
				this.aLong204 += arg1;
				if ((long) this.anInt6278 < this.aLong204 - this.aLong205) {
					this.anInt6278 = (int) (this.aLong204 - this.aLong205);
				}
			}
		} catch (@Pc(404) IOException local404) {
			this.aLong202 = -1L;
			throw local404;
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(Z)Ljava/io/File;")
	private File method5318() {
		return this.aClass84_4.method2415();
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(II[BI)V")
	public void method5320(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg2 > arg1.length) {
				throw new ArrayIndexOutOfBoundsException(arg2 - arg1.length);
			}
			if (this.aLong205 != -1L && this.aLong205 <= this.aLong204 && this.aLong205 + (long) this.anInt6278 >= (long) arg2 + this.aLong204) {
				Static359.method761(this.aByteArray88, (int) (this.aLong204 - this.aLong205), arg1, 0, arg2);
				this.aLong204 += arg2;
				return;
			}
			@Pc(84) long local84 = this.aLong204;
			@Pc(88) int local88 = arg2;
			@Pc(121) int local121;
			if (this.aLong203 <= this.aLong204 && this.aLong203 + (long) this.anInt6273 > this.aLong204) {
				local121 = (int) (this.aLong203 + (long) this.anInt6273 - this.aLong204);
				if (local121 > arg2) {
					local121 = arg2;
				}
				Static359.method761(this.aByteArray87, (int) (this.aLong204 - this.aLong203), arg1, 0, local121);
				this.aLong204 += local121;
				arg2 -= local121;
				arg0 = local121;
			}
			if (this.aByteArray87.length < arg2) {
				this.aClass84_4.method2414(this.aLong204);
				this.aLong202 = this.aLong204;
				while (arg2 > 0) {
					local121 = this.aClass84_4.method2418(arg1, arg0, arg2);
					if (local121 == -1) {
						break;
					}
					arg2 -= local121;
					this.aLong204 += local121;
					arg0 += local121;
					this.aLong202 += local121;
				}
			} else if (arg2 > 0) {
				this.method5321();
				local121 = arg2;
				if (arg2 > this.anInt6273) {
					local121 = this.anInt6273;
				}
				Static359.method761(this.aByteArray87, 0, arg1, arg0, local121);
				arg0 += local121;
				this.aLong204 += local121;
				arg2 -= local121;
			}
			if (this.aLong205 != -1L) {
				if (this.aLong205 > this.aLong204 && arg2 > 0) {
					local121 = (int) (this.aLong205 - this.aLong204) + arg0;
					if (arg0 + arg2 < local121) {
						local121 = arg0 + arg2;
					}
					while (local121 > arg0) {
						arg1[arg0++] = 0;
						arg2--;
						this.aLong204++;
					}
				}
				@Pc(317) long local317 = -1L;
				@Pc(319) long local319 = -1L;
				if (local84 <= this.aLong205 && this.aLong205 < local84 + (long) local88) {
					local317 = this.aLong205;
				} else if (this.aLong205 <= local84 && local84 < (long) this.anInt6278 + this.aLong205) {
					local317 = local84;
				}
				if ((long) this.anInt6278 + this.aLong205 > local84 && local84 + (long) local88 >= this.aLong205 + (long) this.anInt6278) {
					local319 = this.aLong205 + (long) this.anInt6278;
				} else if ((long) local88 + local84 > this.aLong205 && this.aLong205 + (long) this.anInt6278 >= (long) local88 + local84) {
					local319 = (long) local88 + local84;
				}
				if (local317 > -1L && local319 > local317) {
					@Pc(446) int local446 = (int) (local319 - local317);
					Static359.method761(this.aByteArray88, (int) (local317 - this.aLong205), arg1, (int) (local317 - local84), local446);
					if (local319 > this.aLong204) {
						arg2 = (int) ((long) arg2 + this.aLong204 - local319);
						this.aLong204 = local319;
					}
				}
			}
		} catch (@Pc(487) IOException local487) {
			this.aLong202 = -1L;
			throw local487;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!up", name = "c", descriptor = "(I)V")
	private void method5321() throws IOException {
		this.anInt6273 = 0;
		if (this.aLong204 != this.aLong202) {
			this.aClass84_4.method2414(this.aLong204);
			this.aLong202 = this.aLong204;
		}
		this.aLong203 = this.aLong204;
		while (this.anInt6273 < this.aByteArray87.length) {
			@Pc(41) int local41 = this.aByteArray87.length - this.anInt6273;
			if (local41 > 200000000) {
				local41 = 200000000;
			}
			@Pc(56) int local56 = this.aClass84_4.method2418(this.aByteArray87, this.anInt6273, local41);
			if (local56 == -1) {
				break;
			}
			this.anInt6273 += local56;
			this.aLong202 += local56;
		}
	}
}
