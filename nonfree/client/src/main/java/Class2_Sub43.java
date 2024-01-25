import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public final class Class2_Sub43 extends Class2 {

	@OriginalMember(owner = "client!ri", name = "p", descriptor = "I")
	public int anInt9046;

	@OriginalMember(owner = "client!ri", name = "<init>", descriptor = "()V")
	private Class2_Sub43() {
	}

	@OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(I)V")
	public Class2_Sub43(@OriginalArg(0) int arg0) {
		this.anInt9046 = arg0;
	}
}
