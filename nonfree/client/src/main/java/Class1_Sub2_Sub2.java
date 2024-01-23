import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class1_Sub2_Sub2 extends Class1_Sub2 {

	@OriginalMember(owner = "client!cc", name = "K", descriptor = "I")
	public int anInt777 = 0;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILclient!im;)V")
	public void method538(@OriginalArg(1) Class1_Sub16 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method2655();
			if (local9 == 0) {
				return;
			}
			this.method539(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!im;II)V")
	private void method539(@OriginalArg(0) Class1_Sub16 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 2) {
			this.anInt777 = arg0.method2652();
		}
	}
}
