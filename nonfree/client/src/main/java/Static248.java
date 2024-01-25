import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!oa", name = "q", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!oa", name = "l", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_106 = new Class211(100, -2);

	@OriginalMember(owner = "client!oa", name = "m", descriptor = "I")
	public static final int anInt4156 = 1400;

	@OriginalMember(owner = "client!oa", name = "n", descriptor = "I")
	public static int anInt4157 = 0;

	@OriginalMember(owner = "client!oa", name = "o", descriptor = "Lclient!o;")
	public static final Class169 aClass169_223 = new Class169("Discard", "Ablegen", "Jeter", "Descartar");

	@OriginalMember(owner = "client!oa", name = "p", descriptor = "Lclient!je;")
	public static Class117 aClass117_12 = null;

	@OriginalMember(owner = "client!oa", name = "r", descriptor = "[I")
	public static final int[] anIntArray519 = new int[14];

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V")
	public static void method3683() {
		if (Static110.aString69.length() == 0) {
			return;
		}
		Static192.method2752("--> " + Static110.aString69);
		Static187.method2678(false, Static110.aString69);
		Static344.anInt5589 = 0;
		Static281.anInt4884 = 0;
		Static110.aString69 = "";
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIILclient!mp;Lclient!mp;)V")
	public static void method3689(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class25_Sub5 arg3, @OriginalArg(4) Class25_Sub5 arg4) {
		@Pc(4) Class132 local4 = Static18.method2854(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass25_Sub5_1 = arg3;
			local4.aClass25_Sub5_2 = arg4;
		}
	}

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "(B)V")
	public static void method3692() {
		if (Static79.aClass112_2 == null) {
			return;
		}
		if (Static79.aClass112_2.anInt2969 == 1) {
			Static79.aClass112_2 = null;
			return;
		}
		if (Static79.aClass112_2.anInt2969 == 2) {
			Static24.method370(Static213.aString44, Static150.aClass162_2, 2);
			Static79.aClass112_2 = null;
			return;
		}
	}
}
