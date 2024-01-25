import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public final class Class163 {

	@OriginalMember(owner = "client!pe", name = "j", descriptor = "I")
	public int anInt4750;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "[I")
	public final int[] anIntArray428;

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "[I")
	public final int[] anIntArray429;

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(I)V")
	public Class163(@OriginalArg(0) int arg0) {
		this.anInt4750 = arg0;
		this.anIntArray428 = new int[this.anInt4750];
		this.anIntArray429 = new int[this.anInt4750];
	}
}
