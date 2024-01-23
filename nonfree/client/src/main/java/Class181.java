import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public final class Class181 implements Interface5 {

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)V")
	@Override
	public void method4314(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "()I")
	@Override
	public int method4312() {
		return 0;
	}

	@OriginalMember(owner = "client!wm", name = "c", descriptor = "()V")
	@Override
	public void method4315() {
		if (Static76.aBoolean117) {
			Static116.method1883(true);
		}
	}

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "()V")
	@Override
	public void method4313() {
		if (Static76.aBoolean117) {
			Static116.method1883(false);
		}
	}
}
