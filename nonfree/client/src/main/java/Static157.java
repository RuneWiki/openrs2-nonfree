import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!re", name = "t", descriptor = "[Lclient!kc;")
	public static Class2_Sub1_Sub7_Sub4[] aClass2_Sub1_Sub7_Sub4Array10;

	@OriginalMember(owner = "client!re", name = "v", descriptor = "Lclient!kc;")
	public static Class2_Sub1_Sub7_Sub4 aClass2_Sub1_Sub7_Sub4_8;

	@OriginalMember(owner = "client!re", name = "z", descriptor = "Lclient!md;")
	public static Class51 aClass51_12;

	@OriginalMember(owner = "client!re", name = "A", descriptor = "I")
	public static int anInt3988;

	@OriginalMember(owner = "client!re", name = "p", descriptor = "I")
	public static int anInt3983 = 1;

	@OriginalMember(owner = "client!re", name = "q", descriptor = "I")
	public static int anInt3984 = 0;

	@OriginalMember(owner = "client!re", name = "r", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1079 = Static158.method3034("mod_icons");

	@OriginalMember(owner = "client!re", name = "y", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_1081 = Static158.method3034("Login limit exceeded)3");

	@OriginalMember(owner = "client!re", name = "s", descriptor = "Lclient!ob;")
	public static Class60 aClass60_1080 = aClass60_1081;

	@OriginalMember(owner = "client!re", name = "u", descriptor = "I")
	public static int anInt3985 = 0;

	@OriginalMember(owner = "client!re", name = "C", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1082 = Static158.method3034("<img=0>");

	@OriginalMember(owner = "client!re", name = "D", descriptor = "I")
	public static int anInt3990 = 1;

	@OriginalMember(owner = "client!re", name = "G", descriptor = "I")
	public static int anInt3993 = 0;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIILclient!ob;)V")
	public static void method3023(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class60 arg3) {
		@Pc(4) Class72 local4 = Static181.method3381(arg0, arg1);
		if (local4 == null) {
			return;
		}
		if (local4.anObjectArray7 != null) {
			@Pc(23) Class2_Sub25 local23 = new Class2_Sub25();
			local23.anInt4606 = arg2;
			local23.aClass60_1307 = arg3;
			local23.anObjectArray29 = local4.anObjectArray7;
			local23.aClass72_15 = local4;
			Static197.method3578(local23);
		}
		@Pc(41) boolean local41 = true;
		if (local4.anInt3884 > 0) {
			local41 = Static107.method2408(local4);
		}
		if (!local41 || !Static25.method620(Static26.method637(local4), arg2 - 1)) {
			return;
		}
		if (arg2 == 1) {
			Static7.aClass2_Sub3_Sub1_43.method244(58);
			Static7.aClass2_Sub3_Sub1_43.method197(arg1);
			Static7.aClass2_Sub3_Sub1_43.method199(arg0);
		}
		if (arg2 == 2) {
			Static7.aClass2_Sub3_Sub1_43.method244(222);
			Static7.aClass2_Sub3_Sub1_43.method197(arg1);
			Static7.aClass2_Sub3_Sub1_43.method199(arg0);
		}
		if (arg2 == 3) {
			Static7.aClass2_Sub3_Sub1_43.method244(97);
			Static7.aClass2_Sub3_Sub1_43.method197(arg1);
			Static7.aClass2_Sub3_Sub1_43.method199(arg0);
		}
		if (arg2 == 4) {
			Static7.aClass2_Sub3_Sub1_43.method244(201);
			Static7.aClass2_Sub3_Sub1_43.method197(arg1);
			Static7.aClass2_Sub3_Sub1_43.method199(arg0);
		}
		if (arg2 == 5) {
			Static7.aClass2_Sub3_Sub1_43.method244(161);
			Static7.aClass2_Sub3_Sub1_43.method197(arg1);
			Static7.aClass2_Sub3_Sub1_43.method199(arg0);
		}
		if (arg2 == 6) {
			Static7.aClass2_Sub3_Sub1_43.method244(127);
			Static7.aClass2_Sub3_Sub1_43.method197(arg1);
			Static7.aClass2_Sub3_Sub1_43.method199(arg0);
		}
		if (arg2 == 7) {
			Static7.aClass2_Sub3_Sub1_43.method244(72);
			Static7.aClass2_Sub3_Sub1_43.method197(arg1);
			Static7.aClass2_Sub3_Sub1_43.method199(arg0);
		}
		if (arg2 == 8) {
			Static7.aClass2_Sub3_Sub1_43.method244(27);
			Static7.aClass2_Sub3_Sub1_43.method197(arg1);
			Static7.aClass2_Sub3_Sub1_43.method199(arg0);
		}
		if (arg2 == 9) {
			Static7.aClass2_Sub3_Sub1_43.method244(144);
			Static7.aClass2_Sub3_Sub1_43.method197(arg1);
			Static7.aClass2_Sub3_Sub1_43.method199(arg0);
		}
		if (arg2 == 10) {
			Static7.aClass2_Sub3_Sub1_43.method244(249);
			Static7.aClass2_Sub3_Sub1_43.method197(arg1);
			Static7.aClass2_Sub3_Sub1_43.method199(arg0);
		}
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(IIIIII)V")
	public static void method3025(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 == arg0) {
			Static43.method946(arg1, arg3, arg4, arg2);
		} else if (arg1 - arg2 >= Static64.anInt1962 && Static123.anInt3379 >= arg1 + arg2 && Static36.anInt1076 <= arg4 - arg0 && arg4 + arg0 <= Static117.anInt951) {
			Static7.method3561(arg4, arg2, arg0, arg3, arg1);
		} else {
			Static27.method672(arg1, arg2, arg0, arg3, arg4);
		}
	}
}
