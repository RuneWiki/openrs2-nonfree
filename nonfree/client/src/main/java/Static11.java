import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!cc", name = "db", descriptor = "Lclient!oa;")
	public static Class9 aClass9_5;

	@OriginalMember(owner = "client!cc", name = "mb", descriptor = "I")
	public static int anInt509;

	@OriginalMember(owner = "client!cc", name = "tb", descriptor = "[Lclient!hc;")
	public static Class2_Sub1_Sub3_Sub3[] aClass2_Sub1_Sub3_Sub3Array1;

	@OriginalMember(owner = "client!cc", name = "Ib", descriptor = "[Lclient!da;")
	public static Class2_Sub1_Sub3_Sub2[] aClass2_Sub1_Sub3_Sub2Array3;

	@OriginalMember(owner = "client!cc", name = "Jb", descriptor = "Lclient!cc;")
	public static Class11_Sub1 aClass11_Sub1_1;

	@OriginalMember(owner = "client!cc", name = "Mb", descriptor = "Lclient!oa;")
	public static Class9 aClass9_6;

	@OriginalMember(owner = "client!cc", name = "eb", descriptor = "[B")
	public static byte[] aByteArray8 = new byte[520];

	@OriginalMember(owner = "client!cc", name = "hb", descriptor = "Lclient!lc;")
	public static Class31 aClass31_163 = Static56.method1206("Fps:");

	@OriginalMember(owner = "client!cc", name = "jb", descriptor = "Lclient!nb;")
	public static Class36 aClass36_1 = new Class36();

	@OriginalMember(owner = "client!cc", name = "nb", descriptor = "I")
	public static int anInt510 = 0;

	@OriginalMember(owner = "client!cc", name = "rb", descriptor = "Lclient!lc;")
	public static Class31 aClass31_164 = Static56.method1206("slide:");

	@OriginalMember(owner = "client!cc", name = "ub", descriptor = "Lclient!lc;")
	public static Class31 aClass31_165 = Static56.method1206("hitmarks");

	@OriginalMember(owner = "client!cc", name = "vb", descriptor = "I")
	public static int anInt515 = 0;

	@OriginalMember(owner = "client!cc", name = "wb", descriptor = "Lclient!lc;")
	public static Class31 aClass31_166 = Static56.method1206("Unable to connect)3");

	@OriginalMember(owner = "client!cc", name = "xb", descriptor = "I")
	public static int anInt516 = 0;

	@OriginalMember(owner = "client!cc", name = "yb", descriptor = "Lclient!lc;")
	public static Class31 aClass31_167 = Static56.method1206("mapedge");

	@OriginalMember(owner = "client!cc", name = "Kb", descriptor = "[I")
	public static int[] anIntArray75 = new int[1000];

	@OriginalMember(owner = "client!cc", name = "Lb", descriptor = "Lclient!lc;")
	public static Class31 aClass31_168 = Static56.method1206(" @lre@");

	@OriginalMember(owner = "client!cc", name = "Nb", descriptor = "I")
	public static int anInt524 = -1;

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "(I)V")
	public static void method353() {
		aClass31_163 = null;
		aClass2_Sub1_Sub3_Sub2Array3 = null;
		aClass31_167 = null;
		aClass11_Sub1_1 = null;
		aClass2_Sub1_Sub3_Sub3Array1 = null;
		aClass36_1 = null;
		aClass31_168 = null;
		aClass31_165 = null;
		aClass9_5 = null;
		aClass31_166 = null;
		aByteArray8 = null;
		aClass31_164 = null;
		aClass9_6 = null;
		anIntArray75 = null;
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(Z)V")
	public static void method354() {
		Static9.aClass17_13.method782();
		Static10.aClass17_15.method782();
	}

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "(I)V")
	public static void method355() {
		Static99.anInt2672 = 0;
		Static64.anInt624 = 0;
		Static53.method1154();
		Static62.method1313();
		Static106.method1750();
		@Pc(28) int local28;
		for (@Pc(22) int local22 = 0; local22 < Static99.anInt2672; local22++) {
			local28 = Static77.anIntArray318[local22];
			if (Static93.aClass2_Sub1_Sub4_Sub6_Sub2Array1[local28].anInt2030 != Static49.anInt2694) {
				Static93.aClass2_Sub1_Sub4_Sub6_Sub2Array1[local28].aClass2_Sub1_Sub8_1 = null;
				Static93.aClass2_Sub1_Sub4_Sub6_Sub2Array1[local28] = null;
			}
		}
		if (Static87.anInt2339 != Static3.aClass2_Sub6_Sub1_1.anInt952) {
			throw new RuntimeException("gnp1 pos:" + Static3.aClass2_Sub6_Sub1_1.anInt952 + " psize:" + Static87.anInt2339);
		}
		for (local28 = 0; local28 < Static49.anInt2696; local28++) {
			if (Static93.aClass2_Sub1_Sub4_Sub6_Sub2Array1[Static57.anIntArray383[local28]] == null) {
				throw new RuntimeException("gnp2 pos:" + local28 + " size:" + Static49.anInt2696);
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "(ZI)V")
	public static void method357(@OriginalArg(1) int arg0) {
		Static101.anInt2740 = arg0;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method358(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + arg0);
		try {
			@Pc(24) String local24 = arg0.replace(':', '.');
			@Pc(29) String local29 = local24.replace('@', '_');
			@Pc(34) String local34 = local29.replace('&', '_');
			@Pc(39) String local39 = local34.replace('#', '_');
			@Pc(72) Class59 local72 = Static106.aClass51_4.method1464(new URL(Static106.aClass51_4.anApplet2.getCodeBase(), "reporterror.ws?c=" + Static74.anInt2236 + "&u=" + Static59.aLong54 + "&v1=" + Static84.aString3 + "&v2=" + Static84.aString1 + "&e=" + local39));
			while (local72.anInt2608 == 0) {
				Static91.method1548(1L);
			}
			if (local72.anInt2608 == 1) {
				@Pc(90) DataInputStream local90 = (DataInputStream) local72.anObject5;
				local90.read();
				local90.close();
			}
		} catch (@Pc(97) Exception local97) {
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIIII)V")
	public static void method360(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static101.aClass2_Sub1_Sub3_Sub1Array5[0].method291(arg3, arg2);
		Static101.aClass2_Sub1_Sub3_Sub1Array5[1].method291(arg3, arg2 + arg1 - 16);
		Static81.method1646(arg3, arg2 + 16, 16, arg1 - 32, Static103.anInt2763);
		@Pc(46) int local46 = arg1 * (arg1 - 32) / arg0;
		if (local46 < 8) {
			local46 = 8;
		}
		@Pc(64) int local64 = arg4 * (arg1 - local46 - 32) / (arg0 - arg1);
		Static81.method1646(arg3, arg2 + local64 + 16, 16, local46, Static92.anInt1563);
		Static81.method1639(arg3, arg2 + local64 + 16, local46, Static9.anInt321);
		Static81.method1639(arg3 + 1, local64 + 16 + arg2, local46, Static9.anInt321);
		Static81.method1643(arg3, local64 + arg2 + 16, 16, Static9.anInt321);
		Static81.method1643(arg3, arg2 + local64 + 17, 16, Static9.anInt321);
		Static81.method1639(arg3 + 15, arg2 + 16 + local64, local46, Static31.anInt1274);
		Static81.method1639(arg3 + 14, local64 + 17 + arg2, local46 - 1, Static31.anInt1274);
		Static81.method1643(arg3, local64 + arg2 + local46 + 15, 16, Static31.anInt1274);
		Static81.method1643(arg3 + 1, local46 + local64 + 14 + arg2, 15, Static31.anInt1274);
	}
}
