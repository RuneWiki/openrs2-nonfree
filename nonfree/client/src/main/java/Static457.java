import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static457 {

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "Lclient!gs;")
	public static final Class93 aClass93_8 = new Class93();

	@OriginalMember(owner = "client!wu", name = "j", descriptor = "Z")
	public static boolean aBoolean532 = false;

	@OriginalMember(owner = "client!wu", name = "k", descriptor = "Z")
	public static boolean aBoolean533 = false;

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Ljava/lang/String;ILclient!sv;)I")
	public static int method5713(@OriginalArg(0) String arg0, @OriginalArg(2) Class2_Sub13 arg1) {
		@Pc(6) int local6 = arg1.anInt4347;
		@Pc(10) byte[] local10 = Static409.method5180(arg0);
		arg1.method3586(local10.length);
		arg1.anInt4347 += Static431.aClass131_1.method2694(local10.length, local10, arg1.aByteArray52, 0, arg1.anInt4347);
		return arg1.anInt4347 - local6;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lclient!uj;BLclient!uj;)V")
	public static void method5715(@OriginalArg(0) Class2 arg0, @OriginalArg(2) Class2 arg1) {
		if (arg0.aClass2_263 != null) {
			arg0.method5703();
		}
		arg0.aClass2_263 = arg1.aClass2_263;
		arg0.aClass2_264 = arg1;
		arg0.aClass2_263.aClass2_264 = arg0;
		arg0.aClass2_264.aClass2_263 = arg0;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method5716(@OriginalArg(1) String arg0) {
		if (!Static215.aBoolean217) {
			return;
		}
		@Pc(10) boolean local10 = false;
		@Pc(20) int local20 = Static119.anInt2204;
		@Pc(22) int[] local22 = Static200.anIntArray295;
		for (@Pc(24) int local24 = 0; local24 < local20; local24++) {
			@Pc(32) Class3_Sub4_Sub1_Sub2 local32 = Static152.aClass3_Sub4_Sub1_Sub2Array1[local22[local24]];
			if (local32 != null && local32 != Static60.aClass3_Sub4_Sub1_Sub2_1 && local32.aString148 != null && local32.aString148.equalsIgnoreCase(arg0)) {
				Static29.method451(Static215.aClass102_118);
				Static456.aClass2_Sub13_Sub2_2.method3542(Static279.anInt6428);
				Static456.aClass2_Sub13_Sub2_2.method3583(0);
				Static456.aClass2_Sub13_Sub2_2.method3577(local22[local24]);
				Static456.aClass2_Sub13_Sub2_2.method3561(Static368.anInt6200);
				Static456.aClass2_Sub13_Sub2_2.method3595(Static368.anInt6201);
				Static111.method1707(local32.anIntArray424[0], 0, -2, local32.method4009(), local32.anIntArray425[0], 0, local32.method4009(), true);
				local10 = true;
				break;
			}
		}
		if (!local10) {
			Static12.method159(Static71.aClass134_22.method2720(Static331.anInt5597) + arg0);
		}
		if (Static215.aBoolean217) {
			Static377.method3604();
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(II)V")
	public static void method5717(@OriginalArg(0) int arg0) {
		if (!Static260.method3501(arg0)) {
			return;
		}
		@Pc(22) Class16[] local22 = Static151.aClass16ArrayArray1[arg0];
		for (@Pc(24) int local24 = 0; local24 < local22.length; local24++) {
			@Pc(30) Class16 local30 = local22[local24];
			if (local30 != null) {
				local30.anInt299 = 1;
				local30.anInt304 = 0;
				local30.anInt309 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIBILclient!pf;)V")
	public static void method5718(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) Class3_Sub4_Sub1_Sub2 arg2) {
		@Pc(18) int local18 = arg2.anIntArray425[0];
		@Pc(23) int local23 = arg2.anIntArray424[0];
		if (local18 < 0 || local18 >= Static166.anInt2852 || local23 < 0 || local23 >= Static426.anInt6923 || (arg1 < 0 || arg1 >= Static166.anInt2852 || arg0 < 0 || arg0 >= Static426.anInt6923)) {
			return;
		}
		@Pc(79) int local79 = Static460.method5540(local23, arg0, true, local18, Static361.aClass71Array1[arg2.aByte91], 0, Static254.anIntArray351, 0, arg1, -4, 0, arg2.method4009(), 0, Static375.anIntArray539);
		if (local79 >= 1 && local79 <= 3) {
			for (@Pc(91) int local91 = 0; local91 < local79 - 1; local91++) {
				arg2.method4022(Static375.anIntArray539[local91], (byte) 2, Static254.anIntArray351[local91]);
			}
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIILclient!za;[[[BIIIIIIBI)V")
	public static void method5719(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class163 arg3, @OriginalArg(4) byte[][][] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(12) int arg11) {
		if (arg8 == 0 || arg9 == 0) {
			return;
		}
		if (arg8 == 9) {
			arg8 = 1;
			arg11 = arg11 + 1 & 0x3;
		}
		if (arg8 == 10) {
			arg8 = 1;
			arg11 = arg11 + 3 & 0x3;
		}
		if (arg8 == 11) {
			arg11 = arg11 + 3 & 0x3;
			arg8 = 8;
		}
		arg3.K(arg1, arg6, arg0, arg7, arg2, arg10, arg4[arg8 - 1][arg11], arg9, arg5);
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIIIB[III)V")
	public static void method5720(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(7) int arg5) {
		if (arg1 > 0 && !Static376.method4880(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Static376.method4880(arg2)) {
			@Pc(59) int local59 = 0;
			@Pc(70) int local70 = arg1 < arg2 ? arg1 : arg2;
			@Pc(74) int local74 = arg1 >> 1;
			@Pc(78) int local78 = arg2 >> 1;
			@Pc(80) int[] local80 = arg4;
			@Pc(85) int[] local85 = new int[local78 * local74];
			while (true) {
				OpenGL.glTexImage2Di(arg3, local59, arg0, arg1, arg2, 0, 32993, arg5, local80, 0);
				if (local70 <= 1) {
					return;
				}
				@Pc(103) int local103 = 0;
				@Pc(105) int local105 = 0;
				@Pc(109) int local109 = arg1;
				@Pc(111) int[] local111 = local85;
				for (@Pc(113) int local113 = 0; local113 < local78; local113++) {
					for (@Pc(117) int local117 = 0; local117 < local74; local117++) {
						@Pc(124) int local124 = local80[local105++];
						@Pc(129) int local129 = local80[local105++];
						@Pc(134) int local134 = local80[local109++];
						@Pc(139) int local139 = local80[local109++];
						@Pc(145) int local145 = local124 >> 16 & 0xFF;
						@Pc(149) int local149 = local124 & 0xFF;
						@Pc(155) int local155 = local124 >> 8 & 0xFF;
						@Pc(161) int local161 = local124 >> 24 & 0xFF;
						@Pc(167) int local167 = local149 + (local129 & 0xFF);
						@Pc(175) int local175 = local161 + (local129 >> 24 & 0xFF);
						@Pc(183) int local183 = local155 + (local129 >> 8 & 0xFF);
						@Pc(191) int local191 = local145 + (local129 >> 16 & 0xFF);
						@Pc(197) int local197 = local167 + (local134 & 0xFF);
						@Pc(205) int local205 = local175 + (local134 >> 24 & 0xFF);
						@Pc(213) int local213 = local191 + (local134 >> 16 & 0xFF);
						@Pc(221) int local221 = local183 + (local134 >> 8 & 0xFF);
						@Pc(229) int local229 = local213 + (local139 >> 16 & 0xFF);
						@Pc(235) int local235 = local197 + (local139 & 0xFF);
						@Pc(243) int local243 = local205 + (local139 >> 24 & 0xFF);
						@Pc(251) int local251 = local221 + (local139 >> 8 & 0xFF);
						local85[local103++] = (local251 & 0x3FC) << 6 | (local243 & 0x3FC) << 22 | (local229 & 0x3FC) << 14 | local235 >> 2 & 0xFF;
					}
					local105 += arg1;
					local109 += arg1;
				}
				local85 = local80;
				arg2 = local78;
				arg1 = local74;
				local80 = local111;
				local70 >>= 0x1;
				local78 >>= 0x1;
				local59++;
				local74 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIIIZ[Lclient!at;)V")
	public static void method5721(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class16[] arg4) {
		for (@Pc(3) int local3 = 0; local3 < arg4.length; local3++) {
			@Pc(9) Class16 local9 = arg4[local3];
			if (local9 != null && local9.anInt324 == arg2) {
				Static221.method2940(arg1, arg3, local9, arg0);
				Static204.method2718(arg1, local9, arg0);
				if (local9.anInt321 - local9.anInt294 < local9.anInt279) {
					local9.anInt279 = local9.anInt321 - local9.anInt294;
				}
				if (local9.anInt279 < 0) {
					local9.anInt279 = 0;
				}
				if (local9.anInt319 - local9.anInt285 < local9.anInt284) {
					local9.anInt284 = local9.anInt319 - local9.anInt285;
				}
				if (local9.anInt284 < 0) {
					local9.anInt284 = 0;
				}
				if (local9.anInt298 == 0) {
					Static399.method5068(arg3, local9);
				}
			}
		}
	}
}
