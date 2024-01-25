import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static574 {

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "I")
	public static int anInt9869 = -1;

	@OriginalMember(owner = "client!uh", name = "c", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray35 = new String[100];

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lclient!m;IILclient!ha;Lclient!aia;I)Z")
	public static boolean method7976(@OriginalArg(0) Class8_Sub35 arg0, @OriginalArg(3) Class16 arg1, @OriginalArg(4) Class17 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(9) int local9 = Integer.MIN_VALUE;
		@Pc(11) int local11 = Integer.MAX_VALUE;
		@Pc(13) int local13 = Integer.MIN_VALUE;
		if (arg2.anIntArray17 != null) {
			local11 = Static110.anInt7707 - (Static110.anInt7707 - Static110.anInt7706) * (arg0.anInt6536 + arg2.anInt793 - Static110.anInt7704) / (Static110.anInt7712 - Static110.anInt7704);
			local9 = Static110.anInt7709 + (Static110.anInt7711 - Static110.anInt7709) * (arg2.anInt784 + (arg0.anInt6532 - Static110.anInt7705)) / (Static110.anInt7710 - Static110.anInt7705);
			local7 = (arg2.anInt786 + arg0.anInt6532 - Static110.anInt7705) * (Static110.anInt7711 - Static110.anInt7709) / (Static110.anInt7710 - Static110.anInt7705) + Static110.anInt7709;
			local13 = Static110.anInt7707 - (arg0.anInt6536 + arg2.anInt813 - Static110.anInt7704) * (-Static110.anInt7706 + Static110.anInt7707) / (Static110.anInt7712 - Static110.anInt7704);
		}
		@Pc(101) Class21 local101 = null;
		@Pc(103) int local103 = 0;
		@Pc(105) int local105 = 0;
		@Pc(107) int local107 = 0;
		@Pc(109) int local109 = 0;
		if (arg2.anInt783 != -1) {
			if (arg0.aBoolean455 && arg2.anInt814 != -1) {
				local101 = arg2.method760(arg1, true);
			} else {
				local101 = arg2.method760(arg1, false);
			}
			if (local101 != null) {
				local103 = arg0.anInt6531 - (local101.method5779() + 1 >> 1);
				local105 = arg0.anInt6531 + (local101.method5779() + 1 >> 1);
				if (local7 > local103) {
					local7 = local103;
				}
				if (local105 > local9) {
					local9 = local105;
				}
				local107 = arg0.anInt6534 - (local101.method5785() + 1 >> 1);
				local109 = arg0.anInt6534 + (local101.method5785() + 1 >> 1);
				if (local107 < local11) {
					local11 = local107;
				}
				if (local109 > local13) {
					local13 = local109;
				}
			}
		}
		@Pc(208) Class285 local208 = null;
		@Pc(210) int local210 = 0;
		@Pc(212) int local212 = 0;
		@Pc(214) int local214 = 0;
		@Pc(221) int local221 = 0;
		@Pc(223) int local223 = 0;
		@Pc(225) int local225 = 0;
		@Pc(227) int local227 = 0;
		@Pc(229) int local229 = 0;
		@Pc(307) int local307;
		if (arg2.aString8 != null) {
			local208 = Static275.method4703(arg2.anInt802);
			if (local208 != null) {
				local210 = Static184.aClass345_9.method8117(Static196.aStringArray10, arg2.aString8, null, null);
				local212 = (Static110.anInt7711 - Static110.anInt7709) * arg2.anInt800 / (Static110.anInt7710 - Static110.anInt7705) + arg0.anInt6531;
				local214 = arg0.anInt6534 - (Static110.anInt7707 - Static110.anInt7706) * arg2.anInt815 / (Static110.anInt7712 - Static110.anInt7704);
				if (local101 == null) {
					local214 -= local210 * local208.method7066() / 2;
				} else {
					local214 -= (local101.method5785() >> 1) + local210 * local208.method7062();
				}
				for (local307 = 0; local307 < local210; local307++) {
					@Pc(313) String local313 = Static196.aStringArray10[local307];
					if (local210 - 1 > local307) {
						local313 = local313.substring(0, local313.length() - 4);
					}
					@Pc(334) int local334 = local208.method7064(local313);
					if (local221 < local334) {
						local221 = local334;
					}
				}
				local223 = local212 - local221 / 2;
				local225 = local221 / 2 + local212;
				if (local7 > local223) {
					local7 = local223;
				}
				local227 = local214;
				if (local225 > local9) {
					local9 = local225;
				}
				local229 = local210 * local208.method7062() + local214;
				if (local227 < local11) {
					local11 = local227;
				}
				if (local229 > local13) {
					local13 = local229;
				}
			}
		}
		if (Static110.anInt7709 > local9 || local7 > Static110.anInt7711 || Static110.anInt7706 > local13 || Static110.anInt7707 < local11) {
			return true;
		}
		Static110.method6400(arg1, arg0, arg2);
		if (local101 != null) {
			if (Static611.anInt10290 > 0 && (Static464.anInt8440 != -1 && Static464.anInt8440 == arg0.anInt6533 || Static182.anInt4253 != -1 && Static182.anInt4253 == arg2.anInt811)) {
				if (Static100.anInt2681 > 50) {
					local307 = 200 - Static100.anInt2681 * 2;
				} else {
					local307 = Static100.anInt2681 * 2;
				}
				@Pc(484) int local484 = local307 << 24 | 0xFFFF00;
				arg1.method6051(local484, local101.method5790() / 2 + 7, arg0.anInt6531, arg0.anInt6534);
				arg1.method6051(local484, local101.method5790() / 2 + 5, arg0.anInt6531, arg0.anInt6534);
				arg1.method6051(local484, local101.method5790() / 2 + 3, arg0.anInt6531, arg0.anInt6534);
				arg1.method6051(local484, local101.method5790() / 2 + 1, arg0.anInt6531, arg0.anInt6534);
				arg1.method6051(local484, local101.method5790() / 2, arg0.anInt6531, arg0.anInt6534);
			}
			local101.method5796(arg0.anInt6531 - (local101.method5779() >> 1), arg0.anInt6534 - (local101.method5785() >> 1));
		}
		if (arg2.aString8 != null && local208 != null) {
			Static435.method6734(local210, local221, local208, arg0, arg1, arg2, local212, local214);
		}
		if (arg2.anInt783 != -1 || arg2.aString8 != null) {
			@Pc(597) Class8_Sub7 local597 = new Class8_Sub7(arg0);
			local597.anInt1636 = local105;
			local597.anInt1641 = local225;
			local597.anInt1640 = local103;
			local597.anInt1642 = local223;
			local597.anInt1634 = local229;
			local597.anInt1637 = local109;
			local597.anInt1635 = local227;
			local597.anInt1638 = local107;
			Static52.aClass43_15.method1424(local597);
		}
		return false;
	}
}
