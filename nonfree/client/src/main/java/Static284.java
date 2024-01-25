import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static284 {

	@OriginalMember(owner = "client!sf", name = "r", descriptor = "Lclient!fa;")
	public static Class61 aClass61_1;

	@OriginalMember(owner = "client!sf", name = "M", descriptor = "I")
	public static int anInt5760;

	@OriginalMember(owner = "client!sf", name = "f", descriptor = "I")
	public static int anInt5732 = 99;

	@OriginalMember(owner = "client!sf", name = "g", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray52 = new String[100];

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IZ)V")
	public static void method5095(@OriginalArg(0) int arg0) {
		Static120.anInt2601 = -1;
		Static2.anInt62 = -1;
		Static210.anInt4066 = arg0;
		Static19.method675();
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)I")
	public static int method5096(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static126.anIntArrayArray82 == null ? 0 : Static126.anIntArrayArray82[arg0][arg1] >>> 21 & 0x7F8;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIZ)Ljava/lang/String;")
	public static String method5098(@OriginalArg(0) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : Static184.method3327(arg0);
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IB)I")
	public static int method5100(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Z)V")
	public static void method5104() {
		if (Static124.aClass94_2 != null) {
			Static124.aClass94_2.method5972();
		}
		if (Static221.aClass94_3 != null) {
			Static221.aClass94_3.method5972();
		}
		Static59.method1350(Static103.aBoolean202);
		Static124.aClass94_2 = Static39.method936(0, 22050, Static240.aCanvas4, Static177.aClass168_2);
		Static124.aClass94_2.method5967(Static258.aClass2_Sub3_Sub3_2);
		Static221.aClass94_3 = Static39.method936(1, 2048, Static240.aCanvas4, Static177.aClass168_2);
		Static221.aClass94_3.method5967(Static313.aClass2_Sub3_Sub1_2);
	}
}
