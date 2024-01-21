import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!wd", name = "bb", descriptor = "[I")
	public static int[] anIntArray403;

	@OriginalMember(owner = "client!wd", name = "eb", descriptor = "Lclient!c;")
	public static Class10 aClass10_143;

	@OriginalMember(owner = "client!wd", name = "fb", descriptor = "Lclient!c;")
	public static Class10 aClass10_144;

	@OriginalMember(owner = "client!wd", name = "kb", descriptor = "Lclient!wb;")
	public static Class88 aClass88_1;

	@OriginalMember(owner = "client!wd", name = "R", descriptor = "I")
	public static int anInt4170 = 0;

	@OriginalMember(owner = "client!wd", name = "W", descriptor = "Lclient!ai;")
	private static Class6 aClass6_1258 = Static38.method685("To create a new account you need to");

	@OriginalMember(owner = "client!wd", name = "X", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1259 = Static38.method685("Gegenstand f-Ur Mitglieder");

	@OriginalMember(owner = "client!wd", name = "Y", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1260 = Static38.method685("<col=ff7000>");

	@OriginalMember(owner = "client!wd", name = "ab", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1261 = Static38.method685("(U0a )2 non)2existant gosub script)2num: ");

	@OriginalMember(owner = "client!wd", name = "gb", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1262 = Static38.method685("::rect_debug");

	@OriginalMember(owner = "client!wd", name = "hb", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1263 = Static38.method685("<col=c0ff00>");

	@OriginalMember(owner = "client!wd", name = "ib", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1264 = aClass6_1258;

	@OriginalMember(owner = "client!wd", name = "jb", descriptor = "[I")
	public static int[] anIntArray404 = new int[128];

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILclient!wa;)I")
	public static int method2802(@OriginalArg(1) Class87 arg0) {
		@Pc(21) Class2_Sub8 local21 = (Class2_Sub8) Static182.aClass16_13.method479(((long) arg0.anInt4085 << 32) + (long) arg0.anInt4105);
		return local21 == null ? arg0.anInt4094 : local21.anInt554;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(I[BIIII[Lclient!l;III)V")
	public static void method2803(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class48[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		for (@Pc(3) int local3 = 0; local3 < 8; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
				if (arg3 + local3 > 0 && arg3 + local3 < 103 && arg6 + local7 > 0 && local7 + arg6 < 103) {
					arg5[arg4].anIntArrayArray35[arg3 + local3][local7 + arg6] &= 0xFEFFFFFF;
				}
			}
		}
		@Pc(78) Class2_Sub13 local78 = new Class2_Sub13(arg1);
		for (@Pc(80) int local80 = 0; local80 < 4; local80++) {
			for (@Pc(84) int local84 = 0; local84 < 64; local84++) {
				for (@Pc(88) int local88 = 0; local88 < 64; local88++) {
					if (arg8 == local80 && local84 >= arg0 && local84 < arg0 + 8 && local88 >= arg7 && arg7 + 8 > local88) {
						Static58.method953(0, arg4, arg2, 0, arg3 + Static66.method1061(local88 & 0x7, local84 & 0x7, arg2), local78, Static108.method1738(local84 & 0x7, arg2, local88 & 0x7) + arg6);
					} else {
						Static58.method953(0, 0, 0, 0, -1, local78, -1);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "(I)V")
	public static void method2804() {
		aClass6_1260 = null;
		aClass6_1262 = null;
		aClass10_143 = null;
		anIntArray403 = null;
		aClass88_1 = null;
		aClass6_1263 = null;
		aClass6_1264 = null;
		aClass6_1259 = null;
		aClass10_144 = null;
		aClass6_1258 = null;
		anIntArray404 = null;
		aClass6_1261 = null;
	}
}
