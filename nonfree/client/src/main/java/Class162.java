import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pl")
public final class Class162 {

	@OriginalMember(owner = "client!pl", name = "n", descriptor = "I")
	private int anInt4993;

	@OriginalMember(owner = "client!pl", name = "t", descriptor = "J")
	private long aLong181;

	@OriginalMember(owner = "client!pl", name = "h", descriptor = "I")
	private int anInt4990 = 0;

	@OriginalMember(owner = "client!pl", name = "o", descriptor = "J")
	private long aLong178 = -1L;

	@OriginalMember(owner = "client!pl", name = "s", descriptor = "J")
	private long aLong180 = -1L;

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "Lclient!ri;")
	private final Class183 aClass183_4;

	@OriginalMember(owner = "client!pl", name = "r", descriptor = "J")
	private long aLong179;

	@OriginalMember(owner = "client!pl", name = "i", descriptor = "J")
	private long aLong176;

	@OriginalMember(owner = "client!pl", name = "j", descriptor = "[B")
	private final byte[] aByteArray81;

	@OriginalMember(owner = "client!pl", name = "l", descriptor = "J")
	private long aLong177;

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "[B")
	private final byte[] aByteArray80;

	@OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Lclient!ri;II)V")
	public Class162(@OriginalArg(0) Class183 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass183_4 = arg0;
		this.aLong176 = this.aLong179 = arg0.method4932();
		this.aByteArray81 = new byte[arg1];
		this.aLong177 = 0L;
		this.aByteArray80 = new byte[arg2];
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "([BIII)V")
	public void method4545(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg0.length < arg1) {
				throw new ArrayIndexOutOfBoundsException(arg1 - arg0.length);
			}
			if (this.aLong180 != -1L && this.aLong180 <= this.aLong177 && (long) this.anInt4990 + this.aLong180 >= this.aLong177 + (long) arg1) {
				Static374.method2826(this.aByteArray80, (int) (this.aLong177 - this.aLong180), arg0, 0, arg1);
				this.aLong177 += arg1;
				return;
			}
			@Pc(73) long local73 = this.aLong177;
			@Pc(77) int local77 = arg1;
			@Pc(113) int local113;
			if (this.aLong177 >= this.aLong178 && (long) this.anInt4993 + this.aLong178 > this.aLong177) {
				local113 = (int) (this.aLong178 + (long) this.anInt4993 - this.aLong177);
				if (arg1 < local113) {
					local113 = arg1;
				}
				Static374.method2826(this.aByteArray81, (int) (this.aLong177 - this.aLong178), arg0, 0, local113);
				this.aLong177 += local113;
				arg2 = local113;
				arg1 -= local113;
			}
			if (arg1 > this.aByteArray81.length) {
				this.aClass183_4.method4935(this.aLong177);
				this.aLong181 = this.aLong177;
				while (arg1 > 0) {
					local113 = this.aClass183_4.method4936(arg2, arg0, arg1);
					if (local113 == -1) {
						break;
					}
					arg1 -= local113;
					this.aLong177 += local113;
					arg2 += local113;
					this.aLong181 += local113;
				}
			} else if (arg1 > 0) {
				this.method4554();
				local113 = arg1;
				if (arg1 > this.anInt4993) {
					local113 = this.anInt4993;
				}
				Static374.method2826(this.aByteArray81, 0, arg0, arg2, local113);
				arg2 += local113;
				arg1 -= local113;
				this.aLong177 += local113;
			}
			if ((long) -1 != this.aLong180) {
				if (this.aLong177 < this.aLong180 && arg1 > 0) {
					local113 = (int) (this.aLong180 - this.aLong177) + arg2;
					if (local113 > arg2 + arg1) {
						local113 = arg1 + arg2;
					}
					while (local113 > arg2) {
						arg1--;
						arg0[arg2++] = 0;
						this.aLong177++;
					}
				}
				@Pc(300) long local300 = -1L;
				if (this.aLong180 >= local73 && (long) local77 + local73 > this.aLong180) {
					local300 = this.aLong180;
				} else if (local73 >= this.aLong180 && local73 < (long) this.anInt4990 + this.aLong180) {
					local300 = local73;
				}
				@Pc(344) long local344 = -1L;
				if (this.aLong180 + (long) this.anInt4990 > local73 && (long) local77 + local73 >= this.aLong180 - -((long) this.anInt4990)) {
					local344 = (long) this.anInt4990 + this.aLong180;
				} else if (this.aLong180 < local73 + (long) local77 && local73 + (long) local77 <= (long) this.anInt4990 + this.aLong180) {
					local344 = (long) local77 + local73;
				}
				if (local300 > -1L && local344 > local300) {
					@Pc(422) int local422 = (int) (local344 - local300);
					Static374.method2826(this.aByteArray80, (int) (local300 - this.aLong180), arg0, (int) (local300 - local73), local422);
					if (this.aLong177 < local344) {
						arg1 = (int) ((long) arg1 + this.aLong177 - local344);
						this.aLong177 = local344;
					}
				}
			}
		} catch (@Pc(462) IOException local462) {
			this.aLong181 = -1L;
			throw local462;
		}
		if (arg1 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V")
	private void method4546() throws IOException {
		if (this.aLong180 == -1L) {
			return;
		}
		if (this.aLong180 != this.aLong181) {
			this.aClass183_4.method4935(this.aLong180);
			this.aLong181 = this.aLong180;
		}
		this.aClass183_4.method4937(0, this.anInt4990, this.aByteArray80);
		this.aLong181 += this.anInt4990;
		if (this.aLong181 > this.aLong179) {
			this.aLong179 = this.aLong181;
		}
		@Pc(67) long local67 = -1L;
		if (this.aLong178 <= this.aLong180 && (long) this.anInt4993 + this.aLong178 > this.aLong180) {
			local67 = this.aLong180;
		} else if (this.aLong180 <= this.aLong178 && this.aLong180 + (long) this.anInt4990 > this.aLong178) {
			local67 = this.aLong178;
		}
		@Pc(126) long local126 = -1L;
		if (this.aLong180 + (long) this.anInt4990 > this.aLong178 && this.aLong180 + (long) this.anInt4990 <= this.aLong178 - -((long) this.anInt4993)) {
			local126 = (long) this.anInt4990 + this.aLong180;
		} else if (this.aLong180 < this.aLong178 + (long) this.anInt4993 && this.aLong178 + (long) this.anInt4993 <= this.aLong180 + (long) this.anInt4990) {
			local126 = this.aLong178 + (long) this.anInt4993;
		}
		if (local67 > -1L && local126 > local67) {
			@Pc(221) int local221 = (int) (local126 - local67);
			Static374.method2826(this.aByteArray80, (int) (local67 - this.aLong180), this.aByteArray81, (int) (local67 - this.aLong178), local221);
		}
		this.aLong180 = -1L;
		this.anInt4990 = 0;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "([BI)V")
	public void method4547(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method4545(arg0, arg0.length, 0);
	}

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "(I)J")
	public long method4548() {
		return this.aLong176;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "([BIBI)V")
	public void method4549(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if ((long) arg1 + this.aLong177 > this.aLong176) {
				this.aLong176 = this.aLong177 + (long) arg1;
			}
			if (this.aLong180 != -1L && (this.aLong180 > this.aLong177 || this.aLong180 + (long) this.anInt4990 < this.aLong177)) {
				this.method4546();
			}
			if (this.aLong180 != -1L && this.aLong180 + (long) this.aByteArray80.length < (long) arg1 + this.aLong177) {
				@Pc(103) int local103 = (int) (this.aLong180 + (long) this.aByteArray80.length - this.aLong177);
				Static374.method2826(arg0, arg2, this.aByteArray80, (int) (this.aLong177 - this.aLong180), local103);
				arg1 -= local103;
				arg2 += local103;
				this.aLong177 += local103;
				this.anInt4990 = this.aByteArray80.length;
				this.method4546();
			}
			if (arg1 > this.aByteArray80.length) {
				if (this.aLong177 != this.aLong181) {
					this.aClass183_4.method4935(this.aLong177);
					this.aLong181 = this.aLong177;
				}
				this.aClass183_4.method4937(arg2, arg1, arg0);
				this.aLong181 += arg1;
				if (this.aLong179 < this.aLong181) {
					this.aLong179 = this.aLong181;
				}
				@Pc(190) long local190 = -1L;
				if (this.aLong178 <= this.aLong177 && this.aLong178 + (long) this.anInt4993 > this.aLong177) {
					local190 = this.aLong177;
				} else if (this.aLong178 >= this.aLong177 && this.aLong177 + (long) arg1 > this.aLong178) {
					local190 = this.aLong178;
				}
				@Pc(240) long local240 = -1L;
				if ((long) arg1 + this.aLong177 > this.aLong178 && (long) this.anInt4993 + this.aLong178 >= this.aLong177 + (long) arg1) {
					local240 = (long) arg1 + this.aLong177;
				} else if (this.aLong177 < (long) this.anInt4993 + this.aLong178 && this.aLong178 + (long) this.anInt4993 <= (long) arg1 + this.aLong177) {
					local240 = this.aLong178 + (long) this.anInt4993;
				}
				if (local190 > -1L && local190 < local240) {
					@Pc(318) int local318 = (int) (local240 - local190);
					Static374.method2826(arg0, (int) ((long) arg2 + local190 - this.aLong177), this.aByteArray81, (int) (local190 - this.aLong178), local318);
				}
				this.aLong177 += arg1;
			} else if (arg1 > 0) {
				if (this.aLong180 == -1L) {
					this.aLong180 = this.aLong177;
				}
				Static374.method2826(arg0, arg2, this.aByteArray80, (int) (this.aLong177 - this.aLong180), arg1);
				this.aLong177 += arg1;
				if (this.aLong177 - this.aLong180 > (long) this.anInt4990) {
					this.anInt4990 = (int) (this.aLong177 - this.aLong180);
				}
			}
		} catch (@Pc(401) IOException local401) {
			this.aLong181 = -1L;
			throw local401;
		}
	}

	@OriginalMember(owner = "client!pl", name = "d", descriptor = "(I)Ljava/io/File;")
	private File method4551() {
		return this.aClass183_4.method4933();
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(JZ)V")
	public void method4553(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method4551());
		}
		this.aLong177 = arg0;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(B)V")
	private void method4554() throws IOException {
		this.anInt4993 = 0;
		if (this.aLong181 != this.aLong177) {
			this.aClass183_4.method4935(this.aLong177);
			this.aLong181 = this.aLong177;
		}
		this.aLong178 = this.aLong177;
		while (this.aByteArray81.length > this.anInt4993) {
			@Pc(45) int local45 = this.aByteArray81.length - this.anInt4993;
			if (local45 > 200000000) {
				local45 = 200000000;
			}
			@Pc(64) int local64 = this.aClass183_4.method4936(this.anInt4993, this.aByteArray81, local45);
			if (local64 == -1) {
				break;
			}
			this.aLong181 += local64;
			this.anInt4993 += local64;
		}
	}
}
