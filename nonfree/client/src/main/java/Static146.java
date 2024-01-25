import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!gw", name = "h", descriptor = "I")
	public static int anInt2674;

	@OriginalMember(owner = "client!gw", name = "d", descriptor = "I")
	public static int anInt2670 = -1;

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(II)I")
	public static int method2221(@OriginalArg(1) int arg0) {
		return arg0 >>> 10;
	}

	@OriginalMember(owner = "client!gw", name = "b", descriptor = "(II)V")
	public static void method2222(@OriginalArg(1) int arg0) {
		@Pc(16) Class2_Sub1_Sub6 local16 = Static267.method3705(arg0, 16);
		local16.method2578();
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(ZI)V")
	public static void method2223(@OriginalArg(0) boolean arg0) {
		Static331.anInt5942 = 0;
		Static439.anInt7382 = 0;
		Static181.method2412();
		Static246.method3419(arg0);
		Static96.method1423();
		@Pc(18) boolean local18 = false;
		@Pc(26) int local26;
		for (@Pc(20) int local20 = 0; local20 < Static331.anInt5942; local20++) {
			local26 = Static48.anIntArray63[local20];
			@Pc(33) Class2_Sub34 local33 = (Class2_Sub34) Static400.aClass220_41.method5099((long) local26);
			@Pc(36) Class11_Sub5_Sub2_Sub2 local36 = local33.aClass11_Sub5_Sub2_Sub2_2;
			if (Static45.aBoolean34 && Static372.method5184(local26)) {
				Static428.method5827();
			}
			if (Static277.anInt5022 != local36.anInt7634) {
				if (local36.aClass82_1.method1897()) {
					Static115.method1881(local36);
				}
				local36.method6235(null);
				local33.method6260();
				local18 = true;
			}
		}
		if (local18) {
			Static30.anInt548 = Static400.aClass220_41.method5103();
			Static400.aClass220_41.method5097(Static226.aClass2_Sub34Array1);
		}
		if (Static302.anInt5465 != Static202.aClass2_Sub17_Sub1_1.anInt7523) {
			throw new RuntimeException("gnp1 pos:" + Static202.aClass2_Sub17_Sub1_1.anInt7523 + " psize:" + Static302.anInt5465);
		}
		for (local26 = 0; local26 < Static458.anInt7721; local26++) {
			if (Static400.aClass220_41.method5099((long) Static164.anIntArray253[local26]) == null) {
				throw new RuntimeException("gnp2 pos:" + local26 + " size:" + Static458.anInt7721);
			}
		}
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(Lclient!mn;Lclient!mn;I)I")
	public static int method2224(@OriginalArg(0) Class171 arg0, @OriginalArg(1) Class171 arg1) {
		@Pc(11) int local11 = 0;
		if (arg0.method3666(Static139.anInt2567)) {
			local11++;
		}
		if (arg0.method3666(Static87.anInt1488)) {
			local11++;
		}
		if (arg0.method3666(Static147.anInt2684)) {
			local11++;
		}
		if (arg1.method3666(Static139.anInt2567)) {
			local11++;
		}
		if (arg1.method3666(Static87.anInt1488)) {
			local11++;
		}
		if (arg1.method3666(Static147.anInt2684)) {
			local11++;
		}
		return local11;
	}
}
