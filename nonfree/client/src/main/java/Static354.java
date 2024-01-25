import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static354 {

	@OriginalMember(owner = "client!nga", name = "i", descriptor = "I")
	public static int anInt6168;

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "[I")
	public static final int[] anIntArray512 = new int[256];

	@OriginalMember(owner = "client!nga", name = "l", descriptor = "Lclient!gj;")
	public static final Class124 aClass124_32 = new Class124();

	@OriginalMember(owner = "client!nga", name = "m", descriptor = "[I")
	public static final int[] anIntArray513 = new int[5];

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(III)Z")
	public static boolean method5231(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(II)Z")
	public static boolean method5232(@OriginalArg(1) int arg0) {
		return arg0 == 7 || arg0 == 9;
	}

	@OriginalMember(owner = "client!nga", name = "b", descriptor = "(III)Z")
	public static boolean method5233(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public static void method5234(@OriginalArg(0) String arg0) {
		Static410.method5899("", "", arg0, 0, "", 0);
	}
}
