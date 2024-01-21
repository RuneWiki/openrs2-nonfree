import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_157 = Static193.method3027("Geben Sie Ihren Benutzernamen");

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "[I")
	public static final int[] anIntArray27 = new int[2000];

	@OriginalMember(owner = "client!bh", name = "e", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_158 = Static193.method3027("leuchten3:");

	@OriginalMember(owner = "client!bh", name = "f", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_159 = Static193.method3027("Bitte laden Sie die Seite neu)3");

	@OriginalMember(owner = "client!bh", name = "g", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_160 = Static193.method3027("Please check your message)2centre for details)3");

	@OriginalMember(owner = "client!bh", name = "h", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_161 = Static193.method3027("slide:");

	@OriginalMember(owner = "client!bh", name = "k", descriptor = "Lclient!oc;")
	public static Class70 aClass70_162 = aClass70_160;

	@OriginalMember(owner = "client!bh", name = "m", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_163 = aClass70_161;

	@OriginalMember(owner = "client!bh", name = "q", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_164 = Static193.method3027("Benutzen Sie bitte eine andere Welt)3");

	@OriginalMember(owner = "client!bh", name = "r", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_165 = Static193.method3027("<img=0>");

	@OriginalMember(owner = "client!bh", name = "t", descriptor = "Lclient!oc;")
	public static Class70 aClass70_166 = aClass70_161;

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIII)V")
	public static void method298(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static126.method1762(arg1)) {
			Static40.method676(arg2, -1, Static49.aClass6ArrayArray1[arg1], arg0);
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIBI)V")
	public static void method299(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class6 local8 = Static64.method982(arg0, arg2);
		if (local8 != null && local8.anObjectArray19 != null) {
			@Pc(17) Class3_Sub26 local17 = new Class3_Sub26();
			local17.aClass6_116 = local8;
			local17.anObjectArray29 = local8.anObjectArray19;
			Static185.method2901(local17);
		}
		Static117.anInt2370 = arg1;
		Static6.anInt118 = arg2;
		Static5.aBoolean7 = true;
		Static113.anInt2287 = arg0;
		Static9.method237(local8);
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!ce;B)Lclient!fb;")
	public static Class30_Sub1 method301(@OriginalArg(0) Class3_Sub4 arg0) {
		return new Class30_Sub1(arg0.method1267(), arg0.method1267(), arg0.method1267(), arg0.method1267(), arg0.method1271(), arg0.method1278());
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(III[II)V")
	public static void method302(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg1--;
		@Pc(5) int local5 = arg2 - 1;
		@Pc(9) int local9 = local5 - 7;
		while (arg1 < local9) {
			@Pc(12) int local12 = arg1 + 1;
			arg3[local12] = arg0;
			@Pc(17) int local17 = local12 + 1;
			arg3[local17] = arg0;
			@Pc(22) int local22 = local17 + 1;
			arg3[local22] = arg0;
			@Pc(27) int local27 = local22 + 1;
			arg3[local27] = arg0;
			@Pc(32) int local32 = local27 + 1;
			arg3[local32] = arg0;
			@Pc(37) int local37 = local32 + 1;
			arg3[local37] = arg0;
			@Pc(42) int local42 = local37 + 1;
			arg3[local42] = arg0;
			arg1 = local42 + 1;
			arg3[arg1] = arg0;
		}
		while (local5 > arg1) {
			arg1++;
			arg3[arg1] = arg0;
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILclient!oc;B)V")
	public static void method303(@OriginalArg(0) int arg0, @OriginalArg(1) Class70 arg1) {
		@Pc(5) Class70 local5 = arg1.method2028().method2033();
		@Pc(11) boolean local11 = false;
		for (@Pc(20) int local20 = 0; local20 < Static80.anInt1607; local20++) {
			@Pc(27) Class26_Sub2_Sub1 local27 = Static146.aClass26_Sub2_Sub1Array1[Static76.anIntArray81[local20]];
			if (local27 != null && local27.aClass70_952 != null && local27.aClass70_952.method2059(local5)) {
				local11 = true;
				Static103.method1467(false, 1, Static144.aClass26_Sub2_Sub1_1.anIntArray182[0], 0, 1, 0, local27.anIntArray185[0], local27.anIntArray182[0], 2, 0, Static144.aClass26_Sub2_Sub1_1.anIntArray185[0]);
				if (arg0 == 1) {
					Static93.aClass3_Sub4_Sub1_18.method1298(76);
					Static93.aClass3_Sub4_Sub1_18.method1252(Static76.anIntArray81[local20]);
				} else if (arg0 == 4) {
					Static93.aClass3_Sub4_Sub1_18.method1298(227);
					Static93.aClass3_Sub4_Sub1_18.method1289(Static76.anIntArray81[local20]);
				} else if (arg0 == 6) {
					Static93.aClass3_Sub4_Sub1_18.method1298(25);
					Static93.aClass3_Sub4_Sub1_18.method1289(Static76.anIntArray81[local20]);
				} else if (arg0 == 7) {
					Static93.aClass3_Sub4_Sub1_18.method1298(242);
					Static93.aClass3_Sub4_Sub1_18.method1289(Static76.anIntArray81[local20]);
				}
				break;
			}
		}
		if (!local11) {
			Static135.method1934(Static207.method3296(new Class70[] { Static115.aClass70_1125, local5 }), 0, Static61.aClass70_596);
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(BI)V")
	public static void method304(@OriginalArg(1) int arg0) {
		if (Static22.anIntArray32 == null || Static22.anIntArray32.length < arg0) {
			Static22.anIntArray32 = new int[arg0];
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILclient!ce;Lclient!oc;)I")
	public static int method305(@OriginalArg(1) Class3_Sub4 arg0, @OriginalArg(2) Class70 arg1) {
		@Pc(2) int local2 = arg0.anInt1758;
		arg0.method1288(arg1.anInt2899);
		arg0.anInt1758 += Static22.aClass25_1.method684(arg0.aByteArray12, arg0.anInt1758, 0, arg1.aByteArray30, arg1.anInt2899);
		return arg0.anInt1758 - local2;
	}
}
