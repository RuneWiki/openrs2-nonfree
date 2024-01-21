import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class Class3_Sub1_Sub17 extends Class3_Sub1 {

	@OriginalMember(owner = "client!v", name = "W", descriptor = "I")
	public int anInt4152 = 0;

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IILclient!mb;)V")
	private void method2973(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub17 arg1) {
		if (arg0 == 5) {
			this.anInt4152 = arg1.method2111();
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(BLclient!mb;)V")
	public void method2974(@OriginalArg(1) Class3_Sub17 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2107();
			if (local5 == 0) {
				return;
			}
			this.method2973(local5, arg0);
		}
	}
}
