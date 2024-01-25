import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static389 {

	@OriginalMember(owner = "client!pu", name = "w", descriptor = "I")
	public static int anInt7391;

	@OriginalMember(owner = "client!pu", name = "n", descriptor = "Lclient!h;")
	public static final Class125 aClass125_52 = new Class125(10);

	@OriginalMember(owner = "client!pu", name = "u", descriptor = "[[I")
	public static final int[][] anIntArrayArray65 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!pu", name = "v", descriptor = "[I")
	public static final int[] anIntArray490 = new int[13];

	@OriginalMember(owner = "client!pu", name = "y", descriptor = "Z")
	public static boolean aBoolean533 = false;

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(IILjava/lang/String;)Z")
	public static boolean method6144(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		if (Static92.anInt2161 != 3) {
			Static222.aClass247_1 = new Class247();
			Static222.aClass247_1.anInt7426 = arg0;
			Static222.aClass247_1.aString85 = arg1;
			if (Static79.aClass285_2 != Static171.aClass285_4) {
				Static222.aClass247_1.anInt7427 = Static222.aClass247_1.anInt7426 + 40000;
				Static222.aClass247_1.anInt7429 = Static222.aClass247_1.anInt7426 + 50000;
			}
			if (Static197.aClass23_Sub1Array1.length > arg0 && Static197.aClass23_Sub1Array1[arg0] != null) {
				Static66.anInt1516 = Static197.aClass23_Sub1Array1[arg0].anInt5192;
			}
			return true;
		}
		@Pc(48) String local48 = "";
		if (Static171.aClass285_4 != Static79.aClass285_2) {
			local48 = ":" + (arg0 + 7000);
		}
		@Pc(68) String local68 = "";
		if (Static366.aString103 != null) {
			local68 = "/p=" + Static366.aString103;
		}
		@Pc(116) String local116 = "http://" + arg1 + local48 + "/l=" + Static345.anInt6495 + "/a=" + Static423.anInt79 + local68 + "/j" + (Static48.aBoolean51 ? "1" : "0") + ",o" + (Static55.aBoolean100 ? "1" : "0") + ",a2";
		try {
			Static314.aClient1.getAppletContext().showDocument(new URL(local116), "_self");
			return true;
		} catch (@Pc(126) Exception local126) {
			return false;
		}
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(IIIII)V")
	public static void method6145(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 <= arg1) {
			Static118.method2461(Static228.anIntArrayArray46[arg3], arg1, arg2, arg0);
		} else {
			Static118.method2461(Static228.anIntArrayArray46[arg3], arg0, arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(III)Z")
	public static boolean method6146(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(ILclient!qa;Lclient!j;Lclient!du;)V")
	public static void method6149(@OriginalArg(1) Class42 arg0, @OriginalArg(2) Class152 arg1, @OriginalArg(3) Class12_Sub12 arg2) {
		@Pc(12) Class84 local12 = arg1.method4028(arg0);
		if (local12 == null) {
			return;
		}
		@Pc(18) int local18 = local12.c();
		if (local18 < local12.la()) {
			local18 = local12.la();
		}
		@Pc(34) int local34 = arg2.anInt2335;
		@Pc(37) int local37 = arg2.anInt2329;
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = 0;
		@Pc(59) int local59;
		@Pc(82) int local82;
		if (arg1.aString44 != null) {
			local39 = Static186.aClass244_3.method6158(Static141.aStringArray18, null, arg1.aString44, null);
			for (local59 = 0; local59 < local39; local59++) {
				@Pc(65) String local65 = Static141.aStringArray18[local59];
				if (local39 - 1 > local59) {
					local65 = local65.substring(0, local65.length() - 4);
				}
				local82 = Static88.aClass17_5.method421(local65);
				if (local41 < local82) {
					local41 = local82;
				}
			}
			local43 = local39 * Static88.aClass17_5.method423() + Static88.aClass17_5.method426() / 2;
		}
		local59 = arg2.anInt2335 + local18 / 2;
		@Pc(116) int local116 = arg2.anInt2329;
		if (local34 < Static2.anInt5919 + local18) {
			local59 = local41 / 2 + Static2.anInt5919 + local18 / 2 + 10 + 5;
			local34 = Static2.anInt5919;
		} else if (local34 > Static2.anInt5922 - local18) {
			local59 = Static2.anInt5922 - local41 / 2 - local18 / 2 - 10 - 5;
			local34 = Static2.anInt5922 - local18;
		}
		if (local37 < local18 + Static2.anInt5912) {
			local116 = Static2.anInt5912 + local18 / 2 + 10;
			local37 = Static2.anInt5912;
		} else if (Static2.anInt5915 - local18 < local37) {
			local116 = Static2.anInt5915 - local18 / 2 - local43 - 10;
			local37 = Static2.anInt5915 - local18;
		}
		local82 = (int) (Math.atan2((double) (local34 - arg2.anInt2335), (double) (local37 - arg2.anInt2329)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local12.method7491((float) local34 + (float) local18 / 2.0F, (float) local18 / 2.0F + (float) local37, 4096, local82);
		@Pc(263) int local263 = -2;
		@Pc(265) int local265 = -2;
		@Pc(267) int local267 = -2;
		@Pc(269) int local269 = -2;
		if (arg1.aString44 != null) {
			local265 = local116;
			local263 = local59 - local41 / 2 - 5;
			local267 = local263 + local41 + 10;
			local269 = local39 * Static88.aClass17_5.method423() + local116 + 3;
			if (arg1.anInt4733 != 0) {
				arg0.method5866(local116, local267 - local263, local269 + -local116, arg1.anInt4733, local263);
			}
			if (arg1.anInt4749 != 0) {
				arg0.method5811(arg1.anInt4749, local267 - local263, local269 - local116, local263, local116);
			}
			for (@Pc(339) int local339 = 0; local339 < local39; local339++) {
				@Pc(345) String local345 = Static141.aStringArray18[local339];
				if (local39 - 1 > local339) {
					local345 = local345.substring(0, local345.length() - 4);
				}
				Static88.aClass17_5.method427(arg0, local345, local59, local116, arg1.anInt4730);
				local116 += Static88.aClass17_5.method423();
			}
		}
		if (arg1.anInt4736 == -1 && arg1.aString44 == null) {
			return;
		}
		@Pc(396) Class12_Sub2 local396 = new Class12_Sub2(arg2);
		local18 >>= 0x1;
		local396.anInt262 = local263;
		local396.anInt261 = local34 + local18;
		local396.anInt257 = local18 + local37;
		local396.anInt260 = local267;
		local396.anInt265 = local265;
		local396.anInt264 = local34 - local18;
		local396.anInt259 = local269;
		local396.anInt263 = local37 - local18;
		Static284.aClass73_46.method2012(local396);
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(IBI)Z")
	public static boolean method6153(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!pu", name = "b", descriptor = "(III)Lclient!bk;")
	public static Class12_Sub4_Sub1 method6156(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(17) Class12_Sub4_Sub1 local17 = (Class12_Sub4_Sub1) Static194.aClass68_32.method1917((long) arg0 << 32 | (long) arg1);
		if (local17 == null) {
			local17 = new Class12_Sub4_Sub1(arg0, arg1);
			Static194.aClass68_32.method1916(local17, local17.aLong248);
		}
		return local17;
	}
}
