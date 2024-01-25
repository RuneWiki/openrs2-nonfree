import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public final class Class47 {

	@OriginalMember(owner = "client!df", name = "b", descriptor = "I")
	public int anInt1287;

	@OriginalMember(owner = "client!df", name = "d", descriptor = "I")
	public int anInt1289;

	@OriginalMember(owner = "client!df", name = "g", descriptor = "I")
	public int anInt1291;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!fh;I)V")
	public void method1081(@OriginalArg(0) Class5_Sub15 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5539();
			if (local5 == 0) {
				return;
			}
			this.method1082(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(BLclient!fh;I)V")
	private void method1082(@OriginalArg(1) Class5_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1287 = arg0.method5598();
			this.anInt1289 = arg0.method5539();
			this.anInt1291 = arg0.method5539();
		}
	}
}
