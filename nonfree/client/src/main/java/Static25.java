import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!cc", name = "t", descriptor = "I")
	public static int anInt627;

	@OriginalMember(owner = "client!cc", name = "A", descriptor = "I")
	public static int anInt633;

	@OriginalMember(owner = "client!cc", name = "s", descriptor = "Lclient!ia;")
	private static Class51 aClass51_200 = Static64.method1101("Use");

	@OriginalMember(owner = "client!cc", name = "m", descriptor = "Lclient!ia;")
	public static Class51 aClass51_198 = aClass51_200;

	@OriginalMember(owner = "client!cc", name = "n", descriptor = "Lclient!ia;")
	public static Class51 aClass51_199 = Static64.method1101("(U");

	@OriginalMember(owner = "client!cc", name = "B", descriptor = "Lclient!ia;")
	public static Class51 aClass51_201 = Static64.method1101("Stufe)2");

	@OriginalMember(owner = "client!cc", name = "F", descriptor = "Lclient!ia;")
	public static Class51 aClass51_202 = Static64.method1101(")4a=");

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IILclient!mb;)[Lclient!fe;")
	public static Class41_Sub1[] method498(@OriginalArg(1) int arg0, @OriginalArg(2) Class70 arg1) {
		return Static118.method1947(arg1, arg0) ? Static20.method448() : null;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(BILclient!mb;)Lclient!lc;")
	public static Class41 method501(@OriginalArg(1) int arg0, @OriginalArg(2) Class70 arg1) {
		return Static118.method1947(arg1, arg0) ? Static71.method1257() : null;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIIIBIII)V")
	public static void method502(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = arg6 - arg0;
		@Pc(22) boolean local22;
		if (Static198.anInt4218 > 0 && Static198.anInt4218 % 10 < 5) {
			local22 = true;
		} else {
			local22 = false;
		}
		@Pc(31) int local31 = arg5 - arg2;
		@Pc(40) int local40 = (arg3 - arg7 << 16) / local31;
		@Pc(48) int local48 = (arg4 - arg1 << 16) / local10;
		@Pc(70) int local70;
		@Pc(75) int local75;
		@Pc(98) int local98;
		@Pc(106) int local106;
		@Pc(114) int local114;
		@Pc(159) int local159;
		@Pc(165) int local165;
		for (@Pc(54) int local54 = 0; local54 < local31; local54++) {
			@Pc(62) int local62 = local40 * local54 >> 16;
			local70 = (local54 + 1) * local40 >> 16;
			local75 = local70 - local62;
			if (local75 > 0) {
				local62 += arg7;
				@Pc(96) int[][] local96 = Static82.anIntArrayArrayArray3[local54 + arg2 >> 6];
				for (local98 = 0; local98 < local10; local98++) {
					local106 = local48 * local98 >> 16;
					local114 = (local98 + 1) * local48 >> 16;
					@Pc(119) int local119 = local114 - local106;
					if (local119 > 0) {
						local106 += arg1;
						@Pc(139) int local139 = local98 + arg0 >> 6;
						if (local96[local139] != null) {
							local159 = (local54 + arg2 & 0x3F) + ((local98 + arg0 & 0x3F) << 6);
							local165 = local96[local139][local159];
							if (local165 != 0) {
								@Pc(176) Class82 local176 = Static9.method132(local165 - 1);
								if (local22 && local176.anInt3274 == anInt627) {
									@Pc(186) Class1_Sub23 local186 = new Class1_Sub23();
									local186.anInt3913 = local62;
									local186.anInt3914 = local106;
									local186.anInt3915 = local176.anInt3274;
									Static212.aClass105_24.method3119(local186);
								}
								Static125.aClass1_Sub2_Sub1_Sub1Array3[local176.anInt3274].method2064(local62 - 7, local106 + -7);
							}
						}
					}
				}
			}
		}
		if (Static227.aDouble11 == Static10.aDouble1) {
			for (@Pc(228) Class1_Sub22 local228 = (Class1_Sub22) Static212.aClass105_23.method3120(); local228 != null; local228 = (Class1_Sub22) Static212.aClass105_23.method3109()) {
				local70 = local228.anInt3127;
				local75 = local228.anInt3118;
				local70 -= Static200.anInt4248;
				local114 = 16777215;
				local75 = Static87.anInt2017 + Static108.anInt2405 - local75;
				local106 = local228.anInt3123;
				@Pc(254) Class67 local254 = null;
				@Pc(271) int local271 = arg7 + (local70 - arg2) * (arg3 + -arg7) / (arg5 - arg2);
				local98 = (local75 - arg0) * (arg4 - arg1) / (arg6 - arg0) + arg1;
				if (local106 == 0) {
					if (Static10.aDouble1 == 3.0D) {
						local254 = Static201.aClass67_9;
					}
					if (Static10.aDouble1 == 4.0D) {
						local254 = Static5.aClass67_6;
					}
					if (Static10.aDouble1 == 6.0D) {
						local254 = Static200.aClass67_8;
					}
					if (Static10.aDouble1 == 8.0D) {
						local254 = Static50.aClass67_2;
					}
				}
				if (local106 == 1) {
					if (Static10.aDouble1 == 3.0D) {
						local254 = Static200.aClass67_8;
					}
					if (Static10.aDouble1 == 4.0D) {
						local254 = Static50.aClass67_2;
					}
					if (Static10.aDouble1 == 6.0D) {
						local254 = Static206.aClass67_10;
					}
					if (Static10.aDouble1 == 8.0D) {
						local254 = Static164.aClass67_7;
					}
				}
				if (local106 == 2) {
					local114 = 16755200;
					if (Static10.aDouble1 == 3.0D) {
						local254 = Static206.aClass67_10;
					}
					if (Static10.aDouble1 == 4.0D) {
						local254 = Static164.aClass67_7;
					}
					if (Static10.aDouble1 == 6.0D) {
						local254 = Static142.aClass67_5;
					}
					if (Static10.aDouble1 == 8.0D) {
						local254 = Static62.aClass67_3;
					}
				}
				if (local254 != null) {
					@Pc(381) Class51[] local381 = local228.aClass51Array23;
					local159 = local381.length;
					local98 -= (local159 - 1) * local254.method1938() / 2;
					local98 += local254.method1941() / 2;
					for (local165 = 0; local165 < local159; local165++) {
						local254.method1945(local381[local165], local271, local98, local114);
						local98 += local254.method1938();
					}
				}
			}
		}
		for (@Pc(436) Class1_Sub23 local436 = (Class1_Sub23) Static212.aClass105_24.method3120(); local436 != null; local436 = (Class1_Sub23) Static212.aClass105_24.method3109()) {
			Static125.aClass1_Sub2_Sub1_Sub1Array3[local436.anInt3915].method2064(local436.anInt3913 - 7, local436.anInt3914 + -7);
			Static96.method1628(local436.anInt3913, local436.anInt3914, 15, 16776960, 128);
			Static96.method1628(local436.anInt3913, local436.anInt3914, 7, 16777215, 256);
		}
		Static212.aClass105_24.method3114();
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(III)J")
	public static long method503(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub7 local7 = Static22.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return 0L;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt1124; local13++) {
			@Pc(19) Class83 local19 = local7.aClass83Array3[local13];
			if ((local19.aLong118 >> 29 & 0x3L) == 2L && local19.anInt3340 == arg1 && local19.anInt3336 == arg2) {
				return local19.aLong118;
			}
		}
		return 0L;
	}
}
