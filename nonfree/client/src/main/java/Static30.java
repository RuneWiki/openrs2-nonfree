import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!de", name = "Z", descriptor = "I")
	public static int anInt948 = 0;

	@OriginalMember(owner = "client!de", name = "kb", descriptor = "Lclient!wf;")
	public static Class87 aClass87_3 = new Class87(512);

	@OriginalMember(owner = "client!de", name = "lb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_313 = null;

	@OriginalMember(owner = "client!de", name = "mb", descriptor = "I")
	public static int anInt956 = 0;

	@OriginalMember(owner = "client!de", name = "nb", descriptor = "I")
	public static int anInt957 = 0;

	@OriginalMember(owner = "client!de", name = "f", descriptor = "(I)V")
	public static void method784() {
		aClass87_3 = null;
		aClass28_313 = null;
	}

	@OriginalMember(owner = "client!de", name = "c", descriptor = "(B)V")
	public static void method785() {
		Static104.aClass63_18.method2344();
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!lc;III)V")
	public static void method786(@OriginalArg(0) Class3_Sub2_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class3_Sub20 local12;
		@Pc(27) Class3_Sub2_Sub1_Sub4 local27;
		if (arg2 < Static90.anInt2564) {
			local12 = Static149.aClass3_Sub20ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local12 != null && local12.aClass84_1 != null && local12.aClass84_1.aClass3_Sub2_Sub1_9 instanceof Class3_Sub2_Sub1_Sub4) {
				local27 = (Class3_Sub2_Sub1_Sub4) local12.aClass84_1.aClass3_Sub2_Sub1_9;
				Static89.method2030(arg0, local27, 128, 0, 0, true);
			}
		}
		if (arg3 < Static90.anInt2564) {
			local12 = Static149.aClass3_Sub20ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local12 != null && local12.aClass84_1 != null && local12.aClass84_1.aClass3_Sub2_Sub1_9 instanceof Class3_Sub2_Sub1_Sub4) {
				local27 = (Class3_Sub2_Sub1_Sub4) local12.aClass84_1.aClass3_Sub2_Sub1_9;
				Static89.method2030(arg0, local27, 0, 0, 128, true);
			}
		}
		if (arg2 < Static90.anInt2564 && arg3 < Static87.anInt2536) {
			local12 = Static149.aClass3_Sub20ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local12 != null && local12.aClass84_1 != null && local12.aClass84_1.aClass3_Sub2_Sub1_9 instanceof Class3_Sub2_Sub1_Sub4) {
				local27 = (Class3_Sub2_Sub1_Sub4) local12.aClass84_1.aClass3_Sub2_Sub1_9;
				Static89.method2030(arg0, local27, 128, 0, 128, true);
			}
		}
		if (arg2 >= Static90.anInt2564 || arg3 <= 0) {
			return;
		}
		local12 = Static149.aClass3_Sub20ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
		if (local12 != null && local12.aClass84_1 != null && local12.aClass84_1.aClass3_Sub2_Sub1_9 instanceof Class3_Sub2_Sub1_Sub4) {
			local27 = (Class3_Sub2_Sub1_Sub4) local12.aClass84_1.aClass3_Sub2_Sub1_9;
			Static89.method2030(arg0, local27, 128, 0, -128, true);
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!hd;I)Lclient!eh;")
	public static Class28 method788(@OriginalArg(0) Class3_Sub8 arg0) {
		return Static45.method1071(arg0);
	}
}
