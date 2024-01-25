import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static540 {

	@OriginalMember(owner = "client!tha", name = "k", descriptor = "I")
	public static int anInt9190;

	@OriginalMember(owner = "client!tha", name = "l", descriptor = "I")
	public static int anInt9191;

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(IIIIIII)V")
	public static void method7929(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		for (@Pc(15) Class4_Sub7 local15 = (Class4_Sub7) Static452.aClass99_9.method2045(); local15 != null; local15 = (Class4_Sub7) Static452.aClass99_9.method2047()) {
			if (local15.anInt4688 <= Static631.anInt10493) {
				local15.method8713();
			} else {
				Static622.method8832((local15.anInt4689 << 9) + 256, local15.anInt4692, (local15.anInt4684 << 9) + 256, arg0 >> 1, local15.anInt4691 * 2, arg1 >> 1);
				Static16.aClass55_1.method6013(0, local15.aString50, arg2 + Static120.anIntArray136[1], local15.anInt4685 | 0xFF000000, Static120.anIntArray136[0] + arg3);
			}
		}
	}
}
