import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public final class Class257 {

	@OriginalMember(owner = "client!vq", name = "h", descriptor = "I")
	public int anInt7167;

	@OriginalMember(owner = "client!vq", name = "l", descriptor = "[I")
	public final int[] anIntArray632;

	@OriginalMember(owner = "client!vq", name = "g", descriptor = "[I")
	public final int[] anIntArray631;

	@OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(I)V")
	public Class257(@OriginalArg(0) int arg0) {
		this.anInt7167 = arg0;
		this.anIntArray632 = new int[this.anInt7167];
		this.anIntArray631 = new int[this.anInt7167];
	}
}
