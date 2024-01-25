import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static253 {

	@OriginalMember(owner = "client!mn", name = "P", descriptor = "Lclient!ia;")
	public static Class18 aClass18_5;

	@OriginalMember(owner = "client!mn", name = "W", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray40;

	@OriginalMember(owner = "client!mn", name = "L", descriptor = "Lclient!jm;")
	public static final Class131 aClass131_119 = new Class131(80, 5);

	@OriginalMember(owner = "client!mn", name = "O", descriptor = "I")
	public static int anInt4554 = 0;

	@OriginalMember(owner = "client!mn", name = "U", descriptor = "I")
	public static final int anInt4559 = 1400;

	@OriginalMember(owner = "client!mn", name = "V", descriptor = "[I")
	public static final int[] anIntArray368 = new int[13];

	@OriginalMember(owner = "client!mn", name = "c", descriptor = "(III)I")
	public static int method3734(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static123.anIntArray205[arg1 & 0x3] : Static68.anIntArray95[arg1 & 0x3];
	}
}
