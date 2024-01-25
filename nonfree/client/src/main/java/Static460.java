import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static460 {

	@OriginalMember(owner = "client!oka", name = "v", descriptor = "[Lclient!oaa;")
	public static Class256_Sub1[] aClass256_Sub1Array2;

	@OriginalMember(owner = "client!oka", name = "z", descriptor = "I")
	public static int anInt8099 = 1;

	@OriginalMember(owner = "client!oka", name = "F", descriptor = "[J")
	public static final long[] aLongArray21 = new long[32];

	@OriginalMember(owner = "client!oka", name = "a", descriptor = "(Lclient!wka;B)V")
	public static void method6824(@OriginalArg(0) Class19_Sub1_Sub3_Sub2 arg0) {
		@Pc(8) Class100 local8 = arg0.aClass100_8;
		if (local8.method8963() && local8.method8971(1) && local8.method8959()) {
			if (arg0.aBoolean595) {
				local8.method8962(arg0.method6600().method6901());
				arg0.aBoolean595 = local8.method8963();
			}
			local8.method8958();
		}
		@Pc(74) Class100 local74;
		for (@Pc(57) int local57 = 0; local57 < arg0.aClass385Array3.length; local57++) {
			if (arg0.aClass385Array3[local57].anInt10760 != -1) {
				local74 = arg0.aClass385Array3[local57].aClass100_11;
				if (local74.method8975()) {
					@Pc(87) Class310 local87 = Static660.aClass307_2.method7493(arg0.aClass385Array3[local57].anInt10760);
					@Pc(91) Class26 local91 = local74.method8977();
					if (local87.aBoolean661) {
						if (local91.anInt778 == 3) {
							if (arg0.anInt7822 > 0 && arg0.anInt7812 <= Static269.anInt4883 && Static269.anInt4883 > arg0.anInt7814) {
								local74.method8962(-1);
								arg0.aClass385Array3[local57].anInt10760 = -1;
								continue;
							}
						} else if (local91.anInt778 == 1 && arg0.anInt7822 > 0 && arg0.anInt7812 <= Static269.anInt4883 && Static269.anInt4883 > arg0.anInt7814) {
							continue;
						}
					}
				}
				if (local74.method8971(1) && local74.method8959()) {
					local74.method8962(-1);
					arg0.aClass385Array3[local57].anInt10760 = -1;
				}
			}
		}
		local74 = arg0.aClass100_9;
		if (local74.method8963()) {
			label83: {
				@Pc(215) Class26 local215 = local74.method8977();
				if (local215.anInt778 == 3) {
					if (arg0.anInt7822 > 0 && Static269.anInt4883 >= arg0.anInt7812 && arg0.anInt7814 < Static269.anInt4883) {
						arg0.anIntArray425 = null;
						local74.method8962(-1);
						break label83;
					}
				} else if (local215.anInt778 == 1) {
					if (arg0.anInt7822 > 0 && Static269.anInt4883 >= arg0.anInt7812 && arg0.anInt7814 < Static269.anInt4883) {
						local74.method8964(1);
						break label83;
					}
					local74.method8964(0);
				}
				if (local74.method8971(1) && local74.method8959()) {
					arg0.anIntArray425 = null;
					local74.method8962(-1);
				}
			}
		}
		for (@Pc(321) int local321 = 0; local321 < arg0.aClass100_Sub1_Sub1Array3.length; local321++) {
			@Pc(328) Class100_Sub1_Sub1 local328 = arg0.aClass100_Sub1_Sub1Array3[local321];
			if (local328 != null) {
				if (local328.anInt10755 > 0) {
					local328.anInt10755--;
				} else if (local328.method8971(1) && local328.method8959()) {
					arg0.aClass100_Sub1_Sub1Array3[local321] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!oka", name = "f", descriptor = "(I)V")
	public static void method6827() {
		if (Static153.anInt2819 == -1 || Static197.anInt3483 == -1) {
			return;
		}
		@Pc(34) int local34 = ((Static70.anInt1097 - Static287.anInt5195) * Static134.anInt2499 >> 16) + Static287.anInt5195;
		Static134.anInt2499 += local34;
		if (Static134.anInt2499 < 65535) {
			Static225.aBoolean353 = false;
			Static386.aBoolean417 = false;
		} else {
			Static134.anInt2499 = 65535;
			if (Static225.aBoolean353) {
				Static386.aBoolean417 = false;
			} else {
				Static386.aBoolean417 = true;
			}
			Static225.aBoolean353 = true;
		}
		@Pc(72) float local72 = (float) Static134.anInt2499 / 65535.0F;
		@Pc(75) float[] local75 = new float[3];
		@Pc(79) int local79 = Static660.anInt10552 * 2;
		@Pc(107) int local107;
		@Pc(140) int local140;
		@Pc(148) int local148;
		@Pc(152) int local152;
		@Pc(161) int local161;
		@Pc(178) int local178;
		for (@Pc(81) int local81 = 0; local81 < 3; local81++) {
			@Pc(95) int local95 = Static367.anIntArrayArrayArray5[Static153.anInt2819][local79][local81] * 3;
			local107 = Static367.anIntArrayArrayArray5[Static153.anInt2819][local79 + 1][local81] * 3;
			local140 = (Static367.anIntArrayArrayArray5[Static153.anInt2819][local79 + 2][local81] + Static367.anIntArrayArrayArray5[Static153.anInt2819][local79 + 2][local81] - Static367.anIntArrayArrayArray5[Static153.anInt2819][local79 + 3][local81]) * 3;
			local148 = Static367.anIntArrayArrayArray5[Static153.anInt2819][local79][local81];
			local152 = local107 - local95;
			local161 = local140 + local95 - local107 * 2;
			local178 = local107 + Static367.anIntArrayArrayArray5[Static153.anInt2819][local79 - -2][local81] - local140 - local148;
			local75[local81] = local72 * ((float) local152 + local72 * ((float) local161 + local72 * (float) local178)) + (float) local148;
		}
		Static376.anInt6408 = (int) local75[1] * -1;
		Static173.anInt3144 = (int) local75[0] - Static714.anInt11156 * 512;
		Static235.anInt4471 = (int) local75[2] - Static339.anInt5859 * 512;
		@Pc(233) float[] local233 = new float[3];
		local107 = Static405.anInt7242 * 2;
		for (local140 = 0; local140 < 3; local140++) {
			local148 = Static367.anIntArrayArrayArray5[Static197.anInt3483][local107][local140] * 3;
			local152 = Static367.anIntArrayArrayArray5[Static197.anInt3483][local107 + 1][local140] * 3;
			local161 = (Static367.anIntArrayArrayArray5[Static197.anInt3483][local107 + 2][local140] + Static367.anIntArrayArrayArray5[Static197.anInt3483][local107 + 2][local140] - Static367.anIntArrayArrayArray5[Static197.anInt3483][local107 + 3][local140]) * 3;
			local178 = Static367.anIntArrayArrayArray5[Static197.anInt3483][local107][local140];
			@Pc(313) int local313 = local152 - local148;
			@Pc(321) int local321 = local161 + local148 - local152 * 2;
			@Pc(340) int local340 = Static367.anIntArrayArrayArray5[Static197.anInt3483][local107 + 2][local140] + local152 - local178 - local161;
			local233[local140] = (float) local178 + local72 * ((float) local313 + (local72 * (float) local340 + (float) local321) * local72);
		}
		@Pc(373) float local373 = local233[0] - local75[0];
		@Pc(384) float local384 = -1.0F * (local233[1] - local75[1]);
		@Pc(392) float local392 = local233[2] - local75[2];
		@Pc(402) double local402 = Math.sqrt((double) (local373 * local373 + local392 * local392));
		Static228.anInt9136 = (int) (Math.atan2((double) local384, local402) * 2607.5945876176133D) & 0x3FFF;
		Static703.anInt10997 = (int) (-Math.atan2((double) local373, (double) local392) * 2607.5945876176133D) & 0x3FFF;
		Static212.anInt3807 = (Static134.anInt2499 * (Static367.anIntArrayArrayArray5[Static153.anInt2819][local79 + 2][3] - Static367.anIntArrayArrayArray5[Static153.anInt2819][local79][3]) >> 16) + Static367.anIntArrayArrayArray5[Static153.anInt2819][local79][3];
	}

	@OriginalMember(owner = "client!oka", name = "a", descriptor = "(IBII)V")
	public static void method6828(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static587.anInt9597 == arg1 && arg2 == Static553.anInt9241 && arg0 == Static175.anInt10578) {
			return;
		}
		Static175.anInt10578 = arg0;
		Static70.aBoolean89 = true;
		Static553.anInt9241 = arg2;
		Static587.anInt9597 = arg1;
		@Pc(44) double local44 = -((double) (arg1 * 2) * 3.141592653589793D) / 16384.0D;
		@Pc(54) double local54 = -((double) (arg2 * 2) * 3.141592653589793D) / 16384.0D;
		@Pc(57) double local57 = Math.cos(local54);
		@Pc(60) double local60 = Math.sin(local54);
		@Pc(63) double local63 = Math.cos(local44);
		@Pc(66) double local66 = Math.sin(local44);
		Static244.aDouble16 = local57;
		Static318.aDouble18 = local66;
		Static193.aDouble13 = local63 * local57;
		Static33.aDouble1 = local63;
		Static403.aDouble20 = local60 * local66;
		Static470.aDouble22 = local60;
		Static538.aDouble21 = -local57 * local66;
		Static204.aDouble14 = 0.0D;
		Static493.aDouble23 = -local60 * local63;
	}
}
