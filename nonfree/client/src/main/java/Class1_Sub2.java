import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public final class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!aa", name = "B", descriptor = "[I")
	public int[] anIntArray10 = new int[] { -1 };

	@OriginalMember(owner = "client!aa", name = "M", descriptor = "[I")
	public int[] anIntArray11 = new int[1];
}
