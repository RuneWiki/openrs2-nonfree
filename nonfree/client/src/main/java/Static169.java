import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!ta", name = "g", descriptor = "I")
	public static int anInt1027;

	@OriginalMember(owner = "client!ta", name = "l", descriptor = "Lclient!bc;")
	public static Class1 aClass1_10;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "Lclient!af;")
	public static final Class5 aClass5_15 = new Class5(64);

	@OriginalMember(owner = "client!ta", name = "e", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_384 = Static120.method1824("da dieser Computer gegen unsere ");

	@OriginalMember(owner = "client!ta", name = "h", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_385 = Static120.method1824("Ung-Ultige Verbindung mit einem Anmelde)2Server)3");

	@OriginalMember(owner = "client!ta", name = "i", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_386 = Static120.method1824("Could not complete login)3");

	@OriginalMember(owner = "client!ta", name = "j", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_387 = Static120.method1824("headicons_prayer");

	@OriginalMember(owner = "client!ta", name = "k", descriptor = "[S")
	public static final short[] aShortArray15 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!ta", name = "m", descriptor = "Lclient!rd;")
	public static Class80 aClass80_388 = aClass80_386;

	@OriginalMember(owner = "client!ta", name = "o", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_389 = Static120.method1824("und die Schaltfl-=che (WSpielkonto erstellen(W am");

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IB)Z")
	public static boolean method691(@OriginalArg(0) int arg0) {
		return (arg0 >> 29 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "([IIIIII)V")
	public static void method693(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class3_Sub15 local7 = Static185.aClass3_Sub15ArrayArrayArray1[arg2][arg3][arg4];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class26 local13 = local7.aClass26_1;
		@Pc(23) int local23;
		if (local13 != null) {
			@Pc(18) int local18 = local13.anInt1068;
			if (local18 != 0) {
				for (local23 = 0; local23 < 4; local23++) {
					arg0[arg1] = local18;
					arg0[arg1 + 1] = local18;
					arg0[arg1 + 2] = local18;
					arg0[arg1 + 3] = local18;
					arg1 += 512;
				}
			}
			return;
		}
		@Pc(58) Class62 local58 = local7.aClass62_1;
		if (local58 == null) {
			return;
		}
		local23 = local58.anInt2621;
		@Pc(67) int local67 = local58.anInt2624;
		@Pc(70) int local70 = local58.anInt2623;
		@Pc(73) int local73 = local58.anInt2622;
		@Pc(77) int[] local77 = Static61.anIntArrayArray10[local23];
		@Pc(81) int[] local81 = Static71.anIntArrayArray16[local67];
		@Pc(83) int local83 = 0;
		@Pc(87) int local87;
		if (local70 != 0) {
			for (local87 = 0; local87 < 4; local87++) {
				arg0[arg1] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 1] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 2] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 3] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg1 += 512;
			}
			return;
		}
		for (local87 = 0; local87 < 4; local87++) {
			if (local77[local81[local83++]] != 0) {
				arg0[arg1] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 1] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 2] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 3] = local73;
			}
			arg1 += 512;
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IILclient!ac;III)V")
	public static void method695(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub1_Sub1 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class3_Sub13 local7 = new Class3_Sub13();
		local7.anInt1721 = arg3;
		local7.anIntArray212 = arg2.anIntArray26;
		local7.anInt1710 = arg2.anInt140;
		local7.anInt1713 = arg4 * 128;
		local7.anInt1723 = arg2.anInt148;
		local7.anInt1715 = arg1 * 128;
		@Pc(35) int local35 = arg2.anInt145;
		local7.anInt1709 = arg2.anInt131 * 128;
		local7.anInt1711 = arg2.anInt155;
		@Pc(48) int local48 = arg2.anInt150;
		if (arg0 == 1 || arg0 == 3) {
			local35 = arg2.anInt150;
			local48 = arg2.anInt145;
		}
		local7.anInt1708 = (arg1 + local48) * 128;
		local7.anInt1722 = (arg4 + local35) * 128;
		if (arg2.anIntArray23 != null) {
			local7.aClass3_Sub1_Sub1_1 = arg2;
			local7.method1191();
		}
		Static32.aClass70_26.method1958(local7);
		if (local7.anIntArray212 != null) {
			local7.anInt1716 = (int) ((double) (local7.anInt1711 - local7.anInt1723) * Math.random()) + local7.anInt1723;
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V")
	public static void method696() {
		System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
		System.exit(1);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IBZI)Lclient!rd;")
	public static Class80 method698(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(28) int local28 = 1;
		@Pc(32) int local32 = arg0 / 10;
		while (local32 != 0) {
			local32 /= 10;
			local28++;
		}
		@Pc(51) int local51 = local28;
		if (arg0 < 0 || arg1) {
			local51 = local28 + 1;
		}
		@Pc(62) byte[] local62 = new byte[local51];
		if (arg0 < 0) {
			local62[0] = 45;
		} else if (arg1) {
			local62[0] = 43;
		}
		for (@Pc(78) int local78 = 0; local78 < local28; local78++) {
			@Pc(84) int local84 = arg0 % 10;
			if (local84 < 0) {
				local84 = -local84;
			}
			if (local84 > 9) {
				local84 += 39;
			}
			arg0 /= 10;
			local62[local51 - local78 - 1] = (byte) (local84 + 48);
		}
		@Pc(125) Class80 local125 = new Class80();
		local125.aByteArray43 = local62;
		local125.anInt3421 = local51;
		return local125;
	}
}
