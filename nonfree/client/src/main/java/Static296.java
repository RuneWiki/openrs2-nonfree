import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!pb", name = "m", descriptor = "I")
	public static int anInt5305;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
	public static int anInt5296 = 1;

	@OriginalMember(owner = "client!pb", name = "l", descriptor = "Lclient!kl;")
	public static final Class142 aClass142_98 = new Class142(14, 0, 4, 1);

	@OriginalMember(owner = "client!pb", name = "o", descriptor = "Lclient!qp;")
	public static final Class209 aClass209_120 = new Class209("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIII)V")
	public static void method4259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(13) int local13 = arg2;
		@Pc(16) int local16 = -arg2;
		@Pc(18) int local18 = -1;
		@Pc(26) int local26 = Static327.method4554(arg1 + arg2, Static184.anInt3600, Static8.anInt223);
		@Pc(35) int local35 = Static327.method4554(arg1 - arg2, Static184.anInt3600, Static8.anInt223);
		Static64.method1247(local35, Static280.anIntArrayArray51[arg3], local26, arg0);
		while (local13 > local7) {
			local18 += 2;
			local16 += local18;
			@Pc(64) int local64;
			@Pc(68) int local68;
			@Pc(87) int local87;
			@Pc(96) int local96;
			if (local16 > 0) {
				local13--;
				local16 -= local13 << 1;
				local64 = arg3 - local13;
				local68 = local13 + arg3;
				if (local68 >= Static430.anInt7123 && Static181.anInt3543 >= local64) {
					local87 = Static327.method4554(arg1 + local7, Static184.anInt3600, Static8.anInt223);
					local96 = Static327.method4554(arg1 - local7, Static184.anInt3600, Static8.anInt223);
					if (Static181.anInt3543 >= local68) {
						Static64.method1247(local96, Static280.anIntArrayArray51[local68], local87, arg0);
					}
					if (Static430.anInt7123 <= local64) {
						Static64.method1247(local96, Static280.anIntArrayArray51[local64], local87, arg0);
					}
				}
			}
			local7++;
			local64 = arg3 - local7;
			local68 = local7 + arg3;
			if (local68 >= Static430.anInt7123 && local64 <= Static181.anInt3543) {
				local87 = Static327.method4554(arg1 + local13, Static184.anInt3600, Static8.anInt223);
				local96 = Static327.method4554(arg1 - local13, Static184.anInt3600, Static8.anInt223);
				if (local68 <= Static181.anInt3543) {
					Static64.method1247(local96, Static280.anIntArrayArray51[local68], local87, arg0);
				}
				if (Static430.anInt7123 <= local64) {
					Static64.method1247(local96, Static280.anIntArrayArray51[local64], local87, arg0);
				}
			}
		}
	}
}
