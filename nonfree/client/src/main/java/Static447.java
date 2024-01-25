import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static447 {

	@OriginalMember(owner = "client!sn", name = "l", descriptor = "I")
	public static int anInt8185;

	@OriginalMember(owner = "client!sn", name = "n", descriptor = "I")
	public static int anInt8186;

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "[I")
	public static final int[] anIntArray693 = new int[4];

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "Lclient!kp;")
	public static final Class167 aClass167_13 = new Class167(1);

	@OriginalMember(owner = "client!sn", name = "h", descriptor = "[I")
	public static final int[] anIntArray694 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!sn", name = "i", descriptor = "[I")
	public static final int[] anIntArray695 = new int[3];

	@OriginalMember(owner = "client!sn", name = "k", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_148 = new Class133(104, 19);

	@OriginalMember(owner = "client!sn", name = "m", descriptor = "Lclient!sd;")
	public static final Class267 aClass267_39 = new Class267(512);

	@OriginalMember(owner = "client!sn", name = "p", descriptor = "[I")
	public static final int[] anIntArray696 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIIII)V")
	public static void method6781(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) int local10;
		if (arg0 >= arg3) {
			for (local10 = arg3; local10 < arg0; local10++) {
				Static68.anIntArrayArray24[local10][arg2] = arg1;
			}
		} else {
			for (local10 = arg0; local10 < arg3; local10++) {
				Static68.anIntArrayArray24[local10][arg2] = arg1;
			}
		}
	}
}
