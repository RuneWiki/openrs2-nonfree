import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!mq", name = "g", descriptor = "Lclient!ji;")
	public static final Class103 aClass103_1 = new Class103(14, 1);

	@OriginalMember(owner = "client!mq", name = "l", descriptor = "Lclient!ji;")
	public static final Class103 aClass103_2 = new Class103(15, 4);

	@OriginalMember(owner = "client!mq", name = "m", descriptor = "Lclient!ji;")
	public static final Class103 aClass103_3 = new Class103(16, -2);

	@OriginalMember(owner = "client!mq", name = "n", descriptor = "Lclient!ji;")
	public static final Class103 aClass103_4 = new Class103(17, 0);

	@OriginalMember(owner = "client!mq", name = "o", descriptor = "Lclient!ji;")
	public static final Class103 aClass103_5 = new Class103(18, -2);

	@OriginalMember(owner = "client!mq", name = "p", descriptor = "Lclient!ji;")
	public static final Class103 aClass103_6 = new Class103(20, 6);

	@OriginalMember(owner = "client!mq", name = "q", descriptor = "Lclient!ji;")
	public static final Class103 aClass103_7 = new Class103(21, 8);

	@OriginalMember(owner = "client!mq", name = "r", descriptor = "Lclient!ji;")
	public static final Class103 aClass103_8 = new Class103(22, -2);

	@OriginalMember(owner = "client!mq", name = "s", descriptor = "Lclient!ji;")
	public static final Class103 aClass103_9 = new Class103(23, 4);

	@OriginalMember(owner = "client!mq", name = "t", descriptor = "Lclient!ji;")
	public static final Class103 aClass103_10 = new Class103(24, -1);

	@OriginalMember(owner = "client!mq", name = "v", descriptor = "Lclient!jn;")
	public static final Class106 aClass106_138 = new Class106("cyan:", "blaugrün:", "cyan:", "cyan:");

	@OriginalMember(owner = "client!mq", name = "w", descriptor = "Z")
	public static boolean aBoolean304 = false;

	@OriginalMember(owner = "client!mq", name = "x", descriptor = "I")
	public static int anInt4069 = -1;

	@OriginalMember(owner = "client!mq", name = "y", descriptor = "[Lclient!sc;")
	public static final Class159[] aClass159Array1 = new Class159[128];

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIIBIIIIII)V")
	public static void method3760(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(9) int arg6) {
		if (arg3 < 128 || arg4 < 128 || (Static311.anInt5653 - 2) * 128 < arg3 || arg4 > Static189.anInt3820 * 128 - 256) {
			Static168.anIntArray261[0] = Static168.anIntArray261[1] = -1;
			return;
		}
		@Pc(43) int local43 = Static8.method288(arg6, arg3, arg4) - arg5;
		Static341.aClass129_5.method5776(arg0, 0, 0);
		Static9.aClass63_1.method4596(Static341.aClass129_5);
		Static9.aClass63_1.method4603(arg3, local43, arg4, Static168.anIntArray261);
		Static341.aClass129_5.method5776(-arg0, 0, 0);
		Static9.aClass63_1.method4596(Static341.aClass129_5);
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(ICI)I")
	public static int method3762(@OriginalArg(1) char arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg0 << 4;
		if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
			arg0 = Character.toLowerCase(arg0);
			local7 = (arg0 << 4) + 1;
		}
		if (arg0 == 'ñ' && arg1 == 0) {
			local7 = 1762;
		}
		return local7;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V")
	public static void method3764(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		Static42.aString5 = arg0;
		Static76.anInt1694 = arg2;
		Static176.aString59 = arg1;
		if (Static176.aString59.equals("") || Static42.aString5.equals("")) {
			Static171.anInt3577 = 3;
		} else if (Static239.anInt4853 == -1) {
			Static118.anInt2586 = 1;
			Static97.anInt2175 = 0;
			Static246.anInt6967 = 0;
			Static171.anInt3577 = -3;
			@Pc(45) Class1_Sub7 local45 = new Class1_Sub7(128);
			local45.method2121(10);
			local45.method2115((int) (Math.random() * 9.9999999E7D));
			local45.method2124(Static125.method2624(Static176.aString59));
			local45.method2115((int) (Math.random() * 9.9999999E7D));
			local45.method2106(Static42.aString5);
			local45.method2115((int) (Math.random() * 9.9999999E7D));
			local45.method2107(Static255.aBigInteger1, Static318.aBigInteger2);
			Static339.aClass1_Sub7_Sub2_4.anInt2219 = 0;
			Static339.aClass1_Sub7_Sub2_4.method2121(aClass103_10.anInt3138);
			Static339.aClass1_Sub7_Sub2_4.method2121(local45.anInt2219 + 2);
			Static339.aClass1_Sub7_Sub2_4.method2144(571);
			Static339.aClass1_Sub7_Sub2_4.method2133(local45.anInt2219, local45.aByteArray41);
		} else {
			Static149.method2883();
		}
	}
}
