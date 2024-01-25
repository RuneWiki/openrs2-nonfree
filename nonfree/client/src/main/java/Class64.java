import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cv")
public final class Class64 {

	@OriginalMember(owner = "client!cv", name = "m", descriptor = "I")
	private int anInt1657;

	@OriginalMember(owner = "client!cv", name = "s", descriptor = "J")
	private long aLong54;

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "J")
	private long aLong49 = -1L;

	@OriginalMember(owner = "client!cv", name = "l", descriptor = "J")
	private long aLong52 = -1L;

	@OriginalMember(owner = "client!cv", name = "z", descriptor = "I")
	private int anInt1665 = 0;

	@OriginalMember(owner = "client!cv", name = "p", descriptor = "Lclient!cu;")
	private final Class63 aClass63_1;

	@OriginalMember(owner = "client!cv", name = "i", descriptor = "J")
	private long aLong51;

	@OriginalMember(owner = "client!cv", name = "b", descriptor = "J")
	private long aLong50;

	@OriginalMember(owner = "client!cv", name = "j", descriptor = "[B")
	private final byte[] aByteArray10;

	@OriginalMember(owner = "client!cv", name = "c", descriptor = "[B")
	private final byte[] aByteArray9;

	@OriginalMember(owner = "client!cv", name = "q", descriptor = "J")
	private long aLong53;

	@OriginalMember(owner = "client!cv", name = "<init>", descriptor = "(Lclient!cu;II)V")
	public Class64(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass63_1 = arg0;
		this.aLong50 = this.aLong51 = arg0.method1175();
		this.aByteArray10 = new byte[arg2];
		this.aByteArray9 = new byte[arg1];
		this.aLong53 = 0L;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(IBI[B)V")
	public void method1182(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if (arg1 > arg2.length) {
				throw new ArrayIndexOutOfBoundsException(arg1 - arg2.length);
			}
			if (this.aLong52 != -1L && this.aLong53 >= this.aLong52 && this.aLong53 + (long) arg1 <= this.aLong52 - -((long) this.anInt1665)) {
				Static598.method1137(this.aByteArray10, (int) (this.aLong53 - this.aLong52), arg2, 0, arg1);
				this.aLong53 += arg1;
				return;
			}
			@Pc(76) long local76 = this.aLong53;
			@Pc(80) int local80 = arg1;
			@Pc(112) int local112;
			if (this.aLong49 <= this.aLong53 && (long) this.anInt1657 + this.aLong49 > this.aLong53) {
				local112 = (int) (this.aLong49 + (long) this.anInt1657 - this.aLong53);
				if (arg1 < local112) {
					local112 = arg1;
				}
				Static598.method1137(this.aByteArray9, (int) (this.aLong53 - this.aLong49), arg2, 0, local112);
				arg1 -= local112;
				this.aLong53 += local112;
				arg0 = local112;
			}
			if (this.aByteArray9.length < arg1) {
				this.aClass63_1.method1180(this.aLong53);
				this.aLong54 = this.aLong53;
				while (arg1 > 0) {
					local112 = this.aClass63_1.method1178(arg0, arg2, arg1);
					if (local112 == -1) {
						break;
					}
					this.aLong53 += local112;
					this.aLong54 += local112;
					arg1 -= local112;
					arg0 += local112;
				}
			} else if (arg1 > 0) {
				this.method1186();
				local112 = arg1;
				if (this.anInt1657 < arg1) {
					local112 = this.anInt1657;
				}
				Static598.method1137(this.aByteArray9, 0, arg2, arg0, local112);
				arg0 += local112;
				arg1 -= local112;
				this.aLong53 += local112;
			}
			if (this.aLong52 != -1L) {
				if (this.aLong52 > this.aLong53 && arg1 > 0) {
					local112 = (int) (this.aLong52 - this.aLong53) + arg0;
					if (local112 > arg1 + arg0) {
						local112 = arg1 + arg0;
					}
					while (arg0 < local112) {
						arg1--;
						arg2[arg0++] = 0;
						this.aLong53++;
					}
				}
				@Pc(308) long local308 = -1L;
				@Pc(310) long local310 = -1L;
				if (this.aLong52 >= local76 && this.aLong52 < (long) local80 + local76) {
					local308 = this.aLong52;
				} else if (this.aLong52 <= local76 && local76 < this.aLong52 + (long) this.anInt1665) {
					local308 = local76;
				}
				if (this.aLong52 + (long) this.anInt1665 > local76 && (long) local80 + local76 >= (long) this.anInt1665 + this.aLong52) {
					local310 = this.aLong52 + (long) this.anInt1665;
				} else if (local76 + (long) local80 > this.aLong52 && this.aLong52 + (long) this.anInt1665 >= (long) local80 + local76) {
					local310 = (long) local80 + local76;
				}
				if (local308 > -1L && local308 < local310) {
					@Pc(449) int local449 = (int) (local310 - local308);
					Static598.method1137(this.aByteArray10, (int) (local308 - this.aLong52), arg2, (int) (local308 - local76), local449);
					if (this.aLong53 < local310) {
						arg1 = (int) ((long) arg1 + this.aLong53 - local310);
						this.aLong53 = local310;
					}
				}
			}
		} catch (@Pc(491) IOException local491) {
			this.aLong54 = -1L;
			throw local491;
		}
		if (arg1 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(I)V")
	private void method1184() throws IOException {
		if (this.aLong52 == -1L) {
			return;
		}
		if (this.aLong52 != this.aLong54) {
			this.aClass63_1.method1180(this.aLong52);
			this.aLong54 = this.aLong52;
		}
		this.aClass63_1.method1176(0, this.anInt1665, this.aByteArray10);
		this.aLong54 += this.anInt1665;
		if (this.aLong51 < this.aLong54) {
			this.aLong51 = this.aLong54;
		}
		@Pc(61) long local61 = -1L;
		if (this.aLong49 <= this.aLong52 && (long) this.anInt1657 + this.aLong49 > this.aLong52) {
			local61 = this.aLong52;
		} else if (this.aLong52 <= this.aLong49 && this.aLong49 < (long) this.anInt1665 + this.aLong52) {
			local61 = this.aLong49;
		}
		@Pc(115) long local115 = -1L;
		if (this.aLong49 < this.aLong52 + (long) this.anInt1665 && (long) this.anInt1657 + this.aLong49 >= this.aLong52 - -((long) this.anInt1665)) {
			local115 = (long) this.anInt1665 + this.aLong52;
		} else if (this.aLong49 + (long) this.anInt1657 > this.aLong52 && this.aLong52 + (long) this.anInt1665 >= (long) this.anInt1657 + this.aLong49) {
			local115 = (long) this.anInt1657 + this.aLong49;
		}
		if (local61 > -1L && local61 < local115) {
			@Pc(209) int local209 = (int) (local115 - local61);
			Static598.method1137(this.aByteArray10, (int) (local61 - this.aLong52), this.aByteArray9, (int) (local61 - this.aLong49), local209);
		}
		this.anInt1665 = 0;
		this.aLong52 = -1L;
	}

	@OriginalMember(owner = "client!cv", name = "c", descriptor = "(I)V")
	private void method1186() throws IOException {
		this.anInt1657 = 0;
		if (this.aLong54 != this.aLong53) {
			this.aClass63_1.method1180(this.aLong53);
			this.aLong54 = this.aLong53;
		}
		this.aLong49 = this.aLong53;
		while (this.aByteArray9.length > this.anInt1657) {
			@Pc(38) int local38 = this.aByteArray9.length - this.anInt1657;
			if (local38 > 200000000) {
				local38 = 200000000;
			}
			@Pc(55) int local55 = this.aClass63_1.method1178(this.anInt1657, this.aByteArray9, local38);
			if (local55 == -1) {
				break;
			}
			this.anInt1657 += local55;
			this.aLong54 += local55;
		}
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(IJ)V")
	public void method1187(@OriginalArg(1) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method1190());
		}
		this.aLong53 = arg0;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "([BIII)V")
	public void method1188(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if (this.aLong50 < (long) arg2 + this.aLong53) {
				this.aLong50 = this.aLong53 + (long) arg2;
			}
			if (this.aLong52 != -1L && (this.aLong52 > this.aLong53 || this.aLong53 > (long) this.anInt1665 + this.aLong52)) {
				this.method1184();
			}
			if (this.aLong52 != -1L && (long) arg2 + this.aLong53 > (long) this.aByteArray10.length + this.aLong52) {
				@Pc(92) int local92 = (int) (this.aLong52 + (long) this.aByteArray10.length - this.aLong53);
				Static598.method1137(arg0, arg1, this.aByteArray10, (int) (this.aLong53 - this.aLong52), local92);
				this.aLong53 += local92;
				arg2 -= local92;
				arg1 += local92;
				this.anInt1665 = this.aByteArray10.length;
				this.method1184();
			}
			if (arg2 > this.aByteArray10.length) {
				if (this.aLong53 != this.aLong54) {
					this.aClass63_1.method1180(this.aLong53);
					this.aLong54 = this.aLong53;
				}
				this.aClass63_1.method1176(arg1, arg2, arg0);
				this.aLong54 += arg2;
				if (this.aLong54 > this.aLong51) {
					this.aLong51 = this.aLong54;
				}
				@Pc(181) long local181 = -1L;
				if (this.aLong49 <= this.aLong53 && this.aLong53 < (long) this.anInt1657 + this.aLong49) {
					local181 = this.aLong53;
				} else if (this.aLong53 <= this.aLong49 && (long) arg2 + this.aLong53 > this.aLong49) {
					local181 = this.aLong49;
				}
				@Pc(234) long local234 = -1L;
				if (this.aLong49 < (long) arg2 + this.aLong53 && this.aLong53 + (long) arg2 <= (long) this.anInt1657 + this.aLong49) {
					local234 = (long) arg2 + this.aLong53;
				} else if (this.aLong49 + (long) this.anInt1657 > this.aLong53 && (long) this.anInt1657 + this.aLong49 <= this.aLong53 + (long) arg2) {
					local234 = (long) this.anInt1657 + this.aLong49;
				}
				if (local181 > -1L && local234 > local181) {
					@Pc(322) int local322 = (int) (local234 - local181);
					Static598.method1137(arg0, (int) (local181 + (long) arg1 - this.aLong53), this.aByteArray9, (int) (local181 - this.aLong49), local322);
				}
				this.aLong53 += arg2;
			} else if (arg2 > 0) {
				if (this.aLong52 == -1L) {
					this.aLong52 = this.aLong53;
				}
				Static598.method1137(arg0, arg1, this.aByteArray10, (int) (this.aLong53 - this.aLong52), arg2);
				this.aLong53 += arg2;
				if (this.aLong53 - this.aLong52 > (long) this.anInt1665) {
					this.anInt1665 = (int) (this.aLong53 - this.aLong52);
				}
			}
		} catch (@Pc(413) IOException local413) {
			this.aLong54 = -1L;
			throw local413;
		}
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(B)Ljava/io/File;")
	private File method1190() {
		return this.aClass63_1.method1177();
	}

	@OriginalMember(owner = "client!cv", name = "d", descriptor = "(I)J")
	public long method1191() {
		return this.aLong50;
	}

	@OriginalMember(owner = "client!cv", name = "b", descriptor = "(B)V")
	public void method1192() throws IOException {
		this.method1184();
		this.aClass63_1.method1174();
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(Z[B)V")
	public void method1193(@OriginalArg(1) byte[] arg0) throws IOException {
		this.method1182(0, arg0.length, arg0);
	}
}
