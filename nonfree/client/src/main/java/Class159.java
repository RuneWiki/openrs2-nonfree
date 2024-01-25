import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public final class Class159 {

	@OriginalMember(owner = "client!nf", name = "c", descriptor = "I")
	public int anInt4270;

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "[I")
	public final int[] anIntArray520;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "[I")
	public final int[] anIntArray519;

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(I)V")
	public Class159(@OriginalArg(0) int arg0) {
		this.anInt4270 = arg0;
		this.anIntArray520 = new int[this.anInt4270];
		this.anIntArray519 = new int[this.anInt4270];
	}
}
