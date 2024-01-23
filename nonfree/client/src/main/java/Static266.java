import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static266 {

	@OriginalMember(owner = "client!ui", name = "k", descriptor = "I")
	public static int anInt5524;

	@OriginalMember(owner = "client!ui", name = "r", descriptor = "I")
	public static int anInt5528;

	@OriginalMember(owner = "client!ui", name = "s", descriptor = "I")
	public static int anInt5529;

	@OriginalMember(owner = "client!ui", name = "m", descriptor = "Lclient!fa;")
	public static Class53 aClass53_12 = new Class53(16);

	@OriginalMember(owner = "client!ui", name = "o", descriptor = "Lclient!ec;")
	public static Class46 aClass46_36 = new Class46(64);

	@OriginalMember(owner = "client!ui", name = "p", descriptor = "Lclient!ec;")
	public static Class46 aClass46_37 = new Class46(500);

	@OriginalMember(owner = "client!ui", name = "q", descriptor = "I")
	public static int anInt5527 = 0;

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(III)Lclient!mn;")
	public static Class115 method4442(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) Class115 local3 = Static90.method1692(arg0);
		if (arg1 == -1) {
			return local3;
		} else if (local3 == null || local3.aClass115Array1 == null || arg1 >= local3.aClass115Array1.length) {
			return null;
		} else {
			return local3.aClass115Array1[arg1];
		}
	}

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "(I)V")
	public static void method4443() {
		Static61.aClass2_Sub3_Sub1Array7 = null;
		Static8.aClass2_Sub3_Sub1Array1 = null;
		Static111.aClass2_Sub3_Sub1_4 = null;
		Static280.aClass71Array5 = null;
		Static234.aClass2_Sub3_Sub5_Sub1_2 = null;
		Static197.aClass2_Sub3_Sub1Array8 = null;
		Static153.aClass2_Sub3_Sub5_1 = null;
		Static106.aClass2_Sub3_Sub1Array6 = null;
		Static65.aClass2_Sub3_Sub1Array4 = null;
		Static286.aClass2_Sub3_Sub1Array11 = null;
		Static206.aClass2_Sub3_Sub1Array9 = null;
		Static77.aClass2_Sub3_Sub1Array5 = null;
		Static214.aClass2_Sub3_Sub1Array10 = null;
		Static64.aClass2_Sub3_Sub1Array3 = null;
		Static4.aClass71Array1 = null;
		Static162.aClass2_Sub3_Sub5_2 = null;
		Static58.aClass2_Sub3_Sub1_Sub1Array1 = null;
		Static105.aClass2_Sub3_Sub1_3 = null;
		Static208.aClass2_Sub3_Sub5_3 = null;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lclient!jd;Ljava/lang/String;B)Lclient!mk;")
	public static Class113 method4445(@OriginalArg(0) Class84 arg0, @OriginalArg(1) String arg1) {
		@Pc(10) int local10 = arg0.method2121(arg1);
		if (local10 == -1) {
			return new Class113(0);
		}
		@Pc(26) int[] local26 = arg0.method2119(local10);
		@Pc(32) Class113 local32 = new Class113(local26.length);
		for (@Pc(34) int local34 = 0; local34 < local32.anInt3429; local34++) {
			@Pc(57) Class2_Sub26 local57 = new Class2_Sub26(arg0.method2127(local26[local34], local10));
			local32.aStringArray15[local34] = local57.method4265();
			local32.aByteArray28[local34] = local57.method4220();
			local32.anIntArray261[local34] = local57.method4228();
			local32.anIntArray260[local34] = local57.method4228();
		}
		return local32;
	}
}
