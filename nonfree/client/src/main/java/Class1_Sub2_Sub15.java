import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public final class Class1_Sub2_Sub15 extends Class1_Sub2 {

	@OriginalMember(owner = "client!rc", name = "O", descriptor = "I")
	public int anInt3852 = 0;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILclient!k;I)V")
	private void method2984(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub16 arg1) {
		if (arg0 == 2) {
			this.anInt3852 = arg1.method3805();
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!k;I)V")
	public void method2985(@OriginalArg(0) Class1_Sub16 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method3793();
			if (local13 == 0) {
				return;
			}
			this.method2984(local13, arg0);
		}
	}
}
