import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!gb", name = "eb", descriptor = "Lclient!ra;")
	public static Class72 aClass72_4;

	@OriginalMember(owner = "client!gb", name = "R", descriptor = "Lclient!wh;")
	public static final Class95 aClass95_1 = new Class95();

	@OriginalMember(owner = "client!gb", name = "U", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_443 = Static158.method3034("bevor Sie den Vorgang wiederholen)3");

	@OriginalMember(owner = "client!gb", name = "ab", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_444 = Static158.method3034("Versteckt");

	@OriginalMember(owner = "client!gb", name = "fb", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_446 = Static158.method3034("Your account has been disabled)3");

	@OriginalMember(owner = "client!gb", name = "cb", descriptor = "Lclient!ob;")
	public static Class60 aClass60_445 = aClass60_446;

	@OriginalMember(owner = "client!gb", name = "i", descriptor = "(I)V")
	public static void method1396() {
		Static39.method900(Static62.aClass72_5);
		Static17.anInt558++;
		if (Static122.aBoolean124 && Static100.aBoolean111) {
			@Pc(24) int local24 = Static131.anInt215;
			local24 -= Static187.anInt4632;
			if (local24 < Static182.anInt4408) {
				local24 = Static182.anInt4408;
			}
			if (local24 + Static62.aClass72_5.anInt3878 > Static181.aClass72_13.anInt3878 + Static182.anInt4408) {
				local24 = Static181.aClass72_13.anInt3878 + Static182.anInt4408 - Static62.aClass72_5.anInt3878;
			}
			@Pc(64) int local64 = local24 - Static100.anInt2885;
			@Pc(66) int local66 = Static157.anInt3985;
			local66 -= Static174.anInt4252;
			@Pc(73) int local73 = Static62.aClass72_5.anInt3898;
			if (Static145.anInt3787 > local66) {
				local66 = Static145.anInt3787;
			}
			@Pc(91) int local91 = local24 + Static181.aClass72_13.anInt3903 - Static182.anInt4408;
			if (Static181.aClass72_13.anInt3871 + Static145.anInt3787 < local66 + Static62.aClass72_5.anInt3871) {
				local66 = Static145.anInt3787 + Static181.aClass72_13.anInt3871 - Static62.aClass72_5.anInt3871;
			}
			@Pc(116) int local116 = Static181.aClass72_13.anInt3926 + local66 - Static145.anInt3787;
			@Pc(121) int local121 = local66 - Static139.anInt3670;
			if (Static17.anInt558 > Static62.aClass72_5.anInt3920 && (local73 < local64 || -local73 > local64 || local121 > local73 || local121 < -local73)) {
				Static179.aBoolean174 = true;
			}
			@Pc(162) Class2_Sub25 local162;
			if (Static62.aClass72_5.anObjectArray4 != null && Static179.aBoolean174) {
				local162 = new Class2_Sub25();
				local162.aClass72_15 = Static62.aClass72_5;
				local162.anInt4603 = local91;
				local162.anInt4604 = local116;
				local162.anObjectArray29 = Static62.aClass72_5.anObjectArray4;
				Static197.method3578(local162);
			}
			if (Static113.anInt3165 == 0) {
				if (Static179.aBoolean174) {
					if (Static62.aClass72_5.anObjectArray3 != null) {
						local162 = new Class2_Sub25();
						local162.anInt4604 = local116;
						local162.anInt4603 = local91;
						local162.anObjectArray29 = Static62.aClass72_5.anObjectArray3;
						local162.aClass72_14 = Static168.aClass72_11;
						local162.aClass72_15 = Static62.aClass72_5;
						Static197.method3578(local162);
					}
					if (Static168.aClass72_11 != null && Static61.method1422(Static62.aClass72_5) != null) {
						Static7.aClass2_Sub3_Sub1_43.method244(66);
						Static7.aClass2_Sub3_Sub1_43.method213(Static168.aClass72_11.anInt3935);
						Static7.aClass2_Sub3_Sub1_43.method199(Static62.aClass72_5.anInt3911);
						Static7.aClass2_Sub3_Sub1_43.method213(Static62.aClass72_5.anInt3935);
						Static7.aClass2_Sub3_Sub1_43.method236(Static168.aClass72_11.anInt3911);
					}
				} else if ((Static131.anInt249 == 1 || Static55.method1328(Static169.anInt4148 - 1)) && Static169.anInt4148 > 2) {
					Static17.method428();
				} else if (Static169.anInt4148 > 0) {
					Static70.method1641(Static169.anInt4148 - 1);
				}
				Static62.aClass72_5 = null;
			}
		} else if (Static17.anInt558 > 1) {
			Static62.aClass72_5 = null;
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIB)I")
	public static int method1398(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(40) int local40 = Static66.method1523(arg0 - 1, arg1 + -1) + Static66.method1523(arg0 - 1, arg1 + 1) + Static66.method1523(arg0 + 1, arg1 - 1) + Static66.method1523(arg0 + 1, arg1 - -1);
		@Pc(73) int local73 = Static66.method1523(arg0, arg1 - 1) + Static66.method1523(arg0, arg1 + 1) + Static66.method1523(arg0 + -1, arg1) + Static66.method1523(arg0 + 1, arg1);
		@Pc(80) int local80 = Static66.method1523(arg0, arg1);
		return local80 / 4 + local73 / 8 + local40 / 16;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!pe;ILclient!pe;)V")
	public static void method1399(@OriginalArg(0) Class13 arg0, @OriginalArg(2) Class13 arg1) {
		Static50.aClass13_9 = arg1;
		Static143.aClass13_31 = arg0;
		Static117.anInt966 = Static50.aClass13_9.method513(3);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(BZILclient!pe;Lclient!pe;)Lclient!hh;")
	public static Class2_Sub1_Sub12 method1400(@OriginalArg(2) int arg0, @OriginalArg(3) Class13 arg1, @OriginalArg(4) Class13 arg2) {
		@Pc(10) int[] local10 = arg1.method512(arg0);
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < local10.length; local14++) {
			@Pc(24) byte[] local24 = arg1.method526(local10[local14], arg0);
			if (local24 == null) {
				local12 = false;
			} else {
				@Pc(44) int local44 = local24[1] & 0xFF | (local24[0] & 0xFF) << 8;
				@Pc(52) byte[] local52 = arg2.method526(0, local44);
				if (local52 == null) {
					local12 = false;
				}
			}
		}
		if (!local12) {
			return null;
		}
		try {
			return new Class2_Sub1_Sub12(arg1, arg2, arg0, false);
		} catch (@Pc(94) Exception local94) {
			return null;
		}
	}
}
