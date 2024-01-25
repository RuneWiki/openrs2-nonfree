import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cea")
public final class Class5_Sub5_Sub2 extends Class5_Sub5 {

	@OriginalMember(owner = "client!cea", name = "t", descriptor = "I")
	public int anInt1098 = 0;

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(Lclient!ib;I)V")
	public void method1105(@OriginalArg(0) Class5_Sub23 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method8529();
			if (local9 == 0) {
				return;
			}
			this.method1107(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(IBLclient!ib;)V")
	private void method1107(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub23 arg1) {
		if (arg0 == 2) {
			this.anInt1098 = arg1.method8519();
		}
	}
}
