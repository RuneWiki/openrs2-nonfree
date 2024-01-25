import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!fj", name = "e", descriptor = "I")
	public static int anInt2797 = 0;

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lclient!vt;I)I")
	public static int method2343(@OriginalArg(0) Class310 arg0) {
		if (Static524.aClass310_13 == arg0) {
			return 5120;
		} else if (Static524.aClass310_14 == arg0) {
			return 5122;
		} else if (arg0 == Static524.aClass310_15) {
			return 5124;
		} else if (Static524.aClass310_16 == arg0) {
			return 5121;
		} else if (Static524.aClass310_17 == arg0) {
			return 5123;
		} else if (Static524.aClass310_18 == arg0) {
			return 5125;
		} else if (arg0 == Static524.aClass310_19) {
			return 5131;
		} else if (arg0 == Static524.aClass310_20) {
			return 5126;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Z)[Lclient!raa;")
	public static Class253[] method2344() {
		return new Class253[] { Static327.aClass253_10, Static345.aClass253_11, Static341.aClass253_16, Static92.aClass253_5, Static440.aClass253_13, Static22.aClass253_14 };
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IILjava/awt/Canvas;Lclient!e;)Lclient!oa;")
	public static Class5 method2345(@OriginalArg(1) int arg0, @OriginalArg(2) Canvas arg1, @OriginalArg(3) Interface4 arg2) {
		return new Class5_Sub1(arg1, arg2, arg0);
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)V")
	public static void method2346() {
		Static118.aClass71_21.method2088();
		Static439.aClass71_61.method2088();
		@Pc(26) int local26;
		for (@Pc(21) Class3_Sub11 local21 = (Class3_Sub11) Static255.aClass71_43.method2089(); local21 != null; local21 = (Class3_Sub11) Static255.aClass71_43.method2086()) {
			local26 = local21.anInt1419;
			if (local26 < 1000) {
				local21.method7820();
				if (local26 == 44 || local26 == 9 || local26 == 2 || local26 == 15 || local26 == 46 || local26 == 45 || local26 == 13) {
					Static439.aClass71_61.method2076(local21);
				} else {
					Static118.aClass71_21.method2076(local21);
				}
			}
		}
		Static118.aClass71_21.method2083(Static255.aClass71_43);
		Static439.aClass71_61.method2083(Static255.aClass71_43);
		if (Static179.anInt4933 <= 1) {
			Static495.aClass3_Sub11_4 = null;
		} else if (Static37.aBoolean72 && Static364.aClass101_1.method2589(81) && Static179.anInt4933 > 2) {
			Static495.aClass3_Sub11_4 = (Class3_Sub11) Static255.aClass71_43.aClass3_73.aClass3_283.aClass3_283;
		} else {
			Static495.aClass3_Sub11_4 = (Class3_Sub11) Static255.aClass71_43.aClass3_73.aClass3_283;
		}
		local26 = -1;
		@Pc(129) Class3_Sub19 local129 = (Class3_Sub19) Static71.aClass71_16.method2089();
		if (local129 != null) {
			local26 = local129.method4962();
		}
		if (!Static228.aBoolean342) {
			if (local26 == 0 && (Static19.anInt703 == 1 && Static179.anInt4933 > 2 || Static10.method637())) {
				local26 = 2;
			}
			if (local26 == 2 && Static179.anInt4933 > 0 && local129 != null) {
				if (Static166.aClass245_12 == null && Static523.anInt9115 == 0) {
					Static517.method7380(local129.method4956(), local129.method4957());
				} else {
					Static176.anInt4102 = 2;
				}
			}
			if (local26 == 0 && Static179.anInt4933 > 0) {
				Static327.method5219();
			}
			if (Static166.aClass245_12 == null && Static523.anInt9115 == 0) {
				Static399.aClass3_Sub11_5 = null;
				Static176.anInt4102 = 0;
				return;
			}
			return;
		}
		@Pc(207) int local207;
		@Pc(211) int local211;
		if (local26 == -1) {
			local207 = Static35.aClass54_1.method4074();
			local211 = Static35.aClass54_1.method4071();
			if (local207 < Static87.anInt1887 - 10 || Static87.anInt1887 + Static256.anInt5196 + 10 < local207 || Static386.anInt7125 - 10 > local211 || Static386.anInt7125 + Static199.anInt4475 + 10 < local211) {
				Static195.method3710();
			}
		}
		if (local26 != 0) {
			return;
		}
		local207 = Static87.anInt1887;
		local211 = Static386.anInt7125;
		@Pc(251) int local251 = Static256.anInt5196;
		@Pc(255) int local255 = local129.method4956();
		@Pc(259) int local259 = local129.method4957();
		@Pc(261) int local261 = -1;
		@Pc(280) int local280;
		for (@Pc(263) int local263 = 0; local263 < Static179.anInt4933; local263++) {
			if (Static346.aBoolean416) {
				local280 = (Static179.anInt4933 - local263 - 1) * 16 + local211 + 33;
				if (local207 < local255 && local255 < local251 + local207 && local280 - 13 < local259 && local280 + 4 > local259) {
					local261 = local263;
				}
			} else {
				local280 = (Static179.anInt4933 - local263 - 1) * 16 + local211 + 31;
				if (local207 < local255 && local255 < local251 + local207 && local259 > local280 - 13 && local280 + 3 > local259) {
					local261 = local263;
				}
			}
		}
		if (local261 != -1) {
			local280 = 0;
			@Pc(368) Class157 local368 = new Class157(Static255.aClass71_43);
			for (@Pc(373) Class3_Sub11 local373 = (Class3_Sub11) local368.method4203(); local373 != null; local373 = (Class3_Sub11) local368.method4206()) {
				if (local261 == local280) {
					Static309.method174(local255, local259, local373);
				}
				local280++;
			}
		}
		Static195.method3710();
	}
}
