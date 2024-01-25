import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!su")
public final class Class3_Sub7_Sub20 extends Class3_Sub7 {

	@OriginalMember(owner = "client!su", name = "r", descriptor = "I")
	public int anInt8969 = 0;

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(Lclient!dc;II)V")
	private void method7700(@OriginalArg(0) Class3_Sub9 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 2) {
			this.anInt8969 = arg0.method5610();
		}
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(Lclient!dc;I)V")
	public void method7702(@OriginalArg(0) Class3_Sub9 arg0) {
		while (true) {
			@Pc(25) int local25 = arg0.method5633();
			if (local25 == 0) {
				return;
			}
			this.method7700(arg0, local25);
		}
	}
}
