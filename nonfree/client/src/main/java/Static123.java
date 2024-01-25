import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!es", name = "h", descriptor = "I")
	public static int anInt2876;

	@OriginalMember(owner = "client!es", name = "c", descriptor = "Lclient!eg;")
	public static final Class82 aClass82_1 = new Class82();

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(I)V")
	public static void method2495() {
		Static64.aClass305Array1 = null;
		Static551.method8045(0, Static25.anInt779, 0, -1, Static582.anInt10234, Static294.anInt10217, 0, 0);
		if (Static64.aClass305Array1 != null) {
			Static483.method7398(Static251.anInt5430, -1412584499, 0, Static64.aClass305Array1, Static294.anInt10217, 0, Static233.anInt4814, Static582.anInt10234, Static327.aClass305_9.anInt9229);
			Static64.aClass305Array1 = null;
		}
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "([BIIIIIII[B)V")
	public static void method2497(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[] arg7) {
		@Pc(10) int local10 = -(arg3 >> 2);
		@Pc(15) int local15 = -(arg3 & 0x3);
		for (@Pc(18) int local18 = -arg1; local18 < 0; local18++) {
			@Pc(26) int local26;
			for (@Pc(22) int local22 = local10; local22 < 0; local22++) {
				local26 = arg5++;
				arg0[local26] = (byte) (arg0[local26] - arg7[arg6++]);
				@Pc(39) int local39 = arg5++;
				arg0[local39] = (byte) (arg0[local39] - arg7[arg6++]);
				@Pc(52) int local52 = arg5++;
				arg0[local52] = (byte) (arg0[local52] - arg7[arg6++]);
				@Pc(65) int local65 = arg5++;
				arg0[local65] = (byte) (arg0[local65] - arg7[arg6++]);
			}
			for (@Pc(84) int local84 = local15; local84 < 0; local84++) {
				local26 = arg5++;
				arg0[local26] = (byte) (arg0[local26] - arg7[arg6++]);
			}
			arg6 += arg2;
			arg5 += arg4;
		}
	}
}
