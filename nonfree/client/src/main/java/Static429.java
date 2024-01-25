import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static429 {

	@OriginalMember(owner = "client!oca", name = "E", descriptor = "[I")
	public static final int[] anIntArray385 = new int[2048];

	@OriginalMember(owner = "client!oca", name = "d", descriptor = "(I)[I")
	public static int[] method6442() {
		return new int[] { Static191.anInt3328, Static564.anInt9377, Static161.anInt1416 };
	}

	@OriginalMember(owner = "client!oca", name = "e", descriptor = "(I)V")
	public static void method6443() {
		Static426.anInt7228 = -1;
		Static591.aClass347_3 = Static277.aClass347_1;
		Static686.anInt11152 = 1;
		@Pc(19) String local19 = null;
		if (Static624.aByteArray106 != null) {
			@Pc(26) Class14_Sub21 local26 = new Class14_Sub21(Static624.aByteArray106);
			local19 = Static580.method8268(local26.method7729());
			Static210.aLong121 = local26.method7729();
		}
		if (local19 == null) {
			Static612.method8634(35);
		} else {
			Static56.method1003("", false, local19, true);
		}
	}
}
