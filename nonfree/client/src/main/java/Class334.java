import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public final class Class334 {

	@OriginalMember(owner = "client!u", name = "b", descriptor = "I")
	public int anInt9990 = 0;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "I")
	public int anInt9989 = 2048;

	@OriginalMember(owner = "client!u", name = "f", descriptor = "I")
	public int anInt9994 = 2048;

	@OriginalMember(owner = "client!u", name = "h", descriptor = "I")
	public int anInt9996 = 0;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(BLclient!cea;)V")
	public void method8315(@OriginalArg(1) Class2_Sub11 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method8383();
			if (local17 == 0) {
				return;
			}
			this.method8317(local17, arg0);
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IILclient!cea;)V")
	private void method8317(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (arg0 == 1) {
			this.anInt9990 = arg1.method8383();
		} else if (arg0 == 2) {
			this.anInt9994 = arg1.method8326();
		} else if (arg0 == 3) {
			this.anInt9989 = arg1.method8326();
			return;
		} else if (arg0 == 4) {
			this.anInt9996 = arg1.method8368();
			return;
		}
	}
}
