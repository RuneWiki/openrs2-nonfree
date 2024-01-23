import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static264 {

	@OriginalMember(owner = "client!t", name = "b", descriptor = "Lclient!ph;")
	public static Class138 aClass138_70;

	@OriginalMember(owner = "client!t", name = "i", descriptor = "Lclient!ph;")
	public static Class138 aClass138_71;

	@OriginalMember(owner = "client!t", name = "f", descriptor = "[I")
	public static int[] anIntArray457 = new int[2500];

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(B)[Lclient!in;")
	public static Class1_Sub1_Sub3[] method3944() {
		@Pc(4) Class1_Sub1_Sub3[] local4 = new Class1_Sub1_Sub3[Static194.anInt3940];
		for (@Pc(10) int local10 = 0; local10 < Static194.anInt3940; local10++) {
			@Pc(25) int local25 = Static134.anIntArray220[local10] * Static255.anIntArray450[local10];
			@Pc(28) int[] local28 = new int[local25];
			@Pc(32) byte[] local32 = Static255.aByteArrayArray15[local10];
			for (@Pc(34) int local34 = 0; local34 < local25; local34++) {
				local28[local34] = Static40.anIntArray59[local32[local34] & 0xFF];
			}
			if (Static291.aBoolean404) {
				local4[local10] = new Class1_Sub1_Sub3_Sub1(Static268.anInt5936, Static110.anInt2184, Static201.anIntArray327[local10], Static148.anIntArray242[local10], Static134.anIntArray220[local10], Static255.anIntArray450[local10], local28);
			} else {
				local4[local10] = new Class1_Sub1_Sub3_Sub2(Static268.anInt5936, Static110.anInt2184, Static201.anIntArray327[local10], Static148.anIntArray242[local10], Static134.anIntArray220[local10], Static255.anIntArray450[local10], local28);
			}
		}
		Static295.method4395();
		return local4;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V")
	public static void method3945() {
		@Pc(13) boolean local13 = false;
		while (!local13) {
			local13 = true;
			for (@Pc(19) int local19 = 0; local19 < Static316.anInt5941 - 1; local19++) {
				if (Static241.aShortArray76[local19] < 1000 && Static241.aShortArray76[local19 + 1] > 1000) {
					@Pc(49) String local49 = Static54.aStringArray7[local19];
					local13 = false;
					Static54.aStringArray7[local19] = Static54.aStringArray7[local19 + 1];
					Static54.aStringArray7[local19 + 1] = local49;
					@Pc(69) String local69 = Static213.aStringArray35[local19];
					Static213.aStringArray35[local19] = Static213.aStringArray35[local19 + 1];
					Static213.aStringArray35[local19 + 1] = local69;
					@Pc(87) int local87 = Static159.anIntArray270[local19];
					Static159.anIntArray270[local19] = Static159.anIntArray270[local19 + 1];
					Static159.anIntArray270[local19 + 1] = local87;
					@Pc(105) int local105 = Static44.anIntArray74[local19];
					Static44.anIntArray74[local19] = Static44.anIntArray74[local19 + 1];
					Static44.anIntArray74[local19 + 1] = local105;
					@Pc(123) int local123 = Static244.anIntArray441[local19];
					Static244.anIntArray441[local19] = Static244.anIntArray441[local19 + 1];
					Static244.anIntArray441[local19 + 1] = local123;
					@Pc(141) short local141 = Static241.aShortArray76[local19];
					Static241.aShortArray76[local19] = Static241.aShortArray76[local19 + 1];
					Static241.aShortArray76[local19 + 1] = local141;
					@Pc(159) long local159 = Static168.aLongArray123[local19];
					Static168.aLongArray123[local19] = Static168.aLongArray123[local19 + 1];
					Static168.aLongArray123[local19 + 1] = local159;
				}
			}
		}
	}

	@OriginalMember(owner = "client!t", name = "b", descriptor = "(I)V")
	public static void method3946() {
		Static232.aClass169_102.method4014();
		Static134.aClass169_75.method4014();
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IZI)V")
	public static void method3948(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static2.aFloat1 = arg1;
		if (Static101.anInt1895 == 2) {
			Static262.anInt2349 = arg1;
			Static140.anInt2757 = arg0;
		}
		Static15.aFloat2 = arg0;
		Static82.method1236();
		Static104.aBoolean149 = true;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IZIIII[BII[Lclient!o;I)V")
	public static void method3949(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Class122[] arg9) {
		@Pc(7) int local7 = -1;
		@Pc(29) Class1_Sub14 local29 = new Class1_Sub14(arg6);
		while (true) {
			@Pc(33) int local33 = local29.method2608();
			if (local33 == 0) {
				return;
			}
			@Pc(42) int local42 = 0;
			local7 += local33;
			while (true) {
				@Pc(50) int local50 = local29.method2648();
				if (local50 == 0) {
					break;
				}
				local42 += local50 - 1;
				@Pc(63) int local63 = local42 & 0x3F;
				@Pc(67) int local67 = local42 >> 12;
				@Pc(73) int local73 = local42 >> 6 & 0x3F;
				@Pc(79) int local79 = local29.method2595();
				@Pc(83) int local83 = local79 >> 2;
				@Pc(87) int local87 = local79 & 0x3;
				if (arg3 == local67 && arg4 <= local73 && local73 < arg4 + 8 && local63 >= arg5 && local63 < arg5 + 8) {
					@Pc(128) Class43 local128 = Static189.method3080(local7);
					@Pc(146) int local146 = arg2 + Static216.method3406(arg0, local63 & 0x7, local128.anInt1153, local87, local128.anInt1185, local73 & 0x7);
					@Pc(163) int local163 = arg7 + Static68.method1142(arg0, local63 & 0x7, local87, local128.anInt1185, local128.anInt1153, local73 & 0x7);
					if (local146 > 0 && local163 > 0 && local146 < 103 && local163 < 103) {
						@Pc(184) Class122 local184 = null;
						if (!arg1) {
							@Pc(189) int local189 = arg8;
							if ((Static94.aByteArrayArrayArray9[1][local146][local163] & 0x2) == 2) {
								local189 = arg8 - 1;
							}
							if (local189 >= 0) {
								local184 = arg9[local189];
							}
						}
						Static293.method4623(arg1, local7, arg8, local184, local163, !arg1, local146, arg8, arg0 + local87 & 0x3, local83);
					}
				}
			}
		}
	}
}
