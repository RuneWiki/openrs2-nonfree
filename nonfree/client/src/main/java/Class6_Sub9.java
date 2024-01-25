import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public final class Class6_Sub9 extends Class6 {

	@OriginalMember(owner = "client!ck", name = "m", descriptor = "I")
	public int anInt1006;

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "()V")
	private Class6_Sub9() {
	}

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(I)V")
	public Class6_Sub9(@OriginalArg(0) int arg0) {
		this.anInt1006 = arg0;
	}
}
