import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static425 {

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString72 = null;

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)V")
	public static void method6175() {
		@Pc(9) int[] local9 = new int[Static543.aClass37_2.anInt613];
		@Pc(11) int local11 = 0;
		for (@Pc(21) int local21 = 0; local21 < Static543.aClass37_2.anInt613; local21++) {
			@Pc(28) Class203 local28 = Static543.aClass37_2.method605(local21);
			if (local28.anInt4899 >= 0 || local28.anInt4879 >= 0) {
				local9[local11++] = local21;
			}
		}
		Static585.anIntArray673 = new int[local11];
		for (@Pc(57) int local57 = 0; local57 < local11; local57++) {
			Static585.anIntArray673[local57] = local9[local57];
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILclient!oh;I)Ljava/lang/String;")
	public static String method6176(@OriginalArg(0) int arg0, @OriginalArg(1) Class273 arg1) {
		if (!Static91.method1412(arg1).method3016(arg0) && arg1.anObjectArray15 == null) {
			return null;
		} else if (arg1.aStringArray32 == null || arg0 >= arg1.aStringArray32.length || arg1.aStringArray32[arg0] == null || arg1.aStringArray32[arg0].trim().length() == 0) {
			return Static311.aBoolean411 ? "Hidden-" + arg0 : null;
		} else {
			return arg1.aStringArray32[arg0];
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "([Ljava/lang/String;I)V")
	public static void method6178(@OriginalArg(0) String[] arg0) {
		if (arg0.length <= 1) {
			Static570.aString99 = Static570.aString99 + arg0[0];
			Static135.anInt2247 += arg0[0].length();
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < arg0.length; local15++) {
			if (arg0[local15].startsWith("pause")) {
				@Pc(40) int local40 = 5;
				try {
					local40 = Integer.parseInt(arg0[local15].substring(6));
				} catch (@Pc(49) Exception local49) {
				}
				Static180.method5442("Pausing for " + local40 + " seconds...");
				Static149.aStringArray12 = arg0;
				Static509.anInt8051 = local15 + 1;
				Static277.aLong144 = (long) (local40 * 1000) + Static567.method7863();
				return;
			}
			Static570.aString99 = arg0[local15];
			Static291.method4103(false);
		}
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)V")
	public static void method6179() {
		Static640.anInt9835 = -1;
		Static215.aClass2_Sub20_4 = null;
		Static515.anIntArrayArray53 = null;
		Static166.anInt2884 = 0;
		Static718.anInt10954 = 0;
		Static711.anInt10853 = 0;
		Static124.method1845();
		Static663.anInt9247 = 0;
		Static243.anInt3820 = 0;
		Static719.anInt10965 = 0;
		Static224.anInt11062 = 0;
		for (@Pc(38) int local38 = 0; local38 < Static690.aClass350Array1.length; local38++) {
			Static690.aClass350Array1[local38] = null;
		}
		Static518.method7347();
		for (@Pc(55) int local55 = 0; local55 < 2048; local55++) {
			Static157.aClass4_Sub2_Sub1_Sub2_Sub1Array1[local55] = null;
		}
		Static217.anInt3445 = 0;
		Static467.aClass218_37.method5097();
		Static676.anInt10488 = 0;
		Static596.aClass218_41.method5097();
		Static500.method7131();
		Static84.anInt1420 = 0;
		Static396.aClass107_1.method2268();
		Static33.aClass2_Sub25_1 = null;
		Static195.aLong110 = 0L;
		Static91.aClass394_3 = null;
		Static276.aClass394_7 = null;
		Static205.aClass2_Sub43_2 = null;
		Static176.aClass2_Sub43_1 = null;
	}
}
