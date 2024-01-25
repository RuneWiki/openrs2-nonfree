import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static224 {

	@OriginalMember(owner = "client!id", name = "c", descriptor = "I")
	public static int anInt4192;

	@OriginalMember(owner = "client!id", name = "d", descriptor = "[I")
	public static int[] anIntArray214;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_69 = new Class337(10, -2);

	@OriginalMember(owner = "client!id", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString44 = null;

	@OriginalMember(owner = "client!id", name = "n", descriptor = "I")
	public static int anInt4200 = 0;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IZI)I")
	public static int method3816(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static626.anIntArray348[arg0 & 0x3] : Static446.anIntArray410[arg0 & 0x3];
	}
}
