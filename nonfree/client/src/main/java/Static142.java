import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!gv", name = "k", descriptor = "F")
	public static float aFloat27;

	@OriginalMember(owner = "client!gv", name = "l", descriptor = "[[B")
	public static byte[][] aByteArrayArray19;

	@OriginalMember(owner = "client!gv", name = "g", descriptor = "I")
	public static int anInt2523 = -1;

	@OriginalMember(owner = "client!gv", name = "h", descriptor = "Z")
	public static boolean aBoolean166 = true;

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(I)V")
	public static void method2087() {
		if (Static356.aClass38_1 != null) {
			Static356.aClass38_1.method1484();
		}
		if (Static385.aClass38_2 != null) {
			Static385.aClass38_2.method1484();
		}
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(ILclient!pf;)V")
	public static void method2090(@OriginalArg(1) Class3_Sub4_Sub1_Sub2 arg0) {
		@Pc(17) Class2_Sub35 local17 = (Class2_Sub35) Static427.aClass72_47.method1659((long) arg0.anInt4915);
		if (local17 == null) {
			return;
		}
		if (local17.aClass2_Sub1_Sub3_3 != null) {
			Static421.aClass2_Sub1_Sub4_2.method3237(local17.aClass2_Sub1_Sub3_3);
			local17.aClass2_Sub1_Sub3_3 = null;
		}
		local17.method5703();
	}
}
