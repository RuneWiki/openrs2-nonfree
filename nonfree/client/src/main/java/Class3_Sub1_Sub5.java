import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class3_Sub1_Sub5 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ea", name = "V", descriptor = "I")
	public int anInt727 = 0;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IILclient!kd;)V")
	private void method486(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub8 arg1) {
		if (arg0 == 5) {
			this.anInt727 = arg1.method1789();
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!kd;I)V")
	public void method490(@OriginalArg(0) Class3_Sub8 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1803();
			if (local5 == 0) {
				return;
			}
			this.method486(local5, arg0);
		}
	}
}
