import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "Lclient!ab;")
	public static Class3_Sub1_Sub1_Sub1 aClass3_Sub1_Sub1_Sub1_16;

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "Lclient!vb;")
	public static Class3_Sub1_Sub1_Sub4 aClass3_Sub1_Sub1_Sub4_2;

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "Lclient!mb;")
	public static Class42 aClass42_44;

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "Lclient!v;")
	public static Class62 aClass62_700 = Static45.method753("Wen m\u001c1chten Sie entfernen?");

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "Lclient!v;")
	public static Class62 aClass62_701 = Static45.method753(":duelreq:");

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "[B")
	public static byte[] aByteArray17 = new byte[520];

	@OriginalMember(owner = "client!lc", name = "k", descriptor = "Lclient!v;")
	public static Class62 aClass62_702 = Static45.method753("rot:");

	@OriginalMember(owner = "client!lc", name = "l", descriptor = "Lclient!v;")
	public static Class62 aClass62_703 = Static45.method753("Schlie\u001c1en");

	@OriginalMember(owner = "client!lc", name = "m", descriptor = "[J")
	public static long[] aLongArray18 = new long[32];

	@OriginalMember(owner = "client!lc", name = "o", descriptor = "I")
	public static int anInt1618 = 0;

	@OriginalMember(owner = "client!lc", name = "p", descriptor = "[I")
	public static int[] anIntArray167 = new int[200];

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)V")
	public static void method975() {
		aClass62_703 = null;
		Class39.anIntArray166 = null;
		aClass3_Sub1_Sub1_Sub4_2 = null;
		aClass3_Sub1_Sub1_Sub1_16 = null;
		aByteArray17 = null;
		aClass62_701 = null;
		anIntArray167 = null;
		aClass62_700 = null;
		aClass62_702 = null;
		aClass42_44 = null;
		aLongArray18 = null;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILclient!v;Lclient!kd;)I")
	public static int method976(@OriginalArg(1) Class62 arg0, @OriginalArg(2) Class3_Sub8 arg1) {
		@Pc(14) int local14 = arg1.anInt2704;
		arg1.method1790(arg0.anInt2649);
		arg1.anInt2704 += Static15.aClass30_1.method674(arg1.aByteArray26, 0, arg0.anInt2649, arg0.aByteArray25, arg1.anInt2704);
		return arg1.anInt2704 - local14;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)V")
	public static void method977() {
		if (Static31.anInt983 == 2) {
			Static8.method204(Static30.anInt975 * 2, Static42.anInt1214 + (Static79.anInt2106 - Static41.anInt1196 << 7), Static28.anInt900 + (Static42.anInt1218 + -Static2.anInt56 << 7));
			if (Static4.anInt186 > -1 && Static12.anInt451 % 20 < 10) {
				Static49.aClass3_Sub1_Sub1_Sub4Array28[0].method1751(Static4.anInt186 - 12, Static96.anInt2562 + -28);
			}
		}
	}
}
