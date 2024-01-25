import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static524 {

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(BJ)V")
	public static void method7271(@OriginalArg(1) long arg0) {
		@Pc(19) int local19 = Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anInt10090 + Static639.anInt10304;
		@Pc(24) int local24 = Static54.anInt255 + Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anInt10089;
		if (Static203.anInt3426 - local19 < -2000 || Static203.anInt3426 - local19 > 2000 || Static263.anInt4236 - local24 < -2000 || Static263.anInt4236 - local24 > 2000) {
			Static203.anInt3426 = local19;
			Static263.anInt4236 = local24;
		}
		@Pc(66) int local66;
		@Pc(74) int local74;
		if (Static203.anInt3426 != local19) {
			local66 = local19 - Static203.anInt3426;
			local74 = (int) (arg0 * (long) local66 / 320L);
			if (local66 <= 0) {
				if (local74 == 0) {
					local74 = -1;
				} else if (local66 > local74) {
					local74 = local66;
				}
			} else if (local74 == 0) {
				local74 = 1;
			} else if (local66 < local74) {
				local74 = local66;
			}
			Static203.anInt3426 += local74;
		}
		if (local24 != Static263.anInt4236) {
			local66 = local24 - Static263.anInt4236;
			local74 = (int) (arg0 * (long) local66 / 320L);
			if (local66 > 0) {
				if (local74 == 0) {
					local74 = 1;
				} else if (local74 > local66) {
					local74 = local66;
				}
			} else if (local74 == 0) {
				local74 = -1;
			} else if (local74 < local66) {
				local74 = local66;
			}
			Static263.anInt4236 += local74;
		}
		Static440.aFloat144 += (float) arg0 * Static257.aFloat69 / 6.0F;
		Static339.aFloat100 += Static16.aFloat3 * (float) arg0 / 6.0F;
		Static222.method3034();
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method7272(@OriginalArg(0) Class95 arg0) {
		if (Static474.anInt7600 < 2 && !Static8.aBoolean11 || Static444.aClass261_9 != null) {
			return;
		}
		@Pc(40) String local40;
		if (Static8.aBoolean11 && Static474.anInt7600 < 2) {
			local40 = Static577.aString105 + Static434.aClass271_32.method5972(Static483.anInt7694) + Static90.aString16 + " ->";
		} else if (Static341.aBoolean388 && Static16.aClass167_1.method3544(81) && Static474.anInt7600 > 2) {
			local40 = Static425.method5665(Static601.aClass2_Sub2_Sub11_4);
		} else {
			@Pc(62) Class2_Sub2_Sub11 local62 = Static601.aClass2_Sub2_Sub11_4;
			if (local62 == null) {
				return;
			}
			local40 = Static425.method5665(local62);
			@Pc(73) int[] local73 = null;
			if (Static56.method4531(local62.anInt4369)) {
				local73 = Static72.aClass225_2.method4789((int) local62.aLong122).anIntArray77;
			} else if (local62.anInt4364 != -1) {
				local73 = Static72.aClass225_2.method4789(local62.anInt4364).anIntArray77;
			} else if (Static62.method916(local62.anInt4369)) {
				@Pc(153) Class2_Sub43 local153 = (Class2_Sub43) Static440.aClass118_41.method2595((long) local62.aLong122);
				if (local153 != null) {
					@Pc(158) Class13_Sub1_Sub1_Sub1_Sub1 local158 = local153.aClass13_Sub1_Sub1_Sub1_Sub1_2;
					@Pc(161) Class150 local161 = local158.aClass150_1;
					if (local161.anIntArray262 != null) {
						local161 = local161.method3196(Static431.aClass205_1);
					}
					if (local161 != null) {
						local73 = local161.anIntArray263;
					}
				}
			} else if (Static230.method3178(local62.anInt4369)) {
				@Pc(120) Class191 local120;
				if (local62.anInt4369 == 1001) {
					local120 = Static319.aClass141_4.method2971((int) local62.aLong122);
				} else {
					local120 = Static319.aClass141_4.method2971((int) (local62.aLong122 >>> 32 & 0x7FFFFFFFL));
				}
				if (local120.anIntArray323 != null) {
					local120 = local120.method4057(Static431.aClass205_1);
				}
				if (local120 != null) {
					local73 = local120.anIntArray322;
				}
			}
			if (local73 != null) {
				local40 = local40 + Static486.method6810(local73);
			}
		}
		if (Static474.anInt7600 > 2) {
			local40 = local40 + "<col=ffffff> / " + (Static474.anInt7600 - 2) + Static434.aClass271_25.method5972(Static483.anInt7694);
		}
		if (Static275.aClass261_3 != null) {
			@Pc(260) Class62 local260 = Static275.aClass261_3.method5636(arg0);
			if (local260 == null) {
				local260 = Static194.aClass62_22;
			}
			local260.method5692(Static610.anIntArray675, Static275.aClass261_3.anInt6592, Static275.aClass261_3.anInt6580, Static233.anInt3814, local40, Static275.aClass261_3.anInt6622, Static275.aClass261_3.anInt6595, Static275.aClass261_3.anInt6650, Static244.aRandom3, Static275.aClass261_3.anInt6664, Static399.anIntArray467, Static140.aClass61Array4, Static176.anInt3096, Static221.anInt3617);
			Static252.method3508(Static399.anIntArray467[2], Static399.anIntArray467[0], Static399.anIntArray467[3], Static399.anIntArray467[1]);
		} else if (Static633.aClass261_13 != null && Static189.aClass375_5 == Static605.aClass375_7) {
			@Pc(241) int local241 = Static194.aClass62_22.method5693(Static233.anInt3814, Static140.aClass61Array4, Static610.anIntArray675, local40, Static200.anInt3399 + 16, Static244.aRandom3, Static145.anInt2640 + 4);
			Static252.method3508(local241 + Static228.aClass256_7.method5534(local40), Static145.anInt2640 + 4, 16, Static200.anInt3399);
			return;
		}
	}
}
