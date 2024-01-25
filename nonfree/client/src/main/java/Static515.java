import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static515 {

	@OriginalMember(owner = "client!se", name = "o", descriptor = "Lclient!wu;")
	public static Class384 aClass384_115;

	@OriginalMember(owner = "client!se", name = "t", descriptor = "[I")
	public static final int[] anIntArray676 = new int[3];

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method7420(@OriginalArg(0) String arg0) {
		return Static276.method7943(arg0);
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(I)V")
	public static void method7421() {
		for (@Pc(6) Class5_Sub25 local6 = (Class5_Sub25) Static587.aClass81_67.method1608(); local6 != null; local6 = (Class5_Sub25) Static587.aClass81_67.method1610()) {
			Static44.method753(local6.anInt4568);
		}
	}
}
