import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!md", name = "y", descriptor = "[I")
	public static int[] anIntArray202 = new int[1000];

	@OriginalMember(owner = "client!md", name = "A", descriptor = "Z")
	public static volatile boolean aBoolean83 = false;

	@OriginalMember(owner = "client!md", name = "B", descriptor = "[J")
	public static long[] aLongArray5 = new long[32];

	@OriginalMember(owner = "client!md", name = "L", descriptor = "I")
	public static int anInt1818 = 0;

	@OriginalMember(owner = "client!md", name = "T", descriptor = "Lclient!ae;")
	public static Class5 aClass5_834 = Static56.method972("overlay_multiway");

	@OriginalMember(owner = "client!md", name = "U", descriptor = "[J")
	public static long[] aLongArray6 = new long[100];

	@OriginalMember(owner = "client!md", name = "V", descriptor = "I")
	public static int anInt1824 = 0;

	@OriginalMember(owner = "client!md", name = "W", descriptor = "I")
	public static int anInt1825 = 10;

	@OriginalMember(owner = "client!md", name = "X", descriptor = "Lclient!ae;")
	public static Class5 aClass5_835 = Static56.method972("mapfunction");

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(I[B)V")
	public static void method1183(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class3_Sub6 local10 = new Class3_Sub6(arg0);
		local10.anInt2416 = arg0.length - 2;
		Static18.anInt630 = local10.method1603();
		Static56.anIntArray170 = new int[Static18.anInt630];
		Static38.aByteArrayArray6 = new byte[Static18.anInt630][];
		Static63.anIntArray375 = new int[Static18.anInt630];
		Static116.anIntArray382 = new int[Static18.anInt630];
		Static50.anIntArray157 = new int[Static18.anInt630];
		local10.anInt2416 = arg0.length - Static18.anInt630 * 8 - 7;
		Static14.anInt2882 = local10.method1603();
		Static80.anInt1994 = local10.method1603();
		@Pc(62) int local62 = (local10.method1587() & 0xFF) + 1;
		for (@Pc(64) int local64 = 0; local64 < Static18.anInt630; local64++) {
			Static50.anIntArray157[local64] = local10.method1603();
		}
		for (@Pc(82) int local82 = 0; local82 < Static18.anInt630; local82++) {
			Static63.anIntArray375[local82] = local10.method1603();
		}
		for (@Pc(100) int local100 = 0; local100 < Static18.anInt630; local100++) {
			Static56.anIntArray170[local100] = local10.method1603();
		}
		for (@Pc(118) int local118 = 0; local118 < Static18.anInt630; local118++) {
			Static116.anIntArray382[local118] = local10.method1603();
		}
		local10.anInt2416 = arg0.length + 3 - local62 * 3 - Static18.anInt630 * 8 - 7;
		Static89.anIntArray256 = new int[local62];
		for (@Pc(151) int local151 = 1; local151 < local62; local151++) {
			Static89.anIntArray256[local151] = local10.method1596();
			if (Static89.anIntArray256[local151] == 0) {
				Static89.anIntArray256[local151] = 1;
			}
		}
		local10.anInt2416 = 0;
		for (@Pc(185) int local185 = 0; local185 < Static18.anInt630; local185++) {
			@Pc(191) int local191 = Static116.anIntArray382[local185];
			@Pc(195) int local195 = Static56.anIntArray170[local185];
			@Pc(199) int local199 = local191 * local195;
			@Pc(202) byte[] local202 = new byte[local199];
			Static38.aByteArrayArray6[local185] = local202;
			@Pc(210) int local210 = local10.method1587();
			@Pc(214) int local214;
			if (local210 == 0) {
				for (local214 = 0; local214 < local199; local214++) {
					local202[local214] = local10.method1605();
				}
			} else if (local210 == 1) {
				for (local214 = 0; local214 < local195; local214++) {
					for (@Pc(239) int local239 = 0; local239 < local191; local239++) {
						local202[local195 * local239 + local214] = local10.method1605();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!mc;I)V")
	public static void method1184(@OriginalArg(0) Class3_Sub1_Sub1_Sub1 arg0) {
		arg0.aBoolean72 = false;
		@Pc(25) Class3_Sub1_Sub11 local25;
		if (arg0.anInt1568 != -1) {
			local25 = Static31.method778(arg0.anInt1568);
			if (local25 == null || local25.anIntArray221 == null) {
				arg0.anInt1568 = -1;
			} else {
				arg0.anInt1552++;
				if (arg0.anInt1571 < local25.anIntArray221.length && local25.anIntArray219[arg0.anInt1571] < arg0.anInt1552) {
					arg0.anInt1571++;
					arg0.anInt1552 = 1;
				}
				if (local25.anIntArray221.length <= arg0.anInt1571) {
					arg0.anInt1571 = 0;
					arg0.anInt1552 = 0;
				}
			}
		}
		if (arg0.anInt1538 != -1 && Static3.anInt289 >= arg0.anInt1540) {
			if (arg0.anInt1545 < 0) {
				arg0.anInt1545 = 0;
			}
			@Pc(110) int local110 = Static61.method1063(arg0.anInt1538).anInt2934;
			if (local110 == -1) {
				arg0.anInt1538 = -1;
			} else {
				@Pc(117) Class3_Sub1_Sub11 local117 = Static31.method778(local110);
				if (local117 == null || local117.anIntArray221 == null) {
					arg0.anInt1538 = -1;
				} else {
					arg0.anInt1569++;
					if (arg0.anInt1545 < local117.anIntArray221.length && arg0.anInt1569 > local117.anIntArray219[arg0.anInt1545]) {
						arg0.anInt1545++;
						arg0.anInt1569 = 1;
					}
					if (local117.anIntArray221.length <= arg0.anInt1545 && (arg0.anInt1545 < 0 || arg0.anInt1545 >= local117.anIntArray221.length)) {
						arg0.anInt1538 = -1;
					}
				}
			}
		}
		if (arg0.anInt1536 != -1 && arg0.anInt1570 <= 1) {
			local25 = Static31.method778(arg0.anInt1536);
			if (local25.anInt1933 == 1 && arg0.anInt1519 > 0 && Static3.anInt289 >= arg0.anInt1520 && Static3.anInt289 > arg0.anInt1528) {
				arg0.anInt1570 = 1;
				return;
			}
		}
		if (arg0.anInt1536 != -1 && arg0.anInt1570 == 0) {
			local25 = Static31.method778(arg0.anInt1536);
			if (local25 == null || local25.anIntArray221 == null) {
				arg0.anInt1536 = -1;
			} else {
				arg0.anInt1573++;
				if (local25.anIntArray221.length > arg0.anInt1532 && local25.anIntArray219[arg0.anInt1532] < arg0.anInt1573) {
					arg0.anInt1532++;
					arg0.anInt1573 = 1;
				}
				if (arg0.anInt1532 >= local25.anIntArray221.length) {
					arg0.anInt1557++;
					if (arg0.anInt1557 >= local25.anInt1923) {
						arg0.anInt1536 = -1;
					}
					arg0.anInt1532 -= local25.anInt1932;
					if (arg0.anInt1532 < 0 || local25.anIntArray221.length <= arg0.anInt1532) {
						arg0.anInt1536 = -1;
					}
				}
				arg0.aBoolean72 = local25.aBoolean93;
			}
		}
		if (arg0.anInt1570 > 0) {
			arg0.anInt1570--;
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V")
	public static void method1185() {
		aLongArray5 = null;
		Class3_Sub7.anIntArray203 = null;
		aLongArray6 = null;
		aClass5_834 = null;
		aClass5_835 = null;
		anIntArray202 = null;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIBI)I")
	public static int method1186(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) int local14 = arg1 & 0x3;
		if (local14 == 0) {
			return arg2;
		} else if (local14 == 1) {
			return 7 - arg0;
		} else if (local14 == 2) {
			return 7 - arg2;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Ljava/lang/Throwable;ILjava/lang/String;)V")
	public static void method1187(@OriginalArg(0) Throwable arg0, @OriginalArg(2) String arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg0 != null) {
				local7 = Static61.method1066(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg1;
			}
			System.out.println("Error: " + local7);
			local7 = local7.replace(':', '.');
			local7 = local7.replace('@', '_');
			local7 = local7.replace('&', '_');
			local7 = local7.replace('#', '_');
			@Pc(102) Class58 local102 = Static9.aClass23_1.method517(new URL(Static9.aClass23_1.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static115.anInt2974 + "&u=" + Static16.aLong15 + "&v1=" + Static26.aString3 + "&v2=" + Static26.aString6 + "&e=" + local7));
			while (local102.anInt2474 == 0) {
				Static74.method1220(1L);
			}
			if (local102.anInt2474 == 1) {
				@Pc(123) DataInputStream local123 = (DataInputStream) local102.anObject4;
				local123.read();
				local123.close();
			}
		} catch (@Pc(130) Exception local130) {
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IZZZB)Lclient!vb;")
	public static Class11_Sub1 method1188(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		@Pc(5) Class8 local5 = null;
		if (Static70.aClass20_4 != null) {
			local5 = new Class8(arg0, Static70.aClass20_4, Static2.aClass20Array1[arg0], 1000000);
		}
		return new Class11_Sub1(local5, Static15.aClass8_1, arg0, arg3, arg1, arg2);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIII)I")
	public static int method1189(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(20) int local20 = 65536 - Class3_Sub1_Sub2_Sub2.anIntArray98[arg0 * 1024 / arg3] >> 1;
		return ((65536 - local20) * arg2 >> 16) + (local20 * arg1 >> 16);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!ae;Lclient!bf;Lclient!ae;I)[Lclient!q;")
	public static Class3_Sub1_Sub2_Sub3[] method1190(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(2) Class5 arg2) {
		@Pc(9) int local9 = arg1.method1880(arg0);
		@Pc(19) int local19 = arg1.method1860(local9, arg2);
		return Static32.method646(local19, local9, arg1);
	}
}
