import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static264 {

	@OriginalMember(owner = "client!tc", name = "V", descriptor = "[I")
	public static int[] anIntArray549;

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!wf;B)V")
	public static void method4155(@OriginalArg(0) Class189 arg0) {
		@Pc(3) Class189 local3 = Static183.method2955(arg0);
		@Pc(12) int local12;
		@Pc(15) int local15;
		if (local3 == null) {
			local15 = Static40.anInt690;
			local12 = Static31.anInt526;
		} else {
			local12 = local3.anInt5897;
			local15 = local3.anInt5953;
		}
		Static34.method526(false, local12, arg0, local15);
		Static294.method3849(local12, local15, arg0);
	}

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "(III)Z")
	public static boolean method4156(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static208.anInt4112; local1++) {
			@Pc(8) Class188 local8 = Static241.aClass188Array12[local1];
			@Pc(17) int local17;
			@Pc(29) int local29;
			@Pc(39) int local39;
			@Pc(49) int local49;
			@Pc(59) int local59;
			if (local8.anInt5877 == 1) {
				local17 = local8.anInt5866 - arg0;
				if (local17 > 0) {
					local29 = local8.anInt5864 + (local8.anInt5868 * local17 >> 8);
					local39 = local8.anInt5883 + (local8.anInt5878 * local17 >> 8);
					local49 = local8.anInt5876 + (local8.anInt5873 * local17 >> 8);
					local59 = local8.anInt5885 + (local8.anInt5872 * local17 >> 8);
					if (arg2 >= local29 && arg2 <= local39 && arg1 >= local49 && arg1 <= local59) {
						return true;
					}
				}
			} else if (local8.anInt5877 == 2) {
				local17 = arg0 - local8.anInt5866;
				if (local17 > 0) {
					local29 = local8.anInt5864 + (local8.anInt5868 * local17 >> 8);
					local39 = local8.anInt5883 + (local8.anInt5878 * local17 >> 8);
					local49 = local8.anInt5876 + (local8.anInt5873 * local17 >> 8);
					local59 = local8.anInt5885 + (local8.anInt5872 * local17 >> 8);
					if (arg2 >= local29 && arg2 <= local39 && arg1 >= local49 && arg1 <= local59) {
						return true;
					}
				}
			} else if (local8.anInt5877 == 3) {
				local17 = local8.anInt5864 - arg2;
				if (local17 > 0) {
					local29 = local8.anInt5866 + (local8.anInt5865 * local17 >> 8);
					local39 = local8.anInt5881 + (local8.anInt5882 * local17 >> 8);
					local49 = local8.anInt5876 + (local8.anInt5873 * local17 >> 8);
					local59 = local8.anInt5885 + (local8.anInt5872 * local17 >> 8);
					if (arg0 >= local29 && arg0 <= local39 && arg1 >= local49 && arg1 <= local59) {
						return true;
					}
				}
			} else if (local8.anInt5877 == 4) {
				local17 = arg2 - local8.anInt5864;
				if (local17 > 0) {
					local29 = local8.anInt5866 + (local8.anInt5865 * local17 >> 8);
					local39 = local8.anInt5881 + (local8.anInt5882 * local17 >> 8);
					local49 = local8.anInt5876 + (local8.anInt5873 * local17 >> 8);
					local59 = local8.anInt5885 + (local8.anInt5872 * local17 >> 8);
					if (arg0 >= local29 && arg0 <= local39 && arg1 >= local49 && arg1 <= local59) {
						return true;
					}
				}
			} else if (local8.anInt5877 == 5) {
				local17 = arg1 - local8.anInt5876;
				if (local17 > 0) {
					local29 = local8.anInt5866 + (local8.anInt5865 * local17 >> 8);
					local39 = local8.anInt5881 + (local8.anInt5882 * local17 >> 8);
					local49 = local8.anInt5864 + (local8.anInt5868 * local17 >> 8);
					local59 = local8.anInt5883 + (local8.anInt5878 * local17 >> 8);
					if (arg0 >= local29 && arg0 <= local39 && arg2 >= local49 && arg2 <= local59) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
