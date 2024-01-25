import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static498 {

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "F")
	public static float aFloat184;

	@OriginalMember(owner = "client!qr", name = "o", descriptor = "[I")
	public static int[] anIntArray542;

	@OriginalMember(owner = "client!qr", name = "l", descriptor = "Lclient!vl;")
	public static final Class376 aClass376_118 = new Class376(16, 8);

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(BI)V")
	public static void method7097(@OriginalArg(1) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static200.anInt3634 = arg0;
		Static124.aClass23_Sub5Array1 = new Class23_Sub5[Static241.anIntArray294[Static200.anInt3634] + 1];
		Static247.anInt4594 = 0;
		Static673.anInt7817 = 0;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(Lclient!da;)V")
	public static void method7098(@OriginalArg(0) Class69 arg0) {
		Static192.aClass69_4 = arg0;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(IBI)I")
	public static int method7099(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static650.anIntArray643[arg1 & 0x3] : Static486.anIntArray532[arg1 & 0x3];
	}
}
