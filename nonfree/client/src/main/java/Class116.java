import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gga")
public final class Class116 {

	@OriginalMember(owner = "client!gga", name = "b", descriptor = "I")
	public int anInt3146;

	@OriginalMember(owner = "client!gga", name = "d", descriptor = "I")
	public int anInt3147;

	@OriginalMember(owner = "client!gga", name = "g", descriptor = "I")
	public int anInt3149;

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(ILclient!ac;)V")
	public void method2692(@OriginalArg(1) Class1_Sub3 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method7974();
			if (local9 == 0) {
				return;
			}
			this.method2693(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(Lclient!ac;IB)V")
	private void method2693(@OriginalArg(0) Class1_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt3147 = arg0.method7945();
			this.anInt3146 = arg0.method7974();
			this.anInt3149 = arg0.method7974();
		}
	}
}
