import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aj")
public final class Class10 {

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "I")
	private int anInt220;

	@OriginalMember(owner = "client!aj", name = "c", descriptor = "J")
	private long aLong11;

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "J")
	private long aLong10 = -1L;

	@OriginalMember(owner = "client!aj", name = "f", descriptor = "J")
	private long aLong12 = -1L;

	@OriginalMember(owner = "client!aj", name = "e", descriptor = "I")
	private int anInt222 = 0;

	@OriginalMember(owner = "client!aj", name = "s", descriptor = "Lclient!km;")
	private final Class139 aClass139_1;

	@OriginalMember(owner = "client!aj", name = "x", descriptor = "J")
	private long aLong15;

	@OriginalMember(owner = "client!aj", name = "t", descriptor = "J")
	private long aLong14;

	@OriginalMember(owner = "client!aj", name = "h", descriptor = "[B")
	private final byte[] aByteArray3;

	@OriginalMember(owner = "client!aj", name = "j", descriptor = "J")
	private long aLong13;

	@OriginalMember(owner = "client!aj", name = "w", descriptor = "[B")
	private final byte[] aByteArray4;

	@OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(Lclient!km;II)V")
	public Class10(@OriginalArg(0) Class139 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass139_1 = arg0;
		this.aLong14 = this.aLong15 = arg0.method2900();
		this.aByteArray3 = new byte[arg2];
		this.aLong13 = 0L;
		this.aByteArray4 = new byte[arg1];
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Z[BII)V")
	public void method166(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg1 > arg0.length) {
				throw new ArrayIndexOutOfBoundsException(arg1 - arg0.length);
			}
			if (this.aLong12 != -1L && this.aLong12 <= this.aLong13 && this.aLong13 + (long) arg1 <= this.aLong12 - -((long) this.anInt222)) {
				Static468.method3858(this.aByteArray3, (int) (this.aLong13 - this.aLong12), arg0, 0, arg1);
				this.aLong13 += arg1;
				return;
			}
			@Pc(78) long local78 = this.aLong13;
			@Pc(82) int local82 = arg1;
			@Pc(115) int local115;
			if (this.aLong13 >= this.aLong10 && this.aLong13 < this.aLong10 + (long) this.anInt220) {
				local115 = (int) (this.aLong10 + (long) this.anInt220 - this.aLong13);
				if (arg1 < local115) {
					local115 = arg1;
				}
				Static468.method3858(this.aByteArray4, (int) (this.aLong13 - this.aLong10), arg0, 0, local115);
				arg1 -= local115;
				arg2 = local115;
				this.aLong13 += local115;
			}
			if (arg1 > this.aByteArray4.length) {
				this.aClass139_1.method2899(this.aLong13);
				this.aLong11 = this.aLong13;
				while (arg1 > 0) {
					local115 = this.aClass139_1.method2898(arg1, arg2, arg0);
					if (local115 == -1) {
						break;
					}
					this.aLong13 += local115;
					arg2 += local115;
					arg1 -= local115;
					this.aLong11 += local115;
				}
			} else if (arg1 > 0) {
				this.method167();
				local115 = arg1;
				if (this.anInt220 < arg1) {
					local115 = this.anInt220;
				}
				Static468.method3858(this.aByteArray4, 0, arg0, arg2, local115);
				arg1 -= local115;
				this.aLong13 += local115;
				arg2 += local115;
			}
			if (this.aLong12 != -1L) {
				if (this.aLong13 < this.aLong12 && arg1 > 0) {
					local115 = (int) (this.aLong12 - this.aLong13) + arg2;
					if (local115 > arg1 + arg2) {
						local115 = arg2 + arg1;
					}
					while (local115 > arg2) {
						arg1--;
						arg0[arg2++] = 0;
						this.aLong13++;
					}
				}
				@Pc(311) long local311 = -1L;
				if (local78 <= this.aLong12 && local78 + (long) local82 > this.aLong12) {
					local311 = this.aLong12;
				} else if (this.aLong12 <= local78 && this.aLong12 + (long) this.anInt222 > local78) {
					local311 = local78;
				}
				@Pc(359) long local359 = -1L;
				if ((long) this.anInt222 + this.aLong12 > local78 && local78 + (long) local82 >= (long) this.anInt222 + this.aLong12) {
					local359 = this.aLong12 + (long) this.anInt222;
				} else if (local78 + (long) local82 > this.aLong12 && (long) this.anInt222 + this.aLong12 >= (long) local82 + local78) {
					local359 = (long) local82 + local78;
				}
				if (local311 > -1L && local359 > local311) {
					@Pc(442) int local442 = (int) (local359 - local311);
					Static468.method3858(this.aByteArray3, (int) (local311 - this.aLong12), arg0, (int) (local311 - local78), local442);
					if (this.aLong13 < local359) {
						arg1 = (int) ((long) arg1 + this.aLong13 - local359);
						this.aLong13 = local359;
					}
				}
			}
		} catch (@Pc(480) IOException local480) {
			this.aLong11 = -1L;
			throw local480;
		}
		if (arg1 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(I)V")
	private void method167() throws IOException {
		this.anInt220 = 0;
		if (this.aLong13 != this.aLong11) {
			this.aClass139_1.method2899(this.aLong13);
			this.aLong11 = this.aLong13;
		}
		this.aLong10 = this.aLong13;
		while (this.anInt220 < this.aByteArray4.length) {
			@Pc(37) int local37 = this.aByteArray4.length - this.anInt220;
			if (local37 > 200000000) {
				local37 = 200000000;
			}
			@Pc(54) int local54 = this.aClass139_1.method2898(local37, this.anInt220, this.aByteArray4);
			if (local54 == -1) {
				break;
			}
			this.aLong11 += local54;
			this.anInt220 += local54;
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "([BB)V")
	public void method168(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method166(arg0, arg0.length, 0);
	}

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(B)J")
	public long method169() {
		return this.aLong14;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(JI)V")
	public void method171(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method174());
		}
		this.aLong13 = arg0;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(III[B)V")
	public void method172(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if (this.aLong13 + (long) arg1 > this.aLong14) {
				this.aLong14 = this.aLong13 + (long) arg1;
			}
			if (this.aLong12 != -1L && (this.aLong12 > this.aLong13 || this.aLong13 > (long) this.anInt222 + this.aLong12)) {
				this.method173();
			}
			if (this.aLong12 != -1L && this.aLong12 + (long) this.aByteArray3.length < this.aLong13 + (long) arg1) {
				@Pc(93) int local93 = (int) ((long) this.aByteArray3.length + this.aLong12 - this.aLong13);
				Static468.method3858(arg2, arg0, this.aByteArray3, (int) (this.aLong13 - this.aLong12), local93);
				arg0 += local93;
				arg1 -= local93;
				this.aLong13 += local93;
				this.anInt222 = this.aByteArray3.length;
				this.method173();
			}
			if (this.aByteArray3.length < arg1) {
				if (this.aLong11 != this.aLong13) {
					this.aClass139_1.method2899(this.aLong13);
					this.aLong11 = this.aLong13;
				}
				this.aClass139_1.method2902(arg2, arg0, arg1);
				this.aLong11 += arg1;
				if (this.aLong11 > this.aLong15) {
					this.aLong15 = this.aLong11;
				}
				@Pc(183) long local183 = -1L;
				@Pc(185) long local185 = -1L;
				if (this.aLong13 >= this.aLong10 && (long) this.anInt220 + this.aLong10 > this.aLong13) {
					local183 = this.aLong13;
				} else if (this.aLong10 >= this.aLong13 && this.aLong10 < (long) arg1 + this.aLong13) {
					local183 = this.aLong10;
				}
				if ((long) arg1 + this.aLong13 > this.aLong10 && this.aLong13 + (long) arg1 <= (long) this.anInt220 + this.aLong10) {
					local185 = this.aLong13 + (long) arg1;
				} else if (this.aLong13 < (long) this.anInt220 + this.aLong10 && (long) this.anInt220 + this.aLong10 <= (long) arg1 + this.aLong13) {
					local185 = (long) this.anInt220 + this.aLong10;
				}
				if (local183 > -1L && local185 > local183) {
					@Pc(307) int local307 = (int) (local185 - local183);
					Static468.method3858(arg2, (int) ((long) arg0 + local183 - this.aLong13), this.aByteArray4, (int) (local183 - this.aLong10), local307);
				}
				this.aLong13 += arg1;
			} else if (arg1 > 0) {
				if (this.aLong12 == -1L) {
					this.aLong12 = this.aLong13;
				}
				Static468.method3858(arg2, arg0, this.aByteArray3, (int) (this.aLong13 - this.aLong12), arg1);
				this.aLong13 += arg1;
				if ((long) this.anInt222 < this.aLong13 - this.aLong12) {
					this.anInt222 = (int) (this.aLong13 - this.aLong12);
				}
			}
		} catch (@Pc(394) IOException local394) {
			this.aLong11 = -1L;
			throw local394;
		}
	}

	@OriginalMember(owner = "client!aj", name = "c", descriptor = "(B)V")
	private void method173() throws IOException {
		if (this.aLong12 == -1L) {
			return;
		}
		if (this.aLong12 != this.aLong11) {
			this.aClass139_1.method2899(this.aLong12);
			this.aLong11 = this.aLong12;
		}
		this.aClass139_1.method2902(this.aByteArray3, 0, this.anInt222);
		this.aLong11 += this.anInt222;
		if (this.aLong11 > this.aLong15) {
			this.aLong15 = this.aLong11;
		}
		@Pc(57) long local57 = -1L;
		@Pc(59) long local59 = -1L;
		if (this.aLong10 <= this.aLong12 && (long) this.anInt220 + this.aLong10 > this.aLong12) {
			local57 = this.aLong12;
		} else if (this.aLong10 >= this.aLong12 && this.aLong10 < (long) this.anInt222 + this.aLong12) {
			local57 = this.aLong10;
		}
		if ((long) this.anInt222 + this.aLong12 > this.aLong10 && this.aLong10 + (long) this.anInt220 >= (long) this.anInt222 + this.aLong12) {
			local59 = this.aLong12 + (long) this.anInt222;
		} else if (this.aLong12 < this.aLong10 + (long) this.anInt220 && (long) this.anInt222 + this.aLong12 >= (long) this.anInt220 + this.aLong10) {
			local59 = this.aLong10 + (long) this.anInt220;
		}
		if (local57 > -1L && local59 > local57) {
			@Pc(198) int local198 = (int) (local59 - local57);
			Static468.method3858(this.aByteArray3, (int) (local57 - this.aLong12), this.aByteArray4, (int) (local57 - this.aLong10), local198);
		}
		this.anInt222 = 0;
		this.aLong12 = -1L;
	}

	@OriginalMember(owner = "client!aj", name = "d", descriptor = "(B)Ljava/io/File;")
	private File method174() {
		return this.aClass139_1.method2901();
	}
}
