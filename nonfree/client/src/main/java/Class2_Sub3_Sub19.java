import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lj")
public final class Class2_Sub3_Sub19 extends Class2_Sub3 {

	@OriginalMember(owner = "client!lj", name = "O", descriptor = "I")
	public int anInt2831 = 0;

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(BLclient!nh;)V")
	public void method2237(@OriginalArg(1) Class2_Sub23 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method2122();
			if (local3 == 0) {
				return;
			}
			this.method2238(local3, arg0);
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILclient!nh;I)V")
	private void method2238(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub23 arg1) {
		if (arg0 == 5) {
			this.anInt2831 = arg1.method2095();
		}
	}
}
