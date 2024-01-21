import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "[I")
	public static int[] anIntArray264 = new int[100];

	@OriginalMember(owner = "client!cf", name = "f", descriptor = "Lclient!gg;")
	private static Class28 aClass28_1658 = Static107.method1838("Prepared visibility map");

	@OriginalMember(owner = "client!cf", name = "h", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1659 = Static107.method1838(")4lang)4de");

	@OriginalMember(owner = "client!cf", name = "i", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1660 = aClass28_1658;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!hf;ILclient!mc;I)V")
	public static void method1951(@OriginalArg(0) Class32 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class40_Sub1 arg2) {
		@Pc(3) byte[] local3 = null;
		@Pc(17) Class65 local17 = Static67.aClass65_4;
		synchronized (Static67.aClass65_4) {
			for (@Pc(24) Class2_Sub7 local24 = (Class2_Sub7) Static67.aClass65_4.method2115(); local24 != null; local24 = (Class2_Sub7) Static67.aClass65_4.method2117()) {
				if ((long) arg1 == local24.aLong145 && arg0 == local24.aClass32_2 && local24.anInt972 == 0) {
					local3 = local24.aByteArray12;
					break;
				}
			}
		}
		if (local3 == null) {
			@Pc(75) byte[] local75 = arg0.method1285(arg1);
			arg2.method1797(true, arg0, local75, arg1);
		} else {
			arg2.method1797(true, arg0, local3, arg1);
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(BI)I")
	public static int method1953(@OriginalArg(1) int arg0) {
		@Pc(7) Class2_Sub4_Sub11 local7 = Static117.method1958(arg0);
		@Pc(10) int local10 = local7.anInt1855;
		@Pc(13) int local13 = local7.anInt1852;
		@Pc(24) int local24 = local7.anInt1851;
		@Pc(31) int local31 = Class2_Sub3_Sub28.anIntArray334[local13 - local24];
		return local31 & Static24.anIntArray52[local10] >> local24;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(BLclient!jc;Ljava/awt/Component;Lclient!jc;)V")
	public static void method1954(@OriginalArg(1) Class40 arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) Class40 arg2) {
		if (Static160.aBoolean154) {
			return;
		}
		Static161.method2798();
		@Pc(23) byte[] local23 = arg0.method1769(Static138.aClass28_1860, Static170.aClass28_2438);
		Static105.aClass2_Sub4_Sub3_Sub4_5 = new Class2_Sub4_Sub3_Sub4(local23, arg1);
		Static113.aClass2_Sub4_Sub3_Sub4_6 = Static105.aClass2_Sub4_Sub3_Sub4_5.method2817();
		Static42.aClass2_Sub4_Sub3_Sub3_1 = Static147.method2307(Static138.aClass28_1860, Static131.aClass28_1816, arg2);
		Static82.aClass2_Sub4_Sub3_Sub3_3 = Static147.method2307(Static138.aClass28_1860, Static100.aClass28_1457, arg2);
		Static119.aClass2_Sub4_Sub3_Sub3_4 = Static147.method2307(Static138.aClass28_1860, Static160.aClass28_2056, arg2);
		Static162.aClass2_Sub4_Sub3_Sub3Array9 = Static38.method709(arg2, Static138.aClass28_1860, Static105.aClass28_1539);
		Static124.aClass2_Sub4_Sub3_Sub3Array5 = Static38.method709(arg2, Static138.aClass28_1860, Static112.aClass28_1592);
		Static35.anIntArray73 = new int[256];
		for (@Pc(67) int local67 = 0; local67 < 64; local67++) {
			Static35.anIntArray73[local67] = local67 * 262144;
		}
		for (@Pc(81) int local81 = 0; local81 < 64; local81++) {
			Static35.anIntArray73[local81 + 64] = local81 * 1024 + 16711680;
		}
		for (@Pc(99) int local99 = 0; local99 < 64; local99++) {
			Static35.anIntArray73[local99 + 128] = local99 * 4 + 16776960;
		}
		for (@Pc(119) int local119 = 0; local119 < 64; local119++) {
			Static35.anIntArray73[local119 + 192] = 16777215;
		}
		Static116.anIntArray263 = new int[256];
		for (@Pc(136) int local136 = 0; local136 < 64; local136++) {
			Static116.anIntArray263[local136] = local136 * 1024;
		}
		for (@Pc(152) int local152 = 0; local152 < 64; local152++) {
			Static116.anIntArray263[local152 + 64] = local152 * 4 + 65280;
		}
		for (@Pc(172) int local172 = 0; local172 < 64; local172++) {
			Static116.anIntArray263[local172 + 128] = local172 * 262144 + 65535;
		}
		for (@Pc(192) int local192 = 0; local192 < 64; local192++) {
			Static116.anIntArray263[local192 + 192] = 16777215;
		}
		Static26.anIntArray63 = new int[256];
		for (@Pc(211) int local211 = 0; local211 < 64; local211++) {
			Static26.anIntArray63[local211] = local211 * 4;
		}
		for (@Pc(227) int local227 = 0; local227 < 64; local227++) {
			Static26.anIntArray63[local227 + 64] = local227 * 262144 + 255;
		}
		for (@Pc(246) int local246 = 0; local246 < 64; local246++) {
			Static26.anIntArray63[local246 + 128] = local246 * 1024 + 16711935;
		}
		for (@Pc(264) int local264 = 0; local264 < 64; local264++) {
			Static26.anIntArray63[local264 + 192] = 16777215;
		}
		Static164.anIntArray338 = new int[32768];
		Static19.anIntArray71 = new int[32768];
		Static142.anIntArray285 = new int[256];
		Static142.method2253(null);
		Static82.aBoolean103 = false;
		Static141.anIntArray284 = new int[32768];
		Static138.aClass28_1856 = Static138.aClass28_1860;
		if (Static84.anInt2125 == 0) {
			Static171.aBoolean167 = true;
		} else {
			Static171.aBoolean167 = false;
		}
		Static138.aClass28_1854 = Static138.aClass28_1860;
		Static74.anInt1949 = 0;
		Static48.anIntArray106 = new int[32768];
		if (Static171.aBoolean167) {
			Static85.method1512();
		} else {
			Static124.method2020(Static138.aClass28_1860, Static10.aClass40_Sub1_18, Static84.aClass28_1255);
		}
		Static117.method1961(false);
		Static160.aBoolean154 = true;
		Static105.aClass2_Sub4_Sub3_Sub4_5.method2823(0, 0);
		Static113.aClass2_Sub4_Sub3_Sub4_6.method2823(382, 0);
		Static42.aClass2_Sub4_Sub3_Sub3_1.method2242(382 - Static42.aClass2_Sub4_Sub3_Sub3_1.anInt3233 / 2, 18);
		Static85.aClass2_Sub4_Sub3_Sub4_3 = new Class2_Sub4_Sub3_Sub4(128, 254);
		Static71.aClass2_Sub4_Sub3_Sub4_2 = new Class2_Sub4_Sub3_Sub4(128, 254);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
	public static void method1956() {
		aClass28_1660 = null;
		aClass28_1659 = null;
		anIntArray264 = null;
		aClass28_1658 = null;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIII)V")
	public static void method1957(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(16) Class24 local16 = Static12.method360(arg1, arg0);
		if (local16 != null && local16.anObjectArray12 != null) {
			@Pc(25) Class2_Sub21 local25 = new Class2_Sub21();
			local25.anObjectArray29 = local16.anObjectArray12;
			local25.aClass24_9 = local16;
			Static118.method2854(local25);
		}
		Static34.anInt958 = arg1;
		Static59.anInt1550 = arg0;
		Static151.anInt3386 = arg2;
		Static163.aBoolean157 = true;
		Static104.method1828(local16);
	}
}
