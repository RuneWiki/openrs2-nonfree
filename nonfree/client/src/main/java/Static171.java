import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!gga", name = "q", descriptor = "I")
	public static int anInt9265;

	@OriginalMember(owner = "client!gga", name = "l", descriptor = "[J")
	public static final long[] aLongArray14 = new long[100];

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(I[BII[BIIII)V")
	public static void method7686(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg0 >> 2);
		@Pc(15) int local15 = -(arg0 & 0x3);
		for (@Pc(18) int local18 = -arg5; local18 < 0; local18++) {
			@Pc(28) int local28;
			for (@Pc(24) int local24 = local10; local24 < 0; local24++) {
				local28 = arg6++;
				arg4[local28] += arg1[arg3++];
				@Pc(40) int local40 = arg6++;
				arg4[local40] += arg1[arg3++];
				@Pc(52) int local52 = arg6++;
				arg4[local52] += arg1[arg3++];
				@Pc(64) int local64 = arg6++;
				arg4[local64] += arg1[arg3++];
			}
			for (@Pc(82) int local82 = local15; local82 < 0; local82++) {
				local28 = arg6++;
				arg4[local28] += arg1[arg3++];
			}
			arg6 += arg2;
			arg3 += arg7;
		}
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(IIIIII)V")
	public static void method7692(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (Static553.anInt9074 <= arg3 && Static249.anInt4668 >= arg4 && Static326.anInt6028 <= arg2 && Static80.anInt1738 >= arg1) {
			Static537.method7344(arg3, arg2, arg1, arg0, arg4);
		} else {
			Static566.method7698(arg3, arg1, arg4, arg0, arg2);
		}
	}
}
