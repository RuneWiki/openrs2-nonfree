import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static57 {

	@OriginalMember(owner = "client!cm", name = "q", descriptor = "F")
	public static float aFloat13;

	@OriginalMember(owner = "client!cm", name = "r", descriptor = "J")
	public static long aLong39;

	@OriginalMember(owner = "client!cm", name = "k", descriptor = "Lclient!lb;")
	public static final Class151 aClass151_2 = new Class151("WTWIP", 3);

	@OriginalMember(owner = "client!cm", name = "o", descriptor = "[F")
	public static final float[] aFloatArray6 = new float[4];

	@OriginalMember(owner = "client!cm", name = "p", descriptor = "[I")
	public static final int[] anIntArray91 = new int[1024];

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(ZILclient!gh;I)V")
	public static void method1016(@OriginalArg(1) int arg0, @OriginalArg(2) Class89 arg1, @OriginalArg(3) int arg2) {
		if (Static458.aClass89_14 != null || Static35.aBoolean37 || (arg1 == null || Static229.method3415(arg1) == null)) {
			return;
		}
		Static458.aClass89_14 = arg1;
		Static67.aClass89_2 = Static229.method3415(arg1);
		Static233.anInt4304 = 0;
		Static200.anInt3972 = arg2;
		Static182.anInt3704 = arg0;
		Static95.aBoolean121 = false;
	}
}
