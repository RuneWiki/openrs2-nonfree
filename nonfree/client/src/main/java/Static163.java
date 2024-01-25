import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!gn", name = "L", descriptor = "Lclient!dv;")
	public static final Class77 aClass77_34 = new Class77(16, 4);

	@OriginalMember(owner = "client!gn", name = "S", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_96 = new Class88("Discard", "Ablegen", "Jeter", "Descartar");

	@OriginalMember(owner = "client!gn", name = "T", descriptor = "Z")
	public static boolean aBoolean313 = false;

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IILclient!mc;)Ljava/lang/String;")
	public static String method3345(@OriginalArg(0) int arg0, @OriginalArg(2) Class198 arg1) {
		if (!Static67.method1529(arg1).method5777(arg0) && arg1.anObjectArray17 == null) {
			return null;
		} else if (arg1.aStringArray32 == null || arg0 >= arg1.aStringArray32.length || arg1.aStringArray32[arg0] == null || arg1.aStringArray32[arg0].trim().length() == 0) {
			return Static470.aBoolean610 ? "Hidden-" + arg0 : null;
		} else {
			return arg1.aStringArray32[arg0];
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lclient!an;BLclient!n;)V")
	public static void method3346(@OriginalArg(0) Class16 arg0, @OriginalArg(2) Interface11 arg1) {
		Static530.anInterface11_14 = arg1;
		Static195.aClass16_50 = arg0;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIILclient!fba;Lclient!fba;)V")
	public static void method3348(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class30_Sub4 arg3, @OriginalArg(4) Class30_Sub4 arg4) {
		@Pc(4) Class37 local4 = Static201.method3812(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass30_Sub4_2 = arg3;
			local4.aClass30_Sub4_1 = arg4;
		}
	}
}
