import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hi")
public final class Class106_Sub1 extends Class106 {

	@OriginalMember(owner = "client!hi", name = "i", descriptor = "[[Lclient!vs;")
	private Class258[][] aClass258ArrayArray1;

	@OriginalMember(owner = "client!hi", name = "k", descriptor = "I")
	private int anInt2915;

	@OriginalMember(owner = "client!hi", name = "m", descriptor = "[[Lclient!ro;")
	private Class216[][] aClass216ArrayArray1;

	@OriginalMember(owner = "client!hi", name = "n", descriptor = "I")
	private int anInt2916;

	@OriginalMember(owner = "client!hi", name = "o", descriptor = "I")
	private int anInt2917;

	@OriginalMember(owner = "client!hi", name = "r", descriptor = "I")
	private int anInt2919;

	@OriginalMember(owner = "client!hi", name = "s", descriptor = "I")
	private int anInt2920;

	@OriginalMember(owner = "client!hi", name = "t", descriptor = "[[Lclient!oq;")
	private Class183[][] aClass183ArrayArray1;

	@OriginalMember(owner = "client!hi", name = "u", descriptor = "[[Lclient!is;")
	private Class122[][] aClass122ArrayArray1;

	@OriginalMember(owner = "client!hi", name = "v", descriptor = "I")
	private int anInt2921;

	@OriginalMember(owner = "client!hi", name = "w", descriptor = "I")
	private int anInt2922;

	@OriginalMember(owner = "client!hi", name = "x", descriptor = "I")
	private int anInt2923;

	@OriginalMember(owner = "client!hi", name = "y", descriptor = "I")
	private int anInt2924;

	@OriginalMember(owner = "client!hi", name = "z", descriptor = "I")
	private int anInt2925;

	@OriginalMember(owner = "client!hi", name = "A", descriptor = "I")
	private int anInt2926;

	@OriginalMember(owner = "client!hi", name = "C", descriptor = "I")
	private int anInt2927;

	@OriginalMember(owner = "client!hi", name = "D", descriptor = "I")
	private int anInt2928 = -1;

	@OriginalMember(owner = "client!hi", name = "l", descriptor = "Lclient!hh;")
	private final Class26_Sub2 aClass26_Sub2_4;

	@OriginalMember(owner = "client!hi", name = "q", descriptor = "I")
	private final int anInt2918;

	@OriginalMember(owner = "client!hi", name = "B", descriptor = "[[I")
	public final int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!hi", name = "j", descriptor = "[[B")
	private byte[][] aByteArrayArray9;

	@OriginalMember(owner = "client!hi", name = "p", descriptor = "[[B")
	private byte[][] aByteArrayArray10;

	@OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(Lclient!hh;IIII[[I[[II)V")
	public Class106_Sub1(@OriginalArg(0) Class26_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7);
		this.aClass26_Sub2_4 = arg0;
		this.anInt2918 = arg2;
		this.anIntArrayArray25 = arg5;
		this.aByteArrayArray9 = new byte[arg3 + 1][arg4 + 1];
		@Pc(31) int local31 = this.aClass26_Sub2_4.anInt2882 >> 9;
		for (@Pc(33) int local33 = 1; local33 < arg4; local33++) {
			for (@Pc(36) int local36 = 1; local36 < arg3; local36++) {
				@Pc(55) int local55 = arg6[local36 + 1][local33] - arg6[local36 - 1][local33];
				@Pc(71) int local71 = arg6[local36][local33 + 1] - arg6[local36][local33 - 1];
				@Pc(86) int local86 = (int) Math.sqrt((double) (local55 * local55 + arg7 * 512 + local71 * local71));
				@Pc(92) int local92 = (local55 << 8) / local86;
				@Pc(98) int local98 = arg7 * -512 / local86;
				@Pc(104) int local104 = (local71 << 8) / local86;
				@Pc(126) int local126 = local31 + (this.aClass26_Sub2_4.anInt2893 * local92 + this.aClass26_Sub2_4.anInt2895 * local98 + this.aClass26_Sub2_4.anInt2898 * local104 >> 17);
				local126 >>= 0x1;
				if (local126 < 2) {
					local126 = 2;
				} else if (local126 > 126) {
					local126 = 126;
				}
				this.aByteArrayArray9[local36][local33] = (byte) local126;
			}
		}
		this.aByteArrayArray10 = new byte[arg3 + 1][arg4 + 1];
	}

	@OriginalMember(owner = "client!hi", name = "U", descriptor = "(Lclient!j;IIIIZ)V")
	@Override
	public void U(@OriginalArg(0) Class2_Sub2_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lclient!or;[I)V")
	@Override
	public void method5480(@OriginalArg(0) Class2_Sub7 arg0, @OriginalArg(1) int[] arg1) {
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method5484(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		@Pc(4) Class146 local4 = this.aClass26_Sub2_4.method2302(Thread.currentThread());
		@Pc(7) Class3 local7 = local4.aClass3_2;
		local7.anInt80 = 0;
		local7.aBoolean7 = false;
		if (this.aClass258ArrayArray1 != null) {
			this.method2315(arg0, arg1, arg2, arg3, arg4, local7, local4.anIntArray280, local4.anIntArray285);
		} else if (this.aClass122ArrayArray1 != null) {
			this.method2314(arg0, arg1, arg2, arg3, arg4, local7, local4.anIntArray280, local4.anIntArray285);
		}
	}

	@OriginalMember(owner = "client!hi", name = "f", descriptor = "()V")
	@Override
	public void f() {
		this.aByteArrayArray9 = null;
		this.aByteArrayArray10 = null;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIIIII[[ZLclient!ab;[I[I)V")
	private void method2314(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class3 arg5, @OriginalArg(9) int[] arg6, @OriginalArg(10) int[] arg7) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		arg5.aBoolean9 = false;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = local7;
		for (@Pc(22) int local22 = arg0; local22 < arg2; local22++) {
			for (@Pc(25) int local25 = arg1; local25 < arg3; local25++) {
				if (arg4[local22 - arg0][local25 - arg1]) {
					@Pc(69) int local69;
					if (this.aClass122ArrayArray1[local22][local25] != null) {
						@Pc(50) Class122 local50 = this.aClass122ArrayArray1[local22][local25];
						if (local50.aShort40 != -1 && (local50.aByte37 & 0x2) == 0 && local50.anInt3435 == -1) {
							local69 = this.aClass26_Sub2_4.method2303(local50.aShort40);
							arg5.method65(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static230.method3530(local50.aShort44 & 0xFFFF, local69), Static230.method3530(local50.aShort41 & 0xFFFF, local69), Static230.method3530(local50.aShort42 & 0xFFFF, local69));
							arg5.method65(local20, local20, local20 - 4, local16, local16 + 4, local16, Static230.method3530(local50.aShort43 & 0xFFFF, local69), Static230.method3530(local50.aShort42 & 0xFFFF, local69), Static230.method3530(local50.aShort41 & 0xFFFF, local69));
						} else if (local50.anInt3435 == -1) {
							arg5.method65(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local50.aShort44 & 0xFFFF, local50.aShort41 & 0xFFFF, local50.aShort42 & 0xFFFF);
							arg5.method65(local20, local20, local20 - 4, local16, local16 + 4, local16, local50.aShort43 & 0xFFFF, local50.aShort42 & 0xFFFF, local50.aShort41 & 0xFFFF);
						} else {
							local69 = local50.anInt3435;
							arg5.method65(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local69, local69, local69);
							arg5.method65(local20, local20, local20 - 4, local16, local16 + 4, local16, local69, local69, local69);
						}
					} else if (this.aClass183ArrayArray1[local22][local25] != null) {
						@Pc(249) Class183 local249 = this.aClass183ArrayArray1[local22][local25];
						for (local69 = 0; local69 < local249.aShort66; local69++) {
							arg6[local69] = local16 + local249.aShortArray62[local69] * 4 / super.anInt6997;
							arg7[local69] = local20 - local249.aShortArray59[local69] * 4 / super.anInt6997;
						}
						for (@Pc(287) int local287 = 0; local287 < local249.aShort67; local287++) {
							@Pc(293) short local293 = local249.aShortArray63[local287];
							@Pc(298) short local298 = local249.aShortArray58[local287];
							@Pc(303) short local303 = local249.aShortArray64[local287];
							@Pc(307) int local307 = arg6[local293];
							@Pc(311) int local311 = arg6[local298];
							@Pc(315) int local315 = arg6[local303];
							@Pc(319) int local319 = arg7[local293];
							@Pc(323) int local323 = arg7[local298];
							@Pc(327) int local327 = arg7[local303];
							@Pc(341) int local341;
							if (local249.anIntArray346 != null && local249.anIntArray346[local287] != -1) {
								local341 = local249.anIntArray346[local287];
								arg5.method65(local319, local323, local327, local307, local311, local315, Static230.method3530(local249.aShortArray61[local293], local341), Static230.method3530(local249.aShortArray61[local298], local341), Static230.method3530(local249.aShortArray61[local303], local341));
							} else if (local249.aShortArray65 == null || local249.aShortArray65[local287] == -1) {
								local341 = local249.anIntArray347[local287];
								arg5.method65(local319, local323, local327, local307, local311, local315, Static230.method3530(local249.aShortArray61[local293], local341), Static230.method3530(local249.aShortArray61[local298], local341), Static230.method3530(local249.aShortArray61[local303], local341));
							} else {
								local341 = this.aClass26_Sub2_4.method2303(local249.aShortArray65[local287]);
								arg5.method65(local319, local323, local327, local307, local311, local315, Static230.method3530(local249.aShortArray61[local293], local341), Static230.method3530(local249.aShortArray61[local298], local341), Static230.method3530(local249.aShortArray61[local303], local341));
							}
						}
					}
				}
				local20 -= 4;
			}
			local20 = local7;
			local16 += 4;
		}
		arg5.aBoolean9 = true;
	}

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "(IIIIIII[[ZLclient!ab;[I[I)V")
	private void method2315(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class3 arg5, @OriginalArg(9) int[] arg6, @OriginalArg(10) int[] arg7) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		arg5.aBoolean9 = false;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = local7;
		for (@Pc(22) int local22 = arg0; local22 < arg2; local22++) {
			for (@Pc(25) int local25 = arg1; local25 < arg3; local25++) {
				if (arg4[local22 - arg0][local25 - arg1]) {
					@Pc(68) int local68;
					if (this.aClass258ArrayArray1[local22][local25] != null) {
						@Pc(50) Class258 local50 = this.aClass258ArrayArray1[local22][local25];
						if (local50.aShort102 != -1 && (local50.aByte101 & 0x2) == 0 && local50.anInt7501 == 0) {
							local68 = this.aClass26_Sub2_4.method2303(local50.aShort102);
							arg5.method65(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static230.method3530(local50.anInt7504, local68), Static230.method3530(local50.anInt7503, local68), Static230.method3530(local50.anInt7500, local68));
							arg5.method65(local20, local20, local20 - 4, local16, local16 + 4, local16, Static230.method3530(local50.anInt7502, local68), Static230.method3530(local50.anInt7500, local68), Static230.method3530(local50.anInt7503, local68));
						} else if (local50.anInt7501 == 0) {
							arg5.method67(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local50.anInt7504, local50.anInt7503, local50.anInt7500);
							arg5.method67(local20, local20, local20 - 4, local16, local16 + 4, local16, local50.anInt7502, local50.anInt7500, local50.anInt7503);
						} else {
							local68 = local50.anInt7501;
							arg5.method67(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static412.method5576(local50.anInt7504 & 0xFF000000, local68), Static412.method5576(local50.anInt7503 & 0xFF000000, local68), Static412.method5576(local50.anInt7500 & 0xFF000000, local68));
							arg5.method67(local20, local20, local20 - 4, local16, local16 + 4, local16, Static412.method5576(local50.anInt7502 & 0xFF000000, local68), Static412.method5576(local50.anInt7500 & 0xFF000000, local68), Static412.method5576(local50.anInt7503 & 0xFF000000, local68));
						}
					} else if (this.aClass216ArrayArray1[local22][local25] != null) {
						@Pc(259) Class216 local259 = this.aClass216ArrayArray1[local22][local25];
						for (local68 = 0; local68 < local259.aShort77; local68++) {
							arg6[local68] = local16 + local259.aShortArray86[local68] * 4 / super.anInt6997;
							arg7[local68] = local20 - local259.aShortArray84[local68] * 4 / super.anInt6997;
						}
						for (@Pc(297) int local297 = 0; local297 < local259.aShort76; local297++) {
							@Pc(302) int local302 = local297 * 3;
							@Pc(306) int local306 = local302 + 1;
							@Pc(310) int local310 = local306 + 1;
							@Pc(314) int local314 = arg6[local302];
							@Pc(318) int local318 = arg6[local306];
							@Pc(322) int local322 = arg6[local310];
							@Pc(326) int local326 = arg7[local302];
							@Pc(330) int local330 = arg7[local306];
							@Pc(334) int local334 = arg7[local310];
							@Pc(359) int local359;
							if (local259.anIntArray407 != null && local259.anIntArray407[local297] != 0 && (local259.aShortArray83 == null || local259.aShortArray83 != null && local259.aShortArray83[local297] == -1)) {
								local359 = local259.anIntArray407[local297];
								arg5.method67(local326, local330, local334, local314, local318, local322, Static412.method5576(-(local259.anIntArray406[local302] & -16777216) - 16777216, local359), Static412.method5576(-(local259.anIntArray406[local306] & -16777216) - 16777216, local359), Static412.method5576(-(local259.anIntArray406[local310] & -16777216) - 16777216, local359));
							} else if (local259.aShortArray83 == null || local259.aShortArray83[local297] == -1) {
								arg5.method67(local326, local330, local334, local314, local318, local322, local259.anIntArray406[local302], local259.anIntArray406[local306], local259.anIntArray406[local310]);
							} else {
								local359 = this.aClass26_Sub2_4.method2303(local259.aShortArray83[local297]);
								arg5.method65(local326, local330, local334, local314, local318, local322, local359, local359, local359);
							}
						}
					}
				}
				local20 -= 4;
			}
			local20 = local7;
			local16 += 4;
		}
		arg5.aBoolean9 = true;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method5479(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		@Pc(3) Class102_Sub1 local3 = this.aClass26_Sub2_4.aClass102_Sub1_2;
		this.anInt2928 = -1;
		this.anInt2917 = local3.anInt2736;
		this.anInt2924 = local3.anInt2743;
		this.anInt2920 = local3.anInt2742;
		this.anInt2916 = local3.anInt2733;
		this.anInt2923 = local3.anInt2734;
		this.anInt2919 = local3.anInt2737;
		this.anInt2921 = local3.anInt2738;
		this.anInt2925 = local3.anInt2739;
		this.anInt2915 = local3.anInt2735;
		this.anInt2922 = local3.anInt2732;
		this.anInt2926 = local3.anInt2741;
		this.anInt2927 = local3.anInt2740;
	}

	@OriginalMember(owner = "client!hi", name = "O", descriptor = "(IILclient!j;)Lclient!j;")
	@Override
	public Class2_Sub2_Sub9 O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub2_Sub9 arg2) {
		return null;
	}

	@OriginalMember(owner = "client!hi", name = "JA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (this.aClass258ArrayArray1 == null) {
			this.aClass258ArrayArray1 = new Class258[super.anInt6999][super.anInt7001];
			this.aClass216ArrayArray1 = new Class216[super.anInt6999][super.anInt7001];
		} else if (this.aClass122ArrayArray1 != null) {
			throw new IllegalStateException();
		}
		if (arg2 == null || arg2.length == 0) {
			return;
		}
		for (@Pc(32) int local32 = 0; local32 < arg6.length; local32++) {
			if (arg6[local32] == -1) {
				arg6[local32] = 0;
			} else {
				arg6[local32] = Static413.anIntArray484[Static17.method243(arg6[local32]) & 0xFFFF] << 8 | 0xFF;
			}
		}
		if (arg7 != null) {
			for (@Pc(68) int local68 = 0; local68 < arg7.length; local68++) {
				if (arg7[local68] == -1) {
					arg7[local68] = 0;
				} else {
					arg7[local68] = Static413.anIntArray484[Static17.method243(arg7[local68]) & 0xFFFF] << 8 | 0xFF;
				}
			}
		}
		@Pc(102) boolean local102 = true;
		@Pc(104) int local104 = -1;
		@Pc(106) int local106 = -1;
		@Pc(108) int local108 = -1;
		@Pc(110) int local110 = -1;
		@Pc(244) int local244;
		if (arg2.length == 6) {
			for (@Pc(116) int local116 = 0; local116 < 6; local116++) {
				if (arg2[local116] == 0 && arg4[local116] == 0) {
					if (local104 != -1 && arg6[local104] != arg6[local116]) {
						local102 = false;
						break;
					}
					local104 = local116;
				} else if (arg2[local116] == super.anInt6997 && arg4[local116] == 0) {
					if (local106 != -1 && arg6[local106] != arg6[local116]) {
						local102 = false;
						break;
					}
					local106 = local116;
				} else if (arg2[local116] == super.anInt6997 && arg4[local116] == super.anInt6997) {
					if (local108 != -1 && arg6[local108] != arg6[local116]) {
						local102 = false;
						break;
					}
					local108 = local116;
				} else if (arg2[local116] == 0 && arg4[local116] == super.anInt6997) {
					if (local110 != -1 && arg6[local110] != arg6[local116]) {
						local102 = false;
						break;
					}
					local110 = local116;
				}
			}
			if (local104 == -1 || local106 == -1 || local108 == -1 || local110 == -1) {
				local102 = false;
			}
			if (local102) {
				if (arg3 != null) {
					for (local244 = 0; local244 < 4; local244++) {
						if (arg3[local244] != 0) {
							local102 = false;
							break;
						}
					}
				}
				if (local102) {
					for (local244 = 1; local244 < 4; local244++) {
						if (arg2[local244] != arg2[0] && arg2[local244] != arg2[0] + super.anInt6997 && arg2[local244] != arg2[0] - super.anInt6997) {
							local102 = false;
							break;
						}
						if (arg4[local244] != arg4[0] && arg4[local244] != arg4[0] + super.anInt6997 && arg4[local244] != arg4[0] - super.anInt6997) {
							local102 = false;
							break;
						}
					}
				}
			}
		} else {
			local102 = false;
		}
		@Pc(342) int local342;
		@Pc(527) int local527;
		if (local102) {
			@Pc(334) Class258 local334 = new Class258();
			local244 = arg6[0];
			local342 = arg8[0];
			if (arg7 != null) {
				local334.anInt7501 = arg7[0] >> 8;
				if (local244 == 0) {
					local334.aByte101 = (byte) (local334.aByte101 | 0x2);
				}
			} else if (local244 == 0) {
				return;
			}
			if (this.anIntArrayArray25[arg0][arg1] == this.anIntArrayArray25[arg0 + 1][arg1] && this.anIntArrayArray25[arg0][arg1] == this.anIntArrayArray25[arg0 + 1][arg1 + 1] && this.anIntArrayArray25[arg0][arg1] == this.anIntArrayArray25[arg0][arg1 + 1]) {
				local334.aByte101 = (byte) (local334.aByte101 | 0x1);
			}
			if (local342 == -1 || (local334.aByte101 & 0x2) != 0 || this.aClass26_Sub2_4.anInterface8_5.method3836(local342).aBoolean436) {
				if (arg5 == null || arg11 == 0) {
					local527 = 0;
				} else {
					local527 = arg5[local104] * 255 / arg11;
					if (local527 < 0) {
						local527 = 0;
					} else if (local527 > 255) {
						local527 = 255;
					}
				}
				local334.anInt7502 = Static263.method4260(Static457.method2319(arg6[local104] >> 8, this.aByteArrayArray9[arg0][arg1] - this.aByteArrayArray10[arg0][arg1]), arg10, local527);
				if (local334.anInt7501 != 0) {
					local334.anInt7502 |= this.aByteArrayArray10[arg0][arg1] + 255 - this.aByteArrayArray9[arg0][arg1] << 25;
				}
				if (arg5 == null || arg11 == 0) {
					local527 = 0;
				} else {
					local527 = arg5[local106] * 255 / arg11;
					if (local527 < 0) {
						local527 = 0;
					} else if (local527 > 255) {
						local527 = 255;
					}
				}
				local334.anInt7500 = Static263.method4260(Static457.method2319(arg6[local106] >> 8, this.aByteArrayArray9[arg0 + 1][arg1] - this.aByteArrayArray10[arg0 + 1][arg1]), arg10, local527);
				if (local334.anInt7501 != 0) {
					local334.anInt7500 |= this.aByteArrayArray10[arg0 + 1][arg1] + 255 - this.aByteArrayArray9[arg0 + 1][arg1] << 25;
				}
				if (arg5 == null || arg11 == 0) {
					local527 = 0;
				} else {
					local527 = arg5[local108] * 255 / arg11;
					if (local527 < 0) {
						local527 = 0;
					} else if (local527 > 255) {
						local527 = 255;
					}
				}
				local334.anInt7504 = Static263.method4260(Static457.method2319(arg6[local108] >> 8, this.aByteArrayArray9[arg0 + 1][arg1 + 1] - this.aByteArrayArray10[arg0 + 1][arg1 + 1]), arg10, local527);
				if (local334.anInt7501 != 0) {
					local334.anInt7504 |= this.aByteArrayArray10[arg0 + 1][arg1 + 1] + 255 - this.aByteArrayArray9[arg0 + 1][arg1 + 1] << 25;
				}
				if (arg5 == null || arg11 == 0) {
					local527 = 0;
				} else {
					local527 = arg5[local110] * 255 / arg11;
					if (local527 < 0) {
						local527 = 0;
					} else if (local527 > 255) {
						local527 = 255;
					}
				}
				local334.anInt7503 = Static263.method4260(Static457.method2319(arg6[local110] >> 8, this.aByteArrayArray9[arg0][arg1 + 1] - this.aByteArrayArray10[arg0][arg1 + 1]), arg10, local527);
				if (local334.anInt7501 != 0) {
					local334.anInt7503 |= this.aByteArrayArray10[arg0][arg1 + 1] + 255 - this.aByteArrayArray9[arg0][arg1 + 1] << 25;
				}
				local334.aShort102 = -1;
			} else {
				local334.anInt7502 = this.aByteArrayArray9[arg0][arg1] - this.aByteArrayArray10[arg0][arg1];
				local334.anInt7500 = this.aByteArrayArray9[arg0 + 1][arg1] - this.aByteArrayArray10[arg0 + 1][arg1];
				local334.anInt7504 = this.aByteArrayArray9[arg0 + 1][arg1 + 1] - this.aByteArrayArray10[arg0 + 1][arg1 + 1];
				local334.anInt7503 = this.aByteArrayArray9[arg0][arg1 + 1] - this.aByteArrayArray10[arg0][arg1 + 1];
				local334.aShort102 = (short) local342;
			}
			if (arg5 != null) {
				local334.aShort99 = (short) arg5[local108];
				local334.aShort101 = (short) arg5[local110];
				local334.aShort103 = (short) arg5[local106];
				local334.aShort100 = (short) arg5[local104];
			}
			this.aClass258ArrayArray1[arg0][arg1] = local334;
			return;
		}
		@Pc(888) Class216 local888 = new Class216();
		local888.aShort77 = (short) arg2.length;
		local888.aShort76 = (short) (arg2.length / 3);
		local888.aShortArray86 = new short[local888.aShort77];
		local888.aShortArray85 = new short[local888.aShort77];
		local888.aShortArray84 = new short[local888.aShort77];
		local888.anIntArray406 = new int[local888.aShort77];
		if (arg5 != null) {
			local888.aShortArray82 = new short[local888.aShort77];
		}
		@Pc(958) int local958;
		@Pc(1079) int local1079;
		@Pc(1126) int local1126;
		@Pc(1226) int local1226;
		for (local244 = 0; local244 < local888.aShort77; local244++) {
			local342 = arg2[local244];
			local527 = arg4[local244];
			if (local342 == 0 && local527 == 0) {
				local958 = this.aByteArrayArray9[arg0][arg1] - this.aByteArrayArray10[arg0][arg1];
			} else if (local342 == 0 && local527 == super.anInt6997) {
				local958 = this.aByteArrayArray9[arg0][arg1 + 1] - this.aByteArrayArray10[arg0][arg1 + 1];
			} else if (local342 == super.anInt6997 && local527 == super.anInt6997) {
				local958 = this.aByteArrayArray9[arg0 + 1][arg1 + 1] - this.aByteArrayArray10[arg0 + 1][arg1 + 1];
			} else if (local342 == super.anInt6997 && local527 == 0) {
				local958 = this.aByteArrayArray9[arg0 + 1][arg1] - this.aByteArrayArray10[arg0 + 1][arg1];
			} else {
				local1079 = (this.aByteArrayArray9[arg0][arg1] - this.aByteArrayArray10[arg0][arg1]) * (super.anInt6997 - local342) + (this.aByteArrayArray9[arg0 + 1][arg1] - this.aByteArrayArray10[arg0 + 1][arg1]) * local342;
				local1126 = (this.aByteArrayArray9[arg0][arg1 + 1] - this.aByteArrayArray10[arg0][arg1 + 1]) * (super.anInt6997 - local342) + (this.aByteArrayArray9[arg0 + 1][arg1 + 1] - this.aByteArrayArray10[arg0 + 1][arg1 + 1]) * local342;
				local958 = local1079 * (super.anInt6997 - local527) + local1126 * local527 >> super.anInt7000 * 2;
			}
			local1079 = (arg0 << super.anInt7000) + local342;
			local1126 = (arg1 << super.anInt7000) + local527;
			local888.aShortArray86[local244] = (short) local342;
			local888.aShortArray84[local244] = (short) local527;
			local888.aShortArray85[local244] = (short) (this.va(local1079, local1126) + (arg3 == null ? 0 : arg3[local244]));
			if (local958 < 0) {
				local958 = 0;
			}
			if (arg8[local244] != -1 && !this.aClass26_Sub2_4.anInterface8_5.method3836(arg8[local244]).aBoolean436) {
				local888.anIntArray406[local244] = local958;
			} else if (arg6[local244] != 0) {
				local1226 = 0;
				if (arg5 != null) {
					@Pc(1238) short local1238 = local888.aShortArray82[local244] = (short) arg5[local244];
					if (arg11 != 0) {
						local1226 = local1238 * 255 / arg11;
						if (local1226 < 0) {
							local1226 = 0;
						} else if (local1226 > 255) {
							local1226 = 255;
						}
					}
				}
				local888.anIntArray406[local244] = Static263.method4260(Static457.method2319(arg6[local244] >> 8, local958), arg10, local1226);
				if (arg7 != null) {
					local888.anIntArray406[local244] |= local958 << 25;
				}
			} else if (arg7 == null) {
				local888.anIntArray406[local244] = 0;
			} else {
				local888.anIntArray406[local244] = local958 << 25;
			}
		}
		@Pc(1296) boolean local1296 = false;
		for (local527 = 0; local527 < local888.aShort76; local527++) {
			if (arg8[local527 * 3] != -1 && !this.aClass26_Sub2_4.anInterface8_5.method3836(arg8[local527 * 3]).aBoolean436) {
				local1296 = true;
			}
		}
		if (arg7 != null) {
			local888.anIntArray407 = new int[local888.aShort76];
		}
		if (local1296) {
			local888.aShortArray83 = new short[local888.aShort76];
			local888.aShortArray87 = new short[local888.aShort76];
		}
		for (local958 = 0; local958 < local888.aShort76; local958++) {
			local1079 = local958 * 3;
			if (arg7 != null && arg7[local1079] != 0) {
				local888.anIntArray407[local958] = arg7[local1079] >> 8;
			}
			if (local1296) {
				local1126 = local1079 + 1;
				local1226 = local1126 + 1;
				@Pc(1378) boolean local1378 = false;
				@Pc(1380) boolean local1380 = true;
				@Pc(1384) int local1384 = arg8[local1079];
				if (local1384 == -1 || this.aClass26_Sub2_4.anInterface8_5.method3836(local1384).aBoolean436) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				local1384 = arg8[local1126];
				if (local1384 == -1 || this.aClass26_Sub2_4.anInterface8_5.method3836(local1384).aBoolean436) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				local1384 = arg8[local1226];
				if (local1384 == -1 || this.aClass26_Sub2_4.anInterface8_5.method3836(local1384).aBoolean436) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				if (local1380) {
					local888.aShortArray83[local958] = (short) local1384;
					local888.aShortArray87[local958] = (short) arg9[local1079];
				} else {
					if (local1378) {
						local1384 = arg8[local1079];
						if (local1384 != -1 && !this.aClass26_Sub2_4.anInterface8_5.method3836(local1384).aBoolean436) {
							local888.anIntArray406[local1079] = Static413.anIntArray484[Static17.method243(this.aClass26_Sub2_4.anInterface8_5.method3836(local1384).aShort60 & 0xFFFF) & 0xFFFF];
						}
						local1384 = arg8[local1126];
						if (local1384 != -1 && !this.aClass26_Sub2_4.anInterface8_5.method3836(local1384).aBoolean436) {
							local888.anIntArray406[local1126] = Static413.anIntArray484[Static17.method243(this.aClass26_Sub2_4.anInterface8_5.method3836(local1384).aShort60 & 0xFFFF) & 0xFFFF];
						}
						local1384 = arg8[local1226];
						if (local1384 != -1 && !this.aClass26_Sub2_4.anInterface8_5.method3836(local1384).aBoolean436) {
							local888.anIntArray406[local1226] = Static413.anIntArray484[Static17.method243(this.aClass26_Sub2_4.anInterface8_5.method3836(local1384).aShort60 & 0xFFFF) & 0xFFFF];
						}
					}
					local888.aShortArray83[local958] = -1;
				}
			}
		}
		this.aClass216ArrayArray1[arg0][arg1] = local888;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method5483(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		if (this.aClass122ArrayArray1 == null) {
			this.aClass122ArrayArray1 = new Class122[super.anInt6999][super.anInt7001];
			this.aClass183ArrayArray1 = new Class183[super.anInt6999][super.anInt7001];
		} else if (this.aClass258ArrayArray1 != null) {
			throw new IllegalStateException();
		}
		@Pc(26) boolean local26 = false;
		@Pc(64) int local64;
		@Pc(70) int local70;
		if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
			local26 = true;
			for (@Pc(57) int local57 = 1; local57 < 2; local57++) {
				local64 = arg2[arg6[local57]];
				local70 = arg4[arg6[local57]];
				if (local64 != 0 && local64 != super.anInt6997 || local70 != 0 && local70 != super.anInt6997) {
					local26 = false;
					break;
				}
			}
		}
		if (!local26) {
			@Pc(95) Class183 local95 = new Class183();
			@Pc(99) short local99 = (short) arg2.length;
			@Pc(103) short local103 = (short) arg9.length;
			local95.aShort66 = local99;
			local95.aShortArray61 = new short[local99];
			local95.aShortArray62 = new short[local99];
			local95.aShortArray57 = new short[local99];
			local95.aShortArray59 = new short[local99];
			@Pc(133) int local133;
			@Pc(288) int local288;
			@Pc(335) int local335;
			for (@Pc(124) int local124 = 0; local124 < local99; local124++) {
				@Pc(129) int local129 = arg2[local124];
				local133 = arg4[local124];
				if (local129 == 0 && local133 == 0) {
					local95.aShortArray61[local124] = (short) (this.aByteArrayArray9[arg0][arg1] - this.aByteArrayArray10[arg0][arg1]);
				} else if (local129 == 0 && local133 == super.anInt6997) {
					local95.aShortArray61[local124] = (short) (this.aByteArrayArray9[arg0][arg1 + 1] - this.aByteArrayArray10[arg0][arg1 + 1]);
				} else if (local129 == super.anInt6997 && local133 == super.anInt6997) {
					local95.aShortArray61[local124] = (short) (this.aByteArrayArray9[arg0 + 1][arg1 + 1] - this.aByteArrayArray10[arg0 + 1][arg1 + 1]);
				} else if (local129 == super.anInt6997 && local133 == 0) {
					local95.aShortArray61[local124] = (short) (this.aByteArrayArray9[arg0 + 1][arg1] - this.aByteArrayArray10[arg0 + 1][arg1]);
				} else {
					local288 = (this.aByteArrayArray9[arg0][arg1] - this.aByteArrayArray10[arg0][arg1]) * (super.anInt6997 - local129) + (this.aByteArrayArray9[arg0 + 1][arg1] - this.aByteArrayArray10[arg0 + 1][arg1]) * local129;
					local335 = (this.aByteArrayArray9[arg0][arg1 + 1] - this.aByteArrayArray10[arg0][arg1 + 1]) * (super.anInt6997 - local129) + (this.aByteArrayArray9[arg0 + 1][arg1 + 1] - this.aByteArrayArray10[arg0 + 1][arg1 + 1]) * local129;
					local95.aShortArray61[local124] = (short) (local288 * (super.anInt6997 - local133) + local335 * local133 >> super.anInt7000 * 2);
				}
				local288 = (arg0 << super.anInt7000) + local129;
				local335 = (arg1 << super.anInt7000) + local133;
				local95.aShortArray62[local124] = (short) local129;
				local95.aShortArray59[local124] = (short) local133;
				local95.aShortArray57[local124] = (short) (this.va(local288, local335) + (arg3 == null ? 0 : arg3[local124]));
				if (local95.aShortArray61[local124] < 2) {
					local95.aShortArray61[local124] = 2;
				}
			}
			@Pc(415) boolean local415 = false;
			local133 = 0;
			for (local288 = 0; local288 < local103; local288++) {
				if (arg9[local288] >= 0 || arg10 != null && arg10[local288] >= 0) {
					local133++;
				}
				if (arg11[local288] != -1 && !this.aClass26_Sub2_4.anInterface8_5.method3836(arg11[local288]).aBoolean436) {
					local415 = true;
				}
			}
			local95.anIntArray347 = new int[local133];
			if (arg10 != null) {
				local95.anIntArray346 = new int[local133];
			}
			local95.aShortArray63 = new short[local133];
			local95.aShortArray58 = new short[local133];
			local95.aShortArray64 = new short[local133];
			if (local415) {
				local95.aShortArray65 = new short[local133];
				local95.aShortArray60 = new short[local133];
			}
			for (local335 = 0; local335 < local103; local335++) {
				if (arg9[local335] >= 0 || arg10 != null && arg10[local335] >= 0) {
					if (arg9[local335] >= 0) {
						local95.anIntArray347[local95.aShort67] = Static17.method243(arg9[local335]);
					} else {
						local95.anIntArray347[local95.aShort67] = -1;
					}
					if (arg10 != null) {
						if (arg10[local335] == -1) {
							local95.anIntArray346[local95.aShort67] = -1;
						} else {
							local95.anIntArray346[local95.aShort67] = Static17.method243(arg10[local335]);
						}
					}
					local95.aShortArray63[local95.aShort67] = (short) arg6[local335];
					local95.aShortArray58[local95.aShort67] = (short) arg7[local335];
					local95.aShortArray64[local95.aShort67] = (short) arg8[local335];
					if (local415) {
						if (arg11[local335] == -1 || this.aClass26_Sub2_4.anInterface8_5.method3836(arg11[local335]).aBoolean436) {
							local95.aShortArray65[local95.aShort67] = -1;
						} else {
							local95.aShortArray65[local95.aShort67] = (short) arg11[local335];
							local95.aShortArray60[local95.aShort67] = (short) arg12[local335];
						}
					}
					local95.aShort67++;
				}
			}
			this.aClass183ArrayArray1[arg0][arg1] = local95;
		} else if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
			@Pc(644) Class122 local644 = new Class122();
			local64 = arg9[0];
			local70 = arg11[0];
			if (arg10 != null) {
				local644.anInt3435 = Static230.method3530(this.aByteArrayArray9[arg0][arg1] - this.aByteArrayArray10[arg0][arg1], Static17.method243(arg10[0]));
				if (local64 == -1) {
					local644.aByte37 = (byte) (local644.aByte37 | 0x2);
				}
			}
			if (this.anIntArrayArray25[arg0][arg1] == this.anIntArrayArray25[arg0 + 1][arg1] && this.anIntArrayArray25[arg0][arg1] == this.anIntArrayArray25[arg0 + 1][arg1 + 1] && this.anIntArrayArray25[arg0][arg1] == this.anIntArrayArray25[arg0][arg1 + 1]) {
				local644.aByte37 = (byte) (local644.aByte37 | 0x1);
			}
			if (local70 == -1 || (local644.aByte37 & 0x2) != 0 || this.aClass26_Sub2_4.anInterface8_5.method3836(local70).aBoolean436) {
				@Pc(845) short local845 = Static17.method243(local64);
				local644.aShort43 = (short) Static230.method3530(this.aByteArrayArray9[arg0][arg1] - this.aByteArrayArray10[arg0][arg1], local845);
				local644.aShort42 = (short) Static230.method3530(this.aByteArrayArray9[arg0 + 1][arg1] - this.aByteArrayArray10[arg0 + 1][arg1], local845);
				local644.aShort44 = (short) Static230.method3530(this.aByteArrayArray9[arg0 + 1][arg1 + 1] - this.aByteArrayArray10[arg0 + 1][arg1 + 1], local845);
				local644.aShort41 = (short) Static230.method3530(this.aByteArrayArray9[arg0][arg1 + 1] - this.aByteArrayArray10[arg0][arg1 + 1], local845);
				local644.aShort40 = -1;
			} else {
				local644.aShort43 = (short) (this.aByteArrayArray9[arg0][arg1] - this.aByteArrayArray10[arg0][arg1]);
				local644.aShort42 = (short) (this.aByteArrayArray9[arg0 + 1][arg1] - this.aByteArrayArray10[arg0 + 1][arg1]);
				local644.aShort44 = (short) (this.aByteArrayArray9[arg0 + 1][arg1 + 1] - this.aByteArrayArray10[arg0 + 1][arg1 + 1]);
				local644.aShort41 = (short) (this.aByteArrayArray9[arg0][arg1 + 1] - this.aByteArrayArray10[arg0][arg1 + 1]);
				local644.aShort40 = (short) local70;
			}
			this.aClass122ArrayArray1[arg0][arg1] = local644;
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lclient!j;IIIIZ)Z")
	@Override
	public boolean method5478(@OriginalArg(0) Class2_Sub2_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return false;
	}

	@OriginalMember(owner = "client!hi", name = "SA", descriptor = "(Lclient!j;IIIIZ)V")
	@Override
	public void SA(@OriginalArg(0) Class2_Sub2_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIZLclient!ab;[I[I[I)V")
	private void method2316(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class3 arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6) {
		@Pc(6) Class258 local6 = this.aClass258ArrayArray1[arg0][arg1];
		@Pc(24) int local24;
		@Pc(29) int local29;
		@Pc(34) int local34;
		@Pc(268) int local268;
		@Pc(324) int local324;
		@Pc(380) int local380;
		@Pc(436) int local436;
		@Pc(296) int local296;
		@Pc(352) int local352;
		@Pc(408) int local408;
		@Pc(464) int local464;
		@Pc(257) int local257;
		@Pc(313) int local313;
		@Pc(369) int local369;
		@Pc(425) int local425;
		@Pc(285) int local285;
		@Pc(341) int local341;
		@Pc(397) int local397;
		@Pc(453) int local453;
		@Pc(82) int local82;
		@Pc(105) int local105;
		@Pc(128) int local128;
		@Pc(151) int local151;
		@Pc(36) int local36;
		@Pc(38) int local38;
		@Pc(40) int local40;
		@Pc(42) int local42;
		@Pc(176) int local176;
		@Pc(56) int local56;
		@Pc(65) int local65;
		@Pc(240) int local240;
		@Pc(501) int local501;
		@Pc(642) int local642;
		if (local6 == null) {
			@Pc(1452) Class216 local1452 = this.aClass216ArrayArray1[arg0][arg1];
			if (local1452 != null) {
				if (this.anInt2928 == -1) {
					for (local436 = 0; local436 < local1452.aShort77; local436++) {
						local24 = local1452.aShortArray86[local436] + (arg0 << super.anInt7000);
						local29 = local1452.aShortArray85[local436];
						local34 = local1452.aShortArray84[local436] + (arg1 << super.anInt7000);
						local380 = this.anInt2927 + (this.anInt2915 * local24 + this.anInt2922 * local29 + this.anInt2926 * local34 >> 15);
						if (local380 <= this.aClass26_Sub2_4.anInt2896) {
							return;
						}
						arg6[local436] = 0;
						if (arg2) {
							local296 = local380 - this.aClass26_Sub2_4.anInt2881;
							if (local296 > 255) {
								local296 = 255;
							}
							if (local296 > 0) {
								arg6[local436] = local296;
								local352 = local1452.aShortArray82[local436] * local296 / 255;
								if (local352 > 0) {
									local29 -= local352;
								}
							}
						} else if (this.aClass26_Sub2_4.aBoolean261) {
							local296 = local380 - this.aClass26_Sub2_4.anInt2881;
							if (local296 > 0) {
								arg6[local436] = local296;
								if (arg6[local436] > 255) {
									arg6[local436] = 255;
								}
							}
						}
						local268 = this.anInt2916 + (this.anInt2917 * local24 + this.anInt2924 * local29 + this.anInt2920 * local34 >> 15);
						local324 = this.anInt2925 + (this.anInt2923 * local24 + this.anInt2919 * local29 + this.anInt2921 * local34 >> 15);
						arg4[local436] = arg3.anInt81 + local268 * this.aClass26_Sub2_4.anInt2880 / local380;
						arg5[local436] = arg3.anInt82 + local324 * this.aClass26_Sub2_4.anInt2901 / local380;
					}
				} else {
					for (local436 = 0; local436 < local1452.aShort77; local436++) {
						local24 = local1452.aShortArray86[local436] + (arg0 << super.anInt7000);
						local29 = local1452.aShortArray85[local436];
						local34 = local1452.aShortArray84[local436] + (arg1 << super.anInt7000);
						arg6[local436] = 0;
						if (arg2) {
							local296 = this.anInt2928 - this.aClass26_Sub2_4.anInt2881;
							if (local296 > 255) {
								local296 = 255;
							}
							if (local296 > 0) {
								arg6[local436] = local296;
								local352 = local1452.aShortArray82[local436] * local296 / 255;
								if (local352 > 0) {
									local29 -= local352;
								}
							}
						} else if (this.aClass26_Sub2_4.aBoolean261) {
							local296 = this.anInt2928 - this.aClass26_Sub2_4.anInt2881;
							if (local296 > 0) {
								arg6[local436] = local296;
								if (arg6[local436] > 255) {
									arg6[local436] = 255;
								}
							}
						}
						local268 = this.anInt2916 + (this.anInt2917 * local24 + this.anInt2924 * local29 + this.anInt2920 * local34 >> 15);
						local324 = this.anInt2925 + (this.anInt2923 * local24 + this.anInt2919 * local29 + this.anInt2921 * local34 >> 15);
						arg4[local436] = arg3.anInt81 + local268 * this.aClass26_Sub2_4.anInt2880 / this.anInt2928;
						arg5[local436] = arg3.anInt82 + local324 * this.aClass26_Sub2_4.anInt2901 / this.anInt2928;
					}
				}
				if (local1452.aShortArray83 != null) {
					local436 = this.anIntArrayArray25[arg0][arg1];
					local296 = this.anIntArrayArray25[arg0 + 1][arg1];
					local352 = this.anIntArrayArray25[arg0][arg1 + 1];
					local408 = arg0 * super.anInt6997;
					local464 = local408 + super.anInt6997;
					local257 = arg1 * super.anInt6997;
					local313 = local257 + super.anInt6997;
					local369 = this.anInt2916 + (this.anInt2917 * local408 + this.anInt2924 * local436 + this.anInt2920 * local257 >> 15);
					local425 = this.anInt2925 + (this.anInt2923 * local408 + this.anInt2919 * local436 + this.anInt2921 * local257 >> 15);
					local285 = this.anInt2927 + (this.anInt2915 * local408 + this.anInt2922 * local436 + this.anInt2926 * local257 >> 15);
					local341 = this.anInt2916 + (this.anInt2917 * local464 + this.anInt2924 * local296 + this.anInt2920 * local257 >> 15);
					local397 = this.anInt2925 + (this.anInt2923 * local464 + this.anInt2919 * local296 + this.anInt2921 * local257 >> 15);
					local453 = this.anInt2927 + (this.anInt2915 * local464 + this.anInt2922 * local296 + this.anInt2926 * local257 >> 15);
					local82 = this.anInt2916 + (this.anInt2917 * local408 + this.anInt2924 * local352 + this.anInt2920 * local313 >> 15);
					local105 = this.anInt2925 + (this.anInt2923 * local408 + this.anInt2919 * local352 + this.anInt2921 * local313 >> 15);
					local128 = this.anInt2927 + (this.anInt2915 * local408 + this.anInt2922 * local352 + this.anInt2926 * local313 >> 15);
					for (local151 = 0; local151 < local1452.aShort76; local151++) {
						local36 = local151 * 3;
						local38 = local36 + 1;
						local40 = local38 + 1;
						local42 = arg4[local36];
						local176 = arg4[local38];
						local56 = arg4[local40];
						local65 = arg5[local36];
						local240 = arg5[local38];
						local501 = arg5[local40];
						local642 = arg6[local36] + arg6[local38] + arg6[local40];
						if ((local42 - local176) * (local501 - local240) - (local65 - local240) * (local56 - local176) > 0) {
							arg3.aBoolean7 = local42 < 0 || local176 < 0 || local56 < 0 || local42 > arg3.anInt79 || local176 > arg3.anInt79 || local56 > arg3.anInt79;
							@Pc(2138) short local2138 = local1452.aShortArray83[local151];
							if (local642 < 765) {
								if (local2138 != -1 && this.method2318(this.aClass26_Sub2_4.anInterface8_5.method3836(local2138).aByte59)) {
									arg3.anInt80 = 100;
								}
								if (local642 > 0) {
									if (local2138 != -1) {
										arg3.method62(local65, local240, local501, local42, local176, local56, this.aClass26_Sub2_4.anInt2891, arg6[local36], arg6[local38], arg6[local40], local1452.anIntArray406[local36], local1452.anIntArray406[local38], local1452.anIntArray406[local40], local369, local341, local82, local425, local397, local105, local285, local453, local128, local2138);
									} else if ((local1452.anIntArray406[local36] & 0xFFFFFF) != 0) {
										arg3.method67(local65, local240, local501, local42, local176, local56, Static412.method5576(arg6[local36] << 24 | this.aClass26_Sub2_4.anInt2891, local1452.anIntArray406[local36]), Static412.method5576(arg6[local38] << 24 | this.aClass26_Sub2_4.anInt2891, local1452.anIntArray406[local38]), Static412.method5576(arg6[local40] << 24 | this.aClass26_Sub2_4.anInt2891, local1452.anIntArray406[local40]));
									}
								} else if (local2138 != -1) {
									arg3.method64(local65, local240, local501, local42, local176, local56, local1452.anIntArray406[local36], local1452.anIntArray406[local38], local1452.anIntArray406[local40], local369, local341, local82, local425, local397, local105, local285, local453, local128, local2138);
								} else if ((local1452.anIntArray406[local36] & 0xFFFFFF) != 0) {
									arg3.method67(local65, local240, local501, local42, local176, local56, local1452.anIntArray406[local36], local1452.anIntArray406[local38], local1452.anIntArray406[local40]);
								}
								arg3.anInt80 = 0;
							} else {
								arg3.method58(local65, local240, local501, local42, local176, local56, this.aClass26_Sub2_4.anInt2891);
							}
						}
					}
					return;
				}
				for (local436 = 0; local436 < local1452.aShort76; local436++) {
					local296 = local436 * 3;
					local352 = local296 + 1;
					local408 = local352 + 1;
					local464 = arg4[local296];
					local257 = arg4[local352];
					local313 = arg4[local408];
					local369 = arg5[local296];
					local425 = arg5[local352];
					local285 = arg5[local408];
					local341 = arg6[local296] + arg6[local352] + arg6[local408];
					if ((local464 - local257) * (local285 - local425) - (local369 - local425) * (local313 - local257) > 0) {
						arg3.aBoolean7 = local464 < 0 || local257 < 0 || local313 < 0 || local464 > arg3.anInt79 || local257 > arg3.anInt79 || local313 > arg3.anInt79;
						if (local341 >= 765) {
							arg3.method58(local369, local425, local285, local464, local257, local313, this.aClass26_Sub2_4.anInt2891);
						} else if (local341 > 0) {
							if ((local1452.anIntArray406[local296] & 0xFFFFFF) != 0) {
								arg3.method67(local369, local425, local285, local464, local257, local313, Static263.method4260(local1452.anIntArray406[local296], this.aClass26_Sub2_4.anInt2891, arg6[local296]), Static263.method4260(local1452.anIntArray406[local352], this.aClass26_Sub2_4.anInt2891, arg6[local352]), Static263.method4260(local1452.anIntArray406[local408], this.aClass26_Sub2_4.anInt2891, arg6[local408]));
							}
						} else if ((local1452.anIntArray406[local296] & 0xFFFFFF) != 0) {
							arg3.method67(local369, local425, local285, local464, local257, local313, local1452.anIntArray406[local296], local1452.anIntArray406[local352], local1452.anIntArray406[local408]);
						}
					}
				}
			}
		} else if ((local6.aByte101 & 0x2) == 0) {
			@Pc(19) int local19 = arg0 * super.anInt6997;
			local24 = local19 + super.anInt6997;
			local29 = arg1 * super.anInt6997;
			local34 = local29 + super.anInt6997;
			local36 = 0;
			local38 = 0;
			local40 = 0;
			local42 = 0;
			if ((local6.aByte101 & 0x1) == 0 || arg2) {
				local56 = this.anIntArrayArray25[arg0][arg1];
				local65 = this.anIntArrayArray25[arg0 + 1][arg1];
				local240 = this.anIntArrayArray25[arg0 + 1][arg1 + 1];
				local501 = this.anIntArrayArray25[arg0][arg1 + 1];
				if (this.anInt2928 == -1) {
					local82 = this.anInt2927 + (this.anInt2915 * local19 + this.anInt2922 * local56 + this.anInt2926 * local29 >> 15);
					if (local82 <= this.aClass26_Sub2_4.anInt2896) {
						return;
					}
					local105 = this.anInt2927 + (this.anInt2915 * local24 + this.anInt2922 * local65 + this.anInt2926 * local29 >> 15);
					if (local105 <= this.aClass26_Sub2_4.anInt2896) {
						return;
					}
					local128 = this.anInt2927 + (this.anInt2915 * local24 + this.anInt2922 * local240 + this.anInt2926 * local34 >> 15);
					if (local128 <= this.aClass26_Sub2_4.anInt2896) {
						return;
					}
					local151 = this.anInt2927 + (this.anInt2915 * local19 + this.anInt2922 * local501 + this.anInt2926 * local34 >> 15);
					if (local151 <= this.aClass26_Sub2_4.anInt2896) {
						return;
					}
				} else {
					local151 = this.anInt2928;
					local128 = this.anInt2928;
					local105 = this.anInt2928;
					local82 = this.anInt2928;
				}
				if (arg2) {
					local176 = local82 - this.aClass26_Sub2_4.anInt2881;
					if (local176 > 255) {
						local176 = 255;
					}
					if (local176 > 0) {
						local36 = local176;
						local642 = local6.aShort100 * local176 / 255;
						if (local642 > 0) {
							local56 -= local642;
						}
					}
					local176 = local105 - this.aClass26_Sub2_4.anInt2881;
					if (local176 > 255) {
						local176 = 255;
					}
					if (local176 > 0) {
						local38 = local176;
						local642 = local6.aShort103 * local176 / 255;
						if (local642 > 0) {
							local65 -= local642;
						}
					}
					local176 = local128 - this.aClass26_Sub2_4.anInt2881;
					if (local176 > 255) {
						local176 = 255;
					}
					if (local176 > 0) {
						local40 = local176;
						local642 = local6.aShort99 * local176 / 255;
						if (local642 > 0) {
							local240 -= local642;
						}
					}
					local176 = local151 - this.aClass26_Sub2_4.anInt2881;
					if (local176 > 255) {
						local176 = 255;
					}
					if (local176 > 0) {
						local42 = local176;
						local642 = local6.aShort101 * local176 / 255;
						if (local642 > 0) {
							local501 -= local642;
						}
					}
				} else if (this.aClass26_Sub2_4.aBoolean261) {
					local176 = local82 - this.aClass26_Sub2_4.anInt2881;
					if (local176 > 0) {
						local36 = local176;
						if (local176 > 255) {
							local36 = 255;
						}
					}
					local176 = local105 - this.aClass26_Sub2_4.anInt2881;
					if (local176 > 0) {
						local38 = local176;
						if (local176 > 255) {
							local38 = 255;
						}
					}
					local176 = local128 - this.aClass26_Sub2_4.anInt2881;
					if (local176 > 0) {
						local40 = local176;
						if (local176 > 255) {
							local40 = 255;
						}
					}
					local176 = local151 - this.aClass26_Sub2_4.anInt2881;
					if (local176 > 0) {
						local42 = local176;
						if (local176 > 255) {
							local42 = 255;
						}
					}
				}
				local257 = this.anInt2916 + (this.anInt2917 * local19 + this.anInt2924 * local56 + this.anInt2920 * local29 >> 15);
				local268 = arg3.anInt81 + local257 * this.aClass26_Sub2_4.anInt2880 / local82;
				local285 = this.anInt2925 + (this.anInt2923 * local19 + this.anInt2919 * local56 + this.anInt2921 * local29 >> 15);
				local296 = arg3.anInt82 + local285 * this.aClass26_Sub2_4.anInt2901 / local82;
				local313 = this.anInt2916 + (this.anInt2917 * local24 + this.anInt2924 * local65 + this.anInt2920 * local29 >> 15);
				local324 = arg3.anInt81 + local313 * this.aClass26_Sub2_4.anInt2880 / local105;
				local341 = this.anInt2925 + (this.anInt2923 * local24 + this.anInt2919 * local65 + this.anInt2921 * local29 >> 15);
				local352 = arg3.anInt82 + local341 * this.aClass26_Sub2_4.anInt2901 / local105;
				local369 = this.anInt2916 + (this.anInt2917 * local24 + this.anInt2924 * local240 + this.anInt2920 * local34 >> 15);
				local380 = arg3.anInt81 + local369 * this.aClass26_Sub2_4.anInt2880 / local128;
				local397 = this.anInt2925 + (this.anInt2923 * local24 + this.anInt2919 * local240 + this.anInt2921 * local34 >> 15);
				local408 = arg3.anInt82 + local397 * this.aClass26_Sub2_4.anInt2901 / local128;
				local425 = this.anInt2916 + (this.anInt2917 * local19 + this.anInt2924 * local501 + this.anInt2920 * local34 >> 15);
				local436 = arg3.anInt81 + local425 * this.aClass26_Sub2_4.anInt2880 / local151;
				local453 = this.anInt2925 + (this.anInt2923 * local19 + this.anInt2919 * local501 + this.anInt2921 * local34 >> 15);
				local464 = arg3.anInt82 + local453 * this.aClass26_Sub2_4.anInt2901 / local151;
			} else {
				local56 = this.anIntArrayArray25[arg0][arg1];
				if (this.anInt2928 == -1) {
					local65 = this.anInt2922 * local56;
					local82 = this.anInt2927 + (this.anInt2915 * local19 + local65 + this.anInt2926 * local29 >> 15);
					if (local82 <= this.aClass26_Sub2_4.anInt2896) {
						return;
					}
					local105 = this.anInt2927 + (this.anInt2915 * local24 + local65 + this.anInt2926 * local29 >> 15);
					if (local105 <= this.aClass26_Sub2_4.anInt2896) {
						return;
					}
					local128 = this.anInt2927 + (this.anInt2915 * local24 + local65 + this.anInt2926 * local34 >> 15);
					if (local128 <= this.aClass26_Sub2_4.anInt2896) {
						return;
					}
					local151 = this.anInt2927 + (this.anInt2915 * local19 + local65 + this.anInt2926 * local34 >> 15);
					if (local151 <= this.aClass26_Sub2_4.anInt2896) {
						return;
					}
				} else {
					local151 = this.anInt2928;
					local128 = this.anInt2928;
					local105 = this.anInt2928;
					local82 = this.anInt2928;
				}
				if (this.aClass26_Sub2_4.aBoolean261) {
					local176 = local82 - this.aClass26_Sub2_4.anInt2881;
					if (local176 > 0) {
						local36 = local176;
						if (local176 > 255) {
							local36 = 255;
						}
					}
					local176 = local105 - this.aClass26_Sub2_4.anInt2881;
					if (local176 > 0) {
						local38 = local176;
						if (local176 > 255) {
							local38 = 255;
						}
					}
					local176 = local128 - this.aClass26_Sub2_4.anInt2881;
					if (local176 > 0) {
						local40 = local176;
						if (local176 > 255) {
							local40 = 255;
						}
					}
					local176 = local151 - this.aClass26_Sub2_4.anInt2881;
					if (local176 > 0) {
						local42 = local176;
						if (local176 > 255) {
							local42 = 255;
						}
					}
				}
				local65 = this.anInt2924 * local56;
				local240 = this.anInt2919 * local56;
				local257 = this.anInt2916 + (this.anInt2917 * local19 + local65 + this.anInt2920 * local29 >> 15);
				local268 = arg3.anInt81 + local257 * this.aClass26_Sub2_4.anInt2880 / local82;
				local285 = this.anInt2925 + (this.anInt2923 * local19 + local240 + this.anInt2921 * local29 >> 15);
				local296 = arg3.anInt82 + local285 * this.aClass26_Sub2_4.anInt2901 / local82;
				local313 = this.anInt2916 + (this.anInt2917 * local24 + local65 + this.anInt2920 * local29 >> 15);
				local324 = arg3.anInt81 + local313 * this.aClass26_Sub2_4.anInt2880 / local105;
				local341 = this.anInt2925 + (this.anInt2923 * local24 + local240 + this.anInt2921 * local29 >> 15);
				local352 = arg3.anInt82 + local341 * this.aClass26_Sub2_4.anInt2901 / local105;
				local369 = this.anInt2916 + (this.anInt2917 * local24 + local65 + this.anInt2920 * local34 >> 15);
				local380 = arg3.anInt81 + local369 * this.aClass26_Sub2_4.anInt2880 / local128;
				local397 = this.anInt2925 + (this.anInt2923 * local24 + local240 + this.anInt2921 * local34 >> 15);
				local408 = arg3.anInt82 + local397 * this.aClass26_Sub2_4.anInt2901 / local128;
				local425 = this.anInt2916 + (this.anInt2917 * local19 + local65 + this.anInt2920 * local34 >> 15);
				local436 = arg3.anInt81 + local425 * this.aClass26_Sub2_4.anInt2880 / local151;
				local453 = this.anInt2925 + (this.anInt2923 * local19 + local240 + this.anInt2921 * local34 >> 15);
				local464 = arg3.anInt82 + local453 * this.aClass26_Sub2_4.anInt2901 / local151;
			}
			@Pc(1064) boolean local1064 = local6.aShort102 != -1 && this.method2318(this.aClass26_Sub2_4.anInterface8_5.method3836(local6.aShort102).aByte59);
			local65 = local38 + local40 + local42;
			if ((local380 - local436) * (local352 - local464) - (local408 - local464) * (local324 - local436) > 0) {
				arg3.aBoolean7 = local380 < 0 || local436 < 0 || local324 < 0 || local380 > arg3.anInt79 || local436 > arg3.anInt79 || local324 > arg3.anInt79;
				if (local65 < 765) {
					if (local1064) {
						arg3.anInt80 = 100;
					}
					if (local65 > 0) {
						if (local6.aShort102 >= 0) {
							arg3.method62(local408, local464, local352, local380, local436, local324, this.aClass26_Sub2_4.anInt2891, local40, local42, local38, local6.anInt7504, local6.anInt7503, local6.anInt7500, local369, local425, local313, local397, local453, local341, local128, local151, local105, local6.aShort102);
						} else {
							arg3.method67(local408, local464, local352, local380, local436, local324, Static412.method5576(local40 << 24 | this.aClass26_Sub2_4.anInt2891, local6.anInt7504), Static412.method5576(local42 << 24 | this.aClass26_Sub2_4.anInt2891, local6.anInt7503), Static412.method5576(local38 << 24 | this.aClass26_Sub2_4.anInt2891, local6.anInt7500));
						}
					} else if (local6.aShort102 >= 0) {
						arg3.method64(local408, local464, local352, local380, local436, local324, local6.anInt7504, local6.anInt7503, local6.anInt7500, local369, local425, local313, local397, local453, local341, local128, local151, local105, local6.aShort102);
					} else {
						arg3.method67(local408, local464, local352, local380, local436, local324, local6.anInt7504, local6.anInt7503, local6.anInt7500);
					}
					arg3.anInt80 = 0;
				} else {
					arg3.method58(local408, local464, local352, local380, local436, local324, this.aClass26_Sub2_4.anInt2891);
				}
			}
			local65 = local36 + local38 + local42;
			if ((local268 - local324) * (local464 - local352) - (local296 - local352) * (local436 - local324) > 0) {
				arg3.aBoolean7 = local268 < 0 || local324 < 0 || local436 < 0 || local268 > arg3.anInt79 || local324 > arg3.anInt79 || local436 > arg3.anInt79;
				if (local65 < 765) {
					if (local1064) {
						arg3.anInt80 = 100;
					}
					if (local65 > 0) {
						if (local6.aShort102 >= 0) {
							arg3.method62(local296, local352, local464, local268, local324, local436, this.aClass26_Sub2_4.anInt2891, local36, local38, local42, local6.anInt7502, local6.anInt7500, local6.anInt7503, local257, local313, local425, local285, local341, local453, local82, local105, local151, local6.aShort102);
						} else {
							arg3.method67(local296, local352, local464, local268, local324, local436, Static412.method5576(local36 << 24 | this.aClass26_Sub2_4.anInt2891, local6.anInt7502), Static412.method5576(local38 << 24 | this.aClass26_Sub2_4.anInt2891, local6.anInt7500), Static412.method5576(local42 << 24 | this.aClass26_Sub2_4.anInt2891, local6.anInt7503));
						}
					} else if (local6.aShort102 >= 0) {
						arg3.method64(local296, local352, local464, local268, local324, local436, local6.anInt7502, local6.anInt7500, local6.anInt7503, local257, local313, local425, local285, local341, local453, local82, local105, local151, local6.aShort102);
					} else {
						arg3.method67(local296, local352, local464, local268, local324, local436, local6.anInt7502, local6.anInt7500, local6.anInt7503);
					}
					arg3.anInt80 = 0;
					return;
				}
				arg3.method58(local296, local352, local464, local268, local324, local436, this.aClass26_Sub2_4.anInt2891);
			}
		}
	}

	@OriginalMember(owner = "client!hi", name = "QA", descriptor = "(III)V")
	@Override
	public void QA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aByteArrayArray10[arg0][arg1] < arg2) {
			this.aByteArrayArray10[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IILclient!ab;[I[I[I)V")
	private void method2317(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5) {
		@Pc(6) Class122 local6 = this.aClass122ArrayArray1[arg0][arg1];
		@Pc(24) int local24;
		@Pc(34) int local34;
		@Pc(194) int local194;
		@Pc(250) int local250;
		@Pc(306) int local306;
		@Pc(362) int local362;
		@Pc(390) int local390;
		@Pc(183) int local183;
		@Pc(239) int local239;
		@Pc(295) int local295;
		@Pc(351) int local351;
		@Pc(211) int local211;
		@Pc(267) int local267;
		@Pc(323) int local323;
		@Pc(379) int local379;
		@Pc(72) int local72;
		@Pc(95) int local95;
		@Pc(118) int local118;
		@Pc(141) int local141;
		@Pc(427) int local427;
		@Pc(222) int local222;
		@Pc(278) int local278;
		@Pc(334) int local334;
		if (local6 == null) {
			@Pc(1022) Class183 local1022 = this.aClass183ArrayArray1[arg0][arg1];
			if (local1022 != null) {
				@Pc(1046) short local1046;
				if (this.anInt2928 == -1) {
					for (local362 = 0; local362 < local1022.aShort66; local362++) {
						local24 = local1022.aShortArray62[local362] + (arg0 << super.anInt7000);
						local1046 = local1022.aShortArray57[local362];
						local34 = local1022.aShortArray59[local362] + (arg1 << super.anInt7000);
						local306 = this.anInt2927 + (this.anInt2915 * local24 + this.anInt2922 * local1046 + this.anInt2926 * local34 >> 15);
						if (local306 <= this.aClass26_Sub2_4.anInt2896) {
							return;
						}
						local194 = this.anInt2916 + (this.anInt2917 * local24 + this.anInt2924 * local1046 + this.anInt2920 * local34 >> 15);
						local250 = this.anInt2925 + (this.anInt2923 * local24 + this.anInt2919 * local1046 + this.anInt2921 * local34 >> 15);
						arg3[local362] = arg2.anInt81 + local194 * this.aClass26_Sub2_4.anInt2880 / local306;
						arg4[local362] = arg2.anInt82 + local250 * this.aClass26_Sub2_4.anInt2901 / local306;
					}
				} else {
					for (local362 = 0; local362 < local1022.aShort66; local362++) {
						local24 = local1022.aShortArray62[local362] + (arg0 << super.anInt7000);
						local1046 = local1022.aShortArray57[local362];
						local34 = local1022.aShortArray59[local362] + (arg1 << super.anInt7000);
						local194 = this.anInt2916 + (this.anInt2917 * local24 + this.anInt2924 * local1046 + this.anInt2920 * local34 >> 15);
						local250 = this.anInt2925 + (this.anInt2923 * local24 + this.anInt2919 * local1046 + this.anInt2921 * local34 >> 15);
						arg3[local362] = arg2.anInt81 + local194 * this.aClass26_Sub2_4.anInt2880 / this.anInt2928;
						arg4[local362] = arg2.anInt82 + local250 * this.aClass26_Sub2_4.anInt2901 / this.anInt2928;
					}
				}
				if (local1022.aShortArray65 != null) {
					local362 = this.anIntArrayArray25[arg0][arg1];
					local222 = this.anIntArrayArray25[arg0 + 1][arg1];
					local278 = this.anIntArrayArray25[arg0][arg1 + 1];
					local334 = arg0 * super.anInt6997;
					local390 = local334 + super.anInt6997;
					local183 = arg1 * super.anInt6997;
					local239 = local183 + super.anInt6997;
					local295 = this.anInt2916 + (this.anInt2917 * local334 + this.anInt2924 * local362 + this.anInt2920 * local183 >> 15);
					local351 = this.anInt2925 + (this.anInt2923 * local334 + this.anInt2919 * local362 + this.anInt2921 * local183 >> 15);
					local211 = this.anInt2927 + (this.anInt2915 * local334 + this.anInt2922 * local362 + this.anInt2926 * local183 >> 15);
					local267 = this.anInt2916 + (this.anInt2917 * local390 + this.anInt2924 * local222 + this.anInt2920 * local183 >> 15);
					local323 = this.anInt2925 + (this.anInt2923 * local390 + this.anInt2919 * local222 + this.anInt2921 * local183 >> 15);
					local379 = this.anInt2927 + (this.anInt2915 * local390 + this.anInt2922 * local222 + this.anInt2926 * local183 >> 15);
					local72 = this.anInt2916 + (this.anInt2917 * local334 + this.anInt2924 * local278 + this.anInt2920 * local239 >> 15);
					local95 = this.anInt2925 + (this.anInt2923 * local334 + this.anInt2919 * local278 + this.anInt2921 * local239 >> 15);
					local118 = this.anInt2927 + (this.anInt2915 * local334 + this.anInt2922 * local278 + this.anInt2926 * local239 >> 15);
					for (local141 = 0; local141 < local1022.aShort67; local141++) {
						@Pc(1491) short local1491 = local1022.aShortArray63[local141];
						@Pc(1496) short local1496 = local1022.aShortArray58[local141];
						@Pc(1501) short local1501 = local1022.aShortArray64[local141];
						local427 = arg3[local1491];
						@Pc(1509) int local1509 = arg3[local1496];
						@Pc(1513) int local1513 = arg3[local1501];
						@Pc(1517) int local1517 = arg4[local1491];
						@Pc(1521) int local1521 = arg4[local1496];
						@Pc(1525) int local1525 = arg4[local1501];
						if ((local427 - local1509) * (local1525 - local1521) - (local1517 - local1521) * (local1513 - local1509) > 0) {
							arg2.aBoolean7 = local427 < 0 || local1509 < 0 || local1513 < 0 || local427 > arg2.anInt79 || local1509 > arg2.anInt79 || local1513 > arg2.anInt79;
							@Pc(1569) short local1569 = local1022.aShortArray65[local141];
							if (local1569 == -1) {
								@Pc(1624) int local1624 = local1022.anIntArray347[local141];
								if (local1624 != -1) {
									arg2.method65(local1517, local1521, local1525, local427, local1509, local1513, Static230.method3530(local1022.aShortArray61[local1491], local1624), Static230.method3530(local1022.aShortArray61[local1496], local1624), Static230.method3530(local1022.aShortArray61[local1501], local1624));
								}
							} else {
								if (this.method2318(this.aClass26_Sub2_4.anInterface8_5.method3836(local1569).aByte59)) {
									arg2.anInt80 = 100;
								}
								arg2.method64(local1517, local1521, local1525, local427, local1509, local1513, local1022.aShortArray61[local1491], local1022.aShortArray61[local1496], local1022.aShortArray61[local1501], local295, local267, local72, local351, local323, local95, local211, local379, local118, local1569);
								arg2.anInt80 = 0;
							}
						}
					}
					return;
				}
				for (local362 = 0; local362 < local1022.aShort67; local362++) {
					@Pc(1670) short local1670 = local1022.aShortArray63[local362];
					@Pc(1675) short local1675 = local1022.aShortArray58[local362];
					@Pc(1680) short local1680 = local1022.aShortArray64[local362];
					local390 = arg3[local1670];
					local183 = arg3[local1675];
					local239 = arg3[local1680];
					local295 = arg4[local1670];
					local351 = arg4[local1675];
					local211 = arg4[local1680];
					if ((local390 - local183) * (local211 - local351) - (local295 - local351) * (local239 - local183) > 0) {
						local267 = local1022.anIntArray347[local362];
						if (local267 != -1) {
							arg2.aBoolean7 = local390 < 0 || local183 < 0 || local239 < 0 || local390 > arg2.anInt79 || local183 > arg2.anInt79 || local239 > arg2.anInt79;
							arg2.method65(local295, local351, local211, local390, local183, local239, Static230.method3530(local1022.aShortArray61[local1670], local267), Static230.method3530(local1022.aShortArray61[local1675], local267), Static230.method3530(local1022.aShortArray61[local1680], local267));
						}
					}
				}
			}
		} else if ((local6.aByte37 & 0x2) == 0) {
			@Pc(19) int local19 = arg0 * super.anInt6997;
			local24 = local19 + super.anInt6997;
			@Pc(29) int local29 = arg1 * super.anInt6997;
			local34 = local29 + super.anInt6997;
			@Pc(46) int local46;
			@Pc(55) int local55;
			@Pc(166) int local166;
			if ((local6.aByte37 & 0x1) == 0) {
				local46 = this.anIntArrayArray25[arg0][arg1];
				local55 = this.anIntArrayArray25[arg0 + 1][arg1];
				local166 = this.anIntArrayArray25[arg0 + 1][arg1 + 1];
				local427 = this.anIntArrayArray25[arg0][arg1 + 1];
				if (this.anInt2928 == -1) {
					local72 = this.anInt2927 + (this.anInt2915 * local19 + this.anInt2922 * local46 + this.anInt2926 * local29 >> 15);
					if (local72 <= this.aClass26_Sub2_4.anInt2896) {
						return;
					}
					local95 = this.anInt2927 + (this.anInt2915 * local24 + this.anInt2922 * local55 + this.anInt2926 * local29 >> 15);
					if (local95 <= this.aClass26_Sub2_4.anInt2896) {
						return;
					}
					local118 = this.anInt2927 + (this.anInt2915 * local24 + this.anInt2922 * local166 + this.anInt2926 * local34 >> 15);
					if (local118 <= this.aClass26_Sub2_4.anInt2896) {
						return;
					}
					local141 = this.anInt2927 + (this.anInt2915 * local19 + this.anInt2922 * local427 + this.anInt2926 * local34 >> 15);
					if (local141 <= this.aClass26_Sub2_4.anInt2896) {
						return;
					}
				} else {
					local141 = this.anInt2928;
					local118 = this.anInt2928;
					local95 = this.anInt2928;
					local72 = this.anInt2928;
				}
				local183 = this.anInt2916 + (this.anInt2917 * local19 + this.anInt2924 * local46 + this.anInt2920 * local29 >> 15);
				local194 = arg2.anInt81 + local183 * this.aClass26_Sub2_4.anInt2880 / local72;
				local211 = this.anInt2925 + (this.anInt2923 * local19 + this.anInt2919 * local46 + this.anInt2921 * local29 >> 15);
				local222 = arg2.anInt82 + local211 * this.aClass26_Sub2_4.anInt2901 / local72;
				local239 = this.anInt2916 + (this.anInt2917 * local24 + this.anInt2924 * local55 + this.anInt2920 * local29 >> 15);
				local250 = arg2.anInt81 + local239 * this.aClass26_Sub2_4.anInt2880 / local95;
				local267 = this.anInt2925 + (this.anInt2923 * local24 + this.anInt2919 * local55 + this.anInt2921 * local29 >> 15);
				local278 = arg2.anInt82 + local267 * this.aClass26_Sub2_4.anInt2901 / local95;
				local295 = this.anInt2916 + (this.anInt2917 * local24 + this.anInt2924 * local166 + this.anInt2920 * local34 >> 15);
				local306 = arg2.anInt81 + local295 * this.aClass26_Sub2_4.anInt2880 / local118;
				local323 = this.anInt2925 + (this.anInt2923 * local24 + this.anInt2919 * local166 + this.anInt2921 * local34 >> 15);
				local334 = arg2.anInt82 + local323 * this.aClass26_Sub2_4.anInt2901 / local118;
				local351 = this.anInt2916 + (this.anInt2917 * local19 + this.anInt2924 * local427 + this.anInt2920 * local34 >> 15);
				local362 = arg2.anInt81 + local351 * this.aClass26_Sub2_4.anInt2880 / local141;
				local379 = this.anInt2925 + (this.anInt2923 * local19 + this.anInt2919 * local427 + this.anInt2921 * local34 >> 15);
				local390 = arg2.anInt82 + local379 * this.aClass26_Sub2_4.anInt2901 / local141;
			} else {
				local46 = this.anIntArrayArray25[arg0][arg1];
				if (this.anInt2928 == -1) {
					local55 = this.anInt2922 * local46;
					local72 = this.anInt2927 + (this.anInt2915 * local19 + local55 + this.anInt2926 * local29 >> 15);
					if (local72 <= this.aClass26_Sub2_4.anInt2896) {
						return;
					}
					local95 = this.anInt2927 + (this.anInt2915 * local24 + local55 + this.anInt2926 * local29 >> 15);
					if (local95 <= this.aClass26_Sub2_4.anInt2896) {
						return;
					}
					local118 = this.anInt2927 + (this.anInt2915 * local24 + local55 + this.anInt2926 * local34 >> 15);
					if (local118 <= this.aClass26_Sub2_4.anInt2896) {
						return;
					}
					local141 = this.anInt2927 + (this.anInt2915 * local19 + local55 + this.anInt2926 * local34 >> 15);
					if (local141 <= this.aClass26_Sub2_4.anInt2896) {
						return;
					}
				} else {
					local141 = this.anInt2928;
					local118 = this.anInt2928;
					local95 = this.anInt2928;
					local72 = this.anInt2928;
				}
				local55 = this.anInt2924 * local46;
				local166 = this.anInt2919 * local46;
				local183 = this.anInt2916 + (this.anInt2917 * local19 + local55 + this.anInt2920 * local29 >> 15);
				local194 = arg2.anInt81 + local183 * this.aClass26_Sub2_4.anInt2880 / local72;
				local211 = this.anInt2925 + (this.anInt2923 * local19 + local166 + this.anInt2921 * local29 >> 15);
				local222 = arg2.anInt82 + local211 * this.aClass26_Sub2_4.anInt2901 / local72;
				local239 = this.anInt2916 + (this.anInt2917 * local24 + local55 + this.anInt2920 * local29 >> 15);
				local250 = arg2.anInt81 + local239 * this.aClass26_Sub2_4.anInt2880 / local95;
				local267 = this.anInt2925 + (this.anInt2923 * local24 + local166 + this.anInt2921 * local29 >> 15);
				local278 = arg2.anInt82 + local267 * this.aClass26_Sub2_4.anInt2901 / local95;
				local295 = this.anInt2916 + (this.anInt2917 * local24 + local55 + this.anInt2920 * local34 >> 15);
				local306 = arg2.anInt81 + local295 * this.aClass26_Sub2_4.anInt2880 / local118;
				local323 = this.anInt2925 + (this.anInt2923 * local24 + local166 + this.anInt2921 * local34 >> 15);
				local334 = arg2.anInt82 + local323 * this.aClass26_Sub2_4.anInt2901 / local118;
				local351 = this.anInt2916 + (this.anInt2917 * local19 + local55 + this.anInt2920 * local34 >> 15);
				local362 = arg2.anInt81 + local351 * this.aClass26_Sub2_4.anInt2880 / local141;
				local379 = this.anInt2925 + (this.anInt2923 * local19 + local166 + this.anInt2921 * local34 >> 15);
				local390 = arg2.anInt82 + local379 * this.aClass26_Sub2_4.anInt2901 / local141;
			}
			if ((local306 - local362) * (local278 - local390) - (local334 - local390) * (local250 - local362) > 0) {
				arg2.aBoolean7 = local306 < 0 || local362 < 0 || local250 < 0 || local306 > arg2.anInt79 || local362 > arg2.anInt79 || local250 > arg2.anInt79;
				if (local6.aShort40 >= 0) {
					if (this.method2318(this.aClass26_Sub2_4.anInterface8_5.method3836(local6.aShort40).aByte59)) {
						arg2.anInt80 = 100;
					}
					arg2.method64(local334, local390, local278, local306, local362, local250, local6.aShort44 & 0xFFFF, local6.aShort41 & 0xFFFF, local6.aShort42 & 0xFFFF, local183, local239, local351, local211, local267, local379, local72, local95, local141, local6.aShort40);
					arg2.anInt80 = 0;
				} else {
					arg2.method65(local334, local390, local278, local306, local362, local250, local6.aShort44 & 0xFFFF, local6.aShort41 & 0xFFFF, local6.aShort42 & 0xFFFF);
				}
			}
			if ((local194 - local250) * (local390 - local278) - (local222 - local278) * (local362 - local250) > 0) {
				arg2.aBoolean7 = local194 < 0 || local250 < 0 || local362 < 0 || local194 > arg2.anInt79 || local250 > arg2.anInt79 || local362 > arg2.anInt79;
				if (local6.aShort40 >= 0) {
					if (this.method2318(this.aClass26_Sub2_4.anInterface8_5.method3836(local6.aShort40).aByte59)) {
						arg2.anInt80 = 100;
					}
					arg2.method64(local222, local278, local390, local194, local250, local362, local6.aShort43 & 0xFFFF, local6.aShort42 & 0xFFFF, local6.aShort41 & 0xFFFF, local183, local239, local351, local211, local267, local379, local72, local95, local141, local6.aShort40);
					arg2.anInt80 = 0;
					return;
				}
				arg2.method65(local222, local278, local390, local194, local250, local362, local6.aShort43 & 0xFFFF, local6.aShort42 & 0xFFFF, local6.aShort41 & 0xFFFF);
			}
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)Z")
	private boolean method2318(@OriginalArg(0) int arg0) {
		if ((this.anInt2918 & 0x8) == 0) {
			return false;
		} else if (arg0 == 4) {
			return true;
		} else if (arg0 == 8) {
			return true;
		} else {
			return arg0 == 9;
		}
	}

	@OriginalMember(owner = "client!hi", name = "I", descriptor = "(II)I")
	@Override
	public int I(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray25[arg0][arg1];
	}

	@OriginalMember(owner = "client!hi", name = "va", descriptor = "(II)I")
	@Override
	public int va(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 >> super.anInt7000;
		@Pc(9) int local9 = arg1 >> super.anInt7000;
		if (local4 < 0 || local9 < 0 || local4 > super.anInt6999 - 1 || local9 > super.anInt7001 - 1) {
			return 0;
		}
		@Pc(34) int local34 = arg0 & super.anInt6997 - 1;
		@Pc(41) int local41 = arg1 & super.anInt6997 - 1;
		@Pc(67) int local67 = this.anIntArrayArray25[local4][local9] * (super.anInt6997 - local34) + this.anIntArrayArray25[local4 + 1][local9] * local34 >> super.anInt7000;
		@Pc(97) int local97 = this.anIntArrayArray25[local4][local9 + 1] * (super.anInt6997 - local34) + this.anIntArrayArray25[local4 + 1][local9 + 1] * local34 >> super.anInt7000;
		return local67 * (super.anInt6997 - local41) + local97 * local41 >> super.anInt7000;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(II)V")
	@Override
	public void method5482(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class146 local4 = this.aClass26_Sub2_4.method2302(Thread.currentThread());
		local4.aClass3_2.anInt80 = 0;
		if (this.aClass258ArrayArray1 != null) {
			this.method2316(arg0, arg1, this.aClass26_Sub2_4.aBoolean260, local4.aClass3_2, local4.anIntArray280, local4.anIntArray285, local4.anIntArray274);
		} else if (this.aClass122ArrayArray1 != null) {
			this.method2317(arg0, arg1, local4.aClass3_2, local4.anIntArray280, local4.anIntArray285, local4.anIntArray274);
		}
	}
}
