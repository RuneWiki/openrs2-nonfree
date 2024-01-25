import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!fe", name = "eb", descriptor = "I")
	public static int anInt1963;

	@OriginalMember(owner = "client!fe", name = "fb", descriptor = "I")
	public static int anInt1964;

	@OriginalMember(owner = "client!fe", name = "r", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_57 = new Class129(102, 6);

	@OriginalMember(owner = "client!fe", name = "cb", descriptor = "Lclient!pn;")
	public static final Class194 aClass194_27 = new Class194(25, -1);

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(B[FI)[F")
	public static float[] method1582(@OriginalArg(1) float[] arg0, @OriginalArg(2) int arg1) {
		@Pc(6) float[] local6 = new float[arg1];
		Static468.method3863(arg0, 0, local6, 0, arg1);
		return local6;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IZIIZII)V")
	public static void method1593(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static295.anInt4630 = arg4;
		Static278.anInt4347 = arg2;
		Static321.anInt5003 = arg5;
		Static299.anInt4672 = arg3;
		Static378.anInt6253 = arg0;
		if (arg1 && Static321.anInt5003 >= 100) {
			Static116.anInt1977 = Static278.anInt4347 * 128 + 64;
			Static393.anInt4184 = Static299.anInt4672 * 128 + 64;
			Static444.anInt7360 = Static192.method2572(Static393.anInt4184, Static116.anInt1977, Static6.anInt131) - Static378.anInt6253;
		}
		Static449.anInt7379 = 2;
	}
}
