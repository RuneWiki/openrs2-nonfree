import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static420 {

	@OriginalMember(owner = "client!pea", name = "d", descriptor = "Lclient!hda;")
	public static Class128 aClass128_1;

	@OriginalMember(owner = "client!pea", name = "f", descriptor = "Lclient!dr;")
	public static Class77 aClass77_1;

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "Z")
	public static boolean aBoolean573 = false;

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "([I[JI)V")
	public static void method6584(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1) {
		Static435.method6737(arg1, 0, arg1.length - 1, arg0);
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(I[BI[BIBIII)V")
	public static void method6585(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(15) int local15 = -(arg7 >> 2);
		@Pc(20) int local20 = -(arg7 & 0x3);
		for (@Pc(23) int local23 = -arg4; local23 < 0; local23++) {
			@Pc(31) int local31;
			for (@Pc(27) int local27 = local15; local27 < 0; local27++) {
				local31 = arg6++;
				arg3[local31] += arg1[arg2++];
				@Pc(43) int local43 = arg6++;
				arg3[local43] += arg1[arg2++];
				@Pc(55) int local55 = arg6++;
				arg3[local55] += arg1[arg2++];
				@Pc(67) int local67 = arg6++;
				arg3[local67] += arg1[arg2++];
			}
			for (@Pc(82) int local82 = local20; local82 < 0; local82++) {
				local31 = arg6++;
				arg3[local31] += arg1[arg2++];
			}
			arg6 += arg5;
			arg2 += arg0;
		}
	}
}
