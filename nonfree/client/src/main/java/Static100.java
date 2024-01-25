import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!dia", name = "b", descriptor = "[I")
	public static int[] anIntArray181;

	@OriginalMember(owner = "client!dia", name = "c", descriptor = "I")
	public static int anInt2903;

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "I")
	public static int anInt2902 = -1;

	@OriginalMember(owner = "client!dia", name = "f", descriptor = "I")
	public static int anInt2906 = 0;

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(IIC)I")
	public static int method2421(@OriginalArg(1) int arg0, @OriginalArg(2) char arg1) {
		@Pc(7) int local7 = arg1 << 4;
		if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
			@Pc(16) char local16 = Character.toLowerCase(arg1);
			local7 = (local16 << 4) + 1;
		}
		return local7;
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(IB)I")
	public static int method2422(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}
}
