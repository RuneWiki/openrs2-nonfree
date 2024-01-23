import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rl")
public final class Class149 {

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "I")
	public int anInt4768;

	@OriginalMember(owner = "client!rl", name = "f", descriptor = "I")
	public int anInt4771;

	@OriginalMember(owner = "client!rl", name = "g", descriptor = "I")
	public int anInt4772;

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!pi;I)V")
	public void method3713(@OriginalArg(0) Class4_Sub24 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method3110();
			if (local12 == 0) {
				return;
			}
			this.method3714(arg0, local12);
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!pi;IB)V")
	private void method3714(@OriginalArg(0) Class4_Sub24 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt4772 = arg0.method3085();
			this.anInt4768 = arg0.method3110();
			this.anInt4771 = arg0.method3110();
		}
	}
}
