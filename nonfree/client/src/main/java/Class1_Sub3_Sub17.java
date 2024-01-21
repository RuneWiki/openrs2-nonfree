import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ve")
public final class Class1_Sub3_Sub17 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ve", name = "eb", descriptor = "I")
	public int anInt3236 = 0;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILclient!rd;I)V")
	private void method2236(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub20 arg1) {
		if (arg0 == 5) {
			this.anInt3236 = arg1.method2087();
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!rd;B)V")
	public void method2239(@OriginalArg(0) Class1_Sub20 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method2053();
			if (local9 == 0) {
				return;
			}
			this.method2236(local9, arg0);
		}
	}
}
