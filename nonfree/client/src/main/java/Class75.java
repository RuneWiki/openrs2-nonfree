import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public final class Class75 {

	@OriginalMember(owner = "client!dl", name = "d", descriptor = "I")
	public int anInt1988;

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "[I")
	public final int[] anIntArray102;

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "[I")
	public final int[] anIntArray103;

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(I)V")
	public Class75(@OriginalArg(0) int arg0) {
		this.anInt1988 = arg0;
		this.anIntArray102 = new int[this.anInt1988];
		this.anIntArray103 = new int[this.anInt1988];
	}
}
