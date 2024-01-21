import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!r", name = "K", descriptor = "I")
	public static int anInt3255;

	@OriginalMember(owner = "client!r", name = "R", descriptor = "Lclient!vd;")
	public static Class2_Sub3_Sub18 aClass2_Sub3_Sub18_1;

	@OriginalMember(owner = "client!r", name = "C", descriptor = "I")
	public static int anInt3249 = -1;

	@OriginalMember(owner = "client!r", name = "F", descriptor = "I")
	public static int anInt3252 = 0;

	@OriginalMember(owner = "client!r", name = "H", descriptor = "Lclient!ai;")
	public static Class6 aClass6_947 = Static38.method685("Verbindung abgebrochen)3");

	@OriginalMember(owner = "client!r", name = "Q", descriptor = "I")
	public static int anInt3260 = 0;

	@OriginalMember(owner = "client!r", name = "Y", descriptor = "Lclient!ai;")
	public static Class6 aClass6_948 = Static38.method685("Mem:");

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(B)V")
	public static void method2151() {
		aClass2_Sub3_Sub18_1 = null;
		aClass6_947 = null;
		aClass6_948 = null;
	}

	@OriginalMember(owner = "client!r", name = "d", descriptor = "(I)V")
	public static void method2152() {
		Static80.aBoolean77 = true;
		Static113.aBoolean112 = true;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIBIII)V")
	public static void method2154(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static36.method641(arg0)) {
			Static40.aClass87Array1 = null;
			Static90.method2632(arg2, arg3, arg4, Static180.aClass87ArrayArray1[arg0], arg6, arg1, -1, arg7, arg5);
			if (Static40.aClass87Array1 != null) {
				Static90.method2632(arg2, arg3, arg4, Static40.aClass87Array1, Static135.anInt3140, Static86.anInt2204, -1412584499, arg7, arg5);
				Static40.aClass87Array1 = null;
			}
		} else if (arg5 == -1) {
			for (@Pc(19) int local19 = 0; local19 < 100; local19++) {
				Static86.aBooleanArray5[local19] = true;
			}
		} else {
			Static86.aBooleanArray5[arg5] = true;
		}
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(II)V")
	public static void method2155(@OriginalArg(0) int arg0) {
		if (Static65.anInt1613 == 0) {
			Static89.aClass2_Sub10_Sub3_1.method2006(arg0);
		} else {
			Static135.anInt3139 = arg0;
		}
	}
}
