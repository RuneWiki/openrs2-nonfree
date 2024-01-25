import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!du")
public final class Class85 {

	@OriginalMember(owner = "client!du", name = "i", descriptor = "J")
	private long aLong74;

	@OriginalMember(owner = "client!du", name = "l", descriptor = "I")
	private int anInt2035;

	@OriginalMember(owner = "client!du", name = "k", descriptor = "J")
	private long aLong75 = -1L;

	@OriginalMember(owner = "client!du", name = "p", descriptor = "I")
	private int anInt2039 = 0;

	@OriginalMember(owner = "client!du", name = "y", descriptor = "J")
	private long aLong78 = -1L;

	@OriginalMember(owner = "client!du", name = "w", descriptor = "Lclient!qaa;")
	private final Class281 aClass281_1;

	@OriginalMember(owner = "client!du", name = "b", descriptor = "J")
	private long aLong73;

	@OriginalMember(owner = "client!du", name = "s", descriptor = "J")
	private long aLong77;

	@OriginalMember(owner = "client!du", name = "u", descriptor = "[B")
	private final byte[] aByteArray11;

	@OriginalMember(owner = "client!du", name = "d", descriptor = "[B")
	private final byte[] aByteArray10;

	@OriginalMember(owner = "client!du", name = "q", descriptor = "J")
	private long aLong76;

	@OriginalMember(owner = "client!du", name = "<init>", descriptor = "(Lclient!qaa;II)V")
	public Class85(@OriginalArg(0) Class281 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass281_1 = arg0;
		this.aLong77 = this.aLong73 = arg0.method6898();
		this.aByteArray11 = new byte[arg2];
		this.aByteArray10 = new byte[arg1];
		this.aLong76 = 0L;
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(I)Ljava/io/File;")
	private File method1842() {
		return this.aClass281_1.method6891();
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(IZI[B)V")
	public void method1843(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if (arg1 > arg2.length) {
				throw new ArrayIndexOutOfBoundsException(arg1 - arg2.length);
			}
			if (this.aLong78 != -1L && this.aLong78 <= this.aLong76 && this.aLong76 + (long) arg1 <= (long) this.anInt2039 + this.aLong78) {
				Static685.method8328(this.aByteArray11, (int) (this.aLong76 - this.aLong78), arg2, 0, arg1);
				this.aLong76 += (long) arg1;
				return;
			}
			@Pc(76) long local76 = this.aLong76;
			@Pc(80) int local80 = arg1;
			@Pc(112) int local112;
			if (this.aLong75 <= this.aLong76 && this.aLong76 < this.aLong75 + (long) this.anInt2035) {
				local112 = (int) ((long) this.anInt2035 + this.aLong75 - this.aLong76);
				if (arg1 < local112) {
					local112 = arg1;
				}
				Static685.method8328(this.aByteArray10, (int) (this.aLong76 - this.aLong75), arg2, 0, local112);
				this.aLong76 += (long) local112;
				arg0 = local112;
				arg1 -= local112;
			}
			if (arg1 > this.aByteArray10.length) {
				this.aClass281_1.method6896(this.aLong76);
				this.aLong74 = this.aLong76;
				while (arg1 > 0) {
					local112 = this.aClass281_1.method6895(arg2, arg1, arg0);
					if (local112 == -1) {
						break;
					}
					this.aLong74 += (long) local112;
					arg1 -= local112;
					arg0 += local112;
					this.aLong76 += (long) local112;
				}
			} else if (arg1 > 0) {
				this.method1844();
				local112 = arg1;
				if (arg1 > this.anInt2035) {
					local112 = this.anInt2035;
				}
				Static685.method8328(this.aByteArray10, 0, arg2, arg0, local112);
				arg0 += local112;
				arg1 -= local112;
				this.aLong76 += (long) local112;
			}
			if (this.aLong78 != -1L) {
				if (this.aLong76 < this.aLong78 && arg1 > 0) {
					local112 = arg0 + (int) (this.aLong78 - this.aLong76);
					if (local112 > arg0 + arg1) {
						local112 = arg1 + arg0;
					}
					while (arg0 < local112) {
						arg1--;
						arg2[arg0++] = 0;
						this.aLong76++;
					}
				}
				@Pc(319) long local319 = -1L;
				@Pc(321) long local321 = -1L;
				if (this.aLong78 >= local76 && this.aLong78 < local76 + (long) local80) {
					local319 = this.aLong78;
				} else if (this.aLong78 <= local76 && this.aLong78 + (long) this.anInt2039 > local76) {
					local319 = local76;
				}
				if (this.aLong78 + (long) this.anInt2039 > local76 && local76 + (long) local80 >= this.aLong78 + (long) this.anInt2039) {
					local321 = this.aLong78 + (long) this.anInt2039;
				} else if (this.aLong78 < (long) local80 + local76 && (long) local80 + local76 <= this.aLong78 - -((long) this.anInt2039)) {
					local321 = (long) local80 + local76;
				}
				if (local319 > -1L && local321 > local319) {
					@Pc(446) int local446 = (int) (local321 - local319);
					Static685.method8328(this.aByteArray11, (int) (local319 - this.aLong78), arg2, (int) (local319 - local76), local446);
					if (this.aLong76 < local321) {
						arg1 = (int) ((long) arg1 + this.aLong76 - local321);
						this.aLong76 = local321;
					}
				}
			}
		} catch (@Pc(488) IOException local488) {
			this.aLong74 = -1L;
			throw local488;
		}
		if (arg1 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(Z)V")
	private void method1844() throws IOException {
		this.anInt2035 = 0;
		if (this.aLong74 != this.aLong76) {
			this.aClass281_1.method6896(this.aLong76);
			this.aLong74 = this.aLong76;
		}
		this.aLong75 = this.aLong76;
		while (this.aByteArray10.length > this.anInt2035) {
			@Pc(44) int local44 = this.aByteArray10.length - this.anInt2035;
			if (local44 > 200000000) {
				local44 = 200000000;
			}
			@Pc(61) int local61 = this.aClass281_1.method6895(this.aByteArray10, local44, this.anInt2035);
			if (local61 == -1) {
				break;
			}
			this.aLong74 += (long) local61;
			this.anInt2035 += local61;
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "([BI)V")
	public void method1846(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method1843(0, arg0.length, arg0);
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(JZ)V")
	public void method1847(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method1842());
		}
		this.aLong76 = arg0;
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(B)V")
	public void method1848() throws IOException {
		this.method1850();
		this.aClass281_1.method6893();
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(I[BBI)V")
	public void method1849(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if ((long) arg0 + this.aLong76 > this.aLong77) {
				this.aLong77 = this.aLong76 + (long) arg0;
			}
			if (this.aLong78 != -1L && (this.aLong78 > this.aLong76 || this.aLong78 + (long) this.anInt2039 < this.aLong76)) {
				this.method1850();
			}
			if (this.aLong78 != -1L && this.aLong76 + (long) arg0 > this.aLong78 + (long) this.aByteArray11.length) {
				@Pc(89) int local89 = (int) (this.aLong78 + (long) this.aByteArray11.length - this.aLong76);
				Static685.method8328(arg1, arg2, this.aByteArray11, (int) (this.aLong76 - this.aLong78), local89);
				arg2 += local89;
				this.aLong76 += (long) local89;
				arg0 -= local89;
				this.anInt2039 = this.aByteArray11.length;
				this.method1850();
			}
			if (arg0 > this.aByteArray11.length) {
				if (this.aLong76 != this.aLong74) {
					this.aClass281_1.method6896(this.aLong76);
					this.aLong74 = this.aLong76;
				}
				this.aClass281_1.method6892(arg0, arg2, arg1);
				this.aLong74 += (long) arg0;
				if (this.aLong73 < this.aLong74) {
					this.aLong73 = this.aLong74;
				}
				@Pc(176) long local176 = -1L;
				@Pc(178) long local178 = -1L;
				if (this.aLong76 >= this.aLong75 && this.aLong76 < this.aLong75 + (long) this.anInt2035) {
					local176 = this.aLong76;
				} else if (this.aLong75 >= this.aLong76 && this.aLong75 < this.aLong76 + (long) arg0) {
					local176 = this.aLong75;
				}
				if (this.aLong75 < (long) arg0 + this.aLong76 && (long) arg0 + this.aLong76 <= this.aLong75 + (long) this.anInt2035) {
					local178 = (long) arg0 + this.aLong76;
				} else if (this.aLong76 < (long) this.anInt2035 + this.aLong75 && this.aLong75 + (long) this.anInt2035 <= (long) arg0 + this.aLong76) {
					local178 = this.aLong75 + (long) this.anInt2035;
				}
				if (local176 > -1L && local178 > local176) {
					@Pc(315) int local315 = (int) (local178 - local176);
					Static685.method8328(arg1, (int) (local176 + (long) arg2 - this.aLong76), this.aByteArray10, (int) (local176 - this.aLong75), local315);
				}
				this.aLong76 += (long) arg0;
			} else if (arg0 > 0) {
				if (this.aLong78 == -1L) {
					this.aLong78 = this.aLong76;
				}
				Static685.method8328(arg1, arg2, this.aByteArray11, (int) (this.aLong76 - this.aLong78), arg0);
				this.aLong76 += (long) arg0;
				if (this.aLong76 - this.aLong78 > (long) this.anInt2039) {
					this.anInt2039 = (int) (this.aLong76 - this.aLong78);
				}
			}
		} catch (@Pc(413) IOException local413) {
			this.aLong74 = -1L;
			throw local413;
		}
	}

	@OriginalMember(owner = "client!du", name = "b", descriptor = "(B)V")
	private void method1850() throws IOException {
		if (this.aLong78 == -1L) {
			return;
		}
		if (this.aLong78 != this.aLong74) {
			this.aClass281_1.method6896(this.aLong78);
			this.aLong74 = this.aLong78;
		}
		this.aClass281_1.method6892(this.anInt2039, 0, this.aByteArray11);
		this.aLong74 += (long) this.anInt2039;
		if (this.aLong73 < this.aLong74) {
			this.aLong73 = this.aLong74;
		}
		@Pc(55) long local55 = -1L;
		@Pc(57) long local57 = -1L;
		if (this.aLong75 <= this.aLong78 && this.aLong78 < this.aLong75 + (long) this.anInt2035) {
			local55 = this.aLong78;
		} else if (this.aLong75 >= this.aLong78 && this.aLong78 + (long) this.anInt2039 > this.aLong75) {
			local55 = this.aLong75;
		}
		if (this.aLong75 < (long) this.anInt2039 + this.aLong78 && (long) this.anInt2039 + this.aLong78 <= (long) this.anInt2035 + this.aLong75) {
			local57 = this.aLong78 + (long) this.anInt2039;
		} else if (this.aLong78 < this.aLong75 + (long) this.anInt2035 && (long) this.anInt2035 + this.aLong75 <= this.aLong78 - -((long) this.anInt2039)) {
			local57 = this.aLong75 + (long) this.anInt2035;
		}
		if (local55 > -1L && local55 < local57) {
			@Pc(201) int local201 = (int) (local57 - local55);
			Static685.method8328(this.aByteArray11, (int) (local55 - this.aLong78), this.aByteArray10, (int) (local55 - this.aLong75), local201);
		}
		this.aLong78 = -1L;
		this.anInt2039 = 0;
	}

	@OriginalMember(owner = "client!du", name = "c", descriptor = "(B)J")
	public long method1851() {
		return this.aLong77;
	}
}
