import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static504 {

	@OriginalMember(owner = "client!rs", name = "c", descriptor = "Lclient!via;")
	public static Class358 aClass358_4;

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lclient!gg;[Lclient!cba;)V")
	public static void method7269(@OriginalArg(0) Class9_Sub4 arg0, @OriginalArg(1) Class6_Sub10[] arg1) {
		@Pc(6) int local6;
		if (Static597.aBoolean790) {
			local6 = arg0.method8415(arg1);
			Static472.aClass5_14.method6181(local6, arg1);
		}
		if (Static152.aClass245Array3 == Static148.aClass245Array1) {
			@Pc(28) int local28;
			if (arg0 instanceof Class9_Sub4_Sub2) {
				local6 = ((Class9_Sub4_Sub2) arg0).aShort115;
				local28 = ((Class9_Sub4_Sub2) arg0).aShort114;
			} else {
				local6 = arg0.anInt10360 >> Static606.anInt10280;
				local28 = arg0.anInt10357 >> Static606.anInt10280;
			}
			Static472.aClass5_14.EA(Static150.aClass245Array2[0].method7580(arg0.anInt10360, arg0.anInt10357), Static543.method7672(local6, local28), Static631.method8609(local6, local28), Static363.method7755(local6, local28));
		}
		@Pc(64) Class9_Sub2 local64 = arg0.method8410(Static472.aClass5_14);
		if (local64 == null) {
			return;
		}
		if (arg0.aBoolean816) {
			@Pc(72) Class9_Sub6[] local72 = local64.aClass9_Sub6Array1;
			for (@Pc(74) int local74 = 0; local74 < local72.length; local74++) {
				@Pc(79) Class9_Sub6 local79 = local72[local74];
				if (local79.aBoolean490) {
					Static215.method3836(local79.anInt6272 + local79.anInt6269, local79.anInt6273 - local79.anInt6269, local79.anInt6271 - local79.anInt6269, local79.anInt6270 + local79.anInt6269);
				}
			}
		}
		if (local64.aBoolean82) {
			local64.aClass9_Sub4_1 = arg0;
			if (Static640.aBoolean844) {
				@Pc(119) Class100 local119 = Static418.aClass100_1;
				synchronized (Static418.aClass100_1) {
					Static418.aClass100_1.method3069(local64);
					return;
				}
			}
			Static418.aClass100_1.method3069(local64);
			return;
		}
		Static72.method2064(local64);
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(B)V")
	public static void method7270() {
		for (@Pc(16) Class6_Sub39 local16 = (Class6_Sub39) Static475.aClass380_36.method8755(); local16 != null; local16 = (Class6_Sub39) Static475.aClass380_36.method8752()) {
			if (local16.aBoolean638) {
				local16.aBoolean638 = false;
			} else {
				Static122.method2609(local16.anInt7975);
			}
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)Lclient!eda;")
	public static Class6_Sub17 method7272() {
		return Static417.anInt7725 == 0 ? new Class6_Sub17() : Static150.aClass6_Sub17Array1[--Static417.anInt7725];
	}
}
