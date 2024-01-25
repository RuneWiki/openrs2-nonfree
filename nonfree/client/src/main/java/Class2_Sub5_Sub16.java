import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public final class Class2_Sub5_Sub16 extends Class2_Sub5 {

	@OriginalMember(owner = "client!sc", name = "q", descriptor = "I")
	public int anInt6072 = 0;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BLclient!sv;)V")
	public void method4748(@OriginalArg(1) Class2_Sub13 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3580();
			if (local5 == 0) {
				return;
			}
			this.method4750(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILclient!sv;I)V")
	private void method4750(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub13 arg1) {
		if (arg0 == 2) {
			this.anInt6072 = arg1.method3555();
		}
	}
}
