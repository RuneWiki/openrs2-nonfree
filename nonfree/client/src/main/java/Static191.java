import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!kj", name = "i", descriptor = "Lclient!o;")
	public static final Class169 aClass169_171 = new Class169("cyan:", "blaugrün:", "cyan:", "cyan:");

	@OriginalMember(owner = "client!kj", name = "w", descriptor = "J")
	public static long aLong105 = -1L;

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILclient!je;)V")
	public static void method2733(@OriginalArg(1) Class117 arg0) {
		if (!Static90.aBoolean144) {
			return;
		}
		Static177.method1119(Static253.aClass48_152);
		Static209.aClass1_Sub33_Sub2_2.method5142(arg0.anInt3093);
		Static209.aClass1_Sub33_Sub2_2.method5170(Static137.anInt2555);
		Static209.aClass1_Sub33_Sub2_2.method5170(Static267.anInt4674);
		Static209.aClass1_Sub33_Sub2_2.method5142(Static119.anInt2128);
		Static209.aClass1_Sub33_Sub2_2.method5138(arg0.anInt3080);
		Static209.aClass1_Sub33_Sub2_2.method5170(arg0.anInt3043);
	}

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "(I)Lclient!ba;")
	public static Class20 method2735() {
		try {
			return (Class20) Class.forName("Class20_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "([II[ILclient!h;[I)V")
	public static void method2736(@OriginalArg(0) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class25_Sub1_Sub1_Sub2 arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
			@Pc(11) int local11 = arg1[local3];
			@Pc(15) int local15 = arg3[local3];
			@Pc(19) int local19 = arg0[local3];
			for (@Pc(21) int local21 = 0; local15 != 0 && arg2.aClass103Array3.length > local21; local21++) {
				if ((local15 & 0x1) != 0) {
					if (local11 == -1) {
						arg2.aClass103Array3[local21] = null;
					} else {
						@Pc(38) Class185 local38 = Static25.aClass67_1.method1227(local11);
						@Pc(41) int local41 = local38.anInt4802;
						@Pc(46) Class103 local46 = arg2.aClass103Array3[local21];
						if (local46 != null) {
							if (local11 == local46.anInt2713) {
								if (local41 == 0) {
									local46 = arg2.aClass103Array3[local21] = null;
								} else if (local41 == 1) {
									local46.anInt2706 = 1;
									local46.anInt2709 = 0;
									local46.anInt2714 = 0;
									local46.anInt2710 = local19;
									local46.anInt2712 = 0;
									Static4.method52(0, arg2.anInt6080, false, arg2.aByte70, local38, arg2.anInt6077);
								} else if (local41 == 2) {
									local46.anInt2714 = 0;
								}
							} else if (local38.anInt4805 >= Static25.aClass67_1.method1227(local46.anInt2713).anInt4805) {
								local46 = arg2.aClass103Array3[local21] = null;
							}
						}
						if (local46 == null) {
							local46 = arg2.aClass103Array3[local21] = new Class103();
							local46.anInt2712 = 0;
							local46.anInt2710 = local19;
							local46.anInt2714 = 0;
							local46.anInt2709 = 0;
							local46.anInt2713 = local11;
							local46.anInt2706 = 1;
							Static4.method52(0, arg2.anInt6080, false, arg2.aByte70, local38, arg2.anInt6077);
						}
					}
				}
				local15 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIIIIIIIIIIIII)V")
	public static void method2737(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		@Pc(18) Class25_Sub1_Sub1 local18;
		@Pc(14) int local14;
		if (arg10 >= 0) {
			local14 = arg10 - 1;
			local18 = Static171.aClass25_Sub1_Sub1_Sub2Array1[local14];
		} else {
			local14 = -arg10 - 1;
			if (local14 == Static43.anInt861) {
				local18 = Static321.aClass25_Sub1_Sub1_Sub1_2;
			} else {
				local18 = Static225.aClass25_Sub1_Sub1_Sub1Array3[local14];
			}
		}
		if (local18 == null) {
			return;
		}
		@Pc(44) Class236 local44 = Static54.aClass153_1.method3081(arg9);
		@Pc(60) int local60;
		@Pc(57) int local57;
		if (arg5 == 1 || arg5 == 3) {
			local57 = local44.anInt5893;
			local60 = local44.anInt5912;
		} else {
			local57 = local44.anInt5912;
			local60 = local44.anInt5893;
		}
		@Pc(74) int local74 = (local60 >> 1) + arg12;
		@Pc(82) int local82 = (local60 + 1 >> 1) + arg12;
		@Pc(88) int local88 = (local57 >> 1) + arg11;
		@Pc(96) int local96 = (local57 + 1 >> 1) + arg11;
		@Pc(100) Class42 local100 = Static229.aClass42Array3[arg1];
		@Pc(124) int local124 = local100.method3060(local74, local88) + local100.method3060(local82, local88) + local100.method3060(local74, local96) + local100.method3060(local82, local96) >> 2;
		@Pc(128) Class1_Sub44 local128 = new Class1_Sub44();
		local128.anInt6137 = arg11;
		local128.anInt6144 = arg2;
		local128.anInt6147 = local18.aByte70;
		local128.anInt6143 = arg8 + Static366.anInt5883;
		local128.anInt6139 = arg9;
		local128.anInt6145 = arg12;
		local128.anInt6141 = Static366.anInt5883 + arg4;
		local128.anInt6151 = arg5;
		@Pc(163) int local163;
		if (arg7 < arg0) {
			local163 = arg0;
			arg0 = arg7;
			arg7 = local163;
		}
		local128.anInt6138 = arg7 + arg12;
		if (arg6 > arg3) {
			local163 = arg6;
			arg6 = arg3;
			arg3 = local163;
		}
		local128.anInt6148 = arg12 + arg0;
		local128.anInt6135 = local124;
		local128.anInt6146 = arg6 + arg11;
		local128.anInt6140 = local60 * 64 + local128.anInt6145 * 128;
		local128.anInt6136 = arg3 + arg11;
		local128.anInt6133 = local57 * 64 + local128.anInt6137 * 128;
		Static26.aClass17_7.method199(local128);
		local18.aClass1_Sub44_3 = local128;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Z)V")
	public static void method2738() {
		if (Static47.aFrame1 != null) {
			return;
		}
		@Pc(14) int local14 = Static307.anInt5742;
		@Pc(16) int local16 = Static155.anInt2835;
		@Pc(24) int local24 = Static160.anInt2899 - Static136.anInt6304 - local14;
		@Pc(30) int local30 = Static278.anInt4645 - Static218.anInt3871 - local16;
		if (local14 <= 0 && local24 <= 0 && local16 <= 0 && local30 <= 0) {
			return;
		}
		try {
			@Pc(43) Container local43;
			if (Static142.aFrame2 == null) {
				local43 = Static341.aClass162_5.anApplet1;
			} else {
				local43 = Static142.aFrame2;
			}
			@Pc(49) int local49 = 0;
			@Pc(51) int local51 = 0;
			if (Static142.aFrame2 == local43) {
				@Pc(57) Insets local57 = Static142.aFrame2.getInsets();
				local49 = local57.left;
				local51 = local57.top;
			}
			@Pc(66) Graphics local66 = local43.getGraphics();
			local66.setColor(Color.black);
			if (local14 > 0) {
				local66.fillRect(local49, local51, local14, Static278.anInt4645);
			}
			if (local16 > 0) {
				local66.fillRect(local49, local51, Static160.anInt2899, local16);
			}
			if (local24 > 0) {
				local66.fillRect(Static160.anInt2899 + local49 - local24, local51, local24, Static278.anInt4645);
			}
			if (local30 > 0) {
				local66.fillRect(local49, Static278.anInt4645 + local51 - local30, Static160.anInt2899, local30);
				return;
			}
		} catch (@Pc(119) Exception local119) {
			return;
		}
	}
}
