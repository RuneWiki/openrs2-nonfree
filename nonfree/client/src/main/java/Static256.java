import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILclient!wm;)V", line = 35)
	public static void method4726(@OriginalArg(1) Class19 arg0) {
		arg0.method2897(0, 0, Static231.anInt4656, 350);
		arg0.method2903(0, 0, Static231.anInt4656, 350, InputStream_Sub1.anInt3789 << 24 | 0x332277, 1);
		@Pc(37) int local37;
		@Pc(43) int local43;
		for (@Pc(29) int local29 = 0; local29 < 100; local29++) {
			local37 = Static114.anIntArray157[local29] >> 4;
			local43 = Static114.anIntArray156[local29] >> 4;
			@Pc(60) int local60 = local37 + (Class19.anIntArray178[(local43 + (local37 & 0x40)) * 64 & 0x3FFF] >> 10);
			arg0.method2903(local60, local43, 2, 2, Static328.anIntArray450[local29] << 24 | 0xFFFFFF, 1);
		}
		local37 = 350 / Static74.anInt6297;
		if (Class2_Sub3_Sub36.anInt6904 > 0) {
			local43 = 342 - Static74.anInt6297;
			@Pc(98) int local98 = local43 * local37 / (Class2_Sub3_Sub36.anInt6904 + local37 - 1);
			@Pc(100) int local100 = 4;
			if (Class2_Sub3_Sub36.anInt6904 > 1) {
				local100 = (local43 - local98) * (-Class123_Sub1.anInt3381 + -1 + Class2_Sub3_Sub36.anInt6904) / (Class2_Sub3_Sub36.anInt6904 - 1) + 4;
			}
			arg0.method2903(Static231.anInt4656 - 16, local100, 12, local98, InputStream_Sub1.anInt3789 << 24 | 0x332277, 2);
			for (@Pc(137) int local137 = Class123_Sub1.anInt3381; Class123_Sub1.anInt3381 + local37 > local137 && Class2_Sub3_Sub36.anInt6904 > local137; local137++) {
				@Pc(148) String[] local148 = Static187.method3644('\b', Static117.aStringArray65[local137]);
				@Pc(157) int local157 = (Static231.anInt4656 - 8 - 16) / local148.length;
				for (@Pc(159) int local159 = 0; local159 < local148.length; local159++) {
					@Pc(168) int local168 = local159 * local157 + 8;
					arg0.method2897(local168, 0, local168 + local157 - 8, 350);
					Static253.aClass130_4.method5898(local168, -16777216, 350 - Static155.aClass239_3.anInt6833 - Static261.anInt5347 - Static74.anInt6297 * (local137 - Class123_Sub1.anInt3381) - 2, -1, local148[local159]);
				}
			}
		}
		arg0.method2897(0, 0, Static231.anInt4656, 350);
		arg0.method2892(0, Static231.anInt4656, 350 - Static261.anInt5347, -1);
		Static49.aClass130_1.method5898(10, -16777216, 350 - Static106.aClass239_2.anInt6833 - 1, -1, "--> " + Class22.aString9);
		local43 = -1;
		if (Class83.anInt2345 % 30 > 15) {
			local43 = 16777215;
		}
		arg0.method2812(local43, Static106.aClass239_2.method6127("--> " + Class22.aString9.substring(0, Class2_Sub3_Sub10_Sub1.anInt6670)) + 10, -Static106.aClass239_2.anInt6833 + -11 + 350, 12);
	}
}
