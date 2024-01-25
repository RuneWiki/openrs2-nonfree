import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!mk", name = "j", descriptor = "Lclient!wo;")
	public static Class216 aClass216_62;

	@OriginalMember(owner = "client!mk", name = "l", descriptor = "Lclient!wo;")
	public static Class216 aClass216_63;

	@OriginalMember(owner = "client!mk", name = "n", descriptor = "J")
	public static long aLong129 = 0L;

	@OriginalMember(owner = "client!mk", name = "q", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray11 = new int[2][][];

	@OriginalMember(owner = "client!mk", name = "t", descriptor = "[I")
	public static final int[] anIntArray373 = new int[250];

	@OriginalMember(owner = "client!mk", name = "z", descriptor = "I")
	public static int anInt4095 = 0;

	@OriginalMember(owner = "client!mk", name = "C", descriptor = "I")
	public static int anInt4097 = 0;

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IZ)Lclient!jk;")
	public static Class106 method3706(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if ((double) Static79.aFloat49 == 3.0D) {
				return Static102.aClass106_2;
			}
			if ((double) Static79.aFloat49 == 4.0D) {
				return Static199.aClass106_5;
			}
			if ((double) Static79.aFloat49 == 6.0D) {
				return Static351.aClass106_9;
			}
			if ((double) Static79.aFloat49 >= 8.0D) {
				return Static212.aClass106_6;
			}
		} else if (arg0 == 1) {
			if ((double) Static79.aFloat49 == 3.0D) {
				return Static351.aClass106_9;
			}
			if ((double) Static79.aFloat49 == 4.0D) {
				return Static212.aClass106_6;
			}
			if ((double) Static79.aFloat49 == 6.0D) {
				return Static296.aClass106_7;
			}
			if ((double) Static79.aFloat49 >= 8.0D) {
				return Static322.aClass106_8;
			}
		} else if (arg0 == 2) {
			if ((double) Static79.aFloat49 == 3.0D) {
				return Static296.aClass106_7;
			}
			if ((double) Static79.aFloat49 == 4.0D) {
				return Static322.aClass106_8;
			}
			if ((double) Static79.aFloat49 == 6.0D) {
				return Static259.aClass106_4;
			}
			if ((double) Static79.aFloat49 >= 8.0D) {
				return Static52.aClass106_1;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(CI)Z")
	public static boolean method3709(@OriginalArg(0) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method3710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) Class1_Sub25 local7 = null;
		for (@Pc(12) Class1_Sub25 local12 = (Class1_Sub25) Static290.aClass16_35.method410(); local12 != null; local12 = (Class1_Sub25) Static290.aClass16_35.method419()) {
			if (arg2 == local12.anInt3976 && local12.anInt3971 == arg8 && arg6 == local12.anInt3977 && local12.anInt3965 == arg4) {
				local7 = local12;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class1_Sub25();
			local7.anInt3965 = arg4;
			local7.anInt3971 = arg8;
			local7.anInt3977 = arg6;
			local7.anInt3976 = arg2;
			Static102.method2113(local7);
			Static290.aClass16_35.method416(local7);
		}
		local7.anInt3974 = arg3;
		local7.anInt3969 = arg1;
		local7.anInt3967 = arg5;
		local7.anInt3972 = arg7;
		local7.anInt3973 = arg0;
	}
}
