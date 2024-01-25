import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!nq", name = "k", descriptor = "I")
	public static int anInt4410;

	@OriginalMember(owner = "client!nq", name = "q", descriptor = "Lclient!rk;")
	public static Class180 aClass180_56;

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "I")
	public static int anInt4403 = 0;

	@OriginalMember(owner = "client!nq", name = "f", descriptor = "I")
	public static int anInt4406 = 16777215;

	@OriginalMember(owner = "client!nq", name = "h", descriptor = "I")
	public static int anInt4408 = -1;

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method3903(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(5) boolean local5 = false;
		for (@Pc(7) int local7 = 0; local7 < Static223.anInt4466; local7++) {
			@Pc(14) Class22_Sub2_Sub1_Sub1 local14 = Static157.aClass22_Sub2_Sub1_Sub1Array1[Static314.anIntArray758[local7]];
			if (local14 != null && local14.aString78 != null && local14.aString78.equalsIgnoreCase(arg1)) {
				if (arg0 == 1) {
					Static29.aClass7_Sub3_Sub2_1.method2799(149);
					Static29.aClass7_Sub3_Sub2_1.method2780(Static314.anIntArray758[local7]);
					Static29.aClass7_Sub3_Sub2_1.method2783(0);
				} else if (arg0 == 4) {
					Static29.aClass7_Sub3_Sub2_1.method2799(237);
					Static29.aClass7_Sub3_Sub2_1.method2775(0);
					Static29.aClass7_Sub3_Sub2_1.method2745(Static314.anIntArray758[local7]);
				} else if (arg0 == 5) {
					Static29.aClass7_Sub3_Sub2_1.method2799(26);
					Static29.aClass7_Sub3_Sub2_1.method2735(0);
					Static29.aClass7_Sub3_Sub2_1.method2788(Static314.anIntArray758[local7]);
				} else if (arg0 == 6) {
					Static29.aClass7_Sub3_Sub2_1.method2799(184);
					Static29.aClass7_Sub3_Sub2_1.method2785(Static314.anIntArray758[local7]);
					Static29.aClass7_Sub3_Sub2_1.method2783(0);
				} else if (arg0 == 7) {
					Static29.aClass7_Sub3_Sub2_1.method2799(177);
					Static29.aClass7_Sub3_Sub2_1.method2783(0);
					Static29.aClass7_Sub3_Sub2_1.method2785(Static314.anIntArray758[local7]);
				}
				local5 = true;
				break;
			}
		}
		if (!local5) {
			Static16.method2749(Static160.aString219 + arg1);
		}
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(B)V")
	public static void method3906() {
		if (Static254.anInt4935 <= 0) {
			Static125.aString190 = "";
			return;
		}
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < Static353.aStringArray27.length; local21++) {
			if (Static353.aStringArray27[local21].startsWith("--> ")) {
				local19++;
				if (local19 == Static254.anInt4935) {
					Static125.aString190 = Static353.aStringArray27[local21].substring(4);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IIZI)V")
	public static void method3907(@OriginalArg(2) boolean arg0) {
		Static103.aBoolean170 = arg0;
		Static172.anInt2667 = 22050;
		Static164.anInt3419 = 2;
	}
}
