import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fp")
public final class Class110 {

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "I")
	public int anInt2885 = 0;

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lclient!jr;B)V")
	public void method2460(@OriginalArg(0) Class6_Sub12 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method6019();
			if (local17 == 0) {
				return;
			}
			this.method2463(arg0, local17);
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(ILclient!jr;I)V")
	private void method2463(@OriginalArg(1) Class6_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 5) {
			this.anInt2885 = arg0.method6044();
		}
	}
}
