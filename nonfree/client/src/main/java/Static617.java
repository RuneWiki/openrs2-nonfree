import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static617 {

	@OriginalMember(owner = "client!ur", name = "d", descriptor = "Lclient!si;")
	public static Class320 aClass320_1;

	@OriginalMember(owner = "client!ur", name = "h", descriptor = "I")
	public static int anInt9892;

	@OriginalMember(owner = "client!ur", name = "f", descriptor = "Lclient!gia;")
	public static final Class118 aClass118_7 = new Class118("game3", "Game 3", 2);

	@OriginalMember(owner = "client!ur", name = "g", descriptor = "Lclient!mga;")
	public static final Class218 aClass218_148 = new Class218(24, -1);

	@OriginalMember(owner = "client!ur", name = "i", descriptor = "I")
	public static int anInt9893 = 0;

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(ILclient!aj;IB)Lclient!eia;")
	public static Class88 method8708(@OriginalArg(1) Class15 arg0, @OriginalArg(2) int arg1) {
		@Pc(11) byte[] local11 = arg0.method517(0, arg1);
		return local11 == null ? null : new Class88(local11);
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIZIILclient!ha;ILjava/lang/String;)V")
	public static void method8709(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class13 arg4, @OriginalArg(7) String arg5) {
		if (Static445.aClass33_28 == null || Static311.aClass33_12 == null) {
			if (Static369.aClass15_97.method526(Static619.anInt10673) && Static369.aClass15_97.method526(Static412.anInt6584)) {
				Static445.aClass33_28 = arg4.method8465(Static682.method2754(Static369.aClass15_97, Static619.anInt10673, 0), true);
				@Pc(53) Class97 local53 = Static682.method2754(Static369.aClass15_97, Static412.anInt6584, 0);
				Static311.aClass33_12 = arg4.method8465(local53, true);
				local53.method2746();
				Static631.aClass33_34 = arg4.method8465(local53, true);
			} else {
				arg4.aa(arg3, arg0, arg1, 20, Static20.anInt7796 | 255 - Static670.anInt9432 << 24, 1);
			}
		}
		if (Static445.aClass33_28 != null && Static311.aClass33_12 != null) {
			@Pc(80) int local80 = (arg1 - Static311.aClass33_12.method7659() * 2) / Static445.aClass33_28.method7659();
			for (@Pc(82) int local82 = 0; local82 < local80; local82++) {
				Static445.aClass33_28.method7654(arg3 + Static311.aClass33_12.method7659() + Static445.aClass33_28.method7659() * local82, arg0);
			}
			Static311.aClass33_12.method7654(arg3, arg0);
			Static631.aClass33_34.method7654(arg3 + arg1 - Static631.aClass33_34.method7659(), arg0);
		}
		Static303.aClass69_6.method8862(arg0 + 14, -1, arg5, Static175.anInt3464 | 0xFF000000, arg3 + 3);
		arg4.aa(arg3, arg0 + 20, arg1, arg2 - 20, -Static670.anInt9432 + 255 << 24 | Static20.anInt7796, 1);
	}
}
