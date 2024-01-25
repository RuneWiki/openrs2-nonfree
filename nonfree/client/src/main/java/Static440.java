import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static440 {

	@OriginalMember(owner = "client!wf", name = "Q", descriptor = "I")
	public static int anInt7506;

	@OriginalMember(owner = "client!wf", name = "N", descriptor = "[[B")
	public static final byte[][] aByteArrayArray24 = new byte[250][];

	@OriginalMember(owner = "client!wf", name = "T", descriptor = "I")
	public static final int anInt7509 = 328;

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "(II)Ljava/lang/String;")
	public static String method5892(@OriginalArg(1) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}
}
