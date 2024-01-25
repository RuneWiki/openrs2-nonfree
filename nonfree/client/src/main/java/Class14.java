import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aga")
public final class Class14 {

	@OriginalMember(owner = "client!aga", name = "b", descriptor = "I")
	public int anInt161;

	@OriginalMember(owner = "client!aga", name = "d", descriptor = "[I")
	public final int[] anIntArray12;

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "[I")
	public final int[] anIntArray11;

	@OriginalMember(owner = "client!aga", name = "<init>", descriptor = "(I)V")
	public Class14(@OriginalArg(0) int arg0) {
		this.anInt161 = arg0;
		this.anIntArray12 = new int[this.anInt161];
		this.anIntArray11 = new int[this.anInt161];
	}
}
