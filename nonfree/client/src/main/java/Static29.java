import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!bl", name = "g", descriptor = "Lclient!nq;")
	public static Class175 aClass175_4;

	@OriginalMember(owner = "client!bl", name = "j", descriptor = "Lclient!ci;")
	public static Class38 aClass38_93;

	@OriginalMember(owner = "client!bl", name = "m", descriptor = "[Lclient!aa;")
	public static Class2[] aClass2Array46;

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(III)V")
	public static void method6226(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class162 local7 = Static294.aClass162ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass11_Sub2_2 != null) {
			local7.aClass11_Sub2_2 = null;
		}
		if (local7.aClass11_Sub2_1 != null) {
			local7.aClass11_Sub2_1 = null;
		}
	}

	@OriginalMember(owner = "client!bl", name = "d", descriptor = "(B)V")
	public static void method6227() {
		if (Static121.aClass87_9 == null) {
			return;
		}
		if (Static121.aClass87_9.anInt2679 == 1) {
			Static121.aClass87_9 = null;
			return;
		}
		if (Static121.aClass87_9.anInt2679 == 2) {
			Static183.method3349(2, Static275.aClass255_4, Static215.aString40);
			Static121.aClass87_9 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIZIB)V")
	public static void method6228(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		if (arg4 < 1) {
			arg4 = 1;
		}
		if (arg0 < 1) {
			arg0 = 1;
		}
		@Pc(21) int local21 = arg4 - 334;
		if (local21 < 0) {
			local21 = 0;
		} else if (local21 > 100) {
			local21 = 100;
		}
		@Pc(43) int local43 = Static448.aShort105 + local21 * (Static125.aShort23 - Static448.aShort105) / 100;
		if (Static381.aShort78 > local43) {
			local43 = Static381.aShort78;
		} else if (local43 > Static146.aShort24) {
			local43 = Static146.aShort24;
		}
		@Pc(79) int local79 = arg4 * local43 * 512 / (arg0 * 334);
		@Pc(124) int local124;
		@Pc(131) int local131;
		@Pc(95) short local95;
		if (Static316.aShort67 > local79) {
			local95 = Static316.aShort67;
			local43 = local95 * arg0 * 334 / (arg4 * 512);
			if (Static146.aShort24 < local43) {
				local43 = Static146.aShort24;
				local124 = local43 * arg4 * 512 / (local95 * 334);
				local131 = (arg0 - local124) / 2;
				if (arg3) {
					Static30.aClass30_3.H();
					Static30.aClass30_3.method2072(arg1, arg2, local131, arg4, -16777216);
					Static30.aClass30_3.method2072(arg1, arg2 + arg0 - local131, local131, arg4, -16777216);
				}
				arg2 += local131;
				arg0 -= local131 * 2;
			}
		} else if (Static336.aShort68 < local79) {
			local95 = Static336.aShort68;
			local43 = local95 * arg0 * 334 / (arg4 * 512);
			if (local43 < Static381.aShort78) {
				local43 = Static381.aShort78;
				local124 = local95 * 334 * arg0 / (local43 * 512);
				local131 = (arg4 - local124) / 2;
				if (arg3) {
					Static30.aClass30_3.H();
					Static30.aClass30_3.method2072(arg1, arg2, arg0, local131, -16777216);
					Static30.aClass30_3.method2072(arg1 + arg4 - local131, arg2, arg0, local131, -16777216);
				}
				arg1 += local131;
				arg4 -= local131 * 2;
			}
		}
		Static58.anInt1387 = arg2;
		Static404.anInt7098 = arg4 * local43 / 334;
		Static10.anInt197 = (short) arg0;
		Static401.anInt7082 = arg1;
		Static147.anInt3075 = (short) arg4;
	}
}
