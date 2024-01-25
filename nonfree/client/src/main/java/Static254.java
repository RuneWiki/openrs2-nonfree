import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!iia", name = "k", descriptor = "Lclient!fj;")
	public static final Class117 aClass117_8 = new Class117(9, -1);

	@OriginalMember(owner = "client!iia", name = "l", descriptor = "Z")
	public static boolean aBoolean305 = true;

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(ZIBIIIIII)Z")
	public static boolean method3686(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(8) int local8 = Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anIntArray693[0];
		@Pc(13) int local13 = Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anIntArray694[0];
		if (local8 < 0 || local8 >= Static224.anInt3557 || local13 < 0 || Static267.anInt4309 <= local13) {
			return false;
		} else if (arg6 >= 0 && Static224.anInt3557 > arg6 && arg2 >= 0 && Static267.anInt4309 > arg2) {
			@Pc(70) int local70 = Static250.method3668(arg2, Static263.aClass389Array1[Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.aByte141], arg5, arg0, local13, local8, arg3, arg1, Static640.anIntArray699, arg6, arg4, Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.method8514(), arg7, Static155.anIntArray206);
			if (local70 < 1) {
				return false;
			}
			Static78.anInt1643 = Static155.anIntArray206[local70 - 1];
			Static110.anInt2183 = Static640.anIntArray699[local70 - 1];
			Static63.aBoolean88 = false;
			Static519.method7017();
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(IJ)V")
	public static void method3687(@OriginalArg(1) long arg0) {
		@Pc(10) int local10 = Static384.anInt5666 + Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anInt9925;
		@Pc(15) int local15 = Static477.anInt7546 + Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anInt9917;
		if (Static11.anInt171 - local10 < -2000 || Static11.anInt171 - local10 > 2000 || Static27.anInt610 - local15 < -2000 || Static27.anInt610 - local15 > 2000) {
			Static11.anInt171 = local10;
			Static27.anInt610 = local15;
		}
		@Pc(72) int local72;
		@Pc(80) int local80;
		if (local10 != Static11.anInt171) {
			local72 = local10 - Static11.anInt171;
			local80 = (int) (arg0 * (long) local72 / 320L);
			if (local72 > 0) {
				if (local80 == 0) {
					local80 = 1;
				} else if (local80 > local72) {
					local80 = local72;
				}
			} else if (local80 == 0) {
				local80 = -1;
			} else if (local72 > local80) {
				local80 = local72;
			}
			Static11.anInt171 += local80;
		}
		Static275.aFloat105 += Static566.aFloat202 * (float) arg0 / 6.0F;
		Static642.aFloat230 += (float) arg0 * Static110.aFloat39 / 6.0F;
		if (Static27.anInt610 != local15) {
			local72 = local15 - Static27.anInt610;
			local80 = (int) ((long) local72 * arg0 / 320L);
			if (local72 > 0) {
				if (local80 == 0) {
					local80 = 1;
				} else if (local80 > local72) {
					local80 = local72;
				}
			} else if (local80 == 0) {
				local80 = -1;
			} else if (local72 > local80) {
				local80 = local72;
			}
			Static27.anInt610 += local80;
		}
		Static340.method4636();
	}

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(II)V")
	public static void method3690(@OriginalArg(0) int arg0) {
		@Pc(17) Class4_Sub5_Sub11 local17 = Static652.method8695((long) arg0, 14);
		local17.method3956();
	}

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(B)V")
	public static void method3691() {
		Static270.aClass352_38.method7659();
	}

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "([J[II)V")
	public static void method3692(@OriginalArg(0) long[] arg0, @OriginalArg(1) int[] arg1) {
		Static532.method7163(arg0.length - 1, arg0, arg1, 0);
	}
}
