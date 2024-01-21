import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!ee", name = "h", descriptor = "Lclient!b;")
	public static Class5 aClass5_2;

	@OriginalMember(owner = "client!ee", name = "B", descriptor = "I")
	public static int anInt698;

	@OriginalMember(owner = "client!ee", name = "N", descriptor = "Lclient!de;")
	public static Class1_Sub1_Sub4_Sub1 aClass1_Sub1_Sub4_Sub1_13;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "Lclient!kd;")
	public static Class39 aClass39_338 = Static108.method1915("chatback");

	@OriginalMember(owner = "client!ee", name = "w", descriptor = "Lclient!kd;")
	private static Class39 aClass39_341 = Static108.method1915("Enter name:");

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "Lclient!kd;")
	public static Class39 aClass39_339 = aClass39_341;

	@OriginalMember(owner = "client!ee", name = "S", descriptor = "Lclient!kd;")
	private static Class39 aClass39_344 = Static108.method1915("skill)2");

	@OriginalMember(owner = "client!ee", name = "g", descriptor = "Lclient!kd;")
	public static Class39 aClass39_340 = aClass39_344;

	@OriginalMember(owner = "client!ee", name = "j", descriptor = "I")
	public static int anInt684 = 0;

	@OriginalMember(owner = "client!ee", name = "l", descriptor = "Lclient!ee;")
	public static Applet_Sub1 anApplet_Sub1_2 = null;

	@OriginalMember(owner = "client!ee", name = "s", descriptor = "I")
	public static int anInt692 = 0;

	@OriginalMember(owner = "client!ee", name = "x", descriptor = "Lclient!kd;")
	public static Class39 aClass39_342 = Static108.method1915("Ihr Charakter)2Profil wird in:");

	@OriginalMember(owner = "client!ee", name = "A", descriptor = "Lclient!kd;")
	public static Class39 aClass39_343 = Static108.method1915(" zuerst von Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!ee", name = "D", descriptor = "Z")
	public static boolean aBoolean60 = false;

	@OriginalMember(owner = "client!ee", name = "Q", descriptor = "[I")
	public static int[] anIntArray105 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V")
	public static void method386() {
		anIntArray105 = null;
		aClass39_344 = null;
		aClass39_340 = null;
		aClass39_342 = null;
		aClass39_339 = null;
		aClass39_338 = null;
		aClass39_341 = null;
		aClass5_2 = null;
		aClass1_Sub1_Sub4_Sub1_13 = null;
		aClass39_343 = null;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IZI)Lclient!a;")
	public static Class1_Sub1_Sub1 method393(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub1_Sub1 local8 = Static41.method2106(arg0);
		if (arg1 == -1) {
			return local8;
		} else if (local8 == null || local8.aClass1_Sub1_Sub1Array1 == null || local8.aClass1_Sub1_Sub1Array1.length <= arg1) {
			return null;
		} else {
			return local8.aClass1_Sub1_Sub1Array1[arg1];
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "([BB)[B")
	public static byte[] method395(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(13) byte[] local13 = new byte[local6];
		Static136.method1939(arg0, 0, local13, 0, local6);
		return local13;
	}

	@OriginalMember(owner = "client!ee", name = "h", descriptor = "(I)V")
	public static void method401() {
		Static79.aClass1_Sub18_Sub1_3.method2193();
		@Pc(15) int local15 = Static79.aClass1_Sub18_Sub1_3.method2199(1);
		if (local15 == 0) {
			return;
		}
		@Pc(26) int local26 = Static79.aClass1_Sub18_Sub1_3.method2199(2);
		if (local26 == 0) {
			Static117.anIntArray460[Static94.anInt2224++] = 2047;
			return;
		}
		@Pc(45) int local45;
		@Pc(55) int local55;
		if (local26 == 1) {
			local45 = Static79.aClass1_Sub18_Sub1_3.method2199(3);
			Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.method1799(local45, false);
			local55 = Static79.aClass1_Sub18_Sub1_3.method2199(1);
			if (local55 == 1) {
				Static117.anIntArray460[Static94.anInt2224++] = 2047;
			}
			return;
		}
		@Pc(99) int local99;
		if (local26 == 2) {
			local45 = Static79.aClass1_Sub18_Sub1_3.method2199(3);
			Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.method1799(local45, true);
			local55 = Static79.aClass1_Sub18_Sub1_3.method2199(3);
			Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.method1799(local55, true);
			local99 = Static79.aClass1_Sub18_Sub1_3.method2199(1);
			if (local99 == 1) {
				Static117.anIntArray460[Static94.anInt2224++] = 2047;
			}
		} else if (local26 == 3) {
			local45 = Static79.aClass1_Sub18_Sub1_3.method2199(1);
			local55 = Static79.aClass1_Sub18_Sub1_3.method2199(1);
			if (local55 == 1) {
				Static117.anIntArray460[Static94.anInt2224++] = 2047;
			}
			local99 = Static79.aClass1_Sub18_Sub1_3.method2199(7);
			@Pc(149) int local149 = Static79.aClass1_Sub18_Sub1_3.method2199(7);
			Static9.anInt2983 = Static79.aClass1_Sub18_Sub1_3.method2199(2);
			Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.method1803(local149, local99, local45 == 1);
		}
	}
}
