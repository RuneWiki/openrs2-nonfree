import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static312 {

	@OriginalMember(owner = "client!lh", name = "k", descriptor = "I")
	public static int anInt10525;

	@OriginalMember(owner = "client!lh", name = "m", descriptor = "[I")
	public static int[] anIntArray597;

	@OriginalMember(owner = "client!lh", name = "o", descriptor = "I")
	public static int anInt10527 = 1;

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIIII)V")
	public static void method8954(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static361.method8001(Static554.anInt9362, Static62.anInt1300, arg4);
		@Pc(17) int local17 = Static361.method8001(Static554.anInt9362, Static62.anInt1300, arg3);
		@Pc(23) int local23 = Static361.method8001(Static275.anInt4919, Static529.anInt9089, arg0);
		@Pc(29) int local29 = Static361.method8001(Static275.anInt4919, Static529.anInt9089, arg1);
		for (@Pc(36) int local36 = local11; local36 <= local17; local36++) {
			Static491.method7219(Static249.anIntArrayArray23[local36], local23, arg2, local29);
		}
	}
}
