import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "Lclient!og;")
	public static Class2_Sub3 aClass2_Sub3_2;

	@OriginalMember(owner = "client!ig", name = "h", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_641 = Static158.method3034("M");

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "Lclient!ob;")
	public static Class60 aClass60_640 = aClass60_641;

	@OriginalMember(owner = "client!ig", name = "g", descriptor = "Z")
	public static final boolean aBoolean95 = false;

	@OriginalMember(owner = "client!ig", name = "i", descriptor = "Lclient!ob;")
	public static Class60 aClass60_642 = null;

	@OriginalMember(owner = "client!ig", name = "j", descriptor = "I")
	public static int anInt2366 = 0;

	@OriginalMember(owner = "client!ig", name = "k", descriptor = "Lclient!ob;")
	public static Class60 aClass60_643 = aClass60_641;

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(II)Lclient!ic;")
	public static Class2_Sub1_Sub13 method1888(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub1_Sub13 local10 = (Class2_Sub1_Sub13) Static83.aClass89_25.method3437((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(31) byte[] local31 = Static107.aClass13_21.method521(Static17.method429(arg0), Static40.method908(arg0));
		local10 = new Class2_Sub1_Sub13();
		if (local31 != null) {
			local10.method1852(new Class2_Sub3(local31));
		}
		Static83.aClass89_25.method3432(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V")
	public static void method1889() {
		if (!Static172.aBoolean166) {
			return;
		}
		Static78.anIntArray265 = null;
		Static101.anIntArray335 = null;
		Static118.anIntArray374 = null;
		Static197.aClass2_Sub1_Sub7_Sub2Array10 = null;
		Static76.aClass2_Sub1_Sub7_Sub2Array6 = null;
		Static11.aClass2_Sub1_Sub7_Sub4_4 = null;
		Static84.aClass2_Sub1_Sub7_Sub2Array7 = null;
		Static174.anIntArray462 = null;
		Static181.aClass2_Sub1_Sub7_Sub2Array9 = null;
		Static140.aClass2_Sub1_Sub7_Sub2_1 = null;
		Static54.aClass2_Sub1_Sub7_Sub4Array4 = null;
		Static128.anIntArray401 = null;
		Static9.anIntArray28 = null;
		Static142.aClass2_Sub1_Sub7_Sub2_2 = null;
		Static145.aClass2_Sub1_Sub7_Sub2_3 = null;
		Static191.aClass2_Sub1_Sub7_Sub2_4 = null;
		Static123.anIntArray392 = null;
		Static48.aClass2_Sub1_Sub7_Sub2Array2 = null;
		Static131.aClass2_Sub1_Sub7_Sub4_2 = null;
		Static152.anIntArray320 = null;
		Static106.aClass2_Sub1_Sub7_Sub4_7 = null;
		Static97.aClass2_Sub1_Sub7_Sub4_5 = null;
		Static137.method2788();
		Static143.method2896(true);
		Static172.aBoolean166 = false;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIILclient!dg;)V")
	public static void method1891(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub1_Sub1_Sub3_Sub1 arg2) {
		if (arg2.anInt3270 == arg0 && arg0 != -1) {
			@Pc(85) Class2_Sub1_Sub5 local85 = Static103.method2357(arg0);
			@Pc(88) int local88 = local85.anInt794;
			if (local88 == 1) {
				arg2.anInt3281 = 0;
				arg2.anInt3290 = 0;
				arg2.anInt3261 = 0;
				arg2.anInt3280 = arg1;
				Static9.method258(arg2.anInt3302, local85, arg2.anInt3290, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1 == arg2, arg2.anInt3273);
			}
			if (local88 == 2) {
				arg2.anInt3281 = 0;
			}
		} else if (arg0 == -1 || arg2.anInt3270 == -1 || Static103.method2357(arg0).anInt786 >= Static103.method2357(arg2.anInt3270).anInt786) {
			arg2.anInt3280 = arg1;
			arg2.anInt3290 = 0;
			arg2.anInt3281 = 0;
			arg2.anInt3261 = 0;
			arg2.anInt3305 = arg2.anInt3254;
			arg2.anInt3270 = arg0;
			if (arg2.anInt3270 == -1) {
				return;
			}
			Static9.method258(arg2.anInt3302, Static103.method2357(arg2.anInt3270), arg2.anInt3290, arg2 == Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1, arg2.anInt3273);
		}
	}
}
