import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gn")
public final class Class66 {

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "I")
	private int anInt1773;

	@OriginalMember(owner = "client!gn", name = "s", descriptor = "J")
	private long aLong63;

	@OriginalMember(owner = "client!gn", name = "e", descriptor = "J")
	private long aLong59 = -1L;

	@OriginalMember(owner = "client!gn", name = "q", descriptor = "J")
	private long aLong61 = -1L;

	@OriginalMember(owner = "client!gn", name = "n", descriptor = "I")
	private int anInt1782 = 0;

	@OriginalMember(owner = "client!gn", name = "u", descriptor = "Lclient!n;")
	private Class115 aClass115_1;

	@OriginalMember(owner = "client!gn", name = "p", descriptor = "J")
	private long aLong60;

	@OriginalMember(owner = "client!gn", name = "r", descriptor = "J")
	private long aLong62;

	@OriginalMember(owner = "client!gn", name = "c", descriptor = "[B")
	private byte[] aByteArray36;

	@OriginalMember(owner = "client!gn", name = "l", descriptor = "[B")
	private byte[] aByteArray37;

	@OriginalMember(owner = "client!gn", name = "t", descriptor = "J")
	private long aLong64;

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Lclient!n;II)V")
	public Class66(@OriginalArg(0) Class115 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass115_1 = arg0;
		this.aLong62 = this.aLong60 = arg0.method2604();
		this.aByteArray36 = new byte[arg2];
		this.aByteArray37 = new byte[arg1];
		this.aLong64 = 0L;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)V")
	private void method1532() throws IOException {
		if (this.aLong61 == -1L) {
			return;
		}
		if (this.aLong63 != this.aLong61) {
			this.aClass115_1.method2606(this.aLong61);
			this.aLong63 = this.aLong61;
		}
		this.aClass115_1.method2609(this.aByteArray36, this.anInt1782, 0);
		@Pc(51) long local51 = -1L;
		@Pc(53) long local53 = -1L;
		if (this.aLong59 < (long) this.anInt1782 + this.aLong61 && this.aLong61 + (long) this.anInt1782 <= this.aLong59 + (long) this.anInt1773) {
			local53 = (long) this.anInt1782 + this.aLong61;
		} else if (this.aLong61 < (long) this.anInt1773 + this.aLong59 && (long) this.anInt1773 + this.aLong59 <= this.aLong61 + (long) this.anInt1782) {
			local53 = (long) this.anInt1773 + this.aLong59;
		}
		if (this.aLong59 <= this.aLong61 && (long) this.anInt1773 + this.aLong59 > this.aLong61) {
			local51 = this.aLong61;
		} else if (this.aLong61 <= this.aLong59 && this.aLong59 < this.aLong61 + (long) this.anInt1782) {
			local51 = this.aLong59;
		}
		this.aLong63 += this.anInt1782;
		if (this.aLong60 < this.aLong63) {
			this.aLong60 = this.aLong63;
		}
		if (local51 > -1L && local51 < local53) {
			@Pc(204) int local204 = (int) (local53 - local51);
			Static300.method484(this.aByteArray36, (int) (local51 - this.aLong61), this.aByteArray37, (int) (local51 - this.aLong59), local204);
		}
		this.anInt1782 = 0;
		this.aLong61 = -1L;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(I[B)V")
	public void method1533(@OriginalArg(1) byte[] arg0) throws IOException {
		this.method1535(arg0, arg0.length, 0);
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(B)Ljava/io/File;")
	private File method1534() {
		return this.aClass115_1.method2605();
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "([BIII)V")
	public void method1535(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg0.length < arg1) {
				throw new ArrayIndexOutOfBoundsException(arg1 - arg0.length);
			}
			if (this.aLong61 != -1L && this.aLong61 <= this.aLong64 && (long) arg1 + this.aLong64 <= this.aLong61 + (long) this.anInt1782) {
				Static300.method484(this.aByteArray36, (int) (this.aLong64 - this.aLong61), arg0, 0, arg1);
				this.aLong64 += arg1;
				return;
			}
			@Pc(78) int local78 = arg1;
			@Pc(81) long local81 = this.aLong64;
			@Pc(116) int local116;
			if (this.aLong64 >= this.aLong59 && this.aLong64 < this.aLong59 + (long) this.anInt1773) {
				local116 = (int) ((long) this.anInt1773 + this.aLong59 - this.aLong64);
				if (arg1 < local116) {
					local116 = arg1;
				}
				Static300.method484(this.aByteArray37, (int) (this.aLong64 - this.aLong59), arg0, 0, local116);
				arg2 = local116;
				this.aLong64 += local116;
				arg1 -= local116;
			}
			if (arg1 > this.aByteArray37.length) {
				this.aClass115_1.method2606(this.aLong64);
				this.aLong63 = this.aLong64;
				while (arg1 > 0) {
					local116 = this.aClass115_1.method2607(arg2, arg0, arg1);
					if (local116 == -1) {
						break;
					}
					arg1 -= local116;
					this.aLong63 += local116;
					this.aLong64 += local116;
					arg2 += local116;
				}
			} else if (arg1 > 0) {
				this.method1536();
				local116 = arg1;
				if (arg1 > this.anInt1773) {
					local116 = this.anInt1773;
				}
				arg1 -= local116;
				Static300.method484(this.aByteArray37, 0, arg0, arg2, local116);
				arg2 += local116;
				this.aLong64 += local116;
			}
			if (this.aLong61 != -1L) {
				if (this.aLong61 > this.aLong64 && arg1 > 0) {
					local116 = arg2 + (int) (this.aLong61 - this.aLong64);
					if (local116 > arg1 + arg2) {
						local116 = arg2 + arg1;
					}
					while (local116 > arg2) {
						arg0[arg2++] = 0;
						this.aLong64++;
						arg1--;
					}
				}
				@Pc(309) long local309 = -1L;
				@Pc(311) long local311 = -1L;
				if (local81 < this.aLong61 + (long) this.anInt1782 && (long) this.anInt1782 + this.aLong61 <= (long) local78 + local81) {
					local311 = this.aLong61 + (long) this.anInt1782;
				} else if (this.aLong61 < (long) local78 + local81 && (long) local78 + local81 <= (long) this.anInt1782 + this.aLong61) {
					local311 = local81 + (long) local78;
				}
				if (this.aLong61 >= local81 && this.aLong61 < local81 + (long) local78) {
					local309 = this.aLong61;
				} else if (this.aLong61 <= local81 && local81 < (long) this.anInt1782 + this.aLong61) {
					local309 = local81;
				}
				if (local309 > -1L && local311 > local309) {
					@Pc(426) int local426 = (int) (local311 - local309);
					Static300.method484(this.aByteArray36, (int) (local309 - this.aLong61), arg0, (int) (local309 - local81), local426);
					if (local311 > this.aLong64) {
						arg1 = (int) ((long) arg1 + this.aLong64 - local311);
						this.aLong64 = local311;
					}
				}
			}
		} catch (@Pc(469) IOException local469) {
			this.aLong63 = -1L;
			throw local469;
		}
		if (arg1 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "(I)V")
	private void method1536() throws IOException {
		this.anInt1773 = 0;
		if (this.aLong64 != this.aLong63) {
			this.aClass115_1.method2606(this.aLong64);
			this.aLong63 = this.aLong64;
		}
		this.aLong59 = this.aLong64;
		while (this.anInt1773 < this.aByteArray37.length) {
			@Pc(52) int local52 = this.aByteArray37.length - this.anInt1773;
			if (local52 > 200000000) {
				local52 = 200000000;
			}
			@Pc(70) int local70 = this.aClass115_1.method2607(this.anInt1773, this.aByteArray37, local52);
			if (local70 == -1) {
				break;
			}
			this.anInt1773 += local70;
			this.aLong63 += local70;
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(JI)V")
	public void method1538(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method1534());
		}
		this.aLong64 = arg0;
	}

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "([BIII)V")
	public void method1539(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (this.aLong62 < (long) arg2 + this.aLong64) {
				this.aLong62 = this.aLong64 + (long) arg2;
			}
			if (this.aLong61 != -1L && (this.aLong61 > this.aLong64 || (long) this.anInt1782 + this.aLong61 < this.aLong64)) {
				this.method1532();
			}
			if (this.aLong61 != (long) -1 && (long) this.aByteArray36.length + this.aLong61 < this.aLong64 - -((long) arg2)) {
				@Pc(88) int local88 = (int) ((long) this.aByteArray36.length + this.aLong61 - this.aLong64);
				Static300.method484(arg0, arg1, this.aByteArray36, (int) (this.aLong64 - this.aLong61), local88);
				arg1 += local88;
				arg2 -= local88;
				this.aLong64 += local88;
				this.anInt1782 = this.aByteArray36.length;
				this.method1532();
			}
			if (this.aByteArray36.length < arg2) {
				@Pc(136) long local136 = -1L;
				if (this.aLong64 != this.aLong63) {
					this.aClass115_1.method2606(this.aLong64);
					this.aLong63 = this.aLong64;
				}
				this.aClass115_1.method2609(arg0, arg2, arg1);
				this.aLong63 += arg2;
				if (this.aLong63 > this.aLong60) {
					this.aLong60 = this.aLong63;
				}
				if (this.aLong64 >= this.aLong59 && this.aLong59 + (long) this.anInt1773 > this.aLong64) {
					local136 = this.aLong64;
				} else if (this.aLong64 <= this.aLong59 && this.aLong64 + (long) arg2 > this.aLong59) {
					local136 = this.aLong59;
				}
				@Pc(222) long local222 = -1L;
				if (this.aLong64 + (long) arg2 > this.aLong59 && this.aLong64 + (long) arg2 <= this.aLong59 - -((long) this.anInt1773)) {
					local222 = (long) arg2 + this.aLong64;
				} else if (this.aLong59 + (long) this.anInt1773 > this.aLong64 && (long) arg2 + this.aLong64 >= this.aLong59 - -((long) this.anInt1773)) {
					local222 = (long) this.anInt1773 + this.aLong59;
				}
				if (local136 > -1L && local222 > local136) {
					@Pc(320) int local320 = (int) (local222 - local136);
					Static300.method484(arg0, (int) (local136 + (long) arg1 - this.aLong64), this.aByteArray37, (int) (local136 - this.aLong59), local320);
				}
				this.aLong64 += arg2;
			} else if (arg2 > 0) {
				if (this.aLong61 == -1L) {
					this.aLong61 = this.aLong64;
				}
				Static300.method484(arg0, arg1, this.aByteArray36, (int) (this.aLong64 - this.aLong61), arg2);
				this.aLong64 += arg2;
				if (this.aLong64 - this.aLong61 > (long) this.anInt1782) {
					this.anInt1782 = (int) (this.aLong64 - this.aLong61);
				}
			}
		} catch (@Pc(410) IOException local410) {
			this.aLong63 = -1L;
			throw local410;
		}
	}

	@OriginalMember(owner = "client!gn", name = "c", descriptor = "(I)J")
	public long method1540() {
		return this.aLong62;
	}
}
