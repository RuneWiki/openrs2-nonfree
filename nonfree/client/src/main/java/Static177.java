import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!kf", name = "e", descriptor = "I")
	public static int anInt3750;

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "Z")
	public static boolean aBoolean270 = true;

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "Z")
	public static boolean aBoolean271 = false;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
	public static void method3284() {
		@Pc(8) int local8 = Static42.aByteArrayArray4.length;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			if (Static42.aByteArrayArray4[local10] != null) {
				@Pc(18) int local18 = -1;
				for (@Pc(20) int local20 = 0; local20 < Static63.anInt1432; local20++) {
					if (Static284.anIntArray484[local20] == Static71.anIntArray118[local10]) {
						local18 = local20;
						break;
					}
				}
				if (local18 == -1) {
					Static284.anIntArray484[Static63.anInt1432] = Static71.anIntArray118[local10];
					local18 = Static63.anInt1432++;
				}
				@Pc(67) Class2_Sub24 local67 = new Class2_Sub24(Static42.aByteArrayArray4[local10]);
				@Pc(69) int local69 = 0;
				while (local67.anInt6669 < Static42.aByteArrayArray4[local10].length && local69 < 511 && Static123.anInt5933 < 1023) {
					@Pc(90) int local90 = local18 | local69++ << 6;
					@Pc(94) int local94 = local67.method5753();
					@Pc(98) int local98 = local94 >> 14;
					@Pc(104) int local104 = local94 >> 7 & 0x3F;
					@Pc(108) int local108 = local94 & 0x3F;
					@Pc(121) int local121 = local104 + (Static71.anIntArray118[local10] >> 8) * 64 - Static279.anInt5198;
					@Pc(133) int local133 = (Static71.anIntArray118[local10] & 0xFF) * 64 + local108 - Static350.anInt6470;
					@Pc(140) Class197 local140 = Static207.aClass32_1.method579(local67.method5753());
					if (Static223.aClass1_Sub2_Sub1_Sub2Array1[local90] == null && (local140.aByte55 & 0x1) > 0 && local98 == Static73.anInt1627 && local121 >= 0 && Static89.anInt1891 > local121 + local140.anInt5486 && local133 >= 0 && Static85.anInt1839 > local133 + local140.anInt5486) {
						Static223.aClass1_Sub2_Sub1_Sub2Array1[local90] = new Class1_Sub2_Sub1_Sub2();
						Static223.aClass1_Sub2_Sub1_Sub2Array1[local90].anInt5374 = local90;
						@Pc(198) Class1_Sub2_Sub1_Sub2 local198 = Static223.aClass1_Sub2_Sub1_Sub2Array1[local90];
						Static373.anIntArray577[Static123.anInt5933++] = local90;
						local198.anInt5399 = Static339.anInt6265;
						local198.method4807(local140);
						local198.method4801(local198.aClass197_1.anInt5486);
						local198.anInt5426 = local198.aClass197_1.anInt5488 << 3;
						if (local198.anInt5426 == 0) {
							local198.method4796(0);
						} else {
							local198.method4796(local198.aClass197_1.aByte54 + 4 << 11 & 0x3E8A);
						}
						local198.method4806(true, local121, local98, local198.method4792(), local133);
					}
				}
			}
		}
	}
}
