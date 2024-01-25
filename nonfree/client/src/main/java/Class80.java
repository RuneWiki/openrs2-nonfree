import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gn")
public final class Class80 {

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "I")
	public int anInt2657 = 0;

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(BILclient!lf;)V")
	private void method2350(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 5) {
			this.anInt2657 = arg1.method3401();
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lclient!lf;I)V")
	public void method2353(@OriginalArg(0) Class4_Sub11 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3440();
			if (local5 == 0) {
				return;
			}
			this.method2350(local5, arg0);
		}
	}
}
