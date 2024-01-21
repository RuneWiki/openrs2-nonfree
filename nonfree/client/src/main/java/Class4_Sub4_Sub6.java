import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class4_Sub4_Sub6 extends Class4_Sub4 {

	@OriginalMember(owner = "client!ia", name = "K", descriptor = "I")
	public int anInt1221 = 0;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!ne;B)V")
	public void method835(@OriginalArg(0) Class4_Sub10 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method599();
			if (local17 == 0) {
				return;
			}
			this.method836(arg0, local17);
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!ne;II)V")
	private void method836(@OriginalArg(0) Class4_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 2) {
			this.anInt1221 = arg0.method604();
		}
	}
}
