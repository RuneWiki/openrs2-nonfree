import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public final class Class155 implements Interface3 {

	@OriginalMember(owner = "client!se", name = "b", descriptor = "()V")
	@Override
	public void method3929() {
		if (Static69.aBoolean146) {
			Static71.method1411(false);
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V")
	@Override
	public void method3930(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "()V")
	@Override
	public void method3931() {
		if (Static69.aBoolean146) {
			Static71.method1411(true);
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "()I")
	@Override
	public int method3928() {
		return 0;
	}
}
