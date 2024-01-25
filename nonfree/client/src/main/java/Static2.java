import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "Lclient!ga;")
	public static Class111 aClass111_1;

	@OriginalMember(owner = "client!aa", name = "h", descriptor = "I")
	public static int anInt57;

	@OriginalMember(owner = "client!aa", name = "g", descriptor = "[Lclient!hca;")
	public static final Class131[] aClass131Array1 = new Class131[14];

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V")
	public static void method44() {
		@Pc(8) int local8 = Static429.aByteArrayArray24.length;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			if (Static429.aByteArrayArray24[local10] != null) {
				@Pc(18) int local18 = -1;
				for (@Pc(20) int local20 = 0; local20 < Static548.anInt9030; local20++) {
					if (Static298.anIntArray348[local10] == Static181.anIntArray194[local20]) {
						local18 = local20;
						break;
					}
				}
				if (local18 == -1) {
					Static181.anIntArray194[Static548.anInt9030] = Static298.anIntArray348[local10];
					local18 = Static548.anInt9030++;
				}
				@Pc(67) Class1_Sub20 local67 = new Class1_Sub20(Static429.aByteArrayArray24[local10]);
				@Pc(69) int local69 = 0;
				while (local67.anInt5238 < Static429.aByteArrayArray24[local10].length && local69 < 511 && Static480.anInt8097 < 1023) {
					@Pc(86) int local86 = local69++ << 6 | local18;
					@Pc(90) int local90 = local67.method4426();
					@Pc(94) int local94 = local90 >> 14;
					@Pc(100) int local100 = local90 >> 7 & 0x3F;
					@Pc(104) int local104 = local90 & 0x3F;
					@Pc(117) int local117 = (Static298.anIntArray348[local10] >> 8) * 64 + local100 - Static376.anInt6631;
					@Pc(130) int local130 = (Static298.anIntArray348[local10] & 0xFF) * 64 + local104 - Static24.anInt674;
					@Pc(137) Class162 local137 = Static183.aClass182_1.method4062(local67.method4426());
					@Pc(146) Class1_Sub39 local146 = (Class1_Sub39) Static131.aClass356_32.method7796((long) local86);
					if (local146 == null && (local137.aByte59 & 0x1) > 0 && Static296.anInt5478 == local94 && local117 >= 0 && Static500.anInt6888 > local137.anInt4408 + local117 && local130 >= 0 && Static573.anInt9325 > local137.anInt4408 + local130) {
						@Pc(188) Class20_Sub2_Sub4_Sub1_Sub2 local188 = new Class20_Sub2_Sub4_Sub1_Sub2();
						local188.anInt6407 = local86;
						@Pc(196) Class1_Sub39 local196 = new Class1_Sub39(local188);
						Static131.aClass356_32.method7800((long) local86, local196);
						Static471.aClass1_Sub39Array1[Static491.anInt1754++] = local196;
						Static542.anIntArray599[Static480.anInt8097++] = local86;
						local188.anInt6399 = Static81.anInt1910;
						local188.method5359(local137);
						local188.method5356(local188.aClass162_1.anInt4408);
						local188.anInt6410 = local188.aClass162_1.anInt4424 << 3;
						local188.method5353(true, (local188.aClass162_1.aByte65 + 4 & 0xAF400007) << 11);
						local188.method5358(true, local94, local188.method5349(), local130, local117);
					}
				}
			}
		}
	}
}
