import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ba")
public final class Class1_Sub1_Sub2 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ba", name = "R", descriptor = "I")
	public int anInt379 = 0;

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IILclient!jg;)V")
	private void method207(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (arg0 == 2) {
			this.anInt379 = arg1.method878();
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!jg;I)V")
	public void method210(@OriginalArg(0) Class1_Sub8 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method861();
			if (local10 == 0) {
				return;
			}
			this.method207(local10, arg0);
		}
	}
}
