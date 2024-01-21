import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!ta", name = "u", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1055 = Static119.method1462(" <col=ffffff>");

	@OriginalMember(owner = "client!ta", name = "x", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1056 = null;

	@OriginalMember(owner = "client!ta", name = "y", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1057 = Static119.method1462("Ung-Ultiges Anmelde)2Paket)3");

	@OriginalMember(owner = "client!ta", name = "z", descriptor = "I")
	public static int anInt2491 = 0;

	@OriginalMember(owner = "client!ta", name = "A", descriptor = "I")
	public static int anInt2492 = 0;

	@OriginalMember(owner = "client!ta", name = "C", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1058 = Static119.method1462("");

	@OriginalMember(owner = "client!ta", name = "D", descriptor = "[I")
	public static int[] anIntArray331 = new int[128];

	@OriginalMember(owner = "client!ta", name = "M", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1059 = Static119.method1462("Null");

	@OriginalMember(owner = "client!ta", name = "O", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1060 = Static119.method1462(":duelreq:");

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)Z")
	public static boolean method1809(@OriginalArg(1) int arg0) {
		return (arg0 >> 20 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILclient!pe;Lclient!be;)I")
	public static int method1810(@OriginalArg(1) Class65 arg0, @OriginalArg(2) Class2_Sub4 arg1) {
		@Pc(6) int local6 = arg1.anInt1298;
		arg1.method942(arg0.anInt2005);
		arg1.anInt1298 += Static76.aClass14_1.method281(arg0.anInt2005, arg1.aByteArray20, arg1.anInt1298, arg0.aByteArray27, 0);
		return arg1.anInt1298 - local6;
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(I)V")
	public static void method1811() {
		aClass65_1057 = null;
		anIntArray331 = null;
		aClass65_1056 = null;
		aClass65_1055 = null;
		aClass65_1059 = null;
		aClass65_1058 = null;
		aClass65_1060 = null;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(BLclient!ub;)V")
	public static void method1812(@OriginalArg(1) Class2_Sub1_Sub1_Sub4 arg0) {
		arg0.aBoolean78 = false;
		@Pc(14) Class2_Sub1_Sub2 local14;
		if (arg0.anInt1920 != -1) {
			local14 = Static23.method1313(arg0.anInt1920);
			if (local14 == null || local14.anIntArray19 == null) {
				arg0.anInt1920 = -1;
			} else {
				arg0.anInt1974++;
				if (local14.anIntArray19.length > arg0.anInt1926 && local14.anIntArray21[arg0.anInt1926] < arg0.anInt1974) {
					arg0.anInt1974 = 1;
					arg0.anInt1926++;
					Static2.method62(arg0.anInt1926, arg0.anInt1958, local14, arg0.anInt1948);
				}
				if (arg0.anInt1926 >= local14.anIntArray19.length) {
					arg0.anInt1926 = 0;
					arg0.anInt1974 = 0;
					Static2.method62(arg0.anInt1926, arg0.anInt1958, local14, arg0.anInt1948);
				}
			}
		}
		if (arg0.anInt1975 != -1 && Static10.anInt2951 >= arg0.anInt1916) {
			if (arg0.anInt1924 < 0) {
				arg0.anInt1924 = 0;
			}
			@Pc(114) int local114 = Static69.method1228(arg0.anInt1975).anInt1625;
			if (local114 == -1) {
				arg0.anInt1975 = -1;
			} else {
				@Pc(127) Class2_Sub1_Sub2 local127 = Static23.method1313(local114);
				if (local127 == null || local127.anIntArray19 == null) {
					arg0.anInt1975 = -1;
				} else {
					arg0.anInt1937++;
					if (local127.anIntArray19.length > arg0.anInt1924 && local127.anIntArray21[arg0.anInt1924] < arg0.anInt1937) {
						arg0.anInt1924++;
						arg0.anInt1937 = 1;
						Static2.method62(arg0.anInt1924, arg0.anInt1958, local127, arg0.anInt1948);
					}
					if (local127.anIntArray19.length <= arg0.anInt1924 && (arg0.anInt1924 < 0 || arg0.anInt1924 >= local127.anIntArray19.length)) {
						arg0.anInt1975 = -1;
					}
				}
			}
		}
		if (arg0.anInt1972 != -1 && arg0.anInt1936 <= 1) {
			local14 = Static23.method1313(arg0.anInt1972);
			if (local14.anInt165 == 1 && arg0.anInt1961 > 0 && Static10.anInt2951 >= arg0.anInt1963 && Static10.anInt2951 > arg0.anInt1928) {
				arg0.anInt1936 = 1;
				return;
			}
		}
		if (arg0.anInt1972 != -1 && arg0.anInt1936 == 0) {
			local14 = Static23.method1313(arg0.anInt1972);
			if (local14 == null || local14.anIntArray19 == null) {
				arg0.anInt1972 = -1;
			} else {
				arg0.anInt1938++;
				if (arg0.anInt1970 < local14.anIntArray19.length && local14.anIntArray21[arg0.anInt1970] < arg0.anInt1938) {
					arg0.anInt1970++;
					arg0.anInt1938 = 1;
					Static2.method62(arg0.anInt1970, arg0.anInt1958, local14, arg0.anInt1948);
				}
				if (arg0.anInt1970 >= local14.anIntArray19.length) {
					arg0.anInt1970 -= local14.anInt160;
					arg0.anInt1922++;
					if (local14.anInt170 <= arg0.anInt1922) {
						arg0.anInt1972 = -1;
					} else if (arg0.anInt1970 >= 0 && local14.anIntArray19.length > arg0.anInt1970) {
						Static2.method62(arg0.anInt1970, arg0.anInt1958, local14, arg0.anInt1948);
					} else {
						arg0.anInt1972 = -1;
					}
				}
				arg0.aBoolean78 = local14.aBoolean9;
			}
		}
		if (arg0.anInt1936 > 0) {
			arg0.anInt1936--;
		}
	}
}
