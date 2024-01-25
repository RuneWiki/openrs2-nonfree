import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!bj", name = "F", descriptor = "[Lclient!ofa;")
	public static final Interface18[] anInterface18Array1 = new Interface18[128];

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIBII)V")
	public static void method1275(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static47.anInt1250; local3++) {
			@Pc(17) Rectangle local17 = Class84_Sub2.aRectangleArray2[local3];
			if (arg1 < local17.x + local17.width && local17.x < arg0 + arg1 && arg2 < local17.y + local17.height && arg2 + arg3 > local17.y) {
				Static496.aBooleanArray23[local3] = true;
			}
		}
		Static120.method2177(arg1, arg0 + arg1, arg2, arg3 + arg2);
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(III[BIII[BI)V")
	public static void method1276(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg2 >> 2);
		@Pc(15) int local15 = -(arg2 & 0x3);
		for (@Pc(22) int local22 = -arg7; local22 < 0; local22++) {
			@Pc(30) int local30;
			for (@Pc(26) int local26 = local10; local26 < 0; local26++) {
				local30 = arg0++;
				arg3[local30] += arg6[arg5++];
				@Pc(42) int local42 = arg0++;
				arg3[local42] += arg6[arg5++];
				@Pc(54) int local54 = arg0++;
				arg3[local54] += arg6[arg5++];
				@Pc(66) int local66 = arg0++;
				arg3[local66] += arg6[arg5++];
			}
			for (@Pc(81) int local81 = local15; local81 < 0; local81++) {
				local30 = arg0++;
				arg3[local30] += arg6[arg5++];
			}
			arg0 += arg4;
			arg5 += arg1;
		}
	}

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "(III)Lclient!jo;")
	public static Class198 method1277(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class198 local7 = new Class198();
		local7.anInt5350 = -1;
		local7.anInt5352 = -1;
		local7.anInt5340 = arg1 + 1 + 5;
		local7.anInt5348 = arg0 + 5 + 1;
		local7.anIntArrayArray57 = new int[local7.anInt5348][local7.anInt5340];
		local7.method4537();
		return local7;
	}

	@OriginalMember(owner = "client!bj", name = "c", descriptor = "(B)V")
	public static void method1278() {
		if (Static229.aClass309_8 != Static312.aClass309_7) {
			try {
				Static685.method3974(Static487.aClient1, "tbrefresh");
			} catch (@Pc(22) Throwable local22) {
			}
		}
	}
}
