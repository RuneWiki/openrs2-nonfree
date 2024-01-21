import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ch")
public final class Class4_Sub1_Sub5 extends Class4_Sub1 {

	@OriginalMember(owner = "client!ch", name = "A", descriptor = "I")
	public int anInt615 = 0;

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lclient!h;I)V")
	public void method413(@OriginalArg(0) Class4_Sub11 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method1253();
			if (local15 == 0) {
				return;
			}
			this.method416(local15, arg0);
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILclient!h;Z)V")
	private void method416(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub11 arg1) {
		if (arg0 == 5) {
			this.anInt615 = arg1.method1252();
		}
	}
}
