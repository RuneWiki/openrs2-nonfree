import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static405 {

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "Lclient!vh;")
	public static final Class344 aClass344_69 = new Class344(0, -1);

	@OriginalMember(owner = "client!pk", name = "d", descriptor = "Z")
	public static boolean aBoolean565 = false;

	@OriginalMember(owner = "client!pk", name = "f", descriptor = "F")
	public static float aFloat185 = 1.0F;

	@OriginalMember(owner = "client!pk", name = "j", descriptor = "I")
	public static int anInt7854 = -1;

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(BII)Z")
	public static boolean method6140(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)V")
	public static void method6141() {
		@Pc(8) int local8 = Static72.aByteArrayArray7.length;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			if (Static72.aByteArrayArray7[local10] != null) {
				@Pc(18) int local18 = -1;
				for (@Pc(20) int local20 = 0; local20 < Static269.anInt5659; local20++) {
					if (Static153.anIntArray162[local20] == Static322.anIntArray351[local10]) {
						local18 = local20;
						break;
					}
				}
				if (local18 == -1) {
					Static153.anIntArray162[Static269.anInt5659] = Static322.anIntArray351[local10];
					local18 = Static269.anInt5659++;
				}
				@Pc(64) Class4_Sub13 local64 = new Class4_Sub13(Static72.aByteArrayArray7[local10]);
				@Pc(66) int local66 = 0;
				while (local64.anInt9170 < Static72.aByteArrayArray7[local10].length && local66 < 511 && Static137.anInt3042 < 1023) {
					@Pc(87) int local87 = local18 | local66++ << 6;
					@Pc(91) int local91 = local64.method7054();
					@Pc(95) int local95 = local91 >> 14;
					@Pc(101) int local101 = local91 >> 7 & 0x3F;
					@Pc(105) int local105 = local91 & 0x3F;
					@Pc(118) int local118 = local101 + (Static322.anIntArray351[local10] >> 8) * 64 - Static242.anInt10133;
					@Pc(131) int local131 = local105 + (Static322.anIntArray351[local10] & 0xFF) * 64 - Static157.anInt3323;
					@Pc(138) Class51 local138 = Class21_Sub1_Sub2_Sub1.lb.method4992(local64.method7054());
					@Pc(145) Class4_Sub29 local145 = (Class4_Sub29) Static144.aClass221_6.method5075((long) local87);
					if (local145 == null && (local138.aByte21 & 0x1) > 0 && local95 == Static550.anInt10029 && local118 >= 0 && local118 + local138.anInt1581 < Static338.anInt6508 && local131 >= 0 && local138.anInt1581 + local131 < Static390.anInt7654) {
						@Pc(182) Class21_Sub1_Sub1_Sub1_Sub1 local182 = new Class21_Sub1_Sub1_Sub1_Sub1();
						local182.anInt4256 = local87;
						@Pc(190) Class4_Sub29 local190 = new Class4_Sub29(local182);
						Static144.aClass221_6.method5073(local190, (long) local87);
						Static590.aClass4_Sub29Array1[Static222.anInt4653++] = local190;
						Static24.anIntArray24[Static137.anInt3042++] = local87;
						local182.anInt4260 = Static306.anInt6122;
						local182.method1714(local138);
						local182.method3334(local182.aClass51_1.anInt1581);
						local182.anInt4255 = local182.aClass51_1.anInt1608 << 3;
						local182.method3340(true, (local182.aClass51_1.aByte20 + 4 & 0x98400007) << 11);
						local182.method1713(local182.method3339(), true, local131, local95, local118);
					}
				}
			}
		}
	}
}
