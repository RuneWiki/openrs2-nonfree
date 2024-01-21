import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!ka", name = "D", descriptor = "I")
	public static int anInt2591;

	@OriginalMember(owner = "client!ka", name = "O", descriptor = "I")
	public static int anInt2601;

	@OriginalMember(owner = "client!ka", name = "Q", descriptor = "I")
	public static int anInt2603;

	@OriginalMember(owner = "client!ka", name = "R", descriptor = "I")
	public static int anInt2604;

	@OriginalMember(owner = "client!ka", name = "L", descriptor = "[I")
	public static int[] anIntArray316 = new int[32768];

	@OriginalMember(owner = "client!ka", name = "M", descriptor = "I")
	public static int anInt2599 = 127;

	@OriginalMember(owner = "client!ka", name = "S", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray9 = new int[4][13][13];

	@OriginalMember(owner = "client!ka", name = "T", descriptor = "[I")
	public static int[] anIntArray317 = new int[500];

	@OriginalMember(owner = "client!ka", name = "V", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1272 = Static14.method2017("Ladevorgang )2 bitte warten Sie)3");

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "(B)V")
	public static void method1831() {
		try {
			@Pc(13) Graphics local13 = Static107.aCanvas1.getGraphics();
			Static113.aClass14_39.method1470(17, local13, 357);
		} catch (@Pc(21) Exception local21) {
			Static107.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZLclient!ac;Lclient!ac;B)V")
	public static void method1833(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class3 arg1, @OriginalArg(2) Class3 arg2) {
		Static101.aBoolean121 = arg0;
		Static46.aClass3_12 = arg2;
		Static117.aClass3_19 = arg1;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!df;II)V")
	public static void method1834(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub1_Sub1_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static20.aClass14_7.method1472();
		Static10.aClass2_Sub1_Sub1_Sub1_3.method97(0, 0);
		arg1.method457(Static52.aClass36_696, 55, 28, 16777215, true);
		if (arg2 == 0) {
			arg1.method457(Static109.aClass36_1394, 55, 41, 65280, true);
		}
		if (arg2 == 1) {
			arg1.method457(Static63.aClass36_792, 55, 41, 16776960, true);
		}
		if (arg2 == 2) {
			arg1.method457(Static48.aClass36_631, 55, 41, 16711680, true);
		}
		if (arg2 == 3) {
			arg1.method457(Static47.aClass36_627, 55, 41, 65535, true);
		}
		arg1.method457(Static113.aClass36_1444, 184, 28, 16777215, true);
		if (arg3 == 0) {
			arg1.method457(Static109.aClass36_1394, 184, 41, 65280, true);
		}
		if (arg3 == 1) {
			arg1.method457(Static63.aClass36_792, 184, 41, 16776960, true);
		}
		if (arg3 == 2) {
			arg1.method457(Static48.aClass36_631, 184, 41, 16711680, true);
		}
		arg1.method457(Static13.aClass36_176, 324, 28, 16777215, true);
		if (arg0 == 0) {
			arg1.method457(Static109.aClass36_1394, 324, 41, 65280, true);
		}
		if (arg0 == 1) {
			arg1.method457(Static63.aClass36_792, 324, 41, 16776960, true);
		}
		if (arg0 == 2) {
			arg1.method457(Static48.aClass36_631, 324, 41, 16711680, true);
		}
		arg1.method465(Static20.aClass36_268, 417, 17, 85, 25, 16777215, true, 1, 1, 0);
		try {
			@Pc(154) Graphics local154 = Static107.aCanvas1.getGraphics();
			Static20.aClass14_7.method1470(0, local154, 453);
		} catch (@Pc(162) Exception local162) {
			Static107.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IBLclient!je;)V")
	public static void method1837(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub1 arg1) {
		if (Static79.aClass2_Sub12_4 == null) {
			Static6.method147(255, (byte) 0, 255, true, null, 0);
			Static95.aClass3_Sub1Array1[arg0] = arg1;
		} else {
			Static79.aClass2_Sub12_4.anInt1939 = arg0 * 4 + 5;
			@Pc(16) int local16 = Static79.aClass2_Sub12_4.method1412();
			arg1.method954(local16);
		}
	}

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "(I)V")
	public static void method1838() {
		if (Static41.aClass29_1 == null) {
			return;
		}
		Static112.method2033();
		if (Static38.anInt969 > 0) {
			Static41.aClass29_1.method1934(256);
			Static38.anInt969 = 0;
		}
		Static41.aClass29_1.method1936();
		Static41.aClass29_1 = null;
	}

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "(B)V")
	public static void method1840() {
		System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german]");
		System.exit(1);
	}

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "(I)I")
	public static int method1841(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static84.anIntArray247[arg0];
		@Pc(11) int local11 = (local3 * Static53.anInt1458 >> 8) * local3;
		return (int) (Math.sqrt((double) local11) + 0.5D);
	}

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "(B)V")
	public static void method1843() {
		anIntArray317 = null;
		aClass36_1272 = null;
		anIntArrayArrayArray9 = null;
		anIntArray316 = null;
	}
}
