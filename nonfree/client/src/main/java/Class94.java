import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gt")
public final class Class94 {

	@OriginalMember(owner = "client!gt", name = "f", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!gt", name = "c", descriptor = "I")
	public int anInt2510 = 1;

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lclient!sv;II)V")
	private void method2083(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar2 = Static336.method4491(arg0.method3605());
		} else if (arg1 == 2) {
			this.anInt2510 = 0;
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(ILclient!sv;)V")
	public void method2084(@OriginalArg(1) Class2_Sub13 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method3580();
			if (local13 == 0) {
				return;
			}
			this.method2083(arg0, local13);
		}
	}
}
