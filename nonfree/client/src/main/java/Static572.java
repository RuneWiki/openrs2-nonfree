import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static572 {

	@OriginalMember(owner = "client!tga", name = "e", descriptor = "I")
	public static int anInt9840;

	@OriginalMember(owner = "client!tga", name = "b", descriptor = "[I")
	public static int[] anIntArray713 = null;

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(IBLclient!fb;I)V")
	public static void method8201(@OriginalArg(0) int arg0, @OriginalArg(2) Class12_Sub2_Sub2_Sub1_Sub2 arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int[] local10 = new int[4];
		Static681.method2479(local10, 0, local10.length, arg2);
		Static285.method4071(local10, arg1, arg0);
	}

	@OriginalMember(owner = "client!tga", name = "b", descriptor = "(I)V")
	public static void method8202() {
		@Pc(12) int local12 = Static71.aByteArrayArray11.length;
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			if (Static71.aByteArrayArray11[local14] != null) {
				@Pc(22) int local22 = -1;
				for (@Pc(24) int local24 = 0; local24 < Static649.anInt10848; local24++) {
					if (Static376.anIntArray505[local24] == Static332.anIntArray455[local14]) {
						local22 = local24;
						break;
					}
				}
				if (local22 == -1) {
					Static376.anIntArray505[Static649.anInt10848] = Static332.anIntArray455[local14];
					local22 = Static649.anInt10848++;
				}
				@Pc(72) Class14_Sub29 local72 = new Class14_Sub29(Static71.aByteArrayArray11[local14]);
				@Pc(74) int local74 = 0;
				while (Static71.aByteArrayArray11[local14].length > local72.anInt7264 && local74 < 511 && Static471.anInt8216 < 1023) {
					@Pc(91) int local91 = local22 | local74++ << 6;
					@Pc(95) int local95 = local72.method5900();
					@Pc(99) int local99 = local95 >> 14;
					@Pc(105) int local105 = local95 >> 7 & 0x3F;
					@Pc(109) int local109 = local95 & 0x3F;
					@Pc(122) int local122 = (Static332.anIntArray455[local14] >> 8) * 64 + local105 - Static329.anInt6225;
					@Pc(135) int local135 = local109 + (Static332.anIntArray455[local14] & 0xFF) * 64 - Static202.anInt3755;
					@Pc(142) Class283 local142 = Static63.aClass37_1.method974(local72.method5900());
					@Pc(149) Class14_Sub44 local149 = (Class14_Sub44) Static579.aClass187_73.method4078((long) local91);
					if (local149 == null && (local142.aByte125 & 0x1) > 0 && Static673.anInt11161 == local99 && local122 >= 0 && local122 + local142.anInt8617 < Static26.anInt462 && local135 >= 0 && local135 + local142.anInt8617 < Static445.anInt6140) {
						@Pc(193) Class12_Sub2_Sub2_Sub1_Sub1 local193 = new Class12_Sub2_Sub2_Sub1_Sub1();
						local193.anInt2945 = local91;
						@Pc(201) Class14_Sub44 local201 = new Class14_Sub44(local193);
						Static579.aClass187_73.method4077((long) local91, local201);
						Static151.aClass14_Sub44Array1[Static570.anInt9823++] = local201;
						Static530.anIntArray671[Static471.anInt8216++] = local91;
						local193.anInt2941 = Static87.anInt1951;
						local193.method611(local142);
						local193.method2415(local193.aClass283_1.anInt8617);
						local193.anInt2931 = local193.aClass283_1.anInt8616 << 3;
						local193.method2423(true, local193.aClass283_1.aByte126 + 4 << 11 & 0x39E8);
						local193.method616(local193.method2422(), local99, true, local122, local135);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(III)Lclient!mea;")
	public static Class230 method8204(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class230 local12 = Static655.method9094(arg1);
		if (arg0 == -1) {
			return local12;
		} else if (local12 == null || local12.aClass230Array2 == null || local12.aClass230Array2.length <= arg0) {
			return null;
		} else {
			return local12.aClass230Array2[arg0];
		}
	}
}
