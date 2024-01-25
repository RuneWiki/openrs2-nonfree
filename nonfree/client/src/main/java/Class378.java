import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public final class Class378 {

	@OriginalMember(owner = "client!wq", name = "d", descriptor = "I")
	public int anInt10597;

	@OriginalMember(owner = "client!wq", name = "b", descriptor = "[I")
	public final int[] anIntArray603;

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "[I")
	public final int[] anIntArray602;

	@OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(I)V")
	public Class378(@OriginalArg(0) int arg0) {
		this.anInt10597 = arg0;
		this.anIntArray603 = new int[this.anInt10597];
		this.anIntArray602 = new int[this.anInt10597];
	}
}
