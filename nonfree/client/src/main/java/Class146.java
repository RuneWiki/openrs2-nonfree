import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public final class Class146 {

	@OriginalMember(owner = "client!nr", name = "f", descriptor = "I")
	public int anInt4414;

	@OriginalMember(owner = "client!nr", name = "g", descriptor = "[I")
	public final int[] anIntArray357;

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "[I")
	public final int[] anIntArray356;

	@OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(I)V")
	public Class146(@OriginalArg(0) int arg0) {
		this.anInt4414 = arg0;
		this.anIntArray357 = new int[this.anInt4414];
		this.anIntArray356 = new int[this.anInt4414];
	}
}
