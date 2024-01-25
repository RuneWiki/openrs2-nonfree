import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!ea", name = "l", descriptor = "I")
	public static int anInt2405;

	@OriginalMember(owner = "client!ea", name = "m", descriptor = "I")
	public static int anInt2406;

	@OriginalMember(owner = "client!ea", name = "o", descriptor = "I")
	public static int anInt2408;

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
	public static int anInt2399 = 0;

	@OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
	public static int anInt2402 = 0;

	@OriginalMember(owner = "client!ea", name = "i", descriptor = "Z")
	public static boolean aBoolean204 = false;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method2171(@OriginalArg(1) String arg0) {
		if (!Static73.aBoolean136) {
			return;
		}
		@Pc(14) boolean local14 = false;
		@Pc(16) int local16 = Static381.anInt7254;
		@Pc(18) int[] local18 = Static496.anIntArray465;
		for (@Pc(20) int local20 = 0; local20 < local16; local20++) {
			@Pc(28) Class30_Sub1_Sub1_Sub1 local28 = Static90.aClass30_Sub1_Sub1_Sub1Array1[local18[local20]];
			if (local28 != null && local28 != Static440.aClass30_Sub1_Sub1_Sub1_2 && local28.aString6 != null && local28.aString6.equalsIgnoreCase(arg0)) {
				Static332.method5312(Static136.aClass77_30);
				Static383.aClass12_Sub8_Sub2_1.method5174(Static155.anInt3381);
				Static383.aClass12_Sub8_Sub2_1.method5167(0);
				Static383.aClass12_Sub8_Sub2_1.method5215(Static148.anInt6865);
				Static383.aClass12_Sub8_Sub2_1.method5197(Static514.anInt1498);
				Static383.aClass12_Sub8_Sub2_1.method5215(local18[local20]);
				Static9.method274(local28.method3591(), local28.anIntArray316[0], -2, local28.anIntArray317[0], 0, true, 0, local28.method3591());
				local14 = true;
				break;
			}
		}
		if (!local14) {
			Static206.method7966(Static283.aClass88_276.method2391(Static345.anInt6495) + arg0);
		}
		if (Static73.aBoolean136) {
			Static227.method4101();
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!bea;B)V")
	public static void method2176(@OriginalArg(0) Class30_Sub1_Sub1_Sub1 arg0) {
		@Pc(11) Class12_Sub22 local11 = (Class12_Sub22) Static451.aClass68_35.method1917((long) arg0.anInt4197);
		if (local11 == null) {
			Static402.method6312(arg0, arg0.anIntArray316[0], 0, null, arg0.aByte99, arg0.anIntArray317[0], null);
		} else {
			local11.method3775();
		}
	}
}
