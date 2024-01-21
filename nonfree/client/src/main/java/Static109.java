import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
	public static int anInt2499;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1172 = Static56.method816("mapfunction");

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
	public static int anInt2498 = -1;

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "Lclient!lf;")
	public static Class48 aClass48_50 = new Class48(30);

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "[I")
	public static int[] anIntArray338 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "Lclient!ic;")
	private static Class34 aClass34_1173 = Static56.method816("glow1:");

	@OriginalMember(owner = "client!sc", name = "g", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1174 = aClass34_1173;

	@OriginalMember(owner = "client!sc", name = "j", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1175 = Static56.method816("");

	@OriginalMember(owner = "client!sc", name = "l", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1176 = aClass34_1173;

	@OriginalMember(owner = "client!sc", name = "m", descriptor = "I")
	public static int anInt2503 = 0;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IBI)V")
	public static void method1533(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static106.aClass8_Sub20_Sub1_3.method1907(13);
		Static106.aClass8_Sub20_Sub1_3.method1873(arg1);
		Static106.aClass8_Sub20_Sub1_3.method1843(arg0);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIB)V")
	public static void method1534(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class8_Sub24 local8 = Static69.method1044(arg0, arg2);
		if (local8 != null && local8.anObjectArray7 != null) {
			@Pc(17) Class8_Sub19 local17 = new Class8_Sub19();
			local17.anObjectArray3 = local8.anObjectArray7;
			local17.aClass8_Sub24_13 = local8;
			Static106.method1497(local17);
		}
		Static2.anInt29 = arg0;
		Static32.aBoolean41 = true;
		Static125.anInt3001 = arg2;
		Static120.anInt2889 = arg1;
		Static40.method608(local8);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V")
	public static void method1535() {
		aClass34_1173 = null;
		aClass48_50 = null;
		aClass34_1175 = null;
		aClass34_1176 = null;
		anIntArray338 = null;
		aClass34_1174 = null;
		aClass34_1172 = null;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILclient!ic;I)V")
	public static void method1536(@OriginalArg(0) int arg0, @OriginalArg(1) Class34 arg1) {
		@Pc(7) boolean local7 = false;
		@Pc(15) Class34 local15 = arg1.method831().method842();
		for (@Pc(21) int local21 = 0; local21 < Static41.anInt986; local21++) {
			@Pc(29) Class8_Sub1_Sub1_Sub4_Sub1 local29 = Static84.aClass8_Sub1_Sub1_Sub4_Sub1Array1[Static29.anIntArray109[local21]];
			if (local29 != null && local29.aClass34_638 != null && local29.aClass34_638.method806(local15)) {
				Static105.method1480(0, 0, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray262[0], 2, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray260[0], 0, 1, local29.anIntArray262[0], local29.anIntArray260[0], 1, false);
				local7 = true;
				if (arg0 == 1) {
					Static106.aClass8_Sub20_Sub1_3.method1907(24);
					Static106.aClass8_Sub20_Sub1_3.method1869(Static29.anIntArray109[local21]);
				} else if (arg0 == 4) {
					Static106.aClass8_Sub20_Sub1_3.method1907(19);
					Static106.aClass8_Sub20_Sub1_3.method1843(Static29.anIntArray109[local21]);
				} else if (arg0 == 6) {
					Static106.aClass8_Sub20_Sub1_3.method1907(187);
					Static106.aClass8_Sub20_Sub1_3.method1881(Static29.anIntArray109[local21]);
				} else if (arg0 == 7) {
					Static106.aClass8_Sub20_Sub1_3.method1907(29);
					Static106.aClass8_Sub20_Sub1_3.method1884(Static29.anIntArray109[local21]);
				}
				break;
			}
		}
		if (!local7) {
			Static108.method1530(Static44.method669(new Class34[] { Static9.aClass34_116, local15 }), Static36.aClass34_504, 0);
		}
	}
}
