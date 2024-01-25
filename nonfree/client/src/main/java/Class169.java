import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public final class Class169 {

	@OriginalMember(owner = "client!nr", name = "f", descriptor = "I")
	public int anInt4240;

	@OriginalMember(owner = "client!nr", name = "d", descriptor = "[I")
	public final int[] anIntArray481;

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "[I")
	public final int[] anIntArray480;

	@OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(I)V")
	public Class169(@OriginalArg(0) int arg0) {
		this.anInt4240 = arg0;
		this.anIntArray481 = new int[this.anInt4240];
		this.anIntArray480 = new int[this.anInt4240];
	}
}
