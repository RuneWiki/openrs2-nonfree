import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!od", name = "sb", descriptor = "Lclient!jd;")
	public static Class37 aClass37_28;

	@OriginalMember(owner = "client!od", name = "rb", descriptor = "Lclient!rd;")
	private static Class64 aClass64_1146 = Static69.method1153("Loading game screen )2 ");

	@OriginalMember(owner = "client!od", name = "yb", descriptor = "I")
	public static int anInt1845 = 0;

	@OriginalMember(owner = "client!od", name = "Ab", descriptor = "Z")
	public static boolean aBoolean114 = false;

	@OriginalMember(owner = "client!od", name = "Bb", descriptor = "Z")
	public static boolean aBoolean115 = false;

	@OriginalMember(owner = "client!od", name = "Db", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1147 = aClass64_1146;

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IILclient!pb;I)Lclient!gb;")
	public static Class1_Sub1_Sub5_Sub1 method1329(@OriginalArg(1) int arg0, @OriginalArg(2) Class41 arg1, @OriginalArg(3) int arg2) {
		return Static100.method1613(arg0, arg2, arg1) ? Static13.method287() : null;
	}

	@OriginalMember(owner = "client!od", name = "f", descriptor = "(I)V")
	public static void method1330() {
		try {
			@Pc(11) Graphics local11 = Static93.aCanvas1.getGraphics();
			Static96.aClass37_38.method1457(550, 4, local11);
		} catch (@Pc(19) Exception local19) {
			Static93.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ILclient!kb;)V")
	public static void method1331(@OriginalArg(1) Class39 arg0) {
		Static10.aClass39_1 = arg0;
	}

	@OriginalMember(owner = "client!od", name = "d", descriptor = "(Z)V")
	public static void method1332() {
		aClass64_1147 = null;
		aClass37_28 = null;
		aClass64_1146 = null;
	}

	@OriginalMember(owner = "client!od", name = "d", descriptor = "(B)V")
	public static void method1333() {
		if (!Static103.aBoolean143) {
			return;
		}
		@Pc(11) Class1_Sub1_Sub11 local11 = Static75.method1258(Static114.anInt2740, Static64.anInt1482);
		if (local11 != null && local11.anObjectArray15 != null) {
			Static67.method1134(local11.anObjectArray15, 0, 0, 0, null, local11);
		}
		Static103.aBoolean143 = false;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1334(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (arg2 < 1 || arg6 < 1 || arg2 > 102 || arg6 > 102) {
			return;
		}
		if (Static52.aBoolean169 && arg5 != Static15.anInt463) {
			return;
		}
		@Pc(37) int local37 = 0;
		if (arg0 == 0) {
			local37 = Static82.aClass68_1.method1785(arg5, arg2, arg6);
		}
		if (arg0 == 1) {
			local37 = Static82.aClass68_1.method1752(arg5, arg2, arg6);
		}
		if (arg0 == 2) {
			local37 = Static82.aClass68_1.method1779(arg5, arg2, arg6);
		}
		if (arg0 == 3) {
			local37 = Static82.aClass68_1.method1786(arg5, arg2, arg6);
		}
		@Pc(101) int local101;
		if (local37 != 0) {
			@Pc(94) int local94 = local37 >> 14 & 0x7FFF;
			local101 = Static82.aClass68_1.method1760(arg5, arg2, arg6, local37);
			@Pc(105) int local105 = local101 & 0x1F;
			@Pc(111) int local111 = local101 >> 6 & 0x3;
			@Pc(122) Class1_Sub1_Sub3 local122;
			if (arg0 == 0) {
				Static82.aClass68_1.method1758(arg5, arg2, arg6);
				local122 = Static108.method1807(local94);
				if (local122.aBoolean25) {
					Static74.aClass52Array1[arg5].method1202(local111, local105, local122.aBoolean31, arg6, arg2);
				}
			}
			if (arg0 == 1) {
				Static82.aClass68_1.method1775(arg5, arg2, arg6);
			}
			if (arg0 == 2) {
				Static82.aClass68_1.method1756(arg5, arg2, arg6);
				local122 = Static108.method1807(local94);
				if (arg2 + local122.anInt420 > 103 || local122.anInt420 + arg6 > 103 || arg2 + local122.anInt411 > 103 || arg6 + local122.anInt411 > 103) {
					return;
				}
				if (local122.aBoolean25) {
					Static74.aClass52Array1[arg5].method1198(local122.anInt411, local122.aBoolean31, local111, arg6, local122.anInt420, arg2);
				}
			}
			if (arg0 == 3) {
				Static82.aClass68_1.method1769(arg5, arg2, arg6);
				local122 = Static108.method1807(local94);
				if (local122.aBoolean25 && local122.anInt401 == 1) {
					Static74.aClass52Array1[arg5].method1207(arg2, arg6);
				}
			}
		}
		if (arg4 < 0) {
			return;
		}
		local101 = arg5;
		if (arg5 < 3 && (Static18.aByteArrayArrayArray2[1][arg2][arg6] & 0x2) == 2) {
			local101 = arg5 + 1;
		}
		Static117.method2067(arg6, Static74.aClass52Array1[arg5], arg1, arg4, arg3, arg2, arg5, local101, Static82.aClass68_1);
		return;
	}
}
