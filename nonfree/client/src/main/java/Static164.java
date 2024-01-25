import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!gda", name = "b", descriptor = "Lclient!tt;")
	public static final Class319 aClass319_59 = new Class319(77, -1);

	@OriginalMember(owner = "client!gda", name = "i", descriptor = "I")
	public static final int anInt2987 = -1;

	@OriginalMember(owner = "client!gda", name = "j", descriptor = "I")
	public static int anInt2988 = -1;

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(I)V")
	public static void method2524() {
		Static375.aClass92_1.method4208();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static585.aLongArray16[local10] = 0L;
		}
		for (@Pc(30) int local30 = 0; local30 < 32; local30++) {
			Static560.aLongArray15[local30] = 0L;
		}
		Static341.anInt6053 = 0;
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(III)I")
	public static int method2527(@OriginalArg(1) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(16) int local16 = (arg0 & 0x7F) * 96 >> 7;
		if (local16 < 2) {
			local16 = 2;
		} else if (local16 > 126) {
			local16 = 126;
		}
		return local16 + (arg0 & 0xFF80);
	}
}
