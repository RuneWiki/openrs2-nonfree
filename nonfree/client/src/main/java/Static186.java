import java.awt.Image;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!od", name = "o", descriptor = "I")
	public static int anInt3847;

	@OriginalMember(owner = "client!od", name = "s", descriptor = "I")
	public static int anInt3849;

	@OriginalMember(owner = "client!od", name = "t", descriptor = "Ljava/awt/Image;")
	public static Image anImage3;

	@OriginalMember(owner = "client!od", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString228 = "glow1:";

	@OriginalMember(owner = "client!od", name = "n", descriptor = "I")
	public static int anInt3846 = 0;

	@OriginalMember(owner = "client!od", name = "q", descriptor = "[I")
	public static int[] anIntArray345 = new int[5];

	@OriginalMember(owner = "client!od", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString229 = "Loading - please wait.";

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIZI)V")
	public static void method3093(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(21) int local21 = Static23.method431(arg0, Static49.anInt1129, Static297.anInt5619);
		@Pc(27) int local27 = Static23.method431(arg3, Static49.anInt1129, Static297.anInt5619);
		@Pc(33) int local33 = Static23.method431(arg1, Static68.anInt1451, Static224.anInt4436);
		@Pc(39) int local39 = Static23.method431(arg4, Static68.anInt1451, Static224.anInt4436);
		for (@Pc(41) int local41 = local21; local41 <= local27; local41++) {
			Static126.method1523(Static22.anIntArrayArray3[local41], local39, arg2, local33);
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!cg;I)Ljava/lang/String;")
	public static String method3094(@OriginalArg(0) Class1_Sub11 arg0) {
		return Static55.method1041(arg0);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(BLjava/util/Random;I)I")
	public static int method3095(@OriginalArg(1) Random arg0, @OriginalArg(2) int arg1) {
		if (arg1 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static220.method3472(arg1)) {
			return (int) ((long) arg1 * ((long) arg0.nextInt() & 0xFFFFFFFFL) >> 32);
		} else {
			@Pc(43) int local43 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
			@Pc(46) int local46;
			do {
				local46 = arg0.nextInt();
			} while (local46 >= local43);
			return Static26.method527(arg1, local46);
		}
	}
}
