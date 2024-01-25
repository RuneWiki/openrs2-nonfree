import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public final class Class333 {

	@OriginalMember(owner = "client!tu", name = "e", descriptor = "I")
	public int anInt9955;

	@OriginalMember(owner = "client!tu", name = "c", descriptor = "[I")
	public final int[] anIntArray647;

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "[I")
	public final int[] anIntArray646;

	@OriginalMember(owner = "client!tu", name = "<init>", descriptor = "(I)V")
	public Class333(@OriginalArg(0) int arg0) {
		this.anInt9955 = arg0;
		this.anIntArray647 = new int[this.anInt9955];
		this.anIntArray646 = new int[this.anInt9955];
	}
}
