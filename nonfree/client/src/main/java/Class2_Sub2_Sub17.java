import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rr")
public final class Class2_Sub2_Sub17 extends Class2_Sub2 {

	@OriginalMember(owner = "client!rr", name = "w", descriptor = "I")
	public int anInt7604 = 0;

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lclient!gk;BI)V")
	private void method6138(@OriginalArg(0) Class2_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 2) {
			this.anInt7604 = arg0.method4518();
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(ILclient!gk;)V")
	public void method6140(@OriginalArg(1) Class2_Sub7 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method4464();
			if (local9 == 0) {
				return;
			}
			this.method6138(arg0, local9);
		}
	}
}
