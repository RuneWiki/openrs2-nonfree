import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!bha", name = "q", descriptor = "Z")
	public static boolean aBoolean63 = false;

	@OriginalMember(owner = "client!bha", name = "b", descriptor = "Lclient!pi;")
	public static final Class286 aClass286_13 = new Class286(9, -1);

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(BI)V")
	public static void method636(@OriginalArg(1) int arg0) {
		@Pc(9) Class3_Sub4_Sub2 local9 = Static502.method7211(7, (long) arg0);
		local9.method627();
	}

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(ZI)V")
	public static void method637(@OriginalArg(1) int arg0) {
		if (arg0 != -1 && Static273.aBooleanArray16[arg0]) {
			Static125.aClass221_25.method5066(arg0);
			Static403.aClass20ArrayArray2[arg0] = null;
			Static280.aClass20ArrayArray1[arg0] = null;
			Static273.aBooleanArray16[arg0] = false;
		}
	}

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(IILclient!ha;IIBIIIILclient!q;I)V")
	public static void method638(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class67 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class3_Sub4_Sub17 arg9, @OriginalArg(11) int arg10) {
		if (arg0 > arg6 && arg0 < arg6 + arg7 && arg1 - 13 < arg4 && arg4 < arg1 + 3) {
			arg3 = arg10;
		}
		@Pc(52) String local52 = Static130.method2165(arg9);
		Static427.aClass44_34.method8116(local52, arg6 + 3, arg1, Static432.aClass9Array28, Static28.anIntArray18, arg3);
	}
}
