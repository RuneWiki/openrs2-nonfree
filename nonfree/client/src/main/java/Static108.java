import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!wc", name = "Vc", descriptor = "Lclient!jd;")
	public static Class36 aClass36_76;

	@OriginalMember(owner = "client!wc", name = "ad", descriptor = "Lclient!ta;")
	public static Class36_Sub1 aClass36_Sub1_24;

	@OriginalMember(owner = "client!wc", name = "dd", descriptor = "[I")
	public static int[] anIntArray370;

	@OriginalMember(owner = "client!wc", name = "Pc", descriptor = "[Z")
	public static boolean[] aBooleanArray17 = new boolean[5];

	@OriginalMember(owner = "client!wc", name = "Zc", descriptor = "Lclient!ke;")
	private static Class39 aClass39_1319 = Static2.method66("Invalid loginserver requested)3");

	@OriginalMember(owner = "client!wc", name = "Qc", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1314 = aClass39_1319;

	@OriginalMember(owner = "client!wc", name = "Rc", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1315 = Static2.method66("::clientdrop");

	@OriginalMember(owner = "client!wc", name = "Sc", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1316 = Static2.method66("Willkommen auf RuneScape");

	@OriginalMember(owner = "client!wc", name = "Tc", descriptor = "Z")
	public static boolean aBoolean137 = false;

	@OriginalMember(owner = "client!wc", name = "Xc", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1317 = Static2.method66("m-Ochte mit Ihnen handeln)3");

	@OriginalMember(owner = "client!wc", name = "Yc", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1318 = Static2.method66("(U");

	@OriginalMember(owner = "client!wc", name = "bd", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1320 = Static2.method66("mapfunction");

	@OriginalMember(owner = "client!wc", name = "fd", descriptor = "I")
	public static int anInt2946 = 0;

	@OriginalMember(owner = "client!wc", name = "gd", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1321 = Static2.method66("p11_full");

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!jd;I)I")
	public static int method2074(@OriginalArg(0) Class36 arg0) {
		@Pc(10) int local10 = 0;
		if (arg0.method1769(Static9.aClass39_84, Static42.aClass39_537)) {
			local10++;
		}
		if (arg0.method1769(Static9.aClass39_84, Static29.aClass39_384)) {
			local10++;
		}
		if (arg0.method1769(Static9.aClass39_84, Static101.aClass39_1253)) {
			local10++;
		}
		if (arg0.method1769(Static9.aClass39_84, Static88.aClass39_481)) {
			local10++;
		}
		if (arg0.method1769(Static9.aClass39_84, Static22.aClass39_297)) {
			local10++;
		}
		if (arg0.method1769(Static9.aClass39_84, Static86.aClass39_1057)) {
			local10++;
		}
		if (arg0.method1769(Static9.aClass39_84, Static67.aClass39_870)) {
			local10++;
		}
		if (arg0.method1769(Static9.aClass39_84, Static41.aClass39_519)) {
			local10++;
		}
		if (arg0.method1769(Static9.aClass39_84, Static16.aClass39_246)) {
			local10++;
		}
		if (arg0.method1769(Static9.aClass39_84, Static100.aClass39_1244)) {
			local10++;
		}
		if (arg0.method1769(Static9.aClass39_84, Static84.aClass39_1298)) {
			local10++;
		}
		if (arg0.method1769(Static9.aClass39_84, Static19.aClass39_283)) {
			local10++;
		}
		if (arg0.method1769(Static9.aClass39_84, Static82.aClass39_1001)) {
			local10++;
		}
		if (arg0.method1769(Static9.aClass39_84, Static93.aClass39_1124)) {
			local10++;
		}
		if (arg0.method1769(Static9.aClass39_84, Static2.aClass39_35)) {
			local10++;
		}
		if (arg0.method1769(Static9.aClass39_84, Static67.aClass39_869)) {
			local10++;
		}
		if (arg0.method1769(Static9.aClass39_84, Static39.aClass39_505)) {
			local10++;
		}
		if (arg0.method1769(Static9.aClass39_84, Static55.aClass39_696)) {
			local10++;
		}
		if (arg0.method1769(Static9.aClass39_84, Static89.aClass39_1071)) {
			local10++;
		}
		return local10;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILjava/lang/Throwable;Ljava/lang/String;)V")
	public static void method2075(@OriginalArg(1) Throwable arg0, @OriginalArg(2) String arg1) {
		try {
			@Pc(11) String local11 = "";
			if (arg0 != null) {
				local11 = Static17.method394(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local11 = local11 + " | ";
				}
				local11 = local11 + arg1;
			}
			System.out.println("Error: " + local11);
			local11 = local11.replace(':', '.');
			local11 = local11.replace('@', '_');
			local11 = local11.replace('&', '_');
			local11 = local11.replace('#', '_');
			@Pc(101) Class19 local101 = Static20.aClass12_2.method323(new URL(Static20.aClass12_2.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static16.anInt471 + "&u=" + Static63.aLong49 + "&v1=" + Static14.aString6 + "&v2=" + Static14.aString1 + "&e=" + local11));
			while (local101.anInt799 == 0) {
				Static51.method1782(1L);
			}
			if (local101.anInt799 == 1) {
				@Pc(122) DataInputStream local122 = (DataInputStream) local101.anObject3;
				local122.read();
				local122.close();
			}
		} catch (@Pc(129) Exception local129) {
		}
	}

	@OriginalMember(owner = "client!wc", name = "g", descriptor = "(B)V")
	public static void method2076() {
		aClass39_1314 = null;
		aClass39_1315 = null;
		aClass36_Sub1_24 = null;
		aClass39_1320 = null;
		aClass39_1316 = null;
		aBooleanArray17 = null;
		aClass39_1319 = null;
		anIntArray370 = null;
		aClass36_76 = null;
		aClass39_1317 = null;
		aClass39_1321 = null;
		aClass39_1318 = null;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZZI)I")
	public static int method2077() {
		return Static76.anInt2105 + Static101.anInt2761;
	}
}
