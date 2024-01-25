import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static354 {

	@OriginalMember(owner = "client!wq", name = "b", descriptor = "Lclient!dp;")
	public static Class53 aClass53_161;

	@OriginalMember(owner = "client!wq", name = "c", descriptor = "I")
	public static int anInt6364;

	@OriginalMember(owner = "client!wq", name = "m", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas5;

	@OriginalMember(owner = "client!wq", name = "i", descriptor = "I")
	public static int anInt6370 = 0;

	@OriginalMember(owner = "client!wq", name = "n", descriptor = "Z")
	public static boolean aBoolean428 = true;

	@OriginalMember(owner = "client!wq", name = "p", descriptor = "[Z")
	public static final boolean[] aBooleanArray29 = new boolean[200];

	@OriginalMember(owner = "client!wq", name = "t", descriptor = "[Z")
	public static final boolean[] aBooleanArray30 = new boolean[112];

	@OriginalMember(owner = "client!wq", name = "x", descriptor = "Ljava/lang/String;")
	public static String aString307 = "Loading world list data";

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "([JI[I)V")
	public static void method5807(@OriginalArg(0) long[] arg0, @OriginalArg(2) int[] arg1) {
		Static54.method943(arg1, arg0.length - 1, 0, arg0);
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	public static void method5808(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(12) Class6_Sub22 local12 = new Class6_Sub22();
		local12.anInt3129 = arg11;
		local12.anInt3140 = arg5;
		local12.anInt3138 = arg0;
		local12.anInt3139 = arg4;
		local12.anInt3141 = arg7;
		local12.anInt3134 = arg6;
		local12.anInt3132 = arg3;
		local12.anInt3143 = arg2;
		local12.anInt3136 = arg8;
		local12.anInt3135 = arg9;
		local12.anInt3130 = arg10;
		local12.anInt3128 = arg1;
		Static109.aClass211_16.method5585(local12);
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IB)Lclient!jo;")
	public static Class64_Sub1 method5809(@OriginalArg(0) int arg0) {
		return Static350.aBoolean422 && arg0 >= Static341.anInt6214 && Static74.anInt1382 >= arg0 ? Static233.aClass64_Sub1Array2[arg0 - Static341.anInt6214] : null;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIIII)V")
	public static void method5811(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) Class6_Sub2_Sub8 local16 = Static239.method5786(4, arg2);
		local16.method2648();
		local16.anInt2511 = arg1;
		local16.anInt2507 = arg0;
		local16.anInt2510 = arg3;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(ILclient!mb;)Ljava/lang/String;")
	public static String method5812(@OriginalArg(1) Class132 arg0) {
		if (Static43.method751(arg0).method4572() == 0) {
			return null;
		} else if (arg0.aString147 == null || arg0.aString147.trim().length() == 0) {
			return Static249.aBoolean326 ? "Hidden-use" : null;
		} else {
			return arg0.aString147;
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(B)V")
	public static void method5813() {
		for (@Pc(8) int local8 = 0; local8 < Static15.anInt281; local8++) {
			@Pc(14) int local14 = Static151.anIntArray352[local8];
			@Pc(18) Class44_Sub4_Sub4_Sub2 local18 = Static239.aClass44_Sub4_Sub4_Sub2Array8[local14];
			@Pc(22) int local22 = Static142.aClass6_Sub10_Sub1_3.method3972();
			if ((local22 & 0x40) != 0) {
				local22 += Static142.aClass6_Sub10_Sub1_3.method3972() << 8;
			}
			@Pc(48) int local48;
			@Pc(65) int local65;
			if ((local22 & 0x200) != 0) {
				local48 = Static142.aClass6_Sub10_Sub1_3.method3972();
				@Pc(51) int[] local51 = new int[local48];
				@Pc(54) int[] local54 = new int[local48];
				@Pc(57) int[] local57 = new int[local48];
				for (@Pc(59) int local59 = 0; local59 < local48; local59++) {
					local65 = Static142.aClass6_Sub10_Sub1_3.method3994();
					if (local65 == 65535) {
						local65 = -1;
					}
					local51[local59] = local65;
					local54[local59] = Static142.aClass6_Sub10_Sub1_3.method4011();
					local57[local59] = Static142.aClass6_Sub10_Sub1_3.method3989();
				}
				Static52.method868(local54, local18, local51, local57);
			}
			if ((local22 & 0x100) != 0) {
				local18.anInt5135 = Static142.aClass6_Sub10_Sub1_3.method3994();
				local18.anInt5110 = Static142.aClass6_Sub10_Sub1_3.method4021();
			}
			if ((local22 & 0x400) != 0) {
				local48 = Static142.aClass6_Sub10_Sub1_3.method3989();
				local18.anInt5113 = Static142.aClass6_Sub10_Sub1_3.method3977();
				local18.anInt5124 = Static142.aClass6_Sub10_Sub1_3.method3972();
				local18.aBoolean356 = (local48 & 0x8000) != 0;
				local18.anInt5085 = local48 & 0x7FFF;
				local18.anInt5093 = Static76.anInt2853 + local18.anInt5085 + local18.anInt5113;
			}
			@Pc(171) int local171;
			if ((local22 & 0x20) != 0) {
				local48 = Static142.aClass6_Sub10_Sub1_3.method3989();
				local171 = Static142.aClass6_Sub10_Sub1_3.method3987();
				if (local48 == 65535) {
					local48 = -1;
				}
				@Pc(178) boolean local178 = true;
				@Pc(246) Class24 local246;
				if (local48 != -1 && local18.anInt5148 != -1) {
					@Pc(197) Class166 local197;
					if (local18.anInt5148 == local48) {
						local197 = Static62.method999(local48);
						if (local197.aBoolean336 && local197.anInt4753 != -1) {
							local246 = Static209.method3737(local197.anInt4753);
							local65 = local246.anInt574;
							if (local65 == 0) {
								local178 = false;
							} else if (local65 == 1) {
								local178 = true;
							} else if (local65 == 2) {
								local178 = false;
								local18.anInt5144 = 0;
							}
						}
					} else {
						local197 = Static62.method999(local48);
						@Pc(202) Class166 local202 = Static62.method999(local18.anInt5148);
						if (local197.anInt4753 != -1 && local202.anInt4753 != -1) {
							@Pc(216) Class24 local216 = Static209.method3737(local197.anInt4753);
							@Pc(221) Class24 local221 = Static209.method3737(local202.anInt4753);
							if (local221.anInt588 > local216.anInt588) {
								local178 = false;
							}
						}
					}
				}
				if (local178) {
					local18.anInt5147 = 1;
					local18.anInt5107 = 0;
					local18.anInt5088 = (local171 & 0xFFFF) + Static76.anInt2853;
					local18.anInt5139 = local171 >> 16;
					local18.anInt5148 = local48;
					local18.anInt5122 = 0;
					if (Static76.anInt2853 < local18.anInt5088) {
						local18.anInt5107 = -1;
					}
					if (local18.anInt5148 != -1 && Static76.anInt2853 == local18.anInt5088) {
						@Pc(320) int local320 = Static62.method999(local18.anInt5148).anInt4753;
						if (local320 != -1) {
							local246 = Static209.method3737(local320);
							if (local246 != null && local246.anIntArray64 != null) {
								Static203.method3667(0, local18.anInt6339, local246, local18.anInt6340, false);
							}
						}
					}
				}
			}
			if ((local22 & 0x2) != 0) {
				local48 = Static142.aClass6_Sub10_Sub1_3.method4017();
				local171 = Static142.aClass6_Sub10_Sub1_3.method3980();
				local18.method4703(local171, Static76.anInt2853, local48);
				local18.anInt5136 = Static76.anInt2853 + 300;
				local18.anInt5137 = Static142.aClass6_Sub10_Sub1_3.method3977();
			}
			if ((local22 & 0x80) != 0) {
				local18.aString219 = Static142.aClass6_Sub10_Sub1_3.method4023();
				local18.anInt5106 = 100;
			}
			if ((local22 & 0x10) != 0) {
				local18.anInt5103 = Static142.aClass6_Sub10_Sub1_3.method3989();
				if (local18.anInt5103 == 65535) {
					local18.anInt5103 = -1;
				}
			}
			if ((local22 & 0x4) != 0) {
				local48 = Static142.aClass6_Sub10_Sub1_3.method4017();
				local171 = Static142.aClass6_Sub10_Sub1_3.method3980();
				local18.method4703(local171, Static76.anInt2853, local48);
			}
			if ((local22 & 0x8) != 0) {
				if (local18.aClass18_1.method365()) {
					Static91.method3104(local18);
				}
				local18.method4726(Static162.method3235(Static142.aClass6_Sub10_Sub1_3.method3989()));
				local18.method4712(local18.aClass18_1.anInt409);
				local18.anInt5121 = local18.aClass18_1.anInt388 << 3;
				if (local18.aClass18_1.method365()) {
					Static152.method3082(local18.anIntArray560[0], Static343.anInt6225, null, 0, local18.anIntArray561[0], null, local18);
				}
			}
			if ((local22 & 0x1) != 0) {
				local48 = Static142.aClass6_Sub10_Sub1_3.method3989();
				if (local48 == 65535) {
					local48 = -1;
				}
				local171 = Static142.aClass6_Sub10_Sub1_3.method3980();
				Static262.method4417(local18, local171, local48);
			}
		}
	}

	@OriginalMember(owner = "client!wq", name = "b", descriptor = "(II)V")
	public static void method5817(@OriginalArg(0) int arg0) {
		@Pc(14) Class6_Sub38 local14 = (Class6_Sub38) Static297.aClass108_31.method2900((long) arg0);
		if (local14 != null) {
			for (@Pc(19) int local19 = 0; local19 < local14.anIntArray653.length; local19++) {
				local14.anIntArray653[local19] = -1;
				local14.anIntArray652[local19] = 0;
			}
		}
	}
}
