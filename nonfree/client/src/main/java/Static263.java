import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!ir", name = "m", descriptor = "I")
	public static int anInt4938;

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_91 = new Class126(51, 10);

	@OriginalMember(owner = "client!ir", name = "s", descriptor = "I")
	public static int anInt4942 = 0;

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(II)V")
	public static void method4136(@OriginalArg(0) int arg0) {
		@Pc(13) Class3_Sub6_Sub7 local13 = Static198.method3146((long) arg0, 16);
		local13.method1709();
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(IIIIIIIII)Z")
	public static boolean method4139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg6 + arg1 > arg3 && arg4 + arg3 > arg1) {
			return arg0 + arg2 > arg5 && arg5 + arg7 > arg2;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(IIIB)V")
	public static void method4141(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) int local10 = arg0 + Static417.anInt7047;
		@Pc(14) int local14 = Static347.anInt7851 + arg1;
		if (Static332.aClass247ArrayArrayArray1 == null || arg0 < 0 || arg1 < 0 || arg0 >= Static251.anInt4680 || arg1 >= Static406.anInt6924 || Static227.aClass3_Sub15_11.aClass17_Sub19_1.method6025() == 0 && Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.aByte142 != arg2) {
			return;
		}
		@Pc(54) long local54 = (long) (arg2 << 28 | local14 << 14 | local10);
		@Pc(62) Class3_Sub24 local62 = (Class3_Sub24) Static421.aClass62_32.method1682(local54);
		if (local62 == null) {
			Static294.method2959(arg2, arg0, arg1);
			return;
		}
		@Pc(76) Class3_Sub25 local76 = (Class3_Sub25) local62.aClass193_26.method4457();
		if (local76 == null) {
			Static294.method2959(arg2, arg0, arg1);
			return;
		}
		@Pc(90) Class23_Sub2_Sub4_Sub1 local90 = (Class23_Sub2_Sub4_Sub1) Static294.method2959(arg2, arg0, arg1);
		if (local90 == null) {
			local90 = new Class23_Sub2_Sub4_Sub1(arg0 << 9, Static343.aClass104Array2[arg2].method8279(arg1, arg0), arg1 << 9, arg2, arg2);
		} else {
			local90.anInt6373 = local90.anInt6388 = -1;
		}
		local90.anInt6377 = local76.anInt4451;
		local90.anInt6383 = local76.anInt4450;
		label56: while (true) {
			@Pc(133) Class3_Sub25 local133 = (Class3_Sub25) local62.aClass193_26.method4459();
			if (local133 == null) {
				break;
			}
			if (local133.anInt4451 != local90.anInt6377) {
				local90.anInt6373 = local133.anInt4451;
				local90.anInt6384 = local133.anInt4450;
				while (true) {
					@Pc(154) Class3_Sub25 local154 = (Class3_Sub25) local62.aClass193_26.method4459();
					if (local154 == null) {
						break label56;
					}
					if (local154.anInt4451 != local90.anInt6377 && local154.anInt4451 != local90.anInt6373) {
						local90.anInt6388 = local154.anInt4451;
						local90.anInt6389 = local154.anInt4450;
					}
				}
			}
		}
		@Pc(200) int local200 = Static194.method5133((arg0 << 9) + 256, (arg1 << 9) + 256, arg2);
		local90.aByte143 = (byte) arg2;
		local90.aByte142 = (byte) arg2;
		local90.anInt6381 = 0;
		local90.anInt10114 = local200;
		local90.anInt10109 = arg1 << 9;
		local90.anInt10108 = arg0 << 9;
		if (Static190.method3051(arg1, arg0)) {
			local90.aByte143++;
		}
		Static627.method8277(arg2, arg0, arg1, local200, local90);
	}
}
