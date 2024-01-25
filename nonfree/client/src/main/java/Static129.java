import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "I")
	public static int anInt2304;

	@OriginalMember(owner = "client!ek", name = "f", descriptor = "Lclient!cb;")
	public static final Class46 aClass46_26 = new Class46(4, 7);

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(III)I")
	public static int method1912(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static589.anIntArray278[arg1 & 0x3] : Static579.anIntArray551[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIBII)V")
	public static void method1916(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(12) int local12 = 0; local12 < Static463.anInt7779; local12++) {
			@Pc(18) Rectangle local18 = Class4_Sub2_Sub3.aRectangleArray4[local12];
			if (local18.x + local18.width > arg0 && local18.x < arg2 + arg0 && arg3 < local18.height + local18.y && arg1 + arg3 > local18.y) {
				Static264.aBooleanArray16[local12] = true;
			}
		}
		Static562.method5062(arg3, arg3 + arg1, arg0 - -arg2, arg0);
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILclient!re;ILclient!iba;BLclient!ha;)Z")
	public static boolean method1918(@OriginalArg(1) Class299 arg0, @OriginalArg(3) Class5_Sub26 arg1, @OriginalArg(5) Class133 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(9) int local9 = Integer.MIN_VALUE;
		@Pc(11) int local11 = Integer.MAX_VALUE;
		@Pc(13) int local13 = Integer.MIN_VALUE;
		if (arg0.anIntArray458 != null) {
			local9 = (arg1.anInt4153 + arg0.anInt8140 - Static620.anInt8205) * (Static620.anInt8203 - Static620.anInt8211) / (Static620.anInt8208 - Static620.anInt8205) + Static620.anInt8211;
			local13 = Static620.anInt8200 - (Static620.anInt8200 - Static620.anInt8202) * (-Static620.anInt8209 + arg1.anInt4154 + arg0.anInt8116) / (Static620.anInt8207 - Static620.anInt8209);
			local11 = Static620.anInt8200 - (arg1.anInt4154 + arg0.anInt8113 - Static620.anInt8209) * (Static620.anInt8200 - Static620.anInt8202) / (Static620.anInt8207 - Static620.anInt8209);
			local7 = (Static620.anInt8203 - Static620.anInt8211) * (arg1.anInt4153 + arg0.anInt8115 - Static620.anInt8205) / (Static620.anInt8208 - Static620.anInt8205) + Static620.anInt8211;
		}
		@Pc(100) Class28 local100 = null;
		@Pc(102) int local102 = 0;
		@Pc(104) int local104 = 0;
		@Pc(106) int local106 = 0;
		@Pc(108) int local108 = 0;
		if (arg0.anInt8134 != -1) {
			if (arg1.aBoolean309 && arg0.anInt8128 != -1) {
				local100 = arg0.method7062(true, arg2);
			} else {
				local100 = arg0.method7062(false, arg2);
			}
			if (local100 != null) {
				local102 = arg1.anInt4150 - (local100.method4035() + 1 >> 1);
				if (local102 < local7) {
					local7 = local102;
				}
				local104 = arg1.anInt4150 + (local100.method4035() + 1 >> 1);
				local106 = arg1.anInt4152 - (local100.method4042() + 1 >> 1);
				if (local104 > local9) {
					local9 = local104;
				}
				if (local106 < local11) {
					local11 = local106;
				}
				local108 = arg1.anInt4152 + (local100.method4042() + 1 >> 1);
				if (local108 > local13) {
					local13 = local108;
				}
			}
		}
		@Pc(200) Class57 local200 = null;
		@Pc(202) int local202 = 0;
		@Pc(204) int local204 = 0;
		@Pc(206) int local206 = 0;
		@Pc(208) int local208 = 0;
		@Pc(210) int local210 = 0;
		@Pc(212) int local212 = 0;
		@Pc(214) int local214 = 0;
		@Pc(216) int local216 = 0;
		@Pc(296) int local296;
		if (arg0.aString93 != null) {
			local200 = Static154.method2245(arg0.anInt8114);
			if (local200 != null) {
				local202 = Static1.aClass272_18.method6571(null, null, arg0.aString93, Static183.aStringArray24);
				local206 = arg1.anInt4152 - (Static620.anInt8200 - Static620.anInt8202) * arg0.anInt8129 / (Static620.anInt8207 - Static620.anInt8209);
				local204 = (Static620.anInt8203 - Static620.anInt8211) * arg0.anInt8146 / (Static620.anInt8208 - Static620.anInt8205) + arg1.anInt4150;
				if (local100 == null) {
					local206 -= local202 * local200.method1242() / 2;
				} else {
					local206 -= (local100.method4042() >> 1) + local202 * local200.method1239();
				}
				for (local296 = 0; local296 < local202; local296++) {
					@Pc(302) String local302 = Static183.aStringArray24[local296];
					if (local202 - 1 > local296) {
						local302 = local302.substring(0, local302.length() - 4);
					}
					@Pc(319) int local319 = local200.method1238(local302);
					if (local208 < local319) {
						local208 = local319;
					}
				}
				local210 = local204 - local208 / 2;
				if (local210 < local7) {
					local7 = local210;
				}
				local212 = local208 / 2 + local204;
				local214 = local206;
				if (local9 < local212) {
					local9 = local212;
				}
				local216 = local202 * local200.method1239() + local206;
				if (local11 > local214) {
					local11 = local214;
				}
				if (local216 > local13) {
					local13 = local216;
				}
			}
		}
		if (local9 < Static620.anInt8211 || local7 > Static620.anInt8203 || Static620.anInt8202 > local13 || Static620.anInt8200 < local11) {
			return true;
		}
		Static620.method7120(arg2, arg1, arg0);
		if (local100 != null) {
			if (Static248.anInt4508 > 0 && (Static165.anInt10647 != -1 && Static165.anInt10647 == arg1.anInt4151 || Static555.anInt9372 != -1 && Static555.anInt9372 == arg0.anInt8121)) {
				if (Static374.anInt6199 <= 50) {
					local296 = Static374.anInt6199 * 2;
				} else {
					local296 = (100 - Static374.anInt6199) * 2;
				}
				@Pc(460) int local460 = local296 << 24 | 0xFFFF00;
				arg2.method7244(arg1.anInt4150, local100.method4032() / 2 + 7, local460, arg1.anInt4152);
				arg2.method7244(arg1.anInt4150, local100.method4032() / 2 + 5, local460, arg1.anInt4152);
				arg2.method7244(arg1.anInt4150, local100.method4032() / 2 + 3, local460, arg1.anInt4152);
				arg2.method7244(arg1.anInt4150, local100.method4032() / 2 + 1, local460, arg1.anInt4152);
				arg2.method7244(arg1.anInt4150, local100.method4032() / 2, local460, arg1.anInt4152);
			}
			local100.method4040(arg1.anInt4150 - (local100.method4035() >> 1), arg1.anInt4152 + -(local100.method4042() >> 1));
		}
		if (arg0.aString93 != null && local200 != null) {
			Static254.method4174(arg2, local206, local204, local208, arg1, local202, arg0, local200);
		}
		if (arg0.anInt8134 != -1 || arg0.aString93 != null) {
			@Pc(575) Class5_Sub8 local575 = new Class5_Sub8(arg1);
			local575.anInt1128 = local104;
			local575.anInt1133 = local212;
			local575.anInt1131 = local210;
			local575.anInt1129 = local216;
			local575.anInt1127 = local214;
			local575.anInt1132 = local102;
			local575.anInt1134 = local106;
			local575.anInt1130 = local108;
			Static608.aClass330_62.method7917(local575);
		}
		return false;
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)V")
	public static void method1919() {
		Static257.aBoolean338 = false;
		Static472.method6995();
	}
}
