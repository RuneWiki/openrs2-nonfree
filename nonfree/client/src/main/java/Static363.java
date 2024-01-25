import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static363 {

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
	public static int anInt6666;

	@OriginalMember(owner = "client!sd", name = "g", descriptor = "Lclient!qs;")
	public static Class211 aClass211_76;

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "Z")
	public static boolean aBoolean422 = false;

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "Lclient!nk;")
	public static final Class177 aClass177_95 = new Class177(79, 3);

	@OriginalMember(owner = "client!sd", name = "n", descriptor = "I")
	public static int anInt6672 = 0;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V")
	public static void method5088() {
		if (Static108.aBoolean158) {
			return;
		}
		Static416.method5655(Static409.aClass252ArrayArrayArray3);
		if (Static53.aClass252ArrayArrayArray1 != null) {
			Static416.method5655(Static53.aClass252ArrayArrayArray1);
		}
		Static108.aBoolean158 = true;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIBI)V")
	public static void method5089(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (Static164.anInt6595 < arg3 || arg2 < Static362.anInt6654) {
			return;
		}
		@Pc(16) boolean local16;
		if (Static105.anInt2417 > arg0) {
			local16 = false;
			arg0 = Static105.anInt2417;
		} else if (arg0 <= Static70.anInt1843) {
			local16 = true;
		} else {
			arg0 = Static70.anInt1843;
			local16 = false;
		}
		@Pc(42) boolean local42;
		if (Static105.anInt2417 > arg1) {
			arg1 = Static105.anInt2417;
			local42 = false;
		} else if (Static70.anInt1843 >= arg1) {
			local42 = true;
		} else {
			local42 = false;
			arg1 = Static70.anInt1843;
		}
		if (arg3 < Static362.anInt6654) {
			arg3 = Static362.anInt6654;
		} else {
			Static228.method3480(arg0, arg4, Static60.anIntArrayArray14[arg3++], arg1);
		}
		if (arg2 <= Static164.anInt6595) {
			Static228.method3480(arg0, arg4, Static60.anIntArrayArray14[arg2--], arg1);
		} else {
			arg2 = Static164.anInt6595;
		}
		@Pc(103) int local103;
		if (local16 && local42) {
			for (local103 = arg3; local103 <= arg2; local103++) {
				@Pc(151) int[] local151 = Static60.anIntArrayArray14[local103];
				local151[arg0] = local151[arg1] = arg4;
			}
		} else if (local16) {
			for (local103 = arg3; local103 <= arg2; local103++) {
				Static60.anIntArrayArray14[local103][arg0] = arg4;
			}
		} else if (local42) {
			for (local103 = arg3; local103 <= arg2; local103++) {
				Static60.anIntArrayArray14[local103][arg1] = arg4;
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)Z")
	public static boolean method5091() {
		if (Static352.aBoolean417) {
			try {
				if ((Boolean) Static466.method4995("showingVideoAd", Static150.aClass183_3.anApplet1)) {
					return false;
				}
				return true;
			} catch (@Pc(18) Throwable local18) {
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IC)Z")
	public static boolean method5092(@OriginalArg(1) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(32) char[] local32 = Static382.aCharArray5;
			for (@Pc(34) int local34 = 0; local34 < local32.length; local34++) {
				@Pc(40) char local40 = local32[local34];
				if (local40 == arg0) {
					return true;
				}
			}
		}
		return false;
	}
}
