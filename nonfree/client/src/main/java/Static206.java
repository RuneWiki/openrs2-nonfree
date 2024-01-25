import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!gv", name = "y", descriptor = "I")
	public static int anInt3361;

	@OriginalMember(owner = "client!gv", name = "E", descriptor = "I")
	public static int anInt3368;

	@OriginalMember(owner = "client!gv", name = "D", descriptor = "Lclient!la;")
	public static Class208 aClass208_52;

	@OriginalMember(owner = "client!gv", name = "B", descriptor = "Z")
	public static boolean aBoolean268 = false;

	@OriginalMember(owner = "client!gv", name = "x", descriptor = "Z")
	public static boolean aBoolean269 = false;

	@OriginalMember(owner = "client!gv", name = "C", descriptor = "Lclient!wia;")
	public static final Class387 aClass387_39 = new Class387(55, -1);

	@OriginalMember(owner = "client!gv", name = "G", descriptor = "I")
	public static int anInt3369 = 0;

	@OriginalMember(owner = "client!gv", name = "H", descriptor = "Lclient!el;")
	public static final Class109 aClass109_74 = new Class109(110, 12);

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(Lclient!cja;ILclient!cja;)V")
	public static void method2964(@OriginalArg(0) Class5_Sub5 arg0, @OriginalArg(2) Class5_Sub5 arg1) {
		if (arg1.aClass5_Sub5_65 != null) {
			arg1.method9186();
		}
		arg1.aClass5_Sub5_66 = arg0.aClass5_Sub5_66;
		arg1.aClass5_Sub5_65 = arg0;
		arg1.aClass5_Sub5_65.aClass5_Sub5_66 = arg1;
		arg1.aClass5_Sub5_66.aClass5_Sub5_65 = arg1;
	}

	@OriginalMember(owner = "client!gv", name = "g", descriptor = "(I)V")
	public static void method2965() {
		Static637.aClass5_Sub20_31.method3194(1, Static637.aClass5_Sub20_31.aClass24_Sub25_1);
		Static637.aClass5_Sub20_31.method3194(1, Static637.aClass5_Sub20_31.aClass24_Sub25_2);
		Static637.aClass5_Sub20_31.method3194(2, Static637.aClass5_Sub20_31.aClass24_Sub17_1);
		Static637.aClass5_Sub20_31.method3194(2, Static637.aClass5_Sub20_31.aClass24_Sub17_2);
		Static637.aClass5_Sub20_31.method3194(1, Static637.aClass5_Sub20_31.aClass24_Sub18_1);
		Static637.aClass5_Sub20_31.method3194(1, Static637.aClass5_Sub20_31.aClass24_Sub21_1);
		Static637.aClass5_Sub20_31.method3194(1, Static637.aClass5_Sub20_31.aClass24_Sub13_1);
		Static637.aClass5_Sub20_31.method3194(1, Static637.aClass5_Sub20_31.aClass24_Sub16_1);
		Static637.aClass5_Sub20_31.method3194(1, Static637.aClass5_Sub20_31.aClass24_Sub19_1);
		Static637.aClass5_Sub20_31.method3194(1, Static637.aClass5_Sub20_31.aClass24_Sub3_1);
		Static637.aClass5_Sub20_31.method3194(2, Static637.aClass5_Sub20_31.aClass24_Sub4_1);
		Static637.aClass5_Sub20_31.method3194(1, Static637.aClass5_Sub20_31.aClass24_Sub5_1);
		Static637.aClass5_Sub20_31.method3194(2, Static637.aClass5_Sub20_31.aClass24_Sub28_1);
		Static637.aClass5_Sub20_31.method3194(1, Static637.aClass5_Sub20_31.aClass24_Sub22_1);
		Static637.aClass5_Sub20_31.method3194(0, Static637.aClass5_Sub20_31.aClass24_Sub11_2);
		Static637.aClass5_Sub20_31.method3194(0, Static637.aClass5_Sub20_31.aClass24_Sub11_1);
		Static637.aClass5_Sub20_31.method3194(2, Static637.aClass5_Sub20_31.aClass24_Sub6_1);
		Static637.aClass5_Sub20_31.method3194(0, Static637.aClass5_Sub20_31.aClass24_Sub26_1);
		Static637.aClass5_Sub20_31.method3194(0, Static637.aClass5_Sub20_31.aClass24_Sub14_1);
		Static656.method9062();
		Static637.aClass5_Sub20_31.method3194(0, Static637.aClass5_Sub20_31.aClass24_Sub27_1);
		Static637.aClass5_Sub20_31.method3194(4, Static637.aClass5_Sub20_31.aClass24_Sub2_1);
		Static310.method4717();
		Static277.method4082();
		Static179.aBoolean250 = true;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(Lclient!ib;I)Lclient!cf;")
	public static Class63_Sub1 method2967(@OriginalArg(0) Class5_Sub23 arg0) {
		@Pc(7) Class63 local7 = Static363.method5389(arg0);
		@Pc(11) int local11 = arg0.method8511();
		return new Class63_Sub1(local7.anInt1111, local7.aClass219_4, local7.aClass368_4, local7.anInt1113, local7.anInt1110, local11);
	}
}
