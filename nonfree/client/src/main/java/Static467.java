import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static467 {

	@OriginalMember(owner = "client!qp", name = "d", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray11;

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "Lclient!an;")
	public static final Class20 aClass20_19 = new Class20(1, 7);

	@OriginalMember(owner = "client!qp", name = "c", descriptor = "I")
	public static int anInt8439 = 7000;

	@OriginalMember(owner = "client!qp", name = "e", descriptor = "I")
	public static int anInt8440 = anInt8439;

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(III)B")
	public static byte method6969(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
