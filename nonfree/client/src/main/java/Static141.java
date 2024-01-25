import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!gw", name = "g", descriptor = "[Lclient!l;")
	public static Class143[] aClass143Array3;

	@OriginalMember(owner = "client!gw", name = "c", descriptor = "[I")
	public static final int[] anIntArray211 = new int[14];

	@OriginalMember(owner = "client!gw", name = "h", descriptor = "[I")
	public static final int[] anIntArray212 = new int[8];

	@OriginalMember(owner = "client!gw", name = "k", descriptor = "I")
	public static int anInt2741 = -1;

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(I)Lclient!en;")
	public static Class1_Sub2_Sub6 method2349() {
		@Pc(13) Class1_Sub2_Sub6 local13 = (Class1_Sub2_Sub6) Static397.aClass227_10.method5109();
		if (local13 != null) {
			local13.method6020();
			local13.method5813();
			return local13;
		}
		do {
			local13 = (Class1_Sub2_Sub6) Static177.aClass227_2.method5109();
			if (local13 == null) {
				return null;
			}
			if (local13.method1782() > Static279.method4058()) {
				return null;
			}
			local13.method6020();
			local13.method5813();
		} while ((Long.MIN_VALUE & local13.aLong213) == 0L);
		return local13;
	}
}
