import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public final class Class2_Sub2_Sub1 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ac", name = "w", descriptor = "I")
	public int anInt87 = 0;

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(Lclient!ra;I)V")
	public void method89(@OriginalArg(0) Class2_Sub3 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method260();
			if (local5 == 0) {
				return;
			}
			this.method90(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(BILclient!ra;)V")
	private void method90(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub3 arg1) {
		if (arg0 == 5) {
			this.anInt87 = arg1.method269();
		}
	}
}
