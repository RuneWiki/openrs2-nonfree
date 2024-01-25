import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static424 {

	@OriginalMember(owner = "client!vk", name = "e", descriptor = "[I")
	public static int[] anIntArray629;

	@OriginalMember(owner = "client!vk", name = "b", descriptor = "I")
	public static int anInt7121 = 0;

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(ILclient!na;)V")
	public static void method5491(@OriginalArg(0) int arg0, @OriginalArg(1) Class146 arg1) {
		Static346.aClass146Array2[arg0] = arg1;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)V")
	public static void method5492(@OriginalArg(0) int arg0) {
		Static219.anInt4078 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static301.anInt5434; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static241.anInt4414; local6++) {
				if (Static40.aClass53ArrayArrayArray2[arg0][local3][local6] == null) {
					Static40.aClass53ArrayArrayArray2[arg0][local3][local6] = new Class53(arg0, local3, local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIIILclient!qa;IILclient!jb;Lclient!ea;)V")
	public static void method5493(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class30 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class126 arg6, @OriginalArg(8) Class57 arg7) {
		@Pc(15) Class25 local15 = Static236.aClass198_3.method4491(arg0);
		if (local15 == null || !local15.aBoolean44 || !local15.method666(Static155.aClass149_1)) {
			return;
		}
		@Pc(35) int local35;
		if (local15.anIntArray71 != null) {
			@Pc(33) int[] local33 = new int[local15.anIntArray71.length];
			@Pc(50) int local50;
			for (local35 = 0; local35 < local33.length / 2; local35++) {
				if (Static134.anInt2621 == 4) {
					local50 = (int) Static146.aFloat82 & 0x3FFF;
				} else {
					local50 = (int) Static146.aFloat82 + Static94.anInt2046 & 0x3FFF;
				}
				@Pc(61) int local61 = Class56.anIntArray119[local50];
				@Pc(65) int local65 = Class56.anIntArray120[local50];
				if (Static134.anInt2621 != 4) {
					local65 = local65 * 256 / (Static109.anInt6939 + 256);
					local61 = local61 * 256 / (Static109.anInt6939 + 256);
				}
				local33[local35 * 2] = ((arg1 + local15.anIntArray71[local35 * 2 + 1] * 4) * local61 + (local15.anIntArray71[local35 * 2] * 4 + arg5) * local65 >> 15) + arg6.anInt3421 / 2 + arg4;
				local33[local35 * 2 + 1] = arg2 + arg6.anInt3442 / 2 - (local65 * (local15.anIntArray71[local35 * 2 + 1] * 4 + arg1) - (arg5 + local15.anIntArray71[local35 * 2] * 4) * local61 >> 15);
			}
			Static135.method1965(arg3, local33, local15.anInt847, arg6.anIntArray282, arg6.anIntArray285);
			for (local50 = 0; local50 < local33.length / 2 - 1; local50++) {
				arg3.method4664(local33[local50 * 2], local33[local50 * 2 + 1], local33[(local50 + 1) * 2], local33[(local50 + 1) * 2 + 1], local15.anInt867, arg7, arg4, arg2);
			}
			arg3.method4664(local33[local33.length - 2], local33[local33.length - 1], local33[0], local33[1], local15.anInt867, arg7, arg4, arg2);
		}
		@Pc(276) Class3 local276 = null;
		if (local15.anInt855 != -1) {
			local276 = local15.method670(arg3, false);
			if (local276 != null) {
				Static134.method1948(arg7, arg6, local276, arg1, arg5, arg4, arg2);
			}
		}
		if (local15.aString8 == null) {
			return;
		}
		local35 = 0;
		if (local276 != null) {
			local35 = local276.qa();
		}
		@Pc(311) Class105 local311 = Static162.aClass105_6;
		@Pc(313) Class215 local313 = Static26.aClass215_1;
		if (local15.anInt861 == 1) {
			local311 = Static390.aClass105_7;
			local313 = Static254.aClass215_7;
		}
		if (local15.anInt861 == 2) {
			local313 = Static266.aClass215_8;
			local311 = Static245.aClass105_4;
		}
		Static4.method118(arg4, arg2, arg5, local35, local15.aString8, arg1, arg6, local15.anInt862, local313, arg7, local311);
		return;
	}
}
