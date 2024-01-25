import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static305 {

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "[Z")
	public static boolean[] aBooleanArray124;

	@OriginalMember(owner = "client!rq", name = "d", descriptor = "I")
	public static int anInt5274 = 1;

	@OriginalMember(owner = "client!rq", name = "e", descriptor = "Z")
	public static boolean aBoolean410 = false;

	@OriginalMember(owner = "client!rq", name = "f", descriptor = "S")
	public static short aShort76 = 32767;

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(IZ)Z")
	public static boolean method4701(@OriginalArg(0) int arg0) {
		Static204.anInt4957 = arg0 + 1 & 0xFFFF;
		Static219.aBoolean316 = true;
		return true;
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method4702(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = Static366.anInt4870;
		@Pc(14) int[] local14 = Static3.anIntArray9;
		@Pc(16) boolean local16 = false;
		for (@Pc(18) int local18 = 0; local18 < local12; local18++) {
			@Pc(26) Class28_Sub1_Sub1_Sub2 local26 = Static308.aClass28_Sub1_Sub1_Sub2Array1[local14[local18]];
			if (local26 != null && local26 != Static226.aClass28_Sub1_Sub1_Sub2_2 && local26.aString51 != null && local26.aString51.equalsIgnoreCase(arg0)) {
				if (arg1 == 1) {
					Static229.method3783(Static34.aClass244_11);
					Static23.aClass3_Sub5_Sub1_1.method2791(0);
					Static23.aClass3_Sub5_Sub1_1.method2732(local14[local18]);
				} else if (arg1 == 4) {
					Static229.method3783(Static352.aClass244_88);
					Static23.aClass3_Sub5_Sub1_1.method2733(0);
					Static23.aClass3_Sub5_Sub1_1.method2732(local14[local18]);
				} else if (arg1 == 5) {
					Static229.method3783(Static344.aClass244_83);
					Static23.aClass3_Sub5_Sub1_1.method2791(0);
					Static23.aClass3_Sub5_Sub1_1.method2762(local14[local18]);
				} else if (arg1 == 6) {
					Static229.method3783(Static56.aClass244_14);
					Static23.aClass3_Sub5_Sub1_1.method2749(local14[local18]);
					Static23.aClass3_Sub5_Sub1_1.method2756(0);
				} else if (arg1 == 7) {
					Static229.method3783(Static372.aClass244_91);
					Static23.aClass3_Sub5_Sub1_1.method2762(local14[local18]);
					Static23.aClass3_Sub5_Sub1_1.method2733(0);
				}
				local16 = true;
				break;
			}
		}
		if (!local16) {
			Static166.method5554(Static133.aClass57_44.method1122(Static66.anInt1307) + arg0);
		}
	}
}
