import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public final class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!aa", name = "F", descriptor = "[I")
	public int[] anIntArray20 = new int[] { -1 };

	@OriginalMember(owner = "client!aa", name = "P", descriptor = "[I")
	public int[] anIntArray22 = new int[1];
}
