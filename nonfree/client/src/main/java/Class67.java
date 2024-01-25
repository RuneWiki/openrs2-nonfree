import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public final class Class67 {

	@OriginalMember(owner = "client!ek", name = "f", descriptor = "I")
	public int anInt1860;

	@OriginalMember(owner = "client!ek", name = "d", descriptor = "[I")
	public final int[] anIntArray144;

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "[I")
	public final int[] anIntArray143;

	@OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(I)V")
	public Class67(@OriginalArg(0) int arg0) {
		this.anInt1860 = arg0;
		this.anIntArray144 = new int[this.anInt1860];
		this.anIntArray143 = new int[this.anInt1860];
	}
}
