import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hga")
public final class Class138 {

	@OriginalMember(owner = "client!hga", name = "d", descriptor = "I")
	public int anInt3903 = 0;

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(Lclient!es;I)V")
	public void method3247(@OriginalArg(0) Class2_Sub15 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method4325();
			if (local14 == 0) {
				return;
			}
			this.method3249(arg0, local14);
		}
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(Lclient!es;II)V")
	private void method3249(@OriginalArg(0) Class2_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 5) {
			this.anInt3903 = arg0.method4294();
		}
	}
}
