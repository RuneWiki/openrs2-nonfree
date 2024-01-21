import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!se", name = "Ob", descriptor = "I")
	public static int anInt3625;

	@OriginalMember(owner = "client!se", name = "Hb", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1719 = Static187.method3089(")3runescape)3com");

	@OriginalMember(owner = "client!se", name = "Lb", descriptor = "J")
	public static volatile long aLong195 = 0L;

	@OriginalMember(owner = "client!se", name = "Mb", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1720 = Static187.method3089("Keine Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!se", name = "Ub", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_1723 = Static187.method3089("No reply from loginserver)3");

	@OriginalMember(owner = "client!se", name = "Nb", descriptor = "Lclient!vd;")
	public static Class92 aClass92_1721 = aClass92_1723;

	@OriginalMember(owner = "client!se", name = "Qb", descriptor = "I")
	public static int anInt3627 = 2;

	@OriginalMember(owner = "client!se", name = "Vb", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_1724 = Static187.method3089("RuneScape has been updated(Q");

	@OriginalMember(owner = "client!se", name = "Rb", descriptor = "Lclient!vd;")
	public static Class92 aClass92_1722 = aClass92_1724;

	@OriginalMember(owner = "client!se", name = "Wb", descriptor = "J")
	public static long aLong196 = 0L;

	@OriginalMember(owner = "client!se", name = "f", descriptor = "(I)V")
	public static void method2684() {
		Static183.aByteArrayArrayArray46 = new byte[4][104][104];
		Static185.anIntArray328 = new int[104];
		Static55.anIntArray109 = new int[104];
		Static12.anIntArrayArrayArray1 = new int[4][105][105];
		Static87.aByteArrayArrayArray20 = new byte[4][104][104];
		Static31.anInt733 = 99;
		Static34.aByteArrayArrayArray8 = new byte[4][105][105];
		Static103.aByteArrayArrayArray26 = new byte[4][104][104];
		Static119.anIntArray191 = new int[104];
		Static79.anIntArray140 = new int[104];
		Static191.aByteArrayArrayArray50 = new byte[4][104][104];
		Static78.anIntArray137 = new int[104];
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(I[B)V")
	public static void method2686(@OriginalArg(1) byte[] arg0) {
		@Pc(11) int local11 = Static203.anInt4429 >> 2 << 10;
		@Pc(15) byte[][] local15 = new byte[Static90.anInt1950][Static35.anInt988];
		@Pc(19) int local19 = Static61.anInt1464 >> 1;
		@Pc(21) int local21 = 0;
		while (true) {
			@Pc(34) int local34;
			@Pc(46) int local46;
			while (local21 < arg0.length) {
				local34 = (arg0[local21++] & 0xFF) * 64 - Static150.anInt3065;
				local46 = (arg0[local21++] & 0xFF) * 64 - Static52.anInt1305;
				if (local34 > 0 && local46 > 0 && local34 + 64 < Static90.anInt1950 && local46 + 64 < Static35.anInt988) {
					for (@Pc(69) int local69 = 0; local69 < 64; local69++) {
						@Pc(77) byte[] local77 = local15[local69 + local34];
						@Pc(84) int local84 = Static35.anInt988 - local46 - 1;
						for (@Pc(86) int local86 = -64; local86 < 0; local86++) {
							local77[local84--] = arg0[local21++];
						}
					}
				} else {
					local21 += 4096;
				}
			}
			local34 = Static90.anInt1950;
			local46 = Static35.anInt988;
			@Pc(119) int[] local119 = new int[local46];
			@Pc(122) int[] local122 = new int[local46];
			@Pc(125) int[] local125 = new int[local46];
			@Pc(128) int[] local128 = new int[local46];
			@Pc(131) int[] local131 = new int[local46];
			for (@Pc(137) int local137 = -5; local137 < local34; local137++) {
				@Pc(162) int local162;
				@Pc(229) int local229;
				for (@Pc(141) int local141 = 0; local141 < local46; local141++) {
					@Pc(147) int local147 = local137 + 5;
					@Pc(209) int local209;
					if (local147 < local34) {
						local162 = local15[local147][local141] & 0xFF;
						if (local162 > 0) {
							@Pc(173) Class1_Sub3_Sub8 local173 = Static177.method2884(local162 - 1);
							local119[local141] += local173.anInt1670;
							local122[local141] += local173.anInt1669;
							local125[local141] += local173.anInt1677;
							local128[local141] += local173.anInt1672;
							local209 = local131[local141]++;
						}
					}
					local162 = local137 - 5;
					if (local162 >= 0) {
						local229 = local15[local162][local141] & 0xFF;
						if (local229 > 0) {
							@Pc(237) Class1_Sub3_Sub8 local237 = Static177.method2884(local229 - 1);
							local119[local141] -= local237.anInt1670;
							local122[local141] -= local237.anInt1669;
							local125[local141] -= local237.anInt1677;
							local128[local141] -= local237.anInt1672;
							local209 = local131[local141]--;
						}
					}
				}
				if (local137 >= 0) {
					@Pc(288) int[][] local288 = Static157.anIntArrayArrayArray7[local137 >> 6];
					local162 = 0;
					local229 = 0;
					@Pc(294) int local294 = 0;
					@Pc(296) int local296 = 0;
					@Pc(298) int local298 = 0;
					for (@Pc(300) int local300 = -5; local300 < local46; local300++) {
						@Pc(306) int local306 = local300 + 5;
						if (local306 < local46) {
							local229 += local122[local306];
							local294 += local125[local306];
							local296 += local131[local306];
							local162 += local119[local306];
							local298 += local128[local306];
						}
						@Pc(343) int local343 = local300 - 5;
						if (local343 >= 0) {
							local298 -= local128[local343];
							local296 -= local131[local343];
							local162 -= local119[local343];
							local294 -= local125[local343];
							local229 -= local122[local343];
						}
						if (local300 >= 0 && local296 > 0) {
							@Pc(399) int local399 = local298 == 0 ? 0 : Static40.method2670(local162 * 256 / local298, local229 / local296, local294 / local296);
							@Pc(403) int local403 = local300 >> 6;
							if (local15[local137][local300] != 0) {
								if (local288[local403] == null) {
									local288[local403] = Static157.anIntArrayArrayArray7[local137 >> 6][local403] = new int[4096];
								}
								@Pc(456) int local456 = (local399 & 0x7F) + local19;
								if (local456 < 0) {
									local456 = 0;
								} else if (local456 > 127) {
									local456 = 127;
								}
								@Pc(483) int local483 = local456 + (local399 + local11 & 0xFC00) + (local399 & 0x380);
								local288[local403][((local300 & 0x3F) << 6) + (local137 & 0x3F)] = Static174.anIntArray319[Static79.method1205(local483, 96)];
							} else if (local288[local403] != null) {
								local288[local403][(local137 & 0x3F) + ((local300 & 0x3F) << 6)] = 0;
							}
						}
					}
				}
			}
			return;
		}
	}
}
