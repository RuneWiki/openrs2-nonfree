import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static280 {

	@OriginalMember(owner = "client!nt", name = "X", descriptor = "I")
	public static int anInt4920;

	@OriginalMember(owner = "client!nt", name = "J", descriptor = "Lclient!ju;")
	public static final Class136 aClass136_7 = new Class136();

	@OriginalMember(owner = "client!nt", name = "d", descriptor = "(II)V")
	public static void method3965(@OriginalArg(1) int arg0) {
		Static4.anInt5772 = 1000 / arg0;
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "([[BLclient!h;I)V")
	public static void method3968(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) Class101_Sub1 arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(21) int local21 = arg0.length;
		@Pc(42) int local42;
		for (@Pc(23) int local23 = 0; local23 < local21; local23++) {
			@Pc(29) byte[] local29 = arg0[local23];
			if (local29 != null) {
				@Pc(36) Class10_Sub8 local36 = new Class10_Sub8(local29);
				local42 = Static144.anIntArray288[local23] >> 8;
				@Pc(48) int local48 = Static144.anIntArray288[local23] & 0xFF;
				@Pc(55) int local55 = local42 * 64 - Static168.anInt3353;
				@Pc(61) int local61 = local48 * 64 - Static72.anInt1488;
				Static278.method4705();
				arg1.method2428(Static11.aClass220Array1, local36, Static72.anInt1488, Static168.anInt3353, local61, local55);
				arg1.method2441(local55, local12, local61, Static412.aClass50_8, local36);
				if (!arg1.aBoolean213 && Static444.anInt7445 / 8 == local42 && local48 == Static253.anInt4561 / 8 && local12[0] != -1) {
					Static378.aClass230_1 = Static88.aClass47_2.method1078(local12[0], local12[2], local12[3], Static314.aClass158_1, local12[1]);
					Static352.anInt6038 = local12[4];
				}
			}
		}
		for (@Pc(132) int local132 = 0; local132 < local21; local132++) {
			@Pc(145) int local145 = (Static144.anIntArray288[local132] >> 8) * 64 - Static168.anInt3353;
			local42 = (Static144.anIntArray288[local132] & 0xFF) * 64 - Static72.anInt1488;
			@Pc(160) byte[] local160 = arg0[local132];
			if (local160 == null && Static253.anInt4561 < 800) {
				Static278.method4705();
				arg1.method2431(local145, local42);
			}
		}
	}

	@OriginalMember(owner = "client!nt", name = "b", descriptor = "(ZI)Lclient!lb;")
	public static Class151 method3969(@OriginalArg(1) int arg0) {
		@Pc(15) Class151[] local15 = Static50.method854();
		for (@Pc(17) int local17 = 0; local17 < local15.length; local17++) {
			@Pc(23) Class151 local23 = local15[local17];
			if (arg0 == local23.anInt4213) {
				return local23;
			}
		}
		return null;
	}
}
