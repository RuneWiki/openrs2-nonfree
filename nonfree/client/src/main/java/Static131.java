import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!q", name = "B", descriptor = "Lclient!dh;")
	public static Class2_Sub3_Sub5_Sub1_Sub1 aClass2_Sub3_Sub5_Sub1_Sub1_1;

	@OriginalMember(owner = "client!q", name = "N", descriptor = "Lclient!wa;")
	public static Class87 aClass87_10;

	@OriginalMember(owner = "client!q", name = "Q", descriptor = "[I")
	public static int[] anIntArray278;

	@OriginalMember(owner = "client!q", name = "F", descriptor = "Lclient!ai;")
	private static Class6 aClass6_878 = Static38.method685("Loading wordpack )2 ");

	@OriginalMember(owner = "client!q", name = "A", descriptor = "Lclient!ai;")
	public static Class6 aClass6_877 = aClass6_878;

	@OriginalMember(owner = "client!q", name = "E", descriptor = "I")
	public static int anInt3038 = 0;

	@OriginalMember(owner = "client!q", name = "M", descriptor = "Lclient!vb;")
	public static Class84 aClass84_11 = new Class84();

	@OriginalMember(owner = "client!q", name = "R", descriptor = "J")
	public static long aLong173 = 0L;

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(BIII)I")
	public static int method2041(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 >> 7;
		@Pc(11) int local11 = arg0 >> 7;
		if (local11 < 0 || local7 < 0 || local11 > 103 || local7 > 103) {
			return 0;
		}
		@Pc(27) int local27 = arg2;
		if (arg2 < 3 && (Static164.aByteArrayArrayArray7[1][local11][local7] & 0x2) == 2) {
			local27 = arg2 + 1;
		}
		@Pc(57) int local57 = arg0 & 0x7F;
		@Pc(88) int local88 = local57 * Static165.anIntArrayArrayArray10[local27][local11 + 1][local7 + 1] + Static165.anIntArrayArrayArray10[local27][local11][local7 + 1] * (128 - local57) >> 7;
		@Pc(92) int local92 = arg1 & 0x7F;
		@Pc(119) int local119 = Static165.anIntArrayArrayArray10[local27][local11][local7] * (128 - local57) + local57 * Static165.anIntArrayArrayArray10[local27][local11 + 1][local7] >> 7;
		return local92 * local88 + local119 * (128 - local92) >> 7;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(II[BI)Z")
	public static boolean method2043(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(7) int local7 = -1;
		@Pc(9) boolean local9 = true;
		@Pc(14) Class2_Sub13 local14 = new Class2_Sub13(arg2);
		label56: while (true) {
			@Pc(23) int local23 = local14.method1439();
			if (local23 == 0) {
				return local9;
			}
			@Pc(30) int local30 = 0;
			local7 += local23;
			@Pc(36) boolean local36 = false;
			while (true) {
				@Pc(42) int local42;
				while (!local36) {
					local42 = local14.method1439();
					if (local42 == 0) {
						continue label56;
					}
					local30 += local42 - 1;
					@Pc(72) int local72 = local30 & 0x3F;
					@Pc(78) int local78 = local30 >> 6 & 0x3F;
					@Pc(83) int local83 = local78 + arg1;
					@Pc(87) int local87 = arg0 + local72;
					@Pc(93) int local93 = local14.method1402() >> 2;
					if (local83 > 0 && local87 > 0 && local83 < 103 && local87 < 103) {
						@Pc(115) Class2_Sub3_Sub6 local115 = Static163.method2609(local7);
						if (local93 != 22 || !Static113.aBoolean112 || local115.anInt1219 != 0 || local115.anInt1192 == 1 || local115.aBoolean47) {
							if (!local115.method740()) {
								Static73.anInt1794++;
								local9 = false;
							}
							local36 = true;
						}
					}
				}
				local42 = local14.method1439();
				if (local42 == 0) {
					break;
				}
				local14.method1402();
			}
		}
	}

	@OriginalMember(owner = "client!q", name = "d", descriptor = "(I)V")
	public static void method2045() {
		aClass2_Sub3_Sub5_Sub1_Sub1_1 = null;
		aClass6_877 = null;
		aClass87_10 = null;
		aClass6_878 = null;
		aClass84_11 = null;
		anIntArray278 = null;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IILclient!c;Lclient!c;I)Lclient!te;")
	public static Class2_Sub3_Sub2_Sub4_Sub1 method2047(@OriginalArg(1) int arg0, @OriginalArg(2) Class10 arg1, @OriginalArg(3) Class10 arg2, @OriginalArg(4) int arg3) {
		return Static152.method2334(arg3, arg0, arg1) ? Static50.method891(arg2.method1605(arg0, arg3)) : null;
	}
}
