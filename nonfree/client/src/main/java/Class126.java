import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ks")
public final class Class126 {

	@OriginalMember(owner = "client!ks", name = "c", descriptor = "I")
	public int anInt3652;

	@OriginalMember(owner = "client!ks", name = "g", descriptor = "I")
	public int anInt3655;

	@OriginalMember(owner = "client!ks", name = "h", descriptor = "I")
	public int anInt3656;

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(ILclient!ap;)V")
	public void method3300(@OriginalArg(1) Class7_Sub3 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method2772();
			if (local3 == 0) {
				return;
			}
			this.method3302(local3, arg0);
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(IZLclient!ap;)V")
	private void method3302(@OriginalArg(0) int arg0, @OriginalArg(2) Class7_Sub3 arg1) {
		if (arg0 == 1) {
			this.anInt3655 = arg1.method2764();
			this.anInt3656 = arg1.method2772();
			this.anInt3652 = arg1.method2772();
		}
	}
}
