import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!mi", name = "i", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!mi", name = "k", descriptor = "I")
	public static int anInt3365;

	@OriginalMember(owner = "client!mi", name = "l", descriptor = "[Lclient!f;")
	public static Class4_Sub12[] aClass4_Sub12Array1;

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "J")
	public static long aLong123 = 0L;

	@OriginalMember(owner = "client!mi", name = "d", descriptor = "S")
	public static short aShort26 = 256;

	@OriginalMember(owner = "client!mi", name = "g", descriptor = "Z")
	public static boolean aBoolean217 = false;

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lclient!cg;Lclient!cg;B)V")
	public static void method2667(@OriginalArg(0) Class22 arg0, @OriginalArg(1) Class22 arg1) {
		Static147.aClass22_49 = arg1;
		Static218.aClass22_74 = arg0;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)I")
	public static int method2668() {
		return 15;
	}

	@OriginalMember(owner = "client!mi", name = "c", descriptor = "(I)[Lclient!gh;")
	public static Class58[] method2672() {
		@Pc(8) Class58[] local8 = new Class58[Static150.anInt2948];
		for (@Pc(15) int local15 = 0; local15 < Static150.anInt2948; local15++) {
			if (Static251.aBoolean330) {
				local8[local15] = new Class58_Sub1(Static31.anInt651, Static161.anInt3300, Static149.anIntArray238[local15], Static278.anIntArray422[local15], Static107.anIntArray188[local15], Static246.anIntArray386[local15], Static99.aByteArrayArray8[local15], Static138.anIntArray228);
			} else {
				local8[local15] = new Class58_Sub2(Static31.anInt651, Static161.anInt3300, Static149.anIntArray238[local15], Static278.anIntArray422[local15], Static107.anIntArray188[local15], Static246.anIntArray386[local15], Static99.aByteArrayArray8[local15], Static138.anIntArray228);
			}
		}
		Static184.method2969();
		return local8;
	}
}
