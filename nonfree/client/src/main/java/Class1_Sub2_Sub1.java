import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aa")
public final class Class1_Sub2_Sub1 extends Class1_Sub2 {

	@OriginalMember(owner = "client!aa", name = "M", descriptor = "I")
	public int anInt109 = 0;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILclient!vf;)V")
	public void method85(@OriginalArg(1) Class1_Sub26 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2945();
			if (local5 == 0) {
				return;
			}
			this.method89(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILclient!vf;I)V")
	private void method89(@OriginalArg(1) Class1_Sub26 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 2) {
			this.anInt109 = arg0.method2964();
		}
	}
}
