import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vg")
public final class Class2_Sub8_Sub22 extends Class2_Sub8 {

	@OriginalMember(owner = "client!vg", name = "B", descriptor = "I")
	public int anInt5766 = 0;

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IZLclient!oe;)V")
	private void method4543(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub16 arg1) {
		if (arg0 == 2) {
			this.anInt5766 = arg1.method2130();
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lclient!oe;I)V")
	public void method4547(@OriginalArg(0) Class2_Sub16 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method2146();
			if (local14 == 0) {
				return;
			}
			this.method4543(local14, arg0);
		}
	}
}
