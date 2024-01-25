import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static530 {

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "I")
	public static int anInt9820;

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
	public static int anInt9821;

	@OriginalMember(owner = "client!tc", name = "h", descriptor = "J")
	public static long aLong253;

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray75 = new String[100];

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "S")
	public static short aShort112 = 1;

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_151 = new Class337(74, 4);

	@OriginalMember(owner = "client!tc", name = "g", descriptor = "Lclient!mha;")
	public static final Class232 aClass232_10 = new Class232(64);

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IBIIII)V")
	public static void method8444(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(13) int local13 = arg0 * arg0;
		@Pc(17) int local17 = arg2 * arg2;
		@Pc(25) int local25 = local17 << 1;
		@Pc(29) int local29 = local13 << 1;
		@Pc(33) int local33 = arg2 << 1;
		@Pc(42) int local42 = local25 + local13 * (1 - local33);
		@Pc(50) int local50 = local17 - local29 * (local33 - 1);
		@Pc(54) int local54 = local13 << 2;
		@Pc(58) int local58 = local17 << 2;
		@Pc(66) int local66 = local25 * 3;
		@Pc(74) int local74 = local29 * ((arg2 << 1) - 3);
		@Pc(80) int local80 = local58;
		@Pc(94) int local94;
		@Pc(103) int local103;
		if (Static554.anInt9362 <= arg4 && arg4 <= Static62.anInt1300) {
			local94 = Static361.method8001(Static275.anInt4919, Static529.anInt9089, arg0 + arg3);
			local103 = Static361.method8001(Static275.anInt4919, Static529.anInt9089, arg3 - arg0);
			Static491.method7219(Static249.anIntArrayArray23[arg4], local103, arg1, local94);
		}
		@Pc(117) int local117 = local54 * (arg2 - 1);
		while (local9 > 0) {
			if (local42 < 0) {
				while (local42 < 0) {
					local50 += local80;
					local42 += local66;
					local80 += local58;
					local66 += local58;
					local7++;
				}
			}
			if (local50 < 0) {
				local42 += local66;
				local50 += local80;
				local7++;
				local80 += local58;
				local66 += local58;
			}
			local50 += -local74;
			local42 += -local117;
			local117 -= local54;
			local74 -= local54;
			local9--;
			local94 = arg4 - local9;
			local103 = arg4 + local9;
			if (Static554.anInt9362 <= local103 && local94 <= Static62.anInt1300) {
				@Pc(214) int local214 = Static361.method8001(Static275.anInt4919, Static529.anInt9089, arg3 + local7);
				@Pc(223) int local223 = Static361.method8001(Static275.anInt4919, Static529.anInt9089, arg3 - local7);
				if (Static554.anInt9362 <= local94) {
					Static491.method7219(Static249.anIntArrayArray23[local94], local223, arg1, local214);
				}
				if (local103 <= Static62.anInt1300) {
					Static491.method7219(Static249.anIntArrayArray23[local103], local223, arg1, local214);
				}
			}
		}
	}
}
