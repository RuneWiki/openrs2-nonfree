import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static428 {

	@OriginalMember(owner = "client!qfa", name = "b", descriptor = "I")
	public static int anInt8187;

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(BI)V")
	public static void method6375(@OriginalArg(1) int arg0) {
		@Pc(8) Class4_Sub6_Sub5 local8 = Static396.method6079(arg0, 3);
		local8.method2302();
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IB)I")
	public static int method6377(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}
}
