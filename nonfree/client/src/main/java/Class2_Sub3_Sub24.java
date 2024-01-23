import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pi")
public final class Class2_Sub3_Sub24 extends Class2_Sub3 {

	@OriginalMember(owner = "client!pi", name = "K", descriptor = "I")
	public int anInt3721 = 0;

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZLclient!nh;)V")
	public void method2901(@OriginalArg(1) Class2_Sub23 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method2122();
			if (local7 == 0) {
				return;
			}
			this.method2903(local7, arg0);
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IILclient!nh;)V")
	private void method2903(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub23 arg1) {
		if (arg0 == 2) {
			this.anInt3721 = arg1.method2095();
		}
	}
}
