import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class3_Sub3_Sub5 extends Class3_Sub3 {

	@OriginalMember(owner = "client!le", name = "Y", descriptor = "I")
	public int anInt1549 = 0;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ILclient!wd;I)V")
	private void method1138(@OriginalArg(1) Class3_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 5) {
			this.anInt1549 = arg0.method1451();
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!wd;B)V")
	public void method1141(@OriginalArg(0) Class3_Sub11 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method1421();
			if (local14 == 0) {
				return;
			}
			this.method1138(arg0, local14);
		}
	}
}
