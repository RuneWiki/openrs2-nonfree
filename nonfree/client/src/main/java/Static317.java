import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static317 {

	@OriginalMember(owner = "client!nb", name = "O", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!nb", name = "J", descriptor = "Lclient!sd;")
	public static final Class267 aClass267_28 = new Class267(16);

	@OriginalMember(owner = "client!nb", name = "U", descriptor = "Z")
	public static boolean aBoolean393 = false;

	@OriginalMember(owner = "client!nb", name = "V", descriptor = "Lclient!kca;")
	public static final Class158 aClass158_76 = new Class158(46, 8);

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILclient!fa;Lclient!cq;ILjava/lang/String;IILclient!ta;IIILclient!qf;)V")
	public static void method5131(@OriginalArg(0) int arg0, @OriginalArg(1) Class10 arg1, @OriginalArg(2) Class53 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class59 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) Class245 arg10) {
		@Pc(13) int local13;
		if (Static305.anInt5998 == 4) {
			local13 = (int) Static487.aFloat258 & 0x3FFF;
		} else {
			local13 = Static262.anInt5488 + (int) Static487.aFloat258 & 0x3FFF;
		}
		@Pc(34) int local34 = Math.max(arg10.anInt7249 / 2, arg10.anInt7229 / 2) + 10;
		@Pc(43) int local43 = arg6 * arg6 + arg8 * arg8;
		if (local43 > local34 * local34) {
			return;
		}
		@Pc(53) int local53 = Class5.anIntArray761[local13];
		@Pc(57) int local57 = Class5.anIntArray760[local13];
		if (Static305.anInt5998 != 4) {
			local57 = local57 * 256 / (Static509.anInt8869 + 256);
			local53 = local53 * 256 / (Static509.anInt8869 + 256);
		}
		@Pc(88) int local88 = local53 * arg8 + arg6 * local57 >> 14;
		@Pc(99) int local99 = local57 * arg8 - arg6 * local53 >> 14;
		@Pc(106) int local106 = arg2.method1383(null, arg4, 100);
		@Pc(112) int local112 = local88 - local106 / 2;
		@Pc(120) int local120 = arg2.method1386(null, arg4);
		if (-arg10.anInt7249 <= local112 && arg10.anInt7249 >= local112 && local99 >= -arg10.anInt7229 && arg10.anInt7229 >= local99) {
			arg7.method7263(0, arg10.anInt7229 / 2 + arg9 - local120 - arg5 - local99, 50, arg0, arg3, arg1, local112 + arg0 + arg10.anInt7249 / 2, arg4, null, null, arg9, 0, local106);
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIII)V")
	public static void method5133(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 >= Static190.anInt4314 && Static145.anInt2941 >= arg1) {
			@Pc(19) int local19 = Static73.method7829(arg2, Static269.anInt5577, Static81.anInt1788);
			@Pc(25) int local25 = Static73.method7829(arg3, Static269.anInt5577, Static81.anInt1788);
			Static447.method6781(local25, arg0, arg1, local19);
		}
	}

	@OriginalMember(owner = "client!nb", name = "i", descriptor = "(I)Ljava/lang/String;")
	public static String method5134() {
		@Pc(7) String local7 = "www";
		if (Static464.aClass253_15 == Static345.aClass253_11) {
			local7 = "www-wtrc";
		} else if (Static464.aClass253_15 == Static341.aClass253_16) {
			local7 = "www-wtqa";
		} else if (Static464.aClass253_15 == Static92.aClass253_5) {
			local7 = "www-wtwip";
		}
		@Pc(28) String local28 = "";
		if (Static281.aString42 != null) {
			local28 = "/p=" + Static281.aString42;
		}
		return "http://" + local7 + "." + Static222.aClass44_2.aString10 + ".com/l=" + Static193.anInt7803 + "/a=" + Static142.anInt2899 + local28 + "/";
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IBLclient!kea;IZI)V")
	public static void method5135(@OriginalArg(0) int arg0, @OriginalArg(2) Class161 arg1, @OriginalArg(5) int arg2) {
		Static346.aBoolean415 = false;
		Static319.anInt6143 = arg0;
		Static429.anInt7900 = 1;
		Static492.aClass161_108 = arg1;
		Static32.anInt815 = 10000;
		Static339.anInt5660 = 0;
		Static282.anInt5792 = arg2;
	}
}
