import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!ba", name = "e", descriptor = "I")
	public static int anInt3439;

	@OriginalMember(owner = "client!ba", name = "g", descriptor = "I")
	public static int anInt3440;

	@OriginalMember(owner = "client!ba", name = "h", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray4;

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "Lclient!jh;")
	public static Class53 aClass53_13 = new Class53(5);

	@OriginalMember(owner = "client!ba", name = "i", descriptor = "Z")
	public static boolean aBoolean151 = true;

	@OriginalMember(owner = "client!ba", name = "m", descriptor = "Lclient!qe;")
	public static Class78 aClass78_627 = Static199.method3560(")4l=");

	@OriginalMember(owner = "client!ba", name = "o", descriptor = "[J")
	public static long[] aLongArray8 = new long[500];

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "([BI)Lclient!nc;")
	public static Class2_Sub3_Sub7 method2690(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(17) Class2_Sub3_Sub7_Sub1_Sub1 local17 = new Class2_Sub3_Sub7_Sub1_Sub1(arg0, Static186.anIntArray702, Static37.anIntArray108, Static113.anIntArray423, Static131.anIntArray489, Static31.aByteArrayArray3);
			Static28.method365();
			return local17;
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IBIII)V")
	public static void method2693(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 >= Static6.anInt187 && Static101.anInt2213 >= arg0) {
			@Pc(20) int local20 = Static80.method1342(arg2, Static73.anInt1576, Static137.anInt3137);
			@Pc(26) int local26 = Static80.method1342(arg3, Static73.anInt1576, Static137.anInt3137);
			Static121.method3983(local20, arg1, local26, arg0);
		}
	}
}
