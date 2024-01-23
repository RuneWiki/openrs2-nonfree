import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public final class Class81 implements Interface2 {

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "()I")
	@Override
	public int method4854() {
		return 0;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)V")
	@Override
	public void method4852(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "()V")
	@Override
	public void method4853() {
		if (Static56.aBoolean96) {
			Static60.method1164(true);
		}
	}

	@OriginalMember(owner = "client!ik", name = "c", descriptor = "()V")
	@Override
	public void method4855() {
		if (Static56.aBoolean96) {
			Static60.method1164(false);
		}
	}
}
