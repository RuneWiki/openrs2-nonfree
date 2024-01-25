import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static423 {

	@OriginalMember(owner = "client!nh", name = "I", descriptor = "[[B")
	public static byte[][] aByteArrayArray9;

	@OriginalMember(owner = "client!nh", name = "H", descriptor = "Lclient!kw;")
	public static Class218 aClass218_2;

	@OriginalMember(owner = "client!nh", name = "L", descriptor = "[I")
	public static int[] anIntArray399;

	@OriginalMember(owner = "client!nh", name = "J", descriptor = "I")
	public static int anInt7464;

	@OriginalMember(owner = "client!nh", name = "C", descriptor = "Lclient!tj;")
	public static Class357 aClass357_43 = new Class357();

	@OriginalMember(owner = "client!nh", name = "f", descriptor = "(I)V")
	public static void method6237() {
		Static328.anIntArray320 = null;
		Static510.anIntArray605 = null;
		Static46.anIntArray55 = null;
		Static696.anIntArray609 = null;
		Static335.aBoolean471 = false;
		Static530.anIntArray486 = null;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Ljava/lang/String;IIIIIBI)V")
	public static void method6238(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class19_Sub10 local7 = new Class19_Sub10();
		local7.anInt10016 = arg2;
		local7.anInt10012 = arg1;
		local7.anInt10018 = arg5;
		local7.anInt10015 = arg6;
		local7.anInt10013 = Static269.anInt4883 + arg3;
		local7.aString124 = arg0;
		local7.anInt10019 = arg4;
		Static209.aClass66_3.method1375(local7);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILclient!wk;IILclient!lb;IZ)V")
	public static void method6241(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub22_Sub5 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class221 arg3) {
		Static152.method2444(arg0, arg3, arg2);
		Static713.aClass3_Sub22_Sub5_4 = arg1;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIIIIII)V")
	public static void method6244(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 >= Static85.anInt1313 && Static316.anInt6313 >= arg5 && Static280.anInt5114 <= arg3 && arg2 <= Static356.anInt6028) {
			Static540.method7591(arg2, arg1, arg6, arg0, arg5, arg4, arg3);
		} else {
			Static534.method7513(arg6, arg3, arg0, arg2, arg4, arg5, arg1);
		}
	}

	@OriginalMember(owner = "client!nh", name = "g", descriptor = "(I)V")
	public static void method6246() {
		@Pc(7) Class333 local7 = null;
		try {
			local7 = Static75.method958("2");
			@Pc(20) Class3_Sub28 local20 = new Class3_Sub28(Static345.anInt5905 * 6 + 3);
			local20.method5329(1);
			local20.method5282(Static345.anInt5905);
			for (@Pc(39) int local39 = 0; local39 < Static568.anIntArray608.length; local39++) {
				if (Static214.aBooleanArray11[local39]) {
					local20.method5282(local39);
					local20.method5311(Static568.anIntArray608[local39]);
				}
			}
			local7.method7956(local20.aByteArray50, 0, local20.anInt6241);
		} catch (@Pc(76) Exception local76) {
		}
		try {
			if (local7 != null) {
				local7.method7955();
			}
		} catch (@Pc(83) Exception local83) {
		}
		Static298.aLong137 = Static626.method8479();
		Static171.aBoolean259 = false;
	}
}
