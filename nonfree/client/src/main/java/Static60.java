import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static60 {

	@OriginalMember(owner = "client!dn", name = "t", descriptor = "[I")
	public static int[] anIntArray122;

	@OriginalMember(owner = "client!dn", name = "p", descriptor = "Lclient!ge;")
	public static final Class1_Sub7_Sub2 aClass1_Sub7_Sub2_1 = new Class1_Sub7_Sub2(5000);

	@OriginalMember(owner = "client!dn", name = "s", descriptor = "[Lclient!jf;")
	public static final Class101[] aClass101Array1 = new Class101[8];

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(II)I")
	public static int method1457(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static118.anIntArrayArray20 == null ? 0 : Static118.anIntArrayArray20[arg0][arg1] & 0xFFFFFF;
	}
}
