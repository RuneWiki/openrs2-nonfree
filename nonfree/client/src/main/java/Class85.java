import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eba")
public final class Class85 {

	@OriginalMember(owner = "client!eba", name = "b", descriptor = "C")
	public char aChar1;

	@OriginalMember(owner = "client!eba", name = "c", descriptor = "I")
	public int anInt1788 = 1;

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(IILclient!ee;)V")
	private void method1656(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub12 arg1) {
		if (arg0 == 1) {
			this.aChar1 = Static382.method8494(arg1.method8635());
		} else if (arg0 == 2) {
			this.anInt1788 = 0;
		}
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(Lclient!ee;B)V")
	public void method1657(@OriginalArg(0) Class5_Sub12 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8645();
			if (local5 == 0) {
				return;
			}
			this.method1656(local5, arg0);
		}
	}
}
