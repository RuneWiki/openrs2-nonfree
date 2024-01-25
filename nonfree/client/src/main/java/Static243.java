import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!hw", name = "n", descriptor = "[Lclient!vo;")
	public static Class375[] aClass375Array1;

	@OriginalMember(owner = "client!hw", name = "z", descriptor = "I")
	public static final int anInt4490 = 1403;

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(IZILjava/lang/String;Ljava/lang/String;)V")
	public static void method3794(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) String arg2, @OriginalArg(4) String arg3) {
		@Pc(6) Class5_Sub21 local6 = Static63.method894();
		local6.aClass5_Sub41_Sub2_1.method7798(Static146.aClass111_7.anInt3148);
		local6.aClass5_Sub41_Sub2_1.method7848(0);
		@Pc(21) int local21 = local6.aClass5_Sub41_Sub2_1.anInt9230;
		local6.aClass5_Sub41_Sub2_1.method7848(647);
		@Pc(32) int[] local32 = Static249.method3856(local6);
		@Pc(36) int local36 = local6.aClass5_Sub41_Sub2_1.anInt9230;
		local6.aClass5_Sub41_Sub2_1.method7854(arg2);
		local6.aClass5_Sub41_Sub2_1.method7848(Static254.anInt4619);
		local6.aClass5_Sub41_Sub2_1.method7854(arg3);
		local6.aClass5_Sub41_Sub2_1.method7824(Static571.aLong266);
		local6.aClass5_Sub41_Sub2_1.method7798(Static544.anInt8937);
		local6.aClass5_Sub41_Sub2_1.method7798(Static218.aClass98_2.anInt2677);
		Static663.method8838(local6.aClass5_Sub41_Sub2_1);
		@Pc(77) String local77 = Static60.aString73;
		local6.aClass5_Sub41_Sub2_1.method7798(local77 == null ? 0 : 1);
		if (local77 != null) {
			local6.aClass5_Sub41_Sub2_1.method7854(local77);
		}
		local6.aClass5_Sub41_Sub2_1.method7798(arg0);
		local6.aClass5_Sub41_Sub2_1.method7798(arg1 ? 1 : 0);
		local6.aClass5_Sub41_Sub2_1.anInt9230 += 7;
		local6.aClass5_Sub41_Sub2_1.method7844(local36, local32, local6.aClass5_Sub41_Sub2_1.anInt9230);
		local6.aClass5_Sub41_Sub2_1.method7841(local6.aClass5_Sub41_Sub2_1.anInt9230 - local21);
		Static495.method7092(local6);
		Static345.anInt6331 = -3;
		Static286.anInt5571 = 0;
		Static358.anInt6495 = 0;
		Static83.anInt1914 = 1;
		if (arg0 < 13) {
			Static135.aBoolean234 = true;
			Static468.method6678();
		}
	}

	@OriginalMember(owner = "client!hw", name = "b", descriptor = "(B)V")
	public static void method3796() {
		if (Static173.anInt3397 == 7) {
			Static628.method8487(false);
		} else {
			Static270.aClass244_2 = Static12.aClass244_1;
			Static12.aClass244_1 = null;
			Static271.method4671(13);
		}
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(CI)Z")
	public static boolean method3798(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
