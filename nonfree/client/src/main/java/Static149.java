import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!qb", name = "s", descriptor = "I")
	public static int anInt3500;

	@OriginalMember(owner = "client!qb", name = "q", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2012 = Static118.method2249("Bitte warten Sie)3)3)3");

	@OriginalMember(owner = "client!qb", name = "r", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2013 = Static118.method2249("Okay");

	@OriginalMember(owner = "client!qb", name = "A", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_2017 = Static118.method2249("Choose Option");

	@OriginalMember(owner = "client!qb", name = "t", descriptor = "Lclient!oc;")
	public static Class65 aClass65_2014 = aClass65_2017;

	@OriginalMember(owner = "client!qb", name = "u", descriptor = "I")
	public static int anInt3501 = 0;

	@OriginalMember(owner = "client!qb", name = "y", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2015 = Static118.method2249("settings");

	@OriginalMember(owner = "client!qb", name = "z", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_2016 = Static118.method2249(" from your ignore list first)3");

	@OriginalMember(owner = "client!qb", name = "B", descriptor = "Lclient!oc;")
	public static Class65 aClass65_2018 = aClass65_2016;

	@OriginalMember(owner = "client!qb", name = "C", descriptor = "[Lclient!oc;")
	public static final Class65[] aClass65Array47 = new Class65[100];

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(JI)V")
	public static void method2657(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(20) int local20 = 0; local20 < Static29.anInt859; local20++) {
			if (Static197.aLongArray9[local20] == arg0) {
				Static29.anInt859--;
				for (@Pc(37) int local37 = local20; local37 < Static29.anInt859; local37++) {
					Static197.aLongArray9[local37] = Static197.aLongArray9[local37 + 1];
					aClass65Array47[local37] = aClass65Array47[local37 + 1];
				}
				Static68.anInt1494 = Static1.anInt4459;
				Static45.aClass1_Sub14_Sub1_8.method1761(49);
				Static45.aClass1_Sub14_Sub1_8.method1721(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(I[Lclient!n;BI[B)V")
	public static void method2658(@OriginalArg(0) int arg0, @OriginalArg(1) Class57[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3) {
		@Pc(6) Class1_Sub14 local6 = new Class1_Sub14(arg3);
		@Pc(8) int local8 = -1;
		while (true) {
			@Pc(12) int local12 = local6.method1734();
			if (local12 == 0) {
				return;
			}
			local8 += local12;
			@Pc(20) int local20 = 0;
			while (true) {
				@Pc(24) int local24 = local6.method1703();
				if (local24 == 0) {
					break;
				}
				local20 += local24 - 1;
				@Pc(39) int local39 = local20 & 0x3F;
				@Pc(45) int local45 = local20 >> 6 & 0x3F;
				@Pc(49) int local49 = local20 >> 12;
				@Pc(53) int local53 = local6.method1738();
				@Pc(57) int local57 = local53 >> 2;
				@Pc(61) int local61 = local45 + arg2;
				@Pc(65) int local65 = local53 & 0x3;
				@Pc(69) int local69 = local39 + arg0;
				if (local61 > 0 && local69 > 0 && local61 < 103 && local69 < 103) {
					@Pc(87) int local87 = local49;
					if ((Static106.aByteArrayArrayArray67[1][local61][local69] & 0x2) == 2) {
						local87 = local49 - 1;
					}
					@Pc(103) Class57 local103 = null;
					if (local87 >= 0) {
						local103 = arg1[local87];
					}
					Static134.method2559(local8, local65, local61, local49, true, local103, local49, local69, Static13.aBoolean36, local57);
				}
			}
		}
	}
}
