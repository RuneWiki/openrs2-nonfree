import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static632 {

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "I")
	public static int anInt10928;

	@OriginalMember(owner = "client!vh", name = "e", descriptor = "I")
	public static int anInt10931;

	@OriginalMember(owner = "client!vh", name = "f", descriptor = "Lclient!gga;")
	public static Class124 aClass124_129;

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger3 = new BigInteger("99f3676f97fb8bbdf273a5262b7170c53b2e682c2236e4e4cbafa8a332006566243ec843eb13c7d874b044a65ccf5b6f801f4bc526f09a1db20e3c07c02d5b77", 16);

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lclient!ha;Lclient!ll;BLclient!jg;II)Z")
	public static boolean method9342(@OriginalArg(0) Class101 arg0, @OriginalArg(1) Class218 arg1, @OriginalArg(3) Class2_Sub33 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(9) int local9 = Integer.MIN_VALUE;
		@Pc(11) int local11 = Integer.MAX_VALUE;
		@Pc(13) int local13 = Integer.MIN_VALUE;
		if (arg1.anIntArray319 != null) {
			local11 = Static331.anInt10595 - (Static331.anInt10595 - Static331.anInt10593) * (-Static331.anInt10588 + arg2.anInt5210 + arg1.anInt6709) / (Static331.anInt10585 - Static331.anInt10588);
			local7 = (Static331.anInt10586 - Static331.anInt10591) * (arg2.anInt5213 + arg1.anInt6691 - Static331.anInt10592) / (Static331.anInt10584 - Static331.anInt10592) + Static331.anInt10591;
			local13 = Static331.anInt10595 - (Static331.anInt10595 - Static331.anInt10593) * (arg2.anInt5210 + arg1.anInt6694 - Static331.anInt10588) / (Static331.anInt10585 - Static331.anInt10588);
			local9 = Static331.anInt10591 + (Static331.anInt10586 - Static331.anInt10591) * (arg2.anInt5213 + (arg1.anInt6717 - Static331.anInt10592)) / (Static331.anInt10584 - Static331.anInt10592);
		}
		@Pc(99) Class71 local99 = null;
		@Pc(101) int local101 = 0;
		@Pc(103) int local103 = 0;
		@Pc(105) int local105 = 0;
		@Pc(107) int local107 = 0;
		if (arg1.anInt6690 != -1) {
			if (arg2.aBoolean393 && arg1.anInt6702 != -1) {
				local99 = arg1.method6005(true, arg0);
			} else {
				local99 = arg1.method6005(false, arg0);
			}
			if (local99 != null) {
				local101 = arg2.anInt5217 - (local99.method7709() + 1 >> 1);
				if (local7 > local101) {
					local7 = local101;
				}
				local103 = arg2.anInt5217 + (local99.method7709() + 1 >> 1);
				if (local103 > local9) {
					local9 = local103;
				}
				local105 = arg2.anInt5212 - (local99.method7711() + 1 >> 1);
				if (local11 > local105) {
					local11 = local105;
				}
				local107 = arg2.anInt5212 + (local99.method7711() + 1 >> 1);
				if (local107 > local13) {
					local13 = local107;
				}
			}
		}
		@Pc(205) Class144 local205 = null;
		@Pc(212) int local212 = 0;
		@Pc(214) int local214 = 0;
		@Pc(216) int local216 = 0;
		@Pc(218) int local218 = 0;
		@Pc(220) int local220 = 0;
		@Pc(222) int local222 = 0;
		@Pc(224) int local224 = 0;
		@Pc(226) int local226 = 0;
		@Pc(304) int local304;
		if (arg1.aString76 != null) {
			local205 = Static52.method1053(arg1.anInt6703);
			if (local205 != null) {
				local212 = Static6.aClass324_1.method8186(Static265.aStringArray27, (Class71[]) null, arg1.aString76, (int[]) null);
				local214 = arg1.anInt6713 * (Static331.anInt10586 - Static331.anInt10591) / (Static331.anInt10584 - Static331.anInt10592) + arg2.anInt5217;
				local216 = arg2.anInt5212 - arg1.anInt6699 * (Static331.anInt10595 - Static331.anInt10593) / (Static331.anInt10585 - Static331.anInt10588);
				if (local99 == null) {
					local216 -= local205.method4124() * local212 / 2;
				} else {
					local216 -= (local99.method7711() >> 1) + (local205.method4119() * local212);
				}
				for (local304 = 0; local304 < local212; local304++) {
					@Pc(310) String local310 = Static265.aStringArray27[local304];
					if (local212 - 1 > local304) {
						local310 = local310.substring(0, local310.length() - 4);
					}
					@Pc(327) int local327 = local205.method4125(local310);
					if (local218 < local327) {
						local218 = local327;
					}
				}
				local220 = local214 - local218 / 2;
				local222 = local214 + local218 / 2;
				if (local7 > local220) {
					local7 = local220;
				}
				if (local222 > local9) {
					local9 = local222;
				}
				local224 = local216;
				if (local224 < local11) {
					local11 = local224;
				}
				local226 = local205.method4119() * local212 + local216;
				if (local13 < local226) {
					local13 = local226;
				}
			}
		}
		if (Static331.anInt10591 > local9 || Static331.anInt10586 < local7 || Static331.anInt10593 > local13 || Static331.anInt10595 < local11) {
			return true;
		}
		Static331.method9066(arg0, arg2, arg1);
		if (local99 != null) {
			if (Static240.anInt4759 > 0 && (Static36.anInt626 != -1 && Static36.anInt626 == arg2.anInt5215 || Static58.anInt1135 != -1 && arg1.anInt6683 == Static58.anInt1135)) {
				if (Static542.anInt9479 > 50) {
					local304 = 200 - Static542.anInt9479 * 2;
				} else {
					local304 = Static542.anInt9479 * 2;
				}
				@Pc(476) int local476 = local304 << 24 | 0xFFFF00;
				arg0.method8078(local99.method7691() / 2 + 7, arg2.anInt5212, arg2.anInt5217, local476);
				arg0.method8078(local99.method7691() / 2 + 5, arg2.anInt5212, arg2.anInt5217, local476);
				arg0.method8078(local99.method7691() / 2 + 3, arg2.anInt5212, arg2.anInt5217, local476);
				arg0.method8078(local99.method7691() / 2 + 1, arg2.anInt5212, arg2.anInt5217, local476);
				arg0.method8078(local99.method7691() / 2, arg2.anInt5212, arg2.anInt5217, local476);
			}
			local99.method7703(arg2.anInt5217 - (local99.method7709() >> 1), arg2.anInt5212 - (local99.method7711() >> 1));
		}
		if (arg1.aString76 != null && local205 != null) {
			Static626.method9301(local218, local205, arg2, local216, arg1, local212, local214, arg0);
		}
		if (arg1.anInt6690 != -1 || arg1.aString76 != null) {
			@Pc(588) Class2_Sub53 local588 = new Class2_Sub53(arg2);
			local588.anInt10977 = local226;
			local588.anInt10983 = local105;
			local588.anInt10976 = local101;
			local588.anInt10985 = local222;
			local588.anInt10981 = local220;
			local588.anInt10980 = local103;
			local588.anInt10979 = local224;
			local588.anInt10984 = local107;
			Class15_Sub3_Sub3_Sub2.lb.method7174(local588);
		}
		return false;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(ZIII)Lclient!gga;")
	public static Class124 method9343(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class47 local5 = null;
		if (Static329.aClass141_4 != null) {
			local5 = new Class47(arg1, Static329.aClass141_4, Static192.aClass141Array1[arg1], 1000000);
		}
		Static534.aClass51_Sub1Array12[arg1] = Static173.aClass382_1.method9529(Static30.aClass47_1, arg1, local5);
		Static534.aClass51_Sub1Array12[arg1].method8058();
		return new Class124(Static534.aClass51_Sub1Array12[arg1], arg0, arg2);
	}
}
