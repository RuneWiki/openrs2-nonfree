import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static414 {

	@OriginalMember(owner = "client!ot", name = "B", descriptor = "I")
	public static int anInt7736;

	@OriginalMember(owner = "client!ot", name = "v", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_95 = new Class218(31, 0);

	@OriginalMember(owner = "client!ot", name = "z", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_96 = new Class218(79, 3);

	@OriginalMember(owner = "client!ot", name = "D", descriptor = "[F")
	public static final float[] aFloatArray61 = new float[16];

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(IIBLclient!kba;III)V")
	public static void method6478(@OriginalArg(0) int arg0, @OriginalArg(3) Class2_Sub3_Sub1_Sub2 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		Static318.method5388(arg1.anInt10428, arg0, 0, arg1.anInt10424, arg3, arg1.aByte128, arg2);
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(IB)I")
	public static int method6479(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(III)Z")
	public static boolean method6480(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static554.method7815(arg1, arg0) | (arg1 & 0x70000) != 0 || Static30.method570(arg0, arg1);
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(Lclient!ha;Lclient!jo;IIIIIIIIII)V")
	public static void method6482(@OriginalArg(0) Class33 arg0, @OriginalArg(1) Class3_Sub1_Sub10 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg4 < arg7 && arg7 < arg4 + arg9 && arg10 > arg3 - 13 && arg3 + 3 > arg10) {
			arg8 = arg2;
		}
		@Pc(32) String local32 = method6483(arg1);
		Static16.aClass25_1.method5846(Static603.aClass5Array20, arg8, local32, arg3, arg4 + 3, Static610.anIntArray611);
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(BLclient!jo;)Ljava/lang/String;")
	public static String method6483(@OriginalArg(1) Class3_Sub1_Sub10 arg0) {
		return arg0.aString59 + " <col=ffffff>>";
	}
}
