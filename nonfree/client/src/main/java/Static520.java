import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static520 {

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "Lclient!u;")
	public static Class352 aClass352_8;

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "F")
	public static float aFloat173;

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "[I")
	public static int[] anIntArray564;

	@OriginalMember(owner = "client!rf", name = "e", descriptor = "J")
	public static long aLong275 = 0L;

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Z)V")
	public static void method7511() {
		@Pc(7) int local7 = Static661.anInt10532;
		@Pc(9) int[] local9 = Static591.anIntArray611;
		for (@Pc(11) int local11 = 0; local11 < local7; local11++) {
			@Pc(19) Class60_Sub1_Sub1_Sub3_Sub1 local19 = Static171.aClass60_Sub1_Sub1_Sub3_Sub1Array1[local9[local11]];
			if (local19 != null && local19.anInt4860 > 0) {
				local19.anInt4860--;
				if (local19.anInt4860 == 0) {
					local19.aString50 = null;
				}
			}
		}
		for (@Pc(65) int local65 = 0; local65 < Static201.anInt4069; local65++) {
			@Pc(72) long local72 = (long) Static531.anIntArray580[local65];
			@Pc(78) Class6_Sub11 local78 = (Class6_Sub11) Static419.aClass74_45.method1401(local72);
			if (local78 != null) {
				@Pc(83) Class60_Sub1_Sub1_Sub3_Sub2 local83 = local78.aClass60_Sub1_Sub1_Sub3_Sub2_1;
				if (local83.anInt4860 > 0) {
					local83.anInt4860--;
					if (local83.anInt4860 == 0) {
						local83.aString50 = null;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(BII)V")
	public static void method7512(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class6_Sub2_Sub4 local14 = Static602.method8315((long) arg1, 7);
		local14.method2040();
		local14.anInt2111 = arg0;
	}
}
