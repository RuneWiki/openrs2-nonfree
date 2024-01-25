import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static663 {

	@OriginalMember(owner = "client!va", name = "c", descriptor = "I")
	public static int anInt9247;

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V")
	public static void method8151() {
		@Pc(7) int local7 = Static268.anInt4162;
		@Pc(9) int[] local9 = Static597.anIntArray677;
		for (@Pc(11) int local11 = 0; local11 < local7; local11++) {
			@Pc(19) Class4_Sub2_Sub1_Sub2_Sub1 local19 = Static157.aClass4_Sub2_Sub1_Sub2_Sub1Array1[local9[local11]];
			if (local19 != null) {
				Static435.method6318(local19, false);
			}
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IILjava/lang/String;)I")
	public static int method8152(@OriginalArg(2) String arg0) {
		return Static376.method5449(arg0, 16);
	}
}
