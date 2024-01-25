import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!hga", name = "q", descriptor = "I")
	public static int anInt4376;

	@OriginalMember(owner = "client!hga", name = "n", descriptor = "I")
	public static int anInt4381;

	@OriginalMember(owner = "client!hga", name = "r", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_66 = new Class322(13, 1);

	@OriginalMember(owner = "client!hga", name = "o", descriptor = "I")
	public static int anInt4380 = 100;

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(IIZIIIIII)Z")
	public static boolean method4038(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		@Pc(8) int local8 = Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anIntArray263[0];
		@Pc(13) int local13 = Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anIntArray264[0];
		if (local8 < 0 || local8 >= Static29.anInt380 || local13 < 0 || Static327.anInt5650 <= local13) {
			return false;
		} else if (arg4 >= 0 && Static29.anInt380 > arg4 && arg5 >= 0 && Static327.anInt5650 > arg5) {
			@Pc(96) int local96 = Static475.method7128(arg7, Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.method4424((byte) -28), local13, local8, arg4, Static381.anIntArray381, Static657.anIntArray685, arg0, Static669.aClass356Array1[Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.aByte135], arg1, arg2, arg6, arg3, arg5);
			if (local96 < 1) {
				return false;
			}
			Static97.anInt1434 = Static381.anIntArray381[local96 - 1];
			Static208.anInt4167 = Static657.anIntArray685[local96 - 1];
			Static566.aBoolean645 = false;
			Static202.method3751();
			return true;
		} else {
			return false;
		}
	}
}
