import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wu")
public final class Class364 {

	@OriginalMember(owner = "client!wu", name = "c", descriptor = "I")
	public int anInt9560 = 0;

	@OriginalMember(owner = "client!wu", name = "d", descriptor = "I")
	public int anInt9561 = 0;

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "I")
	public int anInt9559 = 2048;

	@OriginalMember(owner = "client!wu", name = "h", descriptor = "I")
	public int anInt9564 = 2048;

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IBLclient!io;)V")
	private void method7899(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub20 arg1) {
		if (arg0 == 1) {
			this.anInt9561 = arg1.method4393();
		} else if (arg0 == 2) {
			this.anInt9559 = arg1.method4426();
		} else if (arg0 == 3) {
			this.anInt9564 = arg1.method4426();
		} else if (arg0 == 4) {
			this.anInt9560 = arg1.method4391();
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(ILclient!io;)V")
	public void method7901(@OriginalArg(1) Class1_Sub20 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4393();
			if (local5 == 0) {
				return;
			}
			this.method7899(local5, arg0);
		}
	}
}
