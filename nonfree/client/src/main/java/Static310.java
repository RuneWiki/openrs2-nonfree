import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static310 {

	@OriginalMember(owner = "client!wg", name = "S", descriptor = "I")
	public static int anInt6101;

	@OriginalMember(owner = "client!wg", name = "bb", descriptor = "I")
	public static int anInt6109;

	@OriginalMember(owner = "client!wg", name = "fb", descriptor = "Lclient!rn;")
	public static Class155 aClass155_122;

	@OriginalMember(owner = "client!wg", name = "gb", descriptor = "I")
	public static int anInt6112;

	@OriginalMember(owner = "client!wg", name = "ib", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray20;

	@OriginalMember(owner = "client!wg", name = "P", descriptor = "Lclient!i;")
	public static Class3_Sub14 aClass3_Sub14_1 = new Class3_Sub14(0, 0);

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "(I)V")
	public static void method4989() {
		Static206.aClass98_34.method2572();
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(BI)I")
	public static int method4990(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 >>> 1;
		@Pc(13) int local13 = local7 | local7 >>> 1;
		@Pc(19) int local19 = local13 | local13 >>> 2;
		@Pc(25) int local25 = local19 | local19 >>> 4;
		@Pc(31) int local31 = local25 | local25 >>> 8;
		@Pc(42) int local42 = local31 | local31 >>> 16;
		return ~local42 & arg0;
	}
}
