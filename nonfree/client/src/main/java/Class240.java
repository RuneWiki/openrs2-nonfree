import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!up")
public final class Class240 {

	@OriginalMember(owner = "client!up", name = "J", descriptor = "[Lclient!dg;")
	private static final Class49[] aClass49Array1 = new Class49[32];

	@OriginalMember(owner = "client!up", name = "l", descriptor = "I")
	private int anInt7094;

	@OriginalMember(owner = "client!up", name = "q", descriptor = "J")
	private long aLong209;

	@OriginalMember(owner = "client!up", name = "p", descriptor = "J")
	private long aLong208 = -1L;

	@OriginalMember(owner = "client!up", name = "e", descriptor = "I")
	private int anInt7089 = 0;

	@OriginalMember(owner = "client!up", name = "y", descriptor = "J")
	private long aLong210 = -1L;

	@OriginalMember(owner = "client!up", name = "u", descriptor = "Lclient!rq;")
	private final Class203 aClass203_4;

	@OriginalMember(owner = "client!up", name = "o", descriptor = "J")
	private long aLong207;

	@OriginalMember(owner = "client!up", name = "g", descriptor = "J")
	private long aLong205;

	@OriginalMember(owner = "client!up", name = "s", descriptor = "[B")
	private final byte[] aByteArray74;

	@OriginalMember(owner = "client!up", name = "z", descriptor = "[B")
	private final byte[] aByteArray75;

	@OriginalMember(owner = "client!up", name = "i", descriptor = "J")
	private long aLong206;

	static {
		@Pc(369) Class49[] local369 = Static52.method1080();
		for (@Pc(371) int local371 = 0; local371 < local369.length; local371++) {
			aClass49Array1[local369[local371].anInt1611] = local369[local371];
		}
	}

	@OriginalMember(owner = "client!up", name = "<init>", descriptor = "(Lclient!rq;II)V")
	public Class240(@OriginalArg(0) Class203 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass203_4 = arg0;
		this.aLong205 = this.aLong207 = arg0.method4991();
		this.aByteArray74 = new byte[arg2];
		this.aByteArray75 = new byte[arg1];
		this.aLong206 = 0L;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(I[B)V")
	public void method5501(@OriginalArg(1) byte[] arg0) throws IOException {
		this.method5510(arg0, arg0.length, 0);
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "([BIII)V")
	public void method5503(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if (this.aLong205 < this.aLong206 + (long) arg2) {
				this.aLong205 = (long) arg2 + this.aLong206;
			}
			if (this.aLong208 != -1L && (this.aLong208 > this.aLong206 || this.aLong208 + (long) this.anInt7089 < this.aLong206)) {
				this.method5509();
			}
			if (this.aLong208 != -1L && this.aLong208 + (long) this.aByteArray74.length < (long) arg2 + this.aLong206) {
				@Pc(92) int local92 = (int) (this.aLong208 + (long) this.aByteArray74.length - this.aLong206);
				Static464.method5797(arg0, arg1, this.aByteArray74, (int) (this.aLong206 - this.aLong208), local92);
				arg2 -= local92;
				this.aLong206 += local92;
				arg1 += local92;
				this.anInt7089 = this.aByteArray74.length;
				this.method5509();
			}
			if (arg2 > this.aByteArray74.length) {
				if (this.aLong206 != this.aLong209) {
					this.aClass203_4.method4992(this.aLong206);
					this.aLong209 = this.aLong206;
				}
				this.aClass203_4.method4996(arg2, arg1, arg0);
				this.aLong209 += arg2;
				if (this.aLong207 < this.aLong209) {
					this.aLong207 = this.aLong209;
				}
				@Pc(183) long local183 = -1L;
				@Pc(185) long local185 = -1L;
				if (this.aLong210 <= this.aLong206 && this.aLong210 + (long) this.anInt7094 > this.aLong206) {
					local183 = this.aLong206;
				} else if (this.aLong206 <= this.aLong210 && this.aLong206 + (long) arg2 > this.aLong210) {
					local183 = this.aLong210;
				}
				if (this.aLong206 + (long) arg2 > this.aLong210 && (long) this.anInt7094 + this.aLong210 >= this.aLong206 - -((long) arg2)) {
					local185 = (long) arg2 + this.aLong206;
				} else if (this.aLong206 < (long) this.anInt7094 + this.aLong210 && (long) arg2 + this.aLong206 >= this.aLong210 - -((long) this.anInt7094)) {
					local185 = this.aLong210 + (long) this.anInt7094;
				}
				if (local183 > -1L && local185 > local183) {
					@Pc(323) int local323 = (int) (local185 - local183);
					Static464.method5797(arg0, (int) ((long) arg1 + local183 - this.aLong206), this.aByteArray75, (int) (local183 - this.aLong210), local323);
				}
				this.aLong206 += arg2;
			} else if (arg2 > 0) {
				if (this.aLong208 == -1L) {
					this.aLong208 = this.aLong206;
				}
				Static464.method5797(arg0, arg1, this.aByteArray74, (int) (this.aLong206 - this.aLong208), arg2);
				this.aLong206 += arg2;
				if (this.aLong206 - this.aLong208 > (long) this.anInt7089) {
					this.anInt7089 = (int) (this.aLong206 - this.aLong208);
				}
			}
		} catch (@Pc(411) IOException local411) {
			this.aLong209 = -1L;
			throw local411;
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IJ)V")
	public void method5504(@OriginalArg(1) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method5508());
		}
		this.aLong206 = arg0;
	}

	@OriginalMember(owner = "client!up", name = "b", descriptor = "(I)J")
	public long method5507() {
		return this.aLong205;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(B)Ljava/io/File;")
	private File method5508() {
		return this.aClass203_4.method4995();
	}

	@OriginalMember(owner = "client!up", name = "c", descriptor = "(I)V")
	private void method5509() throws IOException {
		if (this.aLong208 == -1L) {
			return;
		}
		if (this.aLong208 != this.aLong209) {
			this.aClass203_4.method4992(this.aLong208);
			this.aLong209 = this.aLong208;
		}
		this.aClass203_4.method4996(this.anInt7089, 0, this.aByteArray74);
		this.aLong209 += this.anInt7089;
		if (this.aLong209 > this.aLong207) {
			this.aLong207 = this.aLong209;
		}
		@Pc(53) long local53 = -1L;
		@Pc(55) long local55 = -1L;
		if (this.aLong208 >= this.aLong210 && (long) this.anInt7094 + this.aLong210 > this.aLong208) {
			local53 = this.aLong208;
		} else if (this.aLong208 <= this.aLong210 && this.aLong208 + (long) this.anInt7089 > this.aLong210) {
			local53 = this.aLong210;
		}
		if (this.aLong208 + (long) this.anInt7089 > this.aLong210 && this.aLong208 + (long) this.anInt7089 <= (long) this.anInt7094 + this.aLong210) {
			local55 = (long) this.anInt7089 + this.aLong208;
		} else if ((long) this.anInt7094 + this.aLong210 > this.aLong208 && this.aLong208 + (long) this.anInt7089 >= this.aLong210 + (long) this.anInt7094) {
			local55 = this.aLong210 + (long) this.anInt7094;
		}
		if (local53 > -1L && local55 > local53) {
			@Pc(196) int local196 = (int) (local55 - local53);
			Static464.method5797(this.aByteArray74, (int) (local53 - this.aLong208), this.aByteArray75, (int) (local53 - this.aLong210), local196);
		}
		this.aLong208 = -1L;
		this.anInt7089 = 0;
	}

	@OriginalMember(owner = "client!up", name = "b", descriptor = "([BIII)V")
	public void method5510(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg0.length < arg1) {
				throw new ArrayIndexOutOfBoundsException(arg1 - arg0.length);
			}
			if (this.aLong208 != -1L && this.aLong208 <= this.aLong206 && (long) this.anInt7089 + this.aLong208 >= this.aLong206 + (long) arg1) {
				Static464.method5797(this.aByteArray74, (int) (this.aLong206 - this.aLong208), arg0, 0, arg1);
				this.aLong206 += arg1;
				return;
			}
			@Pc(77) long local77 = this.aLong206;
			@Pc(81) int local81 = arg1;
			@Pc(114) int local114;
			if (this.aLong206 >= this.aLong210 && this.aLong210 + (long) this.anInt7094 > this.aLong206) {
				local114 = (int) ((long) this.anInt7094 + this.aLong210 - this.aLong206);
				if (arg1 < local114) {
					local114 = arg1;
				}
				Static464.method5797(this.aByteArray75, (int) (this.aLong206 - this.aLong210), arg0, 0, local114);
				arg2 = local114;
				arg1 -= local114;
				this.aLong206 += local114;
			}
			if (arg1 > this.aByteArray75.length) {
				this.aClass203_4.method4992(this.aLong206);
				this.aLong209 = this.aLong206;
				while (arg1 > 0) {
					local114 = this.aClass203_4.method4994(arg2, arg1, arg0);
					if (local114 == -1) {
						break;
					}
					arg2 += local114;
					this.aLong209 += local114;
					this.aLong206 += local114;
					arg1 -= local114;
				}
			} else if (arg1 > 0) {
				this.method5511();
				local114 = arg1;
				if (this.anInt7094 < arg1) {
					local114 = this.anInt7094;
				}
				Static464.method5797(this.aByteArray75, 0, arg0, arg2, local114);
				arg2 += local114;
				this.aLong206 += local114;
				arg1 -= local114;
			}
			if (this.aLong208 != -1L) {
				if (this.aLong208 > this.aLong206 && arg1 > 0) {
					local114 = arg2 + (int) (this.aLong208 - this.aLong206);
					if (local114 > arg1 + arg2) {
						local114 = arg2 + arg1;
					}
					while (local114 > arg2) {
						arg0[arg2++] = 0;
						arg1--;
						this.aLong206++;
					}
				}
				@Pc(296) long local296 = -1L;
				@Pc(298) long local298 = -1L;
				if (this.aLong208 >= local77 && this.aLong208 < local77 + (long) local81) {
					local296 = this.aLong208;
				} else if (this.aLong208 <= local77 && local77 < this.aLong208 + (long) this.anInt7089) {
					local296 = local77;
				}
				if ((long) this.anInt7089 + this.aLong208 > local77 && (long) local81 + local77 >= (long) this.anInt7089 + this.aLong208) {
					local298 = this.aLong208 + (long) this.anInt7089;
				} else if (this.aLong208 < (long) local81 + local77 && (long) this.anInt7089 + this.aLong208 >= local77 - -((long) local81)) {
					local298 = (long) local81 + local77;
				}
				if (local296 > -1L && local296 < local298) {
					@Pc(427) int local427 = (int) (local298 - local296);
					Static464.method5797(this.aByteArray74, (int) (local296 - this.aLong208), arg0, (int) (local296 - local77), local427);
					if (this.aLong206 < local298) {
						arg1 = (int) ((long) arg1 + this.aLong206 - local298);
						this.aLong206 = local298;
					}
				}
			}
		} catch (@Pc(464) IOException local464) {
			this.aLong209 = -1L;
			throw local464;
		}
		if (arg1 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!up", name = "d", descriptor = "(I)V")
	private void method5511() throws IOException {
		this.anInt7094 = 0;
		if (this.aLong209 != this.aLong206) {
			this.aClass203_4.method4992(this.aLong206);
			this.aLong209 = this.aLong206;
		}
		this.aLong210 = this.aLong206;
		while (this.aByteArray75.length > this.anInt7094) {
			@Pc(37) int local37 = this.aByteArray75.length - this.anInt7094;
			if (local37 > 200000000) {
				local37 = 200000000;
			}
			@Pc(54) int local54 = this.aClass203_4.method4994(this.anInt7094, local37, this.aByteArray75);
			if (local54 == -1) {
				break;
			}
			this.aLong209 += local54;
			this.anInt7094 += local54;
		}
	}
}
