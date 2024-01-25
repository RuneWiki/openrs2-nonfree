import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hga")
public final class Class141 {

	@OriginalMember(owner = "client!hga", name = "b", descriptor = "I")
	private int anInt4515;

	@OriginalMember(owner = "client!hga", name = "v", descriptor = "J")
	private long aLong118;

	@OriginalMember(owner = "client!hga", name = "s", descriptor = "J")
	private long aLong117 = -1L;

	@OriginalMember(owner = "client!hga", name = "f", descriptor = "J")
	private long aLong114 = -1L;

	@OriginalMember(owner = "client!hga", name = "t", descriptor = "I")
	private int anInt4525 = 0;

	@OriginalMember(owner = "client!hga", name = "p", descriptor = "Lclient!ji;")
	private final Class182 aClass182_4;

	@OriginalMember(owner = "client!hga", name = "n", descriptor = "J")
	private long aLong116;

	@OriginalMember(owner = "client!hga", name = "j", descriptor = "J")
	private long aLong115;

	@OriginalMember(owner = "client!hga", name = "g", descriptor = "[B")
	private final byte[] aByteArray36;

	@OriginalMember(owner = "client!hga", name = "h", descriptor = "[B")
	private final byte[] aByteArray37;

	@OriginalMember(owner = "client!hga", name = "x", descriptor = "J")
	private long aLong119;

	@OriginalMember(owner = "client!hga", name = "<init>", descriptor = "(Lclient!ji;II)V")
	public Class141(@OriginalArg(0) Class182 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass182_4 = arg0;
		this.aLong115 = this.aLong116 = arg0.method4765();
		this.aByteArray36 = new byte[arg1];
		this.aByteArray37 = new byte[arg2];
		this.aLong119 = 0L;
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(IZ[BI)V")
	public void method4071(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg0 > arg1.length) {
				throw new ArrayIndexOutOfBoundsException(arg0 - arg1.length);
			}
			if (this.aLong114 != -1L && this.aLong119 >= this.aLong114 && this.aLong114 + (long) this.anInt4525 >= this.aLong119 - -((long) arg0)) {
				Static679.method4129(this.aByteArray37, (int) (this.aLong119 - this.aLong114), arg1, 0, arg0);
				this.aLong119 += (long) arg0;
				return;
			}
			@Pc(81) long local81 = this.aLong119;
			@Pc(85) int local85 = arg0;
			@Pc(117) int local117;
			if (this.aLong119 >= this.aLong117 && this.aLong119 < (long) this.anInt4515 + this.aLong117) {
				local117 = (int) (this.aLong117 + (long) this.anInt4515 - this.aLong119);
				if (local117 > arg0) {
					local117 = arg0;
				}
				Static679.method4129(this.aByteArray36, (int) (this.aLong119 - this.aLong117), arg1, 0, local117);
				arg2 = local117;
				this.aLong119 += (long) local117;
				arg0 -= local117;
			}
			if (arg0 > this.aByteArray36.length) {
				this.aClass182_4.method4768(this.aLong119);
				this.aLong118 = this.aLong119;
				while (arg0 > 0) {
					local117 = this.aClass182_4.method4773(arg2, arg0, arg1);
					if (local117 == -1) {
						break;
					}
					this.aLong119 += (long) local117;
					this.aLong118 += (long) local117;
					arg0 -= local117;
					arg2 += local117;
				}
			} else if (arg0 > 0) {
				this.method4082();
				local117 = arg0;
				if (arg0 > this.anInt4515) {
					local117 = this.anInt4515;
				}
				Static679.method4129(this.aByteArray36, 0, arg1, arg2, local117);
				this.aLong119 += (long) local117;
				arg2 += local117;
				arg0 -= local117;
			}
			if (this.aLong114 != -1L) {
				if (this.aLong114 > this.aLong119 && arg0 > 0) {
					local117 = (int) (this.aLong114 - this.aLong119) + arg2;
					if (arg0 + arg2 < local117) {
						local117 = arg2 + arg0;
					}
					while (arg2 < local117) {
						arg1[arg2++] = 0;
						arg0--;
						this.aLong119++;
					}
				}
				@Pc(309) long local309 = -1L;
				@Pc(311) long local311 = -1L;
				if (this.aLong114 >= local81 && (long) local85 + local81 > this.aLong114) {
					local309 = this.aLong114;
				} else if (local81 >= this.aLong114 && local81 < (long) this.anInt4525 + this.aLong114) {
					local309 = local81;
				}
				if ((long) this.anInt4525 + this.aLong114 > local81 && (long) this.anInt4525 + this.aLong114 <= local81 - -((long) local85)) {
					local311 = (long) this.anInt4525 + this.aLong114;
				} else if (local81 + (long) local85 > this.aLong114 && local81 + (long) local85 <= this.aLong114 - -((long) this.anInt4525)) {
					local311 = (long) local85 + local81;
				}
				if (local309 > -1L && local311 > local309) {
					@Pc(438) int local438 = (int) (local311 - local309);
					Static679.method4129(this.aByteArray37, (int) (local309 - this.aLong114), arg1, (int) (local309 - local81), local438);
					if (this.aLong119 < local311) {
						arg0 = (int) ((long) arg0 + this.aLong119 - local311);
						this.aLong119 = local311;
					}
				}
			}
		} catch (@Pc(473) IOException local473) {
			this.aLong118 = -1L;
			throw local473;
		}
		if (arg0 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(B)V")
	private void method4072() throws IOException {
		if (this.aLong114 == -1L) {
			return;
		}
		if (this.aLong114 != this.aLong118) {
			this.aClass182_4.method4768(this.aLong114);
			this.aLong118 = this.aLong114;
		}
		this.aClass182_4.method4767(this.aByteArray37, this.anInt4525, 0);
		this.aLong118 += (long) this.anInt4525;
		if (this.aLong118 > this.aLong116) {
			this.aLong116 = this.aLong118;
		}
		@Pc(65) long local65 = -1L;
		if (this.aLong117 <= this.aLong114 && (long) this.anInt4515 + this.aLong117 > this.aLong114) {
			local65 = this.aLong114;
		} else if (this.aLong114 <= this.aLong117 && this.aLong117 < this.aLong114 + (long) this.anInt4525) {
			local65 = this.aLong117;
		}
		@Pc(112) long local112 = -1L;
		if (this.aLong117 < this.aLong114 + (long) this.anInt4525 && (long) this.anInt4515 + this.aLong117 >= this.aLong114 + (long) this.anInt4525) {
			local112 = (long) this.anInt4525 + this.aLong114;
		} else if (this.aLong114 < this.aLong117 + (long) this.anInt4515 && (long) this.anInt4515 + this.aLong117 <= (long) this.anInt4525 + this.aLong114) {
			local112 = (long) this.anInt4515 + this.aLong117;
		}
		if (local65 > -1L && local112 > local65) {
			@Pc(207) int local207 = (int) (local112 - local65);
			Static679.method4129(this.aByteArray37, (int) (local65 - this.aLong114), this.aByteArray36, (int) (local65 - this.aLong117), local207);
		}
		this.aLong114 = -1L;
		this.anInt4525 = 0;
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(I)Ljava/io/File;")
	private File method4073() {
		return this.aClass182_4.method4771();
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(JB)V")
	public void method4074(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method4073());
		}
		this.aLong119 = arg0;
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(III[B)V")
	public void method4075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if (this.aLong115 < this.aLong119 + (long) arg0) {
				this.aLong115 = (long) arg0 + this.aLong119;
			}
			if (this.aLong114 != -1L && (this.aLong114 > this.aLong119 || this.aLong119 > this.aLong114 + (long) this.anInt4525)) {
				this.method4072();
			}
			if (this.aLong114 != -1L && this.aLong119 + (long) arg0 > (long) this.aByteArray37.length + this.aLong114) {
				@Pc(93) int local93 = (int) ((long) this.aByteArray37.length + this.aLong114 - this.aLong119);
				Static679.method4129(arg2, arg1, this.aByteArray37, (int) (this.aLong119 - this.aLong114), local93);
				arg1 += local93;
				arg0 -= local93;
				this.aLong119 += (long) local93;
				this.anInt4525 = this.aByteArray37.length;
				this.method4072();
			}
			if (this.aByteArray37.length < arg0) {
				if (this.aLong119 != this.aLong118) {
					this.aClass182_4.method4768(this.aLong119);
					this.aLong118 = this.aLong119;
				}
				this.aClass182_4.method4767(arg2, arg0, arg1);
				this.aLong118 += (long) arg0;
				if (this.aLong116 < this.aLong118) {
					this.aLong116 = this.aLong118;
				}
				@Pc(188) long local188 = -1L;
				if (this.aLong117 <= this.aLong119 && (long) this.anInt4515 + this.aLong117 > this.aLong119) {
					local188 = this.aLong119;
				} else if (this.aLong119 <= this.aLong117 && this.aLong117 < (long) arg0 + this.aLong119) {
					local188 = this.aLong117;
				}
				@Pc(241) long local241 = -1L;
				if (this.aLong117 < (long) arg0 + this.aLong119 && (long) this.anInt4515 + this.aLong117 >= (long) arg0 + this.aLong119) {
					local241 = this.aLong119 + (long) arg0;
				} else if (this.aLong119 < (long) this.anInt4515 + this.aLong117 && (long) this.anInt4515 + this.aLong117 <= (long) arg0 + this.aLong119) {
					local241 = this.aLong117 + (long) this.anInt4515;
				}
				if (local188 > -1L && local241 > local188) {
					@Pc(324) int local324 = (int) (local241 - local188);
					Static679.method4129(arg2, (int) ((long) arg1 + local188 - this.aLong119), this.aByteArray36, (int) (local188 - this.aLong117), local324);
				}
				this.aLong119 += (long) arg0;
			} else if (arg0 > 0) {
				if (this.aLong114 == -1L) {
					this.aLong114 = this.aLong119;
				}
				Static679.method4129(arg2, arg1, this.aByteArray37, (int) (this.aLong119 - this.aLong114), arg0);
				this.aLong119 += (long) arg0;
				if ((long) this.anInt4525 < this.aLong119 - this.aLong114) {
					this.anInt4525 = (int) (this.aLong119 - this.aLong114);
				}
			}
		} catch (@Pc(413) IOException local413) {
			this.aLong118 = -1L;
			throw local413;
		}
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(Z)V")
	public void method4076() throws IOException {
		this.method4072();
		this.aClass182_4.method4769();
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(B[B)V")
	public void method4077(@OriginalArg(1) byte[] arg0) throws IOException {
		this.method4071(arg0.length, arg0, 0);
	}

	@OriginalMember(owner = "client!hga", name = "b", descriptor = "(B)J")
	public long method4078() {
		return this.aLong115;
	}

	@OriginalMember(owner = "client!hga", name = "b", descriptor = "(I)V")
	private void method4082() throws IOException {
		this.anInt4515 = 0;
		if (this.aLong119 != this.aLong118) {
			this.aClass182_4.method4768(this.aLong119);
			this.aLong118 = this.aLong119;
		}
		this.aLong117 = this.aLong119;
		while (this.aByteArray36.length > this.anInt4515) {
			@Pc(48) int local48 = this.aByteArray36.length - this.anInt4515;
			if (local48 > 200000000) {
				local48 = 200000000;
			}
			@Pc(65) int local65 = this.aClass182_4.method4773(this.anInt4515, local48, this.aByteArray36);
			if (local65 == -1) {
				break;
			}
			this.aLong118 += (long) local65;
			this.anInt4515 += local65;
		}
	}
}
