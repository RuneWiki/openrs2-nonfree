import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public final class Class5_Sub27 extends Class5 {

	@OriginalMember(owner = "client!jm", name = "o", descriptor = "I")
	public int anInt4812;

	@OriginalMember(owner = "client!jm", name = "<init>", descriptor = "()V")
	private Class5_Sub27() {
	}

	@OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(I)V")
	public Class5_Sub27(@OriginalArg(0) int arg0) {
		this.anInt4812 = arg0;
	}
}
