import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ui")
public final class Class3_Sub4_Sub21 extends Class3_Sub4 {

	@OriginalMember(owner = "client!ui", name = "C", descriptor = "I")
	public int anInt5665 = 0;

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lclient!ug;I)V")
	public void method4614(@OriginalArg(0) Class3_Sub26 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3915();
			if (local5 == 0) {
				return;
			}
			this.method4615(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lclient!ug;BI)V")
	private void method4615(@OriginalArg(0) Class3_Sub26 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 2) {
			this.anInt5665 = arg0.method3948();
		}
	}
}
