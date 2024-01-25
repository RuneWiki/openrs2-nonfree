import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static500 {

	@OriginalMember(owner = "client!uv", name = "o", descriptor = "I")
	public static int anInt8480;

	@OriginalMember(owner = "client!uv", name = "g", descriptor = "Lclient!bu;")
	public static Class38 aClass38_71 = new Class38();

	@OriginalMember(owner = "client!uv", name = "j", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_134 = new Class6(81, -2);

	@OriginalMember(owner = "client!uv", name = "n", descriptor = "I")
	public static int anInt8479 = 0;

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(III)Z")
	public static boolean method7153(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(ILclient!vp;II)V")
	public static void method7155(@OriginalArg(0) int arg0, @OriginalArg(1) Class309 arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class23 local8 = arg1.method7389(Static478.aClass9_10);
		if (local8 == null) {
			return;
		}
		Static478.aClass9_10.N(arg2, arg0, arg1.anInt8790 + arg2, arg0 - -arg1.anInt8752);
		if (Static222.anInt4501 < 3) {
			Static151.aClass12_5.method7189((float) arg1.anInt8790 / 2.0F + (float) arg2, (float) arg1.anInt8752 / 2.0F + (float) arg0, ((int) -Static443.aFloat151 & 0x3FFF) << 2, local8, arg2, arg0);
		} else {
			Static478.aClass9_10.G(-16777216, local8, arg2, arg0);
		}
	}
}
