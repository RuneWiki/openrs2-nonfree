import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class19 {

	@OriginalMember(owner = "client!dd", name = "j", descriptor = "J")
	private long aLong28;

	@OriginalMember(owner = "client!dd", name = "w", descriptor = "I")
	private int anInt917;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
	private int anInt906 = 0;

	@OriginalMember(owner = "client!dd", name = "q", descriptor = "J")
	private long aLong30 = -1L;

	@OriginalMember(owner = "client!dd", name = "e", descriptor = "J")
	private long aLong27 = -1L;

	@OriginalMember(owner = "client!dd", name = "n", descriptor = "Lclient!kc;")
	private final Class45 aClass45_1;

	@OriginalMember(owner = "client!dd", name = "d", descriptor = "J")
	private long aLong26;

	@OriginalMember(owner = "client!dd", name = "x", descriptor = "J")
	private long aLong31;

	@OriginalMember(owner = "client!dd", name = "o", descriptor = "J")
	private long aLong29;

	@OriginalMember(owner = "client!dd", name = "u", descriptor = "[B")
	private final byte[] aByteArray11;

	@OriginalMember(owner = "client!dd", name = "i", descriptor = "[B")
	private final byte[] aByteArray10;

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Lclient!kc;II)V")
	public Class19(@OriginalArg(0) Class45 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass45_1 = arg0;
		this.aLong31 = this.aLong26 = arg0.method1841();
		this.aLong29 = 0L;
		this.aByteArray11 = new byte[arg1];
		this.aByteArray10 = new byte[arg2];
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(I[BII)V")
	public void method751(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (this.aLong31 < (long) arg2 + this.aLong29) {
				this.aLong31 = (long) arg2 + this.aLong29;
			}
			if ((long) -1 != this.aLong30 && (this.aLong29 < this.aLong30 || this.aLong29 > (long) this.anInt906 + this.aLong30)) {
				this.method753();
			}
			if (this.aLong30 != -1L && this.aLong29 + (long) arg2 > this.aLong30 - -((long) this.aByteArray10.length)) {
				@Pc(87) int local87 = (int) ((long) this.aByteArray10.length + this.aLong30 - this.aLong29);
				arg2 -= local87;
				Static188.method2240(arg0, arg1, this.aByteArray10, (int) (this.aLong29 - this.aLong30), local87);
				this.aLong29 += local87;
				arg1 += local87;
				this.anInt906 = this.aByteArray10.length;
				this.method753();
			}
			if (arg2 > this.aByteArray10.length) {
				if (this.aLong29 != this.aLong28) {
					this.aClass45_1.method1840(this.aLong29);
					this.aLong28 = this.aLong29;
				}
				this.aClass45_1.method1839(arg0, arg2, arg1);
				this.aLong28 += arg2;
				@Pc(163) long local163 = -1L;
				if (this.aLong26 < this.aLong28) {
					this.aLong26 = this.aLong28;
				}
				@Pc(179) long local179 = -1L;
				if ((long) arg2 + this.aLong29 > this.aLong27 && (long) arg2 + this.aLong29 <= (long) this.anInt917 + this.aLong27) {
					local179 = (long) arg2 + this.aLong29;
				} else if (this.aLong29 < (long) this.anInt917 + this.aLong27 && (long) arg2 + this.aLong29 >= (long) this.anInt917 + this.aLong27) {
					local179 = this.aLong27 + (long) this.anInt917;
				}
				if (this.aLong29 >= this.aLong27 && this.aLong29 < (long) this.anInt917 + this.aLong27) {
					local163 = this.aLong29;
				} else if (this.aLong27 >= this.aLong29 && this.aLong29 + (long) arg2 > this.aLong27) {
					local163 = this.aLong27;
				}
				if (local163 > -1L && local179 > local163) {
					@Pc(321) int local321 = (int) (local179 - local163);
					Static188.method2240(arg0, (int) (local163 + (long) arg1 - this.aLong29), this.aByteArray11, (int) (local163 - this.aLong27), local321);
				}
				this.aLong29 += arg2;
			} else if (arg2 > 0) {
				if (this.aLong30 == -1L) {
					this.aLong30 = this.aLong29;
				}
				Static188.method2240(arg0, arg1, this.aByteArray10, (int) (this.aLong29 - this.aLong30), arg2);
				this.aLong29 += arg2;
				if ((long) this.anInt906 < this.aLong29 - this.aLong30) {
					this.anInt906 = (int) (this.aLong29 - this.aLong30);
				}
			}
		} catch (@Pc(406) IOException local406) {
			this.aLong28 = -1L;
			throw local406;
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)Ljava/io/File;")
	private File method752() {
		return this.aClass45_1.method1836();
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(B)V")
	private void method753() throws IOException {
		if (this.aLong30 == -1L) {
			return;
		}
		@Pc(6) long local6 = -1L;
		@Pc(8) long local8 = -1L;
		if (this.aLong28 != this.aLong30) {
			this.aClass45_1.method1840(this.aLong30);
			this.aLong28 = this.aLong30;
		}
		this.aClass45_1.method1839(this.aByteArray10, this.anInt906, 0);
		this.aLong28 += this.anInt906;
		if (this.aLong28 > this.aLong26) {
			this.aLong26 = this.aLong28;
		}
		if (this.aLong27 < this.aLong30 + (long) this.anInt906 && (long) this.anInt917 + this.aLong27 >= (long) this.anInt906 + this.aLong30) {
			local8 = (long) this.anInt906 + this.aLong30;
		} else if (this.aLong30 < (long) this.anInt917 + this.aLong27 && (long) this.anInt906 + this.aLong30 >= this.aLong27 + (long) this.anInt917) {
			local8 = this.aLong27 + (long) this.anInt917;
		}
		if (this.aLong30 >= this.aLong27 && this.aLong30 < this.aLong27 + (long) this.anInt917) {
			local6 = this.aLong30;
		} else if (this.aLong27 >= this.aLong30 && this.aLong30 + (long) this.anInt906 > this.aLong27) {
			local6 = this.aLong27;
		}
		if (local6 > -1L && local8 > local6) {
			@Pc(202) int local202 = (int) (local8 - local6);
			Static188.method2240(this.aByteArray10, (int) (local6 - this.aLong30), this.aByteArray11, (int) (local6 - this.aLong27), local202);
		}
		this.anInt906 = 0;
		this.aLong30 = -1L;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(JI)V")
	public void method754(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method752());
		}
		this.aLong29 = arg0;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)J")
	public long method755() {
		return this.aLong31;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(II[BZ)V")
	public void method756(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		try {
			if (arg2.length < arg0) {
				throw new ArrayIndexOutOfBoundsException(arg0 - arg2.length);
			}
			if (this.aLong30 != -1L && this.aLong30 <= this.aLong29 && (long) arg0 + this.aLong29 <= (long) this.anInt906 + this.aLong30) {
				Static188.method2240(this.aByteArray10, (int) (this.aLong29 - this.aLong30), arg2, 0, arg0);
				this.aLong29 += arg0;
				return;
			}
			@Pc(84) long local84 = this.aLong29;
			@Pc(86) int local86 = arg0;
			@Pc(118) int local118;
			if (this.aLong27 <= this.aLong29 && (long) this.anInt917 + this.aLong27 > this.aLong29) {
				local118 = (int) ((long) this.anInt917 + this.aLong27 - this.aLong29);
				if (arg0 < local118) {
					local118 = arg0;
				}
				arg0 -= local118;
				Static188.method2240(this.aByteArray11, (int) (this.aLong29 - this.aLong27), arg2, 0, local118);
				this.aLong29 += local118;
				arg1 = local118;
			}
			if (arg0 > this.aByteArray11.length) {
				this.aClass45_1.method1840(this.aLong29);
				this.aLong28 = this.aLong29;
				while (arg0 > 0) {
					local118 = this.aClass45_1.method1838(arg0, arg1, arg2);
					if (local118 == -1) {
						break;
					}
					this.aLong28 += local118;
					arg1 += local118;
					arg0 -= local118;
					this.aLong29 += local118;
				}
			} else if (arg0 > 0) {
				this.method759();
				local118 = arg0;
				if (this.anInt917 < arg0) {
					local118 = this.anInt917;
				}
				Static188.method2240(this.aByteArray11, 0, arg2, arg1, local118);
				arg0 -= local118;
				arg1 += local118;
				this.aLong29 += local118;
			}
			if (this.aLong30 != -1L) {
				if (this.aLong30 > this.aLong29 && arg0 > 0) {
					local118 = (int) (this.aLong30 - this.aLong29) + arg1;
					if (arg1 + arg0 < local118) {
						local118 = arg0 + arg1;
					}
					while (arg1 < local118) {
						arg0--;
						arg2[arg1++] = 0;
						this.aLong29++;
					}
				}
				@Pc(305) long local305 = -1L;
				if (local84 < this.aLong30 + (long) this.anInt906 && local84 + (long) local86 >= (long) this.anInt906 + this.aLong30) {
					local305 = this.aLong30 + (long) this.anInt906;
				} else if (local84 + (long) local86 > this.aLong30 && (long) local86 + local84 <= (long) this.anInt906 + this.aLong30) {
					local305 = (long) local86 + local84;
				}
				@Pc(366) long local366 = -1L;
				if (local84 <= this.aLong30 && (long) local86 + local84 > this.aLong30) {
					local366 = this.aLong30;
				} else if (this.aLong30 <= local84 && (long) this.anInt906 + this.aLong30 > local84) {
					local366 = local84;
				}
				if (local366 > -1L && local305 > local366) {
					@Pc(426) int local426 = (int) (local305 - local366);
					Static188.method2240(this.aByteArray10, (int) (local366 - this.aLong30), arg2, (int) (local366 - local84), local426);
					if (local305 > this.aLong29) {
						arg0 = (int) ((long) arg0 + this.aLong29 - local305);
						this.aLong29 = local305;
					}
				}
			}
		} catch (@Pc(463) IOException local463) {
			this.aLong28 = -1L;
			throw local463;
		}
		if (arg0 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "(B)V")
	public void method757() throws IOException {
		this.method753();
		this.aClass45_1.method1837();
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "([BB)V")
	public void method758(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method756(arg0.length, 0, arg0);
	}

	@OriginalMember(owner = "client!dd", name = "d", descriptor = "(B)V")
	private void method759() throws IOException {
		this.anInt917 = 0;
		if (this.aLong29 != this.aLong28) {
			this.aClass45_1.method1840(this.aLong29);
			this.aLong28 = this.aLong29;
		}
		this.aLong27 = this.aLong29;
		while (this.anInt917 < this.aByteArray11.length) {
			@Pc(51) int local51 = this.aClass45_1.method1838(this.aByteArray11.length - this.anInt917, this.anInt917, this.aByteArray11);
			if (local51 == -1) {
				break;
			}
			this.aLong28 += local51;
			this.anInt917 += local51;
		}
	}
}
