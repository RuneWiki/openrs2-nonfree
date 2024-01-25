import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static260 {

	@OriginalMember(owner = "client!ku", name = "O", descriptor = "Lclient!dn;")
	public static Class69 aClass69_53;

	@OriginalMember(owner = "client!ku", name = "R", descriptor = "Lclient!oh;")
	public static Class214 aClass214_3;

	@OriginalMember(owner = "client!ku", name = "N", descriptor = "[I")
	public static final int[] anIntArray417 = new int[1];

	@OriginalMember(owner = "client!ku", name = "V", descriptor = "I")
	public static int anInt5066 = 0;

	@OriginalMember(owner = "client!ku", name = "X", descriptor = "Ljava/lang/String;")
	public static String aString112 = "";

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method4696(@OriginalArg(0) String arg0) {
		if (!Static181.aBoolean310) {
			return;
		}
		@Pc(10) boolean local10 = false;
		@Pc(12) int local12 = Static207.anInt4085;
		@Pc(14) int[] local14 = Static209.anIntArray327;
		for (@Pc(16) int local16 = 0; local16 < local12; local16++) {
			@Pc(24) Class20_Sub1_Sub1_Sub1 local24 = Static511.aClass20_Sub1_Sub1_Sub1Array1[local14[local16]];
			if (local24 != null && Static107.aClass20_Sub1_Sub1_Sub1_1 != local24 && local24.aString13 != null && local24.aString13.equalsIgnoreCase(arg0)) {
				Static216.method3997(Static405.aClass252_106);
				Static259.aClass1_Sub17_Sub2_1.method4469(Static49.anInt1304);
				Static259.aClass1_Sub17_Sub2_1.method4459(local14[local16]);
				Static259.aClass1_Sub17_Sub2_1.method4474(0);
				Static259.aClass1_Sub17_Sub2_1.method4459(Static119.anInt2478);
				Static259.aClass1_Sub17_Sub2_1.method4506(Static189.anInt3926);
				local10 = true;
				Static355.method5833(0, 0, local24.method7808(), local24.anIntArray780[0], local24.anIntArray781[0], local24.method7808(), -2, true);
				break;
			}
		}
		if (!local10) {
			Static484.method7507(Static155.aClass45_53.method1474(Static544.anInt7853) + arg0);
		}
		if (Static181.aBoolean310) {
			Static417.method6564();
		}
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(B[J[I)V")
	public static void method4697(@OriginalArg(1) long[] arg0, @OriginalArg(2) int[] arg1) {
		Static244.method4322(arg1, arg0.length - 1, 0, arg0);
	}
}
