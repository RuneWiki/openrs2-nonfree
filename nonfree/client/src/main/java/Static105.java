import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!v", name = "d", descriptor = "Lclient!ob;")
	public static Class1_Sub1_Sub11 aClass1_Sub1_Sub11_1;

	@OriginalMember(owner = "client!v", name = "j", descriptor = "[[B")
	public static byte[][] aByteArrayArray7;

	@OriginalMember(owner = "client!v", name = "q", descriptor = "[[Lclient!ee;")
	public static Class1_Sub1_Sub7[][] aClass1_Sub1_Sub7ArrayArray1;

	@OriginalMember(owner = "client!v", name = "b", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1535 = Static15.method178(" from your friend list first");

	@OriginalMember(owner = "client!v", name = "c", descriptor = "I")
	public static int anInt2694 = 0;

	@OriginalMember(owner = "client!v", name = "f", descriptor = "B")
	public static byte aByte2 = 0;

	@OriginalMember(owner = "client!v", name = "k", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1536 = aClass23_1535;

	@OriginalMember(owner = "client!v", name = "m", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1537 = Static15.method178(" weitere Optionen");

	@OriginalMember(owner = "client!v", name = "n", descriptor = "I")
	public static int anInt2698 = -1;

	@OriginalMember(owner = "client!v", name = "p", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1538 = Static15.method178("rot:");

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(B)[Lclient!mb;")
	public static Class1_Sub1_Sub6_Sub3[] method1782() {
		@Pc(6) Class1_Sub1_Sub6_Sub3[] local6 = new Class1_Sub1_Sub6_Sub3[Static25.anInt766];
		for (@Pc(13) int local13 = 0; local13 < Static25.anInt766; local13++) {
			@Pc(22) Class1_Sub1_Sub6_Sub3 local22 = local6[local13] = new Class1_Sub1_Sub6_Sub3();
			local22.anInt1880 = Static79.anInt2132;
			local22.anInt1882 = Static13.anInt236;
			local22.anInt1879 = Static102.anIntArray355[local13];
			local22.anInt1881 = Static100.anIntArray348[local13];
			local22.anInt1878 = Static113.anIntArray410[local13];
			local22.anInt1883 = Static26.anIntArray119[local13];
			local22.anIntArray218 = Static80.anIntArray268;
			local22.aByteArray11 = aByteArrayArray7[local13];
		}
		Static90.method1538();
		return local6;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V")
	public static void method1783() {
		aClass23_1536 = null;
		aClass23_1538 = null;
		aClass1_Sub1_Sub11_1 = null;
		aClass1_Sub1_Sub7ArrayArray1 = null;
		aClass23_1535 = null;
		aClass23_1537 = null;
		aByteArrayArray7 = null;
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(B)V")
	public static void method1784() {
		try {
			@Pc(6) Graphics local6 = Static26.aCanvas1.getGraphics();
			Static79.aClass34_59.method1144(4, local6, 550);
		} catch (@Pc(22) Exception local22) {
			Static26.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(I)V")
	public static void method1786() {
		Static57.aClass40_1.anInt1944 = 0;
		Static16.anInt336 = 0;
		Static45.aLong39 = 0L;
		Static72.aBoolean101 = true;
		Static42.aBoolean70 = true;
		Static99.method1659();
		Static40.anInt1400 = 0;
		Static76.aClass1_Sub5_Sub1_2.anInt1266 = 0;
		Static66.anInt1971 = 0;
		Static44.anInt1486 = -1;
		Static37.anInt1300 = -1;
		Static80.anInt2234 = 0;
		Static79.anInt2135 = -1;
		Static96.anInt1794 = -1;
		Static83.aClass1_Sub5_Sub1_3.anInt1266 = 0;
		Static60.anInt1806 = 0;
		Static26.anInt803 = 0;
		Static74.aBoolean90 = false;
		Static113.method1919(0);
		for (@Pc(1784) int local1784 = 0; local1784 < 100; local1784++) {
			Static26.aClass23Array8[local1784] = null;
		}
		Static2.anInt2290 = 0;
		Static104.anInt2686 = 0;
		Static115.anInt2955 = 0;
		Static68.anInt386 = (int) (Math.random() * 80.0D) - 40;
		Static28.anInt2178 = 0;
		Static40.anInt1397 = 0;
		Static3.anInt133 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
		Static35.anInt1096 = (int) (Math.random() * 120.0D) - 60;
		anInt2698 = -1;
		Static94.anInt2487 = 0;
		Static20.anInt691 = 0;
		Static111.anInt2901 = 0;
		Static50.anInt1618 = (int) (Math.random() * 30.0D) - 20;
		Static60.anInt1813 = (int) (Math.random() * 100.0D) - 50;
		Static27.anInt854 = (int) (Math.random() * 110.0D) - 55;
		for (@Pc(1866) int local1866 = 0; local1866 < 2048; local1866++) {
			Static74.aClass1_Sub1_Sub2_Sub1_Sub2Array3[local1866] = null;
			Static29.aClass1_Sub5Array1[local1866] = null;
		}
		for (@Pc(1882) int local1882 = 0; local1882 < 32768; local1882++) {
			Static108.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local1882] = null;
		}
		Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1 = Static74.aClass1_Sub1_Sub2_Sub1_Sub2Array3[2047] = new Class1_Sub1_Sub2_Sub1_Sub2();
		Static20.aClass45_1.method1291();
		Static71.aClass45_5.method1291();
		@Pc(1914) int local1914;
		@Pc(1918) int local1918;
		for (@Pc(1910) int local1910 = 0; local1910 < 4; local1910++) {
			for (local1914 = 0; local1914 < 104; local1914++) {
				for (local1918 = 0; local1918 < 104; local1918++) {
					Static49.aClass45ArrayArrayArray3[local1910][local1914][local1918] = null;
				}
			}
		}
		Static109.aClass45_9 = new Class45();
		Static115.anInt2954 = 0;
		Static8.anInt186 = 0;
		for (local1914 = 0; local1914 < Static68.anInt391; local1914++) {
			@Pc(1962) Class1_Sub1_Sub13 local1962 = Static87.method1882(local1914);
			if (local1962 != null && local1962.anInt2530 == 0) {
				Static70.anIntArray211[local1914] = 0;
				Static40.anIntArray164[local1914] = 0;
			}
		}
		Static108.method1842(Static56.anInt1733);
		Static56.anInt1733 = -1;
		Static108.method1842(Static92.anInt2913);
		Static92.anInt2913 = -1;
		Static108.method1842(Static109.anInt2824);
		Static109.anInt2824 = -1;
		Static108.method1842(Static77.anInt2096);
		Static77.anInt2096 = -1;
		Static108.method1842(Static87.anInt2866);
		Static87.anInt2866 = -1;
		Static108.method1842(Static16.anInt335);
		Static16.anInt335 = -1;
		Static108.method1842(Static70.anInt1836);
		Static44.anInt1485 = 0;
		Static70.anInt1836 = -1;
		Static110.aClass23_1695 = null;
		Static68.aBoolean27 = false;
		Static74.aBoolean90 = false;
		Static76.anInt2079 = 0;
		Static106.anInt2723 = 3;
		Static95.anInt2499 = -1;
		Static47.anInt1599 = -1;
		Static26.aClass58_1.method1614(-1, null, false, new int[5]);
		for (local1918 = 0; local1918 < 5; local1918++) {
			Static14.aClass23Array6[local1918] = null;
			Static26.aBooleanArray3[local1918] = false;
		}
		Static9.method102();
		Static67.aBoolean100 = true;
	}
}
