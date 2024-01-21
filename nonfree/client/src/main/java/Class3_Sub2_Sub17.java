import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uf")
public final class Class3_Sub2_Sub17 extends Class3_Sub2 {

	@OriginalMember(owner = "client!uf", name = "L", descriptor = "I")
	public int anInt3927 = 0;

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lclient!hd;B)V")
	public void method2999(@OriginalArg(0) Class3_Sub8 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method1545();
			if (local7 == 0) {
				return;
			}
			this.method3000(arg0, local7);
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lclient!hd;II)V")
	private void method3000(@OriginalArg(0) Class3_Sub8 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 2) {
			this.anInt3927 = arg0.method1510();
		}
	}
}
