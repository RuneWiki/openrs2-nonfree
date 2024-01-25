import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public final class Class22 {

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "I")
	public int anInt545;

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "[I")
	public final int[] anIntArray27;

	@OriginalMember(owner = "client!bh", name = "h", descriptor = "[I")
	public final int[] anIntArray29;

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(I)V")
	public Class22(@OriginalArg(0) int arg0) {
		this.anInt545 = arg0;
		this.anIntArray27 = new int[this.anInt545];
		this.anIntArray29 = new int[this.anInt545];
	}
}
