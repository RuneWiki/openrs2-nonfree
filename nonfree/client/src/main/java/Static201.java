import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static201 {

	@OriginalMember(owner = "client!hl", name = "C", descriptor = "[Lclient!xa;")
	public static Class71[] aClass71Array24;

	@OriginalMember(owner = "client!hl", name = "o", descriptor = "Lclient!wfa;")
	public static Class344 aClass344_1 = new Class344();

	@OriginalMember(owner = "client!hl", name = "A", descriptor = "I")
	public static int anInt3845 = 0;

	@OriginalMember(owner = "client!hl", name = "B", descriptor = "I")
	public static int anInt3846 = 0;

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(BI)V")
	public static void method3332(@OriginalArg(1) int arg0) {
		Static49.anInt883 = 3;
		Static50.anInt8645 = arg0;
		Static190.anInt7946 = 100;
		Static119.anInt7220 = -1;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(II)I")
	public static int method3334(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}
}
