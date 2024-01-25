import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static492 {

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!iu;")
	public static Class4_Sub3_Sub3 method7403(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class89 local7 = Static63.aClass89ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(15) Class58 local15 = local7.aClass58_2; local15 != null; local15 = local15.aClass58_1) {
			@Pc(19) Class4_Sub3_Sub3 local19 = local15.aClass4_Sub3_Sub3_1;
			if (arg3.isAssignableFrom(local19.getClass()) && local19.aShort108 == arg1 && local19.aShort109 == arg2) {
				return local19;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(II)I")
	public static int method7404(@OriginalArg(0) int arg0) {
		if (arg0 == 6406) {
			return 1;
		} else if (arg0 == 6409) {
			return 1;
		} else if (arg0 == 32841) {
			return 1;
		} else if (arg0 == 6410) {
			return 2;
		} else if (arg0 == 6407) {
			return 3;
		} else if (arg0 == 6408) {
			return 4;
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
