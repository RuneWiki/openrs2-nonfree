import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mp")
public final class Class213 {

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "I")
	public int anInt7040;

	@OriginalMember(owner = "client!mp", name = "d", descriptor = "I")
	public int anInt7041;

	@OriginalMember(owner = "client!mp", name = "h", descriptor = "I")
	public int anInt7042;

	@OriginalMember(owner = "client!mp", name = "o", descriptor = "I")
	public int anInt7045;

	@OriginalMember(owner = "client!mp", name = "F", descriptor = "I")
	private int anInt7055;

	@OriginalMember(owner = "client!mp", name = "c", descriptor = "Z")
	public boolean aBoolean509 = false;

	@OriginalMember(owner = "client!mp", name = "j", descriptor = "I")
	public int anInt7043 = 0;

	@OriginalMember(owner = "client!mp", name = "k", descriptor = "Z")
	private boolean aBoolean512 = false;

	@OriginalMember(owner = "client!mp", name = "l", descriptor = "[I")
	public final int[] anIntArray445 = new int[4096];

	@OriginalMember(owner = "client!mp", name = "e", descriptor = "Z")
	public boolean aBoolean510 = true;

	@OriginalMember(owner = "client!mp", name = "g", descriptor = "Z")
	public boolean aBoolean511 = false;

	@OriginalMember(owner = "client!mp", name = "p", descriptor = "Z")
	private final boolean aBoolean513 = false;

	@OriginalMember(owner = "client!mp", name = "r", descriptor = "F")
	private float aFloat159 = 0.0F;

	@OriginalMember(owner = "client!mp", name = "u", descriptor = "[I")
	private int[] anIntArray446 = null;

	@OriginalMember(owner = "client!mp", name = "w", descriptor = "I")
	private final int anInt7048 = -1;

	@OriginalMember(owner = "client!mp", name = "t", descriptor = "F")
	private float aFloat160 = 0.0F;

	@OriginalMember(owner = "client!mp", name = "C", descriptor = "I")
	private int anInt7053 = 0;

	@OriginalMember(owner = "client!mp", name = "A", descriptor = "I")
	private int anInt7052 = 0;

	@OriginalMember(owner = "client!mp", name = "B", descriptor = "[I")
	private int[] anIntArray447 = null;

	@OriginalMember(owner = "client!mp", name = "y", descriptor = "I")
	private final int anInt7050 = -1;

	@OriginalMember(owner = "client!mp", name = "s", descriptor = "I")
	private int anInt7046 = 0;

	@OriginalMember(owner = "client!mp", name = "q", descriptor = "F")
	private float aFloat158 = 0.0F;

	@OriginalMember(owner = "client!mp", name = "D", descriptor = "Z")
	private boolean aBoolean514 = true;

	@OriginalMember(owner = "client!mp", name = "x", descriptor = "I")
	private int anInt7049 = 0;

	@OriginalMember(owner = "client!mp", name = "E", descriptor = "I")
	private int anInt7054 = 0;

	@OriginalMember(owner = "client!mp", name = "v", descriptor = "I")
	private int anInt7047 = 0;

	@OriginalMember(owner = "client!mp", name = "z", descriptor = "I")
	private int anInt7051 = 0;

	@OriginalMember(owner = "client!mp", name = "G", descriptor = "I")
	private final int anInt7056 = -1;

	@OriginalMember(owner = "client!mp", name = "H", descriptor = "[I")
	private int[] anIntArray448 = null;

	@OriginalMember(owner = "client!mp", name = "b", descriptor = "Lclient!ao;")
	private final Class20_Sub1 aClass20_Sub1_10;

	@OriginalMember(owner = "client!mp", name = "f", descriptor = "Lclient!pga;")
	private final Class261 aClass261_3;

	@OriginalMember(owner = "client!mp", name = "n", descriptor = "I")
	private final int anInt7044;

	@OriginalMember(owner = "client!mp", name = "i", descriptor = "[I")
	private final int[] anIntArray444;

	@OriginalMember(owner = "client!mp", name = "m", descriptor = "[F")
	private final float[] aFloatArray58;

	@OriginalMember(owner = "client!mp", name = "<init>", descriptor = "(Lclient!ao;Lclient!pga;)V")
	public Class213(@OriginalArg(0) Class20_Sub1 arg0, @OriginalArg(1) Class261 arg1) {
		this.aClass20_Sub1_10 = arg0;
		this.aClass261_3 = arg1;
		this.anInt7044 = this.aClass20_Sub1_10.anInt360;
		this.anIntArray444 = this.aClass20_Sub1_10.anIntArray22;
		this.aFloatArray58 = this.aClass20_Sub1_10.aFloatArray2;
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "([I[IIIIFFFFFFFFFFFFFFFF)V")
	private void method6013(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) float arg11, @OriginalArg(12) float arg12, @OriginalArg(13) float arg13, @OriginalArg(14) float arg14, @OriginalArg(15) float arg15, @OriginalArg(16) float arg16, @OriginalArg(17) float arg17, @OriginalArg(18) float arg18, @OriginalArg(19) float arg19, @OriginalArg(20) float arg20) {
		@Pc(3) int local3 = arg4 - arg3;
		@Pc(8) float local8 = 1.0F / (float) local3;
		@Pc(14) float local14 = (arg6 - arg5) * local8;
		@Pc(20) float local20 = (arg8 - arg7) * local8;
		@Pc(26) float local26 = (arg10 - arg9) * local8;
		@Pc(32) float local32 = (arg12 - arg11) * local8;
		@Pc(38) float local38 = (arg14 - arg13) * local8;
		@Pc(44) float local44 = (arg16 - arg15) * local8;
		@Pc(50) float local50 = (arg18 - arg17) * local8;
		@Pc(56) float local56 = (arg20 - arg19) * local8;
		if (this.aBoolean511) {
			if (arg4 > this.anInt7045) {
				arg4 = this.anInt7045;
			}
			if (arg3 < 0) {
				arg5 -= local14 * (float) arg3;
				arg7 -= local20 * (float) arg3;
				arg9 -= local26 * (float) arg3;
				arg11 -= local32 * (float) arg3;
				arg13 -= local38 * (float) arg3;
				arg15 -= local44 * (float) arg3;
				arg17 -= local50 * (float) arg3;
				arg19 -= local56 * (float) arg3;
				arg3 = 0;
			}
		}
		if (arg3 >= arg4) {
			return;
		}
		local3 = arg4 - arg3;
		@Pc(138) int local138 = arg2 + arg3;
		while (local3-- > 0) {
			@Pc(143) float local143 = 1.0F / arg5;
			if (local143 < this.aFloatArray58[local138]) {
				@Pc(159) int local159 = (int) (arg7 * local143 * (float) this.anInt7053);
				if (this.aBoolean514) {
					local159 &= this.anInt7051;
				} else if (local159 < 0) {
					local159 = 0;
				} else if (local159 > this.anInt7051) {
					local159 = this.anInt7051;
				}
				@Pc(189) int local189 = (int) (arg9 * local143 * (float) this.anInt7053);
				if (this.aBoolean514) {
					local189 &= this.anInt7051;
				} else if (local189 < 0) {
					local189 = 0;
				} else if (local189 > this.anInt7051) {
					local189 = this.anInt7051;
				}
				@Pc(220) int local220 = this.anIntArray448[local189 * this.anInt7053 + local159];
				@Pc(232) int local232;
				if (this.anInt7046 == 2) {
					local232 = local220 >> 24 & 0xFF;
				} else if (this.anInt7046 == 1) {
					local232 = local220 == 0 ? 0 : 255;
				} else {
					local232 = (int) arg13;
				}
				if (local232 != 0) {
					@Pc(290) int local290;
					@Pc(299) int local299;
					@Pc(321) int local321;
					if (local232 == 255) {
						local290 = ((int) (arg15 * (float) (local220 >> 16 & 0xFF)) & 0xFF00 | 0xFF0000) << 8 | (int) (arg17 * (float) (local220 >> 8 & 0xFF)) & 0xFF00 | (int) (arg19 * (float) (local220 & 0xFF)) >> 8;
						if (arg11 != 0.0F) {
							local299 = (int) (255.0F - arg11);
							local321 = ((this.anInt7055 & 0xFF00FF) * (int) arg11 & 0xFF00FF00 | (this.anInt7055 & 0xFF00) * (int) arg11 & 0xFF0000) >>> 8;
							local290 = (((local290 & 0xFF00FF) * local299 & 0xFF00FF00 | (local290 & 0xFF00) * local299 & 0xFF0000) >>> 8) + local321;
						}
						arg0[local138] = local290;
						this.aFloatArray58[local138] = local143;
					} else {
						local290 = ((int) (arg15 * (float) (local220 >> 16 & 0xFF)) & 0xFF00 | 0xFF0000) << 8 | (int) (arg17 * (float) (local220 >> 8 & 0xFF)) & 0xFF00 | (int) (arg19 * (float) (local220 & 0xFF)) >> 8;
						if (arg11 != 0.0F) {
							local299 = (int) (255.0F - arg11);
							local321 = ((this.anInt7055 & 0xFF00FF) * (int) arg11 & 0xFF00FF00 | (this.anInt7055 & 0xFF00) * (int) arg11 & 0xFF0000) >>> 8;
							local290 = (((local290 & 0xFF00FF) * local299 & 0xFF00FF00 | (local290 & 0xFF00) * local299 & 0xFF0000) >>> 8) + local321;
						}
						local299 = arg0[local138];
						local321 = 255 - local232;
						local290 = ((local299 & 0xFF00FF) * local321 + (local290 & 0xFF00FF) * local232 & 0xFF00FF00) + ((local299 & 0xFF00) * local321 + (local290 & 0xFF00) * local232 & 0xFF0000) >> 8;
						arg0[local138] = local290;
						this.aFloatArray58[local138] = local143;
					}
				}
			}
			local138++;
			arg5 += local14;
			arg7 += local20;
			arg9 += local26;
			arg11 += local32;
			arg13 += local38;
			arg15 += local44;
			arg17 += local50;
			arg19 += local56;
		}
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "()I")
	public int method6014() {
		return this.anIntArray445[0] / this.anInt7044;
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(FFFFFFFFFI)V")
	public void method6015(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) int arg9) {
		if (this.aBoolean512) {
			this.aClass20_Sub1_10.method7248((int) arg0, (int) arg3, (int) arg4, arg9, (int) arg1);
			this.aClass20_Sub1_10.method7248((int) arg1, (int) arg4, (int) arg5, arg9, (int) arg2);
			this.aClass20_Sub1_10.method7248((int) arg2, (int) arg5, (int) arg3, arg9, (int) arg0);
			return;
		}
		@Pc(46) float local46 = arg4 - arg3;
		@Pc(50) float local50 = arg1 - arg0;
		@Pc(54) float local54 = arg5 - arg3;
		@Pc(58) float local58 = arg2 - arg0;
		@Pc(62) float local62 = arg7 - arg6;
		@Pc(66) float local66 = arg8 - arg6;
		@Pc(68) float local68 = 0.0F;
		if (arg1 != arg0) {
			local68 = (arg4 - arg3) / (arg1 - arg0);
		}
		@Pc(82) float local82 = 0.0F;
		if (arg2 != arg1) {
			local82 = (arg5 - arg4) / (arg2 - arg1);
		}
		@Pc(96) float local96 = 0.0F;
		if (arg2 != arg0) {
			local96 = (arg3 - arg5) / (arg0 - arg2);
		}
		@Pc(116) float local116 = local46 * local58 - local54 * local50;
		if (local116 == 0.0F) {
			return;
		}
		@Pc(131) float local131 = (local62 * local58 - local66 * local50) / local116;
		@Pc(141) float local141 = (local66 * local46 - local62 * local54) / local116;
		if (arg0 <= arg1 && arg0 <= arg2) {
			if (!(arg0 >= (float) this.anInt7042)) {
				if (arg1 > (float) this.anInt7042) {
					arg1 = this.anInt7042;
				}
				if (arg2 > (float) this.anInt7042) {
					arg2 = this.anInt7042;
				}
				arg6 = arg6 + local131 - local131 * arg3;
				if (arg1 < arg2) {
					arg5 = arg3;
					if (arg0 < 0.0F) {
						arg5 = arg3 - local96 * arg0;
						arg3 -= local68 * arg0;
						arg6 -= local141 * arg0;
						arg0 = 0.0F;
					}
					if (arg1 < 0.0F) {
						arg4 -= local82 * arg1;
						arg1 = 0.0F;
					}
					if (arg0 != arg1 && local96 < local68 || arg0 == arg1 && local96 > local82) {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = this.anIntArray445[(int) arg0];
						while (--arg1 >= 0.0F) {
							this.method6023(this.anIntArray444, this.aFloatArray58, (int) arg0, arg9, (int) arg5, (int) arg3, arg6, local131);
							arg5 += local96;
							arg3 += local68;
							arg6 += local141;
							arg0 += this.anInt7044;
						}
						while (--arg2 >= 0.0F) {
							this.method6023(this.anIntArray444, this.aFloatArray58, (int) arg0, arg9, (int) arg5, (int) arg4, arg6, local131);
							arg5 += local96;
							arg4 += local82;
							arg6 += local141;
							arg0 += this.anInt7044;
						}
					} else {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = this.anIntArray445[(int) arg0];
						while (--arg1 >= 0.0F) {
							this.method6023(this.anIntArray444, this.aFloatArray58, (int) arg0, arg9, (int) arg3, (int) arg5, arg6, local131);
							arg5 += local96;
							arg3 += local68;
							arg6 += local141;
							arg0 += this.anInt7044;
						}
						while (--arg2 >= 0.0F) {
							this.method6023(this.anIntArray444, this.aFloatArray58, (int) arg0, arg9, (int) arg4, (int) arg5, arg6, local131);
							arg5 += local96;
							arg4 += local82;
							arg6 += local141;
							arg0 += this.anInt7044;
						}
					}
				} else {
					arg4 = arg3;
					if (arg0 < 0.0F) {
						arg4 = arg3 - local96 * arg0;
						arg3 -= local68 * arg0;
						arg6 -= local141 * arg0;
						arg0 = 0.0F;
					}
					if (arg2 < 0.0F) {
						arg5 -= local82 * arg2;
						arg2 = 0.0F;
					}
					if ((arg0 == arg2 || !(local96 < local68)) && (arg0 != arg2 || !(local82 > local68))) {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = this.anIntArray445[(int) arg0];
						while (--arg2 >= 0.0F) {
							this.method6023(this.anIntArray444, this.aFloatArray58, (int) arg0, arg9, (int) arg3, (int) arg4, arg6, local131);
							arg4 += local96;
							arg3 += local68;
							arg6 += local141;
							arg0 += this.anInt7044;
						}
						while (--arg1 >= 0.0F) {
							this.method6023(this.anIntArray444, this.aFloatArray58, (int) arg0, arg9, (int) arg3, (int) arg5, arg6, local131);
							arg5 += local82;
							arg3 += local68;
							arg6 += local141;
							arg0 += this.anInt7044;
						}
					} else {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = this.anIntArray445[(int) arg0];
						while (--arg2 >= 0.0F) {
							this.method6023(this.anIntArray444, this.aFloatArray58, (int) arg0, arg9, (int) arg4, (int) arg3, arg6, local131);
							arg4 += local96;
							arg3 += local68;
							arg6 += local141;
							arg0 += this.anInt7044;
						}
						while (--arg1 >= 0.0F) {
							this.method6023(this.anIntArray444, this.aFloatArray58, (int) arg0, arg9, (int) arg5, (int) arg3, arg6, local131);
							arg5 += local82;
							arg3 += local68;
							arg6 += local141;
							arg0 += this.anInt7044;
						}
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (!(arg1 >= (float) this.anInt7042)) {
				if (arg2 > (float) this.anInt7042) {
					arg2 = this.anInt7042;
				}
				if (arg0 > (float) this.anInt7042) {
					arg0 = this.anInt7042;
				}
				arg7 = arg7 + local131 - local131 * arg4;
				if (arg2 < arg0) {
					arg3 = arg4;
					if (arg1 < 0.0F) {
						arg3 = arg4 - local68 * arg1;
						arg4 -= local82 * arg1;
						arg7 -= local141 * arg1;
						arg1 = 0.0F;
					}
					if (arg2 < 0.0F) {
						arg5 -= local96 * arg2;
						arg2 = 0.0F;
					}
					if (arg1 != arg2 && local68 < local82 || arg1 == arg2 && local68 > local96) {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = this.anIntArray445[(int) arg1];
						while (--arg2 >= 0.0F) {
							this.method6023(this.anIntArray444, this.aFloatArray58, (int) arg1, arg9, (int) arg3, (int) arg4, arg7, local131);
							arg3 += local68;
							arg4 += local82;
							arg7 += local141;
							arg1 += this.anInt7044;
						}
						while (--arg0 >= 0.0F) {
							this.method6023(this.anIntArray444, this.aFloatArray58, (int) arg1, arg9, (int) arg3, (int) arg5, arg7, local131);
							arg3 += local68;
							arg5 += local96;
							arg7 += local141;
							arg1 += this.anInt7044;
						}
					} else {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = this.anIntArray445[(int) arg1];
						while (--arg2 >= 0.0F) {
							this.method6023(this.anIntArray444, this.aFloatArray58, (int) arg1, arg9, (int) arg4, (int) arg3, arg7, local131);
							arg3 += local68;
							arg4 += local82;
							arg7 += local141;
							arg1 += this.anInt7044;
						}
						while (--arg0 >= 0.0F) {
							this.method6023(this.anIntArray444, this.aFloatArray58, (int) arg1, arg9, (int) arg5, (int) arg3, arg7, local131);
							arg3 += local68;
							arg5 += local96;
							arg7 += local141;
							arg1 += this.anInt7044;
						}
					}
				} else {
					arg5 = arg4;
					if (arg1 < 0.0F) {
						arg5 = arg4 - local68 * arg1;
						arg4 -= local82 * arg1;
						arg7 -= local141 * arg1;
						arg1 = 0.0F;
					}
					if (arg0 < 0.0F) {
						arg3 -= local96 * arg0;
						arg0 = 0.0F;
					}
					if (local68 < local82) {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = this.anIntArray445[(int) arg1];
						while (--arg0 >= 0.0F) {
							this.method6023(this.anIntArray444, this.aFloatArray58, (int) arg1, arg9, (int) arg5, (int) arg4, arg7, local131);
							arg5 += local68;
							arg4 += local82;
							arg7 += local141;
							arg1 += this.anInt7044;
						}
						while (--arg2 >= 0.0F) {
							this.method6023(this.anIntArray444, this.aFloatArray58, (int) arg1, arg9, (int) arg3, (int) arg4, arg7, local131);
							arg3 += local96;
							arg4 += local82;
							arg7 += local141;
							arg1 += this.anInt7044;
						}
					} else {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = this.anIntArray445[(int) arg1];
						while (--arg0 >= 0.0F) {
							this.method6023(this.anIntArray444, this.aFloatArray58, (int) arg1, arg9, (int) arg4, (int) arg5, arg7, local131);
							arg5 += local68;
							arg4 += local82;
							arg7 += local141;
							arg1 += this.anInt7044;
						}
						while (--arg2 >= 0.0F) {
							this.method6023(this.anIntArray444, this.aFloatArray58, (int) arg1, arg9, (int) arg4, (int) arg3, arg7, local131);
							arg3 += local96;
							arg4 += local82;
							arg7 += local141;
							arg1 += this.anInt7044;
						}
					}
				}
			}
		} else if (!(arg2 >= (float) this.anInt7042)) {
			if (arg0 > (float) this.anInt7042) {
				arg0 = this.anInt7042;
			}
			if (arg1 > (float) this.anInt7042) {
				arg1 = this.anInt7042;
			}
			arg8 = arg8 + local131 - local131 * arg5;
			if (arg0 < arg1) {
				arg4 = arg5;
				if (arg2 < 0.0F) {
					arg4 = arg5 - local82 * arg2;
					arg5 -= local96 * arg2;
					arg8 -= local141 * arg2;
					arg2 = 0.0F;
				}
				if (arg0 < 0.0F) {
					arg3 -= local68 * arg0;
					arg0 = 0.0F;
				}
				if (local82 < local96) {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = this.anIntArray445[(int) arg2];
					while (--arg0 >= 0.0F) {
						this.method6023(this.anIntArray444, this.aFloatArray58, (int) arg2, arg9, (int) arg4, (int) arg5, arg8, local131);
						arg4 += local82;
						arg5 += local96;
						arg8 += local141;
						arg2 += this.anInt7044;
					}
					while (--arg1 >= 0.0F) {
						this.method6023(this.anIntArray444, this.aFloatArray58, (int) arg2, arg9, (int) arg4, (int) arg3, arg8, local131);
						arg4 += local82;
						arg3 += local68;
						arg8 += local141;
						arg2 += this.anInt7044;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = this.anIntArray445[(int) arg2];
					while (--arg0 >= 0.0F) {
						this.method6023(this.anIntArray444, this.aFloatArray58, (int) arg2, arg9, (int) arg5, (int) arg4, arg8, local131);
						arg4 += local82;
						arg5 += local96;
						arg8 += local141;
						arg2 += this.anInt7044;
					}
					while (--arg1 >= 0.0F) {
						this.method6023(this.anIntArray444, this.aFloatArray58, (int) arg2, arg9, (int) arg3, (int) arg4, arg8, local131);
						arg4 += local82;
						arg3 += local68;
						arg8 += local141;
						arg2 += this.anInt7044;
					}
				}
			} else {
				arg3 = arg5;
				if (arg2 < 0.0F) {
					arg3 = arg5 - local82 * arg2;
					arg5 -= local96 * arg2;
					arg8 -= local141 * arg2;
					arg2 = 0.0F;
				}
				if (arg1 < 0.0F) {
					arg4 -= local68 * arg1;
					arg1 = 0.0F;
				}
				if (local82 < local96) {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = this.anIntArray445[(int) arg2];
					while (--arg1 >= 0.0F) {
						this.method6023(this.anIntArray444, this.aFloatArray58, (int) arg2, arg9, (int) arg3, (int) arg5, arg8, local131);
						arg3 += local82;
						arg5 += local96;
						arg8 += local141;
						arg2 += this.anInt7044;
					}
					while (--arg0 >= 0.0F) {
						this.method6023(this.anIntArray444, this.aFloatArray58, (int) arg2, arg9, (int) arg4, (int) arg5, arg8, local131);
						arg4 += local68;
						arg5 += local96;
						arg8 += local141;
						arg2 += this.anInt7044;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = this.anIntArray445[(int) arg2];
					while (--arg1 >= 0.0F) {
						this.method6023(this.anIntArray444, this.aFloatArray58, (int) arg2, arg9, (int) arg5, (int) arg3, arg8, local131);
						arg3 += local82;
						arg5 += local96;
						arg8 += local141;
						arg2 += this.anInt7044;
					}
					while (--arg0 >= 0.0F) {
						this.method6023(this.anIntArray444, this.aFloatArray58, (int) arg2, arg9, (int) arg5, (int) arg4, arg8, local131);
						arg4 += local68;
						arg5 += local96;
						arg8 += local141;
						arg2 += this.anInt7044;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "([I[FIIIIIFFFF)V")
	private void method6016(@OriginalArg(0) int[] arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) float arg5, @OriginalArg(8) float arg6, @OriginalArg(9) float arg7, @OriginalArg(10) float arg8) {
		if (this.aBoolean511) {
			if (arg4 > this.anInt7045) {
				arg4 = this.anInt7045;
			}
			if (arg3 < 0) {
				arg3 = 0;
			}
		}
		if (arg3 >= arg4) {
			return;
		}
		arg2 += arg3 - 1;
		arg5 += arg6 * (float) arg3;
		arg7 += arg8 * (float) arg3;
		@Pc(186) int local186;
		@Pc(191) int local191;
		@Pc(233) int local233;
		@Pc(50) int local50;
		@Pc(64) int local64;
		@Pc(71) int local71;
		@Pc(54) float local54;
		@Pc(87) float local87;
		if (this.aClass261_3.aBoolean573) {
			if (this.aBoolean510) {
				local50 = arg4 - arg3 >> 2;
				local54 = arg6 * 4.0F;
				if (this.anInt7043 == 0) {
					if (local50 > 0) {
						do {
							local64 = Static373.anIntArray464[(int) arg5];
							arg5 += local54;
							local71 = arg2 + 1;
							if (arg7 < arg1[local71]) {
								arg0[local71] = local64;
								arg1[local71] = arg7;
							}
							local87 = arg7 + arg8;
							local71++;
							if (local87 < arg1[local71]) {
								arg0[local71] = local64;
								arg1[local71] = local87;
							}
							local87 += arg8;
							local71++;
							if (local87 < arg1[local71]) {
								arg0[local71] = local64;
								arg1[local71] = local87;
							}
							local87 += arg8;
							arg2 = local71 + 1;
							if (local87 < arg1[arg2]) {
								arg0[arg2] = local64;
								arg1[arg2] = local87;
							}
							arg7 = local87 + arg8;
							local50--;
						} while (local50 > 0);
					}
					local50 = arg4 - arg3 & 0x3;
					if (local50 > 0) {
						local64 = Static373.anIntArray464[(int) arg5];
						do {
							arg2++;
							if (arg7 < arg1[arg2]) {
								arg0[arg2] = local64;
								arg1[arg2] = arg7;
							}
							arg7 += arg8;
							local50--;
						} while (local50 > 0);
						return;
					}
				} else {
					local186 = this.anInt7043;
					local191 = 256 - this.anInt7043;
					if (local50 > 0) {
						do {
							local64 = Static373.anIntArray464[(int) arg5];
							arg5 += local54;
							local64 = ((local64 & 0xFF00FF) * local191 >> 8 & 0xFF00FF) + ((local64 & 0xFF00) * local191 >> 8 & 0xFF00);
							local71 = arg2 + 1;
							if (arg7 < arg1[local71]) {
								local233 = arg0[local71];
								arg0[local71] = local64 + ((local233 & 0xFF00FF) * local186 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local186 >> 8 & 0xFF00);
								arg1[local71] = arg7;
							}
							local87 = arg7 + arg8;
							local71++;
							if (local87 < arg1[local71]) {
								local233 = arg0[local71];
								arg0[local71] = local64 + ((local233 & 0xFF00FF) * local186 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local186 >> 8 & 0xFF00);
								arg1[local71] = local87;
							}
							local87 += arg8;
							local71++;
							if (local87 < arg1[local71]) {
								local233 = arg0[local71];
								arg0[local71] = local64 + ((local233 & 0xFF00FF) * local186 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local186 >> 8 & 0xFF00);
								arg1[local71] = local87;
							}
							local87 += arg8;
							arg2 = local71 + 1;
							if (local87 < arg1[arg2]) {
								local233 = arg0[arg2];
								arg0[arg2] = local64 + ((local233 & 0xFF00FF) * local186 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local186 >> 8 & 0xFF00);
								arg1[arg2] = local87;
							}
							arg7 = local87 + arg8;
							local50--;
						} while (local50 > 0);
					}
					local50 = arg4 - arg3 & 0x3;
					if (local50 <= 0) {
						return;
					}
					local64 = Static373.anIntArray464[(int) arg5];
					local64 = ((local64 & 0xFF00FF) * local191 >> 8 & 0xFF00FF) + ((local64 & 0xFF00) * local191 >> 8 & 0xFF00);
					do {
						arg2++;
						if (arg7 < arg1[arg2]) {
							local233 = arg0[arg2];
							arg0[arg2] = local64 + ((local233 & 0xFF00FF) * local186 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local186 >> 8 & 0xFF00);
							arg1[arg2] = arg7;
						}
						arg7 += arg8;
						local50--;
					} while (local50 > 0);
				}
			} else {
				local50 = arg4 - arg3;
				if (this.anInt7043 == 0) {
					do {
						arg2++;
						if (arg7 < arg1[arg2]) {
							arg0[arg2] = Static373.anIntArray464[(int) arg5];
							arg1[arg2] = arg7;
						}
						arg7 += arg8;
						arg5 += arg6;
						local50--;
					} while (local50 > 0);
				} else {
					local186 = this.anInt7043;
					local191 = 256 - this.anInt7043;
					do {
						arg2++;
						if (arg7 < arg1[arg2]) {
							local64 = Static373.anIntArray464[(int) arg5];
							local64 = ((local64 & 0xFF00FF) * local191 >> 8 & 0xFF00FF) + ((local64 & 0xFF00) * local191 >> 8 & 0xFF00);
							local233 = arg0[arg2];
							arg0[arg2] = local64 + ((local233 & 0xFF00FF) * local186 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local186 >> 8 & 0xFF00);
							arg1[arg2] = arg7;
						}
						arg5 += arg6;
						arg7 += arg8;
						local50--;
					} while (local50 > 0);
				}
			}
		} else if (this.aBoolean510) {
			local50 = arg4 - arg3 >> 2;
			local54 = arg6 * 4.0F;
			if (this.anInt7043 == 0) {
				if (local50 > 0) {
					do {
						local64 = Static373.anIntArray464[(int) arg5];
						arg5 += local54;
						local71 = arg2 + 1;
						if (arg7 < arg1[local71]) {
							arg0[local71] = local64;
						}
						local87 = arg7 + arg8;
						local71++;
						if (local87 < arg1[local71]) {
							arg0[local71] = local64;
						}
						local87 += arg8;
						local71++;
						if (local87 < arg1[local71]) {
							arg0[local71] = local64;
						}
						local87 += arg8;
						arg2 = local71 + 1;
						if (local87 < arg1[arg2]) {
							arg0[arg2] = local64;
						}
						arg7 = local87 + arg8;
						local50--;
					} while (local50 > 0);
				}
				local50 = arg4 - arg3 & 0x3;
				if (local50 > 0) {
					local64 = Static373.anIntArray464[(int) arg5];
					do {
						arg2++;
						if (arg7 < arg1[arg2]) {
							arg0[arg2] = local64;
						}
						arg7 += arg8;
						local50--;
					} while (local50 > 0);
					return;
				}
			} else {
				local186 = this.anInt7043;
				local191 = 256 - this.anInt7043;
				if (local50 > 0) {
					do {
						local64 = Static373.anIntArray464[(int) arg5];
						arg5 += local54;
						local64 = ((local64 & 0xFF00FF) * local191 >> 8 & 0xFF00FF) + ((local64 & 0xFF00) * local191 >> 8 & 0xFF00);
						local71 = arg2 + 1;
						if (arg7 < arg1[local71]) {
							local233 = arg0[local71];
							arg0[local71] = local64 + ((local233 & 0xFF00FF) * local186 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local186 >> 8 & 0xFF00);
						}
						local87 = arg7 + arg8;
						local71++;
						if (local87 < arg1[local71]) {
							local233 = arg0[local71];
							arg0[local71] = local64 + ((local233 & 0xFF00FF) * local186 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local186 >> 8 & 0xFF00);
						}
						local87 += arg8;
						local71++;
						if (local87 < arg1[local71]) {
							local233 = arg0[local71];
							arg0[local71] = local64 + ((local233 & 0xFF00FF) * local186 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local186 >> 8 & 0xFF00);
						}
						local87 += arg8;
						arg2 = local71 + 1;
						if (local87 < arg1[arg2]) {
							local233 = arg0[arg2];
							arg0[arg2] = local64 + ((local233 & 0xFF00FF) * local186 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local186 >> 8 & 0xFF00);
						}
						arg7 = local87 + arg8;
						local50--;
					} while (local50 > 0);
				}
				local50 = arg4 - arg3 & 0x3;
				if (local50 <= 0) {
					return;
				}
				local64 = Static373.anIntArray464[(int) arg5];
				local64 = ((local64 & 0xFF00FF) * local191 >> 8 & 0xFF00FF) + ((local64 & 0xFF00) * local191 >> 8 & 0xFF00);
				do {
					arg2++;
					if (arg7 < arg1[arg2]) {
						local233 = arg0[arg2];
						arg0[arg2] = local64 + ((local233 & 0xFF00FF) * local186 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local186 >> 8 & 0xFF00);
					}
					arg7 += arg8;
					local50--;
				} while (local50 > 0);
			}
		} else {
			local50 = arg4 - arg3;
			if (this.anInt7043 == 0) {
				do {
					arg2++;
					if (arg7 < arg1[arg2]) {
						arg0[arg2] = Static373.anIntArray464[(int) arg5];
					}
					arg7 += arg8;
					arg5 += arg6;
					local50--;
				} while (local50 > 0);
			} else {
				local186 = this.anInt7043;
				local191 = 256 - this.anInt7043;
				do {
					arg2++;
					if (arg7 < arg1[arg2]) {
						local64 = Static373.anIntArray464[(int) arg5];
						local64 = ((local64 & 0xFF00FF) * local191 >> 8 & 0xFF00FF) + ((local64 & 0xFF00) * local191 >> 8 & 0xFF00);
						local233 = arg0[arg2];
						arg0[arg2] = local64 + ((local233 & 0xFF00FF) * local186 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local186 >> 8 & 0xFF00);
					}
					arg5 += arg6;
					arg7 += arg8;
					local50--;
				} while (local50 > 0);
			}
		}
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(FFFFFFFFFFFFFFFIIIIIIIIFIFIF)V")
	public void method6017(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) float arg11, @OriginalArg(12) float arg12, @OriginalArg(13) float arg13, @OriginalArg(14) float arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19, @OriginalArg(20) int arg20, @OriginalArg(21) int arg21, @OriginalArg(22) int arg22, @OriginalArg(23) float arg23, @OriginalArg(24) int arg24, @OriginalArg(25) float arg25, @OriginalArg(26) int arg26, @OriginalArg(27) float arg27) {
		if (arg22 != this.anInt7056) {
			this.anIntArray448 = this.aClass20_Sub1_10.method572(arg22);
			if (this.anIntArray448 == null) {
				this.method6024((float) arg0, (float) arg1, (float) arg2, (float) arg3, (float) arg4, (float) arg5, (float) arg6, (float) arg7, (float) arg8, Static191.method3918(arg15, arg18 | arg19 << 24), Static191.method3918(arg16, arg18 | arg20 << 24), Static191.method3918(arg17, arg18 | arg21 << 24));
				return;
			}
			this.anInt7053 = this.aClass20_Sub1_10.method581(arg22) ? 64 : this.aClass20_Sub1_10.anInt378;
			this.anInt7051 = this.anInt7053 - 1;
			this.anInt7046 = this.aClass20_Sub1_10.method580(arg22);
		}
		this.aFloat158 = arg23;
		if (arg24 != this.anInt7050) {
			this.anIntArray446 = this.aClass20_Sub1_10.method572(arg24);
			if (this.anIntArray446 == null) {
				this.method6024((float) arg0, (float) arg1, (float) arg2, (float) arg3, (float) arg4, (float) arg5, (float) arg6, (float) arg7, (float) arg8, Static191.method3918(arg15, arg18 | arg19 << 24), Static191.method3918(arg16, arg18 | arg20 << 24), Static191.method3918(arg17, arg18 | arg21 << 24));
				return;
			}
			this.anInt7052 = this.aClass20_Sub1_10.method581(arg24) ? 64 : this.aClass20_Sub1_10.anInt378;
			this.anInt7047 = this.anInt7052 - 1;
		}
		this.aFloat160 = arg25;
		if (arg26 != this.anInt7048) {
			this.anIntArray447 = this.aClass20_Sub1_10.method572(arg26);
			if (this.anIntArray447 == null) {
				this.method6024((float) arg0, (float) arg1, (float) arg2, (float) arg3, (float) arg4, (float) arg5, (float) arg6, (float) arg7, (float) arg8, Static191.method3918(arg15, arg18 | arg19 << 24), Static191.method3918(arg16, arg18 | arg20 << 24), Static191.method3918(arg17, arg18 | arg21 << 24));
				return;
			}
			this.anInt7054 = this.aClass20_Sub1_10.method581(arg26) ? 64 : this.aClass20_Sub1_10.anInt378;
			this.anInt7049 = this.anInt7054 - 1;
		}
		this.aFloat159 = arg27;
		this.anInt7055 = arg18;
		@Pc(279) float local279 = (float) (arg15 >> 24 & 0xFF);
		@Pc(286) float local286 = (float) (arg16 >> 24 & 0xFF);
		@Pc(293) float local293 = (float) (arg17 >> 24 & 0xFF);
		@Pc(300) float local300 = (float) (arg15 >> 16 & 0xFF);
		@Pc(307) float local307 = (float) (arg16 >> 16 & 0xFF);
		@Pc(314) float local314 = (float) (arg17 >> 16 & 0xFF);
		@Pc(321) float local321 = (float) (arg15 >> 8 & 0xFF);
		@Pc(328) float local328 = (float) (arg16 >> 8 & 0xFF);
		@Pc(335) float local335 = (float) (arg17 >> 8 & 0xFF);
		@Pc(340) float local340 = (float) (arg15 & 0xFF);
		@Pc(345) float local345 = (float) (arg16 & 0xFF);
		@Pc(350) float local350 = (float) (arg17 & 0xFF);
		arg9 /= arg6;
		arg10 /= arg7;
		arg11 /= arg8;
		arg12 /= arg6;
		arg13 /= arg7;
		arg14 /= arg8;
		arg6 = 1.0F / arg6;
		arg7 = 1.0F / arg7;
		arg8 = 1.0F / arg8;
		@Pc(388) float local388 = 1.0F;
		@Pc(390) float local390 = 0.0F;
		@Pc(392) float local392 = 0.0F;
		@Pc(394) float local394 = 0.0F;
		@Pc(396) float local396 = 1.0F;
		@Pc(398) float local398 = 0.0F;
		@Pc(400) float local400 = 0.0F;
		@Pc(402) float local402 = 0.0F;
		@Pc(404) float local404 = 0.0F;
		@Pc(406) float local406 = 0.0F;
		@Pc(408) float local408 = 0.0F;
		@Pc(410) float local410 = 0.0F;
		@Pc(412) float local412 = 0.0F;
		@Pc(414) float local414 = 0.0F;
		@Pc(416) float local416 = 0.0F;
		@Pc(418) float local418 = 0.0F;
		@Pc(420) float local420 = 0.0F;
		@Pc(428) float local428;
		if (arg1 != arg0) {
			local428 = arg1 - arg0;
			local400 = (arg4 - arg3) / local428;
			local402 = (arg7 - arg6) / local428;
			local404 = (arg10 - arg9) / local428;
			local406 = (arg13 - arg12) / local428;
			local408 = (float) (arg20 - arg19) / local428;
			local410 = (local286 - local279) / local428;
			local412 = (local307 - local300) / local428;
			local414 = (local328 - local321) / local428;
			local416 = (local345 - local340) / local428;
			local418 = (local390 - local388) / local428;
			local420 = (local396 - local394) / local428;
		}
		local428 = 0.0F;
		@Pc(499) float local499 = 0.0F;
		@Pc(501) float local501 = 0.0F;
		@Pc(503) float local503 = 0.0F;
		@Pc(505) float local505 = 0.0F;
		@Pc(507) float local507 = 0.0F;
		@Pc(509) float local509 = 0.0F;
		@Pc(511) float local511 = 0.0F;
		@Pc(513) float local513 = 0.0F;
		@Pc(515) float local515 = 0.0F;
		@Pc(517) float local517 = 0.0F;
		@Pc(525) float local525;
		if (arg2 != arg1) {
			local525 = arg2 - arg1;
			local428 = (arg5 - arg4) / local525;
			local499 = (arg8 - arg7) / local525;
			local501 = (arg11 - arg10) / local525;
			local503 = (arg14 - arg13) / local525;
			local505 = (float) (arg21 - arg20) / local525;
			local507 = (local293 - local286) / local525;
			local509 = (local314 - local307) / local525;
			local511 = (local335 - local328) / local525;
			local513 = (local350 - local345) / local525;
			local515 = (local392 - local390) / local525;
			local517 = (local398 - local396) / local525;
		}
		local525 = 0.0F;
		@Pc(596) float local596 = 0.0F;
		@Pc(598) float local598 = 0.0F;
		@Pc(600) float local600 = 0.0F;
		@Pc(602) float local602 = 0.0F;
		@Pc(604) float local604 = 0.0F;
		@Pc(606) float local606 = 0.0F;
		@Pc(608) float local608 = 0.0F;
		@Pc(610) float local610 = 0.0F;
		@Pc(612) float local612 = 0.0F;
		@Pc(614) float local614 = 0.0F;
		if (arg0 != arg2) {
			@Pc(622) float local622 = arg0 - arg2;
			local525 = (arg3 - arg5) / local622;
			local596 = (arg6 - arg8) / local622;
			local598 = (arg9 - arg11) / local622;
			local600 = (arg12 - arg14) / local622;
			local602 = (float) (arg19 - arg21) / local622;
			local604 = (local279 - local293) / local622;
			local606 = (local300 - local314) / local622;
			local608 = (local321 - local335) / local622;
			local610 = (local340 - local350) / local622;
			local612 = (local388 - local392) / local622;
			local614 = (local394 - local398) / local622;
		}
		if (arg0 <= arg1 && arg0 <= arg2) {
			if (!(arg0 >= (float) this.anInt7042)) {
				if (arg1 > (float) this.anInt7042) {
					arg1 = this.anInt7042;
				}
				if (arg2 > (float) this.anInt7042) {
					arg2 = this.anInt7042;
				}
				if (arg1 < arg2) {
					arg5 = arg3;
					arg8 = arg6;
					arg11 = arg9;
					arg14 = arg12;
					arg21 = arg19;
					local293 = local279;
					local314 = local300;
					local335 = local321;
					local350 = local340;
					local392 = local388;
					local398 = local394;
					if (arg0 < 0.0F) {
						arg3 -= local400 * arg0;
						arg5 -= local525 * arg0;
						arg6 -= local402 * arg0;
						arg8 -= local596 * arg0;
						arg9 -= local404 * arg0;
						arg11 -= local598 * arg0;
						arg12 -= local406 * arg0;
						arg14 -= local600 * arg0;
						arg19 = (int) ((float) arg19 - local408 * arg0);
						arg21 = (int) ((float) arg21 - local602 * arg0);
						local279 -= local410 * arg0;
						local293 -= local604 * arg0;
						local300 -= local412 * arg0;
						local314 -= local606 * arg0;
						local321 -= local414 * arg0;
						local335 -= local608 * arg0;
						local340 -= local416 * arg0;
						local350 -= local610 * arg0;
						local388 -= local418 * arg0;
						local392 -= local612 * arg0;
						local394 -= local420 * arg0;
						local398 -= local614 * arg0;
						arg0 = 0.0F;
					}
					if (arg1 < 0.0F) {
						arg4 -= local428 * arg1;
						arg7 -= local499 * arg1;
						arg10 -= local501 * arg1;
						arg13 -= local503 * arg1;
						arg20 = (int) ((float) arg20 - local505 * arg1);
						local286 -= local507 * arg1;
						local307 -= local509 * arg1;
						local328 -= local511 * arg1;
						local345 -= local513 * arg1;
						local390 -= local515 * arg1;
						local396 -= local517 * arg1;
						arg1 = 0.0F;
					}
					if (arg0 != arg1 && local525 < local400 || arg0 == arg1 && local525 > local428) {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = this.anIntArray445[(int) arg0];
						while (--arg1 >= 0.0F) {
							this.method6022(this.anIntArray444, this.anIntArray448, (int) arg0, (int) arg5, (int) arg3, arg8, arg6, arg11, arg9, arg14, arg12, (float) arg21, (float) arg19, local293, local279, local314, local300, local335, local321, local350, local340, local392, local388, local398, local394);
							arg3 += local400;
							arg5 += local525;
							arg6 += local402;
							arg8 += local596;
							arg9 += local404;
							arg11 += local598;
							arg12 += local406;
							arg14 += local600;
							arg19 = (int) ((float) arg19 + local408);
							arg21 = (int) ((float) arg21 + local602);
							local279 += local410;
							local293 += local604;
							local300 += local412;
							local314 += local606;
							local321 += local414;
							local335 += local608;
							local340 += local416;
							local350 += local610;
							local388 += local418;
							local392 += local612;
							local394 += local420;
							local398 += local420;
							arg0 += this.anInt7044;
						}
						while (--arg2 >= 0.0F) {
							this.method6022(this.anIntArray444, this.anIntArray448, (int) arg0, (int) arg5, (int) arg4, arg8, arg7, arg11, arg10, arg14, arg13, (float) arg21, (float) arg20, local293, local286, local314, local307, local335, local328, local350, local345, local392, local390, local398, local396);
							arg4 += local428;
							arg5 += local525;
							arg7 += local499;
							arg8 += local596;
							arg10 += local501;
							arg11 += local598;
							arg13 += local503;
							arg14 += local600;
							arg20 = (int) ((float) arg20 + local505);
							arg21 = (int) ((float) arg21 + local602);
							local286 += local507;
							local293 += local604;
							local307 += local509;
							local314 += local606;
							local328 += local511;
							local335 += local608;
							local345 += local513;
							local350 += local610;
							local390 += local515;
							local392 += local612;
							local396 += local517;
							local398 += local614;
							arg0 += this.anInt7044;
						}
					} else {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = this.anIntArray445[(int) arg0];
						while (--arg1 >= 0.0F) {
							this.method6022(this.anIntArray444, this.anIntArray448, (int) arg0, (int) arg3, (int) arg5, arg6, arg8, arg9, arg11, arg12, arg14, (float) arg19, (float) arg21, local279, local293, local300, local314, local321, local335, local340, local350, local388, local392, local394, local398);
							arg3 += local400;
							arg5 += local525;
							arg6 += local402;
							arg8 += local596;
							arg9 += local404;
							arg11 += local598;
							arg12 += local406;
							arg14 += local600;
							arg19 = (int) ((float) arg19 + local408);
							arg21 = (int) ((float) arg21 + local602);
							local279 += local410;
							local293 += local604;
							local300 += local412;
							local314 += local606;
							local321 += local414;
							local335 += local608;
							local340 += local416;
							local350 += local610;
							local388 += local418;
							local392 += local612;
							local394 += local420;
							local398 += local614;
							arg0 += this.anInt7044;
						}
						while (--arg2 >= 0.0F) {
							this.method6022(this.anIntArray444, this.anIntArray448, (int) arg0, (int) arg4, (int) arg5, arg7, arg8, arg10, arg11, arg13, arg14, (float) arg20, (float) arg21, local286, local293, local307, local314, local328, local335, local345, local350, local390, local392, local396, local398);
							arg4 += local428;
							arg5 += local525;
							arg7 += local499;
							arg8 += local596;
							arg10 += local501;
							arg11 += local598;
							arg13 += local503;
							arg14 += local600;
							arg20 = (int) ((float) arg20 + local505);
							arg21 = (int) ((float) arg21 + local602);
							local286 += local507;
							local293 += local604;
							local307 += local509;
							local314 += local606;
							local328 += local511;
							local335 += local608;
							local345 += local513;
							local350 += local610;
							local390 += local515;
							local392 += local612;
							local396 += local517;
							local398 += local614;
							arg0 += this.anInt7044;
						}
					}
				} else {
					arg4 = arg3;
					arg7 = arg6;
					arg10 = arg9;
					arg13 = arg12;
					arg20 = arg19;
					local286 = local279;
					local307 = local300;
					local328 = local321;
					local345 = local340;
					local390 = local388;
					local396 = local394;
					if (arg0 < 0.0F) {
						arg3 -= local400 * arg0;
						arg4 -= local525 * arg0;
						arg6 -= local402 * arg0;
						arg7 -= local596 * arg0;
						arg9 -= local404 * arg0;
						arg10 -= local598 * arg0;
						arg12 -= local406 * arg0;
						arg13 -= local600 * arg0;
						arg19 = (int) ((float) arg19 - local408 * arg0);
						arg20 = (int) ((float) arg20 - local602 * arg0);
						local279 -= local410 * arg0;
						local286 -= local604 * arg0;
						local300 -= local412 * arg0;
						local307 -= local606 * arg0;
						local321 -= local414 * arg0;
						local328 -= local608 * arg0;
						local340 -= local416 * arg0;
						local345 -= local610 * arg0;
						local388 -= local418 * arg0;
						local390 -= local612 * arg0;
						local394 -= local420 * arg0;
						local396 -= local614 * arg0;
						arg0 = 0.0F;
					}
					if (arg2 < 0.0F) {
						arg5 -= local428 * arg2;
						arg8 -= local499 * arg2;
						arg11 -= local501 * arg2;
						arg14 -= local503 * arg2;
						arg21 = (int) ((float) arg21 - local505 * arg2);
						local293 -= local507 * arg2;
						local314 -= local509 * arg2;
						local335 -= local511 * arg2;
						local350 -= local513 * arg2;
						local392 -= local515 * arg2;
						local398 -= local517 * arg2;
						arg2 = 0.0F;
					}
					if (arg0 != arg2 && local525 < local400 || arg0 == arg2 && local428 > local400) {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = this.anIntArray445[(int) arg0];
						while (--arg2 >= 0.0F) {
							this.method6022(this.anIntArray444, this.anIntArray448, (int) arg0, (int) arg4, (int) arg3, arg7, arg6, arg10, arg9, arg13, arg12, (float) arg20, (float) arg19, local286, local279, local307, local300, local328, local321, local345, local340, local390, local388, local396, local394);
							arg3 += local400;
							arg4 += local525;
							arg6 += local402;
							arg7 += local596;
							arg9 += local404;
							arg10 += local598;
							arg12 += local406;
							arg13 += local600;
							arg19 = (int) ((float) arg19 + local408);
							arg20 = (int) ((float) arg20 + local602);
							local279 += local410;
							local286 += local604;
							local300 += local412;
							local307 += local606;
							local321 += local414;
							local328 += local608;
							local340 += local416;
							local345 += local610;
							local388 += local418;
							local390 += local612;
							local394 += local420;
							local396 += local614;
							arg0 += this.anInt7044;
						}
						while (--arg1 >= 0.0F) {
							this.method6022(this.anIntArray444, this.anIntArray448, (int) arg0, (int) arg5, (int) arg3, arg8, arg6, arg11, arg9, arg14, arg12, (float) arg21, (float) arg19, local293, local279, local314, local300, local335, local321, local350, local340, local392, local388, local398, local394);
							arg5 += local428;
							arg3 += local400;
							arg8 += local499;
							arg6 += local402;
							arg11 += local501;
							arg9 += local404;
							arg14 += local503;
							arg12 += local406;
							arg21 = (int) ((float) arg21 + local505);
							arg19 = (int) ((float) arg19 + local408);
							local293 += local507;
							local279 += local410;
							local314 += local509;
							local300 += local412;
							local335 += local511;
							local321 += local414;
							local350 += local513;
							local340 += local416;
							local392 += local515;
							local388 += local418;
							local398 += local517;
							local394 += local420;
							arg0 += this.anInt7044;
						}
					} else {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = this.anIntArray445[(int) arg0];
						while (--arg2 >= 0.0F) {
							this.method6022(this.anIntArray444, this.anIntArray448, (int) arg0, (int) arg3, (int) arg4, arg6, arg7, arg9, arg10, arg12, arg13, (float) arg19, (float) arg20, local279, local286, local300, local307, local321, local328, local340, local345, local388, local390, local394, local396);
							arg4 += local525;
							arg3 += local400;
							arg7 += local596;
							arg6 += local402;
							arg10 += local598;
							arg9 += local404;
							arg13 += local600;
							arg12 += local406;
							arg20 = (int) ((float) arg20 + local602);
							arg19 = (int) ((float) arg19 + local408);
							local286 += local604;
							local279 += local410;
							local307 += local606;
							local300 += local412;
							local328 += local608;
							local321 += local414;
							local345 += local610;
							local340 += local416;
							local390 += local612;
							local388 += local418;
							local396 += local614;
							local394 += local420;
							arg0 += this.anInt7044;
						}
						while (--arg1 >= 0.0F) {
							this.method6022(this.anIntArray444, this.anIntArray448, (int) arg0, (int) arg3, (int) arg5, arg6, arg8, arg9, arg11, arg12, arg14, (float) arg19, (float) arg21, local279, local293, local300, local314, local321, local335, local340, local350, local388, local392, local394, local398);
							arg3 += local400;
							arg5 += local428;
							arg6 += local402;
							arg8 += local499;
							arg9 += local404;
							arg11 += local501;
							arg12 += local406;
							arg14 += local503;
							arg19 = (int) ((float) arg19 + local408);
							arg21 = (int) ((float) arg21 + local505);
							local279 += local410;
							local293 += local507;
							local300 += local412;
							local314 += local509;
							local321 += local414;
							local335 += local511;
							local340 += local416;
							local350 += local513;
							local388 += local418;
							local392 += local515;
							local394 += local420;
							local398 += local517;
							arg0 += this.anInt7044;
						}
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (!(arg1 >= (float) this.anInt7042)) {
				if (arg2 > (float) this.anInt7042) {
					arg2 = this.anInt7042;
				}
				if (arg0 > (float) this.anInt7042) {
					arg0 = this.anInt7042;
				}
				if (arg2 < arg0) {
					arg3 = arg4;
					arg6 = arg7;
					arg9 = arg10;
					arg12 = arg13;
					arg19 = arg20;
					local279 = local286;
					local300 = local307;
					local321 = local328;
					local340 = local345;
					local388 = local390;
					local394 = local396;
					if (arg1 < 0.0F) {
						arg3 = arg4 - local400 * arg1;
						arg4 -= local428 * arg1;
						arg6 = arg7 - local402 * arg1;
						arg7 -= local499 * arg1;
						arg9 = arg10 - local404 * arg1;
						arg10 -= local501 * arg1;
						arg12 = arg13 - local406 * arg1;
						arg13 -= local503 * arg1;
						arg19 = (int) ((float) arg20 - local408 * arg1);
						arg20 = (int) ((float) arg20 - local505 * arg1);
						local279 = local286 - local410 * arg1;
						local286 -= local507 * arg1;
						local300 = local307 - local412 * arg1;
						local307 -= local509 * arg1;
						local321 = local328 - local414 * arg1;
						local328 -= local511 * arg1;
						local340 = local345 - local416 * arg1;
						local345 -= local513 * arg1;
						local388 = local390 - local418 * arg1;
						local390 -= local515 * arg1;
						local394 = local396 - local420 * arg1;
						local396 -= local517 * arg1;
						arg1 = 0.0F;
					}
					if (arg2 < 0.0F) {
						arg5 -= local525 * arg2;
						arg8 -= local596 * arg2;
						arg11 -= local598 * arg2;
						arg14 -= local600 * arg2;
						arg21 = (int) ((float) arg21 - local602 * arg2);
						local293 -= local604 * arg2;
						local314 -= local606 * arg2;
						local335 -= local608 * arg2;
						local350 -= local610 * arg2;
						local392 -= local612 * arg2;
						local398 -= local614 * arg2;
						arg2 = 0.0F;
					}
					if (arg1 != arg2 && local400 < local428 || arg1 == arg2 && local400 > local525) {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = this.anIntArray445[(int) arg1];
						while (--arg2 >= 0.0F) {
							this.method6022(this.anIntArray444, this.anIntArray448, (int) arg1, (int) arg3, (int) arg4, arg6, arg7, arg9, arg10, arg12, arg13, (float) arg19, (float) arg20, local279, local286, local300, local307, local321, local328, local340, local345, local388, local390, local394, local396);
							arg3 += local400;
							arg4 += local428;
							arg6 += local402;
							arg7 += local499;
							arg9 += local404;
							arg10 += local501;
							arg12 += local406;
							arg13 += local503;
							arg19 = (int) ((float) arg19 + local408);
							arg20 = (int) ((float) arg20 + local505);
							local279 += local410;
							local286 += local507;
							local300 += local412;
							local307 += local509;
							local321 += local414;
							local328 += local511;
							local340 += local416;
							local345 += local513;
							local388 += local418;
							local390 += local515;
							local394 += local420;
							local396 += local517;
							arg1 += this.anInt7044;
						}
						while (--arg0 >= 0.0F) {
							this.method6022(this.anIntArray444, this.anIntArray448, (int) arg1, (int) arg3, (int) arg5, arg6, arg8, arg9, arg11, arg12, arg14, (float) arg19, (float) arg21, local279, local293, local300, local314, local321, local335, local340, local350, local388, local392, local394, local398);
							arg3 += local400;
							arg5 += local525;
							arg6 += local402;
							arg8 += local596;
							arg9 += local404;
							arg11 += local598;
							arg12 += local406;
							arg14 += local600;
							arg19 = (int) ((float) arg19 + local408);
							arg21 = (int) ((float) arg21 + local602);
							local279 += local410;
							local293 += local604;
							local300 += local412;
							local314 += local606;
							local321 += local414;
							local335 += local608;
							local340 += local416;
							local350 += local610;
							local388 += local418;
							local392 += local612;
							local394 += local420;
							local398 += local614;
							arg1 += this.anInt7044;
						}
					} else {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = this.anIntArray445[(int) arg1];
						while (--arg2 >= 0.0F) {
							this.method6022(this.anIntArray444, this.anIntArray448, (int) arg1, (int) arg4, (int) arg3, arg7, arg6, arg10, arg9, arg13, arg12, (float) arg20, (float) arg19, local286, local279, local307, local300, local328, local321, local345, local340, local390, local388, local396, local394);
							arg4 += local428;
							arg3 += local400;
							arg7 += local499;
							arg6 += local402;
							arg10 += local501;
							arg9 += local404;
							arg13 += local503;
							arg12 += local406;
							arg20 = (int) ((float) arg20 + local505);
							arg19 = (int) ((float) arg19 + local408);
							local286 += local507;
							local279 += local410;
							local307 += local509;
							local300 += local412;
							local328 += local511;
							local321 += local414;
							local345 += local513;
							local340 += local416;
							local392 += local515;
							local388 += local418;
							local396 += local517;
							local394 += local420;
							arg1 += this.anInt7044;
						}
						while (--arg0 >= 0.0F) {
							this.method6022(this.anIntArray444, this.anIntArray448, (int) arg1, (int) arg5, (int) arg3, arg8, arg6, arg11, arg9, arg14, arg12, (float) arg21, (float) arg19, local293, local279, local314, local300, local335, local321, local350, local340, local392, local388, local398, local394);
							arg5 += local525;
							arg3 += local400;
							arg8 += local596;
							arg6 += local402;
							arg11 += local598;
							arg9 += local404;
							arg14 += local600;
							arg12 += local406;
							arg21 = (int) ((float) arg21 + local602);
							arg19 = (int) ((float) arg19 + local408);
							local293 += local604;
							local279 += local410;
							local314 += local606;
							local300 += local412;
							local335 += local608;
							local321 += local414;
							local350 += local610;
							local340 += local416;
							local392 += local612;
							local388 += local418;
							local398 += local614;
							local394 += local420;
							arg1 += this.anInt7044;
						}
					}
				} else {
					arg5 = arg4;
					arg8 = arg7;
					arg11 = arg10;
					arg14 = arg13;
					arg21 = arg20;
					local293 = local286;
					local314 = local307;
					local335 = local328;
					local350 = local345;
					local392 = local390;
					local398 = local396;
					if (arg1 < 0.0F) {
						arg5 = arg4 - local400 * arg1;
						arg4 -= local428 * arg1;
						arg8 = arg7 - local402 * arg1;
						arg7 -= local499 * arg1;
						arg11 = arg10 - local404 * arg1;
						arg10 -= local501 * arg1;
						arg14 = arg13 - local406 * arg1;
						arg13 -= local503 * arg1;
						arg21 = (int) ((float) arg20 - local408 * arg1);
						arg20 = (int) ((float) arg20 - local505 * arg1);
						local293 = local286 - local410 * arg1;
						local286 -= local507 * arg1;
						local314 = local307 - local412 * arg1;
						local307 -= local509 * arg1;
						local335 = local328 - local414 * arg1;
						local328 -= local511 * arg1;
						local350 = local345 - local416 * arg1;
						local345 -= local513 * arg1;
						local392 = local390 - local418 * arg1;
						local390 -= local515 * arg1;
						local398 = local396 - local420 * arg1;
						local396 -= local517 * arg1;
						arg1 = 0.0F;
					}
					if (arg0 < 0.0F) {
						arg3 -= local525 * arg0;
						arg6 -= local596 * arg0;
						arg9 -= local598 * arg0;
						arg12 -= local600 * arg0;
						arg19 = (int) ((float) arg19 - local602 * arg0);
						local279 -= local604 * arg0;
						local300 -= local606 * arg0;
						local321 -= local608 * arg0;
						local340 -= local610 * arg0;
						local388 -= local612 * arg0;
						local394 -= local614 * arg0;
						arg0 = 0.0F;
					}
					arg2 -= arg0;
					arg0 -= arg1;
					arg1 = this.anIntArray445[(int) arg1];
					if (local400 < local428) {
						while (--arg0 >= 0.0F) {
							this.method6022(this.anIntArray444, this.anIntArray448, (int) arg1, (int) arg5, (int) arg4, arg8, arg7, arg11, arg10, arg14, arg13, (float) arg21, (float) arg20, local293, local286, local314, local307, local335, local328, local350, local345, local392, local390, local398, local396);
							arg5 += local400;
							arg4 += local428;
							arg8 += local402;
							arg7 += local499;
							arg11 += local404;
							arg10 += local501;
							arg14 += local406;
							arg13 += local503;
							arg21 = (int) ((float) arg21 + local408);
							arg20 = (int) ((float) arg20 + local505);
							local293 += local410;
							local286 += local507;
							local314 += local412;
							local307 += local509;
							local335 += local414;
							local328 += local511;
							local350 += local416;
							local345 += local513;
							local392 += local418;
							local390 += local515;
							local398 += local420;
							local396 += local517;
							arg1 += this.anInt7044;
						}
						while (--arg2 >= 0.0F) {
							this.method6022(this.anIntArray444, this.anIntArray448, (int) arg1, (int) arg3, (int) arg4, arg6, arg7, arg9, arg10, arg12, arg13, (float) arg19, (float) arg20, local279, local286, local300, local307, local321, local328, local340, local345, local388, local390, local394, local396);
							arg3 += local525;
							arg4 += local428;
							arg6 += local596;
							arg7 += local499;
							arg9 += local598;
							arg10 += local501;
							arg12 += local600;
							arg13 += local503;
							arg19 = (int) ((float) arg19 + local602);
							arg20 = (int) ((float) arg20 + local505);
							local279 += local604;
							local286 += local507;
							local300 += local606;
							local307 += local509;
							local321 += local608;
							local328 += local511;
							local340 += local610;
							local345 += local513;
							local388 += local612;
							local390 += local515;
							local394 += local614;
							local396 += local517;
							arg1 += this.anInt7044;
						}
					} else {
						while (--arg0 >= 0.0F) {
							this.method6022(this.anIntArray444, this.anIntArray448, (int) arg1, (int) arg4, (int) arg5, arg7, arg8, arg10, arg11, arg13, arg14, (float) arg20, (float) arg21, local286, local293, local307, local314, local328, local335, local345, local350, local390, local392, local396, local398);
							arg4 += local428;
							arg5 += local400;
							arg7 += local499;
							arg8 += local402;
							arg10 += local501;
							arg11 += local404;
							arg13 += local503;
							arg14 += local406;
							arg20 = (int) ((float) arg20 + local505);
							arg21 = (int) ((float) arg21 + local408);
							local286 += local507;
							local293 += local410;
							local307 += local509;
							local314 += local412;
							local328 += local511;
							local335 += local414;
							local345 += local513;
							local350 += local416;
							local390 += local515;
							local392 += local418;
							local396 += local517;
							local398 += local420;
							arg1 += this.anInt7044;
						}
						while (--arg2 >= 0.0F) {
							this.method6022(this.anIntArray444, this.anIntArray448, (int) arg1, (int) arg4, (int) arg3, arg7, arg6, arg10, arg9, arg13, arg12, (float) arg20, (float) arg19, local286, local279, local307, local300, local328, local321, local345, local340, local390, local388, local396, local394);
							arg4 += local428;
							arg3 += local525;
							arg7 += local499;
							arg6 += local596;
							arg10 += local501;
							arg9 += local598;
							arg13 += local503;
							arg12 += local600;
							arg20 = (int) ((float) arg20 + local505);
							arg19 = (int) ((float) arg19 + local602);
							local286 += local507;
							local279 += local604;
							local307 += local509;
							local300 += local606;
							local328 += local511;
							local321 += local608;
							local345 += local513;
							local340 += local610;
							local390 += local515;
							local388 += local612;
							local396 += local517;
							local394 += local614;
							arg1 += this.anInt7044;
						}
					}
				}
			}
		} else if (!(arg2 >= (float) this.anInt7042)) {
			if (arg0 > (float) this.anInt7042) {
				arg0 = this.anInt7042;
			}
			if (arg1 > (float) this.anInt7042) {
				arg1 = this.anInt7042;
			}
			if (arg0 < arg1) {
				arg4 = arg5;
				arg7 = arg8;
				arg10 = arg11;
				arg13 = arg14;
				arg20 = arg21;
				local286 = local293;
				local307 = local314;
				local328 = local335;
				local345 = local350;
				local390 = local392;
				local396 = local398;
				if (arg2 < 0.0F) {
					arg5 -= local525 * arg2;
					arg4 -= local428 * arg2;
					arg8 -= local596 * arg2;
					arg7 -= local499 * arg2;
					arg11 -= local598 * arg2;
					arg10 -= local501 * arg2;
					arg14 -= local600 * arg2;
					arg13 -= local503 * arg2;
					arg21 = (int) ((float) arg21 - local602 * 3.0F);
					arg20 = (int) ((float) arg20 - local505 * arg2);
					local293 -= local604 * arg2;
					local286 -= local507 * arg2;
					local314 -= local606 * arg2;
					local307 -= local509 * arg2;
					local335 -= local608 * arg2;
					local328 -= local511 * arg2;
					local350 -= local610 * arg2;
					local345 -= local513 * arg2;
					local392 -= local612 * arg2;
					local390 -= local515 * arg2;
					local398 -= local614 * arg2;
					local396 -= local517 * arg2;
					arg2 = 0.0F;
				}
				if (arg0 < 0.0F) {
					arg3 -= local400 * arg0;
					arg6 -= local402 * arg0;
					arg9 -= local404 * arg0;
					arg12 -= local406 * arg0;
					arg19 = (int) ((float) arg19 - local408 * arg0);
					local279 -= local410 * arg0;
					local300 -= local412 * arg0;
					local321 -= local414 * arg0;
					local340 -= local416 * arg0;
					local388 -= local418 * arg0;
					local394 -= local420 * arg0;
					arg0 = 0.0F;
				}
				if (local428 < local525) {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = this.anIntArray445[(int) arg2];
					while (--arg0 >= 0.0F) {
						this.method6022(this.anIntArray444, this.anIntArray448, (int) arg2, (int) arg4, (int) arg5, arg7, arg8, arg10, arg11, arg13, arg14, (float) arg20, (float) arg21, local286, local293, local307, local314, local328, local335, local345, local350, local390, local392, local396, local398);
						arg4 += local428;
						arg5 += local525;
						arg7 += local499;
						arg8 += local596;
						arg10 += local501;
						arg11 += local598;
						arg13 += local503;
						arg14 += local600;
						arg20 = (int) ((float) arg20 + local505);
						arg21 = (int) ((float) arg21 + local602);
						local286 += local507;
						local293 += local604;
						local307 += local509;
						local314 += local606;
						local328 += local511;
						local335 += local608;
						local345 += local513;
						local350 += local610;
						local390 += local515;
						local392 += local612;
						local396 += local517;
						local398 += local614;
						arg2 += this.anInt7044;
					}
					while (--arg1 >= 0.0F) {
						this.method6022(this.anIntArray444, this.anIntArray448, (int) arg2, (int) arg4, (int) arg3, arg7, arg6, arg10, arg9, arg13, arg12, (float) arg20, (float) arg19, local286, local279, local307, local300, local328, local321, local345, local340, local390, local388, local396, local394);
						arg4 += local428;
						arg3 += local400;
						arg7 += local499;
						arg6 += local402;
						arg10 += local501;
						arg9 += local404;
						arg13 += local503;
						arg12 += local406;
						arg20 = (int) ((float) arg20 + local505);
						arg19 = (int) ((float) arg19 + local408);
						local286 += local507;
						local279 += local410;
						local307 += local509;
						local300 += local412;
						local328 += local511;
						local321 += local414;
						local345 += local513;
						local340 += local416;
						local390 += local515;
						local388 += local418;
						local396 += local517;
						local394 += local420;
						arg2 += this.anInt7044;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = this.anIntArray445[(int) arg2];
					while (--arg0 >= 0.0F) {
						this.method6022(this.anIntArray444, this.anIntArray448, (int) arg2, (int) arg5, (int) arg4, arg8, arg7, arg11, arg10, arg14, arg13, (float) arg21, (float) arg20, local293, local286, local314, local307, local335, local328, local350, local345, local392, local390, local398, local396);
						arg5 += local525;
						arg4 += local428;
						arg8 += local596;
						arg7 += local499;
						arg11 += local598;
						arg10 += local501;
						arg14 += local600;
						arg13 += local503;
						arg21 = (int) ((float) arg21 + local602);
						arg20 = (int) ((float) arg20 + local505);
						local293 += local604;
						local286 += local507;
						local314 += local606;
						local307 += local509;
						local335 += local608;
						local328 += local511;
						local350 += local610;
						local345 += local513;
						local392 += local612;
						local390 += local515;
						local398 += local614;
						local396 += local517;
						arg2 += this.anInt7044;
					}
					while (--arg1 >= 0.0F) {
						this.method6022(this.anIntArray444, this.anIntArray448, (int) arg2, (int) arg3, (int) arg4, arg6, arg7, arg9, arg10, arg12, arg13, (float) arg19, (float) arg20, local279, local286, local300, local307, local321, local328, local340, local345, local388, local390, local394, local396);
						arg3 += local400;
						arg4 += local428;
						arg6 += local402;
						arg7 += local499;
						arg9 += local404;
						arg10 += local501;
						arg12 += local406;
						arg13 += local503;
						arg19 = (int) ((float) arg19 + local408);
						arg20 = (int) ((float) arg20 + local505);
						local279 += local410;
						local286 += local507;
						local300 += local412;
						local307 += local509;
						local321 += local414;
						local328 += local511;
						local340 += local416;
						local345 += local513;
						local388 += local418;
						local390 += local515;
						local394 += local420;
						local396 += local517;
						arg2 += this.anInt7044;
					}
				}
			} else {
				arg3 = arg5;
				arg6 = arg8;
				arg9 = arg11;
				arg12 = arg14;
				arg19 = arg21;
				local279 = local293;
				local300 = local314;
				local321 = local335;
				local340 = local350;
				local388 = local392;
				local394 = local398;
				if (arg2 < 0.0F) {
					arg5 -= local525 * arg2;
					arg3 -= local428 * arg2;
					arg8 -= local596 * arg2;
					arg6 -= local499 * arg2;
					arg11 -= local598 * arg2;
					arg9 -= local501 * arg2;
					arg14 -= local600 * arg2;
					arg12 -= local503 * arg2;
					arg21 = (int) ((float) arg21 - local602 * 3.0F);
					arg19 = (int) ((float) arg19 - local505 * arg2);
					local293 -= local604 * arg2;
					local279 -= local507 * arg2;
					local314 -= local606 * arg2;
					local300 -= local509 * arg2;
					local335 -= local608 * arg2;
					local321 -= local511 * arg2;
					local350 -= local610 * arg2;
					local340 -= local513 * arg2;
					local392 -= local612 * arg2;
					local388 -= local515 * arg2;
					local398 -= local614 * arg2;
					local394 -= local517 * arg2;
					arg2 = 0.0F;
				}
				if (arg1 < 0.0F) {
					arg4 -= local400 * arg1;
					arg7 -= local402 * arg1;
					arg10 -= local404 * arg1;
					arg13 -= local406 * arg1;
					arg20 = (int) ((float) arg20 - local408 * arg1);
					local286 -= local410 * arg1;
					local307 -= local412 * arg1;
					local328 -= local414 * arg1;
					local345 -= local416 * arg1;
					local390 -= local418 * arg1;
					local396 -= local420 * arg1;
					arg1 = 0.0F;
				}
				if (local428 < local525) {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = this.anIntArray445[(int) arg2];
					while (--arg1 >= 0.0F) {
						this.method6022(this.anIntArray444, this.anIntArray448, (int) arg2, (int) arg3, (int) arg5, arg6, arg8, arg9, arg11, arg12, arg14, (float) arg19, (float) arg21, local279, local293, local300, local314, local321, local335, local340, local350, local388, local392, local394, local398);
						arg3 += local428;
						arg5 += local525;
						arg6 += local499;
						arg8 += local596;
						arg9 += local501;
						arg11 += local598;
						arg12 += local503;
						arg14 += local600;
						arg19 = (int) ((float) arg19 + local505);
						arg21 = (int) ((float) arg21 + local602);
						local279 += local507;
						local293 += local604;
						local300 += local509;
						local314 += local606;
						local321 += local511;
						local335 += local608;
						local340 += local513;
						local350 += local610;
						local388 += local515;
						local392 += local612;
						local394 += local517;
						local398 += local614;
						arg2 += this.anInt7044;
					}
					while (--arg0 >= 0.0F) {
						this.method6022(this.anIntArray444, this.anIntArray448, (int) arg2, (int) arg4, (int) arg5, arg7, arg8, arg10, arg11, arg13, arg14, (float) arg20, (float) arg21, local286, local293, local307, local314, local328, local335, local345, local350, local390, local392, local396, local398);
						arg4 += local400;
						arg5 += local525;
						arg7 += local402;
						arg8 += local596;
						arg10 += local404;
						arg11 += local598;
						arg13 += local406;
						arg14 += local600;
						arg20 = (int) ((float) arg20 + local408);
						arg21 = (int) ((float) arg21 + local602);
						local286 += local410;
						local293 += local604;
						local307 += local412;
						local314 += local606;
						local328 += local414;
						local335 += local608;
						local345 += local416;
						local350 += local610;
						local390 += local418;
						local392 += local612;
						local396 += local420;
						local398 += local614;
						arg2 += this.anInt7044;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = this.anIntArray445[(int) arg2];
					while (--arg1 >= 0.0F) {
						this.method6022(this.anIntArray444, this.anIntArray448, (int) arg2, (int) arg5, (int) arg3, arg8, arg6, arg11, arg9, arg14, arg12, (float) arg21, (float) arg19, local293, local279, local314, local300, local335, local321, local350, local340, local392, local388, local398, local394);
						arg5 += local525;
						arg3 += local428;
						arg8 += local596;
						arg6 += local499;
						arg11 += local598;
						arg9 += local501;
						arg14 += local600;
						arg12 += local503;
						arg21 = (int) ((float) arg21 + local602);
						arg19 = (int) ((float) arg19 + local505);
						local293 += local604;
						local279 += local507;
						local314 += local606;
						local300 += local509;
						local335 += local608;
						local321 += local511;
						local350 += local610;
						local340 += local513;
						local392 += local612;
						local388 += local515;
						local398 += local614;
						local394 += local517;
						arg2 += this.anInt7044;
					}
					while (--arg0 >= 0.0F) {
						this.method6022(this.anIntArray444, this.anIntArray448, (int) arg2, (int) arg5, (int) arg4, arg8, arg7, arg11, arg10, arg14, arg13, (float) arg21, (float) arg20, local293, local286, local314, local307, local335, local328, local350, local345, local392, local390, local398, local396);
						arg5 += local525;
						arg4 += local400;
						arg8 += local596;
						arg7 += local402;
						arg11 += local598;
						arg10 += local404;
						arg14 += local600;
						arg13 += local406;
						arg21 = (int) ((float) arg21 + local602);
						arg20 = (int) ((float) arg20 + local408);
						local293 += local604;
						local286 += local410;
						local314 += local606;
						local307 += local412;
						local335 += local608;
						local328 += local414;
						local350 += local610;
						local345 += local416;
						local392 += local612;
						local390 += local418;
						local398 += local614;
						local396 += local420;
						arg2 += this.anInt7044;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "([I[FIIIIIFFFFFFFF)V")
	private void method6018(@OriginalArg(0) int[] arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) float arg5, @OriginalArg(8) float arg6, @OriginalArg(9) float arg7, @OriginalArg(10) float arg8, @OriginalArg(11) float arg9, @OriginalArg(12) float arg10, @OriginalArg(13) float arg11, @OriginalArg(14) float arg12) {
		if (this.aBoolean511) {
			if (arg4 > this.anInt7045) {
				arg4 = this.anInt7045;
			}
			if (arg3 < 0) {
				arg3 = 0;
			}
		}
		if (arg3 >= arg4) {
			return;
		}
		@Pc(163) int local163;
		@Pc(168) int local168;
		@Pc(223) int local223;
		@Pc(456) int local456;
		@Pc(460) int local460;
		@Pc(468) int local468;
		@Pc(54) int local54;
		@Pc(88) int local88;
		@Pc(103) int local103;
		@Pc(58) float local58;
		@Pc(62) float local62;
		@Pc(66) float local66;
		if (this.aBoolean513) {
			arg2 += arg3;
			arg7 += arg8 * (float) arg3;
			arg9 += arg10 * (float) arg3;
			arg11 += arg12 * (float) arg3;
			if (this.aBoolean510) {
				local54 = arg4 - arg3 >> 2;
				local58 = arg8 * 4.0F;
				local62 = arg10 * 4.0F;
				local66 = arg12 * 4.0F;
				if (this.anInt7043 == 0) {
					if (local54 > 0) {
						do {
							local88 = (int) arg7 & 0xFF0000 | 0xFF000000 | (int) arg9 & 0xFF00 | (int) arg11 & 0xFF;
							arg7 += local58;
							arg9 += local62;
							arg11 += local66;
							local103 = arg2 + 1;
							arg0[arg2] = local88;
							arg0[local103++] = local88;
							arg0[local103++] = local88;
							arg2 = local103 + 1;
							arg0[local103] = local88;
							local54--;
						} while (local54 > 0);
					}
					local54 = arg4 - arg3 & 0x3;
					if (local54 > 0) {
						local88 = (int) arg7 & 0xFF0000 | 0xFF000000 | (int) arg9 & 0xFF00 | (int) arg11 & 0xFF;
						do {
							arg0[arg2++] = local88;
							local54--;
						} while (local54 > 0);
						return;
					}
				} else if (this.aBoolean509) {
					if (local54 > 0) {
						do {
							local88 = (int) arg7 & 0xFF0000 | (int) arg9 & 0xFF00 | (int) arg11 & 0xFF;
							arg7 += local58;
							arg9 += local62;
							arg11 += local66;
							local103 = arg2 + 1;
							local456 = arg0[arg2];
							local460 = local88 + local456;
							local468 = (local88 & 0xFF00FF) + (local456 & 0xFF00FF);
							local456 = (local468 & 0x1000100) + (local460 - local468 & 0x10000);
							arg0[arg2] = local460 - local456 | 0xFF000000 | local456 - (local456 >>> 8);
							@Pc(497) int local497 = local103++;
							@Pc(503) int local503 = arg0[local497];
							@Pc(507) int local507 = local88 + local503;
							@Pc(515) int local515 = (local88 & 0xFF00FF) + (local503 & 0xFF00FF);
							@Pc(525) int local525 = (local515 & 0x1000100) + (local507 - local515 & 0x10000);
							arg0[local497] = local507 - local525 | 0xFF000000 | local525 - (local525 >>> 8);
							@Pc(544) int local544 = local103++;
							@Pc(550) int local550 = arg0[local544];
							@Pc(554) int local554 = local88 + local550;
							@Pc(562) int local562 = (local88 & 0xFF00FF) + (local550 & 0xFF00FF);
							@Pc(572) int local572 = (local562 & 0x1000100) + (local554 - local562 & 0x10000);
							arg0[local544] = local554 - local572 | 0xFF000000 | local572 - (local572 >>> 8);
							arg2 = local103 + 1;
							@Pc(597) int local597 = arg0[local103];
							@Pc(601) int local601 = local88 + local597;
							@Pc(609) int local609 = (local88 & 0xFF00FF) + (local597 & 0xFF00FF);
							@Pc(619) int local619 = (local609 & 0x1000100) + (local601 - local609 & 0x10000);
							arg0[local103] = local601 - local619 | 0xFF000000 | local619 - (local619 >>> 8);
							local54--;
						} while (local54 > 0);
					}
					local54 = arg4 - arg3 & 0x3;
					if (local54 > 0) {
						local88 = (int) arg7 & 0xFF0000 | (int) arg9 & 0xFF00 | (int) arg11 & 0xFF;
						do {
							local168 = arg2++;
							local456 = arg0[local168];
							local460 = local88 + local456;
							local468 = (local88 & 0xFF00FF) + (local456 & 0xFF00FF);
							local456 = (local468 & 0x1000100) + (local460 - local468 & 0x10000);
							arg0[local168] = local460 - local456 | 0xFF000000 | local456 - (local456 >>> 8);
							local54--;
						} while (local54 > 0);
					}
				} else {
					local163 = this.anInt7043;
					local168 = 256 - this.anInt7043;
					if (local54 > 0) {
						do {
							local88 = (int) arg7 & 0xFF0000 | 0xFF000000 | (int) arg9 & 0xFF00 | (int) arg11 & 0xFF;
							arg7 += local58;
							arg9 += local62;
							arg11 += local66;
							local88 = ((local88 & 0xFF00FF) * local168 >> 8 & 0xFF00FF) + ((local88 & 0xFF00) * local168 >> 8 & 0xFF00);
							local223 = arg0[arg2];
							local103 = arg2 + 1;
							arg0[arg2] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
							local223 = arg0[local103];
							arg0[local103++] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
							local223 = arg0[local103];
							arg0[local103++] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
							local223 = arg0[local103];
							arg2 = local103 + 1;
							arg0[local103] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
							local54--;
						} while (local54 > 0);
					}
					local54 = arg4 - arg3 & 0x3;
					if (local54 > 0) {
						local88 = (int) arg7 & 0xFF0000 | 0xFF000000 | (int) arg9 & 0xFF00 | (int) arg11 & 0xFF;
						local88 = ((local88 & 0xFF00FF) * local168 >> 8 & 0xFF00FF) + ((local88 & 0xFF00) * local168 >> 8 & 0xFF00);
						do {
							local223 = arg0[arg2];
							arg0[arg2++] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
							local54--;
						} while (local54 > 0);
						return;
					}
				}
			} else {
				local54 = arg4 - arg3;
				if (this.anInt7043 == 0) {
					do {
						arg0[arg2++] = (int) arg7 & 0xFF0000 | 0xFF000000 | (int) arg9 & 0xFF00 | (int) arg11 & 0xFF;
						arg7 += arg8;
						arg9 += arg10;
						arg11 += arg12;
						local54--;
					} while (local54 > 0);
				} else if (this.aBoolean509) {
					do {
						local168 = arg2++;
						local223 = (int) arg7 & 0xFF0000 | (int) arg9 & 0xFF00 | (int) arg11 & 0xFF;
						local456 = arg0[local168];
						local460 = local223 + local456;
						local468 = (local223 & 0xFF00FF) + (local456 & 0xFF00FF);
						local456 = (local468 & 0x1000100) + (local460 - local468 & 0x10000);
						arg0[local168] = local460 - local456 | 0xFF000000 | local456 - (local456 >>> 8);
						arg7 += arg8;
						arg9 += arg10;
						arg11 += arg12;
						local54--;
					} while (local54 > 0);
				} else {
					local163 = this.anInt7043;
					local168 = 256 - this.anInt7043;
					do {
						local88 = (int) arg7 & 0xFF0000 | 0xFF000000 | (int) arg9 & 0xFF00 | (int) arg11 & 0xFF;
						arg7 += arg8;
						arg9 += arg10;
						arg11 += arg12;
						local88 = ((local88 & 0xFF00FF) * local168 >> 8 & 0xFF00FF) + ((local88 & 0xFF00) * local168 >> 8 & 0xFF00);
						local223 = arg0[arg2];
						arg0[arg2++] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
						local54--;
					} while (local54 > 0);
				}
			}
			return;
		}
		arg2 += arg3 - 1;
		arg5 += arg6 * (float) arg3;
		arg7 += arg8 * (float) arg3;
		arg9 += arg10 * (float) arg3;
		arg11 += arg12 * (float) arg3;
		@Pc(1034) float local1034;
		if (this.aClass261_3.aBoolean573) {
			if (this.aBoolean510) {
				local54 = arg4 - arg3 >> 2;
				local58 = arg8 * 4.0F;
				local62 = arg10 * 4.0F;
				local66 = arg12 * 4.0F;
				if (this.anInt7043 == 0) {
					if (local54 > 0) {
						do {
							local88 = (int) arg7 & 0xFF0000 | 0xFF000000 | (int) arg9 & 0xFF00 | (int) arg11 & 0xFF;
							arg7 += local58;
							arg9 += local62;
							arg11 += local66;
							local103 = arg2 + 1;
							if (arg5 < arg1[local103]) {
								arg0[local103] = local88;
								arg1[local103] = arg5;
							}
							local1034 = arg5 + arg6;
							local103++;
							if (local1034 < arg1[local103]) {
								arg0[local103] = local88;
								arg1[local103] = local1034;
							}
							local1034 += arg6;
							local103++;
							if (local1034 < arg1[local103]) {
								arg0[local103] = local88;
								arg1[local103] = local1034;
							}
							local1034 += arg6;
							arg2 = local103 + 1;
							if (local1034 < arg1[arg2]) {
								arg0[arg2] = local88;
								arg1[arg2] = local1034;
							}
							arg5 = local1034 + arg6;
							local54--;
						} while (local54 > 0);
					}
					local54 = arg4 - arg3 & 0x3;
					if (local54 > 0) {
						local88 = (int) arg7 & 0xFF0000 | 0xFF000000 | (int) arg9 & 0xFF00 | (int) arg11 & 0xFF;
						do {
							arg2++;
							if (arg5 < arg1[arg2]) {
								arg0[arg2] = local88;
								arg1[arg2] = arg5;
							}
							arg5 += arg6;
							local54--;
						} while (local54 > 0);
						return;
					}
				} else if (this.aBoolean509) {
					if (local54 > 0) {
						do {
							local88 = (int) arg7 & 0xFF0000 | (int) arg9 & 0xFF00 | (int) arg11 & 0xFF;
							arg7 += local58;
							arg9 += local62;
							arg11 += local66;
							local103 = arg2 + 1;
							if (arg5 < arg1[local103]) {
								local456 = arg0[local103];
								local460 = local88 + local456;
								local468 = (local88 & 0xFF00FF) + (local456 & 0xFF00FF);
								local456 = (local468 & 0x1000100) + (local460 - local468 & 0x10000);
								arg0[local103] = local460 - local456 | 0xFF000000 | local456 - (local456 >>> 8);
								arg1[local103] = arg5;
							}
							local1034 = arg5 + arg6;
							local103++;
							if (local1034 < arg1[local103]) {
								local456 = arg0[local103];
								local460 = local88 + local456;
								local468 = (local88 & 0xFF00FF) + (local456 & 0xFF00FF);
								local456 = (local468 & 0x1000100) + (local460 - local468 & 0x10000);
								arg0[local103] = local460 - local456 | 0xFF000000 | local456 - (local456 >>> 8);
								arg1[local103] = local1034;
							}
							local1034 += arg6;
							local103++;
							if (local1034 < arg1[local103]) {
								local456 = arg0[local103];
								local460 = local88 + local456;
								local468 = (local88 & 0xFF00FF) + (local456 & 0xFF00FF);
								local456 = (local468 & 0x1000100) + (local460 - local468 & 0x10000);
								arg0[local103] = local460 - local456 | 0xFF000000 | local456 - (local456 >>> 8);
								arg1[local103] = local1034;
							}
							local1034 += arg6;
							arg2 = local103 + 1;
							if (local1034 < arg1[arg2]) {
								local456 = arg0[arg2];
								local460 = local88 + local456;
								local468 = (local88 & 0xFF00FF) + (local456 & 0xFF00FF);
								local456 = (local468 & 0x1000100) + (local460 - local468 & 0x10000);
								arg0[arg2] = local460 - local456 | 0xFF000000 | local456 - (local456 >>> 8);
								arg1[arg2] = local1034;
							}
							arg5 = local1034 + arg6;
							local54--;
						} while (local54 > 0);
					}
					local54 = arg4 - arg3 & 0x3;
					if (local54 > 0) {
						local88 = (int) arg7 & 0xFF0000 | (int) arg9 & 0xFF00 | (int) arg11 & 0xFF;
						do {
							arg2++;
							if (arg5 < arg1[arg2]) {
								local456 = arg0[arg2];
								local460 = local88 + local456;
								local468 = (local88 & 0xFF00FF) + (local456 & 0xFF00FF);
								local456 = (local468 & 0x1000100) + (local460 - local468 & 0x10000);
								arg0[arg2] = local460 - local456 | 0xFF000000 | local456 - (local456 >>> 8);
								arg1[arg2] = arg5;
							}
							arg5 += arg6;
							local54--;
						} while (local54 > 0);
					}
				} else {
					local163 = this.anInt7043;
					local168 = 256 - this.anInt7043;
					if (local54 > 0) {
						do {
							local88 = (int) arg7 & 0xFF0000 | 0xFF000000 | (int) arg9 & 0xFF00 | (int) arg11 & 0xFF;
							arg7 += local58;
							arg9 += local62;
							arg11 += local66;
							local88 = ((local88 & 0xFF00FF) * local168 >> 8 & 0xFF00FF) + ((local88 & 0xFF00) * local168 >> 8 & 0xFF00);
							local103 = arg2 + 1;
							if (arg5 < arg1[local103]) {
								local223 = arg0[local103];
								arg0[local103] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
								arg1[local103] = arg5;
							}
							local1034 = arg5 + arg6;
							local103++;
							if (local1034 < arg1[local103]) {
								local223 = arg0[local103];
								arg0[local103] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
								arg1[local103] = local1034;
							}
							local1034 += arg6;
							local103++;
							if (local1034 < arg1[local103]) {
								local223 = arg0[local103];
								arg0[local103] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
								arg1[local103] = local1034;
							}
							local1034 += arg6;
							arg2 = local103 + 1;
							if (local1034 < arg1[arg2]) {
								local223 = arg0[arg2];
								arg0[arg2] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
								arg1[arg2] = local1034;
							}
							arg5 = local1034 + arg6;
							local54--;
						} while (local54 > 0);
					}
					local54 = arg4 - arg3 & 0x3;
					if (local54 > 0) {
						local88 = (int) arg7 & 0xFF0000 | 0xFF000000 | (int) arg9 & 0xFF00 | (int) arg11 & 0xFF;
						local88 = ((local88 & 0xFF00FF) * local168 >> 8 & 0xFF00FF) + ((local88 & 0xFF00) * local168 >> 8 & 0xFF00);
						do {
							arg2++;
							if (arg5 < arg1[arg2]) {
								local223 = arg0[arg2];
								arg0[arg2] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
								arg1[arg2] = arg5;
							}
							arg5 += arg6;
							local54--;
						} while (local54 > 0);
						return;
					}
				}
			} else {
				local54 = arg4 - arg3;
				if (this.anInt7043 == 0) {
					do {
						arg2++;
						if (arg5 < arg1[arg2]) {
							arg0[arg2] = (int) arg7 & 0xFF0000 | 0xFF000000 | (int) arg9 & 0xFF00 | (int) arg11 & 0xFF;
							arg1[arg2] = arg5;
						}
						arg5 += arg6;
						arg7 += arg8;
						arg9 += arg10;
						arg11 += arg12;
						local54--;
					} while (local54 > 0);
				} else if (this.aBoolean509) {
					do {
						arg2++;
						if (arg5 < arg1[arg2]) {
							local223 = (int) arg7 & 0xFF0000 | (int) arg9 & 0xFF00 | (int) arg11 & 0xFF;
							local456 = arg0[arg2];
							local460 = local223 + local456;
							local468 = (local223 & 0xFF00FF) + (local456 & 0xFF00FF);
							local456 = (local468 & 0x1000100) + (local460 - local468 & 0x10000);
							arg0[arg2] = local460 - local456 | 0xFF000000 | local456 - (local456 >>> 8);
							arg1[arg2] = arg5;
						}
						arg5 += arg6;
						arg7 += arg8;
						arg9 += arg10;
						arg11 += arg12;
						local54--;
					} while (local54 > 0);
				} else {
					local163 = this.anInt7043;
					local168 = 256 - this.anInt7043;
					do {
						arg2++;
						if (arg5 < arg1[arg2]) {
							local88 = (int) arg7 & 0xFF0000 | 0xFF000000 | (int) arg9 & 0xFF00 | (int) arg11 & 0xFF;
							local88 = ((local88 & 0xFF00FF) * local168 >> 8 & 0xFF00FF) + ((local88 & 0xFF00) * local168 >> 8 & 0xFF00);
							local223 = arg0[arg2];
							arg0[arg2] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
							arg1[arg2] = arg5;
						}
						arg5 += arg6;
						arg7 += arg8;
						arg9 += arg10;
						arg11 += arg12;
						local54--;
					} while (local54 > 0);
				}
			}
		} else if (this.aBoolean510) {
			local54 = arg4 - arg3 >> 2;
			local58 = arg8 * 4.0F;
			local62 = arg10 * 4.0F;
			local66 = arg12 * 4.0F;
			if (this.anInt7043 == 0) {
				if (local54 > 0) {
					do {
						local88 = (int) arg7 & 0xFF0000 | 0xFF000000 | (int) arg9 & 0xFF00 | (int) arg11 & 0xFF;
						arg7 += local58;
						arg9 += local62;
						arg11 += local66;
						local103 = arg2 + 1;
						if (arg5 < arg1[local103]) {
							arg0[local103] = local88;
						}
						local1034 = arg5 + arg6;
						local103++;
						if (local1034 < arg1[local103]) {
							arg0[local103] = local88;
						}
						local1034 += arg6;
						local103++;
						if (local1034 < arg1[local103]) {
							arg0[local103] = local88;
						}
						local1034 += arg6;
						arg2 = local103 + 1;
						if (local1034 < arg1[arg2]) {
							arg0[arg2] = local88;
						}
						arg5 = local1034 + arg6;
						local54--;
					} while (local54 > 0);
				}
				local54 = arg4 - arg3 & 0x3;
				if (local54 > 0) {
					local88 = (int) arg7 & 0xFF0000 | 0xFF000000 | (int) arg9 & 0xFF00 | (int) arg11 & 0xFF;
					do {
						arg2++;
						if (arg5 < arg1[arg2]) {
							arg0[arg2] = local88;
						}
						arg5 += arg6;
						local54--;
					} while (local54 > 0);
					return;
				}
			} else if (this.aBoolean509) {
				if (local54 > 0) {
					do {
						local88 = (int) arg7 & 0xFF0000 | (int) arg9 & 0xFF00 | (int) arg11 & 0xFF;
						arg7 += local58;
						arg9 += local62;
						arg11 += local66;
						local103 = arg2 + 1;
						if (arg5 < arg1[local103]) {
							local456 = arg0[local103];
							local460 = local88 + local456;
							local468 = (local88 & 0xFF00FF) + (local456 & 0xFF00FF);
							local456 = (local468 & 0x1000100) + (local460 - local468 & 0x10000);
							arg0[local103] = local460 - local456 | 0xFF000000 | local456 - (local456 >>> 8);
						}
						local1034 = arg5 + arg6;
						local103++;
						if (local1034 < arg1[local103]) {
							local456 = arg0[local103];
							local460 = local88 + local456;
							local468 = (local88 & 0xFF00FF) + (local456 & 0xFF00FF);
							local456 = (local468 & 0x1000100) + (local460 - local468 & 0x10000);
							arg0[local103] = local460 - local456 | 0xFF000000 | local456 - (local456 >>> 8);
						}
						local1034 += arg6;
						local103++;
						if (local1034 < arg1[local103]) {
							local456 = arg0[local103];
							local460 = local88 + local456;
							local468 = (local88 & 0xFF00FF) + (local456 & 0xFF00FF);
							local456 = (local468 & 0x1000100) + (local460 - local468 & 0x10000);
							arg0[local103] = local460 - local456 | 0xFF000000 | local456 - (local456 >>> 8);
						}
						local1034 += arg6;
						arg2 = local103 + 1;
						if (local1034 < arg1[arg2]) {
							local456 = arg0[arg2];
							local460 = local88 + local456;
							local468 = (local88 & 0xFF00FF) + (local456 & 0xFF00FF);
							local456 = (local468 & 0x1000100) + (local460 - local468 & 0x10000);
							arg0[arg2] = local460 - local456 | 0xFF000000 | local456 - (local456 >>> 8);
						}
						arg5 = local1034 + arg6;
						local54--;
					} while (local54 > 0);
				}
				local54 = arg4 - arg3 & 0x3;
				if (local54 > 0) {
					local88 = (int) arg7 & 0xFF0000 | (int) arg9 & 0xFF00 | (int) arg11 & 0xFF;
					do {
						arg2++;
						if (arg5 < arg1[arg2]) {
							local456 = arg0[arg2];
							local460 = local88 + local456;
							local468 = (local88 & 0xFF00FF) + (local456 & 0xFF00FF);
							local456 = (local468 & 0x1000100) + (local460 - local468 & 0x10000);
							arg0[arg2] = local460 - local456 | 0xFF000000 | local456 - (local456 >>> 8);
						}
						arg5 += arg6;
						local54--;
					} while (local54 > 0);
				}
			} else {
				local163 = this.anInt7043;
				local168 = 256 - this.anInt7043;
				if (local54 > 0) {
					do {
						local88 = (int) arg7 & 0xFF0000 | 0xFF000000 | (int) arg9 & 0xFF00 | (int) arg11 & 0xFF;
						arg7 += local58;
						arg9 += local62;
						arg11 += local66;
						local88 = ((local88 & 0xFF00FF) * local168 >> 8 & 0xFF00FF) + ((local88 & 0xFF00) * local168 >> 8 & 0xFF00);
						local103 = arg2 + 1;
						if (arg5 < arg1[local103]) {
							local223 = arg0[local103];
							arg0[local103] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
						}
						local1034 = arg5 + arg6;
						local103++;
						if (local1034 < arg1[local103]) {
							local223 = arg0[local103];
							arg0[local103] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
						}
						local1034 += arg6;
						local103++;
						if (local1034 < arg1[local103]) {
							local223 = arg0[local103];
							arg0[local103] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
						}
						local1034 += arg6;
						arg2 = local103 + 1;
						if (local1034 < arg1[arg2]) {
							local223 = arg0[arg2];
							arg0[arg2] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
						}
						arg5 = local1034 + arg6;
						local54--;
					} while (local54 > 0);
				}
				local54 = arg4 - arg3 & 0x3;
				if (local54 > 0) {
					local88 = (int) arg7 & 0xFF0000 | 0xFF000000 | (int) arg9 & 0xFF00 | (int) arg11 & 0xFF;
					local88 = ((local88 & 0xFF00FF) * local168 >> 8 & 0xFF00FF) + ((local88 & 0xFF00) * local168 >> 8 & 0xFF00);
					do {
						arg2++;
						if (arg5 < arg1[arg2]) {
							local223 = arg0[arg2];
							arg0[arg2] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
						}
						arg5 += arg6;
						local54--;
					} while (local54 > 0);
					return;
				}
			}
		} else {
			local54 = arg4 - arg3;
			if (this.anInt7043 == 0) {
				do {
					arg2++;
					if (arg5 < arg1[arg2]) {
						arg0[arg2] = (int) arg7 & 0xFF0000 | 0xFF000000 | (int) arg9 & 0xFF00 | (int) arg11 & 0xFF;
					}
					arg5 += arg6;
					arg7 += arg8;
					arg9 += arg10;
					arg11 += arg12;
					local54--;
				} while (local54 > 0);
			} else if (this.aBoolean509) {
				do {
					arg2++;
					if (arg5 < arg1[arg2]) {
						local223 = (int) arg7 & 0xFF0000 | (int) arg9 & 0xFF00 | (int) arg11 & 0xFF;
						local456 = arg0[arg2];
						local460 = local223 + local456;
						local468 = (local223 & 0xFF00FF) + (local456 & 0xFF00FF);
						@Pc(3112) int local3112 = (local468 & 0x1000100) + (local460 - local468 & 0x10000);
						arg0[arg2] = local460 - local3112 | 0xFF000000 | local3112 - (local3112 >>> 8);
					}
					arg5 += arg6;
					arg7 += arg8;
					arg9 += arg10;
					arg11 += arg12;
					local54--;
				} while (local54 > 0);
			} else {
				local163 = this.anInt7043;
				local168 = 256 - this.anInt7043;
				do {
					arg2++;
					if (arg5 < arg1[arg2]) {
						local88 = (int) arg7 & 0xFF0000 | 0xFF000000 | (int) arg9 & 0xFF00 | (int) arg11 & 0xFF;
						@Pc(3012) int local3012 = ((local88 & 0xFF00FF) * local168 >> 8 & 0xFF00FF) + ((local88 & 0xFF00) * local168 >> 8 & 0xFF00);
						local223 = arg0[arg2];
						arg0[arg2] = local3012 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
					}
					arg5 += arg6;
					arg7 += arg8;
					arg9 += arg10;
					arg11 += arg12;
					local54--;
				} while (local54 > 0);
			}
		}
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(FFFFFFFFFFFF)V")
	public void method6019(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) float arg11) {
		if (this.aBoolean512) {
			this.aClass20_Sub1_10.method7248((int) arg0, (int) arg3, (int) arg4, Static373.anIntArray464[(int) arg9], (int) arg1);
			this.aClass20_Sub1_10.method7248((int) arg1, (int) arg4, (int) arg5, Static373.anIntArray464[(int) arg9], (int) arg2);
			this.aClass20_Sub1_10.method7248((int) arg2, (int) arg5, (int) arg3, Static373.anIntArray464[(int) arg9], (int) arg0);
			return;
		}
		@Pc(55) float local55 = arg4 - arg3;
		@Pc(59) float local59 = arg1 - arg0;
		@Pc(63) float local63 = arg5 - arg3;
		@Pc(67) float local67 = arg2 - arg0;
		@Pc(71) float local71 = arg10 - arg9;
		@Pc(75) float local75 = arg11 - arg9;
		@Pc(79) float local79 = arg7 - arg6;
		@Pc(83) float local83 = arg8 - arg6;
		@Pc(95) float local95;
		if (arg2 == arg1) {
			local95 = 0.0F;
		} else {
			local95 = (arg5 - arg4) / (arg2 - arg1);
		}
		@Pc(106) float local106;
		if (arg1 == arg0) {
			local106 = 0.0F;
		} else {
			local106 = local55 / local59;
		}
		@Pc(117) float local117;
		if (arg2 == arg0) {
			local117 = 0.0F;
		} else {
			local117 = local63 / local67;
		}
		@Pc(128) float local128 = local55 * local67 - local63 * local59;
		if (local128 == 0.0F) {
			return;
		}
		@Pc(143) float local143 = (local71 * local67 - local75 * local59) / local128;
		@Pc(153) float local153 = (local75 * local55 - local71 * local63) / local128;
		@Pc(163) float local163 = (local79 * local67 - local83 * local59) / local128;
		@Pc(173) float local173 = (local83 * local55 - local79 * local63) / local128;
		if (arg0 <= arg1 && arg0 <= arg2) {
			if (!(arg0 >= (float) this.anInt7042)) {
				if (arg1 > (float) this.anInt7042) {
					arg1 = this.anInt7042;
				}
				if (arg2 > (float) this.anInt7042) {
					arg2 = this.anInt7042;
				}
				arg9 = arg9 + local143 - local143 * arg3;
				arg6 = arg6 + local163 - local163 * arg3;
				if (arg1 < arg2) {
					arg5 = arg3;
					if (arg0 < 0.0F) {
						arg5 = arg3 - local117 * arg0;
						arg3 -= local106 * arg0;
						arg9 -= local153 * arg0;
						arg6 -= local173 * arg0;
						arg0 = 0.0F;
					}
					if (arg1 < 0.0F) {
						arg4 -= local95 * arg1;
						arg1 = 0.0F;
					}
					if ((arg0 == arg1 || !(local117 < local106)) && (arg0 != arg1 || !(local117 > local95))) {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = this.anIntArray445[(int) arg0];
						while (--arg1 >= 0.0F) {
							this.method6016(this.anIntArray444, this.aFloatArray58, (int) arg0, (int) arg3, (int) arg5, arg9, local143, arg6, local163);
							arg5 += local117;
							arg3 += local106;
							arg9 += local153;
							arg6 += local173;
							arg0 += this.anInt7044;
						}
						while (--arg2 >= 0.0F) {
							this.method6016(this.anIntArray444, this.aFloatArray58, (int) arg0, (int) arg4, (int) arg5, arg9, local143, arg6, local163);
							arg5 += local117;
							arg4 += local95;
							arg9 += local153;
							arg6 += local173;
							arg0 += this.anInt7044;
						}
					} else {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = this.anIntArray445[(int) arg0];
						while (--arg1 >= 0.0F) {
							this.method6016(this.anIntArray444, this.aFloatArray58, (int) arg0, (int) arg5, (int) arg3, arg9, local143, arg6, local163);
							arg5 += local117;
							arg3 += local106;
							arg9 += local153;
							arg6 += local173;
							arg0 += this.anInt7044;
						}
						while (--arg2 >= 0.0F) {
							this.method6016(this.anIntArray444, this.aFloatArray58, (int) arg0, (int) arg5, (int) arg4, arg9, local143, arg6, local163);
							arg5 += local117;
							arg4 += local95;
							arg9 += local153;
							arg6 += local173;
							arg0 += this.anInt7044;
						}
					}
				} else {
					arg4 = arg3;
					if (arg0 < 0.0F) {
						arg4 = arg3 - local117 * arg0;
						arg3 -= local106 * arg0;
						arg9 -= local153 * arg0;
						arg6 -= local173 * arg0;
						arg0 = 0.0F;
					}
					if (arg2 < 0.0F) {
						arg5 -= local95 * arg2;
						arg2 = 0.0F;
					}
					if (arg0 != arg2 && local117 < local106 || arg0 == arg2 && local95 > local106) {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = this.anIntArray445[(int) arg0];
						while (--arg2 >= 0.0F) {
							this.method6016(this.anIntArray444, this.aFloatArray58, (int) arg0, (int) arg4, (int) arg3, arg9, local143, arg6, local163);
							arg4 += local117;
							arg3 += local106;
							arg9 += local153;
							arg6 += local173;
							arg0 += this.anInt7044;
						}
						while (--arg1 >= 0.0F) {
							this.method6016(this.anIntArray444, this.aFloatArray58, (int) arg0, (int) arg5, (int) arg3, arg9, local143, arg6, local163);
							arg5 += local95;
							arg3 += local106;
							arg9 += local153;
							arg6 += local173;
							arg0 += this.anInt7044;
						}
					} else {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = this.anIntArray445[(int) arg0];
						while (--arg2 >= 0.0F) {
							this.method6016(this.anIntArray444, this.aFloatArray58, (int) arg0, (int) arg3, (int) arg4, arg9, local143, arg6, local163);
							arg4 += local117;
							arg3 += local106;
							arg9 += local153;
							arg6 += local173;
							arg0 += this.anInt7044;
						}
						while (--arg1 >= 0.0F) {
							this.method6016(this.anIntArray444, this.aFloatArray58, (int) arg0, (int) arg3, (int) arg5, arg9, local143, arg6, local163);
							arg5 += local95;
							arg3 += local106;
							arg9 += local153;
							arg6 += local173;
							arg0 += this.anInt7044;
						}
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (!(arg1 >= (float) this.anInt7042)) {
				if (arg2 > (float) this.anInt7042) {
					arg2 = this.anInt7042;
				}
				if (arg0 > (float) this.anInt7042) {
					arg0 = this.anInt7042;
				}
				arg10 = arg10 + local143 - local143 * arg4;
				arg7 = arg7 + local163 - local163 * arg4;
				if (arg2 < arg0) {
					arg3 = arg4;
					if (arg1 < 0.0F) {
						arg3 = arg4 - local106 * arg1;
						arg4 -= local95 * arg1;
						arg10 -= local153 * arg1;
						arg7 -= local173 * arg1;
						arg1 = 0.0F;
					}
					if (arg2 < 0.0F) {
						arg5 -= local117 * arg2;
						arg2 = 0.0F;
					}
					if ((arg1 == arg2 || !(local106 < local95)) && (arg1 != arg2 || !(local106 > local117))) {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = this.anIntArray445[(int) arg1];
						while (--arg2 >= 0.0F) {
							this.method6016(this.anIntArray444, this.aFloatArray58, (int) arg1, (int) arg4, (int) arg3, arg10, local143, arg7, local163);
							arg3 += local106;
							arg4 += local95;
							arg10 += local153;
							arg7 += local173;
							arg1 += this.anInt7044;
						}
						while (--arg0 >= 0.0F) {
							this.method6016(this.anIntArray444, this.aFloatArray58, (int) arg1, (int) arg5, (int) arg3, arg10, local143, arg7, local163);
							arg3 += local106;
							arg5 += local117;
							arg10 += local153;
							arg7 += local173;
							arg1 += this.anInt7044;
						}
					} else {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = this.anIntArray445[(int) arg1];
						while (--arg2 >= 0.0F) {
							this.method6016(this.anIntArray444, this.aFloatArray58, (int) arg1, (int) arg3, (int) arg4, arg10, local143, arg7, local163);
							arg3 += local106;
							arg4 += local95;
							arg10 += local153;
							arg7 += local173;
							arg1 += this.anInt7044;
						}
						while (--arg0 >= 0.0F) {
							this.method6016(this.anIntArray444, this.aFloatArray58, (int) arg1, (int) arg3, (int) arg5, arg10, local143, arg7, local163);
							arg3 += local106;
							arg5 += local117;
							arg10 += local153;
							arg7 += local173;
							arg1 += this.anInt7044;
						}
					}
				} else {
					arg5 = arg4;
					if (arg1 < 0.0F) {
						arg5 = arg4 - local106 * arg1;
						arg4 -= local95 * arg1;
						arg10 -= local153 * arg1;
						arg7 -= local173 * arg1;
						arg1 = 0.0F;
					}
					if (arg0 < 0.0F) {
						arg3 -= local117 * arg0;
						arg0 = 0.0F;
					}
					if (local106 < local95) {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = this.anIntArray445[(int) arg1];
						while (--arg0 >= 0.0F) {
							this.method6016(this.anIntArray444, this.aFloatArray58, (int) arg1, (int) arg5, (int) arg4, arg10, local143, arg7, local163);
							arg5 += local106;
							arg4 += local95;
							arg10 += local153;
							arg7 += local173;
							arg1 += this.anInt7044;
						}
						while (--arg2 >= 0.0F) {
							this.method6016(this.anIntArray444, this.aFloatArray58, (int) arg1, (int) arg3, (int) arg4, arg10, local143, arg7, local163);
							arg3 += local117;
							arg4 += local95;
							arg10 += local153;
							arg7 += local173;
							arg1 += this.anInt7044;
						}
					} else {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = this.anIntArray445[(int) arg1];
						while (--arg0 >= 0.0F) {
							this.method6016(this.anIntArray444, this.aFloatArray58, (int) arg1, (int) arg4, (int) arg5, arg10, local143, arg7, local163);
							arg5 += local106;
							arg4 += local95;
							arg10 += local153;
							arg7 += local173;
							arg1 += this.anInt7044;
						}
						while (--arg2 >= 0.0F) {
							this.method6016(this.anIntArray444, this.aFloatArray58, (int) arg1, (int) arg4, (int) arg3, arg10, local143, arg7, local163);
							arg3 += local117;
							arg4 += local95;
							arg10 += local153;
							arg7 += local173;
							arg1 += this.anInt7044;
						}
					}
				}
			}
		} else if (!(arg2 >= (float) this.anInt7042)) {
			if (arg0 > (float) this.anInt7042) {
				arg0 = this.anInt7042;
			}
			if (arg1 > (float) this.anInt7042) {
				arg1 = this.anInt7042;
			}
			arg11 = arg11 + local143 - local143 * arg5;
			arg8 = arg8 + local163 - local163 * arg5;
			if (arg0 < arg1) {
				arg4 = arg5;
				if (arg2 < 0.0F) {
					arg4 = arg5 - local95 * arg2;
					arg5 -= local117 * arg2;
					arg11 -= local153 * arg2;
					arg8 -= local173 * arg2;
					arg2 = 0.0F;
				}
				if (arg0 < 0.0F) {
					arg3 -= local106 * arg0;
					arg0 = 0.0F;
				}
				if (local95 < local117) {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = this.anIntArray445[(int) arg2];
					while (--arg0 >= 0.0F) {
						this.method6016(this.anIntArray444, this.aFloatArray58, (int) arg2, (int) arg4, (int) arg5, arg11, local143, arg8, local163);
						arg4 += local95;
						arg5 += local117;
						arg11 += local153;
						arg8 += local173;
						arg2 += this.anInt7044;
					}
					while (--arg1 >= 0.0F) {
						this.method6016(this.anIntArray444, this.aFloatArray58, (int) arg2, (int) arg4, (int) arg3, arg11, local143, arg8, local163);
						arg4 += local95;
						arg3 += local106;
						arg11 += local153;
						arg8 += local173;
						arg2 += this.anInt7044;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = this.anIntArray445[(int) arg2];
					while (--arg0 >= 0.0F) {
						this.method6016(this.anIntArray444, this.aFloatArray58, (int) arg2, (int) arg5, (int) arg4, arg11, local143, arg8, local163);
						arg4 += local95;
						arg5 += local117;
						arg11 += local153;
						arg8 += local173;
						arg2 += this.anInt7044;
					}
					while (--arg1 >= 0.0F) {
						this.method6016(this.anIntArray444, this.aFloatArray58, (int) arg2, (int) arg3, (int) arg4, arg11, local143, arg8, local163);
						arg4 += local95;
						arg3 += local106;
						arg11 += local153;
						arg8 += local173;
						arg2 += this.anInt7044;
					}
				}
			} else {
				arg3 = arg5;
				if (arg2 < 0.0F) {
					arg3 = arg5 - local95 * arg2;
					arg5 -= local117 * arg2;
					arg11 -= local153 * arg2;
					arg8 -= local173 * arg2;
					arg2 = 0.0F;
				}
				if (arg1 < 0.0F) {
					arg4 -= local106 * arg1;
					arg1 = 0.0F;
				}
				if (local95 < local117) {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = this.anIntArray445[(int) arg2];
					while (--arg1 >= 0.0F) {
						this.method6016(this.anIntArray444, this.aFloatArray58, (int) arg2, (int) arg3, (int) arg5, arg11, local143, arg8, local163);
						arg3 += local95;
						arg5 += local117;
						arg11 += local153;
						arg8 += local173;
						arg2 += this.anInt7044;
					}
					while (--arg0 >= 0.0F) {
						this.method6016(this.anIntArray444, this.aFloatArray58, (int) arg2, (int) arg4, (int) arg5, arg11, local143, arg8, local163);
						arg4 += local106;
						arg5 += local117;
						arg11 += local153;
						arg8 += local173;
						arg2 += this.anInt7044;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = this.anIntArray445[(int) arg2];
					while (--arg1 >= 0.0F) {
						this.method6016(this.anIntArray444, this.aFloatArray58, (int) arg2, (int) arg5, (int) arg3, arg11, local143, arg8, local163);
						arg3 += local95;
						arg5 += local117;
						arg11 += local153;
						arg8 += local173;
						arg2 += this.anInt7044;
					}
					while (--arg0 >= 0.0F) {
						this.method6016(this.anIntArray444, this.aFloatArray58, (int) arg2, (int) arg5, (int) arg4, arg11, local143, arg8, local163);
						arg4 += local106;
						arg5 += local117;
						arg11 += local153;
						arg8 += local173;
						arg2 += this.anInt7044;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(Z)V")
	public void method6020(@OriginalArg(0) boolean arg0) {
		this.aBoolean512 = arg0;
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(FFFFFFFFFFFFFFFIIIIIIII)V")
	public void method6021(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) float arg11, @OriginalArg(12) float arg12, @OriginalArg(13) float arg13, @OriginalArg(14) float arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19, @OriginalArg(20) int arg20, @OriginalArg(21) int arg21, @OriginalArg(22) int arg22) {
		if (arg22 != this.anInt7056) {
			this.anIntArray448 = this.aClass20_Sub1_10.method573(arg22);
			if (this.anIntArray448 == null) {
				this.method6024((float) arg0, (float) arg1, (float) arg2, (float) arg3, (float) arg4, (float) arg5, (float) arg6, (float) arg7, (float) arg8, Static191.method3918(arg15, arg18 | arg19 << 24), Static191.method3918(arg16, arg18 | arg20 << 24), Static191.method3918(arg17, arg18 | arg21 << 24));
				return;
			}
			this.anInt7053 = this.aClass20_Sub1_10.method581(arg22) ? 64 : this.aClass20_Sub1_10.anInt378;
			this.anInt7051 = this.anInt7053 - 1;
			this.anInt7046 = this.aClass20_Sub1_10.method580(arg22);
			this.aBoolean514 = this.aClass20_Sub1_10.method568(arg22);
		}
		this.anInt7055 = arg18;
		@Pc(106) float local106 = (float) (arg15 >> 24 & 0xFF);
		@Pc(113) float local113 = (float) (arg16 >> 24 & 0xFF);
		@Pc(120) float local120 = (float) (arg17 >> 24 & 0xFF);
		@Pc(127) float local127 = (float) (arg15 >> 16 & 0xFF);
		@Pc(134) float local134 = (float) (arg16 >> 16 & 0xFF);
		@Pc(141) float local141 = (float) (arg17 >> 16 & 0xFF);
		@Pc(148) float local148 = (float) (arg15 >> 8 & 0xFF);
		@Pc(155) float local155 = (float) (arg16 >> 8 & 0xFF);
		@Pc(162) float local162 = (float) (arg17 >> 8 & 0xFF);
		@Pc(167) float local167 = (float) (arg15 & 0xFF);
		@Pc(172) float local172 = (float) (arg16 & 0xFF);
		@Pc(177) float local177 = (float) (arg17 & 0xFF);
		arg9 /= arg6;
		arg10 /= arg7;
		arg11 /= arg8;
		arg12 /= arg6;
		arg13 /= arg7;
		arg14 /= arg8;
		arg6 = 1.0F / arg6;
		arg7 = 1.0F / arg7;
		arg8 = 1.0F / arg8;
		@Pc(215) float local215 = 0.0F;
		@Pc(217) float local217 = 0.0F;
		@Pc(219) float local219 = 0.0F;
		@Pc(221) float local221 = 0.0F;
		@Pc(223) float local223 = 0.0F;
		@Pc(225) float local225 = 0.0F;
		@Pc(227) float local227 = 0.0F;
		@Pc(229) float local229 = 0.0F;
		@Pc(231) float local231 = 0.0F;
		@Pc(239) float local239;
		if (arg1 != arg0) {
			local239 = arg1 - arg0;
			local215 = (arg4 - arg3) / local239;
			local217 = (arg7 - arg6) / local239;
			local219 = (arg10 - arg9) / local239;
			local221 = (arg13 - arg12) / local239;
			local223 = (float) (arg20 - arg19) / local239;
			local225 = (local113 - local106) / local239;
			local227 = (local134 - local127) / local239;
			local229 = (local155 - local148) / local239;
			local231 = (local172 - local167) / local239;
		}
		local239 = 0.0F;
		@Pc(298) float local298 = 0.0F;
		@Pc(300) float local300 = 0.0F;
		@Pc(302) float local302 = 0.0F;
		@Pc(304) float local304 = 0.0F;
		@Pc(306) float local306 = 0.0F;
		@Pc(308) float local308 = 0.0F;
		@Pc(310) float local310 = 0.0F;
		@Pc(312) float local312 = 0.0F;
		@Pc(320) float local320;
		if (arg2 != arg1) {
			local320 = arg2 - arg1;
			local239 = (arg5 - arg4) / local320;
			local298 = (arg8 - arg7) / local320;
			local300 = (arg11 - arg10) / local320;
			local302 = (arg14 - arg13) / local320;
			local304 = (float) (arg21 - arg20) / local320;
			local306 = (local120 - local113) / local320;
			local308 = (local141 - local134) / local320;
			local310 = (local162 - local155) / local320;
			local312 = (local177 - local172) / local320;
		}
		local320 = 0.0F;
		@Pc(379) float local379 = 0.0F;
		@Pc(381) float local381 = 0.0F;
		@Pc(383) float local383 = 0.0F;
		@Pc(385) float local385 = 0.0F;
		@Pc(387) float local387 = 0.0F;
		@Pc(389) float local389 = 0.0F;
		@Pc(391) float local391 = 0.0F;
		@Pc(393) float local393 = 0.0F;
		if (arg0 != arg2) {
			@Pc(401) float local401 = arg0 - arg2;
			local320 = (arg3 - arg5) / local401;
			local379 = (arg6 - arg8) / local401;
			local381 = (arg9 - arg11) / local401;
			local383 = (arg12 - arg14) / local401;
			local385 = (float) (arg19 - arg21) / local401;
			local387 = (local106 - local120) / local401;
			local389 = (local127 - local141) / local401;
			local391 = (local148 - local162) / local401;
			local393 = (local167 - local177) / local401;
		}
		if (arg0 <= arg1 && arg0 <= arg2) {
			if (!(arg0 >= (float) this.anInt7042)) {
				if (arg1 > (float) this.anInt7042) {
					arg1 = this.anInt7042;
				}
				if (arg2 > (float) this.anInt7042) {
					arg2 = this.anInt7042;
				}
				if (arg1 < arg2) {
					arg5 = arg3;
					arg8 = arg6;
					arg11 = arg9;
					arg14 = arg12;
					arg21 = arg19;
					local120 = local106;
					local141 = local127;
					local162 = local148;
					local177 = local167;
					if (arg0 < 0.0F) {
						arg3 -= local215 * arg0;
						arg5 -= local320 * arg0;
						arg6 -= local217 * arg0;
						arg8 -= local379 * arg0;
						arg9 -= local219 * arg0;
						arg11 -= local381 * arg0;
						arg12 -= local221 * arg0;
						arg14 -= local383 * arg0;
						arg19 = (int) ((float) arg19 - local223 * arg0);
						arg21 = (int) ((float) arg21 - local385 * arg0);
						local106 -= local225 * arg0;
						local120 -= local387 * arg0;
						local127 -= local225 * arg0;
						local141 -= local387 * arg0;
						local148 -= local225 * arg0;
						local162 -= local387 * arg0;
						local167 -= local225 * arg0;
						local177 -= local387 * arg0;
						arg0 = 0.0F;
					}
					if (arg1 < 0.0F) {
						arg4 -= local239 * arg1;
						arg7 -= local298 * arg1;
						arg10 -= local300 * arg1;
						arg13 -= local302 * arg1;
						arg20 = (int) ((float) arg20 - local304 * arg1);
						local113 -= local306 * arg1;
						local134 -= local308 * arg1;
						local155 -= local310 * arg1;
						local172 -= local312 * arg1;
						arg1 = 0.0F;
					}
					if (arg0 != arg1 && local320 < local215 || arg0 == arg1 && local320 > local239) {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = this.anIntArray445[(int) arg0];
						while (--arg1 >= 0.0F) {
							this.method6013(this.anIntArray444, this.anIntArray448, (int) arg0, (int) arg5, (int) arg3, arg8, arg6, arg11, arg9, arg14, arg12, (float) arg21, (float) arg19, local120, local106, local141, local127, local162, local148, local177, local167);
							arg3 += local215;
							arg5 += local320;
							arg6 += local217;
							arg8 += local379;
							arg9 += local219;
							arg11 += local381;
							arg12 += local221;
							arg14 += local383;
							arg19 = (int) ((float) arg19 + local223);
							arg21 = (int) ((float) arg21 + local385);
							local106 += local225;
							local120 += local387;
							local127 += local227;
							local141 += local389;
							local148 += local229;
							local162 += local391;
							local167 += local231;
							local177 += local393;
							arg0 += this.anInt7044;
						}
						while (--arg2 >= 0.0F) {
							this.method6013(this.anIntArray444, this.anIntArray448, (int) arg0, (int) arg5, (int) arg4, arg8, arg7, arg11, arg10, arg14, arg13, (float) arg21, (float) arg20, local120, local113, local141, local134, local162, local155, local177, local172);
							arg4 += local239;
							arg5 += local320;
							arg7 += local298;
							arg8 += local379;
							arg10 += local300;
							arg11 += local381;
							arg13 += local302;
							arg14 += local383;
							arg20 = (int) ((float) arg20 + local304);
							arg21 = (int) ((float) arg21 + local385);
							local113 += local306;
							local120 += local387;
							local134 += local308;
							local141 += local389;
							local155 += local310;
							local162 += local391;
							local172 += local312;
							local177 += local393;
							arg0 += this.anInt7044;
						}
					} else {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = this.anIntArray445[(int) arg0];
						while (--arg1 >= 0.0F) {
							this.method6013(this.anIntArray444, this.anIntArray448, (int) arg0, (int) arg3, (int) arg5, arg6, arg8, arg9, arg11, arg12, arg14, (float) arg19, (float) arg21, local106, local120, local127, local141, local148, local162, local167, local177);
							arg3 += local215;
							arg5 += local320;
							arg6 += local217;
							arg8 += local379;
							arg9 += local219;
							arg11 += local381;
							arg12 += local221;
							arg14 += local383;
							arg19 = (int) ((float) arg19 + local223);
							arg21 = (int) ((float) arg21 + local385);
							local106 += local225;
							local120 += local387;
							local127 += local227;
							local141 += local389;
							local148 += local229;
							local162 += local391;
							local167 += local231;
							local177 += local393;
							arg0 += this.anInt7044;
						}
						while (--arg2 >= 0.0F) {
							this.method6013(this.anIntArray444, this.anIntArray448, (int) arg0, (int) arg4, (int) arg5, arg7, arg8, arg10, arg11, arg13, arg14, (float) arg20, (float) arg21, local113, local120, local134, local141, local155, local162, local172, local177);
							arg4 += local239;
							arg5 += local320;
							arg7 += local298;
							arg8 += local379;
							arg10 += local300;
							arg11 += local381;
							arg13 += local302;
							arg14 += local383;
							arg20 = (int) ((float) arg20 + local304);
							arg21 = (int) ((float) arg21 + local385);
							local113 += local306;
							local120 += local387;
							local134 += local308;
							local141 += local389;
							local155 += local310;
							local162 += local391;
							local172 += local312;
							local177 += local393;
							arg0 += this.anInt7044;
						}
					}
				} else {
					arg4 = arg3;
					arg7 = arg6;
					arg10 = arg9;
					arg13 = arg12;
					arg20 = arg19;
					local113 = local106;
					local134 = local127;
					local155 = local148;
					local172 = local167;
					if (arg0 < 0.0F) {
						arg3 -= local215 * arg0;
						arg4 -= local320 * arg0;
						arg6 -= local217 * arg0;
						arg7 -= local379 * arg0;
						arg9 -= local219 * arg0;
						arg10 -= local381 * arg0;
						arg12 -= local221 * arg0;
						arg13 -= local383 * arg0;
						arg19 = (int) ((float) arg19 - local223 * arg0);
						arg20 = (int) ((float) arg20 - local385 * arg0);
						local106 -= local225 * arg0;
						local113 -= local387 * arg0;
						local127 -= local225 * arg0;
						local134 -= local387 * arg0;
						local148 -= local225 * arg0;
						local155 -= local387 * arg0;
						local167 -= local225 * arg0;
						local172 -= local387 * arg0;
						arg0 = 0.0F;
					}
					if (arg2 < 0.0F) {
						arg5 -= local239 * arg2;
						arg8 -= local298 * arg2;
						arg11 -= local300 * arg2;
						arg14 -= local302 * arg2;
						arg21 = (int) ((float) arg21 - local304 * arg2);
						local120 -= local306 * arg2;
						local141 -= local308 * arg2;
						local162 -= local310 * arg2;
						local177 -= local312 * arg2;
						arg2 = 0.0F;
					}
					if (arg0 != arg2 && local320 < local215 || arg0 == arg2 && local239 > local215) {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = this.anIntArray445[(int) arg0];
						while (--arg2 >= 0.0F) {
							this.method6013(this.anIntArray444, this.anIntArray448, (int) arg0, (int) arg4, (int) arg3, arg7, arg6, arg10, arg9, arg13, arg12, (float) arg20, (float) arg19, local113, local106, local134, local127, local155, local148, local172, local167);
							arg3 += local215;
							arg4 += local320;
							arg6 += local217;
							arg7 += local379;
							arg9 += local219;
							arg10 += local381;
							arg12 += local221;
							arg13 += local383;
							arg19 = (int) ((float) arg19 + local223);
							arg20 = (int) ((float) arg20 + local385);
							local106 += local225;
							local113 += local387;
							local127 += local227;
							local134 += local389;
							local148 += local229;
							local155 += local391;
							local167 += local231;
							local172 += local393;
							arg0 += this.anInt7044;
						}
						while (--arg1 >= 0.0F) {
							this.method6013(this.anIntArray444, this.anIntArray448, (int) arg0, (int) arg5, (int) arg3, arg8, arg6, arg11, arg9, arg14, arg12, (float) arg21, (float) arg19, local120, local106, local141, local127, local162, local148, local177, local167);
							arg5 += local239;
							arg3 += local215;
							arg8 += local298;
							arg6 += local217;
							arg11 += local300;
							arg9 += local219;
							arg14 += local302;
							arg12 += local221;
							arg21 = (int) ((float) arg21 + local304);
							arg19 = (int) ((float) arg19 + local223);
							local120 += local306;
							local106 += local225;
							local141 += local308;
							local127 += local227;
							local162 += local310;
							local148 += local229;
							local177 += local312;
							local167 += local231;
							arg0 += this.anInt7044;
						}
					} else {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = this.anIntArray445[(int) arg0];
						while (--arg2 >= 0.0F) {
							this.method6013(this.anIntArray444, this.anIntArray448, (int) arg0, (int) arg3, (int) arg4, arg6, arg7, arg9, arg10, arg12, arg13, (float) arg19, (float) arg20, local106, local113, local127, local134, local148, local155, local167, local172);
							arg4 += local320;
							arg3 += local215;
							arg7 += local379;
							arg6 += local217;
							arg10 += local381;
							arg9 += local219;
							arg13 += local383;
							arg12 += local221;
							arg20 = (int) ((float) arg20 + local385);
							arg19 = (int) ((float) arg19 + local223);
							local113 += local387;
							local106 += local225;
							local134 += local389;
							local127 += local227;
							local155 += local391;
							local148 += local229;
							local172 += local393;
							local167 += local231;
							arg0 += this.anInt7044;
						}
						while (--arg1 >= 0.0F) {
							this.method6013(this.anIntArray444, this.anIntArray448, (int) arg0, (int) arg3, (int) arg5, arg6, arg8, arg9, arg11, arg12, arg14, (float) arg19, (float) arg21, local106, local120, local127, local141, local148, local162, local167, local177);
							arg3 += local215;
							arg5 += local239;
							arg6 += local217;
							arg8 += local298;
							arg9 += local219;
							arg11 += local300;
							arg12 += local221;
							arg14 += local302;
							arg19 = (int) ((float) arg19 + local223);
							arg21 = (int) ((float) arg21 + local304);
							local106 += local225;
							local120 += local306;
							local127 += local227;
							local141 += local308;
							local148 += local229;
							local162 += local310;
							local167 += local231;
							local177 += local312;
							arg0 += this.anInt7044;
						}
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (!(arg1 >= (float) this.anInt7042)) {
				if (arg2 > (float) this.anInt7042) {
					arg2 = this.anInt7042;
				}
				if (arg0 > (float) this.anInt7042) {
					arg0 = this.anInt7042;
				}
				if (arg2 < arg0) {
					arg3 = arg4;
					arg6 = arg7;
					arg9 = arg10;
					arg12 = arg13;
					arg19 = arg20;
					local106 = local113;
					local127 = local134;
					local148 = local155;
					local167 = local172;
					if (arg1 < 0.0F) {
						arg3 = arg4 - local215 * arg1;
						arg4 -= local239 * arg1;
						arg6 = arg7 - local217 * arg1;
						arg7 -= local298 * arg1;
						arg9 = arg10 - local219 * arg1;
						arg10 -= local300 * arg1;
						arg12 = arg13 - local221 * arg1;
						arg13 -= local302 * arg1;
						arg19 = (int) ((float) arg20 - local223 * arg1);
						arg20 = (int) ((float) arg20 - local304 * arg1);
						local106 = local113 - local225 * arg1;
						local113 -= local306 * arg1;
						local127 = local134 - local227 * arg1;
						local134 -= local308 * arg1;
						local148 = local155 - local229 * arg1;
						local155 -= local310 * arg1;
						local167 = local172 - local231 * arg1;
						local172 -= local312 * arg1;
						arg1 = 0.0F;
					}
					if (arg2 < 0.0F) {
						arg5 -= local320 * arg2;
						arg8 -= local379 * arg2;
						arg11 -= local381 * arg2;
						arg14 -= local383 * arg2;
						arg21 = (int) ((float) arg21 - local385 * arg2);
						local120 -= local387 * arg2;
						local141 -= local389 * arg2;
						local162 -= local391 * arg2;
						local177 -= local393 * arg2;
						arg2 = 0.0F;
					}
					if ((arg1 == arg2 || !(local215 < local239)) && (arg1 != arg2 || !(local215 > local320))) {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = this.anIntArray445[(int) arg1];
						while (--arg2 >= 0.0F) {
							this.method6013(this.anIntArray444, this.anIntArray448, (int) arg1, (int) arg4, (int) arg3, arg7, arg6, arg10, arg9, arg13, arg12, (float) arg20, (float) arg19, local113, local106, local134, local127, local155, local148, local172, local167);
							arg4 += local239;
							arg3 += local215;
							arg7 += local298;
							arg6 += local217;
							arg10 += local300;
							arg9 += local219;
							arg13 += local302;
							arg12 += local221;
							arg20 = (int) ((float) arg20 + local304);
							arg19 = (int) ((float) arg19 + local223);
							local113 += local306;
							local106 += local225;
							local134 += local308;
							local127 += local227;
							local155 += local310;
							local148 += local229;
							local172 += local312;
							local167 += local231;
							arg1 += this.anInt7044;
						}
						while (--arg0 >= 0.0F) {
							this.method6013(this.anIntArray444, this.anIntArray448, (int) arg1, (int) arg5, (int) arg3, arg8, arg6, arg11, arg9, arg14, arg12, (float) arg21, (float) arg19, local120, local106, local141, local127, local162, local148, local177, local167);
							arg5 += local320;
							arg3 += local215;
							arg8 += local379;
							arg6 += local217;
							arg11 += local381;
							arg9 += local219;
							arg14 += local383;
							arg12 += local221;
							arg21 = (int) ((float) arg21 + local385);
							arg19 = (int) ((float) arg19 + local223);
							local120 += local387;
							local106 += local225;
							local141 += local389;
							local127 += local227;
							local162 += local391;
							local148 += local229;
							local177 += local393;
							local167 += local231;
							arg1 += this.anInt7044;
						}
					} else {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = this.anIntArray445[(int) arg1];
						while (--arg2 >= 0.0F) {
							this.method6013(this.anIntArray444, this.anIntArray448, (int) arg1, (int) arg3, (int) arg4, arg6, arg7, arg9, arg10, arg12, arg13, (float) arg19, (float) arg20, local106, local113, local127, local134, local148, local155, local167, local172);
							arg3 += local215;
							arg4 += local239;
							arg6 += local217;
							arg7 += local298;
							arg9 += local219;
							arg10 += local300;
							arg12 += local221;
							arg13 += local302;
							arg19 = (int) ((float) arg19 + local223);
							arg20 = (int) ((float) arg20 + local304);
							local106 += local225;
							local113 += local306;
							local127 += local227;
							local134 += local308;
							local148 += local229;
							local155 += local310;
							local167 += local231;
							local172 += local312;
							arg1 += this.anInt7044;
						}
						while (--arg0 >= 0.0F) {
							this.method6013(this.anIntArray444, this.anIntArray448, (int) arg1, (int) arg3, (int) arg5, arg6, arg8, arg9, arg11, arg12, arg14, (float) arg19, (float) arg21, local106, local120, local127, local141, local148, local162, local167, local177);
							arg3 += local215;
							arg5 += local320;
							arg6 += local217;
							arg8 += local379;
							arg9 += local219;
							arg11 += local381;
							arg12 += local221;
							arg14 += local383;
							arg19 = (int) ((float) arg19 + local223);
							arg21 = (int) ((float) arg21 + local385);
							local106 += local225;
							local120 += local387;
							local127 += local227;
							local141 += local389;
							local148 += local229;
							local162 += local391;
							local167 += local231;
							local177 += local393;
							arg1 += this.anInt7044;
						}
					}
				} else {
					arg5 = arg4;
					arg8 = arg7;
					arg11 = arg10;
					arg14 = arg13;
					arg21 = arg20;
					local120 = local113;
					local141 = local134;
					local162 = local155;
					local177 = local172;
					if (arg1 < 0.0F) {
						arg5 = arg4 - local215 * arg1;
						arg4 -= local239 * arg1;
						arg8 = arg7 - local217 * arg1;
						arg7 -= local298 * arg1;
						arg11 = arg10 - local219 * arg1;
						arg10 -= local300 * arg1;
						arg14 = arg13 - local221 * arg1;
						arg13 -= local302 * arg1;
						arg21 = (int) ((float) arg20 - local223 * arg1);
						arg20 = (int) ((float) arg20 - local304 * arg1);
						local120 = local113 - local225 * arg1;
						local113 -= local306 * arg1;
						local141 = local134 - local227 * arg1;
						local134 -= local308 * arg1;
						local162 = local155 - local229 * arg1;
						local155 -= local310 * arg1;
						local177 = local172 - local231 * arg1;
						local172 -= local312 * arg1;
						arg1 = 0.0F;
					}
					if (arg0 < 0.0F) {
						arg3 -= local320 * arg0;
						arg6 -= local379 * arg0;
						arg9 -= local381 * arg0;
						arg12 -= local383 * arg0;
						arg19 = (int) ((float) arg19 - local385 * arg0);
						local106 -= local387 * arg0;
						local127 -= local389 * arg0;
						local148 -= local391 * arg0;
						local167 -= local393 * arg0;
						arg0 = 0.0F;
					}
					arg2 -= arg0;
					arg0 -= arg1;
					arg1 = this.anIntArray445[(int) arg1];
					if (local215 < local239) {
						while (--arg0 >= 0.0F) {
							this.method6013(this.anIntArray444, this.anIntArray448, (int) arg1, (int) arg5, (int) arg4, arg8, arg7, arg11, arg10, arg14, arg13, (float) arg21, (float) arg20, local120, local113, local141, local134, local162, local155, local177, local172);
							arg5 += local215;
							arg4 += local239;
							arg8 += local217;
							arg7 += local298;
							arg11 += local219;
							arg10 += local300;
							arg14 += local221;
							arg13 += local302;
							arg21 = (int) ((float) arg21 + local223);
							arg20 = (int) ((float) arg20 + local304);
							local120 += local225;
							local113 += local306;
							local141 += local227;
							local134 += local308;
							local162 += local229;
							local155 += local310;
							local177 += local231;
							local172 += local312;
							arg1 += this.anInt7044;
						}
						while (--arg2 >= 0.0F) {
							this.method6013(this.anIntArray444, this.anIntArray448, (int) arg1, (int) arg3, (int) arg4, arg6, arg7, arg9, arg10, arg12, arg13, (float) arg19, (float) arg20, local106, local113, local127, local134, local148, local155, local167, local172);
							arg3 += local320;
							arg4 += local239;
							arg6 += local379;
							arg7 += local298;
							arg9 += local381;
							arg10 += local300;
							arg12 += local383;
							arg13 += local302;
							arg19 = (int) ((float) arg19 + local385);
							arg20 = (int) ((float) arg20 + local304);
							local106 += local387;
							local113 += local306;
							local127 += local389;
							local134 += local308;
							local148 += local391;
							local155 += local310;
							local167 += local393;
							local172 += local312;
							arg1 += this.anInt7044;
						}
					} else {
						while (--arg0 >= 0.0F) {
							this.method6013(this.anIntArray444, this.anIntArray448, (int) arg1, (int) arg4, (int) arg5, arg7, arg8, arg10, arg11, arg13, arg14, (float) arg20, (float) arg21, local113, local120, local134, local141, local155, local162, local172, local177);
							arg4 += local239;
							arg5 += local215;
							arg7 += local298;
							arg8 += local217;
							arg10 += local300;
							arg11 += local219;
							arg13 += local302;
							arg14 += local221;
							arg20 = (int) ((float) arg20 + local304);
							arg21 = (int) ((float) arg21 + local223);
							local113 += local306;
							local120 += local225;
							local134 += local308;
							local141 += local227;
							local155 += local310;
							local162 += local229;
							local172 += local312;
							local177 += local231;
							arg1 += this.anInt7044;
						}
						while (--arg2 >= 0.0F) {
							this.method6013(this.anIntArray444, this.anIntArray448, (int) arg1, (int) arg4, (int) arg3, arg7, arg6, arg10, arg9, arg13, arg12, (float) arg20, (float) arg19, local113, local106, local134, local127, local155, local148, local172, local167);
							arg4 += local239;
							arg3 += local320;
							arg7 += local298;
							arg6 += local379;
							arg10 += local300;
							arg9 += local381;
							arg13 += local302;
							arg12 += local383;
							arg20 = (int) ((float) arg20 + local304);
							arg19 = (int) ((float) arg19 + local385);
							local113 += local306;
							local106 += local387;
							local134 += local308;
							local127 += local389;
							local155 += local310;
							local148 += local391;
							local172 += local312;
							local167 += local393;
							arg1 += this.anInt7044;
						}
					}
				}
			}
		} else if (!(arg2 >= (float) this.anInt7042)) {
			if (arg0 > (float) this.anInt7042) {
				arg0 = this.anInt7042;
			}
			if (arg1 > (float) this.anInt7042) {
				arg1 = this.anInt7042;
			}
			if (arg0 < arg1) {
				arg4 = arg5;
				arg7 = arg8;
				arg10 = arg11;
				arg13 = arg14;
				arg20 = arg21;
				local113 = local120;
				local134 = local141;
				local155 = local162;
				local172 = local177;
				if (arg2 < 0.0F) {
					arg5 -= local320 * arg2;
					arg4 -= local239 * arg2;
					arg8 -= local379 * arg2;
					arg7 -= local298 * arg2;
					arg11 -= local381 * arg2;
					arg10 -= local300 * arg2;
					arg14 -= local383 * arg2;
					arg13 -= local302 * arg2;
					arg21 = (int) ((float) arg21 - local385 * 3.0F);
					arg20 = (int) ((float) arg20 - local304 * arg2);
					local120 -= local387 * arg2;
					local113 -= local306 * arg2;
					local141 -= local389 * arg2;
					local134 -= local308 * arg2;
					local162 -= local391 * arg2;
					local155 -= local310 * arg2;
					local177 -= local393 * arg2;
					local172 -= local312 * arg2;
					arg2 = 0.0F;
				}
				if (arg0 < 0.0F) {
					arg3 -= local215 * arg0;
					arg6 -= local217 * arg0;
					arg9 -= local219 * arg0;
					arg12 -= local221 * arg0;
					arg19 = (int) ((float) arg19 - local223 * arg0);
					local106 -= local225 * arg0;
					local127 -= local227 * arg0;
					local148 -= local229 * arg0;
					local167 -= local231 * arg0;
					arg0 = 0.0F;
				}
				if (local239 < local320) {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = this.anIntArray445[(int) arg2];
					while (--arg0 >= 0.0F) {
						this.method6013(this.anIntArray444, this.anIntArray448, (int) arg2, (int) arg4, (int) arg5, arg7, arg8, arg10, arg11, arg13, arg14, (float) arg20, (float) arg21, local113, local120, local134, local141, local155, local162, local172, local177);
						arg4 += local239;
						arg5 += local320;
						arg7 += local298;
						arg8 += local379;
						arg10 += local300;
						arg11 += local381;
						arg13 += local302;
						arg14 += local383;
						arg20 = (int) ((float) arg20 + local304);
						arg21 = (int) ((float) arg21 + local385);
						local113 += local306;
						local120 += local387;
						local134 += local308;
						local141 += local389;
						local155 += local310;
						local162 += local391;
						local172 += local312;
						local177 += local393;
						arg2 += this.anInt7044;
					}
					while (--arg1 >= 0.0F) {
						this.method6013(this.anIntArray444, this.anIntArray448, (int) arg2, (int) arg4, (int) arg3, arg7, arg6, arg10, arg9, arg13, arg12, (float) arg20, (float) arg19, local113, local106, local134, local127, local155, local148, local172, local167);
						arg4 += local239;
						arg3 += local215;
						arg7 += local298;
						arg6 += local217;
						arg10 += local300;
						arg9 += local219;
						arg13 += local302;
						arg12 += local221;
						arg20 = (int) ((float) arg20 + local304);
						arg19 = (int) ((float) arg19 + local223);
						local113 += local306;
						local106 += local225;
						local134 += local308;
						local127 += local227;
						local155 += local310;
						local148 += local229;
						local172 += local312;
						local167 += local231;
						arg2 += this.anInt7044;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = this.anIntArray445[(int) arg2];
					while (--arg0 >= 0.0F) {
						this.method6013(this.anIntArray444, this.anIntArray448, (int) arg2, (int) arg5, (int) arg4, arg8, arg7, arg11, arg10, arg14, arg13, (float) arg21, (float) arg20, local120, local113, local141, local134, local162, local155, local177, local172);
						arg5 += local320;
						arg4 += local239;
						arg8 += local379;
						arg7 += local298;
						arg11 += local381;
						arg10 += local300;
						arg14 += local383;
						arg13 += local302;
						arg21 = (int) ((float) arg21 + local385);
						arg20 = (int) ((float) arg20 + local304);
						local120 += local387;
						local113 += local306;
						local141 += local389;
						local134 += local308;
						local162 += local391;
						local155 += local310;
						local177 += local393;
						local172 += local312;
						arg2 += this.anInt7044;
					}
					while (--arg1 >= 0.0F) {
						this.method6013(this.anIntArray444, this.anIntArray448, (int) arg2, (int) arg3, (int) arg4, arg6, arg7, arg9, arg10, arg12, arg13, (float) arg19, (float) arg20, local106, local113, local127, local134, local148, local155, local167, local172);
						arg3 += local215;
						arg4 += local239;
						arg6 += local217;
						arg7 += local298;
						arg9 += local219;
						arg10 += local300;
						arg12 += local221;
						arg13 += local302;
						arg19 = (int) ((float) arg19 + local223);
						arg20 = (int) ((float) arg20 + local304);
						local106 += local225;
						local113 += local306;
						local127 += local227;
						local134 += local308;
						local148 += local229;
						local155 += local310;
						local167 += local231;
						local172 += local312;
						arg2 += this.anInt7044;
					}
				}
			} else {
				arg3 = arg5;
				arg6 = arg8;
				arg9 = arg11;
				arg12 = arg14;
				arg19 = arg21;
				local106 = local120;
				local127 = local141;
				local148 = local162;
				local167 = local177;
				if (arg2 < 0.0F) {
					arg5 -= local320 * arg2;
					arg3 -= local239 * arg2;
					arg8 -= local379 * arg2;
					arg6 -= local298 * arg2;
					arg11 -= local381 * arg2;
					arg9 -= local300 * arg2;
					arg14 -= local383 * arg2;
					arg12 -= local302 * arg2;
					arg21 = (int) ((float) arg21 - local385 * 3.0F);
					arg19 = (int) ((float) arg19 - local304 * arg2);
					local120 -= local387 * arg2;
					local106 -= local306 * arg2;
					local141 -= local389 * arg2;
					local127 -= local308 * arg2;
					local162 -= local391 * arg2;
					local148 -= local310 * arg2;
					local177 -= local393 * arg2;
					local167 -= local312 * arg2;
					arg2 = 0.0F;
				}
				if (arg1 < 0.0F) {
					arg4 -= local215 * arg1;
					arg7 -= local217 * arg1;
					arg10 -= local219 * arg1;
					arg13 -= local221 * arg1;
					arg20 = (int) ((float) arg20 - local223 * arg1);
					local113 -= local225 * arg1;
					local134 -= local227 * arg1;
					local155 -= local229 * arg1;
					local172 -= local231 * arg1;
					arg1 = 0.0F;
				}
				if (local239 < local320) {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = this.anIntArray445[(int) arg2];
					while (--arg1 >= 0.0F) {
						this.method6013(this.anIntArray444, this.anIntArray448, (int) arg2, (int) arg3, (int) arg5, arg6, arg8, arg9, arg11, arg12, arg14, (float) arg19, (float) arg21, local106, local120, local127, local141, local148, local162, local167, local177);
						arg3 += local239;
						arg5 += local320;
						arg6 += local298;
						arg8 += local379;
						arg9 += local300;
						arg11 += local381;
						arg12 += local302;
						arg14 += local383;
						arg19 = (int) ((float) arg19 + local304);
						arg21 = (int) ((float) arg21 + local385);
						local106 += local306;
						local120 += local387;
						local127 += local308;
						local141 += local389;
						local148 += local310;
						local162 += local391;
						local167 += local312;
						local177 += local393;
						arg2 += this.anInt7044;
					}
					while (--arg0 >= 0.0F) {
						this.method6013(this.anIntArray444, this.anIntArray448, (int) arg2, (int) arg4, (int) arg5, arg7, arg8, arg10, arg11, arg13, arg14, (float) arg20, (float) arg21, local113, local120, local134, local141, local155, local162, local172, local177);
						arg4 += local215;
						arg5 += local320;
						arg7 += local217;
						arg8 += local379;
						arg10 += local219;
						arg11 += local381;
						arg13 += local221;
						arg14 += local383;
						arg20 = (int) ((float) arg20 + local223);
						arg21 = (int) ((float) arg21 + local385);
						local113 += local225;
						local120 += local387;
						local134 += local227;
						local141 += local389;
						local155 += local229;
						local162 += local391;
						local172 += local231;
						local177 += local393;
						arg2 += this.anInt7044;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = this.anIntArray445[(int) arg2];
					while (--arg1 >= 0.0F) {
						this.method6013(this.anIntArray444, this.anIntArray448, (int) arg2, (int) arg5, (int) arg3, arg8, arg6, arg11, arg9, arg14, arg12, (float) arg21, (float) arg19, local120, local106, local141, local127, local162, local148, local177, local167);
						arg5 += local320;
						arg3 += local239;
						arg8 += local379;
						arg6 += local298;
						arg11 += local381;
						arg9 += local300;
						arg14 += local383;
						arg12 += local302;
						arg21 = (int) ((float) arg21 + local385);
						arg19 = (int) ((float) arg19 + local304);
						local120 += local387;
						local106 += local306;
						local141 += local389;
						local127 += local308;
						local162 += local391;
						local148 += local310;
						local177 += local393;
						local167 += local312;
						arg2 += this.anInt7044;
					}
					while (--arg0 >= 0.0F) {
						this.method6013(this.anIntArray444, this.anIntArray448, (int) arg2, (int) arg5, (int) arg4, arg8, arg7, arg11, arg10, arg14, arg13, (float) arg21, (float) arg20, local120, local113, local141, local134, local162, local155, local177, local172);
						arg5 += local320;
						arg4 += local215;
						arg8 += local379;
						arg7 += local217;
						arg11 += local381;
						arg10 += local219;
						arg14 += local383;
						arg13 += local221;
						arg21 = (int) ((float) arg21 + local385);
						arg20 = (int) ((float) arg20 + local223);
						local120 += local387;
						local113 += local225;
						local141 += local389;
						local134 += local227;
						local162 += local391;
						local155 += local229;
						local177 += local393;
						local172 += local231;
						arg2 += this.anInt7044;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "([I[IIIIFFFFFFFFFFFFFFFFFFFF)V")
	private void method6022(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) float arg11, @OriginalArg(12) float arg12, @OriginalArg(13) float arg13, @OriginalArg(14) float arg14, @OriginalArg(15) float arg15, @OriginalArg(16) float arg16, @OriginalArg(17) float arg17, @OriginalArg(18) float arg18, @OriginalArg(19) float arg19, @OriginalArg(20) float arg20, @OriginalArg(21) float arg21, @OriginalArg(22) float arg22, @OriginalArg(23) float arg23, @OriginalArg(24) float arg24) {
		@Pc(3) int local3 = arg4 - arg3;
		@Pc(8) float local8 = 1.0F / (float) local3;
		@Pc(14) float local14 = (arg6 - arg5) * local8;
		@Pc(20) float local20 = (arg8 - arg7) * local8;
		@Pc(26) float local26 = (arg10 - arg9) * local8;
		@Pc(32) float local32 = (arg12 - arg11) * local8;
		@Pc(38) float local38 = (arg16 - arg15) * local8;
		@Pc(44) float local44 = (arg18 - arg17) * local8;
		@Pc(50) float local50 = (arg20 - arg19) * local8;
		@Pc(56) float local56 = (arg22 - arg21) * local8;
		@Pc(62) float local62 = (arg24 - arg23) * local8;
		if (this.aBoolean511) {
			if (arg4 > this.anInt7045) {
				arg4 = this.anInt7045;
			}
			if (arg3 < 0) {
				arg5 -= local14 * (float) arg3;
				arg7 -= local20 * (float) arg3;
				arg9 -= local26 * (float) arg3;
				arg11 -= local32 * (float) arg3;
				arg15 -= local38 * (float) arg3;
				arg17 -= local44 * (float) arg3;
				arg19 -= local50 * (float) arg3;
				arg21 -= local56 * (float) arg3;
				arg23 -= local62 * (float) arg3;
				arg3 = 0;
			}
		}
		if (arg3 >= arg4) {
			return;
		}
		local3 = arg4 - arg3;
		@Pc(151) int local151 = arg2 + arg3;
		while (local3-- > 0) {
			@Pc(156) float local156 = 1.0F / arg5;
			if (local156 < this.aFloatArray58[local151]) {
				@Pc(167) float local167 = arg7 * local156;
				@Pc(171) float local171 = arg9 * local156;
				@Pc(184) int local184 = (int) (local167 * (float) this.anInt7053 * this.aFloat158) & this.anInt7051;
				@Pc(197) int local197 = (int) (local171 * (float) this.anInt7053 * this.aFloat158) & this.anInt7051;
				@Pc(207) int local207 = this.anIntArray448[local197 * this.anInt7053 + local184];
				@Pc(220) int local220 = (int) (local167 * (float) this.anInt7052 * this.aFloat160) & this.anInt7047;
				@Pc(233) int local233 = (int) (local171 * (float) this.anInt7052 * this.aFloat160) & this.anInt7047;
				@Pc(243) int local243 = this.anIntArray446[local233 * this.anInt7052 + local220];
				@Pc(256) int local256 = (int) (local167 * (float) this.anInt7054 * this.aFloat159) & this.anInt7049;
				@Pc(269) int local269 = (int) (local171 * (float) this.anInt7054 * this.aFloat159) & this.anInt7049;
				@Pc(279) int local279 = this.anIntArray447[local269 * this.anInt7054 + local256];
				@Pc(285) float local285 = 1.0F - arg21 - arg23;
				@Pc(319) int local319 = ((int) (arg21 * (float) (local207 >> 16 & 0xFF)) | 0xFF00) << 16 | (int) (arg21 * (float) (local207 >> 8 & 0xFF)) << 8 | (int) (arg21 * (float) (local207 & 0xFF));
				@Pc(353) int local353 = ((int) (arg23 * (float) (local243 >> 16 & 0xFF)) | 0xFF00) << 16 | (int) (arg23 * (float) (local243 >> 8 & 0xFF)) << 8 | (int) (arg23 * (float) (local243 & 0xFF));
				@Pc(387) int local387 = ((int) (local285 * (float) (local279 >> 16 & 0xFF)) | 0xFF00) << 16 | (int) (local285 * (float) (local279 >> 8 & 0xFF)) << 8 | (int) (local285 * (float) (local279 & 0xFF));
				@Pc(393) int local393 = local319 + local353 + local387;
				@Pc(431) int local431 = ((int) (arg15 * (float) (local393 >> 16 & 0xFF)) & 0xFF00 | 0xFF0000) << 8 | (int) (arg17 * (float) (local393 >> 8 & 0xFF)) & 0xFF00 | (int) (arg19 * (float) (local393 & 0xFF)) >> 8;
				if (arg11 != 0.0F) {
					@Pc(440) int local440 = (int) (255.0F - arg11);
					@Pc(462) int local462 = ((this.anInt7055 & 0xFF00FF) * (int) arg11 & 0xFF00FF00 | (this.anInt7055 & 0xFF00) * (int) arg11 & 0xFF0000) >>> 8;
					local431 = (((local431 & 0xFF00FF) * local440 & 0xFF00FF00 | (local431 & 0xFF00) * local440 & 0xFF0000) >>> 8) + local462;
				}
				arg0[local151] = local431;
				this.aFloatArray58[local151] = local156;
			}
			local151++;
			arg5 += local14;
			arg7 += local20;
			arg9 += local26;
			arg11 += local32;
			arg15 += local38;
			arg17 += local44;
			arg19 += local50;
			arg21 += local56;
			arg23 += local62;
		}
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "([I[FIIIIIFF)V")
	private void method6023(@OriginalArg(0) int[] arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) float arg6, @OriginalArg(8) float arg7) {
		if (this.aBoolean511) {
			if (arg5 > this.anInt7045) {
				arg5 = this.anInt7045;
			}
			if (arg4 < 0) {
				arg4 = 0;
			}
		}
		if (arg4 >= arg5) {
			return;
		}
		arg2 += arg4 - 1;
		@Pc(29) int local29 = arg5 - arg4 >> 2;
		arg6 += arg7 * (float) arg4;
		@Pc(278) int local278;
		@Pc(283) int local283;
		@Pc(315) int local315;
		@Pc(47) int local47;
		@Pc(303) int local303;
		@Pc(63) float local63;
		if (this.aClass261_3.aBoolean573) {
			if (this.anInt7043 == 0) {
				while (true) {
					local29--;
					if (local29 < 0) {
						local29 = arg5 - arg4 & 0x3;
						while (true) {
							local29--;
							if (local29 < 0) {
								return;
							}
							arg2++;
							if (arg6 < arg1[arg2]) {
								arg0[arg2] = arg3;
								arg1[arg2] = arg6;
							}
							arg6 += arg7;
						}
					}
					local47 = arg2 + 1;
					if (arg6 < arg1[local47]) {
						arg0[local47] = arg3;
						arg1[local47] = arg6;
					}
					local63 = arg6 + arg7;
					local47++;
					if (local63 < arg1[local47]) {
						arg0[local47] = arg3;
						arg1[local47] = local63;
					}
					local63 += arg7;
					local47++;
					if (local63 < arg1[local47]) {
						arg0[local47] = arg3;
						arg1[local47] = local63;
					}
					local63 += arg7;
					arg2 = local47 + 1;
					if (local63 < arg1[arg2]) {
						arg0[arg2] = arg3;
						arg1[arg2] = local63;
					}
					arg6 = local63 + arg7;
				}
			} else if (this.anInt7043 != 254) {
				local278 = this.anInt7043;
				local283 = 256 - this.anInt7043;
				local303 = ((arg3 & 0xFF00FF) * local283 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local283 >> 8 & 0xFF00);
				while (true) {
					local29--;
					if (local29 < 0) {
						local29 = arg5 - arg4 & 0x3;
						while (true) {
							local29--;
							if (local29 < 0) {
								return;
							}
							arg2++;
							if (arg6 < arg1[arg2]) {
								local315 = arg0[arg2];
								arg0[arg2] = local303 + ((local315 & 0xFF00FF) * local278 >> 8 & 0xFF00FF) + ((local315 & 0xFF00) * local278 >> 8 & 0xFF00);
								arg1[arg2] = arg6;
							}
							arg6 += arg7;
						}
					}
					local47 = arg2 + 1;
					if (arg6 < arg1[local47]) {
						local315 = arg0[local47];
						arg0[local47] = local303 + ((local315 & 0xFF00FF) * local278 >> 8 & 0xFF00FF) + ((local315 & 0xFF00) * local278 >> 8 & 0xFF00);
						arg1[local47] = arg6;
					}
					local63 = arg6 + arg7;
					local47++;
					if (local63 < arg1[local47]) {
						local315 = arg0[local47];
						arg0[local47] = local303 + ((local315 & 0xFF00FF) * local278 >> 8 & 0xFF00FF) + ((local315 & 0xFF00) * local278 >> 8 & 0xFF00);
						arg1[local47] = local63;
					}
					local63 += arg7;
					local47++;
					if (local63 < arg1[local47]) {
						local315 = arg0[local47];
						arg0[local47] = local303 + ((local315 & 0xFF00FF) * local278 >> 8 & 0xFF00FF) + ((local315 & 0xFF00) * local278 >> 8 & 0xFF00);
						arg1[local47] = local63;
					}
					local63 += arg7;
					arg2 = local47 + 1;
					if (local63 < arg1[arg2]) {
						local315 = arg0[arg2];
						arg0[arg2] = local303 + ((local315 & 0xFF00FF) * local278 >> 8 & 0xFF00FF) + ((local315 & 0xFF00) * local278 >> 8 & 0xFF00);
						arg1[arg2] = local63;
					}
					arg6 = local63 + arg7;
				}
			} else if (arg4 != 0 && arg5 <= this.anInt7045 - 1) {
				while (true) {
					local29--;
					if (local29 < 0) {
						local29 = arg5 - arg4 & 0x3;
						while (true) {
							local29--;
							if (local29 < 0) {
								return;
							}
							arg2++;
							if (arg6 < arg1[arg2]) {
								arg0[arg2 - 1] = arg0[arg2];
							}
							arg6 += arg7;
						}
					}
					local47 = arg2 + 1;
					if (arg6 < arg1[local47]) {
						arg0[local47 - 1] = arg0[local47];
					}
					local63 = arg6 + arg7;
					local47++;
					if (local63 < arg1[local47]) {
						arg0[local47 - 1] = arg0[local47];
					}
					local63 += arg7;
					local47++;
					if (local63 < arg1[local47]) {
						arg0[local47 - 1] = arg0[local47];
					}
					local63 += arg7;
					arg2 = local47 + 1;
					if (local63 < arg1[arg2]) {
						arg0[arg2 - 1] = arg0[arg2];
					}
					arg6 = local63 + arg7;
				}
			}
		} else if (this.anInt7043 == 0) {
			while (true) {
				local29--;
				if (local29 < 0) {
					local29 = arg5 - arg4 & 0x3;
					while (true) {
						local29--;
						if (local29 < 0) {
							return;
						}
						arg2++;
						if (arg6 < arg1[arg2]) {
							arg0[arg2] = arg3;
						}
						arg6 += arg7;
					}
				}
				local47 = arg2 + 1;
				if (arg6 < arg1[local47]) {
					arg0[local47] = arg3;
				}
				local63 = arg6 + arg7;
				local47++;
				if (local63 < arg1[local47]) {
					arg0[local47] = arg3;
				}
				local63 += arg7;
				local47++;
				if (local63 < arg1[local47]) {
					arg0[local47] = arg3;
				}
				local63 += arg7;
				arg2 = local47 + 1;
				if (local63 < arg1[arg2]) {
					arg0[arg2] = arg3;
				}
				arg6 = local63 + arg7;
			}
		} else if (this.anInt7043 != 254) {
			local278 = this.anInt7043;
			local283 = 256 - this.anInt7043;
			local303 = ((arg3 & 0xFF00FF) * local283 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local283 >> 8 & 0xFF00);
			while (true) {
				local29--;
				if (local29 < 0) {
					local29 = arg5 - arg4 & 0x3;
					while (true) {
						local29--;
						if (local29 < 0) {
							return;
						}
						arg2++;
						if (arg6 < arg1[arg2]) {
							local315 = arg0[arg2];
							arg0[arg2] = local303 + ((local315 & 0xFF00FF) * local278 >> 8 & 0xFF00FF) + ((local315 & 0xFF00) * local278 >> 8 & 0xFF00);
						}
						arg6 += arg7;
					}
				}
				local47 = arg2 + 1;
				if (arg6 < arg1[local47]) {
					local315 = arg0[local47];
					arg0[local47] = local303 + ((local315 & 0xFF00FF) * local278 >> 8 & 0xFF00FF) + ((local315 & 0xFF00) * local278 >> 8 & 0xFF00);
				}
				local63 = arg6 + arg7;
				local47++;
				if (local63 < arg1[local47]) {
					local315 = arg0[local47];
					arg0[local47] = local303 + ((local315 & 0xFF00FF) * local278 >> 8 & 0xFF00FF) + ((local315 & 0xFF00) * local278 >> 8 & 0xFF00);
				}
				local63 += arg7;
				local47++;
				if (local63 < arg1[local47]) {
					local315 = arg0[local47];
					arg0[local47] = local303 + ((local315 & 0xFF00FF) * local278 >> 8 & 0xFF00FF) + ((local315 & 0xFF00) * local278 >> 8 & 0xFF00);
				}
				local63 += arg7;
				arg2 = local47 + 1;
				if (local63 < arg1[arg2]) {
					local315 = arg0[arg2];
					arg0[arg2] = local303 + ((local315 & 0xFF00FF) * local278 >> 8 & 0xFF00FF) + ((local315 & 0xFF00) * local278 >> 8 & 0xFF00);
				}
				arg6 = local63 + arg7;
			}
		} else if (arg4 != 0 && arg5 <= this.anInt7045 - 1) {
			while (true) {
				local29--;
				if (local29 < 0) {
					local29 = arg5 - arg4 & 0x3;
					while (true) {
						local29--;
						if (local29 < 0) {
							return;
						}
						arg2++;
						if (arg6 < arg1[arg2]) {
							arg0[arg2 - 1] = arg0[arg2];
						}
						arg6 += arg7;
					}
				}
				local47 = arg2 + 1;
				if (arg6 < arg1[local47]) {
					arg0[local47 - 1] = arg0[local47];
				}
				local63 = arg6 + arg7;
				local47++;
				if (local63 < arg1[local47]) {
					arg0[local47 - 1] = arg0[local47];
				}
				local63 += arg7;
				local47++;
				if (local63 < arg1[local47]) {
					arg0[local47 - 1] = arg0[local47];
				}
				local63 += arg7;
				arg2 = local47 + 1;
				if (local63 < arg1[arg2]) {
					arg0[arg2 - 1] = arg0[arg2];
				}
				arg6 = local63 + arg7;
			}
		}
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(FFFFFFFFFIII)V")
	public void method6024(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		if (this.aBoolean512) {
			this.aClass20_Sub1_10.method7248((int) arg0, (int) arg3, (int) arg4, arg9 | 0xFF000000, (int) arg1);
			this.aClass20_Sub1_10.method7248((int) arg1, (int) arg4, (int) arg5, arg9 | 0xFF000000, (int) arg2);
			this.aClass20_Sub1_10.method7248((int) arg2, (int) arg5, (int) arg3, arg9 | 0xFF000000, (int) arg0);
			return;
		}
		@Pc(52) float local52 = arg4 - arg3;
		@Pc(56) float local56 = arg1 - arg0;
		@Pc(60) float local60 = arg5 - arg3;
		@Pc(64) float local64 = arg2 - arg0;
		@Pc(68) float local68 = arg7 - arg6;
		@Pc(72) float local72 = arg8 - arg6;
		@Pc(81) float local81 = (float) ((arg10 & 0xFF0000) - (arg9 & 0xFF0000));
		@Pc(90) float local90 = (float) ((arg11 & 0xFF0000) - (arg9 & 0xFF0000));
		@Pc(99) float local99 = (float) ((arg10 & 0xFF00) - (arg9 & 0xFF00));
		@Pc(108) float local108 = (float) ((arg11 & 0xFF00) - (arg9 & 0xFF00));
		@Pc(117) float local117 = (float) ((arg10 & 0xFF) - (arg9 & 0xFF));
		@Pc(126) float local126 = (float) ((arg11 & 0xFF) - (arg9 & 0xFF));
		@Pc(138) float local138;
		if (arg2 == arg1) {
			local138 = 0.0F;
		} else {
			local138 = (arg5 - arg4) / (arg2 - arg1);
		}
		@Pc(149) float local149;
		if (arg1 == arg0) {
			local149 = 0.0F;
		} else {
			local149 = local52 / local56;
		}
		@Pc(160) float local160;
		if (arg2 == arg0) {
			local160 = 0.0F;
		} else {
			local160 = local60 / local64;
		}
		@Pc(171) float local171 = local52 * local64 - local60 * local56;
		if (local171 == 0.0F) {
			return;
		}
		@Pc(186) float local186 = (local68 * local64 - local72 * local56) / local171;
		@Pc(196) float local196 = (local72 * local52 - local68 * local60) / local171;
		@Pc(206) float local206 = (local81 * local64 - local90 * local56) / local171;
		@Pc(216) float local216 = (local90 * local52 - local81 * local60) / local171;
		@Pc(226) float local226 = (local99 * local64 - local108 * local56) / local171;
		@Pc(236) float local236 = (local108 * local52 - local99 * local60) / local171;
		@Pc(246) float local246 = (local117 * local64 - local126 * local56) / local171;
		@Pc(256) float local256 = (local126 * local52 - local117 * local60) / local171;
		@Pc(310) float local310;
		@Pc(321) float local321;
		@Pc(332) float local332;
		if (arg0 <= arg1 && arg0 <= arg2) {
			if (!(arg0 >= (float) this.anInt7042)) {
				if (arg1 > (float) this.anInt7042) {
					arg1 = this.anInt7042;
				}
				if (arg2 > (float) this.anInt7042) {
					arg2 = this.anInt7042;
				}
				arg6 = arg6 + local186 - local186 * arg3;
				local310 = (float) (arg9 & 0xFF0000) + local206 - local206 * arg3;
				local321 = (float) (arg9 & 0xFF00) + local226 - local226 * arg3;
				local332 = (float) (arg9 & 0xFF) + local246 - local246 * arg3;
				if (arg1 < arg2) {
					arg5 = arg3;
					if (arg0 < 0.0F) {
						arg5 = arg3 - local160 * arg0;
						arg3 -= local149 * arg0;
						arg6 -= local196 * arg0;
						local310 -= local216 * arg0;
						local321 -= local236 * arg0;
						local332 -= local256 * arg0;
						arg0 = 0.0F;
					}
					if (arg1 < 0.0F) {
						arg4 -= local138 * arg1;
						arg1 = 0.0F;
					}
					if ((arg0 == arg1 || !(local160 < local149)) && (arg0 != arg1 || !(local160 > local138))) {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = this.anIntArray445[(int) arg0];
						while (--arg1 >= 0.0F) {
							this.method6018(this.anIntArray444, this.aFloatArray58, (int) arg0, (int) arg3, (int) arg5, arg6, local186, local310, local206, local321, local226, local332, local246);
							arg5 += local160;
							arg3 += local149;
							arg6 += local196;
							local310 += local216;
							local321 += local236;
							local332 += local256;
							arg0 += this.anInt7044;
						}
						while (--arg2 >= 0.0F) {
							this.method6018(this.anIntArray444, this.aFloatArray58, (int) arg0, (int) arg4, (int) arg5, arg6, local186, local310, local206, local321, local226, local332, local246);
							arg5 += local160;
							arg4 += local138;
							arg6 += local196;
							local310 += local216;
							local321 += local236;
							local332 += local256;
							arg0 += this.anInt7044;
						}
					} else {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = this.anIntArray445[(int) arg0];
						while (--arg1 >= 0.0F) {
							this.method6018(this.anIntArray444, this.aFloatArray58, (int) arg0, (int) arg5, (int) arg3, arg6, local186, local310, local206, local321, local226, local332, local246);
							arg5 += local160;
							arg3 += local149;
							arg6 += local196;
							local310 += local216;
							local321 += local236;
							local332 += local256;
							arg0 += this.anInt7044;
						}
						while (--arg2 >= 0.0F) {
							this.method6018(this.anIntArray444, this.aFloatArray58, (int) arg0, (int) arg5, (int) arg4, arg6, local186, local310, local206, local321, local226, local332, local246);
							arg5 += local160;
							arg4 += local138;
							arg6 += local196;
							local310 += local216;
							local321 += local236;
							local332 += local256;
							arg0 += this.anInt7044;
						}
					}
				} else {
					arg4 = arg3;
					if (arg0 < 0.0F) {
						arg4 = arg3 - local160 * arg0;
						arg3 -= local149 * arg0;
						arg6 -= local196 * arg0;
						local310 -= local216 * arg0;
						local321 -= local236 * arg0;
						local332 -= local256 * arg0;
						arg0 = 0.0F;
					}
					if (arg2 < 0.0F) {
						arg5 -= local138 * arg2;
						arg2 = 0.0F;
					}
					if (arg0 != arg2 && local160 < local149 || arg0 == arg2 && local138 > local149) {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = this.anIntArray445[(int) arg0];
						while (--arg2 >= 0.0F) {
							this.method6018(this.anIntArray444, this.aFloatArray58, (int) arg0, (int) arg4, (int) arg3, arg6, local186, local310, local206, local321, local226, local332, local246);
							arg4 += local160;
							arg3 += local149;
							arg6 += local196;
							local310 += local216;
							local321 += local236;
							local332 += local256;
							arg0 += this.anInt7044;
						}
						while (--arg1 >= 0.0F) {
							this.method6018(this.anIntArray444, this.aFloatArray58, (int) arg0, (int) arg5, (int) arg3, arg6, local186, local310, local206, local321, local226, local332, local246);
							arg5 += local138;
							arg3 += local149;
							arg6 += local196;
							local310 += local216;
							local321 += local236;
							local332 += local256;
							arg0 += this.anInt7044;
						}
					} else {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = this.anIntArray445[(int) arg0];
						while (--arg2 >= 0.0F) {
							this.method6018(this.anIntArray444, this.aFloatArray58, (int) arg0, (int) arg3, (int) arg4, arg6, local186, local310, local206, local321, local226, local332, local246);
							arg4 += local160;
							arg3 += local149;
							arg6 += local196;
							local310 += local216;
							local321 += local236;
							local332 += local256;
							arg0 += this.anInt7044;
						}
						while (--arg1 >= 0.0F) {
							this.method6018(this.anIntArray444, this.aFloatArray58, (int) arg0, (int) arg3, (int) arg5, arg6, local186, local310, local206, local321, local226, local332, local246);
							arg5 += local138;
							arg3 += local149;
							arg6 += local196;
							local310 += local216;
							local321 += local236;
							local332 += local256;
							arg0 += this.anInt7044;
						}
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (!(arg1 >= (float) this.anInt7042)) {
				if (arg2 > (float) this.anInt7042) {
					arg2 = this.anInt7042;
				}
				if (arg0 > (float) this.anInt7042) {
					arg0 = this.anInt7042;
				}
				arg7 = arg7 + local186 - local186 * arg4;
				local310 = (float) (arg10 & 0xFF0000) + local206 - local206 * arg4;
				local321 = (float) (arg10 & 0xFF00) + local226 - local226 * arg4;
				local332 = (float) (arg10 & 0xFF) + local246 - local246 * arg4;
				if (arg2 < arg0) {
					arg3 = arg4;
					if (arg1 < 0.0F) {
						arg3 = arg4 - local149 * arg1;
						arg4 -= local138 * arg1;
						arg7 -= local196 * arg1;
						local310 -= local216 * arg1;
						local321 -= local236 * arg1;
						local332 -= local256 * arg1;
						arg1 = 0.0F;
					}
					if (arg2 < 0.0F) {
						arg5 -= local160 * arg2;
						arg2 = 0.0F;
					}
					if ((arg1 == arg2 || !(local149 < local138)) && (arg1 != arg2 || !(local149 > local160))) {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = this.anIntArray445[(int) arg1];
						while (--arg2 >= 0.0F) {
							this.method6018(this.anIntArray444, this.aFloatArray58, (int) arg1, (int) arg4, (int) arg3, arg7, local186, local310, local206, local321, local226, local332, local246);
							arg3 += local149;
							arg4 += local138;
							arg7 += local196;
							local310 += local216;
							local321 += local236;
							local332 += local256;
							arg1 += this.anInt7044;
						}
						while (--arg0 >= 0.0F) {
							this.method6018(this.anIntArray444, this.aFloatArray58, (int) arg1, (int) arg5, (int) arg3, arg7, local186, local310, local206, local321, local226, local332, local246);
							arg3 += local149;
							arg5 += local160;
							arg7 += local196;
							local310 += local216;
							local321 += local236;
							local332 += local256;
							arg1 += this.anInt7044;
						}
					} else {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = this.anIntArray445[(int) arg1];
						while (--arg2 >= 0.0F) {
							this.method6018(this.anIntArray444, this.aFloatArray58, (int) arg1, (int) arg3, (int) arg4, arg7, local186, local310, local206, local321, local226, local332, local246);
							arg3 += local149;
							arg4 += local138;
							arg7 += local196;
							local310 += local216;
							local321 += local236;
							local332 += local256;
							arg1 += this.anInt7044;
						}
						while (--arg0 >= 0.0F) {
							this.method6018(this.anIntArray444, this.aFloatArray58, (int) arg1, (int) arg3, (int) arg5, arg7, local186, local310, local206, local321, local226, local332, local246);
							arg3 += local149;
							arg5 += local160;
							arg7 += local196;
							local310 += local216;
							local321 += local236;
							local332 += local256;
							arg1 += this.anInt7044;
						}
					}
				} else {
					arg5 = arg4;
					if (arg1 < 0.0F) {
						arg5 = arg4 - local149 * arg1;
						arg4 -= local138 * arg1;
						arg7 -= local196 * arg1;
						local310 -= local216 * arg1;
						local321 -= local236 * arg1;
						local332 -= local256 * arg1;
						arg1 = 0.0F;
					}
					if (arg0 < 0.0F) {
						arg3 -= local160 * arg0;
						arg0 = 0.0F;
					}
					if (local149 < local138) {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = this.anIntArray445[(int) arg1];
						while (--arg0 >= 0.0F) {
							this.method6018(this.anIntArray444, this.aFloatArray58, (int) arg1, (int) arg5, (int) arg4, arg7, local186, local310, local206, local321, local226, local332, local246);
							arg5 += local149;
							arg4 += local138;
							arg7 += local196;
							local310 += local216;
							local321 += local236;
							local332 += local256;
							arg1 += this.anInt7044;
						}
						while (--arg2 >= 0.0F) {
							this.method6018(this.anIntArray444, this.aFloatArray58, (int) arg1, (int) arg3, (int) arg4, arg7, local186, local310, local206, local321, local226, local332, local246);
							arg3 += local160;
							arg4 += local138;
							arg7 += local196;
							local310 += local216;
							local321 += local236;
							local332 += local256;
							arg1 += this.anInt7044;
						}
					} else {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = this.anIntArray445[(int) arg1];
						while (--arg0 >= 0.0F) {
							this.method6018(this.anIntArray444, this.aFloatArray58, (int) arg1, (int) arg4, (int) arg5, arg7, local186, local310, local206, local321, local226, local332, local246);
							arg5 += local149;
							arg4 += local138;
							arg7 += local196;
							local310 += local216;
							local321 += local236;
							local332 += local256;
							arg1 += this.anInt7044;
						}
						while (--arg2 >= 0.0F) {
							this.method6018(this.anIntArray444, this.aFloatArray58, (int) arg1, (int) arg4, (int) arg3, arg7, local186, local310, local206, local321, local226, local332, local246);
							arg3 += local160;
							arg4 += local138;
							arg7 += local196;
							local310 += local216;
							local321 += local236;
							local332 += local256;
							arg1 += this.anInt7044;
						}
					}
				}
			}
		} else if (!(arg2 >= (float) this.anInt7042)) {
			if (arg0 > (float) this.anInt7042) {
				arg0 = this.anInt7042;
			}
			if (arg1 > (float) this.anInt7042) {
				arg1 = this.anInt7042;
			}
			arg8 = arg8 + local186 - local186 * arg5;
			local310 = (float) (arg11 & 0xFF0000) + local206 - local206 * arg5;
			local321 = (float) (arg11 & 0xFF00) + local226 - local226 * arg5;
			local332 = (float) (arg11 & 0xFF) + local246 - local246 * arg5;
			if (arg0 < arg1) {
				arg4 = arg5;
				if (arg2 < 0.0F) {
					arg4 = arg5 - local138 * arg2;
					arg5 -= local160 * arg2;
					arg8 -= local196 * arg2;
					local310 -= local216 * arg2;
					local321 -= local236 * arg2;
					local332 -= local256 * arg2;
					arg2 = 0.0F;
				}
				if (arg0 < 0.0F) {
					arg3 -= local149 * arg0;
					arg0 = 0.0F;
				}
				if (local138 < local160) {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = this.anIntArray445[(int) arg2];
					while (--arg0 >= 0.0F) {
						this.method6018(this.anIntArray444, this.aFloatArray58, (int) arg2, (int) arg4, (int) arg5, arg8, local186, local310, local206, local321, local226, local332, local246);
						arg4 += local138;
						arg5 += local160;
						arg8 += local196;
						local310 += local216;
						local321 += local236;
						local332 += local256;
						arg2 += this.anInt7044;
					}
					while (--arg1 >= 0.0F) {
						this.method6018(this.anIntArray444, this.aFloatArray58, (int) arg2, (int) arg4, (int) arg3, arg8, local186, local310, local206, local321, local226, local332, local246);
						arg4 += local138;
						arg3 += local149;
						arg8 += local196;
						local310 += local216;
						local321 += local236;
						local332 += local256;
						arg2 += this.anInt7044;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = this.anIntArray445[(int) arg2];
					while (--arg0 >= 0.0F) {
						this.method6018(this.anIntArray444, this.aFloatArray58, (int) arg2, (int) arg5, (int) arg4, arg8, local186, local310, local206, local321, local226, local332, local246);
						arg4 += local138;
						arg5 += local160;
						arg8 += local196;
						local310 += local216;
						local321 += local236;
						local332 += local256;
						arg2 += this.anInt7044;
					}
					while (--arg1 >= 0.0F) {
						this.method6018(this.anIntArray444, this.aFloatArray58, (int) arg2, (int) arg3, (int) arg4, arg8, local186, local310, local206, local321, local226, local332, local246);
						arg4 += local138;
						arg3 += local149;
						arg8 += local196;
						local310 += local216;
						local321 += local236;
						local332 += local256;
						arg2 += this.anInt7044;
					}
				}
			} else {
				arg3 = arg5;
				if (arg2 < 0.0F) {
					arg3 = arg5 - local138 * arg2;
					arg5 -= local160 * arg2;
					arg8 -= local196 * arg2;
					local310 -= local216 * arg2;
					local321 -= local236 * arg2;
					local332 -= local256 * arg2;
					arg2 = 0.0F;
				}
				if (arg1 < 0.0F) {
					arg4 -= local149 * arg1;
					arg1 = 0.0F;
				}
				if (local138 < local160) {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = this.anIntArray445[(int) arg2];
					while (--arg1 >= 0.0F) {
						this.method6018(this.anIntArray444, this.aFloatArray58, (int) arg2, (int) arg3, (int) arg5, arg8, local186, local310, local206, local321, local226, local332, local246);
						arg3 += local138;
						arg5 += local160;
						arg8 += local196;
						local310 += local216;
						local321 += local236;
						local332 += local256;
						arg2 += this.anInt7044;
					}
					while (--arg0 >= 0.0F) {
						this.method6018(this.anIntArray444, this.aFloatArray58, (int) arg2, (int) arg4, (int) arg5, arg8, local186, local310, local206, local321, local226, local332, local246);
						arg4 += local149;
						arg5 += local160;
						arg8 += local196;
						local310 += local216;
						local321 += local236;
						local332 += local256;
						arg2 += this.anInt7044;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = this.anIntArray445[(int) arg2];
					while (--arg1 >= 0.0F) {
						this.method6018(this.anIntArray444, this.aFloatArray58, (int) arg2, (int) arg5, (int) arg3, arg8, local186, local310, local206, local321, local226, local332, local246);
						arg3 += local138;
						arg5 += local160;
						arg8 += local196;
						local310 += local216;
						local321 += local236;
						local332 += local256;
						arg2 += this.anInt7044;
					}
					while (--arg0 >= 0.0F) {
						this.method6018(this.anIntArray444, this.aFloatArray58, (int) arg2, (int) arg5, (int) arg4, arg8, local186, local310, local206, local321, local226, local332, local246);
						arg4 += local149;
						arg5 += local160;
						arg8 += local196;
						local310 += local216;
						local321 += local236;
						local332 += local256;
						arg2 += this.anInt7044;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mp", name = "b", descriptor = "()I")
	public int method6025() {
		return this.anIntArray445[0] % this.anInt7044;
	}
}
