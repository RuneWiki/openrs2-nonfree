import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static500 {

	@OriginalMember(owner = "client!sa", name = "H", descriptor = "[I")
	public static final int[] anIntArray484 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(BLjava/lang/String;I)V")
	public static void method7477(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class5_Sub48 local12 = Static16.method232(Static44.aClass46_14, Static276.aClass251_2);
		local12.aClass5_Sub22_Sub1_2.method5905(Static381.method5596(arg0) + 1);
		local12.aClass5_Sub22_Sub1_2.method5934(arg1);
		local12.aClass5_Sub22_Sub1_2.method5910(arg0);
		Static277.method4436(local12);
	}
}
