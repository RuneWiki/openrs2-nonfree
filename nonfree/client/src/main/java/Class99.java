import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public final class Class99 {

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "I")
	public int anInt2606;

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
	public int anInt2607;

	@OriginalMember(owner = "client!hd", name = "h", descriptor = "I")
	public int anInt2612;

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!sv;B)V")
	public void method2148(@OriginalArg(0) Class2_Sub13 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3580();
			if (local5 == 0) {
				return;
			}
			this.method2152(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILclient!sv;I)V")
	private void method2152(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub13 arg1) {
		if (arg0 == 1) {
			this.anInt2607 = arg1.method3555();
			this.anInt2612 = arg1.method3580();
			this.anInt2606 = arg1.method3580();
		}
	}
}
