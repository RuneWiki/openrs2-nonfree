import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!mi", name = "l", descriptor = "I")
	public static int anInt3796;

	@OriginalMember(owner = "client!mi", name = "o", descriptor = "[I")
	public static int[] anIntArray480;

	@OriginalMember(owner = "client!mi", name = "m", descriptor = "[I")
	public static int[] anIntArray479 = new int[2];

	@OriginalMember(owner = "client!mi", name = "d", descriptor = "(I)V")
	public static void method3098() {
		for (@Pc(12) int local12 = 0; local12 < 5; local12++) {
			Static50.aBooleanArray4[local12] = false;
		}
		Static72.anInt1436 = -1;
		Static354.anInt5770 = 0;
		Static205.anInt3601 = 0;
		Static323.anInt5463 = 1;
		Static227.anInt4752 = -1;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIZZII)V")
	public static void method3099(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(14) long local14 = (long) (arg1 | (arg2 ? Integer.MIN_VALUE : 0));
		@Pc(25) Class1_Sub37 local25 = (Class1_Sub37) Static209.aClass77_26.method1368(local14);
		if (local25 == null) {
			local25 = new Class1_Sub37();
			Static209.aClass77_26.method1370(local14, local25);
		}
		if (arg4 >= local25.anIntArray589.length) {
			@Pc(50) int[] local50 = new int[arg4 + 1];
			@Pc(55) int[] local55 = new int[arg4 + 1];
			for (@Pc(57) int local57 = 0; local57 < local25.anIntArray589.length; local57++) {
				local50[local57] = local25.anIntArray589[local57];
				local55[local57] = local25.anIntArray591[local57];
			}
			for (@Pc(83) int local83 = local25.anIntArray589.length; local83 < arg4; local83++) {
				local50[local83] = -1;
				local55[local83] = 0;
			}
			local25.anIntArray591 = local55;
			local25.anIntArray589 = local50;
		}
		local25.anIntArray589[arg4] = arg0;
		local25.anIntArray591[arg4] = arg3;
	}
}
