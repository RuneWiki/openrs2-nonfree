import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!fc", name = "y", descriptor = "Z")
	public static boolean aBoolean366 = false;

	@OriginalMember(owner = "client!fc", name = "B", descriptor = "[I")
	public static final int[] anIntArray320 = new int[500];

	@OriginalMember(owner = "client!fc", name = "C", descriptor = "Z")
	public static boolean aBoolean367 = false;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIII)V")
	public static void method4832(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = Static348.aClass6_Sub22_19.aClass15_Sub18_2.method5678() * arg1 >> 8;
		if (local8 == 0 || arg2 == -1) {
			return;
		}
		if (!Static166.aBoolean250 && Static152.anInt5128 != -1 && Static7.method145() && !Static116.method1910()) {
			Static452.aClass6_Sub3_Sub4_2 = Static504.method8521();
			@Pc(45) Class6_Sub3_Sub4 local45 = Static504.method8522(Static452.aClass6_Sub3_Sub4_2);
			Static647.method8998(local45);
		}
		Static61.method1084(local8, Static292.aClass353_51, arg2);
		Static469.method7115(255, -1);
		Static166.aBoolean250 = true;
	}
}
