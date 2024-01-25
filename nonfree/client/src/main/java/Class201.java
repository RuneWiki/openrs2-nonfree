import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pt")
public final class Class201 {

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "J")
	private long aLong288;

	@OriginalMember(owner = "client!pt", name = "l", descriptor = "I")
	private int anInt5810;

	@OriginalMember(owner = "client!pt", name = "k", descriptor = "I")
	private int anInt5809 = 0;

	@OriginalMember(owner = "client!pt", name = "s", descriptor = "J")
	private long aLong293 = -1L;

	@OriginalMember(owner = "client!pt", name = "r", descriptor = "J")
	private long aLong292 = -1L;

	@OriginalMember(owner = "client!pt", name = "t", descriptor = "Lclient!rh;")
	private final Class213 aClass213_4;

	@OriginalMember(owner = "client!pt", name = "i", descriptor = "J")
	private long aLong289;

	@OriginalMember(owner = "client!pt", name = "n", descriptor = "J")
	private long aLong291;

	@OriginalMember(owner = "client!pt", name = "v", descriptor = "[B")
	private final byte[] aByteArray62;

	@OriginalMember(owner = "client!pt", name = "j", descriptor = "J")
	private long aLong290;

	@OriginalMember(owner = "client!pt", name = "d", descriptor = "[B")
	private final byte[] aByteArray61;

	static {
		new Class231("Error joining clan channel - please try again later!", "Fehler beim Betreten des Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de clan - veuillez réessayer ultérieurement.", "Erro ao entrar no canal do clã. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!pt", name = "<init>", descriptor = "(Lclient!rh;II)V")
	public Class201(@OriginalArg(0) Class213 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass213_4 = arg0;
		this.aLong291 = this.aLong289 = arg0.method4949();
		this.aByteArray62 = new byte[arg2];
		this.aLong290 = 0L;
		this.aByteArray61 = new byte[arg1];
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(I)V")
	private void method4604() throws IOException {
		if (this.aLong293 == -1L) {
			return;
		}
		if (this.aLong288 != this.aLong293) {
			this.aClass213_4.method4950(this.aLong293);
			this.aLong288 = this.aLong293;
		}
		this.aClass213_4.method4947(this.anInt5809, this.aByteArray62, 0);
		this.aLong288 += this.anInt5809;
		if (this.aLong289 < this.aLong288) {
			this.aLong289 = this.aLong288;
		}
		@Pc(51) long local51 = -1L;
		if (this.aLong292 <= this.aLong293 && this.aLong293 < (long) this.anInt5810 + this.aLong292) {
			local51 = this.aLong293;
		} else if (this.aLong293 <= this.aLong292 && (long) this.anInt5809 + this.aLong293 > this.aLong292) {
			local51 = this.aLong292;
		}
		@Pc(105) long local105 = -1L;
		if ((long) this.anInt5809 + this.aLong293 > this.aLong292 && (long) this.anInt5810 + this.aLong292 >= this.aLong293 - -((long) this.anInt5809)) {
			local105 = (long) this.anInt5809 + this.aLong293;
		} else if (this.aLong293 < this.aLong292 + (long) this.anInt5810 && this.aLong292 + (long) this.anInt5810 <= (long) this.anInt5809 + this.aLong293) {
			local105 = this.aLong292 + (long) this.anInt5810;
		}
		if (local51 > -1L && local51 < local105) {
			@Pc(193) int local193 = (int) (local105 - local51);
			Static472.method5022(this.aByteArray62, (int) (local51 - this.aLong293), this.aByteArray61, (int) (local51 - this.aLong292), local193);
		}
		this.aLong293 = -1L;
		this.anInt5809 = 0;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "([BI)V")
	public void method4605(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method4610(arg0.length, arg0, 0);
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(JI)V")
	public void method4606(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < (long) 0) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method4612());
		}
		this.aLong290 = arg0;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(B)V")
	private void method4608() throws IOException {
		this.anInt5810 = 0;
		if (this.aLong290 != this.aLong288) {
			this.aClass213_4.method4950(this.aLong290);
			this.aLong288 = this.aLong290;
		}
		this.aLong292 = this.aLong290;
		while (this.anInt5810 < this.aByteArray61.length) {
			@Pc(42) int local42 = this.aByteArray61.length - this.anInt5810;
			if (local42 > 200000000) {
				local42 = 200000000;
			}
			@Pc(59) int local59 = this.aClass213_4.method4945(this.aByteArray61, this.anInt5810, local42);
			if (local59 == -1) {
				break;
			}
			this.anInt5810 += local59;
			this.aLong288 += local59;
		}
	}

	@OriginalMember(owner = "client!pt", name = "b", descriptor = "(B)J")
	public long method4609() {
		return this.aLong291;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(ZI[BI)V")
	public void method4610(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg0 > arg1.length) {
				throw new ArrayIndexOutOfBoundsException(arg0 - arg1.length);
			}
			if (this.aLong293 != -1L && this.aLong293 <= this.aLong290 && this.aLong293 + (long) this.anInt5809 >= (long) arg0 + this.aLong290) {
				Static472.method5022(this.aByteArray62, (int) (this.aLong290 - this.aLong293), arg1, 0, arg0);
				this.aLong290 += arg0;
				return;
			}
			@Pc(76) long local76 = this.aLong290;
			@Pc(80) int local80 = arg0;
			@Pc(108) int local108;
			if (this.aLong292 <= this.aLong290 && (long) this.anInt5810 + this.aLong292 > this.aLong290) {
				local108 = (int) ((long) this.anInt5810 + this.aLong292 - this.aLong290);
				if (arg0 < local108) {
					local108 = arg0;
				}
				Static472.method5022(this.aByteArray61, (int) (this.aLong290 - this.aLong292), arg1, 0, local108);
				this.aLong290 += local108;
				arg2 = local108;
				arg0 -= local108;
			}
			if (this.aByteArray61.length < arg0) {
				this.aClass213_4.method4950(this.aLong290);
				this.aLong288 = this.aLong290;
				while (arg0 > 0) {
					local108 = this.aClass213_4.method4945(arg1, arg2, arg0);
					if (local108 == -1) {
						break;
					}
					this.aLong290 += local108;
					this.aLong288 += local108;
					arg0 -= local108;
					arg2 += local108;
				}
			} else if (arg0 > 0) {
				this.method4608();
				local108 = arg0;
				if (arg0 > this.anInt5810) {
					local108 = this.anInt5810;
				}
				Static472.method5022(this.aByteArray61, 0, arg1, arg2, local108);
				arg2 += local108;
				this.aLong290 += local108;
				arg0 -= local108;
			}
			if (this.aLong293 != -1L) {
				if (this.aLong293 > this.aLong290 && arg0 > 0) {
					local108 = arg2 + (int) (this.aLong293 - this.aLong290);
					if (local108 > arg2 + arg0) {
						local108 = arg0 + arg2;
					}
					while (local108 > arg2) {
						arg1[arg2++] = 0;
						arg0--;
						this.aLong290++;
					}
				}
				@Pc(295) long local295 = -1L;
				if (this.aLong293 >= local76 && this.aLong293 < local76 + (long) local80) {
					local295 = this.aLong293;
				} else if (this.aLong293 <= local76 && this.aLong293 + (long) this.anInt5809 > local76) {
					local295 = local76;
				}
				@Pc(332) long local332 = -1L;
				if (local76 < this.aLong293 + (long) this.anInt5809 && this.aLong293 + (long) this.anInt5809 <= local76 + (long) local80) {
					local332 = this.aLong293 + (long) this.anInt5809;
				} else if (this.aLong293 < (long) local80 + local76 && (long) local80 + local76 <= this.aLong293 - -((long) this.anInt5809)) {
					local332 = local76 + (long) local80;
				}
				if (local295 > -1L && local332 > local295) {
					@Pc(413) int local413 = (int) (local332 - local295);
					Static472.method5022(this.aByteArray62, (int) (local295 - this.aLong293), arg1, (int) (local295 - local76), local413);
					if (local332 > this.aLong290) {
						arg0 = (int) ((long) arg0 + this.aLong290 - local332);
						this.aLong290 = local332;
					}
				}
			}
		} catch (@Pc(451) IOException local451) {
			this.aLong288 = -1L;
			throw local451;
		}
		if (arg0 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "([BIII)V")
	public void method4611(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if (this.aLong291 < (long) arg1 + this.aLong290) {
				this.aLong291 = this.aLong290 + (long) arg1;
			}
			if (this.aLong293 != -1L && (this.aLong290 < this.aLong293 || this.aLong290 > (long) this.anInt5809 + this.aLong293)) {
				this.method4604();
			}
			if (this.aLong293 != -1L && this.aLong293 + (long) this.aByteArray62.length < this.aLong290 + (long) arg1) {
				@Pc(84) int local84 = (int) ((long) this.aByteArray62.length + this.aLong293 - this.aLong290);
				Static472.method5022(arg0, arg2, this.aByteArray62, (int) (this.aLong290 - this.aLong293), local84);
				this.aLong290 += local84;
				arg1 -= local84;
				arg2 += local84;
				this.anInt5809 = this.aByteArray62.length;
				this.method4604();
			}
			if (this.aByteArray62.length < arg1) {
				if (this.aLong288 != this.aLong290) {
					this.aClass213_4.method4950(this.aLong290);
					this.aLong288 = this.aLong290;
				}
				this.aClass213_4.method4947(arg1, arg0, arg2);
				this.aLong288 += arg1;
				if (this.aLong288 > this.aLong289) {
					this.aLong289 = this.aLong288;
				}
				@Pc(173) long local173 = -1L;
				@Pc(175) long local175 = -1L;
				if (this.aLong292 <= this.aLong290 && this.aLong290 < this.aLong292 + (long) this.anInt5810) {
					local173 = this.aLong290;
				} else if (this.aLong292 >= this.aLong290 && this.aLong292 < (long) arg1 + this.aLong290) {
					local173 = this.aLong292;
				}
				if (this.aLong292 < (long) arg1 + this.aLong290 && this.aLong292 + (long) this.anInt5810 >= this.aLong290 + (long) arg1) {
					local175 = this.aLong290 + (long) arg1;
				} else if (this.aLong292 + (long) this.anInt5810 > this.aLong290 && this.aLong292 + (long) this.anInt5810 <= (long) arg1 + this.aLong290) {
					local175 = (long) this.anInt5810 + this.aLong292;
				}
				if (local173 > -1L && local173 < local175) {
					@Pc(302) int local302 = (int) (local175 - local173);
					Static472.method5022(arg0, (int) ((long) arg2 + local173 - this.aLong290), this.aByteArray61, (int) (local173 - this.aLong292), local302);
				}
				this.aLong290 += arg1;
			} else if (arg1 > 0) {
				if (this.aLong293 == -1L) {
					this.aLong293 = this.aLong290;
				}
				Static472.method5022(arg0, arg2, this.aByteArray62, (int) (this.aLong290 - this.aLong293), arg1);
				this.aLong290 += arg1;
				if ((long) this.anInt5809 < this.aLong290 - this.aLong293) {
					this.anInt5809 = (int) (this.aLong290 - this.aLong293);
				}
			}
		} catch (@Pc(385) IOException local385) {
			this.aLong288 = -1L;
			throw local385;
		}
	}

	@OriginalMember(owner = "client!pt", name = "c", descriptor = "(B)Ljava/io/File;")
	private File method4612() {
		return this.aClass213_4.method4948();
	}
}
