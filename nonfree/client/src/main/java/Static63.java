import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!gd", name = "V", descriptor = "[Lclient!ch;")
	public static Class1_Sub1_Sub6[] aClass1_Sub1_Sub6Array4;

	@OriginalMember(owner = "client!gd", name = "X", descriptor = "I")
	public static int anInt1581;

	@OriginalMember(owner = "client!gd", name = "cb", descriptor = "[I")
	public static int[] anIntArray182;

	@OriginalMember(owner = "client!gd", name = "U", descriptor = "Z")
	public static boolean aBoolean83 = false;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IBIIIII)I")
	public static int method1145(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg0 & 0x3;
		if ((arg4 & 0x1) == 1) {
			@Pc(10) int local10 = arg3;
			arg3 = arg2;
			arg2 = local10;
		}
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return 7 + 1 - arg5 - arg3;
		} else if (local3 == 2) {
			return 1 + 7 - arg2 - arg1;
		} else {
			return arg5;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(BLclient!nc;)Lclient!ph;")
	public static Class45_Sub3 method1146(@OriginalArg(1) Class1_Sub9 arg0) {
		return new Class45_Sub3(arg0.method932(), arg0.method932(), arg0.method932(), arg0.method932(), arg0.method920(), arg0.method920(), arg0.method895());
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(3) Class89 local3 = new Class89();
		local3.anInt3797 = arg2 / 128;
		local3.anInt3783 = arg3 / 128;
		local3.anInt3800 = arg4 / 128;
		local3.anInt3802 = arg5 / 128;
		local3.anInt3790 = arg1;
		local3.anInt3793 = arg2;
		local3.anInt3795 = arg3;
		local3.anInt3792 = arg4;
		local3.anInt3784 = arg5;
		local3.anInt3803 = arg6;
		local3.anInt3808 = arg7;
		Static77.aClass89ArrayArray1[arg0][Static77.anIntArray217[arg0]++] = local3;
	}

	@OriginalMember(owner = "client!gd", name = "e", descriptor = "(B)V")
	public static void method1148() {
		@Pc(7) boolean local7 = false;
		while (!local7) {
			local7 = true;
			for (@Pc(13) int local13 = 0; local13 < Static91.anInt2134 - 1; local13++) {
				if (Static171.aShortArray50[local13] < 1000 && Static171.aShortArray50[local13 + 1] > 1000) {
					local7 = false;
					@Pc(35) Class60 local35 = Static52.aClass60Array8[local13];
					Static52.aClass60Array8[local13] = Static52.aClass60Array8[local13 + 1];
					Static52.aClass60Array8[local13 + 1] = local35;
					@Pc(53) Class60 local53 = Static23.aClass60Array17[local13];
					Static23.aClass60Array17[local13] = Static23.aClass60Array17[local13 + 1];
					Static23.aClass60Array17[local13 + 1] = local53;
					@Pc(71) int local71 = Static203.anIntArray563[local13];
					Static203.anIntArray563[local13] = Static203.anIntArray563[local13 + 1];
					Static203.anIntArray563[local13 + 1] = local71;
					@Pc(89) int local89 = Static38.anIntArray129[local13];
					Static38.anIntArray129[local13] = Static38.anIntArray129[local13 + 1];
					Static38.anIntArray129[local13 + 1] = local89;
					@Pc(107) short local107 = Static171.aShortArray50[local13];
					Static171.aShortArray50[local13] = Static171.aShortArray50[local13 + 1];
					Static171.aShortArray50[local13 + 1] = local107;
					@Pc(125) long local125 = Static77.aLongArray4[local13];
					Static77.aLongArray4[local13] = Static77.aLongArray4[local13 + 1];
					Static77.aLongArray4[local13 + 1] = local125;
				}
			}
		}
	}
}
