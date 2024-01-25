import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static480 {

	@OriginalMember(owner = "client!sca", name = "n", descriptor = "[I")
	public static final int[] anIntArray494 = new int[6];

	@OriginalMember(owner = "client!sca", name = "o", descriptor = "[I")
	public static final int[] anIntArray495 = new int[1];

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(IIIIIB)V")
	public static void method6557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(13) int local13 = Static4.method56(arg1, Static112.anInt2687, Static333.anInt6022);
		@Pc(19) int local19 = Static4.method56(arg3, Static112.anInt2687, Static333.anInt6022);
		@Pc(27) int local27 = Static4.method56(arg2, Static384.anInt6641, Static191.anInt4134);
		@Pc(43) int local43 = Static4.method56(arg4, Static384.anInt6641, Static191.anInt4134);
		for (@Pc(45) int local45 = local13; local45 <= local19; local45++) {
			Static504.method6755(arg0, local43, Static570.anIntArrayArray100[local45], local27);
		}
	}
}
