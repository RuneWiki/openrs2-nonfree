import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wj")
public final class Class356 {

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "I")
	public int anInt9677;

	@OriginalMember(owner = "client!wj", name = "c", descriptor = "I")
	public int anInt9678;

	@OriginalMember(owner = "client!wj", name = "e", descriptor = "I")
	public int anInt9680;

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILclient!eh;I)V")
	private void method7935(@OriginalArg(1) Class4_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt9678 = arg0.method5982();
			this.anInt9680 = arg0.method6015();
			this.anInt9677 = arg0.method6015();
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(BLclient!eh;)V")
	public void method7937(@OriginalArg(1) Class4_Sub9 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method6015();
			if (local14 == 0) {
				return;
			}
			this.method7935(arg0, local14);
		}
	}
}
