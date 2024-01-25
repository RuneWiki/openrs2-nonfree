import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public final class Class377 {

	@OriginalMember(owner = "client!uk", name = "g", descriptor = "I")
	public int anInt10084;

	@OriginalMember(owner = "client!uk", name = "d", descriptor = "[I")
	public final int[] anIntArray732;

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "[I")
	public final int[] anIntArray733;

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(I)V")
	public Class377(@OriginalArg(0) int arg0) {
		this.anInt10084 = arg0;
		this.anIntArray732 = new int[this.anInt10084];
		this.anIntArray733 = new int[this.anInt10084];
	}
}
