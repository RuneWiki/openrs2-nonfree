import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static409 {

	@OriginalMember(owner = "client!on", name = "j", descriptor = "[I")
	public static int[] anIntArray457;

	@OriginalMember(owner = "client!on", name = "a", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray28 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!on", name = "e", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_109 = new Class200(21, 6);

	@OriginalMember(owner = "client!on", name = "l", descriptor = "I")
	public static int anInt7484 = 0;

	@OriginalMember(owner = "client!on", name = "q", descriptor = "[Lclient!vo;")
	public static final Class361[] aClass361Array1 = new Class361[14];

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(I[FI)[F")
	public static float[] method6494(@OriginalArg(1) float[] arg0, @OriginalArg(2) int arg1) {
		@Pc(6) float[] local6 = new float[arg1];
		Static653.method6854(arg0, 0, local6, 0, arg1);
		return local6;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(BILclient!jc;)V")
	public static void method6496(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub3_Sub2 arg1) {
		@Pc(15) boolean local15 = arg1.method4276(1) == 1;
		if (local15) {
			Static586.anIntArray619[Static241.anInt4470++] = arg0;
		}
		@Pc(30) int local30 = arg1.method4276(2);
		@Pc(34) Class4_Sub1_Sub2_Sub1_Sub2 local34 = Static42.aClass4_Sub1_Sub2_Sub1_Sub2Array1[arg0];
		if (local30 != 0) {
			@Pc(141) int local141;
			@Pc(146) int local146;
			@Pc(151) int local151;
			if (local30 == 1) {
				local141 = arg1.method4276(3);
				local146 = local34.anIntArray310[0];
				local151 = local34.anIntArray309[0];
				if (local141 == 0) {
					local146--;
					local151--;
				} else if (local141 == 1) {
					local151--;
				} else if (local141 == 2) {
					local146++;
					local151--;
				} else if (local141 == 3) {
					local146--;
				} else if (local141 == 4) {
					local146++;
				} else if (local141 == 5) {
					local146--;
					local151++;
				} else if (local141 == 6) {
					local151++;
				} else if (local141 == 7) {
					local151++;
					local146++;
				}
				if (local15) {
					local34.anInt5833 = local146;
					local34.aBoolean412 = true;
					local34.anInt5814 = local151;
				} else {
					local34.method5088(local146, local151, Static420.aByteArray80[arg0]);
				}
			} else if (local30 == 2) {
				local141 = arg1.method4276(4);
				local146 = local34.anIntArray310[0];
				local151 = local34.anIntArray309[0];
				if (local141 == 0) {
					local146 -= 2;
					local151 -= 2;
				} else if (local141 == 1) {
					local146--;
					local151 -= 2;
				} else if (local141 == 2) {
					local151 -= 2;
				} else if (local141 == 3) {
					local146++;
					local151 -= 2;
				} else if (local141 == 4) {
					local146 += 2;
					local151 -= 2;
				} else if (local141 == 5) {
					local146 -= 2;
					local151--;
				} else if (local141 == 6) {
					local146 += 2;
					local151--;
				} else if (local141 == 7) {
					local146 -= 2;
				} else if (local141 == 8) {
					local146 += 2;
				} else if (local141 == 9) {
					local151++;
					local146 -= 2;
				} else if (local141 == 10) {
					local151++;
					local146 += 2;
				} else if (local141 == 11) {
					local151 += 2;
					local146 -= 2;
				} else if (local141 == 12) {
					local151 += 2;
					local146--;
				} else if (local141 == 13) {
					local151 += 2;
				} else if (local141 == 14) {
					local151 += 2;
					local146++;
				} else if (local141 == 15) {
					local151 += 2;
					local146 += 2;
				}
				if (local15) {
					local34.aBoolean412 = true;
					local34.anInt5833 = local146;
					local34.anInt5814 = local151;
				} else {
					local34.method5088(local146, local151, Static420.aByteArray80[arg0]);
				}
			} else {
				local141 = arg1.method4276(1);
				@Pc(419) int local419;
				@Pc(429) int local429;
				@Pc(441) int local441;
				@Pc(448) int local448;
				if (local141 == 0) {
					local146 = arg1.method4276(12);
					local151 = local146 >> 10;
					local419 = local146 >> 5 & 0x1F;
					if (local419 > 15) {
						local419 -= 32;
					}
					local429 = local146 & 0x1F;
					if (local429 > 15) {
						local429 -= 32;
					}
					local441 = local34.anIntArray310[0] + local419;
					local448 = local34.anIntArray309[0] + local429;
					if (local15) {
						local34.anInt5814 = local448;
						local34.anInt5833 = local441;
						local34.aBoolean412 = true;
					} else {
						local34.method5088(local441, local448, Static420.aByteArray80[arg0]);
					}
					local34.aByte123 = local34.aByte124 = (byte) (local34.aByte123 + local151 & 0x3);
					if (Static486.method7232(local448, local441)) {
						local34.aByte124++;
					}
					if (arg0 == Static97.anInt2234) {
						if (local34.aByte123 != Static549.anInt9262) {
							Static585.aBoolean690 = true;
						}
						Static549.anInt9262 = local34.aByte123;
					}
				} else {
					local146 = arg1.method4276(30);
					local151 = local146 >> 28;
					local419 = local146 >> 14 & 0x3FFF;
					local429 = local146 & 0x3FFF;
					local441 = (local419 + Static299.anInt5307 + local34.anIntArray310[0] & 0x3FFF) - Static299.anInt5307;
					local448 = (local429 + Static171.anInt3340 + local34.anIntArray309[0] & 0x3FFF) - Static171.anInt3340;
					if (local15) {
						local34.anInt5833 = local441;
						local34.aBoolean412 = true;
						local34.anInt5814 = local448;
					} else {
						local34.method5088(local441, local448, Static420.aByteArray80[arg0]);
					}
					local34.aByte123 = local34.aByte124 = (byte) (local34.aByte123 + local151 & 0x3);
					if (Static486.method7232(local448, local441)) {
						local34.aByte124++;
					}
					if (Static97.anInt2234 == arg0) {
						Static549.anInt9262 = local34.aByte123;
					}
				}
			}
		} else if (local15) {
			local34.aBoolean412 = false;
		} else if (Static97.anInt2234 == arg0) {
			throw new RuntimeException("s:lr");
		} else {
			@Pc(61) Class12 local61 = Static135.aClass12Array1[arg0] = new Class12();
			local61.anInt751 = (Static171.anInt3340 + local34.anIntArray309[0] >> 6) + ((local34.aByte123 << 28) + (Static299.anInt5307 + local34.anIntArray310[0] >> 6 << 14));
			if (local34.anInt5818 == -1) {
				local61.anInt748 = local34.aClass63_7.method1994();
			} else {
				local61.anInt748 = local34.anInt5818;
			}
			local61.anInt749 = local34.anInt5744;
			local61.aBoolean59 = local34.aBoolean408;
			if (local34.anInt5819 > 0) {
				Static313.method5145(local34);
			}
			Static42.aClass4_Sub1_Sub2_Sub1_Sub2Array1[arg0] = null;
			if (arg1.method4276(1) != 0) {
				Static494.method7323(arg1, arg0);
			}
		}
	}
}
