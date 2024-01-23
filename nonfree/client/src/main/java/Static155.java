import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!pc", name = "P", descriptor = "Lclient!qe;")
	public static Class78 aClass78_643 = Static199.method3560("<img=0>");

	@OriginalMember(owner = "client!pc", name = "Y", descriptor = "I")
	public static int anInt3569 = 0;

	@OriginalMember(owner = "client!pc", name = "ab", descriptor = "[Lclient!qe;")
	public static Class78[] aClass78Array26 = new Class78[100];

	@OriginalMember(owner = "client!pc", name = "fb", descriptor = "[I")
	public static int[] anIntArray589 = new int[32];

	@OriginalMember(owner = "client!pc", name = "ob", descriptor = "[[B")
	public static byte[][] aByteArrayArray11 = new byte[1000][];

	@OriginalMember(owner = "client!pc", name = "zb", descriptor = "[J")
	public static long[] aLongArray9 = new long[100];

	@OriginalMember(owner = "client!pc", name = "Eb", descriptor = "I")
	public static volatile int anInt3590 = -1;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IB)V")
	public static void method2767(@OriginalArg(0) int arg0) {
		Static158.anInt3655 = arg0;
		if (Static226.anInt4903 == 40) {
			Static125.method1281(8);
		} else {
			Static125.method1281(10);
		}
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(II)I")
	public static int method2769(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIBIIIII)V")
	public static void method2782(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = arg2 - arg4;
		@Pc(15) int local15 = arg6 - arg3;
		@Pc(23) int local23 = (arg1 - arg0 << 16) / local15;
		@Pc(32) int local32 = (arg5 - arg7 << 16) / local10;
		@Pc(45) boolean local45;
		if (Static103.anInt2272 > 0 && Static103.anInt2272 % 10 < 5) {
			local45 = true;
		} else {
			local45 = false;
		}
		@Pc(67) int local67;
		@Pc(72) int local72;
		@Pc(88) int local88;
		@Pc(96) int local96;
		@Pc(104) int local104;
		@Pc(147) int local147;
		@Pc(153) int local153;
		for (@Pc(51) int local51 = 0; local51 < local10; local51++) {
			@Pc(59) int local59 = local51 * local32 >> 16;
			local67 = (local51 + 1) * local32 >> 16;
			local72 = local67 - local59;
			if (local72 > 0) {
				local59 += arg7;
				@Pc(86) int[][] local86 = Static35.anIntArrayArrayArray2[arg4 + local51 >> 6];
				for (local88 = 0; local88 < local15; local88++) {
					local96 = local23 * local88 >> 16;
					local104 = (local88 + 1) * local23 >> 16;
					@Pc(109) int local109 = local104 - local96;
					if (local109 > 0) {
						local96 += arg0;
						@Pc(128) int local128 = arg3 + local88 >> 6;
						if (local86[local128] != null) {
							local147 = ((local88 + arg3 & 0x3F) << 6) + (local51 + arg4 & 0x3F);
							local153 = local86[local128][local147];
							if (local153 != 0) {
								@Pc(164) Class2_Sub3_Sub17 local164 = Static121.method3984(local153 - 1);
								if (local45 && local164.anInt2391 == Static97.anInt2135) {
									@Pc(174) Class2_Sub9 local174 = new Class2_Sub9();
									local174.anInt563 = local164.anInt2391;
									local174.anInt570 = local59;
									local174.anInt572 = local96;
									Static142.aClass44_36.method1355(local174);
								}
								Static2.aClass2_Sub3_Sub8_Sub1Array1[local164.anInt2391].method2262(local59 - 7, local96 + -7);
							}
						}
					}
				}
			}
		}
		if (Static174.aDouble11 == Static165.aDouble10) {
			for (@Pc(220) Class2_Sub27 local220 = (Class2_Sub27) Static81.aClass44_17.method1359(); local220 != null; local220 = (Class2_Sub27) Static81.aClass44_17.method1356()) {
				local67 = local220.anInt4762;
				local72 = local220.anInt4761;
				local96 = local220.anInt4763;
				local72 = Static30.anInt547 + Static45.anInt815 - local72;
				local88 = (arg1 - arg0) * (local72 - arg3) / (arg6 - arg3) + arg0;
				local67 -= Static221.anInt4795;
				@Pc(274) int local274 = (arg5 - arg7) * (local67 - arg4) / (arg2 - arg4) + arg7;
				local104 = 16777215;
				@Pc(278) Class111 local278 = null;
				if (local96 == 0) {
					if (Static174.aDouble11 == 3.0D) {
						local278 = Static127.aClass111_42;
					}
					if (Static174.aDouble11 == 4.0D) {
						local278 = Static37.aClass111_5;
					}
					if (Static174.aDouble11 == 6.0D) {
						local278 = Static161.aClass111_35;
					}
					if (Static174.aDouble11 == 8.0D) {
						local278 = Static71.aClass111_19;
					}
				}
				if (local96 == 1) {
					if (Static174.aDouble11 == 3.0D) {
						local278 = Static161.aClass111_35;
					}
					if (Static174.aDouble11 == 4.0D) {
						local278 = Static71.aClass111_19;
					}
					if (Static174.aDouble11 == 6.0D) {
						local278 = Static54.aClass111_9;
					}
					if (Static174.aDouble11 == 8.0D) {
						local278 = Static201.aClass111_40;
					}
				}
				if (local96 == 2) {
					if (Static174.aDouble11 == 3.0D) {
						local278 = Static54.aClass111_9;
					}
					local104 = 16755200;
					if (Static174.aDouble11 == 4.0D) {
						local278 = Static201.aClass111_40;
					}
					if (Static174.aDouble11 == 6.0D) {
						local278 = Static183.aClass111_38;
					}
					if (Static174.aDouble11 == 8.0D) {
						local278 = Static205.aClass111_8;
					}
				}
				if (local278 != null) {
					@Pc(367) Class78[] local367 = local220.aClass78Array38;
					local147 = local367.length;
					local88 -= (local147 - 1) * local278.method3900() / 2;
					local88 += local278.method3902() / 2;
					for (local153 = 0; local153 < local147; local153++) {
						local278.method3903(local367[local153], local274, local88, local104);
						local88 += local278.method3900();
					}
				}
			}
		}
		for (@Pc(422) Class2_Sub9 local422 = (Class2_Sub9) Static142.aClass44_36.method1359(); local422 != null; local422 = (Class2_Sub9) Static142.aClass44_36.method1356()) {
			Static2.aClass2_Sub3_Sub8_Sub1Array1[local422.anInt563].method2262(local422.anInt570 - 7, local422.anInt572 + -7);
			Static217.method3766(local422.anInt570, local422.anInt572, 15, 16776960, 128);
			Static217.method3766(local422.anInt570, local422.anInt572, 7, 16777215, 256);
		}
		Static142.aClass44_36.method1362();
	}
}
