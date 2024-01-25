import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public final class Class5_Sub15 extends Class5 {

	@OriginalMember(owner = "client!fi", name = "r", descriptor = "I")
	public int anInt1686;

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "()V")
	private Class5_Sub15() {
	}

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(I)V")
	public Class5_Sub15(@OriginalArg(0) int arg0) {
		this.anInt1686 = arg0;
	}
}
