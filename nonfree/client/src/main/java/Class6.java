import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public final class Class6 {

	@OriginalMember(owner = "client!af", name = "g", descriptor = "I")
	public int anInt158;

	@OriginalMember(owner = "client!af", name = "b", descriptor = "[I")
	public final int[] anIntArray22;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "[I")
	public final int[] anIntArray21;

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "(I)V")
	public Class6(@OriginalArg(0) int arg0) {
		this.anInt158 = arg0;
		this.anIntArray22 = new int[this.anInt158];
		this.anIntArray21 = new int[this.anInt158];
	}
}
