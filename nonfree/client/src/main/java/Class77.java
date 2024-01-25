import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fp")
public final class Class77 {

	@OriginalMember(owner = "client!fp", name = "m", descriptor = "I")
	private int anInt2282;

	@OriginalMember(owner = "client!fp", name = "r", descriptor = "J")
	private long aLong77;

	@OriginalMember(owner = "client!fp", name = "f", descriptor = "J")
	private long aLong74 = -1L;

	@OriginalMember(owner = "client!fp", name = "s", descriptor = "J")
	private long aLong78 = -1L;

	@OriginalMember(owner = "client!fp", name = "w", descriptor = "I")
	private int anInt2288 = 0;

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "Lclient!vk;")
	private final Class207 aClass207_4;

	@OriginalMember(owner = "client!fp", name = "i", descriptor = "J")
	private long aLong75;

	@OriginalMember(owner = "client!fp", name = "j", descriptor = "J")
	private long aLong76;

	@OriginalMember(owner = "client!fp", name = "x", descriptor = "[B")
	private final byte[] aByteArray26;

	@OriginalMember(owner = "client!fp", name = "v", descriptor = "[B")
	private final byte[] aByteArray25;

	@OriginalMember(owner = "client!fp", name = "z", descriptor = "J")
	private long aLong79;

	@OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(Lclient!vk;II)V")
	public Class77(@OriginalArg(0) Class207 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass207_4 = arg0;
		this.aLong76 = this.aLong75 = arg0.method5332();
		this.aByteArray26 = new byte[arg1];
		this.aByteArray25 = new byte[arg2];
		this.aLong79 = 0L;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(B)V")
	private void method1868() throws IOException {
		this.anInt2282 = 0;
		if (this.aLong77 != this.aLong79) {
			this.aClass207_4.method5335(this.aLong79);
			this.aLong77 = this.aLong79;
		}
		this.aLong78 = this.aLong79;
		while (this.aByteArray26.length > this.anInt2282) {
			@Pc(43) int local43 = this.aByteArray26.length - this.anInt2282;
			if (local43 > 200000000) {
				local43 = 200000000;
			}
			@Pc(60) int local60 = this.aClass207_4.method5333(this.aByteArray26, local43, this.anInt2282);
			if (local60 == -1) {
				break;
			}
			this.anInt2282 += local60;
			this.aLong77 += local60;
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(JI)V")
	public void method1871(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method1876());
		}
		this.aLong79 = arg0;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(I)V")
	private void method1872() throws IOException {
		if (this.aLong74 == -1L) {
			return;
		}
		if (this.aLong74 != this.aLong77) {
			this.aClass207_4.method5335(this.aLong74);
			this.aLong77 = this.aLong74;
		}
		this.aClass207_4.method5337(this.aByteArray25, 0, this.anInt2288);
		this.aLong77 += this.anInt2288;
		if (this.aLong75 < this.aLong77) {
			this.aLong75 = this.aLong77;
		}
		@Pc(57) long local57 = -1L;
		if (this.aLong78 <= this.aLong74 && this.aLong78 + (long) this.anInt2282 > this.aLong74) {
			local57 = this.aLong74;
		} else if (this.aLong74 <= this.aLong78 && this.aLong78 < this.aLong74 + (long) this.anInt2288) {
			local57 = this.aLong78;
		}
		@Pc(99) long local99 = -1L;
		if (this.aLong78 < this.aLong74 + (long) this.anInt2288 && (long) this.anInt2288 + this.aLong74 <= this.aLong78 + (long) this.anInt2282) {
			local99 = this.aLong74 + (long) this.anInt2288;
		} else if (this.aLong74 < this.aLong78 + (long) this.anInt2282 && this.aLong74 + (long) this.anInt2288 >= (long) this.anInt2282 + this.aLong78) {
			local99 = this.aLong78 + (long) this.anInt2282;
		}
		if (local57 > -1L && local57 < local99) {
			@Pc(186) int local186 = (int) (local99 - local57);
			Static366.method4202(this.aByteArray25, (int) (local57 - this.aLong74), this.aByteArray26, (int) (local57 - this.aLong78), local186);
		}
		this.anInt2288 = 0;
		this.aLong74 = -1L;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(I[BBI)V")
	public void method1873(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg2 > arg1.length) {
				throw new ArrayIndexOutOfBoundsException(arg2 - arg1.length);
			}
			if (this.aLong74 != -1L && this.aLong79 >= this.aLong74 && (long) this.anInt2288 + this.aLong74 >= this.aLong79 - -((long) arg2)) {
				Static366.method4202(this.aByteArray25, (int) (this.aLong79 - this.aLong74), arg1, 0, arg2);
				this.aLong79 += arg2;
				return;
			}
			@Pc(77) long local77 = this.aLong79;
			@Pc(81) int local81 = arg2;
			@Pc(110) int local110;
			if (this.aLong78 <= this.aLong79 && this.aLong79 < (long) this.anInt2282 + this.aLong78) {
				local110 = (int) (this.aLong78 + (long) this.anInt2282 - this.aLong79);
				if (local110 > arg2) {
					local110 = arg2;
				}
				Static366.method4202(this.aByteArray26, (int) (this.aLong79 - this.aLong78), arg1, 0, local110);
				arg0 = local110;
				this.aLong79 += local110;
				arg2 -= local110;
			}
			if (arg2 > this.aByteArray26.length) {
				this.aClass207_4.method5335(this.aLong79);
				this.aLong77 = this.aLong79;
				while (arg2 > 0) {
					local110 = this.aClass207_4.method5333(arg1, arg2, arg0);
					if (local110 == -1) {
						break;
					}
					this.aLong79 += local110;
					arg2 -= local110;
					this.aLong77 += local110;
					arg0 += local110;
				}
			} else if (arg2 > 0) {
				this.method1868();
				local110 = arg2;
				if (arg2 > this.anInt2282) {
					local110 = this.anInt2282;
				}
				Static366.method4202(this.aByteArray26, 0, arg1, arg0, local110);
				arg0 += local110;
				this.aLong79 += local110;
				arg2 -= local110;
			}
			if (this.aLong74 != -1L) {
				if (this.aLong79 < this.aLong74 && arg2 > 0) {
					local110 = (int) (this.aLong74 - this.aLong79) + arg0;
					if (arg2 + arg0 < local110) {
						local110 = arg2 + arg0;
					}
					while (arg0 < local110) {
						arg2--;
						arg1[arg0++] = 0;
						this.aLong79++;
					}
				}
				@Pc(308) long local308 = -1L;
				if (this.aLong74 >= local77 && this.aLong74 < (long) local81 + local77) {
					local308 = this.aLong74;
				} else if (local77 >= this.aLong74 && (long) this.anInt2288 + this.aLong74 > local77) {
					local308 = local77;
				}
				@Pc(343) long local343 = -1L;
				if ((long) this.anInt2288 + this.aLong74 > local77 && (long) this.anInt2288 + this.aLong74 <= local77 - -((long) local81)) {
					local343 = (long) this.anInt2288 + this.aLong74;
				} else if ((long) local81 + local77 > this.aLong74 && this.aLong74 + (long) this.anInt2288 >= local77 + (long) local81) {
					local343 = (long) local81 + local77;
				}
				if (local308 > -1L && local308 < local343) {
					@Pc(422) int local422 = (int) (local343 - local308);
					Static366.method4202(this.aByteArray25, (int) (local308 - this.aLong74), arg1, (int) (local308 - local77), local422);
					if (local343 > this.aLong79) {
						arg2 = (int) ((long) arg2 + this.aLong79 - local343);
						this.aLong79 = local343;
					}
				}
			}
		} catch (@Pc(467) IOException local467) {
			this.aLong77 = -1L;
			throw local467;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(I[B)V")
	public void method1874(@OriginalArg(1) byte[] arg0) throws IOException {
		this.method1873(0, arg0, arg0.length);
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "([BIII)V")
	public void method1875(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (this.aLong76 < this.aLong79 + (long) arg2) {
				this.aLong76 = (long) arg2 + this.aLong79;
			}
			if (this.aLong74 != -1L && (this.aLong74 > this.aLong79 || this.aLong79 > (long) this.anInt2288 + this.aLong74)) {
				this.method1872();
			}
			if (this.aLong74 != -1L && (long) arg2 + this.aLong79 > this.aLong74 - -((long) this.aByteArray25.length)) {
				@Pc(92) int local92 = (int) (this.aLong74 + (long) this.aByteArray25.length - this.aLong79);
				Static366.method4202(arg0, arg1, this.aByteArray25, (int) (this.aLong79 - this.aLong74), local92);
				arg1 += local92;
				this.aLong79 += local92;
				arg2 -= local92;
				this.anInt2288 = this.aByteArray25.length;
				this.method1872();
			}
			if (arg2 > this.aByteArray25.length) {
				if (this.aLong77 != this.aLong79) {
					this.aClass207_4.method5335(this.aLong79);
					this.aLong77 = this.aLong79;
				}
				this.aClass207_4.method5337(arg0, arg1, arg2);
				this.aLong77 += arg2;
				if (this.aLong75 < this.aLong77) {
					this.aLong75 = this.aLong77;
				}
				@Pc(178) long local178 = -1L;
				@Pc(180) long local180 = -1L;
				if (this.aLong79 >= this.aLong78 && this.aLong79 < this.aLong78 + (long) this.anInt2282) {
					local178 = this.aLong79;
				} else if (this.aLong79 <= this.aLong78 && this.aLong78 < this.aLong79 + (long) arg2) {
					local178 = this.aLong78;
				}
				if (this.aLong78 < this.aLong79 + (long) arg2 && (long) arg2 + this.aLong79 <= this.aLong78 - -((long) this.anInt2282)) {
					local180 = (long) arg2 + this.aLong79;
				} else if ((long) this.anInt2282 + this.aLong78 > this.aLong79 && this.aLong78 + (long) this.anInt2282 <= (long) arg2 + this.aLong79) {
					local180 = (long) this.anInt2282 + this.aLong78;
				}
				if (local178 > -1L && local178 < local180) {
					@Pc(304) int local304 = (int) (local180 - local178);
					Static366.method4202(arg0, (int) (local178 + (long) arg1 - this.aLong79), this.aByteArray26, (int) (local178 - this.aLong78), local304);
				}
				this.aLong79 += arg2;
			} else if (arg2 > 0) {
				if (this.aLong74 == -1L) {
					this.aLong74 = this.aLong79;
				}
				Static366.method4202(arg0, arg1, this.aByteArray25, (int) (this.aLong79 - this.aLong74), arg2);
				this.aLong79 += arg2;
				if ((long) this.anInt2288 < this.aLong79 - this.aLong74) {
					this.anInt2288 = (int) (this.aLong79 - this.aLong74);
				}
			}
		} catch (@Pc(394) IOException local394) {
			this.aLong77 = -1L;
			throw local394;
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(Z)Ljava/io/File;")
	private File method1876() {
		return this.aClass207_4.method5334();
	}

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "(B)J")
	public long method1878() {
		return this.aLong76;
	}
}
