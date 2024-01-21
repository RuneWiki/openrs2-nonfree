import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Class82 {

	@OriginalMember(owner = "client!wb", name = "m", descriptor = "I")
	private int anInt3001;

	@OriginalMember(owner = "client!wb", name = "v", descriptor = "J")
	private long aLong96;

	@OriginalMember(owner = "client!wb", name = "o", descriptor = "J")
	private long aLong95 = -1L;

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "J")
	private long aLong93 = -1L;

	@OriginalMember(owner = "client!wb", name = "p", descriptor = "I")
	private int anInt3003 = 0;

	@OriginalMember(owner = "client!wb", name = "C", descriptor = "Lclient!v;")
	private final Class78 aClass78_4;

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "J")
	private long aLong94;

	@OriginalMember(owner = "client!wb", name = "z", descriptor = "J")
	private long aLong97;

	@OriginalMember(owner = "client!wb", name = "F", descriptor = "[B")
	private final byte[] aByteArray38;

	@OriginalMember(owner = "client!wb", name = "A", descriptor = "J")
	private long aLong98;

	@OriginalMember(owner = "client!wb", name = "k", descriptor = "[B")
	private final byte[] aByteArray37;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lclient!v;II)V")
	public Class82(@OriginalArg(0) Class78 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass78_4 = arg0;
		this.aLong97 = this.aLong94 = arg0.method2043();
		this.aByteArray38 = new byte[arg1];
		this.aLong98 = 0L;
		this.aByteArray37 = new byte[arg2];
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)J")
	public long method2142() {
		return this.aLong97;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(III[B)V")
	public void method2143(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if (this.aLong97 < (long) arg0 + this.aLong98) {
				this.aLong97 = (long) arg0 + this.aLong98;
			}
			if (this.aLong95 != -1L && (this.aLong98 < this.aLong95 || (long) this.anInt3003 + this.aLong95 < this.aLong98)) {
				this.method2148();
			}
			if ((long) -1 != this.aLong95 && (long) this.aByteArray37.length + this.aLong95 < this.aLong98 + (long) arg0) {
				@Pc(82) int local82 = (int) ((long) this.aByteArray37.length + this.aLong95 - this.aLong98);
				Static141.method1907(arg2, arg1, this.aByteArray37, (int) (this.aLong98 - this.aLong95), local82);
				arg0 -= local82;
				arg1 += local82;
				this.aLong98 += local82;
				this.anInt3003 = this.aByteArray37.length;
				this.method2148();
			}
			if (arg0 > this.aByteArray37.length) {
				@Pc(130) long local130 = -1L;
				if (this.aLong98 != this.aLong96) {
					this.aClass78_4.method2045(this.aLong98);
					this.aLong96 = this.aLong98;
				}
				this.aClass78_4.method2042(arg2, arg0, arg1);
				this.aLong96 += arg0;
				if (this.aLong96 > this.aLong94) {
					this.aLong94 = this.aLong96;
				}
				if (this.aLong98 >= this.aLong93 && (long) this.anInt3001 + this.aLong93 > this.aLong98) {
					local130 = this.aLong98;
				} else if (this.aLong98 <= this.aLong93 && this.aLong98 + (long) arg0 > this.aLong93) {
					local130 = this.aLong93;
				}
				@Pc(219) long local219 = -1L;
				if (this.aLong98 + (long) arg0 > this.aLong93 && this.aLong93 + (long) this.anInt3001 >= this.aLong98 - -((long) arg0)) {
					local219 = this.aLong98 + (long) arg0;
				} else if (this.aLong98 < this.aLong93 + (long) this.anInt3001 && (long) arg0 + this.aLong98 >= (long) this.anInt3001 + this.aLong93) {
					local219 = (long) this.anInt3001 + this.aLong93;
				}
				if (local130 > -1L && local130 < local219) {
					@Pc(304) int local304 = (int) (local219 - local130);
					Static141.method1907(arg2, (int) (local130 + (long) arg1 - this.aLong98), this.aByteArray38, (int) (local130 - this.aLong93), local304);
				}
				this.aLong98 += arg0;
			} else if (arg0 > 0) {
				if (this.aLong95 == -1L) {
					this.aLong95 = this.aLong98;
				}
				Static141.method1907(arg2, arg1, this.aByteArray37, (int) (this.aLong98 - this.aLong95), arg0);
				this.aLong98 += arg0;
				if (this.aLong98 - this.aLong95 > (long) this.anInt3003) {
					this.anInt3003 = (int) (this.aLong98 - this.aLong95);
				}
			}
		} catch (@Pc(384) IOException local384) {
			this.aLong96 = -1L;
			throw local384;
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZJ)V")
	public void method2144(@OriginalArg(1) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method2145());
		}
		this.aLong98 = arg0;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Z)Ljava/io/File;")
	private File method2145() {
		return this.aClass78_4.method2046();
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V")
	private void method2146() throws IOException {
		this.anInt3001 = 0;
		if (this.aLong96 != this.aLong98) {
			this.aClass78_4.method2045(this.aLong98);
			this.aLong96 = this.aLong98;
		}
		this.aLong93 = this.aLong98;
		while (this.aByteArray38.length > this.anInt3001) {
			@Pc(54) int local54 = this.aClass78_4.method2044(this.aByteArray38.length - this.anInt3001, this.anInt3001, this.aByteArray38);
			if (local54 == -1) {
				break;
			}
			this.anInt3001 += local54;
			this.aLong96 += local54;
		}
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)V")
	public void method2147() throws IOException {
		this.method2148();
		this.aClass78_4.method2041();
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "(I)V")
	private void method2148() throws IOException {
		if (this.aLong95 == -1L) {
			return;
		}
		if (this.aLong95 != this.aLong96) {
			this.aClass78_4.method2045(this.aLong95);
			this.aLong96 = this.aLong95;
		}
		this.aClass78_4.method2042(this.aByteArray37, this.anInt3003, 0);
		this.aLong96 += this.anInt3003;
		if (this.aLong94 < this.aLong96) {
			this.aLong94 = this.aLong96;
		}
		@Pc(51) long local51 = -1L;
		@Pc(53) long local53 = -1L;
		if (this.aLong95 >= this.aLong93 && this.aLong95 < (long) this.anInt3001 + this.aLong93) {
			local51 = this.aLong95;
		} else if (this.aLong93 >= this.aLong95 && this.aLong93 < this.aLong95 + (long) this.anInt3003) {
			local51 = this.aLong93;
		}
		if (this.aLong95 + (long) this.anInt3003 > this.aLong93 && this.aLong95 + (long) this.anInt3003 <= this.aLong93 + (long) this.anInt3001) {
			local53 = this.aLong95 + (long) this.anInt3003;
		} else if ((long) this.anInt3001 + this.aLong93 > this.aLong95 && this.aLong93 + (long) this.anInt3001 <= (long) this.anInt3003 + this.aLong95) {
			local53 = (long) this.anInt3001 + this.aLong93;
		}
		if (local51 > -1L && local51 < local53) {
			@Pc(185) int local185 = (int) (local53 - local51);
			Static141.method1907(this.aByteArray37, (int) (local51 - this.aLong95), this.aByteArray38, (int) (local51 - this.aLong93), local185);
		}
		this.aLong95 = -1L;
		this.anInt3003 = 0;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(II[BI)V")
	public void method2150(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		try {
			if (arg2.length < arg1) {
				throw new ArrayIndexOutOfBoundsException(arg1 - arg2.length);
			}
			if (this.aLong95 != -1L && this.aLong95 <= this.aLong98 && (long) arg1 + this.aLong98 <= (long) this.anInt3003 + this.aLong95) {
				Static141.method1907(this.aByteArray37, (int) (this.aLong98 - this.aLong95), arg2, 0, arg1);
				this.aLong98 += arg1;
				return;
			}
			@Pc(81) long local81 = this.aLong98;
			@Pc(87) int local87 = arg1;
			@Pc(126) int local126;
			if (this.aLong98 >= this.aLong93 && this.aLong98 < this.aLong93 + (long) this.anInt3001) {
				local126 = (int) (this.aLong93 + (long) this.anInt3001 - this.aLong98);
				if (local126 > arg1) {
					local126 = arg1;
				}
				arg1 -= local126;
				Static141.method1907(this.aByteArray38, (int) (this.aLong98 - this.aLong93), arg2, 0, local126);
				this.aLong98 += local126;
				arg0 = local126;
			}
			if (this.aByteArray38.length < arg1) {
				this.aClass78_4.method2045(this.aLong98);
				this.aLong96 = this.aLong98;
				while (arg1 > 0) {
					local126 = this.aClass78_4.method2044(arg1, arg0, arg2);
					if (local126 == -1) {
						break;
					}
					arg0 += local126;
					arg1 -= local126;
					this.aLong96 += local126;
					this.aLong98 += local126;
				}
			} else if (arg1 > 0) {
				this.method2146();
				local126 = arg1;
				if (arg1 > this.anInt3001) {
					local126 = this.anInt3001;
				}
				arg1 -= local126;
				Static141.method1907(this.aByteArray38, 0, arg2, arg0, local126);
				this.aLong98 += local126;
				arg0 += local126;
			}
			if (this.aLong95 != -1L) {
				if (this.aLong95 > this.aLong98 && arg1 > 0) {
					local126 = arg0 + (int) (this.aLong95 - this.aLong98);
					if (local126 > arg0 + arg1) {
						local126 = arg1 + arg0;
					}
					while (arg0 < local126) {
						arg2[arg0++] = 0;
						this.aLong98++;
						arg1--;
					}
				}
				@Pc(326) long local326 = -1L;
				@Pc(328) long local328 = -1L;
				if (local81 < this.aLong95 + (long) this.anInt3003 && local81 + (long) local87 >= this.aLong95 - -((long) this.anInt3003)) {
					local328 = (long) this.anInt3003 + this.aLong95;
				} else if (this.aLong95 < (long) local87 + local81 && (long) local87 + local81 <= (long) this.anInt3003 + this.aLong95) {
					local328 = local81 + (long) local87;
				}
				if (this.aLong95 >= local81 && (long) local87 + local81 > this.aLong95) {
					local326 = this.aLong95;
				} else if (local81 >= this.aLong95 && local81 < (long) this.anInt3003 + this.aLong95) {
					local326 = local81;
				}
				if (local326 > -1L && local326 < local328) {
					@Pc(450) int local450 = (int) (local328 - local326);
					Static141.method1907(this.aByteArray37, (int) (local326 - this.aLong95), arg2, (int) (local326 - local81), local450);
					if (this.aLong98 < local328) {
						arg1 = (int) ((long) arg1 + this.aLong98 - local328);
						this.aLong98 = local328;
					}
				}
			}
		} catch (@Pc(492) IOException local492) {
			this.aLong96 = -1L;
			throw local492;
		}
		if (arg1 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Z[B)V")
	public void method2152(@OriginalArg(1) byte[] arg0) throws IOException {
		this.method2150(0, arg0.length, arg0);
	}
}
