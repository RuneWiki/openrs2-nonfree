import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static397 {

	@OriginalMember(owner = "client!oea", name = "b", descriptor = "I")
	public static int anInt6609 = 0;

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(Lclient!ov;)V")
	public static void method5885(@OriginalArg(0) Class4_Sub2 arg0) {
		if (arg0 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < 2; local4++) {
			@Pc(7) Class4_Sub2 local7 = null;
			for (@Pc(11) Class4_Sub2 local11 = Static79.aClass4_Sub2Array1[local4]; local11 != null; local11 = local11.aClass4_Sub2_23) {
				if (local11 == arg0) {
					if (local7 == null) {
						Static79.aClass4_Sub2Array1[local4] = local11.aClass4_Sub2_23;
					} else {
						local7.aClass4_Sub2_23 = local11.aClass4_Sub2_23;
					}
					Static28.aBoolean15 = true;
					return;
				}
				local7 = local11;
			}
			local7 = null;
			for (@Pc(43) Class4_Sub2 local43 = Static457.aClass4_Sub2Array4[local4]; local43 != null; local43 = local43.aClass4_Sub2_23) {
				if (local43 == arg0) {
					if (local7 == null) {
						Static457.aClass4_Sub2Array4[local4] = local43.aClass4_Sub2_23;
					} else {
						local7.aClass4_Sub2_23 = local43.aClass4_Sub2_23;
					}
					Static28.aBoolean15 = true;
					return;
				}
				local7 = local43;
			}
			local7 = null;
			for (@Pc(75) Class4_Sub2 local75 = Static243.aClass4_Sub2Array2[local4]; local75 != null; local75 = local75.aClass4_Sub2_23) {
				if (local75 == arg0) {
					if (local7 == null) {
						Static243.aClass4_Sub2Array2[local4] = local75.aClass4_Sub2_23;
					} else {
						local7.aClass4_Sub2_23 = local75.aClass4_Sub2_23;
					}
					Static28.aBoolean15 = true;
					return;
				}
				local7 = local75;
			}
		}
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(ILclient!s;)V")
	public static void method5886(@OriginalArg(0) int arg0, @OriginalArg(1) Class61 arg1) {
		Static11.aClass61Array1[arg0] = arg1;
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(B)V")
	public static void method5887() {
		if (!Static464.aBoolean550) {
			return;
		}
		while (true) {
			while (Static467.anInt7848 < Static103.aClass33_Sub1Array2.length) {
				@Pc(29) Class33_Sub1 local29 = Static103.aClass33_Sub1Array2[Static467.anInt7848];
				if (local29 != null && local29.anInt6154 == -1) {
					if (Static104.aClass5_Sub19_2 == null) {
						Static104.aClass5_Sub19_2 = Static395.aClass196_1.method4500(local29.aString64);
					}
					@Pc(53) int local53 = Static104.aClass5_Sub19_2.anInt2183;
					if (local53 == -1) {
						return;
					}
					Static104.aClass5_Sub19_2 = null;
					local29.anInt6154 = local53;
					Static467.anInt7848++;
				} else {
					Static467.anInt7848++;
				}
			}
			return;
		}
	}
}
