import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!jd", name = "w", descriptor = "I")
	public static int anInt1603;

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "[[I")
	public static int[][] anIntArrayArray16 = new int[104][104];

	@OriginalMember(owner = "client!jd", name = "e", descriptor = "Lclient!sc;")
	public static Class66 aClass66_857 = Static106.method1849("::fpson");

	@OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
	public static int anInt1595 = 0;

	@OriginalMember(owner = "client!jd", name = "D", descriptor = "Lclient!sc;")
	private static Class66 aClass66_865 = Static106.method1849("Loaded title screen");

	@OriginalMember(owner = "client!jd", name = "l", descriptor = "Lclient!sc;")
	public static Class66 aClass66_858 = aClass66_865;

	@OriginalMember(owner = "client!jd", name = "n", descriptor = "Lclient!sc;")
	public static Class66 aClass66_859 = Static106.method1849("Benutzername: ");

	@OriginalMember(owner = "client!jd", name = "t", descriptor = "Lclient!sc;")
	public static Class66 aClass66_860 = Static106.method1849("(U0a )2 in: ");

	@OriginalMember(owner = "client!jd", name = "v", descriptor = "Lclient!sc;")
	public static Class66 aClass66_861 = Static106.method1849("<br>(X");

	@OriginalMember(owner = "client!jd", name = "x", descriptor = "Lclient!sc;")
	public static Class66 aClass66_862 = Static106.method1849("null");

	@OriginalMember(owner = "client!jd", name = "y", descriptor = "Lclient!sc;")
	public static Class66 aClass66_863 = Static106.method1849(")4lang)4de");

	@OriginalMember(owner = "client!jd", name = "A", descriptor = "Lclient!sc;")
	public static Class66 aClass66_864 = Static106.method1849("Fehler bei der Verbindung zum Server)3");

	@OriginalMember(owner = "client!jd", name = "E", descriptor = "I")
	public static int anInt1607 = 0;

	@OriginalMember(owner = "client!jd", name = "G", descriptor = "Lclient!sb;")
	public static Class65 aClass65_22 = new Class65(8);

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lclient!sc;Lclient!mc;B)I")
	public static int method1095(@OriginalArg(0) Class66 arg0, @OriginalArg(1) Class1_Sub12 arg1) {
		@Pc(6) int local6 = arg1.anInt1694;
		arg1.method1198(arg0.anInt2583);
		arg1.anInt1694 += Static122.aClass64_1.method1795(arg1.anInt1694, arg0.anInt2583, arg1.aByteArray12, arg0.aByteArray29, 0);
		return arg1.anInt1694 - local6;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)I")
	public static int method1096(@OriginalArg(0) int arg0) {
		@Pc(7) Class1_Sub1_Sub17 local7 = Static89.method1646(arg0);
		@Pc(10) int local10 = local7.anInt2856;
		@Pc(13) int local13 = local7.anInt2854;
		@Pc(16) int local16 = local7.anInt2857;
		@Pc(22) int local22 = Class1_Sub1_Sub9.anIntArray340[local13 - local10];
		return local22 & Static103.anIntArray429[local16] >> local10;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "([BIIILclient!be;[Lclient!da;)V")
	public static void method1097(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class9 arg3, @OriginalArg(5) Class13[] arg4) {
		@Pc(10) Class1_Sub12 local10 = new Class1_Sub12(arg0);
		@Pc(16) int local16 = -1;
		while (true) {
			@Pc(20) int local20 = local10.method1180();
			if (local20 == 0) {
				return;
			}
			local16 += local20;
			@Pc(31) int local31 = 0;
			while (true) {
				@Pc(35) int local35 = local10.method1180();
				if (local35 == 0) {
					break;
				}
				local31 += local35 - 1;
				@Pc(47) int local47 = local31 & 0x3F;
				@Pc(53) int local53 = local31 >> 6 & 0x3F;
				@Pc(57) int local57 = local10.method1190();
				@Pc(61) int local61 = local31 >> 12;
				@Pc(65) int local65 = local57 >> 2;
				@Pc(69) int local69 = local57 & 0x3;
				@Pc(73) int local73 = local53 + arg2;
				@Pc(77) int local77 = arg1 + local47;
				if (local73 > 0 && local77 > 0 && local73 < 103 && local77 < 103) {
					@Pc(91) int local91 = local61;
					if ((Static87.aByteArrayArrayArray15[1][local73][local77] & 0x2) == 2) {
						local91 = local61 - 1;
					}
					@Pc(107) Class13 local107 = null;
					if (local91 >= 0) {
						local107 = arg4[local91];
					}
					Static83.method1509(local16, local77, local69, local107, arg3, local73, local65, local61);
				}
			}
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(I[B)Lclient!gf;")
	public static Class1_Sub1_Sub2_Sub2_Sub1 method1099(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(26) Class1_Sub1_Sub2_Sub2_Sub1 local26 = new Class1_Sub1_Sub2_Sub2_Sub1(arg0, Static99.anIntArray181, Static28.anIntArray105, Static125.anIntArray493, Static14.anIntArray80, Static16.anIntArray81, Static29.aByteArrayArray2);
			Static22.method509();
			return local26;
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)V")
	public static void method1101() {
		aClass66_863 = null;
		aClass66_861 = null;
		aClass66_859 = null;
		aClass66_864 = null;
		aClass66_862 = null;
		aClass65_22 = null;
		anIntArrayArray16 = null;
		aClass66_860 = null;
		aClass66_858 = null;
		aClass66_865 = null;
		aClass66_857 = null;
	}
}
