import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static402 {

	@OriginalMember(owner = "client!qw", name = "j", descriptor = "Lclient!bn;")
	public static final Class33 aClass33_25 = new Class33(5, 17);

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(IIIIII)V")
	public static void method7865(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(12) int local12 = arg2 + 1;
		Static227.method7421(arg4, arg0, arg1, Static81.anIntArrayArray25[arg2]);
		@Pc(21) int local21 = arg3 - 1;
		Static227.method7421(arg4, arg0, arg1, Static81.anIntArrayArray25[arg3]);
		for (@Pc(25) int local25 = local12; local25 <= local21; local25++) {
			@Pc(31) int[] local31 = Static81.anIntArrayArray25[local25];
			local31[arg4] = local31[arg1] = arg0;
		}
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "([BII)I")
	public static int method7867(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		return Static309.method5132(arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(JJ)J")
	public static long method7868(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 ^ arg1;
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(Lclient!vn;BII)V")
	public static void method7869(@OriginalArg(0) Class308 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static208.aClass308ArrayArray1[arg2][arg1] = arg0;
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(III)Z")
	public static boolean method7872(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
