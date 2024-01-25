import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static425 {

	@OriginalMember(owner = "client!qk", name = "i", descriptor = "I")
	public static int anInt7500;

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar2 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IILclient!en;[IZ[I)Lclient!ap;")
	public static Class17_Sub1 method5986(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class90_Sub1 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(5) int[] arg4) {
		@Pc(10) byte[] local10 = new byte[arg0 * arg1];
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			@Pc(22) int local22 = local12 * arg0 + arg3[local12];
			for (@Pc(24) int local24 = 0; local24 < arg4[local12]; local24++) {
				local10[local22++] = -1;
			}
		}
		return new Class17_Sub1(arg2, arg0, arg1, local10);
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V")
	public static void method5990() {
		try {
			@Pc(19) Method local19 = Runtime.class.getMethod("availableProcessors");
			if (local19 != null) {
				try {
					@Pc(23) Runtime local23 = Runtime.getRuntime();
					@Pc(29) Integer local29 = (Integer) local19.invoke(local23, (Object[]) null);
					Static182.anInt3500 = local29;
				} catch (@Pc(34) Throwable local34) {
				}
			}
		} catch (@Pc(36) Exception local36) {
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIIII)V")
	public static void method5991(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(11) int local11 = Static502.method6952(Static52.anInt1226, arg0, Static133.anInt2531);
		@Pc(17) int local17 = Static502.method6952(Static52.anInt1226, arg4, Static133.anInt2531);
		@Pc(28) int local28 = Static502.method6952(Static205.anInt3906, arg3, Static529.anInt9806);
		@Pc(34) int local34 = Static502.method6952(Static205.anInt3906, arg1, Static529.anInt9806);
		for (@Pc(36) int local36 = local11; local36 <= local17; local36++) {
			Static264.method4006(local34, arg2, local28, Static155.anIntArrayArray32[local36]);
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(ZLclient!jr;)Lclient!hh;")
	public static Class129 method5992(@OriginalArg(1) Class6_Sub12 arg0) {
		@Pc(7) Class129 local7 = new Class129();
		local7.anInt3817 = arg0.method6044();
		local7.aClass6_Sub5_Sub14_1 = Static186.aClass266_1.method5987(local7.anInt3817);
		return local7;
	}
}
