import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!h", name = "c", descriptor = "[I")
	public static int[] anIntArray129;

	@OriginalMember(owner = "client!h", name = "g", descriptor = "[[B")
	public static byte[][] aByteArrayArray4;

	@OriginalMember(owner = "client!h", name = "o", descriptor = "I")
	public static int anInt1147;

	@OriginalMember(owner = "client!h", name = "v", descriptor = "Lclient!la;")
	public static Class17 aClass17_14;

	@OriginalMember(owner = "client!h", name = "f", descriptor = "Lclient!v;")
	public static Class76 aClass76_488 = Static134.method2017("<col=ff3000>");

	@OriginalMember(owner = "client!h", name = "i", descriptor = "[I")
	public static int[] anIntArray130 = new int[128];

	@OriginalMember(owner = "client!h", name = "l", descriptor = "Lclient!v;")
	public static Class76 aClass76_489 = Static134.method2017("Neuer Benutzer");

	@OriginalMember(owner = "client!h", name = "m", descriptor = "[I")
	public static int[] anIntArray131 = new int[100];

	@OriginalMember(owner = "client!h", name = "t", descriptor = "Lclient!v;")
	private static Class76 aClass76_492 = Static134.method2017("Unexpected server response");

	@OriginalMember(owner = "client!h", name = "p", descriptor = "Lclient!v;")
	public static Class76 aClass76_490 = aClass76_492;

	@OriginalMember(owner = "client!h", name = "q", descriptor = "I")
	public static int anInt1148 = -1;

	@OriginalMember(owner = "client!h", name = "s", descriptor = "Lclient!v;")
	public static Class76 aClass76_491 = Static134.method2017("Willkommen auf RuneScape");

	@OriginalMember(owner = "client!h", name = "u", descriptor = "I")
	public static int anInt1150 = -1;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V")
	public static void method780() {
		aClass76_489 = null;
		anIntArray131 = null;
		anIntArray129 = null;
		aClass17_14 = null;
		anIntArray130 = null;
		aByteArrayArray4 = null;
		aClass76_488 = null;
		aClass76_491 = null;
		aClass76_492 = null;
		aClass76_490 = null;
	}

	@OriginalMember(owner = "client!h", name = "d", descriptor = "(II)Lclient!v;")
	public static Class76 method783(@OriginalArg(1) int arg0) {
		if (arg0 < 100000) {
			return Static59.method1017(new Class76[] { Static2.aClass76_23, Static63.method1092(arg0), Static30.aClass76_606 });
		} else if (arg0 < 10000000) {
			return Static59.method1017(new Class76[] { Static105.aClass76_1106, Static63.method1092(arg0 / 1000), Static102.aClass76_1074, Static30.aClass76_606 });
		} else {
			return Static59.method1017(new Class76[] { Static43.aClass76_143, Static63.method1092(arg0 / 1000000), Static102.aClass76_1072, Static30.aClass76_606 });
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIBI)V")
	public static void method785(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(18) Class4_Sub1 local18 = (Class4_Sub1) Static56.aClass78_6.method1916(); local18 != null; local18 = (Class4_Sub1) Static56.aClass78_6.method1920()) {
			if (local18.anInt123 != -1 || local18.anIntArray17 != null) {
				@Pc(29) int local29 = 0;
				if (local18.anInt108 < arg2) {
					local29 = arg2 - local18.anInt108;
				} else if (arg2 < local18.anInt118) {
					local29 = local18.anInt118 - arg2;
				}
				if (local18.anInt109 < arg3) {
					local29 += arg3 - local18.anInt109;
				} else if (arg3 < local18.anInt126) {
					local29 += local18.anInt126 - arg3;
				}
				if (local18.anInt116 < local29 - 64 || Static36.anInt1021 == 0 || local18.anInt107 != arg0) {
					if (local18.aClass4_Sub12_Sub3_1 != null) {
						Static14.aClass4_Sub12_Sub4_1.method1702(local18.aClass4_Sub12_Sub3_1);
						local18.aClass4_Sub12_Sub3_1 = null;
					}
					if (local18.aClass4_Sub12_Sub3_2 != null) {
						Static14.aClass4_Sub12_Sub4_1.method1702(local18.aClass4_Sub12_Sub3_2);
						local18.aClass4_Sub12_Sub3_2 = null;
					}
				} else {
					local29 -= 64;
					if (local29 < 0) {
						local29 = 0;
					}
					@Pc(149) int local149 = Static36.anInt1021 * (local18.anInt116 - local29) / local18.anInt116;
					if (local18.aClass4_Sub12_Sub3_1 != null) {
						local18.aClass4_Sub12_Sub3_1.method1221(local149);
					} else if (local18.anInt123 >= 0) {
						@Pc(164) Class65 local164 = Static140.method1622(Static12.aClass17_Sub1_4, local18.anInt123, 0);
						if (local164 != null) {
							@Pc(171) Class4_Sub6_Sub1 local171 = local164.method1623().method1489(Static47.aClass77_1);
							@Pc(176) Class4_Sub12_Sub3 local176 = Static139.method1215(local171, local149);
							local176.method1197(-1);
							Static14.aClass4_Sub12_Sub4_1.method1700(local176);
							local18.aClass4_Sub12_Sub3_1 = local176;
						}
					}
					if (local18.aClass4_Sub12_Sub3_2 != null) {
						local18.aClass4_Sub12_Sub3_2.method1221(local149);
						if (!local18.aClass4_Sub12_Sub3_2.method2005()) {
							local18.aClass4_Sub12_Sub3_2 = null;
						}
					} else if (local18.anIntArray17 != null && (local18.anInt110 -= arg1) <= 0) {
						@Pc(227) int local227 = (int) ((double) local18.anIntArray17.length * Math.random());
						@Pc(235) Class65 local235 = Static140.method1622(Static12.aClass17_Sub1_4, local18.anIntArray17[local227], 0);
						if (local235 != null) {
							@Pc(242) Class4_Sub6_Sub1 local242 = local235.method1623().method1489(Static47.aClass77_1);
							@Pc(247) Class4_Sub12_Sub3 local247 = Static139.method1215(local242, local149);
							local247.method1197(0);
							Static14.aClass4_Sub12_Sub4_1.method1700(local247);
							local18.aClass4_Sub12_Sub3_2 = local247;
							local18.anInt110 = local18.anInt105 + (int) (Math.random() * (double) (local18.anInt128 - local18.anInt105));
						}
					}
				}
			}
		}
	}
}
