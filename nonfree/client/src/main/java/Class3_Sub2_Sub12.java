import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!l")
public final class Class3_Sub2_Sub12 extends Class3_Sub2 {

	@OriginalMember(owner = "client!l", name = "M", descriptor = "I")
	public int anInt2530 = 0;

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!hd;Z)V")
	public void method1986(@OriginalArg(0) Class3_Sub8 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method1545();
			if (local14 == 0) {
				return;
			}
			this.method1989(arg0, local14);
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!hd;II)V")
	private void method1989(@OriginalArg(0) Class3_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 5) {
			this.anInt2530 = arg0.method1510();
		}
	}
}
