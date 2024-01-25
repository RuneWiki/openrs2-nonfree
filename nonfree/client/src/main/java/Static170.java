import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!fr", name = "e", descriptor = "J")
	public static long aLong96;

	@OriginalMember(owner = "client!fr", name = "d", descriptor = "[I")
	public static final int[] anIntArray219 = new int[2048];

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(III)V")
	public static void method2828(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static154.aFloat9 < Static154.aFloat8) {
			Static154.aFloat9 = (float) ((double) Static154.aFloat9 + (double) Static154.aFloat9 / 30.0D);
			if (Static154.aFloat9 > Static154.aFloat8) {
				Static154.aFloat9 = Static154.aFloat8;
			}
			Static258.method3733();
			Static154.anInt427 = (int) Static154.aFloat9 >> 1;
			Static154.aByteArrayArrayArray2 = Static14.method245(Static154.anInt427);
		} else if (Static154.aFloat9 > Static154.aFloat8) {
			Static154.aFloat9 = (float) ((double) Static154.aFloat9 - (double) Static154.aFloat9 / 30.0D);
			if (Static154.aFloat8 > Static154.aFloat9) {
				Static154.aFloat9 = Static154.aFloat8;
			}
			Static258.method3733();
			Static154.anInt427 = (int) Static154.aFloat9 >> 1;
			Static154.aByteArrayArrayArray2 = Static14.method245(Static154.anInt427);
		}
		if (Static527.anInt8178 != -1 && Static451.anInt7047 != -1) {
			@Pc(79) int local79 = Static527.anInt8178 - Static253.anInt4127;
			if (local79 < 2 || local79 > 2) {
				local79 /= 8;
			}
			@Pc(94) int local94 = Static451.anInt7047 - Static379.anInt5638;
			Static253.anInt4127 -= -local79;
			if (local94 < 2 || local94 > 2) {
				local94 /= 8;
			}
			Static379.anInt5638 += local94;
			if (local79 == 0 && local94 == 0) {
				Static527.anInt8178 = -1;
				Static451.anInt7047 = -1;
			}
			Static258.method3733();
		}
		if (Static215.anInt3479 > 0) {
			Static300.anInt4711--;
			if (Static300.anInt4711 == 0) {
				Static215.anInt3479--;
				Static300.anInt4711 = 100;
			}
		} else {
			Static591.anInt9102 = -1;
			Static294.anInt4646 = -1;
		}
		if (!Static470.aBoolean585 || Static600.aClass163_64 == null) {
			return;
		}
		for (@Pc(152) Class4_Sub32 local152 = (Class4_Sub32) Static600.aClass163_64.method3639(); local152 != null; local152 = (Class4_Sub32) Static600.aClass163_64.method3640()) {
			@Pc(161) Class259 local161 = Static154.aClass59_2.method1798(local152.aClass4_Sub30_1.anInt4794);
			if (local152.method4722(arg0, arg1)) {
				if (local161.aStringArray31 != null) {
					if (local161.aStringArray31[4] != null) {
						Static321.method4431((long) local152.aClass4_Sub30_1.anInt4794, -1, false, local161.aString79, -1, (long) local152.aClass4_Sub30_1.anInt4794, false, 0, 1006, local161.anInt6670, local161.aStringArray31[4], true);
					}
					if (local161.aStringArray31[3] != null) {
						Static321.method4431((long) local152.aClass4_Sub30_1.anInt4794, -1, false, local161.aString79, -1, (long) local152.aClass4_Sub30_1.anInt4794, false, 0, 1001, local161.anInt6670, local161.aStringArray31[3], true);
					}
					if (local161.aStringArray31[2] != null) {
						Static321.method4431((long) local152.aClass4_Sub30_1.anInt4794, -1, false, local161.aString79, -1, (long) local152.aClass4_Sub30_1.anInt4794, false, 0, 1002, local161.anInt6670, local161.aStringArray31[2], true);
					}
					if (local161.aStringArray31[1] != null) {
						Static321.method4431((long) local152.aClass4_Sub30_1.anInt4794, -1, false, local161.aString79, -1, (long) local152.aClass4_Sub30_1.anInt4794, false, 0, 1009, local161.anInt6670, local161.aStringArray31[1], true);
					}
					if (local161.aStringArray31[0] != null) {
						Static321.method4431((long) local152.aClass4_Sub30_1.anInt4794, -1, false, local161.aString79, -1, (long) local152.aClass4_Sub30_1.anInt4794, false, 0, 1004, local161.anInt6670, local161.aStringArray31[0], true);
					}
				}
				if (!local152.aClass4_Sub30_1.aBoolean357) {
					local152.aClass4_Sub30_1.aBoolean357 = true;
					Static237.method3386(Static125.aClass268_14, local152.aClass4_Sub30_1.anInt4794, local161.anInt6670);
				}
				if (local152.aClass4_Sub30_1.aBoolean357) {
					Static237.method3386(Static553.aClass268_35, local152.aClass4_Sub30_1.anInt4794, local161.anInt6670);
				}
			} else if (local152.aClass4_Sub30_1.aBoolean357) {
				local152.aClass4_Sub30_1.aBoolean357 = false;
				Static237.method3386(Static490.aClass268_45, local152.aClass4_Sub30_1.anInt4794, local161.anInt6670);
			}
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(BII)Z")
	public static boolean method2829(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!Static333.aBoolean400) {
			return false;
		}
		@Pc(21) int local21 = arg0 >> 16;
		@Pc(25) int local25 = arg0 & 0xFFFF;
		if (Static392.aClass199ArrayArray2[local21] == null || Static392.aClass199ArrayArray2[local21][local25] == null) {
			return false;
		}
		@Pc(43) Class199 local43 = Static392.aClass199ArrayArray2[local21][local25];
		@Pc(58) Class4_Sub5_Sub17 local58;
		if (arg1 == -1 && local43.anInt4966 == 0) {
			for (local58 = (Class4_Sub5_Sub17) Static87.aClass163_14.method3639(); local58 != null; local58 = (Class4_Sub5_Sub17) Static87.aClass163_14.method3640()) {
				if (local58.anInt7673 == 5 || local58.anInt7673 == 1003 || local58.anInt7673 == 45 || local58.anInt7673 == 49 || local58.anInt7673 == 17) {
					for (@Pc(89) Class199 local89 = Static569.method7534(local58.anInt7676); local89 != null; local89 = Static518.method8704(local89)) {
						if (local89.anInt5041 == local43.anInt5041) {
							return true;
						}
					}
				}
			}
		} else {
			for (local58 = (Class4_Sub5_Sub17) Static87.aClass163_14.method3639(); local58 != null; local58 = (Class4_Sub5_Sub17) Static87.aClass163_14.method3640()) {
				if (local58.anInt7674 == arg1 && local43.anInt5041 == local58.anInt7676 && (local58.anInt7673 == 5 || local58.anInt7673 == 1003 || local58.anInt7673 == 45 || local58.anInt7673 == 49 || local58.anInt7673 == 17)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(II)V")
	public static void method2831(@OriginalArg(1) int arg0) {
		Static320.anInt8925 = arg0;
		Static270.aClass352_38.method7659();
	}
}
