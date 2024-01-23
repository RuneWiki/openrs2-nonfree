import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public final class Class25 implements Interface4 {

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "()I")
	@Override
	public int method3793() {
		return 0;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "()V")
	@Override
	public void method3791() {
		if (Static65.aBoolean96) {
			Static294.method4496(true);
		}
	}

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "()V")
	@Override
	public void method3794() {
		if (Static65.aBoolean96) {
			Static294.method4496(false);
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V")
	@Override
	public void method3792(@OriginalArg(0) int arg0) {
	}
}
