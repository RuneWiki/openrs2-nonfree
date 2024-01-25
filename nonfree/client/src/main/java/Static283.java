import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static283 {

	@OriginalMember(owner = "client!sd", name = "m", descriptor = "I")
	public static int anInt5557 = 0;

	@OriginalMember(owner = "client!sd", name = "n", descriptor = "Lclient!ik;")
	public static final Class103 aClass103_59 = new Class103(260);

	@OriginalMember(owner = "client!sd", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString351 = "Loading interfaces - ";

	@OriginalMember(owner = "client!sd", name = "v", descriptor = "Lclient!ik;")
	public static final Class103 aClass103_60 = new Class103(50);

	@OriginalMember(owner = "client!sd", name = "w", descriptor = "[I")
	public static final int[] anIntArray708 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

	@OriginalMember(owner = "client!sd", name = "x", descriptor = "I")
	public static int anInt5564 = 0;

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)V")
	public static void method4694() {
		Static314.aClass7_Sub32_1 = new Class7_Sub32(Static339.aString425, "", Static221.anInt4408, 1002, 0L, 0, 0);
	}

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "(II)I")
	public static int method4696(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static20.anIntArrayArray5 == null ? 0 : Static20.anIntArrayArray5[arg0][arg1] >>> 21 & 0x7F8;
	}
}
