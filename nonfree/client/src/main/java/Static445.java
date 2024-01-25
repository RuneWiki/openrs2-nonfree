import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static445 {

	@OriginalMember(owner = "client!ps", name = "c", descriptor = "Z")
	public static boolean aBoolean551;

	@OriginalMember(owner = "client!ps", name = "f", descriptor = "Lclient!sba;")
	public static Class3_Sub7_Sub19 aClass3_Sub7_Sub19_30;

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(ILclient!uu;)V")
	public static void method6662(@OriginalArg(1) Class343 arg0) {
		Static332.anInt6265 = 0;
		Static502.anInt8458 = 0;
		Static76.aClass139_2 = new Class139();
		Static342.aClass9_Sub3_Sub2_Sub1Array1 = new Class9_Sub3_Sub2_Sub1[1024];
		Static438.aClass9_Sub8Array1 = new Class9_Sub8[Static435.anIntArray452[Static479.anInt7495] + 1];
		Static417.anInt7331 = 0;
		Static348.anInt6501 = 0;
		Static529.method7688(arg0);
		Static610.method8346(arg0);
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(III)V")
	public static void method6663(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = Static426.aClass93_11.method2315(Static369.aClass235_27.method5893(Static455.anInt7738));
		@Pc(49) int local49;
		@Pc(26) int local26;
		if (Static515.aBoolean645) {
			for (@Pc(66) Class3_Sub7_Sub13 local66 = (Class3_Sub7_Sub13) Static561.aClass363_53.method8414(); local66 != null; local66 = (Class3_Sub7_Sub13) Static561.aClass363_53.method8415()) {
				if (local66.anInt4660 == 1) {
					local26 = Static609.method8344((Class3_Sub7_Sub19) local66.aClass363_21.aClass3_Sub7_66.aClass3_Sub7_63);
				} else {
					local26 = Static474.method7013(local66);
				}
				if (local26 > local13) {
					local13 = local26;
				}
			}
			Static355.anInt10008 = (Static53.aBoolean52 ? 26 : 22) + Static334.anInt6266 * 16;
			local49 = Static334.anInt6266 * 16 + 21;
			local13 += 8;
		} else {
			for (@Pc(20) Class3_Sub7_Sub19 local20 = (Class3_Sub7_Sub19) Static544.aClass216_66.method5457(); local20 != null; local20 = (Class3_Sub7_Sub19) Static544.aClass216_66.method5458()) {
				local26 = Static609.method8344(local20);
				if (local26 > local13) {
					local13 = local26;
				}
			}
			local13 += 8;
			local49 = Static285.anInt7798 * 16 + 21;
			Static355.anInt10008 = (Static53.aBoolean52 ? 26 : 22) + Static285.anInt7798 * 16;
		}
		@Pc(127) int local127 = arg0 - local13 / 2;
		if (local127 + local13 > Static330.anInt6254) {
			local127 = Static330.anInt6254 - local13;
		}
		if (local127 < 0) {
			local127 = 0;
		}
		local26 = arg1;
		if (Static190.anInt3576 < arg1 + local49) {
			local26 = Static190.anInt3576 - local49;
		}
		if (local26 < 0) {
			local26 = 0;
		}
		Static491.anInt8355 = local127;
		Static415.anInt7312 = local13;
		Static253.aBoolean362 = true;
		Static388.anInt6963 = local26;
	}
}
