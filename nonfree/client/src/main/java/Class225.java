import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public final class Class225 {

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
	public int anInt5491;

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "[I")
	public final int[] anIntArray423;

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "[I")
	public final int[] anIntArray422;

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(I)V")
	public Class225(@OriginalArg(0) int arg0) {
		this.anInt5491 = arg0;
		this.anIntArray423 = new int[this.anInt5491];
		this.anIntArray422 = new int[this.anInt5491];
	}
}
