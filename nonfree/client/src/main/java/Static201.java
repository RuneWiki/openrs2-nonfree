import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!vb", name = "Db", descriptor = "Lclient!ji;")
	public static Class5_Sub2_Sub10 aClass5_Sub2_Sub10_3;

	@OriginalMember(owner = "client!vb", name = "wb", descriptor = "I")
	public static final int anInt1737 = 3353893;

	@OriginalMember(owner = "client!vb", name = "zb", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_650 = Static161.method2452("und haben es deaktiviert)3 Klicken Sie auf der");

	@OriginalMember(owner = "client!vb", name = "Bb", descriptor = "[Z")
	public static final boolean[] aBooleanArray22 = new boolean[112];

	@OriginalMember(owner = "client!vb", name = "Fb", descriptor = "[I")
	public static final int[] anIntArray170 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!vb", name = "Kb", descriptor = "I")
	public static int anInt1746 = 0;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!wa;Lclient!wa;ZLclient!wa;Lclient!wa;)V")
	public static void method1361(@OriginalArg(0) Class23 arg0, @OriginalArg(1) Class23 arg1, @OriginalArg(3) Class23 arg2, @OriginalArg(4) Class23 arg3) {
		Static198.aClass23_77 = arg3;
		Static117.aClass23_44 = arg1;
		Static37.aClass23_27 = arg0;
		Static35.aClass23_21 = arg2;
		Static155.aClass69ArrayArray1 = new Class69[Static198.aClass23_77.method750()][];
		Static105.aBooleanArray25 = new boolean[Static198.aClass23_77.method750()];
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZB)V")
	public static void method1362() {
		@Pc(14) byte[][] local14 = Static44.aByteArrayArray3;
		for (@Pc(16) int local16 = 0; local16 < 4; local16++) {
			Static95.method1546();
			for (@Pc(22) int local22 = 0; local22 < 13; local22++) {
				for (@Pc(26) int local26 = 0; local26 < 13; local26++) {
					@Pc(36) int local36 = Static188.anIntArrayArrayArray11[local16][local22][local26];
					if (local36 != -1) {
						@Pc(46) int local46 = local36 >> 24 & 0x3;
						@Pc(59) int local59 = local36 >> 14 & 0x3FF;
						@Pc(65) int local65 = local36 >> 3 & 0x7FF;
						@Pc(76) int local76 = (local59 / 8 << 8) + (local65 / 8);
						@Pc(82) int local82 = local36 >> 1 & 0x3;
						for (@Pc(84) int local84 = 0; local84 < Static125.anIntArray290.length; local84++) {
							if (Static125.anIntArray290[local84] == local76 && local14[local84] != null) {
								Static152.method2288(local16, local82, (local65 & 0x7) * 8, (local59 & 0x7) * 8, local22 * 8, local46, Static9.aClass76Array1, local26 * 8, local14[local84]);
								break;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIB)Lclient!mf;")
	public static Class69 method1363(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class69 local7 = Static157.method2392(arg0);
		if (arg1 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass69Array2 == null || arg1 >= local7.aClass69Array2.length) {
			return null;
		} else {
			return local7.aClass69Array2[arg1];
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IZ)Lclient!o;")
	public static Class5_Sub2_Sub14 method1365(@OriginalArg(0) int arg0) {
		@Pc(10) Class5_Sub2_Sub14 local10 = (Class5_Sub2_Sub14) Static27.aClass8_8.method227((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(32) byte[] local32 = Static197.aClass23_75.method738(Static122.method1937(arg0), Static129.method2005(arg0));
		local10 = new Class5_Sub2_Sub14();
		if (local32 != null) {
			local10.method2063(new Class5_Sub6(local32));
		}
		Static27.aClass8_8.method232((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!vb", name = "h", descriptor = "(I)V")
	public static void method1366() {
		Static172.aClass8_34.method233();
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIII)V")
	public static void method1367(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static27.anInt493 <= arg3 && arg3 <= Static72.anInt1572) {
			@Pc(19) int local19 = Static171.method2627(Static173.anInt3464, arg0, Static174.anInt3493);
			@Pc(25) int local25 = Static171.method2627(Static173.anInt3464, arg2, Static174.anInt3493);
			Static131.method2031(arg1, local25, local19, arg3);
		}
	}
}
