import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!qm", name = "q", descriptor = "[Lclient!ac;")
	public static Class3[] aClass3Array3;

	@OriginalMember(owner = "client!qm", name = "s", descriptor = "Lclient!ra;")
	public static Class170 aClass170_90;

	@OriginalMember(owner = "client!qm", name = "j", descriptor = "Lclient!vn;")
	public static final Class211 aClass211_32 = new Class211();

	@OriginalMember(owner = "client!qm", name = "m", descriptor = "I")
	public static int anInt5044 = 0;

	@OriginalMember(owner = "client!qm", name = "o", descriptor = "Z")
	public static boolean aBoolean384 = true;

	@OriginalMember(owner = "client!qm", name = "t", descriptor = "[I")
	public static final int[] anIntArray388 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(II)I")
	public static int method4495(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IBIIIIIII)V")
	public static void method4496(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg3 < 1 || arg5 < 1 || arg3 > Static266.anInt5101 - 2 || Static339.anInt6352 - 2 < arg5) {
			return;
		}
		if (!Static26.method628() && !Static289.method4920(arg3, Static9.anInt297, arg0, arg5)) {
			return;
		}
		if (Static138.aClass51ArrayArrayArray1 == null) {
			return;
		}
		@Pc(45) int local45 = arg0;
		if (arg0 < 3 && Static105.method2140(arg5, arg3)) {
			local45 = arg0 + 1;
		}
		Static278.method4731(arg3, Static15.aClass59_1, arg5, Static117.aClass49Array1[arg0], arg0, arg2, local45);
		if (arg7 < 0) {
			return;
		}
		@Pc(69) boolean local69 = Static22.aBoolean43;
		Static22.aBoolean43 = true;
		Static164.method3035(local45, arg6, Static15.aClass59_1, arg1, Static117.aClass49Array1[arg0], arg0, arg7, arg5, arg4, arg3, false, false);
		Static22.aBoolean43 = local69;
		return;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIIIIII)V")
	public static void method4497(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3) {
		@Pc(3) Class104[] local3 = Static141.aClass104Array1;
		for (@Pc(10) int local10 = 0; local10 < local3.length; local10++) {
			@Pc(16) Class104 local16 = local3[local10];
			if (local16 != null && local16.anInt3106 == 2) {
				Static6.method186(local16.anInt3093 + (local16.anInt3105 - Static263.anInt5063 << 7), arg1 >> 1, arg2 >> 1, (local16.anInt3100 - Static28.anInt773 << 7) + local16.anInt3104, local16.anInt3101 * 2);
				if (Static330.anIntArray121[0] > -1 && Static180.anInt3606 % 20 < 10) {
					Static148.aClass54Array15[local16.anInt3094].method5569(Static330.anIntArray121[0] + arg3 - 12, Static330.anIntArray121[1] + -28 + arg0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(ZIBII)V")
	public static void method4498(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static323.method5433(arg3)) {
			Static314.method5367(arg2, Static348.aClass96ArrayArray1[arg3], arg1, -1, arg0);
		}
	}
}
