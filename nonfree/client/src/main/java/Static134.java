import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
	public static int anInt4352 = 0;

	@OriginalMember(owner = "client!jk", name = "c", descriptor = "[S")
	public static short[] aShortArray80 = new short[256];

	@OriginalMember(owner = "client!jk", name = "d", descriptor = "I")
	public static int anInt4353 = 1;

	@OriginalMember(owner = "client!jk", name = "g", descriptor = "[I")
	public static int[] anIntArray480 = new int[3];

	@OriginalMember(owner = "client!jk", name = "i", descriptor = "[I")
	public static int[] anIntArray481 = new int[1000];

	@OriginalMember(owner = "client!jk", name = "k", descriptor = "Z")
	public static boolean aBoolean312 = false;

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lclient!rg;I)V")
	public static void method3639(@OriginalArg(0) Class151 arg0) {
		if (Static201.anInt3957 == arg0.anInt4733) {
			Static292.aBooleanArray129[arg0.anInt4716] = true;
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(II)I")
	public static int method3641(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!jk", name = "b", descriptor = "(I)V")
	public static void method3642() {
		@Pc(7) int local7;
		@Pc(17) int local17;
		for (local7 = -1; local7 < Static152.anInt2869; local7++) {
			if (local7 == -1) {
				local17 = 2047;
			} else {
				local17 = Static102.anIntArray188[local7];
			}
			@Pc(25) Class10_Sub5_Sub1 local25 = Static52.aClass10_Sub5_Sub1Array1[local17];
			if (local25 != null && local25.anInt5093 > 0) {
				local25.anInt5093--;
				if (local25.anInt5093 == 0) {
					local25.aString176 = null;
				}
			}
		}
		for (local7 = 0; local7 < Static118.anInt2202; local7++) {
			local17 = Static253.anIntArray547[local7];
			@Pc(66) Class10_Sub5_Sub2 local66 = Static110.aClass10_Sub5_Sub2Array1[local17];
			if (local66 != null && local66.anInt5093 > 0) {
				local66.anInt5093--;
				if (local66.anInt5093 == 0) {
					local66.aString176 = null;
				}
			}
		}
	}
}
