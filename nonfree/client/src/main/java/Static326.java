import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static326 {

	@OriginalMember(owner = "client!ul", name = "c", descriptor = "[I")
	public static final int[] anIntArray474 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

	@OriginalMember(owner = "client!ul", name = "d", descriptor = "I")
	public static int anInt6155 = -1;

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(B)V")
	public static void method5530() {
		@Pc(8) int local8 = Static42.aByteArrayArray2.length;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			if (Static42.aByteArrayArray2[local10] != null) {
				@Pc(18) int local18 = -1;
				for (@Pc(20) int local20 = 0; local20 < Static257.anInt1058; local20++) {
					if (Static37.anIntArray60[local10] == Static198.anIntArray310[local20]) {
						local18 = local20;
						break;
					}
				}
				if (local18 == -1) {
					Static198.anIntArray310[Static257.anInt1058] = Static37.anIntArray60[local10];
					local18 = Static257.anInt1058++;
				}
				@Pc(63) Class1_Sub7 local63 = new Class1_Sub7(Static42.aByteArrayArray2[local10]);
				@Pc(65) int local65 = 0;
				while (Static42.aByteArrayArray2[local10].length > local63.anInt2219 && local65 < 511 && Static277.anInt5394 < 1023) {
					@Pc(82) int local82 = local65++ << 6 | local18;
					@Pc(86) int local86 = local63.method2161();
					@Pc(90) int local90 = local86 >> 14;
					@Pc(96) int local96 = local86 >> 7 & 0x3F;
					@Pc(100) int local100 = local86 & 0x3F;
					@Pc(112) int local112 = local96 + (Static37.anIntArray60[local10] >> 8) * 64 - Static50.anInt1271;
					@Pc(125) int local125 = local100 + (Static37.anIntArray60[local10] & 0xFF) * 64 - Static299.anInt4036;
					@Pc(131) Class208 local131 = Static139.method2817(local63.method2161());
					if (Static231.aClass11_Sub2_Sub6_Sub2Array1[local82] == null && (local131.aByte66 & 0x1) > 0 && Static75.anInt3288 == local90 && local112 >= 0 && Static311.anInt5653 > local131.anInt6162 + local112 && local125 >= 0 && Static189.anInt3820 > local125 + local131.anInt6162) {
						Static231.aClass11_Sub2_Sub6_Sub2Array1[local82] = new Class11_Sub2_Sub6_Sub2();
						Static231.aClass11_Sub2_Sub6_Sub2Array1[local82].anInt6792 = local82;
						@Pc(191) Class11_Sub2_Sub6_Sub2 local191 = Static231.aClass11_Sub2_Sub6_Sub2Array1[local82];
						Static81.anIntArray143[Static277.anInt5394++] = local82;
						local191.anInt6745 = Static51.anInt1301;
						local191.method5906(local131);
						local191.method5893(local191.aClass208_1.anInt6162);
						local191.anInt6786 = local191.aClass208_1.anInt6180 << 3;
						if (local191.anInt6786 == 0) {
							local191.method5883(0);
						} else {
							local191.method5883((local191.aClass208_1.aByte64 + 4 & 0x8F200007) << 11);
						}
						local191.method5907(local90, local125, local112, true, local191.method5894());
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ICLjava/lang/String;)I")
	public static int method5531(@OriginalArg(1) char arg0, @OriginalArg(2) String arg1) {
		@Pc(7) int local7 = 0;
		@Pc(10) int local10 = arg1.length();
		for (@Pc(17) int local17 = 0; local17 < local10; local17++) {
			if (arg1.charAt(local17) == arg0) {
				local7++;
			}
		}
		return local7;
	}
}
