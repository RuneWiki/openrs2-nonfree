import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public final class Class374 {

	@OriginalMember(owner = "client!wf", name = "e", descriptor = "I")
	public int anInt10540;

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "[I")
	public final int[] anIntArray559;

	@OriginalMember(owner = "client!wf", name = "f", descriptor = "[I")
	public final int[] anIntArray561;

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(I)V")
	public Class374(@OriginalArg(0) int arg0) {
		this.anInt10540 = arg0;
		this.anIntArray559 = new int[this.anInt10540];
		this.anIntArray561 = new int[this.anInt10540];
	}
}
