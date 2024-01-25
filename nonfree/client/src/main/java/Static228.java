import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!io", name = "a", descriptor = "[I")
	public static int[] anIntArray130;

	@OriginalMember(owner = "client!io", name = "b", descriptor = "Lclient!daa;")
	public static Class58 aClass58_5;

	@OriginalMember(owner = "client!io", name = "d", descriptor = "[I")
	public static int[] anIntArray131;

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(III)V")
	public static void method1799(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static554.aClass63ArrayArrayArray4[0][arg1][arg2] != null && Static554.aClass63ArrayArrayArray4[0][arg1][arg2].aClass63_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static554.aClass63ArrayArrayArray4[local22][arg1][arg2] == null) {
				@Pc(44) Class63 local44 = Static554.aClass63ArrayArrayArray4[local22][arg1][arg2] = new Class63(local22);
				if (local20) {
					local44.aByte37++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IIIILclient!us;I)Lclient!dea;")
	public static Class34_Sub2_Sub1 method1802(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class43_Sub3 arg3, @OriginalArg(5) int arg4) {
		if (arg3.aBoolean689 || Static159.method2855(arg0) && Static159.method2855(arg2)) {
			return new Class34_Sub2_Sub1(arg3, 3553, arg1, arg4, arg0, arg2, true);
		} else if (arg3.aBoolean667) {
			return new Class34_Sub2_Sub1(arg3, 34037, arg1, arg4, arg0, arg2, true);
		} else {
			return new Class34_Sub2_Sub1(arg3, arg1, arg4, arg0, arg2, Static114.method2375(arg0), Static114.method2375(arg2), true);
		}
	}
}
