import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!an", name = "ed", descriptor = "Lclient!aj;")
	public static final Class10 aClass10_3 = new Class10(50);

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IILjava/lang/String;)Z")
	public static boolean method419(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		if (Static409.aClass221_6.aBoolean485) {
			Static583.aClass65_5 = new Class65();
			Static583.aClass65_5.anInt2279 = arg0;
			Static583.aClass65_5.aString31 = arg1;
			if (Static559.aClass173_9 != Static555.aClass173_8) {
				Static583.aClass65_5.anInt2274 = Static583.aClass65_5.anInt2279 + 40000;
				Static583.aClass65_5.anInt2278 = Static583.aClass65_5.anInt2279 + 50000;
			}
			if (Static338.aClass133_Sub1Array2.length > arg0 && Static338.aClass133_Sub1Array2[arg0] != null) {
				Static541.anInt8510 = Static338.aClass133_Sub1Array2[arg0].anInt4097;
			}
			return true;
		}
		@Pc(48) String local48 = "";
		if (Static555.aClass173_8 != Static559.aClass173_9) {
			local48 = ":" + (arg0 + 7000);
		}
		@Pc(63) String local63 = "";
		if (Static502.aString109 != null) {
			local63 = "/p=" + Static502.aString109;
		}
		@Pc(116) String local116 = "http://" + arg1 + local48 + "/l=" + Static131.anInt2839 + "/a=" + Static350.anInt8128 + local63 + "/j" + (Static437.aBoolean572 ? "1" : "0") + ",o" + (Static464.aBoolean600 ? "1" : "0") + ",a2";
		try {
			Static478.aClient1.getAppletContext().showDocument(new URL(local116), "_self");
			return true;
		} catch (@Pc(126) Exception local126) {
			return false;
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IIIZLjava/lang/String;ZLjava/lang/String;)V")
	public static void method421(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) String arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) String arg5) {
		Static329.aClass246_162.anInt6627 = 1;
		@Pc(11) String local11 = arg3.toLowerCase();
		@Pc(14) short[] local14 = new short[16];
		@Pc(16) int local16 = -1;
		@Pc(18) String local18 = null;
		if (arg1 != -1) {
			@Pc(26) Class14 local26 = Static69.aClass118_1.method3019(arg1);
			if (local26 == null || arg2 != local26.method434()) {
				return;
			}
			if (local26.method434()) {
				local18 = local26.aString14;
			} else {
				local16 = local26.anInt534;
			}
		}
		@Pc(47) int local47 = 0;
		for (@Pc(49) int local49 = 0; local49 < Static517.aClass145_1.anInt4294; local49++) {
			@Pc(56) Class339 local56 = Static517.aClass145_1.method3798(local49);
			if ((!arg4 || local56.aBoolean693) && local56.anInt8830 == -1 && local56.anInt8821 == -1 && local56.anInt8810 == 0 && local56.aString120.toLowerCase().indexOf(local11) != -1) {
				if (arg1 != -1) {
					if (arg2) {
						if (!arg5.equals(local56.method7310(local18, arg1))) {
							continue;
						}
					} else if (arg0 != local56.method7305(local16, arg1)) {
						continue;
					}
				}
				if (local47 >= 250) {
					Static251.aShortArray108 = null;
					Static586.anInt9337 = -1;
					return;
				}
				if (local47 >= local14.length) {
					@Pc(130) short[] local130 = new short[local14.length * 2];
					for (@Pc(132) int local132 = 0; local132 < local47; local132++) {
						local130[local132] = local14[local132];
					}
					local14 = local130;
				}
				local14[local47++] = (short) local49;
			}
		}
		Static71.anInt1939 = 0;
		Static586.anInt9337 = local47;
		Static251.aShortArray108 = local14;
		@Pc(170) String[] local170 = new String[Static586.anInt9337];
		for (@Pc(172) int local172 = 0; local172 < Static586.anInt9337; local172++) {
			local170[local172] = Static517.aClass145_1.method3798(local14[local172]).aString120;
		}
		Static59.method4459(local170, Static251.aShortArray108);
		Static329.aClass246_162.method5662();
		Static329.aClass246_162.anInt6627 = 2;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Lclient!r;IIIII)V")
	public static void method424(@OriginalArg(0) Class43 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		arg0.da(arg2, arg3, arg2 + arg4, arg3 - -arg1);
		arg0.method7185(arg3, arg1, arg4, arg2, -16777216);
		if (Static277.anInt5091 < 100) {
			return;
		}
		@Pc(36) float local36 = (float) Static284.anInt7855 / (float) Static284.anInt7858;
		@Pc(38) int local38 = arg4;
		@Pc(40) int local40 = arg1;
		if (local36 < 1.0F) {
			local40 = (int) (local36 * (float) arg4);
		} else {
			local38 = (int) ((float) arg1 / local36);
		}
		@Pc(67) int local67 = arg3 + (arg1 - local40) / 2;
		@Pc(75) int local75 = arg2 + (arg4 - local38) / 2;
		if (Static454.aClass46_28 == null || arg4 != Static454.aClass46_28.E() || arg1 != Static454.aClass46_28.u()) {
			Static284.method6645(Static284.anInt7863, Static284.anInt7855 + Static284.anInt7865, Static284.anInt7858 + Static284.anInt7863, Static284.anInt7865, local75, local67, local75 + local38, local67 + local40);
			Static284.method6644(arg0);
			Static454.aClass46_28 = arg0.method7184(local75, local67, local38, local40, false);
		}
		Static454.aClass46_28.method7606(local75, local67);
		@Pc(127) int local127 = local38 * Static592.anInt9396 / Static284.anInt7858;
		@Pc(133) int local133 = local40 * Static474.anInt7706 / Static284.anInt7855;
		@Pc(141) int local141 = local75 + Static430.anInt7144 * local38 / Static284.anInt7858;
		@Pc(154) int local154 = local67 + local40 - local40 * Static483.anInt7807 / Static284.anInt7855 - local133;
		@Pc(156) int local156 = -1996554240;
		if (Static560.aClass211_4 == Static227.aClass211_1) {
			local156 = -1996488705;
		}
		arg0.J(local141, local154, local127, local133, local156, 1);
		arg0.method7170(local141, local154, local127, local133, local156, 0);
		if (Static440.anInt4098 <= 0) {
			return;
		}
		@Pc(193) int local193;
		if (Static474.anInt7705 <= 50) {
			local193 = Static474.anInt7705 * 5;
		} else {
			local193 = (100 - Static474.anInt7705) * 5;
		}
		for (@Pc(206) Class3_Sub41 local206 = (Class3_Sub41) Static284.aClass130_49.method3543(); local206 != null; local206 = (Class3_Sub41) Static284.aClass130_49.method3551()) {
			@Pc(214) Class40 local214 = Static284.aClass168_4.method4062(local206.anInt7163);
			if (Static10.method121(local214)) {
				@Pc(239) int local239;
				@Pc(252) int local252;
				if (local206.anInt7163 == Static112.anInt2609) {
					local239 = local38 * local206.anInt7165 / Static284.anInt7858 + local75;
					local252 = local67 + local40 * (Static284.anInt7855 - local206.anInt7161) / Static284.anInt7855;
					arg0.method7185(local252 - 2, 4, 4, local239 - 2, local193 << 24 | 0xFFFF00);
				} else if (Static412.anInt6932 != -1 && Static412.anInt6932 == local214.anInt1395) {
					local239 = local75 + local206.anInt7165 * local38 / Static284.anInt7858;
					local252 = local67 + local40 * (Static284.anInt7855 - local206.anInt7161) / Static284.anInt7855;
					arg0.method7185(local252 - 2, 4, 4, local239 - 2, local193 << 24 | 0xFFFF00);
				}
			}
		}
	}
}
