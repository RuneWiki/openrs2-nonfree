import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public final class Class18 implements Interface1 {

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "()V")
	@Override
	public void method4019() {
		if (Static188.aBoolean295) {
			Static277.method4193(true);
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "()I")
	@Override
	public int method4016() {
		return 0;
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "()V")
	@Override
	public void method4018() {
		if (Static188.aBoolean295) {
			Static277.method4193(false);
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
	@Override
	public void method4017(@OriginalArg(0) int arg0) {
	}
}
