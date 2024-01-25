import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!cn", name = "R", descriptor = "Lclient!f;")
	public static Class80 aClass80_3;

	@OriginalMember(owner = "client!cn", name = "I", descriptor = "I")
	public static int anInt1147 = -1;

	@OriginalMember(owner = "client!cn", name = "K", descriptor = "I")
	public static int anInt1148 = 0;

	@OriginalMember(owner = "client!cn", name = "L", descriptor = "Lclient!jm;")
	public static final Class131 aClass131_40 = new Class131(57, 1);

	@OriginalMember(owner = "client!cn", name = "M", descriptor = "[B")
	public static final byte[] aByteArray16 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public static void method988(@OriginalArg(1) String arg0) {
		if (!Static138.aBoolean128) {
			return;
		}
		@Pc(14) boolean local14 = false;
		@Pc(16) int local16 = Static187.anInt4913;
		@Pc(18) int[] local18 = Static256.anIntArray370;
		for (@Pc(20) int local20 = 0; local20 < local16; local20++) {
			@Pc(28) Class26_Sub2_Sub2_Sub1 local28 = Static311.aClass26_Sub2_Sub2_Sub1Array1[local18[local20]];
			if (local28 != null && Static196.aClass26_Sub2_Sub2_Sub1_1 != local28 && local28.aString51 != null && local28.aString51.equalsIgnoreCase(arg0)) {
				method989(Static22.aClass131_102);
				Static232.aClass1_Sub1_Sub1_2.method4098(0);
				Static232.aClass1_Sub1_Sub1_2.method4103(Static304.anInt5407);
				Static232.aClass1_Sub1_Sub1_2.method4103(local18[local20]);
				Static232.aClass1_Sub1_Sub1_2.method4101(Static14.anInt338);
				Static232.aClass1_Sub1_Sub1_2.method4132(Static107.anInt1974);
				Static52.method875(local28.anIntArray590[0], local28.method5535(), local28.method5535(), true, 0, 0, -2, local28.anIntArray589[0]);
				local14 = true;
				break;
			}
		}
		if (!local14) {
			Static443.method5893(Static91.aClass84_23.method1678(Static167.anInt3118) + arg0);
		}
		if (Static138.aBoolean128) {
			Static82.method1412();
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(BLclient!jm;)V")
	public static void method989(@OriginalArg(1) Class131 arg0) {
		Static232.aClass1_Sub1_Sub1_2.method149(arg0.method3011());
	}
}
