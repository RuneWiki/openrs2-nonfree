import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kf")
public final class Class90 {

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
	public int anInt2807 = 0;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILclient!p;)V")
	public void method2181(@OriginalArg(1) Class4_Sub17 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method1874();
			if (local7 == 0) {
				return;
			}
			this.method2184(arg0, local7);
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILclient!p;I)V")
	private void method2184(@OriginalArg(1) Class4_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 5) {
			this.anInt2807 = arg0.method1837();
		}
	}
}
