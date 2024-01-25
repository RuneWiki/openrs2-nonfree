import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public final class Class6_Sub6 extends Class6 {

	@OriginalMember(owner = "client!be", name = "k", descriptor = "I")
	public int anInt482;

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "()V")
	private Class6_Sub6() {
	}

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "(I)V")
	public Class6_Sub6(@OriginalArg(0) int arg0) {
		this.anInt482 = arg0;
	}
}
