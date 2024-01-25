import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!fs", name = "P", descriptor = "I")
	public static int anInt3573 = -1;

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(ILclient!i;)V")
	public static void method2896(@OriginalArg(0) int arg0, @OriginalArg(1) Class127 arg1) {
		Static256.aClass127Array3[arg0] = arg1;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIIII)V")
	public static void method2897(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 >= Static384.anInt6641 && arg0 <= Static191.anInt4134) {
			@Pc(11) int local11 = Static4.method56(arg2, Static112.anInt2687, Static333.anInt6022);
			@Pc(17) int local17 = Static4.method56(arg3, Static112.anInt2687, Static333.anInt6022);
			Static84.method7340(local11, arg0, local17, arg1);
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method2898(@OriginalArg(1) String arg0) {
		return arg0.length() + 1;
	}
}
