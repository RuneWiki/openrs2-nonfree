import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public final class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!a", name = "V", descriptor = "[I")
	public int[] anIntArray9 = new int[] { -1 };

	@OriginalMember(owner = "client!a", name = "Z", descriptor = "[I")
	public int[] anIntArray11 = new int[1];
}
