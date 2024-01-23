import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public final class Class112 implements Interface1 {

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)V")
	@Override
	public void method3985(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "()I")
	@Override
	public int method3986() {
		return 0;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "()V")
	@Override
	public void method3983() {
		if (Static67.aBoolean95) {
			Static283.method4651(false);
		}
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "()V")
	@Override
	public void method3984() {
		if (Static67.aBoolean95) {
			Static283.method4651(true);
		}
	}
}
