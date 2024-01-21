import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class Class1_Sub1_Sub12 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ke", name = "J", descriptor = "I")
	public int anInt2708;

	@OriginalMember(owner = "client!ke", name = "T", descriptor = "I")
	public int anInt2713;

	@OriginalMember(owner = "client!ke", name = "U", descriptor = "I")
	public int anInt2714;

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILclient!fa;)V")
	public void method2010(@OriginalArg(1) Class1_Sub9 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method1234();
			if (local16 == 0) {
				return;
			}
			this.method2011(arg0, local16);
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILclient!fa;I)V")
	private void method2011(@OriginalArg(1) Class1_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2708 = arg0.method1280();
			this.anInt2714 = arg0.method1234();
			this.anInt2713 = arg0.method1234();
		}
	}
}
