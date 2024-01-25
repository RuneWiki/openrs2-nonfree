import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static665 {

	@OriginalMember(owner = "client!wj", name = "p", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_195 = new Class359(13, 1);

	@OriginalMember(owner = "client!wj", name = "q", descriptor = "[I")
	public static final int[] anIntArray475 = new int[3];

	@OriginalMember(owner = "client!wj", name = "e", descriptor = "(B)V")
	public static void method7138() {
		for (@Pc(5) int local5 = 0; local5 < 5; local5++) {
			Static95.aBooleanArray30[local5] = false;
		}
		Static493.anInt8261 = -1;
		Static513.anInt8562 = -1;
		Static438.anInt7717 = -1;
		Static542.anInt6469 = -1;
		Static660.anInt10605 = 1;
		Static672.anInt10801 = 0;
		Static556.anInt9087 = 0;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILclient!kj;Lclient!ek;IZLclient!ha;)Z")
	public static boolean method7141(@OriginalArg(1) Class5_Sub36 arg0, @OriginalArg(2) Class103 arg1, @OriginalArg(5) Class65 arg2) {
		@Pc(5) int local5 = Integer.MAX_VALUE;
		@Pc(7) int local7 = Integer.MIN_VALUE;
		@Pc(9) int local9 = Integer.MAX_VALUE;
		@Pc(11) int local11 = Integer.MIN_VALUE;
		if (arg1.anIntArray105 != null) {
			local7 = (Static330.anInt758 - Static330.anInt765) * (arg0.anInt5981 + (arg1.anInt2791 - Static330.anInt761)) / (Static330.anInt754 - Static330.anInt761) + Static330.anInt765;
			local11 = Static330.anInt762 - (Static330.anInt762 - Static330.anInt757) * (-Static330.anInt760 + arg0.anInt5983 + arg1.anInt2799) / (Static330.anInt755 - Static330.anInt760);
			local5 = (arg1.anInt2794 + arg0.anInt5981 - Static330.anInt761) * (Static330.anInt758 - Static330.anInt765) / (Static330.anInt754 - Static330.anInt761) + Static330.anInt765;
			local9 = Static330.anInt762 - (Static330.anInt762 - Static330.anInt757) * (arg0.anInt5983 + arg1.anInt2795 - Static330.anInt760) / (Static330.anInt755 - Static330.anInt760);
		}
		@Pc(97) Class50 local97 = null;
		@Pc(99) int local99 = 0;
		@Pc(101) int local101 = 0;
		@Pc(103) int local103 = 0;
		@Pc(105) int local105 = 0;
		if (arg1.anInt2810 != -1) {
			if (arg0.aBoolean527 && arg1.anInt2820 != -1) {
				local97 = arg1.method2498(true, arg2);
			} else {
				local97 = arg1.method2498(false, arg2);
			}
			if (local97 != null) {
				local99 = arg0.anInt5979 - (local97.method6003() + 1 >> 1);
				if (local5 > local99) {
					local5 = local99;
				}
				local101 = arg0.anInt5979 + (local97.method6003() + 1 >> 1);
				local103 = arg0.anInt5985 - (local97.method6010() + 1 >> 1);
				if (local7 < local101) {
					local7 = local101;
				}
				local105 = arg0.anInt5985 + (local97.method6010() + 1 >> 1);
				if (local103 < local9) {
					local9 = local103;
				}
				if (local11 < local105) {
					local11 = local105;
				}
			}
		}
		@Pc(212) Class127 local212 = null;
		@Pc(214) int local214 = 0;
		@Pc(216) int local216 = 0;
		@Pc(218) int local218 = 0;
		@Pc(220) int local220 = 0;
		@Pc(227) int local227 = 0;
		@Pc(229) int local229 = 0;
		@Pc(231) int local231 = 0;
		@Pc(233) int local233 = 0;
		@Pc(310) int local310;
		if (arg1.aString17 != null) {
			local212 = Static207.method3303(arg1.anInt2808);
			if (local212 != null) {
				local214 = Static258.aClass247_9.method5768(arg1.aString17, (int[]) null, Static205.aStringArray12, (Class50[]) null);
				local218 = arg0.anInt5985 - (Static330.anInt762 - Static330.anInt757) * arg1.anInt2802 / (Static330.anInt755 - Static330.anInt760);
				local216 = arg0.anInt5979 + arg1.anInt2817 * (Static330.anInt758 - Static330.anInt765) / (Static330.anInt754 - Static330.anInt761);
				if (local97 == null) {
					local218 -= local212.method3094() * local214 / 2;
				} else {
					local218 -= (local97.method6010() >> 1) + (local212.method3090() * local214);
				}
				for (local310 = 0; local310 < local214; local310++) {
					@Pc(315) String local315 = Static205.aStringArray12[local310];
					if (local214 - 1 > local310) {
						local315 = local315.substring(0, local315.length() - 4);
					}
					@Pc(336) int local336 = local212.method3091(local315);
					if (local336 > local220) {
						local220 = local336;
					}
				}
				local227 = local216 - local220 / 2;
				local229 = local220 / 2 + local216;
				if (local5 > local227) {
					local5 = local227;
				}
				if (local7 < local229) {
					local7 = local229;
				}
				local231 = local218;
				if (local9 > local231) {
					local9 = local231;
				}
				local233 = local212.method3090() * local214 + local218;
				if (local233 > local11) {
					local11 = local233;
				}
			}
		}
		if (local7 < Static330.anInt765 || Static330.anInt758 < local5 || Static330.anInt757 > local11 || local9 > Static330.anInt762) {
			return true;
		}
		Static330.method689(arg2, arg0, arg1);
		if (local97 != null) {
			if (Static416.anInt7349 > 0 && (Static16.anInt256 != -1 && arg0.anInt5984 == Static16.anInt256 || Static426.anInt7486 != -1 && arg1.anInt2801 == Static426.anInt7486)) {
				if (Static150.anInt3080 > 50) {
					local310 = (100 - Static150.anInt3080) * 2;
				} else {
					local310 = Static150.anInt3080 * 2;
				}
				@Pc(478) int local478 = local310 << 24 | 0xFFFF00;
				arg2.method6938(arg0.anInt5979, local97.method6002() / 2 + 7, arg0.anInt5985, local478);
				arg2.method6938(arg0.anInt5979, local97.method6002() / 2 + 5, arg0.anInt5985, local478);
				arg2.method6938(arg0.anInt5979, local97.method6002() / 2 + 3, arg0.anInt5985, local478);
				arg2.method6938(arg0.anInt5979, local97.method6002() / 2 + 1, arg0.anInt5985, local478);
				arg2.method6938(arg0.anInt5979, local97.method6002() / 2, arg0.anInt5985, local478);
			}
			local97.method5996(arg0.anInt5979 - (local97.method6003() >> 1), arg0.anInt5985 + -(local97.method6010() >> 1));
		}
		if (arg1.aString17 != null && local212 != null) {
			Static393.method5760(local218, arg2, local212, local220, arg0, arg1, local216, local214);
		}
		if (arg1.anInt2810 != -1 || arg1.aString17 != null) {
			@Pc(590) Class5_Sub48 local590 = new Class5_Sub48(arg0);
			local590.anInt8589 = local231;
			local590.anInt8590 = local101;
			local590.anInt8594 = local103;
			local590.anInt8588 = local229;
			local590.anInt8582 = local227;
			local590.anInt8586 = local99;
			local590.anInt8593 = local233;
			local590.anInt8584 = local105;
			Static38.aClass114_4.method2807(local590);
		}
		return false;
	}
}
