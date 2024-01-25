import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static570 {

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "I")
	public static int anInt9842;

	@OriginalMember(owner = "client!wf", name = "d", descriptor = "[Lclient!xa;")
	public static Class71[] aClass71Array56;

	@OriginalMember(owner = "client!wf", name = "f", descriptor = "F")
	public static float aFloat209;

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "Lclient!uc;")
	public static final Class316 aClass316_118 = new Class316(62, 3);

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lclient!ql;I)V")
	public static void method7830(@OriginalArg(0) Class6_Sub12_Sub2 arg0) {
		arg0.method6068();
		@Pc(10) int local10 = Static517.anInt8881;
		@Pc(20) Class15_Sub2_Sub4_Sub2 local20 = Static461.aClass15_Sub2_Sub4_Sub2_2 = Static551.aClass15_Sub2_Sub4_Sub2Array1[local10] = new Class15_Sub2_Sub4_Sub2();
		local20.anInt8924 = local10;
		@Pc(28) int local28 = arg0.method6061(30);
		@Pc(33) byte local33 = (byte) (local28 >> 28);
		@Pc(45) int local45 = local28 >> 14 & 0x3FFF;
		local20.anIntArray638[0] = local45 - Static150.anInt2792;
		@Pc(57) int local57 = local28 & 0x3FFF;
		local20.anInt8911 = (local20.anIntArray638[0] << 9) + (local20.method7135() << 8);
		local20.anIntArray637[0] = local57 - Static154.anInt2878;
		local20.anInt8913 = (local20.anIntArray637[0] << 9) + (local20.method7135() << 8);
		Static391.anInt7128 = local20.aByte98 = local33;
		if (Static76.aClass6_Sub12Array1[local10] != null) {
			local20.method7154(Static76.aClass6_Sub12Array1[local10]);
		}
		Static333.anInt6355 = 0;
		Static354.anIntArray461[Static333.anInt6355++] = local10;
		Static114.aByteArray28[local10] = 0;
		Static493.anInt8639 = 0;
		for (@Pc(127) int local127 = 1; local127 < 2048; local127++) {
			if (local10 != local127) {
				@Pc(143) int local143 = arg0.method6061(18);
				@Pc(147) int local147 = local143 >> 16;
				@Pc(153) int local153 = local143 >> 8 & 0xFF;
				@Pc(157) int local157 = local143 & 0xFF;
				@Pc(165) Class83 local165 = Static252.aClass83Array1[local127] = new Class83();
				local165.anInt1959 = (local153 << 14) + (local147 << 28) + local157;
				local165.anInt1961 = 0;
				local165.anInt1956 = -1;
				local165.aBoolean130 = false;
				Static455.anIntArray567[Static493.anInt8639++] = local127;
				Static114.aByteArray28[local127] = 0;
			}
		}
		arg0.method6065();
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(BILclient!faa;I)V")
	public static void method7831(@OriginalArg(1) int arg0, @OriginalArg(2) Class97 arg1, @OriginalArg(3) int arg2) {
		if (arg1.aByte29 == 0) {
			arg1.anInt2642 = arg1.anInt2650;
		} else if (arg1.aByte29 == 1) {
			arg1.anInt2642 = (arg0 - arg1.anInt2690) / 2 + arg1.anInt2650;
		} else if (arg1.aByte29 == 2) {
			arg1.anInt2642 = arg0 - arg1.anInt2690 - arg1.anInt2650;
		} else if (arg1.aByte29 == 3) {
			arg1.anInt2642 = arg0 * arg1.anInt2650 >> 14;
		} else if (arg1.aByte29 == 4) {
			arg1.anInt2642 = (arg1.anInt2650 * arg0 >> 14) + (arg0 - arg1.anInt2690) / 2;
		} else {
			arg1.anInt2642 = arg0 - arg1.anInt2690 - (arg0 * arg1.anInt2650 >> 14);
		}
		if (arg1.aByte28 == 0) {
			arg1.anInt2641 = arg1.anInt2618;
		} else if (arg1.aByte28 == 1) {
			arg1.anInt2641 = (arg2 - arg1.anInt2670) / 2 + arg1.anInt2618;
		} else if (arg1.aByte28 == 2) {
			arg1.anInt2641 = arg2 - arg1.anInt2670 - arg1.anInt2618;
		} else if (arg1.aByte28 == 3) {
			arg1.anInt2641 = arg1.anInt2618 * arg2 >> 14;
		} else if (arg1.aByte28 == 4) {
			arg1.anInt2641 = (arg1.anInt2618 * arg2 >> 14) + (arg2 - arg1.anInt2670) / 2;
		} else {
			arg1.anInt2641 = arg2 - arg1.anInt2670 - (arg2 * arg1.anInt2618 >> 14);
		}
		if (!Static37.aBoolean48 || Static74.method1044(arg1).anInt7305 == 0 && arg1.anInt2637 != 0) {
			return;
		}
		if (arg1.anInt2642 < 0) {
			arg1.anInt2642 = 0;
		} else if (arg0 < arg1.anInt2690 + arg1.anInt2642) {
			arg1.anInt2642 = arg0 - arg1.anInt2690;
		}
		if (arg1.anInt2641 < 0) {
			arg1.anInt2641 = 0;
		} else if (arg1.anInt2670 + arg1.anInt2641 > arg2) {
			arg1.anInt2641 = arg2 - arg1.anInt2670;
		}
	}
}
