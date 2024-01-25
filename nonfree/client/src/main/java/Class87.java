import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gk")
public final class Class87 {

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "I")
	public int anInt2252 = 0;

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IILclient!lk;)V")
	private void method2160(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub13 arg1) {
		if (arg0 == 5) {
			this.anInt2252 = arg1.method4245();
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lclient!lk;I)V")
	public void method2161(@OriginalArg(0) Class2_Sub13 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4240();
			if (local5 == 0) {
				return;
			}
			this.method2160(local5, arg0);
		}
	}
}
