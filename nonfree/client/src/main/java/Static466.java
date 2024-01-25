import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static466 {

	@OriginalMember(owner = "client!rs", name = "I", descriptor = "[[B")
	public static byte[][] aByteArrayArray10;

	@OriginalMember(owner = "client!rs", name = "G", descriptor = "Lclient!fv;")
	public static final Class108 aClass108_4 = new Class108();

	@OriginalMember(owner = "client!rs", name = "L", descriptor = "I")
	public static int anInt2594 = -2;

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(II)I")
	public static int method2184(@OriginalArg(1) int arg0) {
		return arg0 & 0x3FF;
	}

	@OriginalMember(owner = "client!rs", name = "d", descriptor = "(I)[Lclient!mo;")
	public static Class218[] method2185() {
		return new Class218[] { Static122.aClass218_4, Static243.aClass218_5, Static428.aClass218_7, Static363.aClass218_9, Static489.aClass218_10, Static584.aClass218_11 };
	}
}
