import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!hh", name = "g", descriptor = "Lclient!ha;")
	public static Class29 aClass29_4;

	@OriginalMember(owner = "client!hh", name = "k", descriptor = "Lclient!f;")
	public static Class13 aClass13_12;

	@OriginalMember(owner = "client!hh", name = "p", descriptor = "Lclient!sd;")
	private static Class73 aClass73_816 = Static122.method531("Use");

	@OriginalMember(owner = "client!hh", name = "f", descriptor = "Lclient!sd;")
	public static Class73 aClass73_815 = aClass73_816;

	@OriginalMember(owner = "client!hh", name = "j", descriptor = "[J")
	public static long[] aLongArray1 = new long[100];

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IILclient!sd;Lclient!sd;IIZ)V")
	public static void method1125(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class73 arg2, @OriginalArg(3) Class73 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (Static169.aBoolean245 || Static142.anInt3262 >= 500) {
			return;
		}
		Static11.aClass73Array3[Static142.anInt3262] = arg2;
		Static162.aClass73Array24[Static142.anInt3262] = arg3;
		Static176.anIntArray419[Static142.anInt3262] = arg4;
		Static143.anIntArray349[Static142.anInt3262] = arg0;
		Static14.anIntArray18[Static142.anInt3262] = arg1;
		Static50.anIntArray120[Static142.anInt3262] = arg5;
		Static142.anInt3262++;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lclient!f;Lclient!f;ILjava/awt/Component;)V")
	public static void method1126(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class13 arg1, @OriginalArg(3) Component arg2) {
		if (Static83.aBoolean120) {
			return;
		}
		Static15.method2305();
		@Pc(15) byte[] local15 = arg0.method354(Static12.aClass73_164, Static12.aClass73_167);
		Static67.aClass3_Sub1_Sub3_Sub4_13 = new Class3_Sub1_Sub3_Sub4(local15, arg2);
		Static39.aClass3_Sub1_Sub3_Sub4_9 = Static67.aClass3_Sub1_Sub3_Sub4_13.method2340();
		Static39.aClass3_Sub1_Sub3_Sub3_4 = Static16.method298(Static12.aClass73_167, arg1, Static120.aClass73_1590);
		Static38.aClass3_Sub1_Sub3_Sub3_13 = Static16.method298(Static12.aClass73_167, arg1, Static158.aClass73_1894);
		Static143.aClass3_Sub1_Sub3_Sub3_14 = Static16.method298(Static12.aClass73_167, arg1, Static144.aClass73_1881);
		Static47.aClass3_Sub1_Sub3_Sub3Array19 = Static74.method1287(arg1, Static12.aClass73_167, Static79.aClass73_947);
		Static12.aClass3_Sub1_Sub3_Sub3Array5 = Static74.method1287(arg1, Static12.aClass73_167, Static17.aClass73_2018);
		Static175.anIntArray417 = new int[256];
		for (@Pc(59) int local59 = 0; local59 < 64; local59++) {
			Static175.anIntArray417[local59] = local59 * 262144;
		}
		for (@Pc(75) int local75 = 0; local75 < 64; local75++) {
			Static175.anIntArray417[local75 + 64] = local75 * 1024 + 16711680;
		}
		for (@Pc(93) int local93 = 0; local93 < 64; local93++) {
			Static175.anIntArray417[local93 + 128] = local93 * 4 + 16776960;
		}
		for (@Pc(114) int local114 = 0; local114 < 64; local114++) {
			Static175.anIntArray417[local114 + 192] = 16777215;
		}
		Static157.anIntArray372 = new int[256];
		for (@Pc(133) int local133 = 0; local133 < 64; local133++) {
			Static157.anIntArray372[local133] = local133 * 1024;
		}
		for (@Pc(149) int local149 = 0; local149 < 64; local149++) {
			Static157.anIntArray372[local149 + 64] = local149 * 4 + 65280;
		}
		for (@Pc(168) int local168 = 0; local168 < 64; local168++) {
			Static157.anIntArray372[local168 + 128] = local168 * 262144 + 65535;
		}
		for (@Pc(189) int local189 = 0; local189 < 64; local189++) {
			Static157.anIntArray372[local189 + 192] = 16777215;
		}
		Static82.anIntArray189 = new int[256];
		for (@Pc(208) int local208 = 0; local208 < 64; local208++) {
			Static82.anIntArray189[local208] = local208 * 4;
		}
		for (@Pc(224) int local224 = 0; local224 < 64; local224++) {
			Static82.anIntArray189[local224 + 64] = local224 * 262144 + 255;
		}
		for (@Pc(244) int local244 = 0; local244 < 64; local244++) {
			Static82.anIntArray189[local244 + 128] = local244 * 1024 + 16711935;
		}
		for (@Pc(264) int local264 = 0; local264 < 64; local264++) {
			Static82.anIntArray189[local264 + 192] = 16777215;
		}
		Static37.anIntArray92 = new int[32768];
		Static84.anIntArray192 = new int[32768];
		Static122.anIntArray72 = new int[256];
		Static120.method2093(null);
		if (Static69.anInt1602 == 0) {
			Static108.aBoolean170 = true;
		} else {
			Static108.aBoolean170 = false;
		}
		Static17.anIntArray397 = new int[32768];
		Static12.aClass73_171 = Static12.aClass73_167;
		Static153.anInt3415 = 0;
		Static12.aClass73_172 = Static12.aClass73_167;
		Static105.aBoolean159 = false;
		Static2.anIntArray2 = new int[32768];
		if (Static108.aBoolean170) {
			Static47.method1372();
		} else {
			Static175.method2707(Static11.aClass13_Sub1_4, Static175.aClass73_2034, Static12.aClass73_167);
		}
		Static44.method789(false);
		Static83.aBoolean120 = true;
		Static67.aClass3_Sub1_Sub3_Sub4_13.method2317(0, 0);
		Static39.aClass3_Sub1_Sub3_Sub4_9.method2317(382, 0);
		Static39.aClass3_Sub1_Sub3_Sub3_4.method1493(382 - Static39.aClass3_Sub1_Sub3_Sub3_4.anInt1917 / 2, 18);
		Static32.aClass3_Sub1_Sub3_Sub4_7 = new Class3_Sub1_Sub3_Sub4(128, 254);
		Static53.aClass3_Sub1_Sub3_Sub4_45 = new Class3_Sub1_Sub3_Sub4(128, 254);
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V")
	public static void method1127() {
		while (true) {
			if (Static159.aClass3_Sub12_Sub1_4.method1397(Static17.anInt3783) >= 11) {
				@Pc(12) int local12 = Static159.aClass3_Sub12_Sub1_4.method1403(11);
				if (local12 != 2047) {
					@Pc(19) boolean local19 = false;
					if (Static162.aClass3_Sub1_Sub4_Sub7_Sub1Array1[local12] == null) {
						Static162.aClass3_Sub1_Sub4_Sub7_Sub1Array1[local12] = new Class3_Sub1_Sub4_Sub7_Sub1();
						if (Static79.aClass3_Sub12Array1[local12] != null) {
							Static162.aClass3_Sub1_Sub4_Sub7_Sub1Array1[local12].method2021(Static79.aClass3_Sub12Array1[local12]);
						}
						local19 = true;
					}
					Static47.anIntArray184[Static6.anInt158++] = local12;
					@Pc(55) Class3_Sub1_Sub4_Sub7_Sub1 local55 = Static162.aClass3_Sub1_Sub4_Sub7_Sub1Array1[local12];
					local55.anInt3177 = Static44.anInt1024;
					@Pc(63) int local63 = Static159.aClass3_Sub12_Sub1_4.method1403(1);
					if (local63 == 1) {
						Static2.anIntArray1[Static181.anInt3975++] = local12;
					}
					@Pc(81) int local81 = Static56.anIntArray137[Static159.aClass3_Sub12_Sub1_4.method1403(3)];
					if (local19) {
						local55.anInt3139 = local55.anInt3138 = local81;
					}
					@Pc(94) int local94 = Static159.aClass3_Sub12_Sub1_4.method1403(1);
					@Pc(99) int local99 = Static159.aClass3_Sub12_Sub1_4.method1403(5);
					if (local99 > 15) {
						local99 -= 32;
					}
					@Pc(110) int local110 = Static159.aClass3_Sub12_Sub1_4.method1403(5);
					if (local110 > 15) {
						local110 -= 32;
					}
					local55.method2267(local110 + Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray329[0], local94 == 1, Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray326[0] + local99);
					continue;
				}
			}
			Static159.aClass3_Sub12_Sub1_4.method1406();
			return;
		}
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)V")
	public static void method1128() {
		aClass73_816 = null;
		aClass73_815 = null;
		aLongArray1 = null;
		aClass29_4 = null;
		aClass13_12 = null;
	}
}
