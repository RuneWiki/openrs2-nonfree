import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class27 {

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
	public int anInt649 = 0;

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILclient!gk;I)V")
	private void method549(@OriginalArg(1) Class2_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 5) {
			this.anInt649 = arg0.method4518();
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!gk;I)V")
	public void method550(@OriginalArg(0) Class2_Sub7 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method4464();
			if (local17 == 0) {
				return;
			}
			this.method549(arg0, local17);
		}
	}
}
