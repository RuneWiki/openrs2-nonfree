import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ll")
public final class Class180 {

	@OriginalMember(owner = "client!ll", name = "c", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!ll", name = "f", descriptor = "I")
	public int anInt5510 = 1;

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lclient!gw;I)V")
	public void method4747(@OriginalArg(0) Class1_Sub13 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method3043();
			if (local7 == 0) {
				return;
			}
			this.method4748(local7, arg0);
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(ZILclient!gw;)V")
	private void method4748(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub13 arg1) {
		if (arg0 == 1) {
			this.aChar2 = Static455.method6568(arg1.method3073());
		} else if (arg0 == 2) {
			this.anInt5510 = 0;
			return;
		}
	}
}
