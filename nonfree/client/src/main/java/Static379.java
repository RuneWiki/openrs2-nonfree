import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static379 {

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "[I")
	public static final int[] anIntArray375 = new int[32];

	@OriginalMember(owner = "client!mn", name = "c", descriptor = "Lclient!op;")
	public static final Class275 aClass275_12 = new Class275("", 19);

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIII)I")
	public static int method5862(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg2 / arg1;
		@Pc(13) int local13 = arg1 - 1 & arg2;
		@Pc(17) int local17 = arg0 / arg1;
		@Pc(23) int local23 = arg0 & arg1 - 1;
		@Pc(28) int local28 = Static162.method3207(local7, local17);
		@Pc(35) int local35 = Static162.method3207(local7 + 1, local17);
		@Pc(42) int local42 = Static162.method3207(local7, local17 + 1);
		@Pc(51) int local51 = Static162.method3207(local7 + 1, local17 - -1);
		@Pc(58) int local58 = Static323.method5076(local28, local13, arg1, local35);
		@Pc(65) int local65 = Static323.method5076(local42, local13, arg1, local51);
		return Static323.method5076(local58, local23, arg1, local65);
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Ljava/lang/String;ZZLclient!ft;Z)V")
	public static void method5863(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class122 arg2, @OriginalArg(4) boolean arg3) {
		Static118.method2175(arg2, arg1, "openjs", arg3, arg0);
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IBILclient!iga;Lclient!ha;Lclient!uja;)Z")
	public static boolean method5864(@OriginalArg(3) Class6_Sub24 arg0, @OriginalArg(4) Class75 arg1, @OriginalArg(5) Class361 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(9) int local9 = Integer.MIN_VALUE;
		@Pc(11) int local11 = Integer.MAX_VALUE;
		@Pc(13) int local13 = Integer.MIN_VALUE;
		if (arg2.anIntArray644 != null) {
			local9 = Static627.anInt7271 + (arg0.anInt4789 + arg2.anInt9812 - Static627.anInt7269) * (Static627.anInt7261 - Static627.anInt7271) / (Static627.anInt7262 - Static627.anInt7269);
			local13 = Static627.anInt7270 - (Static627.anInt7270 - Static627.anInt7267) * (arg2.anInt9822 - (-arg0.anInt4794 - -Static627.anInt7265)) / (Static627.anInt7263 - Static627.anInt7265);
			local7 = (arg2.anInt9791 + arg0.anInt4789 - Static627.anInt7269) * (Static627.anInt7261 - Static627.anInt7271) / (Static627.anInt7262 - Static627.anInt7269) + Static627.anInt7271;
			local11 = Static627.anInt7270 - (arg2.anInt9813 + arg0.anInt4794 - Static627.anInt7265) * (-Static627.anInt7267 + Static627.anInt7270) / (Static627.anInt7263 - Static627.anInt7265);
		}
		@Pc(102) Class49 local102 = null;
		@Pc(104) int local104 = 0;
		@Pc(106) int local106 = 0;
		@Pc(108) int local108 = 0;
		@Pc(110) int local110 = 0;
		if (arg2.anInt9805 != -1) {
			if (arg0.aBoolean365 && arg2.anInt9786 != -1) {
				local102 = arg2.method8531(true, arg1);
			} else {
				local102 = arg2.method8531(false, arg1);
			}
			if (local102 != null) {
				local104 = arg0.anInt4792 - (local102.method8991() + 1 >> 1);
				if (local7 > local104) {
					local7 = local104;
				}
				local106 = arg0.anInt4792 + (local102.method8991() + 1 >> 1);
				if (local106 > local9) {
					local9 = local106;
				}
				local108 = arg0.anInt4795 - (local102.method8987() + 1 >> 1);
				if (local108 < local11) {
					local11 = local108;
				}
				local110 = arg0.anInt4795 + (local102.method8987() + 1 >> 1);
				if (local110 > local13) {
					local13 = local110;
				}
			}
		}
		@Pc(217) Class259 local217 = null;
		@Pc(219) int local219 = 0;
		@Pc(221) int local221 = 0;
		@Pc(223) int local223 = 0;
		@Pc(225) int local225 = 0;
		@Pc(227) int local227 = 0;
		@Pc(229) int local229 = 0;
		@Pc(231) int local231 = 0;
		@Pc(240) int local240 = 0;
		@Pc(321) int local321;
		if (arg2.aString117 != null) {
			local217 = Static315.method4985(arg2.anInt9814);
			if (local217 != null) {
				local219 = Static574.aClass53_13.method812((Class49[]) null, (int[]) null, arg2.aString117, Static12.aStringArray4);
				local223 = arg0.anInt4795 - arg2.anInt9785 * (Static627.anInt7270 - Static627.anInt7267) / (Static627.anInt7263 - Static627.anInt7265);
				local221 = arg0.anInt4792 + arg2.anInt9807 * (Static627.anInt7261 - Static627.anInt7271) / (Static627.anInt7262 - Static627.anInt7269);
				if (local102 == null) {
					local223 -= local219 * local217.method6291() / 2;
				} else {
					local223 -= (local102.method8987() >> 1) + (local219 * local217.method6290());
				}
				for (local321 = 0; local321 < local219; local321++) {
					@Pc(327) String local327 = Static12.aStringArray4[local321];
					if (local321 < local219 - 1) {
						local327 = local327.substring(0, local327.length() - 4);
					}
					@Pc(348) int local348 = local217.method6287(local327);
					if (local348 > local225) {
						local225 = local348;
					}
				}
				local227 = local221 - local225 / 2;
				if (local227 < local7) {
					local7 = local227;
				}
				local229 = local221 + local225 / 2;
				if (local9 < local229) {
					local9 = local229;
				}
				local231 = local223;
				if (local11 > local231) {
					local11 = local231;
				}
				local240 = local223 + local217.method6290() * local219;
				if (local240 > local13) {
					local13 = local240;
				}
			}
		}
		if (local9 < Static627.anInt7271 || local7 > Static627.anInt7261 || local13 < Static627.anInt7267 || Static627.anInt7270 < local11) {
			return true;
		}
		Static627.method6487(arg1, arg0, arg2);
		if (local102 != null) {
			if (Static626.anInt9859 > 0 && (Static119.anInt2286 != -1 && Static119.anInt2286 == arg0.anInt4787 || Static604.anInt9539 != -1 && arg2.anInt9818 == Static604.anInt9539)) {
				if (Static344.anInt5861 <= 50) {
					local321 = Static344.anInt5861 * 2;
				} else {
					local321 = 200 - Static344.anInt5861 * 2;
				}
				@Pc(514) int local514 = local321 << 24 | 0xFFFF00;
				arg1.method6651(local102.method8988() / 2 + 7, arg0.anInt4792, arg0.anInt4795, local514);
				arg1.method6651(local102.method8988() / 2 + 5, arg0.anInt4792, arg0.anInt4795, local514);
				arg1.method6651(local102.method8988() / 2 + 3, arg0.anInt4792, arg0.anInt4795, local514);
				arg1.method6651(local102.method8988() / 2 + 1, arg0.anInt4792, arg0.anInt4795, local514);
				arg1.method6651(local102.method8988() / 2, arg0.anInt4792, arg0.anInt4795, local514);
			}
			local102.method8997(arg0.anInt4792 - (local102.method8991() >> 1), arg0.anInt4795 + -(local102.method8987() >> 1));
		}
		if (arg2.aString117 != null && local217 != null) {
			Static471.method7099(arg0, arg2, arg1, local225, local217, local219, local221, local223);
		}
		if (arg2.anInt9805 != -1 || arg2.aString117 != null) {
			@Pc(634) Class6_Sub20 local634 = new Class6_Sub20(arg0);
			local634.anInt3461 = local229;
			local634.anInt3460 = local104;
			local634.anInt3459 = local240;
			local634.anInt3455 = local108;
			local634.anInt3456 = local231;
			local634.anInt3463 = local110;
			local634.anInt3454 = local227;
			local634.anInt3457 = local106;
			Static527.aClass340_67.method8131(local634);
		}
		return false;
	}
}
