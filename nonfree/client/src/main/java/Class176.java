import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oh")
public final class Class176 {

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "I")
	public int anInt5016 = 2048;

	@OriginalMember(owner = "client!oh", name = "h", descriptor = "I")
	public int anInt5020 = 2048;

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "I")
	public int anInt5017 = 0;

	@OriginalMember(owner = "client!oh", name = "f", descriptor = "I")
	public int anInt5019 = 0;

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IBLclient!ug;)V")
	private void method3942(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub28 arg1) {
		if (arg0 == 1) {
			this.anInt5019 = arg1.method5337();
		} else if (arg0 == 2) {
			this.anInt5020 = arg1.method5335();
		} else if (arg0 == 3) {
			this.anInt5016 = arg1.method5335();
		} else if (arg0 == 4) {
			this.anInt5017 = arg1.method5382();
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lclient!ug;I)V")
	public void method3946(@OriginalArg(0) Class1_Sub28 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method5337();
			if (local16 == 0) {
				return;
			}
			this.method3942(local16, arg0);
		}
	}
}
