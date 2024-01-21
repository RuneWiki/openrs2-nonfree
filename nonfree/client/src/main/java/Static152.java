import java.awt.Component;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!qd", name = "r", descriptor = "[Lclient!ba;")
	public static Class11[] aClass11Array2;

	@OriginalMember(owner = "client!qd", name = "v", descriptor = "[I")
	public static int[] anIntArray280;

	@OriginalMember(owner = "client!qd", name = "k", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1487 = Static187.method3089("Das ist eine Mitglieder)2Welt(Q");

	@OriginalMember(owner = "client!qd", name = "l", descriptor = "I")
	public static int anInt3135 = 0;

	@OriginalMember(owner = "client!qd", name = "n", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1488 = Static187.method3089("Diese Welt ist voll)3");

	@OriginalMember(owner = "client!qd", name = "s", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_1490 = Static187.method3089("Please wait)3)3)3");

	@OriginalMember(owner = "client!qd", name = "q", descriptor = "Lclient!vd;")
	public static Class92 aClass92_1489 = aClass92_1490;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZB)V")
	public static void method2317(@OriginalArg(0) boolean arg0) {
		Static140.method2075();
		Static118.anInt2522++;
		if (Static118.anInt2522 < 50 && !arg0) {
			return;
		}
		Static118.anInt2522 = 0;
		if (Static38.aBoolean68 || Static27.aClass57_1 == null) {
			return;
		}
		Static38.aClass1_Sub14_Sub1_3.method3067(207);
		try {
			Static27.aClass57_1.method1673(Static38.aClass1_Sub14_Sub1_3.aByteArray49, Static38.aClass1_Sub14_Sub1_3.anInt4061);
			Static38.aClass1_Sub14_Sub1_3.anInt4061 = 0;
		} catch (@Pc(42) IOException local42) {
			Static38.aBoolean68 = true;
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	public static void method2318(@OriginalArg(0) Component arg0) {
		arg0.removeKeyListener(Static159.aClass89_1);
		arg0.removeFocusListener(Static159.aClass89_1);
		Static104.anInt2249 = -1;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lclient!vd;BI)V")
	public static void method2319(@OriginalArg(0) Class92 arg0, @OriginalArg(2) int arg1) {
		@Pc(11) Class92 local11 = arg0.method3201().method3198();
		@Pc(13) boolean local13 = false;
		for (@Pc(15) int local15 = 0; local15 < Static35.anInt992; local15++) {
			@Pc(25) Class8_Sub3_Sub1 local25 = Static47.aClass8_Sub3_Sub1Array1[Static111.anIntArray181[local15]];
			if (local25 != null && local25.aClass92_374 != null && local25.aClass92_374.method3241(local11)) {
				local13 = true;
				Static55.method911(false, 2, 0, 1, 1, 0, Static15.aClass8_Sub3_Sub1_1.anIntArray309[0], Static15.aClass8_Sub3_Sub1_1.anIntArray312[0], 0, local25.anIntArray312[0], local25.anIntArray309[0]);
				if (arg1 == 1) {
					Static38.aClass1_Sub14_Sub1_3.method3067(222);
					Static38.aClass1_Sub14_Sub1_3.method3008(Static111.anIntArray181[local15]);
				} else if (arg1 == 4) {
					Static38.aClass1_Sub14_Sub1_3.method3067(35);
					Static38.aClass1_Sub14_Sub1_3.method3020(Static111.anIntArray181[local15]);
				} else if (arg1 == 6) {
					Static38.aClass1_Sub14_Sub1_3.method3067(85);
					Static38.aClass1_Sub14_Sub1_3.method3011(Static111.anIntArray181[local15]);
				} else if (arg1 == 7) {
					Static38.aClass1_Sub14_Sub1_3.method3067(120);
					Static38.aClass1_Sub14_Sub1_3.method3019(Static111.anIntArray181[local15]);
				}
				break;
			}
		}
		if (!local13) {
			Static145.method2151(Static208.method787(new Class92[] { Static77.aClass92_717, local11 }), Static26.aClass92_268, 0);
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIII)Lclient!bj;")
	public static Class1_Sub4 method2320(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class1_Sub4 local7 = new Class1_Sub4();
		local7.anInt490 = arg1;
		local7.anInt489 = arg0;
		Static183.aClass97_21.method3374(local7, (long) arg2);
		Static29.method548(arg1);
		@Pc(26) Class11 local26 = Static9.method2342(arg2);
		if (local26 != null) {
			Static73.method1118(local26);
		}
		if (Static82.aClass11_6 != null) {
			Static73.method1118(Static82.aClass11_6);
			Static82.aClass11_6 = null;
		}
		anInt3135 = 0;
		Static35.aBoolean61 = false;
		Static70.method1085(Static192.anInt4179, Static31.anInt737, Static170.anInt3552, Static196.anInt4260);
		if (local26 != null) {
			Static71.method1101(local26);
		}
		Static9.method2341(arg1);
		if (Static22.anInt555 != -1) {
			Static7.method125(Static22.anInt555, 1);
		}
		return local7;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILclient!ab;)V")
	public static void method2321(@OriginalArg(1) Class3 arg0) {
		Static74.aClass3_13 = arg0;
		Static86.anInt1860 = Static74.aClass3_13.method3270(4);
	}
}
