import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "Z")
	public static boolean aBoolean530 = false;

	@OriginalMember(owner = "client!ms", name = "c", descriptor = "Lclient!ho;")
	public static final Class103 aClass103_169 = new Class103(58, 2);

	@OriginalMember(owner = "client!ms", name = "d", descriptor = "Lclient!ho;")
	public static final Class103 aClass103_170 = new Class103(55, 4);

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(I)V")
	public static void method3675() {
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < Static296.anInt5187; local15++) {
			for (@Pc(19) int local19 = 0; local19 < Static206.anInt3607; local19++) {
				if (Static244.method3505(Static359.aClass169ArrayArrayArray5, local13, local15, true, local19)) {
					local13++;
				}
				if (local13 >= 512) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(II)V")
	public static void method3676(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class169 local7 = Static359.aClass169ArrayArrayArray5[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class169 local28 = Static359.aClass169ArrayArrayArray5[local9][arg0][arg1] = Static359.aClass169ArrayArrayArray5[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.aByte83--;
				for (@Pc(40) Class27 local40 = local28.aClass27_3; local40 != null; local40 = local40.aClass27_1) {
					@Pc(44) Class25_Sub5 local44 = local40.aClass25_Sub5_1;
					if (local44.aShort97 == arg0 && local44.aShort94 == arg1) {
						local44.aByte94--;
					}
				}
			}
		}
		if (Static359.aClass169ArrayArrayArray5[0][arg0][arg1] == null) {
			Static359.aClass169ArrayArrayArray5[0][arg0][arg1] = new Class169(0, arg0, arg1);
			Static359.aClass169ArrayArrayArray5[0][arg0][arg1].aByte81 = 1;
		}
		Static359.aClass169ArrayArrayArray5[0][arg0][arg1].aClass169_1 = local7;
		Static359.aClass169ArrayArrayArray5[3][arg0][arg1] = null;
	}
}
