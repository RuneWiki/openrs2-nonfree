import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!cn", name = "j", descriptor = "Lclient!kn;")
	public static Class116 aClass116_4;

	@OriginalMember(owner = "client!cn", name = "g", descriptor = "[I")
	public static final int[] anIntArray54 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!cn", name = "u", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray12 = new String[100];

	@OriginalMember(owner = "client!cn", name = "v", descriptor = "Lclient!pm;")
	public static final Class159 aClass159_70 = new Class159("cyan:", "blaugrün:", "cyan:", "cyan:");

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(ILclient!cn;IZLclient!vq;IILclient!ug;IBZLclient!vq;)Lclient!vj;")
	public static Class58 method929(@OriginalArg(0) int arg0, @OriginalArg(1) Class33 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class47 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class51 arg7, @OriginalArg(8) int arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) Class47 arg10) {
		@Pc(15) Class58 local15 = Static295.method4919(arg8, arg1, arg2, arg0, arg6, arg4, arg5);
		if (local15 != null) {
			return local15;
		}
		@Pc(23) Class210 local23 = Static177.method3465(arg6);
		@Pc(35) int local35;
		if (arg2 > 1 && local23.anIntArray498 != null) {
			@Pc(33) int local33 = -1;
			for (local35 = 0; local35 < 10; local35++) {
				if (local23.anIntArray499[local35] <= arg2 && local23.anIntArray499[local35] != 0) {
					local33 = local23.anIntArray498[local35];
				}
			}
			if (local33 != -1) {
				local23 = Static177.method3465(local33);
			}
		}
		@Pc(81) Class165 local81 = Static170.method3292(local23.anInt6479, Static151.aClass193_52);
		if (local81 == null) {
			return null;
		}
		if (local23.aShortArray108 != null) {
			for (local35 = 0; local35 < local23.aShortArray108.length; local35++) {
				if (local23.aByteArray91 == null || local23.aByteArray91.length <= local35) {
					local81.method4481(local23.aShortArray108[local35], local23.aShortArray109[local35]);
				} else {
					local81.method4481(local23.aShortArray108[local35], Static293.aShortArray57[local23.aByteArray91[local35] & 0xFF]);
				}
			}
		}
		if (local23.aShortArray111 != null) {
			for (local35 = 0; local35 < local23.aShortArray111.length; local35++) {
				local81.method4476(local23.aShortArray111[local35], local23.aShortArray110[local35]);
			}
		}
		if (arg1 != null) {
			for (local35 = 0; local35 < 5; local35++) {
				if (arg1.anIntArray56[local35] < Static106.aShortArrayArray5[local35].length) {
					local81.method4481(Static155.aShortArray46[local35], Static106.aShortArrayArray5[local35][arg1.anIntArray56[local35]]);
				}
				if (Static62.aShortArrayArray1[local35].length > arg1.anIntArray56[local35]) {
					local81.method4481(Static139.aShortArray45[local35], Static62.aShortArrayArray1[local35][arg1.anIntArray56[local35]]);
				}
			}
		}
		@Pc(228) short local228 = 1024;
		@Pc(230) boolean local230 = false;
		if (local23.anInt6503 != 128 || local23.anInt6477 != 128 || local23.anInt6508 != 128) {
			local228 = 1031;
			local230 = true;
		}
		@Pc(272) Class38 local272 = arg10.method2717(local81, local228, 0, local23.anInt6499 + 64, local23.anInt6489 + 768);
		if (!local272.method1912()) {
			return null;
		}
		if (local230) {
			local272.method1919(local23.anInt6503, local23.anInt6477, local23.anInt6508);
		}
		@Pc(289) Class58 local289 = null;
		if (local23.anInt6496 != -1) {
			local289 = method929(1, arg1, 10, true, arg4, 0, local23.anInt6500, arg7, 0, true, arg10);
			if (local289 == null) {
				return null;
			}
		} else if (local23.anInt6509 != -1) {
			local289 = method929(arg0, arg1, arg2, false, arg4, 0, local23.anInt6516, arg7, arg8, true, arg10);
			if (local289 == null) {
				return null;
			}
		}
		@Pc(340) int local340 = local23.anInt6481;
		arg10.method2660(16, 16, 512, 512);
		if (arg3) {
			local340 = (int) ((double) local340 * 1.5D);
		} else if (arg0 == 2) {
			local340 = (int) ((double) local340 * 1.04D);
		}
		@Pc(368) Class57 local368 = arg10.method2705();
		local368.method4193();
		arg10.method2656(local368);
		arg10.method2662(1.0F);
		arg10.method2746(16777215, 1.0F, 1.0F, -50.0F, -10.0F, -50.0F);
		@Pc(387) Class57 local387 = arg10.method2706();
		local387.method4200(-local23.anInt6478 << 3);
		local387.method4199(local23.anInt6476 << 3);
		local387.method4190(local23.anInt6513, (Class118_Sub1.anIntArray314[local23.anInt6488 << 3] * local340 >> 15) + local23.anInt6517 - local272.method1921() / 2, (Class118_Sub1.anIntArray317[local23.anInt6488 << 3] * local340 >> 15) + local23.anInt6517);
		local387.method4196(local23.anInt6488 << 3);
		@Pc(445) int local445 = arg10.method2683();
		@Pc(448) int local448 = arg10.method2700();
		arg10.method2655(50, Integer.MAX_VALUE);
		arg10.method2678();
		arg10.method2722();
		arg10.method2682(0, 0, 36, 32, 0, 0);
		local272.method1925(local387, null, 1);
		arg10.method2655(local445, local448);
		@Pc(480) int[] local480 = arg10.method2752();
		if (arg0 >= 1) {
			local480 = Static19.method321(-16777215, local480);
			if (arg0 >= 2) {
				local480 = Static19.method321(-1, local480);
			}
		}
		if (arg8 != 0) {
			Static310.method5116(local480, arg8);
		}
		arg10.method2679(local480, 36, 36, 32).method4269(0, 0);
		if (local23.anInt6496 != -1) {
			local289.method4269(0, 0);
		} else if (local23.anInt6509 != -1) {
			local289.method4269(0, 0);
		}
		if (arg5 == 1 || arg5 == 2 && (local23.anInt6501 == 1 || arg2 != 1) && arg2 != -1) {
			arg7.method4237(-256, -16777215, 0, Static187.method3559(arg2), 9);
		}
		local480 = arg10.method2752();
		for (@Pc(568) int local568 = 0; local568 < local480.length; local568++) {
			if ((local480[local568] & 0xFFFFFF) == 0) {
				local480[local568] = 0;
			} else {
				local480[local568] |= 0xFF000000;
			}
		}
		@Pc(609) Class58 local609;
		if (arg9) {
			local609 = arg10.method2679(local480, 36, 36, 32);
		} else {
			local609 = arg4.method2679(local480, 36, 36, 32);
		}
		if (!arg9) {
			@Pc(625) Class23 local625 = new Class23();
			local625.anInt800 = arg4.anInt3056;
			local625.anInt806 = arg5;
			local625.anInt802 = arg6;
			local625.aBoolean84 = arg1 != null;
			local625.anInt810 = arg0;
			local625.anInt799 = arg2;
			local625.anInt805 = arg8;
			Static160.aClass103_1.method2977(local625, local609);
		}
		return local609;
	}
}
