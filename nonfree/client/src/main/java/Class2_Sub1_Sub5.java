import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class2_Sub1_Sub5 extends Class2_Sub1 {

	@OriginalMember(owner = "client!jb", name = "Z", descriptor = "I")
	public int anInt1393;

	@OriginalMember(owner = "client!jb", name = "eb", descriptor = "I")
	public int anInt1397;

	@OriginalMember(owner = "client!jb", name = "hb", descriptor = "I")
	public int anInt1399;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILclient!na;I)V")
	private void method938(@OriginalArg(1) Class2_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1397 = arg0.method632();
			this.anInt1399 = arg0.method640();
			this.anInt1393 = arg0.method640();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!na;B)V")
	public void method941(@OriginalArg(0) Class2_Sub9 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method640();
			if (local5 == 0) {
				return;
			}
			this.method938(arg0, local5);
		}
	}
}
