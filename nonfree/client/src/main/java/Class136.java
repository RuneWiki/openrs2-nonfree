import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public final class Class136 implements Interface3 {

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V")
	@Override
	public void method3962(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "()V")
	@Override
	public void method3960() {
		if (Static298.aBoolean357) {
			Static178.method2776(true);
		}
	}

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "()I")
	@Override
	public int method3963() {
		return 0;
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "()V")
	@Override
	public void method3961() {
		if (Static298.aBoolean357) {
			Static178.method2776(false);
		}
	}
}
