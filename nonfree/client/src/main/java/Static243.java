import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "[Lclient!vb;")
	public static Class247[] aClass247Array1;

	@OriginalMember(owner = "client!lp", name = "i", descriptor = "Lclient!aj;")
	public static Class10 aClass10_3;

	@OriginalMember(owner = "client!lp", name = "l", descriptor = "I")
	public static int anInt3935;

	@OriginalMember(owner = "client!lp", name = "d", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_96 = new Class129(104, 19);

	@OriginalMember(owner = "client!lp", name = "g", descriptor = "[I")
	public static final int[] anIntArray251 = new int[100];

	@OriginalMember(owner = "client!lp", name = "h", descriptor = "Z")
	public static boolean aBoolean252 = false;

	@OriginalMember(owner = "client!lp", name = "j", descriptor = "I")
	public static int anInt3933 = 0;

	@OriginalMember(owner = "client!lp", name = "k", descriptor = "I")
	public static int anInt3934 = 503;

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(II)V")
	public static void method3143(@OriginalArg(0) int arg0) {
		Static205.method2752();
		Static378.method4942();
		Static136.method6010(arg0, true);
		Static338.method4371(Static407.aClass200_9, Static344.aClass243_196, Static281.aClass243_250);
		Static257.method3314(Static407.aClass200_9, Static344.aClass243_196);
		Static109.method1497();
		Static9.method160(Static107.aClass49Array5);
		Static251.method3223();
		Static287.method3551();
		if (Static376.anInt6324 == 2) {
			Static407.method5394(3);
		} else if (Static376.anInt6324 == 6) {
			Static407.method5394(7);
		} else if (Static376.anInt6324 == 9) {
			Static407.method5394(10);
		} else if (Static376.anInt6324 == 1) {
			Static89.method1305(Static407.aClass200_9, Static344.aClass243_196);
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(III)Z")
	public static boolean method3144(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x60000) != 0 | Static14.method262(arg0, arg1) || Static452.method5943(arg0, arg1) || Static322.method3973(arg1, arg0);
	}

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "(III)Z")
	public static boolean method3145(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static239.anIntArrayArrayArray15[arg0][arg1][arg2];
		if (local7 == -Static138.anInt2465) {
			return false;
		} else if (local7 == Static138.anInt2465) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << Static419.anInt6980;
			@Pc(26) int local26 = arg2 << Static419.anInt6980;
			if (Static408.method5397(local22 + 1, Static410.aClass125Array3[arg0].ua(arg1, arg2), local26 + 1) && Static408.method5397(local22 + Static92.anInt1592 - 1, Static410.aClass125Array3[arg0].ua(arg1 + 1, arg2), local26 + 1) && Static408.method5397(local22 + Static92.anInt1592 - 1, Static410.aClass125Array3[arg0].ua(arg1 + 1, arg2 + 1), local26 + Static92.anInt1592 - 1) && Static408.method5397(local22 + 1, Static410.aClass125Array3[arg0].ua(arg1, arg2 + 1), local26 + Static92.anInt1592 - 1) && Static408.method5397(local22 + Static301.anInt4709, Static410.aClass125Array3[arg0].ua(arg1, arg2), local26 + 1) && Static408.method5397(local22 + Static92.anInt1592 - 1, Static410.aClass125Array3[arg0].ua(arg1 + 1, arg2), local26 + Static301.anInt4709) && Static408.method5397(local22 + Static301.anInt4709, Static410.aClass125Array3[arg0].ua(arg1, arg2 + 1), local26 + Static92.anInt1592 - 1) && Static408.method5397(local22 + Static92.anInt1592 - 1, Static410.aClass125Array3[arg0].ua(arg1, arg2), local26 + Static301.anInt4709) && Static408.method5397(local22 + Static301.anInt4709, Static410.aClass125Array3[arg0].ua(arg1, arg2), local26 + Static301.anInt4709)) {
				Static239.anIntArrayArrayArray15[arg0][arg1][arg2] = Static138.anInt2465;
				return true;
			} else {
				Static239.anIntArrayArrayArray15[arg0][arg1][arg2] = -Static138.anInt2465;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!lp", name = "c", descriptor = "(III)Z")
	public static boolean method3146(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static43.method4103(arg1, arg0) & Static255.method3310(arg0, arg1);
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(ZLjava/lang/String;B)V")
	public static void method3148(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		if (arg1 == null) {
			return;
		}
		if (Static150.anInt2695 >= 100) {
			Static411.method5422(Static422.aClass198_115.method4012(Static38.anInt4834));
			return;
		}
		@Pc(22) String local22 = Static12.method193(arg1);
		if (local22 == null) {
			return;
		}
		@Pc(73) String local73;
		for (@Pc(35) int local35 = 0; local35 < Static150.anInt2695; local35++) {
			@Pc(43) String local43 = Static12.method193(Static338.aStringArray36[local35]);
			if (local43 != null && local43.equals(local22)) {
				Static411.method5422(arg1 + Static43.aClass198_96.method4012(Static38.anInt4834));
				return;
			}
			if (Static65.aStringArray34[local35] != null) {
				local73 = Static12.method193(Static65.aStringArray34[local35]);
				if (local73 != null && local73.equals(local22)) {
					Static411.method5422(arg1 + Static43.aClass198_96.method4012(Static38.anInt4834));
					return;
				}
			}
		}
		for (@Pc(103) int local103 = 0; local103 < Static244.anInt3939; local103++) {
			local73 = Static12.method193(Static225.aStringArray27[local103]);
			if (local73 != null && local73.equals(local22)) {
				Static411.method5422(Static442.aClass198_125.method4012(Static38.anInt4834) + arg1 + Static452.aClass198_127.method4012(Static38.anInt4834));
				return;
			}
			if (Static88.aStringArray48[local103] != null) {
				@Pc(146) String local146 = Static12.method193(Static88.aStringArray48[local103]);
				if (local146 != null && local146.equals(local22)) {
					Static411.method5422(Static442.aClass198_125.method4012(Static38.anInt4834) + arg1 + Static452.aClass198_127.method4012(Static38.anInt4834));
					return;
				}
			}
		}
		if (Static12.method193(Static220.aClass2_Sub1_Sub3_Sub2_1.aString65).equals(local22)) {
			Static411.method5422(Static10.aClass198_3.method4012(Static38.anInt4834));
		} else {
			Static288.method3576(Static268.aClass194_75);
			Static281.aClass5_Sub15_Sub2_13.method5583(Static21.method357(arg1) + 1);
			Static281.aClass5_Sub15_Sub2_13.method5545(arg1);
			Static281.aClass5_Sub15_Sub2_13.method5583(arg0 ? 1 : 0);
		}
	}
}
