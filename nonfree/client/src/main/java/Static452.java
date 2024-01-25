import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static452 {

	@OriginalMember(owner = "client!st", name = "m", descriptor = "Lclient!wt;")
	public static Class317 aClass317_2;

	@OriginalMember(owner = "client!st", name = "s", descriptor = "I")
	public static int anInt7734;

	@OriginalMember(owner = "client!st", name = "t", descriptor = "I")
	public static int anInt7735 = 0;

	@OriginalMember(owner = "client!st", name = "z", descriptor = "I")
	public static int anInt7741 = 0;

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(Z[JII[I)V")
	public static void method6438(@OriginalArg(1) long[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg2 >= arg1) {
			return;
		}
		@Pc(14) int local14 = (arg1 + arg2) / 2;
		@Pc(16) int local16 = arg2;
		@Pc(20) long local20 = arg0[local14];
		arg0[local14] = arg0[arg1];
		arg0[arg1] = local20;
		@Pc(34) int local34 = arg3[local14];
		arg3[local14] = arg3[arg1];
		arg3[arg1] = local34;
		@Pc(54) int local54 = ~local20 == Long.MIN_VALUE ? 0 : 1;
		for (@Pc(56) int local56 = arg2; local56 < arg1; local56++) {
			if ((long) (local56 & local54) + local20 > arg0[local56]) {
				@Pc(73) long local73 = arg0[local56];
				arg0[local56] = arg0[local16];
				arg0[local16] = local73;
				@Pc(87) int local87 = arg3[local56];
				arg3[local56] = arg3[local16];
				arg3[local16++] = local87;
			}
		}
		arg0[arg1] = arg0[local16];
		arg0[local16] = local20;
		arg3[arg1] = arg3[local16];
		arg3[local16] = local34;
		method6438(arg0, local16 - 1, arg2, arg3);
		method6438(arg0, arg1, local16 + 1, arg3);
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(BLclient!dc;I)V")
	public static void method6439(@OriginalArg(1) Class49_Sub2_Sub2 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		if (Static436.anInt6850 < arg0.anInt4322) {
			Static221.method3828(arg0);
		} else if (arg0.anInt4278 < Static436.anInt6850) {
			Static372.method5724(arg0, false);
			local7 = Static76.anInt1386;
			local9 = Static471.anInt7902;
		} else {
			Static488.method6691(arg0);
		}
		if (arg0.anInt7137 < 512 || arg0.anInt7141 < 512 || Static459.anInt7799 * 512 - 512 <= arg0.anInt7137 || arg0.anInt7141 >= Static482.anInt7990 * 512 - 512) {
			local9 = 0;
			arg0.anInt4289 = -1;
			arg0.anInt4322 = 0;
			arg0.anInt4278 = 0;
			arg0.anInt4307 = -1;
			arg0.anInt4297 = -1;
			local7 = -1;
			arg0.anInt7137 = arg0.anIntArray428[0] * 512 + arg0.method3788() * 256;
			arg0.anInt7141 = arg0.anIntArray427[0] * 512 + arg0.method3788() * 256;
			arg0.method3789();
		}
		if (arg0 == Static63.aClass49_Sub2_Sub2_Sub1_1 && (arg0.anInt7137 < 6144 || arg0.anInt7141 < 6144 || (Static459.anInt7799 - 12) * 512 <= arg0.anInt7137 || arg0.anInt7141 >= (Static482.anInt7990 - 12) * 512)) {
			local7 = -1;
			arg0.anInt4322 = 0;
			arg0.anInt4289 = -1;
			local9 = 0;
			arg0.anInt4307 = -1;
			arg0.anInt4297 = -1;
			arg0.anInt4278 = 0;
			arg0.anInt7137 = arg0.anIntArray428[0] * 512 + arg0.method3788() * 256;
			arg0.anInt7141 = arg0.anIntArray427[0] * 512 + arg0.method3788() * 256;
			arg0.method3789();
		}
		@Pc(207) int local207 = Static153.method2413(arg0);
		Static473.method6592(arg0, local207, local9, local7);
		Static299.method4747(arg0);
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(ZIZII)I")
	public static int method6440(@OriginalArg(2) boolean arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		@Pc(10) Class1_Sub18 local10 = Static7.method282(false, arg1);
		if (local10 == null) {
			return 0;
		}
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < local10.anIntArray254.length; local18++) {
			if (local10.anIntArray254[local18] >= 0 && Static342.aClass250_2.anInt7128 > local10.anIntArray254[local18]) {
				@Pc(51) Class133 local51 = Static342.aClass250_2.method5980(local10.anIntArray254[local18]);
				@Pc(61) int local61 = local51.method3457(aClass317_2.method7539(arg2).anInt1963, arg2);
				if (arg0) {
					local16 += local61 * local10.anIntArray255[local18];
				} else {
					local16 += local61;
				}
			}
		}
		return local16;
	}
}
