import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!ba", name = "k", descriptor = "Lclient!pb;")
	public static Class31 aClass31_2;

	@OriginalMember(owner = "client!ba", name = "z", descriptor = "I")
	public static int anInt160;

	@OriginalMember(owner = "client!ba", name = "A", descriptor = "I")
	public static int anInt161;

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "I")
	public static int anInt140 = 0;

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "Lclient!mc;")
	public static Class42 aClass42_102 = Static23.method501("Texturen geladen)3");

	@OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
	public static int anInt142 = -1;

	@OriginalMember(owner = "client!ba", name = "t", descriptor = "Z")
	public static volatile boolean aBoolean6 = true;

	@OriginalMember(owner = "client!ba", name = "v", descriptor = "I")
	public static int anInt156 = 0;

	@OriginalMember(owner = "client!ba", name = "E", descriptor = "Lclient!mc;")
	public static Class42 aClass42_103 = Static23.method501("Gegenstand konnte nicht gefunden werden)1 verk-Urzen Sie den Suchbegriff)3");

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Z)V")
	public static void method113() {
		for (@Pc(15) Class1_Sub1_Sub8_Sub4 local15 = (Class1_Sub1_Sub8_Sub4) Static24.aClass22_6.method515(); local15 != null; local15 = (Class1_Sub1_Sub8_Sub4) Static24.aClass22_6.method519()) {
			if (local15.anInt1981 != Static82.anInt2165 || local15.aBoolean111) {
				local15.method1825();
			} else if (Static27.anInt768 >= local15.anInt1988) {
				local15.method1414(Static59.anInt1992);
				if (local15.aBoolean111) {
					local15.method1825();
				} else {
					Static88.aClass20_1.method456(local15.anInt1981, local15.anInt1982, local15.anInt1986, local15.anInt1977, 60, local15, 0, -1, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(Z)V")
	public static void method118() {
		Static48.method861(Static43.anInt1144);
		if (Static57.anInt2701 != -1) {
			Static48.method861(Static57.anInt2701);
		}
		Static59.anInt1992 = 0;
		Static13.aClass31_11.method996();
		Static97.anIntArray374 = Static41.method689(Static97.anIntArray374);
		Static55.method1135();
		Static106.method1848(-1, Static43.anInt1144, 0, 0, 0, 0, 503, 765);
		if (Static57.anInt2701 != -1) {
			Static106.method1848(-1, Static57.anInt2701, 0, 0, 0, 0, 503, 765);
		}
		if (Static10.aBoolean13) {
			Static97.method1699();
		} else {
			Static42.method1764();
			Static63.method1080();
		}
		try {
			@Pc(62) Graphics local62 = Static89.aCanvas1.getGraphics();
			Static13.aClass31_11.method993(0, local62, 0);
		} catch (@Pc(70) Exception local70) {
			Static89.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)V")
	public static void method120() {
		Static87.aClass31_34.method996();
		Static109.anIntArray407 = Static41.method689(Static109.anIntArray407);
	}

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "(I)V")
	public static void method123() {
		anInt140 = 0;
		Static61.anInt1459 = 0;
		Static83.anInt2216 = 0;
		Static88.anInt2328 = -1;
		Static35.anInt871 = -1;
		Static79.anInt2016 = 0;
		Static20.anInt644 = 0;
		Static98.aClass1_Sub8_Sub1_3.anInt1692 = 0;
		Static10.aBoolean13 = false;
		Static25.anInt732 = 0;
		Static97.anInt2472 = -1;
		Static80.aClass1_Sub8_Sub1_2.anInt1692 = 0;
		Static51.anInt1383 = -1;
		Static12.method278(30);
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)V")
	public static void method127() {
		aClass42_102 = null;
		aByteArrayArrayArray1 = null;
		aClass42_103 = null;
		aClass31_2 = null;
	}
}
