import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tq")
public final class Class279 {

	@OriginalMember(owner = "client!tq", name = "c", descriptor = "I")
	private int anInt8053;

	@OriginalMember(owner = "client!tq", name = "w", descriptor = "J")
	private long aLong217;

	@OriginalMember(owner = "client!tq", name = "n", descriptor = "J")
	private long aLong215 = -1L;

	@OriginalMember(owner = "client!tq", name = "i", descriptor = "I")
	private int anInt8057 = 0;

	@OriginalMember(owner = "client!tq", name = "s", descriptor = "J")
	private long aLong216 = -1L;

	@OriginalMember(owner = "client!tq", name = "p", descriptor = "Lclient!hd;")
	private final Class116 aClass116_4;

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "J")
	private long aLong212;

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "J")
	private long aLong213;

	@OriginalMember(owner = "client!tq", name = "t", descriptor = "[B")
	private final byte[] aByteArray97;

	@OriginalMember(owner = "client!tq", name = "d", descriptor = "[B")
	private final byte[] aByteArray96;

	@OriginalMember(owner = "client!tq", name = "l", descriptor = "J")
	private long aLong214;

	@OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(Lclient!hd;II)V")
	public Class279(@OriginalArg(0) Class116 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass116_4 = arg0;
		this.aLong213 = this.aLong212 = arg0.method3372();
		this.aByteArray97 = new byte[arg2];
		this.aByteArray96 = new byte[arg1];
		this.aLong214 = 0L;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(I)V")
	private void method6837() throws IOException {
		if (this.aLong216 == -1L) {
			return;
		}
		if (this.aLong216 != this.aLong217) {
			this.aClass116_4.method3367(this.aLong216);
			this.aLong217 = this.aLong216;
		}
		this.aClass116_4.method3368(this.aByteArray97, this.anInt8057, 0);
		this.aLong217 += this.anInt8057;
		if (this.aLong212 < this.aLong217) {
			this.aLong212 = this.aLong217;
		}
		@Pc(65) long local65 = -1L;
		if (this.aLong216 >= this.aLong215 && this.aLong215 + (long) this.anInt8053 > this.aLong216) {
			local65 = this.aLong216;
		} else if (this.aLong215 >= this.aLong216 && this.aLong215 < this.aLong216 + (long) this.anInt8057) {
			local65 = this.aLong215;
		}
		@Pc(115) long local115 = -1L;
		if (this.aLong215 < this.aLong216 + (long) this.anInt8057 && this.aLong216 + (long) this.anInt8057 <= this.aLong215 - -((long) this.anInt8053)) {
			local115 = (long) this.anInt8057 + this.aLong216;
		} else if (this.aLong215 + (long) this.anInt8053 > this.aLong216 && (long) this.anInt8053 + this.aLong215 <= (long) this.anInt8057 + this.aLong216) {
			local115 = this.aLong215 + (long) this.anInt8053;
		}
		if (local65 > -1L && local115 > local65) {
			@Pc(210) int local210 = (int) (local115 - local65);
			Static555.method5095(this.aByteArray97, (int) (local65 - this.aLong216), this.aByteArray96, (int) (local65 - this.aLong215), local210);
		}
		this.anInt8057 = 0;
		this.aLong216 = -1L;
	}

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "(I)V")
	private void method6838() throws IOException {
		this.anInt8053 = 0;
		if (this.aLong214 != this.aLong217) {
			this.aClass116_4.method3367(this.aLong214);
			this.aLong217 = this.aLong214;
		}
		this.aLong215 = this.aLong214;
		while (this.anInt8053 < this.aByteArray96.length) {
			@Pc(43) int local43 = this.aByteArray96.length - this.anInt8053;
			if (local43 > 200000000) {
				local43 = 200000000;
			}
			@Pc(58) int local58 = this.aClass116_4.method3369(local43, this.anInt8053, this.aByteArray96);
			if (local58 == -1) {
				break;
			}
			this.anInt8053 += local58;
			this.aLong217 += local58;
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(BJ)V")
	public void method6839(@OriginalArg(1) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method6844());
		}
		this.aLong214 = arg0;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(B)J")
	public long method6841() {
		return this.aLong213;
	}

	@OriginalMember(owner = "client!tq", name = "c", descriptor = "(I)Ljava/io/File;")
	private File method6844() {
		return this.aClass116_4.method3370();
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(I[BBI)V")
	public void method6846(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg1.length < arg2) {
				throw new ArrayIndexOutOfBoundsException(arg2 - arg1.length);
			}
			if (this.aLong216 != -1L && this.aLong216 <= this.aLong214 && (long) this.anInt8057 + this.aLong216 >= this.aLong214 - -((long) arg2)) {
				Static555.method5095(this.aByteArray97, (int) (this.aLong214 - this.aLong216), arg1, 0, arg2);
				this.aLong214 += arg2;
				return;
			}
			@Pc(88) long local88 = this.aLong214;
			@Pc(92) int local92 = arg2;
			@Pc(128) int local128;
			if (this.aLong215 <= this.aLong214 && this.aLong215 + (long) this.anInt8053 > this.aLong214) {
				local128 = (int) ((long) this.anInt8053 + this.aLong215 - this.aLong214);
				if (local128 > arg2) {
					local128 = arg2;
				}
				Static555.method5095(this.aByteArray96, (int) (this.aLong214 - this.aLong215), arg1, 0, local128);
				arg2 -= local128;
				this.aLong214 += local128;
				arg0 = local128;
			}
			if (arg2 > this.aByteArray96.length) {
				this.aClass116_4.method3367(this.aLong214);
				this.aLong217 = this.aLong214;
				while (arg2 > 0) {
					local128 = this.aClass116_4.method3369(arg2, arg0, arg1);
					if (local128 == -1) {
						break;
					}
					arg0 += local128;
					this.aLong214 += local128;
					arg2 -= local128;
					this.aLong217 += local128;
				}
			} else if (arg2 > 0) {
				this.method6838();
				local128 = arg2;
				if (arg2 > this.anInt8053) {
					local128 = this.anInt8053;
				}
				Static555.method5095(this.aByteArray96, 0, arg1, arg0, local128);
				this.aLong214 += local128;
				arg2 -= local128;
				arg0 += local128;
			}
			if (this.aLong216 != -1L) {
				if (this.aLong216 > this.aLong214 && arg2 > 0) {
					local128 = (int) (this.aLong216 - this.aLong214) + arg0;
					if (arg0 + arg2 < local128) {
						local128 = arg0 + arg2;
					}
					while (arg0 < local128) {
						arg2--;
						arg1[arg0++] = 0;
						this.aLong214++;
					}
				}
				@Pc(322) long local322 = -1L;
				if (this.aLong216 >= local88 && local88 + (long) local92 > this.aLong216) {
					local322 = this.aLong216;
				} else if (this.aLong216 <= local88 && (long) this.anInt8057 + this.aLong216 > local88) {
					local322 = local88;
				}
				@Pc(366) long local366 = -1L;
				if ((long) this.anInt8057 + this.aLong216 > local88 && this.aLong216 + (long) this.anInt8057 <= (long) local92 + local88) {
					local366 = this.aLong216 + (long) this.anInt8057;
				} else if (this.aLong216 < (long) local92 + local88 && (long) this.anInt8057 + this.aLong216 >= (long) local92 + local88) {
					local366 = local88 + (long) local92;
				}
				if (local322 > -1L && local366 > local322) {
					@Pc(451) int local451 = (int) (local366 - local322);
					Static555.method5095(this.aByteArray97, (int) (local322 - this.aLong216), arg1, (int) (local322 - local88), local451);
					if (this.aLong214 < local366) {
						arg2 = (int) ((long) arg2 + this.aLong214 - local366);
						this.aLong214 = local366;
					}
				}
			}
		} catch (@Pc(492) IOException local492) {
			this.aLong217 = -1L;
			throw local492;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IB[BI)V")
	public void method6847(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if ((long) arg2 + this.aLong214 > this.aLong213) {
				this.aLong213 = this.aLong214 + (long) arg2;
			}
			if (this.aLong216 != -1L && (this.aLong216 > this.aLong214 || this.aLong214 > this.aLong216 + (long) this.anInt8057)) {
				this.method6837();
			}
			if (this.aLong216 != -1L && this.aLong216 + (long) this.aByteArray97.length < this.aLong214 - -((long) arg2)) {
				@Pc(96) int local96 = (int) (this.aLong216 + (long) this.aByteArray97.length - this.aLong214);
				Static555.method5095(arg1, arg0, this.aByteArray97, (int) (this.aLong214 - this.aLong216), local96);
				arg0 += local96;
				arg2 -= local96;
				this.aLong214 += local96;
				this.anInt8057 = this.aByteArray97.length;
				this.method6837();
			}
			if (arg2 > this.aByteArray97.length) {
				if (this.aLong214 != this.aLong217) {
					this.aClass116_4.method3367(this.aLong214);
					this.aLong217 = this.aLong214;
				}
				this.aClass116_4.method3368(arg1, arg2, arg0);
				this.aLong217 += arg2;
				if (this.aLong212 < this.aLong217) {
					this.aLong212 = this.aLong217;
				}
				@Pc(186) long local186 = -1L;
				if (this.aLong215 <= this.aLong214 && this.aLong214 < this.aLong215 + (long) this.anInt8053) {
					local186 = this.aLong214;
				} else if (this.aLong214 <= this.aLong215 && this.aLong215 < this.aLong214 + (long) arg2) {
					local186 = this.aLong215;
				}
				@Pc(239) long local239 = -1L;
				if (this.aLong215 < this.aLong214 + (long) arg2 && this.aLong214 + (long) arg2 <= (long) this.anInt8053 + this.aLong215) {
					local239 = (long) arg2 + this.aLong214;
				} else if (this.aLong214 < (long) this.anInt8053 + this.aLong215 && (long) this.anInt8053 + this.aLong215 <= this.aLong214 - -((long) arg2)) {
					local239 = (long) this.anInt8053 + this.aLong215;
				}
				if (local186 > -1L && local186 < local239) {
					@Pc(326) int local326 = (int) (local239 - local186);
					Static555.method5095(arg1, (int) ((long) arg0 + local186 - this.aLong214), this.aByteArray96, (int) (local186 - this.aLong215), local326);
				}
				this.aLong214 += arg2;
			} else if (arg2 > 0) {
				if (this.aLong216 == -1L) {
					this.aLong216 = this.aLong214;
				}
				Static555.method5095(arg1, arg0, this.aByteArray97, (int) (this.aLong214 - this.aLong216), arg2);
				this.aLong214 += arg2;
				if ((long) this.anInt8057 < this.aLong214 - this.aLong216) {
					this.anInt8057 = (int) (this.aLong214 - this.aLong216);
				}
			}
		} catch (@Pc(414) IOException local414) {
			this.aLong217 = -1L;
			throw local414;
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(I[B)V")
	public void method6848(@OriginalArg(1) byte[] arg0) throws IOException {
		this.method6846(0, arg0, arg0.length);
	}
}
