import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!n", name = "l", descriptor = "Lclient!sf;")
	public static Class24_Sub3_Sub2_Sub2 aClass24_Sub3_Sub2_Sub2_4;

	@OriginalMember(owner = "client!n", name = "p", descriptor = "Lclient!bj;")
	public static final Class27 aClass27_96 = new Class27(32, 4);

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(II)V")
	public static void method5392(@OriginalArg(0) int arg0) {
		Static261.anInt4649 = arg0;
		@Pc(7) Class267 local7 = Static412.aClass267_77;
		synchronized (Static412.aClass267_77) {
			Static412.aClass267_77.method6011();
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(III[Ljava/lang/String;)Ljava/lang/String;")
	public static String method5393(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String[] arg2) {
		if (arg1 == 0) {
			return "";
		} else if (arg1 == 1) {
			@Pc(23) String local23 = arg2[arg0];
			return local23 == null ? "null" : local23.toString();
		} else {
			@Pc(34) int local34 = arg0 + arg1;
			@Pc(36) int local36 = 0;
			for (@Pc(38) int local38 = arg0; local38 < local34; local38++) {
				@Pc(44) String local44 = arg2[local38];
				if (local44 == null) {
					local36 += 4;
				} else {
					local36 += local44.length();
				}
			}
			@Pc(63) StringBuffer local63 = new StringBuffer(local36);
			for (@Pc(65) int local65 = arg0; local65 < local34; local65++) {
				@Pc(71) String local71 = arg2[local65];
				if (local71 == null) {
					local63.append("null");
				} else {
					local63.append(local71);
				}
			}
			return local63.toString();
		}
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(B)V")
	public static void method5394() {
		Static173.aClass43_5.method1036();
		Static297.aClass207_5.method4750();
		Static8.aClass100_1.method2415();
		Static342.aClass237_4.method5210();
		Static448.aClass38_4.method860();
		Static313.aClass272_2.method6074();
		Static281.aClass98_3.method2408();
		Static147.aClass107_1.method2637();
		Static189.aClass112_1.method2697();
		Static82.aClass271_1.method6061();
		Static133.aClass223_1.method4953();
		Static300.aClass88_3.method2267();
		Static228.aClass2_4.method7();
		Static376.aClass204_1.method4528();
		Static116.aClass144_1.method3298();
		Static88.aClass47_2.method1072();
		Static314.aClass158_1.method3475();
		Static120.aClass128_1.method3047();
		Static400.aClass165_1.method3681();
		Static394.aClass48_1.method1086();
		Static274.method3862();
		Static173.method2929();
		Static364.method4876();
		Static200.method3157();
		Static209.aClass267_36.method6007(5);
		Static152.aClass267_27.method6007(5);
		Static359.aClass267_64.method6007(5);
		Static432.aClass267_82.method6007(5);
		Static79.aClass267_14.method6007(5);
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!pj;IFFIIIFFFI)[B")
	public static byte[] method5395(@OriginalArg(0) Class189 arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(7) float arg3, @OriginalArg(8) float arg4, @OriginalArg(9) float arg5) {
		@Pc(10) byte[] local10 = new byte[262144];
		Static165.method5192(arg3, arg5, local10, arg0, 0, arg2, arg4, arg1);
		return local10;
	}
}
