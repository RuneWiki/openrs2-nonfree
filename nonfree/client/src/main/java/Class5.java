import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public final class Class5 {

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
	public int anInt76;

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
	private int anInt75;

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(II)V")
	public Class5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt76 = arg0;
		this.anInt75 = Static163.anInt3218;
	}

	@OriginalMember(owner = "client!ae", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		Static163.method2529(this.anInt76, this.anInt75);
		super.finalize();
	}
}
