import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class74 {

	@OriginalMember(owner = "client!pd", name = "u", descriptor = "I")
	private int anInt2905;

	@OriginalMember(owner = "client!pd", name = "x", descriptor = "J")
	private long aLong102;

	@OriginalMember(owner = "client!pd", name = "r", descriptor = "J")
	private long aLong101 = -1L;

	@OriginalMember(owner = "client!pd", name = "v", descriptor = "I")
	private int anInt2906 = 0;

	@OriginalMember(owner = "client!pd", name = "y", descriptor = "J")
	private long aLong103 = -1L;

	@OriginalMember(owner = "client!pd", name = "D", descriptor = "Lclient!nh;")
	private final Class66 aClass66_4;

	@OriginalMember(owner = "client!pd", name = "A", descriptor = "J")
	private long aLong104;

	@OriginalMember(owner = "client!pd", name = "f", descriptor = "J")
	private long aLong100;

	@OriginalMember(owner = "client!pd", name = "g", descriptor = "[B")
	private final byte[] aByteArray38;

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "J")
	private long aLong99;

	@OriginalMember(owner = "client!pd", name = "h", descriptor = "[B")
	private final byte[] aByteArray39;

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Lclient!nh;II)V")
	public Class74(@OriginalArg(0) Class66 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass66_4 = arg0;
		this.aLong100 = this.aLong104 = arg0.method1838();
		this.aByteArray38 = new byte[arg1];
		this.aLong99 = 0L;
		this.aByteArray39 = new byte[arg2];
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "([BIBI)V")
	public void method2064(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if ((long) arg2 + this.aLong99 > this.aLong100) {
				this.aLong100 = this.aLong99 + (long) arg2;
			}
			if (this.aLong101 != -1L && (this.aLong101 > this.aLong99 || this.aLong99 > (long) this.anInt2906 + this.aLong101)) {
				this.method2078();
			}
			if (this.aLong101 != -1L && (long) this.aByteArray39.length + this.aLong101 < (long) arg2 + this.aLong99) {
				@Pc(92) int local92 = (int) ((long) this.aByteArray39.length + this.aLong101 - this.aLong99);
				arg2 -= local92;
				Static200.method1179(arg0, arg1, this.aByteArray39, (int) (this.aLong99 - this.aLong101), local92);
				arg1 += local92;
				this.aLong99 += local92;
				this.anInt2906 = this.aByteArray39.length;
				this.method2078();
			}
			if (arg2 > this.aByteArray39.length) {
				if (this.aLong99 != this.aLong102) {
					this.aClass66_4.method1840(this.aLong99);
					this.aLong102 = this.aLong99;
				}
				@Pc(150) long local150 = -1L;
				this.aClass66_4.method1842(arg1, arg2, arg0);
				this.aLong102 += arg2;
				if (this.aLong102 > this.aLong104) {
					this.aLong104 = this.aLong102;
				}
				if (this.aLong99 >= this.aLong103 && this.aLong99 < this.aLong103 + (long) this.anInt2905) {
					local150 = this.aLong99;
				} else if (this.aLong103 >= this.aLong99 && (long) arg2 + this.aLong99 > this.aLong103) {
					local150 = this.aLong103;
				}
				@Pc(219) long local219 = -1L;
				if ((long) arg2 + this.aLong99 > this.aLong103 && (long) arg2 + this.aLong99 <= (long) this.anInt2905 + this.aLong103) {
					local219 = this.aLong99 + (long) arg2;
				} else if (this.aLong99 < this.aLong103 + (long) this.anInt2905 && this.aLong99 + (long) arg2 >= (long) this.anInt2905 + this.aLong103) {
					local219 = this.aLong103 + (long) this.anInt2905;
				}
				if (local150 > -1L && local150 < local219) {
					@Pc(305) int local305 = (int) (local219 - local150);
					Static200.method1179(arg0, (int) ((long) arg1 + local150 - this.aLong99), this.aByteArray38, (int) (local150 - this.aLong103), local305);
				}
				this.aLong99 += arg2;
			} else if (arg2 > 0) {
				if (this.aLong101 == -1L) {
					this.aLong101 = this.aLong99;
				}
				Static200.method1179(arg0, arg1, this.aByteArray39, (int) (this.aLong99 - this.aLong101), arg2);
				this.aLong99 += arg2;
				if (this.aLong99 - this.aLong101 > (long) this.anInt2906) {
					this.anInt2906 = (int) (this.aLong99 - this.aLong101);
				}
			}
		} catch (@Pc(391) IOException local391) {
			this.aLong102 = -1L;
			throw local391;
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(JI)V")
	public void method2065(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method2072());
		}
		this.aLong99 = arg0;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(B[B)V")
	public void method2066(@OriginalArg(1) byte[] arg0) throws IOException {
		this.method2073(arg0.length, arg0, 0);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)J")
	public long method2068() {
		return this.aLong100;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V")
	private void method2070() throws IOException {
		this.anInt2905 = 0;
		if (this.aLong102 != this.aLong99) {
			this.aClass66_4.method1840(this.aLong99);
			this.aLong102 = this.aLong99;
		}
		this.aLong103 = this.aLong99;
		while (this.aByteArray38.length > this.anInt2905) {
			@Pc(42) int local42 = this.aByteArray38.length - this.anInt2905;
			if (local42 > 200000000) {
				local42 = 200000000;
			}
			@Pc(59) int local59 = this.aClass66_4.method1843(local42, this.aByteArray38, this.anInt2905);
			if (local59 == -1) {
				break;
			}
			this.anInt2905 += local59;
			this.aLong102 += local59;
		}
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)Ljava/io/File;")
	private File method2072() {
		return this.aClass66_4.method1841();
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(I[BII)V")
	public void method2073(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg0 > arg1.length) {
				throw new ArrayIndexOutOfBoundsException(arg0 - arg1.length);
			}
			if (this.aLong101 != -1L && this.aLong99 >= this.aLong101 && (long) this.anInt2906 + this.aLong101 >= this.aLong99 - -((long) arg0)) {
				Static200.method1179(this.aByteArray39, (int) (this.aLong99 - this.aLong101), arg1, 0, arg0);
				this.aLong99 += arg0;
				return;
			}
			@Pc(74) int local74 = arg0;
			@Pc(79) long local79 = this.aLong99;
			@Pc(107) int local107;
			if (this.aLong99 >= this.aLong103 && this.aLong99 < this.aLong103 + (long) this.anInt2905) {
				local107 = (int) (this.aLong103 + (long) this.anInt2905 - this.aLong99);
				if (local107 > arg0) {
					local107 = arg0;
				}
				Static200.method1179(this.aByteArray38, (int) (this.aLong99 - this.aLong103), arg1, 0, local107);
				arg2 = local107;
				this.aLong99 += local107;
				arg0 -= local107;
			}
			if (arg0 > this.aByteArray38.length) {
				this.aClass66_4.method1840(this.aLong99);
				this.aLong102 = this.aLong99;
				while (arg0 > 0) {
					local107 = this.aClass66_4.method1843(arg0, arg1, arg2);
					if (local107 == -1) {
						break;
					}
					this.aLong102 += local107;
					arg0 -= local107;
					this.aLong99 += local107;
					arg2 += local107;
				}
			} else if (arg0 > 0) {
				this.method2070();
				local107 = arg0;
				if (arg0 > this.anInt2905) {
					local107 = this.anInt2905;
				}
				arg0 -= local107;
				Static200.method1179(this.aByteArray38, 0, arg1, arg2, local107);
				this.aLong99 += local107;
				arg2 += local107;
			}
			if (this.aLong101 != -1L) {
				if (this.aLong99 < this.aLong101 && arg0 > 0) {
					local107 = (int) (this.aLong101 - this.aLong99) + arg2;
					if (local107 > arg2 + arg0) {
						local107 = arg0 + arg2;
					}
					while (arg2 < local107) {
						arg1[arg2++] = 0;
						arg0--;
						this.aLong99++;
					}
				}
				@Pc(298) long local298 = -1L;
				if (local79 < (long) this.anInt2906 + this.aLong101 && this.aLong101 + (long) this.anInt2906 <= local79 + (long) local74) {
					local298 = this.aLong101 + (long) this.anInt2906;
				} else if ((long) local74 + local79 > this.aLong101 && this.aLong101 + (long) this.anInt2906 >= (long) local74 + local79) {
					local298 = (long) local74 + local79;
				}
				@Pc(363) long local363 = -1L;
				if (this.aLong101 >= local79 && this.aLong101 < local79 + (long) local74) {
					local363 = this.aLong101;
				} else if (this.aLong101 <= local79 && local79 < this.aLong101 + (long) this.anInt2906) {
					local363 = local79;
				}
				if (local363 > -1L && local363 < local298) {
					@Pc(425) int local425 = (int) (local298 - local363);
					Static200.method1179(this.aByteArray39, (int) (local363 - this.aLong101), arg1, (int) (local363 - local79), local425);
					if (this.aLong99 < local298) {
						arg0 = (int) ((long) arg0 + this.aLong99 - local298);
						this.aLong99 = local298;
					}
				}
			}
		} catch (@Pc(468) IOException local468) {
			this.aLong102 = -1L;
			throw local468;
		}
		if (arg0 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "(I)V")
	public void method2075() throws IOException {
		this.method2078();
		this.aClass66_4.method1839();
	}

	@OriginalMember(owner = "client!pd", name = "e", descriptor = "(I)V")
	private void method2078() throws IOException {
		if (this.aLong101 == -1L) {
			return;
		}
		if (this.aLong102 != this.aLong101) {
			this.aClass66_4.method1840(this.aLong101);
			this.aLong102 = this.aLong101;
		}
		this.aClass66_4.method1842(0, this.anInt2906, this.aByteArray39);
		this.aLong102 += this.anInt2906;
		@Pc(47) long local47 = -1L;
		if (this.aLong104 < this.aLong102) {
			this.aLong104 = this.aLong102;
		}
		@Pc(63) long local63 = -1L;
		if (this.aLong103 <= this.aLong101 && this.aLong101 < (long) this.anInt2905 + this.aLong103) {
			local63 = this.aLong101;
		} else if (this.aLong101 <= this.aLong103 && this.aLong103 < this.aLong101 + (long) this.anInt2906) {
			local63 = this.aLong103;
		}
		if (this.aLong103 < (long) this.anInt2906 + this.aLong101 && this.aLong103 + (long) this.anInt2905 >= this.aLong101 - -((long) this.anInt2906)) {
			local47 = this.aLong101 + (long) this.anInt2906;
		} else if (this.aLong103 + (long) this.anInt2905 > this.aLong101 && this.aLong101 + (long) this.anInt2906 >= (long) this.anInt2905 + this.aLong103) {
			local47 = this.aLong103 + (long) this.anInt2905;
		}
		if (local63 > -1L && local63 < local47) {
			@Pc(196) int local196 = (int) (local47 - local63);
			Static200.method1179(this.aByteArray39, (int) (local63 - this.aLong101), this.aByteArray38, (int) (local63 - this.aLong103), local196);
		}
		this.anInt2906 = 0;
		this.aLong101 = -1L;
	}
}
