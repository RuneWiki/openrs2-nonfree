import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "[[B")
	public static byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "Z")
	public static boolean aBoolean25 = false;

	@OriginalMember(owner = "client!bb", name = "g", descriptor = "I")
	public static int anInt295 = -1;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)V")
	public static void method303(@OriginalArg(0) int arg0) {
		Static207.anInt4867 = arg0;
		Static258.anInt5077 = -1;
		Static258.anInt5077 = -1;
		Static196.method1928();
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIZIII)V")
	public static void method304(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static189.anInt3906 = arg2;
		Static238.anInt3833 = arg1;
		Static88.anInt1963 = arg0;
		Static5.anInt179 = arg4;
		Static188.anInt3900 = arg5;
		if (arg3 && Static238.anInt3833 >= 100) {
			Static239.anInt4738 = Static189.anInt3906 * 128 + 64;
			Static69.anInt1504 = Static188.anInt3900 * 128 + 64;
			Static297.anInt5618 = Static20.method383(Static239.anInt4738, Static140.anInt3034, Static69.anInt1504) - Static88.anInt1963;
		}
		Static220.anInt4376 = 2;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)V")
	public static void method306() {
		@Pc(8) int local8 = Static170.aByteArrayArray9.length;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			if (Static170.aByteArrayArray9[local10] != null) {
				@Pc(28) int local28 = -1;
				for (@Pc(30) int local30 = 0; local30 < Static201.anInt4079; local30++) {
					if (Static24.anIntArray414[local10] == Static273.anIntArray506[local30]) {
						local28 = local30;
						break;
					}
				}
				if (local28 == -1) {
					Static273.anIntArray506[Static201.anInt4079] = Static24.anIntArray414[local10];
					local28 = Static201.anInt4079++;
				}
				@Pc(75) Class1_Sub11 local75 = new Class1_Sub11(Static170.aByteArrayArray9[local10]);
				@Pc(77) int local77 = 0;
				while (Static170.aByteArrayArray9[local10].length > local75.anInt3264 && local77 < 511) {
					@Pc(96) int local96 = local28 | local77++ << 6;
					@Pc(100) int local100 = local75.method2691();
					@Pc(104) int local104 = local100 & 0x3F;
					@Pc(108) int local108 = local100 >> 14;
					@Pc(120) int local120 = (Static24.anIntArray414[local10] & 0xFF) * 64 + local104 - Static83.anInt1875;
					@Pc(126) int local126 = local100 >> 7 & 0x3F;
					@Pc(139) int local139 = local126 + (Static24.anIntArray414[local10] >> 8) * 64 - Static53.anInt5288;
					@Pc(145) Class46 local145 = Static205.method3293(local75.method2691());
					if (Static254.aClass14_Sub2_Sub2Array1[local96] == null && (local145.aByte5 & 0x1) > 0 && Static226.anInt4504 == local108 && local139 >= 0 && local139 + local145.anInt1532 < 104 && local120 >= 0 && local120 + local145.anInt1532 < 104) {
						Static254.aClass14_Sub2_Sub2Array1[local96] = new Class14_Sub2_Sub2();
						@Pc(198) Class14_Sub2_Sub2 local198 = Static254.aClass14_Sub2_Sub2Array1[local96];
						Static281.anIntArray464[Static233.anInt4582++] = local96;
						local198.anInt4645 = Static237.anInt4710;
						local198.method3663(local145);
						local198.method3653(local198.aClass46_1.anInt1532);
						local198.anInt4618 = local198.anInt4681 = Static111.anIntArray230[local198.aClass46_1.aByte4];
						local198.anInt4674 = local198.aClass46_1.anInt1553;
						local198.anInt4617 = local198.aClass46_1.anInt1562;
						if (local198.anInt4617 == 0) {
							local198.anInt4681 = 0;
						}
						local198.method3654(local198.method3656(), local120, true, local139);
					}
				}
			}
		}
	}
}
