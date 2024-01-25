import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "Lclient!tj;")
	public static Class193 aClass193_57;

	@OriginalMember(owner = "client!jp", name = "g", descriptor = "[I")
	public static int[] anIntArray297;

	@OriginalMember(owner = "client!jp", name = "j", descriptor = "Lclient!kg;")
	public static Class114 aClass114_3;

	@OriginalMember(owner = "client!jp", name = "k", descriptor = "[S")
	public static short[] aShortArray46;

	@OriginalMember(owner = "client!jp", name = "c", descriptor = "Lclient!ub;")
	public static final Class198 aClass198_114 = new Class198(8);

	@OriginalMember(owner = "client!jp", name = "e", descriptor = "J")
	public static long aLong97 = 0L;

	@OriginalMember(owner = "client!jp", name = "f", descriptor = "I")
	public static int anInt3335 = 0;

	@OriginalMember(owner = "client!jp", name = "h", descriptor = "Z")
	public static boolean aBoolean267 = true;

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "(I)V")
	public static void method3033() {
		@Pc(1) Class198 local1 = Static203.aClass198_153;
		synchronized (Static203.aClass198_153) {
			Static203.aClass198_153.method5209();
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IIIIZII)V")
	public static void method3034(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		@Pc(7) Class187[] local7 = Static116.aClass187Array1;
		for (@Pc(9) int local9 = 0; local9 < local7.length; local9++) {
			@Pc(15) Class187 local15 = local7[local9];
			if (local15 != null && local15.anInt5730 == 2) {
				Static194.method3668(local15.anInt5738 + (local15.anInt5739 - Static136.anInt3193 << 7), arg3 >> 1, local15.anInt5731 * 2, arg2 >> 1, (local15.anInt5735 - Static286.anInt6699 << 7) + local15.anInt5729);
				if (Static185.anIntArray328[0] > -1 && Static199.anInt4137 % 20 < 10) {
					Static348.aClass58Array134[local15.anInt5733].method4269(arg1 + Static185.anIntArray328[0] - 12, arg0 - (-Static185.anIntArray328[1] - -28));
				}
			}
		}
	}

	@OriginalMember(owner = "client!jp", name = "c", descriptor = "(I)I")
	public static int method3035() {
		if ((double) Static54.aFloat70 == 3.0D) {
			return 37;
		} else if ((double) Static54.aFloat70 == 4.0D) {
			return 50;
		} else if ((double) Static54.aFloat70 == 6.0D) {
			return 75;
		} else if ((double) Static54.aFloat70 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}
}
