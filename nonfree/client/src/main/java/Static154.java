import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!fda", name = "b", descriptor = "[Lclient!je;")
	public static Class12_Sub2[] aClass12_Sub2Array1;

	@OriginalMember(owner = "client!fda", name = "c", descriptor = "[S")
	private static final short[] aShortArray44 = new short[] { -10304, 9104, 25485, 4620, 4540 };

	@OriginalMember(owner = "client!fda", name = "d", descriptor = "[S")
	private static final short[] aShortArray45 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!fda", name = "f", descriptor = "[S")
	private static final short[] aShortArray46 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!fda", name = "e", descriptor = "[[S")
	public static final short[][] aShortArrayArray6 = new short[][] { aShortArray46, aShortArray44, aShortArray45 };

	@OriginalMember(owner = "client!fda", name = "i", descriptor = "Z")
	public static boolean aBoolean234 = false;

	@OriginalMember(owner = "client!fda", name = "j", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_61 = new Class44(79, -1);

	@OriginalMember(owner = "client!fda", name = "l", descriptor = "Lclient!pha;")
	public static final Class276 aClass276_6 = new Class276("", 13);

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(ZLclient!vn;)V")
	public static void method2472(@OriginalArg(1) Class12_Sub2_Sub2_Sub1 arg0) {
		@Pc(5) boolean local5 = false;
		if (Static87.anInt1951 == arg0.anInt2959 || arg0.anInt2921 == -1 || arg0.anInt2900 != 0) {
			local5 = true;
		} else {
			@Pc(29) Class275 local29 = Static501.aClass191_2.method4322(arg0.anInt2921);
			if (local29.aBoolean543 || local29.anIntArray599[arg0.anInt2902] < arg0.anInt2898 + 1) {
				local5 = true;
			}
		}
		if (local5) {
			@Pc(56) int local56 = arg0.anInt2959 - arg0.anInt2938;
			@Pc(62) int local62 = Static87.anInt1951 - arg0.anInt2938;
			@Pc(74) int local74 = arg0.anInt2905 * 512 + arg0.method2422() * 256;
			@Pc(85) int local85 = arg0.anInt2909 * 512 + arg0.method2422() * 256;
			@Pc(97) int local97 = arg0.anInt2957 * 512 + arg0.method2422() * 256;
			@Pc(108) int local108 = arg0.anInt2919 * 512 + arg0.method2422() * 256;
			arg0.anInt10998 = (local62 * local97 + (local56 - local62) * local74) / local56;
			arg0.anInt11002 = (local62 * local108 + local85 * (local56 - local62)) / local56;
		}
		arg0.anInt2967 = 0;
		if (arg0.anInt2912 == 0) {
			arg0.method2423(false, 8192);
		}
		if (arg0.anInt2912 == 1) {
			arg0.method2423(false, 12288);
		}
		if (arg0.anInt2912 == 2) {
			arg0.method2423(false, 0);
		}
		if (arg0.anInt2912 == 3) {
			arg0.method2423(false, 4096);
		}
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(BZ)Z")
	public static boolean method2473(@OriginalArg(1) boolean arg0) {
		@Pc(6) boolean local6 = Static677.aClass137_47.method7880();
		if (arg0 == local6) {
			return true;
		}
		if (!arg0) {
			Static677.aClass137_47.method7878();
		} else if (!Static677.aClass137_47.method7867()) {
			arg0 = false;
		}
		if (local6 == arg0) {
			return false;
		} else {
			Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub29_1, arg0 ? 1 : 0);
			Static169.method2762();
			return true;
		}
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(IIIBLclient!ha;III)V")
	public static void method2474(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) Class137 arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		arg2.method7869(arg0, arg3, -10660793, arg4, arg1);
		arg2.method7869(arg0 + 1, arg3 + -2, -16777216, arg4 + 1, 16);
		arg2.method7941(arg1 - 19, arg0 + 1, -16777216, arg4 + 18, arg3 + -2);
	}
}
