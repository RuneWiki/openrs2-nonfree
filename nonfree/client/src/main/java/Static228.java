import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "Lclient!um;")
	public static Class243 aClass243_124;

	@OriginalMember(owner = "client!ku", name = "b", descriptor = "I")
	public static int anInt3789;

	@OriginalMember(owner = "client!ku", name = "c", descriptor = "[I")
	public static final int[] anIntArray242 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(B)V")
	public static void method2998() {
		Static239.aClass44_62.method1031();
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "()V")
	public static void method2999() {
		for (@Pc(1) int local1 = 0; local1 < Static371.anInt6082; local1++) {
			@Pc(6) Class2_Sub1 local6 = Static430.aClass2_Sub1Array3[local1];
			Static434.method5733(local6);
			Static430.aClass2_Sub1Array3[local1] = null;
		}
		Static371.anInt6082 = 0;
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(II)V")
	public static void method3000(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class258 local7 = Static319.aClass258ArrayArrayArray3[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class258 local28 = Static319.aClass258ArrayArrayArray3[local9][arg0][arg1] = Static319.aClass258ArrayArrayArray3[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.aByte102--;
				for (@Pc(40) Class122 local40 = local28.aClass122_3; local40 != null; local40 = local40.aClass122_1) {
					@Pc(44) Class2_Sub1 local44 = local40.aClass2_Sub1_1;
					if (local44.aShort107 == arg0 && local44.aShort106 == arg1) {
						local44.aByte105--;
					}
				}
			}
		}
		if (Static319.aClass258ArrayArrayArray3[0][arg0][arg1] == null) {
			Static319.aClass258ArrayArrayArray3[0][arg0][arg1] = new Class258(0, arg0, arg1);
			Static319.aClass258ArrayArrayArray3[0][arg0][arg1].aByte98 = 1;
		}
		Static319.aClass258ArrayArrayArray3[0][arg0][arg1].aClass258_1 = local7;
		Static319.aClass258ArrayArrayArray3[3][arg0][arg1] = null;
	}
}
