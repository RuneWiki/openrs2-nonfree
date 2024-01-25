import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public final class Class207 {

	@OriginalMember(owner = "client!v", name = "b", descriptor = "I")
	public int anInt6318;

	@OriginalMember(owner = "client!v", name = "g", descriptor = "[I")
	public final int[] anIntArray511;

	@OriginalMember(owner = "client!v", name = "c", descriptor = "[I")
	public final int[] anIntArray510;

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "(I)V")
	public Class207(@OriginalArg(0) int arg0) {
		this.anInt6318 = arg0;
		this.anIntArray511 = new int[this.anInt6318];
		this.anIntArray510 = new int[this.anInt6318];
	}
}
