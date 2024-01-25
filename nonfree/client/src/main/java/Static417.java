import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static417 {

	@OriginalMember(owner = "client!ov", name = "nb", descriptor = "I")
	public static int anInt7626;

	@OriginalMember(owner = "client!ov", name = "m", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_118 = new Class274(13, -1);

	@OriginalMember(owner = "client!ov", name = "H", descriptor = "Lclient!tw;")
	public static final Class2_Sub49 aClass2_Sub49_1 = new Class2_Sub49(0, 0);

	@OriginalMember(owner = "client!ov", name = "S", descriptor = "[I")
	public static final int[] anIntArray511 = new int[1000];

	@OriginalMember(owner = "client!ov", name = "U", descriptor = "Z")
	public static boolean aBoolean571 = true;

	@OriginalMember(owner = "client!ov", name = "cb", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray29 = new String[100];

	@OriginalMember(owner = "client!ov", name = "ib", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_119 = new Class274(65, -2);

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(IIIIII)V")
	public static void method6377(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(17) int local17 = arg4 * arg4;
		@Pc(21) int local21 = arg0 * arg0;
		@Pc(25) int local25 = local21 << 1;
		@Pc(29) int local29 = local17 << 1;
		@Pc(33) int local33 = arg0 << 1;
		@Pc(43) int local43 = (1 - local33) * local17 + local25;
		@Pc(52) int local52 = local21 - local29 * (local33 - 1);
		@Pc(56) int local56 = local17 << 2;
		@Pc(60) int local60 = local21 << 2;
		@Pc(68) int local68 = local25 * 3;
		@Pc(76) int local76 = ((arg0 << 1) - 3) * local29;
		@Pc(82) int local82 = local60;
		@Pc(88) int local88 = local56 * (arg0 - 1);
		@Pc(106) int local106;
		@Pc(115) int local115;
		if (Static570.anInt9385 <= arg2 && arg2 <= Static177.anInt3963) {
			local106 = Static108.method1816(Static252.anInt4988, arg3 + arg4, Static306.anInt5020);
			local115 = Static108.method1816(Static252.anInt4988, arg3 - arg4, Static306.anInt5020);
			Static259.method4236(local115, local106, arg1, Static618.anIntArrayArray101[arg2]);
		}
		while (local9 > 0) {
			if (local43 < 0) {
				while (local43 < 0) {
					local52 += local82;
					local43 += local68;
					local82 += local60;
					local7++;
					local68 += local60;
				}
			}
			if (local52 < 0) {
				local52 += local82;
				local43 += local68;
				local7++;
				local68 += local60;
				local82 += local60;
			}
			local52 += -local76;
			local43 += -local88;
			local9--;
			local76 -= local56;
			local88 -= local56;
			local106 = arg2 - local9;
			local115 = local9 + arg2;
			if (Static570.anInt9385 <= local115 && Static177.anInt3963 >= local106) {
				@Pc(226) int local226 = Static108.method1816(Static252.anInt4988, local7 + arg3, Static306.anInt5020);
				@Pc(235) int local235 = Static108.method1816(Static252.anInt4988, arg3 - local7, Static306.anInt5020);
				if (local106 >= Static570.anInt9385) {
					Static259.method4236(local235, local226, arg1, Static618.anIntArrayArray101[local106]);
				}
				if (local115 <= Static177.anInt3963) {
					Static259.method4236(local235, local226, arg1, Static618.anIntArrayArray101[local115]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ov", name = "b", descriptor = "(I)V")
	public static void method6378() {
		Static489.aClass2_Sub2_Sub1_4.method180();
		Static189.aClass2_Sub2_Sub1_1 = null;
		Static192.aClass97_53 = null;
		Static158.anInt3597 = 1;
	}
}
