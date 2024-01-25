import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static237 {

	@OriginalMember(owner = "client!iia", name = "i", descriptor = "Z")
	public static boolean aBoolean328;

	@OriginalMember(owner = "client!iia", name = "j", descriptor = "I")
	public static int anInt4007;

	@OriginalMember(owner = "client!iia", name = "q", descriptor = "I")
	public static int anInt4011;

	@OriginalMember(owner = "client!iia", name = "k", descriptor = "Lclient!kaa;")
	public static final Class181 aClass181_38 = new Class181(32, 3);

	@OriginalMember(owner = "client!iia", name = "r", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray18 = new String[200];

	@OriginalMember(owner = "client!iia", name = "s", descriptor = "I")
	public static int anInt4012 = 0;

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(III)Lclient!cj;")
	public static Class14_Sub1_Sub2 method3640(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class156 local7 = Static535.aClass156ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass14_Sub1_Sub2_2;
	}

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(Lclient!rc;Lclient!da;Lclient!ha;BZLjava/lang/String;)V")
	public static void method3641(@OriginalArg(0) Class298 arg0, @OriginalArg(1) Class6 arg1, @OriginalArg(2) Class126 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) String arg4) {
		@Pc(12) boolean local12 = !Static56.aBoolean65 || Static422.method6377();
		if (!local12) {
			return;
		}
		@Pc(26) int local26;
		@Pc(35) int local35;
		if (Static56.aBoolean65 && local12) {
			@Pc(139) Class298 local139 = Static26.aClass298_3;
			@Pc(145) Class6 local145 = arg2.method7000(local139, Static64.aClass176Array1);
			local26 = local139.method6967(arg4, (Class44[]) null, 250);
			local35 = local139.method6962(arg4, 250, (Class44[]) null, local139.anInt8038);
			@Pc(166) int local166 = Static544.aClass176_2.anInt4437;
			@Pc(170) int local170 = local166 + 4;
			local26 += local170 * 2;
			local35 += local170 * 2;
			if (Static495.anInt4811 > local26) {
				local26 = Static495.anInt4811;
			}
			if (Static128.anInt2082 > local35) {
				local35 = Static128.anInt2082;
			}
			@Pc(208) int local208 = Static123.aClass204_2.method4964(local26, Static519.anInt7022) + Static414.anInt7096;
			@Pc(217) int local217 = Static443.aClass288_12.method6878(Static363.anInt6413, local35) + Static164.anInt5714;
			if (Static144.aBoolean196) {
				local208 += Static577.method8147();
				local217 += Static601.method8395();
			}
			arg2.method6994(Static517.aClass176_1, false).method5324(Static599.aClass176_3.anInt4437 + local208, local217 - -Static599.aClass176_3.anInt4438, local26 - Static599.aClass176_3.anInt4437 * 2, local35 + -(Static599.aClass176_3.anInt4438 * 2), 1, 0, 0);
			arg2.method6994(Static599.aClass176_3, true).method5312(local208, local217);
			Static599.aClass176_3.method4056();
			arg2.method6994(Static599.aClass176_3, true).method5312(local26 + local208 - local166, local217);
			Static599.aClass176_3.method4045();
			arg2.method6994(Static599.aClass176_3, true).method5312(local26 + local208 - local166, -local166 + local35 + local217);
			Static599.aClass176_3.method4056();
			arg2.method6994(Static599.aClass176_3, true).method5312(local208, local217 + local35 - local166);
			Static599.aClass176_3.method4045();
			arg2.method6994(Static544.aClass176_2, true).method5326(local208, Static599.aClass176_3.anInt4438 + local217, local166, local35 - Static599.aClass176_3.anInt4438 * 2);
			Static544.aClass176_2.method4050();
			arg2.method6994(Static544.aClass176_2, true).method5326(local208 + Static599.aClass176_3.anInt4437, local217, local26 - Static599.aClass176_3.anInt4437 * 2, local166);
			Static544.aClass176_2.method4050();
			arg2.method6994(Static544.aClass176_2, true).method5326(local26 + local208 - local166, Static599.aClass176_3.anInt4438 + local217, local166, local35 - Static599.aClass176_3.anInt4438 * 2);
			Static544.aClass176_2.method4050();
			arg2.method6994(Static544.aClass176_2, true).method5326(local208 + Static599.aClass176_3.anInt4437, local217 - -local35 + -local166, local26 - Static599.aClass176_3.anInt4437 * 2, local166);
			Static544.aClass176_2.method4050();
			local145.method7215(local217 + local170, 1, (Class1) null, arg4, 0, (int[]) null, Static308.anInt4874 | 0xFF000000, local170 + local208, -(local170 * 2) + local35, -1, 0, (Class44[]) null, 0, 1, local26 - local170 * 2);
			Static55.method867(local35, local208, local217, local26);
		} else {
			local26 = arg0.method6967(arg4, (Class44[]) null, 250);
			local35 = arg0.method6963(arg4, (Class44[]) null, 250) * 13;
			arg2.aa(6, 6, local26 + 4 + 4, local35 - -4 + 4, -16777216, 0);
			arg2.method7021(6, 6, local26 + 8, local35 - -4 + 4, -1, 0);
			arg1.method7215(10, 1, (Class1) null, arg4, 0, (int[]) null, -1, 10, local35, -1, 0, (Class44[]) null, 0, 1, local26);
			Static55.method867(local35 + 4 + 4, 6, 6, local26 + 8);
		}
		if (!arg3) {
			return;
		}
		try {
			if (Static144.aBoolean196) {
				Static418.method6362();
			} else {
				arg2.method7050();
			}
		} catch (@Pc(464) Exception_Sub1 local464) {
		}
	}

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(II)V")
	public static void method3642(@OriginalArg(1) int arg0) {
		Static17.anInt400 = arg0;
		@Pc(7) Class293 local7 = Static580.aClass293_75;
		synchronized (Static580.aClass293_75) {
			Static580.aClass293_75.method6930();
		}
	}
}
