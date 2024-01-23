import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!mi", name = "Q", descriptor = "Lclient!r;")
	public static Class73 aClass73_4;

	@OriginalMember(owner = "client!mi", name = "R", descriptor = "Lclient!vb;")
	public static Class7_Sub1 aClass7_Sub1_20;

	@OriginalMember(owner = "client!mi", name = "V", descriptor = "[I")
	public static int[] anIntArray357;

	@OriginalMember(owner = "client!mi", name = "X", descriptor = "Lclient!ai;")
	public static Class7 aClass7_23;

	@OriginalMember(owner = "client!mi", name = "Y", descriptor = "Lclient!kh;")
	public static Class60 aClass60_950 = Static200.method3116("::");

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(BLclient!ve;)V")
	public static void method2120(@OriginalArg(1) Class9_Sub4 arg0) {
		arg0.aBoolean212 = false;
		@Pc(22) Class1_Sub1_Sub21 local22;
		if (arg0.anInt3905 != -1) {
			local22 = Static74.method1343(arg0.anInt3905);
			if (local22 == null || local22.anIntArray449 == null) {
				arg0.anInt3905 = -1;
			} else {
				arg0.anInt3922++;
				if (local22.anIntArray449.length > arg0.anInt3897 && local22.anIntArray450[arg0.anInt3897] < arg0.anInt3922) {
					arg0.anInt3922 = 1;
					arg0.anInt3897++;
					Static90.method1562(arg0.anInt3925, arg0.anInt3897, Static84.aClass9_Sub4_Sub1_2 == arg0, local22, arg0.anInt3903);
				}
				if (local22.anIntArray449.length <= arg0.anInt3897) {
					arg0.anInt3897 = 0;
					arg0.anInt3922 = 0;
					Static90.method1562(arg0.anInt3925, arg0.anInt3897, arg0 == Static84.aClass9_Sub4_Sub1_2, local22, arg0.anInt3903);
				}
			}
		}
		if (arg0.anInt3914 != -1 && Static42.anInt910 >= arg0.anInt3904) {
			if (arg0.anInt3893 < 0) {
				arg0.anInt3893 = 0;
			}
			@Pc(136) int local136 = Static191.method2988(arg0.anInt3914).anInt456;
			if (local136 == -1) {
				arg0.anInt3914 = -1;
			} else {
				@Pc(148) Class1_Sub1_Sub21 local148 = Static74.method1343(local136);
				if (local148 == null || local148.anIntArray449 == null) {
					arg0.anInt3914 = -1;
				} else {
					arg0.anInt3929++;
					if (arg0.anInt3893 < local148.anIntArray449.length && local148.anIntArray450[arg0.anInt3893] < arg0.anInt3929) {
						arg0.anInt3893++;
						arg0.anInt3929 = 1;
						Static90.method1562(arg0.anInt3925, arg0.anInt3893, arg0 == Static84.aClass9_Sub4_Sub1_2, local148, arg0.anInt3903);
					}
					if (arg0.anInt3893 >= local148.anIntArray449.length) {
						arg0.anInt3914 = -1;
					}
				}
			}
		}
		if (arg0.anInt3896 != -1 && arg0.anInt3906 <= 1) {
			local22 = Static74.method1343(arg0.anInt3896);
			if (local22.anInt3448 == 1 && arg0.anInt3943 > 0 && Static42.anInt910 >= arg0.anInt3951 && arg0.anInt3933 < Static42.anInt910) {
				arg0.anInt3906 = 1;
				return;
			}
		}
		if (arg0.anInt3896 != -1 && arg0.anInt3906 == 0) {
			local22 = Static74.method1343(arg0.anInt3896);
			if (local22 == null || local22.anIntArray449 == null) {
				arg0.anInt3896 = -1;
			} else {
				arg0.anInt3899++;
				if (arg0.anInt3948 < local22.anIntArray449.length && local22.anIntArray450[arg0.anInt3948] < arg0.anInt3899) {
					arg0.anInt3899 = 1;
					arg0.anInt3948++;
					Static90.method1562(arg0.anInt3925, arg0.anInt3948, Static84.aClass9_Sub4_Sub1_2 == arg0, local22, arg0.anInt3903);
				}
				if (local22.anIntArray449.length <= arg0.anInt3948) {
					arg0.anInt3924++;
					arg0.anInt3948 -= local22.anInt3439;
					if (local22.anInt3446 <= arg0.anInt3924) {
						arg0.anInt3896 = -1;
					} else if (arg0.anInt3948 >= 0 && arg0.anInt3948 < local22.anIntArray449.length) {
						Static90.method1562(arg0.anInt3925, arg0.anInt3948, arg0 == Static84.aClass9_Sub4_Sub1_2, local22, arg0.anInt3903);
					} else {
						arg0.anInt3896 = -1;
					}
				}
				arg0.aBoolean212 = local22.aBoolean193;
			}
		}
		if (arg0.anInt3906 > 0) {
			arg0.anInt3906--;
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(III)Z")
	public static boolean method2122(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static25.anInt585; local1++) {
			@Pc(6) Class89 local6 = Static36.aClass89Array11[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt3787 == 1) {
				local15 = local6.anInt3793 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt3792 + (local6.anInt3804 * local15 >> 8);
					local37 = local6.anInt3784 + (local6.anInt3798 * local15 >> 8);
					local47 = local6.anInt3803 + (local6.anInt3801 * local15 >> 8);
					local57 = local6.anInt3808 + (local6.anInt3794 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt3787 == 2) {
				local15 = arg0 - local6.anInt3793;
				if (local15 > 0) {
					local27 = local6.anInt3792 + (local6.anInt3804 * local15 >> 8);
					local37 = local6.anInt3784 + (local6.anInt3798 * local15 >> 8);
					local47 = local6.anInt3803 + (local6.anInt3801 * local15 >> 8);
					local57 = local6.anInt3808 + (local6.anInt3794 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt3787 == 3) {
				local15 = local6.anInt3792 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt3793 + (local6.anInt3805 * local15 >> 8);
					local37 = local6.anInt3795 + (local6.anInt3785 * local15 >> 8);
					local47 = local6.anInt3803 + (local6.anInt3801 * local15 >> 8);
					local57 = local6.anInt3808 + (local6.anInt3794 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt3787 == 4) {
				local15 = arg2 - local6.anInt3792;
				if (local15 > 0) {
					local27 = local6.anInt3793 + (local6.anInt3805 * local15 >> 8);
					local37 = local6.anInt3795 + (local6.anInt3785 * local15 >> 8);
					local47 = local6.anInt3803 + (local6.anInt3801 * local15 >> 8);
					local57 = local6.anInt3808 + (local6.anInt3794 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt3787 == 5) {
				local15 = arg1 - local6.anInt3803;
				if (local15 > 0) {
					local27 = local6.anInt3793 + (local6.anInt3805 * local15 >> 8);
					local37 = local6.anInt3795 + (local6.anInt3785 * local15 >> 8);
					local47 = local6.anInt3792 + (local6.anInt3804 * local15 >> 8);
					local57 = local6.anInt3784 + (local6.anInt3798 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(III)I")
	public static int method2125(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class1_Sub27 local10 = (Class1_Sub27) Static121.aClass33_7.method1071((long) arg0);
		if (local10 == null) {
			return -1;
		} else if (arg1 >= 0 && local10.anIntArray656.length > arg1) {
			return local10.anIntArray656[arg1];
		} else {
			return -1;
		}
	}
}
