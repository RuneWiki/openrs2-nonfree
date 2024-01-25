import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!io")
public final class Class116 {

	@OriginalMember(owner = "client!io", name = "d", descriptor = "I")
	public int anInt3029 = 2048;

	@OriginalMember(owner = "client!io", name = "e", descriptor = "I")
	public int anInt3030 = 2048;

	@OriginalMember(owner = "client!io", name = "j", descriptor = "I")
	public int anInt3034 = 0;

	@OriginalMember(owner = "client!io", name = "k", descriptor = "I")
	public int anInt3035 = 0;

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IILclient!sv;)V")
	private void method2461(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub13 arg1) {
		if (arg0 == 1) {
			this.anInt3034 = arg1.method3580();
		} else if (arg0 == 2) {
			this.anInt3029 = arg1.method3555();
		} else if (arg0 == 3) {
			this.anInt3030 = arg1.method3555();
			return;
		} else if (arg0 == 4) {
			this.anInt3035 = arg1.method3558();
			return;
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(BLclient!sv;)V")
	public void method2464(@OriginalArg(1) Class2_Sub13 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method3580();
			if (local7 == 0) {
				return;
			}
			this.method2461(local7, arg0);
		}
	}
}
