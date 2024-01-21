import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class72 {

	@OriginalMember(owner = "client!ua", name = "j", descriptor = "J")
	private long aLong116;

	@OriginalMember(owner = "client!ua", name = "E", descriptor = "I")
	private int anInt2736;

	@OriginalMember(owner = "client!ua", name = "x", descriptor = "I")
	private int anInt2732 = 0;

	@OriginalMember(owner = "client!ua", name = "u", descriptor = "J")
	private long aLong118 = -1L;

	@OriginalMember(owner = "client!ua", name = "z", descriptor = "J")
	private long aLong119 = -1L;

	@OriginalMember(owner = "client!ua", name = "l", descriptor = "Lclient!pe;")
	private final Class55 aClass55_4;

	@OriginalMember(owner = "client!ua", name = "A", descriptor = "J")
	private long aLong120;

	@OriginalMember(owner = "client!ua", name = "o", descriptor = "J")
	private long aLong117;

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "J")
	private long aLong115;

	@OriginalMember(owner = "client!ua", name = "t", descriptor = "[B")
	private final byte[] aByteArray38;

	@OriginalMember(owner = "client!ua", name = "h", descriptor = "[B")
	private final byte[] aByteArray37;

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Lclient!pe;II)V")
	public Class72(@OriginalArg(0) Class55 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass55_4 = arg0;
		this.aLong117 = this.aLong120 = arg0.method1614();
		this.aLong115 = 0L;
		this.aByteArray38 = new byte[arg1];
		this.aByteArray37 = new byte[arg2];
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)V")
	public void method1934() throws IOException {
		this.method1936();
		this.aClass55_4.method1615();
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(III[B)V")
	public void method1935(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if (this.aLong117 < this.aLong115 + (long) arg1) {
				this.aLong117 = this.aLong115 + (long) arg1;
			}
			if (this.aLong118 != -1L && (this.aLong115 < this.aLong118 || this.aLong115 > this.aLong118 + (long) this.anInt2732)) {
				this.method1936();
			}
			if (this.aLong118 != -1L && (long) this.aByteArray37.length + this.aLong118 < (long) arg1 + this.aLong115) {
				@Pc(97) int local97 = (int) ((long) this.aByteArray37.length + this.aLong118 - this.aLong115);
				arg1 -= local97;
				Static139.method1493(arg2, arg0, this.aByteArray37, (int) (this.aLong115 - this.aLong118), local97);
				this.aLong115 += local97;
				arg0 += local97;
				this.anInt2732 = this.aByteArray37.length;
				this.method1936();
			}
			if (arg1 > this.aByteArray37.length) {
				if (this.aLong115 != this.aLong116) {
					this.aClass55_4.method1617(this.aLong115);
					this.aLong116 = this.aLong115;
				}
				this.aClass55_4.method1618(arg2, arg1, arg0);
				this.aLong116 += arg1;
				if (this.aLong116 > this.aLong120) {
					this.aLong120 = this.aLong116;
				}
				@Pc(183) long local183 = -1L;
				if (this.aLong119 <= this.aLong115 && this.aLong115 < this.aLong119 + (long) this.anInt2736) {
					local183 = this.aLong115;
				} else if (this.aLong115 <= this.aLong119 && (long) arg1 + this.aLong115 > this.aLong119) {
					local183 = this.aLong119;
				}
				@Pc(224) long local224 = -1L;
				if (this.aLong115 + (long) arg1 > this.aLong119 && (long) this.anInt2736 + this.aLong119 >= this.aLong115 - -((long) arg1)) {
					local224 = (long) arg1 + this.aLong115;
				} else if (this.aLong119 + (long) this.anInt2736 > this.aLong115 && this.aLong115 + (long) arg1 >= this.aLong119 - -((long) this.anInt2736)) {
					local224 = (long) this.anInt2736 + this.aLong119;
				}
				if (local183 > -1L && local224 > local183) {
					@Pc(317) int local317 = (int) (local224 - local183);
					Static139.method1493(arg2, (int) ((long) arg0 + local183 - this.aLong115), this.aByteArray38, (int) (local183 - this.aLong119), local317);
				}
				this.aLong115 += arg1;
			} else if (arg1 > 0) {
				if (this.aLong118 == -1L) {
					this.aLong118 = this.aLong115;
				}
				Static139.method1493(arg2, arg0, this.aByteArray37, (int) (this.aLong115 - this.aLong118), arg1);
				this.aLong115 += arg1;
				if ((long) this.anInt2732 < this.aLong115 - this.aLong118) {
					this.anInt2732 = (int) (this.aLong115 - this.aLong118);
				}
			}
		} catch (@Pc(406) IOException local406) {
			this.aLong116 = -1L;
			throw local406;
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V")
	private void method1936() throws IOException {
		if (this.aLong118 == -1L) {
			return;
		}
		if (this.aLong118 != this.aLong116) {
			this.aClass55_4.method1617(this.aLong118);
			this.aLong116 = this.aLong118;
		}
		@Pc(26) long local26 = -1L;
		@Pc(28) long local28 = -1L;
		this.aClass55_4.method1618(this.aByteArray37, this.anInt2732, 0);
		this.aLong116 += this.anInt2732;
		if (this.aLong120 < this.aLong116) {
			this.aLong120 = this.aLong116;
		}
		if (this.aLong119 < this.aLong118 + (long) this.anInt2732 && this.aLong118 + (long) this.anInt2732 <= (long) this.anInt2736 + this.aLong119) {
			local28 = this.aLong118 + (long) this.anInt2732;
		} else if (this.aLong118 < this.aLong119 + (long) this.anInt2736 && this.aLong119 + (long) this.anInt2736 <= (long) this.anInt2732 + this.aLong118) {
			local28 = this.aLong119 + (long) this.anInt2736;
		}
		if (this.aLong119 <= this.aLong118 && this.aLong118 < this.aLong119 + (long) this.anInt2736) {
			local26 = this.aLong118;
		} else if (this.aLong119 >= this.aLong118 && (long) this.anInt2732 + this.aLong118 > this.aLong119) {
			local26 = this.aLong119;
		}
		if (local26 > -1L && local26 < local28) {
			@Pc(196) int local196 = (int) (local28 - local26);
			Static139.method1493(this.aByteArray37, (int) (local26 - this.aLong118), this.aByteArray38, (int) (local26 - this.aLong119), local196);
		}
		this.anInt2732 = 0;
		this.aLong118 = -1L;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "([BZ)V")
	public void method1937(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method1941(arg0, arg0.length, 0);
	}

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "(I)Ljava/io/File;")
	private File method1938() {
		return this.aClass55_4.method1616();
	}

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "(I)V")
	private void method1939() throws IOException {
		this.anInt2736 = 0;
		if (this.aLong115 != this.aLong116) {
			this.aClass55_4.method1617(this.aLong115);
			this.aLong116 = this.aLong115;
		}
		this.aLong119 = this.aLong115;
		while (this.aByteArray38.length > this.anInt2736) {
			@Pc(55) int local55 = this.aClass55_4.method1619(this.aByteArray38, this.aByteArray38.length - this.anInt2736, this.anInt2736);
			if (local55 == -1) {
				break;
			}
			this.anInt2736 += local55;
			this.aLong116 += local55;
		}
	}

	@OriginalMember(owner = "client!ua", name = "e", descriptor = "(I)J")
	public long method1940() {
		return this.aLong117;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "([BIII)V")
	public void method1941(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if (arg1 > arg0.length) {
				throw new ArrayIndexOutOfBoundsException(arg1 - arg0.length);
			}
			if (this.aLong118 != -1L && this.aLong115 >= this.aLong118 && this.aLong115 + (long) arg1 <= (long) this.anInt2732 + this.aLong118) {
				Static139.method1493(this.aByteArray37, (int) (this.aLong115 - this.aLong118), arg0, 0, arg1);
				this.aLong115 += arg1;
				return;
			}
			@Pc(70) long local70 = this.aLong115;
			@Pc(79) int local79 = arg1;
			@Pc(107) int local107;
			if (this.aLong119 <= this.aLong115 && (long) this.anInt2736 + this.aLong119 > this.aLong115) {
				local107 = (int) (this.aLong119 + (long) this.anInt2736 - this.aLong115);
				if (local107 > arg1) {
					local107 = arg1;
				}
				Static139.method1493(this.aByteArray38, (int) (this.aLong115 - this.aLong119), arg0, 0, local107);
				arg2 = local107;
				this.aLong115 += local107;
				arg1 -= local107;
			}
			if (arg1 > this.aByteArray38.length) {
				this.aClass55_4.method1617(this.aLong115);
				this.aLong116 = this.aLong115;
				while (arg1 > 0) {
					local107 = this.aClass55_4.method1619(arg0, arg1, arg2);
					if (local107 == -1) {
						break;
					}
					arg1 -= local107;
					arg2 += local107;
					this.aLong116 += local107;
					this.aLong115 += local107;
				}
			} else if (arg1 > 0) {
				this.method1939();
				local107 = arg1;
				if (arg1 > this.anInt2736) {
					local107 = this.anInt2736;
				}
				Static139.method1493(this.aByteArray38, 0, arg0, arg2, local107);
				arg1 -= local107;
				this.aLong115 += local107;
				arg2 += local107;
			}
			if (this.aLong118 != -1L) {
				if (this.aLong118 > this.aLong115 && arg1 > 0) {
					local107 = arg2 + (int) (this.aLong118 - this.aLong115);
					if (arg2 + arg1 < local107) {
						local107 = arg2 + arg1;
					}
					while (arg2 < local107) {
						arg0[arg2++] = 0;
						arg1--;
						this.aLong115++;
					}
				}
				@Pc(305) long local305 = -1L;
				if (this.aLong118 >= local70 && (long) local79 + local70 > this.aLong118) {
					local305 = this.aLong118;
				} else if (this.aLong118 <= local70 && this.aLong118 + (long) this.anInt2732 > local70) {
					local305 = local70;
				}
				@Pc(350) long local350 = -1L;
				if ((long) this.anInt2732 + this.aLong118 > local70 && (long) local79 + local70 >= (long) this.anInt2732 + this.aLong118) {
					local350 = this.aLong118 + (long) this.anInt2732;
				} else if (local70 + (long) local79 > this.aLong118 && (long) this.anInt2732 + this.aLong118 >= (long) local79 + local70) {
					local350 = (long) local79 + local70;
				}
				if (local305 > -1L && local350 > local305) {
					@Pc(432) int local432 = (int) (local350 - local305);
					Static139.method1493(this.aByteArray37, (int) (local305 - this.aLong118), arg0, (int) (local305 - local70), local432);
					if (this.aLong115 < local350) {
						arg1 = (int) ((long) arg1 + this.aLong115 - local350);
						this.aLong115 = local350;
					}
				}
			}
		} catch (@Pc(474) IOException local474) {
			this.aLong116 = -1L;
			throw local474;
		}
		if (arg1 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(JZ)V")
	public void method1942(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method1938());
		}
		this.aLong115 = arg0;
	}
}
