import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!ai", name = "vb", descriptor = "[I")
	public static final int[] anIntArray24 = Class1_Sub2_Sub5_Sub2.anIntArray138;

	@OriginalMember(owner = "client!ai", name = "Hb", descriptor = "[I")
	public static final int[] anIntArray27 = Class1_Sub2_Sub5_Sub2.anIntArray142;

	@OriginalMember(owner = "client!ai", name = "Lb", descriptor = "I")
	public static int anInt252 = 0;

	@OriginalMember(owner = "client!ai", name = "Ub", descriptor = "[I")
	public static final int[] anIntArray29 = new int[10000];

	@OriginalMember(owner = "client!ai", name = "Vb", descriptor = "[I")
	public static final int[] anIntArray30 = new int[10000];

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!sd;II)Lclient!ai;")
	public static Class6_Sub1 method193(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method2340(0, arg1);
		return local5 == null ? null : new Class6_Sub1(local5);
	}
}
