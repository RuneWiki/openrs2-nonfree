import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!bd", name = "v", descriptor = "Lclient!rb;")
	public static Class55 aClass55_4;

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "Lclient!gd;")
	private static Class23 aClass23_173 = Static15.method178("RuneScape is loading )2 please wait)3)3)3");

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "Lclient!gd;")
	public static Class23 aClass23_174 = Static15.method178("Der Anmelde)2Server ist offline)3");

	@OriginalMember(owner = "client!bd", name = "e", descriptor = "I")
	public static int anInt211 = 0;

	@OriginalMember(owner = "client!bd", name = "m", descriptor = "[[B")
	public static byte[][] aByteArrayArray1 = new byte[250][];

	@OriginalMember(owner = "client!bd", name = "o", descriptor = "Lclient!gd;")
	public static Class23 aClass23_175 = aClass23_173;

	@OriginalMember(owner = "client!bd", name = "p", descriptor = "Lclient!gd;")
	public static Class23 aClass23_176 = Static15.method178("m-Ochte mit Ihnen handeln)3");

	@OriginalMember(owner = "client!bd", name = "r", descriptor = "Lclient!ba;")
	public static Class5 aClass5_8 = new Class5(64);

	@OriginalMember(owner = "client!bd", name = "t", descriptor = "Lclient!gd;")
	private static Class23 aClass23_178 = Static15.method178("Connecting to update server");

	@OriginalMember(owner = "client!bd", name = "s", descriptor = "Lclient!gd;")
	public static Class23 aClass23_177 = aClass23_178;

	@OriginalMember(owner = "client!bd", name = "w", descriptor = "I")
	public static int anInt219 = 0;

	@OriginalMember(owner = "client!bd", name = "x", descriptor = "Lclient!ba;")
	public static Class5 aClass5_9 = new Class5(500);

	@OriginalMember(owner = "client!bd", name = "y", descriptor = "Lclient!gd;")
	public static Class23 aClass23_179 = Static15.method178("Benutzeroberfl-=che geladen)3");

	@OriginalMember(owner = "client!bd", name = "B", descriptor = "Lclient!gd;")
	private static Class23 aClass23_181 = Static15.method178("glow2:");

	@OriginalMember(owner = "client!bd", name = "A", descriptor = "Lclient!gd;")
	public static Class23 aClass23_180 = aClass23_181;

	@OriginalMember(owner = "client!bd", name = "C", descriptor = "I")
	public static final int anInt221 = 5063219;

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ZBII[B)V")
	public static void method114(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3) {
		if (Static97.aClass11_1 == null) {
			return;
		}
		if (Static19.anInt494 >= 0) {
			Static87.anInt2854 = arg1;
			if (Static19.anInt494 == 0) {
				anInt219 = 1;
			} else {
				@Pc(27) int local27 = Static106.method1801(Static19.anInt494);
				@Pc(31) int local31 = local27 - Static5.anInt144;
				anInt219 = (local31 + 3600) / arg1;
				if (anInt219 < 1) {
					anInt219 = 1;
				}
			}
			Static42.aByteArray7 = arg3;
			Static26.aBoolean48 = arg0;
			Static95.anInt2488 = arg2;
		} else if (anInt219 == 0) {
			Static41.method891(arg3, arg0, arg2);
		} else {
			Static42.aByteArray7 = arg3;
			Static26.aBoolean48 = arg0;
			Static95.anInt2488 = arg2;
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
	public static void method115() {
		aClass23_173 = null;
		aClass23_174 = null;
		aClass23_178 = null;
		aClass23_175 = null;
		aClass5_8 = null;
		aClass23_179 = null;
		aClass55_4 = null;
		aClass23_181 = null;
		aClass5_9 = null;
		aClass23_177 = null;
		aByteArrayArray1 = null;
		aClass23_176 = null;
		aClass23_180 = null;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)V")
	public static void method116() {
		try {
			@Pc(6) Graphics local6 = Static26.aCanvas1.getGraphics();
			Static83.aClass34_64.method1144(205, local6, 553);
		} catch (@Pc(16) Exception local16) {
			Static26.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(III)I")
	public static int method117(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class1_Sub14 local10 = (Class1_Sub14) Static7.aClass14_2.method343((long) arg0);
		if (local10 == null) {
			return -1;
		} else if (arg1 >= 0 && arg1 < local10.anIntArray407.length) {
			return local10.anIntArray407[arg1];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIZ)Lclient!gd;")
	public static Class23 method118(@OriginalArg(0) int arg0) {
		return Static112.method1917(true, arg0);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)Lclient!gd;")
	public static Class23 method119(@OriginalArg(1) int arg0) {
		return Static17.method233(new Class23[] { Static19.method274(arg0 >> 24 & 0xFF), Static39.aClass23_716, Static19.method274(arg0 >> 16 & 0xFF), Static39.aClass23_716, Static19.method274(arg0 >> 8 & 0xFF), Static39.aClass23_716, Static19.method274(arg0 & 0xFF) });
	}
}
