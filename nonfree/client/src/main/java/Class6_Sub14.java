import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public final class Class6_Sub14 extends Class6 {

	@OriginalMember(owner = "client!ej", name = "n", descriptor = "I")
	public int anInt2188;

	@OriginalMember(owner = "client!ej", name = "<init>", descriptor = "()V")
	private Class6_Sub14() {
	}

	@OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(I)V")
	public Class6_Sub14(@OriginalArg(0) int arg0) {
		this.anInt2188 = arg0;
	}
}
