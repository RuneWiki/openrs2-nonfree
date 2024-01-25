import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public final class Class197 {

	@OriginalMember(owner = "client!mj", name = "g", descriptor = "I")
	public int anInt6065;

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "[I")
	public final int[] anIntArray417;

	@OriginalMember(owner = "client!mj", name = "d", descriptor = "[I")
	public final int[] anIntArray418;

	@OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(I)V")
	public Class197(@OriginalArg(0) int arg0) {
		this.anInt6065 = arg0;
		this.anIntArray417 = new int[this.anInt6065];
		this.anIntArray418 = new int[this.anInt6065];
	}
}
