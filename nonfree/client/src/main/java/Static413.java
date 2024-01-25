import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static413 {

	@OriginalMember(owner = "client!or", name = "Q", descriptor = "Lclient!lga;")
	public static final Class185 aClass185_85 = new Class185(2, -1);

	@OriginalMember(owner = "client!or", name = "X", descriptor = "[I")
	public static final int[] anIntArray383 = new int[1000];

	@OriginalMember(owner = "client!or", name = "qb", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_139 = new Class73(55, -1);

	@OriginalMember(owner = "client!or", name = "b", descriptor = "(I)V")
	public static void method6487() {
		@Pc(13) Class6_Sub22 local13 = (Class6_Sub22) Static313.aClass163_35.method4966();
		@Pc(24) boolean local24 = Static448.aClass302_13 != null || Static517.anInt9024 > 0;
		@Pc(28) int local28 = local13.method3462();
		@Pc(32) int local32 = local13.method3458();
		if (local24) {
			Static632.anInt10598 = 1;
		}
		if (local24) {
			Static592.aClass6_Sub5_Sub9_4 = Static469.aClass6_Sub5_Sub9_2;
		} else {
			Static533.method7562(local32, local28, Static469.aClass6_Sub5_Sub9_2);
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(IIIII)V")
	public static void method6488(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < Static588.anInt9948; local7++) {
			@Pc(13) Rectangle local13 = Class6_Sub38.aRectangleArray1[local7];
			if (arg2 < local13.width + local13.x && local13.x < arg1 + arg2 && arg3 < local13.y + local13.height && arg0 + arg3 > local13.y) {
				Static366.aBooleanArray16[local7] = true;
			}
		}
		Static215.method3836(arg0 + arg3, arg3, arg2, arg1 + arg2);
	}
}
