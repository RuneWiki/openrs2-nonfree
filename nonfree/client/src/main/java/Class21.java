import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class21 {

	@OriginalMember(owner = "client!ea", name = "o", descriptor = "J")
	private long aLong35;

	@OriginalMember(owner = "client!ea", name = "A", descriptor = "I")
	private int anInt998;

	@OriginalMember(owner = "client!ea", name = "m", descriptor = "J")
	private long aLong34 = -1L;

	@OriginalMember(owner = "client!ea", name = "h", descriptor = "J")
	private long aLong31 = -1L;

	@OriginalMember(owner = "client!ea", name = "C", descriptor = "I")
	private int anInt1000 = 0;

	@OriginalMember(owner = "client!ea", name = "q", descriptor = "Lclient!kc;")
	private final Class46 aClass46_1;

	@OriginalMember(owner = "client!ea", name = "i", descriptor = "J")
	private long aLong32;

	@OriginalMember(owner = "client!ea", name = "p", descriptor = "J")
	private long aLong36;

	@OriginalMember(owner = "client!ea", name = "u", descriptor = "[B")
	private final byte[] aByteArray8;

	@OriginalMember(owner = "client!ea", name = "j", descriptor = "J")
	private long aLong33;

	@OriginalMember(owner = "client!ea", name = "F", descriptor = "[B")
	private final byte[] aByteArray9;

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lclient!kc;II)V")
	public Class21(@OriginalArg(0) Class46 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass46_1 = arg0;
		this.aLong36 = this.aLong32 = arg0.method1496();
		this.aByteArray8 = new byte[arg2];
		this.aLong33 = 0L;
		this.aByteArray9 = new byte[arg1];
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(I[BBI)V")
	public void method590(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (this.aLong36 < this.aLong33 + (long) arg0) {
				this.aLong36 = (long) arg0 + this.aLong33;
			}
			if (this.aLong31 != -1L && (this.aLong31 > this.aLong33 || this.aLong33 > this.aLong31 + (long) this.anInt1000)) {
				this.method599();
			}
			if (this.aLong31 != -1L && this.aLong31 + (long) this.aByteArray8.length < this.aLong33 - -((long) arg0)) {
				@Pc(93) int local93 = (int) ((long) this.aByteArray8.length + this.aLong31 - this.aLong33);
				Static184.method628(arg1, arg2, this.aByteArray8, (int) (this.aLong33 - this.aLong31), local93);
				arg2 += local93;
				this.aLong33 += local93;
				arg0 -= local93;
				this.anInt1000 = this.aByteArray8.length;
				this.method599();
			}
			if (arg0 > this.aByteArray8.length) {
				@Pc(142) long local142 = -1L;
				if (this.aLong33 != this.aLong35) {
					this.aClass46_1.method1499(this.aLong33);
					this.aLong35 = this.aLong33;
				}
				this.aClass46_1.method1498(arg0, arg1, arg2);
				this.aLong35 += arg0;
				if (this.aLong33 >= this.aLong34 && this.aLong33 < this.aLong34 + (long) this.anInt998) {
					local142 = this.aLong33;
				} else if (this.aLong33 <= this.aLong34 && this.aLong33 + (long) arg0 > this.aLong34) {
					local142 = this.aLong34;
				}
				@Pc(218) long local218 = -1L;
				if (this.aLong35 > this.aLong32) {
					this.aLong32 = this.aLong35;
				}
				if ((long) arg0 + this.aLong33 > this.aLong34 && (long) arg0 + this.aLong33 <= (long) this.anInt998 + this.aLong34) {
					local218 = (long) arg0 + this.aLong33;
				} else if (this.aLong34 + (long) this.anInt998 > this.aLong33 && (long) this.anInt998 + this.aLong34 <= this.aLong33 + (long) arg0) {
					local218 = (long) this.anInt998 + this.aLong34;
				}
				if (local142 > -1L && local218 > local142) {
					@Pc(318) int local318 = (int) (local218 - local142);
					Static184.method628(arg1, (int) ((long) arg2 + local142 - this.aLong33), this.aByteArray9, (int) (local142 - this.aLong34), local318);
				}
				this.aLong33 += arg0;
			} else if (arg0 > 0) {
				if (this.aLong31 == -1L) {
					this.aLong31 = this.aLong33;
				}
				Static184.method628(arg1, arg2, this.aByteArray8, (int) (this.aLong33 - this.aLong31), arg0);
				this.aLong33 += arg0;
				if (this.aLong33 - this.aLong31 > (long) this.anInt1000) {
					this.anInt1000 = (int) (this.aLong33 - this.aLong31);
				}
			}
		} catch (@Pc(409) IOException local409) {
			this.aLong35 = -1L;
			throw local409;
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)J")
	public long method591() {
		return this.aLong36;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V")
	private void method592() throws IOException {
		this.anInt998 = 0;
		if (this.aLong33 != this.aLong35) {
			this.aClass46_1.method1499(this.aLong33);
			this.aLong35 = this.aLong33;
		}
		this.aLong34 = this.aLong33;
		while (this.aByteArray9.length > this.anInt998) {
			@Pc(57) int local57 = this.aClass46_1.method1500(this.aByteArray9, this.aByteArray9.length - this.anInt998, this.anInt998);
			if (local57 == -1) {
				break;
			}
			this.aLong35 += local57;
			this.anInt998 += local57;
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(II[BI)V")
	public void method593(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		try {
			if (arg1 > arg2.length) {
				throw new ArrayIndexOutOfBoundsException(arg1 - arg2.length);
			}
			if (this.aLong31 != -1L && this.aLong31 <= this.aLong33 && this.aLong31 + (long) this.anInt1000 >= (long) arg1 + this.aLong33) {
				Static184.method628(this.aByteArray8, (int) (this.aLong33 - this.aLong31), arg2, 0, arg1);
				this.aLong33 += arg1;
				return;
			}
			@Pc(79) long local79 = this.aLong33;
			@Pc(87) int local87 = arg1;
			@Pc(125) int local125;
			if (this.aLong34 <= this.aLong33 && this.aLong33 < this.aLong34 + (long) this.anInt998) {
				local125 = (int) ((long) this.anInt998 + this.aLong34 - this.aLong33);
				if (arg1 < local125) {
					local125 = arg1;
				}
				Static184.method628(this.aByteArray9, (int) (this.aLong33 - this.aLong34), arg2, 0, local125);
				this.aLong33 += local125;
				arg0 = local125;
				arg1 -= local125;
			}
			if (arg1 > this.aByteArray9.length) {
				this.aClass46_1.method1499(this.aLong33);
				this.aLong35 = this.aLong33;
				while (arg1 > 0) {
					local125 = this.aClass46_1.method1500(arg2, arg1, arg0);
					if (local125 == -1) {
						break;
					}
					arg0 += local125;
					this.aLong35 += local125;
					arg1 -= local125;
					this.aLong33 += local125;
				}
			} else if (arg1 > 0) {
				this.method592();
				local125 = arg1;
				if (this.anInt998 < arg1) {
					local125 = this.anInt998;
				}
				arg1 -= local125;
				Static184.method628(this.aByteArray9, 0, arg2, arg0, local125);
				arg0 += local125;
				this.aLong33 += local125;
			}
			if (this.aLong31 != -1L) {
				if (this.aLong31 > this.aLong33 && arg1 > 0) {
					local125 = (int) (this.aLong31 - this.aLong33) + arg0;
					if (local125 > arg0 + arg1) {
						local125 = arg1 + arg0;
					}
					while (arg0 < local125) {
						arg2[arg0++] = 0;
						this.aLong33++;
						arg1--;
					}
				}
				@Pc(319) long local319 = -1L;
				if (local79 <= this.aLong31 && local79 + (long) local87 > this.aLong31) {
					local319 = this.aLong31;
				} else if (local79 >= this.aLong31 && local79 < (long) this.anInt1000 + this.aLong31) {
					local319 = local79;
				}
				@Pc(363) long local363 = -1L;
				if (local79 < (long) this.anInt1000 + this.aLong31 && this.aLong31 + (long) this.anInt1000 <= local79 + (long) local87) {
					local363 = (long) this.anInt1000 + this.aLong31;
				} else if (local79 + (long) local87 > this.aLong31 && this.aLong31 + (long) this.anInt1000 >= local79 + (long) local87) {
					local363 = local79 + (long) local87;
				}
				if (local319 > -1L && local319 < local363) {
					@Pc(443) int local443 = (int) (local363 - local319);
					Static184.method628(this.aByteArray8, (int) (local319 - this.aLong31), arg2, (int) (local319 - local79), local443);
					if (this.aLong33 < local363) {
						arg1 = (int) ((long) arg1 + this.aLong33 - local363);
						this.aLong33 = local363;
					}
				}
			}
		} catch (@Pc(486) IOException local486) {
			this.aLong35 = -1L;
			throw local486;
		}
		if (arg1 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)V")
	public void method595() throws IOException {
		this.method599();
		this.aClass46_1.method1501();
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(I[B)V")
	public void method597(@OriginalArg(1) byte[] arg0) throws IOException {
		this.method593(0, arg0.length, arg0);
	}

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(B)Ljava/io/File;")
	private File method598() {
		return this.aClass46_1.method1497();
	}

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)V")
	private void method599() throws IOException {
		if (this.aLong31 == -1L) {
			return;
		}
		if (this.aLong35 != this.aLong31) {
			this.aClass46_1.method1499(this.aLong31);
			this.aLong35 = this.aLong31;
		}
		this.aClass46_1.method1498(this.anInt1000, this.aByteArray8, 0);
		this.aLong35 += this.anInt1000;
		@Pc(48) long local48 = -1L;
		if (this.aLong35 > this.aLong32) {
			this.aLong32 = this.aLong35;
		}
		if (this.aLong34 <= this.aLong31 && this.aLong31 < (long) this.anInt998 + this.aLong34) {
			local48 = this.aLong31;
		} else if (this.aLong34 >= this.aLong31 && this.aLong34 < this.aLong31 + (long) this.anInt1000) {
			local48 = this.aLong34;
		}
		@Pc(113) long local113 = -1L;
		if (this.aLong34 < this.aLong31 + (long) this.anInt1000 && (long) this.anInt998 + this.aLong34 >= (long) this.anInt1000 + this.aLong31) {
			local113 = (long) this.anInt1000 + this.aLong31;
		} else if (this.aLong31 < (long) this.anInt998 + this.aLong34 && (long) this.anInt998 + this.aLong34 <= this.aLong31 - -((long) this.anInt1000)) {
			local113 = (long) this.anInt998 + this.aLong34;
		}
		if (local48 > -1L && local113 > local48) {
			@Pc(210) int local210 = (int) (local113 - local48);
			Static184.method628(this.aByteArray8, (int) (local48 - this.aLong31), this.aByteArray9, (int) (local48 - this.aLong34), local210);
		}
		this.anInt1000 = 0;
		this.aLong31 = -1L;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(JB)V")
	public void method600(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method598());
		}
		this.aLong33 = arg0;
	}
}
