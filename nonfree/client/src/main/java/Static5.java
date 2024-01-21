import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ae", name = "wc", descriptor = "Z")
	public static boolean aBoolean135 = false;

	@OriginalMember(owner = "client!ae", name = "ed", descriptor = "Lclient!c;")
	public static Class12 aClass12_72 = new Class12(64);

	@OriginalMember(owner = "client!ae", name = "kd", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1412 = Static28.method504("Konfig geladen)3");

	@OriginalMember(owner = "client!ae", name = "ld", descriptor = "J")
	public static volatile long aLong129 = 0L;

	@OriginalMember(owner = "client!ae", name = "md", descriptor = "Lclient!c;")
	public static Class12 aClass12_73 = new Class12(260);

	@OriginalMember(owner = "client!ae", name = "nd", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1413 = Static28.method504("::qa_op_test");

	@OriginalMember(owner = "client!ae", name = "pd", descriptor = "Lclient!ja;")
	private static Class39 aClass39_1415 = Static28.method504("Free world");

	@OriginalMember(owner = "client!ae", name = "od", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1414 = aClass39_1415;

	@OriginalMember(owner = "client!ae", name = "f", descriptor = "(I)Z")
	public static boolean method1912() {
		return Static40.anInt1002 == 0 ? Static80.aClass4_Sub1_Sub1_2.method82() : true;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!sf;B)V")
	public static void method1914(@OriginalArg(0) Class4_Sub19 arg0) {
		@Pc(1) int local1 = 0;
		if (arg0.anInt2726 == 0) {
			local1 = Static101.aClass43_1.method1099(arg0.anInt2728, arg0.anInt2719, arg0.anInt2727);
		}
		if (arg0.anInt2726 == 1) {
			local1 = Static101.aClass43_1.method1087(arg0.anInt2728, arg0.anInt2719, arg0.anInt2727);
		}
		@Pc(42) int local42 = -1;
		if (arg0.anInt2726 == 2) {
			local1 = Static101.aClass43_1.method1117(arg0.anInt2728, arg0.anInt2719, arg0.anInt2727);
		}
		@Pc(59) int local59 = 0;
		if (arg0.anInt2726 == 3) {
			local1 = Static101.aClass43_1.method1113(arg0.anInt2728, arg0.anInt2719, arg0.anInt2727);
		}
		@Pc(76) int local76 = 0;
		if (local1 != 0) {
			local42 = local1 >> 14 & 0x7FFF;
			@Pc(94) int local94 = Static101.aClass43_1.method1075(arg0.anInt2728, arg0.anInt2719, arg0.anInt2727, local1);
			local76 = local94 >> 6 & 0x3;
			local59 = local94 & 0x1F;
		}
		arg0.anInt2716 = local42;
		arg0.anInt2722 = local76;
		arg0.anInt2713 = local59;
	}

	@OriginalMember(owner = "client!ae", name = "h", descriptor = "(B)V")
	public static void method1916() {
		aClass12_73 = null;
		aClass39_1414 = null;
		aClass12_72 = null;
		aClass39_1413 = null;
		aClass39_1412 = null;
		aClass39_1415 = null;
	}
}
