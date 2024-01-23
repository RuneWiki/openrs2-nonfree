import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public final class Class83 implements Interface2 {

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "()V")
	@Override
	public void method4566() {
		if (Static253.aBoolean335) {
			Static251.method3854(false);
		}
	}

	@OriginalMember(owner = "client!jh", name = "c", descriptor = "()I")
	@Override
	public int method4569() {
		return 0;
	}

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "()V")
	@Override
	public void method4568() {
		if (Static253.aBoolean335) {
			Static251.method3854(true);
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)V")
	@Override
	public void method4567(@OriginalArg(0) int arg0) {
	}
}
