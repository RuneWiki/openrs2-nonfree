import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!mm", name = "m", descriptor = "I")
	public static int anInt4721;

	@OriginalMember(owner = "client!mm", name = "w", descriptor = "Lclient!sv;")
	public static Class3_Sub5_Sub4 aClass3_Sub5_Sub4_1;

	@OriginalMember(owner = "client!mm", name = "A", descriptor = "I")
	public static int anInt4729;

	@OriginalMember(owner = "client!mm", name = "B", descriptor = "I")
	public static int anInt4730;

	@OriginalMember(owner = "client!mm", name = "c", descriptor = "Lclient!df;")
	public static final Class48 aClass48_1 = new Class48();

	@OriginalMember(owner = "client!mm", name = "y", descriptor = "Lclient!oi;")
	public static final Class175 aClass175_159 = new Class175("M", "M", "M", "M");

	@OriginalMember(owner = "client!mm", name = "D", descriptor = "[I")
	public static final int[] anIntArray365 = new int[5];

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)V")
	public static void method3833() {
		if (Static441.anIntArray571 != null && Static21.anIntArray46 != null) {
			return;
		}
		Static441.anIntArray571 = new int[256];
		Static21.anIntArray46 = new int[256];
		for (@Pc(17) int local17 = 0; local17 < 256; local17++) {
			@Pc(26) double local26 = (double) local17 / 255.0D * 6.283185307179586D;
			Static441.anIntArray571[local17] = (int) (Math.sin(local26) * 4096.0D);
			Static21.anIntArray46[local17] = (int) (Math.cos(local26) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(ILclient!qv;IIII)V")
	public static void method3837(@OriginalArg(1) Class3_Sub36 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0.anInt6176 == -1 && arg0.anIntArray455 == null) {
			return;
		}
		@Pc(13) int local13 = 0;
		if (arg2 > arg0.anInt6165) {
			local13 = arg2 - arg0.anInt6165;
		} else if (arg0.anInt6171 > arg2) {
			local13 = arg0.anInt6171 - arg2;
		}
		@Pc(53) int local53 = Static123.aClass21_Sub1_1.anInt863 * arg0.anInt6166 >> 8;
		if (arg0.anInt6172 < arg1) {
			local13 += arg1 - arg0.anInt6172;
		} else if (arg0.anInt6180 > arg1) {
			local13 += arg0.anInt6180 - arg1;
		}
		if (arg0.anInt6169 == 0 || local13 - 64 > arg0.anInt6169 || Static123.aClass21_Sub1_1.anInt863 == 0 || arg4 != arg0.anInt6170) {
			if (arg0.aClass3_Sub5_Sub3_3 != null) {
				aClass3_Sub5_Sub4_1.method5196(arg0.aClass3_Sub5_Sub3_3);
				arg0.aClass3_Sub5_Sub3_3 = null;
			}
			if (arg0.aClass3_Sub5_Sub3_4 != null) {
				aClass3_Sub5_Sub4_1.method5196(arg0.aClass3_Sub5_Sub3_4);
				arg0.aClass3_Sub5_Sub3_4 = null;
			}
			return;
		}
		local13 -= 64;
		if (local13 < 0) {
			local13 = 0;
		}
		@Pc(145) int local145 = local53 * (arg0.anInt6169 - local13) / arg0.anInt6169;
		if (arg0.aClass3_Sub5_Sub3_3 != null) {
			arg0.aClass3_Sub5_Sub3_3.method4356(local145);
		} else if (arg0.anInt6176 >= 0) {
			@Pc(157) Class136 local157 = Static458.method3436(Static95.aClass56_23, arg0.anInt6176, 0);
			if (local157 != null) {
				@Pc(164) Class3_Sub13_Sub1 local164 = local157.method3437().method1496(Static19.aClass199_1);
				@Pc(169) Class3_Sub5_Sub3 local169 = Static461.method4330(local164, local145);
				local169.method4360(-1);
				aClass3_Sub5_Sub4_1.method5197(local169);
				arg0.aClass3_Sub5_Sub3_3 = local169;
			}
		}
		if (arg0.aClass3_Sub5_Sub3_4 != null) {
			arg0.aClass3_Sub5_Sub3_4.method4356(local145);
			if (!arg0.aClass3_Sub5_Sub3_4.method5985()) {
				arg0.aClass3_Sub5_Sub3_4 = null;
			}
		} else if (arg0.anIntArray455 != null && (arg0.anInt6167 -= arg3) <= 0) {
			@Pc(218) int local218 = (int) (Math.random() * (double) arg0.anIntArray455.length);
			@Pc(226) Class136 local226 = Static458.method3436(Static95.aClass56_23, arg0.anIntArray455[local218], 0);
			if (local226 != null) {
				@Pc(233) Class3_Sub13_Sub1 local233 = local226.method3437().method1496(Static19.aClass199_1);
				@Pc(238) Class3_Sub5_Sub3 local238 = Static461.method4330(local233, local145);
				local238.method4360(0);
				aClass3_Sub5_Sub4_1.method5197(local238);
				arg0.aClass3_Sub5_Sub3_4 = local238;
				arg0.anInt6167 = arg0.anInt6178 + (int) ((double) (arg0.anInt6179 - arg0.anInt6178) * Math.random());
				return;
			}
		}
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(BI)Z")
	public static boolean method3840(@OriginalArg(1) int arg0) {
		@Pc(17) Class145_Sub1 local17 = Static318.method2568(arg0);
		if (local17 == null) {
			return false;
		} else if (Static162.anInt3462 == 3) {
			@Pc(47) String local47 = "";
			if (Static356.aClass238_6 != Static411.aClass238_7) {
				local47 = ":" + (local17.anInt4487 + 7000);
			}
			@Pc(63) String local63 = "";
			if (Static16.aString3 != null) {
				local63 = "/p=" + Static16.aString3;
			}
			@Pc(112) String local112 = "http://" + local17.aString44 + local47 + "/l=" + Static216.anInt4257 + "/a=" + Static448.anInt7558 + local63 + "/j" + (Static260.aBoolean490 ? "1" : "0") + ",o" + (Static97.aBoolean165 ? "1" : "0") + ",a2";
			try {
				Static107.aClient1.getAppletContext().showDocument(new URL(local112), "_self");
				return true;
			} catch (@Pc(122) Exception local122) {
				return false;
			}
		} else {
			Static379.anInt2076 = local17.anInt4487;
			Static324.aString2 = local17.aString44;
			if (Static411.aClass238_7 != Static356.aClass238_6) {
				Static324.anInt423 = Static379.anInt2076 + 50000;
				Static14.anInt470 = Static379.anInt2076 + 40000;
				Static178.anInt3626 = Static14.anInt470;
			}
			return true;
		}
	}
}
