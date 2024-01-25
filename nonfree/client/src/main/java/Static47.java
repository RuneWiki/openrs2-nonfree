import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!bi", name = "m", descriptor = "F")
	public static float aFloat10;

	@OriginalMember(owner = "client!bi", name = "l", descriptor = "Z")
	public static boolean aBoolean59 = false;

	@OriginalMember(owner = "client!bi", name = "d", descriptor = "(III)Lclient!md;")
	public static Class34_Sub1_Sub3 method830(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class368 local7 = Static254.aClass368ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass34_Sub1_Sub3_1;
	}

	@OriginalMember(owner = "client!bi", name = "e", descriptor = "(III)Lclient!f;")
	public static Class34_Sub1_Sub4 method831(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class368 local7 = Static254.aClass368ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class34_Sub1_Sub4 local14 = local7.aClass34_Sub1_Sub4_1;
			local7.aClass34_Sub1_Sub4_1 = null;
			Static216.method3187(local14);
			return local14;
		}
	}
}
