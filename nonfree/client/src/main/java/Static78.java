import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!em", name = "b", descriptor = "[[B")
	public static byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!em", name = "c", descriptor = "[[I")
	public static int[][] anIntArrayArray16;

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(ZIZ)V", line = 6)
	public static void method1904(@OriginalArg(0) boolean arg0) {
		Class119_Sub1.anInt3334--;
		if (Class119_Sub1.anInt3334 == 0) {
			Static169.anIntArray204 = null;
		}
		if (!arg0) {
			return;
		}
		Class11_Sub2.anInt3705--;
		if (Class11_Sub2.anInt3705 == 0) {
			Static55.anIntArray107 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IZ)V", line = 53)
	public static void method1906() {
		Static85.method1962(Class131.aClass145_145);
		for (@Pc(21) Class2_Sub7 local21 = (Class2_Sub7) Class2_Sub3_Sub34.aClass4_130.method80(); local21 != null; local21 = (Class2_Sub7) Class2_Sub3_Sub34.aClass4_130.method79()) {
			if (!local21.method6463()) {
				local21 = (Class2_Sub7) Class2_Sub3_Sub34.aClass4_130.method80();
				if (local21 == null) {
					break;
				}
			}
			if (local21.anInt1371 == 0) {
				Static253.method4656(true, local21, true);
			}
		}
		if (Class133.aClass161_8 != null) {
			Static187.method3646(Class133.aClass161_8);
			Class133.aClass161_8 = null;
		}
	}
}
