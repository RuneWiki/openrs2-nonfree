import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!co", name = "ab", descriptor = "I")
	public static int anInt6157 = 0;

	@OriginalMember(owner = "client!co", name = "eb", descriptor = "I")
	public static int anInt6160 = 0;

	@OriginalMember(owner = "client!co", name = "ac", descriptor = "Lclient!uu;")
	public static final Class2_Sub42 aClass2_Sub42_4 = new Class2_Sub42(0, -1);

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IIII)V")
	public static void method4931(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class106 local7 = Static440.aClass106ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class3_Sub3 local13 = local7.aClass3_Sub3_1;
		@Pc(16) Class3_Sub3 local16 = local7.aClass3_Sub3_2;
		if (local13 != null) {
			local13.anInt4206 = local13.anInt4206 * arg3 / (0x10 << Static307.anInt5425 - 7);
			local13.anInt4215 = local13.anInt4215 * arg3 / (0x10 << Static307.anInt5425 - 7);
		}
		if (local16 != null) {
			local16.anInt4206 = local16.anInt4206 * arg3 / (0x10 << Static307.anInt5425 - 7);
			local16.anInt4215 = local16.anInt4215 * arg3 / (0x10 << Static307.anInt5425 - 7);
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Lclient!co;I)I")
	public static int method4936(@OriginalArg(0) Class3_Sub2_Sub1 arg0) {
		if (arg0.anInt6138 == 0) {
			return 0;
		}
		@Pc(50) int local50;
		@Pc(56) int local56;
		if (arg0.anInt6167 != -1) {
			@Pc(18) Class3_Sub2_Sub1 local18 = null;
			if (arg0.anInt6167 < 32768) {
				local18 = Static174.aClass3_Sub2_Sub1_Sub1Array1[arg0.anInt6167];
			} else if (arg0.anInt6167 >= 32768) {
				local18 = Static74.aClass3_Sub2_Sub1_Sub2Array1[arg0.anInt6167 - 32768];
			}
			if (local18 != null) {
				local50 = arg0.anInt6119 - local18.anInt6119;
				local56 = arg0.anInt6121 - local18.anInt6121;
				if (local50 != 0 || local56 != 0) {
					arg0.method4928((int) (Math.atan2((double) local50, (double) local56) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class3_Sub2_Sub1_Sub2) {
			@Pc(87) Class3_Sub2_Sub1_Sub2 local87 = (Class3_Sub2_Sub1_Sub2) arg0;
			if (local87.anInt6209 != -1 && (local87.anInt6206 == 0 || local87.anInt6203 > 0)) {
				local87.method4928(local87.anInt6209);
				local87.anInt6209 = -1;
			}
		} else if (arg0 instanceof Class3_Sub2_Sub1_Sub1) {
			@Pc(117) Class3_Sub2_Sub1_Sub1 local117 = (Class3_Sub2_Sub1_Sub1) arg0;
			if (local117.anInt1720 != -1 && (local117.anInt6206 == 0 || local117.anInt6203 > 0)) {
				local50 = local117.anInt6119 - (local117.anInt1720 - Static48.anInt962 - Static48.anInt962) * 64;
				local56 = local117.anInt6121 - (local117.anInt1733 - Static324.anInt5624 - Static324.anInt5624) * 64;
				if (local50 != 0 || local56 != 0) {
					local117.method4928((int) (Math.atan2((double) local50, (double) local56) * 2607.5945876176133D) & 0x3FFF);
				}
				local117.anInt1720 = -1;
			}
		}
		return arg0.method4922();
	}
}
