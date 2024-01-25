import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!as", name = "f", descriptor = "[I")
	public static final int[] anIntArray19 = new int[4];

	@OriginalMember(owner = "client!as", name = "c", descriptor = "Z")
	public static final boolean aBoolean16 = false;

	@OriginalMember(owner = "client!as", name = "b", descriptor = "[J")
	public static final long[] aLongArray1 = new long[32];

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(ILclient!aa;IILclient!av;Lclient!ha;ZII)V")
	public static void method399(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class20 arg4, @OriginalArg(5) Class67 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) Class105 local10 = Static462.aClass98_2.method2452(arg2);
		if (local10 == null || !local10.aBoolean253 || !local10.method2655(Static577.aClass362_1)) {
			return;
		}
		@Pc(43) int local43;
		if (local10.anIntArray150 != null) {
			@Pc(41) int[] local41 = new int[local10.anIntArray150.length];
			@Pc(70) int local70;
			@Pc(74) int local74;
			for (local43 = 0; local43 < local41.length / 2; local43++) {
				@Pc(59) int local59;
				if (Static175.anInt10579 == 4) {
					local59 = (int) Static658.aFloat196 & 0x3FFF;
				} else {
					local59 = Static543.anInt9108 + (int) Static658.aFloat196 & 0x3FFF;
				}
				local70 = Class3_Sub2_Sub21.anIntArray358[local59];
				local74 = Class3_Sub2_Sub21.anIntArray356[local59];
				if (Static175.anInt10579 != 4) {
					local70 = local70 * 256 / (Static61.anInt953 + 256);
					local74 = local74 * 256 / (Static61.anInt953 + 256);
				}
				local41[local43 * 2] = ((local10.anIntArray150[local43 * 2 + 1] * 4 + arg3) * local70 + local74 * (arg6 + local10.anIntArray150[local43 * 2] * 4) >> 14) + arg4.anInt509 / 2 + arg7;
				local41[local43 * 2 + 1] = arg4.anInt569 / 2 + arg0 - (local74 * (local10.anIntArray150[local43 * 2 + 1] * 4 + arg3) - (arg6 - -(local10.anIntArray150[local43 * 2] * 4)) * local70 >> 14);
			}
			@Pc(197) Class331 local197 = arg4.method473(arg5);
			if (local197 != null) {
				Static544.method7622(arg5, local41, local10.anInt3110, local197.anIntArray524, local197.anIntArray523);
			}
			if (local10.anInt3098 <= 0) {
				for (local70 = 0; local70 < local41.length / 2 - 1; local70++) {
					arg5.method7713(local41[local70 * 2], local41[local70 * 2 + 1], local41[(local70 + 1) * 2], local41[(local70 + 1) * 2 + 1], local10.anIntArray151[local10.aByteArray15[local70] & 0xFF], arg1, arg7, arg0);
				}
				arg5.method7713(local41[local41.length - 2], local41[local41.length - 1], local41[0], local41[1], local10.anIntArray151[local10.aByteArray15[local10.aByteArray15.length - 1] & 0xFF], arg1, arg7, arg0);
			} else {
				@Pc(341) int local341;
				@Pc(349) int local349;
				@Pc(359) int local359;
				@Pc(382) int local382;
				@Pc(392) int local392;
				for (local70 = 0; local70 < local41.length / 2 - 1; local70++) {
					local74 = local41[local70 * 2];
					local341 = local41[local70 * 2 + 1];
					local349 = local41[(local70 + 1) * 2];
					local359 = local41[local70 * 2 + 2 + 1];
					if (local74 > local349) {
						local382 = local74;
						local392 = local341;
						local74 = local349;
						local349 = local382;
						local341 = local359;
						local359 = local392;
					} else if (local74 == local349 && local341 > local359) {
						local382 = local341;
						local341 = local359;
						local359 = local382;
					}
					arg5.method7698(local74, local341, local349, local359, local10.anIntArray151[local10.aByteArray15[local70] & 0xFF], arg1, arg7, arg0, local10.anInt3098, local10.anInt3095, local10.anInt3073);
				}
				local74 = local41[local41.length - 2];
				local341 = local41[local41.length - 1];
				local349 = local41[0];
				local359 = local41[1];
				if (local349 < local74) {
					local382 = local74;
					local392 = local341;
					local74 = local349;
					local349 = local382;
					local341 = local359;
					local359 = local392;
				} else if (local349 == local74 && local341 > local359) {
					local382 = local341;
					local341 = local359;
					local359 = local382;
				}
				arg5.method7698(local74, local341, local349, local359, local10.anIntArray151[local10.aByteArray15[local10.aByteArray15.length - 1] & 0xFF], arg1, arg7, arg0, local10.anInt3098, local10.anInt3095, local10.anInt3073);
			}
		}
		@Pc(526) Class9 local526 = null;
		if (local10.anInt3103 != -1) {
			local526 = local10.method2653(arg5, false);
			if (local526 != null) {
				Static38.method564(arg6, arg4, arg7, arg1, local526, arg0, arg3);
			}
		}
		if (local10.aString57 == null) {
			return;
		}
		local43 = 0;
		if (local526 != null) {
			local43 = local526.method8611();
		}
		@Pc(561) Class44 local561 = Static705.aClass44_53;
		@Pc(563) Class330 local563 = Static48.aClass330_1;
		if (local10.anInt3109 == 1) {
			local563 = Static687.aClass330_13;
			local561 = Static418.aClass44_32;
		}
		if (local10.anInt3109 == 2) {
			local563 = Static381.aClass330_7;
			local561 = Static427.aClass44_34;
		}
		Static661.method8826(local43, arg3, local561, arg4, local10.anInt3076, arg6, local563, arg0, arg1, arg7, local10.aString57);
		return;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(JI)I")
	public static int method401(@OriginalArg(0) long arg0) {
		Static490.method7108(arg0);
		return Static321.aCalendar10.get(1);
	}
}
