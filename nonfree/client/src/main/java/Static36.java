import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!fd", name = "mb", descriptor = "I")
	public static int anInt1213;

	@OriginalMember(owner = "client!fd", name = "ab", descriptor = "Lclient!rd;")
	public static Class63 aClass63_644 = Static80.method1463("Wen m-Ochten Sie hinzuf-Ugen?");

	@OriginalMember(owner = "client!fd", name = "bb", descriptor = "Lclient!mb;")
	public static Class49 aClass49_9 = new Class49(64);

	@OriginalMember(owner = "client!fd", name = "kb", descriptor = "I")
	public static final int anInt1211 = 7759444;

	@OriginalMember(owner = "client!fd", name = "pb", descriptor = "Lclient!mb;")
	public static Class49 aClass49_10 = new Class49(50);

	@OriginalMember(owner = "client!fd", name = "qb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_645 = Static80.method1463(")3");

	@OriginalMember(owner = "client!fd", name = "rb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_646 = Static80.method1463("@lre@");

	@OriginalMember(owner = "client!fd", name = "sb", descriptor = "I")
	public static int anInt1216 = 0;

	@OriginalMember(owner = "client!fd", name = "tb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_647 = Static80.method1463("mapedge");

	@OriginalMember(owner = "client!fd", name = "ub", descriptor = "Lclient!rd;")
	private static Class63 aClass63_648 = Static80.method1463("Loading ignore list");

	@OriginalMember(owner = "client!fd", name = "vb", descriptor = "Lclient!rd;")
	private static Class63 aClass63_649 = Static80.method1463("glow2:");

	@OriginalMember(owner = "client!fd", name = "wb", descriptor = "I")
	public static int anInt1217 = 0;

	@OriginalMember(owner = "client!fd", name = "xb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_650 = Static80.method1463("blaugr-Un:");

	@OriginalMember(owner = "client!fd", name = "yb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_651 = aClass63_649;

	@OriginalMember(owner = "client!fd", name = "zb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_652 = aClass63_649;

	@OriginalMember(owner = "client!fd", name = "Ab", descriptor = "Lclient!rd;")
	public static Class63 aClass63_653 = aClass63_648;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!ge;B)I")
	public static int method863(@OriginalArg(0) Class7 arg0) {
		@Pc(10) int local10 = 0;
		if (arg0.method99(Static70.aClass63_1049, Static25.aClass63_510)) {
			local10++;
		}
		if (arg0.method99(Static123.aClass63_1776, Static25.aClass63_510)) {
			local10++;
		}
		if (arg0.method99(Static70.aClass63_1052, Static25.aClass63_510)) {
			local10++;
		}
		if (arg0.method99(Static20.aClass63_418, Static25.aClass63_510)) {
			local10++;
		}
		if (arg0.method99(Static57.aClass63_900, Static25.aClass63_510)) {
			local10++;
		}
		if (arg0.method99(Static34.aClass63_615, Static25.aClass63_510)) {
			local10++;
		}
		if (arg0.method99(Static38.aClass63_668, Static25.aClass63_510)) {
			local10++;
		}
		if (arg0.method99(Static54.aClass63_863, Static25.aClass63_510)) {
			local10++;
		}
		if (arg0.method99(Static72.aClass63_1066, Static25.aClass63_510)) {
			local10++;
		}
		if (arg0.method99(Static4.aClass63_18, Static25.aClass63_510)) {
			local10++;
		}
		if (arg0.method99(Static86.aClass63_1243, Static25.aClass63_510)) {
			local10++;
		}
		if (arg0.method99(Static25.aClass63_507, Static25.aClass63_510)) {
			local10++;
		}
		if (arg0.method99(Static56.aClass63_893, Static25.aClass63_510)) {
			local10++;
		}
		if (arg0.method99(Static98.aClass63_1503, Static25.aClass63_510)) {
			local10++;
		}
		if (arg0.method99(Static118.aClass63_1734, Static25.aClass63_510)) {
			local10++;
		}
		if (arg0.method99(Static91.aClass63_1349, Static25.aClass63_510)) {
			local10++;
		}
		if (arg0.method99(Static60.aClass63_956, Static25.aClass63_510)) {
			local10++;
		}
		if (arg0.method99(Static5.aClass63_24, Static25.aClass63_510)) {
			local10++;
		}
		if (arg0.method99(Static119.aClass63_1747, Static25.aClass63_510)) {
			local10++;
		}
		return local10;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(II)Z")
	public static boolean method866(@OriginalArg(1) int arg0) {
		if (Static14.aBooleanArray3[arg0]) {
			return true;
		} else if (Static47.aClass7_26.method98(arg0)) {
			@Pc(23) int local23 = Static47.aClass7_26.method103(arg0);
			if (local23 == 0) {
				Static14.aBooleanArray3[arg0] = true;
				return true;
			}
			if (Static68.aClass6_Sub3_Sub17ArrayArray1[arg0] == null) {
				Static68.aClass6_Sub3_Sub17ArrayArray1[arg0] = new Class6_Sub3_Sub17[local23];
			}
			for (@Pc(48) int local48 = 0; local48 < local23; local48++) {
				if (Static68.aClass6_Sub3_Sub17ArrayArray1[arg0][local48] == null) {
					@Pc(62) byte[] local62 = Static47.aClass7_26.method110(arg0, local48);
					if (local62 != null) {
						Static68.aClass6_Sub3_Sub17ArrayArray1[arg0][local48] = new Class6_Sub3_Sub17();
						Static68.aClass6_Sub3_Sub17ArrayArray1[arg0][local48].anInt3233 = (arg0 << 16) + local48;
						if (local62[0] == -1) {
							Static68.aClass6_Sub3_Sub17ArrayArray1[arg0][local48].method2152(new Class6_Sub4(local62));
						} else {
							Static68.aClass6_Sub3_Sub17ArrayArray1[arg0][local48].method2137(new Class6_Sub4(local62));
						}
					}
				}
			}
			Static14.aBooleanArray3[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "(B)V")
	public static void method867() {
		Static61.aBoolean98 = true;
		Static28.aBoolean45 = true;
	}

	@OriginalMember(owner = "client!fd", name = "g", descriptor = "(I)Lclient!ra;")
	public static Class6_Sub3_Sub3_Sub3 method868() {
		@Pc(3) Class6_Sub3_Sub3_Sub3 local3 = new Class6_Sub3_Sub3_Sub3();
		local3.anInt2691 = Static12.anInt417;
		local3.anInt2689 = Static117.anIntArray345[0];
		local3.anInt2690 = Static39.anIntArray143[0];
		local3.anInt2687 = Static59.anIntArray189[0];
		local3.anIntArray290 = Static61.anIntArray190;
		local3.anInt2686 = Static22.anIntArray65[0];
		local3.aByteArray31 = Static61.aByteArrayArray6[0];
		local3.anInt2688 = Static18.anInt566;
		Static5.method36();
		return local3;
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(IB)V")
	public static void method869() {
		Static23.anInt2345 = 2;
		Static29.aClass7_17 = null;
		Static37.anInt1224 = -1;
		Static69.anInt1998 = 1;
		Static114.aBoolean166 = false;
		Static64.anInt1833 = -1;
		Static68.anInt1982 = 0;
	}

	@OriginalMember(owner = "client!fd", name = "h", descriptor = "(I)V")
	public static void method870() {
		aClass63_649 = null;
		aClass63_645 = null;
		aClass63_646 = null;
		aClass63_650 = null;
		aClass49_9 = null;
		aClass63_653 = null;
		aClass63_648 = null;
		aClass49_10 = null;
		aClass63_644 = null;
		aClass63_647 = null;
		aClass63_652 = null;
		aClass63_651 = null;
	}
}
