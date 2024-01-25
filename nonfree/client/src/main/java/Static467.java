import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static467 {

	@OriginalMember(owner = "client!rl", name = "N", descriptor = "Lclient!mv;")
	public static Class229 aClass229_108;

	@OriginalMember(owner = "client!rl", name = "M", descriptor = "Lclient!au;")
	public static final Class21 aClass21_73 = new Class21(8);

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!ew;Ljava/awt/Component;III)Lclient!cv;")
	public static Class7 method6016(@OriginalArg(0) Class99 arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static591.anInt9580 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(36) Class7 local36 = (Class7) Class.forName("Class7_Sub2").getDeclaredConstructor().newInstance();
			local36.anIntArray525 = new int[(Static517.aBoolean697 ? 2 : 1) * 256];
			local36.anInt7832 = arg2;
			local36.method6318(arg1);
			local36.anInt7833 = (arg2 & 0xFFFFFC00) + 1024;
			if (local36.anInt7833 > 16384) {
				local36.anInt7833 = 16384;
			}
			local36.method6317(local36.anInt7833);
			if (Static345.anInt5965 > 0 && Static60.aClass117_1 == null) {
				Static60.aClass117_1 = new Class117();
				Static60.aClass117_1.aClass99_1 = arg0;
				arg0.method1787(Static60.aClass117_1, Static345.anInt5965);
			}
			if (Static60.aClass117_1 != null) {
				if (Static60.aClass117_1.aClass7Array1[arg3] != null) {
					throw new IllegalArgumentException();
				}
				Static60.aClass117_1.aClass7Array1[arg3] = local36;
			}
			return local36;
		} catch (@Pc(113) Throwable local113) {
			try {
				@Pc(119) Class7_Sub1 local119 = new Class7_Sub1(arg0, arg3);
				local119.anInt7832 = arg2;
				local119.anIntArray525 = new int[(Static517.aBoolean697 ? 2 : 1) * 256];
				local119.method6318(arg1);
				local119.anInt7833 = 16384;
				local119.method6317(local119.anInt7833);
				if (Static345.anInt5965 > 0 && Static60.aClass117_1 == null) {
					Static60.aClass117_1 = new Class117();
					Static60.aClass117_1.aClass99_1 = arg0;
					arg0.method1787(Static60.aClass117_1, Static345.anInt5965);
				}
				if (Static60.aClass117_1 != null) {
					if (Static60.aClass117_1.aClass7Array1[arg3] != null) {
						throw new IllegalArgumentException();
					}
					Static60.aClass117_1.aClass7Array1[arg3] = local119;
				}
				return local119;
			} catch (@Pc(181) Throwable local181) {
				return new Class7();
			}
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!ua;Lclient!r;IIIIILclient!ps;I)V")
	public static void method6018(@OriginalArg(0) Class84 arg0, @OriginalArg(1) Class162 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class273 arg6, @OriginalArg(8) int arg7) {
		@Pc(10) Class142 local10 = Static8.aClass360_1.method7576(arg5);
		if (local10 == null || !local10.aBoolean209 || !local10.method2521(Static426.aClass160_1)) {
			return;
		}
		@Pc(37) int local37;
		if (local10.anIntArray244 != null) {
			@Pc(35) int[] local35 = new int[local10.anIntArray244.length];
			@Pc(47) int local47;
			for (local37 = 0; local37 < local35.length / 2; local37++) {
				if (Static489.anInt7763 == 4) {
					local47 = (int) Static313.aFloat157 & 0x3FFF;
				} else {
					local47 = Static525.anInt8446 + (int) Static313.aFloat157 & 0x3FFF;
				}
				@Pc(60) int local60 = Class285.anIntArray476[local47];
				@Pc(64) int local64 = Class285.anIntArray475[local47];
				if (Static489.anInt7763 != 4) {
					local64 = local64 * 256 / (Static434.anInt6973 + 256);
					local60 = local60 * 256 / (Static434.anInt6973 + 256);
				}
				local35[local37 * 2] = arg6.anInt6883 / 2 + arg3 + ((local10.anIntArray244[local37 * 2] * 4 + arg7) * local64 + (local10.anIntArray244[local37 * 2 + 1] * 4 + arg2) * local60 >> 14);
				local35[local37 * 2 + 1] = arg6.anInt6814 / 2 + arg4 - ((local10.anIntArray244[local37 * 2 + 1] * 4 + arg2) * local64 - (local10.anIntArray244[local37 * 2] * 4 + arg7) * local60 >> 14);
			}
			Static54.method942(arg1, local35, local10.anInt2951, arg6.anIntArray447, arg6.anIntArray445);
			for (local47 = 0; local47 < local35.length / 2 - 1; local47++) {
				arg1.method6833(local35[local47 * 2], local35[local47 * 2 + 1], local35[local47 * 2 + 2], local35[local47 * 2 + 1 + 2], local10.anInt2952, arg0, arg3, arg4);
			}
			arg1.method6833(local35[local35.length - 2], local35[local35.length - 1], local35[0], local35[1], local10.anInt2952, arg0, arg3, arg4);
		}
		@Pc(272) Class38 local272 = null;
		if (local10.anInt2961 != -1) {
			local272 = local10.method2523(false, arg1);
			if (local272 != null) {
				Static460.method5970(local272, arg7, arg2, arg4, arg6, arg0, arg3);
			}
		}
		if (local10.aString42 == null) {
			return;
		}
		local37 = 0;
		if (local272 != null) {
			local37 = local272.u();
		}
		@Pc(308) Class37 local308 = Static71.aClass37_11;
		@Pc(310) Class112 local310 = Static125.aClass112_5;
		if (local10.anInt2955 == 1) {
			local308 = Static322.aClass37_20;
			local310 = Static266.aClass112_7;
		}
		if (local10.anInt2955 == 2) {
			local308 = Static81.aClass37_16;
			local310 = Static537.aClass112_11;
		}
		Static530.method6892(arg2, arg4, local10.aString42, arg0, local310, local37, local308, arg6, local10.anInt2949, arg3, arg7);
		return;
	}
}
