import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public final class Class5_Sub37 extends Class5 {

	@OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
	public int anInt5532;

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "()V")
	private Class5_Sub37() {
	}

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(I)V")
	public Class5_Sub37(@OriginalArg(0) int arg0) {
		this.anInt5532 = arg0;
	}
}
