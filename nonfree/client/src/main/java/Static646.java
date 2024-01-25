import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static646 {

	@OriginalMember(owner = "client!wv", name = "i", descriptor = "[Lclient!tr;")
	public static Class323[] aClass323Array1;

	@OriginalMember(owner = "client!wv", name = "j", descriptor = "F")
	public static float aFloat285;

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(IIIIIB)V")
	public static void method8659(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static583.anInt9761 < arg1 || arg2 < Static246.anInt5506) {
			return;
		}
		@Pc(33) boolean local33;
		if (Static472.anInt6105 > arg3) {
			local33 = false;
			arg3 = Static472.anInt6105;
		} else if (arg3 > Static202.anInt4720) {
			arg3 = Static202.anInt4720;
			local33 = false;
		} else {
			local33 = true;
		}
		@Pc(55) boolean local55;
		if (arg4 < Static472.anInt6105) {
			arg4 = Static472.anInt6105;
			local55 = false;
		} else if (arg4 <= Static202.anInt4720) {
			local55 = true;
		} else {
			local55 = false;
			arg4 = Static202.anInt4720;
		}
		if (Static246.anInt5506 > arg1) {
			arg1 = Static246.anInt5506;
		} else {
			Static580.method8027(Static104.anIntArrayArray24[arg1++], arg4, arg3, arg0);
		}
		if (arg2 <= Static583.anInt9761) {
			Static580.method8027(Static104.anIntArrayArray24[arg2--], arg4, arg3, arg0);
		} else {
			arg2 = Static583.anInt9761;
		}
		@Pc(105) int local105;
		if (local33 && local55) {
			for (local105 = arg1; local105 <= arg2; local105++) {
				@Pc(111) int[] local111 = Static104.anIntArrayArray24[local105];
				local111[arg3] = local111[arg4] = arg0;
			}
		} else if (local33) {
			for (local105 = arg1; local105 <= arg2; local105++) {
				Static104.anIntArrayArray24[local105][arg3] = arg0;
			}
		} else if (local55) {
			for (local105 = arg1; local105 <= arg2; local105++) {
				Static104.anIntArrayArray24[local105][arg4] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(ZLclient!tba;Lclient!ha;Lclient!da;ZLjava/lang/String;)V")
	public static void method8660(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class315 arg1, @OriginalArg(2) Class33 arg2, @OriginalArg(3) Class25 arg3, @OriginalArg(5) String arg4) {
		@Pc(16) boolean local16 = !Static605.aBoolean846 || Static100.method2543();
		if (!local16) {
			return;
		}
		@Pc(38) int local38;
		@Pc(47) int local47;
		if (Static605.aBoolean846 && local16) {
			@Pc(25) Class315 local25 = Static618.aClass315_17;
			@Pc(31) Class25 local31 = arg2.method6202(local25, Static534.aClass28Array1);
			local38 = local25.method7566(null, 250, arg4);
			local47 = local25.method7569(null, arg4, 250, local25.anInt9184);
			@Pc(50) int local50 = Static125.aClass28_3.anInt618;
			@Pc(54) int local54 = local50 + 4;
			local38 += local54 * 2;
			local47 += local54 * 2;
			if (local47 < Static287.anInt5893) {
				local47 = Static287.anInt5893;
			}
			if (local38 < Static311.anInt6207) {
				local38 = Static311.anInt6207;
			}
			@Pc(84) int local84 = Static228.aClass117_7.method3782(Static199.anInt4634, local38) + Static305.anInt6115;
			@Pc(92) int local92 = Static315.aClass178_10.method5000(local47, Static523.anInt9075) + Static439.anInt7993;
			if (Static349.aBoolean590) {
				local84 += Static477.method7033();
				local92 += Static10.method114();
			}
			arg2.method6161(Static174.aClass28_2, false).method7594(Static482.aClass28_4.anInt618 + local84, Static482.aClass28_4.anInt616 + local92, local38 - Static482.aClass28_4.anInt618 * 2, -(Static482.aClass28_4.anInt616 * 2) + local47, 1, 0, 0);
			arg2.method6161(Static482.aClass28_4, true).method7577(local84, local92);
			Static482.aClass28_4.method608();
			arg2.method6161(Static482.aClass28_4, true).method7577(local84 + local38 - local50, local92);
			Static482.aClass28_4.method606();
			arg2.method6161(Static482.aClass28_4, true).method7577(local38 + local84 - local50, local47 + (local92 - local50));
			Static482.aClass28_4.method608();
			arg2.method6161(Static482.aClass28_4, true).method7577(local84, local92 + local47 - local50);
			Static482.aClass28_4.method606();
			arg2.method6161(Static125.aClass28_3, true).method7598(local84, Static482.aClass28_4.anInt616 + local92, local50, local47 - Static482.aClass28_4.anInt616 * 2);
			Static125.aClass28_3.method615();
			arg2.method6161(Static125.aClass28_3, true).method7598(local84 + Static482.aClass28_4.anInt618, local92, local38 - Static482.aClass28_4.anInt618 * 2, local50);
			Static125.aClass28_3.method615();
			arg2.method6161(Static125.aClass28_3, true).method7598(local38 + local84 - local50, local92 - -Static482.aClass28_4.anInt616, local50, local47 - Static482.aClass28_4.anInt616 * 2);
			Static125.aClass28_3.method615();
			arg2.method6161(Static125.aClass28_3, true).method7598(local84 + Static482.aClass28_4.anInt618, -local50 + local47 + local92, local38 - Static482.aClass28_4.anInt618 * 2, local50);
			Static125.aClass28_3.method615();
			local31.method5857(local54 + local84, local38 + -(local54 * 2), 0, -1, null, local47 - local54 * 2, Static618.anInt10217 | 0xFF000000, arg4, null, 1, null, local92 + local54, 1, 0, 0);
			Static251.method4761(local38, local92, local47, local84);
		} else {
			local38 = arg1.method7566(null, 250, arg4);
			local47 = arg1.method7568(250, arg4, null) * 13;
			arg2.aa(6, 6, local38 + 4 + 4, local47 - -8, -16777216, 0);
			arg2.method6174(6, 6, local38 + 4 + 4, local47 + 4 + 4, -1, 0);
			arg3.method5857(10, local38, 0, -1, null, local47, -1, arg4, null, 1, null, 10, 1, 0, 0);
			Static251.method4761(local38 + 4 + 4, 6, local47 + 4 + 4, 6);
		}
		if (!arg0) {
			return;
		}
		try {
			if (Static349.aBoolean590) {
				Static410.method6440();
			} else {
				arg2.method6170();
			}
		} catch (@Pc(446) Exception_Sub1 local446) {
		}
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(FI)F")
	public static float method8661(@OriginalArg(0) float arg0) {
		return arg0 * arg0 * arg0 * ((arg0 * 6.0F - 15.0F) * arg0 + 10.0F);
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(Ljava/lang/String;ZLjava/io/File;)V")
	public static void method8662(@OriginalArg(0) String arg0, @OriginalArg(2) File arg1) {
		Static173.aHashtable13.put(arg0, arg1);
	}
}
