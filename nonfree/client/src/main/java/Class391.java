import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vv")
public final class Class391 {

	@OriginalMember(owner = "client!vv", name = "c", descriptor = "I")
	public int anInt10680 = 0;

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(ILclient!et;I)V")
	private void method9345(@OriginalArg(1) Class2_Sub20 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 5) {
			this.anInt10680 = arg0.method8575();
		}
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(Lclient!et;Z)V")
	public void method9347(@OriginalArg(0) Class2_Sub20 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method8581(-17416);
			if (local17 == 0) {
				return;
			}
			this.method9345(arg0, local17);
		}
	}
}
