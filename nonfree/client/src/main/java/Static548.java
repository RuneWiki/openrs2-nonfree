import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static548 {

	@OriginalMember(owner = "client!vaa", name = "x", descriptor = "I")
	public static int anInt9202;

	@OriginalMember(owner = "client!vaa", name = "v", descriptor = "Lclient!db;")
	public static final Class64 aClass64_458 = new Class64(90, 8);

	@OriginalMember(owner = "client!vaa", name = "b", descriptor = "(B)V")
	public static void method7572() {
		if (Static135.anInt3092 == -1 || Static226.anInt4661 == -1) {
			return;
		}
		@Pc(22) int local22 = Static306.anInt5575 + (Static312.anInt9782 * (Static167.anInt3607 - Static306.anInt5575) >> 16);
		Static312.anInt9782 += local22;
		if (Static312.anInt9782 >= 65535) {
			if (Static357.aBoolean461) {
				Static301.aBoolean414 = false;
			} else {
				Static301.aBoolean414 = true;
			}
			Static312.anInt9782 = 65535;
			Static357.aBoolean461 = true;
		} else {
			Static357.aBoolean461 = false;
			Static301.aBoolean414 = false;
		}
		@Pc(52) float local52 = (float) Static312.anInt9782 / 65535.0F;
		@Pc(55) float[] local55 = new float[3];
		@Pc(59) int local59 = Static315.anInt5654 * 2;
		@Pc(85) int local85;
		@Pc(118) int local118;
		@Pc(126) int local126;
		@Pc(131) int local131;
		@Pc(140) int local140;
		@Pc(157) int local157;
		for (@Pc(61) int local61 = 0; local61 < 3; local61++) {
			@Pc(73) int local73 = Static201.anIntArrayArrayArray13[Static135.anInt3092][local59][local61] * 3;
			local85 = Static201.anIntArrayArrayArray13[Static135.anInt3092][local59 + 1][local61] * 3;
			local118 = (Static201.anIntArrayArrayArray13[Static135.anInt3092][local59 + 2][local61] + Static201.anIntArrayArrayArray13[Static135.anInt3092][local59 + 2][local61] - Static201.anIntArrayArrayArray13[Static135.anInt3092][local59 + 3][local61]) * 3;
			local126 = Static201.anIntArrayArrayArray13[Static135.anInt3092][local59][local61];
			local131 = local85 - local73;
			local140 = local73 + local118 - local85 * 2;
			local157 = local85 + Static201.anIntArrayArrayArray13[Static135.anInt3092][local59 + 2][local61] - local118 - local126;
			local55[local61] = local52 * ((float) local131 + local52 * ((float) local140 + local52 * (float) local157)) + (float) local126;
		}
		Static473.anInt7978 = (int) local55[0] - Static373.anInt6695 * 512;
		Static563.anInt9436 = (int) local55[2] - Static6.anInt97 * 512;
		Static569.anInt4616 = (int) local55[1] * -1;
		@Pc(211) float[] local211 = new float[3];
		local85 = Static571.anInt9400 * 2;
		for (local118 = 0; local118 < 3; local118++) {
			local126 = Static201.anIntArrayArrayArray13[Static226.anInt4661][local85][local118] * 3;
			local131 = Static201.anIntArrayArrayArray13[Static226.anInt4661][local85 + 1][local118] * 3;
			local140 = (Static201.anIntArrayArrayArray13[Static226.anInt4661][local85 + 2][local118] + Static201.anIntArrayArrayArray13[Static226.anInt4661][local85 + 2][local118] - Static201.anIntArrayArrayArray13[Static226.anInt4661][local85 - -3][local118]) * 3;
			local157 = Static201.anIntArrayArrayArray13[Static226.anInt4661][local85][local118];
			@Pc(287) int local287 = local131 - local126;
			@Pc(296) int local296 = local126 + local140 - local131 * 2;
			@Pc(312) int local312 = Static201.anIntArrayArrayArray13[Static226.anInt4661][local85 + 2][local118] + local131 - local157 - local140;
			local211[local118] = (local52 * ((float) local312 * local52 + (float) local296) + (float) local287) * local52 + (float) local157;
		}
		@Pc(352) float local352 = local211[0] - local55[0];
		@Pc(362) float local362 = -1.0F * (local211[1] - local55[1]);
		@Pc(370) float local370 = local211[2] - local55[2];
		@Pc(380) double local380 = Math.sqrt((double) (local352 * local352 + local370 * local370));
		Static348.anInt6087 = (int) (Math.atan2((double) local362, local380) * 2607.5945876176133D) & 0x3FFF;
		Static37.anInt738 = (int) (-Math.atan2((double) local352, (double) local370) * 2607.5945876176133D) & 0x3FFF;
		Static235.anInt4750 = Static201.anIntArrayArrayArray13[Static135.anInt3092][local59][3] + (Static312.anInt9782 * (Static201.anIntArrayArrayArray13[Static135.anInt3092][local59 + 2][3] - Static201.anIntArrayArrayArray13[Static135.anInt3092][local59][3]) >> 16);
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(I[Lclient!gba;Z)V")
	public static void method7573(@OriginalArg(0) int arg0, @OriginalArg(1) Class115[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
			@Pc(9) Class115 local9 = arg1[local3];
			if (local9 != null) {
				if (local9.anInt3519 == 0) {
					if (local9.aClass115Array1 != null) {
						method7573(arg0, local9.aClass115Array1);
					}
					@Pc(30) Class4_Sub49 local30 = (Class4_Sub49) Static543.aClass183_39.method4289((long) local9.anInt3464);
					if (local30 != null) {
						Static349.method5193(arg0, local30.anInt9337);
					}
				}
				@Pc(49) Class4_Sub12 local49;
				if (arg0 == 0 && local9.anObjectArray34 != null) {
					local49 = new Class4_Sub12();
					local49.aClass115_5 = local9;
					local49.anObjectArray3 = local9.anObjectArray34;
					Static205.method3636(local49);
				}
				if (arg0 == 1 && local9.anObjectArray13 != null) {
					if (local9.anInt3517 >= 0) {
						@Pc(74) Class115 local74 = Static92.method2118(local9.anInt3464);
						if (local74 == null || local74.aClass115Array1 == null || local9.anInt3517 >= local74.aClass115Array1.length || local9 != local74.aClass115Array1[local9.anInt3517]) {
							continue;
						}
					}
					local49 = new Class4_Sub12();
					local49.anObjectArray3 = local9.anObjectArray13;
					local49.aClass115_5 = local9;
					Static205.method3636(local49);
				}
			}
		}
	}
}
