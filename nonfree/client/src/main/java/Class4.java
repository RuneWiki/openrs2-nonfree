import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ad")
public final class Class4 {

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "C")
	public char aChar1;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
	public int anInt62 = 1;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!re;B)V")
	public void method53(@OriginalArg(0) Class1_Sub33 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method5174();
			if (local13 == 0) {
				return;
			}
			this.method54(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!re;II)V")
	private void method54(@OriginalArg(0) Class1_Sub33 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aChar1 = Static243.method3660(arg0.method5188());
		} else if (arg1 == 2) {
			this.anInt62 = 0;
		}
	}
}
