import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static626 {

	@OriginalMember(owner = "client!vca", name = "u", descriptor = "Lclient!sv;")
	public static final Class341 aClass341_105 = new Class341(5, 8);

	@OriginalMember(owner = "client!vca", name = "x", descriptor = "I")
	public static int anInt10884 = -1;

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(ILclient!hia;Lclient!jg;ILclient!ll;IIILclient!ha;)V")
	public static void method9301(@OriginalArg(0) int arg0, @OriginalArg(1) Class144 arg1, @OriginalArg(2) Class2_Sub33 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class218 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class101 arg7) {
		@Pc(19) int local19 = arg6 - arg0 / 2 - 5;
		@Pc(23) int local23 = arg3 + 2;
		if (arg4.anInt6687 != 0) {
			arg7.method8061(local23, arg5 * arg1.method4119() + arg3 + 1 - local23, arg4.anInt6687, local19, arg0 + 10);
		}
		if (arg4.anInt6700 != 0) {
			arg7.method8103(arg3 + arg5 * arg1.method4119() + 1 - local23, local19, arg4.anInt6700, local23, arg0 + 10);
		}
		@Pc(74) int local74 = arg4.anInt6706;
		if (arg2.aBoolean393 && arg4.anInt6682 != -1) {
			local74 = arg4.anInt6682;
		}
		for (@Pc(86) int local86 = 0; local86 < arg5; local86++) {
			@Pc(92) String local92 = Static265.aStringArray27[local86];
			if (arg5 - 1 > local86) {
				local92 = local92.substring(0, local92.length() - 4);
			}
			arg1.method4123(arg7, local92, arg6, arg3, local74);
			arg3 += arg1.method4119();
		}
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(IZ)V")
	public static void method9302(@OriginalArg(0) int arg0) {
		if (Static230.aClass2_Sub54_15.aClass4_Sub29_1.method9230() == 0) {
			arg0 = -1;
		}
		if (arg0 == Static254.anInt4897) {
			return;
		}
		if (arg0 != -1) {
			@Pc(34) Class181 local34 = Static372.aClass165_2.method4442(arg0);
			@Pc(38) Class67 local38 = local34.method4760();
			if (local38 == null) {
				arg0 = -1;
			} else {
				Static96.aClass48_5.method1305(local38.method1685(), local38.method1692(), Static641.aCanvas13, local38.method1694(), new Point(local34.anInt5241, local34.anInt5235));
				Static254.anInt4897 = arg0;
			}
		}
		if (arg0 == -1 && Static254.anInt4897 != -1) {
			Static96.aClass48_5.method1305((int[]) null, -1, Static641.aCanvas13, -1, new Point());
			Static254.anInt4897 = -1;
		}
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(Ljava/lang/String;IZI)V")
	public static void method9304(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		Static394.method7231();
		Static267.method9822();
		Static5.method91();
		Static491.method7785(arg1, arg2, arg0);
		Static203.method3893();
		Static532.method8228(Static607.aClass101_15);
		Static434.method5197(Static607.aClass101_15);
		Static664.method9702(Static607.aClass101_15, Static409.aClass124_84);
		Static232.method9279();
		Static512.method7982(Static622.aClass71Array42);
		Static403.method6620();
		Static231.method4178();
		if (Static579.anInt10049 == 3) {
			Static248.method4408(4);
		} else if (Static579.anInt10049 == 7) {
			Static248.method4408(8);
		} else if (Static579.anInt10049 == 10) {
			Static248.method4408(11);
		} else if (Static579.anInt10049 == 1 || Static579.anInt10049 == 2) {
			Static24.method451();
		}
	}
}
