import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public final class Class252 {

	@OriginalMember(owner = "client!ps", name = "f", descriptor = "I")
	public int anInt7034;

	@OriginalMember(owner = "client!ps", name = "g", descriptor = "[I")
	public final int[] anIntArray567;

	@OriginalMember(owner = "client!ps", name = "e", descriptor = "[I")
	public final int[] anIntArray566;

	@OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(I)V")
	public Class252(@OriginalArg(0) int arg0) {
		this.anInt7034 = arg0;
		this.anIntArray567 = new int[this.anInt7034];
		this.anIntArray566 = new int[this.anInt7034];
	}
}
