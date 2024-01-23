import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!da", name = "Q", descriptor = "[I")
	public static int[] anIntArray59;

	@OriginalMember(owner = "client!da", name = "Y", descriptor = "Lclient!pe;")
	public static Class135 aClass135_3;

	@OriginalMember(owner = "client!da", name = "Z", descriptor = "Lclient!kj;")
	public static Class2_Sub3_Sub12 aClass2_Sub3_Sub12_2;

	@OriginalMember(owner = "client!da", name = "R", descriptor = "[I")
	public static int[] anIntArray60 = new int[2];

	@OriginalMember(owner = "client!da", name = "S", descriptor = "[Lclient!l;")
	public static Class2_Sub3_Sub13[] aClass2_Sub3_Sub13Array2 = new Class2_Sub3_Sub13[14];

	@OriginalMember(owner = "client!da", name = "T", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray1 = new boolean[][] { { true, true, true }, { false, false }, { false, true }, { true, false }, { false, true, true }, { true, false, true }, { false, true, false }, { true, false, false } };

	@OriginalMember(owner = "client!da", name = "ab", descriptor = "I")
	public static int anInt977 = 128;

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IZI)V")
	public static void method770(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class1 local15 = Static208.aClass1ArrayArrayArray1[Static208.anInt4335][arg1][arg0];
		if (local15 == null) {
			Static163.method2824(Static208.anInt4335, arg1, arg0);
			return;
		}
		@Pc(31) int local31 = -99999999;
		@Pc(33) Class2_Sub3_Sub11 local33 = null;
		@Pc(38) Class2_Sub3_Sub11 local38;
		for (local38 = (Class2_Sub3_Sub11) local15.method13(); local38 != null; local38 = (Class2_Sub3_Sub11) local15.method9()) {
			@Pc(47) Class155 local47 = Static152.method2616(local38.aClass36_Sub7_1.anInt6145);
			@Pc(50) int local50 = local47.anInt4865;
			if (local47.anInt4820 == 1) {
				local50 *= local38.aClass36_Sub7_1.anInt6153 + 1;
			}
			if (local50 > local31) {
				local33 = local38;
				local31 = local50;
			}
		}
		if (local33 == null) {
			Static163.method2824(Static208.anInt4335, arg1, arg0);
			return;
		}
		@Pc(91) Class36_Sub7 local91 = null;
		local15.method8(local33);
		local38 = (Class2_Sub3_Sub11) local15.method13();
		@Pc(102) Class36_Sub7 local102 = null;
		while (local38 != null) {
			@Pc(108) Class36_Sub7 local108 = local38.aClass36_Sub7_1;
			if (local33.aClass36_Sub7_1.anInt6145 != local108.anInt6145) {
				if (local91 == null) {
					local91 = local108;
				}
				if (local108.anInt6145 != local91.anInt6145 && local102 == null) {
					local102 = local108;
				}
			}
			local38 = (Class2_Sub3_Sub11) local15.method9();
		}
		@Pc(150) long local150 = (long) (arg1 + (arg0 << 7) + 1610612736);
		Static190.method3489(Static208.anInt4335, arg1, arg0, Static99.method1894(Static208.anInt4335, arg0 * 128 + 64, arg1 * 128 + 64), local33.aClass36_Sub7_1, local150, local91, local102);
	}
}
