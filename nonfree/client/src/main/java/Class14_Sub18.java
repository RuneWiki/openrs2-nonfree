import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eka")
public final class Class14_Sub18 extends Class14 {

	@OriginalMember(owner = "client!eka", name = "l", descriptor = "I")
	public int anInt2644;

	@OriginalMember(owner = "client!eka", name = "<init>", descriptor = "()V")
	private Class14_Sub18() {
	}

	@OriginalMember(owner = "client!eka", name = "<init>", descriptor = "(I)V")
	public Class14_Sub18(@OriginalArg(0) int arg0) {
		this.anInt2644 = arg0;
	}
}
