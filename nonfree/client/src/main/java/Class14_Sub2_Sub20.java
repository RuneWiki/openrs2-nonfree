import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rd")
public final class Class14_Sub2_Sub20 extends Class14_Sub2 {

	@OriginalMember(owner = "client!rd", name = "A", descriptor = "I")
	public int anInt5243 = 0;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(BLclient!jg;)V")
	public void method4674(@OriginalArg(1) Class14_Sub4 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2548();
			if (local5 == 0) {
				return;
			}
			this.method4681(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IBLclient!jg;)V")
	private void method4681(@OriginalArg(0) int arg0, @OriginalArg(2) Class14_Sub4 arg1) {
		if (arg0 == 2) {
			this.anInt5243 = arg1.method2498();
		}
	}
}
