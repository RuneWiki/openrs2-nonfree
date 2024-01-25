import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public final class Class145 {

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
	public int anInt4268;

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "I")
	public int anInt4270;

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
	public int anInt4271;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!eb;BI)V")
	private void method3979(@OriginalArg(0) Class1_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt4270 = arg0.method3115();
			this.anInt4271 = arg0.method3141();
			this.anInt4268 = arg0.method3141();
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!eb;I)V")
	public void method3980(@OriginalArg(0) Class1_Sub7 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method3141();
			if (local14 == 0) {
				return;
			}
			this.method3979(arg0, local14);
		}
	}
}
