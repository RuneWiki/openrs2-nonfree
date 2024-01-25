import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static160 {

	@OriginalMember(owner = "client!kf", name = "y", descriptor = "Lclient!dp;")
	public static Class53 aClass53_88;

	@OriginalMember(owner = "client!kf", name = "B", descriptor = "Lclient!po;")
	public static Class72 aClass72_3;

	@OriginalMember(owner = "client!kf", name = "D", descriptor = "[I")
	public static final int[] anIntArray360 = new int[100];

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(II)Ljava/lang/String;")
	public static String method3160(@OriginalArg(0) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}
}
