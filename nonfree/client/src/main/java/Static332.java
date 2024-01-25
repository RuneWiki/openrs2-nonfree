import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static332 {

	@OriginalMember(owner = "client!mq", name = "f", descriptor = "I")
	public static int anInt6909;

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(BIZ)Ljava/lang/String;")
	public static String method5750(@OriginalArg(1) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : Static6.method277(arg0);
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(I[B)[B")
	public static byte[] method5751(@OriginalArg(1) byte[] arg0) {
		@Pc(11) int local11 = arg0.length;
		@Pc(14) byte[] local14 = new byte[local11];
		Static602.method4666(arg0, 0, local14, 0, local11);
		return local14;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IB)I")
	public static int method5752(@OriginalArg(0) int arg0) {
		@Pc(12) int local12 = arg0 >>> 1;
		@Pc(18) int local18 = local12 | local12 >>> 1;
		@Pc(24) int local24 = local18 | local18 >>> 2;
		@Pc(30) int local30 = local24 | local24 >>> 4;
		@Pc(36) int local36 = local30 | local30 >>> 8;
		@Pc(42) int local42 = local36 | local36 >>> 16;
		return ~local42 & arg0;
	}
}
