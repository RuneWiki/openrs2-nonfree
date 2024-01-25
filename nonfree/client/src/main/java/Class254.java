import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pa")
public final class Class254 {

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!pa", name = "g", descriptor = "I")
	public int anInt7782 = 1;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!cea;I)V")
	public void method6669(@OriginalArg(0) Class2_Sub11 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8383();
			if (local5 == 0) {
				return;
			}
			this.method6670(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IILclient!cea;)V")
	private void method6670(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (arg0 == 1) {
			this.aChar4 = Static172.method3629(arg1.method8384());
		} else if (arg0 == 2) {
			this.anInt7782 = 0;
		}
	}
}
