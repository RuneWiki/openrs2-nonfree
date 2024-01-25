import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static315 {

	@OriginalMember(owner = "client!ts", name = "i", descriptor = "Lclient!hi;")
	public static Class80 aClass80_15;

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "I")
	public static int anInt5994 = 0;

	@OriginalMember(owner = "client!ts", name = "f", descriptor = "Lclient!jn;")
	public static final Class106 aClass106_206 = new Class106("K", "T", "K", "K");

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIII)I")
	public static int method5395(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return arg1;
		} else if (local3 == 2) {
			return 1023 - arg0;
		} else {
			return 1023 - arg1;
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method5396(@OriginalArg(1) String arg0) {
		if (!arg0.equals("")) {
			Static280.method5009(Static26.aClass18_24);
			Static339.aClass1_Sub7_Sub2_4.method2121(Static131.method2688(arg0));
			Static339.aClass1_Sub7_Sub2_4.method2106(arg0);
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(Lclient!sn;Z)V")
	public static void method5397(@OriginalArg(0) Class32_Sub6 arg0) {
		arg0.aClass11_Sub2_Sub6_1 = null;
		if (Static116.anInt2535 < 20) {
			Static177.aClass195_6.method5300(arg0);
			Static116.anInt2535++;
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(I[[B[[I[[BLclient!ui;IZ[[BILclient!fp;[[BILclient!ui;)V")
	public static void method5398(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) byte[][] arg3, @OriginalArg(4) Class36 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) byte[][] arg7, @OriginalArg(9) Class63 arg8, @OriginalArg(10) byte[][] arg9, @OriginalArg(11) int arg10, @OriginalArg(12) Class36 arg11) {
		if (Static241.anInt4925 == 0 && !Static298.aBoolean483) {
			Static129.method2660(arg10, arg3, arg7, arg6, arg1, arg5, arg4, arg8, arg2, arg0, arg9, arg11);
		} else {
			Static355.method5865(arg3, arg8, arg11, arg9, arg0, arg2, arg5, arg6, arg1, arg7, arg10, arg4);
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(ZLclient!kg;)V")
	public static void method5400(@OriginalArg(1) Class112 arg0) {
		if (arg0.anInt3373 == 5 && arg0.anInt3451 != -1) {
			Static354.method5854(arg0, Static9.aClass63_1);
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(ILclient!we;II)V")
	public static void method5401(@OriginalArg(1) Class11_Sub2_Sub6_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == arg0.anInt6772 && arg2 != -1) {
			@Pc(75) Class199 local75 = Static161.method3066(arg2);
			@Pc(78) int local78 = local75.anInt6015;
			if (local78 == 1) {
				arg0.anInt6781 = 0;
				arg0.anInt6743 = 0;
				arg0.anInt6761 = arg1;
				arg0.anInt6776 = 0;
				arg0.anInt6794 = 1;
				Static96.method2060(local75, false, arg0.aByte79, arg0.anInt6743, arg0.anInt6729, arg0.anInt6726);
			}
			if (local78 == 2) {
				arg0.anInt6781 = 0;
			}
		} else if (arg2 == -1 || arg0.anInt6772 == -1 || Static161.method3066(arg2).anInt6020 >= Static161.method3066(arg0.anInt6772).anInt6020) {
			arg0.anInt6776 = 0;
			arg0.anInt6781 = 0;
			arg0.anInt6772 = arg2;
			arg0.anInt6761 = arg1;
			arg0.anInt6743 = 0;
			arg0.anInt6796 = arg0.anInt6798;
			arg0.anInt6794 = 1;
			if (arg0.anInt6772 != -1) {
				Static96.method2060(Static161.method3066(arg0.anInt6772), false, arg0.aByte79, arg0.anInt6743, arg0.anInt6729, arg0.anInt6726);
			}
		}
	}
}
