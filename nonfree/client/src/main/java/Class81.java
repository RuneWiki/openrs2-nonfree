import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public final class Class81 implements Interface4 {

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "()I")
	@Override
	public int method4404() {
		return 0;
	}

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "()V")
	@Override
	public void method4405() {
		if (Static311.aBoolean384) {
			Static156.method2675(true);
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
	@Override
	public void method4406(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "()V")
	@Override
	public void method4403() {
		if (Static311.aBoolean384) {
			Static156.method2675(false);
		}
	}
}
