import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!co")
public final class Class1_Sub1_Sub7 extends Class1_Sub1 {

	@OriginalMember(owner = "client!co", name = "z", descriptor = "I")
	public int anInt790 = 0;

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Lclient!sb;I)V")
	public void method700(@OriginalArg(0) Class1_Sub14 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2595();
			if (local5 == 0) {
				return;
			}
			this.method701(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(ILclient!sb;Z)V")
	private void method701(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub14 arg1) {
		if (arg0 == 2) {
			this.anInt790 = arg1.method2593();
		}
	}
}
