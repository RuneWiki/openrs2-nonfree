import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class124 {

	@OriginalMember(owner = "client!je", name = "m", descriptor = "I")
	private int anInt3433;

	@OriginalMember(owner = "client!je", name = "q", descriptor = "J")
	private long aLong108;

	@OriginalMember(owner = "client!je", name = "h", descriptor = "J")
	private long aLong106 = -1L;

	@OriginalMember(owner = "client!je", name = "v", descriptor = "I")
	private int anInt3438 = 0;

	@OriginalMember(owner = "client!je", name = "s", descriptor = "J")
	private long aLong109 = -1L;

	@OriginalMember(owner = "client!je", name = "g", descriptor = "Lclient!hi;")
	private final Class110 aClass110_4;

	@OriginalMember(owner = "client!je", name = "d", descriptor = "J")
	private long aLong105;

	@OriginalMember(owner = "client!je", name = "l", descriptor = "J")
	private long aLong107;

	@OriginalMember(owner = "client!je", name = "j", descriptor = "[B")
	private final byte[] aByteArray35;

	@OriginalMember(owner = "client!je", name = "n", descriptor = "[B")
	private final byte[] aByteArray36;

	@OriginalMember(owner = "client!je", name = "b", descriptor = "J")
	private long aLong104;

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Lclient!hi;II)V")
	public Class124(@OriginalArg(0) Class110 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass110_4 = arg0;
		this.aLong107 = this.aLong105 = arg0.method2360();
		this.aByteArray35 = new byte[arg1];
		this.aByteArray36 = new byte[arg2];
		this.aLong104 = 0L;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(I[B)V")
	public void method2943(@OriginalArg(1) byte[] arg0) throws IOException {
		this.method2951(0, arg0.length, arg0);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(III[B)V")
	public void method2945(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if (this.aLong107 < this.aLong104 + (long) arg1) {
				this.aLong107 = this.aLong104 + (long) arg1;
			}
			if ((long) -1 != this.aLong106 && (this.aLong104 < this.aLong106 || this.aLong106 + (long) this.anInt3438 < this.aLong104)) {
				this.method2950();
			}
			if (this.aLong106 != -1L && (long) this.aByteArray36.length + this.aLong106 < (long) arg1 + this.aLong104) {
				@Pc(89) int local89 = (int) (this.aLong106 + (long) this.aByteArray36.length - this.aLong104);
				Static459.method1552(arg2, arg0, this.aByteArray36, (int) (this.aLong104 - this.aLong106), local89);
				arg1 -= local89;
				this.aLong104 += local89;
				arg0 += local89;
				this.anInt3438 = this.aByteArray36.length;
				this.method2950();
			}
			if (this.aByteArray36.length < arg1) {
				if (this.aLong108 != this.aLong104) {
					this.aClass110_4.method2356(this.aLong104);
					this.aLong108 = this.aLong104;
				}
				this.aClass110_4.method2355(arg2, arg1, arg0);
				this.aLong108 += arg1;
				if (this.aLong108 > this.aLong105) {
					this.aLong105 = this.aLong108;
				}
				@Pc(177) long local177 = -1L;
				if (this.aLong109 <= this.aLong104 && (long) this.anInt3433 + this.aLong109 > this.aLong104) {
					local177 = this.aLong104;
				} else if (this.aLong104 <= this.aLong109 && this.aLong104 + (long) arg1 > this.aLong109) {
					local177 = this.aLong109;
				}
				@Pc(234) long local234 = -1L;
				if (this.aLong109 < (long) arg1 + this.aLong104 && (long) arg1 + this.aLong104 <= (long) this.anInt3433 + this.aLong109) {
					local234 = this.aLong104 + (long) arg1;
				} else if ((long) this.anInt3433 + this.aLong109 > this.aLong104 && (long) arg1 + this.aLong104 >= this.aLong109 - -((long) this.anInt3433)) {
					local234 = (long) this.anInt3433 + this.aLong109;
				}
				if (local177 > -1L && local234 > local177) {
					@Pc(326) int local326 = (int) (local234 - local177);
					Static459.method1552(arg2, (int) (local177 + (long) arg0 - this.aLong104), this.aByteArray35, (int) (local177 - this.aLong109), local326);
				}
				this.aLong104 += arg1;
			} else if (arg1 > 0) {
				if (this.aLong106 == -1L) {
					this.aLong106 = this.aLong104;
				}
				Static459.method1552(arg2, arg0, this.aByteArray36, (int) (this.aLong104 - this.aLong106), arg1);
				this.aLong104 += arg1;
				if ((long) this.anInt3438 < this.aLong104 - this.aLong106) {
					this.anInt3438 = (int) (this.aLong104 - this.aLong106);
				}
			}
		} catch (@Pc(408) IOException local408) {
			this.aLong108 = -1L;
			throw local408;
		}
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(I)V")
	private void method2948() throws IOException {
		this.anInt3433 = 0;
		if (this.aLong104 != this.aLong108) {
			this.aClass110_4.method2356(this.aLong104);
			this.aLong108 = this.aLong104;
		}
		this.aLong109 = this.aLong104;
		while (this.anInt3433 < this.aByteArray35.length) {
			@Pc(41) int local41 = this.aByteArray35.length - this.anInt3433;
			if (local41 > 200000000) {
				local41 = 200000000;
			}
			@Pc(58) int local58 = this.aClass110_4.method2359(this.aByteArray35, this.anInt3433, local41);
			if (local58 == -1) {
				break;
			}
			this.aLong108 += local58;
			this.anInt3433 += local58;
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(JI)V")
	public void method2949(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method2953());
		}
		this.aLong104 = arg0;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V")
	private void method2950() throws IOException {
		if (this.aLong106 == -1L) {
			return;
		}
		if (this.aLong108 != this.aLong106) {
			this.aClass110_4.method2356(this.aLong106);
			this.aLong108 = this.aLong106;
		}
		this.aClass110_4.method2355(this.aByteArray36, this.anInt3438, 0);
		this.aLong108 += this.anInt3438;
		if (this.aLong108 > this.aLong105) {
			this.aLong105 = this.aLong108;
		}
		@Pc(61) long local61 = -1L;
		@Pc(63) long local63 = -1L;
		if (this.aLong109 <= this.aLong106 && (long) this.anInt3433 + this.aLong109 > this.aLong106) {
			local61 = this.aLong106;
		} else if (this.aLong109 >= this.aLong106 && this.aLong109 < this.aLong106 + (long) this.anInt3438) {
			local61 = this.aLong109;
		}
		if ((long) this.anInt3438 + this.aLong106 > this.aLong109 && (long) this.anInt3433 + this.aLong109 >= this.aLong106 - -((long) this.anInt3438)) {
			local63 = (long) this.anInt3438 + this.aLong106;
		} else if (this.aLong106 < this.aLong109 + (long) this.anInt3433 && this.aLong106 + (long) this.anInt3438 >= (long) this.anInt3433 + this.aLong109) {
			local63 = this.aLong109 + (long) this.anInt3433;
		}
		if (local61 > -1L && local61 < local63) {
			@Pc(196) int local196 = (int) (local63 - local61);
			Static459.method1552(this.aByteArray36, (int) (local61 - this.aLong106), this.aByteArray35, (int) (local61 - this.aLong109), local196);
		}
		this.aLong106 = -1L;
		this.anInt3438 = 0;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(II[BI)V")
	public void method2951(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		try {
			if (arg1 > arg2.length) {
				throw new ArrayIndexOutOfBoundsException(arg1 - arg2.length);
			}
			if (this.aLong106 != -1L && this.aLong106 <= this.aLong104 && (long) this.anInt3438 + this.aLong106 >= (long) arg1 + this.aLong104) {
				Static459.method1552(this.aByteArray36, (int) (this.aLong104 - this.aLong106), arg2, 0, arg1);
				this.aLong104 += arg1;
				return;
			}
			@Pc(81) long local81 = this.aLong104;
			@Pc(91) int local91 = arg1;
			@Pc(119) int local119;
			if (this.aLong109 <= this.aLong104 && (long) this.anInt3433 + this.aLong109 > this.aLong104) {
				local119 = (int) ((long) this.anInt3433 + this.aLong109 - this.aLong104);
				if (local119 > arg1) {
					local119 = arg1;
				}
				Static459.method1552(this.aByteArray35, (int) (this.aLong104 - this.aLong109), arg2, 0, local119);
				this.aLong104 += local119;
				arg0 = local119;
				arg1 -= local119;
			}
			if (arg1 > this.aByteArray35.length) {
				this.aClass110_4.method2356(this.aLong104);
				this.aLong108 = this.aLong104;
				while (arg1 > 0) {
					local119 = this.aClass110_4.method2359(arg2, arg0, arg1);
					if (local119 == -1) {
						break;
					}
					this.aLong104 += local119;
					arg1 -= local119;
					arg0 += local119;
					this.aLong108 += local119;
				}
			} else if (arg1 > 0) {
				this.method2948();
				local119 = arg1;
				if (arg1 > this.anInt3433) {
					local119 = this.anInt3433;
				}
				Static459.method1552(this.aByteArray35, 0, arg2, arg0, local119);
				arg1 -= local119;
				arg0 += local119;
				this.aLong104 += local119;
			}
			if (this.aLong106 != -1L) {
				if (this.aLong104 < this.aLong106 && arg1 > 0) {
					local119 = (int) (this.aLong106 - this.aLong104) + arg0;
					if (arg1 + arg0 < local119) {
						local119 = arg1 + arg0;
					}
					while (arg0 < local119) {
						arg1--;
						arg2[arg0++] = 0;
						this.aLong104++;
					}
				}
				@Pc(317) long local317 = -1L;
				if (this.aLong106 >= local81 && this.aLong106 < (long) local91 + local81) {
					local317 = this.aLong106;
				} else if (local81 >= this.aLong106 && local81 < this.aLong106 + (long) this.anInt3438) {
					local317 = local81;
				}
				@Pc(354) long local354 = -1L;
				if (this.aLong106 + (long) this.anInt3438 > local81 && (long) local91 + local81 >= this.aLong106 - -((long) this.anInt3438)) {
					local354 = this.aLong106 + (long) this.anInt3438;
				} else if (local81 + (long) local91 > this.aLong106 && (long) this.anInt3438 + this.aLong106 >= local81 - -((long) local91)) {
					local354 = (long) local91 + local81;
				}
				if (local317 > -1L && local354 > local317) {
					@Pc(438) int local438 = (int) (local354 - local317);
					Static459.method1552(this.aByteArray36, (int) (local317 - this.aLong106), arg2, (int) (local317 - local81), local438);
					if (this.aLong104 < local354) {
						arg1 = (int) ((long) arg1 + this.aLong104 - local354);
						this.aLong104 = local354;
					}
				}
			}
		} catch (@Pc(474) IOException local474) {
			this.aLong108 = -1L;
			throw local474;
		}
		if (arg1 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Z)J")
	public long method2952() {
		return this.aLong107;
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(B)Ljava/io/File;")
	private File method2953() {
		return this.aClass110_4.method2358();
	}
}
