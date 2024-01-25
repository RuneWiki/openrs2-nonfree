import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aja")
public final class Class13 {

	@OriginalMember(owner = "client!aja", name = "b", descriptor = "I")
	public int anInt242 = 0;

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(Lclient!dc;IB)V")
	private void method248(@OriginalArg(0) Class3_Sub9 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 5) {
			this.anInt242 = arg0.method5610();
		}
	}

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(ILclient!dc;)V")
	public void method249(@OriginalArg(1) Class3_Sub9 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5633();
			if (local5 == 0) {
				return;
			}
			this.method248(arg0, local5);
		}
	}
}
