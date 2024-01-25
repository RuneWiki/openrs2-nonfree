import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static399 {

	@OriginalMember(owner = "client!uf", name = "r", descriptor = "F")
	public static float aFloat198;

	@OriginalMember(owner = "client!uf", name = "f", descriptor = "(I)V")
	public static void method5302() {
		if (Static73.anInt1749 == 10) {
			Static321.method4406(28);
		}
		if (Static73.anInt1749 == 30) {
			Static321.method4406(25);
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IZ)V")
	public static void method5303(@OriginalArg(0) int arg0) {
		@Pc(8) Class4_Sub1_Sub8 local8 = Static416.method5456(arg0, 14);
		local8.method2761();
	}
}
