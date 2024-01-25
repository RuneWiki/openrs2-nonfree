import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "Lclient!bl;")
	public static final Class41 aClass41_2 = new Class41();

	@OriginalMember(owner = "client!eda", name = "d", descriptor = "I")
	public static int anInt2452 = -1;

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(III)I")
	public static int method2249(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg0 >>> 24;
		@Pc(30) int local30 = (local12 * (arg0 & 0xFF00FF) & 0xFF00FF00 | local12 * (arg0 & 0xFF00) & 0xFF0000) >>> 8;
		@Pc(35) int local35 = 255 - local12;
		return local30 + (((arg1 & 0xFF00FF) * local35 & 0xFF00FF00 | (arg1 & 0xFF00) * local35 & 0xFF0000) >>> 8);
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(JJ)J")
	public static long method2250(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(IZ)V")
	public static void method2251(@OriginalArg(0) int arg0) {
		Static421.method6010();
		@Pc(16) int local16 = Static281.aClass389_1.method8671(arg0).anInt5682;
		if (local16 == 0) {
			return;
		}
		@Pc(27) int local27 = Static592.aClass47_2.anIntArray63[arg0];
		if (local16 == 5) {
			Static516.anInt8103 = local27;
		}
		if (local16 == 6) {
			Static585.anInt9271 = local27;
		}
	}
}
