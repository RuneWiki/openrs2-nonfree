import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static153 {

	@OriginalMember(owner = "client!fca", name = "Gb", descriptor = "[Z")
	public static final boolean[] aBooleanArray9 = new boolean[5];

	@OriginalMember(owner = "client!fca", name = "Fb", descriptor = "I")
	public static int anInt3235 = 0;

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(IZIII)V")
	public static void method3053(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 >= arg1) {
			Static367.method5559(-7, arg1, arg2, Static36.anIntArrayArray4[arg3], arg0);
		} else {
			Static367.method5559(-7, arg0, arg2, Static36.anIntArrayArray4[arg3], arg1);
		}
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(III)Z")
	public static boolean method3056(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
