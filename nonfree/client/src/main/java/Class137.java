import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ks")
public final class Class137 {

	@OriginalMember(owner = "client!ks", name = "e", descriptor = "I")
	public int anInt4117 = 0;

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(ILclient!cu;)V")
	public void method3290(@OriginalArg(1) Class3_Sub7 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method2582();
			if (local3 == 0) {
				return;
			}
			this.method3291(local3, arg0);
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(IILclient!cu;)V")
	private void method3291(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub7 arg1) {
		if (arg0 == 5) {
			this.anInt4117 = arg1.method2588();
		}
	}
}
