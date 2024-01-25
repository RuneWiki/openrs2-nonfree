import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static596 {

	@OriginalMember(owner = "client!wt", name = "c", descriptor = "Lclient!qj;")
	public static Class272 aClass272_6;

	@OriginalMember(owner = "client!wt", name = "f", descriptor = "I")
	public static int anInt9622;

	@OriginalMember(owner = "client!wt", name = "b", descriptor = "[I")
	public static final int[] anIntArray722 = new int[1];

	@OriginalMember(owner = "client!wt", name = "e", descriptor = "Lclient!cga;")
	public static final Class47 aClass47_155 = new Class47(76, 0);

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(IBLclient!ji;)V")
	public static void method7846(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub21 arg1) {
		if (Static306.aClass257_3 == null) {
			return;
		}
		try {
			Static306.aClass257_3.method5941(0L);
			Static306.aClass257_3.method5939(arg1.aByteArray93, 24, arg0);
		} catch (@Pc(23) Exception local23) {
		}
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method7848(@OriginalArg(1) String arg0) {
		if (!Static199.aBoolean458) {
			return;
		}
		@Pc(10) boolean local10 = false;
		@Pc(12) int local12 = Static231.anInt4727;
		@Pc(14) int[] local14 = Static249.anIntArray372;
		for (@Pc(16) int local16 = 0; local16 < local12; local16++) {
			@Pc(24) Class4_Sub1_Sub1_Sub2 local24 = Static588.aClass4_Sub1_Sub1_Sub2Array3[local14[local16]];
			if (local24 != null && local24 != Static328.aClass4_Sub1_Sub1_Sub2_2 && local24.aString63 != null && local24.aString63.equalsIgnoreCase(arg0)) {
				@Pc(46) Class6_Sub31 local46 = Static114.method2007(Static256.aClass47_79, Static337.aClass324_1);
				local46.aClass6_Sub21_Sub2_2.method6052(Static188.anInt3896);
				local46.aClass6_Sub21_Sub2_2.method6045(Static593.anInt9601);
				local46.aClass6_Sub21_Sub2_2.method6025(0);
				local46.aClass6_Sub21_Sub2_2.method6023(local14[local16]);
				local46.aClass6_Sub21_Sub2_2.method6039(Static115.anInt2199);
				Static534.method7251(local46);
				local10 = true;
				Static32.method910(-2, true, local24.method5892(), local24.anIntArray521[0], 0, 0, local24.method5892(), local24.anIntArray522[0]);
				break;
			}
		}
		if (!local10) {
			Static273.method4517(Static230.aClass156_20.method4065(Static25.anInt769) + arg0);
		}
		if (Static199.aBoolean458) {
			Static489.method6689();
		}
	}
}
