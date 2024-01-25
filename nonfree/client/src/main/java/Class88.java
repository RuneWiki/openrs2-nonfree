import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gl")
public final class Class88 {

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "I")
	public int anInt2410 = 0;

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IILclient!sv;)V")
	private void method1997(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub13 arg1) {
		if (arg0 == 5) {
			this.anInt2410 = arg1.method3555();
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lclient!sv;I)V")
	public void method1998(@OriginalArg(0) Class2_Sub13 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method3580();
			if (local11 == 0) {
				return;
			}
			this.method1997(local11, arg0);
		}
	}
}
