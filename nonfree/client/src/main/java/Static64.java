import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!db", name = "l", descriptor = "I")
	public static int anInt1159;

	@OriginalMember(owner = "client!db", name = "d", descriptor = "[I")
	public static final int[] anIntArray101 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(I[IILclient!ug;[II)Lclient!eo;")
	public static Class71_Sub1 method924(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class135_Sub2 arg3, @OriginalArg(4) int[] arg4) {
		@Pc(15) byte[] local15 = new byte[arg0 * arg2];
		for (@Pc(17) int local17 = 0; local17 < arg2; local17++) {
			@Pc(28) int local28 = arg0 * local17 + arg4[local17];
			for (@Pc(30) int local30 = 0; local30 < arg1[local17]; local30++) {
				local15[local28++] = -1;
			}
		}
		return new Class71_Sub1(arg3, arg0, arg2, local15);
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!vn;")
	public static Class8_Sub3 method926(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class75 local7 = Static432.aClass75ArrayArrayArray6[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class251 local14 = local7.aClass251_2; local14 != null; local14 = local14.aClass251_3) {
			@Pc(18) Class8_Sub3 local18 = local14.aClass8_Sub3_2;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort100 == arg1 && local18.aShort99 == arg2) {
				return local18;
			}
		}
		return null;
	}
}
