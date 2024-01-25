import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ow")
public final class Class253 {

	@OriginalMember(owner = "client!ow", name = "b", descriptor = "I")
	public int anInt7766 = 0;

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(Lclient!cea;II)V")
	private void method6653(@OriginalArg(0) Class2_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 5) {
			this.anInt7766 = arg0.method8326();
		}
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(Lclient!cea;Z)V")
	public void method6655(@OriginalArg(0) Class2_Sub11 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8383();
			if (local5 == 0) {
				return;
			}
			this.method6653(arg0, local5);
		}
	}
}
