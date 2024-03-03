import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!nf", name = "i", descriptor = "I")
	public static int anInt4066;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIBI)V", line = 3)
	public static void method4023(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		@Pc(3) int local3 = arg0 << 3;
		@Pc(11) int local11 = arg1 << 3;
		Class28.aFloat27 = local3;
		Class187.aFloat66 = local11;
		if (Static291.anInt5899 == 2) {
			Static319.anInt5645 = 0;
			Static244.anInt4847 = local3;
			Static4.anInt87 = local11;
		}
		Static315.method6142();
		Class2_Sub13.aBoolean156 = true;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IJ)V", line = 38)
	public static void method4024(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static248.method4554(arg0 - 1L);
			Static248.method4554(1L);
		} else {
			Static248.method4554(arg0);
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(III)I", line = 60)
	public static int method4025(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 >>> 24;
		@Pc(25) int local25 = (local7 * (arg1 & 0xFF00FF) & 0xFF00FF00 | (arg1 & 0xFF00) * local7 & 0xFF0000) >>> 8;
		@Pc(30) int local30 = 255 - local7;
		return (((arg0 & 0xFF00FF) * local30 & 0xFF00FF00 | local30 * (arg0 & 0xFF00) & 0xFF0000) >>> 8) + local25;
	}
}
