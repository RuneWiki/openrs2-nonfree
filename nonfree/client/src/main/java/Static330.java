import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static330 {

	@OriginalMember(owner = "client!ns", name = "q", descriptor = "Lclient!im;")
	public static final Class140 aClass140_93 = new Class140(72, 12);

	@OriginalMember(owner = "client!ns", name = "A", descriptor = "I")
	public static int anInt6001 = 0;

	@OriginalMember(owner = "client!ns", name = "B", descriptor = "[F")
	public static final float[] aFloatArray41 = new float[4];

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(ZII)Z")
	public static boolean method5080(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x220) == 544 | (arg0 & 0x18) != 0;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(BII)I")
	public static int method5081(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 > 22050) {
			arg0 = arg1;
			arg1 = 22050;
		}
		while (arg1 != 0) {
			@Pc(20) int local20 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local20;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ns", name = "h", descriptor = "(I)V")
	public static void method5082() {
		@Pc(8) int local8 = Static381.aByteArrayArray20.length;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			if (Static381.aByteArrayArray20[local10] != null) {
				@Pc(18) int local18 = -1;
				for (@Pc(20) int local20 = 0; local20 < Static112.anInt2265; local20++) {
					if (Static9.anIntArray23[local10] == Static396.anIntArray688[local20]) {
						local18 = local20;
						break;
					}
				}
				if (local18 == -1) {
					Static396.anIntArray688[Static112.anInt2265] = Static9.anIntArray23[local10];
					local18 = Static112.anInt2265++;
				}
				@Pc(63) Class1_Sub6 local63 = new Class1_Sub6(Static381.aByteArrayArray20[local10]);
				@Pc(65) int local65 = 0;
				while (Static381.aByteArrayArray20[local10].length > local63.anInt4555 && local65 < 511 && Static157.anInt4503 < 1023) {
					@Pc(86) int local86 = local18 | local65++ << 6;
					@Pc(90) int local90 = local63.method3967();
					@Pc(94) int local94 = local90 >> 14;
					@Pc(100) int local100 = local90 >> 7 & 0x3F;
					@Pc(104) int local104 = local90 & 0x3F;
					@Pc(117) int local117 = local100 + (Static9.anIntArray23[local10] >> 8) * 64 - Static470.anInt7897;
					@Pc(130) int local130 = (Static9.anIntArray23[local10] & 0xFF) * 64 + local104 - Static534.anInt9007;
					@Pc(137) Class196 local137 = Static538.aClass242_2.method5833(local63.method3967());
					@Pc(144) Class1_Sub17 local144 = (Class1_Sub17) Static380.aClass17_29.method738((long) local86);
					if (local144 == null && (local137.aByte68 & 0x1) > 0 && Static206.anInt4061 == local94 && local117 >= 0 && Static459.anInt7799 > local117 + local137.anInt5718 && local130 >= 0 && local130 + local137.anInt5718 < Static482.anInt7990) {
						@Pc(179) Class49_Sub2_Sub2_Sub2 local179 = new Class49_Sub2_Sub2_Sub2();
						local179.anInt4295 = local86;
						@Pc(187) Class1_Sub17 local187 = new Class1_Sub17(local179);
						Static380.aClass17_29.method737(local187, (long) local86);
						Static177.aClass1_Sub17Array3[Static350.anInt6254++] = local187;
						Static427.anIntArray711[Static157.anInt4503++] = local86;
						local179.anInt4300 = Static436.anInt6850;
						local179.method3802(local137);
						local179.method3793(local179.aClass196_1.anInt5718);
						local179.anInt4270 = local179.aClass196_1.anInt5710 << 3;
						local179.method3784(local179.aClass196_1.aByte76 + 4 << 11 & 0x3D18, true);
						local179.method3808(local117, local130, true, local179.method3788(), local94);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ns", name = "c", descriptor = "(B)I")
	public static int method5083() {
		return Static69.anInt1331;
	}
}
