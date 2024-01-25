import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public final class Class5_Sub1_Sub3 extends Class5_Sub1 {

	@OriginalMember(owner = "client!df", name = "A", descriptor = "I")
	public int anInt1018 = 0;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(ILclient!rg;)V")
	public void method875(@OriginalArg(1) Class5_Sub12 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method5115();
			if (local3 == 0) {
				return;
			}
			this.method876(local3, arg0);
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(ILclient!rg;B)V")
	private void method876(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub12 arg1) {
		if (arg0 == 2) {
			this.anInt1018 = arg1.method5106();
		}
	}
}
