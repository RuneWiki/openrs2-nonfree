import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static288 {

	@OriginalMember(owner = "client!nw", name = "S", descriptor = "I")
	public static int anInt5048 = 0;

	@OriginalMember(owner = "client!nw", name = "X", descriptor = "Lclient!la;")
	public static final Class136 aClass136_134 = new Class136(25, 6);

	@OriginalMember(owner = "client!nw", name = "Z", descriptor = "[I")
	public static final int[] anIntArray324 = new int[250];

	@OriginalMember(owner = "client!nw", name = "ab", descriptor = "[I")
	public static final int[] anIntArray325 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

	@OriginalMember(owner = "client!nw", name = "b", descriptor = "(Z)V")
	public static void method4161() {
		if (Static391.aClass181_8 == null) {
			return;
		}
		if (Static391.aClass181_8.anInt5298 == 1) {
			Static391.aClass181_8 = null;
			return;
		}
		if (Static391.aClass181_8.anInt5298 == 2) {
			Static149.method2335(Static237.aString48, Static442.aClass51_6, 2);
			Static391.aClass181_8 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(ZILclient!qa;I)V")
	public static void method4162(@OriginalArg(1) int arg0, @OriginalArg(2) Class167 arg1, @OriginalArg(3) int arg2) {
		Static76.aClass57ArrayArray1 = new Class57[arg0][arg2];
		Static132.aClass167_4 = arg1;
		if (Static204.anIntArray312 != null) {
			Static61.aClass139_1 = Static321.method4443(Static204.anIntArray312[4], Static204.anIntArray312[1], Static204.anIntArray312[2], Static204.anIntArray312[0], Static204.anIntArray312[5], Static204.anIntArray312[3]);
		}
		Static71.aClass57_1 = new Class57();
		Static163.method5701();
	}
}
