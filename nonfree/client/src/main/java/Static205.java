import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!pl", name = "e", descriptor = "Lclient!qc;")
	public static Class135 aClass135_23 = new Class135(260);

	@OriginalMember(owner = "client!pl", name = "j", descriptor = "I")
	public static int anInt4152 = 1;

	@OriginalMember(owner = "client!pl", name = "m", descriptor = "I")
	public static int anInt4155 = 0;

	@OriginalMember(owner = "client!pl", name = "n", descriptor = "I")
	public static int anInt4156 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!pl", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString244 = "Loaded title screen";

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IZ)Lclient!ff;")
	public static Class46 method3293(@OriginalArg(0) int arg0) {
		@Pc(10) Class46 local10 = (Class46) Static227.aClass135_27.method3316((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static36.aClass91_38.method2495(Static266.method3133(arg0), Static113.method2069(arg0));
		local10 = new Class46();
		local10.anInt1572 = arg0;
		if (local25 != null) {
			local10.method1280(new Class1_Sub11(local25));
		}
		local10.method1273();
		Static227.aClass135_27.method3321((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(BILclient!sc;I)V")
	public static void method3297(@OriginalArg(1) int arg0, @OriginalArg(2) Class14_Sub2_Sub2 arg1, @OriginalArg(3) int arg2) {
		if (arg0 == arg1.anInt4620 && arg0 != -1) {
			@Pc(21) Class125 local21 = Static90.method1591(arg0);
			@Pc(24) int local24 = local21.anInt3941;
			if (local24 == 1) {
				arg1.anInt4637 = 0;
				arg1.anInt4633 = 0;
				arg1.anInt4695 = arg2;
				arg1.anInt4662 = 1;
				arg1.anInt4693 = 0;
				Static77.method1354(arg1.anInt4633, false, arg1.anInt4680, local21, arg1.anInt4630);
			}
			if (local24 == 2) {
				arg1.anInt4693 = 0;
			}
		} else if (arg0 == -1 || arg1.anInt4620 == -1 || Static90.method1591(arg0).anInt3944 >= Static90.method1591(arg1.anInt4620).anInt3944) {
			arg1.anInt4620 = arg0;
			arg1.anInt4695 = arg2;
			arg1.anInt4662 = 1;
			arg1.anInt4637 = 0;
			arg1.anInt4633 = 0;
			arg1.anInt4693 = 0;
			arg1.anInt4665 = arg1.anInt4678;
			if (arg1.anInt4620 != -1) {
				Static77.method1354(arg1.anInt4633, false, arg1.anInt4680, Static90.method1591(arg1.anInt4620), arg1.anInt4630);
			}
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(B[B)Z")
	public static boolean method3298(@OriginalArg(1) byte[] arg0) {
		@Pc(16) Class1_Sub11 local16 = new Class1_Sub11(arg0);
		@Pc(20) int local20 = local16.method2690();
		if (local20 != 1) {
			return false;
		}
		@Pc(37) boolean local37 = local16.method2690() == 1;
		if (local37) {
			Static20.method380(local16);
		}
		Static166.method2882(local16);
		return true;
	}
}
