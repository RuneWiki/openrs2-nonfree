import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!se", name = "v", descriptor = "[I")
	public static final int[] anIntArray321 = new int[10000];

	@OriginalMember(owner = "client!se", name = "I", descriptor = "[I")
	public static final int[] anIntArray325 = Class1_Sub2_Sub8_Sub4.anIntArray350;

	@OriginalMember(owner = "client!se", name = "N", descriptor = "[I")
	public static final int[] anIntArray326 = new int[10000];

	@OriginalMember(owner = "client!se", name = "U", descriptor = "[I")
	public static final int[] anIntArray328 = Class1_Sub2_Sub8_Sub4.anIntArray355;

	@OriginalMember(owner = "client!se", name = "Z", descriptor = "I")
	public static int anInt3818 = 0;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!ve;II)Lclient!se;")
	public static Class5_Sub6 method2955(@OriginalArg(0) Class69 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method2208(arg1, 0);
		return local5 == null ? null : new Class5_Sub6(local5);
	}
}
