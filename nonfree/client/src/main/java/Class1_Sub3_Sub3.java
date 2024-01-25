import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class Class1_Sub3_Sub3 extends Class1_Sub3 {

	@OriginalMember(owner = "client!de", name = "B", descriptor = "I")
	public int anInt1032 = 0;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!wm;B)V")
	public void method907(@OriginalArg(0) Class1_Sub19 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method2915();
			if (local13 == 0) {
				return;
			}
			this.method909(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(BLclient!wm;I)V")
	private void method909(@OriginalArg(1) Class1_Sub19 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 2) {
			this.anInt1032 = arg0.method2896();
		}
	}
}
