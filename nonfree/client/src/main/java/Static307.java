import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static307 {

	@OriginalMember(owner = "client!sa", name = "X", descriptor = "Lclient!eh;")
	public static Class57 aClass57_1;

	@OriginalMember(owner = "client!sa", name = "U", descriptor = "[[I")
	public static final int[][] anIntArrayArray40 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!sa", name = "V", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_115 = new Class205(54, 20);

	@OriginalMember(owner = "client!sa", name = "h", descriptor = "(I)V")
	public static void method4497() {
		for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
			Static88.aBooleanArray12[local7] = false;
		}
		Static144.anInt2886 = Static224.anInt4006;
		Static368.anInt5299 = Static51.anInt1057;
		Static204.anInt3782 = Static253.anInt4469;
		Static334.anInt5726 = -1;
		Static131.anInt2701 = 0;
		Static41.anInt819 = Static235.anInt4191;
		Static344.anInt4790 = Static14.anInt360;
		Static79.anInt4624 = 5;
		Static59.anInt1124 = Static285.anInt4940;
		Static111.anInt2355 = 0;
		Class2_Sub4_Sub22.lb = -1;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(III)I")
	public static int method4498(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = 0;
		while (arg1 > 0) {
			local15 = arg0 & 0x1 | local15 << 1;
			arg0 >>>= 0x1;
			arg1--;
		}
		return local15;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(BZ)V")
	public static void method4499(@OriginalArg(1) boolean arg0) {
		Static43.anInt857 = 0;
		Static158.anInt3041 = 0;
		Static54.method3532();
		Static8.method186(arg0);
		Static30.method549();
		@Pc(28) int local28;
		for (@Pc(22) int local22 = 0; local22 < Static43.anInt857; local22++) {
			local28 = Static34.anIntArray166[local22];
			if (Static299.aClass1_Sub5_Sub1_Sub2Array1[local28].anInt6422 != Static253.anInt4469) {
				if (Static299.aClass1_Sub5_Sub1_Sub2Array1[local28].aClass133_1.method3085()) {
					Static215.method3587(Static299.aClass1_Sub5_Sub1_Sub2Array1[local28]);
				}
				Static299.aClass1_Sub5_Sub1_Sub2Array1[local28].method5566(null);
				Static299.aClass1_Sub5_Sub1_Sub2Array1[local28] = null;
			}
		}
		if (Static276.anInt4757 != Static218.aClass2_Sub16_Sub2_3.anInt6145) {
			throw new RuntimeException("gnp1 pos:" + Static218.aClass2_Sub16_Sub2_3.anInt6145 + " psize:" + Static276.anInt4757);
		}
		for (local28 = 0; local28 < Static171.anInt3311; local28++) {
			if (Static299.aClass1_Sub5_Sub1_Sub2Array1[Static143.anIntArray583[local28]] == null) {
				throw new RuntimeException("gnp2 pos:" + local28 + " size:" + Static171.anInt3311);
			}
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!pg;[[BB)V")
	public static void method4500(@OriginalArg(0) Class56_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(15) int local15 = arg1.length;
		@Pc(36) int local36;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(23) byte[] local23 = arg1[local17];
			if (local23 != null) {
				@Pc(30) Class2_Sub16 local30 = new Class2_Sub16(local23);
				local36 = Static68.anIntArray284[local17] >> 8;
				@Pc(42) int local42 = Static68.anIntArray284[local17] & 0xFF;
				@Pc(49) int local49 = local36 * 64 - Static28.anInt606;
				@Pc(55) int local55 = local42 * 64 - Static319.anInt5425;
				Static271.method4164();
				arg0.method4056(local30, Static28.anInt606, local49, local55, Static319.anInt5425, Static58.aClass188Array1);
				arg0.method4077(local55, local12, local49, Static111.aClass63_3, local30);
				if (!arg0.aBoolean341 && local36 == Static94.anInt1924 / 8 && local42 == Static82.anInt1485 / 8) {
					if (local12[0] == -1) {
						Static103.aClass33_1 = null;
					} else {
						Static103.aClass33_1 = Static341.aClass225_1.method4905(local12[3], local12[1], local12[0], local12[2], Static106.aClass98_1);
						Static16.anInt387 = local12[4];
					}
				}
			}
		}
		for (@Pc(127) int local127 = 0; local127 < local15; local127++) {
			@Pc(140) int local140 = (Static68.anIntArray284[local127] >> 8) * 64 - Static28.anInt606;
			local36 = (Static68.anIntArray284[local127] & 0xFF) * 64 - Static319.anInt5425;
			@Pc(155) byte[] local155 = arg1[local127];
			if (local155 == null && Static82.anInt1485 < 800) {
				Static271.method4164();
				arg0.method4069(local140, local36);
			}
		}
	}
}
