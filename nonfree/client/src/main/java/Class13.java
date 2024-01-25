import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public final class Class13 {

	@OriginalMember(owner = "client!am", name = "d", descriptor = "I")
	public int anInt223;

	@OriginalMember(owner = "client!am", name = "b", descriptor = "[I")
	public final int[] anIntArray25;

	@OriginalMember(owner = "client!am", name = "e", descriptor = "[I")
	public final int[] anIntArray26;

	@OriginalMember(owner = "client!am", name = "<init>", descriptor = "(I)V")
	public Class13(@OriginalArg(0) int arg0) {
		this.anInt223 = arg0;
		this.anIntArray25 = new int[this.anInt223];
		this.anIntArray26 = new int[this.anInt223];
	}
}
