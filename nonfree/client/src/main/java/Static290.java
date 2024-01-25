import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static290 {

	@OriginalMember(owner = "client!jw", name = "v", descriptor = "I")
	public static int anInt10003;

	@OriginalMember(owner = "client!jw", name = "l", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_98 = new Class187(36, -1);

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(III)V")
	public static void method8315(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static371.aClass143_7 == null) {
			return;
		}
		@Pc(8) int local8 = Static449.anInt7857;
		@Pc(10) int local10 = Static259.anInt4111;
		Static297.method533(arg0, arg1);
		if (Static634.anInt10113 == 0) {
			Static150.anInterface2_1 = null;
			Static150.anInterface2_1 = Static371.aClass143_7.method6228(Static371.aClass143_7.method6262(Static275.anInt4317, Static584.anInt9612), Static371.aClass143_7.method6219(Static275.anInt4317, Static584.anInt9612));
		} else if (Static634.anInt10113 == 1 && (Static368.anInterface2Array1 == null || local8 != Static449.anInt7857 || Static259.anInt4111 != local10)) {
			Static368.anInterface2Array1 = new Interface2[Static259.anInt4111 * Static449.anInt7857];
			for (@Pc(34) int local34 = 0; local34 < Static368.anInterface2Array1.length; local34++) {
				Static368.anInterface2Array1[local34] = Static371.aClass143_7.method6228(Static371.aClass143_7.method6262(Static586.anInt9622, Static77.anInt1204), Static371.aClass143_7.method6219(Static586.anInt9622, Static77.anInt1204));
			}
			Static348.anIntArray433 = new int[Static449.anInt7857 * Static259.anInt4111];
			Static244.anInt3958 = 1;
		}
		Static677.aBoolean794 = true;
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(IIIIIIII)V")
	public static void method8320(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg4 - arg5;
		@Pc(11) int local11 = arg5 + arg3;
		for (@Pc(13) int local13 = arg3; local13 < local11; local13++) {
			Static343.method5202(arg0, Static286.anIntArrayArray42[local13], arg6, arg1);
		}
		for (@Pc(36) int local36 = arg4; local36 > local7; local36--) {
			Static343.method5202(arg0, Static286.anIntArrayArray42[local36], arg6, arg1);
		}
		@Pc(58) int local58 = arg0 + arg5;
		@Pc(63) int local63 = arg1 - arg5;
		for (@Pc(65) int local65 = local11; local65 <= local7; local65++) {
			@Pc(70) int[] local70 = Static286.anIntArrayArray42[local65];
			Static343.method5202(arg0, local70, arg6, local58);
			Static343.method5202(local58, local70, arg2, local63);
			Static343.method5202(local63, local70, arg6, arg1);
		}
	}
}
