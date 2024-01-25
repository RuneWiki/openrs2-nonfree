import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public final class Class69 {

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
	private int anInt1508;

	@OriginalMember(owner = "client!fc", name = "m", descriptor = "J")
	private long aLong51;

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "J")
	private long aLong49 = -1L;

	@OriginalMember(owner = "client!fc", name = "w", descriptor = "J")
	private long aLong53 = -1L;

	@OriginalMember(owner = "client!fc", name = "y", descriptor = "I")
	private int anInt1520 = 0;

	@OriginalMember(owner = "client!fc", name = "g", descriptor = "Lclient!jp;")
	private final Class113 aClass113_1;

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "J")
	private long aLong50;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "J")
	private long aLong48;

	@OriginalMember(owner = "client!fc", name = "r", descriptor = "J")
	private long aLong52;

	@OriginalMember(owner = "client!fc", name = "h", descriptor = "[B")
	private final byte[] aByteArray23;

	@OriginalMember(owner = "client!fc", name = "x", descriptor = "[B")
	private final byte[] aByteArray24;

	static {
		new Class117("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.", "Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.", "Você está temporariamente impedido de entrar em canais. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Lclient!jp;II)V")
	public Class69(@OriginalArg(0) Class113 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass113_1 = arg0;
		this.aLong48 = this.aLong50 = arg0.method2306();
		this.aLong52 = 0L;
		this.aByteArray23 = new byte[arg1];
		this.aByteArray24 = new byte[arg2];
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)Ljava/io/File;")
	private File method1217() {
		return this.aClass113_1.method2302();
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(B[B)V")
	public void method1218(@OriginalArg(1) byte[] arg0) throws IOException {
		this.method1228(arg0, 0, arg0.length);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(BJ)V")
	public void method1219(@OriginalArg(1) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method1217());
		}
		this.aLong52 = arg0;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)J")
	public long method1221() {
		return this.aLong48;
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(I)V")
	private void method1223() throws IOException {
		this.anInt1508 = 0;
		if (this.aLong51 != this.aLong52) {
			this.aClass113_1.method2303(this.aLong52);
			this.aLong51 = this.aLong52;
		}
		this.aLong53 = this.aLong52;
		while (this.aByteArray23.length > this.anInt1508) {
			@Pc(42) int local42 = this.aByteArray23.length - this.anInt1508;
			if (local42 > 200000000) {
				local42 = 200000000;
			}
			@Pc(59) int local59 = this.aClass113_1.method2305(this.anInt1508, this.aByteArray23, local42);
			if (local59 == -1) {
				break;
			}
			this.aLong51 += local59;
			this.anInt1508 += local59;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(II[BI)V")
	public void method1225(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		try {
			if (this.aLong48 < this.aLong52 + (long) arg0) {
				this.aLong48 = this.aLong52 + (long) arg0;
			}
			if (this.aLong49 != -1L && (this.aLong52 < this.aLong49 || (long) this.anInt1520 + this.aLong49 < this.aLong52)) {
				this.method1227();
			}
			if ((long) -1 != this.aLong49 && this.aLong52 + (long) arg0 > this.aLong49 + (long) this.aByteArray24.length) {
				@Pc(92) int local92 = (int) (this.aLong49 + (long) this.aByteArray24.length - this.aLong52);
				Static363.method1668(arg2, arg1, this.aByteArray24, (int) (this.aLong52 - this.aLong49), local92);
				arg0 -= local92;
				arg1 += local92;
				this.aLong52 += local92;
				this.anInt1520 = this.aByteArray24.length;
				this.method1227();
			}
			if (this.aByteArray24.length < arg0) {
				if (this.aLong51 != this.aLong52) {
					this.aClass113_1.method2303(this.aLong52);
					this.aLong51 = this.aLong52;
				}
				this.aClass113_1.method2304(arg1, arg2, arg0);
				this.aLong51 += arg0;
				if (this.aLong50 < this.aLong51) {
					this.aLong50 = this.aLong51;
				}
				@Pc(187) long local187 = -1L;
				@Pc(189) long local189 = -1L;
				if (this.aLong53 <= this.aLong52 && (long) this.anInt1508 + this.aLong53 > this.aLong52) {
					local187 = this.aLong52;
				} else if (this.aLong53 >= this.aLong52 && (long) arg0 + this.aLong52 > this.aLong53) {
					local187 = this.aLong53;
				}
				if ((long) arg0 + this.aLong52 > this.aLong53 && this.aLong52 + (long) arg0 <= this.aLong53 + (long) this.anInt1508) {
					local189 = (long) arg0 + this.aLong52;
				} else if (this.aLong52 < (long) this.anInt1508 + this.aLong53 && (long) arg0 + this.aLong52 >= this.aLong53 - -((long) this.anInt1508)) {
					local189 = (long) this.anInt1508 + this.aLong53;
				}
				if (local187 > -1L && local187 < local189) {
					@Pc(313) int local313 = (int) (local189 - local187);
					Static363.method1668(arg2, (int) (local187 + (long) arg1 - this.aLong52), this.aByteArray23, (int) (local187 - this.aLong53), local313);
				}
				this.aLong52 += arg0;
			} else if (arg0 > 0) {
				if (this.aLong49 == -1L) {
					this.aLong49 = this.aLong52;
				}
				Static363.method1668(arg2, arg1, this.aByteArray24, (int) (this.aLong52 - this.aLong49), arg0);
				this.aLong52 += arg0;
				if (this.aLong52 - this.aLong49 > (long) this.anInt1520) {
					this.anInt1520 = (int) (this.aLong52 - this.aLong49);
				}
			}
		} catch (@Pc(398) IOException local398) {
			this.aLong51 = -1L;
			throw local398;
		}
	}

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "(I)V")
	private void method1227() throws IOException {
		if (this.aLong49 == -1L) {
			return;
		}
		if (this.aLong51 != this.aLong49) {
			this.aClass113_1.method2303(this.aLong49);
			this.aLong51 = this.aLong49;
		}
		this.aClass113_1.method2304(0, this.aByteArray24, this.anInt1520);
		this.aLong51 += this.anInt1520;
		if (this.aLong51 > this.aLong50) {
			this.aLong50 = this.aLong51;
		}
		@Pc(61) long local61 = -1L;
		@Pc(63) long local63 = -1L;
		if (this.aLong49 >= this.aLong53 && this.aLong49 < (long) this.anInt1508 + this.aLong53) {
			local61 = this.aLong49;
		} else if (this.aLong49 <= this.aLong53 && (long) this.anInt1520 + this.aLong49 > this.aLong53) {
			local61 = this.aLong53;
		}
		if (this.aLong53 < (long) this.anInt1520 + this.aLong49 && (long) this.anInt1508 + this.aLong53 >= this.aLong49 - -((long) this.anInt1520)) {
			local63 = this.aLong49 + (long) this.anInt1520;
		} else if (this.aLong49 < (long) this.anInt1508 + this.aLong53 && (long) this.anInt1508 + this.aLong53 <= (long) this.anInt1520 + this.aLong49) {
			local63 = (long) this.anInt1508 + this.aLong53;
		}
		if (local61 > -1L && local61 < local63) {
			@Pc(207) int local207 = (int) (local63 - local61);
			Static363.method1668(this.aByteArray24, (int) (local61 - this.aLong49), this.aByteArray23, (int) (local61 - this.aLong53), local207);
		}
		this.aLong49 = -1L;
		this.anInt1520 = 0;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "([BIII)V")
	public void method1228(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg0.length < arg2) {
				throw new ArrayIndexOutOfBoundsException(arg2 - arg0.length);
			}
			if (this.aLong49 != -1L && this.aLong49 <= this.aLong52 && (long) arg2 + this.aLong52 <= (long) this.anInt1520 + this.aLong49) {
				Static363.method1668(this.aByteArray24, (int) (this.aLong52 - this.aLong49), arg0, 0, arg2);
				this.aLong52 += arg2;
				return;
			}
			@Pc(73) long local73 = this.aLong52;
			@Pc(77) int local77 = arg2;
			@Pc(109) int local109;
			if (this.aLong53 <= this.aLong52 && (long) this.anInt1508 + this.aLong53 > this.aLong52) {
				local109 = (int) ((long) this.anInt1508 + this.aLong53 - this.aLong52);
				if (local109 > arg2) {
					local109 = arg2;
				}
				Static363.method1668(this.aByteArray23, (int) (this.aLong52 - this.aLong53), arg0, 0, local109);
				arg1 = local109;
				arg2 -= local109;
				this.aLong52 += local109;
			}
			if (arg2 > this.aByteArray23.length) {
				this.aClass113_1.method2303(this.aLong52);
				this.aLong51 = this.aLong52;
				while (arg2 > 0) {
					local109 = this.aClass113_1.method2305(arg1, arg0, arg2);
					if (local109 == -1) {
						break;
					}
					arg1 += local109;
					arg2 -= local109;
					this.aLong52 += local109;
					this.aLong51 += local109;
				}
			} else if (arg2 > 0) {
				this.method1223();
				local109 = arg2;
				if (arg2 > this.anInt1508) {
					local109 = this.anInt1508;
				}
				Static363.method1668(this.aByteArray23, 0, arg0, arg1, local109);
				this.aLong52 += local109;
				arg1 += local109;
				arg2 -= local109;
			}
			if ((long) -1 != this.aLong49) {
				if (this.aLong49 > this.aLong52 && arg2 > 0) {
					local109 = arg1 + (int) (this.aLong49 - this.aLong52);
					if (arg2 + arg1 < local109) {
						local109 = arg2 + arg1;
					}
					while (local109 > arg1) {
						arg2--;
						arg0[arg1++] = 0;
						this.aLong52++;
					}
				}
				@Pc(298) long local298 = -1L;
				if (local73 <= this.aLong49 && local73 + (long) local77 > this.aLong49) {
					local298 = this.aLong49;
				} else if (local73 >= this.aLong49 && local73 < (long) this.anInt1520 + this.aLong49) {
					local298 = local73;
				}
				@Pc(339) long local339 = -1L;
				if (local73 < this.aLong49 + (long) this.anInt1520 && local73 + (long) local77 >= (long) this.anInt1520 + this.aLong49) {
					local339 = this.aLong49 + (long) this.anInt1520;
				} else if (local73 + (long) local77 > this.aLong49 && this.aLong49 + (long) this.anInt1520 >= (long) local77 + local73) {
					local339 = (long) local77 + local73;
				}
				if (local298 > -1L && local298 < local339) {
					@Pc(422) int local422 = (int) (local339 - local298);
					Static363.method1668(this.aByteArray24, (int) (local298 - this.aLong49), arg0, (int) (local298 - local73), local422);
					if (local339 > this.aLong52) {
						arg2 = (int) ((long) arg2 + this.aLong52 - local339);
						this.aLong52 = local339;
					}
				}
			}
		} catch (@Pc(464) IOException local464) {
			this.aLong51 = -1L;
			throw local464;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}
}
