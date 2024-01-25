import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!gha", name = "n", descriptor = "I")
	public static int anInt4423 = 0;

	@OriginalMember(owner = "client!gha", name = "b", descriptor = "(I)V")
	public static void method3867() {
		if (Static449.anInterface5Array1 == null) {
			return;
		}
		@Pc(9) Interface5[] local9 = Static449.anInterface5Array1;
		for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
			@Pc(17) Interface5 local17 = local9[local11];
			local17.method9011();
		}
	}

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(Lclient!jb;I)Lclient!oga;")
	public static Class243 method3871(@OriginalArg(0) Class3_Sub1_Sub3 arg0) {
		@Pc(12) Class243 local12;
		if (Static207.aClass243_2 == null) {
			local12 = new Class243();
		} else {
			local12 = Static207.aClass243_2;
			Static207.aClass243_2 = Static207.aClass243_2.aClass243_3;
			local12.aClass243_3 = null;
			Static467.anInt8766--;
		}
		local12.aClass3_Sub1_Sub3_1 = arg0;
		return local12;
	}
}
