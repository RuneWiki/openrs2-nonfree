import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static491 {

	@OriginalMember(owner = "client!rfa", name = "B", descriptor = "I")
	public static int anInt8519;

	@OriginalMember(owner = "client!rfa", name = "D", descriptor = "I")
	public static int anInt8521;

	@OriginalMember(owner = "client!rfa", name = "I", descriptor = "F")
	public static float aFloat199;

	@OriginalMember(owner = "client!rfa", name = "N", descriptor = "[[Lclient!jw;")
	public static Class4_Sub1[][] aClass4_Sub1ArrayArray3;

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(ZLjava/lang/String;ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;)V")
	public static void method7315(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5, @OriginalArg(7) String arg6, @OriginalArg(8) String arg7) {
		@Pc(9) Class312 local9 = Static571.aClass312Array1[99];
		for (@Pc(11) int local11 = 99; local11 > 0; local11--) {
			Static571.aClass312Array1[local11] = Static571.aClass312Array1[local11 - 1];
		}
		if (local9 == null) {
			local9 = new Class312(arg5, arg3, arg0, arg4, arg2, arg7, arg1, arg6);
		} else {
			local9.method7739(arg2, arg7, arg0, arg6, arg5, arg1, arg3, arg4);
		}
		Static540.anInt9169++;
		Static501.anInt8624 = Static371.anInt7006;
		Static571.aClass312Array1[0] = local9;
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(ILclient!ha;)V")
	public static void method7316(@OriginalArg(1) Class5 arg0) {
		if (Static519.aBoolean557) {
			Static642.method8746(arg0);
		} else {
			Static386.method6222(arg0);
		}
	}
}
