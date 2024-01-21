import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!na")
public final class Class2_Sub1_Sub12 extends Class2_Sub1 {

	@OriginalMember(owner = "client!na", name = "V", descriptor = "I")
	public int anInt1956;

	@OriginalMember(owner = "client!na", name = "gb", descriptor = "I")
	public int anInt1960;

	@OriginalMember(owner = "client!na", name = "vb", descriptor = "I")
	public int anInt1968;

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!g;IB)V")
	private void method1405(@OriginalArg(0) Class2_Sub5 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt1968 = arg0.method1273();
			this.anInt1956 = arg0.method1281();
			this.anInt1960 = arg0.method1281();
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ILclient!g;)V")
	public void method1406(@OriginalArg(1) Class2_Sub5 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method1281();
			if (local7 == 0) {
				return;
			}
			this.method1405(arg0, local7);
		}
	}
}
