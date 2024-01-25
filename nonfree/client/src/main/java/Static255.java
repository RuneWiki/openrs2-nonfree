import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static255 {

	@OriginalMember(owner = "client!kn", name = "c", descriptor = "Lclient!gba;")
	public static final Class1_Sub13_Sub2 aClass1_Sub13_Sub2_2 = new Class1_Sub13_Sub2(5000);

	@OriginalMember(owner = "client!kn", name = "d", descriptor = "[I")
	public static final int[] anIntArray355 = new int[2048];

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)V")
	public static void method4302() {
		if (Static85.anInt2201 == -1) {
			return;
		}
		@Pc(11) int local11 = Static42.aClass191_1.method5138();
		@Pc(15) int local15 = Static42.aClass191_1.method5141();
		@Pc(20) Class1_Sub41 local20 = (Class1_Sub41) Static407.aClass38_54.method1419();
		if (local20 != null) {
			local11 = local20.method7870();
			local15 = local20.method7866();
		}
		Static131.method2855(0, Static90.anInt2326, Static290.anInt6867, Static85.anInt2201, 0, local11, 0, 0, local15);
		if (Static88.aClass309_4 != null) {
			Static367.method5673(local15, local11);
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(Lclient!wca;B)Ljava/lang/String;")
	public static String method4303(@OriginalArg(0) Class1_Sub50 arg0) {
		return arg0.aString83 == null || arg0.aString83.length() <= 0 ? arg0.aString82 : arg0.aString82 + Static341.aClass114_124.method3330(Static315.anInt5993) + arg0.aString83;
	}
}
