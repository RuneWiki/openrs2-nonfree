import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static362 {

	@OriginalMember(owner = "client!nr", name = "n", descriptor = "[Lclient!xa;")
	public static Class13[] aClass13Array22;

	@OriginalMember(owner = "client!nr", name = "u", descriptor = "[I")
	public static int[] anIntArray520;

	@OriginalMember(owner = "client!nr", name = "t", descriptor = "[I")
	public static final int[] anIntArray519 = new int[2048];

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(BZ)V")
	public static void method5445(@OriginalArg(1) boolean arg0) {
		if (Static235.aClass45_1 != null) {
			Static235.aClass45_1.method839();
			Static235.aClass45_1 = null;
		}
		Static81.anInt9842 = 0;
		Static409.method7475();
		Static564.method7257();
		for (@Pc(19) int local19 = 0; local19 < 4; local19++) {
			Static15.aClass84Array1[local19].method2344();
		}
		Static245.method4153(false);
		System.gc();
		Static291.method4570();
		Static416.anInt7187 = -1;
		Static327.aBoolean615 = false;
		Static527.method7354(true);
		Static6.anInt97 = 0;
		Static304.anInt5549 = 0;
		Static373.anInt6695 = 0;
		Static236.anInt4754 = 0;
		Static522.anInt8889 = 0;
		Static403.anInt6995 = 0;
		for (@Pc(60) int local60 = 0; local60 < Static186.aClass18Array1.length; local60++) {
			Static186.aClass18Array1[local60] = null;
		}
		Static373.method5587();
		for (@Pc(75) int local75 = 0; local75 < 2048; local75++) {
			Static246.aClass10_Sub1_Sub2_Sub2Array1[local75] = null;
		}
		Static428.anInt7363 = 0;
		Static106.aClass183_8.method4287();
		Static566.anInt9466 = 0;
		Static486.aClass183_34.method4287();
		Static12.method271();
		Static102.anInt2529 = 0;
		Static511.aClass335_2.method7426();
		Static514.method7262();
		Static485.method6742();
		Static325.aClass4_Sub39_1 = null;
		Static173.aLong90 = 0L;
		if (arg0) {
			Static33.method600(12);
			return;
		}
		Static33.method600(3);
		try {
			Static611.method6758("loggedout", Static55.anApplet1);
		} catch (@Pc(124) Throwable local124) {
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(II)V")
	public static void method5446(@OriginalArg(1) int arg0) {
		@Pc(1) Class4_Sub7_Sub3 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class16 local8 = Static45.aClass16Array1[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static357.anInt6212; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static173.anInt3719; local15++) {
						local1 = local8.c(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static41.anInt810;
							@Pc(32) int local32 = local12 << Static41.anInt810;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class16 local41 = Static45.aClass16Array1[local36];
								if (local41 != null) {
									@Pc(53) int local53 = local8.JA(local15, local12) - local41.JA(local15, local12);
									@Pc(67) int local67 = local8.JA(local15 + 1, local12) - local41.JA(local15 + 1, local12);
									@Pc(85) int local85 = local8.JA(local15 + 1, local12 + 1) - local41.JA(local15 + 1, local12 + 1);
									@Pc(99) int local99 = local8.JA(local15, local12 + 1) - local41.JA(local15, local12 + 1);
									local41.aa(local1, local28, (local53 + local67 + local85 + local99) / 4, local32, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}
}
