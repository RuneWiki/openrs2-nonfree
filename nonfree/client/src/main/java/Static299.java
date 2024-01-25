import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static299 {

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "Lclient!qj;")
	public static Class165 aClass165_89;

	@OriginalMember(owner = "client!tj", name = "e", descriptor = "[I")
	public static int[] anIntArray724;

	@OriginalMember(owner = "client!tj", name = "f", descriptor = "Lclient!be;")
	public static Class1_Sub6_Sub1 aClass1_Sub6_Sub1_3;

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "[[I")
	public static final int[][] anIntArrayArray59 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

	@OriginalMember(owner = "client!tj", name = "d", descriptor = "[I")
	public static final int[] anIntArray723 = new int[13];

	@OriginalMember(owner = "client!tj", name = "i", descriptor = "[I")
	public static final int[] anIntArray725 = new int[64];

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILclient!qj;ZLclient!qj;)V")
	public static void method5094(@OriginalArg(1) Class165 arg0, @OriginalArg(3) Class165 arg1) {
		Static327.aClass165_99 = arg0;
		Static340.aBoolean337 = true;
		Static1.aClass165_3 = arg1;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(ZZLclient!qj;III)V")
	public static void method5095(@OriginalArg(2) Class165 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		Static160.anInt3183 = arg2;
		Static158.aBoolean276 = false;
		Static68.anInt1415 = 0;
		Static292.anInt5680 = 10000;
		Static259.anInt5035 = arg1;
		Static3.anInt77 = 1;
		Static77.aClass165_25 = arg0;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILclient!ke;)V")
	public static void method5096(@OriginalArg(1) Class5_Sub3_Sub3_Sub1 arg0) {
		@Pc(15) Class1_Sub36 local15 = (Class1_Sub36) Static130.aClass26_18.method870((long) arg0.anInt4920);
		if (local15 == null) {
			return;
		}
		if (local15.aClass1_Sub6_Sub3_1 != null) {
			Static170.aClass1_Sub6_Sub4_2.method1665(local15.aClass1_Sub6_Sub3_1);
			local15.aClass1_Sub6_Sub3_1 = null;
		}
		local15.method5710();
	}
}
