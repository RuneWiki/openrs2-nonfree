import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!v", name = "M", descriptor = "I")
	public static int anInt4638;

	@OriginalMember(owner = "client!v", name = "R", descriptor = "Lclient!oe;")
	public static Class72 aClass72_271;

	@OriginalMember(owner = "client!v", name = "P", descriptor = "Lclient!wc;")
	public static Class110 aClass110_23 = new Class110(64);

	@OriginalMember(owner = "client!v", name = "T", descriptor = "Lclient!qe;")
	public static Class78 aClass78_823 = Static199.method3560("overlay2)3dat");

	@OriginalMember(owner = "client!v", name = "c", descriptor = "(B)V")
	public static void method3684() {
		Static139.aClass2_Sub23_Sub1_4.method2144();
		@Pc(22) int local22 = Static139.aClass2_Sub23_Sub1_4.method2154(8);
		@Pc(31) int local31;
		if (Static50.anInt908 > local22) {
			for (local31 = local22; local31 < Static50.anInt908; local31++) {
				Static156.anIntArray597[Static3.anInt99++] = Static79.anIntArray286[local31];
			}
		}
		if (local22 > Static50.anInt908) {
			throw new RuntimeException("gnpov1");
		}
		Static50.anInt908 = 0;
		for (local31 = 0; local31 < local22; local31++) {
			@Pc(69) int local69 = Static79.anIntArray286[local31];
			@Pc(73) Class5_Sub2_Sub1 local73 = Static95.aClass5_Sub2_Sub1Array1[local69];
			@Pc(78) int local78 = Static139.aClass2_Sub23_Sub1_4.method2154(1);
			if (local78 == 0) {
				Static79.anIntArray286[Static50.anInt908++] = local69;
				local73.anInt1826 = Static123.anInt2808;
			} else {
				@Pc(101) int local101 = Static139.aClass2_Sub23_Sub1_4.method2154(2);
				if (local101 == 0) {
					Static79.anIntArray286[Static50.anInt908++] = local69;
					local73.anInt1826 = Static123.anInt2808;
					Static156.anIntArray598[Static125.anInt1641++] = local69;
				} else {
					@Pc(148) int local148;
					@Pc(158) int local158;
					if (local101 == 1) {
						Static79.anIntArray286[Static50.anInt908++] = local69;
						local73.anInt1826 = Static123.anInt2808;
						local148 = Static139.aClass2_Sub23_Sub1_4.method2154(3);
						local73.method1482(local148, false);
						local158 = Static139.aClass2_Sub23_Sub1_4.method2154(1);
						if (local158 == 1) {
							Static156.anIntArray598[Static125.anInt1641++] = local69;
						}
					} else if (local101 == 2) {
						Static79.anIntArray286[Static50.anInt908++] = local69;
						local73.anInt1826 = Static123.anInt2808;
						local148 = Static139.aClass2_Sub23_Sub1_4.method2154(3);
						local73.method1482(local148, true);
						local158 = Static139.aClass2_Sub23_Sub1_4.method2154(3);
						local73.method1482(local158, true);
						@Pc(210) int local210 = Static139.aClass2_Sub23_Sub1_4.method2154(1);
						if (local210 == 1) {
							Static156.anIntArray598[Static125.anInt1641++] = local69;
						}
					} else if (local101 == 3) {
						Static156.anIntArray597[Static3.anInt99++] = local69;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IIJZ)Lclient!qe;")
	public static Class78 method3686(@OriginalArg(2) long arg0) {
		@Pc(24) int local24 = 1;
		@Pc(34) long local34 = arg0 / (long) 10;
		while (local34 != 0L) {
			local34 /= 10;
			local24++;
		}
		@Pc(49) int local49 = local24;
		if (arg0 < 0L) {
			local49 = local24 + 1;
		}
		@Pc(61) byte[] local61 = new byte[local49];
		if (arg0 < 0L) {
			local61[0] = 45;
		}
		for (@Pc(78) int local78 = 0; local78 < local24; local78++) {
			@Pc(85) int local85 = (int) (arg0 % (long) 10);
			if (local85 < 0) {
				local85 = -local85;
			}
			arg0 /= 10;
			if (local85 > 9) {
				local85 += 39;
			}
			local61[local49 - local78 - 1] = (byte) (local85 + 48);
		}
		@Pc(123) Class78 local123 = new Class78();
		local123.anInt3831 = local49;
		local123.aByteArray48 = local61;
		return local123;
	}
}
