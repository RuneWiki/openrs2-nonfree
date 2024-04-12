import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!db", name = "k", descriptor = "[Lclient!cb;")
	public static Class11[] aClass11Array1;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V", line = 3)
	public static void method356() {
		Class15.aClass40_121 = null;
		Class15.anIntArray85 = null;
		Class15.aClass40Array8 = null;
		aClass11Array1 = null;
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(B)V", line = 18)
	public static void method357() {
		@Pc(10) int local10 = Class60.anInt2371 + Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anInt2284;
		@Pc(15) int local15 = Class63.anInt2518 + Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anInt2275;
		if (Static61.anInt1653 - local15 < -500 || Static61.anInt1653 - local15 > 500 || Static22.anInt577 - local10 < -500 || Static22.anInt577 - local10 > 500) {
			Static61.anInt1653 = local15;
			Static22.anInt577 = local10;
		}
		if (local15 != Static61.anInt1653) {
			Static61.anInt1653 += (local15 - Static61.anInt1653) / 16;
		}
		@Pc(67) int local67 = Static61.anInt1653 >> 7;
		if (local10 != Static22.anInt577) {
			Static22.anInt577 += (local10 - Static22.anInt577) / 16;
		}
		if (Class2_Sub2_Sub15.aBooleanArray37[96]) {
			Class2_Sub7.anInt816 += (-Class2_Sub7.anInt816 - 24) / 2;
		} else if (Class2_Sub2_Sub15.aBooleanArray37[97]) {
			Class2_Sub7.anInt816 += (24 - Class2_Sub7.anInt816) / 2;
		} else {
			Class2_Sub7.anInt816 /= 2;
		}
		@Pc(119) int local119 = Static22.anInt577 >> 7;
		if (Class2_Sub2_Sub15.aBooleanArray37[98]) {
			Class18.anInt1868 += (12 - Class18.anInt1868) / 2;
		} else if (Class2_Sub2_Sub15.aBooleanArray37[99]) {
			Class18.anInt1868 += (-Class18.anInt1868 - 12) / 2;
		} else {
			Class18.anInt1868 /= 2;
		}
		Class58.anInt2177 += Class18.anInt1868 / 2;
		Class38.anInt1669 = Class2_Sub7.anInt816 / 2 + Class38.anInt1669 & 0x7FF;
		if (Class58.anInt2177 < 128) {
			Class58.anInt2177 = 128;
		}
		@Pc(184) int local184 = 0;
		if (Class58.anInt2177 > 383) {
			Class58.anInt2177 = 383;
		}
		@Pc(197) int local197 = Static78.method1383(Static1.anInt8, Static61.anInt1653, Static22.anInt577);
		@Pc(213) int local213;
		if (local67 > 3 && local119 > 3 && local67 < 100 && local119 < 100) {
			for (local213 = local67 - 4; local213 <= local67 + 4; local213++) {
				for (@Pc(219) int local219 = local119 - 4; local219 <= local119 + 4; local219++) {
					@Pc(223) int local223 = Static1.anInt8;
					if (local223 < 3 && (Class34.aByteArrayArrayArray7[1][local213][local219] & 0x2) == 2) {
						local223++;
					}
					@Pc(249) int local249 = local197 - Class57.anIntArrayArrayArray8[local223][local213][local219];
					if (local184 < local249) {
						local184 = local249;
					}
				}
			}
		}
		local213 = local184 * 192;
		if (local213 > 98048) {
			local213 = 98048;
		}
		if (local213 < 32768) {
			local213 = 32768;
		}
		if (Class11.anInt308 < local213) {
			Class11.anInt308 += (local213 - Class11.anInt308) / 24;
		} else if (local213 < Class11.anInt308) {
			Class11.anInt308 += (local213 - Class11.anInt308) / 80;
			return;
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!ud;B)I", line = 134)
	public static int method358(@OriginalArg(0) Class5 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method73(client.aClass40_110, Class22.aClass40_223)) {
			local5++;
		}
		if (arg0.method73(client.aClass40_110, Class18.aClass40_544)) {
			local5++;
		}
		if (arg0.method73(client.aClass40_110, Class2_Sub2_Sub6.aClass40_191)) {
			local5++;
		}
		if (arg0.method73(client.aClass40_110, Class2_Sub3.aClass40_734)) {
			local5++;
		}
		if (arg0.method73(client.aClass40_110, Class9.aClass40_64)) {
			local5++;
		}
		if (arg0.method73(client.aClass40_110, Class22.aClass40_220)) {
			local5++;
		}
		if (arg0.method73(client.aClass40_110, Class64.aClass40_725)) {
			local5++;
		}
		if (arg0.method73(client.aClass40_110, Class24.aClass40_718)) {
			local5++;
		}
		if (arg0.method73(client.aClass40_110, Class2_Sub2.aClass40_707)) {
			local5++;
		}
		if (arg0.method73(client.aClass40_110, Class5_Sub1.aClass40_29)) {
			local5++;
		}
		if (arg0.method73(client.aClass40_110, Class2_Sub2_Sub10.aClass40_319)) {
			local5++;
		}
		if (arg0.method73(client.aClass40_110, Class59.aClass40_632)) {
			local5++;
		}
		if (arg0.method73(client.aClass40_110, Class38.aClass40_487)) {
			local5++;
		}
		if (arg0.method73(client.aClass40_110, Class2_Sub2_Sub8.aClass40_288)) {
			local5++;
		}
		if (arg0.method73(client.aClass40_110, Class23.aClass40_256)) {
			local5++;
		}
		if (arg0.method73(client.aClass40_110, Class1.aClass40_3)) {
			local5++;
		}
		if (arg0.method73(client.aClass40_110, Class24.aClass40_720)) {
			local5++;
		}
		if (arg0.method73(client.aClass40_110, Class19.aClass40_136)) {
			local5++;
		}
		if (arg0.method73(client.aClass40_110, Class2_Sub2_Sub3.aClass40_78)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!db", name = "c", descriptor = "(B)V", line = 222)
	public static void method359() {
		Static7.method186();
		if (Class27.anInt1096 == 1) {
			Static49.aClass2_Sub2_Sub2_Sub4Array7[Class61.anInt2410 / 100].method1624(Class35.anInt1554 - 8 - 4, Class2_Sub2_Sub16.anInt2465 - 8 + -4);
		}
		if (Class27.anInt1096 == 2) {
			Static49.aClass2_Sub2_Sub2_Sub4Array7[Class61.anInt2410 / 100 + 4].method1624(Class35.anInt1554 - 8 - 4, Class2_Sub2_Sub16.anInt2465 + -8 + -4);
		}
		if (Class4.anInt51 != -1) {
			Static26.method533(Class4.anInt51);
			Static20.method403(0, -1, Class4.anInt51, 4, 0, 334, 0, 512);
		}
		if (Class2_Sub3.anInt2585 != -1) {
			Static26.method533(Class2_Sub3.anInt2585);
			Static20.method403(0, -1, Class2_Sub3.anInt2585, 0, 0, 334, 0, 512);
		}
		Static40.method1239();
		if (!Class2_Sub12.aBoolean175) {
			Static19.method389();
			Static5.method115();
		} else if (Static1.anInt16 == 0) {
			Static22.method480();
		}
		if (Class24.anInt2505 == 1) {
			Static40.aClass2_Sub2_Sub2_Sub4_7.method1624(472, 296);
		}
		@Pc(158) int local158;
		if (Class2_Sub2_Sub12_Sub1_Sub2.aBoolean173) {
			@Pc(118) byte local118 = 20;
			@Pc(120) int local120 = 16776960;
			if (Class2_Sub11.anInt1695 < 30 && Class1.aBoolean2) {
				local120 = 16711680;
			}
			if (Class2_Sub11.anInt1695 < 20 && !Class1.aBoolean2) {
				local120 = 16711680;
			}
			Static95.aClass2_Sub2_Sub2_Sub2_5.method572(Static72.method1334(new Class40[] { Class60.aClass40_676, Static48.method859(Class2_Sub11.anInt1695) }), 20, local120);
			local120 = 16776960;
			local158 = local118 + 15;
			@Pc(160) Runtime local160 = Runtime.getRuntime();
			@Pc(170) int local170 = (int) ((local160.totalMemory() - local160.freeMemory()) / 1024L);
			if (local170 > 32768 && Class1.aBoolean2) {
				local120 = 16711680;
			}
			if (local170 > 65536 && !Class1.aBoolean2) {
				local120 = 16711680;
			}
			Static95.aClass2_Sub2_Sub2_Sub2_5.method572(Static72.method1334(new Class40[] { Class2_Sub2_Sub1.aClass40_44, Static48.method859(local170), Class2_Sub12.aClass40_668 }), 35, local120);
			local158 += 15;
			if (Class2_Sub2_Sub1.aBoolean13) {
				Static95.aClass2_Sub2_Sub2_Sub2_5.method572(Class2_Sub3.aClass40_735, 50, 16711680);
				local158 += 15;
				Class2_Sub2_Sub1.aBoolean13 = false;
			}
			if (Class6.aBoolean23) {
				Static95.aClass2_Sub2_Sub2_Sub2_5.method572(Class37.aClass40_481, local158, 16711680);
				Class6.aBoolean23 = false;
				local158 += 15;
			}
			if (Class45_Sub1.aBoolean165) {
				Static95.aClass2_Sub2_Sub2_Sub2_5.method572(Class33.aClass40_435, local158, 16711680);
				local158 += 15;
				Class45_Sub1.aBoolean165 = false;
			}
		}
		if (Class52.anInt1973 == 0) {
			return;
		}
		@Pc(254) int local254 = Class52.anInt1973 / 50;
		local158 = local254 / 60;
		@Pc(262) int local262 = local254 % 60;
		if (local262 >= 10) {
			Static95.aClass2_Sub2_Sub2_Sub2_5.method575(Static72.method1334(new Class40[] { Class45_Sub1.aClass40_618, Static48.method859(local158), Class2_Sub12.aClass40_673, Static48.method859(local262) }), 4, 329, 16776960);
		} else {
			Static95.aClass2_Sub2_Sub2_Sub2_5.method575(Static72.method1334(new Class40[] { Class45_Sub1.aClass40_618, Static48.method859(local158), Class18_Sub1.aClass40_135, Static48.method859(local262) }), 4, 329, 16776960);
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(BLclient!eb;I)Lclient!o;", line = 347)
	public static Class40 method360(@OriginalArg(1) Class2_Sub3 arg0) {
		try {
			@Pc(12) Class40 local12 = new Class40();
			local12.anInt1783 = arg0.method1698();
			if (local12.anInt1783 > 32767) {
				local12.anInt1783 = 32767;
			}
			local12.aByteArray14 = new byte[local12.anInt1783];
			arg0.anInt2546 += Static89.aClass42_1.method1212(0, local12.anInt1783, arg0.anInt2546, arg0.aByteArray24, local12.aByteArray14);
			return local12;
		} catch (@Pc(53) Exception local53) {
			return Class53.aClass40_574;
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(I)I", line = 383)
	public static int method361() {
		@Pc(5) int local5 = Static78.method1383(Static1.anInt8, Static44.anInt1114, Static14.anInt1863);
		return local5 - Static73.anInt1935 >= 800 || (Class34.aByteArrayArrayArray7[Static1.anInt8][Static44.anInt1114 >> 7][Static14.anInt1863 >> 7] & 0x4) == 0 ? 3 : Static1.anInt8;
	}
}
