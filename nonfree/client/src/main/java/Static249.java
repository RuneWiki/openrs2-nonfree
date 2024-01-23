import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static249 {

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "S")
	public static short aShort34 = 1;

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "I")
	public static int anInt4508 = 0;

	@OriginalMember(owner = "client!rn", name = "c", descriptor = "Z")
	public static boolean aBoolean306 = true;

	@OriginalMember(owner = "client!rn", name = "e", descriptor = "[S")
	public static short[] aShortArray88 = new short[256];

	@OriginalMember(owner = "client!rn", name = "g", descriptor = "[I")
	public static int[] anIntArray394 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!rn", name = "i", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray14 = new int[2][][];

	@OriginalMember(owner = "client!rn", name = "j", descriptor = "Z")
	public static boolean aBoolean307 = false;

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IZ)V")
	public static void method3933(@OriginalArg(1) boolean arg0) {
		Static283.method4351(Static51.anInt1018, Static70.aFloat48, Static96.aFloat63, Static272.aFloat173);
		Static283.method4358(Static180.anInt3464, Static6.anInt56, arg0);
		Static283.method4354((float) Static8.anInt135, (float) Static97.anInt1989, (float) Static208.anInt3973);
		Static283.method4350();
		Static59.aFloat40 = Static154.aFloat87;
		Static59.aFloat38 = Static206.aFloat120;
		Static268.aClass1_Sub2_Sub20_7 = Static22.aClass1_Sub2_Sub20_1;
		Static59.aFloat39 = Static255.aFloat145;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(B)Lclient!ng;")
	public static Class1_Sub2_Sub12 method3934() {
		if (Static109.aClass170_9 == null) {
			return null;
		} else {
			Static117.aClass124_1.method3166(Static109.aClass170_9);
			@Pc(24) Class1_Sub2_Sub12 local24 = (Class1_Sub2_Sub12) Static117.aClass124_1.method3167();
			@Pc(29) Class175 local29 = Static210.method3349(local24.anInt3591);
			return local29 != null && local29.aBoolean342 && local29.method4294() ? local24 : Static274.method4266();
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(Z)V")
	public static void method3935() {
		if (Static16.aClass111_115 != null) {
			@Pc(10) Class111 local10 = Static16.aClass111_115;
			synchronized (Static16.aClass111_115) {
				Static16.aClass111_115 = null;
			}
		}
	}
}
