import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nja")
public final class Class252 {

	@OriginalMember(owner = "client!nja", name = "k", descriptor = "J")
	private long aLong184;

	@OriginalMember(owner = "client!nja", name = "l", descriptor = "I")
	private int anInt5890;

	@OriginalMember(owner = "client!nja", name = "j", descriptor = "J")
	private long aLong183 = -1L;

	@OriginalMember(owner = "client!nja", name = "p", descriptor = "J")
	private long aLong186 = -1L;

	@OriginalMember(owner = "client!nja", name = "t", descriptor = "I")
	private int anInt5893 = 0;

	@OriginalMember(owner = "client!nja", name = "r", descriptor = "Lclient!ea;")
	private final Class80 aClass80_4;

	@OriginalMember(owner = "client!nja", name = "u", descriptor = "J")
	private long aLong187;

	@OriginalMember(owner = "client!nja", name = "d", descriptor = "J")
	private long aLong182;

	@OriginalMember(owner = "client!nja", name = "v", descriptor = "[B")
	private final byte[] aByteArray59;

	@OriginalMember(owner = "client!nja", name = "m", descriptor = "J")
	private long aLong185;

	@OriginalMember(owner = "client!nja", name = "i", descriptor = "[B")
	private final byte[] aByteArray58;

	@OriginalMember(owner = "client!nja", name = "<init>", descriptor = "(Lclient!ea;II)V")
	public Class252(@OriginalArg(0) Class80 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass80_4 = arg0;
		this.aLong182 = this.aLong187 = arg0.method2120();
		this.aByteArray59 = new byte[arg2];
		this.aLong185 = 0L;
		this.aByteArray58 = new byte[arg1];
	}

	@OriginalMember(owner = "client!nja", name = "a", descriptor = "(IJ)V")
	public void method5153(@OriginalArg(1) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method5158());
		}
		this.aLong185 = arg0;
	}

	@OriginalMember(owner = "client!nja", name = "a", descriptor = "(I[B)V")
	public void method5154(@OriginalArg(1) byte[] arg0) throws IOException {
		this.method5160(arg0, arg0.length, 0);
	}

	@OriginalMember(owner = "client!nja", name = "a", descriptor = "(I)V")
	private void method5156() throws IOException {
		this.anInt5890 = 0;
		if (this.aLong184 != this.aLong185) {
			this.aClass80_4.method2117(this.aLong185);
			this.aLong184 = this.aLong185;
		}
		this.aLong183 = this.aLong185;
		while (this.aByteArray58.length > this.anInt5890) {
			@Pc(40) int local40 = this.aByteArray58.length - this.anInt5890;
			if (local40 > 200000000) {
				local40 = 200000000;
			}
			@Pc(57) int local57 = this.aClass80_4.method2121(this.anInt5890, local40, this.aByteArray58);
			if (local57 == -1) {
				break;
			}
			this.aLong184 += (long) local57;
			this.anInt5890 += local57;
		}
	}

	@OriginalMember(owner = "client!nja", name = "b", descriptor = "(I)Ljava/io/File;")
	private File method5158() {
		return this.aClass80_4.method2123();
	}

	@OriginalMember(owner = "client!nja", name = "c", descriptor = "(I)V")
	private void method5159() throws IOException {
		if (this.aLong186 == -1L) {
			return;
		}
		if (this.aLong184 != this.aLong186) {
			this.aClass80_4.method2117(this.aLong186);
			this.aLong184 = this.aLong186;
		}
		this.aClass80_4.method2122(this.anInt5893, this.aByteArray59, 0);
		this.aLong184 += (long) this.anInt5893;
		if (this.aLong184 > this.aLong187) {
			this.aLong187 = this.aLong184;
		}
		@Pc(59) long local59 = -1L;
		@Pc(61) long local61 = -1L;
		if (this.aLong183 <= this.aLong186 && this.aLong186 < (long) this.anInt5890 + this.aLong183) {
			local59 = this.aLong186;
		} else if (this.aLong183 >= this.aLong186 && (long) this.anInt5893 + this.aLong186 > this.aLong183) {
			local59 = this.aLong183;
		}
		if (this.aLong183 < (long) this.anInt5893 + this.aLong186 && (long) this.anInt5893 + this.aLong186 <= (long) this.anInt5890 + this.aLong183) {
			local61 = this.aLong186 + (long) this.anInt5893;
		} else if (this.aLong186 < (long) this.anInt5890 + this.aLong183 && this.aLong183 + (long) this.anInt5890 <= this.aLong186 + (long) this.anInt5893) {
			local61 = this.aLong183 + (long) this.anInt5890;
		}
		if (local59 > -1L && local59 < local61) {
			@Pc(210) int local210 = (int) (local61 - local59);
			Static685.method6464(this.aByteArray59, (int) (local59 - this.aLong186), this.aByteArray58, (int) (local59 - this.aLong183), local210);
		}
		this.aLong186 = -1L;
		this.anInt5893 = 0;
	}

	@OriginalMember(owner = "client!nja", name = "a", descriptor = "([BIII)V")
	public void method5160(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if (arg1 > arg0.length) {
				throw new ArrayIndexOutOfBoundsException(arg1 - arg0.length);
			}
			if (this.aLong186 != -1L && this.aLong185 >= this.aLong186 && this.aLong185 + (long) arg1 <= this.aLong186 + (long) this.anInt5893) {
				Static685.method6464(this.aByteArray59, (int) (this.aLong185 - this.aLong186), arg0, 0, arg1);
				this.aLong185 += (long) arg1;
				return;
			}
			@Pc(92) long local92 = this.aLong185;
			@Pc(96) int local96 = arg1;
			@Pc(130) int local130;
			if (this.aLong183 <= this.aLong185 && this.aLong183 + (long) this.anInt5890 > this.aLong185) {
				local130 = (int) ((long) this.anInt5890 + this.aLong183 - this.aLong185);
				if (local130 > arg1) {
					local130 = arg1;
				}
				Static685.method6464(this.aByteArray58, (int) (this.aLong185 - this.aLong183), arg0, 0, local130);
				arg1 -= local130;
				arg2 = local130;
				this.aLong185 += (long) local130;
			}
			if (this.aByteArray58.length < arg1) {
				this.aClass80_4.method2117(this.aLong185);
				this.aLong184 = this.aLong185;
				while (arg1 > 0) {
					local130 = this.aClass80_4.method2121(arg2, arg1, arg0);
					if (local130 == -1) {
						break;
					}
					this.aLong184 += (long) local130;
					arg1 -= local130;
					arg2 += local130;
					this.aLong185 += (long) local130;
				}
			} else if (arg1 > 0) {
				this.method5156();
				local130 = arg1;
				if (arg1 > this.anInt5890) {
					local130 = this.anInt5890;
				}
				Static685.method6464(this.aByteArray58, 0, arg0, arg2, local130);
				this.aLong185 += (long) local130;
				arg2 += local130;
				arg1 -= local130;
			}
			if (this.aLong186 != -1L) {
				if (this.aLong185 < this.aLong186 && arg1 > 0) {
					local130 = (int) (this.aLong186 - this.aLong185) + arg2;
					if (arg1 + arg2 < local130) {
						local130 = arg1 + arg2;
					}
					while (arg2 < local130) {
						arg1--;
						arg0[arg2++] = 0;
						this.aLong185++;
					}
				}
				@Pc(326) long local326 = -1L;
				@Pc(328) long local328 = -1L;
				if (local92 <= this.aLong186 && local92 + (long) local96 > this.aLong186) {
					local326 = this.aLong186;
				} else if (local92 >= this.aLong186 && this.aLong186 + (long) this.anInt5893 > local92) {
					local326 = local92;
				}
				if ((long) this.anInt5893 + this.aLong186 > local92 && this.aLong186 + (long) this.anInt5893 <= local92 + (long) local96) {
					local328 = this.aLong186 + (long) this.anInt5893;
				} else if (this.aLong186 < (long) local96 + local92 && this.aLong186 + (long) this.anInt5893 >= local92 + (long) local96) {
					local328 = local92 + (long) local96;
				}
				if (local326 > -1L && local326 < local328) {
					@Pc(455) int local455 = (int) (local328 - local326);
					Static685.method6464(this.aByteArray59, (int) (local326 - this.aLong186), arg0, (int) (local326 - local92), local455);
					if (this.aLong185 < local328) {
						arg1 = (int) ((long) arg1 + this.aLong185 - local328);
						this.aLong185 = local328;
					}
				}
			}
		} catch (@Pc(496) IOException local496) {
			this.aLong184 = -1L;
			throw local496;
		}
		if (arg1 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!nja", name = "a", descriptor = "(Z)V")
	public void method5161() throws IOException {
		this.method5159();
		this.aClass80_4.method2118();
	}

	@OriginalMember(owner = "client!nja", name = "a", descriptor = "(III[B)V")
	public void method5163(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if (this.aLong185 + (long) arg1 > this.aLong182) {
				this.aLong182 = this.aLong185 + (long) arg1;
			}
			if (this.aLong186 != -1L && (this.aLong185 < this.aLong186 || this.aLong186 + (long) this.anInt5893 < this.aLong185)) {
				this.method5159();
			}
			if (this.aLong186 != -1L && (long) arg1 + this.aLong185 > (long) this.aByteArray59.length + this.aLong186) {
				@Pc(98) int local98 = (int) ((long) this.aByteArray59.length + this.aLong186 - this.aLong185);
				Static685.method6464(arg2, arg0, this.aByteArray59, (int) (this.aLong185 - this.aLong186), local98);
				arg1 -= local98;
				arg0 += local98;
				this.aLong185 += (long) local98;
				this.anInt5893 = this.aByteArray59.length;
				this.method5159();
			}
			if (this.aByteArray59.length < arg1) {
				if (this.aLong184 != this.aLong185) {
					this.aClass80_4.method2117(this.aLong185);
					this.aLong184 = this.aLong185;
				}
				this.aClass80_4.method2122(arg1, arg2, arg0);
				this.aLong184 += (long) arg1;
				if (this.aLong187 < this.aLong184) {
					this.aLong187 = this.aLong184;
				}
				@Pc(184) long local184 = -1L;
				@Pc(186) long local186 = -1L;
				if (this.aLong183 <= this.aLong185 && this.aLong185 < (long) this.anInt5890 + this.aLong183) {
					local184 = this.aLong185;
				} else if (this.aLong185 <= this.aLong183 && this.aLong183 < this.aLong185 + (long) arg1) {
					local184 = this.aLong183;
				}
				if (this.aLong183 < (long) arg1 + this.aLong185 && this.aLong183 + (long) this.anInt5890 >= this.aLong185 - -((long) arg1)) {
					local186 = (long) arg1 + this.aLong185;
				} else if (this.aLong185 < this.aLong183 + (long) this.anInt5890 && (long) this.anInt5890 + this.aLong183 <= this.aLong185 + (long) arg1) {
					local186 = (long) this.anInt5890 + this.aLong183;
				}
				if (local184 > -1L && local184 < local186) {
					@Pc(325) int local325 = (int) (local186 - local184);
					Static685.method6464(arg2, (int) (local184 + (long) arg0 - this.aLong185), this.aByteArray58, (int) (local184 - this.aLong183), local325);
				}
				this.aLong185 += (long) arg1;
			} else if (arg1 > 0) {
				if (this.aLong186 == -1L) {
					this.aLong186 = this.aLong185;
				}
				Static685.method6464(arg2, arg0, this.aByteArray59, (int) (this.aLong185 - this.aLong186), arg1);
				this.aLong185 += (long) arg1;
				if (this.aLong185 - this.aLong186 > (long) this.anInt5893) {
					this.anInt5893 = (int) (this.aLong185 - this.aLong186);
				}
			}
		} catch (@Pc(405) IOException local405) {
			this.aLong184 = -1L;
			throw local405;
		}
	}

	@OriginalMember(owner = "client!nja", name = "a", descriptor = "(B)J")
	public long method5164() {
		return this.aLong182;
	}
}
