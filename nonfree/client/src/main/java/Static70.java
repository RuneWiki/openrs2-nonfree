import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!gj", name = "D", descriptor = "I")
	public static int anInt1450 = 0;

	@OriginalMember(owner = "client!gj", name = "P", descriptor = "[I")
	public static final int[] anIntArray114 = new int[10000];

	@OriginalMember(owner = "client!gj", name = "Q", descriptor = "[I")
	public static final int[] anIntArray115 = Class26.anIntArray77;

	@OriginalMember(owner = "client!gj", name = "bb", descriptor = "[I")
	public static final int[] anIntArray119 = Class26.anIntArray76;

	@OriginalMember(owner = "client!gj", name = "fb", descriptor = "[I")
	public static final int[] anIntArray120 = new int[10000];

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lclient!pb;II)Lclient!gj;")
	public static Class7_Sub3 method975(@OriginalArg(0) Class71 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method2130(arg1, 0);
		return local5 == null ? null : new Class7_Sub3(local5);
	}
}
