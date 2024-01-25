import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static407 {

	@OriginalMember(owner = "client!nm", name = "v", descriptor = "I")
	public static int anInt7587;

	@OriginalMember(owner = "client!nm", name = "q", descriptor = "I")
	public static int anInt7583 = 100;

	@OriginalMember(owner = "client!nm", name = "t", descriptor = "Lclient!hk;")
	public static final Class146 aClass146_8 = new Class146(14, 0, 4, 1);

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(II)I")
	public static int method6709(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(BI)Lclient!dw;")
	public static Class82 method6711() {
		return new Class82(1, false);
	}
}
