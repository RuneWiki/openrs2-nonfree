import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jp")
public final class Class1_Sub4_Sub14 extends Class1_Sub4 {

	@OriginalMember(owner = "client!jp", name = "y", descriptor = "I")
	public int anInt3202 = 0;

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IILclient!bg;)V")
	private void method2930(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (arg0 == 2) {
			this.anInt3202 = arg1.method4556();
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(ILclient!bg;)V")
	public void method2933(@OriginalArg(1) Class1_Sub8 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method4532();
			if (local14 == 0) {
				return;
			}
			this.method2930(local14, arg0);
		}
	}
}
