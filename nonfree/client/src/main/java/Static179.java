import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static179 {

	@OriginalMember(owner = "client!lr", name = "O", descriptor = "I")
	public static int anInt3884;

	@OriginalMember(owner = "client!lr", name = "R", descriptor = "Z")
	public static boolean aBoolean359;

	@OriginalMember(owner = "client!lr", name = "P", descriptor = "I")
	public static int anInt3885 = 0;

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIII)V")
	public static void method3547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static85.anIntArrayArray56 != null) {
			Static85.anIntArrayArray56[arg0][arg1] = (arg3 & 0x7F8) << 21 | arg2 & 0xFFFFFF;
		}
	}
}
