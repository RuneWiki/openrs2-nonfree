import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static363 {

	@OriginalMember(owner = "client!sg", name = "M", descriptor = "[I")
	public static final int[] anIntArray373 = new int[2048];

	@OriginalMember(owner = "client!sg", name = "T", descriptor = "Lclient!ki;")
	public static final Class137 aClass137_230 = new Class137(44, -1);

	@OriginalMember(owner = "client!sg", name = "U", descriptor = "Lclient!ki;")
	public static final Class137 aClass137_231 = new Class137(28, 2);

	@OriginalMember(owner = "client!sg", name = "V", descriptor = "I")
	public static final int anInt6140 = 1337;

	@OriginalMember(owner = "client!sg", name = "e", descriptor = "(I)V")
	public static void method4721() {
		Static31.anInt624 = 0;
		for (@Pc(13) int local13 = 0; local13 < 2048; local13++) {
			Static72.aClass1_Sub11Array1[local13] = null;
			Static225.aByteArray38[local13] = 1;
			Static230.aClass112Array2[local13] = null;
		}
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(ZI)V")
	public static void method4723(@OriginalArg(0) boolean arg0) {
		for (@Pc(12) Class1_Sub42 local12 = (Class1_Sub42) Static335.aClass254_40.method5437(); local12 != null; local12 = (Class1_Sub42) Static335.aClass254_40.method5433()) {
			if (local12.aClass1_Sub9_Sub1_3 != null) {
				Static155.aClass1_Sub9_Sub2_1.method1038(local12.aClass1_Sub9_Sub1_3);
				local12.aClass1_Sub9_Sub1_3 = null;
			}
			if (local12.aClass1_Sub9_Sub1_4 != null) {
				Static155.aClass1_Sub9_Sub2_1.method1038(local12.aClass1_Sub9_Sub1_4);
				local12.aClass1_Sub9_Sub1_4 = null;
			}
			local12.method5617();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(53) Class1_Sub42 local53 = (Class1_Sub42) Static24.aClass254_3.method5437(); local53 != null; local53 = (Class1_Sub42) Static24.aClass254_3.method5433()) {
			if (local53.aClass1_Sub9_Sub1_3 != null) {
				Static155.aClass1_Sub9_Sub2_1.method1038(local53.aClass1_Sub9_Sub1_3);
				local53.aClass1_Sub9_Sub1_3 = null;
			}
			local53.method5617();
		}
		for (@Pc(82) Class1_Sub42 local82 = (Class1_Sub42) Static374.aClass257_29.method5506(); local82 != null; local82 = (Class1_Sub42) Static374.aClass257_29.method5501()) {
			if (local82.aClass1_Sub9_Sub1_3 != null) {
				Static155.aClass1_Sub9_Sub2_1.method1038(local82.aClass1_Sub9_Sub1_3);
				local82.aClass1_Sub9_Sub1_3 = null;
			}
			local82.method5617();
		}
	}
}
