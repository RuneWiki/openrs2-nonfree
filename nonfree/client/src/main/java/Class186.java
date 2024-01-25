import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jp")
public final class Class186 {

	@OriginalMember(owner = "client!jp", name = "c", descriptor = "I")
	public int anInt5082 = 0;

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(BLclient!sl;)V")
	public void method4471(@OriginalArg(1) Class2_Sub17 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method2859();
			if (local3 == 0) {
				return;
			}
			this.method4472(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(Lclient!sl;IB)V")
	private void method4472(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 5) {
			this.anInt5082 = arg0.method2825();
		}
	}
}
