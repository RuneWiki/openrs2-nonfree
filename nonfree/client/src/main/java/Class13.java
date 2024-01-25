import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aga")
public final class Class13 {

	@OriginalMember(owner = "client!aga", name = "d", descriptor = "I")
	public int anInt232;

	@OriginalMember(owner = "client!aga", name = "h", descriptor = "I")
	public int anInt236;

	@OriginalMember(owner = "client!aga", name = "i", descriptor = "I")
	public int anInt237;

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(Lclient!un;II)V")
	private void method185(@OriginalArg(0) Class4_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt237 = arg0.method4936();
			this.anInt232 = arg0.method4905();
			this.anInt236 = arg0.method4905();
		}
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(Lclient!un;I)V")
	public void method186(@OriginalArg(0) Class4_Sub11 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4905();
			if (local5 == 0) {
				return;
			}
			this.method185(arg0, local5);
		}
	}
}
