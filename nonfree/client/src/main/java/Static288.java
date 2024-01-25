import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static288 {

	@OriginalMember(owner = "client!ol", name = "A", descriptor = "F")
	public static float aFloat56;

	@OriginalMember(owner = "client!ol", name = "C", descriptor = "[Lclient!og;")
	public static Class86[] aClass86Array3;

	@OriginalMember(owner = "client!ol", name = "E", descriptor = "Lclient!ag;")
	public static final Class8 aClass8_5 = new Class8("LIVE", 0);

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(BJ)V")
	public static void method4320(@OriginalArg(1) long arg0) {
		if (Static409.aClass101ArrayArrayArray3 != null) {
			if (Static429.anInt7656 == 1 || Static429.anInt7656 == 5) {
				Static401.method5933(arg0);
			} else if (Static429.anInt7656 == 4) {
				Static368.method4870(arg0);
			}
		}
		Static246.method3821(Static126.aClass66_5, (long) Static66.anInt1741);
		if (Static36.anInt1129 != -1) {
			Static316.method4598(Static36.anInt1129);
		}
		for (@Pc(42) int local42 = 0; local42 < Static386.anInt6857; local42++) {
			if (Static180.aBooleanArray8[local42]) {
				Static256.aBooleanArray16[local42] = true;
			}
			Static43.aBooleanArray4[local42] = Static180.aBooleanArray8[local42];
			Static180.aBooleanArray8[local42] = false;
		}
		Static129.anInt2771 = Static66.anInt1741;
		if (Static126.aClass66_5.method5065()) {
			Static302.aBoolean345 = true;
		}
		if (Static36.anInt1129 != -1) {
			Static386.anInt6857 = 0;
			Static226.method4727();
		}
		Static126.aClass66_5.method5070();
		Static275.method4149(Static126.aClass66_5);
		@Pc(93) int local93 = Static381.method5679();
		if (local93 == -1) {
			local93 = Static327.anInt5630;
		}
		if (local93 == -1) {
			local93 = Static28.anInt815;
		}
		Static238.method3671(local93);
		Static428.method6235(Static302.aClass3_Sub2_Sub1_Sub2_2.aByte103, Static254.anInt4641, Static302.aClass3_Sub2_Sub1_Sub2_2.anInt7207, Static302.aClass3_Sub2_Sub1_Sub2_2.anInt7202);
		Static254.anInt4641 = 0;
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(II)Z")
	public static boolean method4321(@OriginalArg(0) int arg0) {
		return arg0 != 1 && arg0 != 7;
	}
}
