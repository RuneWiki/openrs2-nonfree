import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "[I")
	public static int[] anIntArray434 = new int[32];

	@OriginalMember(owner = "client!wa", name = "e", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1389 = Static65.method1172("bevor Sie den Vorgang wiederholen)3");

	@OriginalMember(owner = "client!wa", name = "i", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1390 = Static65.method1172("<col=ffb000>");

	@OriginalMember(owner = "client!wa", name = "k", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1391 = Static65.method1172("blinken3:");

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(III)V")
	public static void method2826(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static87.anInt2129 < 2 && Static127.anInt3014 == 0 && !Static90.aBoolean94) {
			return;
		}
		@Pc(43) Class46 local43;
		if (Static127.anInt3014 == 1 && Static87.anInt2129 < 2) {
			local43 = Static178.method2860(new Class46[] { Static136.aClass46_1096, Static83.aClass46_696, Static94.aClass46_772, Static91.aClass46_754 });
		} else if (Static90.aBoolean94 && Static87.anInt2129 < 2) {
			local43 = Static178.method2860(new Class46[] { Static182.aClass46_1452, Static83.aClass46_696, Static106.aClass46_837, Static91.aClass46_754 });
		} else {
			local43 = Static178.method2859(Static87.anInt2129 - 1);
		}
		if (Static87.anInt2129 > 2) {
			local43 = Static178.method2860(new Class46[] { local43, Static174.aClass46_1371, Static57.method1068(Static87.anInt2129 - 2), Static114.aClass46_936 });
		}
		@Pc(130) int local130 = Static58.aClass3_Sub2_Sub3_Sub1_Sub1_4.method802(local43, arg0 + 4, arg1 + 15, Static108.aRandom1, Static20.anInt509);
		Static66.method1174(arg0 + 4, arg1, 15, local130 + Static58.aClass3_Sub2_Sub3_Sub1_Sub1_4.method813(local43));
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(Z)V")
	public static void method2827() {
		anIntArray434 = null;
		aClass46_1391 = null;
		aClass46_1389 = null;
		aClass46_1390 = null;
	}

	@OriginalMember(owner = "client!wa", name = "e", descriptor = "(II)Lclient!ve;")
	public static Class3_Sub2_Sub16 method2828(@OriginalArg(0) int arg0) {
		@Pc(10) Class3_Sub2_Sub16 local10 = (Class3_Sub2_Sub16) Static8.aClass57_1.method1719((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static62.aClass44_11.method1624(9, arg0);
		local10 = new Class3_Sub2_Sub16();
		local10.anInt3816 = arg0;
		if (local20 != null) {
			local10.method2743(new Class3_Sub4(local20));
		}
		local10.method2739();
		Static8.aClass57_1.method1717(local10, (long) arg0);
		return local10;
	}
}
