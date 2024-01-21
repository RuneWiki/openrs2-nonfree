import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!cc", name = "nb", descriptor = "[S")
	public static short[] aShortArray17;

	@OriginalMember(owner = "client!cc", name = "gb", descriptor = "I")
	public static int anInt723 = 0;

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(Z)V")
	public static void method443() {
		@Pc(8) int local8 = Static1.aClass1_Sub14_Sub1_43.method1756(8);
		@Pc(13) int local13;
		if (Static44.anInt1123 > local8) {
			for (local13 = local8; local13 < Static44.anInt1123; local13++) {
				Static142.anIntArray392[Static20.anInt624++] = Static138.anIntArray385[local13];
			}
		}
		if (Static44.anInt1123 < local8) {
			throw new RuntimeException("gppov1");
		}
		Static44.anInt1123 = 0;
		for (local13 = 0; local13 < local8; local13++) {
			@Pc(49) int local49 = Static138.anIntArray385[local13];
			@Pc(53) Class6_Sub4_Sub1 local53 = Static158.aClass6_Sub4_Sub1Array1[local49];
			@Pc(58) int local58 = Static1.aClass1_Sub14_Sub1_43.method1756(1);
			if (local58 == 0) {
				Static138.anIntArray385[Static44.anInt1123++] = local49;
				local53.anInt3975 = Static174.anInt3887;
			} else {
				@Pc(80) int local80 = Static1.aClass1_Sub14_Sub1_43.method1756(2);
				if (local80 == 0) {
					Static138.anIntArray385[Static44.anInt1123++] = local49;
					local53.anInt3975 = Static174.anInt3887;
					Static191.anIntArray474[Static95.anInt2376++] = local49;
				} else {
					@Pc(123) int local123;
					@Pc(133) int local133;
					if (local80 == 1) {
						Static138.anIntArray385[Static44.anInt1123++] = local49;
						local53.anInt3975 = Static174.anInt3887;
						local123 = Static1.aClass1_Sub14_Sub1_43.method1756(3);
						local53.method2994(false, local123);
						local133 = Static1.aClass1_Sub14_Sub1_43.method1756(1);
						if (local133 == 1) {
							Static191.anIntArray474[Static95.anInt2376++] = local49;
						}
					} else if (local80 == 2) {
						Static138.anIntArray385[Static44.anInt1123++] = local49;
						local53.anInt3975 = Static174.anInt3887;
						local123 = Static1.aClass1_Sub14_Sub1_43.method1756(3);
						local53.method2994(true, local123);
						local133 = Static1.aClass1_Sub14_Sub1_43.method1756(3);
						local53.method2994(true, local133);
						@Pc(186) int local186 = Static1.aClass1_Sub14_Sub1_43.method1756(1);
						if (local186 == 1) {
							Static191.anIntArray474[Static95.anInt2376++] = local49;
						}
					} else if (local80 == 3) {
						Static142.anIntArray392[Static20.anInt624++] = local49;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIBI)V")
	public static void method445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		Static194.method3107(arg3, arg2, arg3 + arg1, arg0 + arg2);
		Static56.method1025();
		Static194.method3096(arg3, arg2, arg1, arg0, 0);
		if (Static108.anInt2648 < 100) {
			return;
		}
		Static159.method2757(Static190.anInt4160, 0, Static25.anInt737, 0, arg1 + arg3, arg2, arg3, arg0 + arg2);
		@Pc(48) int local48 = Static54.anInt3672 * arg1 / Static190.anInt4160 + arg3;
		@Pc(57) int local57 = arg2 + arg0 * Static206.anInt4387 / Static25.anInt737;
		@Pc(63) int local63 = Static93.anInt2329 * arg1 / Static190.anInt4160;
		@Pc(69) int local69 = Static49.anInt1304 * arg0 / Static25.anInt737;
		Static194.method3105(local48, local57, local63, local69, 16711680, 128);
		Static194.method3095(local48, local57, local63, local69, 16711680);
		if (Static148.anInt3490 <= 0 || Static148.anInt3490 % 10 >= 5) {
			return;
		}
		for (@Pc(102) Class1_Sub16 local102 = (Class1_Sub16) Static31.aClass91_1.method3148(); local102 != null; local102 = (Class1_Sub16) Static31.aClass91_1.method3150()) {
			if (Static39.anInt1069 == local102.anInt2532) {
				@Pc(121) int local121 = arg1 * local102.anInt2531 / Static190.anInt4160 + arg3;
				@Pc(130) int local130 = local102.anInt2528 * arg0 / Static25.anInt737 + arg2;
				Static194.method3096(local121 - 2, local130 - 2, 4, 4, 16776960);
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "(I)V")
	public static void method447() {
		Static16.aBoolean20 = false;
		Static13.aBoolean36 = false;
	}
}
