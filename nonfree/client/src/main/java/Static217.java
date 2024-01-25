import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!hn", name = "m", descriptor = "F")
	public static float aFloat83;

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIZII)V")
	public static void method3564(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(16) int local16 = -arg1;
		@Pc(18) int local18 = -1;
		@Pc(26) int local26 = Static117.method5173(Static566.anInt9279, arg1 + arg2, Static392.anInt6753);
		@Pc(35) int local35 = Static117.method5173(Static566.anInt9279, arg2 - arg1, Static392.anInt6753);
		Static188.method3208(local26, arg3, local35, Static349.anIntArrayArray71[arg0]);
		while (local9 > local7) {
			local18 += 2;
			local16 += local18;
			@Pc(64) int local64;
			@Pc(68) int local68;
			@Pc(86) int local86;
			@Pc(94) int local94;
			if (local16 > 0) {
				local9--;
				local16 -= local9 << 1;
				local64 = arg0 - local9;
				local68 = local9 + arg0;
				if (local68 >= Static346.anInt5494 && Static640.anInt10333 >= local64) {
					local86 = Static117.method5173(Static566.anInt9279, local7 + arg2, Static392.anInt6753);
					local94 = Static117.method5173(Static566.anInt9279, arg2 - local7, Static392.anInt6753);
					if (Static640.anInt10333 >= local68) {
						Static188.method3208(local86, arg3, local94, Static349.anIntArrayArray71[local68]);
					}
					if (local64 >= Static346.anInt5494) {
						Static188.method3208(local86, arg3, local94, Static349.anIntArrayArray71[local64]);
					}
				}
			}
			local7++;
			local64 = arg0 - local7;
			local68 = local7 + arg0;
			if (local68 >= Static346.anInt5494 && Static640.anInt10333 >= local64) {
				local86 = Static117.method5173(Static566.anInt9279, arg2 + local9, Static392.anInt6753);
				local94 = Static117.method5173(Static566.anInt9279, arg2 - local9, Static392.anInt6753);
				if (Static640.anInt10333 >= local68) {
					Static188.method3208(local86, arg3, local94, Static349.anIntArrayArray71[local68]);
				}
				if (local64 >= Static346.anInt5494) {
					Static188.method3208(local86, arg3, local94, Static349.anIntArrayArray71[local64]);
				}
			}
		}
	}
}
