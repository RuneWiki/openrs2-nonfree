import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

	@OriginalMember(owner = "client!ji", name = "j", descriptor = "[I")
	public static int[] anIntArray314;

	@OriginalMember(owner = "client!ji", name = "g", descriptor = "Z")
	public static boolean aBoolean380 = false;

	@OriginalMember(owner = "client!ji", name = "h", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_122 = new Class363(20, -1);

	@OriginalMember(owner = "client!ji", name = "i", descriptor = "[J")
	public static final long[] aLongArray6 = new long[32];

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V")
	public static void method3918() {
		Static565.anInt9249 = Static133.aClass2_Sub15_Sub2_1.method4338();
		@Pc(13) int local13 = Static133.aClass2_Sub15_Sub2_1.method4294();
		@Pc(19) int local19 = Static133.aClass2_Sub15_Sub2_1.method4294();
		@Pc(30) boolean local30 = Static133.aClass2_Sub15_Sub2_1.method4325() == 1;
		@Pc(34) int local34 = Static133.aClass2_Sub15_Sub2_1.method4338();
		Static380.method5630();
		Static424.method6093(local34);
		Static133.aClass2_Sub15_Sub2_1.method4362();
		@Pc(54) int local54;
		@Pc(58) int local58;
		@Pc(65) int local65;
		for (@Pc(50) int local50 = 0; local50 < 4; local50++) {
			for (local54 = 0; local54 < Static188.anInt3850 >> 3; local54++) {
				for (local58 = 0; local58 < Static49.anInt1174 >> 3; local58++) {
					local65 = Static133.aClass2_Sub15_Sub2_1.method4355(1);
					if (local65 == 1) {
						Static66.anIntArrayArrayArray30[local50][local54][local58] = Static133.aClass2_Sub15_Sub2_1.method4355(26);
					} else {
						Static66.anIntArrayArrayArray30[local50][local54][local58] = -1;
					}
				}
			}
		}
		Static133.aClass2_Sub15_Sub2_1.method4361();
		local54 = (Static65.anInt1500 - Static133.aClass2_Sub15_Sub2_1.anInt5241) / 16;
		Static471.anIntArrayArray53 = new int[local54][4];
		for (local58 = 0; local58 < local54; local58++) {
			for (local65 = 0; local65 < 4; local65++) {
				Static471.anIntArrayArray53[local58][local65] = Static133.aClass2_Sub15_Sub2_1.method4307();
			}
		}
		Static529.aByteArrayArray38 = null;
		Static234.anIntArray280 = new int[local54];
		Static296.anIntArray380 = new int[local54];
		Static300.aByteArrayArray24 = new byte[local54][];
		Static263.anIntArray328 = new int[local54];
		Static394.anIntArray331 = new int[local54];
		Static420.aByteArrayArray27 = new byte[local54][];
		Static585.anIntArray683 = new int[local54];
		Static135.anIntArray166 = null;
		Static533.aByteArrayArray35 = new byte[local54][];
		Static266.aByteArrayArray23 = new byte[local54][];
		local54 = 0;
		for (local65 = 0; local65 < 4; local65++) {
			for (@Pc(190) int local190 = 0; local190 < Static188.anInt3850 >> 3; local190++) {
				for (@Pc(194) int local194 = 0; local194 < Static49.anInt1174 >> 3; local194++) {
					@Pc(204) int local204 = Static66.anIntArrayArrayArray30[local65][local190][local194];
					if (local204 != -1) {
						@Pc(214) int local214 = local204 >> 14 & 0x3FF;
						@Pc(220) int local220 = local204 >> 3 & 0x7FF;
						@Pc(230) int local230 = local220 / 8 + (local214 / 8 << 8);
						for (@Pc(232) int local232 = 0; local232 < local54; local232++) {
							if (Static234.anIntArray280[local232] == local230) {
								local230 = -1;
								break;
							}
						}
						if (local230 != -1) {
							Static234.anIntArray280[local54] = local230;
							@Pc(260) int local260 = local230 >> 8 & 0xFF;
							@Pc(264) int local264 = local230 & 0xFF;
							Static585.anIntArray683[local54] = Static525.aClass259_170.method5961("m" + local260 + "_" + local264);
							Static394.anIntArray331[local54] = Static525.aClass259_170.method5961("l" + local260 + "_" + local264);
							Static296.anIntArray380[local54] = Static525.aClass259_170.method5961("um" + local260 + "_" + local264);
							Static263.anIntArray328[local54] = Static525.aClass259_170.method5961("ul" + local260 + "_" + local264);
							local54++;
						}
					}
				}
			}
		}
		Static277.method4190(11, local30, local13, local19);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IZ)V")
	public static void method3919(@OriginalArg(0) int arg0) {
		@Pc(20) Class2_Sub3_Sub13 local20 = Static382.method5650(14, arg0);
		local20.method6095();
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(BC)Z")
	public static boolean method3921(@OriginalArg(1) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(II[BIIBI)Z")
	public static boolean method3922(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(6) int arg4) {
		@Pc(15) int local15 = arg3 % 8;
		@Pc(19) int local19;
		if (local15 == 0) {
			local19 = 0;
		} else {
			local19 = 8 - local15;
		}
		@Pc(35) int local35 = -((arg1 + 7) / 8);
		@Pc(44) int local44 = -((arg3 + 7) / 8);
		for (@Pc(46) int local46 = local35; local46 < 0; local46++) {
			for (@Pc(50) int local50 = local44; local50 < 0; local50++) {
				if (arg2[arg4] == 0) {
					return true;
				}
				arg4 += 8;
			}
			arg4 -= local19;
			if (arg2[arg4 - 1] == 0) {
				return true;
			}
			arg4 += arg0;
		}
		return false;
	}
}
