import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static265 {

	@OriginalMember(owner = "client!qp", name = "d", descriptor = "[I")
	public static final int[] anIntArray450 = new int[64];

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(I)V")
	public static void method4626() {
		if (Static113.aClass66_8 == null) {
			return;
		}
		while (true) {
			while (Static245.anInt5133 < Static305.aClass83_Sub1Array1.length) {
				@Pc(22) Class83_Sub1 local22 = Static305.aClass83_Sub1Array1[Static245.anInt5133];
				if (local22 != null && local22.anInt3249 == -1) {
					if (Static63.aClass4_Sub29_1 == null) {
						Static63.aClass4_Sub29_1 = Static113.aClass66_8.method1403(local22.aString112);
					}
					@Pc(45) int local45 = Static63.aClass4_Sub29_1.anInt4207;
					if (local45 == -1) {
						return;
					}
					Static245.anInt5133++;
					Static63.aClass4_Sub29_1 = null;
					local22.anInt3249 = local45;
				} else {
					Static245.anInt5133++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method4627(@OriginalArg(0) String arg0) {
		if (Static297.aClass219Array1 != null) {
			Static320.aClass4_Sub7_Sub1_3.method1237(185);
			Static320.aClass4_Sub7_Sub1_3.method2416(Static204.method3620(arg0));
			Static320.aClass4_Sub7_Sub1_3.method2373(arg0);
		}
	}

	@OriginalMember(owner = "client!qp", name = "d", descriptor = "(I)V")
	public static void method4631() {
		Static111.aClass154_38.method4219();
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIIIIIBII)Z")
	public static boolean method4632(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg7 + arg0 > arg2 && arg0 < arg4 + arg2) {
			return arg3 < arg6 + arg1 && arg5 + arg3 > arg1;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qp", name = "e", descriptor = "(I)Z")
	public static boolean method4633() {
		return Static306.anInt6192 != 0 || Static98.anInt6644 >= 2;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIIIIII)V")
	public static void method4635(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) Class72 local8 = Static289.method4934(arg2, arg5);
		if (local8 != null && local8.anObjectArray17 != null) {
			@Pc(17) Class4_Sub22 local17 = new Class4_Sub22();
			local17.anObjectArray34 = local8.anObjectArray17;
			local17.aClass72_12 = local8;
			Static97.method1756(local17);
		}
		Static184.anInt4052 = arg4;
		Static81.anInt1731 = arg3;
		Static247.aBoolean436 = true;
		Static232.anInt4817 = arg1;
		Static23.anInt410 = arg0;
		Static301.anInt6084 = arg2;
		Static58.anInt1259 = arg5;
		Static238.method4097(local8);
	}
}
