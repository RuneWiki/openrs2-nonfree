import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static8 {

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "[[B")
	public static byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "Lclient!qt;")
	public static final Class212 aClass212_2 = new Class212(10, 8);

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method76(@OriginalArg(0) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Z)Lclient!vv;")
	public static Class82_Sub1 method77() {
		return Static117.anInt4903 < Static155.aClass82_Sub1Array3.length ? Static155.aClass82_Sub1Array3[Static117.anInt4903++] : null;
	}
}
