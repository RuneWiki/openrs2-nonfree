import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public final class Class6_Sub10 extends Class6 {

	@OriginalMember(owner = "client!wu", name = "i", descriptor = "I")
	public final int anInt9618;

	@OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(I)V")
	public Class6_Sub10(@OriginalArg(0) int arg0) {
		this.anInt9618 = arg0;
	}
}
