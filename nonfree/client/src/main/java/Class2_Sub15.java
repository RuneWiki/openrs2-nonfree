import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public final class Class2_Sub15 extends Class2 {

	@OriginalMember(owner = "client!de", name = "h", descriptor = "I")
	public int anInt1789;

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "()V")
	private Class2_Sub15() {
	}

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "(I)V")
	public Class2_Sub15(@OriginalArg(0) int arg0) {
		this.anInt1789 = arg0;
	}
}
