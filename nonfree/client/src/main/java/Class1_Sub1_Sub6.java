import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public final class Class1_Sub1_Sub6 extends Class1_Sub1 {

	@OriginalMember(owner = "client!cd", name = "M", descriptor = "I")
	public int anInt608;

	@OriginalMember(owner = "client!cd", name = "O", descriptor = "I")
	public int anInt609;

	@OriginalMember(owner = "client!cd", name = "Q", descriptor = "I")
	public int anInt610;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILclient!hc;I)V")
	private void method367(@OriginalArg(1) Class1_Sub6 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt609 = arg0.method546();
			this.anInt610 = arg0.method544();
			this.anInt608 = arg0.method544();
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!hc;B)V")
	public void method368(@OriginalArg(0) Class1_Sub6 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method544();
			if (local5 == 0) {
				return;
			}
			this.method367(arg0, local5);
		}
	}
}
