import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!ev", name = "d", descriptor = "J")
	public static long aLong207 = 0L;

	@OriginalMember(owner = "client!ev", name = "f", descriptor = "Lclient!jv;")
	public static final Class126 aClass126_58 = new Class126(32);

	@OriginalMember(owner = "client!ev", name = "i", descriptor = "I")
	public static int anInt6818 = -1;

	@OriginalMember(owner = "client!ev", name = "j", descriptor = "I")
	public static int anInt6819 = -1;

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(Lclient!qg;Lclient!qg;I)V")
	public static void method5329(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3 arg1) {
		if (arg1.aClass3_262 != null) {
			arg1.method5977();
		}
		arg1.aClass3_261 = arg0;
		arg1.aClass3_262 = arg0.aClass3_262;
		arg1.aClass3_262.aClass3_261 = arg1;
		arg1.aClass3_261.aClass3_262 = arg1;
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(IIB)I")
	public static int method5332(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0 >>> 24;
		@Pc(30) int local30 = ((arg0 & 0xFF00FF) * local12 & 0xFF00FF00 | (arg0 & 0xFF00) * local12 & 0xFF0000) >>> 8;
		@Pc(35) int local35 = 255 - local12;
		return local30 + (((arg1 & 0xFF00) * local35 & 0xFF0000 | (arg1 & 0xFF00FF) * local35 & 0xFF00FF00) >>> 8);
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(BI)I")
	public static int method5335(@OriginalArg(1) int arg0) {
		@Pc(21) int local21 = arg0 * (arg0 * arg0 >> 12) >> 12;
		@Pc(27) int local27 = arg0 * 6 - 61440;
		@Pc(36) int local36 = (arg0 * local27 >> 12) + 40960;
		return local36 * local21 >> 12;
	}
}
