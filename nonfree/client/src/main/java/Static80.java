import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!hd", name = "s", descriptor = "I")
	public static int anInt1585;

	@OriginalMember(owner = "client!hd", name = "w", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!hd", name = "o", descriptor = "I")
	public static int anInt1584 = 0;

	@OriginalMember(owner = "client!hd", name = "p", descriptor = "Lclient!hh;")
	public static Class50 aClass50_529 = Static186.method3527("<col=ff9040>");

	@OriginalMember(owner = "client!hd", name = "r", descriptor = "Lclient!hh;")
	private static Class50 aClass50_531 = Static186.method3527(" has logged in)3");

	@OriginalMember(owner = "client!hd", name = "q", descriptor = "Lclient!hh;")
	public static Class50 aClass50_530 = aClass50_531;

	@OriginalMember(owner = "client!hd", name = "v", descriptor = "S")
	public static short aShort9 = 256;

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIBZLclient!tc;)V")
	public static void method1140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class110 arg4) {
		if (Static223.anInt4343 >= 50 || (arg4.anIntArrayArray30 == null || arg0 >= arg4.anIntArrayArray30.length || arg4.anIntArrayArray30[arg0] == null)) {
			return;
		}
		@Pc(32) int local32 = arg4.anIntArrayArray30[arg0][0];
		@Pc(36) int local36 = local32 & 0xF;
		@Pc(40) int local40 = local32 >> 8;
		@Pc(46) int local46 = local32 >> 4 & 0x7;
		@Pc(63) int local63;
		if (arg4.anIntArrayArray30[arg0].length > 1) {
			local63 = (int) ((double) arg4.anIntArrayArray30[arg0].length * Math.random());
			if (local63 > 0) {
				local40 = arg4.anIntArrayArray30[arg0][local63];
			}
		}
		if (local36 == 0) {
			if (arg3) {
				Static103.method1590(local46, local40, 0);
			}
		} else if (Static146.anInt3076 != 0) {
			@Pc(101) int local101 = (arg1 - 64) / 128;
			local63 = (arg2 - 64) / 128;
			Static148.anIntArray319[Static223.anInt4343] = local40;
			Static10.anIntArray24[Static223.anInt4343] = local46;
			Static155.anIntArray332[Static223.anInt4343] = 0;
			Static27.aClass71Array1[Static223.anInt4343] = null;
			Static204.anIntArray465[Static223.anInt4343] = (local63 << 16) - (-(local101 << 8) - local36);
			Static223.anInt4343++;
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V")
	public static void method1141(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[][][] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int arg11, @OriginalArg(12) byte arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= Static12.anInt236 * 128) {
			arg0 = Static12.anInt236 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= Static232.anInt4450 * 128) {
			arg2 = Static232.anInt4450 * 128 - 1;
		}
		Static83.anInt2312 = Class120.anIntArray491[arg3];
		Static201.anInt4054 = Class120.anIntArray492[arg3];
		Static114.anInt2280 = Class120.anIntArray491[arg4];
		Static141.anInt3806 = Class120.anIntArray492[arg4];
		Static85.anInt1761 = arg0;
		Static131.anInt2716 = arg1;
		Static221.anInt4311 = arg2;
		Static98.anInt2000 = arg0 / 128;
		Static35.anInt740 = arg2 / 128;
		Static146.anInt3072 = Static98.anInt2000 - Static75.anInt1524;
		if (Static146.anInt3072 < 0) {
			Static146.anInt3072 = 0;
		}
		Static160.anInt3326 = Static35.anInt740 - Static75.anInt1524;
		if (Static160.anInt3326 < 0) {
			Static160.anInt3326 = 0;
		}
		Static162.anInt3362 = Static98.anInt2000 + Static75.anInt1524;
		if (Static162.anInt3362 > Static12.anInt236) {
			Static162.anInt3362 = Static12.anInt236;
		}
		Static124.anInt2472 = Static35.anInt740 + Static75.anInt1524;
		if (Static124.anInt2472 > Static232.anInt4450) {
			Static124.anInt2472 = Static232.anInt4450;
		}
		@Pc(102) int local102;
		@Pc(113) int local113;
		for (@Pc(99) int local99 = 0; local99 < Static75.anInt1524 + Static75.anInt1524 + 2; local99++) {
			for (local102 = 0; local102 < Static75.anInt1524 + Static75.anInt1524 + 2; local102++) {
				local113 = (local99 - Static75.anInt1524 << 7) - (Static85.anInt1761 & 0x7F);
				@Pc(123) int local123 = (local102 - Static75.anInt1524 << 7) - (Static221.anInt4311 & 0x7F);
				@Pc(129) int local129 = Static98.anInt2000 + local99 - Static75.anInt1524;
				@Pc(135) int local135 = Static35.anInt740 + local102 - Static75.anInt1524;
				if (local129 >= 0 && local135 >= 0 && local129 < Static12.anInt236 && local135 < Static232.anInt4450) {
					@Pc(159) int local159;
					if (Static72.anIntArrayArrayArray5 == null) {
						local159 = Static224.anIntArrayArrayArray2[0][local129][local135] + 128 - Static131.anInt2716;
					} else {
						local159 = Static72.anIntArrayArrayArray5[0][local129][local135] + 128 - Static131.anInt2716;
					}
					@Pc(184) int local184 = Static224.anIntArrayArrayArray2[3][local129][local135] - Static131.anInt2716 - 1000;
					Static129.aBooleanArrayArray2[local99][local102] = Static7.method129(local113, local184, local159, local123);
				} else {
					Static129.aBooleanArrayArray2[local99][local102] = false;
				}
			}
		}
		for (local102 = 0; local102 < Static75.anInt1524 + Static75.anInt1524 + 1; local102++) {
			for (local113 = 0; local113 < Static75.anInt1524 + Static75.anInt1524 + 1; local113++) {
				Static16.aBooleanArrayArray1[local102][local113] = Static129.aBooleanArrayArray2[local102][local113] || Static129.aBooleanArrayArray2[local102 + 1][local113] || Static129.aBooleanArrayArray2[local102][local113 + 1] || Static129.aBooleanArrayArray2[local102 + 1][local113 + 1];
			}
		}
		Static99.anIntArray519 = arg6;
		Static185.anIntArray433 = arg7;
		Static7.anIntArray17 = arg8;
		Static59.anIntArray99 = arg9;
		Static17.anIntArray37 = arg10;
		Static67.method1004();
		Static177.method2918(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
	}
}
