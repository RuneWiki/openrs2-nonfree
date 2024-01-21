import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class Class1_Sub2_Sub17 extends Class1_Sub2 {

	@OriginalMember(owner = "client!tc", name = "I", descriptor = "I")
	public int anInt3592 = 0;

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!ka;B)V")
	public void method2723(@OriginalArg(0) Class1_Sub8 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method336();
			if (local10 == 0) {
				return;
			}
			this.method2724(local10, arg0);
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IBLclient!ka;)V")
	private void method2724(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (arg0 == 2) {
			this.anInt3592 = arg1.method359();
		}
	}
}
