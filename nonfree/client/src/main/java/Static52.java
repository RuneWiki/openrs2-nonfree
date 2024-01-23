import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static52 {

	@OriginalMember(owner = "client!f", name = "c", descriptor = "I")
	public static int anInt1233;

	@OriginalMember(owner = "client!f", name = "d", descriptor = "[I")
	public static int[] anIntArray74;

	@OriginalMember(owner = "client!f", name = "e", descriptor = "Lclient!jb;")
	public static Class1_Sub2_Sub11 aClass1_Sub2_Sub11_1;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "[I")
	public static int[] anIntArray73 = new int[1000];

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(BI)I")
	public static int method927(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}
}
