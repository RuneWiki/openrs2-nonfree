import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!t", name = "n", descriptor = "I")
	public static int anInt4422;

	@OriginalMember(owner = "client!t", name = "a", descriptor = "Lclient!qe;")
	public static Class78 aClass78_753 = Static199.method3560("loginscreen");

	@OriginalMember(owner = "client!t", name = "g", descriptor = "Lclient!qe;")
	private static Class78 aClass78_754 = Static199.method3560("slide:");

	@OriginalMember(owner = "client!t", name = "h", descriptor = "Lclient!qe;")
	public static Class78 aClass78_755 = aClass78_754;

	@OriginalMember(owner = "client!t", name = "i", descriptor = "Lclient!qe;")
	public static Class78 aClass78_756 = aClass78_754;

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IBILclient!oe;)Lclient!gd;")
	public static Class2_Sub3_Sub8 method3496(@OriginalArg(0) int arg0, @OriginalArg(3) Class72 arg1) {
		return Static55.method713(arg0, arg1) ? Static205.method549() : null;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IIZ)V")
	public static void method3497(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int[] local4 = new int[4];
		@Pc(11) int[] local11 = new int[4];
		local4[0] = arg0;
		local11[0] = arg1;
		@Pc(21) int local21 = 1;
		for (@Pc(28) int local28 = 0; local28 < 4; local28++) {
			if (arg0 != Static154.anIntArray576[local28]) {
				local4[local21] = Static154.anIntArray576[local28];
				local11[local21] = Static55.anIntArray155[local28];
				local21++;
			}
		}
		Static154.anIntArray576 = local4;
		Static55.anIntArray155 = local11;
		Static69.method1123(0, Static132.aClass9Array1, Static132.aClass9Array1.length - 1);
	}
}
