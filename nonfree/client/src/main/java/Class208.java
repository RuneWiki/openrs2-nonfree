import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nm")
public final class Class208 {

	@OriginalMember(owner = "client!nm", name = "g", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!nm", name = "c", descriptor = "I")
	public int anInt6313 = 1;

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lclient!rt;II)V")
	private void method5278(@OriginalArg(0) Class3_Sub27 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aChar2 = Static473.method6742(arg0.method7584());
		} else if (arg1 == 2) {
			this.anInt6313 = 0;
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(ILclient!rt;)V")
	public void method5281(@OriginalArg(1) Class3_Sub27 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method7548();
			if (local13 == 0) {
				return;
			}
			this.method5278(arg0, local13);
		}
	}
}
