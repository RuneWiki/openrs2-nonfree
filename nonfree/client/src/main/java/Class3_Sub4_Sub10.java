import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ew")
public final class Class3_Sub4_Sub10 extends Class3_Sub4 {

	@OriginalMember(owner = "client!ew", name = "w", descriptor = "I")
	public int anInt2919 = 0;

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(Lclient!fd;II)V")
	private void method2531(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 2) {
			this.anInt2919 = arg0.method6535();
		}
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(Lclient!fd;I)V")
	public void method2532(@OriginalArg(0) Class3_Sub7 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method6538();
			if (local11 == 0) {
				return;
			}
			this.method2531(arg0, local11);
		}
	}
}
