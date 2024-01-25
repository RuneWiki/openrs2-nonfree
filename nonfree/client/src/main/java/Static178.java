import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!gfa", name = "o", descriptor = "I")
	public static int anInt4220;

	@OriginalMember(owner = "client!gfa", name = "m", descriptor = "[Z")
	public static final boolean[] aBooleanArray12 = new boolean[100];

	@OriginalMember(owner = "client!gfa", name = "q", descriptor = "I")
	public static int anInt4222 = 0;

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(IIIIIZ)V")
	public static void method3627(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(14) long local14 = (long) (arg2 | (arg4 ? Integer.MIN_VALUE : 0));
		@Pc(20) Class3_Sub17 local20 = (Class3_Sub17) Static127.aClass307_21.method7424(local14);
		if (local20 == null) {
			local20 = new Class3_Sub17();
			Static127.aClass307_21.method7425(local14, local20);
		}
		if (arg3 >= local20.anIntArray99.length) {
			@Pc(45) int[] local45 = new int[arg3 + 1];
			@Pc(50) int[] local50 = new int[arg3 + 1];
			for (@Pc(52) int local52 = 0; local52 < local20.anIntArray99.length; local52++) {
				local45[local52] = local20.anIntArray99[local52];
				local50[local52] = local20.anIntArray98[local52];
			}
			for (@Pc(82) int local82 = local20.anIntArray99.length; local82 < arg3; local82++) {
				local45[local82] = -1;
				local50[local82] = 0;
			}
			local20.anIntArray99 = local45;
			local20.anIntArray98 = local50;
		}
		local20.anIntArray99[arg3] = arg0;
		local20.anIntArray98[arg3] = arg1;
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(IZI)Z")
	public static boolean method3628(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x400) != 0;
	}
}
