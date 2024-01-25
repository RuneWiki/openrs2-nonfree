import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static201 {

	@OriginalMember(owner = "client!nj", name = "t", descriptor = "Lclient!cp;")
	public static Class36 aClass36_3;

	@OriginalMember(owner = "client!nj", name = "p", descriptor = "[I")
	public static final int[] anIntArray665 = new int[13];

	@OriginalMember(owner = "client!nj", name = "V", descriptor = "Ljava/lang/String;")
	public static String aString269 = "glow3:";

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(BI)I")
	public static int method5707(@OriginalArg(1) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!nj", name = "d", descriptor = "(BI)I")
	public static int method5726(@OriginalArg(1) int arg0) {
		return arg0 == 16711935 ? -1 : Static334.method5583(arg0);
	}
}
