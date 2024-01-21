import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!ef", name = "p", descriptor = "Lclient!ud;")
	public static Class82_Sub1 aClass82_Sub1_8;

	@OriginalMember(owner = "client!ef", name = "t", descriptor = "Lclient!gh;")
	public static Class1_Sub2_Sub1_Sub3_Sub1 aClass1_Sub2_Sub1_Sub3_Sub1_1;

	@OriginalMember(owner = "client!ef", name = "B", descriptor = "I")
	public static int anInt1081;

	@OriginalMember(owner = "client!ef", name = "n", descriptor = "Lclient!dh;")
	public static Class14 aClass14_1 = new Class14();

	@OriginalMember(owner = "client!ef", name = "q", descriptor = "Lclient!tg;")
	public static Class81 aClass81_379 = Static120.method2057("mn");

	@OriginalMember(owner = "client!ef", name = "u", descriptor = "Lclient!tg;")
	public static Class81 aClass81_380 = Static120.method2057("<col=40ff00>");

	@OriginalMember(owner = "client!ef", name = "y", descriptor = "Lclient!tg;")
	private static Class81 aClass81_382 = Static120.method2057("Bad session id)3");

	@OriginalMember(owner = "client!ef", name = "x", descriptor = "Lclient!tg;")
	public static Class81 aClass81_381 = aClass81_382;

	@OriginalMember(owner = "client!ef", name = "z", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray2 = new byte[4][104][104];

	@OriginalMember(owner = "client!ef", name = "A", descriptor = "Lclient!tg;")
	public static Class81 aClass81_383 = Static120.method2057("Unerwartete Antwort vom Anmelde)2Server");

	@OriginalMember(owner = "client!ef", name = "C", descriptor = "I")
	public static int anInt1082 = 0;

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILclient!vb;I)Lclient!sc;")
	public static Class1_Sub2_Sub2_Sub4 method816(@OriginalArg(0) int arg0, @OriginalArg(1) Class82 arg1) {
		return Static113.method1997(arg0, arg1) ? Static136.method2285() : null;
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)V")
	public static void method817() {
		aClass81_379 = null;
		aClass81_382 = null;
		aClass82_Sub1_8 = null;
		aClass81_380 = null;
		aClass14_1 = null;
		aClass1_Sub2_Sub1_Sub3_Sub1_1 = null;
		aByteArrayArrayArray2 = null;
		aClass81_383 = null;
		aClass81_381 = null;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIII)V")
	public static void method818(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 < 128 || arg2 < 128 || arg0 > 13056 || arg2 > 13056) {
			Static78.anInt1832 = -1;
			Static20.anInt507 = -1;
			return;
		}
		@Pc(35) int local35 = Static102.method1694(arg0, Static44.anInt1086, arg2) - arg1;
		@Pc(47) int local47 = arg0 - Static53.anInt1289;
		@Pc(51) int local51 = Class1_Sub2_Sub2_Sub1.anIntArray30[Static106.anInt2331];
		@Pc(55) int local55 = arg2 - Static69.anInt1702;
		@Pc(59) int local59 = Class1_Sub2_Sub2_Sub1.anIntArray30[Static31.anInt838];
		@Pc(63) int local63 = local35 - Static126.anInt2769;
		@Pc(67) int local67 = Class1_Sub2_Sub2_Sub1.anIntArray33[Static106.anInt2331];
		@Pc(71) int local71 = Class1_Sub2_Sub2_Sub1.anIntArray33[Static31.anInt838];
		@Pc(81) int local81 = local71 * local47 + local55 * local59 >> 16;
		@Pc(91) int local91 = local71 * local55 - local59 * local47 >> 16;
		@Pc(93) int local93 = local81;
		@Pc(104) int local104 = local67 * local63 - local91 * local51 >> 16;
		@Pc(114) int local114 = local67 * local91 + local63 * local51 >> 16;
		if (local114 < 50) {
			Static78.anInt1832 = -1;
			Static20.anInt507 = -1;
		} else {
			Static78.anInt1832 = (local104 << 9) / local114 + 167;
			Static20.anInt507 = (local93 << 9) / local114 + 256;
		}
	}
}
