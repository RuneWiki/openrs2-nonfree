import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static412 {

	@OriginalMember(owner = "client!on", name = "v", descriptor = "Lclient!cu;")
	public static Class61 aClass61_6;

	@OriginalMember(owner = "client!on", name = "w", descriptor = "[[[Z")
	public static boolean[][][] aBooleanArrayArrayArray2;

	@OriginalMember(owner = "client!on", name = "k", descriptor = "[C")
	public static final char[] aCharArray11 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!on", name = "p", descriptor = "Lclient!maa;")
	public static final Class215 aClass215_11 = new Class215(8, 2);

	@OriginalMember(owner = "client!on", name = "q", descriptor = "I")
	public static int anInt7257 = 0;

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Lclient!al;IIIIILclient!rg;IIIBI)V")
	public static void method6386(@OriginalArg(0) Class15 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class293 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10) {
		Static540.anInt9070 = arg4;
		Static100.anInt2903 = arg1;
		Static303.aClass251_4 = null;
		Static316.aClass15_9 = arg0;
		Static182.anInt3457 = arg8;
		Static528.anInt8948 = arg3;
		Static51.aClass251_1 = null;
		Static407.anInt7176 = arg9;
		Static390.anInt6994 = arg7;
		Static504.aClass293_9 = arg6;
		Static228.aClass251_2 = null;
		Static484.anInt8234 = arg10;
		Static130.anInt2750 = arg2;
		Static196.anInt3670 = arg5;
		Static20.method265();
		Static273.aBoolean385 = true;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IIILclient!ka;ILclient!iha;)V")
	public static void method6388(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class75 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class160 arg4) {
		if (arg2 != null) {
			arg4.method4047(arg2.RA(), arg2.HA(), arg0, arg2.EA(), arg2.G(), arg1, arg2.fa(), arg2.na(), arg3, arg2.V());
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(ZI)V")
	public static void method6389(@OriginalArg(0) boolean arg0) {
		if (arg0 && Static598.aClass3_Sub7_Sub6_3 != null) {
			Static313.anInt6065 = Static598.aClass3_Sub7_Sub6_3.anInt1846;
		} else {
			Static313.anInt6065 = -1;
		}
		Static214.anInt4427 = 0;
		Static165.aClass344_4 = null;
		Static181.aClass216_30 = null;
		Static598.aClass3_Sub7_Sub6_3 = null;
		Static598.method2545();
		Static598.aClass216_26.method5454();
		Static252.aClass61_3 = null;
		Static598.aClass76_2 = null;
		aClass61_6 = null;
		Static108.anInt2182 = -1;
		Static198.aClass103_35 = null;
		Static506.aClass61_7 = null;
		Static370.aClass61_4 = null;
		Static410.aClass61_5 = null;
		Static433.anInt7555 = -1;
		Static153.aClass61_2 = null;
		Static54.aClass61_1 = null;
		Static642.aClass61_8 = null;
		if (Static598.aClass154_2 != null) {
			Static598.aClass154_2.method3946();
			Static598.aClass154_2.method3941(64, 128);
		}
		if (Static598.aClass233_47 != null) {
			Static598.aClass233_47.method5859(64, 64);
		}
		if (Static598.aClass284_2 != null) {
			Static598.aClass284_2.method6914(64);
		}
		Static133.aClass222_30.method5708(64);
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IIBIIII)V")
	public static void method6390(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg4 >= Static474.anInt8118 && arg0 <= Static576.anInt9425 && Static298.anInt5919 <= arg5 && Static596.anInt9703 >= arg3) {
			if (arg1 == 1) {
				Static565.method6918(arg2, arg4, arg3, arg5, arg0);
			} else {
				Static533.method1202(arg5, arg3, arg2, arg1, arg0, arg4);
			}
		} else if (arg1 == 1) {
			Static428.method6534(arg2, arg3, arg0, arg5, arg4);
		} else {
			Static84.method7776(arg1, arg3, arg0, arg5, arg4, arg2);
		}
	}
}
