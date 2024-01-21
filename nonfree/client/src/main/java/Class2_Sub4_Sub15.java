import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public final class Class2_Sub4_Sub15 extends Class2_Sub4 {

	@OriginalMember(owner = "client!pc", name = "T", descriptor = "I")
	public int anInt2953 = 0;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!ab;I)V")
	public void method2031(@OriginalArg(0) Class2_Sub2 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method1698();
			if (local10 == 0) {
				return;
			}
			this.method2034(local10, arg0);
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IILclient!ab;)V")
	private void method2034(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub2 arg1) {
		if (arg0 == 5) {
			this.anInt2953 = arg1.method1680();
		}
	}
}
