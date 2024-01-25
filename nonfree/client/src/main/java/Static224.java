import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!hw", name = "b", descriptor = "I")
	public static int anInt4539 = 0;

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(BLclient!mfa;)V")
	public static void method3861(@OriginalArg(1) Class3_Sub9_Sub2 arg0) {
		for (@Pc(11) int local11 = 0; local11 < Static458.anInt7786; local11++) {
			@Pc(17) int local17 = Static27.anIntArray33[local11];
			@Pc(21) Class9_Sub2_Sub1_Sub2_Sub1 local21 = Static507.aClass9_Sub2_Sub1_Sub2_Sub1Array1[local17];
			@Pc(25) int local25 = arg0.method5633();
			if ((local25 & 0x8) != 0) {
				local25 += arg0.method5633() << 8;
			}
			if ((local25 & 0x1000) != 0) {
				local25 += arg0.method5633() << 16;
			}
			Static625.method8480(local25, local17, local21, arg0);
		}
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(IIILclient!ida;)V")
	public static void method3862(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub7_Sub13 arg2) {
		if (!Static253.aBoolean362) {
			return;
		}
		@Pc(10) int local10 = 0;
		@Pc(22) int local22;
		for (@Pc(16) Class3_Sub7_Sub19 local16 = (Class3_Sub7_Sub19) arg2.aClass363_21.method8414(); local16 != null; local16 = (Class3_Sub7_Sub19) arg2.aClass363_21.method8415()) {
			local22 = Static609.method8344(local16);
			if (local10 < local22) {
				local10 = local22;
			}
		}
		local10 += 8;
		local22 = arg2.anInt4660 * 16 + 21;
		Static231.anInt4645 = arg2.anInt4660 * 16 + (Static53.aBoolean52 ? 26 : 22);
		@Pc(60) int local60 = Static491.anInt8355 + Static415.anInt7312;
		if (local60 + local10 > Static330.anInt6254) {
			local60 = Static491.anInt8355 - local10;
		}
		if (local60 < 0) {
			local60 = 0;
		}
		@Pc(87) int local87 = Static53.aBoolean52 ? 33 : 31;
		@Pc(93) int local93 = arg1 + 13 - local87;
		if (Static190.anInt3576 < local22 + local93) {
			local93 = Static190.anInt3576 - local22;
		}
		Static641.anInt10142 = local60;
		if (local93 < 0) {
			local93 = 0;
		}
		Static97.anInt1966 = local93;
		Static386.anInt8229 = local10;
		Static254.aClass3_Sub7_Sub13_2 = arg2;
	}
}
