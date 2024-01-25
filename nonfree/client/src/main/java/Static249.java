import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static249 {

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "()V")
	public static void method3166() {
		for (@Pc(1) int local1 = 0; local1 < Static289.anInt4758; local1++) {
			@Pc(6) Class3_Sub4 local6 = Static117.aClass3_Sub4Array3[local1];
			Static294.method794(local6);
			Static117.aClass3_Sub4Array3[local1] = null;
		}
		Static289.anInt4758 = 0;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!tn;Z)Z")
	public static boolean method3169(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static345.aClass162Array3 == Static109.aClass162Array1;
		@Pc(8) int local8 = 0;
		@Pc(10) short local10 = 0;
		@Pc(12) byte local12 = 0;
		arg0.method5288();
		if (arg0.aShort92 < 0 || arg0.aShort89 < 0 || arg0.aShort91 >= Static169.anInt2876 || arg0.aShort90 >= Static316.anInt5459) {
			return false;
		}
		@Pc(38) int local38;
		for (@Pc(34) int local34 = arg0.aShort92; local34 <= arg0.aShort91; local34++) {
			for (local38 = arg0.aShort89; local38 <= arg0.aShort90; local38++) {
				@Pc(45) Class270 local45 = Static62.method926(arg0.aByte91, local34, local38);
				if (local45 != null) {
					@Pc(49) int local49 = 0;
					if (local34 > arg0.aShort92) {
						local49++;
					}
					if (local34 < arg0.aShort91) {
						local49 += 4;
					}
					if (local38 > arg0.aShort89) {
						local49 += 8;
					}
					if (local38 < arg0.aShort90) {
						local49 += 2;
					}
					@Pc(74) Class241 local74 = Static185.method2538(arg0, local49);
					@Pc(77) Class241 local77 = local45.aClass241_2;
					if (local77 == null) {
						local45.aClass241_2 = local74;
					} else {
						while (local77.aClass241_1 != null) {
							local77 = local77.aClass241_1;
						}
						local77.aClass241_1 = local74;
					}
					local45.aByte100 = (byte) (local45.aByte100 | local49);
					if (local6 && (Static329.anIntArrayArray42[local34][local38] & 0xFF000000) != 0) {
						local8 = Static329.anIntArrayArray42[local34][local38];
						local10 = Static116.aShortArrayArray2[local34][local38];
						local12 = Static94.aByteArrayArray60[local34][local38];
					}
				}
			}
		}
		if (local6 && (local8 & 0xFF000000) != 0) {
			for (local38 = arg0.aShort92; local38 <= arg0.aShort91; local38++) {
				for (@Pc(150) int local150 = arg0.aShort89; local150 <= arg0.aShort90; local150++) {
					if ((Static329.anIntArrayArray42[local38][local150] & 0xFF000000) == 0) {
						Static329.anIntArrayArray42[local38][local150] = local8;
						Static116.aShortArrayArray2[local38][local150] = local10;
						Static94.aByteArrayArray60[local38][local150] = local12;
					}
				}
			}
		}
		if (arg1) {
			Static117.aClass3_Sub4Array3[Static289.anInt4758++] = arg0;
		}
		return true;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!za;Lclient!lb;IIIII)V")
	public static void method3170(@OriginalArg(0) Class163 arg0, @OriginalArg(1) Class3 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg3;
		@Pc(7) int local7 = arg3 + arg5;
		@Pc(11) int local11 = arg4 - 1;
		@Pc(15) int local15 = arg4 + arg6;
		for (@Pc(17) int local17 = arg2; local17 <= arg2 + 1; local17++) {
			if (local17 != Static289.anInt4757) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static169.anInt2876) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static316.anInt5459 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg4 && local23 != arg3)) {
								@Pc(62) Class270 local62 = Static309.aClass270ArrayArrayArray3[local17][local23][local32];
								if (local62 != null) {
									@Pc(140) int local140 = (Static345.aClass162Array3[local17].ua(local23, local32) + Static345.aClass162Array3[local17].ua(local23 + 1, local32) + Static345.aClass162Array3[local17].ua(local23, local32 + 1) + Static345.aClass162Array3[local17].ua(local23 + 1, local32 + 1)) / 4 - (Static345.aClass162Array3[arg2].ua(arg3, arg4) + Static345.aClass162Array3[arg2].ua(arg3 + 1, arg4) + Static345.aClass162Array3[arg2].ua(arg3, arg4 + 1) + Static345.aClass162Array3[arg2].ua(arg3 + 1, arg4 + 1)) / 4;
									@Pc(143) Class3_Sub2 local143 = local62.aClass3_Sub2_3;
									@Pc(146) Class3_Sub2 local146 = local62.aClass3_Sub2_2;
									if (local143 != null && local143.method5277()) {
										arg1.method5281(local143, (local23 - arg3) * Static67.anInt1221 + (1 - arg5) * Static179.anInt3078, local1, (local32 - arg4) * Static67.anInt1221 + (1 - arg6) * Static179.anInt3078, local140, arg0);
									}
									if (local146 != null && local146.method5277()) {
										arg1.method5281(local146, (local23 - arg3) * Static67.anInt1221 + (1 - arg5) * Static179.anInt3078, local1, (local32 - arg4) * Static67.anInt1221 + (1 - arg6) * Static179.anInt3078, local140, arg0);
									}
									for (@Pc(219) Class241 local219 = local62.aClass241_2; local219 != null; local219 = local219.aClass241_1) {
										@Pc(223) Class3_Sub4 local223 = local219.aClass3_Sub4_2;
										if (local223 != null && local223.method5277() && (local23 == local223.aShort92 || local23 == local3) && (local32 == local223.aShort89 || local32 == local11)) {
											@Pc(252) int local252 = local223.aShort91 + 1 - local223.aShort92;
											@Pc(260) int local260 = local223.aShort90 + 1 - local223.aShort89;
											arg1.method5281(local223, (local223.aShort92 - arg3) * Static67.anInt1221 + (local252 - arg5) * Static179.anInt3078, local1, (local223.aShort89 - arg4) * Static67.anInt1221 + (local260 - arg6) * Static179.anInt3078, local140, arg0);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method3171(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			@Pc(23) char local23 = arg0.charAt(local17);
			if (local23 == '<' || local23 == '>') {
				local15 += 3;
			}
		}
		@Pc(43) StringBuffer local43 = new StringBuffer(local15 + local8);
		for (@Pc(45) int local45 = 0; local45 < local8; local45++) {
			@Pc(51) char local51 = arg0.charAt(local45);
			if (local51 == '<') {
				local43.append("<lt>");
			} else if (local51 == '>') {
				local43.append("<gt>");
			} else {
				local43.append(local51);
			}
		}
		return local43.toString();
	}
}
