import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!ffa", name = "c", descriptor = "[I")
	public static final int[] anIntArray137 = new int[5];

	@OriginalMember(owner = "client!ffa", name = "j", descriptor = "Z")
	public static boolean aBoolean185 = false;

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!wga;")
	public static Class41_Sub1_Sub1 method2369(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class313 local7 = Static129.aClass313ArrayArrayArray7[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class40 local14 = local7.aClass40_3; local14 != null; local14 = local14.aClass40_1) {
			@Pc(18) Class41_Sub1_Sub1 local18 = local14.aClass41_Sub1_Sub1_1;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort109 == arg1 && local18.aShort108 == arg2) {
				return local18;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(III)Z")
	public static boolean method2375(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x10) != 0;
	}
}
