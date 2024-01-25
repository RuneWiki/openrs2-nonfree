import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static526 {

	@OriginalMember(owner = "client!waa", name = "Fb", descriptor = "Lclient!og;")
	public static Class216 aClass216_1;

	@OriginalMember(owner = "client!waa", name = "sb", descriptor = "Lclient!uda;")
	public static final Class292 aClass292_15 = new Class292(1);

	@OriginalMember(owner = "client!waa", name = "n", descriptor = "(I)V")
	public static void method7299() {
		@Pc(7) int local7 = Static190.anInt3385;
		@Pc(14) int[] local14 = Static502.anIntArray771;
		for (@Pc(16) int local16 = 0; local16 < local7; local16++) {
			@Pc(24) Class49_Sub2_Sub2_Sub1 local24 = Static349.aClass49_Sub2_Sub2_Sub1Array1[local14[local16]];
			if (local24 != null && local24.anInt4332 > 0) {
				local24.anInt4332--;
				if (local24.anInt4332 == 0) {
					local24.aString40 = null;
				}
			}
		}
		for (@Pc(54) int local54 = 0; local54 < Static157.anInt4503; local54++) {
			@Pc(61) long local61 = (long) Static427.anIntArray711[local54];
			@Pc(67) Class1_Sub17 local67 = (Class1_Sub17) Static380.aClass17_29.method738(local61);
			if (local67 != null) {
				@Pc(72) Class49_Sub2_Sub2_Sub2 local72 = local67.aClass49_Sub2_Sub2_Sub2_2;
				if (local72.anInt4332 > 0) {
					local72.anInt4332--;
					if (local72.anInt4332 == 0) {
						local72.aString40 = null;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "([IZIZLclient!uq;I)Lclient!em;")
	public static Class73_Sub1_Sub1 method7301(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Class122_Sub3 arg2, @OriginalArg(5) int arg3) {
		if (arg2.aBoolean575 || Static535.method7411(arg3) && Static535.method7411(arg1)) {
			return new Class73_Sub1_Sub1(arg2, 3553, arg3, arg1, false, arg0);
		} else if (arg2.aBoolean579) {
			return new Class73_Sub1_Sub1(arg2, 34037, arg3, arg1, false, arg0);
		} else {
			return new Class73_Sub1_Sub1(arg2, arg3, arg1, Static352.method5306(arg3), Static352.method5306(arg1), arg0);
		}
	}
}
