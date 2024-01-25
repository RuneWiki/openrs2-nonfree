import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static316 {

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "I")
	public static int anInt6064;

	@OriginalMember(owner = "client!lha", name = "c", descriptor = "Lclient!mia;")
	public static final Class208 aClass208_51 = new Class208(3, 8);

	@OriginalMember(owner = "client!lha", name = "e", descriptor = "I")
	public static int anInt6067 = 0;

	@OriginalMember(owner = "client!lha", name = "g", descriptor = "I")
	public static int anInt6069 = -1;

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(II)Z")
	public static boolean method5291(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 7 || arg0 == 10;
	}

	@OriginalMember(owner = "client!lha", name = "b", descriptor = "(II)Z")
	public static boolean method5292(@OriginalArg(1) int arg0) {
		return (-arg0 & arg0) == arg0;
	}

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(IIIBI)V")
	public static void method5294(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(12) int local12 = -arg0;
		@Pc(22) int local22 = -1;
		@Pc(30) int local30 = Static384.method6192(Static553.anInt9425, Static347.anInt6542, arg0 + arg3);
		@Pc(39) int local39 = Static384.method6192(Static553.anInt9425, Static347.anInt6542, arg3 - arg0);
		Static312.method5228(arg2, Static484.anIntArrayArray41[arg1], local30, local39);
		while (local7 < local9) {
			local22 += 2;
			local12 += local22;
			@Pc(67) int local67;
			@Pc(71) int local71;
			@Pc(89) int local89;
			@Pc(98) int local98;
			if (local12 > 0) {
				local9--;
				local12 -= local9 << 1;
				local67 = arg1 - local9;
				local71 = local9 + arg1;
				if (local71 >= Static100.anInt10042 && Static567.anInt9578 >= local67) {
					local89 = Static384.method6192(Static553.anInt9425, Static347.anInt6542, local7 + arg3);
					local98 = Static384.method6192(Static553.anInt9425, Static347.anInt6542, arg3 - local7);
					if (Static567.anInt9578 >= local71) {
						Static312.method5228(arg2, Static484.anIntArrayArray41[local71], local89, local98);
					}
					if (Static100.anInt10042 <= local67) {
						Static312.method5228(arg2, Static484.anIntArrayArray41[local67], local89, local98);
					}
				}
			}
			local7++;
			local67 = arg1 - local7;
			local71 = local7 + arg1;
			if (local71 >= Static100.anInt10042 && Static567.anInt9578 >= local67) {
				local89 = Static384.method6192(Static553.anInt9425, Static347.anInt6542, arg3 + local9);
				local98 = Static384.method6192(Static553.anInt9425, Static347.anInt6542, arg3 - local9);
				if (local71 <= Static567.anInt9578) {
					Static312.method5228(arg2, Static484.anIntArrayArray41[local71], local89, local98);
				}
				if (Static100.anInt10042 <= local67) {
					Static312.method5228(arg2, Static484.anIntArrayArray41[local67], local89, local98);
				}
			}
		}
	}
}
