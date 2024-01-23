import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static252 {

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "Lclient!kb;")
	public static Class71 aClass71_4;

	@OriginalMember(owner = "client!vk", name = "g", descriptor = "[Lclient!gg;")
	public static Class47[] aClass47Array3;

	@OriginalMember(owner = "client!vk", name = "i", descriptor = "Lclient!hc;")
	public static Class51 aClass51_81;

	@OriginalMember(owner = "client!vk", name = "b", descriptor = "I")
	public static int anInt5357 = 0;

	@OriginalMember(owner = "client!vk", name = "c", descriptor = "I")
	public static int anInt5358 = 0;

	@OriginalMember(owner = "client!vk", name = "e", descriptor = "Z")
	public static boolean aBoolean273 = false;

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(ZI)V")
	public static void method4074() {
		Static201.anIntArray341 = new int[104];
		Static255.anIntArray465 = new int[104];
		Static54.anIntArray113 = new int[104];
		Static118.anIntArray222 = new int[104];
		Static172.anIntArray300 = new int[104];
		Static124.anInt3159 = 99;
		Static8.anIntArray18 = new int[5];
		Static79.anIntArrayArrayArray7 = new int[4][105][105];
		Static25.aByteArrayArrayArray2 = new byte[4][104][104];
		Static25.aByteArrayArrayArray3 = new byte[4][104][104];
		Static39.aByteArrayArrayArray4 = new byte[4][105][105];
		Static119.aByteArrayArrayArray9 = new byte[4][104][104];
		Static102.aByteArrayArrayArray7 = new byte[4][104][104];
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(III)Z")
	public static boolean method4076(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static206.anInt4551; local1++) {
			@Pc(6) Class2 local6 = Static217.aClass2Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt50 == 1) {
				local15 = local6.anInt36 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt31 + (local6.anInt51 * local15 >> 8);
					local37 = local6.anInt49 + (local6.anInt54 * local15 >> 8);
					local47 = local6.anInt45 + (local6.anInt47 * local15 >> 8);
					local57 = local6.anInt40 + (local6.anInt39 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt50 == 2) {
				local15 = arg0 - local6.anInt36;
				if (local15 > 0) {
					local27 = local6.anInt31 + (local6.anInt51 * local15 >> 8);
					local37 = local6.anInt49 + (local6.anInt54 * local15 >> 8);
					local47 = local6.anInt45 + (local6.anInt47 * local15 >> 8);
					local57 = local6.anInt40 + (local6.anInt39 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt50 == 3) {
				local15 = local6.anInt31 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt36 + (local6.anInt46 * local15 >> 8);
					local37 = local6.anInt33 + (local6.anInt34 * local15 >> 8);
					local47 = local6.anInt45 + (local6.anInt47 * local15 >> 8);
					local57 = local6.anInt40 + (local6.anInt39 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt50 == 4) {
				local15 = arg2 - local6.anInt31;
				if (local15 > 0) {
					local27 = local6.anInt36 + (local6.anInt46 * local15 >> 8);
					local37 = local6.anInt33 + (local6.anInt34 * local15 >> 8);
					local47 = local6.anInt45 + (local6.anInt47 * local15 >> 8);
					local57 = local6.anInt40 + (local6.anInt39 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt50 == 5) {
				local15 = arg1 - local6.anInt45;
				if (local15 > 0) {
					local27 = local6.anInt36 + (local6.anInt46 * local15 >> 8);
					local37 = local6.anInt33 + (local6.anInt34 * local15 >> 8);
					local47 = local6.anInt31 + (local6.anInt51 * local15 >> 8);
					local57 = local6.anInt49 + (local6.anInt54 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(ZLclient!hc;)V")
	public static void method4077(@OriginalArg(1) Class51 arg0) {
		Static212.aClass51_68 = arg0;
	}

	@OriginalMember(owner = "client!vk", name = "b", descriptor = "(III)Lclient!wd;")
	public static Class148 method4078(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub16 local7 = Static142.aClass1_Sub16ArrayArrayArray4[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class148 local14 = local7.aClass148_1;
			local7.aClass148_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIIIIII)V")
	public static void method4079(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static167.anInt3907 <= arg1 && arg2 <= Static150.anInt3860 && Static202.anInt4469 <= arg5 && Static94.anInt4237 >= arg4) {
			if (arg3 == 1) {
				Static211.method3589(arg1, arg0, arg5, arg4, arg2);
			} else {
				Static63.method1219(arg3, arg2, arg0, arg5, arg4, arg1);
			}
		} else if (arg3 == 1) {
			Static167.method2908(arg2, arg4, arg0, arg1, arg5);
		} else {
			Static246.method4016(arg5, arg0, arg1, arg3, arg4, arg2);
		}
	}
}
