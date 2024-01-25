import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "Lclient!u;")
	public static Class6_Sub48 aClass6_Sub48_1;

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ZI)V")
	public static void method2757(@OriginalArg(0) boolean arg0) {
		Static353.anInt6225 = 0;
		Static148.anInt2606 = 0;
		Static107.method1736();
		Static132.method1972(arg0);
		Static450.method6435();
		@Pc(18) boolean local18 = false;
		@Pc(26) int local26;
		for (@Pc(20) int local20 = 0; local20 < Static148.anInt2606; local20++) {
			local26 = Static13.anIntArray21[local20];
			@Pc(33) Class6_Sub28 local33 = (Class6_Sub28) Static31.aClass212_1.method5106((long) local26);
			@Pc(36) Class29_Sub2_Sub1_Sub1 local36 = local33.aClass29_Sub2_Sub1_Sub1_2;
			if (Static330.aBoolean415 && Static243.method6088(local26)) {
				Static287.method7854();
			}
			if (Static358.anInt6263 != local36.anInt8511) {
				if (local36.aClass257_1.method5944()) {
					Static577.method5078(local36);
				}
				local36.method1594(null);
				local33.method7849();
				local18 = true;
			}
		}
		if (local18) {
			Static505.anInt8419 = Static31.aClass212_1.method5105();
			Static31.aClass212_1.method5100(Static354.aClass6_Sub28Array1);
		}
		if (Static420.aClass6_Sub14_Sub2_2.anInt7244 != Static567.anInt9502) {
			throw new RuntimeException("gnp1 pos:" + Static420.aClass6_Sub14_Sub2_2.anInt7244 + " psize:" + Static567.anInt9502);
		}
		for (local26 = 0; local26 < Static516.anInt8936; local26++) {
			if (Static31.aClass212_1.method5106((long) Static274.anIntArray385[local26]) == null) {
				throw new RuntimeException("gnp2 pos:" + local26 + " size:" + Static516.anInt8936);
			}
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIIIBII)V")
	public static void method2758(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = arg0 - 334;
		if (local11 < 0) {
			local11 = 0;
		} else if (local11 > 100) {
			local11 = 100;
		}
		@Pc(38) int local38 = Static40.aShort7 + local11 * (Static270.aShort57 - Static40.aShort7) / 100;
		@Pc(44) int local44 = local38 * arg3 >> 8;
		@Pc(50) int local50 = 16384 - arg6 & 0x3FFF;
		@Pc(57) int local57 = 16384 - arg5 & 0x3FFF;
		@Pc(59) int local59 = 0;
		@Pc(61) int local61 = 0;
		@Pc(63) int local63 = local44;
		if (local50 != 0) {
			local61 = -local44 * Class138.anIntArray392[local50] >> 14;
			local63 = Class138.anIntArray393[local50] * local44 >> 14;
		}
		if (local57 != 0) {
			local59 = local63 * Class138.anIntArray392[local57] >> 14;
			local63 = Class138.anIntArray393[local57] * local63 >> 14;
		}
		Static33.anInt568 = arg2 - local61;
		Static162.anInt2840 = arg6;
		Static388.anInt6921 = arg1 - local59;
		Static218.anInt3720 = 0;
		Static261.anInt4257 = arg5;
		Static220.anInt3753 = arg4 - local63;
	}
}
