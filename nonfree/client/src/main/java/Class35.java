import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public final class Class35 implements Interface5 {

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V")
	@Override
	public void method4039(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "()V")
	@Override
	public void method4036() {
		if (Static265.aBoolean348) {
			Static116.method1974(true);
		}
	}

	@OriginalMember(owner = "client!dl", name = "c", descriptor = "()I")
	@Override
	public int method4038() {
		return 0;
	}

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "()V")
	@Override
	public void method4037() {
		if (Static265.aBoolean348) {
			Static116.method1974(false);
		}
	}
}
