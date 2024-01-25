import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qp")
public final class Class171 {

	@OriginalMember(owner = "client!qp", name = "j", descriptor = "I")
	private int anInt5170;

	@OriginalMember(owner = "client!qp", name = "m", descriptor = "J")
	private long aLong150;

	@OriginalMember(owner = "client!qp", name = "i", descriptor = "J")
	private long aLong148 = -1L;

	@OriginalMember(owner = "client!qp", name = "v", descriptor = "J")
	private long aLong152 = -1L;

	@OriginalMember(owner = "client!qp", name = "C", descriptor = "I")
	private int anInt5181 = 0;

	@OriginalMember(owner = "client!qp", name = "c", descriptor = "Lclient!im;")
	private final Class108 aClass108_1;

	@OriginalMember(owner = "client!qp", name = "l", descriptor = "J")
	private long aLong149;

	@OriginalMember(owner = "client!qp", name = "u", descriptor = "J")
	private long aLong151;

	@OriginalMember(owner = "client!qp", name = "h", descriptor = "[B")
	private final byte[] aByteArray58;

	@OriginalMember(owner = "client!qp", name = "k", descriptor = "[B")
	private final byte[] aByteArray59;

	@OriginalMember(owner = "client!qp", name = "D", descriptor = "J")
	private long aLong154;

	@OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(Lclient!im;II)V")
	public Class171(@OriginalArg(0) Class108 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass108_1 = arg0;
		this.aLong151 = this.aLong149 = arg0.method2210();
		this.aByteArray58 = new byte[arg1];
		this.aByteArray59 = new byte[arg2];
		this.aLong154 = 0L;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(I)V")
	private void method4492() throws IOException {
		if (this.aLong148 == -1L) {
			return;
		}
		if (this.aLong150 != this.aLong148) {
			this.aClass108_1.method2212(this.aLong148);
			this.aLong150 = this.aLong148;
		}
		this.aClass108_1.method2209(this.aByteArray59, this.anInt5181, 0);
		this.aLong150 += this.anInt5181;
		if (this.aLong150 > this.aLong149) {
			this.aLong149 = this.aLong150;
		}
		@Pc(57) long local57 = -1L;
		if (this.aLong152 <= this.aLong148 && this.aLong152 + (long) this.anInt5170 > this.aLong148) {
			local57 = this.aLong148;
		} else if (this.aLong148 <= this.aLong152 && this.aLong148 + (long) this.anInt5181 > this.aLong152) {
			local57 = this.aLong152;
		}
		@Pc(109) long local109 = -1L;
		if (this.aLong152 < (long) this.anInt5181 + this.aLong148 && (long) this.anInt5181 + this.aLong148 <= this.aLong152 - -((long) this.anInt5170)) {
			local109 = (long) this.anInt5181 + this.aLong148;
		} else if (this.aLong152 + (long) this.anInt5170 > this.aLong148 && (long) this.anInt5170 + this.aLong152 <= (long) this.anInt5181 + this.aLong148) {
			local109 = this.aLong152 + (long) this.anInt5170;
		}
		if (local57 > -1L && local109 > local57) {
			@Pc(209) int local209 = (int) (local109 - local57);
			Static361.method1853(this.aByteArray59, (int) (local57 - this.aLong148), this.aByteArray58, (int) (local57 - this.aLong152), local209);
		}
		this.anInt5181 = 0;
		this.aLong148 = -1L;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "([BI)V")
	public void method4494(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method4504(0, arg0, arg0.length);
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(III[B)V")
	public void method4498(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if (this.aLong151 < this.aLong154 + (long) arg1) {
				this.aLong151 = (long) arg1 + this.aLong154;
			}
			if (this.aLong148 != -1L && (this.aLong154 < this.aLong148 || this.aLong154 > (long) this.anInt5181 + this.aLong148)) {
				this.method4492();
			}
			if (this.aLong148 != -1L && this.aLong154 + (long) arg1 > (long) this.aByteArray59.length + this.aLong148) {
				@Pc(82) int local82 = (int) (this.aLong148 + (long) this.aByteArray59.length - this.aLong154);
				Static361.method1853(arg2, arg0, this.aByteArray59, (int) (this.aLong154 - this.aLong148), local82);
				arg0 += local82;
				arg1 -= local82;
				this.aLong154 += local82;
				this.anInt5181 = this.aByteArray59.length;
				this.method4492();
			}
			if (this.aByteArray59.length < arg1) {
				if (this.aLong154 != this.aLong150) {
					this.aClass108_1.method2212(this.aLong154);
					this.aLong150 = this.aLong154;
				}
				this.aClass108_1.method2209(arg2, arg1, arg0);
				this.aLong150 += arg1;
				if (this.aLong150 > this.aLong149) {
					this.aLong149 = this.aLong150;
				}
				@Pc(173) long local173 = -1L;
				@Pc(175) long local175 = -1L;
				if (this.aLong154 >= this.aLong152 && (long) this.anInt5170 + this.aLong152 > this.aLong154) {
					local173 = this.aLong154;
				} else if (this.aLong154 <= this.aLong152 && this.aLong154 + (long) arg1 > this.aLong152) {
					local173 = this.aLong152;
				}
				if ((long) arg1 + this.aLong154 > this.aLong152 && this.aLong152 + (long) this.anInt5170 >= (long) arg1 + this.aLong154) {
					local175 = this.aLong154 + (long) arg1;
				} else if (this.aLong154 < (long) this.anInt5170 + this.aLong152 && this.aLong154 + (long) arg1 >= (long) this.anInt5170 + this.aLong152) {
					local175 = (long) this.anInt5170 + this.aLong152;
				}
				if (local173 > -1L && local175 > local173) {
					@Pc(299) int local299 = (int) (local175 - local173);
					Static361.method1853(arg2, (int) ((long) arg0 + local173 - this.aLong154), this.aByteArray58, (int) (local173 - this.aLong152), local299);
				}
				this.aLong154 += arg1;
			} else if (arg1 > 0) {
				if (this.aLong148 == -1L) {
					this.aLong148 = this.aLong154;
				}
				Static361.method1853(arg2, arg0, this.aByteArray59, (int) (this.aLong154 - this.aLong148), arg1);
				this.aLong154 += arg1;
				if (this.aLong154 - this.aLong148 > (long) this.anInt5181) {
					this.anInt5181 = (int) (this.aLong154 - this.aLong148);
				}
			}
		} catch (@Pc(392) IOException local392) {
			this.aLong150 = -1L;
			throw local392;
		}
	}

	@OriginalMember(owner = "client!qp", name = "d", descriptor = "(I)V")
	private void method4499() throws IOException {
		this.anInt5170 = 0;
		if (this.aLong154 != this.aLong150) {
			this.aClass108_1.method2212(this.aLong154);
			this.aLong150 = this.aLong154;
		}
		this.aLong152 = this.aLong154;
		while (this.aByteArray58.length > this.anInt5170) {
			@Pc(38) int local38 = this.aByteArray58.length - this.anInt5170;
			if (local38 > 200000000) {
				local38 = 200000000;
			}
			@Pc(53) int local53 = this.aClass108_1.method2211(this.aByteArray58, local38, this.anInt5170);
			if (local53 == -1) {
				break;
			}
			this.aLong150 += local53;
			this.anInt5170 += local53;
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(BJ)V")
	public void method4501(@OriginalArg(1) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method4503());
		}
		this.aLong154 = arg0;
	}

	@OriginalMember(owner = "client!qp", name = "e", descriptor = "(I)J")
	public long method4502() {
		return this.aLong151;
	}

	@OriginalMember(owner = "client!qp", name = "f", descriptor = "(I)Ljava/io/File;")
	private File method4503() {
		return this.aClass108_1.method2208();
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(I[BII)V")
	public void method4504(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if (arg2 > arg1.length) {
				throw new ArrayIndexOutOfBoundsException(arg2 - arg1.length);
			}
			if (this.aLong148 != -1L && this.aLong148 <= this.aLong154 && this.aLong148 + (long) this.anInt5181 >= this.aLong154 - -((long) arg2)) {
				Static361.method1853(this.aByteArray59, (int) (this.aLong154 - this.aLong148), arg1, 0, arg2);
				this.aLong154 += arg2;
				return;
			}
			@Pc(78) long local78 = this.aLong154;
			@Pc(82) int local82 = arg2;
			@Pc(113) int local113;
			if (this.aLong154 >= this.aLong152 && this.aLong154 < (long) this.anInt5170 + this.aLong152) {
				local113 = (int) (this.aLong152 + (long) this.anInt5170 - this.aLong154);
				if (arg2 < local113) {
					local113 = arg2;
				}
				Static361.method1853(this.aByteArray58, (int) (this.aLong154 - this.aLong152), arg1, 0, local113);
				arg0 = local113;
				arg2 -= local113;
				this.aLong154 += local113;
			}
			if (this.aByteArray58.length < arg2) {
				this.aClass108_1.method2212(this.aLong154);
				this.aLong150 = this.aLong154;
				while (arg2 > 0) {
					local113 = this.aClass108_1.method2211(arg1, arg2, arg0);
					if (local113 == -1) {
						break;
					}
					this.aLong154 += local113;
					arg2 -= local113;
					arg0 += local113;
					this.aLong150 += local113;
				}
			} else if (arg2 > 0) {
				this.method4499();
				local113 = arg2;
				if (this.anInt5170 < arg2) {
					local113 = this.anInt5170;
				}
				Static361.method1853(this.aByteArray58, 0, arg1, arg0, local113);
				this.aLong154 += local113;
				arg2 -= local113;
				arg0 += local113;
			}
			if (this.aLong148 != -1L) {
				if (this.aLong154 < this.aLong148 && arg2 > 0) {
					local113 = (int) (this.aLong148 - this.aLong154) + arg0;
					if (local113 > arg2 + arg0) {
						local113 = arg0 + arg2;
					}
					while (arg0 < local113) {
						arg2--;
						arg1[arg0++] = 0;
						this.aLong154++;
					}
				}
				@Pc(298) long local298 = -1L;
				@Pc(300) long local300 = -1L;
				if (this.aLong148 >= local78 && (long) local82 + local78 > this.aLong148) {
					local298 = this.aLong148;
				} else if (this.aLong148 <= local78 && local78 < (long) this.anInt5181 + this.aLong148) {
					local298 = local78;
				}
				if (this.aLong148 + (long) this.anInt5181 > local78 && (long) this.anInt5181 + this.aLong148 <= local78 + (long) local82) {
					local300 = (long) this.anInt5181 + this.aLong148;
				} else if (local78 + (long) local82 > this.aLong148 && (long) this.anInt5181 + this.aLong148 >= (long) local82 + local78) {
					local300 = (long) local82 + local78;
				}
				if (local298 > -1L && local300 > local298) {
					@Pc(427) int local427 = (int) (local300 - local298);
					Static361.method1853(this.aByteArray59, (int) (local298 - this.aLong148), arg1, (int) (local298 - local78), local427);
					if (this.aLong154 < local300) {
						arg2 = (int) ((long) arg2 + this.aLong154 - local300);
						this.aLong154 = local300;
					}
				}
			}
		} catch (@Pc(470) IOException local470) {
			this.aLong150 = -1L;
			throw local470;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}
}
