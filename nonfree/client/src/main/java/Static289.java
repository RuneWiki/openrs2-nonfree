import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!l", name = "a", descriptor = "I")
	public static int anInt6779;

	@OriginalMember(owner = "client!l", name = "b", descriptor = "Lclient!pe;")
	public static Class254 aClass254_92;

	@OriginalMember(owner = "client!l", name = "d", descriptor = "I")
	public static int anInt6781;

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(ILclient!ji;[IB[II)Lclient!na;")
	public static Class93_Sub1 method5648(@OriginalArg(0) int arg0, @OriginalArg(1) Class15_Sub3 arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4) {
		@Pc(10) byte[] local10 = new byte[arg4 * arg0];
		for (@Pc(17) int local17 = 0; local17 < arg0; local17++) {
			@Pc(27) int local27 = arg3[local17] + local17 * arg4;
			for (@Pc(29) int local29 = 0; local29 < arg2[local17]; local29++) {
				local10[local27++] = -1;
			}
		}
		return new Class93_Sub1(arg1, arg4, arg0, local10);
	}
}
