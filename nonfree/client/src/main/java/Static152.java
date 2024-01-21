import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!sf", name = "kb", descriptor = "I")
	public static int anInt3423;

	@OriginalMember(owner = "client!sf", name = "wb", descriptor = "[Lclient!wb;")
	public static Class2_Sub4_Sub3_Sub4[] aClass2_Sub4_Sub3_Sub4Array12;

	@OriginalMember(owner = "client!sf", name = "hb", descriptor = "I")
	public static int anInt3420 = 0;

	@OriginalMember(owner = "client!sf", name = "mb", descriptor = "I")
	public static int anInt3425 = 0;

	@OriginalMember(owner = "client!sf", name = "qb", descriptor = "Lclient!id;")
	public static Class35 aClass35_41 = new Class35(4096);

	@OriginalMember(owner = "client!sf", name = "sb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_2007 = Static107.method1838(": ");

	@OriginalMember(owner = "client!sf", name = "vb", descriptor = "[S")
	public static short[] aShortArray34 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!jc;II)Lclient!wb;")
	public static Class2_Sub4_Sub3_Sub4 method2360(@OriginalArg(0) Class40 arg0, @OriginalArg(2) int arg1) {
		return Static47.method1098(arg1, arg0) ? Static67.method1223() : null;
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(BI)Lclient!pc;")
	public static Class2_Sub4_Sub15 method2361(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub4_Sub15 local10 = (Class2_Sub4_Sub15) Static108.aClass14_138.method603((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(22) byte[] local22 = Static21.aClass40_9.method1771(16, arg0);
		local10 = new Class2_Sub4_Sub15();
		if (local22 != null) {
			local10.method2031(new Class2_Sub2(local22));
		}
		Static108.aClass14_138.method607((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!sf", name = "d", descriptor = "(B)V")
	public static void method2362() {
		aShortArray34 = null;
		aClass2_Sub4_Sub3_Sub4Array12 = null;
		aClass28_2007 = null;
		aClass35_41 = null;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IJ)V")
	public static void method2363(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static92.anInt2333 >= 100) {
			Static93.method1632(0, Static136.aClass28_1828, Static34.aClass28_566);
			return;
		}
		@Pc(27) Class28 local27 = Static83.method1479(arg0).method1115();
		for (@Pc(29) int local29 = 0; local29 < Static92.anInt2333; local29++) {
			if (Static11.aLongArray3[local29] == arg0) {
				Static93.method1632(0, Static136.aClass28_1828, Static83.method1481(new Class28[] { local27, Static168.aClass28_2244 }));
				return;
			}
		}
		for (@Pc(64) int local64 = 0; local64 < Static38.anInt1022; local64++) {
			if (Static77.aLongArray7[local64] == arg0) {
				Static93.method1632(0, Static136.aClass28_1828, Static83.method1481(new Class28[] { Static120.aClass28_1678, local27, Static151.aClass28_1983 }));
				return;
			}
		}
		if (local27.method1107(Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.aClass28_953)) {
			Static93.method1632(0, Static136.aClass28_1828, Static96.aClass28_1420);
			return;
		}
		Static11.aLongArray3[Static92.anInt2333] = arg0;
		Static127.aClass28Array42[Static92.anInt2333++] = Static83.method1479(arg0);
		Static30.anInt928 = Static70.anInt1853;
		Static128.aClass2_Sub2_Sub1_2.method1711(68);
		Static128.aClass2_Sub2_Sub1_2.method1666(arg0);
	}

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "(I)V")
	public static void method2364() {
		Static169.aClass14_190.method596();
		Static166.aClass14_187.method596();
	}
}
