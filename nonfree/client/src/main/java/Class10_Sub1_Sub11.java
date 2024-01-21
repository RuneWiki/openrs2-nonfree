import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!na")
public final class Class10_Sub1_Sub11 extends Class10_Sub1 {

	@OriginalMember(owner = "client!na", name = "U", descriptor = "I")
	public int anInt1735;

	@OriginalMember(owner = "client!na", name = "bb", descriptor = "I")
	public int anInt1741;

	@OriginalMember(owner = "client!na", name = "db", descriptor = "I")
	public int anInt1743;

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!tc;IB)V")
	private void method942(@OriginalArg(0) Class10_Sub10 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt1735 = arg0.method1160();
			this.anInt1743 = arg0.method1111();
			this.anInt1741 = arg0.method1111();
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!tc;Z)V")
	public void method943(@OriginalArg(0) Class10_Sub10 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method1111();
			if (local9 == 0) {
				return;
			}
			this.method942(arg0, local9);
		}
	}
}
