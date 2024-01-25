import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static564 {

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(B[[BLclient!tga;)V")
	public static void method7987(@OriginalArg(1) byte[][] arg0, @OriginalArg(2) Class83_Sub1 arg1) {
		@Pc(16) int[] local16 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(19) int local19 = arg0.length;
		@Pc(40) int local40;
		for (@Pc(21) int local21 = 0; local21 < local19; local21++) {
			@Pc(27) byte[] local27 = arg0[local21];
			if (local27 != null) {
				@Pc(34) Class3_Sub9 local34 = new Class3_Sub9(local27);
				local40 = Static454.anIntArray476[local21] >> 8;
				@Pc(46) int local46 = Static454.anIntArray476[local21] & 0xFF;
				@Pc(53) int local53 = local40 * 64 - Static427.anInt7462;
				@Pc(59) int local59 = local46 * 64 - Static22.anInt329;
				Static234.method3998();
				arg1.method7807(local53, Static22.anInt329, local34, local59, Static427.anInt7462, Static174.aClass237Array1);
				arg1.method7811(local59, local16, Static266.aClass82_8, local34, local53);
				if (!arg1.aBoolean675 && Static270.anInt5273 / 8 == local40 && Static263.anInt5102 / 8 == local46 && local16[0] != -1) {
					Static626.aClass137_1 = Static148.aClass212_1.method5413(local16[1], Static166.aClass310_1, local16[2], local16[0], local16[3]);
					Static585.anInt9501 = local16[4];
				}
			}
		}
		for (@Pc(124) int local124 = 0; local124 < local19; local124++) {
			@Pc(136) int local136 = (Static454.anIntArray476[local124] >> 8) * 64 - Static427.anInt7462;
			local40 = (Static454.anIntArray476[local124] & 0xFF) * 64 - Static22.anInt329;
			@Pc(151) byte[] local151 = arg0[local124];
			if (local151 == null && Static263.anInt5102 < 800) {
				Static234.method3998();
				arg1.method7797(local136, local40);
			}
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!cea;BBII)V")
	public static void method7988(@OriginalArg(0) Class9_Sub2_Sub1_Sub2_Sub1 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		@Pc(17) int local17 = arg0.anIntArray675[0];
		@Pc(22) int local22 = arg0.anIntArray676[0];
		if (local17 < 0 || Static399.anInt7121 <= local17 || local22 < 0 || local22 >= Static24.anInt345 || (arg1 < 0 || Static399.anInt7121 <= arg1 || arg2 < 0 || arg2 >= Static24.anInt345)) {
			return;
		}
		@Pc(73) int local73 = Static589.method8186(Static174.aClass237Array1[arg0.aByte127], 0, arg0.method8619(), -4, Static347.anIntArray375, arg2, local17, 0, 0, arg1, Static192.anIntArray211, local22, true, 0);
		if (local73 >= 1 && local73 <= 3) {
			for (@Pc(85) int local85 = 0; local85 < local73 - 1; local85++) {
				arg0.method1152((byte) 2, Static192.anIntArray211[local85], Static347.anIntArray375[local85]);
			}
		}
	}
}
