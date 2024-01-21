import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!gi", name = "L", descriptor = "Lclient!pd;")
	public static Class70 aClass70_1;

	@OriginalMember(owner = "client!gi", name = "P", descriptor = "[I")
	public static final int[] anIntArray164 = new int[1000];

	@OriginalMember(owner = "client!gi", name = "U", descriptor = "Z")
	public static boolean aBoolean75 = true;

	@OriginalMember(owner = "client!gi", name = "W", descriptor = "I")
	public static int anInt1715 = -1;

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(III)I")
	public static int method1156(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = 0;
		while (arg1 > 0) {
			arg1--;
			local5 = local5 << 1 | arg0 & 0x1;
			arg0 >>>= 0x1;
		}
		return local5;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Ljava/awt/Component;Lclient!sd;Lclient!sd;I)V")
	public static void method1159(@OriginalArg(0) Component arg0, @OriginalArg(1) Class60 arg1, @OriginalArg(2) Class60 arg2) {
		if (Static30.aBoolean34) {
			return;
		}
		Static194.method3102();
		@Pc(13) byte[] local13 = arg2.method2340(0, Static104.anInt2563);
		Static19.aClass1_Sub2_Sub5_Sub3_5 = new Class1_Sub2_Sub5_Sub3(local13, arg0);
		Static201.aClass1_Sub2_Sub5_Sub3_6 = Static19.aClass1_Sub2_Sub5_Sub3_5.method1306();
		Static195.aClass1_Sub2_Sub5_Sub1_4 = Static200.method3235(arg1, Static74.anInt1828);
		Static178.aClass1_Sub2_Sub5_Sub1_3 = Static200.method3235(arg1, Static100.anInt2517);
		Static100.aClass1_Sub2_Sub5_Sub1_1 = Static200.method3235(arg1, Static90.anInt4440);
		Static201.aClass1_Sub2_Sub5_Sub1Array12 = Static88.method1496(Static3.anInt82, arg1);
		Static9.aClass1_Sub2_Sub5_Sub1Array1 = Static88.method1496(Static79.anInt1931, arg1);
		Static93.anIntArray265 = new int[256];
		for (@Pc(52) int local52 = 0; local52 < 64; local52++) {
			Static93.anIntArray265[local52] = local52 * 262144;
		}
		for (@Pc(67) int local67 = 0; local67 < 64; local67++) {
			Static93.anIntArray265[local67 + 64] = local67 * 1024 + 16711680;
		}
		for (@Pc(84) int local84 = 0; local84 < 64; local84++) {
			Static93.anIntArray265[local84 + 128] = local84 * 4 + 16776960;
		}
		for (@Pc(103) int local103 = 0; local103 < 64; local103++) {
			Static93.anIntArray265[local103 + 192] = 16777215;
		}
		Static209.anIntArray517 = new int[256];
		for (@Pc(121) int local121 = 0; local121 < 64; local121++) {
			Static209.anIntArray517[local121] = local121 * 1024;
		}
		for (@Pc(136) int local136 = 0; local136 < 64; local136++) {
			Static209.anIntArray517[local136 + 64] = local136 * 4 + 65280;
		}
		for (@Pc(153) int local153 = 0; local153 < 64; local153++) {
			Static209.anIntArray517[local153 + 128] = local153 * 262144 + 65535;
		}
		for (@Pc(170) int local170 = 0; local170 < 64; local170++) {
			Static209.anIntArray517[local170 + 192] = 16777215;
		}
		Static142.anIntArray393 = new int[256];
		for (@Pc(188) int local188 = 0; local188 < 64; local188++) {
			Static142.anIntArray393[local188] = local188 * 4;
		}
		for (@Pc(203) int local203 = 0; local203 < 64; local203++) {
			Static142.anIntArray393[local203 + 64] = local203 * 262144 + 255;
		}
		for (@Pc(220) int local220 = 0; local220 < 64; local220++) {
			Static142.anIntArray393[local220 + 128] = local220 * 1024 + 16711935;
		}
		for (@Pc(239) int local239 = 0; local239 < 64; local239++) {
			Static142.anIntArray393[local239 + 192] = 16777215;
		}
		Static165.anIntArray434 = new int[32768];
		Static121.anIntArray336 = new int[256];
		Static181.anIntArray461 = new int[32768];
		Static126.method2388(null);
		Static168.anIntArray352 = new int[32768];
		Static206.aBoolean184 = false;
		Static61.anIntArray155 = new int[32768];
		Static140.anInt3419 = 0;
		Static139.aClass65_1958 = Static139.aClass65_1953;
		Static139.aClass65_1951 = Static139.aClass65_1953;
		if (Static135.anInt3352 == 0) {
			Static13.aBoolean37 = true;
		} else {
			Static13.aBoolean37 = false;
		}
		if (Static13.aBoolean37) {
			Static55.method977();
		} else {
			Static19.method379(Static135.anInt3348, Static16.aClass60_Sub1_15, 255);
		}
		Static100.method1895(false);
		Static30.aBoolean34 = true;
		Static120.method2274();
		Static185.aClass1_Sub2_Sub5_Sub3_7 = new Class1_Sub2_Sub5_Sub3(128, 254);
		Static11.aClass1_Sub2_Sub5_Sub3_2 = new Class1_Sub2_Sub5_Sub3(128, 254);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lclient!wd;IZII)V")
	public static void method1161(@OriginalArg(0) Class97 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static31.anInt933 < 3) {
			Static8.aClass1_Sub2_Sub5_Sub3_1.method1305(arg3, arg2, arg0.anInt4353, arg0.anInt4354, Static8.aClass1_Sub2_Sub5_Sub3_1.anInt1851 / 2, Static8.aClass1_Sub2_Sub5_Sub3_1.anInt1855 / 2, Static82.anInt2025, arg0.anIntArray504, arg0.anIntArray508);
		} else {
			Static194.method3098(arg3, arg2, arg0.anIntArray504, arg0.anIntArray508);
		}
		Static57.aBooleanArray8[arg1] = true;
	}
}
