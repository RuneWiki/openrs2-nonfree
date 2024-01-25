import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static341 {

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(ZJ)V")
	public static void method5229(@OriginalArg(1) long arg0) {
		@Pc(7) int local7 = Static102.anInt1587;
		@Pc(9) int local9 = Static377.anInt6619;
		@Pc(20) int local20;
		@Pc(28) int local28;
		if (Static134.anInt2212 != local7) {
			local20 = local7 - Static134.anInt2212;
			local28 = (int) ((long) local20 * arg0 / 320L);
			if (local20 <= 0) {
				if (local28 == 0) {
					local28 = -1;
				} else if (local28 < local20) {
					local28 = local20;
				}
			} else if (local28 == 0) {
				local28 = 1;
			} else if (local28 > local20) {
				local28 = local20;
			}
			Static134.anInt2212 += local28;
		}
		Static371.aFloat65 += Static554.aFloat192 * (float) arg0 / 40.0F * 8.0F;
		Static112.aFloat22 += (float) arg0 * Static322.aFloat112 / 40.0F * 8.0F;
		if (Static319.anInt5539 != local9) {
			local20 = local9 - Static319.anInt5539;
			local28 = (int) ((long) local20 * arg0 / 320L);
			if (local20 > 0) {
				if (local28 == 0) {
					local28 = 1;
				} else if (local20 < local28) {
					local28 = local20;
				}
			} else if (local28 == 0) {
				local28 = -1;
			} else if (local28 < local20) {
				local28 = local20;
			}
			Static319.anInt5539 += local28;
		}
		Static542.method7723();
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(B)Lclient!pda;")
	public static Class5_Sub39 method5230() {
		if (Static203.aClass306_2 == null || Static39.aClass268_1 == null) {
			return null;
		}
		Static39.aClass268_1.method6391(Static203.aClass306_2);
		@Pc(23) Class5_Sub39 local23 = (Class5_Sub39) Static39.aClass268_1.method6394();
		if (local23 == null) {
			return null;
		} else {
			@Pc(33) Class72 local33 = Static203.aClass273_2.method6529(local23.anInt7217);
			return local33 != null && local33.aBoolean118 && local33.method1445(Static203.anInterface4_2) ? local23 : Static598.method8367();
		}
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(IFIIIIZI)[I")
	public static int[] method5231(@OriginalArg(1) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(18) Class5_Sub2_Sub1 local18 = new Class5_Sub2_Sub1();
		local18.anInt212 = (int) (arg0 * 4096.0F);
		local18.anInt215 = 8;
		local18.anInt214 = 35;
		local18.anInt209 = 8;
		local18.anInt210 = 4;
		local18.aBoolean8 = true;
		local18.method8819();
		Static114.method1654(1, 2048);
		local18.method228(0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(ZLclient!fs;)V")
	public static void method5232(@OriginalArg(1) Class14_Sub1_Sub1_Sub3_Sub2 arg0) {
		for (@Pc(10) Class5_Sub52 local10 = (Class5_Sub52) Static573.aClass306_59.method7313(); local10 != null; local10 = (Class5_Sub52) Static573.aClass306_59.method7301()) {
			if (local10.aClass14_Sub1_Sub1_Sub3_Sub2_2 == arg0) {
				if (local10.aClass5_Sub16_Sub2_4 != null) {
					Static287.aClass5_Sub16_Sub3_1.method6144(local10.aClass5_Sub16_Sub2_4);
					local10.aClass5_Sub16_Sub2_4 = null;
				}
				local10.method8911();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!maa", name = "b", descriptor = "(BI)Z")
	public static boolean method5233(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 2;
	}
}
