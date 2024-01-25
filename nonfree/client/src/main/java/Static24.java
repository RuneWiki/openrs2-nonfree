import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static24 {

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "Lclient!qs;")
	public static Class211 aClass211_8;

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "Ljava/lang/Object;")
	public static Object anObject1;

	@OriginalMember(owner = "client!bb", name = "h", descriptor = "Lclient!fp;")
	public static Class1_Sub18 aClass1_Sub18_1;

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "I")
	public static int anInt605 = 0;

	@OriginalMember(owner = "client!bb", name = "e", descriptor = "Lclient!bu;")
	public static final Class38 aClass38_3 = new Class38(64);

	@OriginalMember(owner = "client!bb", name = "f", descriptor = "[[I")
	public static final int[][] anIntArrayArray9 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method499(@OriginalArg(0) String arg0) {
		if (Static216.aClass186Array1 != null) {
			Static32.method677(Static101.aClass177_34);
			Static433.aClass1_Sub3_Sub1_11.method1208(Static146.method2347(arg0));
			Static433.aClass1_Sub3_Sub1_11.method1190(arg0);
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/String;)V")
	public static void method500(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		Static194.aString35 = arg0;
		Static92.aString19 = arg1;
		if (Static165.anInt3454 != 3 && (Static92.aString19.equals("") || Static194.aString35.equals(""))) {
			Static53.method992(3);
			return;
		}
		Static259.aBoolean313 = false;
		if (Static165.anInt3454 != 1) {
			Static432.anInt7626 = -1;
			Static305.anInt5745 = 0;
		}
		Static53.method992(-3);
		Static168.anInt1662 = 0;
		Static97.anInt2331 = 1;
		Static36.anInt7167 = 0;
	}
}
