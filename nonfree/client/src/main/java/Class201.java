import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public final class Class201 {

	@OriginalMember(owner = "client!qi", name = "g", descriptor = "I")
	public int anInt5614;

	@OriginalMember(owner = "client!qi", name = "e", descriptor = "[I")
	public final int[] anIntArray368;

	@OriginalMember(owner = "client!qi", name = "h", descriptor = "[I")
	public final int[] anIntArray369;

	@OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(I)V")
	public Class201(@OriginalArg(0) int arg0) {
		this.anInt5614 = arg0;
		this.anIntArray368 = new int[this.anInt5614];
		this.anIntArray369 = new int[this.anInt5614];
	}
}
