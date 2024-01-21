import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public final class Class78 {

	@OriginalMember(owner = "client!we", name = "d", descriptor = "I")
	private int anInt3317;

	@OriginalMember(owner = "client!we", name = "E", descriptor = "J")
	private long aLong95;

	@OriginalMember(owner = "client!we", name = "f", descriptor = "J")
	private long aLong92 = -1L;

	@OriginalMember(owner = "client!we", name = "z", descriptor = "I")
	private int anInt3325 = 0;

	@OriginalMember(owner = "client!we", name = "N", descriptor = "J")
	private long aLong97 = -1L;

	@OriginalMember(owner = "client!we", name = "i", descriptor = "Lclient!bb;")
	private final Class9 aClass9_3;

	@OriginalMember(owner = "client!we", name = "M", descriptor = "J")
	private long aLong96;

	@OriginalMember(owner = "client!we", name = "x", descriptor = "J")
	private long aLong94;

	@OriginalMember(owner = "client!we", name = "m", descriptor = "J")
	private long aLong93;

	@OriginalMember(owner = "client!we", name = "p", descriptor = "[B")
	private final byte[] aByteArray37;

	@OriginalMember(owner = "client!we", name = "B", descriptor = "[B")
	private final byte[] aByteArray38;

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Lclient!bb;II)V")
	public Class78(@OriginalArg(0) Class9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass9_3 = arg0;
		this.aLong94 = this.aLong96 = arg0.method150();
		this.aLong93 = 0L;
		this.aByteArray37 = new byte[arg1];
		this.aByteArray38 = new byte[arg2];
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(B)V")
	private void method2173() throws IOException {
		this.anInt3317 = 0;
		if (this.aLong93 != this.aLong95) {
			this.aClass9_3.method151(this.aLong93);
			this.aLong95 = this.aLong93;
		}
		this.aLong92 = this.aLong93;
		while (this.anInt3317 < this.aByteArray37.length) {
			@Pc(54) int local54 = this.aClass9_3.method153(this.aByteArray37, this.aByteArray37.length - this.anInt3317, this.anInt3317);
			if (local54 == -1) {
				break;
			}
			this.aLong95 += local54;
			this.anInt3317 += local54;
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(III[B)V")
	public void method2176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if (arg0 > arg2.length) {
				throw new ArrayIndexOutOfBoundsException(arg0 - arg2.length);
			}
			if (this.aLong97 != -1L && this.aLong93 >= this.aLong97 && this.aLong93 + (long) arg0 <= this.aLong97 + (long) this.anInt3325) {
				Static129.method1440(this.aByteArray38, (int) (this.aLong93 - this.aLong97), arg2, 0, arg0);
				this.aLong93 += arg0;
				return;
			}
			@Pc(75) long local75 = this.aLong93;
			@Pc(77) int local77 = arg0;
			@Pc(107) int local107;
			if (this.aLong92 <= this.aLong93 && (long) this.anInt3317 + this.aLong92 > this.aLong93) {
				local107 = (int) ((long) this.anInt3317 + this.aLong92 - this.aLong93);
				if (local107 > arg0) {
					local107 = arg0;
				}
				arg0 -= local107;
				Static129.method1440(this.aByteArray37, (int) (this.aLong93 - this.aLong92), arg2, 0, local107);
				this.aLong93 += local107;
				arg1 = local107;
			}
			if (arg0 > this.aByteArray37.length) {
				this.aClass9_3.method151(this.aLong93);
				this.aLong95 = this.aLong93;
				while (arg0 > 0) {
					local107 = this.aClass9_3.method153(arg2, arg0, arg1);
					if (local107 == -1) {
						break;
					}
					this.aLong93 += local107;
					this.aLong95 += local107;
					arg0 -= local107;
					arg1 += local107;
				}
			} else if (arg0 > 0) {
				this.method2173();
				local107 = arg0;
				if (this.anInt3317 < arg0) {
					local107 = this.anInt3317;
				}
				Static129.method1440(this.aByteArray37, 0, arg2, arg1, local107);
				arg0 -= local107;
				this.aLong93 += local107;
				arg1 += local107;
			}
			if (this.aLong97 != -1L) {
				if (this.aLong97 > this.aLong93 && arg0 > 0) {
					local107 = (int) (this.aLong97 - this.aLong93) + arg1;
					if (arg0 + arg1 < local107) {
						local107 = arg1 + arg0;
					}
					while (arg1 < local107) {
						arg2[arg1++] = 0;
						this.aLong93++;
						arg0--;
					}
				}
				@Pc(305) long local305 = -1L;
				if (this.aLong97 >= local75 && this.aLong97 < (long) local77 + local75) {
					local305 = this.aLong97;
				} else if (local75 >= this.aLong97 && local75 < this.aLong97 + (long) this.anInt3325) {
					local305 = local75;
				}
				@Pc(348) long local348 = -1L;
				if (local75 < (long) this.anInt3325 + this.aLong97 && (long) this.anInt3325 + this.aLong97 <= local75 - -((long) local77)) {
					local348 = (long) this.anInt3325 + this.aLong97;
				} else if (this.aLong97 < (long) local77 + local75 && (long) local77 + local75 <= this.aLong97 - -((long) this.anInt3325)) {
					local348 = (long) local77 + local75;
				}
				if (local305 > -1L && local348 > local305) {
					@Pc(436) int local436 = (int) (local348 - local305);
					Static129.method1440(this.aByteArray38, (int) (local305 - this.aLong97), arg2, (int) (local305 - local75), local436);
					if (local348 > this.aLong93) {
						arg0 = (int) ((long) arg0 + this.aLong93 - local348);
						this.aLong93 = local348;
					}
				}
			}
		} catch (@Pc(478) IOException local478) {
			this.aLong95 = -1L;
			throw local478;
		}
		if (arg0 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Z)J")
	public long method2178() {
		return this.aLong94;
	}

	@OriginalMember(owner = "client!we", name = "c", descriptor = "(B)V")
	private void method2179() throws IOException {
		if (this.aLong97 == -1L) {
			return;
		}
		if (this.aLong97 != this.aLong95) {
			this.aClass9_3.method151(this.aLong97);
			this.aLong95 = this.aLong97;
		}
		this.aClass9_3.method152(this.anInt3325, 0, this.aByteArray38);
		@Pc(33) long local33 = -1L;
		if (this.aLong97 >= this.aLong92 && this.aLong97 < (long) this.anInt3317 + this.aLong92) {
			local33 = this.aLong97;
		} else if (this.aLong92 >= this.aLong97 && this.aLong92 < this.aLong97 + (long) this.anInt3325) {
			local33 = this.aLong92;
		}
		this.aLong95 += this.anInt3325;
		@Pc(96) long local96 = -1L;
		if (this.aLong96 < this.aLong95) {
			this.aLong96 = this.aLong95;
		}
		if (this.aLong92 < this.aLong97 + (long) this.anInt3325 && this.aLong97 + (long) this.anInt3325 <= (long) this.anInt3317 + this.aLong92) {
			local96 = (long) this.anInt3325 + this.aLong97;
		} else if ((long) this.anInt3317 + this.aLong92 > this.aLong97 && this.aLong92 + (long) this.anInt3317 <= (long) this.anInt3325 + this.aLong97) {
			local96 = (long) this.anInt3317 + this.aLong92;
		}
		if (local33 > -1L && local96 > local33) {
			@Pc(197) int local197 = (int) (local96 - local33);
			Static129.method1440(this.aByteArray38, (int) (local33 - this.aLong97), this.aByteArray37, (int) (local33 - this.aLong92), local197);
		}
		this.anInt3325 = 0;
		this.aLong97 = -1L;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(II[BI)V")
	public void method2180(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (this.aLong94 < this.aLong93 + (long) arg0) {
				this.aLong94 = this.aLong93 + (long) arg0;
			}
			if (this.aLong97 != -1L && (this.aLong93 < this.aLong97 || this.aLong97 + (long) this.anInt3325 < this.aLong93)) {
				this.method2179();
			}
			if (this.aLong97 != -1L && (long) arg0 + this.aLong93 > (long) this.aByteArray38.length + this.aLong97) {
				@Pc(85) int local85 = (int) (this.aLong97 + (long) this.aByteArray38.length - this.aLong93);
				arg0 -= local85;
				Static129.method1440(arg1, arg2, this.aByteArray38, (int) (this.aLong93 - this.aLong97), local85);
				this.aLong93 += local85;
				arg2 += local85;
				this.anInt3325 = this.aByteArray38.length;
				this.method2179();
			}
			if (this.aByteArray38.length < arg0) {
				@Pc(132) long local132 = -1L;
				@Pc(134) long local134 = -1L;
				if (this.aLong95 != this.aLong93) {
					this.aClass9_3.method151(this.aLong93);
					this.aLong95 = this.aLong93;
				}
				this.aClass9_3.method152(arg0, arg2, arg1);
				this.aLong95 += arg0;
				if (this.aLong93 >= this.aLong92 && (long) this.anInt3317 + this.aLong92 > this.aLong93) {
					local132 = this.aLong93;
				} else if (this.aLong93 <= this.aLong92 && (long) arg0 + this.aLong93 > this.aLong92) {
					local132 = this.aLong92;
				}
				if (this.aLong92 < this.aLong93 + (long) arg0 && this.aLong92 + (long) this.anInt3317 >= (long) arg0 + this.aLong93) {
					local134 = this.aLong93 + (long) arg0;
				} else if ((long) this.anInt3317 + this.aLong92 > this.aLong93 && this.aLong92 + (long) this.anInt3317 <= this.aLong93 + (long) arg0) {
					local134 = (long) this.anInt3317 + this.aLong92;
				}
				if (this.aLong95 > this.aLong96) {
					this.aLong96 = this.aLong95;
				}
				if (local132 > -1L && local134 > local132) {
					@Pc(310) int local310 = (int) (local134 - local132);
					Static129.method1440(arg1, (int) ((long) arg2 + local132 - this.aLong93), this.aByteArray37, (int) (local132 - this.aLong92), local310);
				}
				this.aLong93 += arg0;
			} else if (arg0 > 0) {
				if (this.aLong97 == -1L) {
					this.aLong97 = this.aLong93;
				}
				Static129.method1440(arg1, arg2, this.aByteArray38, (int) (this.aLong93 - this.aLong97), arg0);
				this.aLong93 += arg0;
				if (this.aLong93 - this.aLong97 > (long) this.anInt3325) {
					this.anInt3325 = (int) (this.aLong93 - this.aLong97);
				}
			}
		} catch (@Pc(397) IOException local397) {
			this.aLong95 = -1L;
			throw local397;
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IJ)V")
	public void method2185(@OriginalArg(1) long arg0) {
		if (arg0 >= 0L) {
			this.aLong93 = arg0;
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V")
	public void method2186() throws IOException {
		this.method2179();
		this.aClass9_3.method154();
	}
}
