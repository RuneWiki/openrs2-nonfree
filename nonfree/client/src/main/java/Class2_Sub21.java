import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public final class Class2_Sub21 extends Class2 {

	@OriginalMember(owner = "client!ph", name = "t", descriptor = "I")
	public int anInt4234;

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "()V")
	public Class2_Sub21() {
	}

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(I)V")
	public Class2_Sub21(@OriginalArg(0) int arg0) {
		this.anInt4234 = arg0;
	}
}
