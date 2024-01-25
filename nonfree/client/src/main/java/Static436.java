import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static436 {

	@OriginalMember(owner = "client!pl", name = "j", descriptor = "I")
	public static int anInt7762 = 0;

	@OriginalMember(owner = "client!pl", name = "l", descriptor = "S")
	public static short aShort101 = 32767;

	@OriginalMember(owner = "client!pl", name = "o", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_123 = new Class274(15, 20);

	@OriginalMember(owner = "client!pl", name = "p", descriptor = "I")
	public static int anInt7766 = -1;

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIII)V")
	public static void method6503(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(12) int local12 = -arg1;
		@Pc(14) int local14 = -1;
		@Pc(32) int local32 = Static108.method1816(Static252.anInt4988, arg3 + arg1, Static306.anInt5020);
		@Pc(41) int local41 = Static108.method1816(Static252.anInt4988, arg3 - arg1, Static306.anInt5020);
		Static259.method4236(local41, local32, arg0, Static618.anIntArrayArray101[arg2]);
		while (local7 < local9) {
			local14 += 2;
			local12 += local14;
			@Pc(70) int local70;
			@Pc(75) int local75;
			@Pc(98) int local98;
			@Pc(107) int local107;
			if (local12 > 0) {
				local9--;
				local12 -= local9 << 1;
				local70 = arg2 - local9;
				local75 = arg2 + local9;
				if (Static570.anInt9385 <= local75 && local70 <= Static177.anInt3963) {
					local98 = Static108.method1816(Static252.anInt4988, arg3 + local7, Static306.anInt5020);
					local107 = Static108.method1816(Static252.anInt4988, arg3 - local7, Static306.anInt5020);
					if (local75 <= Static177.anInt3963) {
						Static259.method4236(local107, local98, arg0, Static618.anIntArrayArray101[local75]);
					}
					if (local70 >= Static570.anInt9385) {
						Static259.method4236(local107, local98, arg0, Static618.anIntArrayArray101[local70]);
					}
				}
			}
			local7++;
			local70 = arg2 - local7;
			local75 = arg2 + local7;
			if (local75 >= Static570.anInt9385 && Static177.anInt3963 >= local70) {
				local98 = Static108.method1816(Static252.anInt4988, local9 + arg3, Static306.anInt5020);
				local107 = Static108.method1816(Static252.anInt4988, arg3 - local9, Static306.anInt5020);
				if (local75 <= Static177.anInt3963) {
					Static259.method4236(local107, local98, arg0, Static618.anIntArrayArray101[local75]);
				}
				if (Static570.anInt9385 <= local70) {
					Static259.method4236(local107, local98, arg0, Static618.anIntArrayArray101[local70]);
				}
			}
		}
	}
}
