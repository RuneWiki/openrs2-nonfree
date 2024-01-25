import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!ks", name = "g", descriptor = "Z")
	public static boolean aBoolean307;

	@OriginalMember(owner = "client!ks", name = "d", descriptor = "I")
	public static int anInt3695 = 0;

	@OriginalMember(owner = "client!ks", name = "f", descriptor = "Z")
	public static boolean aBoolean306 = false;

	@OriginalMember(owner = "client!ks", name = "h", descriptor = "I")
	public static int anInt3696 = 0;

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!hd;")
	public static Class2_Sub2 method3153(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class57 local7 = Static18.aClass57ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class95 local14 = local7.aClass95_2; local14 != null; local14 = local14.aClass95_3) {
			@Pc(18) Class2_Sub2 local18 = local14.aClass2_Sub2_1;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort85 == arg1 && local18.aShort84 == arg2) {
				return local18;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(III)B")
	public static byte method3157(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
