import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static376 {

	@OriginalMember(owner = "client!mp", name = "l", descriptor = "[Lclient!gea;")
	public static Interface6[] anInterface6Array1;

	@OriginalMember(owner = "client!mp", name = "Q", descriptor = "F")
	public static float aFloat117 = 1.0F;

	@OriginalMember(owner = "client!mp", name = "P", descriptor = "[I")
	public static final int[] anIntArray350 = new int[2];

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(IIB)V")
	public static void method5512(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static496.anInt8290 != 0) {
			if (arg0 >= 0) {
				Static625.anIntArray567[arg0] = arg1;
			} else {
				for (@Pc(29) int local29 = 0; local29 < 16; local29++) {
					Static625.anIntArray567[local29] = arg1;
				}
			}
		}
		Static28.aClass5_Sub16_Sub4_6.method6400(arg0, arg1);
	}
}
