import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public final class Class142 implements Interface2 {

	@OriginalMember(owner = "client!q", name = "b", descriptor = "()V")
	@Override
	public void method3521() {
		if (Static56.aBoolean66) {
			Static94.method1610(false);
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "()V")
	@Override
	public void method3520() {
		if (Static56.aBoolean66) {
			Static94.method1610(true);
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V")
	@Override
	public void method3523(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!q", name = "c", descriptor = "()I")
	@Override
	public int method3522() {
		return 0;
	}
}
