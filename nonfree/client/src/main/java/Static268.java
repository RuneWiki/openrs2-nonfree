import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static268 {

	@OriginalMember(owner = "client!pi", name = "i", descriptor = "I")
	public static int anInt4728;

	@OriginalMember(owner = "client!pi", name = "l", descriptor = "Lclient!lh;")
	public static Class145 aClass145_4;

	@OriginalMember(owner = "client!pi", name = "e", descriptor = "[B")
	public static final byte[] aByteArray60 = new byte[2048];

	@OriginalMember(owner = "client!pi", name = "g", descriptor = "I")
	public static int anInt4726 = 0;

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(BI)I")
	public static int method4250(@OriginalArg(1) int arg0) {
		return arg0 & 0x3FF;
	}
}
