import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!ega", name = "m", descriptor = "J")
	public static long aLong281;

	@OriginalMember(owner = "client!ega", name = "h", descriptor = "Lclient!aw;")
	public static final Class23 aClass23_8 = new Class23();

	@OriginalMember(owner = "client!ega", name = "l", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_202 = new Class136(28, 1);

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(IIIBI)V")
	public static void method8854(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 >= Static514.anInt8603 && Static487.anInt8320 >= arg1) {
			@Pc(24) int local24 = Static84.method1337(Static231.anInt3977, Static304.anInt4824, arg3);
			@Pc(30) int local30 = Static84.method1337(Static231.anInt3977, Static304.anInt4824, arg0);
			Static355.method5610(local30, arg1, arg2, local24);
		}
	}

	@OriginalMember(owner = "client!ega", name = "b", descriptor = "(B)V")
	public static void method8855() {
		Static167.aClass5_Sub12_Sub2_1.method8667();
		@Pc(21) int local21 = Static167.aClass5_Sub12_Sub2_1.method8670(8);
		@Pc(30) int local30;
		if (Static58.anInt926 > local21) {
			for (local30 = local21; local30 < Static58.anInt926; local30++) {
				Static227.anIntArray328[Static208.anInt3629++] = Static191.anIntArray287[local30];
			}
		}
		if (local21 > Static58.anInt926) {
			throw new RuntimeException("gnpov1");
		}
		Static58.anInt926 = 0;
		for (local30 = 0; local30 < local21; local30++) {
			@Pc(64) int local64 = Static191.anIntArray287[local30];
			@Pc(72) Class14_Sub1_Sub1_Sub3_Sub2 local72 = ((Class5_Sub13) Static51.aClass81_11.method1599((long) local64)).aClass14_Sub1_Sub1_Sub3_Sub2_1;
			@Pc(77) int local77 = Static167.aClass5_Sub12_Sub2_1.method8670(1);
			if (local77 == 0) {
				Static191.anIntArray287[Static58.anInt926++] = local64;
				local72.anInt2935 = Static47.anInt748;
			} else {
				@Pc(100) int local100 = Static167.aClass5_Sub12_Sub2_1.method8670(2);
				if (local100 == 0) {
					Static191.anIntArray287[Static58.anInt926++] = local64;
					local72.anInt2935 = Static47.anInt748;
					Static15.anIntArray29[Static18.anInt423++] = local64;
				} else {
					@Pc(142) int local142;
					@Pc(152) int local152;
					if (local100 == 1) {
						Static191.anIntArray287[Static58.anInt926++] = local64;
						local72.anInt2935 = Static47.anInt748;
						local142 = Static167.aClass5_Sub12_Sub2_1.method8670(3);
						local72.method2535(1, local142);
						local152 = Static167.aClass5_Sub12_Sub2_1.method8670(1);
						if (local152 == 1) {
							Static15.anIntArray29[Static18.anInt423++] = local64;
						}
					} else if (local100 == 2) {
						Static191.anIntArray287[Static58.anInt926++] = local64;
						local72.anInt2935 = Static47.anInt748;
						if (Static167.aClass5_Sub12_Sub2_1.method8670(1) == 1) {
							local142 = Static167.aClass5_Sub12_Sub2_1.method8670(3);
							local72.method2535(2, local142);
							local152 = Static167.aClass5_Sub12_Sub2_1.method8670(3);
							local72.method2535(2, local152);
						} else {
							local142 = Static167.aClass5_Sub12_Sub2_1.method8670(3);
							local72.method2535(0, local142);
						}
						local142 = Static167.aClass5_Sub12_Sub2_1.method8670(1);
						if (local142 == 1) {
							Static15.anIntArray29[Static18.anInt423++] = local64;
						}
					} else if (local100 == 3) {
						Static227.anIntArray328[Static208.anInt3629++] = local64;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(II)V")
	public static void method8856() {
		@Pc(1) Class293 local1 = Static580.aClass293_75;
		synchronized (Static580.aClass293_75) {
			Static580.aClass293_75.method6922(5);
		}
	}

	@OriginalMember(owner = "client!ega", name = "b", descriptor = "(III)Z")
	public static boolean method8858(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static325.method5029(arg0, arg1) | (arg1 & 0x70000) != 0 || Static188.method8826(arg1, arg0);
	}
}
