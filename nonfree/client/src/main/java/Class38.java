import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!e")
public final class Class38 {

	@OriginalMember(owner = "client!e", name = "f", descriptor = "J")
	private long aLong43;

	@OriginalMember(owner = "client!e", name = "w", descriptor = "I")
	private int anInt1246;

	@OriginalMember(owner = "client!e", name = "i", descriptor = "J")
	private long aLong44 = -1L;

	@OriginalMember(owner = "client!e", name = "p", descriptor = "J")
	private long aLong47 = -1L;

	@OriginalMember(owner = "client!e", name = "C", descriptor = "I")
	private int anInt1251 = 0;

	@OriginalMember(owner = "client!e", name = "g", descriptor = "Lclient!eo;")
	private Class48 aClass48_1;

	@OriginalMember(owner = "client!e", name = "d", descriptor = "J")
	private long aLong42;

	@OriginalMember(owner = "client!e", name = "k", descriptor = "J")
	private long aLong45;

	@OriginalMember(owner = "client!e", name = "E", descriptor = "[B")
	private byte[] aByteArray42;

	@OriginalMember(owner = "client!e", name = "u", descriptor = "[B")
	private byte[] aByteArray41;

	@OriginalMember(owner = "client!e", name = "n", descriptor = "J")
	private long aLong46;

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "(Lclient!eo;II)V")
	public Class38(@OriginalArg(0) Class48 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass48_1 = arg0;
		this.aLong45 = this.aLong42 = arg0.method1176();
		this.aByteArray42 = new byte[arg1];
		this.aByteArray41 = new byte[arg2];
		this.aLong46 = 0L;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(I[BII)V")
	public void method1029(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if (this.aLong45 < this.aLong46 + (long) arg2) {
				this.aLong45 = (long) arg2 + this.aLong46;
			}
			if (this.aLong44 != -1L && (this.aLong44 > this.aLong46 || this.aLong46 > (long) this.anInt1251 + this.aLong44)) {
				this.method1035();
			}
			if (this.aLong44 != -1L && this.aLong44 + (long) this.aByteArray41.length < this.aLong46 + (long) arg2) {
				@Pc(97) int local97 = (int) ((long) this.aByteArray41.length + this.aLong44 - this.aLong46);
				Static317.method1049(arg1, arg0, this.aByteArray41, (int) (this.aLong46 - this.aLong44), local97);
				arg2 -= local97;
				this.aLong46 += local97;
				this.anInt1251 = this.aByteArray41.length;
				this.method1035();
				arg0 += local97;
			}
			if (arg2 > this.aByteArray41.length) {
				@Pc(144) long local144 = -1L;
				if (this.aLong43 != this.aLong46) {
					this.aClass48_1.method1177(this.aLong46);
					this.aLong43 = this.aLong46;
				}
				this.aClass48_1.method1175(arg2, arg1, arg0);
				if (this.aLong46 >= this.aLong47 && (long) this.anInt1246 + this.aLong47 > this.aLong46) {
					local144 = this.aLong46;
				} else if (this.aLong46 <= this.aLong47 && (long) arg2 + this.aLong46 > this.aLong47) {
					local144 = this.aLong47;
				}
				@Pc(222) long local222 = -1L;
				this.aLong43 += arg2;
				if (this.aLong43 > this.aLong42) {
					this.aLong42 = this.aLong43;
				}
				if (this.aLong47 < (long) arg2 + this.aLong46 && (long) arg2 + this.aLong46 <= this.aLong47 - -((long) this.anInt1246)) {
					local222 = this.aLong46 + (long) arg2;
				} else if (this.aLong46 < (long) this.anInt1246 + this.aLong47 && this.aLong47 + (long) this.anInt1246 <= this.aLong46 + (long) arg2) {
					local222 = this.aLong47 + (long) this.anInt1246;
				}
				if (local144 > -1L && local144 < local222) {
					@Pc(336) int local336 = (int) (local222 - local144);
					Static317.method1049(arg1, (int) ((long) arg0 + local144 - this.aLong46), this.aByteArray42, (int) (local144 - this.aLong47), local336);
				}
				this.aLong46 += arg2;
			} else if (arg2 > 0) {
				if (this.aLong44 == -1L) {
					this.aLong44 = this.aLong46;
				}
				Static317.method1049(arg1, arg0, this.aByteArray41, (int) (this.aLong46 - this.aLong44), arg2);
				this.aLong46 += arg2;
				if ((long) this.anInt1251 < this.aLong46 - this.aLong44) {
					this.anInt1251 = (int) (this.aLong46 - this.aLong44);
				}
			}
		} catch (@Pc(421) IOException local421) {
			this.aLong43 = -1L;
			throw local421;
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IJ)V")
	public void method1030(@OriginalArg(1) long arg0) throws IOException {
		if (arg0 < (long) 0) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method1037());
		}
		this.aLong46 = arg0;
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(I)V")
	private void method1035() throws IOException {
		if (this.aLong44 == -1L) {
			return;
		}
		if (this.aLong43 != this.aLong44) {
			this.aClass48_1.method1177(this.aLong44);
			this.aLong43 = this.aLong44;
		}
		@Pc(27) long local27 = -1L;
		this.aClass48_1.method1175(this.anInt1251, this.aByteArray41, 0);
		this.aLong43 += this.anInt1251;
		if (this.aLong44 >= this.aLong47 && this.aLong44 < (long) this.anInt1246 + this.aLong47) {
			local27 = this.aLong44;
		} else if (this.aLong44 <= this.aLong47 && this.aLong44 + (long) this.anInt1251 > this.aLong47) {
			local27 = this.aLong47;
		}
		if (this.aLong43 > this.aLong42) {
			this.aLong42 = this.aLong43;
		}
		@Pc(115) long local115 = -1L;
		if (this.aLong47 < (long) this.anInt1251 + this.aLong44 && (long) this.anInt1246 + this.aLong47 >= (long) this.anInt1251 + this.aLong44) {
			local115 = (long) this.anInt1251 + this.aLong44;
		} else if (this.aLong44 < (long) this.anInt1246 + this.aLong47 && (long) this.anInt1251 + this.aLong44 >= (long) this.anInt1246 + this.aLong47) {
			local115 = this.aLong47 + (long) this.anInt1246;
		}
		if (local27 > -1L && local115 > local27) {
			@Pc(204) int local204 = (int) (local115 - local27);
			Static317.method1049(this.aByteArray41, (int) (local27 - this.aLong44), this.aByteArray42, (int) (local27 - this.aLong47), local204);
		}
		this.aLong44 = -1L;
		this.anInt1251 = 0;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(B)J")
	public long method1036() {
		return this.aLong45;
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(B)Ljava/io/File;")
	private File method1037() {
		return this.aClass48_1.method1172();
	}

	@OriginalMember(owner = "client!e", name = "c", descriptor = "(I)V")
	private void method1038() throws IOException {
		this.anInt1246 = 0;
		if (this.aLong46 != this.aLong43) {
			this.aClass48_1.method1177(this.aLong46);
			this.aLong43 = this.aLong46;
		}
		this.aLong47 = this.aLong46;
		while (this.anInt1246 < this.aByteArray42.length) {
			@Pc(55) int local55 = this.aByteArray42.length - this.anInt1246;
			if (local55 > 200000000) {
				local55 = 200000000;
			}
			@Pc(70) int local70 = this.aClass48_1.method1173(this.aByteArray42, local55, this.anInt1246);
			if (local70 == -1) {
				break;
			}
			this.anInt1246 += local70;
			this.aLong43 += local70;
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "([BIBI)V")
	public void method1040(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg1 > arg0.length) {
				throw new ArrayIndexOutOfBoundsException(arg1 - arg0.length);
			}
			if (this.aLong44 != -1L && this.aLong46 >= this.aLong44 && (long) this.anInt1251 + this.aLong44 >= (long) arg1 + this.aLong46) {
				Static317.method1049(this.aByteArray41, (int) (this.aLong46 - this.aLong44), arg0, 0, arg1);
				this.aLong46 += arg1;
				return;
			}
			@Pc(82) long local82 = this.aLong46;
			@Pc(86) int local86 = arg1;
			@Pc(119) int local119;
			if (this.aLong46 >= this.aLong47 && this.aLong47 + (long) this.anInt1246 > this.aLong46) {
				local119 = (int) (this.aLong47 + (long) this.anInt1246 - this.aLong46);
				if (local119 > arg1) {
					local119 = arg1;
				}
				arg1 -= local119;
				Static317.method1049(this.aByteArray42, (int) (this.aLong46 - this.aLong47), arg0, 0, local119);
				this.aLong46 += local119;
				arg2 = local119;
			}
			if (arg1 > this.aByteArray42.length) {
				this.aClass48_1.method1177(this.aLong46);
				this.aLong43 = this.aLong46;
				while (arg1 > 0) {
					local119 = this.aClass48_1.method1173(arg0, arg1, arg2);
					if (local119 == -1) {
						break;
					}
					this.aLong43 += local119;
					arg1 -= local119;
					arg2 += local119;
					this.aLong46 += local119;
				}
			} else if (arg1 > 0) {
				this.method1038();
				local119 = arg1;
				if (arg1 > this.anInt1246) {
					local119 = this.anInt1246;
				}
				arg1 -= local119;
				Static317.method1049(this.aByteArray42, 0, arg0, arg2, local119);
				arg2 += local119;
				this.aLong46 += local119;
			}
			if (this.aLong44 != -1L) {
				if (this.aLong46 < this.aLong44 && arg1 > 0) {
					local119 = (int) (this.aLong44 - this.aLong46) + arg2;
					if (local119 > arg1 + arg2) {
						local119 = arg2 + arg1;
					}
					while (arg2 < local119) {
						arg0[arg2++] = 0;
						this.aLong46++;
						arg1--;
					}
				}
				@Pc(312) long local312 = -1L;
				@Pc(314) long local314 = -1L;
				if (local82 < this.aLong44 + (long) this.anInt1251 && (long) local86 + local82 >= (long) this.anInt1251 + this.aLong44) {
					local314 = this.aLong44 + (long) this.anInt1251;
				} else if ((long) local86 + local82 > this.aLong44 && local82 + (long) local86 <= this.aLong44 + (long) this.anInt1251) {
					local314 = (long) local86 + local82;
				}
				if (this.aLong44 >= local82 && local82 + (long) local86 > this.aLong44) {
					local312 = this.aLong44;
				} else if (local82 >= this.aLong44 && this.aLong44 + (long) this.anInt1251 > local82) {
					local312 = local82;
				}
				if (local312 > -1L && local314 > local312) {
					@Pc(436) int local436 = (int) (local314 - local312);
					Static317.method1049(this.aByteArray41, (int) (local312 - this.aLong44), arg0, (int) (local312 - local82), local436);
					if (this.aLong46 < local314) {
						arg1 = (int) ((long) arg1 + this.aLong46 - local314);
						this.aLong46 = local314;
					}
				}
			}
		} catch (@Pc(480) IOException local480) {
			this.aLong43 = -1L;
			throw local480;
		}
		if (arg1 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "([BI)V")
	public void method1041(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method1040(arg0, arg0.length, 0);
	}
}
