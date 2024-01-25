import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static356 {

	@OriginalMember(owner = "client!lt", name = "v", descriptor = "Lclient!vr;")
	public static Class33 aClass33_27;

	@OriginalMember(owner = "client!lt", name = "x", descriptor = "Ljava/lang/Object;")
	public static Object anObject9;

	@OriginalMember(owner = "client!lt", name = "c", descriptor = "Lclient!fb;")
	public static final Class99 aClass99_2 = new Class99();

	@OriginalMember(owner = "client!lt", name = "j", descriptor = "Z")
	public static final boolean aBoolean417 = false;

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
	public static void method5246(@OriginalArg(0) Canvas arg0) {
		@Pc(6) Dimension local6 = arg0.getSize();
		Static14.method198(local6.height, local6.width);
		if (Static76.anInt1404 == 1) {
			Static316.aClass13_10.method8468(arg0, Static561.anInt9112, Static454.anInt5692);
		} else {
			Static316.aClass13_10.method8468(arg0, Static617.anInt9892, Static519.anInt8360);
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(I[Ljava/lang/String;II[S)V")
	public static void method5249(@OriginalArg(0) int arg0, @OriginalArg(1) String[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) short[] arg3) {
		if (arg2 >= arg0) {
			return;
		}
		@Pc(14) int local14 = (arg2 + arg0) / 2;
		@Pc(16) int local16 = arg2;
		@Pc(20) String local20 = arg1[local14];
		arg1[local14] = arg1[arg0];
		arg1[arg0] = local20;
		@Pc(34) short local34 = arg3[local14];
		arg3[local14] = arg3[arg0];
		arg3[arg0] = local34;
		for (@Pc(46) int local46 = arg2; local46 < arg0; local46++) {
			if (local20 == null || arg1[local46] != null && arg1[local46].compareTo(local20) < (local46 & 0x1)) {
				@Pc(67) String local67 = arg1[local46];
				arg1[local46] = arg1[local16];
				arg1[local16] = local67;
				@Pc(81) short local81 = arg3[local46];
				arg3[local46] = arg3[local16];
				arg3[local16++] = local81;
			}
		}
		arg1[arg0] = arg1[local16];
		arg1[local16] = local20;
		arg3[arg0] = arg3[local16];
		arg3[local16] = local34;
		method5249(local16 - 1, arg1, arg2, arg3);
		method5249(arg0, arg1, local16 + 1, arg3);
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(IZ)I")
	public static int method5250(@OriginalArg(0) int arg0) {
		@Pc(14) byte local14;
		if (arg0 > 12000) {
			Static129.method2438();
			local14 = 4;
		} else if (arg0 > 5000) {
			local14 = 3;
			Static111.method2092();
		} else if (arg0 <= 2000) {
			local14 = 1;
			Static62.method1305();
		} else {
			local14 = 2;
			Static575.method8118();
		}
		if (Static24.aClass3_Sub22_4.aClass6_Sub21_1.method6970() != 2) {
			Static24.aClass3_Sub22_4.method2840(2, Static24.aClass3_Sub22_4.aClass6_Sub21_2);
			Static382.method5480(false, 2);
		}
		Static441.method6272();
		return local14;
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(IIIIIII)V")
	public static void method5251(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		@Pc(3) Class142[] local3 = Static292.aClass142Array1;
		for (@Pc(10) int local10 = 0; local10 < local3.length; local10++) {
			@Pc(16) Class142 local16 = local3[local10];
			if (local16 != null && local16.anInt4300 == 2) {
				Static316.method4829(local16.anInt4299, arg1 >> 1, arg2 >> 1, local16.anInt4295 * 2, local16.anInt4305, local16.anInt4304);
				if (Static396.anIntArray551[0] > -1 && Static588.anInt9467 % 20 < 10) {
					@Pc(66) Class33 local66 = Static26.aClass33Array2[local16.anInt4303];
					@Pc(74) int local74 = Static396.anIntArray551[0] + arg0 - 12;
					@Pc(82) int local82 = Static396.anIntArray551[1] + arg3 - 28;
					local66.method7654(local74, local82);
					Static642.method8919(local74 + local66.method7645(), local66.method7658() + local82, local82, local74);
				}
			}
		}
	}
}
