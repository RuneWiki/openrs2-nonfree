import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fn")
public final class Class4_Sub3_Sub8 extends Class4_Sub3 {

	@OriginalMember(owner = "client!fn", name = "y", descriptor = "I")
	public int anInt1963 = 0;

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lclient!fd;II)V")
	private void method1494(@OriginalArg(0) Class4_Sub10 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 2) {
			this.anInt1963 = arg0.method4653();
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(ILclient!fd;)V")
	public void method1499(@OriginalArg(1) Class4_Sub10 arg0) {
		while (true) {
			@Pc(8) int local8 = arg0.method4666();
			if (local8 == 0) {
				return;
			}
			this.method1494(arg0, local8);
		}
	}
}
