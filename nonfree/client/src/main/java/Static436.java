import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static436 {

	@OriginalMember(owner = "client!pa", name = "Y", descriptor = "D")
	public static double aDouble15;

	@OriginalMember(owner = "client!pa", name = "ab", descriptor = "I")
	public static int anInt7486 = 0;

	@OriginalMember(owner = "client!pa", name = "O", descriptor = "I")
	public static int anInt7489 = -1;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIII)V")
	public static void method6476(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) int local12 = Static645.anInt10495;
		@Pc(14) int local14 = Static258.anInt4467;
		if (Static40.aBoolean61) {
			local12 += Static169.method2467();
			local14 += Static375.method5510();
		}
		@Pc(35) Class134 local35;
		if (Static108.anInt1751 == 1) {
			local35 = Static673.aClass134Array16[Static618.anInt10171 / 100];
			local35.method9235(local12 - 8, local14 - 8);
			Static82.method9318(local35.method9232() + local14 - 8, local14 + -8, local12 + local35.method9231() - 8, local12 + -8);
		}
		if (Static108.anInt1751 == 2) {
			local35 = Static673.aClass134Array16[Static618.anInt10171 / 100 + 4];
			local35.method9235(local12 - 8, local14 - 8);
			Static82.method9318(local14 + local35.method9232() - 8, local14 + -8, local12 + local35.method9231() - 8, local12 + -8);
		}
		Static265.method3878();
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IB)I")
	public static int method6477(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = (arg0 & 0x55555555) + (arg0 >>> 1 & 0x55555555);
		@Pc(30) int local30 = (local10 >>> 2 & 0xF3333333) + (local10 & 0x33333333);
		@Pc(38) int local38 = local30 + (local30 >>> 4) & 0xF0F0F0F;
		@Pc(44) int local44 = local38 + (local38 >>> 8);
		@Pc(50) int local50 = local44 + (local44 >>> 16);
		return local50 & 0xFF;
	}
}
