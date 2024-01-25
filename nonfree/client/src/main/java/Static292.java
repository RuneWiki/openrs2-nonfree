import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static292 {

	@OriginalMember(owner = "client!qg", name = "m", descriptor = "I")
	public static int anInt5158;

	@OriginalMember(owner = "client!qg", name = "g", descriptor = "Lclient!cs;")
	public static final Class41 aClass41_158 = new Class41(12, 8);

	@OriginalMember(owner = "client!qg", name = "p", descriptor = "I")
	public static int anInt5161 = -1;

	@OriginalMember(owner = "client!qg", name = "t", descriptor = "I")
	public static final int anInt5164 = anInt5158 >> 2;

	@OriginalMember(owner = "client!qg", name = "v", descriptor = "I")
	public static int anInt5166 = -60;

	@OriginalMember(owner = "client!qg", name = "D", descriptor = "I")
	public static final int anInt5172 = anInt5158;

	@OriginalMember(owner = "client!qg", name = "I", descriptor = "Lclient!cs;")
	public static final Class41 aClass41_159 = new Class41(81, 7);

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(I)I")
	public static int method4434() {
		if (Static19.aBoolean31) {
			return 0;
		} else if (Static43.method900()) {
			return Static136.aBoolean194 ? 2 : 1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIB)I")
	public static int method4438(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Static271.anIntArray596[arg1 & 0x3] : 256;
	}
}
