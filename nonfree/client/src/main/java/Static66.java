import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static66 {

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "F")
	public static float aFloat14;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Ljava/lang/String;IZI)V")
	public static void method1166(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		Static111.method1722();
		Static297.method4351();
		Static26.method594();
		Static139.method5492(arg2, arg1, arg0);
		Static61.method1131();
		Static78.method1307(Static119.aClass95_4);
		Static285.method4140(Static119.aClass95_4);
		Static411.method5618(Static142.aClass362_32, Static119.aClass95_4);
		Static220.method3262();
		Static365.method5251(Static266.aClass6Array8);
		Static184.method2885();
		Static136.method2278();
		if (Static221.anInt3831 == 3) {
			Static279.method4069(4);
		} else if (Static221.anInt3831 == 7) {
			Static279.method4069(8);
		} else if (Static221.anInt3831 == 10) {
			Static279.method4069(11);
		} else if (Static221.anInt3831 == 1 || Static221.anInt3831 == 2) {
			Static624.method8428();
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public static boolean method1168(@OriginalArg(0) String arg0) {
		return Static217.aHashtable12.containsKey(arg0);
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)[Lclient!gm;")
	public static Class135[] method1169() {
		return new Class135[] { Static256.aClass135_4, Static352.aClass135_8, Static81.aClass135_11, Static224.aClass135_2, Static621.aClass135_12, Static268.aClass135_5 };
	}
}
