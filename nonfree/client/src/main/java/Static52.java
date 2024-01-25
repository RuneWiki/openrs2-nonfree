import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!bl", name = "l", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_16 = new Class186(101, 3);

	@OriginalMember(owner = "client!bl", name = "d", descriptor = "I")
	public static int anInt867 = -1;

	@OriginalMember(owner = "client!bl", name = "t", descriptor = "[I")
	public static final int[] anIntArray61 = new int[2];

	@OriginalMember(owner = "client!bl", name = "p", descriptor = "I")
	public static int anInt868 = 0;

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(Z)V")
	public static void method677() {
		Static567.aClass13_3.method318();
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IC)Z")
	public static boolean method678(@OriginalArg(1) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static536.method7529(arg0)) {
			return true;
		} else {
			@Pc(26) char[] local26 = Static717.aCharArray8;
			for (@Pc(28) int local28 = 0; local28 < local26.length; local28++) {
				@Pc(36) char local36 = local26[local28];
				if (arg0 == local36) {
					return true;
				}
			}
			@Pc(57) char[] local57 = Static197.aCharArray2;
			for (@Pc(61) int local61 = 0; local61 < local57.length; local61++) {
				@Pc(69) char local69 = local57[local61];
				if (local69 == arg0) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lclient!ha;Lclient!saa;Ljava/lang/String;ZLclient!da;I)V")
	public static void method679(@OriginalArg(0) Class67 arg0, @OriginalArg(1) Class330 arg1, @OriginalArg(2) String arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class44 arg4) {
		@Pc(15) boolean local15 = !Static6.aBoolean4 || Static5.method84();
		if (!local15) {
			return;
		}
		@Pc(34) int local34;
		@Pc(43) int local43;
		if (Static6.aBoolean4 && local15) {
			@Pc(140) Class330 local140 = Static327.aClass330_6;
			@Pc(146) Class44 local146 = arg0.method7641(local140, Static690.aClass194Array3, true);
			local34 = local140.method7907(arg2, 250, (Class9[]) null);
			local43 = local140.method7909(arg2, local140.anInt9388, (Class9[]) null, 250);
			@Pc(165) int local165 = Static702.aClass194_2.anInt5596;
			@Pc(169) int local169 = local165 + 4;
			local34 += local169 * 2;
			local43 += local169 * 2;
			if (Static54.anInt9752 > local43) {
				local43 = Static54.anInt9752;
			}
			if (Static6.anInt103 > local34) {
				local34 = Static6.anInt103;
			}
			@Pc(204) int local204 = Static200.aClass304_10.method7463(local34, Static347.anInt2639) + Static201.anInt3514;
			@Pc(212) int local212 = Static417.aClass216_10.method5030(Static426.anInt7511, local43) + Static713.anInt11126;
			if (Static178.aBoolean264) {
				local204 += Static448.method6652();
				local212 += Static143.method2382();
			}
			arg0.method7659(Static713.aClass194_3, false).method8625(Static552.aClass194_1.anInt5596 + local204, Static552.aClass194_1.anInt5595 + local212, local34 - Static552.aClass194_1.anInt5596 * 2, -(Static552.aClass194_1.anInt5595 * 2) + local43, 1, 0, 0);
			arg0.method7659(Static552.aClass194_1, true).method8617(local204, local212);
			Static552.aClass194_1.method4760();
			arg0.method7659(Static552.aClass194_1, true).method8617(local34 + local204 - local165, local212);
			Static552.aClass194_1.method4763();
			arg0.method7659(Static552.aClass194_1, true).method8617(local34 + local204 - local165, local43 + local212 - local165);
			Static552.aClass194_1.method4760();
			arg0.method7659(Static552.aClass194_1, true).method8617(local204, local212 + local43 - local165);
			Static552.aClass194_1.method4763();
			arg0.method7659(Static702.aClass194_2, true).method8614(local204, local212 + Static552.aClass194_1.anInt5595, local165, local43 - Static552.aClass194_1.anInt5595 * 2);
			Static702.aClass194_2.method4752();
			arg0.method7659(Static702.aClass194_2, true).method8614(local204 + Static552.aClass194_1.anInt5596, local212, local34 - Static552.aClass194_1.anInt5596 * 2, local165);
			Static702.aClass194_2.method4752();
			arg0.method7659(Static702.aClass194_2, true).method8614(local204 + local34 - local165, local212 + Static552.aClass194_1.anInt5595, local165, local43 - Static552.aClass194_1.anInt5595 * 2);
			Static702.aClass194_2.method4752();
			arg0.method7659(Static702.aClass194_2, true).method8614(Static552.aClass194_1.anInt5596 + local204, local43 + local212 - local165, local34 - Static552.aClass194_1.anInt5596 * 2, local165);
			Static702.aClass194_2.method4752();
			local146.method8132(local169 + local212, (Class9[]) null, -1, arg2, 0, local204 + local169, local34 + -(local169 * 2), (Class1) null, (int[]) null, 1, 0, Static188.anInt3326 | 0xFF000000, 0, local43 - local169 * 2, 1);
			Static485.method6262(local204, local212, local43, local34);
		} else {
			local34 = arg1.method7907(arg2, 250, (Class9[]) null);
			local43 = arg1.method7910(arg2, 250, (Class9[]) null) * 13;
			arg0.aa(6, 6, local34 + 8, local43 + 8, -16777216, 0);
			arg0.method7700(6, 6, local34 + 8, local43 - -8, -1, 0);
			arg4.method8132(10, (Class9[]) null, -1, arg2, 0, 10, local34, (Class1) null, (int[]) null, 1, 0, -1, 0, local43, 1);
			Static485.method6262(6, 6, local43 + 4 + 4, local34 + 8);
		}
		if (!arg3) {
			return;
		}
		try {
			if (Static178.aBoolean264) {
				Static101.method1319();
			} else {
				arg0.method7676();
			}
		} catch (@Pc(463) Exception_Sub1 local463) {
		}
	}
}
