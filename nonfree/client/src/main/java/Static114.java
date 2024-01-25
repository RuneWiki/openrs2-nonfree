import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!hf", name = "Z", descriptor = "Lclient!dp;")
	public static Class53 aClass53_62;

	@OriginalMember(owner = "client!hf", name = "w", descriptor = "[I")
	public static final int[] anIntArray285 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@OriginalMember(owner = "client!hf", name = "H", descriptor = "I")
	public static int anInt2141 = -1;

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ZI)V")
	public static void method2317(@OriginalArg(0) boolean arg0) {
		@Pc(9) byte[][] local9;
		if (arg0) {
			local9 = Static179.aByteArrayArray11;
		} else {
			local9 = Static83.aByteArrayArray4;
		}
		@Pc(16) int local16 = Static303.aByteArrayArray17.length;
		for (@Pc(22) int local22 = 0; local22 < local16; local22++) {
			@Pc(28) byte[] local28 = local9[local22];
			if (local28 != null) {
				@Pc(40) int local40 = (Static303.anIntArray647[local22] >> 8) * 64 - Static44.anInt881;
				@Pc(51) int local51 = (Static303.anIntArray647[local22] & 0xFF) * 64 - Static300.anInt5672;
				Static24.method359();
				Static261.method4415(Static289.aClass81_7, arg0, local40, local28, local51, Static334.aClass27Array1);
			}
		}
	}

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "(Z)V")
	public static void method2319() {
		Static16.aClass81_1.method2980(Static12.aFloat1 * ((float) Static29.anInt564 * 0.1F + 0.7F));
		Static16.aClass81_1.method2993(Static352.anInt6322, Static68.aFloat72, Static158.aFloat82, (float) Static75.anInt1396, (float) Static192.anInt3642, (float) Static152.anInt2875);
		Static16.aClass81_1.method2959(Static201.aClass19_2);
	}
}
