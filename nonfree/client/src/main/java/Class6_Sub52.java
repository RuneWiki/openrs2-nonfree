import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public final class Class6_Sub52 extends Class6 {

	@OriginalMember(owner = "client!uj", name = "i", descriptor = "S")
	public short aShort130;

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "()V")
	private Class6_Sub52() {
	}

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(S)V")
	public Class6_Sub52(@OriginalArg(0) short arg0) {
		this.aShort130 = arg0;
	}
}
