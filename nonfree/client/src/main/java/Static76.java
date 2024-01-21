import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!je", name = "e", descriptor = "Lclient!gf;")
	public static Class27 aClass27_1;

	@OriginalMember(owner = "client!je", name = "c", descriptor = "Lclient!sd;")
	public static Class73 aClass73_911 = Static122.method531("Mitglieder)2Welt");

	@OriginalMember(owner = "client!je", name = "d", descriptor = "Lclient!sd;")
	public static Class73 aClass73_912 = Static122.method531("leuchten3:");

	@OriginalMember(owner = "client!je", name = "o", descriptor = "I")
	public static int anInt1683 = 0;

	@OriginalMember(owner = "client!je", name = "p", descriptor = "I")
	public static int anInt1684 = 0;

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
	public static void method1294() {
		aClass27_1 = null;
		aClass73_911 = null;
		aClass73_912 = null;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!sd;I)Z")
	public static boolean method1296(@OriginalArg(0) Class73 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static166.anInt3619; local11++) {
			if (arg0.method2438(Static115.aClass73Array17[local11])) {
				return true;
			}
		}
		return arg0.method2438(Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.aClass73_1521);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(BLclient!ff;I)Lclient!sd;")
	public static Class73 method1297(@OriginalArg(1) Class3_Sub12 arg0) {
		try {
			@Pc(7) Class73 local7 = new Class73();
			local7.anInt3356 = arg0.method1379();
			if (local7.anInt3356 > 32767) {
				local7.anInt3356 = 32767;
			}
			local7.aByteArray36 = new byte[local7.anInt3356];
			arg0.anInt1793 += Static115.aClass58_1.method2068(local7.anInt3356, arg0.aByteArray16, arg0.anInt1793, 0, local7.aByteArray36);
			return local7;
		} catch (@Pc(52) Exception local52) {
			return Static138.aClass73_1754;
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(BI)Z")
	public static boolean method1299(@OriginalArg(1) int arg0) {
		return (arg0 >> 30 & 0x1) != 0;
	}
}
