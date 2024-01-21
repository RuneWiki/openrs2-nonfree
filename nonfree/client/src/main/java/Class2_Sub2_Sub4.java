import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ca")
public final class Class2_Sub2_Sub4 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ca", name = "D", descriptor = "I")
	public int anInt585;

	@OriginalMember(owner = "client!ca", name = "J", descriptor = "I")
	public int anInt590;

	@OriginalMember(owner = "client!ca", name = "O", descriptor = "I")
	public int anInt592;

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(Lclient!ra;I)V")
	public void method431(@OriginalArg(0) Class2_Sub3 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method260();
			if (local5 == 0) {
				return;
			}
			this.method435(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IILclient!ra;)V")
	private void method435(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub3 arg1) {
		if (arg0 == 1) {
			this.anInt585 = arg1.method269();
			this.anInt590 = arg1.method260();
			this.anInt592 = arg1.method260();
		}
	}
}
