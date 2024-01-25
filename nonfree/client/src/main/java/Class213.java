import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qp")
public final class Class213 {

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "I")
	private int anInt5414;

	@OriginalMember(owner = "client!qp", name = "g", descriptor = "[Z")
	private boolean[] aBooleanArray27;

	@OriginalMember(owner = "client!qp", name = "h", descriptor = "Lclient!id;")
	private Class119 aClass119_2;

	@OriginalMember(owner = "client!qp", name = "k", descriptor = "I")
	private int anInt5419;

	@OriginalMember(owner = "client!qp", name = "m", descriptor = "Lclient!t;")
	private Class116 aClass116_6;

	@OriginalMember(owner = "client!qp", name = "t", descriptor = "I")
	private int anInt5424;

	@OriginalMember(owner = "client!qp", name = "v", descriptor = "I")
	private int anInt5426;

	@OriginalMember(owner = "client!qp", name = "B", descriptor = "Lclient!hk;")
	public Class20_Sub3 aClass20_Sub3_4;

	@OriginalMember(owner = "client!qp", name = "G", descriptor = "Lclient!ba;")
	private Class4_Sub2_Sub3 aClass4_Sub2_Sub3_6;

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "Z")
	private boolean aBoolean383 = false;

	@OriginalMember(owner = "client!qp", name = "r", descriptor = "I")
	private int anInt5423 = -1;

	@OriginalMember(owner = "client!qp", name = "A", descriptor = "I")
	private int anInt5430 = -1;

	@OriginalMember(owner = "client!qp", name = "f", descriptor = "Z")
	private boolean aBoolean384 = false;

	@OriginalMember(owner = "client!qp", name = "E", descriptor = "I")
	private int anInt5433 = -32768;

	@OriginalMember(owner = "client!qp", name = "j", descriptor = "I")
	private int anInt5418;

	@OriginalMember(owner = "client!qp", name = "w", descriptor = "I")
	public final int anInt5427;

	@OriginalMember(owner = "client!qp", name = "H", descriptor = "B")
	private final byte aByte81;

	@OriginalMember(owner = "client!qp", name = "z", descriptor = "I")
	public final int anInt5429;

	@OriginalMember(owner = "client!qp", name = "i", descriptor = "I")
	public final int anInt5417;

	@OriginalMember(owner = "client!qp", name = "O", descriptor = "I")
	private int anInt5439;

	@OriginalMember(owner = "client!qp", name = "o", descriptor = "B")
	private final byte aByte80;

	@OriginalMember(owner = "client!qp", name = "p", descriptor = "Z")
	private final boolean aBoolean385;

	@OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(Lclient!ya;Lclient!ho;IIIIIIZI)V")
	public Class213(@OriginalArg(0) Class135 arg0, @OriginalArg(1) Class114 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		this.anInt5418 = arg7;
		this.anInt5427 = arg2;
		this.aByte81 = (byte) arg5;
		this.aBoolean384 = arg8;
		this.anInt5429 = arg1.anInt2875;
		this.anInt5417 = arg3;
		this.anInt5439 = arg6;
		this.aByte80 = (byte) arg4;
		this.aBoolean385 = arg0.method5337() && arg1.aBoolean216 && !this.aBoolean384;
		if (arg9 != -1) {
			this.aBoolean383 = true;
		}
		this.method4399(arg9);
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(I)I")
	public int method4392() {
		return this.anInt5433;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(ILclient!ya;ZIZII)Lclient!t;")
	public Class116 method4395(@OriginalArg(0) int arg0, @OriginalArg(1) Class135 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) Class114 local11 = Static51.aClass151_1.method2917(this.anInt5429);
		if (local11.anIntArray235 != null) {
			local11 = local11.method2181(Static52.aClass81_1);
		}
		if (local11 == null) {
			this.method4398(arg1);
			this.anInt5423 = this.anInt5419;
			this.anInt5430 = -1;
			return null;
		}
		if (!this.aBoolean383 && this.anInt5430 != local11.anInt2875) {
			this.aClass116_6 = null;
			this.method4399(-1);
		}
		this.method4396(arg5, arg4);
		@Pc(76) boolean local76 = arg2 & this.aBoolean385 & Static413.aClass49_Sub1_1.method2478(Static341.anInt5549) != 0;
		@Pc(124) boolean local124 = local76 & (local11.anInt2875 != this.anInt5430 || (this.anInt5423 != this.anInt5419 || this.aClass119_2 != null && (this.aClass119_2.aBoolean220 || Static272.aBoolean335) && this.anInt5424 != this.anInt5419) && Static413.aClass49_Sub1_1.method2478(Static341.anInt5549) >= 2);
		if (arg3 && !local124) {
			this.anInt5423 = this.anInt5419;
			this.anInt5430 = local11.anInt2875;
			return null;
		}
		if (local124) {
			Static323.method4972(this.aClass4_Sub2_Sub3_6, this.aByte81, this.anInt5439, this.anInt5418, this.aBooleanArray27);
		}
		@Pc(156) Class41 local156 = Static278.aClass41Array3[this.aByte81];
		@Pc(174) Class41 local174;
		if (this.aBoolean384) {
			local174 = Static228.aClass41Array2[0];
		} else {
			local174 = this.aByte81 < 3 ? Static278.aClass41Array3[this.aByte81 + 1] : null;
		}
		@Pc(182) Class116 local182 = null;
		if (this.aClass119_2 != null) {
			if (local124) {
				arg0 |= 0x40000;
			}
			local182 = local11.method2194(this.anInt5439, this.anInt5419, this.anInt5426, this.anInt5427 == 11 ? 10 : this.anInt5427, this.anInt5418, arg0, arg1, local156.a(this.anInt5439, this.anInt5418), local156, this.anInt5427 == 11 ? this.anInt5417 + 4 : this.anInt5417, local174, this.anInt5424, this.aClass119_2);
			if (local182 == null) {
				this.anInt5433 = 0;
				this.aBooleanArray27 = null;
				this.aClass4_Sub2_Sub3_6 = null;
			} else {
				if (local124) {
					if (this.aBooleanArray27 == null) {
						this.aBooleanArray27 = new boolean[4];
					}
					this.aClass4_Sub2_Sub3_6 = local182.fa(this.aClass4_Sub2_Sub3_6);
					Static432.method5741(this.aClass4_Sub2_Sub3_6, this.aByte81, arg5, arg4, this.aBooleanArray27);
				}
				this.anInt5433 = local182.MA();
			}
			this.aClass116_6 = null;
		} else if (this.aClass116_6 != null && (arg0 & this.aClass116_6.P()) == arg0 && local11.anInt2875 == this.anInt5430) {
			local182 = this.aClass116_6;
		} else {
			if (this.aClass116_6 != null) {
				arg0 |= this.aClass116_6.P();
			}
			@Pc(253) Class55 local253 = local11.method2190(this.anInt5439, local156.a(this.anInt5439, this.anInt5418), local124, local174, this.anInt5427 == 11 ? 10 : this.anInt5427, arg1, arg0, local156, this.anInt5418, this.anInt5427 == 11 ? this.anInt5417 + 4 : this.anInt5417);
			if (local253 == null) {
				this.aBooleanArray27 = null;
				this.aClass116_6 = null;
				this.anInt5433 = 0;
				this.aClass4_Sub2_Sub3_6 = null;
			} else {
				local182 = local253.aClass116_4;
				this.aClass116_6 = local253.aClass116_4;
				if (local124) {
					this.aBooleanArray27 = null;
					this.aClass4_Sub2_Sub3_6 = local253.aClass4_Sub2_Sub3_4;
					Static432.method5741(this.aClass4_Sub2_Sub3_6, this.aByte81, arg5, arg4, null);
				}
				this.anInt5433 = local182.MA();
			}
		}
		this.anInt5430 = local11.anInt2875;
		this.anInt5423 = this.anInt5419;
		this.anInt5439 = arg5;
		this.anInt5418 = arg4;
		return local182;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(III)V")
	private void method4396(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		label80: while (true) {
			if (this.aClass119_2 == null) {
				if (this.aBoolean383) {
					return;
				}
				this.method4399(-1);
				if (this.aClass119_2 == null) {
					return;
				}
			}
			@Pc(32) int local32 = Static265.anInt4371 - this.anInt5414;
			if (local32 > 100 && this.aClass119_2.anInt2995 > 0) {
				@Pc(49) int local49 = this.aClass119_2.anIntArray244.length - this.aClass119_2.anInt2995;
				while (local49 > this.anInt5419 && this.aClass119_2.anIntArray242[this.anInt5419] < local32) {
					local32 -= this.aClass119_2.anIntArray242[this.anInt5419];
					this.anInt5419++;
				}
				if (local49 <= this.anInt5419) {
					@Pc(84) int local84 = 0;
					for (@Pc(86) int local86 = local49; local86 < this.aClass119_2.anIntArray244.length; local86++) {
						local84 += this.aClass119_2.anIntArray242[local86];
					}
					local32 %= local84;
				}
				this.anInt5424 = this.anInt5419 + 1;
				if (this.anInt5424 >= this.aClass119_2.anIntArray244.length) {
					this.anInt5424 -= this.aClass119_2.anInt2995;
					if (this.anInt5424 < 0 || this.aClass119_2.anIntArray244.length <= this.anInt5424) {
						this.anInt5424 = -1;
					}
				}
			}
			while (this.aClass119_2.anIntArray242[this.anInt5419] < local32) {
				Static334.method4419(arg0, this.aClass119_2, this.aByte80, false, this.anInt5419, arg1);
				local32 -= this.aClass119_2.anIntArray242[this.anInt5419];
				this.anInt5419++;
				if (this.aClass119_2.anIntArray244.length <= this.anInt5419) {
					this.anInt5419 -= this.aClass119_2.anInt2995;
					if (this.anInt5419 < 0 || this.anInt5419 >= this.aClass119_2.anIntArray244.length) {
						this.aClass119_2 = null;
						continue label80;
					}
				}
				this.anInt5424 = this.anInt5419 + 1;
				if (this.aClass119_2.anIntArray244.length <= this.anInt5424) {
					this.anInt5424 -= this.aClass119_2.anInt2995;
					if (this.anInt5424 < 0 || this.aClass119_2.anIntArray244.length <= this.anInt5424) {
						this.anInt5424 = -1;
					}
				}
			}
			this.anInt5426 = local32;
			this.anInt5414 = Static265.anInt4371 - local32;
			return;
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(B)Z")
	public boolean method4397() {
		return this.aBoolean385;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lclient!ya;I)V")
	public void method4398(@OriginalArg(0) Class135 arg0) {
		if (this.aClass4_Sub2_Sub3_6 != null) {
			Static323.method4972(this.aClass4_Sub2_Sub3_6, this.aByte81, this.anInt5439, this.anInt5418, this.aBooleanArray27);
			this.aClass4_Sub2_Sub3_6 = null;
			this.aBooleanArray27 = null;
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IB)V")
	private void method4399(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0;
		@Pc(9) boolean local9 = false;
		if (arg0 == -1) {
			@Pc(18) Class114 local18 = Static51.aClass151_1.method2917(this.anInt5429);
			@Pc(20) Class114 local20 = local18;
			if (local18.anIntArray235 != null) {
				local18 = local18.method2181(Static52.aClass81_1);
			}
			if (local18 == null) {
				return;
			}
			if (local20 == local18) {
				local20 = null;
			}
			if (local18.anIntArray234 != null) {
				if (this.aClass119_2 != null && local18.method2182(this.aClass119_2.anInt2993)) {
					return;
				}
				local7 = local18.method2196();
				if (local18.anInt2875 != this.anInt5430) {
					local9 = local18.aBoolean213;
				}
			} else if (local18.anInt2837 == -1) {
				if (local20 != null && local20.anIntArray234 != null) {
					if (this.aClass119_2 != null && local20.method2182(this.aClass119_2.anInt2993)) {
						return;
					}
					local7 = local20.method2196();
					if (local20.anInt2875 != this.anInt5430) {
						local9 = local20.aBoolean213;
					}
				} else if (local20 != null && local20.anInt2837 != -1 && this.anInt5430 != local20.anInt2875) {
					local7 = local20.anInt2837;
					local9 = local20.aBoolean213;
				}
			} else if (this.anInt5430 != local18.anInt2875) {
				local9 = local18.aBoolean213;
				local7 = local18.anInt2837;
			}
		}
		if (local7 == -1) {
			this.aClass119_2 = null;
			return;
		}
		this.aClass116_6 = null;
		if (this.aClass119_2 == null || this.aClass119_2.anInt2993 != local7) {
			this.aClass119_2 = Static170.aClass125_3.method2389(local7);
		} else if (this.aClass119_2.anInt3012 == 0) {
			return;
		}
		if (this.aClass119_2.anIntArray244 == null) {
			this.aClass119_2 = null;
			return;
		}
		if (local9) {
			this.anInt5419 = (int) (Math.random() * (double) this.aClass119_2.anIntArray244.length);
			this.anInt5426 = (int) ((double) this.aClass119_2.anIntArray242[this.anInt5419] * Math.random()) + 1;
		} else {
			this.anInt5419 = 0;
			this.anInt5426 = 1;
		}
		this.anInt5424 = this.anInt5419 + 1;
		if (this.anInt5424 < 0 || this.aClass119_2.anIntArray244.length <= this.anInt5424) {
			this.anInt5424 = -1;
		}
		this.anInt5414 = Static265.anInt4371 - this.anInt5426;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IILclient!t;IIIZLclient!ya;)V")
	public void method4400(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class116 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) Class135 arg6) {
		@Pc(13) Class76[] local13 = arg2.method3111();
		@Pc(16) Class88[] local16 = arg2.method3115();
		if ((this.aClass20_Sub3_4 == null || this.aClass20_Sub3_4.aBoolean199) && (local13 != null || local16 != null)) {
			@Pc(33) Class114 local33 = Static51.aClass151_1.method2917(this.anInt5429);
			if (local33.anIntArray235 != null) {
				local33 = local33.method2181(Static52.aClass81_1);
			}
			if (local33 != null) {
				this.aClass20_Sub3_4 = new Class20_Sub3(Static265.anInt4371);
			}
		}
		if (this.aClass20_Sub3_4 == null) {
			return;
		}
		if (arg5) {
			this.aClass20_Sub3_4.method2125(arg6, (long) Static265.anInt4371, local13, local16);
		} else {
			this.aClass20_Sub3_4.method2128((long) Static265.anInt4371);
		}
		this.aClass20_Sub3_4.method2136(this.aByte80, arg1, arg3, arg0, arg4);
	}

	@OriginalMember(owner = "client!qp", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass20_Sub3_4 != null) {
			this.aClass20_Sub3_4.method2127();
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lclient!ya;B)V")
	public void method4403(@OriginalArg(0) Class135 arg0) {
		this.method4395(262144, arg0, true, true, this.anInt5418, this.anInt5439);
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(II)V")
	public void method4404(@OriginalArg(0) int arg0) {
		this.aBoolean383 = true;
		this.method4399(arg0);
	}
}
