import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!ega", name = "k", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray15;

	@OriginalMember(owner = "client!ega", name = "m", descriptor = "F")
	public static float aFloat63;

	@OriginalMember(owner = "client!ega", name = "d", descriptor = "[Lclient!qq;")
	public static final Class274[] aClass274Array1 = new Class274[2048];

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(ILclient!kp;II)V")
	public static void method1773(@OriginalArg(1) Class196 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == null) {
			return;
		}
		if (arg0.anObjectArray13 != null) {
			@Pc(13) Class2_Sub31 local13 = new Class2_Sub31();
			local13.anObjectArray32 = arg0.anObjectArray13;
			local13.aClass196_4 = arg0;
			Static552.method7490(local13);
		}
		Static510.anInt8520 = arg0.anInt5152;
		Static242.anInt4524 = arg1;
		Static540.anInt8826 = arg0.anInt5116;
		Static371.anInt6556 = arg2;
		Static25.aBoolean32 = true;
		Static428.anInt7337 = arg0.anInt5154;
		Static78.anInt9033 = arg0.anInt5138;
		Static514.anInt406 = arg0.anInt5112;
		Static515.method7134(arg0);
	}
}
