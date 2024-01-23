import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "Lclient!rj;")
	public static Class55 aClass55_1;

	@OriginalMember(owner = "client!oj", name = "d", descriptor = "I")
	public static int anInt3912 = 0;

	@OriginalMember(owner = "client!oj", name = "h", descriptor = "I")
	public static int anInt3915 = 0;

	@OriginalMember(owner = "client!oj", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString232 = " from your ignore list first.";

	@OriginalMember(owner = "client!oj", name = "m", descriptor = "[I")
	public static int[] anIntArray352 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@OriginalMember(owner = "client!oj", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString233 = "You can't add yourself to your own ignore list.";

	@OriginalMember(owner = "client!oj", name = "s", descriptor = "I")
	public static int anInt3922 = -1;

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(CB)C")
	public static char method3150(@OriginalArg(0) char arg0) {
		return arg0 == 'µ' || arg0 == 'ƒ' ? arg0 : Character.toTitleCase(arg0);
	}

	@OriginalMember(owner = "client!oj", name = "d", descriptor = "(I)V")
	public static void method3154() {
		if (!Static277.aBoolean412 || Static7.aBoolean158) {
			return;
		}
		@Pc(13) Class1_Sub26[][][] local13 = Static74.aClass1_Sub26ArrayArrayArray1;
		for (@Pc(20) int local20 = 0; local20 < local13.length; local20++) {
			@Pc(32) Class1_Sub26[][] local32 = local13[local20];
			for (@Pc(34) int local34 = 0; local34 < local32.length; local34++) {
				for (@Pc(44) int local44 = 0; local44 < local32[local34].length; local44++) {
					@Pc(60) Class1_Sub26 local60 = local32[local34][local44];
					if (local60 != null) {
						@Pc(78) Class14_Sub6_Sub1 local78;
						if (local60.aClass44_1 != null && local60.aClass44_1.aClass14_6 instanceof Class14_Sub6_Sub1) {
							local78 = (Class14_Sub6_Sub1) local60.aClass44_1.aClass14_6;
							if ((local60.aClass44_1.aLong55 & Long.MIN_VALUE) == 0L) {
								local78.method2459(false, true, true, false, true, true);
							} else {
								local78.method2459(true, true, true, true, true, true);
							}
						}
						if (local60.aClass67_1 != null) {
							if (local60.aClass67_1.aClass14_7 instanceof Class14_Sub6_Sub1) {
								local78 = (Class14_Sub6_Sub1) local60.aClass67_1.aClass14_7;
								if ((local60.aClass67_1.aLong97 & Long.MIN_VALUE) == 0L) {
									local78.method2459(false, true, true, false, true, true);
								} else {
									local78.method2459(true, true, true, true, true, true);
								}
							}
							if (local60.aClass67_1.aClass14_8 instanceof Class14_Sub6_Sub1) {
								local78 = (Class14_Sub6_Sub1) local60.aClass67_1.aClass14_8;
								if ((Long.MIN_VALUE & local60.aClass67_1.aLong97) == 0L) {
									local78.method2459(false, true, true, false, true, true);
								} else {
									local78.method2459(true, true, true, true, true, true);
								}
							}
						}
						if (local60.aClass72_1 != null) {
							if (local60.aClass72_1.aClass14_10 instanceof Class14_Sub6_Sub1) {
								local78 = (Class14_Sub6_Sub1) local60.aClass72_1.aClass14_10;
								if ((local60.aClass72_1.aLong105 & Long.MIN_VALUE) == 0L) {
									local78.method2459(false, true, true, false, true, true);
								} else {
									local78.method2459(true, true, true, true, true, true);
								}
							}
							if (local60.aClass72_1.aClass14_9 instanceof Class14_Sub6_Sub1) {
								local78 = (Class14_Sub6_Sub1) local60.aClass72_1.aClass14_9;
								if ((local60.aClass72_1.aLong105 & Long.MIN_VALUE) == 0L) {
									local78.method2459(false, true, true, false, true, true);
								} else {
									local78.method2459(true, true, true, true, true, true);
								}
							}
						}
						for (@Pc(274) int local274 = 0; local274 < local60.anInt4090; local274++) {
							if (local60.aClass25Array4[local274].aClass14_1 instanceof Class14_Sub6_Sub1) {
								@Pc(297) Class14_Sub6_Sub1 local297 = (Class14_Sub6_Sub1) local60.aClass25Array4[local274].aClass14_1;
								if ((Long.MIN_VALUE & local60.aClass25Array4[local274].aLong39) == 0L) {
									local297.method2459(false, true, true, false, true, true);
								} else {
									local297.method2459(true, true, true, true, true, true);
								}
							}
						}
					}
				}
			}
		}
		Static7.aBoolean158 = true;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(ILjava/awt/Component;Lclient!wa;II)Lclient!vi;")
	public static Class52 method3155(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) Class175 arg2, @OriginalArg(3) int arg3) {
		if (Static13.anInt256 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(39) Class52 local39 = (Class52) Class.forName("Class52_Sub1").getDeclaredConstructor().newInstance();
			local39.anInt5262 = arg0;
			local39.anIntArray462 = new int[(Static166.aBoolean261 ? 2 : 1) * 256];
			local39.method4079(arg1);
			local39.anInt5270 = (arg0 & 0xFFFFFC00) + 1024;
			if (local39.anInt5270 > 16384) {
				local39.anInt5270 = 16384;
			}
			local39.method4082(local39.anInt5270);
			if (Static19.anInt355 > 0 && Static1.aClass104_2 == null) {
				Static1.aClass104_2 = new Class104();
				Static1.aClass104_2.aClass175_1 = arg2;
				arg2.method4320(Static1.aClass104_2, Static19.anInt355);
			}
			if (Static1.aClass104_2 != null) {
				if (Static1.aClass104_2.aClass52Array1[arg3] != null) {
					throw new IllegalArgumentException();
				}
				Static1.aClass104_2.aClass52Array1[arg3] = local39;
			}
			return local39;
		} catch (@Pc(116) Throwable local116) {
			try {
				@Pc(122) Class52_Sub2 local122 = new Class52_Sub2(arg2, arg3);
				local122.anInt5262 = arg0;
				local122.anIntArray462 = new int[(Static166.aBoolean261 ? 2 : 1) * 256];
				local122.method4079(arg1);
				local122.anInt5270 = 16384;
				local122.method4082(local122.anInt5270);
				if (Static19.anInt355 > 0 && Static1.aClass104_2 == null) {
					Static1.aClass104_2 = new Class104();
					Static1.aClass104_2.aClass175_1 = arg2;
					arg2.method4320(Static1.aClass104_2, Static19.anInt355);
				}
				if (Static1.aClass104_2 != null) {
					if (Static1.aClass104_2.aClass52Array1[arg3] != null) {
						throw new IllegalArgumentException();
					}
					Static1.aClass104_2.aClass52Array1[arg3] = local122;
				}
				return local122;
			} catch (@Pc(188) Throwable local188) {
				return new Class52();
			}
		}
	}
}
