import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static4 {

	@OriginalMember(owner = "client!aca", name = "d", descriptor = "Lclient!pfa;")
	public static Class251 aClass251_4;

	@OriginalMember(owner = "client!aca", name = "b", descriptor = "I")
	public static final int anInt239 = 1401;

	@OriginalMember(owner = "client!aca", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString3 = "";

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(II)I")
	public static int method159(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static305.aByteArrayArray4 == null ? 0 : Static305.aByteArrayArray4[arg0][arg1] & 0xFF;
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(B)[Lclient!tl;")
	public static Class319[] method161() {
		return new Class319[] { Static533.aClass319_14, Static49.aClass319_3, Static306.aClass319_7 };
	}
}
