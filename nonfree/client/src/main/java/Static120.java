import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!ga", name = "y", descriptor = "Lclient!wn;")
	public static Class92 aClass92_3;

	@OriginalMember(owner = "client!ga", name = "B", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_30 = new Class186(74, -2);

	@OriginalMember(owner = "client!ga", name = "E", descriptor = "[I")
	public static final int[] anIntArray217 = new int[50];

	@OriginalMember(owner = "client!ga", name = "F", descriptor = "[I")
	public static final int[] anIntArray218 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!ga", name = "G", descriptor = "Lclient!sk;")
	public static final Class231 aClass231_33 = new Class231("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ");

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIIZILclient!lt;)V")
	public static void method1924(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(6) Class158 arg3) {
		Static422.anInt7022 = arg1;
		Static258.anInt4423 = arg0;
		Static411.aClass158_87 = arg3;
		Static61.aBoolean110 = false;
		Static271.anInt4635 = 0;
		Static2.anInt9 = 1;
		Static254.anInt3860 = Static47.aClass6_Sub5_Sub3_7.method3642() / arg2;
		if (Static254.anInt3860 < 1) {
			Static254.anInt3860 = 1;
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(BLclient!tq;II)V")
	public static void method1926(@OriginalArg(1) Class239 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class24 local13 = arg0.method5364(Static44.aClass28_14);
		if (local13 == null) {
			return;
		}
		Static44.aClass28_14.method3570(arg2, arg1, arg2 + arg0.anInt6435, arg1 + arg0.anInt6408);
		if (Static392.anInt6523 >= 3) {
			Static44.aClass28_14.method3582(local13, arg2, arg1);
		} else {
			Static441.aClass12_20.method5661((float) arg2 + (float) arg0.anInt6435 / 2.0F, (float) arg0.anInt6408 / 2.0F + (float) arg1, ((int) -Static397.aFloat99 & 0x3FFF) << 2, local13, arg2, arg1);
		}
	}
}
