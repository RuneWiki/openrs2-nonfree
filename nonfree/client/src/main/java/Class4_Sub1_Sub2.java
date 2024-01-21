import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ad")
public final class Class4_Sub1_Sub2 extends Class4_Sub1 {

	@OriginalMember(owner = "client!ad", name = "A", descriptor = "I")
	public int anInt211;

	@OriginalMember(owner = "client!ad", name = "K", descriptor = "I")
	public int anInt218;

	@OriginalMember(owner = "client!ad", name = "O", descriptor = "I")
	public int anInt220;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZLclient!h;)V")
	public void method92(@OriginalArg(1) Class4_Sub11 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1253();
			if (local5 == 0) {
				return;
			}
			this.method93(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZILclient!h;)V")
	private void method93(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 1) {
			this.anInt218 = arg1.method1252();
			this.anInt211 = arg1.method1253();
			this.anInt220 = arg1.method1253();
		}
	}
}
