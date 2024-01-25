import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static166 {

	@OriginalMember(owner = "client!kg", name = "Uc", descriptor = "I")
	public static int anInt3412 = 0;

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(IIII)V")
	public static void method2681(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static245.anIntArrayArray46 != null) {
			Static245.anIntArrayArray46[arg0][arg1] = (arg3 & 0x7F8) << 21 | arg2 & 0xFFFFFF;
		}
	}
}
