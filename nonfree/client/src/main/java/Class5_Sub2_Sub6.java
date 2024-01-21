import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public final class Class5_Sub2_Sub6 extends Class5_Sub2 {

	@OriginalMember(owner = "client!cf", name = "D", descriptor = "I")
	public int anInt490 = 0;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(BLclient!ce;)V")
	public void method406(@OriginalArg(1) Class5_Sub6 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3062();
			if (local5 == 0) {
				return;
			}
			this.method410(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILclient!ce;I)V")
	private void method410(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub6 arg1) {
		if (arg0 == 5) {
			this.anInt490 = arg1.method3077();
		}
	}
}
