import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ika")
public final class Class176 {

	@OriginalMember(owner = "client!ika", name = "c", descriptor = "[F")
	public static final float[] aFloatArray33 = new float[16384];

	@OriginalMember(owner = "client!ika", name = "l", descriptor = "[F")
	public static final float[] aFloatArray32 = new float[16384];

	@OriginalMember(owner = "client!ika", name = "C", descriptor = "I")
	private int anInt4430;

	@OriginalMember(owner = "client!ika", name = "h", descriptor = "J")
	private long aLong141;

	@OriginalMember(owner = "client!ika", name = "e", descriptor = "J")
	private long aLong139 = -1L;

	@OriginalMember(owner = "client!ika", name = "B", descriptor = "J")
	private long aLong144 = -1L;

	@OriginalMember(owner = "client!ika", name = "i", descriptor = "I")
	private int anInt4439 = 0;

	@OriginalMember(owner = "client!ika", name = "D", descriptor = "Lclient!qb;")
	private final Class286 aClass286_1;

	@OriginalMember(owner = "client!ika", name = "p", descriptor = "J")
	private long aLong142;

	@OriginalMember(owner = "client!ika", name = "n", descriptor = "J")
	private long aLong143;

	@OriginalMember(owner = "client!ika", name = "v", descriptor = "[B")
	private final byte[] aByteArray31;

	@OriginalMember(owner = "client!ika", name = "o", descriptor = "[B")
	private final byte[] aByteArray32;

	@OriginalMember(owner = "client!ika", name = "g", descriptor = "J")
	private long aLong140;

	static {
		@Pc(135) double local135 = 3.834951969714103E-4D;
		for (@Pc(137) int local137 = 0; local137 < 16384; local137++) {
			aFloatArray32[local137] = (float) Math.sin(local135 * (double) local137);
			aFloatArray33[local137] = (float) Math.cos((double) local137 * local135);
		}
	}

	@OriginalMember(owner = "client!ika", name = "<init>", descriptor = "(Lclient!qb;II)V")
	public Class176(@OriginalArg(0) Class286 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass286_1 = arg0;
		this.aLong143 = this.aLong142 = arg0.method6823();
		this.aByteArray31 = new byte[arg1];
		this.aByteArray32 = new byte[arg2];
		this.aLong140 = 0L;
	}

	@OriginalMember(owner = "client!ika", name = "e", descriptor = "(I)V")
	public void method3775() throws IOException {
		this.method3783();
		this.aClass286_1.method6820();
	}

	@OriginalMember(owner = "client!ika", name = "b", descriptor = "(I)V")
	private void method3777() throws IOException {
		this.anInt4430 = 0;
		if (this.aLong140 != this.aLong141) {
			this.aClass286_1.method6826(this.aLong140);
			this.aLong141 = this.aLong140;
		}
		this.aLong144 = this.aLong140;
		while (this.aByteArray31.length > this.anInt4430) {
			@Pc(48) int local48 = this.aByteArray31.length - this.anInt4430;
			if (local48 > 200000000) {
				local48 = 200000000;
			}
			@Pc(63) int local63 = this.aClass286_1.method6822(local48, this.aByteArray31, this.anInt4430);
			if (local63 == -1) {
				break;
			}
			this.aLong141 += (long) local63;
			this.anInt4430 += local63;
		}
	}

	@OriginalMember(owner = "client!ika", name = "a", descriptor = "(I[B)V")
	public void method3778(@OriginalArg(1) byte[] arg0) throws IOException {
		this.method3787(0, arg0.length, arg0);
	}

	@OriginalMember(owner = "client!ika", name = "c", descriptor = "(I)Ljava/io/File;")
	private File method3780() {
		return this.aClass286_1.method6825();
	}

	@OriginalMember(owner = "client!ika", name = "a", descriptor = "(JB)V")
	public void method3782(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method3780());
		}
		this.aLong140 = arg0;
	}

	@OriginalMember(owner = "client!ika", name = "d", descriptor = "(I)V")
	private void method3783() throws IOException {
		if ((long) -1 == this.aLong139) {
			return;
		}
		if (this.aLong139 != this.aLong141) {
			this.aClass286_1.method6826(this.aLong139);
			this.aLong141 = this.aLong139;
		}
		this.aClass286_1.method6821(0, this.aByteArray32, this.anInt4439);
		this.aLong141 += (long) this.anInt4439;
		if (this.aLong141 > this.aLong142) {
			this.aLong142 = this.aLong141;
		}
		@Pc(74) long local74 = -1L;
		if (this.aLong139 >= this.aLong144 && this.aLong139 < this.aLong144 + (long) this.anInt4430) {
			local74 = this.aLong139;
		} else if (this.aLong139 <= this.aLong144 && (long) this.anInt4439 + this.aLong139 > this.aLong144) {
			local74 = this.aLong144;
		}
		@Pc(130) long local130 = -1L;
		if (this.aLong139 + (long) this.anInt4439 > this.aLong144 && (long) this.anInt4430 + this.aLong144 >= (long) this.anInt4439 + this.aLong139) {
			local130 = (long) this.anInt4439 + this.aLong139;
		} else if (this.aLong139 < this.aLong144 + (long) this.anInt4430 && (long) this.anInt4430 + this.aLong144 <= this.aLong139 + (long) this.anInt4439) {
			local130 = this.aLong144 + (long) this.anInt4430;
		}
		if (local74 > -1L && local130 > local74) {
			@Pc(226) int local226 = (int) (local130 - local74);
			Static682.method799(this.aByteArray32, (int) (local74 - this.aLong139), this.aByteArray31, (int) (local74 - this.aLong144), local226);
		}
		this.anInt4439 = 0;
		this.aLong139 = -1L;
	}

	@OriginalMember(owner = "client!ika", name = "a", descriptor = "(IB[BI)V")
	public void method3784(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (this.aLong143 < (long) arg2 + this.aLong140) {
				this.aLong143 = (long) arg2 + this.aLong140;
			}
			if (this.aLong139 != -1L && (this.aLong140 < this.aLong139 || this.aLong139 + (long) this.anInt4439 < this.aLong140)) {
				this.method3783();
			}
			if (this.aLong139 != -1L && this.aLong140 + (long) arg2 > this.aLong139 - -((long) this.aByteArray32.length)) {
				@Pc(92) int local92 = (int) (this.aLong139 + (long) this.aByteArray32.length - this.aLong140);
				Static682.method799(arg1, arg0, this.aByteArray32, (int) (this.aLong140 - this.aLong139), local92);
				arg2 -= local92;
				this.aLong140 += (long) local92;
				arg0 += local92;
				this.anInt4439 = this.aByteArray32.length;
				this.method3783();
			}
			if (arg2 > this.aByteArray32.length) {
				if (this.aLong141 != this.aLong140) {
					this.aClass286_1.method6826(this.aLong140);
					this.aLong141 = this.aLong140;
				}
				this.aClass286_1.method6821(arg0, arg1, arg2);
				this.aLong141 += (long) arg2;
				if (this.aLong142 < this.aLong141) {
					this.aLong142 = this.aLong141;
				}
				@Pc(185) long local185 = -1L;
				if (this.aLong144 <= this.aLong140 && this.aLong140 < (long) this.anInt4430 + this.aLong144) {
					local185 = this.aLong140;
				} else if (this.aLong140 <= this.aLong144 && this.aLong140 + (long) arg2 > this.aLong144) {
					local185 = this.aLong144;
				}
				@Pc(241) long local241 = -1L;
				if ((long) arg2 + this.aLong140 > this.aLong144 && (long) arg2 + this.aLong140 <= (long) this.anInt4430 + this.aLong144) {
					local241 = this.aLong140 + (long) arg2;
				} else if (this.aLong140 < (long) this.anInt4430 + this.aLong144 && (long) arg2 + this.aLong140 >= this.aLong144 + (long) this.anInt4430) {
					local241 = (long) this.anInt4430 + this.aLong144;
				}
				if (local185 > -1L && local241 > local185) {
					@Pc(327) int local327 = (int) (local241 - local185);
					Static682.method799(arg1, (int) (local185 + (long) arg0 - this.aLong140), this.aByteArray31, (int) (local185 - this.aLong144), local327);
				}
				this.aLong140 += (long) arg2;
			} else if (arg2 > 0) {
				if (this.aLong139 == -1L) {
					this.aLong139 = this.aLong140;
				}
				Static682.method799(arg1, arg0, this.aByteArray32, (int) (this.aLong140 - this.aLong139), arg2);
				this.aLong140 += (long) arg2;
				if ((long) this.anInt4439 < this.aLong140 - this.aLong139) {
					this.anInt4439 = (int) (this.aLong140 - this.aLong139);
				}
			}
		} catch (@Pc(426) IOException local426) {
			this.aLong141 = -1L;
			throw local426;
		}
	}

	@OriginalMember(owner = "client!ika", name = "a", descriptor = "(B)J")
	public long method3786() {
		return this.aLong143;
	}

	@OriginalMember(owner = "client!ika", name = "a", descriptor = "(III[B)V")
	public void method3787(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if (arg1 > arg2.length) {
				throw new ArrayIndexOutOfBoundsException(arg1 - arg2.length);
			}
			if (this.aLong139 != -1L && this.aLong140 >= this.aLong139 && this.aLong139 + (long) this.anInt4439 >= this.aLong140 - -((long) arg1)) {
				Static682.method799(this.aByteArray32, (int) (this.aLong140 - this.aLong139), arg2, 0, arg1);
				this.aLong140 += (long) arg1;
				return;
			}
			@Pc(88) long local88 = this.aLong140;
			@Pc(92) int local92 = arg1;
			@Pc(126) int local126;
			if (this.aLong140 >= this.aLong144 && this.aLong144 + (long) this.anInt4430 > this.aLong140) {
				local126 = (int) ((long) this.anInt4430 + this.aLong144 - this.aLong140);
				if (local126 > arg1) {
					local126 = arg1;
				}
				Static682.method799(this.aByteArray31, (int) (this.aLong140 - this.aLong144), arg2, 0, local126);
				arg1 -= local126;
				arg0 = local126;
				this.aLong140 += (long) local126;
			}
			if (this.aByteArray31.length < arg1) {
				this.aClass286_1.method6826(this.aLong140);
				this.aLong141 = this.aLong140;
				while (arg1 > 0) {
					local126 = this.aClass286_1.method6822(arg1, arg2, arg0);
					if (local126 == -1) {
						break;
					}
					arg0 += local126;
					this.aLong140 += (long) local126;
					this.aLong141 += (long) local126;
					arg1 -= local126;
				}
			} else if (arg1 > 0) {
				this.method3777();
				local126 = arg1;
				if (arg1 > this.anInt4430) {
					local126 = this.anInt4430;
				}
				Static682.method799(this.aByteArray31, 0, arg2, arg0, local126);
				arg1 -= local126;
				arg0 += local126;
				this.aLong140 += (long) local126;
			}
			if (this.aLong139 != -1L) {
				if (this.aLong140 < this.aLong139 && arg1 > 0) {
					local126 = (int) (this.aLong139 - this.aLong140) + arg0;
					if (arg0 + arg1 < local126) {
						local126 = arg1 + arg0;
					}
					while (local126 > arg0) {
						arg1--;
						arg2[arg0++] = 0;
						this.aLong140++;
					}
				}
				@Pc(338) long local338 = -1L;
				@Pc(340) long local340 = -1L;
				if (local88 <= this.aLong139 && local88 + (long) local92 > this.aLong139) {
					local338 = this.aLong139;
				} else if (local88 >= this.aLong139 && (long) this.anInt4439 + this.aLong139 > local88) {
					local338 = local88;
				}
				if (this.aLong139 + (long) this.anInt4439 > local88 && local88 + (long) local92 >= (long) this.anInt4439 + this.aLong139) {
					local340 = (long) this.anInt4439 + this.aLong139;
				} else if (local88 + (long) local92 > this.aLong139 && (long) this.anInt4439 + this.aLong139 >= local88 + (long) local92) {
					local340 = local88 + (long) local92;
				}
				if (local338 > -1L && local338 < local340) {
					@Pc(474) int local474 = (int) (local340 - local338);
					Static682.method799(this.aByteArray32, (int) (local338 - this.aLong139), arg2, (int) (local338 - local88), local474);
					if (local340 > this.aLong140) {
						arg1 = (int) ((long) arg1 + this.aLong140 - local340);
						this.aLong140 = local340;
					}
				}
			}
		} catch (@Pc(516) IOException local516) {
			this.aLong141 = -1L;
			throw local516;
		}
		if (arg1 > 0) {
			throw new EOFException();
		}
	}
}
