import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static500 {

	@OriginalMember(owner = "client!rw", name = "F", descriptor = "[Lclient!s;")
	public static Class274[] aClass274Array2;

	@OriginalMember(owner = "client!rw", name = "C", descriptor = "I")
	public static int anInt8858 = 0;

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(JI)V")
	public static void method7308(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static124.method2877(arg0 - 1L);
			Static124.method2877(1L);
		} else {
			Static124.method2877(arg0);
		}
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(ILclient!ka;III)Lclient!ufa;")
	public static Class332 method7309(@OriginalArg(0) int arg0, @OriginalArg(1) Class128 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		return arg1 == null ? null : new Class332(arg0, arg3, arg2, arg1.na(), arg1.V(), arg1.RA(), arg1.fa(), arg1.EA(), arg1.HA(), arg1.G());
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(I)V")
	public static void method7311() {
		Static98.aClass112_12.method3638();
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(BII)Z")
	public static boolean method7312(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method7313(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(14) int local14;
		if (Static263.method4883(arg1)) {
			local14 = 0;
			@Pc(38) int local38 = 0;
			@Pc(40) int local40 = 0;
			@Pc(42) int local42 = 0;
			@Pc(44) int local44 = 0;
			if (Static349.aBoolean590) {
				local14 = Static182.anInt4317;
				local40 = Static83.anInt6976;
				local42 = Static199.anInt4632;
				local38 = Static570.anInt9679;
				local44 = Static447.anInt8127;
				Static447.anInt8127 = 1;
			}
			if (Static42.aClass108ArrayArray1[arg1] == null) {
				Static642.method8648(arg4, arg0, arg2, arg3, arg7, arg5, Static85.aClass108ArrayArray2[arg1], arg6 < 0, -1, arg6);
			} else {
				Static642.method8648(arg4, arg0, arg2, arg3, arg7, arg5, Static42.aClass108ArrayArray1[arg1], arg6 < 0, -1, arg6);
			}
			if (Static349.aBoolean590) {
				if (arg6 >= 0 && Static447.anInt8127 == 2) {
					Static241.method4616(Static199.anInt4632, Static570.anInt9679, Static83.anInt6976, Static182.anInt4317);
				}
				Static199.anInt4632 = local42;
				Static182.anInt4317 = local14;
				Static447.anInt8127 = local44;
				Static570.anInt9679 = local38;
				Static83.anInt6976 = local40;
			}
		} else if (arg6 == -1) {
			for (local14 = 0; local14 < 100; local14++) {
				Static178.aBooleanArray12[local14] = true;
			}
		} else {
			Static178.aBooleanArray12[arg6] = true;
		}
	}
}
