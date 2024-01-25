import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static143 {

	@OriginalMember(owner = "client!ep", name = "q", descriptor = "[[B")
	public static byte[][] aByteArrayArray4;

	@OriginalMember(owner = "client!ep", name = "r", descriptor = "[Z")
	public static boolean[] aBooleanArray11;

	@OriginalMember(owner = "client!ep", name = "i", descriptor = "[F")
	public static final float[] aFloatArray31 = new float[16];

	@OriginalMember(owner = "client!ep", name = "p", descriptor = "Lclient!mo;")
	public static final Class239 aClass239_3 = new Class239("", 11);

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public static boolean method2460(@OriginalArg(0) String arg0) {
		return Static679.aHashtable7.containsKey(arg0);
	}
}
