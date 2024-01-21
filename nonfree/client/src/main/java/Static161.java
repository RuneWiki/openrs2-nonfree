import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!r", name = "t", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1586 = Static193.method3027(" steht bereits auf Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!r", name = "y", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1587 = Static193.method3027(")3runescape)3com");

	@OriginalMember(owner = "client!r", name = "C", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1588 = Static193.method3027("(U2");

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)V")
	public static void method2418() {
		Static204.aByteArrayArray9 = null;
		Static160.anIntArray245 = null;
		Static176.anIntArray295 = null;
		Static163.anIntArray250 = null;
		Static63.anIntArray75 = null;
		Static172.anIntArray284 = null;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(II)Lclient!eh;")
	public static Class3_Sub3_Sub9 method2421(@OriginalArg(0) int arg0) {
		@Pc(10) Class3_Sub3_Sub9 local10 = (Class3_Sub3_Sub9) Static151.aClass85_30.method2558((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(26) byte[] local26 = Static14.aClass52_5.method1581(Static95.method1375(arg0), Static115.method1662(arg0));
		local10 = new Class3_Sub3_Sub9();
		local10.anInt992 = arg0;
		if (local26 != null) {
			local10.method770(new Class3_Sub4(local26));
		}
		local10.method759();
		if (local10.aBoolean65) {
			local10.aBoolean61 = false;
			local10.anInt1014 = 0;
		}
		if (!Static40.aBoolean53 && local10.aBoolean57) {
			local10.aClass70Array20 = null;
		}
		Static151.aClass85_30.method2560(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(BLjava/awt/Component;Lclient!ke;Lclient!ke;)V")
	public static void method2423(@OriginalArg(1) Component arg0, @OriginalArg(2) Class52 arg1, @OriginalArg(3) Class52 arg2) {
		if (Static89.aBoolean38) {
			return;
		}
		Static104.method3082();
		@Pc(13) byte[] local13 = arg1.method1581(Static89.anInt671, 0);
		Static31.aClass3_Sub3_Sub2_Sub1_2 = new Class3_Sub3_Sub2_Sub1(local13, arg0);
		Static76.aClass3_Sub3_Sub2_Sub1_5 = Static31.aClass3_Sub3_Sub2_Sub1_2.method191();
		Static28.aClass3_Sub3_Sub2_Sub2_1 = Static192.method3018(Static154.anInt3183, arg2);
		Static93.aClass3_Sub3_Sub2_Sub2_3 = Static192.method3018(Static123.anInt2475, arg2);
		Static201.aClass3_Sub3_Sub2_Sub2_4 = Static192.method3018(Static96.anInt2001, arg2);
		Static163.aClass3_Sub3_Sub2_Sub2Array8 = Static6.method103(arg2, Static37.anInt3229);
		Static57.aClass3_Sub3_Sub2_Sub2Array2 = Static6.method103(arg2, Static92.anInt1958);
		Static75.anIntArray79 = new int[256];
		for (@Pc(52) int local52 = 0; local52 < 64; local52++) {
			Static75.anIntArray79[local52] = local52 * 262144;
		}
		for (@Pc(65) int local65 = 0; local65 < 64; local65++) {
			Static75.anIntArray79[local65 + 64] = local65 * 1024 + 16711680;
		}
		for (@Pc(83) int local83 = 0; local83 < 64; local83++) {
			Static75.anIntArray79[local83 + 128] = local83 * 4 + 16776960;
		}
		for (@Pc(101) int local101 = 0; local101 < 64; local101++) {
			Static75.anIntArray79[local101 + 192] = 16777215;
		}
		Static178.anIntArray305 = new int[256];
		for (@Pc(119) int local119 = 0; local119 < 64; local119++) {
			Static178.anIntArray305[local119] = local119 * 1024;
		}
		for (@Pc(134) int local134 = 0; local134 < 64; local134++) {
			Static178.anIntArray305[local134 + 64] = local134 * 4 + 65280;
		}
		for (@Pc(153) int local153 = 0; local153 < 64; local153++) {
			Static178.anIntArray305[local153 + 128] = local153 * 262144 + 65535;
		}
		for (@Pc(172) int local172 = 0; local172 < 64; local172++) {
			Static178.anIntArray305[local172 + 192] = 16777215;
		}
		Static111.anIntArray137 = new int[256];
		for (@Pc(190) int local190 = 0; local190 < 64; local190++) {
			Static111.anIntArray137[local190] = local190 * 4;
		}
		for (@Pc(205) int local205 = 0; local205 < 64; local205++) {
			Static111.anIntArray137[local205 + 64] = local205 * 262144 + 255;
		}
		for (@Pc(224) int local224 = 0; local224 < 64; local224++) {
			Static111.anIntArray137[local224 + 128] = local224 * 1024 + 16711935;
		}
		for (@Pc(244) int local244 = 0; local244 < 64; local244++) {
			Static111.anIntArray137[local244 + 192] = 16777215;
		}
		Static203.anIntArray359 = new int[32768];
		Static55.anIntArray65 = new int[256];
		Static39.anIntArray41 = new int[32768];
		Static36.method638(null);
		Static91.anIntArray94 = new int[32768];
		Static186.anInt3812 = 0;
		Static198.aClass70_1992 = Static198.aClass70_1994;
		Static209.anIntArray380 = new int[32768];
		if (Static8.anInt186 == 0) {
			Static153.aBoolean147 = true;
		} else {
			Static153.aBoolean147 = false;
		}
		Static198.aClass70_1993 = Static198.aClass70_1994;
		Static149.aBoolean142 = false;
		if (Static153.aBoolean147) {
			Static35.method615();
		} else {
			Static180.method2793(Static10.aClass52_Sub1_2, 255, Static167.anInt3405);
		}
		Static185.method2900(false);
		Static89.aBoolean38 = true;
		Static186.method2943();
		Static113.aClass3_Sub3_Sub2_Sub1_6 = new Class3_Sub3_Sub2_Sub1(128, 254);
		Static44.aClass3_Sub3_Sub2_Sub1_3 = new Class3_Sub3_Sub2_Sub1(128, 254);
	}
}
