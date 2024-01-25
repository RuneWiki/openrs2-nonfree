import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!eb", name = "D", descriptor = "J")
	public static long aLong51 = -1L;

	@OriginalMember(owner = "client!eb", name = "V", descriptor = "[I")
	public static final int[] anIntArray306 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "(B)V")
	public static void method1127() {
		@Pc(7) Class25 local7 = null;
		try {
			@Pc(14) Class182 local14 = Static359.aClass111_5.method2799();
			while (local14.anInt4498 == 0) {
				Static358.method2028(1L);
			}
			if (local14.anInt4498 == 1) {
				local7 = (Class25) local14.anObject6;
				@Pc(36) byte[] local36 = new byte[(int) local7.method590()];
				@Pc(51) int local51;
				for (@Pc(38) int local38 = 0; local38 < local36.length; local38 += local51) {
					local51 = local7.method592(local36.length - local38, local36, local38);
					if (local51 == -1) {
						throw new IOException("EOF");
					}
				}
				Static143.method2682(new Class2_Sub16(local36));
			}
		} catch (@Pc(76) Exception local76) {
		}
		try {
			if (local7 != null) {
				local7.method594();
			}
		} catch (@Pc(83) Exception local83) {
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZIIIIIIII)V")
	public static void method1128(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg5 < 1 || arg6 < 1 || arg5 > Static246.anInt4374 - 2 || Static185.anInt3485 - 2 < arg6) {
			return;
		}
		if (!Static231.method3740() && !Static90.method1687(arg6, Static130.anInt2658, arg2, arg5)) {
			return;
		}
		if (Static64.aClass251ArrayArrayArray1 == null) {
			return;
		}
		Static372.aClass56_Sub1_2.method4073(arg0, Static111.aClass63_3, arg5, arg2, arg6, Static58.aClass188Array1[arg2]);
		if (arg1 < 0) {
			return;
		}
		@Pc(60) boolean local60 = Static349.aBoolean351;
		Static349.aBoolean351 = true;
		@Pc(64) int local64 = arg2;
		if (arg2 < 3 && Static210.method3518(arg5, arg6)) {
			local64 = arg2 + 1;
		}
		Static372.aClass56_Sub1_2.method4074(arg3, arg4, Static58.aClass188Array1[arg2], Static111.aClass63_3, arg6, arg1, arg5, local64, arg2, arg7);
		Static349.aBoolean351 = local60;
		return;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)Z")
	public static boolean method1129(@OriginalArg(1) int arg0) {
		return arg0 == (-arg0 & arg0);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(III)Z")
	public static boolean method1130(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!Static269.aBoolean349) {
			return false;
		}
		@Pc(13) int local13 = arg1 >> 16;
		@Pc(17) int local17 = arg1 & 0xFFFF;
		if (Static183.aClass4ArrayArray1[local13] == null || Static183.aClass4ArrayArray1[local13][local17] == null) {
			return false;
		}
		@Pc(35) Class4 local35 = Static183.aClass4ArrayArray1[local13][local17];
		@Pc(51) Class2_Sub26 local51;
		if (arg0 == -1 && local35.anInt125 == 0) {
			for (local51 = (Class2_Sub26) Static195.aClass30_28.method694(); local51 != null; local51 = (Class2_Sub26) Static195.aClass30_28.method682()) {
				if (local51.anInt3594 == 47 || local51.anInt3594 == 1002 || local51.anInt3594 == 2 || local51.anInt3594 == 13 || local51.anInt3594 == 59) {
					for (@Pc(143) Class4 local143 = Static380.method5560(local51.anInt3596); local143 != null; local143 = Static368.method4611(local143)) {
						if (local143.anInt94 == local35.anInt94) {
							return true;
						}
					}
				}
			}
		} else {
			for (local51 = (Class2_Sub26) Static195.aClass30_28.method694(); local51 != null; local51 = (Class2_Sub26) Static195.aClass30_28.method682()) {
				if (arg0 == local51.anInt3599 && local51.anInt3596 == local35.anInt94 && (local51.anInt3594 == 47 || local51.anInt3594 == 1002 || local51.anInt3594 == 2 || local51.anInt3594 == 13 || local51.anInt3594 == 59)) {
					return true;
				}
			}
		}
		return false;
	}
}
