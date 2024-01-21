import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ja")
public final class Class2_Sub1_Sub7 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ja", name = "K", descriptor = "I")
	public int anInt1196;

	@OriginalMember(owner = "client!ja", name = "O", descriptor = "I")
	public int anInt1198;

	@OriginalMember(owner = "client!ja", name = "X", descriptor = "I")
	public int anInt1204;

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lclient!be;I)V")
	public void method843(@OriginalArg(0) Class2_Sub4 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method933();
			if (local7 == 0) {
				return;
			}
			this.method848(arg0, local7);
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(ILclient!be;I)V")
	private void method848(@OriginalArg(1) Class2_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1196 = arg0.method896();
			this.anInt1198 = arg0.method933();
			this.anInt1204 = arg0.method933();
		}
	}
}
