import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static331 {

	@OriginalMember(owner = "client!mn", name = "m", descriptor = "Lclient!rw;")
	public static final Class297 aClass297_10 = new Class297(3, 2);

	@OriginalMember(owner = "client!mn", name = "o", descriptor = "I")
	public static int anInt5552 = 1;

	@OriginalMember(owner = "client!mn", name = "p", descriptor = "[F")
	public static final float[] aFloatArray32 = new float[16];

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(II)I")
	public static int method4527(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lclient!kq;I)V")
	public static void method4528(@OriginalArg(0) Class8_Sub5 arg0) {
		arg0.aClass8_Sub3_1 = null;
		@Pc(12) int local12 = arg0.aClass8_Sub4Array1.length;
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			arg0.aClass8_Sub4Array1[local14].aBoolean353 = false;
		}
		@Pc(33) Class209[] local33 = Class318.aClass209Array1;
		synchronized (Class318.aClass209Array1) {
			if (local12 < Class318.aClass209Array1.length && Static42.anIntArray83[local12] < 200) {
				Class318.aClass209Array1[local12].method4190(arg0);
				@Pc(56) int local56 = Static42.anIntArray83[local12]++;
			}
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(I)V")
	public static void method4529() {
		Static186.method2605();
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(B)I")
	public static int method4531() {
		return Static390.anInt6750;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(ZLclient!paa;B)V")
	public static void method4533(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class8_Sub3_Sub3_Sub1_Sub2 arg1) {
		if (Static337.anInt8004 >= 400) {
			return;
		}
		@Pc(22) Class20 local22 = arg1.aClass20_1;
		if (local22.anIntArray40 != null) {
			local22 = local22.method284(Static430.aClass321_1);
			if (local22 == null) {
				return;
			}
		}
		if (!local22.aBoolean36) {
			return;
		}
		@Pc(40) String local40 = local22.aString7;
		if (local22.anInt341 != 0) {
			@Pc(59) String local59 = Static586.aClass195_4 == Static246.aClass195_2 ? Static568.aClass351_34.method7651(Static307.anInt5279) : Static568.aClass351_32.method7651(Static307.anInt5279);
			local40 = local40 + Static251.method7515(Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anInt1736, local22.anInt341) + " (" + local59 + local22.anInt341 + ")";
		}
		if (Static573.aBoolean740 && !arg0) {
			@Pc(96) Class120 local96 = Static189.anInt3543 == -1 ? null : Static459.aClass38_2.method713(Static189.anInt3543);
			if ((Static258.anInt4645 & 0x2) != 0 && (local96 == null || local22.method276(local96.anInt2965, Static189.anInt3543) != local96.anInt2965)) {
				Static140.method7612(0, Static593.aString101 + " -> <col=ffff00>" + local40, 0, true, 25, -1, false, Static534.anInt8944, (long) arg1.anInt6821, Static302.aString46);
			}
		}
		if (!arg0) {
			@Pc(143) String[] local143 = local22.aStringArray3;
			if (Static181.aBoolean241) {
				local143 = Static57.method4963(local143);
			}
			@Pc(153) int local153;
			if (local143 != null) {
				for (local153 = 4; local153 >= 0; local153--) {
					if (local143[local153] != null && (local22.aByte19 == 0 || !local143[local153].equalsIgnoreCase(Static568.aClass351_27.method7651(Static307.anInt5279)))) {
						@Pc(173) byte local173 = 0;
						@Pc(175) int local175 = Static374.anInt6269;
						if (local153 == 0) {
							local173 = 15;
						}
						if (local153 == 1) {
							local173 = 13;
						}
						if (local153 == 2) {
							local173 = 49;
						}
						if (local153 == 3) {
							local173 = 30;
						}
						if (local153 == 4) {
							local173 = 45;
						}
						if (local153 == local22.anInt344) {
							local175 = local22.anInt351;
						}
						if (local153 == local22.anInt336) {
							local175 = local22.anInt337;
						}
						Static140.method7612(0, "<col=ffff00>" + local40, 0, true, local173, -1, false, local143[local153].equalsIgnoreCase(Static568.aClass351_27.method7651(Static307.anInt5279)) ? local22.anInt326 : local175, (long) arg1.anInt6821, local143[local153]);
					}
				}
			}
			if (local22.aByte19 == 1 && local143 != null) {
				for (local153 = 4; local153 >= 0; local153--) {
					if (local143[local153] != null && local143[local153].equalsIgnoreCase(Static568.aClass351_27.method7651(Static307.anInt5279))) {
						@Pc(293) short local293 = 0;
						if (local22.anInt341 > Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anInt1736) {
							local293 = 2000;
						}
						@Pc(306) short local306 = 0;
						if (local153 == 0) {
							local306 = 15;
						}
						if (local153 == 1) {
							local306 = 13;
						}
						if (local153 == 2) {
							local306 = 49;
						}
						if (local153 == 3) {
							local306 = 30;
						}
						if (local153 == 4) {
							local306 = 45;
						}
						if (local306 != 0) {
							local306 += local293;
						}
						Static140.method7612(0, "<col=ffff00>" + local40, 0, true, local306, -1, false, local22.anInt326, (long) arg1.anInt6821, local143[local153]);
					}
				}
			}
		}
		Static140.method7612(0, "<col=ffff00>" + local40, 0, true, 1007, -1, arg0, Static398.anInt7011, (long) arg1.anInt6821, Static568.aClass351_26.method7651(Static307.anInt5279));
	}
}
