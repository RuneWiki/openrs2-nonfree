import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!cc", name = "g", descriptor = "Lclient!hh;")
	public static Class109 aClass109_20;

	@OriginalMember(owner = "client!cc", name = "k", descriptor = "I")
	public static int anInt686;

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
	public static int anInt680 = -1;

	@OriginalMember(owner = "client!cc", name = "l", descriptor = "Z")
	public static boolean aBoolean63 = true;

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V")
	public static void method579() {
		if (Static447.aClass121_11 == null) {
			return;
		}
		Static249.aClass242_3.method5505();
		Static11.method190();
		Static33.method459();
		Static367.method5227();
		Static428.method5775();
		Static47.method639();
		if (Static448.aClass223_1 != null) {
			Static448.aClass223_1.method5315();
		}
		Static205.method4047();
		Static278.method5798();
		Static210.method3171();
		Static84.method4897(false);
		Static378.method5325();
		for (@Pc(43) int local43 = 0; local43 < 2048; local43++) {
			@Pc(49) Class47_Sub1_Sub5_Sub2 local49 = Static362.aClass47_Sub1_Sub5_Sub2Array1[local43];
			if (local49 != null) {
				local49.aClass1_Sub36_3 = null;
				for (@Pc(56) int local56 = 0; local56 < local49.aClass37Array3.length; local56++) {
					local49.aClass37Array3[local56] = null;
				}
			}
		}
		for (@Pc(77) int local77 = 0; local77 < Static307.aClass47_Sub1_Sub5_Sub1Array1.length; local77++) {
			@Pc(83) Class47_Sub1_Sub5_Sub1 local83 = Static307.aClass47_Sub1_Sub5_Sub1Array1[local77];
			if (local83 != null) {
				for (@Pc(87) int local87 = 0; local87 < local83.aClass37Array3.length; local87++) {
					local83.aClass37Array3[local87] = null;
				}
			}
		}
		Static447.aClass121_11.method4598();
		Static447.aClass121_11 = null;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(III)Z")
	public static boolean method582(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "(I)[Lclient!ck;")
	public static Class44[] method584() {
		return new Class44[] { Static121.aClass44_1, Static121.aClass44_2, Static121.aClass44_3, Static121.aClass44_4, Static121.aClass44_5, Static121.aClass44_6, Static121.aClass44_7, Static121.aClass44_8, Static121.aClass44_9, Static121.aClass44_10 };
	}
}
