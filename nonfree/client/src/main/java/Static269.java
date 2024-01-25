import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!qk", name = "L", descriptor = "[Lclient!hq;")
	public static Class57_Sub1_Sub1_Sub1[] aClass57_Sub1_Sub1_Sub1Array4;

	@OriginalMember(owner = "client!qk", name = "S", descriptor = "[I")
	public static int[] anIntArray507;

	@OriginalMember(owner = "client!qk", name = "M", descriptor = "I")
	public static int anInt6656 = 0;

	@OriginalMember(owner = "client!qk", name = "O", descriptor = "I")
	public static int anInt6658 = -1;

	@OriginalMember(owner = "client!qk", name = "Q", descriptor = "[Z")
	public static final boolean[] aBooleanArray29 = new boolean[100];

	@OriginalMember(owner = "client!qk", name = "R", descriptor = "I")
	public static int anInt6660 = 0;

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIII)V")
	public static void method5570(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class51 local7 = Static196.aClass51ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class1_Sub3 local13 = local7.aClass1_Sub3_2;
		@Pc(16) Class1_Sub3 local16 = local7.aClass1_Sub3_1;
		if (local13 != null) {
			local13.anInt5318 = local13.anInt5318 * arg3 / 16;
			local13.anInt5322 = local13.anInt5322 * arg3 / 16;
		}
		if (local16 != null) {
			local16.anInt5318 = local16.anInt5318 * arg3 / 16;
			local16.anInt5322 = local16.anInt5322 * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(BLclient!iq;Lclient!dr;)V")
	public static void method5572(@OriginalArg(1) Class104 arg0, @OriginalArg(2) Class37 arg1) {
		if (Static161.aBoolean324) {
			return;
		}
		arg1.method3689(0);
		Static284.aClass46_21 = arg1.method3708(Static368.method834(arg0, Static149.anInt3387));
		Static284.aClass46_21.method5016((Static335.anInt6496 - Static284.aClass46_21.method5031()) / 2, (Static25.anInt396 - Static284.aClass46_21.method5022()) / 2);
		Static111.aClass46_9 = arg1.method3708(Static368.method834(arg0, Static257.anInt5343));
		Static111.aClass46_9.method5016((Static335.anInt6496 - Static111.aClass46_9.method5031()) / 2, 18);
		Static161.aBoolean324 = true;
	}

	@OriginalMember(owner = "client!qk", name = "h", descriptor = "(I)V")
	public static void method5573() {
		for (@Pc(10) Class57_Sub6 local10 = (Class57_Sub6) Static67.aClass193_5.method5224(); local10 != null; local10 = (Class57_Sub6) Static67.aClass193_5.method5223()) {
			local10.method3849();
		}
	}

	@OriginalMember(owner = "client!qk", name = "d", descriptor = "(B)V")
	public static void method5576() {
		Static112.aClass68Array2 = null;
		Static31.method431(-1, Static25.anInt396, 0, anInt6658, 0, 0, Static335.anInt6496, 0);
		if (Static112.aClass68Array2 != null) {
			Static49.method940(Static132.aClass68_20.anInt1839, Static90.anInt1766, Static335.anInt6496, -1412584499, Static25.anInt396, 0, Static112.aClass68Array2, Static357.anInt6823, 0);
			Static112.aClass68Array2 = null;
		}
	}
}
