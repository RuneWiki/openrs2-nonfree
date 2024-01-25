import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public final class Class86 {

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
	public int anInt2511;

	@OriginalMember(owner = "client!fe", name = "f", descriptor = "[I")
	public final int[] anIntArray321;

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "[I")
	public final int[] anIntArray320;

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(I)V")
	public Class86(@OriginalArg(0) int arg0) {
		this.anInt2511 = arg0;
		this.anIntArray321 = new int[this.anInt2511];
		this.anIntArray320 = new int[this.anInt2511];
	}
}
