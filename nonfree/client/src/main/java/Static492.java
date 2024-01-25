import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static492 {

	@OriginalMember(owner = "client!pk", name = "d", descriptor = "Lclient!lb;")
	public static Class221 aClass221_129;

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "Lclient!op;")
	public static Class275 aClass275_4;

	@OriginalMember(owner = "client!pk", name = "e", descriptor = "I")
	public static final int anInt8481 = -1;

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "I")
	public static final int anInt8482 = 1405;

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(III)V")
	public static void method7119(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static112.anInt2244 != 0) {
			if (arg1 >= 0) {
				Static588.anIntArray528[arg1] = arg0;
			} else {
				for (@Pc(31) int local31 = 0; local31 < 16; local31++) {
					Static588.anIntArray528[local31] = arg0;
				}
			}
		}
		Static671.aClass3_Sub22_Sub5_3.method9315(arg0, arg1);
	}
}
