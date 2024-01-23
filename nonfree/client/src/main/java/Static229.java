import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!ri", name = "d", descriptor = "[[[Lclient!hi;")
	public static Class61[][][] aClass61ArrayArrayArray1;

	@OriginalMember(owner = "client!ri", name = "h", descriptor = "I")
	public static int anInt4527;

	@OriginalMember(owner = "client!ri", name = "l", descriptor = "I")
	public static int anInt4530;

	@OriginalMember(owner = "client!ri", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString268 = "red:";

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(I)V")
	public static void method3572() {
		Static170.aFont1 = null;
		Static130.aFontMetrics1 = null;
		Static186.anImage3 = null;
	}

	@OriginalMember(owner = "client!ri", name = "d", descriptor = "(I)Lclient!pn;")
	public static Class1_Sub2_Sub11 method3574() {
		@Pc(11) byte[] local11 = Static268.aByteArrayArray13[0];
		@Pc(19) int local19 = Static44.anIntArray97[0] * Static31.anIntArray78[0];
		@Pc(26) int[] local26 = new int[local19];
		for (@Pc(28) int local28 = 0; local28 < local19; local28++) {
			local26[local28] = Static133.anIntArray266[local11[local28] & 0xFF];
		}
		@Pc(69) Class1_Sub2_Sub11 local69;
		if (Static277.aBoolean412) {
			local69 = new Class1_Sub2_Sub11_Sub1(Static60.anInt1268, Static267.anInt5199, Static268.anIntArray461[0], Static289.anIntArray543[0], Static31.anIntArray78[0], Static44.anIntArray97[0], local26);
		} else {
			local69 = new Class1_Sub2_Sub11_Sub2(Static60.anInt1268, Static267.anInt5199, Static268.anIntArray461[0], Static289.anIntArray543[0], Static31.anIntArray78[0], Static44.anIntArray97[0], local26);
		}
		Static91.method1595();
		return local69;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(BZLclient!rk;)V")
	public static void method3575(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class1_Sub2_Sub1 arg1) {
		@Pc(6) int local6;
		if (Static277.aBoolean412 || arg0) {
			local6 = Static148.anInt3206;
			@Pc(12) int local12 = local6 * 956 / 503;
			Static59.aClass1_Sub2_Sub11_16.method3778((Static3.anInt122 - local12) / 2, 0, local12, local6);
			Static101.aClass12_1.method3927(Static3.anInt122 / 2 - Static101.aClass12_1.anInt5018 / 2, 18);
		}
		arg1.method456(Static47.aString65, Static3.anInt122 / 2, Static148.anInt3206 / 2 - 26, 16777215, -1);
		local6 = Static148.anInt3206 / 2 - 18;
		if (Static277.aBoolean412) {
			Static41.method844(Static3.anInt122 / 2 - 152, local6, 304, 34, 9179409);
			Static41.method844(Static3.anInt122 / 2 - 151, local6 - -1, 302, 32, 0);
			Static41.method832(Static3.anInt122 / 2 - 150, local6 + 2, Static104.anInt2456 * 3, 30, 9179409);
			Static41.method832(Static104.anInt2456 * 3 + Static3.anInt122 / 2 - 150, local6 + 2, 300 - Static104.anInt2456 * 3, 30, 0);
		} else {
			Static50.method946(Static3.anInt122 / 2 - 152, local6, 304, 34, 9179409);
			Static50.method946(Static3.anInt122 / 2 - 151, local6 + 1, 302, 32, 0);
			Static50.method954(Static3.anInt122 / 2 - 150, local6 + 2, Static104.anInt2456 * 3, 30, 9179409);
			Static50.method954(Static104.anInt2456 * 3 + Static3.anInt122 / 2 - 150, local6 - -2, 300 - Static104.anInt2456 * 3, 30, 0);
		}
		arg1.method456(Static125.aString164, Static3.anInt122 / 2, Static148.anInt3206 / 2 + 4, 16777215, -1);
	}
}
