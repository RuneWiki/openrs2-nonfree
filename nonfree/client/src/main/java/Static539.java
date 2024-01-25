import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static539 {

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray17;

	@OriginalMember(owner = "client!sfa", name = "d", descriptor = "I")
	public static int anInt9255;

	@OriginalMember(owner = "client!sfa", name = "e", descriptor = "I")
	public static int anInt9256;

	@OriginalMember(owner = "client!sfa", name = "b", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_162 = new Class44(5, -1);

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(IILclient!vn;)V")
	public static void method7650(@OriginalArg(1) int arg0, @OriginalArg(2) Class12_Sub2_Sub2_Sub1 arg1) {
		@Pc(12) int local12 = -1;
		@Pc(14) int local14 = 0;
		if (Static87.anInt1951 < arg1.anInt2938) {
			Static447.method8524(arg1);
		} else if (arg1.anInt2959 >= Static87.anInt1951) {
			Static154.method2472(arg1);
		} else {
			Static608.method8558(arg1, false);
			local14 = Static359.anInt6636;
			local12 = Static651.anInt10884;
		}
		@Pc(127) int local127;
		if (arg1.anInt10998 < 512 || arg1.anInt11002 < 512 || (Static26.anInt462 - 1) * 512 <= arg1.anInt10998 || arg1.anInt11002 >= Static445.anInt6140 * 512 - 512) {
			arg1.anInt2921 = -1;
			arg1.anInt2938 = 0;
			arg1.anIntArray234 = null;
			local14 = 0;
			local12 = -1;
			arg1.anInt2959 = 0;
			arg1.anInt10998 = arg1.anIntArray241[0] * 512 + arg1.method2422() * 256;
			arg1.anInt11002 = arg1.anIntArray242[0] * 512 + arg1.method2422() * 256;
			arg1.method2425();
			for (local127 = 0; local127 < arg1.aClass84Array3.length; local127++) {
				arg1.aClass84Array3[local127].anInt2468 = -1;
			}
		}
		if (Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2 == arg1 && (arg1.anInt10998 < 6144 || arg1.anInt11002 < 6144 || arg1.anInt10998 >= (Static26.anInt462 - 12) * 512 || (Static445.anInt6140 - 12) * 512 <= arg1.anInt11002)) {
			arg1.anInt2938 = 0;
			arg1.anInt2959 = 0;
			local12 = -1;
			arg1.anIntArray234 = null;
			local14 = 0;
			arg1.anInt2921 = -1;
			arg1.anInt10998 = arg1.anIntArray241[0] * 512 + arg1.method2422() * 256;
			arg1.anInt11002 = arg1.anIntArray242[0] * 512 + arg1.method2422() * 256;
			arg1.method2425();
			for (local127 = 0; local127 < arg1.aClass84Array3.length; local127++) {
				arg1.aClass84Array3[local127].anInt2468 = -1;
			}
		}
		local127 = Static519.method7488(arg1);
		Static530.method7613(arg1);
		Static411.method6079(local14, local12, arg1, local127);
		Static420.method6224(local12, arg1);
		Static416.method6205(arg1);
	}
}
