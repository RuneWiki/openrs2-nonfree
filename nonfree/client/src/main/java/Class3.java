import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public final class Class3 implements Interface2 {

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
	@Override
	public void method3763(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "()I")
	@Override
	public int method3760() {
		return 0;
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "()V")
	@Override
	public void method3761() {
		if (Static302.aBoolean419) {
			Static291.method4331(true);
		}
	}

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "()V")
	@Override
	public void method3762() {
		if (Static302.aBoolean419) {
			Static291.method4331(false);
		}
	}
}
