import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "I")
	public static int anInt7414;

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(II[Lclient!tf;)V")
	public static void method5956(@OriginalArg(1) int arg0, @OriginalArg(2) Class240[] arg1) {
		for (@Pc(16) int local16 = 0; local16 < arg1.length; local16++) {
			@Pc(22) Class240 local22 = arg1[local16];
			if (local22 != null) {
				if (local22.anInt6873 == 0) {
					if (local22.aClass240Array2 != null) {
						method5956(arg0, local22.aClass240Array2);
					}
					@Pc(46) Class4_Sub39 local46 = (Class4_Sub39) Static157.aClass96_22.method2797((long) local22.anInt6909);
					if (local46 != null) {
						Static132.method2437(local46.anInt6721, arg0);
					}
				}
				@Pc(65) Class4_Sub10 local65;
				if (arg0 == 0 && local22.anObjectArray15 != null) {
					local65 = new Class4_Sub10();
					local65.anObjectArray4 = local22.anObjectArray15;
					local65.aClass240_5 = local22;
					Static64.method1462(local65);
				}
				if (arg0 == 1 && local22.anObjectArray13 != null) {
					if (local22.anInt6885 >= 0) {
						@Pc(93) Class240 local93 = Static92.method1820(local22.anInt6909);
						if (local93 == null || local93.aClass240Array2 == null || local22.anInt6885 >= local93.aClass240Array2.length || local93.aClass240Array2[local22.anInt6885] != local22) {
							continue;
						}
					}
					local65 = new Class4_Sub10();
					local65.aClass240_5 = local22;
					local65.anObjectArray4 = local22.anObjectArray13;
					Static64.method1462(local65);
				}
			}
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(ILclient!rj;)Z")
	public static boolean method5961(@OriginalArg(1) Class219 arg0) {
		return Static432.aClass219_6 == arg0 || Static463.aClass219_7 == arg0 || arg0 == Static357.aClass219_5 || arg0 == Static326.aClass219_3;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lclient!tf;I)Lclient!tf;")
	public static Class240 method5964(@OriginalArg(0) Class240 arg0) {
		@Pc(6) Class240 local6 = Static50.method1131(arg0);
		if (local6 == null) {
			local6 = arg0.aClass240_14;
		}
		return local6;
	}

	@OriginalMember(owner = "client!hr", name = "c", descriptor = "(II)V")
	public static void method5965(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class162 local7 = Static294.aClass162ArrayArrayArray2[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class162 local28 = Static294.aClass162ArrayArrayArray2[local9][arg0][arg1] = Static294.aClass162ArrayArrayArray2[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.aByte61--;
				for (@Pc(40) Class199 local40 = local28.aClass199_1; local40 != null; local40 = local40.aClass199_2) {
					@Pc(44) Class11_Sub5 local44 = local40.aClass11_Sub5_1;
					if (local44.aShort95 == arg0 && local44.aShort93 == arg1) {
						local44.aByte100--;
					}
				}
			}
		}
		if (Static294.aClass162ArrayArrayArray2[0][arg0][arg1] == null) {
			Static294.aClass162ArrayArrayArray2[0][arg0][arg1] = new Class162(0, arg0, arg1);
			Static294.aClass162ArrayArrayArray2[0][arg0][arg1].aByte59 = 1;
		}
		Static294.aClass162ArrayArrayArray2[0][arg0][arg1].aClass162_1 = local7;
		Static294.aClass162ArrayArrayArray2[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IIIZI)V")
	public static void method5967(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		if (Static104.method1974(arg0)) {
			Static170.method2988(Static122.aClass240ArrayArray2[arg0], arg1, -1, arg2, arg3);
		}
	}
}
