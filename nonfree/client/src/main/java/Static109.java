import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!vd", name = "fb", descriptor = "Lclient!bd;")
	public static Class6_Sub2_Sub2_Sub1 aClass6_Sub2_Sub2_Sub1_24;

	@OriginalMember(owner = "client!vd", name = "ib", descriptor = "I")
	public static int anInt3140;

	@OriginalMember(owner = "client!vd", name = "mb", descriptor = "Lclient!kb;")
	public static Class34 aClass34_1;

	@OriginalMember(owner = "client!vd", name = "ob", descriptor = "Lclient!md;")
	public static Class40_Sub1 aClass40_Sub1_42;

	@OriginalMember(owner = "client!vd", name = "tb", descriptor = "Lclient!fc;")
	public static Class21 aClass21_26;

	@OriginalMember(owner = "client!vd", name = "ub", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!vd", name = "cb", descriptor = "Lclient!ab;")
	public static Class3 aClass3_12 = new Class3();

	@OriginalMember(owner = "client!vd", name = "hb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1319 = Static34.method846("huffman");

	@OriginalMember(owner = "client!vd", name = "lb", descriptor = "I")
	public static int anInt3142 = 0;

	@OriginalMember(owner = "client!vd", name = "nb", descriptor = "[[B")
	public static byte[][] aByteArrayArray9 = new byte[1000][];

	@OriginalMember(owner = "client!vd", name = "qb", descriptor = "Z")
	public static boolean aBoolean163 = false;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!te;I)Z")
	public static boolean method2032(@OriginalArg(0) Class6_Sub2_Sub14 arg0) {
		@Pc(8) int local8 = arg0.anInt2909;
		if (local8 >= 1 && local8 <= 200 || !(local8 < 701 || local8 > 900)) {
			if (local8 >= 801) {
				local8 -= 701;
			} else if (local8 >= 701) {
				local8 -= 601;
			} else if (local8 >= 101) {
				local8 -= 101;
			} else {
				local8--;
			}
			Static86.method1643(27, 0, 0, Static89.method1698(new Class55[] { Static72.aClass55_862, Static68.aClass55Array18[local8] }), Static101.aClass55_1257, 0);
			Static86.method1643(12, 0, 0, Static89.method1698(new Class55[] { Static72.aClass55_862, Static68.aClass55Array18[local8] }), Static18.aClass55_327, 0);
			return true;
		} else if (local8 >= 401 && local8 <= 500) {
			Static86.method1643(57, 0, 0, Static89.method1698(new Class55[] { Static72.aClass55_862, arg0.aClass55_1223 }), Static101.aClass55_1257, 0);
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vd", name = "f", descriptor = "(I)V")
	public static void method2033() {
		aClass6_Sub2_Sub2_Sub1_24 = null;
		aClass3_12 = null;
		aClass40_Sub1_42 = null;
		aByteArrayArray9 = null;
		aClass21_26 = null;
		aFont1 = null;
		aClass34_1 = null;
		aClass55_1319 = null;
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(III)I")
	public static int method2034(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) long local15 = (long) ((arg0 << 16) + arg1);
		return Static3.aClass6_Sub2_Sub9_1 != null && local15 == Static3.aClass6_Sub2_Sub9_1.aLong114 ? Static75.aClass6_Sub1_4.anInt2209 * 99 / (Static75.aClass6_Sub1_4.aByteArray11.length - Static3.aClass6_Sub2_Sub9_1.aByte2) + 1 : 0;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(I[BZ)I")
	public static int method2035(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		return Static9.method351(0, arg0, arg1);
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(Z)V")
	public static void method2036() {
		@Pc(3) int local3 = Static39.anInt1694;
		@Pc(9) int local9 = Static57.anInt1734;
		@Pc(11) int local11 = Static7.anInt281;
		@Pc(15) int local15 = Static96.anInt2823;
		Static53.method1276(local3, local11, local15, local9, 6116423);
		Static53.method1276(local3 + 1, local11 + 1, local15 - 2, 16, 0);
		Static53.method1284(local3 + 1, local11 + 18, local15 - 2, local9 - 19, 0);
		Static81.aClass6_Sub2_Sub2_Sub4_4.method1303(Static83.aClass55_956, local3 + 3, local11 + 14, 6116423);
		@Pc(64) int local64 = Static58.anInt1741;
		@Pc(66) int local66 = Static27.anInt1358;
		if (Static1.anInt6 == 0) {
			local66 -= 4;
			local64 -= 4;
		}
		if (Static1.anInt6 == 1) {
			local64 -= 553;
			local66 -= 205;
		}
		if (Static1.anInt6 == 2) {
			local64 -= 17;
			local66 -= 357;
		}
		for (@Pc(84) int local84 = 0; local84 < Static94.anInt2645; local84++) {
			@Pc(88) int local88 = 16777215;
			@Pc(102) int local102 = local11 + (Static94.anInt2645 + -1 + -local84) * 15 + 31;
			if (local64 > local3 && local15 + local3 > local64 && local102 - 13 < local66 && local102 + 3 > local66) {
				local88 = 16776960;
			}
			Static81.aClass6_Sub2_Sub2_Sub4_4.method1297(Static76.aClass55Array20[local84], local3 + 3, local102, local88, true);
		}
	}
}
