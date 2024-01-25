import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static465 {

	@OriginalMember(owner = "client!qa", name = "F", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray7 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!vv;")
	public static Class8_Sub1_Sub3 method5496(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class174 local7 = Static260.aClass174ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(15) Class273 local15 = local7.aClass273_67; local15 != null; local15 = local15.aClass273_114) {
			@Pc(19) Class8_Sub1_Sub3 local19 = local15.aClass8_Sub1_Sub3_1;
			if (arg3.isAssignableFrom(local19.getClass()) && local19.aShort109 == arg1 && local19.aShort108 == arg2) {
				return local19;
			}
		}
		return null;
	}
}
