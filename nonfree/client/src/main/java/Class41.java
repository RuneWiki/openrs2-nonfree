import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class41 {

	@OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
	public int anInt1016 = 0;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IBLclient!sb;)V")
	private void method903(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		if (arg0 == 5) {
			this.anInt1016 = arg1.method2593();
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!sb;I)V")
	public void method906(@OriginalArg(0) Class1_Sub14 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method2595();
			if (local7 == 0) {
				return;
			}
			this.method903(local7, arg0);
		}
	}
}
