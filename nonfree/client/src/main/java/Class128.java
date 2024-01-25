import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!js")
public final class Class128 {

	@OriginalMember(owner = "client!js", name = "t", descriptor = "I")
	private int anInt3240;

	@OriginalMember(owner = "client!js", name = "z", descriptor = "J")
	private long aLong113;

	@OriginalMember(owner = "client!js", name = "m", descriptor = "J")
	private long aLong111 = -1L;

	@OriginalMember(owner = "client!js", name = "n", descriptor = "I")
	private int anInt3236 = 0;

	@OriginalMember(owner = "client!js", name = "c", descriptor = "J")
	private long aLong108 = -1L;

	@OriginalMember(owner = "client!js", name = "r", descriptor = "Lclient!bt;")
	private final Class25 aClass25_4;

	@OriginalMember(owner = "client!js", name = "d", descriptor = "J")
	private long aLong109;

	@OriginalMember(owner = "client!js", name = "w", descriptor = "J")
	private long aLong112;

	@OriginalMember(owner = "client!js", name = "j", descriptor = "J")
	private long aLong110;

	@OriginalMember(owner = "client!js", name = "s", descriptor = "[B")
	private final byte[] aByteArray47;

	@OriginalMember(owner = "client!js", name = "A", descriptor = "[B")
	private final byte[] aByteArray48;

	@OriginalMember(owner = "client!js", name = "<init>", descriptor = "(Lclient!bt;II)V")
	public Class128(@OriginalArg(0) Class25 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass25_4 = arg0;
		this.aLong112 = this.aLong109 = arg0.method590();
		this.aLong110 = 0L;
		this.aByteArray47 = new byte[arg1];
		this.aByteArray48 = new byte[arg2];
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(I)J")
	public long method2964() {
		return this.aLong112;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(B)V")
	private void method2966() throws IOException {
		this.anInt3240 = 0;
		if (this.aLong113 != this.aLong110) {
			this.aClass25_4.method593(this.aLong110);
			this.aLong113 = this.aLong110;
		}
		this.aLong108 = this.aLong110;
		while (this.aByteArray47.length > this.anInt3240) {
			@Pc(43) int local43 = this.aByteArray47.length - this.anInt3240;
			if (local43 > 200000000) {
				local43 = 200000000;
			}
			@Pc(60) int local60 = this.aClass25_4.method592(local43, this.aByteArray47, this.anInt3240);
			if (local60 == -1) {
				break;
			}
			this.anInt3240 += local60;
			this.aLong113 += local60;
		}
	}

	@OriginalMember(owner = "client!js", name = "b", descriptor = "(Z)Ljava/io/File;")
	private File method2969() {
		return this.aClass25_4.method591();
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "([BZ)V")
	public void method2970(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method2972(arg0.length, 0, arg0);
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(III[B)V")
	public void method2971(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if (this.aLong110 + (long) arg1 > this.aLong112) {
				this.aLong112 = (long) arg1 + this.aLong110;
			}
			if (this.aLong111 != -1L && (this.aLong111 > this.aLong110 || this.aLong111 + (long) this.anInt3236 < this.aLong110)) {
				this.method2973();
			}
			if (this.aLong111 != -1L && (long) this.aByteArray48.length + this.aLong111 < (long) arg1 + this.aLong110) {
				@Pc(93) int local93 = (int) (this.aLong111 + (long) this.aByteArray48.length - this.aLong110);
				Static399.method2487(arg2, arg0, this.aByteArray48, (int) (this.aLong110 - this.aLong111), local93);
				arg1 -= local93;
				this.aLong110 += local93;
				arg0 += local93;
				this.anInt3236 = this.aByteArray48.length;
				this.method2973();
			}
			if (this.aByteArray48.length < arg1) {
				if (this.aLong110 != this.aLong113) {
					this.aClass25_4.method593(this.aLong110);
					this.aLong113 = this.aLong110;
				}
				this.aClass25_4.method589(arg2, arg1, arg0);
				this.aLong113 += arg1;
				if (this.aLong109 < this.aLong113) {
					this.aLong109 = this.aLong113;
				}
				@Pc(176) long local176 = -1L;
				@Pc(178) long local178 = -1L;
				if (this.aLong108 <= this.aLong110 && this.aLong110 < (long) this.anInt3240 + this.aLong108) {
					local176 = this.aLong110;
				} else if (this.aLong110 <= this.aLong108 && this.aLong110 + (long) arg1 > this.aLong108) {
					local176 = this.aLong108;
				}
				if (this.aLong108 < this.aLong110 + (long) arg1 && (long) this.anInt3240 + this.aLong108 >= this.aLong110 + (long) arg1) {
					local178 = this.aLong110 + (long) arg1;
				} else if (this.aLong108 + (long) this.anInt3240 > this.aLong110 && (long) this.anInt3240 + this.aLong108 <= (long) arg1 + this.aLong110) {
					local178 = (long) this.anInt3240 + this.aLong108;
				}
				if (local176 > -1L && local176 < local178) {
					@Pc(301) int local301 = (int) (local178 - local176);
					Static399.method2487(arg2, (int) (local176 + (long) arg0 - this.aLong110), this.aByteArray47, (int) (local176 - this.aLong108), local301);
				}
				this.aLong110 += arg1;
			} else if (arg1 > 0) {
				if (this.aLong111 == -1L) {
					this.aLong111 = this.aLong110;
				}
				Static399.method2487(arg2, arg0, this.aByteArray48, (int) (this.aLong110 - this.aLong111), arg1);
				this.aLong110 += arg1;
				if (this.aLong110 - this.aLong111 > (long) this.anInt3236) {
					this.anInt3236 = (int) (this.aLong110 - this.aLong111);
				}
			}
		} catch (@Pc(389) IOException local389) {
			this.aLong113 = -1L;
			throw local389;
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(II[BB)V")
	public void method2972(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		try {
			if (arg2.length < arg0) {
				throw new ArrayIndexOutOfBoundsException(arg0 - arg2.length);
			}
			if (this.aLong111 != -1L && this.aLong111 <= this.aLong110 && (long) arg0 + this.aLong110 <= (long) this.anInt3236 + this.aLong111) {
				Static399.method2487(this.aByteArray48, (int) (this.aLong110 - this.aLong111), arg2, 0, arg0);
				this.aLong110 += arg0;
				return;
			}
			@Pc(71) long local71 = this.aLong110;
			@Pc(75) int local75 = arg0;
			@Pc(103) int local103;
			if (this.aLong108 <= this.aLong110 && this.aLong110 < (long) this.anInt3240 + this.aLong108) {
				local103 = (int) (this.aLong108 + (long) this.anInt3240 - this.aLong110);
				if (arg0 < local103) {
					local103 = arg0;
				}
				Static399.method2487(this.aByteArray47, (int) (this.aLong110 - this.aLong108), arg2, 0, local103);
				arg0 -= local103;
				this.aLong110 += local103;
				arg1 = local103;
			}
			if (arg0 > this.aByteArray47.length) {
				this.aClass25_4.method593(this.aLong110);
				this.aLong113 = this.aLong110;
				while (arg0 > 0) {
					local103 = this.aClass25_4.method592(arg0, arg2, arg1);
					if (local103 == -1) {
						break;
					}
					arg0 -= local103;
					this.aLong113 += local103;
					arg1 += local103;
					this.aLong110 += local103;
				}
			} else if (arg0 > 0) {
				this.method2966();
				local103 = arg0;
				if (this.anInt3240 < arg0) {
					local103 = this.anInt3240;
				}
				Static399.method2487(this.aByteArray47, 0, arg2, arg1, local103);
				this.aLong110 += local103;
				arg0 -= local103;
				arg1 += local103;
			}
			if (this.aLong111 != -1L) {
				if (this.aLong110 < this.aLong111 && arg0 > 0) {
					local103 = arg1 + (int) (this.aLong111 - this.aLong110);
					if (arg0 + arg1 < local103) {
						local103 = arg1 + arg0;
					}
					while (local103 > arg1) {
						arg2[arg1++] = 0;
						arg0--;
						this.aLong110++;
					}
				}
				@Pc(293) long local293 = -1L;
				@Pc(295) long local295 = -1L;
				if (local71 <= this.aLong111 && (long) local75 + local71 > this.aLong111) {
					local293 = this.aLong111;
				} else if (this.aLong111 <= local71 && local71 < (long) this.anInt3236 + this.aLong111) {
					local293 = local71;
				}
				if (local71 < this.aLong111 + (long) this.anInt3236 && this.aLong111 + (long) this.anInt3236 <= (long) local75 + local71) {
					local295 = (long) this.anInt3236 + this.aLong111;
				} else if ((long) local75 + local71 > this.aLong111 && this.aLong111 + (long) this.anInt3236 >= (long) local75 + local71) {
					local295 = (long) local75 + local71;
				}
				if (local293 > -1L && local293 < local295) {
					@Pc(410) int local410 = (int) (local295 - local293);
					Static399.method2487(this.aByteArray48, (int) (local293 - this.aLong111), arg2, (int) (local293 - local71), local410);
					if (this.aLong110 < local295) {
						arg0 = (int) ((long) arg0 + this.aLong110 - local295);
						this.aLong110 = local295;
					}
				}
			}
		} catch (@Pc(459) IOException local459) {
			this.aLong113 = -1L;
			throw local459;
		}
		if (arg0 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!js", name = "b", descriptor = "(I)V")
	private void method2973() throws IOException {
		if (this.aLong111 == -1L) {
			return;
		}
		if (this.aLong113 != this.aLong111) {
			this.aClass25_4.method593(this.aLong111);
			this.aLong113 = this.aLong111;
		}
		this.aClass25_4.method589(this.aByteArray48, this.anInt3236, 0);
		this.aLong113 += this.anInt3236;
		if (this.aLong113 > this.aLong109) {
			this.aLong109 = this.aLong113;
		}
		@Pc(61) long local61 = -1L;
		@Pc(63) long local63 = -1L;
		if (this.aLong111 >= this.aLong108 && this.aLong108 + (long) this.anInt3240 > this.aLong111) {
			local61 = this.aLong111;
		} else if (this.aLong108 >= this.aLong111 && this.aLong108 < this.aLong111 + (long) this.anInt3236) {
			local61 = this.aLong108;
		}
		if ((long) this.anInt3236 + this.aLong111 > this.aLong108 && this.aLong111 + (long) this.anInt3236 <= (long) this.anInt3240 + this.aLong108) {
			local63 = this.aLong111 + (long) this.anInt3236;
		} else if (this.aLong111 < (long) this.anInt3240 + this.aLong108 && this.aLong108 + (long) this.anInt3240 <= this.aLong111 + (long) this.anInt3236) {
			local63 = this.aLong108 + (long) this.anInt3240;
		}
		if (local61 > -1L && local61 < local63) {
			@Pc(207) int local207 = (int) (local63 - local61);
			Static399.method2487(this.aByteArray48, (int) (local61 - this.aLong111), this.aByteArray47, (int) (local61 - this.aLong108), local207);
		}
		this.anInt3236 = 0;
		this.aLong111 = -1L;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(ZJ)V")
	public void method2974(@OriginalArg(1) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method2969());
		}
		this.aLong110 = arg0;
	}
}
