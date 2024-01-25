import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ok")
public final class Class176 {

	@OriginalMember(owner = "client!ok", name = "n", descriptor = "I")
	private int anInt5175;

	@OriginalMember(owner = "client!ok", name = "v", descriptor = "J")
	private long aLong170;

	@OriginalMember(owner = "client!ok", name = "m", descriptor = "J")
	private long aLong167 = -1L;

	@OriginalMember(owner = "client!ok", name = "f", descriptor = "I")
	private int anInt5169 = 0;

	@OriginalMember(owner = "client!ok", name = "t", descriptor = "J")
	private long aLong169 = -1L;

	@OriginalMember(owner = "client!ok", name = "p", descriptor = "Lclient!sf;")
	private final Class220 aClass220_4;

	@OriginalMember(owner = "client!ok", name = "g", descriptor = "J")
	private long aLong166;

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "J")
	private long aLong165;

	@OriginalMember(owner = "client!ok", name = "r", descriptor = "J")
	private long aLong168;

	@OriginalMember(owner = "client!ok", name = "s", descriptor = "[B")
	private final byte[] aByteArray89;

	@OriginalMember(owner = "client!ok", name = "u", descriptor = "[B")
	private final byte[] aByteArray90;

	static {
		new Class174("Invalid player name.", "Unzulässiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inválido.");
	}

	@OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(Lclient!sf;II)V")
	public Class176(@OriginalArg(0) Class220 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass220_4 = arg0;
		this.aLong165 = this.aLong166 = arg0.method5189();
		this.aLong168 = 0L;
		this.aByteArray89 = new byte[arg2];
		this.aByteArray90 = new byte[arg1];
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "([BIII)V")
	public void method4265(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (this.aLong165 < (long) arg1 + this.aLong168) {
				this.aLong165 = this.aLong168 + (long) arg1;
			}
			if (this.aLong169 != -1L && (this.aLong168 < this.aLong169 || this.aLong168 > this.aLong169 + (long) this.anInt5169)) {
				this.method4273();
			}
			if (this.aLong169 != -1L && this.aLong169 + (long) this.aByteArray89.length < this.aLong168 - -((long) arg1)) {
				@Pc(98) int local98 = (int) (this.aLong169 + (long) this.aByteArray89.length - this.aLong168);
				Static466.method205(arg0, arg2, this.aByteArray89, (int) (this.aLong168 - this.aLong169), local98);
				arg2 += local98;
				this.aLong168 += local98;
				arg1 -= local98;
				this.anInt5169 = this.aByteArray89.length;
				this.method4273();
			}
			if (arg1 > this.aByteArray89.length) {
				if (this.aLong168 != this.aLong170) {
					this.aClass220_4.method5188(this.aLong168);
					this.aLong170 = this.aLong168;
				}
				this.aClass220_4.method5187(arg1, arg2, arg0);
				this.aLong170 += arg1;
				if (this.aLong170 > this.aLong166) {
					this.aLong166 = this.aLong170;
				}
				@Pc(193) long local193 = -1L;
				if (this.aLong168 >= this.aLong167 && this.aLong168 < (long) this.anInt5175 + this.aLong167) {
					local193 = this.aLong168;
				} else if (this.aLong168 <= this.aLong167 && this.aLong167 < this.aLong168 + (long) arg1) {
					local193 = this.aLong167;
				}
				@Pc(235) long local235 = -1L;
				if (this.aLong168 + (long) arg1 > this.aLong167 && (long) arg1 + this.aLong168 <= this.aLong167 + (long) this.anInt5175) {
					local235 = (long) arg1 + this.aLong168;
				} else if (this.aLong168 < this.aLong167 + (long) this.anInt5175 && (long) arg1 + this.aLong168 >= (long) this.anInt5175 + this.aLong167) {
					local235 = this.aLong167 + (long) this.anInt5175;
				}
				if (local193 > -1L && local193 < local235) {
					@Pc(321) int local321 = (int) (local235 - local193);
					Static466.method205(arg0, (int) (local193 + (long) arg2 - this.aLong168), this.aByteArray90, (int) (local193 - this.aLong167), local321);
				}
				this.aLong168 += arg1;
			} else if (arg1 > 0) {
				if (this.aLong169 == -1L) {
					this.aLong169 = this.aLong168;
				}
				Static466.method205(arg0, arg2, this.aByteArray89, (int) (this.aLong168 - this.aLong169), arg1);
				this.aLong168 += arg1;
				if ((long) this.anInt5169 < this.aLong168 - this.aLong169) {
					this.anInt5169 = (int) (this.aLong168 - this.aLong169);
				}
			}
		} catch (@Pc(406) IOException local406) {
			this.aLong170 = -1L;
			throw local406;
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V")
	private void method4266() throws IOException {
		this.anInt5175 = 0;
		if (this.aLong170 != this.aLong168) {
			this.aClass220_4.method5188(this.aLong168);
			this.aLong170 = this.aLong168;
		}
		this.aLong167 = this.aLong168;
		while (this.aByteArray90.length > this.anInt5175) {
			@Pc(46) int local46 = this.aByteArray90.length - this.anInt5175;
			if (local46 > 200000000) {
				local46 = 200000000;
			}
			@Pc(63) int local63 = this.aClass220_4.method5186(local46, this.anInt5175, this.aByteArray90);
			if (local63 == -1) {
				break;
			}
			this.aLong170 += local63;
			this.anInt5175 += local63;
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(I[BII)V")
	public void method4267(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if (arg2 > arg1.length) {
				throw new ArrayIndexOutOfBoundsException(arg2 - arg1.length);
			}
			if (this.aLong169 != -1L && this.aLong169 <= this.aLong168 && (long) this.anInt5169 + this.aLong169 >= this.aLong168 - -((long) arg2)) {
				Static466.method205(this.aByteArray89, (int) (this.aLong168 - this.aLong169), arg1, 0, arg2);
				this.aLong168 += arg2;
				return;
			}
			@Pc(78) long local78 = this.aLong168;
			@Pc(82) int local82 = arg2;
			@Pc(116) int local116;
			if (this.aLong167 <= this.aLong168 && this.aLong168 < this.aLong167 + (long) this.anInt5175) {
				local116 = (int) (this.aLong167 + (long) this.anInt5175 - this.aLong168);
				if (local116 > arg2) {
					local116 = arg2;
				}
				Static466.method205(this.aByteArray90, (int) (this.aLong168 - this.aLong167), arg1, 0, local116);
				arg0 = local116;
				this.aLong168 += local116;
				arg2 -= local116;
			}
			if (arg2 > this.aByteArray90.length) {
				this.aClass220_4.method5188(this.aLong168);
				this.aLong170 = this.aLong168;
				while (arg2 > 0) {
					local116 = this.aClass220_4.method5186(arg2, arg0, arg1);
					if (local116 == -1) {
						break;
					}
					this.aLong168 += local116;
					arg2 -= local116;
					this.aLong170 += local116;
					arg0 += local116;
				}
			} else if (arg2 > 0) {
				this.method4266();
				local116 = arg2;
				if (this.anInt5175 < arg2) {
					local116 = this.anInt5175;
				}
				Static466.method205(this.aByteArray90, 0, arg1, arg0, local116);
				arg0 += local116;
				arg2 -= local116;
				this.aLong168 += local116;
			}
			if (this.aLong169 != -1L) {
				if (this.aLong168 < this.aLong169 && arg2 > 0) {
					local116 = (int) (this.aLong169 - this.aLong168) + arg0;
					if (local116 > arg2 + arg0) {
						local116 = arg2 + arg0;
					}
					while (arg0 < local116) {
						arg1[arg0++] = 0;
						arg2--;
						this.aLong168++;
					}
				}
				@Pc(317) long local317 = -1L;
				@Pc(319) long local319 = -1L;
				if (this.aLong169 >= local78 && this.aLong169 < local78 + (long) local82) {
					local317 = this.aLong169;
				} else if (this.aLong169 <= local78 && (long) this.anInt5169 + this.aLong169 > local78) {
					local317 = local78;
				}
				if (local78 < (long) this.anInt5169 + this.aLong169 && this.aLong169 + (long) this.anInt5169 <= local78 - -((long) local82)) {
					local319 = (long) this.anInt5169 + this.aLong169;
				} else if (local78 + (long) local82 > this.aLong169 && this.aLong169 + (long) this.anInt5169 >= local78 + (long) local82) {
					local319 = local78 + (long) local82;
				}
				if (local317 > -1L && local319 > local317) {
					@Pc(439) int local439 = (int) (local319 - local317);
					Static466.method205(this.aByteArray89, (int) (local317 - this.aLong169), arg1, (int) (local317 - local78), local439);
					if (local319 > this.aLong168) {
						arg2 = (int) ((long) arg2 + this.aLong168 - local319);
						this.aLong168 = local319;
					}
				}
			}
		} catch (@Pc(480) IOException local480) {
			this.aLong170 = -1L;
			throw local480;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(I[B)V")
	public void method4269(@OriginalArg(1) byte[] arg0) throws IOException {
		this.method4267(0, arg0, arg0.length);
	}

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "(I)Ljava/io/File;")
	private File method4270() {
		return this.aClass220_4.method5185();
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IJ)V")
	public void method4271(@OriginalArg(1) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method4270());
		}
		this.aLong168 = arg0;
	}

	@OriginalMember(owner = "client!ok", name = "c", descriptor = "(I)V")
	private void method4273() throws IOException {
		if ((long) -1 == this.aLong169) {
			return;
		}
		if (this.aLong169 != this.aLong170) {
			this.aClass220_4.method5188(this.aLong169);
			this.aLong170 = this.aLong169;
		}
		this.aClass220_4.method5187(this.anInt5169, 0, this.aByteArray89);
		this.aLong170 += this.anInt5169;
		if (this.aLong170 > this.aLong166) {
			this.aLong166 = this.aLong170;
		}
		@Pc(52) long local52 = -1L;
		if (this.aLong169 >= this.aLong167 && this.aLong167 + (long) this.anInt5175 > this.aLong169) {
			local52 = this.aLong169;
		} else if (this.aLong167 >= this.aLong169 && (long) this.anInt5169 + this.aLong169 > this.aLong167) {
			local52 = this.aLong167;
		}
		@Pc(102) long local102 = -1L;
		if (this.aLong169 + (long) this.anInt5169 > this.aLong167 && (long) this.anInt5175 + this.aLong167 >= (long) this.anInt5169 + this.aLong169) {
			local102 = this.aLong169 + (long) this.anInt5169;
		} else if (this.aLong169 < this.aLong167 + (long) this.anInt5175 && (long) this.anInt5169 + this.aLong169 >= this.aLong167 - -((long) this.anInt5175)) {
			local102 = this.aLong167 + (long) this.anInt5175;
		}
		if (local52 > -1L && local102 > local52) {
			@Pc(191) int local191 = (int) (local102 - local52);
			Static466.method205(this.aByteArray89, (int) (local52 - this.aLong169), this.aByteArray90, (int) (local52 - this.aLong167), local191);
		}
		this.aLong169 = -1L;
		this.anInt5169 = 0;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)J")
	public long method4274() {
		return this.aLong165;
	}
}
