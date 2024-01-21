import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!eh", name = "T", descriptor = "Lclient!pi;")
	public static Class67 aClass67_3 = new Class67();

	@OriginalMember(owner = "client!eh", name = "V", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_351 = Static158.method3034("green:");

	@OriginalMember(owner = "client!eh", name = "W", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_352 = Static158.method3034("Schrifts-=tze geladen)3");

	@OriginalMember(owner = "client!eh", name = "X", descriptor = "Lclient!ob;")
	public static Class60 aClass60_353 = aClass60_351;

	@OriginalMember(owner = "client!eh", name = "Y", descriptor = "[I")
	public static final int[] anIntArray144 = new int[50];

	@OriginalMember(owner = "client!eh", name = "Z", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_354 = aClass60_351;

	@OriginalMember(owner = "client!eh", name = "ab", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_355 = Static158.method3034("");

	@OriginalMember(owner = "client!eh", name = "bb", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_356 = Static158.method3034("Please subscribe)1 or use a different world)3");

	@OriginalMember(owner = "client!eh", name = "cb", descriptor = "Lclient!ob;")
	public static Class60 aClass60_357 = aClass60_356;

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(ILclient!pe;)V")
	public static void method1126(@OriginalArg(1) Class13 arg0) {
		Static194.aClass13_39 = arg0;
		Static194.anInt4617 = Static194.aClass13_39.method513(16);
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIBI)I")
	public static int method1127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(4) int local4 = 256 - arg0;
		return ((arg1 & 0xFF00FF) * local4 + (arg2 & 0xFF00FF) * arg0 & 0xFF00FF00) + ((arg2 & 0xFF00) * arg0 + local4 * (arg1 & 0xFF00) & 0xFF0000) >> 8;
	}
}
