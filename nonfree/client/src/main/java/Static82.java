import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!qa", name = "Lb", descriptor = "Lclient!da;")
	public static Class15 aClass15_55;

	@OriginalMember(owner = "client!qa", name = "Yb", descriptor = "Lclient!qd;")
	public static Class2_Sub1_Sub4_Sub3 aClass2_Sub1_Sub4_Sub3_17;

	@OriginalMember(owner = "client!qa", name = "ac", descriptor = "I")
	public static int anInt2367;

	@OriginalMember(owner = "client!qa", name = "Wb", descriptor = "Lclient!wb;")
	private static Class65 aClass65_1062 = Static24.method441("Press (Wchange your password(W on front page)3");

	@OriginalMember(owner = "client!qa", name = "Ob", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1058 = aClass65_1062;

	@OriginalMember(owner = "client!qa", name = "Rb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1059 = Static24.method441(":tradereq:");

	@OriginalMember(owner = "client!qa", name = "Tb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1060 = Static24.method441("Benutzen");

	@OriginalMember(owner = "client!qa", name = "Ub", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1061 = Static24.method441("mapback");

	@OriginalMember(owner = "client!qa", name = "bc", descriptor = "I")
	public static int anInt2368 = 0;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IILclient!ec;I)V")
	public static void method1422(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub1_Sub4_Sub2 arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 * arg0 + arg2 * arg2;
		if (local7 <= 4225 || local7 >= 90000) {
			Static24.method444(arg1, arg0, arg2);
			return;
		}
		@Pc(22) int local22 = Static3.anInt160 + Static71.anInt2176 & 0x7FF;
		@Pc(26) int local26 = Static86.anIntArray363[local22];
		@Pc(34) int local34 = local26 * 256 / (Static98.anInt2758 + 256);
		@Pc(38) int local38 = Static86.anIntArray354[local22];
		@Pc(46) int local46 = local38 * 256 / (Static98.anInt2758 + 256);
		@Pc(56) int local56 = local34 * arg0 + local46 * arg2 >> 16;
		@Pc(67) int local67 = arg2 * local34 - arg0 * local46 >> 16;
		@Pc(73) double local73 = Math.atan2((double) local56, (double) local67);
		@Pc(79) int local79 = (int) (Math.sin(local73) * 63.0D);
		@Pc(85) int local85 = (int) (Math.cos(local73) * 57.0D);
		Static62.aClass2_Sub1_Sub4_Sub2_10.method479(local79 + 4 + 94 - 10, -local85 + 63, local73);
	}

	@OriginalMember(owner = "client!qa", name = "l", descriptor = "(II)I")
	public static int method1423(@OriginalArg(0) int arg0) {
		return (int) (Math.log((double) arg0 * 0.00390625D) * 868.5889638065036D + 0.5D);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([Lclient!uc;Lclient!fc;II[BI)V")
	public static void method1426(@OriginalArg(0) Class58[] arg0, @OriginalArg(1) Class18 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4) {
		@Pc(20) Class2_Sub8 local20 = new Class2_Sub8(arg4);
		@Pc(22) int local22 = -1;
		while (true) {
			@Pc(26) int local26 = local20.method1376();
			if (local26 == 0) {
				return;
			}
			@Pc(33) int local33 = 0;
			local22 += local26;
			while (true) {
				@Pc(43) int local43 = local20.method1376();
				if (local43 == 0) {
					break;
				}
				local33 += local43 - 1;
				@Pc(58) int local58 = local33 & 0x3F;
				@Pc(64) int local64 = local33 >> 6 & 0x3F;
				@Pc(68) int local68 = local33 >> 12;
				@Pc(72) int local72 = local20.method1410();
				@Pc(76) int local76 = local72 >> 2;
				@Pc(80) int local80 = arg2 + local64;
				@Pc(84) int local84 = local72 & 0x3;
				@Pc(88) int local88 = local58 + arg3;
				if (local80 > 0 && local88 > 0 && local80 < 103 && local88 < 103) {
					@Pc(102) int local102 = local68;
					@Pc(104) Class58 local104 = null;
					if ((Static50.aByteArrayArrayArray6[1][local80][local88] & 0x2) == 2) {
						local102 = local68 - 1;
					}
					if (local102 >= 0) {
						local104 = arg0[local102];
					}
					Static96.method1649(local22, local68, local84, arg1, local80, local88, local76, local104);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qa", name = "s", descriptor = "(I)V")
	public static void method1427() {
		aClass65_1060 = null;
		aClass65_1062 = null;
		aClass65_1061 = null;
		aClass2_Sub1_Sub4_Sub3_17 = null;
		aClass15_55 = null;
		aClass65_1058 = null;
		aClass65_1059 = null;
	}
}
