import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fm")
public final class Class3_Sub7_Sub9 extends Class3_Sub7 {

	@OriginalMember(owner = "client!fm", name = "D", descriptor = "I")
	public int anInt3181 = 0;

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lclient!np;I)V")
	public void method2863(@OriginalArg(0) Class3_Sub11 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method5175();
			if (local13 == 0) {
				return;
			}
			this.method2864(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lclient!np;BI)V")
	private void method2864(@OriginalArg(0) Class3_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 2) {
			this.anInt3181 = arg0.method5198();
		}
	}
}
