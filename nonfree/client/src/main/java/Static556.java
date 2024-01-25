import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static556 {

	@OriginalMember(owner = "client!sk", name = "p", descriptor = "[Lclient!s;")
	public static Class35[] aClass35Array2;

	@OriginalMember(owner = "client!sk", name = "c", descriptor = "Z")
	public static boolean aBoolean627 = false;

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(BLclient!mfa;)I")
	public static int method7324(@OriginalArg(1) Class3_Sub5_Sub13 arg0) {
		@Pc(15) String local15 = Static16.method8270(arg0);
		return Static281.aClass91_7.method1857(local15, Static470.aClass6Array11);
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;)V")
	public static void method7325(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(5) String arg5, @OriginalArg(7) String arg6, @OriginalArg(8) String arg7) {
		@Pc(9) Class2 local9 = Class14_Sub26.aClass2Array1[99];
		for (@Pc(11) int local11 = 99; local11 > 0; local11--) {
			Class14_Sub26.aClass2Array1[local11] = Class14_Sub26.aClass2Array1[local11 - 1];
		}
		if (local9 == null) {
			local9 = new Class2(arg4, arg2, arg5, arg6, arg7, arg3, arg0, arg1);
		} else {
			local9.method26(arg1, arg7, arg5, arg2, arg4, arg0, arg3, arg6);
		}
		Static35.anInt820 = Static156.anInt2887;
		Class14_Sub26.aClass2Array1[0] = local9;
		Static480.anInt7634++;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIZ)Ljava/lang/String;")
	public static String method7330(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		return arg1 && arg0 >= 0 ? Static50.method968(arg0, arg1) : Integer.toString(arg0);
	}
}
