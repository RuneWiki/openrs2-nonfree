import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static259 {

	@OriginalMember(owner = "client!il", name = "m", descriptor = "I")
	public static int anInt4200;

	@OriginalMember(owner = "client!il", name = "L", descriptor = "F")
	public static float aFloat99;

	@OriginalMember(owner = "client!il", name = "y", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_97 = new Class151(3, 6);

	@OriginalMember(owner = "client!il", name = "J", descriptor = "[I")
	public static final int[] anIntArray307 = new int[250];

	@OriginalMember(owner = "client!il", name = "i", descriptor = "(I)V")
	public static void method3755() {
		@Pc(17) Class4_Sub48 local17 = Static335.method4615(Static58.aClass216_16, Static669.aClass196_2);
		local17.aClass4_Sub11_Sub1_2.method8822(0);
		Static410.method5170(local17);
	}

	@OriginalMember(owner = "client!il", name = "c", descriptor = "(B)V")
	public static void method3756() {
		for (@Pc(18) Class4_Sub34 local18 = (Class4_Sub34) Static255.aClass66_18.method1992(); local18 != null; local18 = (Class4_Sub34) Static255.aClass66_18.method1984()) {
			if (local18.aClass105_Sub1_1.method2534()) {
				Static343.method4655(local18.anInt5684);
			} else {
				local18.aClass105_Sub1_1.method2539();
				try {
					local18.aClass105_Sub1_1.method2529();
				} catch (@Pc(35) Exception local35) {
					Static357.method4765(local35, "TV: " + local18.anInt5684);
					Static343.method4655(local18.anInt5684);
				}
				if (!local18.aBoolean429 && !local18.aBoolean430) {
					@Pc(61) Class4_Sub6_Sub4 local61 = local18.aClass105_Sub1_1.method2520();
					if (local61 != null) {
						@Pc(67) Class4_Sub3_Sub2 local67 = local61.method6640();
						if (local67 != null) {
							local67.method4217(local18.anInt5683);
							Static162.aClass4_Sub3_Sub5_3.method7724(local67);
							local18.aBoolean429 = true;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IZILjava/lang/String;)I")
	public static int method3757(@OriginalArg(0) int arg0, @OriginalArg(3) String arg1) {
		@Pc(26) boolean local26 = false;
		@Pc(28) boolean local28 = false;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = arg1.length();
		for (@Pc(35) int local35 = 0; local35 < local33; local35++) {
			@Pc(41) char local41 = arg1.charAt(local35);
			if (local35 == 0) {
				if (local41 == '-') {
					local26 = true;
					continue;
				}
				if (local41 == '+') {
					continue;
				}
			}
			@Pc(81) int local81;
			if (local41 >= '0' && local41 <= '9') {
				local81 = local41 - '0';
			} else if (local41 >= 'A' && local41 <= 'Z') {
				local81 = local41 - '7';
			} else if (local41 >= 'a' && local41 <= 'z') {
				local81 = local41 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (local81 >= arg0) {
				throw new NumberFormatException();
			}
			if (local26) {
				local81 = -local81;
			}
			@Pc(122) int local122 = local30 * arg0 + local81;
			if (local30 != local122 / arg0) {
				throw new NumberFormatException();
			}
			local30 = local122;
			local28 = true;
		}
		if (!local28) {
			throw new NumberFormatException();
		}
		return local30;
	}
}
