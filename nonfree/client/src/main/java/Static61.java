import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!de", name = "v", descriptor = "[Lclient!dp;")
	public static Class51[] aClass51Array4;

	@OriginalMember(owner = "client!de", name = "F", descriptor = "I")
	public static int anInt1235;

	@OriginalMember(owner = "client!de", name = "s", descriptor = "I")
	public static int anInt1224 = 0;

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(Z)[Lclient!es;")
	public static Class73[] method1004() {
		return new Class73[] { Static314.aClass73_5, Static233.aClass73_4, Static351.aClass73_6, Static93.aClass73_1, Static182.aClass73_3 };
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "([[BLclient!jb;I)V")
	public static void method1005(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) Class115_Sub1 arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(15) int local15 = arg0.length;
		@Pc(36) int local36;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(23) byte[] local23 = arg0[local17];
			if (local23 != null) {
				@Pc(30) Class1_Sub33 local30 = new Class1_Sub33(local23);
				local36 = Static223.anIntArray480[local17] >> 8;
				@Pc(42) int local42 = Static223.anIntArray480[local17] & 0xFF;
				@Pc(49) int local49 = local36 * 64 - Static256.anInt4410;
				@Pc(56) int local56 = local42 * 64 - Static293.anInt5053;
				Static44.method683();
				arg1.method2453(Static293.anInt5053, Static257.aClass222Array1, local30, local49, local56, Static256.anInt4410);
				arg1.method2460(local56, local30, local49, local12, Static66.aClass164_2);
				if (!arg1.aBoolean255 && local36 == Static275.anInt4800 / 8 && local42 == Static35.anInt682 / 8) {
					if (local12[0] == -1) {
						Static177.aClass33_3 = null;
					} else {
						Static177.aClass33_3 = Static274.aClass63_1.method1190(local12[2], local12[0], Static301.aClass31_1, local12[3], local12[1]);
						Static177.anInt1347 = local12[4];
					}
				}
			}
		}
		for (@Pc(135) int local135 = 0; local135 < local15; local135++) {
			@Pc(148) int local148 = (Static223.anIntArray480[local135] >> 8) * 64 - Static256.anInt4410;
			local36 = (Static223.anIntArray480[local135] & 0xFF) * 64 - Static293.anInt5053;
			@Pc(162) byte[] local162 = arg0[local135];
			if (local162 == null && Static35.anInt682 < 800) {
				Static44.method683();
				arg1.method2452(local36, local148);
			}
		}
	}
}
