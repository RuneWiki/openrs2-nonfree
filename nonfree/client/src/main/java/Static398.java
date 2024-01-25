import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static398 {

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
	public static int anInt7110;

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "Lclient!qe;")
	public static Class1_Sub5_Sub4 aClass1_Sub5_Sub4_4;

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
	public static int anInt7109 = 1;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IILclient!qa;Lclient!da;ILclient!db;)Z")
	public static boolean method5471(@OriginalArg(2) Class121 arg0, @OriginalArg(3) Class1_Sub8 arg1, @OriginalArg(5) Class52 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(9) int local9 = Integer.MIN_VALUE;
		@Pc(11) int local11 = Integer.MAX_VALUE;
		@Pc(13) int local13 = Integer.MIN_VALUE;
		if (arg2.anIntArray56 != null) {
			local9 = (Static350.anInt6632 - Static350.anInt6643) * (arg2.anInt1200 + arg1.anInt1163 - Static350.anInt6637) / (Static350.anInt6640 - Static350.anInt6637) + Static350.anInt6643;
			local13 = Static350.anInt6642 - (Static350.anInt6642 - Static350.anInt6641) * ((arg2.anInt1191 + arg1.anInt1160) - Static350.anInt6638) / (Static350.anInt6634 - Static350.anInt6638);
			local11 = Static350.anInt6642 - (arg1.anInt1160 + arg2.anInt1190 - Static350.anInt6638) * (Static350.anInt6642 - Static350.anInt6641) / (Static350.anInt6634 - Static350.anInt6638);
			local7 = Static350.anInt6643 + (arg2.anInt1196 + arg1.anInt1163 - Static350.anInt6637) * (Static350.anInt6632 + -Static350.anInt6643) / (Static350.anInt6640 - Static350.anInt6637);
		}
		@Pc(102) Class78 local102 = null;
		@Pc(104) int local104 = 0;
		@Pc(106) int local106 = 0;
		@Pc(108) int local108 = 0;
		@Pc(110) int local110 = 0;
		if (arg2.anInt1197 != -1) {
			if (arg1.aBoolean100 && arg2.anInt1194 != -1) {
				local102 = arg2.method984(arg0, true);
			} else {
				local102 = arg2.method984(arg0, false);
			}
			if (local102 != null) {
				local104 = arg1.anInt1164 - (local102.ja() + 1 >> 1);
				if (local7 > local104) {
					local7 = local104;
				}
				local106 = arg1.anInt1164 + (local102.ja() + 1 >> 1);
				local108 = arg1.anInt1169 - (local102.JA() + 1 >> 1);
				if (local9 < local106) {
					local9 = local106;
				}
				if (local11 > local108) {
					local11 = local108;
				}
				local110 = arg1.anInt1169 + (local102.JA() + 1 >> 1);
				if (local13 < local110) {
					local13 = local110;
				}
			}
		}
		@Pc(214) Class251 local214 = null;
		@Pc(216) int local216 = 0;
		@Pc(218) int local218 = 0;
		@Pc(231) int local231 = 0;
		@Pc(233) int local233 = 0;
		@Pc(235) int local235 = 0;
		@Pc(237) int local237 = 0;
		@Pc(239) int local239 = 0;
		@Pc(289) int local289;
		@Pc(316) int local316;
		if (arg2.aString26 != null) {
			local214 = Static39.method519(arg2.anInt1178);
			if (local214 != null) {
				local216 = Static396.aClass62_9.method1158(Static69.aStringArray11, null, arg2.aString26, null);
				local218 = arg1.anInt1169;
				if (local102 == null) {
					local218 -= local214.method5662() * local216 / 2;
				} else {
					local218 -= (local102.JA() >> 1) + (local216 * local214.method5663());
				}
				for (local289 = 0; local289 < local216; local289++) {
					@Pc(295) String local295 = Static69.aStringArray11[local289];
					if (local216 - 1 > local289) {
						local295 = local295.substring(0, local295.length() - 4);
					}
					local316 = local214.method5664(local295);
					if (local316 > local231) {
						local231 = local316;
					}
				}
				local233 = arg1.anInt1164 - local231 / 2;
				if (local233 < local7) {
					local7 = local233;
				}
				local235 = arg1.anInt1164 + local231 / 2;
				local237 = local218;
				if (local235 > local9) {
					local9 = local235;
				}
				local239 = local218 + local216 * local214.method5663();
				if (local11 > local237) {
					local11 = local237;
				}
				if (local239 > local13) {
					local13 = local239;
				}
			}
		}
		if (local9 < Static350.anInt6643 || local7 > Static350.anInt6632 || Static350.anInt6641 > local13 || Static350.anInt6642 < local11) {
			return true;
		}
		@Pc(413) int local413;
		if (arg2.anIntArray56 != null) {
			@Pc(411) int[] local411 = new int[arg2.anIntArray56.length];
			for (local413 = 0; local413 < local411.length / 2; local413++) {
				local316 = arg1.anInt1163 + arg2.anIntArray56[local413 * 2];
				@Pc(438) int local438 = arg2.anIntArray56[local413 * 2 + 1] + arg1.anInt1160;
				local411[local413 * 2] = (Static350.anInt6632 - Static350.anInt6643) * (-Static350.anInt6637 + local316) / (Static350.anInt6640 - Static350.anInt6637) + Static350.anInt6643;
				local411[local413 * 2 + 1] = Static350.anInt6642 - (Static350.anInt6642 - Static350.anInt6641) * (local438 + -Static350.anInt6638) / (Static350.anInt6634 - Static350.anInt6638);
			}
			Static351.method5041(arg0, local411, arg2.anInt1181);
			for (local316 = 0; local316 < local411.length / 2 - 1; local316++) {
				arg0.method4636(local411[local316 * 2], local411[local316 * 2 + 1], local411[(local316 + 1) * 2], local411[(local316 + 1) * 2 + 1], arg2.anInt1204);
			}
			arg0.method4636(local411[local411.length - 2], local411[local411.length - 1], local411[0], local411[1], arg2.anInt1204);
		}
		if (local102 != null) {
			if (Static309.anInt5223 > 0 && (Static131.anInt2418 != -1 && Static131.anInt2418 == arg1.anInt1168 || Static347.anInt6360 != -1 && Static347.anInt6360 == arg2.anInt1179)) {
				if (Static203.anInt2040 > 50) {
					local289 = 200 - Static203.anInt2040 * 2;
				} else {
					local289 = Static203.anInt2040 * 2;
				}
				local413 = local289 << 24 | 0xFFFF00;
				arg0.method4584(arg1.anInt1169, local413, arg1.anInt1164, local102.UA() / 2 + 7);
				arg0.method4584(arg1.anInt1169, local413, arg1.anInt1164, local102.UA() / 2 + 5);
				arg0.method4584(arg1.anInt1169, local413, arg1.anInt1164, local102.UA() / 2 + 3);
				arg0.method4584(arg1.anInt1169, local413, arg1.anInt1164, local102.UA() / 2 + 1);
				arg0.method4584(arg1.anInt1169, local413, arg1.anInt1164, local102.UA() / 2);
			}
			local102.method6003(arg1.anInt1164 - (local102.ja() >> 1), arg1.anInt1169 + -(local102.JA() >> 1));
		}
		if (arg2.aString26 != null && local214 != null) {
			Static160.method5105(arg2, local231, arg1, arg0, local214, local216, local218);
		}
		if (arg2.anInt1197 != -1 || arg2.aString26 != null) {
			@Pc(728) Class1_Sub41 local728 = new Class1_Sub41(arg1);
			local728.anInt7096 = local235;
			local728.anInt7094 = local104;
			local728.anInt7089 = local237;
			local728.anInt7092 = local110;
			local728.anInt7097 = local106;
			local728.anInt7088 = local239;
			local728.anInt7095 = local233;
			local728.anInt7090 = local108;
			Static115.aClass142_15.method3212(local728);
		}
		return false;
	}
}
