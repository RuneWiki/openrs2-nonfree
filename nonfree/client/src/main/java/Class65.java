import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public final class Class65 {

	@OriginalMember(owner = "client!rc", name = "l", descriptor = "J")
	private long aLong76;

	@OriginalMember(owner = "client!rc", name = "m", descriptor = "I")
	private int anInt2559;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
	private int anInt2555 = 0;

	@OriginalMember(owner = "client!rc", name = "o", descriptor = "J")
	private long aLong78 = -1L;

	@OriginalMember(owner = "client!rc", name = "n", descriptor = "J")
	private long aLong77 = -1L;

	@OriginalMember(owner = "client!rc", name = "h", descriptor = "Lclient!ka;")
	private final Class41 aClass41_3;

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "J")
	private long aLong74;

	@OriginalMember(owner = "client!rc", name = "v", descriptor = "J")
	private long aLong79;

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "[B")
	private final byte[] aByteArray35;

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "J")
	private long aLong75;

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "[B")
	private final byte[] aByteArray34;

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Lclient!ka;II)V")
	public Class65(@OriginalArg(0) Class41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass41_3 = arg0;
		this.aLong79 = this.aLong74 = arg0.method1073();
		this.aByteArray35 = new byte[arg1];
		this.aLong75 = 0L;
		this.aByteArray34 = new byte[arg2];
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(I[BIZ)V")
	public void method1711(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if (this.aLong79 < this.aLong75 + (long) arg0) {
				this.aLong79 = (long) arg0 + this.aLong75;
			}
			if (this.aLong78 != -1L && (this.aLong78 > this.aLong75 || (long) this.anInt2555 + this.aLong78 < this.aLong75)) {
				this.method1717();
			}
			if (this.aLong78 != -1L && this.aLong75 + (long) arg0 > (long) this.aByteArray34.length + this.aLong78) {
				@Pc(99) int local99 = (int) ((long) this.aByteArray34.length + this.aLong78 - this.aLong75);
				Static128.method140(arg1, arg2, this.aByteArray34, (int) (this.aLong75 - this.aLong78), local99);
				arg2 += local99;
				this.aLong75 += local99;
				arg0 -= local99;
				this.anInt2555 = this.aByteArray34.length;
				this.method1717();
			}
			if (this.aByteArray34.length < arg0) {
				@Pc(146) long local146 = -1L;
				@Pc(148) long local148 = -1L;
				if (this.aLong75 != this.aLong76) {
					this.aClass41_3.method1068(this.aLong75);
					this.aLong76 = this.aLong75;
				}
				this.aClass41_3.method1070(arg2, arg0, arg1);
				if ((long) arg0 + this.aLong75 > this.aLong77 && (long) this.anInt2559 + this.aLong77 >= (long) arg0 + this.aLong75) {
					local148 = (long) arg0 + this.aLong75;
				} else if (this.aLong75 < this.aLong77 + (long) this.anInt2559 && this.aLong75 + (long) arg0 >= (long) this.anInt2559 + this.aLong77) {
					local148 = (long) this.anInt2559 + this.aLong77;
				}
				this.aLong76 += arg0;
				if (this.aLong77 <= this.aLong75 && this.aLong75 < (long) this.anInt2559 + this.aLong77) {
					local146 = this.aLong75;
				} else if (this.aLong77 >= this.aLong75 && this.aLong75 + (long) arg0 > this.aLong77) {
					local146 = this.aLong77;
				}
				if (this.aLong76 > this.aLong74) {
					this.aLong74 = this.aLong76;
				}
				if (local146 > -1L && local148 > local146) {
					@Pc(327) int local327 = (int) (local148 - local146);
					Static128.method140(arg1, (int) ((long) arg2 + local146 - this.aLong75), this.aByteArray35, (int) (local146 - this.aLong77), local327);
				}
				this.aLong75 += arg0;
			} else if (arg0 > 0) {
				if (this.aLong78 == -1L) {
					this.aLong78 = this.aLong75;
				}
				Static128.method140(arg1, arg2, this.aByteArray34, (int) (this.aLong75 - this.aLong78), arg0);
				this.aLong75 += arg0;
				if (this.aLong75 - this.aLong78 > (long) this.anInt2555) {
					this.anInt2555 = (int) (this.aLong75 - this.aLong78);
				}
			}
		} catch (@Pc(414) IOException local414) {
			this.aLong76 = -1L;
			throw local414;
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)J")
	public long method1712() {
		return this.aLong79;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
	public void method1713() throws IOException {
		this.method1717();
		this.aClass41_3.method1072();
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)V")
	private void method1714() throws IOException {
		this.anInt2559 = 0;
		if (this.aLong75 != this.aLong76) {
			this.aClass41_3.method1068(this.aLong75);
			this.aLong76 = this.aLong75;
		}
		this.aLong77 = this.aLong75;
		while (this.anInt2559 < this.aByteArray35.length) {
			@Pc(53) int local53 = this.aClass41_3.method1069(this.aByteArray35, this.aByteArray35.length - this.anInt2559, this.anInt2559);
			if (local53 == -1) {
				break;
			}
			this.aLong76 += local53;
			this.anInt2559 += local53;
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(JZ)V")
	public void method1716(@OriginalArg(0) long arg0) {
		if (arg0 >= 0L) {
			this.aLong75 = arg0;
		}
	}

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "(I)V")
	private void method1717() throws IOException {
		if (this.aLong78 == -1L) {
			return;
		}
		if (this.aLong76 != this.aLong78) {
			this.aClass41_3.method1068(this.aLong78);
			this.aLong76 = this.aLong78;
		}
		this.aClass41_3.method1070(0, this.anInt2555, this.aByteArray34);
		this.aLong76 += this.anInt2555;
		if (this.aLong74 < this.aLong76) {
			this.aLong74 = this.aLong76;
		}
		@Pc(65) long local65 = -1L;
		if (this.aLong77 <= this.aLong78 && (long) this.anInt2559 + this.aLong77 > this.aLong78) {
			local65 = this.aLong78;
		} else if (this.aLong78 <= this.aLong77 && this.aLong77 < this.aLong78 + (long) this.anInt2555) {
			local65 = this.aLong77;
		}
		@Pc(119) long local119 = -1L;
		if (this.aLong77 < this.aLong78 + (long) this.anInt2555 && this.aLong78 + (long) this.anInt2555 <= this.aLong77 - -((long) this.anInt2559)) {
			local119 = this.aLong78 + (long) this.anInt2555;
		} else if ((long) this.anInt2559 + this.aLong77 > this.aLong78 && this.aLong78 + (long) this.anInt2555 >= this.aLong77 - -((long) this.anInt2559)) {
			local119 = this.aLong77 + (long) this.anInt2559;
		}
		if (local65 > -1L && local65 < local119) {
			@Pc(214) int local214 = (int) (local119 - local65);
			Static128.method140(this.aByteArray34, (int) (local65 - this.aLong78), this.aByteArray35, (int) (local65 - this.aLong77), local214);
		}
		this.anInt2555 = 0;
		this.aLong78 = -1L;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "([BIZI)V")
	public void method1718(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg1 > arg0.length) {
				throw new ArrayIndexOutOfBoundsException(arg1 - arg0.length);
			}
			if (this.aLong78 != -1L && this.aLong78 <= this.aLong75 && (long) this.anInt2555 + this.aLong78 >= (long) arg1 + this.aLong75) {
				Static128.method140(this.aByteArray34, (int) (this.aLong75 - this.aLong78), arg0, 0, arg1);
				this.aLong75 += arg1;
				return;
			}
			@Pc(90) long local90 = this.aLong75;
			@Pc(92) int local92 = arg1;
			@Pc(122) int local122;
			if (this.aLong77 <= this.aLong75 && (long) this.anInt2559 + this.aLong77 > this.aLong75) {
				local122 = (int) ((long) this.anInt2559 + this.aLong77 - this.aLong75);
				if (arg1 < local122) {
					local122 = arg1;
				}
				arg1 -= local122;
				Static128.method140(this.aByteArray35, (int) (this.aLong75 - this.aLong77), arg0, 0, local122);
				this.aLong75 += local122;
				arg2 = local122;
			}
			if (arg1 > this.aByteArray35.length) {
				this.aClass41_3.method1068(this.aLong75);
				this.aLong76 = this.aLong75;
				while (arg1 > 0) {
					local122 = this.aClass41_3.method1069(arg0, arg1, arg2);
					if (local122 == -1) {
						break;
					}
					this.aLong76 += local122;
					this.aLong75 += local122;
					arg2 += local122;
					arg1 -= local122;
				}
			} else if (arg1 > 0) {
				this.method1714();
				local122 = arg1;
				if (arg1 > this.anInt2559) {
					local122 = this.anInt2559;
				}
				arg1 -= local122;
				Static128.method140(this.aByteArray35, 0, arg0, arg2, local122);
				this.aLong75 += local122;
				arg2 += local122;
			}
			if (this.aLong78 != -1L) {
				if (this.aLong78 > this.aLong75 && arg1 > 0) {
					local122 = arg2 + (int) (this.aLong78 - this.aLong75);
					if (local122 > arg1 + arg2) {
						local122 = arg1 + arg2;
					}
					while (arg2 < local122) {
						arg1--;
						arg0[arg2++] = 0;
						this.aLong75++;
					}
				}
				@Pc(320) long local320 = -1L;
				@Pc(322) long local322 = -1L;
				if ((long) this.anInt2555 + this.aLong78 > local90 && (long) this.anInt2555 + this.aLong78 <= local90 - -((long) local92)) {
					local320 = this.aLong78 + (long) this.anInt2555;
				} else if (this.aLong78 < local90 + (long) local92 && this.aLong78 + (long) this.anInt2555 >= local90 - -((long) local92)) {
					local320 = (long) local92 + local90;
				}
				if (this.aLong78 >= local90 && this.aLong78 < (long) local92 + local90) {
					local322 = this.aLong78;
				} else if (local90 >= this.aLong78 && (long) this.anInt2555 + this.aLong78 > local90) {
					local322 = local90;
				}
				if (local322 > -1L && local322 < local320) {
					@Pc(444) int local444 = (int) (local320 - local322);
					Static128.method140(this.aByteArray34, (int) (local322 - this.aLong78), arg0, (int) (local322 - local90), local444);
					if (this.aLong75 < local320) {
						arg1 = (int) ((long) arg1 + this.aLong75 - local320);
						this.aLong75 = local320;
					}
				}
			}
		} catch (@Pc(481) IOException local481) {
			this.aLong76 = -1L;
			throw local481;
		}
		if (arg1 > 0) {
			throw new EOFException();
		}
	}
}
