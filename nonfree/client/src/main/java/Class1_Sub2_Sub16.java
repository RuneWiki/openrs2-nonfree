import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class1_Sub2_Sub16 extends Class1_Sub2 {

	@OriginalMember(owner = "client!qb", name = "O", descriptor = "I")
	public int anInt3414 = 0;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!ce;II)V")
	private void method2457(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 2) {
			this.anInt3414 = arg0.method1642();
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!ce;B)V")
	public void method2458(@OriginalArg(0) Class1_Sub8 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method1607();
			if (local14 == 0) {
				return;
			}
			this.method2457(arg0, local14);
		}
	}
}
