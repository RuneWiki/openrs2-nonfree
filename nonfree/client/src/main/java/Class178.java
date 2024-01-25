import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lo")
public final class Class178 {

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "I")
	private int anInt5292;

	@OriginalMember(owner = "client!lo", name = "f", descriptor = "[Z")
	private boolean[] aBooleanArray21;

	@OriginalMember(owner = "client!lo", name = "i", descriptor = "Lclient!k;")
	private Class1_Sub2_Sub2 aClass1_Sub2_Sub2_4;

	@OriginalMember(owner = "client!lo", name = "l", descriptor = "I")
	private int anInt5300;

	@OriginalMember(owner = "client!lo", name = "m", descriptor = "Lclient!r;")
	private Class97 aClass97_5;

	@OriginalMember(owner = "client!lo", name = "s", descriptor = "I")
	private int anInt5304;

	@OriginalMember(owner = "client!lo", name = "v", descriptor = "Lclient!lk;")
	private Class176 aClass176_1;

	@OriginalMember(owner = "client!lo", name = "A", descriptor = "I")
	private int anInt5309;

	@OriginalMember(owner = "client!lo", name = "D", descriptor = "Lclient!ts;")
	public Class46_Sub7 aClass46_Sub7_3;

	@OriginalMember(owner = "client!lo", name = "h", descriptor = "Z")
	private boolean aBoolean397 = false;

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "I")
	private int anInt5293 = -1;

	@OriginalMember(owner = "client!lo", name = "r", descriptor = "I")
	private int anInt5303 = -1;

	@OriginalMember(owner = "client!lo", name = "w", descriptor = "Z")
	private boolean aBoolean398 = false;

	@OriginalMember(owner = "client!lo", name = "J", descriptor = "I")
	private int anInt5315 = -32768;

	@OriginalMember(owner = "client!lo", name = "p", descriptor = "B")
	private final byte aByte62;

	@OriginalMember(owner = "client!lo", name = "x", descriptor = "B")
	private final byte aByte63;

	@OriginalMember(owner = "client!lo", name = "H", descriptor = "I")
	private int anInt5313;

	@OriginalMember(owner = "client!lo", name = "g", descriptor = "I")
	public final int anInt5297;

	@OriginalMember(owner = "client!lo", name = "e", descriptor = "I")
	private int anInt5296;

	@OriginalMember(owner = "client!lo", name = "L", descriptor = "I")
	public final int anInt5317;

	@OriginalMember(owner = "client!lo", name = "B", descriptor = "I")
	public final int anInt5310;

	@OriginalMember(owner = "client!lo", name = "F", descriptor = "Z")
	private final boolean aBoolean399;

	@OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(Lclient!qa;Lclient!cn;IIIIIIZI)V")
	public Class178(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class51 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		this.aByte62 = (byte) arg4;
		this.aByte63 = (byte) arg5;
		this.anInt5313 = arg6;
		this.anInt5297 = arg3;
		this.aBoolean398 = arg8;
		this.anInt5296 = arg7;
		this.anInt5317 = arg1.anInt1646;
		this.anInt5310 = arg2;
		this.aBoolean399 = arg0.method7153() && arg1.aBoolean132 && !this.aBoolean398;
		if (arg9 != -1) {
			this.aBoolean397 = true;
		}
		this.method4882(arg9);
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(BI)V")
	public void method4875(@OriginalArg(1) int arg0) {
		this.aBoolean397 = true;
		this.method4882(arg0);
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(ZZIILclient!qa;II)Lclient!r;")
	public Class97 method4877(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class4 arg4, @OriginalArg(5) int arg5) {
		@Pc(11) Class51 local11 = Static398.aClass18_4.method609(this.anInt5317);
		if (local11.anIntArray108 != null) {
			local11 = local11.method1625(Static417.aClass10_1);
		}
		if (local11 == null) {
			this.method4886(arg4);
			this.anInt5293 = this.anInt5309;
			this.anInt5303 = -1;
			return null;
		}
		if (!this.aBoolean397 && this.anInt5303 != local11.anInt1646) {
			this.aClass97_5 = null;
			this.method4882(-1);
		}
		this.method4885(arg3, arg5);
		@Pc(88) boolean local88 = arg1 & this.aBoolean399 & Static286.aClass1_Sub15_Sub1_1.method6358(Static449.anInt7876) != 0;
		@Pc(134) boolean local134 = local88 & (local11.anInt1646 != this.anInt5303 || (this.anInt5309 != this.anInt5293 || this.aClass176_1 != null && (this.aClass176_1.aBoolean396 || Static294.aBoolean419) && this.anInt5309 != this.anInt5300) && Static286.aClass1_Sub15_Sub1_1.method6358(Static449.anInt7876) >= 2);
		if (arg0 && !local134) {
			this.anInt5303 = local11.anInt1646;
			this.anInt5293 = this.anInt5309;
			return null;
		}
		if (local134) {
			Static509.method7778(this.aClass1_Sub2_Sub2_4, this.aByte63, this.anInt5313, this.anInt5296, this.aBooleanArray21);
		}
		@Pc(166) Class7 local166 = Static296.aClass7Array11[this.aByte63];
		@Pc(173) Class7 local173;
		if (this.aBoolean398) {
			local173 = Static411.aClass7Array12[0];
		} else {
			local173 = this.aByte63 >= 3 ? null : Static296.aClass7Array11[this.aByte63 + 1];
		}
		@Pc(192) Class97 local192 = null;
		if (this.aClass176_1 != null) {
			if (local134) {
				arg2 |= 0x40000;
			}
			local192 = local11.method1617(this.anInt5313, arg2, this.anInt5309, local173, local166, this.anInt5310 == 11 ? this.anInt5297 + 4 : this.anInt5297, this.anInt5296, this.anInt5300, arg4, this.anInt5292, this.anInt5310 == 11 ? 10 : this.anInt5310, this.aClass176_1, local166.aa(this.anInt5313, this.anInt5296));
			if (local192 == null) {
				this.aClass1_Sub2_Sub2_4 = null;
				this.anInt5315 = 0;
				this.aBooleanArray21 = null;
			} else {
				if (local134) {
					if (this.aBooleanArray21 == null) {
						this.aBooleanArray21 = new boolean[4];
					}
					this.aClass1_Sub2_Sub2_4 = local192.EA(this.aClass1_Sub2_Sub2_4);
					Static101.method2062(this.aClass1_Sub2_Sub2_4, this.aByte63, arg5, arg3, this.aBooleanArray21);
				}
				this.anInt5315 = local192.TA();
			}
			this.aClass97_5 = null;
		} else if (this.aClass97_5 != null && (arg2 & this.aClass97_5.ba()) == arg2 && this.anInt5303 == local11.anInt1646) {
			local192 = this.aClass97_5;
		} else {
			if (this.aClass97_5 != null) {
				arg2 |= this.aClass97_5.ba();
			}
			@Pc(265) Class147 local265 = local11.method1621(local166, local134, arg2, local173, arg4, this.anInt5313, this.anInt5296, local166.aa(this.anInt5313, this.anInt5296), this.anInt5310 == 11 ? this.anInt5297 + 4 : this.anInt5297, this.anInt5310 == 11 ? 10 : this.anInt5310);
			if (local265 == null) {
				this.aBooleanArray21 = null;
				this.aClass1_Sub2_Sub2_4 = null;
				this.anInt5315 = 0;
				this.aClass97_5 = null;
			} else {
				local192 = local265.aClass97_4;
				this.aClass97_5 = local265.aClass97_4;
				if (local134) {
					this.aClass1_Sub2_Sub2_4 = local265.aClass1_Sub2_Sub2_3;
					this.aBooleanArray21 = null;
					Static101.method2062(this.aClass1_Sub2_Sub2_4, this.aByte63, arg5, arg3, null);
				}
				this.anInt5315 = local192.TA();
			}
		}
		this.anInt5303 = local11.anInt1646;
		this.anInt5293 = this.anInt5309;
		this.anInt5296 = arg3;
		this.anInt5313 = arg5;
		return local192;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lclient!qa;I)V")
	public void method4878(@OriginalArg(0) Class4 arg0) {
		this.method4877(true, true, 262144, this.anInt5296, arg0, this.anInt5313);
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(I)I")
	public int method4880() {
		return this.anInt5315;
	}

	@OriginalMember(owner = "client!lo", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass46_Sub7_3 != null) {
			this.aClass46_Sub7_3.method7412();
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(II)V")
	private void method4882(@OriginalArg(0) int arg0) {
		@Pc(15) int local15 = arg0;
		@Pc(17) boolean local17 = false;
		if (arg0 == -1) {
			@Pc(26) Class51 local26 = Static398.aClass18_4.method609(this.anInt5317);
			@Pc(28) Class51 local28 = local26;
			if (local26.anIntArray108 != null) {
				local26 = local26.method1625(Static417.aClass10_1);
			}
			if (local26 == null) {
				return;
			}
			if (local28 == local26) {
				local28 = null;
			}
			if (local26.anIntArray107 != null) {
				if (this.aClass176_1 != null && local26.method1624(this.aClass176_1.anInt5286)) {
					return;
				}
				local15 = local26.method1616();
				if (this.anInt5303 != local26.anInt1646) {
					local17 = local26.aBoolean136;
				}
			} else if (local26.anInt1630 == -1) {
				if (local28 != null && local28.anIntArray107 != null) {
					if (this.aClass176_1 != null && local28.method1624(this.aClass176_1.anInt5286)) {
						return;
					}
					local15 = local28.method1616();
					if (local28.anInt1646 != this.anInt5303) {
						local17 = local28.aBoolean136;
					}
				} else if (local28 != null && local28.anInt1630 != -1 && local28.anInt1646 != this.anInt5303) {
					local17 = local28.aBoolean136;
					local15 = local28.anInt1630;
				}
			} else if (this.anInt5303 != local26.anInt1646) {
				local17 = local26.aBoolean136;
				local15 = local26.anInt1630;
			}
		}
		if (local15 == -1) {
			this.aClass176_1 = null;
			return;
		}
		this.aClass97_5 = null;
		if (this.aClass176_1 == null || this.aClass176_1.anInt5286 != local15) {
			this.aClass176_1 = Static35.aClass152_1.method4045(local15);
		} else if (this.aClass176_1.anInt5271 == 0) {
			return;
		}
		if (this.aClass176_1.anIntArray432 == null) {
			this.aClass176_1 = null;
			return;
		}
		if (local17) {
			this.anInt5309 = (int) (Math.random() * (double) this.aClass176_1.anIntArray432.length);
			this.anInt5292 = (int) ((double) this.aClass176_1.anIntArray433[this.anInt5309] * Math.random()) + 1;
		} else {
			this.anInt5309 = 0;
			this.anInt5292 = 1;
		}
		this.anInt5300 = this.anInt5309 + 1;
		if (this.anInt5300 < 0 || this.aClass176_1.anIntArray432.length <= this.anInt5300) {
			this.anInt5300 = -1;
		}
		this.anInt5304 = Static445.anInt7791 - this.anInt5292;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(ILclient!r;ILclient!qa;IZII)V")
	public void method4883(@OriginalArg(0) int arg0, @OriginalArg(1) Class97 arg1, @OriginalArg(3) Class4 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(6) Class68[] local6 = arg1.method6782();
		@Pc(9) Class106[] local9 = arg1.method6767();
		if ((this.aClass46_Sub7_3 == null || this.aClass46_Sub7_3.aBoolean627) && (local6 != null || local9 != null)) {
			@Pc(32) Class51 local32 = Static398.aClass18_4.method609(this.anInt5317);
			if (local32.anIntArray108 != null) {
				local32 = local32.method1625(Static417.aClass10_1);
			}
			if (local32 != null) {
				this.aClass46_Sub7_3 = Static477.method7410(Static445.anInt7791);
			}
		}
		if (this.aClass46_Sub7_3 == null) {
			return;
		}
		if (arg4) {
			this.aClass46_Sub7_3.method7414(arg2, (long) Static445.anInt7791, local6, local9);
		} else {
			this.aClass46_Sub7_3.method7416((long) Static445.anInt7791);
		}
		this.aClass46_Sub7_3.method7420(this.aByte62, arg6, arg0, arg5, arg3);
	}

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "(Z)Z")
	public boolean method4884() {
		return this.aBoolean399;
	}

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "(III)V")
	private void method4885(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		label80: while (true) {
			if (this.aClass176_1 == null) {
				if (this.aBoolean397) {
					return;
				}
				this.method4882(-1);
				if (this.aClass176_1 == null) {
					return;
				}
			}
			@Pc(34) int local34 = Static445.anInt7791 - this.anInt5304;
			if (local34 > 100 && this.aClass176_1.anInt5288 > 0) {
				@Pc(53) int local53 = this.aClass176_1.anIntArray432.length - this.aClass176_1.anInt5288;
				while (this.anInt5309 < local53 && this.aClass176_1.anIntArray433[this.anInt5309] < local34) {
					local34 -= this.aClass176_1.anIntArray433[this.anInt5309];
					this.anInt5309++;
				}
				if (local53 <= this.anInt5309) {
					@Pc(96) int local96 = 0;
					for (@Pc(98) int local98 = local53; local98 < this.aClass176_1.anIntArray432.length; local98++) {
						local96 += this.aClass176_1.anIntArray433[local98];
					}
					local34 %= local96;
				}
				this.anInt5300 = this.anInt5309 + 1;
				if (this.aClass176_1.anIntArray432.length <= this.anInt5300) {
					this.anInt5300 -= this.aClass176_1.anInt5288;
					if (this.anInt5300 < 0 || this.anInt5300 >= this.aClass176_1.anIntArray432.length) {
						this.anInt5300 = -1;
					}
				}
			}
			while (this.aClass176_1.anIntArray433[this.anInt5309] < local34) {
				Static425.method6639(this.aByte62, this.aClass176_1, arg0, this.anInt5309, false, arg1);
				local34 -= this.aClass176_1.anIntArray433[this.anInt5309];
				this.anInt5309++;
				if (this.anInt5309 >= this.aClass176_1.anIntArray432.length) {
					this.anInt5309 -= this.aClass176_1.anInt5288;
					if (this.anInt5309 < 0 || this.aClass176_1.anIntArray432.length <= this.anInt5309) {
						this.aClass176_1 = null;
						continue label80;
					}
				}
				this.anInt5300 = this.anInt5309 + 1;
				if (this.anInt5300 >= this.aClass176_1.anIntArray432.length) {
					this.anInt5300 -= this.aClass176_1.anInt5288;
					if (this.anInt5300 < 0 || this.aClass176_1.anIntArray432.length <= this.anInt5300) {
						this.anInt5300 = -1;
					}
				}
			}
			this.anInt5292 = local34;
			this.anInt5304 = Static445.anInt7791 - local34;
			return;
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(ZLclient!qa;)V")
	public void method4886(@OriginalArg(1) Class4 arg0) {
		if (this.aClass1_Sub2_Sub2_4 != null) {
			Static509.method7778(this.aClass1_Sub2_Sub2_4, this.aByte63, this.anInt5313, this.anInt5296, this.aBooleanArray21);
			this.aBooleanArray21 = null;
			this.aClass1_Sub2_Sub2_4 = null;
		}
	}
}
