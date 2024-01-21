import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!qf", name = "y", descriptor = "[I")
	public static int[] anIntArray423;

	@OriginalMember(owner = "client!qf", name = "H", descriptor = "Lclient!i;")
	public static Class2_Sub1_Sub7_Sub3_Sub1 aClass2_Sub1_Sub7_Sub3_Sub1_5;

	@OriginalMember(owner = "client!qf", name = "J", descriptor = "Lclient!ja;")
	public static Class40 aClass40_4;

	@OriginalMember(owner = "client!qf", name = "u", descriptor = "Lclient!hb;")
	public static final Class2_Sub9 aClass2_Sub9_1 = new Class2_Sub9(0, 0);

	@OriginalMember(owner = "client!qf", name = "G", descriptor = "[B")
	public static final byte[] aByteArray45 = new byte[520];

	@OriginalMember(owner = "client!qf", name = "I", descriptor = "I")
	public static int anInt3844 = 0;

	@OriginalMember(owner = "client!qf", name = "L", descriptor = "I")
	public static int anInt3846 = 127;

	@OriginalMember(owner = "client!qf", name = "M", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1043 = Static158.method3034("Null");

	@OriginalMember(owner = "client!qf", name = "N", descriptor = "I")
	public static int anInt3847 = 0;

	@OriginalMember(owner = "client!qf", name = "O", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1044 = Static158.method3034("<br>(X");

	@OriginalMember(owner = "client!qf", name = "P", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1045 = Static158.method3034("Diese Welt ist voll)3");

	@OriginalMember(owner = "client!qf", name = "R", descriptor = "I")
	public static int anInt3849 = 0;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(I[BII[Lclient!hi;)V")
	public static void method2956(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class35[] arg3) {
		@Pc(10) Class2_Sub3 local10 = new Class2_Sub3(arg0);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(16) int local16 = local10.method232();
			if (local16 == 0) {
				return;
			}
			local12 += local16;
			@Pc(27) int local27 = 0;
			while (true) {
				@Pc(31) int local31 = local10.method237();
				if (local31 == 0) {
					break;
				}
				local27 += local31 - 1;
				@Pc(43) int local43 = local27 & 0x3F;
				@Pc(49) int local49 = local27 >> 6 & 0x3F;
				@Pc(53) int local53 = local27 >> 12;
				@Pc(57) int local57 = local10.method218();
				@Pc(61) int local61 = local57 >> 2;
				@Pc(66) int local66 = local49 + arg1;
				@Pc(70) int local70 = local57 & 0x3;
				@Pc(74) int local74 = arg2 + local43;
				if (local66 > 0 && local74 > 0 && local66 < 103 && local74 < 103) {
					@Pc(96) int local96 = local53;
					if ((Static147.aByteArrayArrayArray36[1][local66][local74] & 0x2) == 2) {
						local96 = local53 - 1;
					}
					@Pc(112) Class35 local112 = null;
					if (local96 >= 0) {
						local112 = arg3[local96];
					}
					Static7.method3558(local70, local66, local12, local53, Static8.aBoolean3, local74, local53, local61, true, local112);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public static void method2958(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) Class34 local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new Class34(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static118.aClass2_Sub17ArrayArrayArray1[local14][arg1][arg2] == null) {
					Static118.aClass2_Sub17ArrayArrayArray1[local14][arg1][arg2] = new Class2_Sub17(local14, arg1, arg2);
				}
			}
			Static118.aClass2_Sub17ArrayArrayArray1[arg0][arg1][arg2].aClass34_1 = local12;
		} else if (arg3 == 1) {
			local12 = new Class34(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static118.aClass2_Sub17ArrayArrayArray1[local14][arg1][arg2] == null) {
					Static118.aClass2_Sub17ArrayArrayArray1[local14][arg1][arg2] = new Class2_Sub17(local14, arg1, arg2);
				}
			}
			Static118.aClass2_Sub17ArrayArrayArray1[arg0][arg1][arg2].aClass34_1 = local12;
		} else {
			@Pc(134) Class45 local134 = new Class45(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static118.aClass2_Sub17ArrayArrayArray1[local14][arg1][arg2] == null) {
					Static118.aClass2_Sub17ArrayArrayArray1[local14][arg1][arg2] = new Class2_Sub17(local14, arg1, arg2);
				}
			}
			Static118.aClass2_Sub17ArrayArrayArray1[arg0][arg1][arg2].aClass45_1 = local134;
		}
	}
}
