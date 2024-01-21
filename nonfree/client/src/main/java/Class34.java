import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class34 {

	@OriginalMember(owner = "client!gb", name = "o", descriptor = "I")
	private int anInt1333;

	@OriginalMember(owner = "client!gb", name = "J", descriptor = "J")
	private long aLong74;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "J")
	private long aLong69 = -1L;

	@OriginalMember(owner = "client!gb", name = "e", descriptor = "J")
	private long aLong70 = -1L;

	@OriginalMember(owner = "client!gb", name = "q", descriptor = "I")
	private int anInt1335 = 0;

	@OriginalMember(owner = "client!gb", name = "F", descriptor = "Lclient!md;")
	private final Class67 aClass67_4;

	@OriginalMember(owner = "client!gb", name = "H", descriptor = "J")
	private long aLong73;

	@OriginalMember(owner = "client!gb", name = "t", descriptor = "J")
	private long aLong71;

	@OriginalMember(owner = "client!gb", name = "D", descriptor = "J")
	private long aLong72;

	@OriginalMember(owner = "client!gb", name = "k", descriptor = "[B")
	private final byte[] aByteArray16;

	@OriginalMember(owner = "client!gb", name = "u", descriptor = "[B")
	private final byte[] aByteArray17;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lclient!md;II)V")
	public Class34(@OriginalArg(0) Class67 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass67_4 = arg0;
		this.aLong71 = this.aLong73 = arg0.method1873();
		this.aLong72 = 0L;
		this.aByteArray16 = new byte[arg2];
		this.aByteArray17 = new byte[arg1];
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V")
	private void method1003() throws IOException {
		if (this.aLong70 == -1L) {
			return;
		}
		if (this.aLong74 != this.aLong70) {
			this.aClass67_4.method1876(this.aLong70);
			this.aLong74 = this.aLong70;
		}
		@Pc(30) long local30 = -1L;
		this.aClass67_4.method1875(this.aByteArray16, 0, this.anInt1335);
		@Pc(41) long local41 = -1L;
		this.aLong74 += this.anInt1335;
		if (this.aLong73 < this.aLong74) {
			this.aLong73 = this.aLong74;
		}
		if (this.aLong69 <= this.aLong70 && this.aLong70 < this.aLong69 + (long) this.anInt1333) {
			local41 = this.aLong70;
		} else if (this.aLong70 <= this.aLong69 && this.aLong70 + (long) this.anInt1335 > this.aLong69) {
			local41 = this.aLong69;
		}
		if (this.aLong69 < this.aLong70 + (long) this.anInt1335 && (long) this.anInt1335 + this.aLong70 <= (long) this.anInt1333 + this.aLong69) {
			local30 = (long) this.anInt1335 + this.aLong70;
		} else if (this.aLong70 < (long) this.anInt1333 + this.aLong69 && (long) this.anInt1333 + this.aLong69 <= (long) this.anInt1335 + this.aLong70) {
			local30 = this.aLong69 + (long) this.anInt1333;
		}
		if (local41 > -1L && local30 > local41) {
			@Pc(208) int local208 = (int) (local30 - local41);
			Static220.method51(this.aByteArray16, (int) (local41 - this.aLong70), this.aByteArray17, (int) (local41 - this.aLong69), local208);
		}
		this.anInt1335 = 0;
		this.aLong70 = -1L;
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)V")
	private void method1004() throws IOException {
		this.anInt1333 = 0;
		if (this.aLong72 != this.aLong74) {
			this.aClass67_4.method1876(this.aLong72);
			this.aLong74 = this.aLong72;
		}
		this.aLong69 = this.aLong72;
		while (this.anInt1333 < this.aByteArray17.length) {
			@Pc(42) int local42 = this.aByteArray17.length - this.anInt1333;
			if (local42 > 200000000) {
				local42 = 200000000;
			}
			@Pc(59) int local59 = this.aClass67_4.method1872(this.aByteArray17, local42, this.anInt1333);
			if (local59 == -1) {
				break;
			}
			this.aLong74 += local59;
			this.anInt1333 += local59;
		}
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(Z)J")
	public long method1008() {
		return this.aLong71;
	}

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "(I)Ljava/io/File;")
	private File method1009() {
		return this.aClass67_4.method1874();
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(JI)V")
	public void method1010(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method1009());
		}
		this.aLong72 = arg0;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "([BI)V")
	public void method1012(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method1015(arg0.length, arg0, 0);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(I[BII)V")
	public void method1015(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg0 > arg1.length) {
				throw new ArrayIndexOutOfBoundsException(arg0 - arg1.length);
			}
			if (this.aLong70 != -1L && this.aLong70 <= this.aLong72 && this.aLong70 + (long) this.anInt1335 >= (long) arg0 + this.aLong72) {
				Static220.method51(this.aByteArray16, (int) (this.aLong72 - this.aLong70), arg1, 0, arg0);
				this.aLong72 += arg0;
				return;
			}
			@Pc(89) int local89 = arg0;
			@Pc(92) long local92 = this.aLong72;
			@Pc(122) int local122;
			if (this.aLong72 >= this.aLong69 && (long) this.anInt1333 + this.aLong69 > this.aLong72) {
				local122 = (int) ((long) this.anInt1333 + this.aLong69 - this.aLong72);
				if (arg0 < local122) {
					local122 = arg0;
				}
				arg0 -= local122;
				Static220.method51(this.aByteArray17, (int) (this.aLong72 - this.aLong69), arg1, 0, local122);
				arg2 = local122;
				this.aLong72 += local122;
			}
			if (arg0 > this.aByteArray17.length) {
				this.aClass67_4.method1876(this.aLong72);
				this.aLong74 = this.aLong72;
				while (arg0 > 0) {
					local122 = this.aClass67_4.method1872(arg1, arg0, arg2);
					if (local122 == -1) {
						break;
					}
					this.aLong72 += local122;
					arg0 -= local122;
					arg2 += local122;
					this.aLong74 += local122;
				}
			} else if (arg0 > 0) {
				local122 = arg0;
				this.method1004();
				if (arg0 > this.anInt1333) {
					local122 = this.anInt1333;
				}
				Static220.method51(this.aByteArray17, 0, arg1, arg2, local122);
				this.aLong72 += local122;
				arg0 -= local122;
				arg2 += local122;
			}
			if (this.aLong70 != -1L) {
				if (this.aLong70 > this.aLong72 && arg0 > 0) {
					local122 = (int) (this.aLong70 - this.aLong72) + arg2;
					if (local122 > arg0 + arg2) {
						local122 = arg0 + arg2;
					}
					while (arg2 < local122) {
						arg0--;
						arg1[arg2++] = 0;
						this.aLong72++;
					}
				}
				@Pc(321) long local321 = -1L;
				if (local92 < this.aLong70 + (long) this.anInt1335 && this.aLong70 + (long) this.anInt1335 <= local92 - -((long) local89)) {
					local321 = (long) this.anInt1335 + this.aLong70;
				} else if (this.aLong70 < local92 + (long) local89 && local92 + (long) local89 <= (long) this.anInt1335 + this.aLong70) {
					local321 = (long) local89 + local92;
				}
				@Pc(392) long local392 = -1L;
				if (local92 <= this.aLong70 && local92 + (long) local89 > this.aLong70) {
					local392 = this.aLong70;
				} else if (this.aLong70 <= local92 && (long) this.anInt1335 + this.aLong70 > local92) {
					local392 = local92;
				}
				if (local392 > -1L && local321 > local392) {
					@Pc(448) int local448 = (int) (local321 - local392);
					Static220.method51(this.aByteArray16, (int) (local392 - this.aLong70), arg1, (int) (local392 - local92), local448);
					if (this.aLong72 < local321) {
						arg0 = (int) ((long) arg0 + this.aLong72 - local321);
						this.aLong72 = local321;
					}
				}
			}
		} catch (@Pc(486) IOException local486) {
			this.aLong74 = -1L;
			throw local486;
		}
		if (arg0 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "(B)V")
	public void method1016() throws IOException {
		this.method1003();
		this.aClass67_4.method1871();
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(I[BII)V")
	public void method1017(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if ((long) arg2 + this.aLong72 > this.aLong71) {
				this.aLong71 = this.aLong72 + (long) arg2;
			}
			if (this.aLong70 != -1L && (this.aLong70 > this.aLong72 || this.aLong70 + (long) this.anInt1335 < this.aLong72)) {
				this.method1003();
			}
			if (this.aLong70 != -1L && this.aLong72 + (long) arg2 > (long) this.aByteArray16.length + this.aLong70) {
				@Pc(87) int local87 = (int) ((long) this.aByteArray16.length + this.aLong70 - this.aLong72);
				Static220.method51(arg1, arg0, this.aByteArray16, (int) (this.aLong72 - this.aLong70), local87);
				arg2 -= local87;
				this.aLong72 += local87;
				arg0 += local87;
				this.anInt1335 = this.aByteArray16.length;
				this.method1003();
			}
			if (this.aByteArray16.length < arg2) {
				if (this.aLong72 != this.aLong74) {
					this.aClass67_4.method1876(this.aLong72);
					this.aLong74 = this.aLong72;
				}
				this.aClass67_4.method1875(arg1, arg0, arg2);
				@Pc(159) long local159 = -1L;
				if (this.aLong72 >= this.aLong69 && this.aLong72 < this.aLong69 + (long) this.anInt1333) {
					local159 = this.aLong72;
				} else if (this.aLong69 >= this.aLong72 && (long) arg2 + this.aLong72 > this.aLong69) {
					local159 = this.aLong69;
				}
				this.aLong74 += arg2;
				if (this.aLong73 < this.aLong74) {
					this.aLong73 = this.aLong74;
				}
				@Pc(230) long local230 = -1L;
				if ((long) arg2 + this.aLong72 > this.aLong69 && (long) this.anInt1333 + this.aLong69 >= (long) arg2 + this.aLong72) {
					local230 = (long) arg2 + this.aLong72;
				} else if (this.aLong69 + (long) this.anInt1333 > this.aLong72 && (long) this.anInt1333 + this.aLong69 <= (long) arg2 + this.aLong72) {
					local230 = this.aLong69 + (long) this.anInt1333;
				}
				if (local159 > -1L && local159 < local230) {
					@Pc(314) int local314 = (int) (local230 - local159);
					Static220.method51(arg1, (int) (local159 + (long) arg0 - this.aLong72), this.aByteArray17, (int) (local159 - this.aLong69), local314);
				}
				this.aLong72 += arg2;
			} else if (arg2 > 0) {
				if (this.aLong70 == -1L) {
					this.aLong70 = this.aLong72;
				}
				Static220.method51(arg1, arg0, this.aByteArray16, (int) (this.aLong72 - this.aLong70), arg2);
				this.aLong72 += arg2;
				if (this.aLong72 - this.aLong70 > (long) this.anInt1335) {
					this.anInt1335 = (int) (this.aLong72 - this.aLong70);
				}
			}
		} catch (@Pc(398) IOException local398) {
			this.aLong74 = -1L;
			throw local398;
		}
	}
}
