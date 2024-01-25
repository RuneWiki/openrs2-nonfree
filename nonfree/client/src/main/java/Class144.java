import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hk")
public final class Class144 {

	@OriginalMember(owner = "client!hk", name = "c", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!hk", name = "f", descriptor = "I")
	public int anInt2991 = 1;

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILclient!gk;)V")
	public void method2539(@OriginalArg(1) Class2_Sub7 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4464();
			if (local5 == 0) {
				return;
			}
			this.method2540(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lclient!gk;II)V")
	private void method2540(@OriginalArg(0) Class2_Sub7 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aChar4 = Static581.method7528(arg0.method4477());
		} else if (arg1 == 2) {
			this.anInt2991 = 0;
		}
	}
}
