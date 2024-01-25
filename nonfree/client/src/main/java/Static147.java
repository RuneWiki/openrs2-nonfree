import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!hb", name = "E", descriptor = "Lclient!l;")
	public static Interface7 anInterface7_3;

	@OriginalMember(owner = "client!hb", name = "G", descriptor = "Lclient!hk;")
	public static Class107 aClass107_1;

	@OriginalMember(owner = "client!hb", name = "D", descriptor = "Lclient!bj;")
	public static final Class27 aClass27_55 = new Class27(68, 12);

	@OriginalMember(owner = "client!hb", name = "F", descriptor = "Lclient!os;")
	public static final Class182 aClass182_107 = new Class182("M", "M", "M", "M");

	@OriginalMember(owner = "client!hb", name = "H", descriptor = "Lclient!s;")
	public static final Class217 aClass217_66 = new Class217(55, -2);

	@OriginalMember(owner = "client!hb", name = "I", descriptor = "[I")
	public static final int[] anIntArray294 = new int[2048];

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(BILclient!za;Lclient!rk;ILclient!wk;)Z")
	public static boolean method2562(@OriginalArg(2) Class50 arg0, @OriginalArg(3) Class208 arg1, @OriginalArg(5) Class10_Sub46 arg2) {
		@Pc(12) int local12 = Integer.MAX_VALUE;
		@Pc(14) int local14 = Integer.MIN_VALUE;
		@Pc(16) int local16 = Integer.MAX_VALUE;
		@Pc(18) int local18 = Integer.MIN_VALUE;
		if (arg1.anIntArray574 != null) {
			local14 = (arg2.anInt7526 + arg1.anInt6017 - Static143.anInt2859) * (Static143.anInt2866 - Static143.anInt2860) / (Static143.anInt2858 - Static143.anInt2859) + Static143.anInt2860;
			local12 = Static143.anInt2860 + (Static143.anInt2866 - Static143.anInt2860) * (arg2.anInt7526 + arg1.anInt6008 - Static143.anInt2859) / (Static143.anInt2858 - Static143.anInt2859);
			local16 = Static143.anInt2864 - (arg1.anInt6010 + arg2.anInt7523 - Static143.anInt2869) * (Static143.anInt2864 - Static143.anInt2862) / (Static143.anInt2865 - Static143.anInt2869);
			local18 = Static143.anInt2864 - (arg2.anInt7523 + arg1.anInt6012 - Static143.anInt2869) * (-Static143.anInt2862 + Static143.anInt2864) / (Static143.anInt2865 - Static143.anInt2869);
		}
		@Pc(107) Class80 local107 = null;
		@Pc(109) int local109 = 0;
		@Pc(111) int local111 = 0;
		@Pc(113) int local113 = 0;
		@Pc(115) int local115 = 0;
		if (arg1.anInt6000 != -1) {
			if (arg2.aBoolean496 && arg1.anInt6004 != -1) {
				local107 = arg1.method4752(true, arg0);
			} else {
				local107 = arg1.method4752(false, arg0);
			}
			if (local107 != null) {
				local109 = arg2.anInt7520 - (local107.RA() + 1 >> 1);
				local111 = arg2.anInt7520 + (local107.RA() + 1 >> 1);
				if (local109 < local12) {
					local12 = local109;
				}
				local113 = arg2.anInt7525 - (local107.Q() + 1 >> 1);
				if (local111 > local14) {
					local14 = local111;
				}
				local115 = arg2.anInt7525 + (local107.Q() + 1 >> 1);
				if (local113 < local16) {
					local16 = local113;
				}
				if (local18 < local115) {
					local18 = local115;
				}
			}
		}
		@Pc(213) Class262 local213 = null;
		@Pc(215) int local215 = 0;
		@Pc(217) int local217 = 0;
		@Pc(219) int local219 = 0;
		@Pc(221) int local221 = 0;
		@Pc(223) int local223 = 0;
		@Pc(225) int local225 = 0;
		@Pc(227) int local227 = 0;
		@Pc(276) int local276;
		@Pc(299) int local299;
		if (arg1.aString55 != null) {
			local213 = Static249.method3618(arg1.anInt5993);
			if (local213 != null) {
				local215 = Static38.aClass79_1.method1986(Static369.aStringArray45, arg1.aString55, null, null);
				local217 = arg2.anInt7525;
				if (local107 == null) {
					local217 -= local215 * local213.method5748() / 2;
				} else {
					local217 -= (local107.Q() >> 1) + local215 * local213.method5749();
				}
				for (local276 = 0; local276 < local215; local276++) {
					@Pc(282) String local282 = Static369.aStringArray45[local276];
					if (local276 < local215 - 1) {
						local282 = local282.substring(0, local282.length() - 4);
					}
					local299 = local213.method5750(local282);
					if (local299 > local219) {
						local219 = local299;
					}
				}
				local221 = arg2.anInt7520 - local219 / 2;
				if (local12 > local221) {
					local12 = local221;
				}
				local223 = arg2.anInt7520 + local219 / 2;
				if (local223 > local14) {
					local14 = local223;
				}
				local225 = local217;
				local227 = local217 + local215 * local213.method5749();
				if (local225 < local16) {
					local16 = local225;
				}
				if (local227 > local18) {
					local18 = local227;
				}
			}
		}
		if (local14 < Static143.anInt2860 || local12 > Static143.anInt2866 || Static143.anInt2862 > local18 || Static143.anInt2864 < local16) {
			return true;
		}
		@Pc(411) int local411;
		if (arg1.anIntArray574 != null) {
			@Pc(409) int[] local409 = new int[arg1.anIntArray574.length];
			for (local411 = 0; local411 < local409.length / 2; local411++) {
				local299 = arg1.anIntArray574[local411 * 2] + arg2.anInt7526;
				@Pc(435) int local435 = arg1.anIntArray574[local411 * 2 + 1] + arg2.anInt7523;
				local409[local411 * 2] = Static143.anInt2860 + (Static143.anInt2866 - Static143.anInt2860) * (-Static143.anInt2859 + local299) / (Static143.anInt2858 - Static143.anInt2859);
				local409[local411 * 2 + 1] = Static143.anInt2864 - (Static143.anInt2864 - Static143.anInt2862) * (-Static143.anInt2869 + local435) / (Static143.anInt2865 - Static143.anInt2869);
			}
			Static303.method4224(arg0, local409, arg1.anInt6020);
			for (local299 = 0; local299 < local409.length / 2 - 1; local299++) {
				arg0.method5840(local409[local299 * 2], local409[(local299 + 1) * 2 + 1], local409[local299 * 2 + 1], local409[(local299 + 1) * 2], arg1.anInt6009);
			}
			arg0.method5840(local409[local409.length - 2], local409[1], local409[local409.length - 1], local409[0], arg1.anInt6009);
		}
		if (local107 != null) {
			if (Static301.anInt5208 > 0 && (Static7.anInt120 != -1 && Static7.anInt120 == arg2.anInt7522 || Static36.anInt599 != -1 && Static36.anInt599 == arg1.anInt6003)) {
				if (Static351.anInt6021 > 50) {
					local276 = 200 - Static351.anInt6021 * 2;
				} else {
					local276 = Static351.anInt6021 * 2;
				}
				local411 = local276 << 24 | 0xFFFF00;
				arg0.method5820(local411, local107.YA() / 2 + 7, arg2.anInt7520, arg2.anInt7525);
				arg0.method5820(local411, local107.YA() / 2 + 5, arg2.anInt7520, arg2.anInt7525);
				arg0.method5820(local411, local107.YA() / 2 + 3, arg2.anInt7520, arg2.anInt7525);
				arg0.method5820(local411, local107.YA() / 2 + 1, arg2.anInt7520, arg2.anInt7525);
				arg0.method5820(local411, local107.YA() / 2, arg2.anInt7520, arg2.anInt7525);
			}
			local107.method5558(arg2.anInt7520 - (local107.RA() >> 1), arg2.anInt7525 - (local107.Q() >> 1));
		}
		if (arg1.aString55 != null && local213 != null) {
			Static62.method1042(local219, local217, local215, arg0, arg2, arg1, local213);
		}
		if (arg1.anInt6000 != -1 || arg1.aString55 != null) {
			@Pc(725) Class10_Sub5 local725 = new Class10_Sub5(arg2);
			local725.anInt563 = local109;
			local725.anInt562 = local113;
			local725.anInt561 = local225;
			local725.anInt566 = local115;
			local725.anInt567 = local223;
			local725.anInt570 = local111;
			local725.anInt569 = local221;
			local725.anInt565 = local227;
			Static339.aClass163_38.method3613(local725);
		}
		return false;
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)V")
	public static void method2563() {
		if (Static122.aBoolean183) {
			return;
		}
		Static122.aBoolean183 = true;
		if (Static361.aClass85_Sub1_1.aBoolean164) {
			Static16.aFloat6 = (int) Static16.aFloat6 - 17 & 0xFFFFFFF0;
		} else {
			Static141.aFloat52 += (-12.0F - Static141.aFloat52) / 2.0F;
		}
		Static406.aBoolean448 = true;
	}
}
