import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public final class Class4_Sub15 extends Class4 {

	@OriginalMember(owner = "client!gg", name = "u", descriptor = "I")
	public int anInt2603;

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "()V")
	private Class4_Sub15() {
	}

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(I)V")
	public Class4_Sub15(@OriginalArg(0) int arg0) {
		this.anInt2603 = arg0;
	}
}
