import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static401 {

	@OriginalMember(owner = "client!ng", name = "u", descriptor = "I")
	public static int anInt5840;

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lclient!bn;II)V")
	public static void method5124(@OriginalArg(0) Class4_Sub11_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(22) boolean local22 = arg0.method988(1) == 1;
		if (local22) {
			Static170.anIntArray219[Static657.anInt10371++] = arg1;
		}
		@Pc(37) int local37 = arg0.method988(2);
		@Pc(41) Class3_Sub1_Sub2_Sub2_Sub1 local41 = Static180.aClass3_Sub1_Sub2_Sub2_Sub1Array20[arg1];
		if (local37 != 0) {
			@Pc(158) int local158;
			@Pc(163) int local163;
			@Pc(168) int local168;
			if (local37 == 1) {
				local158 = arg0.method988(3);
				local163 = local41.anIntArray693[0];
				local168 = local41.anIntArray694[0];
				if (local158 == 0) {
					local168--;
					local163--;
				} else if (local158 == 1) {
					local168--;
				} else if (local158 == 2) {
					local168--;
					local163++;
				} else if (local158 == 3) {
					local163--;
				} else if (local158 == 4) {
					local163++;
				} else if (local158 == 5) {
					local168++;
					local163--;
				} else if (local158 == 6) {
					local168++;
				} else if (local158 == 7) {
					local163++;
					local168++;
				}
				if (local22) {
					local41.aBoolean290 = true;
					local41.anInt3931 = local163;
					local41.anInt3938 = local168;
				} else {
					local41.method3530(local163, local168, Static175.aByteArray38[arg1]);
				}
			} else if (local37 == 2) {
				local158 = arg0.method988(4);
				local163 = local41.anIntArray693[0];
				local168 = local41.anIntArray694[0];
				if (local158 == 0) {
					local168 -= 2;
					local163 -= 2;
				} else if (local158 == 1) {
					local163--;
					local168 -= 2;
				} else if (local158 == 2) {
					local168 -= 2;
				} else if (local158 == 3) {
					local163++;
					local168 -= 2;
				} else if (local158 == 4) {
					local163 += 2;
					local168 -= 2;
				} else if (local158 == 5) {
					local163 -= 2;
					local168--;
				} else if (local158 == 6) {
					local168--;
					local163 += 2;
				} else if (local158 == 7) {
					local163 -= 2;
				} else if (local158 == 8) {
					local163 += 2;
				} else if (local158 == 9) {
					local163 -= 2;
					local168++;
				} else if (local158 == 10) {
					local163 += 2;
					local168++;
				} else if (local158 == 11) {
					local168 += 2;
					local163 -= 2;
				} else if (local158 == 12) {
					local163--;
					local168 += 2;
				} else if (local158 == 13) {
					local168 += 2;
				} else if (local158 == 14) {
					local168 += 2;
					local163++;
				} else if (local158 == 15) {
					local163 += 2;
					local168 += 2;
				}
				if (local22) {
					local41.aBoolean290 = true;
					local41.anInt3931 = local163;
					local41.anInt3938 = local168;
				} else {
					local41.method3530(local163, local168, Static175.aByteArray38[arg1]);
				}
			} else {
				local158 = arg0.method988(1);
				@Pc(432) int local432;
				@Pc(440) int local440;
				@Pc(452) int local452;
				@Pc(459) int local459;
				if (local158 == 0) {
					local163 = arg0.method988(12);
					local168 = local163 >> 10;
					local432 = local163 >> 5 & 0x1F;
					if (local432 > 15) {
						local432 -= 32;
					}
					local440 = local163 & 0x1F;
					if (local440 > 15) {
						local440 -= 32;
					}
					local452 = local41.anIntArray693[0] + local432;
					local459 = local440 + local41.anIntArray694[0];
					if (local22) {
						local41.anInt3931 = local452;
						local41.anInt3938 = local459;
						local41.aBoolean290 = true;
					} else {
						local41.method3530(local452, local459, Static175.aByteArray38[arg1]);
					}
					local41.aByte141 = local41.aByte142 = (byte) (local168 + local41.aByte141 & 0x3);
					if (Static547.method7286(local452, local459)) {
						local41.aByte142++;
					}
					if (Static184.anInt3149 == arg1) {
						if (local41.aByte141 != Static296.anInt4684) {
							Static42.aBoolean73 = true;
						}
						Static296.anInt4684 = local41.aByte141;
					}
				} else {
					local163 = arg0.method988(30);
					local168 = local163 >> 28;
					local432 = local163 >> 14 & 0x3FFF;
					local440 = local163 & 0x3FFF;
					local452 = (local432 + Static445.anInt6949 + local41.anIntArray693[0] & 0x3FFF) - Static445.anInt6949;
					local459 = (local41.anIntArray694[0] + Static321.anInt5000 + local440 & 0x3FFF) - Static321.anInt5000;
					if (local22) {
						local41.aBoolean290 = true;
						local41.anInt3938 = local459;
						local41.anInt3931 = local452;
					} else {
						local41.method3530(local452, local459, Static175.aByteArray38[arg1]);
					}
					local41.aByte141 = local41.aByte142 = (byte) (local41.aByte141 + local168 & 0x3);
					if (Static547.method7286(local452, local459)) {
						local41.aByte142++;
					}
					if (Static184.anInt3149 == arg1) {
						Static296.anInt4684 = local41.aByte141;
					}
				}
			}
		} else if (local22) {
			local41.aBoolean290 = false;
		} else if (arg1 == Static184.anInt3149) {
			throw new RuntimeException("s:lr");
		} else {
			@Pc(72) Class228 local72 = Static58.aClass228Array1[arg1] = new Class228();
			local72.anInt5578 = (local41.anIntArray694[0] + Static321.anInt5000 >> 6) + (local41.anIntArray693[0] + Static445.anInt6949 >> 6 << 14) + (local41.aByte141 << 28);
			if (local41.anInt3955 == -1) {
				local72.anInt5579 = local41.aClass240_7.method4986();
			} else {
				local72.anInt5579 = local41.anInt3955;
			}
			local72.aBoolean420 = local41.aBoolean291;
			local72.anInt5577 = local41.anInt9947;
			local72.aBoolean421 = local41.aBoolean292;
			if (local41.anInt3936 > 0) {
				Static580.method7650(local41);
			}
			Static180.aClass3_Sub1_Sub2_Sub2_Sub1Array20[arg1] = null;
			if (arg0.method988(1) != 0) {
				Static662.method8785(arg1, arg0);
			}
		}
	}
}
