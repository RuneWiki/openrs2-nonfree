import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!fk", name = "j", descriptor = "[[Lclient!tf;")
	public static Class240[][] aClass240ArrayArray1;

	@OriginalMember(owner = "client!fk", name = "l", descriptor = "I")
	public static int anInt2391;

	@OriginalMember(owner = "client!fk", name = "i", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger2 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!fk", name = "n", descriptor = "Z")
	public static boolean aBoolean165 = true;

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(ILclient!wn;)Ljava/lang/String;")
	public static String method2178(@OriginalArg(1) Class4_Sub20 arg0) {
		return Static213.method3744(arg0);
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method2179(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static104.method1974(arg2)) {
			if (aClass240ArrayArray1[arg2] == null) {
				Static307.method5981(arg4, arg3, arg6, Static122.aClass240ArrayArray2[arg2], arg1, -1, arg5, arg7, arg0);
			} else {
				Static307.method5981(arg4, arg3, arg6, aClass240ArrayArray1[arg2], arg1, -1, arg5, arg7, arg0);
			}
		} else if (arg5 == -1) {
			for (@Pc(20) int local20 = 0; local20 < 100; local20++) {
				Static353.aBooleanArray124[local20] = true;
			}
		} else {
			Static353.aBooleanArray124[arg5] = true;
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lclient!tf;IBIZ)V")
	public static void method2180(@OriginalArg(0) Class240 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(8) int local8 = arg0.anInt6904;
		if (arg0.aByte85 == 0) {
			arg0.anInt6904 = arg0.anInt6892;
		} else if (arg0.aByte85 == 1) {
			arg0.anInt6904 = arg2 - arg0.anInt6892;
		} else if (arg0.aByte85 == 2) {
			arg0.anInt6904 = arg2 * arg0.anInt6892 >> 14;
		}
		@Pc(47) int local47 = arg0.anInt6894;
		if (arg0.aByte86 == 0) {
			arg0.anInt6894 = arg0.anInt6860;
		} else if (arg0.aByte86 == 1) {
			arg0.anInt6894 = arg1 - arg0.anInt6860;
		} else if (arg0.aByte86 == 2) {
			arg0.anInt6894 = arg0.anInt6860 * arg1 >> 14;
		}
		if (arg0.aByte85 == 4) {
			arg0.anInt6904 = arg0.anInt6927 * arg0.anInt6894 / arg0.anInt6888;
		}
		if (arg0.aByte86 == 4) {
			arg0.anInt6894 = arg0.anInt6904 * arg0.anInt6888 / arg0.anInt6927;
		}
		if (Static341.aBoolean453 && (Static50.method1146(arg0).anInt7357 != 0 || arg0.anInt6873 == 0)) {
			if (arg0.anInt6894 < 5 && arg0.anInt6904 < 5) {
				arg0.anInt6904 = 5;
				arg0.anInt6894 = 5;
			} else {
				if (arg0.anInt6894 <= 0) {
					arg0.anInt6894 = 5;
				}
				if (arg0.anInt6904 <= 0) {
					arg0.anInt6904 = 5;
				}
			}
		}
		if (Static431.anInt7389 == arg0.anInt6882) {
			Static197.aClass240_11 = arg0;
		}
		if (arg3 && arg0.anObjectArray16 != null && (local8 != arg0.anInt6904 || arg0.anInt6894 != local47)) {
			@Pc(196) Class4_Sub10 local196 = new Class4_Sub10();
			local196.anObjectArray4 = arg0.anObjectArray16;
			local196.aClass240_5 = arg0;
			Static459.aClass91_53.method2587(local196);
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IB)V")
	public static void method2181(@OriginalArg(0) int arg0) {
		for (@Pc(14) Class4 local14 = Static135.aClass96_15.method2798(); local14 != null; local14 = Static135.aClass96_15.method2796()) {
			if ((local14.aLong228 >> 48 & 0xFFFFL) == (long) arg0) {
				local14.method6330();
			}
		}
	}
}
