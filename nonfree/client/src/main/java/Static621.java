import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static621 {

	@OriginalMember(owner = "client!uja", name = "z", descriptor = "F")
	public static float aFloat197;

	@OriginalMember(owner = "client!uja", name = "L", descriptor = "I")
	public static int anInt9796 = 0;

	@OriginalMember(owner = "client!uja", name = "c", descriptor = "F")
	public static float aFloat196 = 1.0F;

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(II[I[ILclient!ml;B)Lclient!dca;")
	public static Class1_Sub1 method8535(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) Class75_Sub3 arg4) {
		@Pc(10) byte[] local10 = new byte[arg1 * arg0];
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			@Pc(24) int local24 = local12 * arg0 + arg2[local12];
			for (@Pc(26) int local26 = 0; local26 < arg3[local12]; local26++) {
				local10[local24++] = -1;
			}
		}
		if (-96 != -96) {
			anInt9796 = 76;
		}
		return new Class1_Sub1(arg4, arg0, arg1, local10);
	}
}
