import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "m", descriptor = "I")
	public static int anInt6;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "Lclient!le;")
	public static Class36 aClass36_1 = new Class36(500);

	@OriginalMember(owner = "client!a", name = "d", descriptor = "I")
	public static int anInt3 = -1;

	@OriginalMember(owner = "client!a", name = "f", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1 = Static34.method846("Untersuchen");

	@OriginalMember(owner = "client!a", name = "g", descriptor = "Lclient!rc;")
	public static Class55 aClass55_2 = Static34.method846("Verbindung abgebrochen)3");

	@OriginalMember(owner = "client!a", name = "h", descriptor = "Lclient!rc;")
	public static Class55 aClass55_3 = Static34.method846("Lade Eingabe)2Steuerungsprogramm)3)3)3");

	@OriginalMember(owner = "client!a", name = "i", descriptor = "I")
	public static int anInt5 = 0;

	@OriginalMember(owner = "client!a", name = "j", descriptor = "Lclient!rc;")
	public static Class55 aClass55_4 = Static34.method846("blinken2:");

	@OriginalMember(owner = "client!a", name = "k", descriptor = "Lclient!rc;")
	public static Class55 aClass55_5 = Static34.method846(")2");

	@OriginalMember(owner = "client!a", name = "l", descriptor = "Lclient!rc;")
	public static Class55 aClass55_6 = Static34.method846("");

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(B)V")
	public static void method1() {
		aClass36_1 = null;
		aClass55_6 = null;
		aClass55_5 = null;
		aClass55_4 = null;
		aClass55_3 = null;
		aClass55_1 = null;
		aClass55_2 = null;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!te;I)[I")
	public static int[] method2(@OriginalArg(0) Class6_Sub2_Sub14 arg0) {
		@Pc(12) int local12;
		if (arg0.anInt2920 >= 0) {
			local12 = arg0.anInt2920 >> 16;
		} else {
			local12 = arg0.anInt2880 >> 16;
		}
		if (!Static22.method654(local12)) {
			return null;
		}
		@Pc(40) int local40 = arg0.anInt2889;
		@Pc(43) int local43 = arg0.anInt2918;
		@Pc(56) Class6_Sub2_Sub14 local56;
		for (@Pc(46) int local46 = arg0.anInt2880; local46 != -1; local46 = local56.anInt2880) {
			local56 = Static9.aClass6_Sub2_Sub14ArrayArray1[local12][local46 & 0xFFFF];
			local43 += local56.anInt2918;
			if (!arg0.aBoolean140) {
				local43 -= local56.anInt2905;
			}
			local40 += local56.anInt2889;
			if (!arg0.aBoolean140) {
				local40 -= local56.anInt2879;
			}
		}
		return new int[] { local40, local43 };
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)J")
	public static synchronized long method3() {
		@Pc(5) long local5 = System.currentTimeMillis();
		if (Static4.aLong82 > local5) {
			Static83.aLong81 += Static4.aLong82 - local5;
		}
		Static4.aLong82 = local5;
		return local5 + Static83.aLong81;
	}
}
