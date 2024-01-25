import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!ih", name = "h", descriptor = "Lclient!wo;")
	public static Class216 aClass216_43;

	@OriginalMember(owner = "client!ih", name = "j", descriptor = "I")
	public static int anInt2811;

	@OriginalMember(owner = "client!ih", name = "k", descriptor = "[I")
	public static int[] anIntArray253;

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "Lclient!hq;")
	public static final Class87 aClass87_24 = new Class87(50);

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(B)V")
	public static void method2602() {
		@Pc(8) int local8 = Static315.aByteArrayArray23.length;
		for (@Pc(15) int local15 = 0; local15 < local8; local15++) {
			if (Static315.aByteArrayArray23[local15] != null) {
				@Pc(23) int local23 = -1;
				for (@Pc(25) int local25 = 0; local25 < Static139.anInt4710; local25++) {
					if (Static222.anIntArray416[local15] == Static237.anIntArray441[local25]) {
						local23 = local25;
						break;
					}
				}
				if (local23 == -1) {
					Static237.anIntArray441[Static139.anInt4710] = Static222.anIntArray416[local15];
					local23 = Static139.anInt4710++;
				}
				@Pc(68) Class1_Sub8 local68 = new Class1_Sub8(Static315.aByteArrayArray23[local15]);
				@Pc(70) int local70 = 0;
				while (local68.anInt5182 < Static315.aByteArrayArray23[local15].length && local70 < 511 && Static5.anInt200 < 1023) {
					@Pc(91) int local91 = local70++ << 6 | local23;
					@Pc(95) int local95 = local68.method4556();
					@Pc(99) int local99 = local95 >> 14;
					@Pc(105) int local105 = local95 >> 7 & 0x3F;
					@Pc(109) int local109 = local95 & 0x3F;
					@Pc(122) int local122 = local105 + (Static222.anIntArray416[local15] >> 8) * 64 - Static234.anInt4783;
					@Pc(135) int local135 = local109 + (Static222.anIntArray416[local15] & 0xFF) * 64 - Static32.anInt2224;
					@Pc(141) Class213 local141 = Static133.method2749(local68.method4556());
					if (Static140.aClass17_Sub1_Sub1_Sub2Array1[local91] == null && (local141.aByte75 & 0x1) > 0 && Static141.anInt6334 == local99 && local122 >= 0 && local141.anInt6509 + local122 < Static233.anInt5573 && local135 >= 0 && Static134.anInt2971 > local141.anInt6509 + local135) {
						Static140.aClass17_Sub1_Sub1_Sub2Array1[local91] = new Class17_Sub1_Sub1_Sub2();
						Static140.aClass17_Sub1_Sub1_Sub2Array1[local91].anInt4867 = local91;
						@Pc(197) Class17_Sub1_Sub1_Sub2 local197 = Static140.aClass17_Sub1_Sub1_Sub2Array1[local91];
						Static171.anIntArray333[Static5.anInt200++] = local91;
						local197.anInt4852 = Static5.anInt208;
						local197.method4332(local141);
						local197.method4321(local197.aClass213_1.anInt6509);
						local197.anInt4848 = local197.aClass213_1.anInt6522 << 3;
						if (local197.anInt4848 == 0) {
							local197.method4323(0);
						} else {
							local197.method4323(local197.aClass213_1.aByte74 + 4 << 11 & 0x3954);
						}
						local197.method4327(true, local197.method4318(), local135, local99, local122);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IZZZI)V")
	public static void method2603(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		Static294.method4959(arg2, arg0, arg3, arg1, 0, Static90.aClass104_Sub1Array3.length - 1);
		Static90.anInt2261 = 0;
		Static86.aClass1_Sub39_1 = null;
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(B)V")
	public static void method2605() {
		Static156.aClass75_1 = new Class75(8);
		Static189.anInt4072 = 0;
		for (@Pc(25) Class8_Sub6 local25 = (Class8_Sub6) Static140.aClass217_5.method5683(); local25 != null; local25 = (Class8_Sub6) Static140.aClass217_5.method5679()) {
			local25.method3282();
		}
	}
}
