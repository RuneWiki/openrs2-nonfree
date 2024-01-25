import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public final class Class226 {

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "I")
	public int anInt6743;

	@OriginalMember(owner = "client!tq", name = "e", descriptor = "[I")
	public final int[] anIntArray487;

	@OriginalMember(owner = "client!tq", name = "c", descriptor = "[I")
	public final int[] anIntArray486;

	@OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(I)V")
	public Class226(@OriginalArg(0) int arg0) {
		this.anInt6743 = arg0;
		this.anIntArray487 = new int[this.anInt6743];
		this.anIntArray486 = new int[this.anInt6743];
	}
}
