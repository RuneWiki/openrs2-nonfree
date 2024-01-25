import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIILclient!aa;Lclient!ha;IILclient!vo;I)V")
	public static void method8905(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class1 arg3, @OriginalArg(4) Class75 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class381 arg6, @OriginalArg(8) int arg7) {
		@Pc(10) Class361 local10 = Static508.aClass190_3.method4695(arg1);
		if (local10 == null || !local10.aBoolean721 || !local10.method8534(Static303.aClass55_2)) {
			return;
		}
		@Pc(41) int local41;
		if (local10.anIntArray644 != null) {
			@Pc(39) int[] local39 = new int[local10.anIntArray644.length];
			@Pc(55) int local55;
			@Pc(66) int local66;
			@Pc(70) int local70;
			for (local41 = 0; local41 < local39.length / 2; local41++) {
				if (Static526.anInt8626 == 4) {
					local55 = (int) Static409.aFloat135 & 0x3FFF;
				} else {
					local55 = (int) Static409.aFloat135 + Static51.anInt622 & 0x3FFF;
				}
				local66 = Class6_Sub2_Sub12.anIntArray293[local55];
				local70 = Class6_Sub2_Sub12.anIntArray292[local55];
				if (Static526.anInt8626 != 4) {
					local66 = local66 * 256 / (Static41.anInt542 + 256);
					local70 = local70 * 256 / (Static41.anInt542 + 256);
				}
				local39[local41 * 2] = arg6.anInt10159 / 2 + arg5 + (local66 * (local10.anIntArray644[local41 * 2 + 1] * 4 + arg2) + (arg7 + local10.anIntArray644[local41 * 2] * 4) * local70 >> 14);
				local39[local41 * 2 + 1] = arg0 + arg6.anInt10131 / 2 - ((arg2 + local10.anIntArray644[local41 * 2 + 1] * 4) * local70 - (local10.anIntArray644[local41 * 2] * 4 + arg7) * local66 >> 14);
			}
			Static355.method5422(arg4, local39, local10.anInt9810, arg6.anIntArray662, arg6.anIntArray668);
			if (local10.anInt9797 <= 0) {
				for (local55 = 0; local55 < local39.length / 2 - 1; local55++) {
					arg4.method6679(local39[local55 * 2], local39[local55 * 2 + 1], local39[(local55 + 1) * 2], local39[local55 * 2 + 1 + 2], local10.anIntArray643[local10.aByteArray105[local55] & 0xFF], arg3, arg5, arg0);
				}
				arg4.method6679(local39[local39.length - 2], local39[local39.length - 1], local39[0], local39[1], local10.anIntArray643[local10.aByteArray105[local10.aByteArray105.length - 1] & 0xFF], arg3, arg5, arg0);
			} else {
				@Pc(339) int local339;
				@Pc(349) int local349;
				@Pc(368) int local368;
				@Pc(378) int local378;
				for (local55 = 0; local55 < local39.length / 2 - 1; local55++) {
					local66 = local39[local55 * 2];
					local70 = local39[local55 * 2 + 1];
					local339 = local39[local55 * 2 + 2];
					local349 = local39[(local55 + 1) * 2 + 1];
					if (local339 < local66) {
						local368 = local66;
						local378 = local70;
						local66 = local339;
						local339 = local368;
						local70 = local349;
						local349 = local378;
					} else if (local66 == local339 && local70 > local349) {
						local368 = local70;
						local70 = local349;
						local349 = local368;
					}
					arg4.method6635(local66, local70, local339, local349, local10.anIntArray643[local10.aByteArray105[local55] & 0xFF], arg3, arg5, arg0, local10.anInt9797, local10.anInt9806, local10.anInt9815);
				}
				local66 = local39[local39.length - 2];
				local70 = local39[local39.length - 1];
				local339 = local39[0];
				local349 = local39[1];
				if (local339 < local66) {
					local368 = local66;
					local66 = local339;
					local378 = local70;
					local339 = local368;
					local70 = local349;
					local349 = local378;
				} else if (local66 == local339 && local349 < local70) {
					local368 = local70;
					local70 = local349;
					local349 = local368;
				}
				arg4.method6635(local66, local70, local339, local349, local10.anIntArray643[local10.aByteArray105[local10.aByteArray105.length - 1] & 0xFF], arg3, arg5, arg0, local10.anInt9797, local10.anInt9806, local10.anInt9815);
			}
		}
		@Pc(516) Class49 local516 = null;
		if (local10.anInt9805 != -1) {
			local516 = local10.method8531(false, arg4);
			if (local516 != null) {
				Static161.method3199(arg3, arg6, local516, arg0, arg7, arg5, arg2);
			}
		}
		if (local10.aString117 == null) {
			return;
		}
		local41 = 0;
		if (local516 != null) {
			local41 = local516.method8993();
		}
		@Pc(552) Class67 local552 = Static23.aClass67_1;
		@Pc(554) Class53 local554 = Static574.aClass53_13;
		if (local10.anInt9814 == 1) {
			local554 = Static507.aClass53_16;
			local552 = Static180.aClass67_5;
		}
		if (local10.anInt9814 == 2) {
			local552 = Static205.aClass67_6;
			local554 = Static228.aClass53_7;
		}
		Static196.method3699(arg3, arg7, local41, arg5, local554, local10.anInt9803, local10.aString117, arg2, arg0, arg6, local552);
		return;
	}
}
