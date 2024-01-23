import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wa")
public final class Class124 {

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "I")
	public int anInt4660;

	@OriginalMember(owner = "client!wa", name = "l", descriptor = "I")
	public int anInt4667;

	@OriginalMember(owner = "client!wa", name = "m", descriptor = "I")
	public int anInt4668;

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZILclient!k;)V")
	private void method3646(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub16 arg1) {
		if (arg0 == 1) {
			this.anInt4668 = arg1.method3805();
			this.anInt4660 = arg1.method3793();
			this.anInt4667 = arg1.method3793();
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!k;I)V")
	public void method3647(@OriginalArg(0) Class1_Sub16 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method3793();
			if (local9 == 0) {
				return;
			}
			this.method3646(local9, arg0);
		}
	}
}
