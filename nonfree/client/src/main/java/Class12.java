import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aha")
public final class Class12 {

	@OriginalMember(owner = "client!aha", name = "f", descriptor = "I")
	public int anInt229 = 0;

	@OriginalMember(owner = "client!aha", name = "h", descriptor = "I")
	public int anInt234 = 0;

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "I")
	public int anInt230 = 2048;

	@OriginalMember(owner = "client!aha", name = "d", descriptor = "I")
	public int anInt235 = 2048;

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(BLclient!et;)V")
	public void method241(@OriginalArg(1) Class2_Sub20 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method8581(-17416);
			if (local14 == 0) {
				return;
			}
			this.method244(local14, arg0);
		}
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(IILclient!et;)V")
	private void method244(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub20 arg1) {
		if (arg0 == 1) {
			this.anInt234 = arg1.method8581(-17416);
		} else if (arg0 == 2) {
			this.anInt235 = arg1.method8575();
		} else if (arg0 == 3) {
			this.anInt230 = arg1.method8575();
		} else if (arg0 == 4) {
			this.anInt229 = arg1.method8598();
		}
	}
}
