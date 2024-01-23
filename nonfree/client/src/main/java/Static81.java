import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!fj", name = "p", descriptor = "Lclient!jh;")
	public static Class1_Sub2_Sub6_Sub1 aClass1_Sub2_Sub6_Sub1_3;

	@OriginalMember(owner = "client!fj", name = "l", descriptor = "J")
	public static long aLong62 = 0L;

	@OriginalMember(owner = "client!fj", name = "m", descriptor = "I")
	public static int anInt1635 = 0;

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(ILclient!fe;)V")
	public static void method1571(@OriginalArg(1) Class23_Sub1 arg0) {
		@Pc(12) int local12;
		for (local12 = 0; local12 < Static228.anIntArray353.length; local12++) {
			Static228.anIntArray353[local12] = 0;
		}
		@Pc(42) int local42;
		for (local12 = 0; local12 < 5000; local12++) {
			local42 = (int) (Math.random() * 128.0D * (double) 256);
			Static228.anIntArray353[local42] = (int) (Math.random() * 284.0D);
		}
		@Pc(68) int local68;
		@Pc(77) int local77;
		for (local12 = 0; local12 < 20; local12++) {
			for (local42 = 1; local42 < 255; local42++) {
				for (local68 = 1; local68 < 127; local68++) {
					local77 = (local42 << 7) + local68;
					Static273.anIntArray437[local77] = (Static228.anIntArray353[local77 + 128] + Static228.anIntArray353[local77 - 1] + Static228.anIntArray353[local77 + 1] + Static228.anIntArray353[local77 + -128]) / 4;
				}
			}
			@Pc(113) int[] local113 = Static228.anIntArray353;
			Static228.anIntArray353 = Static273.anIntArray437;
			Static273.anIntArray437 = local113;
		}
		if (arg0 == null) {
			return;
		}
		local12 = 0;
		for (local42 = 0; local42 < arg0.anInt4469; local42++) {
			for (local68 = 0; local68 < arg0.anInt4473; local68++) {
				if (arg0.aByteArray18[local12++] != 0) {
					local77 = arg0.anInt4470 + local68 + 16;
					@Pc(163) int local163 = local42 + arg0.anInt4472 + 16;
					@Pc(169) int local169 = (local163 << 7) + local77;
					Static228.anIntArray353[local169] = 0;
				}
			}
		}
	}
}
