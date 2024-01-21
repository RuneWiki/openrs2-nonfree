import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class2_Sub1_Sub9 extends Class2_Sub1 {

	@OriginalMember(owner = "client!le", name = "jb", descriptor = "I")
	public int anInt1943 = 0;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ILclient!pd;)V")
	public void method1246(@OriginalArg(1) Class2_Sub6 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method665();
			if (local10 == 0) {
				return;
			}
			this.method1248(local10, arg0);
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IILclient!pd;)V")
	private void method1248(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub6 arg1) {
		if (arg0 == 5) {
			this.anInt1943 = arg1.method627();
		}
	}
}
