import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!kb", name = "K", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1200 = Static170.method3101("null");

	@OriginalMember(owner = "client!kb", name = "L", descriptor = "[Lclient!pd;")
	public static Class64[] aClass64Array11 = new Class64[50];

	@OriginalMember(owner = "client!kb", name = "M", descriptor = "I")
	public static int anInt3606 = 0;

	@OriginalMember(owner = "client!kb", name = "R", descriptor = "I")
	public static int anInt3610 = 0;

	@OriginalMember(owner = "client!kb", name = "S", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1201 = Static170.method3101("m");

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!ah;Lclient!ah;ZB)V")
	public static void method2757(@OriginalArg(0) Class7 arg0, @OriginalArg(1) Class7 arg1, @OriginalArg(2) boolean arg2) {
		Static75.aBoolean118 = arg2;
		Static78.aClass7_35 = arg1;
		Static146.aClass7_61 = arg0;
	}

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "(I)V")
	public static void method2758() {
		aClass28_1200 = null;
		aClass64Array11 = null;
		aClass28_1201 = null;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZII)I")
	public static int method2759(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = arg0 >> 31 & arg1 - 1;
		return local11 + (arg0 + (arg0 >>> 31)) % arg1;
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(III)J")
	public static long method2760(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class3_Sub20 local7 = Static149.aClass3_Sub20ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass25_1 == null ? 0L : local7.aClass25_1.aLong36;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILclient!ah;Lclient!ah;Ljava/awt/Component;)V")
	public static void method2762(@OriginalArg(1) Class7 arg0, @OriginalArg(2) Class7 arg1, @OriginalArg(3) Component arg2) {
		if (Static24.aBoolean41) {
			return;
		}
		Static147.method1776();
		@Pc(13) byte[] local13 = arg1.method1032(Static140.aClass28_1184, Static33.aClass28_341);
		Static60.aClass3_Sub2_Sub2_Sub4_4 = new Class3_Sub2_Sub2_Sub4(local13, arg2);
		Static15.aClass3_Sub2_Sub2_Sub4_3 = Static60.aClass3_Sub2_Sub2_Sub4_4.method995();
		Static119.aClass3_Sub2_Sub2_Sub3_2 = Static154.method2921(Static140.aClass28_1184, Static2.aClass28_25, arg0);
		Static55.aClass3_Sub2_Sub2_Sub3_1 = Static154.method2921(Static140.aClass28_1184, Static122.aClass28_1037, arg0);
		Static156.aClass3_Sub2_Sub2_Sub3_3 = Static154.method2921(Static140.aClass28_1184, Static114.aClass28_943, arg0);
		Static32.aClass3_Sub2_Sub2_Sub3Array2 = Static58.method1528(Static140.aClass28_1184, arg0, Static128.aClass28_1076);
		Static173.aClass3_Sub2_Sub2_Sub3Array10 = Static58.method1528(Static140.aClass28_1184, arg0, Static78.aClass28_729);
		Static149.anIntArray625 = new int[256];
		for (@Pc(57) int local57 = 0; local57 < 64; local57++) {
			Static149.anIntArray625[local57] = local57 * 262144;
		}
		for (@Pc(70) int local70 = 0; local70 < 64; local70++) {
			Static149.anIntArray625[local70 + 64] = local70 * 1024 + 16711680;
		}
		for (@Pc(89) int local89 = 0; local89 < 64; local89++) {
			Static149.anIntArray625[local89 + 128] = local89 * 4 + 16776960;
		}
		for (@Pc(108) int local108 = 0; local108 < 64; local108++) {
			Static149.anIntArray625[local108 + 192] = 16777215;
		}
		Static52.anIntArray254 = new int[256];
		for (@Pc(126) int local126 = 0; local126 < 64; local126++) {
			Static52.anIntArray254[local126] = local126 * 1024;
		}
		for (@Pc(139) int local139 = 0; local139 < 64; local139++) {
			Static52.anIntArray254[local139 + 64] = local139 * 4 + 65280;
		}
		for (@Pc(158) int local158 = 0; local158 < 64; local158++) {
			Static52.anIntArray254[local158 + 128] = local158 * 262144 + 65535;
		}
		for (@Pc(177) int local177 = 0; local177 < 64; local177++) {
			Static52.anIntArray254[local177 + 192] = 16777215;
		}
		Static74.anIntArray363 = new int[256];
		for (@Pc(193) int local193 = 0; local193 < 64; local193++) {
			Static74.anIntArray363[local193] = local193 * 4;
		}
		for (@Pc(206) int local206 = 0; local206 < 64; local206++) {
			Static74.anIntArray363[local206 + 64] = local206 * 262144 + 255;
		}
		for (@Pc(223) int local223 = 0; local223 < 64; local223++) {
			Static74.anIntArray363[local223 + 128] = local223 * 1024 + 16711935;
		}
		for (@Pc(240) int local240 = 0; local240 < 64; local240++) {
			Static74.anIntArray363[local240 + 192] = 16777215;
		}
		Static135.anIntArray591 = new int[256];
		Static2.anIntArray17 = new int[32768];
		Static58.anIntArray330 = new int[32768];
		Static55.method1228(null);
		Static53.anIntArray268 = new int[32768];
		Static9.anIntArray97 = new int[32768];
		Static82.anInt2394 = 0;
		Static140.aClass28_1189 = Static140.aClass28_1184;
		if (Static126.anInt3243 == 0) {
			Static157.aBoolean181 = true;
		} else {
			Static157.aBoolean181 = false;
		}
		Static109.aBoolean138 = false;
		Static140.aClass28_1183 = Static140.aClass28_1184;
		if (Static157.aBoolean181) {
			Static164.method3023();
		} else {
			Static167.method3090(Static19.aClass28_215, Static140.aClass28_1184, Static164.aClass7_Sub1_17);
		}
		Static92.method3170(false);
		Static24.aBoolean41 = true;
		Static60.aClass3_Sub2_Sub2_Sub4_4.method986(0, 0);
		Static15.aClass3_Sub2_Sub2_Sub4_3.method986(382, 0);
		Static119.aClass3_Sub2_Sub2_Sub3_2.method840(382 - Static119.aClass3_Sub2_Sub2_Sub3_2.anInt1013 / 2, 18);
		Static122.aClass3_Sub2_Sub2_Sub4_6 = new Class3_Sub2_Sub2_Sub4(128, 254);
		Static60.aClass3_Sub2_Sub2_Sub4_5 = new Class3_Sub2_Sub2_Sub4(128, 254);
	}
}
