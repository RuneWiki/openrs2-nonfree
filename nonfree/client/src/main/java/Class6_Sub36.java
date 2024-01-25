import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public final class Class6_Sub36 extends Class6 {

	@OriginalMember(owner = "client!lq", name = "n", descriptor = "I")
	public int anInt5996;

	@OriginalMember(owner = "client!lq", name = "<init>", descriptor = "()V")
	private Class6_Sub36() {
	}

	@OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(I)V")
	public Class6_Sub36(@OriginalArg(0) int arg0) {
		this.anInt5996 = arg0;
	}
}
