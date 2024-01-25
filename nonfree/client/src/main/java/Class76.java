import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public final class Class76 {

	@OriginalMember(owner = "client!ee", name = "r", descriptor = "J")
	private long aLong63;

	@OriginalMember(owner = "client!ee", name = "A", descriptor = "I")
	private int anInt3013;

	@OriginalMember(owner = "client!ee", name = "g", descriptor = "J")
	private long aLong61 = -1L;

	@OriginalMember(owner = "client!ee", name = "j", descriptor = "I")
	private int anInt3002 = 0;

	@OriginalMember(owner = "client!ee", name = "y", descriptor = "J")
	private long aLong64 = -1L;

	@OriginalMember(owner = "client!ee", name = "o", descriptor = "Lclient!is;")
	private final Class150 aClass150_1;

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "J")
	private long aLong60;

	@OriginalMember(owner = "client!ee", name = "l", descriptor = "J")
	private long aLong62;

	@OriginalMember(owner = "client!ee", name = "n", descriptor = "[B")
	private final byte[] aByteArray28;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "J")
	private long aLong59;

	@OriginalMember(owner = "client!ee", name = "i", descriptor = "[B")
	private final byte[] aByteArray27;

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Lclient!is;II)V")
	public Class76(@OriginalArg(0) Class150 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass150_1 = arg0;
		this.aLong62 = this.aLong60 = arg0.method4654();
		this.aByteArray28 = new byte[arg2];
		this.aLong59 = 0L;
		this.aByteArray27 = new byte[arg1];
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V")
	private void method2764() throws IOException {
		this.anInt3013 = 0;
		if (this.aLong59 != this.aLong63) {
			this.aClass150_1.method4659(this.aLong59);
			this.aLong63 = this.aLong59;
		}
		this.aLong64 = this.aLong59;
		while (this.anInt3013 < this.aByteArray27.length) {
			@Pc(46) int local46 = this.aByteArray27.length - this.anInt3013;
			if (local46 > 200000000) {
				local46 = 200000000;
			}
			@Pc(61) int local61 = this.aClass150_1.method4658(local46, this.anInt3013, this.aByteArray27);
			if (local61 == -1) {
				break;
			}
			this.anInt3013 += local61;
			this.aLong63 += local61;
		}
	}

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "(I)V")
	public void method2767() throws IOException {
		this.method2775();
		this.aClass150_1.method4653();
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZI[BI)V")
	public void method2768(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg1.length < arg2) {
				throw new ArrayIndexOutOfBoundsException(arg2 - arg1.length);
			}
			if (this.aLong61 != -1L && this.aLong61 <= this.aLong59 && (long) this.anInt3002 + this.aLong61 >= this.aLong59 + (long) arg2) {
				Static655.method6406(this.aByteArray28, (int) (this.aLong59 - this.aLong61), arg1, 0, arg2);
				this.aLong59 += arg2;
				return;
			}
			@Pc(81) long local81 = this.aLong59;
			@Pc(85) int local85 = arg2;
			@Pc(121) int local121;
			if (this.aLong64 <= this.aLong59 && (long) this.anInt3013 + this.aLong64 > this.aLong59) {
				local121 = (int) (this.aLong64 + (long) this.anInt3013 - this.aLong59);
				if (arg2 < local121) {
					local121 = arg2;
				}
				Static655.method6406(this.aByteArray27, (int) (this.aLong59 - this.aLong64), arg1, 0, local121);
				arg0 = local121;
				this.aLong59 += local121;
				arg2 -= local121;
			}
			if (this.aByteArray27.length < arg2) {
				this.aClass150_1.method4659(this.aLong59);
				this.aLong63 = this.aLong59;
				while (arg2 > 0) {
					local121 = this.aClass150_1.method4658(arg2, arg0, arg1);
					if (local121 == -1) {
						break;
					}
					this.aLong59 += local121;
					this.aLong63 += local121;
					arg0 += local121;
					arg2 -= local121;
				}
			} else if (arg2 > 0) {
				this.method2764();
				local121 = arg2;
				if (this.anInt3013 < arg2) {
					local121 = this.anInt3013;
				}
				Static655.method6406(this.aByteArray27, 0, arg1, arg0, local121);
				arg0 += local121;
				arg2 -= local121;
				this.aLong59 += local121;
			}
			if (this.aLong61 != -1L) {
				if (this.aLong59 < this.aLong61 && arg2 > 0) {
					local121 = (int) (this.aLong61 - this.aLong59) + arg0;
					if (local121 > arg0 + arg2) {
						local121 = arg0 + arg2;
					}
					while (local121 > arg0) {
						arg2--;
						arg1[arg0++] = 0;
						this.aLong59++;
					}
				}
				@Pc(311) long local311 = -1L;
				if (local81 <= this.aLong61 && this.aLong61 < (long) local85 + local81) {
					local311 = this.aLong61;
				} else if (this.aLong61 <= local81 && local81 < (long) this.anInt3002 + this.aLong61) {
					local311 = local81;
				}
				@Pc(355) long local355 = -1L;
				if (this.aLong61 + (long) this.anInt3002 > local81 && (long) this.anInt3002 + this.aLong61 <= (long) local85 + local81) {
					local355 = (long) this.anInt3002 + this.aLong61;
				} else if (this.aLong61 < local81 + (long) local85 && local81 + (long) local85 <= this.aLong61 - -((long) this.anInt3002)) {
					local355 = (long) local85 + local81;
				}
				if (local311 > -1L && local355 > local311) {
					@Pc(432) int local432 = (int) (local355 - local311);
					Static655.method6406(this.aByteArray28, (int) (local311 - this.aLong61), arg1, (int) (local311 - local81), local432);
					if (this.aLong59 < local355) {
						arg2 = (int) ((long) arg2 + this.aLong59 - local355);
						this.aLong59 = local355;
					}
				}
			}
		} catch (@Pc(473) IOException local473) {
			this.aLong63 = -1L;
			throw local473;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)J")
	public long method2769() {
		return this.aLong62;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(II[BI)V")
	public void method2770(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (this.aLong59 + (long) arg2 > this.aLong62) {
				this.aLong62 = (long) arg2 + this.aLong59;
			}
			if (this.aLong61 != -1L && (this.aLong61 > this.aLong59 || this.aLong61 + (long) this.anInt3002 < this.aLong59)) {
				this.method2775();
			}
			if (this.aLong61 != -1L && (long) arg2 + this.aLong59 > (long) this.aByteArray28.length + this.aLong61) {
				@Pc(89) int local89 = (int) ((long) this.aByteArray28.length + this.aLong61 - this.aLong59);
				Static655.method6406(arg1, arg0, this.aByteArray28, (int) (this.aLong59 - this.aLong61), local89);
				this.aLong59 += local89;
				arg0 += local89;
				arg2 -= local89;
				this.anInt3002 = this.aByteArray28.length;
				this.method2775();
			}
			if (arg2 > this.aByteArray28.length) {
				if (this.aLong63 != this.aLong59) {
					this.aClass150_1.method4659(this.aLong59);
					this.aLong63 = this.aLong59;
				}
				this.aClass150_1.method4656(arg1, arg0, arg2);
				this.aLong63 += arg2;
				if (this.aLong63 > this.aLong60) {
					this.aLong60 = this.aLong63;
				}
				@Pc(171) long local171 = -1L;
				@Pc(173) long local173 = -1L;
				if (this.aLong64 <= this.aLong59 && this.aLong59 < this.aLong64 + (long) this.anInt3013) {
					local171 = this.aLong59;
				} else if (this.aLong64 >= this.aLong59 && this.aLong64 < this.aLong59 + (long) arg2) {
					local171 = this.aLong64;
				}
				if (this.aLong59 + (long) arg2 > this.aLong64 && this.aLong64 + (long) this.anInt3013 >= this.aLong59 + (long) arg2) {
					local173 = this.aLong59 + (long) arg2;
				} else if (this.aLong59 < (long) this.anInt3013 + this.aLong64 && (long) this.anInt3013 + this.aLong64 <= this.aLong59 + (long) arg2) {
					local173 = this.aLong64 + (long) this.anInt3013;
				}
				if (local171 > -1L && local173 > local171) {
					@Pc(306) int local306 = (int) (local173 - local171);
					Static655.method6406(arg1, (int) (local171 + (long) arg0 - this.aLong59), this.aByteArray27, (int) (local171 - this.aLong64), local306);
				}
				this.aLong59 += arg2;
			} else if (arg2 > 0) {
				if (this.aLong61 == -1L) {
					this.aLong61 = this.aLong59;
				}
				Static655.method6406(arg1, arg0, this.aByteArray28, (int) (this.aLong59 - this.aLong61), arg2);
				this.aLong59 += arg2;
				if (this.aLong59 - this.aLong61 > (long) this.anInt3002) {
					this.anInt3002 = (int) (this.aLong59 - this.aLong61);
				}
			}
		} catch (@Pc(391) IOException local391) {
			this.aLong63 = -1L;
			throw local391;
		}
	}

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "(I)Ljava/io/File;")
	private File method2771() {
		return this.aClass150_1.method4657();
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Z)V")
	private void method2775() throws IOException {
		if (this.aLong61 == -1L) {
			return;
		}
		if (this.aLong63 != this.aLong61) {
			this.aClass150_1.method4659(this.aLong61);
			this.aLong63 = this.aLong61;
		}
		this.aClass150_1.method4656(this.aByteArray28, 0, this.anInt3002);
		this.aLong63 += this.anInt3002;
		if (this.aLong63 > this.aLong60) {
			this.aLong60 = this.aLong63;
		}
		@Pc(57) long local57 = -1L;
		if (this.aLong64 <= this.aLong61 && (long) this.anInt3013 + this.aLong64 > this.aLong61) {
			local57 = this.aLong61;
		} else if (this.aLong64 >= this.aLong61 && this.aLong64 < (long) this.anInt3002 + this.aLong61) {
			local57 = this.aLong64;
		}
		@Pc(107) long local107 = -1L;
		if ((long) this.anInt3002 + this.aLong61 > this.aLong64 && this.aLong64 + (long) this.anInt3013 >= this.aLong61 + (long) this.anInt3002) {
			local107 = this.aLong61 + (long) this.anInt3002;
		} else if (this.aLong64 + (long) this.anInt3013 > this.aLong61 && (long) this.anInt3013 + this.aLong64 <= (long) this.anInt3002 + this.aLong61) {
			local107 = (long) this.anInt3013 + this.aLong64;
		}
		if (local57 > -1L && local107 > local57) {
			@Pc(198) int local198 = (int) (local107 - local57);
			Static655.method6406(this.aByteArray28, (int) (local57 - this.aLong61), this.aByteArray27, (int) (local57 - this.aLong64), local198);
		}
		this.anInt3002 = 0;
		this.aLong61 = -1L;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(JB)V")
	public void method2777(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method2771());
		}
		this.aLong59 = arg0;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "([BI)V")
	public void method2778(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method2768(0, arg0, arg0.length);
	}
}
