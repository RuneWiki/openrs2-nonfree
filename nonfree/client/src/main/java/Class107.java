import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jm")
public final class Class107 {

	@OriginalMember(owner = "client!jm", name = "x", descriptor = "J")
	private long aLong100;

	@OriginalMember(owner = "client!jm", name = "z", descriptor = "I")
	private int anInt3247;

	@OriginalMember(owner = "client!jm", name = "v", descriptor = "J")
	private long aLong99 = -1L;

	@OriginalMember(owner = "client!jm", name = "y", descriptor = "I")
	private int anInt3246 = 0;

	@OriginalMember(owner = "client!jm", name = "q", descriptor = "J")
	private long aLong98 = -1L;

	@OriginalMember(owner = "client!jm", name = "j", descriptor = "Lclient!k;")
	private final Class110 aClass110_4;

	@OriginalMember(owner = "client!jm", name = "g", descriptor = "J")
	private long aLong96;

	@OriginalMember(owner = "client!jm", name = "p", descriptor = "J")
	private long aLong97;

	@OriginalMember(owner = "client!jm", name = "e", descriptor = "J")
	private long aLong95;

	@OriginalMember(owner = "client!jm", name = "l", descriptor = "[B")
	private final byte[] aByteArray90;

	@OriginalMember(owner = "client!jm", name = "C", descriptor = "[B")
	private final byte[] aByteArray91;

	@OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(Lclient!k;II)V")
	public Class107(@OriginalArg(0) Class110 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass110_4 = arg0;
		this.aLong97 = this.aLong96 = arg0.method3081();
		this.aLong95 = 0L;
		this.aByteArray90 = new byte[arg1];
		this.aByteArray91 = new byte[arg2];
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(III[B)V")
	public void method3000(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if ((long) arg1 + this.aLong95 > this.aLong97) {
				this.aLong97 = (long) arg1 + this.aLong95;
			}
			if (this.aLong99 != (long) -1 && (this.aLong99 > this.aLong95 || this.aLong95 > (long) this.anInt3246 + this.aLong99)) {
				this.method3002();
			}
			if (this.aLong99 != -1L && this.aLong99 + (long) this.aByteArray91.length < this.aLong95 - -((long) arg1)) {
				@Pc(87) int local87 = (int) (this.aLong99 + (long) this.aByteArray91.length - this.aLong95);
				Static358.method769(arg2, arg0, this.aByteArray91, (int) (this.aLong95 - this.aLong99), local87);
				arg1 -= local87;
				arg0 += local87;
				this.aLong95 += local87;
				this.anInt3246 = this.aByteArray91.length;
				this.method3002();
			}
			if (this.aByteArray91.length < arg1) {
				if (this.aLong100 != this.aLong95) {
					this.aClass110_4.method3084(this.aLong95);
					this.aLong100 = this.aLong95;
				}
				this.aClass110_4.method3080(arg1, arg0, arg2);
				this.aLong100 += arg1;
				if (this.aLong100 > this.aLong96) {
					this.aLong96 = this.aLong100;
				}
				@Pc(179) long local179 = -1L;
				@Pc(181) long local181 = -1L;
				if (this.aLong95 >= this.aLong98 && this.aLong98 + (long) this.anInt3247 > this.aLong95) {
					local179 = this.aLong95;
				} else if (this.aLong95 <= this.aLong98 && (long) arg1 + this.aLong95 > this.aLong98) {
					local179 = this.aLong98;
				}
				if (this.aLong98 < (long) arg1 + this.aLong95 && (long) arg1 + this.aLong95 <= (long) this.anInt3247 + this.aLong98) {
					local181 = this.aLong95 + (long) arg1;
				} else if (this.aLong98 + (long) this.anInt3247 > this.aLong95 && this.aLong98 + (long) this.anInt3247 <= this.aLong95 - -((long) arg1)) {
					local181 = this.aLong98 + (long) this.anInt3247;
				}
				if (local179 > -1L && local179 < local181) {
					@Pc(325) int local325 = (int) (local181 - local179);
					Static358.method769(arg2, (int) ((long) arg0 + local179 - this.aLong95), this.aByteArray90, (int) (local179 - this.aLong98), local325);
				}
				this.aLong95 += arg1;
			} else if (arg1 > 0) {
				if (this.aLong99 == -1L) {
					this.aLong99 = this.aLong95;
				}
				Static358.method769(arg2, arg0, this.aByteArray91, (int) (this.aLong95 - this.aLong99), arg1);
				this.aLong95 += arg1;
				if (this.aLong95 - this.aLong99 > (long) this.anInt3246) {
					this.anInt3246 = (int) (this.aLong95 - this.aLong99);
				}
			}
		} catch (@Pc(404) IOException local404) {
			this.aLong100 = -1L;
			throw local404;
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(B)V")
	private void method3001() throws IOException {
		this.anInt3247 = 0;
		if (this.aLong100 != this.aLong95) {
			this.aClass110_4.method3084(this.aLong95);
			this.aLong100 = this.aLong95;
		}
		this.aLong98 = this.aLong95;
		while (this.anInt3247 < this.aByteArray90.length) {
			@Pc(41) int local41 = this.aByteArray90.length - this.anInt3247;
			if (local41 > 200000000) {
				local41 = 200000000;
			}
			@Pc(56) int local56 = this.aClass110_4.method3082(this.anInt3247, this.aByteArray90, local41);
			if (local56 == -1) {
				break;
			}
			this.aLong100 += local56;
			this.anInt3247 += local56;
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)V")
	private void method3002() throws IOException {
		if (this.aLong99 == -1L) {
			return;
		}
		if (this.aLong100 != this.aLong99) {
			this.aClass110_4.method3084(this.aLong99);
			this.aLong100 = this.aLong99;
		}
		this.aClass110_4.method3080(this.anInt3246, 0, this.aByteArray91);
		this.aLong100 += this.anInt3246;
		if (this.aLong100 > this.aLong96) {
			this.aLong96 = this.aLong100;
		}
		@Pc(53) long local53 = -1L;
		@Pc(55) long local55 = -1L;
		if (this.aLong98 <= this.aLong99 && this.aLong99 < (long) this.anInt3247 + this.aLong98) {
			local53 = this.aLong99;
		} else if (this.aLong98 >= this.aLong99 && this.aLong98 < this.aLong99 + (long) this.anInt3246) {
			local53 = this.aLong98;
		}
		if (this.aLong98 < (long) this.anInt3246 + this.aLong99 && (long) this.anInt3247 + this.aLong98 >= this.aLong99 - -((long) this.anInt3246)) {
			local55 = (long) this.anInt3246 + this.aLong99;
		} else if (this.aLong99 < (long) this.anInt3247 + this.aLong98 && this.aLong99 + (long) this.anInt3246 >= (long) this.anInt3247 + this.aLong98) {
			local55 = (long) this.anInt3247 + this.aLong98;
		}
		if (local53 > -1L && local55 > local53) {
			@Pc(210) int local210 = (int) (local55 - local53);
			Static358.method769(this.aByteArray91, (int) (local53 - this.aLong99), this.aByteArray90, (int) (local53 - this.aLong98), local210);
		}
		this.aLong99 = -1L;
		this.anInt3246 = 0;
	}

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "(B)J")
	public long method3003() {
		return this.aLong97;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(JI)V")
	public void method3004(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method3005());
		}
		this.aLong95 = arg0;
	}

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "(I)Ljava/io/File;")
	private File method3005() {
		return this.aClass110_4.method3083();
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(I[BII)V")
	public void method3007(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg2 > arg0.length) {
				throw new ArrayIndexOutOfBoundsException(arg2 - arg0.length);
			}
			if (this.aLong99 != -1L && this.aLong95 >= this.aLong99 && this.aLong99 + (long) this.anInt3246 >= this.aLong95 - -((long) arg2)) {
				Static358.method769(this.aByteArray91, (int) (this.aLong95 - this.aLong99), arg0, 0, arg2);
				this.aLong95 += arg2;
				return;
			}
			@Pc(83) long local83 = this.aLong95;
			@Pc(87) int local87 = arg2;
			@Pc(115) int local115;
			if (this.aLong95 >= this.aLong98 && (long) this.anInt3247 + this.aLong98 > this.aLong95) {
				local115 = (int) (this.aLong98 + (long) this.anInt3247 - this.aLong95);
				if (local115 > arg2) {
					local115 = arg2;
				}
				Static358.method769(this.aByteArray90, (int) (this.aLong95 - this.aLong98), arg0, 0, local115);
				arg2 -= local115;
				this.aLong95 += local115;
				arg1 = local115;
			}
			if (this.aByteArray90.length < arg2) {
				this.aClass110_4.method3084(this.aLong95);
				this.aLong100 = this.aLong95;
				while (arg2 > 0) {
					local115 = this.aClass110_4.method3082(arg1, arg0, arg2);
					if (local115 == -1) {
						break;
					}
					arg1 += local115;
					this.aLong95 += local115;
					this.aLong100 += local115;
					arg2 -= local115;
				}
			} else if (arg2 > 0) {
				this.method3001();
				local115 = arg2;
				if (this.anInt3247 < arg2) {
					local115 = this.anInt3247;
				}
				Static358.method769(this.aByteArray90, 0, arg0, arg1, local115);
				this.aLong95 += local115;
				arg2 -= local115;
				arg1 += local115;
			}
			if (this.aLong99 != -1L) {
				if (this.aLong99 > this.aLong95 && arg2 > 0) {
					local115 = (int) (this.aLong99 - this.aLong95) + arg1;
					if (local115 > arg2 + arg1) {
						local115 = arg2 + arg1;
					}
					while (local115 > arg1) {
						arg0[arg1++] = 0;
						arg2--;
						this.aLong95++;
					}
				}
				@Pc(305) long local305 = -1L;
				@Pc(307) long local307 = -1L;
				if (this.aLong99 >= local83 && this.aLong99 < (long) local87 + local83) {
					local305 = this.aLong99;
				} else if (this.aLong99 <= local83 && local83 < this.aLong99 + (long) this.anInt3246) {
					local305 = local83;
				}
				if ((long) this.anInt3246 + this.aLong99 > local83 && (long) local87 + local83 >= (long) this.anInt3246 + this.aLong99) {
					local307 = (long) this.anInt3246 + this.aLong99;
				} else if (this.aLong99 < (long) local87 + local83 && (long) this.anInt3246 + this.aLong99 >= local83 - -((long) local87)) {
					local307 = local83 + (long) local87;
				}
				if (local305 > -1L && local307 > local305) {
					@Pc(428) int local428 = (int) (local307 - local305);
					Static358.method769(this.aByteArray91, (int) (local305 - this.aLong99), arg0, (int) (local305 - local83), local428);
					if (local307 > this.aLong95) {
						arg2 = (int) ((long) arg2 + this.aLong95 - local307);
						this.aLong95 = local307;
					}
				}
			}
		} catch (@Pc(470) IOException local470) {
			this.aLong100 = -1L;
			throw local470;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(I[B)V")
	public void method3010(@OriginalArg(1) byte[] arg0) throws IOException {
		this.method3007(arg0, 0, arg0.length);
	}
}
