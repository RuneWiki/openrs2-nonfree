import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static345 {

	@OriginalMember(owner = "client!mia", name = "L", descriptor = "I")
	public static int anInt5827;

	@OriginalMember(owner = "client!mia", name = "w", descriptor = "Lclient!kk;")
	public static final Class199 aClass199_1 = new Class199();

	@OriginalMember(owner = "client!mia", name = "K", descriptor = "[C")
	public static final char[] aCharArray4 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!mia", name = "c", descriptor = "(II)V")
	public static void method5167(@OriginalArg(1) int arg0) {
		@Pc(8) Class5_Sub5_Sub21 local8 = Static101.method1629(14, arg0);
		local8.method8961();
	}

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "(ILclient!gba;B)V")
	public static void method5169(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub22_Sub1 arg1) {
		@Pc(25) boolean local25 = arg1.method2655(1) == 1;
		if (local25) {
			Static523.anIntArray492[Static66.anInt1360++] = arg0;
		}
		@Pc(40) int local40 = arg1.method2655(2);
		@Pc(44) Class4_Sub2_Sub1_Sub1_Sub1 local44 = Static393.aClass4_Sub2_Sub1_Sub1_Sub1Array12[arg0];
		if (local40 != 0) {
			@Pc(152) int local152;
			@Pc(157) int local157;
			@Pc(162) int local162;
			if (local40 == 1) {
				local152 = arg1.method2655(3);
				local157 = local44.anIntArray94[0];
				local162 = local44.anIntArray95[0];
				if (local152 == 0) {
					local157--;
					local162--;
				} else if (local152 == 1) {
					local162--;
				} else if (local152 == 2) {
					local162--;
					local157++;
				} else if (local152 == 3) {
					local157--;
				} else if (local152 == 4) {
					local157++;
				} else if (local152 == 5) {
					local157--;
					local162++;
				} else if (local152 == 6) {
					local162++;
				} else if (local152 == 7) {
					local157++;
					local162++;
				}
				if (local25) {
					local44.anInt909 = local162;
					local44.anInt904 = local157;
					local44.aBoolean46 = true;
				} else {
					local44.method737(local162, local157, Static415.aByteArray72[arg0]);
				}
			} else if (local40 == 2) {
				local152 = arg1.method2655(4);
				local157 = local44.anIntArray94[0];
				local162 = local44.anIntArray95[0];
				if (local152 == 0) {
					local157 -= 2;
					local162 -= 2;
				} else if (local152 == 1) {
					local162 -= 2;
					local157--;
				} else if (local152 == 2) {
					local162 -= 2;
				} else if (local152 == 3) {
					local157++;
					local162 -= 2;
				} else if (local152 == 4) {
					local162 -= 2;
					local157 += 2;
				} else if (local152 == 5) {
					local162--;
					local157 -= 2;
				} else if (local152 == 6) {
					local157 += 2;
					local162--;
				} else if (local152 == 7) {
					local157 -= 2;
				} else if (local152 == 8) {
					local157 += 2;
				} else if (local152 == 9) {
					local157 -= 2;
					local162++;
				} else if (local152 == 10) {
					local157 += 2;
					local162++;
				} else if (local152 == 11) {
					local162 += 2;
					local157 -= 2;
				} else if (local152 == 12) {
					local157--;
					local162 += 2;
				} else if (local152 == 13) {
					local162 += 2;
				} else if (local152 == 14) {
					local157++;
					local162 += 2;
				} else if (local152 == 15) {
					local162 += 2;
					local157 += 2;
				}
				if (local25) {
					local44.anInt909 = local162;
					local44.aBoolean46 = true;
					local44.anInt904 = local157;
				} else {
					local44.method737(local162, local157, Static415.aByteArray72[arg0]);
				}
			} else {
				local152 = arg1.method2655(1);
				@Pc(432) int local432;
				@Pc(440) int local440;
				@Pc(451) int local451;
				@Pc(459) int local459;
				if (local152 == 0) {
					local157 = arg1.method2655(12);
					local162 = local157 >> 10;
					local432 = local157 >> 5 & 0x1F;
					if (local432 > 15) {
						local432 -= 32;
					}
					local440 = local157 & 0x1F;
					if (local440 > 15) {
						local440 -= 32;
					}
					local451 = local432 + local44.anIntArray94[0];
					local459 = local44.anIntArray95[0] + local440;
					if (local25) {
						local44.aBoolean46 = true;
						local44.anInt909 = local459;
						local44.anInt904 = local451;
					} else {
						local44.method737(local459, local451, Static415.aByteArray72[arg0]);
					}
					local44.aByte132 = local44.aByte131 = (byte) (local162 + local44.aByte132 & 0x3);
					if (Static23.method285(local451, local459)) {
						local44.aByte131++;
					}
					if (Static337.anInt5722 == arg0) {
						if (local44.aByte132 != Static636.anInt10567) {
							Static28.aBoolean15 = true;
						}
						Static636.anInt10567 = local44.aByte132;
					}
				} else {
					local157 = arg1.method2655(30);
					local162 = local157 >> 28;
					local432 = local157 >> 14 & 0x3FFF;
					local440 = local157 & 0x3FFF;
					local451 = (local44.anIntArray94[0] + Static565.anInt9560 + local432 & 0x3FFF) - Static565.anInt9560;
					local459 = (Static567.anInt9589 + local44.anIntArray95[0] + local440 & 0x3FFF) - Static567.anInt9589;
					if (local25) {
						local44.aBoolean46 = true;
						local44.anInt904 = local451;
						local44.anInt909 = local459;
					} else {
						local44.method737(local459, local451, Static415.aByteArray72[arg0]);
					}
					local44.aByte132 = local44.aByte131 = (byte) (local44.aByte132 + local162 & 0x3);
					if (Static23.method285(local451, local459)) {
						local44.aByte131++;
					}
					if (arg0 == Static337.anInt5722) {
						Static636.anInt10567 = local44.aByte132;
					}
				}
			}
		} else if (local25) {
			local44.aBoolean46 = false;
		} else if (Static337.anInt5722 == arg0) {
			throw new RuntimeException("s:lr");
		} else {
			@Pc(72) Class264 local72 = Static120.aClass264Array1[arg0] = new Class264();
			local72.anInt7221 = (local44.anIntArray95[0] + Static567.anInt9589 >> 6) + (local44.aByte132 << 28) + (local44.anIntArray94[0] + Static565.anInt9560 >> 6 << 14);
			if (local44.anInt917 == -1) {
				local72.anInt7223 = local44.aClass107_7.method2219();
			} else {
				local72.anInt7223 = local44.anInt917;
			}
			local72.anInt7222 = local44.anInt1272;
			local72.aBoolean516 = local44.aBoolean48;
			if (local44.anInt926 > 0) {
				Static295.method4599(local44);
			}
			Static393.aClass4_Sub2_Sub1_Sub1_Sub1Array12[arg0] = null;
			if (arg1.method2655(1) != 0) {
				Static72.method1222(arg0, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method5170(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(30) String local30;
		if (Static48.anInt995 >= 200 && !Static409.aBoolean218 || Static48.anInt995 >= 200) {
			Static141.method2041(Static174.aClass120_10.method2690(Static266.anInt4796));
			local30 = Static174.aClass120_11.method2690(Static266.anInt4796);
			if (local30 != null) {
				Static141.method2041(local30);
			}
			return;
		}
		local30 = Static156.method2258(arg0);
		if (local30 == null) {
			return;
		}
		for (@Pc(46) int local46 = 0; local46 < Static48.anInt995; local46++) {
			@Pc(54) String local54 = Static156.method2258(Static400.aStringArray55[local46]);
			if (local54 != null && local54.equals(local30)) {
				Static141.method2041(arg0 + Static174.aClass120_38.method2690(Static266.anInt4796));
				return;
			}
			if (Static257.aStringArray32[local46] != null) {
				@Pc(85) String local85 = Static156.method2258(Static257.aStringArray32[local46]);
				if (local85 != null && local85.equals(local30)) {
					Static141.method2041(arg0 + Static174.aClass120_38.method2690(Static266.anInt4796));
					return;
				}
			}
		}
		for (@Pc(124) int local124 = 0; local124 < Static225.anInt4205; local124++) {
			@Pc(132) String local132 = Static156.method2258(Static447.aStringArray59[local124]);
			if (local132 != null && local132.equals(local30)) {
				Static141.method2041(Static174.aClass120_43.method2690(Static266.anInt4796) + arg0 + Static174.aClass120_44.method2690(Static266.anInt4796));
				return;
			}
			if (Static526.aStringArray72[local124] != null) {
				@Pc(168) String local168 = Static156.method2258(Static526.aStringArray72[local124]);
				if (local168 != null && local168.equals(local30)) {
					Static141.method2041(Static174.aClass120_43.method2690(Static266.anInt4796) + arg0 + Static174.aClass120_44.method2690(Static266.anInt4796));
					return;
				}
			}
		}
		if (Static156.method2258(Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.aString17).equals(local30)) {
			Static141.method2041(Static174.aClass120_41.method2690(Static266.anInt4796));
		} else {
			@Pc(222) Class5_Sub48 local222 = Static16.method232(Static167.aClass46_33, Static276.aClass251_2);
			local222.aClass5_Sub22_Sub1_2.method5905(Static381.method5596(arg0));
			local222.aClass5_Sub22_Sub1_2.method5910(arg0);
			Static277.method4436(local222);
		}
	}
}
