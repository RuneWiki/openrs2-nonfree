import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static287 {

	@OriginalMember(owner = "client!lu", name = "c", descriptor = "Z")
	public static boolean aBoolean391 = false;

	@OriginalMember(owner = "client!lu", name = "b", descriptor = "(Z)Lclient!ob;")
	public static Class2_Sub35 method4531() {
		if (Static201.aClass249_3 == null || Static113.aClass291_1 == null) {
			return null;
		}
		Static113.aClass291_1.method7334(Static201.aClass249_3);
		@Pc(18) Class2_Sub35 local18 = (Class2_Sub35) Static113.aClass291_1.method7336();
		if (local18 == null) {
			return null;
		} else {
			@Pc(34) Class182 local34 = Static201.aClass56_2.method1680(local18.anInt6264);
			return local34 != null && local34.aBoolean396 && local34.method4598(Static201.anInterface2_2) ? local18 : Static381.method5975();
		}
	}

	@OriginalMember(owner = "client!lu", name = "b", descriptor = "(I)V")
	public static void method4532() {
		if (Static155.aBoolean227) {
			return;
		}
		Static253.aBoolean338 = true;
		Static155.aBoolean227 = true;
		if (Static281.aClass2_Sub19_Sub1_1.aBoolean196) {
			Static161.aFloat56 = (int) Static161.aFloat56 + 191 & 0xFFFFFF80;
		} else {
			Static232.aFloat73 += (24.0F - Static232.aFloat73) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(ZIIZI)Lclient!dda;")
	public static Class53 method4534(@OriginalArg(0) boolean arg0, @OriginalArg(3) boolean arg1, @OriginalArg(4) int arg2) {
		@Pc(10) Class257 local10 = null;
		if (Static153.aClass179_36 != null) {
			local10 = new Class257(arg2, Static153.aClass179_36, Static398.aClass179Array1[arg2], 1000000);
		}
		Static107.aClass164_Sub1Array1[arg2] = Static175.aClass143_1.method3489(local10, Static246.aClass257_2, arg2);
		if (arg0) {
			Static107.aClass164_Sub1Array1[arg2].method4002();
		}
		return new Class53(Static107.aClass164_Sub1Array1[arg2], arg1, 1);
	}
}
