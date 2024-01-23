import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wm")
public final class Class195 {

	@OriginalMember(owner = "client!wm", name = "d", descriptor = "I")
	public int anInt5916 = 2048;

	@OriginalMember(owner = "client!wm", name = "c", descriptor = "I")
	public int anInt5915 = 0;

	@OriginalMember(owner = "client!wm", name = "j", descriptor = "I")
	public int anInt5922 = 2048;

	@OriginalMember(owner = "client!wm", name = "m", descriptor = "I")
	public int anInt5924 = 0;

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(BILclient!sb;)V")
	public void method4655(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		while (true) {
			@Pc(9) int local9 = arg1.method2595();
			if (local9 == 0) {
				return;
			}
			this.method4658(local9, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(ILclient!sb;II)V")
	private void method4658(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub14 arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 1) {
			this.anInt5915 = arg1.method2595();
		} else if (arg0 == 2) {
			this.anInt5916 = arg1.method2593();
		} else if (arg0 == 3) {
			this.anInt5922 = arg1.method2593();
		} else if (arg0 == 4) {
			this.anInt5924 = arg1.method2623();
		}
	}
}
