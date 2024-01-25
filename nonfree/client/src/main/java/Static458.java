import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static458 {

	@OriginalMember(owner = "client!pg", name = "E", descriptor = "[S")
	private static final short[] aShortArray94 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!pg", name = "F", descriptor = "[S")
	private static final short[] aShortArray95 = new short[] { -10304, 9104, 25485, 4620, 4540 };

	@OriginalMember(owner = "client!pg", name = "J", descriptor = "[S")
	public static final short[] aShortArray96 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!pg", name = "H", descriptor = "[[S")
	public static final short[][] aShortArrayArray7 = new short[][] { aShortArray94, aShortArray95, aShortArray96 };

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIIIII)Lclient!cj;")
	public static Class57 method6167(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(37) long local37 = (long) arg5 * 76724863L ^ (long) arg3 * 97549L ^ (long) arg0 * 67481L ^ (long) arg2 * 475427L ^ (long) arg1 * 986053L ^ (long) arg4 * 32147369L;
		@Pc(43) Class57 local43 = (Class57) Static121.aClass295_8.method6470(local37);
		if (local43 == null) {
			local43 = Static491.aClass95_11.method8043(arg0, arg3, arg2, arg1, arg4, arg5);
			Static121.aClass295_8.method6469(local37, local43);
			return local43;
		} else {
			return local43;
		}
	}
}
