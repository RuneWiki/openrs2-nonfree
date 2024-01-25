import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static361 {

	@OriginalMember(owner = "client!se", name = "q", descriptor = "I")
	public static int anInt627;

	@OriginalMember(owner = "client!se", name = "n", descriptor = "[S")
	public static short[] aShortArray9 = new short[256];

	@OriginalMember(owner = "client!se", name = "o", descriptor = "[I")
	public static final int[] anIntArray51 = new int[1000];

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!fh;I)Lclient!rg;")
	public static Class51_Sub2 method516(@OriginalArg(0) Class4_Sub9 arg0) {
		return new Class51_Sub2(arg0.method5061(), arg0.method5061(), arg0.method5061(), arg0.method5061(), arg0.method5008(), arg0.method5007());
	}
}
