import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pv")
public final class Class254 {

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!pv", name = "d", descriptor = "I")
	public int anInt7057 = 1;

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(ILclient!dga;B)V")
	private void method5876(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub14 arg1) {
		if (arg0 == 1) {
			this.aChar4 = Static276.method3963(arg1.method6034());
		} else if (arg0 == 2) {
			this.anInt7057 = 0;
		}
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(Lclient!dga;Z)V")
	public void method5878(@OriginalArg(0) Class6_Sub14 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method6041();
			if (local17 == 0) {
				return;
			}
			this.method5876(local17, arg0);
		}
	}
}
