import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public final class Class42 {

	@OriginalMember(owner = "client!bs", name = "d", descriptor = "I")
	public int anInt1335;

	@OriginalMember(owner = "client!bs", name = "f", descriptor = "[I")
	public final int[] anIntArray37;

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "[I")
	public final int[] anIntArray36;

	@OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(I)V")
	public Class42(@OriginalArg(0) int arg0) {
		this.anInt1335 = arg0;
		this.anIntArray37 = new int[this.anInt1335];
		this.anIntArray36 = new int[this.anInt1335];
	}
}
