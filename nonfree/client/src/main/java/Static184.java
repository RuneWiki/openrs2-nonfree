import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!nn", name = "I", descriptor = "[S")
	public static short[] aShortArray39;

	@OriginalMember(owner = "client!nn", name = "r", descriptor = "I")
	public static int anInt3604 = 2301979;

	@OriginalMember(owner = "client!nn", name = "z", descriptor = "I")
	public static int anInt3611 = -1;

	@OriginalMember(owner = "client!nn", name = "F", descriptor = "I")
	public static int anInt3615 = 0;

	@OriginalMember(owner = "client!nn", name = "G", descriptor = "Ljava/lang/String;")
	public static String aString121 = null;

	@OriginalMember(owner = "client!nn", name = "d", descriptor = "(I)V")
	public static void method2876() {
		Static139.aClass33_23.method839();
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(IIII)V")
	public static void method2878(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(4) Class4_Sub2_Sub21 local4 = Static39.method4121(arg0, 11);
		local4.method4360();
		local4.anInt5492 = arg2;
		local4.anInt5495 = arg1;
	}

	@OriginalMember(owner = "client!nn", name = "e", descriptor = "(I)V")
	public static void method2886() {
		aString121 = null;
		aShortArray39 = null;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lclient!lc;Lclient!kg;IZLclient!lc;)V")
	public static void method2887(@OriginalArg(0) Class98 arg0, @OriginalArg(1) Class4_Sub2_Sub12_Sub1 arg1, @OriginalArg(4) Class98 arg2) {
		Static259.aClass98_151 = arg2;
		Static264.aClass98_154 = arg0;
		Static217.aBoolean285 = true;
		@Pc(15) int local15 = Static264.aClass98_154.method2380() - 1;
		Static225.anInt4475 = Static264.aClass98_154.method2394(local15) + local15 * 256;
		Static134.aStringArray22 = new String[] { null, null, Static179.aString116, null, null };
		Static268.aStringArray35 = new String[] { null, null, null, null, Static136.aString88 };
		Static33.aClass4_Sub2_Sub12_Sub1_2 = arg1;
	}
}
