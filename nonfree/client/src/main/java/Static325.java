import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static325 {

	@OriginalMember(owner = "client!uo", name = "j", descriptor = "Z")
	public static boolean aBoolean452;

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "Lclient!ik;")
	public static final Class103 aClass103_64 = new Class103(64);

	@OriginalMember(owner = "client!uo", name = "f", descriptor = "I")
	public static int anInt6173 = 104;

	@OriginalMember(owner = "client!uo", name = "i", descriptor = "[I")
	public static final int[] anIntArray783 = new int[5];

	@OriginalMember(owner = "client!uo", name = "l", descriptor = "I")
	public static int anInt6177 = 0;

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(III)V")
	public static void method5214(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static264.method4436(arg1)) {
			Static232.method4066(arg0, Static298.aClass26ArrayArray1[arg1]);
		}
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(II)I")
	public static int method5215(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}
}
