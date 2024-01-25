import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static457 {

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "[S")
	private static final short[] aShortArray107 = new short[] { -10304, 9104, 25485, 4620, 4540 };

	@OriginalMember(owner = "client!rl", name = "k", descriptor = "[S")
	private static final short[] aShortArray108 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!rl", name = "n", descriptor = "[S")
	private static final short[] aShortArray109 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!rl", name = "d", descriptor = "[[S")
	public static final short[][] aShortArrayArray9 = new short[][] { aShortArray108, aShortArray107, aShortArray109 };

	@OriginalMember(owner = "client!rl", name = "q", descriptor = "[Lclient!ar;")
	public static final Class4_Sub4[] aClass4_Sub4Array1 = new Class4_Sub4[1024];

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!kga;[IBI[II)Lclient!pg;")
	public static Class6_Sub3 method6976(@OriginalArg(0) Class44_Sub3 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4) {
		@Pc(10) byte[] local10 = new byte[arg2 * arg4];
		for (@Pc(12) int local12 = 0; local12 < arg2; local12++) {
			@Pc(23) int local23 = arg4 * local12 + arg1[local12];
			for (@Pc(25) int local25 = 0; local25 < arg3[local12]; local25++) {
				local10[local23++] = -1;
			}
		}
		return new Class6_Sub3(arg0, arg4, arg2, local10);
	}
}
