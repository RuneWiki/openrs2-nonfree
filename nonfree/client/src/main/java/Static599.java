import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static599 {

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "I")
	public static int anInt10392;

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(BIIIIII)V")
	public static void method8985(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		for (@Pc(15) Class15_Sub8 local15 = (Class15_Sub8) Static183.aClass60_5.method1547(); local15 != null; local15 = (Class15_Sub8) Static183.aClass60_5.method1546()) {
			if (local15.anInt10062 <= Static62.anInt1184) {
				local15.method9741();
			} else {
				Static588.method8876((local15.anInt10064 << 9) + 256, local15.anInt10061, arg3 >> 1, (local15.anInt10067 << 9) + 256, arg0 >> 1, local15.anInt10063 * 2);
				Static253.aClass59_5.method9585(Static91.anIntArray83[0] + arg1, local15.aString118, local15.anInt10068 | 0xFF000000, 0, arg2 + Static91.anIntArray83[1]);
			}
		}
	}
}
