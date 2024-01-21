import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!tb", name = "I", descriptor = "[Lclient!k;")
	public static Class2_Sub1_Sub4_Sub2[] aClass2_Sub1_Sub4_Sub2Array9;

	@OriginalMember(owner = "client!tb", name = "t", descriptor = "Lclient!jb;")
	public static Class40 aClass40_21 = new Class40(8);

	@OriginalMember(owner = "client!tb", name = "v", descriptor = "I")
	public static int anInt2513 = -1;

	@OriginalMember(owner = "client!tb", name = "y", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1065 = Static119.method1462("Bitte warten Sie)3)3)3");

	@OriginalMember(owner = "client!tb", name = "F", descriptor = "Lclient!pe;")
	private static Class65 aClass65_1066 = Static119.method1462("Checking for updates )2 ");

	@OriginalMember(owner = "client!tb", name = "H", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1067 = aClass65_1066;

	@OriginalMember(owner = "client!tb", name = "J", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1068 = Static119.method1462(" Sekunde(Xn(Y -Ubertragen)3");

	@OriginalMember(owner = "client!tb", name = "K", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1069 = Static119.method1462("Nehmen");

	@OriginalMember(owner = "client!tb", name = "M", descriptor = "I")
	public static int anInt2518 = 0;

	@OriginalMember(owner = "client!tb", name = "N", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1070 = Static119.method1462("::errortest");

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "([BI)[B")
	public static byte[] method1818(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class2_Sub4 local4 = new Class2_Sub4(arg0);
		@Pc(8) int local8 = local4.method933();
		@Pc(19) int local19 = local4.method903();
		if (local19 < 0 || Static33.anInt760 != 0 && local19 > Static33.anInt760) {
			throw new RuntimeException();
		} else if (local8 == 0) {
			@Pc(45) byte[] local45 = new byte[local19];
			local4.method910(local45, local19);
			return local45;
		} else {
			@Pc(57) int local57 = local4.method903();
			if (local57 < 0 || Static33.anInt760 != 0 && local57 > Static33.anInt760) {
				throw new RuntimeException();
			}
			@Pc(77) byte[] local77 = new byte[local57];
			if (local8 == 1) {
				Static31.method616(local77, local57, arg0, local19);
			} else {
				Static61.aClass17_1.method357(local77, local4);
			}
			return local77;
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IB)Lclient!da;")
	public static Class2_Sub1_Sub3 method1819(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub1_Sub3 local10 = (Class2_Sub1_Sub3) Static102.aClass8_51.method172((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static26.aClass56_12.method1666(arg0, 1);
		local10 = new Class2_Sub1_Sub3();
		if (local20 != null) {
			local10.method340(arg0, new Class2_Sub4(local20));
		}
		local10.method339();
		Static102.aClass8_51.method176((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Z)V")
	public static void method1820() {
		aClass65_1069 = null;
		aClass2_Sub1_Sub4_Sub2Array9 = null;
		aClass65_1066 = null;
		aClass65_1070 = null;
		aClass65_1065 = null;
		aClass65_1067 = null;
		aClass65_1068 = null;
		aClass40_21 = null;
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(Z)I")
	public static int method1821() {
		return Static10.anInt2956++;
	}
}
