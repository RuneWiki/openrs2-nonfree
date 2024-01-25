import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public final class Class214 {

	@OriginalMember(owner = "client!lp", name = "e", descriptor = "I")
	public int anInt5134;

	@OriginalMember(owner = "client!lp", name = "d", descriptor = "[I")
	public final int[] anIntArray357;

	@OriginalMember(owner = "client!lp", name = "c", descriptor = "[I")
	public final int[] anIntArray356;

	@OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(I)V")
	public Class214(@OriginalArg(0) int arg0) {
		this.anInt5134 = arg0;
		this.anIntArray357 = new int[this.anInt5134];
		this.anIntArray356 = new int[this.anInt5134];
	}
}
