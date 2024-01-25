import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!cfa", name = "b", descriptor = "[I")
	public static int[] anIntArray112;

	@OriginalMember(owner = "client!cfa", name = "d", descriptor = "I")
	public static int anInt1135 = -1;

	@OriginalMember(owner = "client!cfa", name = "e", descriptor = "I")
	public static final int anInt1136 = 1400;

	@OriginalMember(owner = "client!cfa", name = "h", descriptor = "I")
	public static int anInt1139 = -1;

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(FFFIFLclient!bt;BFIII)[B")
	public static byte[] method1085(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) Class43 arg4, @OriginalArg(7) float arg5) {
		@Pc(18) byte[] local18 = new byte[262144];
		Static303.method4380(arg3, arg5, arg0, arg4, arg2, 0, arg1, local18);
		return local18;
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(III)V")
	public static void method1086(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub2_Sub18 local8 = Static508.method6607(arg0, 13);
		local8.method6227();
		local8.anInt7701 = arg1;
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(ZI)V")
	public static void method1087(@OriginalArg(1) int arg0) {
		@Pc(8) Class2_Sub2_Sub18 local8 = Static508.method6607(arg0, 12);
		local8.method6229();
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(BIII)V")
	public static void method1089(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) int local6 = Static257.aClass2_Sub35_Sub1_1.anInt7490 * arg0 >> 8;
		if (arg2 == -1 && !Static271.aBoolean352) {
			Static266.method3710();
		} else if (arg2 != -1 && (Static491.anInt7770 != arg2 || !Static343.method5007()) && local6 != 0 && !Static271.aBoolean352) {
			Static69.method4393(Static106.aClass229_32, arg2, arg1, local6);
			Static569.method7428();
		}
		if (Static491.anInt7770 != arg2) {
			Static562.aClass2_Sub3_Sub2_6 = null;
		}
		Static491.anInt7770 = arg2;
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IIII)V")
	public static void method1090(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(35) String local35 = "tele " + arg1 + "," + (arg0 >> 6) + "," + (arg2 >> 6) + "," + (arg0 & 0x3F) + "," + (arg2 & 0x3F);
		System.out.println(local35);
		Static66.method1101(true, false, local35);
	}
}
