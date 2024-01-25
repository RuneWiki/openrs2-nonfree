import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static583 {

	@OriginalMember(owner = "client!to", name = "l", descriptor = "[Lclient!nf;")
	public static Class102[] aClass102Array22;

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!cn;[Lclient!bq;)V")
	public static void method7849(@OriginalArg(0) Class23_Sub2 arg0, @OriginalArg(1) Class3_Sub7[] arg1) {
		@Pc(6) int local6;
		if (Static340.aBoolean474) {
			local6 = arg0.method8602(arg1);
			Static486.aClass16_8.method8162(local6, arg1);
		}
		if (Static605.aClass104Array3 == Static343.aClass104Array2) {
			@Pc(28) int local28;
			if (arg0 instanceof Class23_Sub2_Sub1) {
				local6 = ((Class23_Sub2_Sub1) arg0).aShort123;
				local28 = ((Class23_Sub2_Sub1) arg0).aShort124;
			} else {
				local6 = arg0.anInt10108 >> Static436.anInt7634;
				local28 = arg0.anInt10109 >> Static436.anInt7634;
			}
			Static486.aClass16_8.EA(Static239.aClass104Array1[0].method8286(arg0.anInt10108, arg0.anInt10109), Static85.method1783(local6, local28), Static328.method5087(local6, local28), Static154.method2639(local6, local28));
		}
		@Pc(64) Class23_Sub6 local64 = arg0.method8603(Static486.aClass16_8);
		if (local64 == null) {
			return;
		}
		if (arg0.aBoolean743) {
			@Pc(72) Class23_Sub4[] local72 = local64.aClass23_Sub4Array1;
			for (@Pc(74) int local74 = 0; local74 < local72.length; local74++) {
				@Pc(79) Class23_Sub4 local79 = local72[local74];
				if (local79.aBoolean206) {
					Static120.method2177(local79.anInt2467 - local79.anInt2466, local79.anInt2463 + local79.anInt2466, local79.anInt2464 - local79.anInt2466, local79.anInt2465 + local79.anInt2466);
				}
			}
		}
		if (local64.aBoolean307) {
			local64.aClass23_Sub2_10 = arg0;
			if (Static284.aBoolean410) {
				@Pc(119) Class211 local119 = Static52.aClass211_2;
				synchronized (Static52.aClass211_2) {
					Static52.aClass211_2.method4941(local64);
					return;
				}
			}
			Static52.aClass211_2.method4941(local64);
			return;
		}
		Static305.method4702(local64);
	}
}
