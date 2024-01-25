import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIIIII)V")
	public static void method1503(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		@Pc(7) Class118[] local7 = Static16.aClass118Array1;
		for (@Pc(9) int local9 = 0; local9 < local7.length; local9++) {
			@Pc(17) Class118 local17 = local7[local9];
			if (local17 != null && local17.anInt3289 == 2) {
				Static360.method5785(local17.anInt3288, local17.anInt3294, local17.anInt3291 * 2, arg3 >> 1, local17.anInt3298, arg2 >> 1);
				if (Static272.anIntArray292[0] > -1 && Static304.anInt8391 % 20 < 10) {
					@Pc(63) Class103 local63 = Static205.aClass103Array22[local17.anInt3285];
					@Pc(71) int local71 = arg1 + Static272.anIntArray292[0] - 12;
					@Pc(79) int local79 = Static272.anIntArray292[1] + arg0 - 28;
					local63.method7462(local71, local79);
					Static304.method7235(local63.method7454() + local71, local79 + local63.method7451(), local71, local79);
				}
			}
		}
	}
}
