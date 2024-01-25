import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!hl", name = "M", descriptor = "Lclient!df;")
	public static Class1_Sub9_Sub2 aClass1_Sub9_Sub2_1;

	@OriginalMember(owner = "client!hl", name = "T", descriptor = "I")
	public static int anInt2606;

	@OriginalMember(owner = "client!hl", name = "V", descriptor = "I")
	public static int anInt2607;

	@OriginalMember(owner = "client!hl", name = "S", descriptor = "Lclient!ki;")
	public static final Class137 aClass137_110 = new Class137(57, -1);

	@OriginalMember(owner = "client!hl", name = "U", descriptor = "Z")
	public static boolean aBoolean207 = false;

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(III)Ljava/lang/String;")
	public static String method2181(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg1 - arg0;
		if (local8 < -9) {
			return "<col=ff0000>";
		} else if (local8 < -6) {
			return "<col=ff3000>";
		} else if (local8 < -3) {
			return "<col=ff7000>";
		} else if (local8 < 0) {
			return "<col=ffb000>";
		} else if (local8 > 9) {
			return "<col=00ff00>";
		} else if (local8 > 6) {
			return "<col=40ff00>";
		} else if (local8 > 3) {
			return "<col=80ff00>";
		} else if (local8 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "([IB[J)V")
	public static void method2182(@OriginalArg(0) int[] arg0, @OriginalArg(2) long[] arg1) {
		Static252.method2872(arg1.length - 1, arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!hl", name = "e", descriptor = "(B)V")
	public static void method2183() {
		Static240.method3130(false);
		if (Static120.anInt4988 >= 0 && Static120.anInt4988 != 0) {
			Static330.method4211(Static120.anInt4988);
			Static120.anInt4988 = -1;
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IILclient!cn;Lclient!qa;Lclient!dt;Lclient!um;IB)V")
	public static void method2184(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub7 arg2, @OriginalArg(3) Class128 arg3, @OriginalArg(4) Class56 arg4, @OriginalArg(5) Class244 arg5, @OriginalArg(6) int arg6) {
		@Pc(15) int local15 = arg2.anInt974 - arg0 / 2 - 5;
		@Pc(19) int local19 = arg1 + 2;
		if (arg4.anInt1466 != 0) {
			arg3.method3580(local19, local15, arg5.method5142() * arg6 + arg1 + 1 - local19, arg4.anInt1466, arg0 + 10);
		}
		if (arg4.anInt1488 != 0) {
			arg3.method3551(local15, local19, arg6 * arg5.method5142() + arg1 + 1 - local19, arg0 + 10, arg4.anInt1488);
		}
		@Pc(73) int local73 = arg4.anInt1484;
		if (arg2.aBoolean77 && arg4.anInt1471 != -1) {
			local73 = arg4.anInt1471;
		}
		for (@Pc(86) int local86 = 0; local86 < arg6; local86++) {
			@Pc(92) String local92 = Static144.aStringArray21[local86];
			if (arg6 - 1 > local86) {
				local92 = local92.substring(0, local92.length() - 4);
			}
			arg5.method5141(arg3, local92, arg2.anInt974, arg1, local73);
			arg1 += arg5.method5142();
		}
	}
}
