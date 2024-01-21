import java.awt.FontMetrics;
import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "Z")
	public static boolean aBoolean23;

	@OriginalMember(owner = "client!client", name = "Fb", descriptor = "Ljava/awt/FontMetrics;")
	public static FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!client", name = "Gb", descriptor = "I")
	public static int anInt390;

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "Lclient!hb;")
	public static Class27 aClass27_187 = Static87.method1648("Mio");

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "Lclient!fc;")
	public static Class21 aClass21_13 = new Class21(64);

	@OriginalMember(owner = "client!client", name = "wb", descriptor = "Lclient!hb;")
	private static Class27 aClass27_190 = Static87.method1648("RuneScape is loading )2 please wait)3)3)3");

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "Lclient!hb;")
	public static Class27 aClass27_188 = aClass27_190;

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
	public static int anInt380 = 0;

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "Lclient!hb;")
	public static Class27 aClass27_189 = null;

	@OriginalMember(owner = "client!client", name = "xb", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray1 = new int[4][13][13];

	@OriginalMember(owner = "client!client", name = "yb", descriptor = "Lclient!hb;")
	public static Class27 aClass27_191 = Static87.method1648("sideicons");

	@OriginalMember(owner = "client!client", name = "Ab", descriptor = "Lclient!hb;")
	public static Class27 aClass27_192 = Static87.method1648("");

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	public static void method292() {
		for (@Pc(7) int local7 = -1; local7 < Static104.anInt2718; local7++) {
			@Pc(14) int local14;
			if (local7 == -1) {
				local14 = 2047;
			} else {
				local14 = Static99.anIntArray387[local7];
			}
			@Pc(24) Class3_Sub3_Sub1_Sub4_Sub2 local24 = Static71.aClass3_Sub3_Sub1_Sub4_Sub2Array1[local14];
			if (local24 != null) {
				Static68.method1246(local24, 1);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;B)V")
	public static void method293(@OriginalArg(0) String arg0, @OriginalArg(1) Throwable arg1) {
		try {
			@Pc(8) String local8 = "";
			if (arg1 != null) {
				local8 = Static40.method874(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local8 = local8 + " | ";
				}
				local8 = local8 + arg0;
			}
			System.out.println("Error: " + local8);
			local8 = local8.replace(':', '.');
			local8 = local8.replace('@', '_');
			local8 = local8.replace('&', '_');
			local8 = local8.replace('#', '_');
			@Pc(98) Class64 local98 = Static35.aClass32_2.method953(new URL(Static35.aClass32_2.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static79.anInt819 + "&u=" + Static93.aLong71 + "&v1=" + Static49.aString2 + "&v2=" + Static49.aString6 + "&e=" + local8));
			while (local98.anInt2678 == 0) {
				Static41.method888(1L);
			}
			if (local98.anInt2678 == 1) {
				@Pc(119) DataInputStream local119 = (DataInputStream) local98.anObject6;
				local119.read();
				local119.close();
			}
		} catch (@Pc(126) Exception local126) {
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	public static void method295() {
		aClass27_187 = null;
		aClass21_13 = null;
		aClass27_192 = null;
		aClass27_190 = null;
		aFontMetrics1 = null;
		aClass27_189 = null;
		aClass27_191 = null;
		aClass27_188 = null;
		anIntArrayArrayArray1 = null;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)Lclient!ua;")
	public static Class3_Sub3_Sub14 method298(@OriginalArg(1) int arg0) {
		@Pc(6) Class3_Sub3_Sub14 local6 = (Class3_Sub3_Sub14) Static32.aClass21_15.method658((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(25) byte[] local25 = Static67.aClass54_24.method1615(12, arg0);
		local6 = new Class3_Sub3_Sub14();
		if (local25 != null) {
			local6.method1795(new Class3_Sub11(local25));
		}
		local6.method1800();
		Static32.aClass21_15.method660(local6, (long) arg0);
		return local6;
	}
}
