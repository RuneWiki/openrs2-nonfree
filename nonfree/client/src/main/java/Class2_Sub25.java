import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public final class Class2_Sub25 extends Class2 {

	@OriginalMember(owner = "client!rg", name = "n", descriptor = "I")
	public int anInt4838;

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "()V")
	public Class2_Sub25() {
	}

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(I)V")
	public Class2_Sub25(@OriginalArg(0) int arg0) {
		this.anInt4838 = arg0;
	}
}
