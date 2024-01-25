import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public final class Class194 {

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "I")
	public int anInt6208;

	@OriginalMember(owner = "client!tn", name = "e", descriptor = "[I")
	public final int[] anIntArray479;

	@OriginalMember(owner = "client!tn", name = "h", descriptor = "[I")
	public final int[] anIntArray480;

	@OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(I)V")
	public Class194(@OriginalArg(0) int arg0) {
		this.anInt6208 = arg0;
		this.anIntArray479 = new int[this.anInt6208];
		this.anIntArray480 = new int[this.anInt6208];
	}
}
