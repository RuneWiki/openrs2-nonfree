import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ri")
public final class Class291 {

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "I")
	public int anInt7709 = 0;

	@OriginalMember(owner = "client!ri", name = "e", descriptor = "I")
	public int anInt7712 = 0;

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "I")
	public int anInt7710 = 2048;

	@OriginalMember(owner = "client!ri", name = "h", descriptor = "I")
	public int anInt7714 = 2048;

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILclient!np;)V")
	public void method6420(@OriginalArg(1) Class3_Sub11 arg0) {
		while (true) {
			@Pc(8) int local8 = arg0.method5175();
			if (local8 == 0) {
				return;
			}
			this.method6423(local8, arg0);
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IILclient!np;)V")
	private void method6423(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub11 arg1) {
		if (arg0 == 1) {
			this.anInt7712 = arg1.method5175();
		} else if (arg0 == 2) {
			this.anInt7714 = arg1.method5198();
		} else if (arg0 == 3) {
			this.anInt7710 = arg1.method5198();
		} else if (arg0 == 4) {
			this.anInt7709 = arg1.method5231();
		}
	}
}
