import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class Class88 {

	@OriginalMember(owner = "client!v", name = "e", descriptor = "I")
	private int anInt3981;

	@OriginalMember(owner = "client!v", name = "A", descriptor = "J")
	private long aLong149;

	@OriginalMember(owner = "client!v", name = "v", descriptor = "J")
	private long aLong148 = -1L;

	@OriginalMember(owner = "client!v", name = "s", descriptor = "I")
	private int anInt3990 = 0;

	@OriginalMember(owner = "client!v", name = "f", descriptor = "J")
	private long aLong146 = -1L;

	@OriginalMember(owner = "client!v", name = "y", descriptor = "Lclient!qa;")
	private final Class70 aClass70_4;

	@OriginalMember(owner = "client!v", name = "c", descriptor = "J")
	private long aLong144;

	@OriginalMember(owner = "client!v", name = "d", descriptor = "J")
	private long aLong145;

	@OriginalMember(owner = "client!v", name = "m", descriptor = "[B")
	private final byte[] aByteArray45;

	@OriginalMember(owner = "client!v", name = "l", descriptor = "J")
	private long aLong147;

	@OriginalMember(owner = "client!v", name = "o", descriptor = "[B")
	private final byte[] aByteArray46;

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Lclient!qa;II)V")
	public Class88(@OriginalArg(0) Class70 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass70_4 = arg0;
		this.aLong145 = this.aLong144 = arg0.method2443();
		this.aByteArray45 = new byte[arg1];
		this.aLong147 = 0L;
		this.aByteArray46 = new byte[arg2];
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(B)Ljava/io/File;")
	private File method2920() {
		return this.aClass70_4.method2440();
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V")
	private void method2922() throws IOException {
		if (this.aLong148 == -1L) {
			return;
		}
		if (this.aLong148 != this.aLong149) {
			this.aClass70_4.method2438(this.aLong148);
			this.aLong149 = this.aLong148;
		}
		this.aClass70_4.method2439(this.aByteArray46, this.anInt3990, 0);
		this.aLong149 += this.anInt3990;
		if (this.aLong149 > this.aLong144) {
			this.aLong144 = this.aLong149;
		}
		@Pc(59) long local59 = -1L;
		@Pc(61) long local61 = -1L;
		if (this.aLong148 >= this.aLong146 && (long) this.anInt3981 + this.aLong146 > this.aLong148) {
			local61 = this.aLong148;
		} else if (this.aLong148 <= this.aLong146 && this.aLong148 + (long) this.anInt3990 > this.aLong146) {
			local61 = this.aLong146;
		}
		if (this.aLong146 < (long) this.anInt3990 + this.aLong148 && this.aLong148 + (long) this.anInt3990 <= this.aLong146 + (long) this.anInt3981) {
			local59 = this.aLong148 + (long) this.anInt3990;
		} else if (this.aLong148 < this.aLong146 + (long) this.anInt3981 && this.aLong148 + (long) this.anInt3990 >= (long) this.anInt3981 + this.aLong146) {
			local59 = this.aLong146 + (long) this.anInt3981;
		}
		if (local61 > -1L && local61 < local59) {
			@Pc(197) int local197 = (int) (local59 - local61);
			Static193.method2480(this.aByteArray46, (int) (local61 - this.aLong148), this.aByteArray45, (int) (local61 - this.aLong146), local197);
		}
		this.aLong148 = -1L;
		this.anInt3990 = 0;
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(I)V")
	private void method2923() throws IOException {
		this.anInt3981 = 0;
		if (this.aLong149 != this.aLong147) {
			this.aClass70_4.method2438(this.aLong147);
			this.aLong149 = this.aLong147;
		}
		this.aLong146 = this.aLong147;
		while (this.aByteArray45.length > this.anInt3981) {
			@Pc(50) int local50 = this.aClass70_4.method2441(this.aByteArray45.length - this.anInt3981, this.aByteArray45, this.anInt3981);
			if (local50 == -1) {
				break;
			}
			this.aLong149 += local50;
			this.anInt3981 += local50;
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Z[B)V")
	public void method2926(@OriginalArg(1) byte[] arg0) throws IOException {
		this.method2931(arg0.length, arg0, 0);
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(III[B)V")
	public void method2927(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if ((long) arg1 + this.aLong147 > this.aLong145) {
				this.aLong145 = (long) arg1 + this.aLong147;
			}
			if (this.aLong148 != -1L && (this.aLong148 > this.aLong147 || (long) this.anInt3990 + this.aLong148 < this.aLong147)) {
				this.method2922();
			}
			if (this.aLong148 != -1L && (long) this.aByteArray46.length + this.aLong148 < this.aLong147 - -((long) arg1)) {
				@Pc(92) int local92 = (int) ((long) this.aByteArray46.length + this.aLong148 - this.aLong147);
				arg1 -= local92;
				Static193.method2480(arg2, arg0, this.aByteArray46, (int) (this.aLong147 - this.aLong148), local92);
				this.aLong147 += local92;
				arg0 += local92;
				this.anInt3990 = this.aByteArray46.length;
				this.method2922();
			}
			if (this.aByteArray46.length < arg1) {
				if (this.aLong149 != this.aLong147) {
					this.aClass70_4.method2438(this.aLong147);
					this.aLong149 = this.aLong147;
				}
				this.aClass70_4.method2439(arg2, arg1, arg0);
				@Pc(162) long local162 = -1L;
				if (this.aLong146 <= this.aLong147 && this.aLong146 + (long) this.anInt3981 > this.aLong147) {
					local162 = this.aLong147;
				} else if (this.aLong147 <= this.aLong146 && this.aLong147 + (long) arg1 > this.aLong146) {
					local162 = this.aLong146;
				}
				this.aLong149 += arg1;
				if (this.aLong144 < this.aLong149) {
					this.aLong144 = this.aLong149;
				}
				@Pc(226) long local226 = -1L;
				if (this.aLong147 + (long) arg1 > this.aLong146 && (long) this.anInt3981 + this.aLong146 >= (long) arg1 + this.aLong147) {
					local226 = (long) arg1 + this.aLong147;
				} else if ((long) this.anInt3981 + this.aLong146 > this.aLong147 && this.aLong147 + (long) arg1 >= this.aLong146 - -((long) this.anInt3981)) {
					local226 = this.aLong146 + (long) this.anInt3981;
				}
				if (local162 > -1L && local226 > local162) {
					@Pc(320) int local320 = (int) (local226 - local162);
					Static193.method2480(arg2, (int) (local162 + (long) arg0 - this.aLong147), this.aByteArray45, (int) (local162 - this.aLong146), local320);
				}
				this.aLong147 += arg1;
			} else if (arg1 > 0) {
				if (this.aLong148 == -1L) {
					this.aLong148 = this.aLong147;
				}
				Static193.method2480(arg2, arg0, this.aByteArray46, (int) (this.aLong147 - this.aLong148), arg1);
				this.aLong147 += arg1;
				if (this.aLong147 - this.aLong148 > (long) this.anInt3990) {
					this.anInt3990 = (int) (this.aLong147 - this.aLong148);
				}
			}
		} catch (@Pc(409) IOException local409) {
			this.aLong149 = -1L;
			throw local409;
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(BJ)V")
	public void method2928(@OriginalArg(1) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method2920());
		}
		this.aLong147 = arg0;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Z)J")
	public long method2929() {
		return this.aLong145;
	}

	@OriginalMember(owner = "client!v", name = "d", descriptor = "(I)V")
	public void method2930() throws IOException {
		this.method2922();
		this.aClass70_4.method2442();
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(II[BI)V")
	public void method2931(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg1.length < arg0) {
				throw new ArrayIndexOutOfBoundsException(arg0 - arg1.length);
			}
			if (this.aLong148 != -1L && this.aLong147 >= this.aLong148 && (long) arg0 + this.aLong147 <= this.aLong148 + (long) this.anInt3990) {
				Static193.method2480(this.aByteArray46, (int) (this.aLong147 - this.aLong148), arg1, 0, arg0);
				this.aLong147 += arg0;
				return;
			}
			@Pc(86) long local86 = this.aLong147;
			@Pc(90) int local90 = arg0;
			@Pc(118) int local118;
			if (this.aLong146 <= this.aLong147 && this.aLong147 < (long) this.anInt3981 + this.aLong146) {
				local118 = (int) (this.aLong146 + (long) this.anInt3981 - this.aLong147);
				if (arg0 < local118) {
					local118 = arg0;
				}
				arg0 -= local118;
				Static193.method2480(this.aByteArray45, (int) (this.aLong147 - this.aLong146), arg1, 0, local118);
				this.aLong147 += local118;
				arg2 = local118;
			}
			if (arg0 > this.aByteArray45.length) {
				this.aClass70_4.method2438(this.aLong147);
				this.aLong149 = this.aLong147;
				while (arg0 > 0) {
					local118 = this.aClass70_4.method2441(arg0, arg1, arg2);
					if (local118 == -1) {
						break;
					}
					arg0 -= local118;
					this.aLong149 += local118;
					this.aLong147 += local118;
					arg2 += local118;
				}
			} else if (arg0 > 0) {
				this.method2923();
				local118 = arg0;
				if (this.anInt3981 < arg0) {
					local118 = this.anInt3981;
				}
				arg0 -= local118;
				Static193.method2480(this.aByteArray45, 0, arg1, arg2, local118);
				this.aLong147 += local118;
				arg2 += local118;
			}
			if (this.aLong148 != -1L) {
				if (this.aLong148 > this.aLong147 && arg0 > 0) {
					local118 = arg2 + (int) (this.aLong148 - this.aLong147);
					if (arg0 + arg2 < local118) {
						local118 = arg0 + arg2;
					}
					while (local118 > arg2) {
						arg0--;
						arg1[arg2++] = 0;
						this.aLong147++;
					}
				}
				@Pc(310) long local310 = -1L;
				if (local86 < (long) this.anInt3990 + this.aLong148 && (long) this.anInt3990 + this.aLong148 <= (long) local90 + local86) {
					local310 = (long) this.anInt3990 + this.aLong148;
				} else if (this.aLong148 < local86 + (long) local90 && (long) this.anInt3990 + this.aLong148 >= local86 - -((long) local90)) {
					local310 = local86 + (long) local90;
				}
				@Pc(381) long local381 = -1L;
				if (this.aLong148 >= local86 && (long) local90 + local86 > this.aLong148) {
					local381 = this.aLong148;
				} else if (local86 >= this.aLong148 && local86 < this.aLong148 + (long) this.anInt3990) {
					local381 = local86;
				}
				if (local381 > -1L && local381 < local310) {
					@Pc(442) int local442 = (int) (local310 - local381);
					Static193.method2480(this.aByteArray46, (int) (local381 - this.aLong148), arg1, (int) (local381 - local86), local442);
					if (local310 > this.aLong147) {
						arg0 = (int) ((long) arg0 + this.aLong147 - local310);
						this.aLong147 = local310;
					}
				}
			}
		} catch (@Pc(483) IOException local483) {
			this.aLong149 = -1L;
			throw local483;
		}
		if (arg0 > 0) {
			throw new EOFException();
		}
	}
}
