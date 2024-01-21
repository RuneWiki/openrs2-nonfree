import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wh")
public final class Class89 {

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "J")
	private long aLong135;

	@OriginalMember(owner = "client!wh", name = "d", descriptor = "I")
	private int anInt4595;

	@OriginalMember(owner = "client!wh", name = "m", descriptor = "J")
	private long aLong137 = -1L;

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "I")
	private int anInt4594 = 0;

	@OriginalMember(owner = "client!wh", name = "w", descriptor = "J")
	private long aLong139 = -1L;

	@OriginalMember(owner = "client!wh", name = "s", descriptor = "Lclient!hh;")
	private final Class35 aClass35_4;

	@OriginalMember(owner = "client!wh", name = "D", descriptor = "J")
	private long aLong140;

	@OriginalMember(owner = "client!wh", name = "j", descriptor = "J")
	private long aLong136;

	@OriginalMember(owner = "client!wh", name = "l", descriptor = "[B")
	private final byte[] aByteArray47;

	@OriginalMember(owner = "client!wh", name = "t", descriptor = "J")
	private long aLong138;

	@OriginalMember(owner = "client!wh", name = "v", descriptor = "[B")
	private final byte[] aByteArray48;

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Lclient!hh;II)V")
	public Class89(@OriginalArg(0) Class35 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass35_4 = arg0;
		this.aLong136 = this.aLong140 = arg0.method1281();
		this.aByteArray47 = new byte[arg1];
		this.aLong138 = 0L;
		this.aByteArray48 = new byte[arg2];
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "([BB)V")
	public void method3009(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method3014(arg0, arg0.length, 0);
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(III[B)V")
	public void method3010(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if (this.aLong136 < this.aLong138 + (long) arg1) {
				this.aLong136 = this.aLong138 + (long) arg1;
			}
			if (this.aLong137 != -1L && (this.aLong138 < this.aLong137 || this.aLong137 + (long) this.anInt4594 < this.aLong138)) {
				this.method3012();
			}
			if (this.aLong137 != -1L && (long) this.aByteArray48.length + this.aLong137 < this.aLong138 - -((long) arg1)) {
				@Pc(91) int local91 = (int) ((long) this.aByteArray48.length + this.aLong137 - this.aLong138);
				arg1 -= local91;
				Static186.method1561(arg2, arg0, this.aByteArray48, (int) (this.aLong138 - this.aLong137), local91);
				this.aLong138 += local91;
				this.anInt4594 = this.aByteArray48.length;
				this.method3012();
				arg0 += local91;
			}
			if (arg1 > this.aByteArray48.length) {
				@Pc(138) long local138 = -1L;
				if (this.aLong138 != this.aLong135) {
					this.aClass35_4.method1283(this.aLong138);
					this.aLong135 = this.aLong138;
				}
				this.aClass35_4.method1285(arg2, arg0, arg1);
				this.aLong135 += arg1;
				if (this.aLong138 >= this.aLong139 && this.aLong139 + (long) this.anInt4595 > this.aLong138) {
					local138 = this.aLong138;
				} else if (this.aLong139 >= this.aLong138 && this.aLong139 < this.aLong138 + (long) arg1) {
					local138 = this.aLong139;
				}
				if (this.aLong135 > this.aLong140) {
					this.aLong140 = this.aLong135;
				}
				@Pc(224) long local224 = -1L;
				if (this.aLong139 < (long) arg1 + this.aLong138 && this.aLong138 + (long) arg1 <= (long) this.anInt4595 + this.aLong139) {
					local224 = this.aLong138 + (long) arg1;
				} else if (this.aLong138 < (long) this.anInt4595 + this.aLong139 && this.aLong138 + (long) arg1 >= this.aLong139 - -((long) this.anInt4595)) {
					local224 = this.aLong139 + (long) this.anInt4595;
				}
				if (local138 > -1L && local224 > local138) {
					@Pc(321) int local321 = (int) (local224 - local138);
					Static186.method1561(arg2, (int) ((long) arg0 + local138 - this.aLong138), this.aByteArray47, (int) (local138 - this.aLong139), local321);
				}
				this.aLong138 += arg1;
			} else if (arg1 > 0) {
				if (this.aLong137 == -1L) {
					this.aLong137 = this.aLong138;
				}
				Static186.method1561(arg2, arg0, this.aByteArray48, (int) (this.aLong138 - this.aLong137), arg1);
				this.aLong138 += arg1;
				if ((long) this.anInt4594 < this.aLong138 - this.aLong137) {
					this.anInt4594 = (int) (this.aLong138 - this.aLong137);
				}
			}
		} catch (@Pc(411) IOException local411) {
			this.aLong135 = -1L;
			throw local411;
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)V")
	private void method3012() throws IOException {
		if (this.aLong137 == -1L) {
			return;
		}
		if (this.aLong137 != this.aLong135) {
			this.aClass35_4.method1283(this.aLong137);
			this.aLong135 = this.aLong137;
		}
		this.aClass35_4.method1285(this.aByteArray48, 0, this.anInt4594);
		this.aLong135 += this.anInt4594;
		if (this.aLong135 > this.aLong140) {
			this.aLong140 = this.aLong135;
		}
		@Pc(65) long local65 = -1L;
		@Pc(67) long local67 = -1L;
		if ((long) this.anInt4594 + this.aLong137 > this.aLong139 && this.aLong139 + (long) this.anInt4595 >= (long) this.anInt4594 + this.aLong137) {
			local67 = this.aLong137 + (long) this.anInt4594;
		} else if (this.aLong139 + (long) this.anInt4595 > this.aLong137 && (long) this.anInt4595 + this.aLong139 <= this.aLong137 + (long) this.anInt4594) {
			local67 = this.aLong139 + (long) this.anInt4595;
		}
		if (this.aLong137 >= this.aLong139 && this.aLong137 < (long) this.anInt4595 + this.aLong139) {
			local65 = this.aLong137;
		} else if (this.aLong139 >= this.aLong137 && this.aLong137 + (long) this.anInt4594 > this.aLong139) {
			local65 = this.aLong139;
		}
		if (local65 > -1L && local67 > local65) {
			@Pc(199) int local199 = (int) (local67 - local65);
			Static186.method1561(this.aByteArray48, (int) (local65 - this.aLong137), this.aByteArray47, (int) (local65 - this.aLong139), local199);
		}
		this.aLong137 = -1L;
		this.anInt4594 = 0;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "([BIIB)V")
	public void method3014(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if (arg1 > arg0.length) {
				throw new ArrayIndexOutOfBoundsException(arg1 - arg0.length);
			}
			if (this.aLong137 != -1L && this.aLong137 <= this.aLong138 && (long) arg1 + this.aLong138 <= this.aLong137 + (long) this.anInt4594) {
				Static186.method1561(this.aByteArray48, (int) (this.aLong138 - this.aLong137), arg0, 0, arg1);
				this.aLong138 += arg1;
				return;
			}
			@Pc(79) long local79 = this.aLong138;
			@Pc(83) int local83 = arg1;
			@Pc(121) int local121;
			if (this.aLong139 <= this.aLong138 && this.aLong139 + (long) this.anInt4595 > this.aLong138) {
				local121 = (int) (this.aLong139 + (long) this.anInt4595 - this.aLong138);
				if (local121 > arg1) {
					local121 = arg1;
				}
				arg1 -= local121;
				Static186.method1561(this.aByteArray47, (int) (this.aLong138 - this.aLong139), arg0, 0, local121);
				arg2 = local121;
				this.aLong138 += local121;
			}
			if (arg1 > this.aByteArray47.length) {
				this.aClass35_4.method1283(this.aLong138);
				this.aLong135 = this.aLong138;
				while (arg1 > 0) {
					local121 = this.aClass35_4.method1284(arg1, arg0, arg2);
					if (local121 == -1) {
						break;
					}
					arg2 += local121;
					arg1 -= local121;
					this.aLong138 += local121;
					this.aLong135 += local121;
				}
			} else if (arg1 > 0) {
				this.method3020();
				local121 = arg1;
				if (arg1 > this.anInt4595) {
					local121 = this.anInt4595;
				}
				arg1 -= local121;
				Static186.method1561(this.aByteArray47, 0, arg0, arg2, local121);
				arg2 += local121;
				this.aLong138 += local121;
			}
			if (this.aLong137 != -1L) {
				if (this.aLong138 < this.aLong137 && arg1 > 0) {
					local121 = (int) (this.aLong137 - this.aLong138) + arg2;
					if (local121 > arg1 + arg2) {
						local121 = arg1 + arg2;
					}
					while (local121 > arg2) {
						arg0[arg2++] = 0;
						this.aLong138++;
						arg1--;
					}
				}
				@Pc(321) long local321 = -1L;
				if (this.aLong137 >= local79 && (long) local83 + local79 > this.aLong137) {
					local321 = this.aLong137;
				} else if (this.aLong137 <= local79 && local79 < (long) this.anInt4594 + this.aLong137) {
					local321 = local79;
				}
				@Pc(369) long local369 = -1L;
				if ((long) this.anInt4594 + this.aLong137 > local79 && (long) this.anInt4594 + this.aLong137 <= (long) local83 + local79) {
					local369 = (long) this.anInt4594 + this.aLong137;
				} else if (this.aLong137 < (long) local83 + local79 && local79 + (long) local83 <= this.aLong137 - -((long) this.anInt4594)) {
					local369 = local79 + (long) local83;
				}
				if (local321 > -1L && local369 > local321) {
					@Pc(453) int local453 = (int) (local369 - local321);
					Static186.method1561(this.aByteArray48, (int) (local321 - this.aLong137), arg0, (int) (local321 - local79), local453);
					if (local369 > this.aLong138) {
						arg1 = (int) ((long) arg1 + this.aLong138 - local369);
						this.aLong138 = local369;
					}
				}
			}
		} catch (@Pc(494) IOException local494) {
			this.aLong135 = -1L;
			throw local494;
		}
		if (arg1 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(I)Ljava/io/File;")
	private File method3015() {
		return this.aClass35_4.method1282();
	}

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "(I)V")
	public void method3016() throws IOException {
		this.method3012();
		this.aClass35_4.method1286();
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(JZ)V")
	public void method3019(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method3015());
		}
		this.aLong138 = arg0;
	}

	@OriginalMember(owner = "client!wh", name = "e", descriptor = "(I)V")
	private void method3020() throws IOException {
		this.anInt4595 = 0;
		if (this.aLong138 != this.aLong135) {
			this.aClass35_4.method1283(this.aLong138);
			this.aLong135 = this.aLong138;
		}
		this.aLong139 = this.aLong138;
		while (this.aByteArray47.length > this.anInt4595) {
			@Pc(52) int local52 = this.aClass35_4.method1284(this.aByteArray47.length - this.anInt4595, this.aByteArray47, this.anInt4595);
			if (local52 == -1) {
				break;
			}
			this.anInt4595 += local52;
			this.aLong135 += local52;
		}
	}

	@OriginalMember(owner = "client!wh", name = "f", descriptor = "(I)J")
	public long method3021() {
		return this.aLong136;
	}
}
