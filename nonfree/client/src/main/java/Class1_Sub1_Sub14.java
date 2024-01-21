import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
public final class Class1_Sub1_Sub14 extends Class1_Sub1 {

	@OriginalMember(owner = "client!qf", name = "P", descriptor = "I")
	public int anInt3707 = 0;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(BLclient!hc;)V")
	public void method2534(@OriginalArg(1) Class1_Sub6 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method544();
			if (local5 == 0) {
				return;
			}
			this.method2535(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!hc;II)V")
	private void method2535(@OriginalArg(0) Class1_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 5) {
			this.anInt3707 = arg0.method546();
		}
	}
}
