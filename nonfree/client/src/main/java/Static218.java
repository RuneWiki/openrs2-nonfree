import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static218 {

	@OriginalMember(owner = "client!is", name = "E", descriptor = "Z")
	public static boolean aBoolean249 = false;

	@OriginalMember(owner = "client!is", name = "F", descriptor = "[I")
	public static final int[] anIntArray285 = new int[50];

	@OriginalMember(owner = "client!is", name = "G", descriptor = "[F")
	public static final float[] aFloatArray28 = new float[16];

	@OriginalMember(owner = "client!is", name = "J", descriptor = "Lclient!iu;")
	public static final Class150 aClass150_98 = new Class150(57, 7);

	@OriginalMember(owner = "client!is", name = "K", descriptor = "Z")
	public static boolean aBoolean250 = false;

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(IZLclient!gp;IZII)V")
	public static void method3518(@OriginalArg(0) int arg0, @OriginalArg(2) Class117 arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		Static235.anInt4584 = 0;
		Static296.anInt5926 = arg0;
		Static289.anInt5853 = arg3;
		Static332.anInt6296 = 1;
		Static431.aBoolean537 = false;
		Static409.aClass117_173 = arg1;
		Static456.anInt7875 = Static290.aClass5_Sub15_Sub4_1.method6525() / arg2;
		if (Static456.anInt7875 < 1) {
			Static456.anInt7875 = 1;
		}
	}
}
