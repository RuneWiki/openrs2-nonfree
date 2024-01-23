import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public final class Class51 implements Interface1 {

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "()V")
	@Override
	public void method3559() {
		if (Static10.aBoolean12) {
			Static296.method4840(true);
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
	@Override
	public void method3556(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "()I")
	@Override
	public int method3558() {
		return 0;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "()V")
	@Override
	public void method3557() {
		if (Static10.aBoolean12) {
			Static296.method4840(false);
		}
	}
}
