import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static311 {

	@OriginalMember(owner = "client!lu", name = "d", descriptor = "Lclient!hca;")
	public static Class134 aClass134_2;

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(IIIILclient!ua;ILclient!r;ILclient!n;)V")
	public static void method5269(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class6 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class44 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class225 arg7) {
		@Pc(10) Class338 local10 = Static182.aClass142_3.method3366(arg2);
		if (local10 == null || !local10.aBoolean683 || !local10.method7973(Static45.aClass148_1)) {
			return;
		}
		@Pc(30) int local30;
		if (local10.anIntArray522 != null) {
			@Pc(28) int[] local28 = new int[local10.anIntArray522.length];
			@Pc(44) int local44;
			for (local30 = 0; local30 < local28.length / 2; local30++) {
				if (Static166.anInt3419 == 4) {
					local44 = (int) Static201.aFloat128 & 0x3FFF;
				} else {
					local44 = Static368.anInt7167 + (int) Static201.aFloat128 & 0x3FFF;
				}
				@Pc(55) int local55 = Class4_Sub27.anIntArray296[local44];
				@Pc(59) int local59 = Class4_Sub27.anIntArray297[local44];
				if (Static166.anInt3419 != 4) {
					local59 = local59 * 256 / (Static595.anInt10298 + 256);
					local55 = local55 * 256 / (Static595.anInt10298 + 256);
				}
				local28[local30 * 2] = arg7.anInt6529 / 2 + arg6 + (local59 * (arg4 - -(local10.anIntArray522[local30 * 2] * 4)) + (arg0 + local10.anIntArray522[local30 * 2 + 1] * 4) * local55 >> 14);
				local28[local30 * 2 + 1] = arg7.anInt6521 / 2 + arg1 - (local59 * (arg0 - -(local10.anIntArray522[local30 * 2 + 1] * 4)) + -((arg4 - -(local10.anIntArray522[local30 * 2] * 4)) * local55) >> 14);
			}
			Static64.method1025(arg5, local28, local10.anInt9749, arg7.anIntArray331, arg7.anIntArray325);
			for (local44 = 0; local44 < local28.length / 2 - 1; local44++) {
				arg5.method4995(local28[local44 * 2], local28[local44 * 2 + 1], local28[(local44 + 1) * 2], local28[local44 * 2 + 2 + 1], local10.anInt9743, arg3, arg6, arg1);
			}
			arg5.method4995(local28[local28.length - 2], local28[local28.length - 1], local28[0], local28[1], local10.anInt9743, arg3, arg6, arg1);
		}
		@Pc(265) Class78 local265 = null;
		if (local10.anInt9756 != -1) {
			local265 = local10.method7970(false, arg5);
			if (local265 != null) {
				Static192.method3340(local265, arg6, arg7, arg0, arg4, arg3, arg1);
			}
		}
		if (local10.aString92 == null) {
			return;
		}
		local30 = 0;
		if (local265 != null) {
			local30 = local265.u();
		}
		@Pc(299) Class58 local299 = Static454.aClass58_13;
		@Pc(301) Class114 local301 = Static211.aClass114_7;
		if (local10.anInt9762 == 1) {
			local299 = Static272.aClass58_5;
			local301 = Static238.aClass114_9;
		}
		if (local10.anInt9762 == 2) {
			local301 = Static314.aClass114_11;
			local299 = Static552.aClass58_14;
		}
		Static413.method6813(arg6, local10.anInt9740, local301, arg4, local30, arg1, arg7, arg0, arg3, local299, local10.aString92);
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(B)V")
	public static void method5270() {
		Static463.method5949(Static214.aClass4_Sub19_Sub1_1.anInt3074);
		@Pc(18) int local18 = (Static24.anInt387 >> 12) + (Static552.anInt9805 >> 3);
		Static13.anInt231 = Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.aByte126 = 0;
		@Pc(31) int local31 = (Static110.anInt2624 >> 12) + (Static254.anInt4667 >> 3);
		Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.method6943(8, 8);
		Static24.aByteArrayArray1 = new byte[18][];
		Static407.anIntArray393 = new int[18];
		Static75.anIntArray18 = new int[18];
		Static125.anIntArray128 = new int[18];
		Static215.aByteArrayArray13 = new byte[18][];
		Static83.anIntArray82 = new int[18];
		Static542.anIntArray516 = new int[18];
		Static28.aByteArrayArray2 = new byte[18][];
		Static172.anIntArray164 = new int[18];
		Static85.aByteArrayArray6 = new byte[18][];
		Static498.anIntArrayArray55 = new int[18][4];
		Static160.aByteArrayArray10 = new byte[18][];
		@Pc(82) int local82 = 0;
		@Pc(102) int local102;
		for (@Pc(91) int local91 = (local18 - (Static428.anInt8046 >> 4)) / 8; local91 <= (local18 + (Static428.anInt8046 >> 4)) / 8; local91++) {
			for (local102 = (local31 - (Static119.anInt2717 >> 4)) / 8; local102 <= (local31 + (Static119.anInt2717 >> 4)) / 8; local102++) {
				@Pc(110) int local110 = (local91 << 8) + local102;
				Static75.anIntArray18[local82] = local110;
				Static542.anIntArray516[local82] = Static261.aClass176_69.method3998("m" + local91 + "_" + local102);
				Static125.anIntArray128[local82] = Static261.aClass176_69.method3998("l" + local91 + "_" + local102);
				Static83.anIntArray82[local82] = Static261.aClass176_69.method3998("n" + local91 + "_" + local102);
				Static407.anIntArray393[local82] = Static261.aClass176_69.method3998("um" + local91 + "_" + local102);
				Static172.anIntArray164[local82] = Static261.aClass176_69.method3998("ul" + local91 + "_" + local102);
				if (Static83.anIntArray82[local82] == -1) {
					Static542.anIntArray516[local82] = -1;
					Static125.anIntArray128[local82] = -1;
					Static407.anIntArray393[local82] = -1;
					Static172.anIntArray164[local82] = -1;
				}
				local82++;
			}
		}
		for (local102 = local82; local102 < Static83.anIntArray82.length; local102++) {
			Static83.anIntArray82[local102] = -1;
			Static542.anIntArray516[local102] = -1;
			Static125.anIntArray128[local102] = -1;
			Static407.anIntArray393[local102] = -1;
			Static172.anIntArray164[local102] = -1;
		}
		@Pc(278) byte local278;
		if (Static203.anInt3855 == 3) {
			local278 = 4;
		} else {
			local278 = 8;
		}
		Static285.method5612(false, local278, local31, local18);
	}
}
