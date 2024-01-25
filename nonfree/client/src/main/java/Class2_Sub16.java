import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public final class Class2_Sub16 extends Class2 {

	@OriginalMember(owner = "client!fs", name = "q", descriptor = "I")
	public int anInt2428;

	@OriginalMember(owner = "client!fs", name = "<init>", descriptor = "()V")
	private Class2_Sub16() {
	}

	@OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(I)V")
	public Class2_Sub16(@OriginalArg(0) int arg0) {
		this.anInt2428 = arg0;
	}
}
