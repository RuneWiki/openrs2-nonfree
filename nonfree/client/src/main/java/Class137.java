import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public final class Class137 {

	@OriginalMember(owner = "client!na", name = "h", descriptor = "I")
	public int anInt4323;

	@OriginalMember(owner = "client!na", name = "e", descriptor = "[I")
	public final int[] anIntArray367;

	@OriginalMember(owner = "client!na", name = "i", descriptor = "[I")
	public final int[] anIntArray368;

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "(I)V")
	public Class137(@OriginalArg(0) int arg0) {
		this.anInt4323 = arg0;
		this.anIntArray367 = new int[this.anInt4323];
		this.anIntArray368 = new int[this.anInt4323];
	}
}
