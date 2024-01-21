import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!j")
public final class Class2_Sub2_Sub12 extends Class2_Sub2 {

	@OriginalMember(owner = "client!j", name = "U", descriptor = "I")
	public int anInt1920 = 0;

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!oa;B)V")
	public void method1384(@OriginalArg(0) Class2_Sub18 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method2387();
			if (local7 == 0) {
				return;
			}
			this.method1386(local7, arg0);
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(BILclient!oa;)V")
	private void method1386(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub18 arg1) {
		if (arg0 == 2) {
			this.anInt1920 = arg1.method2353();
		}
	}
}
