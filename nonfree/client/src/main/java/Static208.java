import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!we", name = "K", descriptor = "[Lclient!qc;")
	public static Class3_Sub3_Sub2_Sub2[] aClass3_Sub3_Sub2_Sub2Array7;

	@OriginalMember(owner = "client!we", name = "N", descriptor = "[Lclient!ah;")
	public static Class3_Sub3_Sub2_Sub1[] aClass3_Sub3_Sub2_Sub1Array10;

	@OriginalMember(owner = "client!we", name = "kb", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!we", name = "y", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1234 = Static193.method3027("Ung-Ultige Session)2ID)3");

	@OriginalMember(owner = "client!we", name = "B", descriptor = "I")
	public static int anInt2597 = 0;

	@OriginalMember(owner = "client!we", name = "W", descriptor = "Lclient!bd;")
	public static final Class10 aClass10_70 = new Class10();

	@OriginalMember(owner = "client!we", name = "db", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1236 = Static193.method3027("auf einer freien Welt zu spielen)3");

	@OriginalMember(owner = "client!we", name = "sb", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1237 = Static193.method3027("Suche nach Updates )2 ");

	@OriginalMember(owner = "client!we", name = "xb", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1238 = Static193.method3027("null");

	@OriginalMember(owner = "client!we", name = "Jb", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_1239 = Static193.method3027("Loaded input handler");

	@OriginalMember(owner = "client!we", name = "Kb", descriptor = "Lclient!oc;")
	public static Class70 aClass70_1240 = aClass70_1239;

	@OriginalMember(owner = "client!we", name = "Lb", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1241 = Static193.method3027("scrollen:");

	@OriginalMember(owner = "client!we", name = "Mb", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1242 = Static193.method3027("<col=80ff00>");

	@OriginalMember(owner = "client!we", name = "Nb", descriptor = "I")
	public static int anInt2643 = 0;

	@OriginalMember(owner = "client!we", name = "Qb", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_1244 = Static193.method3027("Loaded config");

	@OriginalMember(owner = "client!we", name = "Ob", descriptor = "Lclient!oc;")
	public static Class70 aClass70_1243 = aClass70_1244;

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(I)V")
	public static void method1855() {
		while (true) {
			if (Static48.aClass3_Sub4_Sub1_43.method1303(Static192.anInt3908) >= 27) {
				@Pc(14) int local14 = Static48.aClass3_Sub4_Sub1_43.method1299(15);
				if (local14 != 32767) {
					@Pc(21) boolean local21 = false;
					if (Static8.aClass26_Sub2_Sub2Array1[local14] == null) {
						local21 = true;
						Static8.aClass26_Sub2_Sub2Array1[local14] = new Class26_Sub2_Sub2();
					}
					@Pc(37) Class26_Sub2_Sub2 local37 = Static8.aClass26_Sub2_Sub2Array1[local14];
					Static80.anIntArray85[Static201.anInt4110++] = local14;
					local37.anInt2645 = Static184.anInt3760;
					@Pc(55) int local55 = Static155.anIntArray232[Static48.aClass3_Sub4_Sub1_43.method1299(3)];
					if (local21) {
						local37.anInt2644 = local37.anInt2605 = local55;
					}
					local37.aClass3_Sub3_Sub24_1 = Static37.method2344(Static48.aClass3_Sub4_Sub1_43.method1299(14));
					@Pc(76) int local76 = Static48.aClass3_Sub4_Sub1_43.method1299(1);
					if (local76 == 1) {
						Static108.anIntArray130[Static134.anInt2682++] = local14;
					}
					@Pc(92) int local92 = Static48.aClass3_Sub4_Sub1_43.method1299(5);
					@Pc(97) int local97 = Static48.aClass3_Sub4_Sub1_43.method1299(1);
					if (local92 > 15) {
						local92 -= 32;
					}
					@Pc(108) int local108 = Static48.aClass3_Sub4_Sub1_43.method1299(5);
					local37.anInt2594 = local37.aClass3_Sub3_Sub24_1.anInt3966;
					local37.anInt2609 = local37.aClass3_Sub3_Sub24_1.anInt3962;
					local37.anInt2617 = local37.aClass3_Sub3_Sub24_1.anInt3968;
					local37.anInt2633 = local37.aClass3_Sub3_Sub24_1.anInt3953;
					local37.anInt2625 = local37.aClass3_Sub3_Sub24_1.anInt3964;
					local37.anInt2616 = local37.aClass3_Sub3_Sub24_1.anInt3956;
					if (local108 > 15) {
						local108 -= 32;
					}
					local37.anInt2603 = local37.aClass3_Sub3_Sub24_1.anInt3960;
					local37.anInt2590 = local37.aClass3_Sub3_Sub24_1.anInt3972;
					local37.anInt2604 = local37.aClass3_Sub3_Sub24_1.anInt3954;
					if (local37.anInt2616 == 0) {
						local37.anInt2605 = 0;
					}
					local37.method1858(local92 + Static144.aClass26_Sub2_Sub1_1.anIntArray185[0], local97 == 1, Static144.aClass26_Sub2_Sub1_1.anIntArray182[0] + local108);
					continue;
				}
			}
			Static48.aClass3_Sub4_Sub1_43.method1305();
			return;
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(II)Z")
	public static boolean method1859(@OriginalArg(0) int arg0) {
		return (arg0 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V")
	public static void method1860(@OriginalArg(0) String arg0, @OriginalArg(1) Throwable arg1) {
		try {
			@Pc(5) String local5 = "";
			if (arg1 != null) {
				local5 = Static172.method2606(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local5 = local5 + " | ";
				}
				local5 = local5 + arg0;
			}
			System.out.println("Error: " + local5);
			local5 = local5.replace(':', '.');
			local5 = local5.replace('@', '_');
			local5 = local5.replace('&', '_');
			local5 = local5.replace('#', '_');
			if (Static189.aClass47_4.anApplet1 != null) {
				@Pc(105) Class29 local105 = Static189.aClass47_4.method1360(new URL(Static189.aClass47_4.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static133.anInt2649 + "&u=" + Static74.aLong44 + "&v1=" + Static94.aString2 + "&v2=" + Static94.aString4 + "&e=" + local5));
				while (local105.anInt973 == 0) {
					Static119.method1720(1L);
				}
				if (local105.anInt973 == 1) {
					@Pc(120) DataInputStream local120 = (DataInputStream) local105.anObject2;
					local120.read();
					local120.close();
				}
			}
		} catch (@Pc(127) Exception local127) {
		}
	}
}
