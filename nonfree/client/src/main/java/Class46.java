import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public final class Class46 implements Interface1 {

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V")
	@Override
	public void method4329(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "()V")
	@Override
	public void method4327() {
		if (Static294.aBoolean445) {
			Static240.method3787(false);
		}
	}

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "()I")
	@Override
	public int method4330() {
		return 0;
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "()V")
	@Override
	public void method4328() {
		if (Static294.aBoolean445) {
			Static240.method3787(true);
		}
	}
}
