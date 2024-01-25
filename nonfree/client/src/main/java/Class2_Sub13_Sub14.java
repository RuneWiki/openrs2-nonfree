import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qm")
public final class Class2_Sub13_Sub14 extends Class2_Sub13 {

	@OriginalMember(owner = "client!qm", name = "v", descriptor = "I")
	public int anInt7589 = 0;

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IZLclient!ps;)V")
	private void method6356(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub29 arg1) {
		if (arg0 == 2) {
			this.anInt7589 = arg1.method5229();
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(ILclient!ps;)V")
	public void method6357(@OriginalArg(1) Class2_Sub29 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method5170();
			if (local14 == 0) {
				return;
			}
			this.method6356(local14, arg0);
		}
	}
}
