import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public final class Class5_Sub34 extends Class5 {

	@OriginalMember(owner = "client!qs", name = "o", descriptor = "I")
	public int anInt5642;

	static {
		new Class198(null, "geschickt werden.", null, null);
	}

	@OriginalMember(owner = "client!qs", name = "<init>", descriptor = "()V")
	private Class5_Sub34() {
	}

	@OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(I)V")
	public Class5_Sub34(@OriginalArg(0) int arg0) {
		this.anInt5642 = arg0;
	}
}
