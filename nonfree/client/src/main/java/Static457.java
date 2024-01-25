import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static457 {

	@OriginalMember(owner = "client!ro", name = "h", descriptor = "I")
	public static int anInt7855;

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "Lclient!lca;")
	public static final Class203 aClass203_16 = new Class203(1);

	@OriginalMember(owner = "client!ro", name = "i", descriptor = "[I")
	public static final int[] anIntArray607 = new int[8];

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(II)I")
	public static int method6299(@OriginalArg(0) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		@Pc(10) int local10 = local0 | local0 >>> 1;
		@Pc(16) int local16 = local10 | local10 >>> 2;
		@Pc(30) int local30 = local16 | local16 >>> 4;
		@Pc(36) int local36 = local30 | local30 >>> 8;
		@Pc(42) int local42 = local36 | local36 >>> 16;
		return local42 + 1;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(B[B)Z")
	public static boolean method6300(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class1_Sub35 local8 = new Class1_Sub35(arg0);
		@Pc(12) int local12 = local8.method5750();
		if (local12 != 2) {
			return false;
		}
		@Pc(30) boolean local30 = local8.method5750() == 1;
		if (local30) {
			Static31.method421(local8);
		}
		Static455.method6285(local8);
		return true;
	}
}
