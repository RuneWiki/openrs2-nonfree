import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vf")
public final class Class79 {

	@OriginalMember(owner = "client!vf", name = "g", descriptor = "I")
	private int anInt3050;

	@OriginalMember(owner = "client!vf", name = "k", descriptor = "J")
	private long aLong95;

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "J")
	private long aLong92 = -1L;

	@OriginalMember(owner = "client!vf", name = "j", descriptor = "J")
	private long aLong94 = -1L;

	@OriginalMember(owner = "client!vf", name = "y", descriptor = "I")
	private int anInt3060 = 0;

	@OriginalMember(owner = "client!vf", name = "C", descriptor = "Lclient!lb;")
	private final Class42 aClass42_4;

	@OriginalMember(owner = "client!vf", name = "B", descriptor = "J")
	private long aLong97;

	@OriginalMember(owner = "client!vf", name = "w", descriptor = "J")
	private long aLong96;

	@OriginalMember(owner = "client!vf", name = "i", descriptor = "J")
	private long aLong93;

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "[B")
	private final byte[] aByteArray43;

	@OriginalMember(owner = "client!vf", name = "o", descriptor = "[B")
	private final byte[] aByteArray44;

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(Lclient!lb;II)V")
	public Class79(@OriginalArg(0) Class42 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass42_4 = arg0;
		this.aLong96 = this.aLong97 = arg0.method1147();
		this.aLong93 = 0L;
		this.aByteArray43 = new byte[arg2];
		this.aByteArray44 = new byte[arg1];
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)J")
	public long method1978() {
		return this.aLong96;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "([BBII)V")
	public void method1979(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if ((long) arg1 + this.aLong93 > this.aLong96) {
				this.aLong96 = this.aLong93 + (long) arg1;
			}
			if (this.aLong94 != -1L && (this.aLong94 > this.aLong93 || this.aLong93 > (long) this.anInt3060 + this.aLong94)) {
				this.method1985();
			}
			if (this.aLong94 != -1L && (long) arg1 + this.aLong93 > (long) this.aByteArray43.length + this.aLong94) {
				@Pc(96) int local96 = (int) ((long) this.aByteArray43.length + this.aLong94 - this.aLong93);
				arg1 -= local96;
				Static139.method952(arg0, arg2, this.aByteArray43, (int) (this.aLong93 - this.aLong94), local96);
				this.aLong93 += local96;
				arg2 += local96;
				this.anInt3060 = this.aByteArray43.length;
				this.method1985();
			}
			if (arg1 > this.aByteArray43.length) {
				if (this.aLong95 != this.aLong93) {
					this.aClass42_4.method1145(this.aLong93);
					this.aLong95 = this.aLong93;
				}
				this.aClass42_4.method1148(arg0, arg2, arg1);
				@Pc(166) long local166 = -1L;
				this.aLong95 += arg1;
				@Pc(175) long local175 = -1L;
				if (this.aLong93 >= this.aLong92 && (long) this.anInt3050 + this.aLong92 > this.aLong93) {
					local166 = this.aLong93;
				} else if (this.aLong92 >= this.aLong93 && (long) arg1 + this.aLong93 > this.aLong92) {
					local166 = this.aLong92;
				}
				if (this.aLong92 < this.aLong93 + (long) arg1 && this.aLong92 + (long) this.anInt3050 >= this.aLong93 + (long) arg1) {
					local175 = (long) arg1 + this.aLong93;
				} else if ((long) this.anInt3050 + this.aLong92 > this.aLong93 && (long) this.anInt3050 + this.aLong92 <= (long) arg1 + this.aLong93) {
					local175 = (long) this.anInt3050 + this.aLong92;
				}
				if (this.aLong97 < this.aLong95) {
					this.aLong97 = this.aLong95;
				}
				if (local166 > -1L && local166 < local175) {
					@Pc(318) int local318 = (int) (local175 - local166);
					Static139.method952(arg0, (int) (local166 + (long) arg2 - this.aLong93), this.aByteArray44, (int) (local166 - this.aLong92), local318);
				}
				this.aLong93 += arg1;
			} else if (arg1 > 0) {
				if (this.aLong94 == -1L) {
					this.aLong94 = this.aLong93;
				}
				Static139.method952(arg0, arg2, this.aByteArray43, (int) (this.aLong93 - this.aLong94), arg1);
				this.aLong93 += arg1;
				if (this.aLong93 - this.aLong94 > (long) this.anInt3060) {
					this.anInt3060 = (int) (this.aLong93 - this.aLong94);
				}
			}
		} catch (@Pc(404) IOException local404) {
			this.aLong95 = -1L;
			throw local404;
		}
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(I)Ljava/io/File;")
	private File method1982() {
		return this.aClass42_4.method1144();
	}

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "(I)V")
	public void method1983() throws IOException {
		this.method1985();
		this.aClass42_4.method1149();
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(II[BI)V")
	public void method1984(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg0 > arg1.length) {
				throw new ArrayIndexOutOfBoundsException(arg0 - arg1.length);
			}
			if (this.aLong94 != -1L && this.aLong93 >= this.aLong94 && this.aLong94 + (long) this.anInt3060 >= (long) arg0 + this.aLong93) {
				Static139.method952(this.aByteArray43, (int) (this.aLong93 - this.aLong94), arg1, 0, arg0);
				this.aLong93 += arg0;
				return;
			}
			@Pc(75) long local75 = this.aLong93;
			@Pc(79) int local79 = arg0;
			@Pc(107) int local107;
			if (this.aLong93 >= this.aLong92 && (long) this.anInt3050 + this.aLong92 > this.aLong93) {
				local107 = (int) (this.aLong92 + (long) this.anInt3050 - this.aLong93);
				if (local107 > arg0) {
					local107 = arg0;
				}
				arg0 -= local107;
				Static139.method952(this.aByteArray44, (int) (this.aLong93 - this.aLong92), arg1, 0, local107);
				arg2 = local107;
				this.aLong93 += local107;
			}
			if (arg0 > this.aByteArray44.length) {
				this.aClass42_4.method1145(this.aLong93);
				this.aLong95 = this.aLong93;
				while (arg0 > 0) {
					local107 = this.aClass42_4.method1146(arg2, arg1, arg0);
					if (local107 == -1) {
						break;
					}
					arg2 += local107;
					arg0 -= local107;
					this.aLong95 += local107;
					this.aLong93 += local107;
				}
			} else if (arg0 > 0) {
				this.method1987();
				local107 = arg0;
				if (arg0 > this.anInt3050) {
					local107 = this.anInt3050;
				}
				Static139.method952(this.aByteArray44, 0, arg1, arg2, local107);
				arg0 -= local107;
				this.aLong93 += local107;
				arg2 += local107;
			}
			if (this.aLong94 != -1L) {
				if (this.aLong93 < this.aLong94 && arg0 > 0) {
					local107 = (int) (this.aLong94 - this.aLong93) + arg2;
					if (local107 > arg0 + arg2) {
						local107 = arg2 + arg0;
					}
					while (arg2 < local107) {
						arg0--;
						arg1[arg2++] = 0;
						this.aLong93++;
					}
				}
				@Pc(300) long local300 = -1L;
				if (local75 < (long) this.anInt3060 + this.aLong94 && (long) this.anInt3060 + this.aLong94 <= (long) local79 + local75) {
					local300 = (long) this.anInt3060 + this.aLong94;
				} else if (this.aLong94 < local75 + (long) local79 && local75 + (long) local79 <= this.aLong94 + (long) this.anInt3060) {
					local300 = (long) local79 + local75;
				}
				@Pc(369) long local369 = -1L;
				if (this.aLong94 >= local75 && (long) local79 + local75 > this.aLong94) {
					local369 = this.aLong94;
				} else if (this.aLong94 <= local75 && this.aLong94 + (long) this.anInt3060 > local75) {
					local369 = local75;
				}
				if (local369 > -1L && local369 < local300) {
					@Pc(432) int local432 = (int) (local300 - local369);
					Static139.method952(this.aByteArray43, (int) (local369 - this.aLong94), arg1, (int) (local369 - local75), local432);
					if (this.aLong93 < local300) {
						arg0 = (int) ((long) arg0 + this.aLong93 - local300);
						this.aLong93 = local300;
					}
				}
			}
		} catch (@Pc(473) IOException local473) {
			this.aLong95 = -1L;
			throw local473;
		}
		if (arg0 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "(I)V")
	private void method1985() throws IOException {
		if (this.aLong94 == -1L) {
			return;
		}
		@Pc(10) long local10 = -1L;
		if (this.aLong95 != this.aLong94) {
			this.aClass42_4.method1145(this.aLong94);
			this.aLong95 = this.aLong94;
		}
		this.aClass42_4.method1148(this.aByteArray43, 0, this.anInt3060);
		if (this.aLong92 <= this.aLong94 && this.aLong94 < (long) this.anInt3050 + this.aLong92) {
			local10 = this.aLong94;
		} else if (this.aLong92 >= this.aLong94 && this.aLong92 < this.aLong94 + (long) this.anInt3060) {
			local10 = this.aLong92;
		}
		this.aLong95 += this.anInt3060;
		if (this.aLong97 < this.aLong95) {
			this.aLong97 = this.aLong95;
		}
		@Pc(108) long local108 = -1L;
		if ((long) this.anInt3060 + this.aLong94 > this.aLong92 && this.aLong92 + (long) this.anInt3050 >= this.aLong94 + (long) this.anInt3060) {
			local108 = (long) this.anInt3060 + this.aLong94;
		} else if (this.aLong94 < this.aLong92 + (long) this.anInt3050 && (long) this.anInt3050 + this.aLong92 <= this.aLong94 - -((long) this.anInt3060)) {
			local108 = (long) this.anInt3050 + this.aLong92;
		}
		if (local10 > -1L && local108 > local10) {
			@Pc(192) int local192 = (int) (local108 - local10);
			Static139.method952(this.aByteArray43, (int) (local10 - this.aLong94), this.aByteArray44, (int) (local10 - this.aLong92), local192);
		}
		this.aLong94 = -1L;
		this.anInt3060 = 0;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "([BI)V")
	public void method1986(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method1984(arg0.length, arg0, 0);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)V")
	private void method1987() throws IOException {
		this.anInt3050 = 0;
		if (this.aLong95 != this.aLong93) {
			this.aClass42_4.method1145(this.aLong93);
			this.aLong95 = this.aLong93;
		}
		this.aLong92 = this.aLong93;
		while (this.anInt3050 < this.aByteArray44.length) {
			@Pc(58) int local58 = this.aClass42_4.method1146(this.anInt3050, this.aByteArray44, this.aByteArray44.length - this.anInt3050);
			if (local58 == -1) {
				break;
			}
			this.anInt3050 += local58;
			this.aLong95 += local58;
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(BJ)V")
	public void method1988(@OriginalArg(1) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method1982());
		}
		this.aLong93 = arg0;
	}
}
