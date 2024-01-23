import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!db", name = "J", descriptor = "[Lclient!ph;")
	public static Class36_Sub3_Sub2[] aClass36_Sub3_Sub2Array1 = new Class36_Sub3_Sub2[32768];

	@OriginalMember(owner = "client!db", name = "L", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray17 = new String[100];

	@OriginalMember(owner = "client!db", name = "R", descriptor = "Ljava/lang/String;")
	public static String aString40 = "Face here";

	@OriginalMember(owner = "client!db", name = "U", descriptor = "Z")
	public static boolean aBoolean74 = false;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(II)V")
	public static void method768(@OriginalArg(0) int arg0) {
		if (Static88.anIntArray128 == null || Static88.anIntArray128.length < arg0) {
			Static88.anIntArray128 = new int[arg0];
		}
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(II)I")
	public static int method769(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIZFZII)[I")
	public static int[] method770(@OriginalArg(4) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(22) Class8_Sub3_Sub35 local22 = new Class8_Sub3_Sub35();
		local22.anInt5063 = 8;
		local22.anInt5068 = 4;
		local22.anInt5064 = 8;
		local22.aBoolean409 = true;
		local22.anInt5054 = (int) (arg0 * 4096.0F);
		local22.anInt5062 = 35;
		local22.method4220();
		Static58.method1723(1, 2048);
		local22.method3848(local6, 0);
		return local6;
	}
}
