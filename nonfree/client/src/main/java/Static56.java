import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!kd", name = "I", descriptor = "I")
	public static int anInt1694;

	@OriginalMember(owner = "client!kd", name = "J", descriptor = "I")
	public static int anInt1695;

	@OriginalMember(owner = "client!kd", name = "O", descriptor = "[I")
	public static int[] anIntArray223;

	@OriginalMember(owner = "client!kd", name = "W", descriptor = "Lclient!mc;")
	public static Class33_Sub1 aClass33_Sub1_24;

	@OriginalMember(owner = "client!kd", name = "B", descriptor = "Lclient!wb;")
	public static Class65 aClass65_759 = Static24.method441("rot:");

	@OriginalMember(owner = "client!kd", name = "C", descriptor = "Lclient!wb;")
	private static Class65 aClass65_760 = Static24.method441(" from your friend list first");

	@OriginalMember(owner = "client!kd", name = "D", descriptor = "Lclient!wb;")
	public static Class65 aClass65_761 = Static24.method441("::noclip");

	@OriginalMember(owner = "client!kd", name = "E", descriptor = "Lclient!wb;")
	public static Class65 aClass65_762 = Static24.method441("::fpson");

	@OriginalMember(owner = "client!kd", name = "F", descriptor = "I")
	public static int anInt1693 = 0;

	@OriginalMember(owner = "client!kd", name = "G", descriptor = "Lclient!wb;")
	private static Class65 aClass65_763 = Static24.method441("Enter your username (V password)3");

	@OriginalMember(owner = "client!kd", name = "N", descriptor = "Lclient!wb;")
	private static Class65 aClass65_764 = Static24.method441("To create a new account you need to");

	@OriginalMember(owner = "client!kd", name = "S", descriptor = "Lclient!wb;")
	public static Class65 aClass65_765 = aClass65_764;

	@OriginalMember(owner = "client!kd", name = "X", descriptor = "I")
	public static int anInt1704 = 0;

	@OriginalMember(owner = "client!kd", name = "Y", descriptor = "Lclient!wb;")
	public static Class65 aClass65_766 = aClass65_760;

	@OriginalMember(owner = "client!kd", name = "ab", descriptor = "Lclient!wb;")
	public static Class65 aClass65_767 = aClass65_763;

	@OriginalMember(owner = "client!kd", name = "bb", descriptor = "[I")
	public static int[] anIntArray224 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!kd", name = "cb", descriptor = "Z")
	public static boolean aBoolean93 = false;

	@OriginalMember(owner = "client!kd", name = "db", descriptor = "Lclient!wb;")
	public static Class65 aClass65_768 = Static24.method441("invback");

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!a;I)V")
	public static void method991(@OriginalArg(0) Class1 arg0) {
		Static74.aClass1_3 = arg0;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IILclient!k;I)Lclient!qd;")
	public static Class2_Sub1_Sub4_Sub3 method992(@OriginalArg(0) int arg0, @OriginalArg(2) Class33 arg1, @OriginalArg(3) int arg2) {
		return Static23.method425(arg1, arg0, arg2) ? Static51.method899() : null;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IZ)V")
	public static void method993(@OriginalArg(1) boolean arg0) {
		Static22.aBoolean45 = arg0;
		@Pc(18) int local18;
		@Pc(22) int local22;
		@Pc(28) int local28;
		@Pc(33) int local33;
		@Pc(37) int local37;
		@Pc(41) int local41;
		@Pc(48) int local48;
		@Pc(158) int local158;
		@Pc(162) int local162;
		@Pc(166) int local166;
		if (!Static22.aBoolean45) {
			local18 = (Static57.anInt1718 - Static59.aClass2_Sub8_Sub1_19.anInt2342) / 16;
			Static110.anIntArrayArray26 = new int[local18][4];
			for (local22 = 0; local22 < local18; local22++) {
				for (local28 = 0; local28 < 4; local28++) {
					Static110.anIntArrayArray26[local22][local28] = Static59.aClass2_Sub8_Sub1_19.method1393();
				}
			}
			local28 = Static59.aClass2_Sub8_Sub1_19.method1382();
			local33 = Static59.aClass2_Sub8_Sub1_19.method1396();
			local37 = Static59.aClass2_Sub8_Sub1_19.method1391();
			local41 = Static59.aClass2_Sub8_Sub1_19.method1382();
			local48 = Static59.aClass2_Sub8_Sub1_19.method1410();
			Static47.anIntArray194 = new int[local18];
			Static63.aByteArrayArray6 = new byte[local18][];
			Static26.anIntArray415 = new int[local18];
			Static92.anIntArray378 = new int[local18];
			@Pc(410) boolean local410 = false;
			Static23.aByteArrayArray1 = new byte[local18][];
			local18 = 0;
			if ((local28 / 8 == 48 || local28 / 8 == 49) && (local37 / 8) == 48) {
				local410 = true;
			}
			if (local28 / 8 == 48 && local37 / 8 == 148) {
				local410 = true;
			}
			for (local158 = (local28 - 6) / 8; local158 <= (local28 + 6) / 8; local158++) {
				for (local162 = (local37 - 6) / 8; local162 <= (local37 + 6) / 8; local162++) {
					local166 = local162 + (local158 << 8);
					if (!local410 || local162 != 49 && local162 != 149 && local162 != 147 && local158 != 50 && (local158 != 49 || local162 != 47)) {
						Static92.anIntArray378[local18] = local166;
						Static26.anIntArray415[local18] = aClass33_Sub1_24.method1149(Static13.method282(new Class65[] { Static78.aClass65_265, Static93.method1617(local158), Static95.aClass65_893, Static93.method1617(local162) }));
						Static47.anIntArray194[local18] = aClass33_Sub1_24.method1149(Static13.method282(new Class65[] { Static55.aClass65_750, Static93.method1617(local158), Static95.aClass65_893, Static93.method1617(local162) }));
						local18++;
					}
				}
			}
			Static96.method1652(local28, local37, local33, local41, local48);
			return;
		}
		local18 = Static59.aClass2_Sub8_Sub1_19.method1378();
		local22 = Static59.aClass2_Sub8_Sub1_19.method1391();
		local28 = Static59.aClass2_Sub8_Sub1_19.method1391();
		Static59.aClass2_Sub8_Sub1_19.method1421();
		for (local33 = 0; local33 < 4; local33++) {
			for (local37 = 0; local37 < 13; local37++) {
				for (local41 = 0; local41 < 13; local41++) {
					local48 = Static59.aClass2_Sub8_Sub1_19.method1419(1);
					if (local48 == 1) {
						Static51.anIntArrayArrayArray5[local33][local37][local41] = Static59.aClass2_Sub8_Sub1_19.method1419(26);
					} else {
						Static51.anIntArrayArrayArray5[local33][local37][local41] = -1;
					}
				}
			}
		}
		Static59.aClass2_Sub8_Sub1_19.method1428();
		local37 = (Static57.anInt1718 - Static59.aClass2_Sub8_Sub1_19.anInt2342) / 16;
		Static110.anIntArrayArray26 = new int[local37][4];
		for (local41 = 0; local41 < local37; local41++) {
			for (local48 = 0; local48 < 4; local48++) {
				Static110.anIntArrayArray26[local41][local48] = Static59.aClass2_Sub8_Sub1_19.method1393();
			}
		}
		local48 = Static59.aClass2_Sub8_Sub1_19.method1382();
		@Pc(139) int local139 = Static59.aClass2_Sub8_Sub1_19.method1382();
		Static23.aByteArrayArray1 = new byte[local37][];
		Static26.anIntArray415 = new int[local37];
		Static92.anIntArray378 = new int[local37];
		Static63.aByteArrayArray6 = new byte[local37][];
		Static47.anIntArray194 = new int[local37];
		local37 = 0;
		for (local158 = 0; local158 < 4; local158++) {
			for (local162 = 0; local162 < 13; local162++) {
				for (local166 = 0; local166 < 13; local166++) {
					@Pc(176) int local176 = Static51.anIntArrayArrayArray5[local158][local162][local166];
					if (local176 != -1) {
						@Pc(185) int local185 = local176 >> 14 & 0x3FF;
						@Pc(191) int local191 = local176 >> 3 & 0x7FF;
						@Pc(201) int local201 = local191 / 8 + (local185 / 8 << 8);
						for (@Pc(203) int local203 = 0; local203 < local37; local203++) {
							if (local201 == Static92.anIntArray378[local203]) {
								local201 = -1;
								break;
							}
						}
						if (local201 != -1) {
							Static92.anIntArray378[local37] = local201;
							@Pc(233) int local233 = local201 & 0xFF;
							@Pc(239) int local239 = local201 >> 8 & 0xFF;
							Static26.anIntArray415[local37] = aClass33_Sub1_24.method1149(Static13.method282(new Class65[] { Static78.aClass65_265, Static93.method1617(local239), Static95.aClass65_893, Static93.method1617(local233) }));
							Static47.anIntArray194[local37] = aClass33_Sub1_24.method1149(Static13.method282(new Class65[] { Static55.aClass65_750, Static93.method1617(local239), Static95.aClass65_893, Static93.method1617(local233) }));
							local37++;
						}
					}
				}
			}
		}
		Static96.method1652(local28, local22, local48, local139, local18);
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(I)V")
	public static void method994() {
		aClass65_766 = null;
		aClass33_Sub1_24 = null;
		aClass65_767 = null;
		aClass65_759 = null;
		aClass65_761 = null;
		aClass65_768 = null;
		aClass65_765 = null;
		anIntArray224 = null;
		anIntArray223 = null;
		aClass65_760 = null;
		aClass65_762 = null;
		aClass65_763 = null;
		aClass65_764 = null;
	}
}
