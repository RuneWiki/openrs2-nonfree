import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static206 {

	@OriginalMember(owner = "client!na", name = "u", descriptor = "Lclient!ne;")
	public static Class146 aClass146_60;

	@OriginalMember(owner = "client!na", name = "H", descriptor = "F")
	public static float aFloat147;

	@OriginalMember(owner = "client!na", name = "I", descriptor = "I")
	public static int anInt6742;

	@OriginalMember(owner = "client!na", name = "l", descriptor = "[[I")
	public static final int[][] anIntArrayArray98 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!na", name = "w", descriptor = "Ljava/lang/String;")
	public static String aString252 = "Loaded client variable data";

	@OriginalMember(owner = "client!na", name = "A", descriptor = "Lclient!al;")
	public static final Class11 aClass11_144 = new Class11(5);

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIII)V")
	public static void method5996(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static59.anInt1436 = arg1;
		Static329.anInt6344 = arg2;
		Static339.anInt2493 = arg0;
		Static175.anInt3620 = arg3;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!no;B)Ljava/lang/String;")
	public static String method6002(@OriginalArg(0) Class14_Sub23 arg0) {
		return arg0.aString155 == null || arg0.aString155.length() <= 0 ? arg0.aString154 : arg0.aString154 + Static265.aString190 + arg0.aString155;
	}
}
