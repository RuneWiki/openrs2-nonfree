import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!sa", name = "i", descriptor = "[I")
	public static int[] anIntArray375;

	@OriginalMember(owner = "client!sa", name = "n", descriptor = "Lclient!ue;")
	public static Class76_Sub1 aClass76_Sub1_14;

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "Z")
	public static boolean aBoolean149 = true;

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "Lclient!rf;")
	private static Class70 aClass70_1347 = Static49.method1293("Select");

	@OriginalMember(owner = "client!sa", name = "f", descriptor = "I")
	public static int anInt3975 = 0;

	@OriginalMember(owner = "client!sa", name = "m", descriptor = "Lclient!rf;")
	private static Class70 aClass70_1350 = Static49.method1293("Examine");

	@OriginalMember(owner = "client!sa", name = "g", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1348 = aClass70_1350;

	@OriginalMember(owner = "client!sa", name = "j", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1349 = aClass70_1347;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!mh;)V")
	public static void method3044(@OriginalArg(0) Class53 arg0) {
		for (@Pc(2) int local2 = arg0.anInt3109; local2 <= arg0.anInt3111; local2++) {
			for (@Pc(6) int local6 = arg0.anInt3107; local6 <= arg0.anInt3101; local6++) {
				@Pc(16) Class1_Sub17 local16 = Static90.aClass1_Sub17ArrayArrayArray1[arg0.anInt3113][local2][local6];
				if (local16 != null) {
					@Pc(35) int local35;
					for (@Pc(20) int local20 = 0; local20 < local16.anInt2953; local20++) {
						if (local16.aClass53Array2[local20] == arg0) {
							local16.anInt2953--;
							for (local35 = local20; local35 < local16.anInt2953; local35++) {
								local16.aClass53Array2[local35] = local16.aClass53Array2[local35 + 1];
								local16.anIntArray288[local35] = local16.anIntArray288[local35 + 1];
							}
							local16.aClass53Array2[local16.anInt2953] = null;
							break;
						}
					}
					local16.anInt2949 = 0;
					for (local35 = 0; local35 < local16.anInt2953; local35++) {
						local16.anInt2949 |= local16.anIntArray288[local35];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V")
	public static void method3046() {
		aClass76_Sub1_14 = null;
		aClass70_1347 = null;
		aClass70_1348 = null;
		aClass70_1349 = null;
		aClass70_1350 = null;
		anIntArray375 = null;
	}
}
