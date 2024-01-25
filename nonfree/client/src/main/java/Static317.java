import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static317 {

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "Lclient!aq;")
	public static final Class22 aClass22_35 = new Class22(8);

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "[[B")
	public static final byte[][] aByteArrayArray15 = new byte[1000][];

	@OriginalMember(owner = "client!kk", name = "i", descriptor = "I")
	public static int anInt7576 = -2;

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public static String method6701(@OriginalArg(1) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}
}
