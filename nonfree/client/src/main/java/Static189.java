import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "[S")
	public static short[] aShortArray81 = new short[256];

	@OriginalMember(owner = "client!lo", name = "g", descriptor = "I")
	public static int anInt5795 = -1;

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(ILclient!on;)Lclient!on;")
	public static Class146 method5115(@OriginalArg(1) Class146 arg0) {
		@Pc(6) Class146 local6 = Static43.method1050(arg0);
		if (local6 == null) {
			local6 = arg0.aClass146_12;
		}
		return local6;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IILjava/lang/String;IIII)V")
	public static void method5117(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) Class55_Sub5 local7 = new Class55_Sub5();
		local7.anInt3709 = arg3;
		local7.anInt3711 = arg4;
		local7.anInt3714 = arg2;
		local7.aString33 = arg1;
		local7.anInt3713 = Static212.anInt4090 + arg0;
		local7.anInt3712 = arg5;
		Static31.aClass67_4.method2100(local7);
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Z)V")
	public static void method5118() {
		if (Static291.aString57.length() == 0) {
			return;
		}
		Static261.method4670("--> " + Static291.aString57);
		Static24.method736(Static291.aString57, false);
		Static345.anInt654 = 0;
		Static291.aString57 = "";
		Static209.anInt4724 = 0;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lclient!tq;I)V")
	public static void method5120(@OriginalArg(0) Class191 arg0) {
		Static11.aClass191_10 = arg0;
	}
}
