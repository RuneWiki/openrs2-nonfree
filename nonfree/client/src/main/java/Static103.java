import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!kd", name = "u", descriptor = "Lclient!hh;")
	public static Class42 aClass42_2;

	@OriginalMember(owner = "client!kd", name = "yb", descriptor = "I")
	public static int anInt2276;

	@OriginalMember(owner = "client!kd", name = "o", descriptor = "I")
	public static int anInt2221 = 0;

	@OriginalMember(owner = "client!kd", name = "E", descriptor = "[I")
	public static final int[] anIntArray204 = new int[32];

	@OriginalMember(owner = "client!kd", name = "V", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_773 = Static151.method2243("nicht hergestellt werden)3");

	@OriginalMember(owner = "client!kd", name = "bb", descriptor = "Lclient!bg;")
	public static final Class13 aClass13_6 = new Class13();

	@OriginalMember(owner = "client!kd", name = "db", descriptor = "Z")
	public static final boolean aBoolean107 = false;

	@OriginalMember(owner = "client!kd", name = "Ab", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_774 = Static151.method2243(":tradereq:");

	@OriginalMember(owner = "client!kd", name = "h", descriptor = "(I)V")
	public static void method1555() {
		Static78.anInt1622 = -1;
		Static51.anInt1111 = 0;
		Static49.anInt1076 = -1;
		Static180.aBoolean167 = false;
		Static35.anInt838 = 0;
		Static102.anInt2333 = -1;
		Static11.anInt310 = 0;
		Static6.anInt182 = 0;
		Static158.anInt3381 = -1;
		Static58.aClass2_Sub11_Sub1_2.anInt2235 = 0;
		Static58.anInt1152 = 0;
		Static108.aClass2_Sub11_Sub1_3.anInt2235 = 0;
		Static124.anInt2732 = 0;
		for (@Pc(35) int local35 = 0; local35 < Static62.aClass7_Sub2_Sub2Array1.length; local35++) {
			if (Static62.aClass7_Sub2_Sub2Array1[local35] != null) {
				Static62.aClass7_Sub2_Sub2Array1[local35].anInt3067 = -1;
			}
		}
		for (@Pc(57) int local57 = 0; local57 < Static9.aClass7_Sub2_Sub1Array1.length; local57++) {
			if (Static9.aClass7_Sub2_Sub1Array1[local57] != null) {
				Static9.aClass7_Sub2_Sub1Array1[local57].anInt3067 = -1;
			}
		}
		Static38.method2170();
		Static2.method55(30);
		for (@Pc(86) int local86 = 0; local86 < 100; local86++) {
			Static176.aBooleanArray19[local86] = true;
		}
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "([BIII)I")
	public static int method1561(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = -1;
		for (@Pc(5) int local5 = arg2; local5 < arg1; local5++) {
			local3 = local3 >>> 8 ^ Class28.anIntArray83[(local3 ^ arg0[local5]) & 0xFF];
		}
		return ~local3;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(III)I")
	public static int method1576(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(45) int local45 = Static214.method3138(4, arg1 + 91923, arg0 + 45365) + (Static214.method3138(2, arg1 + 37821, arg0 + 10294) + -128 >> 1) + (Static214.method3138(1, arg1, arg0) + -128 >> 2) - 128;
		local45 = (int) ((double) local45 * 0.3D) + 35;
		if (local45 < 10) {
			local45 = 10;
		} else if (local45 > 60) {
			local45 = 60;
		}
		return local45;
	}
}
