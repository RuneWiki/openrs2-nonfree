import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static380 {

	@OriginalMember(owner = "client!nm", name = "g", descriptor = "I")
	public static int anInt7245;

	@OriginalMember(owner = "client!nm", name = "c", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_87 = new Class218(34, 12);

	@OriginalMember(owner = "client!nm", name = "d", descriptor = "I")
	public static int anInt7242 = 0;

	@OriginalMember(owner = "client!nm", name = "i", descriptor = "I")
	public static int anInt7247 = 0;

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIII)V")
	public static void method6046(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) int local3 = arg0 << 3;
		@Pc(15) int local15 = arg1 << 3;
		Static502.aFloat230 = local15;
		Static103.aFloat96 = local3;
		if (Static516.anInt9019 == 2) {
			Static166.anInt3989 = local15;
			Static136.anInt3505 = 0;
			Static299.anInt8877 = local3;
		}
		Static522.method7469();
		Static168.aBoolean336 = true;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IILclient!kba;IIIIIILclient!kba;)V")
	public static void method6047(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub3_Sub1_Sub2 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5, @OriginalArg(9) Class2_Sub3_Sub1_Sub2 arg6) {
		@Pc(7) int local7 = arg2.method5305();
		if (local7 == -1) {
			return;
		}
		@Pc(21) Class5 local21 = (Class5) Static214.aClass112_41.method3640((long) local7);
		if (local21 == null) {
			@Pc(28) Class28[] local28 = Static649.method607(Static150.aClass181_34, local7);
			if (local28 == null) {
				return;
			}
			local21 = Static47.aClass33_3.method6161(local28[0], true);
			Static214.aClass112_41.method3636((long) local7, local21);
		}
		Static318.method5388(arg6.anInt10428, arg1 >> 1, arg6.method5308() * 256, arg6.anInt10424, arg4 >> 1, arg6.aByte128, 0);
		@Pc(75) int local75 = arg5 + Static379.anIntArray437[0] - 18;
		@Pc(83) int local83 = Static379.anIntArray437[1] + arg0 - 70;
		@Pc(91) int local91 = local75 + arg3 / 4 * 18;
		@Pc(99) int local99 = local83 + arg3 % 4 * 18;
		local21.method7577(local91, local99);
		if (arg6 == arg2) {
			Static47.aClass33_3.method6156(18, local91 - 1, 18, -256, local99 - 1);
		}
		Static241.method4616(local99 + 18, local99 + -1, local91 + 18, local91 + -1);
		@Pc(135) Class2_Sub7 local135 = Static206.method5563();
		local135.anInt6019 = local91 + 16;
		local135.anInt6018 = local99;
		local135.aClass2_Sub3_Sub1_Sub2_1 = arg2;
		local135.anInt6017 = local91;
		local135.anInt6015 = local99 + 16;
		Static479.aClass375_8.method8639(local135);
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method6049(@OriginalArg(0) String arg0) {
		Static455.aString92 = arg0;
		if (Static632.anApplet2 == null) {
			return;
		}
		try {
			@Pc(17) String local17 = Static632.anApplet2.getParameter("cookieprefix");
			@Pc(21) String local21 = Static632.anApplet2.getParameter("cookiehost");
			@Pc(36) String local36 = local17 + "settings=" + arg0 + "; version=1; path=/; domain=" + local21;
			if (arg0.length() == 0) {
				local36 = local36 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local36 = local36 + "; Expires=" + Static12.method178(Static444.method6719() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static653.method5389(Static632.anApplet2, "document.cookie=\"" + local36 + "\"");
		} catch (@Pc(87) Throwable local87) {
		}
	}
}
