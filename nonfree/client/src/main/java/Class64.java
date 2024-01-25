import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public final class Class64 {

	@OriginalMember(owner = "client!ep", name = "d", descriptor = "I")
	public int anInt1473;

	@OriginalMember(owner = "client!ep", name = "e", descriptor = "[I")
	public final int[] anIntArray122;

	@OriginalMember(owner = "client!ep", name = "l", descriptor = "[I")
	public final int[] anIntArray123;

	@OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(I)V")
	public Class64(@OriginalArg(0) int arg0) {
		this.anInt1473 = arg0;
		this.anIntArray122 = new int[this.anInt1473];
		this.anIntArray123 = new int[this.anInt1473];
	}
}
