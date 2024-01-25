import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oaa")
public final class Class2_Sub6_Sub13 extends Class2_Sub6 {

	@OriginalMember(owner = "client!oaa", name = "x", descriptor = "I")
	public int anInt7206 = 0;

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Lclient!et;B)V")
	public void method6505(@OriginalArg(0) Class2_Sub20 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method8581(-17416);
			if (local17 == 0) {
				return;
			}
			this.method6507(local17, arg0);
		}
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(BILclient!et;)V")
	private void method6507(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub20 arg1) {
		if (arg0 == 2) {
			this.anInt7206 = arg1.method8575();
		}
	}
}
