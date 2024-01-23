import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!sh", name = "m", descriptor = "[Lclient!ka;")
	public static Class64_Sub1[] aClass64_Sub1Array8;

	@OriginalMember(owner = "client!sh", name = "o", descriptor = "Lclient!dg;")
	public static Class28_Sub1 aClass28_Sub1_111;

	@OriginalMember(owner = "client!sh", name = "e", descriptor = "Z")
	public static boolean aBoolean382 = true;

	@OriginalMember(owner = "client!sh", name = "i", descriptor = "[[[Lclient!vb;")
	public static Class120[][][] aClass120ArrayArrayArray2 = new Class120[4][104][104];

	@OriginalMember(owner = "client!sh", name = "k", descriptor = "[I")
	public static int[] anIntArray352 = new int[50];

	@OriginalMember(owner = "client!sh", name = "n", descriptor = "Lclient!hd;")
	public static Class50 aClass50_25 = new Class50(32);

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IBIII)V")
	public static void method3182(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) Class1_Sub20 local12 = (Class1_Sub20) Static169.aClass50_20.method1364((long) arg0);
		if (local12 == null) {
			local12 = new Class1_Sub20();
			Static169.aClass50_20.method1362((long) arg0, local12);
		}
		if (arg2 >= local12.anIntArray264.length) {
			@Pc(42) int[] local42 = new int[arg2 + 1];
			@Pc(47) int[] local47 = new int[arg2 + 1];
			for (@Pc(49) int local49 = 0; local49 < local12.anIntArray264.length; local49++) {
				local42[local49] = local12.anIntArray264[local49];
				local47[local49] = local12.anIntArray263[local49];
			}
			for (@Pc(75) int local75 = local12.anIntArray264.length; local75 < arg2; local75++) {
				local42[local75] = -1;
				local47[local75] = 0;
			}
			local12.anIntArray264 = local42;
			local12.anIntArray263 = local47;
		}
		local12.anIntArray264[arg2] = arg1;
		local12.anIntArray263[arg2] = arg3;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIBII)V")
	public static void method3184(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 >= Static223.anInt4869 && arg1 <= Static47.anInt1057) {
			@Pc(24) int local24 = Static123.method2091(Static38.anInt784, Static99.anInt915, arg0);
			@Pc(32) int local32 = Static123.method2091(Static38.anInt784, Static99.anInt915, arg3);
			Static183.method3034(arg1, arg2, local24, local32);
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(ZLclient!o;)V")
	public static void method3185(@OriginalArg(1) Class86 arg0) {
		@Pc(6) int local6 = arg0.anInt3285;
		if (local6 == 324) {
			if (Static130.anInt2835 == -1) {
				Static13.anInt322 = arg0.anInt3259;
				Static130.anInt2835 = arg0.anInt3242;
			}
			if (Static185.aClass56_26.aBoolean181) {
				arg0.anInt3242 = Static130.anInt2835;
			} else {
				arg0.anInt3242 = Static13.anInt322;
			}
		} else if (local6 == 325) {
			if (Static130.anInt2835 == -1) {
				Static13.anInt322 = arg0.anInt3259;
				Static130.anInt2835 = arg0.anInt3242;
			}
			if (Static185.aClass56_26.aBoolean181) {
				arg0.anInt3242 = Static13.anInt322;
			} else {
				arg0.anInt3242 = Static130.anInt2835;
			}
		} else if (local6 == 327) {
			arg0.anInt3229 = 150;
			arg0.anInt3275 = (int) (Math.sin((double) Static128.anInt2802 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt3228 = -1;
			arg0.anInt3257 = 5;
		} else if (local6 == 328) {
			if (Static204.aClass5_Sub5_Sub1_2.aClass107_351 == null) {
				arg0.anInt3228 = 0;
			} else {
				arg0.anInt3229 = 150;
				arg0.anInt3275 = (int) (Math.sin((double) Static128.anInt2802 / 40.0D) * 256.0D) & 0x7FF;
				arg0.anInt3257 = 5;
				arg0.anInt3228 = ((int) Static204.aClass5_Sub5_Sub1_2.aClass107_351.method3066() << 11) + 2047;
				arg0.anInt3283 = Static204.aClass5_Sub5_Sub1_2.anInt3005;
				arg0.anInt3269 = Static204.aClass5_Sub5_Sub1_2.anInt3028;
			}
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILclient!ka;)V")
	public static void method3186(@OriginalArg(1) Class64_Sub1 arg0) {
		for (@Pc(5) int local5 = 0; local5 < Static163.anIntArray311.length; local5++) {
			Static163.anIntArray311[local5] = 0;
		}
		@Pc(37) int local37;
		for (@Pc(27) int local27 = 0; local27 < 5000; local27++) {
			local37 = (int) (Math.random() * 128.0D * (double) 256);
			Static163.anIntArray311[local37] = (int) (Math.random() * 284.0D);
		}
		@Pc(54) int local54;
		@Pc(58) int local58;
		@Pc(67) int local67;
		for (local37 = 0; local37 < 20; local37++) {
			for (local54 = 1; local54 < 255; local54++) {
				for (local58 = 1; local58 < 127; local58++) {
					local67 = local58 + (local54 << 7);
					Static160.anIntArray307[local67] = (Static163.anIntArray311[local67 + 128] + Static163.anIntArray311[local67 - 1] + Static163.anIntArray311[local67 + 1] + Static163.anIntArray311[local67 - 128]) / 4;
				}
			}
			@Pc(114) int[] local114 = Static163.anIntArray311;
			Static163.anIntArray311 = Static160.anIntArray307;
			Static160.anIntArray307 = local114;
		}
		if (arg0 == null) {
			return;
		}
		local54 = 0;
		for (local58 = 0; local58 < arg0.anInt2361; local58++) {
			for (local67 = 0; local67 < arg0.anInt2356; local67++) {
				if (arg0.aByteArray36[local54++] != 0) {
					@Pc(156) int local156 = arg0.anInt2358 + local67 + 16;
					@Pc(164) int local164 = local58 + arg0.anInt2362 + 16;
					@Pc(170) int local170 = (local164 << 7) + local156;
					Static163.anIntArray311[local170] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIIZIIII)V")
	public static void method3187(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 < 1 || arg0 < 1 || arg1 > 102 || arg0 > 102) {
			return;
		}
		@Pc(34) int local34;
		if (!Static155.method412() && (Static221.aByteArrayArrayArray14[0][arg1][arg0] & 0x2) == 0) {
			local34 = arg4;
			if ((Static221.aByteArrayArrayArray14[arg4][arg1][arg0] & 0x8) != 0) {
				local34 = 0;
			}
			if (local34 != Static166.anInt4347) {
				return;
			}
		}
		local34 = arg4;
		if (arg4 < 3 && (Static221.aByteArrayArrayArray14[1][arg1][arg0] & 0x2) == 2) {
			local34 = arg4 + 1;
		}
		Static10.method307(arg0, local34, Static107.aClass60Array1[arg4], arg4, arg6, arg1);
		if (arg2 >= 0) {
			@Pc(84) boolean local84 = Static163.aBoolean317;
			Static163.aBoolean317 = true;
			Static202.method3237(arg2, Static107.aClass60Array1[arg4], arg5, arg4, arg1, arg3, arg0, false, local34);
			Static163.aBoolean317 = local84;
		}
	}
}
