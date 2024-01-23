import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static39 {

	@OriginalMember(owner = "client!dc", name = "w", descriptor = "I")
	public static int anInt727;

	@OriginalMember(owner = "client!dc", name = "I", descriptor = "Lclient!pc;")
	public static Class2_Sub21_Sub2 aClass2_Sub21_Sub2_1;

	@OriginalMember(owner = "client!dc", name = "J", descriptor = "Lclient!oe;")
	public static Class72 aClass72_48;

	@OriginalMember(owner = "client!dc", name = "E", descriptor = "Lclient!qe;")
	private static Class78 aClass78_135 = Static199.method3560("flash2:");

	@OriginalMember(owner = "client!dc", name = "y", descriptor = "Lclient!qe;")
	public static Class78 aClass78_133 = aClass78_135;

	@OriginalMember(owner = "client!dc", name = "A", descriptor = "Lclient!wc;")
	public static Class110 aClass110_3 = new Class110(64);

	@OriginalMember(owner = "client!dc", name = "C", descriptor = "Lclient!qe;")
	public static Class78 aClass78_134 = Static199.method3560("hint_mapedge");

	@OriginalMember(owner = "client!dc", name = "H", descriptor = "Lclient!qe;")
	public static Class78 aClass78_136 = aClass78_135;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!oe;Z)Z")
	public static boolean method528(@OriginalArg(0) Class72 arg0) {
		return arg0.method3175(Static170.anInt3940);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IBLclient!oe;)Lclient!gd;")
	public static Class2_Sub3_Sub8 method529(@OriginalArg(0) int arg0, @OriginalArg(2) Class72 arg1) {
		return Static71.method1150(arg0, arg1) ? Static205.method549() : null;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIII)V")
	public static void method531(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static11.anInt311 == 0 || arg0 == 0 || Static143.anInt3258 >= 50 || arg2 == -1) {
			return;
		}
		Static126.anIntArray474[Static143.anInt3258] = arg2;
		Static201.anIntArray726[Static143.anInt3258] = arg0;
		Static116.anIntArray449[Static143.anInt3258] = arg1;
		Static215.aClass66Array1[Static143.anInt3258] = null;
		Static25.anIntArray75[Static143.anInt3258] = 0;
		Static143.anInt3258++;
	}
}
